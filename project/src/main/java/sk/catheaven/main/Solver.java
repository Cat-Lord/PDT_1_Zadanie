package sk.catheaven.main;

import com.vader.sentiment.analyzer.SentimentAnalyzer;
import com.vader.sentiment.processor.TextProperties;
import com.vader.sentiment.util.SentimentModifyingTokens;
import com.vdurmont.emoji.Emoji;
import com.vdurmont.emoji.EmojiManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Record1;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import sk.catheaven.model.tables.Tweets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solver {
    private final Connection connection;
    private static final Logger log = LogManager.getLogger();

    // Official definition: https://help.twitter.com/en/managing-your-account/twitter-username-rules
    private static final String USERNAME_PATTERN = "%@[a-zA-Z_0-9]{1,15}%";
    private static final String HASHTAG_PATTERN  = "%#[a-zA-Z0-9]+%";

    public Solver() {
        this.connection = connect();
    }

    public void calculateSentiment() {
        List<String> resultSet = getAllowedTweets();
        log.info("Fetched results with " + resultSet.size() + " elements");

        // example usage
//        for (String sentence : sentences) {
//            System.out.println(sentence);
//            SentimentAnalyzer sentimentAnalyzer = new SentimentAnalyzer(sentence);
//            sentimentAnalyzer.analyse();
//            System.out.println(sentimentAnalyzer.getPolarity());
//        }
    }

    private List<String> getAllowedTweets() {
        final ArrayList<String> tweets = new ArrayList<>();
        try {
            DSLContext context = DSL.using(connection, SQLDialect.POSTGRES);
            List<String> tweetsResult =
                    context.select(Tweets.TWEETS.CONTENT)
                            .from(Tweets.TWEETS)
                            .where(Tweets.TWEETS.CONTENT.similarTo(USERNAME_PATTERN)
                                    .or(
                                            Tweets.TWEETS.CONTENT.similarTo(HASHTAG_PATTERN)
                                    )
                            )
                            .limit(50)
                            .fetch()
                            .getValues(Tweets.TWEETS.CONTENT);

            for (String candidateTweet : tweetsResult)
                if (EmojiManager.containsEmoji(candidateTweet))
                    log.debug("Discarding: " + candidateTweet);
                else {
                    log.debug("+tweet: " + candidateTweet);
                    tweets.add(candidateTweet);
                }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return tweets;
    }


    private Connection connect() {
        Connection conn = null;
        String url = Main.properties.getProperty("jdbc.url");
        String user = Main.properties.getProperty("jdbc.user");
        String password = Main.properties.getProperty("jdbc.password");

        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }
}
