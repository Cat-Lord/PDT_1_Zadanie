/*
 * This file is generated by jOOQ.
 */
package model.tables.records;


import java.time.OffsetDateTime;

import model.tables.Tweets;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TweetsRecord extends UpdatableRecordImpl<TweetsRecord> implements Record13<String, String, Object, Integer, Integer, OffsetDateTime, Long, Integer, String, Double, Double, Double, Double> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.tweets.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.tweets.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.tweets.content</code>.
     */
    public void setContent(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.tweets.content</code>.
     */
    public String getContent() {
        return (String) get(1);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public void setLocation(Object value) {
        set(2, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public Object getLocation() {
        return get(2);
    }

    /**
     * Setter for <code>public.tweets.retweet_count</code>.
     */
    public void setRetweetCount(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.tweets.retweet_count</code>.
     */
    public Integer getRetweetCount() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.tweets.favorite_count</code>.
     */
    public void setFavoriteCount(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.tweets.favorite_count</code>.
     */
    public Integer getFavoriteCount() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.tweets.happened_at</code>.
     */
    public void setHappenedAt(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.tweets.happened_at</code>.
     */
    public OffsetDateTime getHappenedAt() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for <code>public.tweets.author_id</code>.
     */
    public void setAuthorId(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.tweets.author_id</code>.
     */
    public Long getAuthorId() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>public.tweets.country_id</code>.
     */
    public void setCountryId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.tweets.country_id</code>.
     */
    public Integer getCountryId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>public.tweets.parent_id</code>.
     */
    public void setParentId(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.tweets.parent_id</code>.
     */
    public String getParentId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.tweets.sentiment_negative</code>.
     */
    public void setSentimentNegative(Double value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.tweets.sentiment_negative</code>.
     */
    public Double getSentimentNegative() {
        return (Double) get(9);
    }

    /**
     * Setter for <code>public.tweets.sentiment_neutral</code>.
     */
    public void setSentimentNeutral(Double value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.tweets.sentiment_neutral</code>.
     */
    public Double getSentimentNeutral() {
        return (Double) get(10);
    }

    /**
     * Setter for <code>public.tweets.sentiment_positive</code>.
     */
    public void setSentimentPositive(Double value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.tweets.sentiment_positive</code>.
     */
    public Double getSentimentPositive() {
        return (Double) get(11);
    }

    /**
     * Setter for <code>public.tweets.sentiment_compound</code>.
     */
    public void setSentimentCompound(Double value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.tweets.sentiment_compound</code>.
     */
    public Double getSentimentCompound() {
        return (Double) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row13<String, String, Object, Integer, Integer, OffsetDateTime, Long, Integer, String, Double, Double, Double, Double> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<String, String, Object, Integer, Integer, OffsetDateTime, Long, Integer, String, Double, Double, Double, Double> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Tweets.TWEETS.ID;
    }

    @Override
    public Field<String> field2() {
        return Tweets.TWEETS.CONTENT;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    @Override
    public Field<Object> field3() {
        return Tweets.TWEETS.LOCATION;
    }

    @Override
    public Field<Integer> field4() {
        return Tweets.TWEETS.RETWEET_COUNT;
    }

    @Override
    public Field<Integer> field5() {
        return Tweets.TWEETS.FAVORITE_COUNT;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return Tweets.TWEETS.HAPPENED_AT;
    }

    @Override
    public Field<Long> field7() {
        return Tweets.TWEETS.AUTHOR_ID;
    }

    @Override
    public Field<Integer> field8() {
        return Tweets.TWEETS.COUNTRY_ID;
    }

    @Override
    public Field<String> field9() {
        return Tweets.TWEETS.PARENT_ID;
    }

    @Override
    public Field<Double> field10() {
        return Tweets.TWEETS.SENTIMENT_NEGATIVE;
    }

    @Override
    public Field<Double> field11() {
        return Tweets.TWEETS.SENTIMENT_NEUTRAL;
    }

    @Override
    public Field<Double> field12() {
        return Tweets.TWEETS.SENTIMENT_POSITIVE;
    }

    @Override
    public Field<Double> field13() {
        return Tweets.TWEETS.SENTIMENT_COMPOUND;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getContent();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    @Override
    public Object component3() {
        return getLocation();
    }

    @Override
    public Integer component4() {
        return getRetweetCount();
    }

    @Override
    public Integer component5() {
        return getFavoriteCount();
    }

    @Override
    public OffsetDateTime component6() {
        return getHappenedAt();
    }

    @Override
    public Long component7() {
        return getAuthorId();
    }

    @Override
    public Integer component8() {
        return getCountryId();
    }

    @Override
    public String component9() {
        return getParentId();
    }

    @Override
    public Double component10() {
        return getSentimentNegative();
    }

    @Override
    public Double component11() {
        return getSentimentNeutral();
    }

    @Override
    public Double component12() {
        return getSentimentPositive();
    }

    @Override
    public Double component13() {
        return getSentimentCompound();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getContent();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    @Override
    public Object value3() {
        return getLocation();
    }

    @Override
    public Integer value4() {
        return getRetweetCount();
    }

    @Override
    public Integer value5() {
        return getFavoriteCount();
    }

    @Override
    public OffsetDateTime value6() {
        return getHappenedAt();
    }

    @Override
    public Long value7() {
        return getAuthorId();
    }

    @Override
    public Integer value8() {
        return getCountryId();
    }

    @Override
    public String value9() {
        return getParentId();
    }

    @Override
    public Double value10() {
        return getSentimentNegative();
    }

    @Override
    public Double value11() {
        return getSentimentNeutral();
    }

    @Override
    public Double value12() {
        return getSentimentPositive();
    }

    @Override
    public Double value13() {
        return getSentimentCompound();
    }

    @Override
    public TweetsRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public TweetsRecord value2(String value) {
        setContent(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    @Override
    public TweetsRecord value3(Object value) {
        setLocation(value);
        return this;
    }

    @Override
    public TweetsRecord value4(Integer value) {
        setRetweetCount(value);
        return this;
    }

    @Override
    public TweetsRecord value5(Integer value) {
        setFavoriteCount(value);
        return this;
    }

    @Override
    public TweetsRecord value6(OffsetDateTime value) {
        setHappenedAt(value);
        return this;
    }

    @Override
    public TweetsRecord value7(Long value) {
        setAuthorId(value);
        return this;
    }

    @Override
    public TweetsRecord value8(Integer value) {
        setCountryId(value);
        return this;
    }

    @Override
    public TweetsRecord value9(String value) {
        setParentId(value);
        return this;
    }

    @Override
    public TweetsRecord value10(Double value) {
        setSentimentNegative(value);
        return this;
    }

    @Override
    public TweetsRecord value11(Double value) {
        setSentimentNeutral(value);
        return this;
    }

    @Override
    public TweetsRecord value12(Double value) {
        setSentimentPositive(value);
        return this;
    }

    @Override
    public TweetsRecord value13(Double value) {
        setSentimentCompound(value);
        return this;
    }

    @Override
    public TweetsRecord values(String value1, String value2, Object value3, Integer value4, Integer value5, OffsetDateTime value6, Long value7, Integer value8, String value9, Double value10, Double value11, Double value12, Double value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TweetsRecord
     */
    public TweetsRecord() {
        super(Tweets.TWEETS);
    }

    /**
     * Create a detached, initialised TweetsRecord
     */
    public TweetsRecord(String id, String content, Object location, Integer retweetCount, Integer favoriteCount, OffsetDateTime happenedAt, Long authorId, Integer countryId, String parentId, Double sentimentNegative, Double sentimentNeutral, Double sentimentPositive, Double sentimentCompound) {
        super(Tweets.TWEETS);

        setId(id);
        setContent(content);
        setLocation(location);
        setRetweetCount(retweetCount);
        setFavoriteCount(favoriteCount);
        setHappenedAt(happenedAt);
        setAuthorId(authorId);
        setCountryId(countryId);
        setParentId(parentId);
        setSentimentNegative(sentimentNegative);
        setSentimentNeutral(sentimentNeutral);
        setSentimentPositive(sentimentPositive);
        setSentimentCompound(sentimentCompound);
    }
}