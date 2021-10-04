/*
 * This file is generated by jOOQ.
 */
package sk.catheaven.model;


import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Result;

import sk.catheaven.model.tables.Accounts;
import sk.catheaven.model.tables.Countries;
import sk.catheaven.model.tables.GeographyColumns;
import sk.catheaven.model.tables.GeometryColumns;
import sk.catheaven.model.tables.Hashtags;
import sk.catheaven.model.tables.SpatialRefSys;
import sk.catheaven.model.tables.StDump;
import sk.catheaven.model.tables.StDumppoints;
import sk.catheaven.model.tables.StDumprings;
import sk.catheaven.model.tables.StHexagongrid;
import sk.catheaven.model.tables.StSquaregrid;
import sk.catheaven.model.tables.StSubdivide;
import sk.catheaven.model.tables.TweetHashtags;
import sk.catheaven.model.tables.TweetMentions;
import sk.catheaven.model.tables.Tweets;
import sk.catheaven.model.tables.records.StDumpRecord;
import sk.catheaven.model.tables.records.StDumppointsRecord;
import sk.catheaven.model.tables.records.StDumpringsRecord;
import sk.catheaven.model.tables.records.StHexagongridRecord;
import sk.catheaven.model.tables.records.StSquaregridRecord;
import sk.catheaven.model.tables.records.StSubdivideRecord;


