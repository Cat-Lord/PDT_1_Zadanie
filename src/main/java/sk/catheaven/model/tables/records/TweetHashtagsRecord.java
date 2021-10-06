/*
 * This file is generated by jOOQ.
 */
package model.tables.records;


import model.tables.TweetHashtags;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TweetHashtagsRecord extends UpdatableRecordImpl<TweetHashtagsRecord> implements Record3<Integer, Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.tweet_hashtags.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.tweet_hashtags.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.tweet_hashtags.hashtag_id</code>.
     */
    public void setHashtagId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.tweet_hashtags.hashtag_id</code>.
     */
    public Integer getHashtagId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.tweet_hashtags.tweet_id</code>.
     */
    public void setTweetId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.tweet_hashtags.tweet_id</code>.
     */
    public String getTweetId() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, Integer, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return TweetHashtags.TWEET_HASHTAGS.ID;
    }

    @Override
    public Field<Integer> field2() {
        return TweetHashtags.TWEET_HASHTAGS.HASHTAG_ID;
    }

    @Override
    public Field<String> field3() {
        return TweetHashtags.TWEET_HASHTAGS.TWEET_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getHashtagId();
    }

    @Override
    public String component3() {
        return getTweetId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getHashtagId();
    }

    @Override
    public String value3() {
        return getTweetId();
    }

    @Override
    public TweetHashtagsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public TweetHashtagsRecord value2(Integer value) {
        setHashtagId(value);
        return this;
    }

    @Override
    public TweetHashtagsRecord value3(String value) {
        setTweetId(value);
        return this;
    }

    @Override
    public TweetHashtagsRecord values(Integer value1, Integer value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TweetHashtagsRecord
     */
    public TweetHashtagsRecord() {
        super(TweetHashtags.TWEET_HASHTAGS);
    }

    /**
     * Create a detached, initialised TweetHashtagsRecord
     */
    public TweetHashtagsRecord(Integer id, Integer hashtagId, String tweetId) {
        super(TweetHashtags.TWEET_HASHTAGS);

        setId(id);
        setHashtagId(hashtagId);
        setTweetId(tweetId);
    }
}