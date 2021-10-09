/*
 * This file is generated by jOOQ.
 */
package sk.catheaven.model.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import sk.catheaven.model.tables.TweetConspiracyTheory;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TweetConspiracyTheoryRecord extends UpdatableRecordImpl<TweetConspiracyTheoryRecord> implements Record3<Integer, String, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.tweet_conspiracy_theory.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.tweet_conspiracy_theory.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.tweet_conspiracy_theory.tweet_id</code>.
     */
    public void setTweetId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.tweet_conspiracy_theory.tweet_id</code>.
     */
    public String getTweetId() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>public.tweet_conspiracy_theory.conspiracy_theory_id</code>.
     */
    public void setConspiracyTheoryId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>public.tweet_conspiracy_theory.conspiracy_theory_id</code>.
     */
    public Integer getConspiracyTheoryId() {
        return (Integer) get(2);
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
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return TweetConspiracyTheory.TWEET_CONSPIRACY_THEORY.ID;
    }

    @Override
    public Field<String> field2() {
        return TweetConspiracyTheory.TWEET_CONSPIRACY_THEORY.TWEET_ID;
    }

    @Override
    public Field<Integer> field3() {
        return TweetConspiracyTheory.TWEET_CONSPIRACY_THEORY.CONSPIRACY_THEORY_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getTweetId();
    }

    @Override
    public Integer component3() {
        return getConspiracyTheoryId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getTweetId();
    }

    @Override
    public Integer value3() {
        return getConspiracyTheoryId();
    }

    @Override
    public TweetConspiracyTheoryRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public TweetConspiracyTheoryRecord value2(String value) {
        setTweetId(value);
        return this;
    }

    @Override
    public TweetConspiracyTheoryRecord value3(Integer value) {
        setConspiracyTheoryId(value);
        return this;
    }

    @Override
    public TweetConspiracyTheoryRecord values(Integer value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TweetConspiracyTheoryRecord
     */
    public TweetConspiracyTheoryRecord() {
        super(TweetConspiracyTheory.TWEET_CONSPIRACY_THEORY);
    }

    /**
     * Create a detached, initialised TweetConspiracyTheoryRecord
     */
    public TweetConspiracyTheoryRecord(Integer id, String tweetId, Integer conspiracyTheoryId) {
        super(TweetConspiracyTheory.TWEET_CONSPIRACY_THEORY);

        setId(id);
        setTweetId(tweetId);
        setConspiracyTheoryId(conspiracyTheoryId);
    }
}