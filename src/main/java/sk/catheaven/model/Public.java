/*
 * This file is generated by jOOQ.
 */
package sk.catheaven.model;


import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Result;
import org.jooq.Table;
import org.jooq.UDT;
import org.jooq.impl.SchemaImpl;

import sk.catheaven.model.tables.Accounts;
import sk.catheaven.model.tables.ConspiracyTheories;
import sk.catheaven.model.tables.Countries;
import sk.catheaven.model.tables.GeographyColumns;
import sk.catheaven.model.tables.GeometryColumns;
import sk.catheaven.model.tables.HashtagConspiracyTheory;
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
import sk.catheaven.model.udt.GeometryDump;
import sk.catheaven.model.udt.ValidDetail;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.accounts</code>.
     */
    public final Accounts ACCOUNTS = Accounts.ACCOUNTS;

    /**
     * The table <code>public.conspiracy_theories</code>.
     */
    public final ConspiracyTheories CONSPIRACY_THEORIES = ConspiracyTheories.CONSPIRACY_THEORIES;

    /**
     * The table <code>public.countries</code>.
     */
    public final Countries COUNTRIES = Countries.COUNTRIES;

    /**
     * The table <code>public.geography_columns</code>.
     */
    public final GeographyColumns GEOGRAPHY_COLUMNS = GeographyColumns.GEOGRAPHY_COLUMNS;

    /**
     * The table <code>public.geometry_columns</code>.
     */
    public final GeometryColumns GEOMETRY_COLUMNS = GeometryColumns.GEOMETRY_COLUMNS;

    /**
     * The table <code>public.hashtag_conspiracy_theory</code>.
     */
    public final HashtagConspiracyTheory HASHTAG_CONSPIRACY_THEORY = HashtagConspiracyTheory.HASHTAG_CONSPIRACY_THEORY;

    /**
     * The table <code>public.hashtags</code>.
     */
    public final Hashtags HASHTAGS = Hashtags.HASHTAGS;

    /**
     * The table <code>public.spatial_ref_sys</code>.
     */
    public final SpatialRefSys SPATIAL_REF_SYS = SpatialRefSys.SPATIAL_REF_SYS;

    /**
     * The table <code>public.st_dump</code>.
     */
    public final StDump ST_DUMP = StDump.ST_DUMP;

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
    public final StDumppoints ST_DUMPPOINTS = StDumppoints.ST_DUMPPOINTS;

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
    public final StDumprings ST_DUMPRINGS = StDumprings.ST_DUMPRINGS;

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
    public final StHexagongrid ST_HEXAGONGRID = StHexagongrid.ST_HEXAGONGRID;

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
    public final StSquaregrid ST_SQUAREGRID = StSquaregrid.ST_SQUAREGRID;

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
    public final StSubdivide ST_SUBDIVIDE = StSubdivide.ST_SUBDIVIDE;

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
    public final TweetHashtags TWEET_HASHTAGS = TweetHashtags.TWEET_HASHTAGS;

    /**
     * The table <code>public.tweet_mentions</code>.
     */
    public final TweetMentions TWEET_MENTIONS = TweetMentions.TWEET_MENTIONS;

    /**
     * The table <code>public.tweets</code>.
     */
    public final Tweets TWEETS = Tweets.TWEETS;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Accounts.ACCOUNTS,
            ConspiracyTheories.CONSPIRACY_THEORIES,
            Countries.COUNTRIES,
            GeographyColumns.GEOGRAPHY_COLUMNS,
            GeometryColumns.GEOMETRY_COLUMNS,
            HashtagConspiracyTheory.HASHTAG_CONSPIRACY_THEORY,
            Hashtags.HASHTAGS,
            SpatialRefSys.SPATIAL_REF_SYS,
            StDump.ST_DUMP,
            StDumppoints.ST_DUMPPOINTS,
            StDumprings.ST_DUMPRINGS,
            StHexagongrid.ST_HEXAGONGRID,
            StSquaregrid.ST_SQUAREGRID,
            StSubdivide.ST_SUBDIVIDE,
            TweetHashtags.TWEET_HASHTAGS,
            TweetMentions.TWEET_MENTIONS,
            Tweets.TWEETS
        );
    }

    @Override
    public final List<UDT<?>> getUDTs() {
        return Arrays.asList(
            GeometryDump.GEOMETRY_DUMP,
            ValidDetail.VALID_DETAIL
        );
    }
}
