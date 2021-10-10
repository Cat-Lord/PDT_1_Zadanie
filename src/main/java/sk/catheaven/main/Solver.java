package sk.catheaven.main;

import com.vader.sentiment.analyzer.SentimentAnalyzer;
import com.vdurmont.emoji.EmojiManager;
import com.vdurmont.emoji.EmojiParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import static org.jooq.impl.DSL.row;
import static sk.catheaven.model.Tables.CONSPIRACY_THEORIES;
import static sk.catheaven.model.tables.Hashtags.HASHTAGS;
import static sk.catheaven.model.tables.TweetHashtags.TWEET_HASHTAGS;
import static sk.catheaven.model.tables.Tweets.TWEETS;

public class Solver {
    private final Connection connection;
    private static final Logger log = LogManager.getLogger();
    private final DSLContext context;

    // Official definition: https://help.twitter.com/en/managing-your-account/twitter-username-rules
    private static final String MENTION_PATTERN = "@[a-zA-Z_0-9]{1,15}";
    private static final String HASHTAG_PATTERN = "#[a-zA-Z0-9]+";

    public Solver() {
        this.connection = Config.connectDatabase();
        this.context = DSL.using(connection, SQLDialect.POSTGRES);
    }

    public Result<Record> getTopAccountForEachConspiracy(int topN) {
        return context.fetch("""
                select ranked, ct.name, alpha.acc_id, alpha.name, alpha.screen_name, alpha.tweet_count from (
                	select *, row_number () over (PARTITION BY conspiracy_theory_id ORDER BY tweet_count DESC) as ranked
                	from (
                		select tct.conspiracy_theory_id, acc.id AS acc_id, acc.name, acc.screen_name, count(tweets.id) as tweet_count
                		from tweet_conspiracy_theory tct
                		join tweets on tweets.id = tct.tweet_id
                		join accounts acc on tweets.author_id = acc.id
                		where is_extreme(tweets.sentiment_compound) IS true
                		group by tct.conspiracy_theory_id, acc.id
                		order by tweet_count DESC
                	
                	) as slc
                	order by conspiracy_theory_id, tweet_count DESC
                ) alpha
                join conspiracy_theories ct on ct.id = conspiracy_theory_id
                where ranked <= 
                """ + topN);
    }

    public Result<Record> getTopHashtagsForEachConspiracy(int topN) {
        return context.fetch("""
                select ct.name, h.value, hashtag_count from (
                    select *, row_number() over (
                        partition by conspiracy_theory_id
                        order by hashtag_count DESC
                    ) hash_rank
                    from (
                        select tct.conspiracy_theory_id,th.hashtag_id, count(th.hashtag_id) hashtag_count
                        from tweet_conspiracy_theory tct
                        join tweets tw on tw.id = tct.tweet_id
                        join tweet_hashtags th on th.tweet_id = tw.id
                        group by tct.conspiracy_theory_id, th.hashtag_id
                    ) conspiracy_with_hashtag_count
                ) conspiracy_with_hashtag_count_and_ranks
                join conspiracy_theories ct on ct.id = conspiracy_theory_id
                join hashtags h on hashtag_id = h.id
                where hash_rank <= 
                """ + topN);
    }

    public void calculateSentiment() throws IOException {
        Result<Record> tweetsResult = getConspiracyTweets();
        if (tweetsResult == null) {
            log.error("No tweets fetched");
            return;
        }

        log.info("Fetched results with " + tweetsResult.size() + " elements");

        // example usage
        for (Record record: tweetsResult) {

            SentimentAnalyzer sentimentAnalyzer = new SentimentAnalyzer(record.get(TWEETS.CONTENT));
            sentimentAnalyzer.analyze();

            context.update(TWEETS)
                .set(
                    row(TWEETS.SENTIMENT_NEGATIVE,
                        TWEETS.SENTIMENT_NEUTRAL,
                        TWEETS.SENTIMENT_POSITIVE,
                        TWEETS.SENTIMENT_COMPOUND),
                    row(getPolarity(sentimentAnalyzer, Config.SENTIMENT_NEGATIVE),
                        getPolarity(sentimentAnalyzer, Config.SENTIMENT_NEUTRAL),
                        getPolarity(sentimentAnalyzer, Config.SENTIMENT_POSITIVE),
                        getPolarity(sentimentAnalyzer, Config.SENTIMENT_COMPOUND))
                    )
                .where(TWEETS.ID.eq(record.get(TWEETS.ID)))
                .execute();
        }
    }