/**
 * Convenience access to all tables in public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.accounts</code>.
     */
    public static final Accounts ACCOUNTS = Accounts.ACCOUNTS;

    /**
     * The table <code>public.countries</code>.
     */
    public static final Countries COUNTRIES = Countries.COUNTRIES;

    /**
     * The table <code>public.geography_columns</code>.
     */
    public static final GeographyColumns GEOGRAPHY_COLUMNS = GeographyColumns.GEOGRAPHY_COLUMNS;

    /**
     * The table <code>public.geometry_columns</code>.
     */
    public static final GeometryColumns GEOMETRY_COLUMNS = GeometryColumns.GEOMETRY_COLUMNS;

    /**
     * The table <code>public.hashtags</code>.
     */
    public static final Hashtags HASHTAGS = Hashtags.HASHTAGS;

    /**
     * The table <code>public.spatial_ref_sys</code>.
     */
    public static final SpatialRefSys SPATIAL_REF_SYS = SpatialRefSys.SPATIAL_REF_SYS;

    /**
     * The table <code>public.st_dump</code>.
     */
    public static final StDump ST_DUMP = StDump.ST_DUMP;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public static Result<StDumpRecord> ST_DUMP(
          Configuration configuration
        , Object __1
    ) {
        return configuration.dsl().selectFrom(sk.catheaven.model.tables.StDump.ST_DUMP.call(
              __1
        )).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public static StDump ST_DUMP(
          Object __1
    ) {
        return sk.catheaven.model.tables.StDump.ST_DUMP.call(
            __1
        );
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public static StDump ST_DUMP(
          Field<Object> __1
    ) {
        return sk.catheaven.model.tables.StDump.ST_DUMP.call(
            __1
        );
    }

    /**
     * The table <code>public.st_dumppoints</code>.
     */
    public static final StDumppoints ST_DUMPPOINTS = StDumppoints.ST_DUMPPOINTS;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public static Result<StDumppointsRecord> ST_DUMPPOINTS(
          Configuration configuration
        , Object __1
    ) {
        return configuration.dsl().selectFrom(sk.catheaven.model.tables.StDumppoints.ST_DUMPPOINTS.call(
              __1
        )).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public static StDumppoints ST_DUMPPOINTS(
          Object __1
    ) {
        return sk.catheaven.model.tables.StDumppoints.ST_DUMPPOINTS.call(
            __1
        );
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public static StDumppoints ST_DUMPPOINTS(
          Field<Object> __1
    ) {
        return sk.catheaven.model.tables.StDumppoints.ST_DUMPPOINTS.call(
            __1
        );
    }

    /**
     * The table <code>public.st_dumprings</code>.
     */
    public static final StDumprings ST_DUMPRINGS = StDumprings.ST_DUMPRINGS;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public static Result<StDumpringsRecord> ST_DUMPRINGS(
          Configuration configuration
        , Object __1
    ) {
        return configuration.dsl().selectFrom(sk.catheaven.model.tables.StDumprings.ST_DUMPRINGS.call(
              __1
        )).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public static StDumprings ST_DUMPRINGS(
          Object __1
    ) {
        return sk.catheaven.model.tables.StDumprings.ST_DUMPRINGS.call(
            __1
        );
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public static StDumprings ST_DUMPRINGS(
          Field<Object> __1
    ) {
        return sk.catheaven.model.tables.StDumprings.ST_DUMPRINGS.call(
            __1
        );
    }

    /**
     * The table <code>public.st_hexagongrid</code>.
     */
    public static final StHexagongrid ST_HEXAGONGRID = StHexagongrid.ST_HEXAGONGRID;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public static Result<StHexagongridRecord> ST_HEXAGONGRID(
          Configuration configuration
        , Double size
        , Object bounds
    ) {
        return configuration.dsl().selectFrom(sk.catheaven.model.tables.StHexagongrid.ST_HEXAGONGRID.call(
              size
            , bounds
        )).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public static StHexagongrid ST_HEXAGONGRID(
          Double size
        , Object bounds
    ) {
        return sk.catheaven.model.tables.StHexagongrid.ST_HEXAGONGRID.call(
            size,
            bounds
        );
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public static StHexagongrid ST_HEXAGONGRID(
          Field<Double> size
        , Field<Object> bounds
    ) {
        return sk.catheaven.model.tables.StHexagongrid.ST_HEXAGONGRID.call(
            size,
            bounds
        );
    }

    /**
     * The table <code>public.st_squaregrid</code>.
     */
    public static final StSquaregrid ST_SQUAREGRID = StSquaregrid.ST_SQUAREGRID;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public static Result<StSquaregridRecord> ST_SQUAREGRID(
          Configuration configuration
        , Double size
        , Object bounds
    ) {
        return configuration.dsl().selectFrom(sk.catheaven.model.tables.StSquaregrid.ST_SQUAREGRID.call(
              size
            , bounds
        )).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public static StSquaregrid ST_SQUAREGRID(
          Double size
        , Object bounds
    ) {
        return sk.catheaven.model.tables.StSquaregrid.ST_SQUAREGRID.call(
            size,
            bounds
        );
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public static StSquaregrid ST_SQUAREGRID(
          Field<Double> size
        , Field<Object> bounds
    ) {
        return sk.catheaven.model.tables.StSquaregrid.ST_SQUAREGRID.call(
            size,
            bounds
        );
    }

    /**
     * The table <code>public.st_subdivide</code>.
     */
    public static final StSubdivide ST_SUBDIVIDE = StSubdivide.ST_SUBDIVIDE;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public static Result<StSubdivideRecord> ST_SUBDIVIDE(
          Configuration configuration
        , Object geom
        , Integer maxvertices
        , Double gridsize
    ) {
        return configuration.dsl().selectFrom(sk.catheaven.model.tables.StSubdivide.ST_SUBDIVIDE.call(
              geom
            , maxvertices
            , gridsize
        )).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public static StSubdivide ST_SUBDIVIDE(
          Object geom
        , Integer maxvertices
        , Double gridsize
    ) {
        return sk.catheaven.model.tables.StSubdivide.ST_SUBDIVIDE.call(
            geom,
            maxvertices,
            gridsize
        );
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public static StSubdivide ST_SUBDIVIDE(
          Field<Object> geom
        , Field<Integer> maxvertices
        , Field<Double> gridsize
    ) {
        return sk.catheaven.model.tables.StSubdivide.ST_SUBDIVIDE.call(
            geom,
            maxvertices,
            gridsize
        );
    }

    /**
     * The table <code>public.tweet_hashtags</code>.
     */
    public static final TweetHashtags TWEET_HASHTAGS = TweetHashtags.TWEET_HASHTAGS;

    /**
     * The table <code>public.tweet_mentions</code>.
     */
    public static final TweetMentions TWEET_MENTIONS = TweetMentions.TWEET_MENTIONS;

    /**
     * The table <code>public.tweets</code>.
     */
    public static final Tweets TWEETS = Tweets.TWEETS;
}
