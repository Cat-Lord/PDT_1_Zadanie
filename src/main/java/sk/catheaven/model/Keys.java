/*
 * This file is generated by jOOQ.
 */
package sk.catheaven.model;


import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;

import sk.catheaven.model.tables.Accounts;
import sk.catheaven.model.tables.ConspiracyTheories;
import sk.catheaven.model.tables.Countries;
import sk.catheaven.model.tables.HashtagConspiracyTheory;
import sk.catheaven.model.tables.Hashtags;
import sk.catheaven.model.tables.SpatialRefSys;
import sk.catheaven.model.tables.TweetHashtags;
import sk.catheaven.model.tables.TweetMentions;
import sk.catheaven.model.tables.Tweets;
import sk.catheaven.model.tables.records.AccountsRecord;
import sk.catheaven.model.tables.records.ConspiracyTheoriesRecord;
import sk.catheaven.model.tables.records.CountriesRecord;
import sk.catheaven.model.tables.records.HashtagConspiracyTheoryRecord;
import sk.catheaven.model.tables.records.HashtagsRecord;
import sk.catheaven.model.tables.records.SpatialRefSysRecord;
import sk.catheaven.model.tables.records.TweetHashtagsRecord;
import sk.catheaven.model.tables.records.TweetMentionsRecord;
import sk.catheaven.model.tables.records.TweetsRecord;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AccountsRecord> ACCOUNTS_PKEY = Internal.createUniqueKey(Accounts.ACCOUNTS, DSL.name("accounts_pkey"), new TableField[] { Accounts.ACCOUNTS.ID }, true);
    public static final UniqueKey<ConspiracyTheoriesRecord> CONSPIRACY_THEORIES_PKEY = Internal.createUniqueKey(ConspiracyTheories.CONSPIRACY_THEORIES, DSL.name("conspiracy_theories_pkey"), new TableField[] { ConspiracyTheories.CONSPIRACY_THEORIES.ID }, true);
    public static final UniqueKey<CountriesRecord> COUNTRIES_CODE_KEY = Internal.createUniqueKey(Countries.COUNTRIES, DSL.name("countries_code_key"), new TableField[] { Countries.COUNTRIES.CODE }, true);
    public static final UniqueKey<CountriesRecord> COUNTRIES_PKEY = Internal.createUniqueKey(Countries.COUNTRIES, DSL.name("countries_pkey"), new TableField[] { Countries.COUNTRIES.ID }, true);
    public static final UniqueKey<HashtagConspiracyTheoryRecord> HASHTAG_CONSPIRACY_THEORY_PKEY = Internal.createUniqueKey(HashtagConspiracyTheory.HASHTAG_CONSPIRACY_THEORY, DSL.name("hashtag_conspiracy_theory_pkey"), new TableField[] { HashtagConspiracyTheory.HASHTAG_CONSPIRACY_THEORY.ID }, true);
    public static final UniqueKey<HashtagsRecord> HASHTAGS_PKEY = Internal.createUniqueKey(Hashtags.HASHTAGS, DSL.name("hashtags_pkey"), new TableField[] { Hashtags.HASHTAGS.ID }, true);
    public static final UniqueKey<HashtagsRecord> HASHTAGS_VALUE_KEY = Internal.createUniqueKey(Hashtags.HASHTAGS, DSL.name("hashtags_value_key"), new TableField[] { Hashtags.HASHTAGS.VALUE }, true);
    public static final UniqueKey<SpatialRefSysRecord> SPATIAL_REF_SYS_PKEY = Internal.createUniqueKey(SpatialRefSys.SPATIAL_REF_SYS, DSL.name("spatial_ref_sys_pkey"), new TableField[] { SpatialRefSys.SPATIAL_REF_SYS.SRID }, true);
    public static final UniqueKey<TweetHashtagsRecord> TWEET_HASHTAGS_HASHTAG_ID_TWEET_ID_KEY = Internal.createUniqueKey(TweetHashtags.TWEET_HASHTAGS, DSL.name("tweet_hashtags_hashtag_id_tweet_id_key"), new TableField[] { TweetHashtags.TWEET_HASHTAGS.HASHTAG_ID, TweetHashtags.TWEET_HASHTAGS.TWEET_ID }, true);
    public static final UniqueKey<TweetHashtagsRecord> TWEET_HASHTAGS_PKEY = Internal.createUniqueKey(TweetHashtags.TWEET_HASHTAGS, DSL.name("tweet_hashtags_pkey"), new TableField[] { TweetHashtags.TWEET_HASHTAGS.ID }, true);
    public static final UniqueKey<TweetMentionsRecord> TWEET_MENTIONS_ACCOUNT_ID_TWEET_ID_KEY = Internal.createUniqueKey(TweetMentions.TWEET_MENTIONS, DSL.name("tweet_mentions_account_id_tweet_id_key"), new TableField[] { TweetMentions.TWEET_MENTIONS.ACCOUNT_ID, TweetMentions.TWEET_MENTIONS.TWEET_ID }, true);
    public static final UniqueKey<TweetMentionsRecord> TWEET_MENTIONS_PKEY = Internal.createUniqueKey(TweetMentions.TWEET_MENTIONS, DSL.name("tweet_mentions_pkey"), new TableField[] { TweetMentions.TWEET_MENTIONS.ID }, true);
    public static final UniqueKey<TweetsRecord> TWEETS_PKEY = Internal.createUniqueKey(Tweets.TWEETS, DSL.name("tweets_pkey"), new TableField[] { Tweets.TWEETS.ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<ConspiracyTheoriesRecord, HashtagsRecord> CONSPIRACY_THEORIES__CONSPIRACY_THEORIES_HASHTAG_ID_FKEY = Internal.createForeignKey(ConspiracyTheories.CONSPIRACY_THEORIES, DSL.name("conspiracy_theories_hashtag_id_fkey"), new TableField[] { ConspiracyTheories.CONSPIRACY_THEORIES.HASHTAG_ID }, Keys.HASHTAGS_PKEY, new TableField[] { Hashtags.HASHTAGS.ID }, true);
    public static final ForeignKey<HashtagConspiracyTheoryRecord, ConspiracyTheoriesRecord> HASHTAG_CONSPIRACY_THEORY__HASHTAG_CONSPIRACY_THEORY_CONSPIRACY_THEORY_ID_FKEY = Internal.createForeignKey(HashtagConspiracyTheory.HASHTAG_CONSPIRACY_THEORY, DSL.name("hashtag_conspiracy_theory_conspiracy_theory_id_fkey"), new TableField[] { HashtagConspiracyTheory.HASHTAG_CONSPIRACY_THEORY.CONSPIRACY_THEORY_ID }, Keys.CONSPIRACY_THEORIES_PKEY, new TableField[] { ConspiracyTheories.CONSPIRACY_THEORIES.ID }, true);
    public static final ForeignKey<HashtagConspiracyTheoryRecord, HashtagsRecord> HASHTAG_CONSPIRACY_THEORY__HASHTAG_CONSPIRACY_THEORY_HASHTAG_ID_FKEY = Internal.createForeignKey(HashtagConspiracyTheory.HASHTAG_CONSPIRACY_THEORY, DSL.name("hashtag_conspiracy_theory_hashtag_id_fkey"), new TableField[] { HashtagConspiracyTheory.HASHTAG_CONSPIRACY_THEORY.HASHTAG_ID }, Keys.HASHTAGS_PKEY, new TableField[] { Hashtags.HASHTAGS.ID }, true);
    public static final ForeignKey<TweetHashtagsRecord, HashtagsRecord> TWEET_HASHTAGS__TWEET_HASHTAGS_HASHTAG_ID_FKEY = Internal.createForeignKey(TweetHashtags.TWEET_HASHTAGS, DSL.name("tweet_hashtags_hashtag_id_fkey"), new TableField[] { TweetHashtags.TWEET_HASHTAGS.HASHTAG_ID }, Keys.HASHTAGS_PKEY, new TableField[] { Hashtags.HASHTAGS.ID }, true);
    public static final ForeignKey<TweetHashtagsRecord, TweetsRecord> TWEET_HASHTAGS__TWEET_HASHTAGS_TWEET_ID_FKEY = Internal.createForeignKey(TweetHashtags.TWEET_HASHTAGS, DSL.name("tweet_hashtags_tweet_id_fkey"), new TableField[] { TweetHashtags.TWEET_HASHTAGS.TWEET_ID }, Keys.TWEETS_PKEY, new TableField[] { Tweets.TWEETS.ID }, true);
    public static final ForeignKey<TweetMentionsRecord, AccountsRecord> TWEET_MENTIONS__TWEET_MENTIONS_ACCOUNT_ID_FKEY = Internal.createForeignKey(TweetMentions.TWEET_MENTIONS, DSL.name("tweet_mentions_account_id_fkey"), new TableField[] { TweetMentions.TWEET_MENTIONS.ACCOUNT_ID }, Keys.ACCOUNTS_PKEY, new TableField[] { Accounts.ACCOUNTS.ID }, true);
    public static final ForeignKey<TweetMentionsRecord, TweetsRecord> TWEET_MENTIONS__TWEET_MENTIONS_TWEET_ID_FKEY = Internal.createForeignKey(TweetMentions.TWEET_MENTIONS, DSL.name("tweet_mentions_tweet_id_fkey"), new TableField[] { TweetMentions.TWEET_MENTIONS.TWEET_ID }, Keys.TWEETS_PKEY, new TableField[] { Tweets.TWEETS.ID }, true);
    public static final ForeignKey<TweetsRecord, AccountsRecord> TWEETS__TWEETS_AUTHOR_ID_FKEY = Internal.createForeignKey(Tweets.TWEETS, DSL.name("tweets_author_id_fkey"), new TableField[] { Tweets.TWEETS.AUTHOR_ID }, Keys.ACCOUNTS_PKEY, new TableField[] { Accounts.ACCOUNTS.ID }, true);
    public static final ForeignKey<TweetsRecord, CountriesRecord> TWEETS__TWEETS_COUNTRY_ID_FKEY = Internal.createForeignKey(Tweets.TWEETS, DSL.name("tweets_country_id_fkey"), new TableField[] { Tweets.TWEETS.COUNTRY_ID }, Keys.COUNTRIES_PKEY, new TableField[] { Countries.COUNTRIES.ID }, true);
    public static final ForeignKey<TweetsRecord, TweetsRecord> TWEETS__TWEETS_PARENT_ID_FKEY = Internal.createForeignKey(Tweets.TWEETS, DSL.name("tweets_parent_id_fkey"), new TableField[] { Tweets.TWEETS.PARENT_ID }, Keys.TWEETS_PKEY, new TableField[] { Tweets.TWEETS.ID }, true);
}