    private double getPolarity(SentimentAnalyzer sentimentAnalyzer, String requiredPolarity) {
        String polarityLabel = requiredPolarity.replaceAll("^\\w+_", "");
        return (double) sentimentAnalyzer.getPolarity().get(polarityLabel);
    }

    private Result<Record> getConspiracyTweets() {
        try {
            Result<Record> tweetsResult =
                    context.select()
                            .from(TWEETS)
                            .join(TWEET_HASHTAGS).on(TWEETS.ID.eq(TWEET_HASHTAGS.TWEET_ID))
                            .join(HASHTAGS).on(HASHTAGS.ID.eq(TWEET_HASHTAGS.HASHTAG_ID))
                            .where(HASHTAGS.VALUE.in(Config.hashtags).and(TWEETS.SENTIMENT_COMPOUND.isNull())   )
                            .fetch();

            for (Record record : tweetsResult) {
                String candidateTweet = record.get(TWEETS.CONTENT);
                if (EmojiManager.containsEmoji(candidateTweet))
                    candidateTweet =  EmojiParser.removeAllEmojis(candidateTweet);

                candidateTweet = candidateTweet.replaceAll(MENTION_PATTERN, "");
                candidateTweet = candidateTweet.replaceAll(HASHTAG_PATTERN, "");
                record.set(TWEETS.CONTENT, candidateTweet);
            }
            return tweetsResult;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public List<Result<Record>> getTheoriesWeeklyEvolution() {
        Result<Record> theories = context.select()
                .from(CONSPIRACY_THEORIES)
                .fetch();

        List<Result<Record>> theoriesWithEvolution = new ArrayList<>();
        for (Record record : theories) {
            theoriesWithEvolution.add(context.fetch(
                    """
                            select conspiracy_theory_id, ct.name,
                                    week,\s
                                    sum(COALESCE(tweet_count, 0)) as tweet_count,\s
                                    sum(COALESCE(tweet_extreme_count, 0)) as tweet_extreme_count,\s
                                    sum(COALESCE(tweet_neutral_count, 0)) as tweet_neutral_count
                            from (
                                select *
                                from (
                                    select\s
                                        conspiracy_date_range.conspiracy_theory_id,
                                        started_at,
                                        last_seen_at,
                                        generate_series(
                                            started_at,
                                            last_seen_at,
                                            '1 week'::interval
                                        ) AS week
                                    from (
                                        select tct.conspiracy_theory_id,
                                                date_trunc('week', MIN(happened_at::timestamp without time zone))::timestamp without time zone AS started_at,\s
                                                date_trunc('week', MAX(happened_at::timestamp without time zone))::timestamp without time zone AS last_seen_at
                                        from tweet_conspiracy_theory tct
                                        join tweets tw on tw.id = tct.tweet_id
                                        group by conspiracy_theory_id
                                    ) as conspiracy_date_range
                                ) times\s
                                left join (
                                    select *, tweet_count - tweet_extreme_count AS tweet_neutral_count from (
                                        select tct.conspiracy_theory_id AS conspiracy_id,
                                            date_trunc('week', tw.happened_at::timestamp without time zone) tweet_date,
                                            count(tw.id) as tweet_count,
                                            sum((is_extreme(tw.sentiment_compound) IS TRUE)::int) as tweet_extreme_count
                                        from tweet_conspiracy_theory tct
                                        left join tweets tw on tw.id = tct.tweet_id
                                        group by tct.conspiracy_theory_id, date_trunc('week', tw.happened_at::timestamp without time zone)
                                    ) times\s
                                ) tweets_with_counts on times.conspiracy_theory_id = tweets_with_counts.conspiracy_id
                                                            and
                                                        tweet_date = week
                            ) all_data
                            join conspiracy_theories ct on ct.id = conspiracy_theory_id
                            where conspiracy_theory_id =\s """.concat(" ").concat("" + record.get(CONSPIRACY_THEORIES.ID)).concat("\n") +
                            """
                                    group by conspiracy_theory_id, ct.name, week
                                    order by conspiracy_theory_id, week
                                    """
            ));
        }
        return theoriesWithEvolution;
    }
}