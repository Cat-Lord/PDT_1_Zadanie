package sk.catheaven.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.codegen.GenerationTool;
import org.jooq.impl.DSL;
import sk.catheaven.model.Sequences;
import sk.catheaven.model.tables.HashtagConspiracyTheory;
import sk.catheaven.model.tables.Tweets;

import java.io.FileInputStream;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import static org.jooq.impl.DSL.foreignKey;
import static org.jooq.impl.DSL.isnull;
import static org.jooq.impl.DSL.primaryKey;
import static org.jooq.impl.DSL.select;
import static org.jooq.impl.DSL.trueCondition;
import static org.jooq.impl.DSL.unique;
import static org.jooq.impl.DSL.val;
import static org.jooq.impl.SQLDataType.DOUBLE;
import static org.jooq.impl.SQLDataType.INTEGER;
import static org.jooq.impl.SQLDataType.VARCHAR;
import static sk.catheaven.model.Sequences.CONSPIRACY_THEORIES_SEQ;
import static sk.catheaven.model.Sequences.HASHTAG_CONSPIRACY_THEORY_SEQ;
import static sk.catheaven.model.tables.ConspiracyTheories.CONSPIRACY_THEORIES;
import static sk.catheaven.model.tables.HashtagConspiracyTheory.HASHTAG_CONSPIRACY_THEORY;
import static sk.catheaven.model.tables.Hashtags.HASHTAGS;


public class Main {
    public static Properties properties;
    private static final Logger log = LogManager.getLogger();

    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        String resourcesPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        String propertiesPath = resourcesPath + "jdbc-config.properties";
        properties.load(new FileInputStream(propertiesPath));
        Main.properties = properties;

        //configureDatabase();

        // use only when... populating tables :)
//         populateNecessaryEntities();

        /**
         * Overenie konkretneho tweetu:
         *
             select * from tweets
             join tweet_hashtags th on th.tweet_id = tweets.id
             join hashtags h on h.id = th.hashtag_id
             where tweets.id like '1260023108078977024';

         */
        /**
         * PROOF:
             select * from hashtag_conspiracy_theory hct
             join conspiracy_theories ct on ct.id = hct.conspiracy_theory_id
             join hashtags h on h.id = hct.hashtag_id
             join tweet_hashtags th on th.hashtag_id = h.id
             join tweets t on t.id = th.tweet_id
         */

//        Solver solver = new Solver();
//        solver.calculateSentiment();
    }

    private static void populateNecessaryEntities() {
        DSLContext context = DSL.using(Config.connectDatabase(), SQLDialect.POSTGRES);

        Set<String> conspiracyNames = new HashSet<>(Config.getTheories().values());
        for (String conspiracyName : conspiracyNames) {
            context.insertInto(CONSPIRACY_THEORIES, CONSPIRACY_THEORIES.ID, CONSPIRACY_THEORIES.NAME)
                    .values(CONSPIRACY_THEORIES_SEQ.nextval().cast(INTEGER), val(conspiracyName))
                    .execute();
        }


        Map<String, String> theories = Config.getTheories();

        // first fetch those hashtags, that belong to some theory
        Result<Record> validHashtags = context.select().from(HASHTAGS)
                                                .join(CONSPIRACY_THEORIES)
                                                .on(HASHTAGS.VALUE.in(theories.keySet()))
                                                .fetch();

        // and then bind that hashtag with that theory in associative table
        for (Record validHashtag : validHashtags) {
            String theory = theories.get(validHashtag.getValue(HASHTAGS.VALUE));
            log.info("from map from hashtag `" + validHashtag.getValue(HASHTAGS.VALUE) + "`: " + theory);

            context.insertInto(HASHTAG_CONSPIRACY_THEORY)
                    .set(HASHTAG_CONSPIRACY_THEORY.ID, HASHTAG_CONSPIRACY_THEORY_SEQ.nextval().cast(INTEGER))
                    .set(HASHTAG_CONSPIRACY_THEORY.HASHTAG_ID, validHashtag.getValue(HASHTAGS.ID))
                    .set(HASHTAG_CONSPIRACY_THEORY.CONSPIRACY_THEORY_ID,
                            select(CONSPIRACY_THEORIES.ID)
                                    .from(CONSPIRACY_THEORIES)
                                    .where(CONSPIRACY_THEORIES.NAME.like(theory))
                    )
                    .execute();
        }
    }

    private static void configureDatabase() throws Exception {
        DSLContext context = DSL.using(Config.connectDatabase(), SQLDialect.POSTGRES);

        log.debug("-- Modification of database schema --");

        context.alterTable(Tweets.TWEETS).addColumnIfNotExists(Config.SENTIMENT_NEGATIVE, DOUBLE).execute();
        context.alterTable(Tweets.TWEETS).addColumnIfNotExists(Config.SENTIMENT_NEUTRAL , DOUBLE).execute();
        context.alterTable(Tweets.TWEETS).addColumnIfNotExists(Config.SENTIMENT_POSITIVE, DOUBLE).execute();
        context.alterTable(Tweets.TWEETS).addColumnIfNotExists(Config.SENTIMENT_COMPOUND, DOUBLE).execute();

        context.createTableIfNotExists("conspiracy_theories")
                                        .column("id", INTEGER.nullable(false))
                                        .column("name", VARCHAR(128).nullable(false))
                                        .constraints(
                                                primaryKey("id"),
                                                unique("id")
                                        )
                                        .execute();

       context.createTableIfNotExists("hashtag_conspiracy_theory")
                       .column("id", INTEGER.nullable(false))
                       .column("hashtag_id", INTEGER.nullable(true))
                       .column("conspiracy_theory_id", INTEGER.nullable(true))
                       .constraints(
                               primaryKey("id"),
                               foreignKey("hashtag_id").references(HASHTAGS),
                               foreignKey("conspiracy_theory_id").references(CONSPIRACY_THEORIES)
                       )
                       .execute();

       context.createSequenceIfNotExists("conspiracy_theories_seq").execute();
       context.createSequenceIfNotExists("hashtag_conspiracy_theory_seq").execute();

        generateSchema();
    }

    // (re)generate schema - run only when required (due
    // to effectiveness) not suitable to be automated.
    private static void generateSchema() throws Exception {
        GenerationTool.generate(
                Files.readString(
                        Paths.get(ClassLoader.getSystemResource("jooq.xml").toURI())
                )
        );
    }
}
