package sk.catheaven.ignore;

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

import static model.tables.Hashtags.HASHTAGS;
import static sk.catheaven.model.tables.TweetHashtags.TWEET_HASHTAGS;
import static sk.catheaven.model.tables.Tweets.TWEETS;
import static org.jooq.impl.DSL.row;

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

    public void calculateSentiment() throws IOException {
        Result<Record> tweetsResult = getAllowedTweets();
        if (tweetsResult == null) {
            log.error("No tweets fetched");
            return;
        }

        log.info("Fetched results with " + tweetsResult.size() + " elements");

        // example usage
        for (Record record: tweetsResult) {
            String tweet = record.get(TWEETS.CONTENT);
            SentimentAnalyzer sentimentAnalyzer = new SentimentAnalyzer(tweet);
            sentimentAnalyzer.analyze();
            log.debug(sentimentAnalyzer.getPolarity() + " | " + tweet);

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
        double polarity = sentimentAnalyzer.getPolarity().get(polarityLabel);
        log.info("Polarity for: " + requiredPolarity + " == " + polarity);
        return polarity;
    }

    private Result<Record> getAllowedTweets() {
        try {
            Result<Record> tweetsResult =
                    context.select()
                            .from(TWEETS)
                            .join(TWEET_HASHTAGS).on(TWEETS.ID.eq(TWEET_HASHTAGS.TWEET_ID))
                            .join(HASHTAGS).on(HASHTAGS.ID.eq(TWEET_HASHTAGS.HASHTAG_ID))
                            .where(HASHTAGS.VALUE.in(Config.hashtags))
                            .limit(10)      /// todo: REMOVE THIS
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
}