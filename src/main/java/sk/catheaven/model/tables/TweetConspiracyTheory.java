/*
 * This file is generated by jOOQ.
 */
package sk.catheaven.model.tables;


import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import sk.catheaven.model.Keys;
import sk.catheaven.model.Public;
import sk.catheaven.model.tables.records.TweetConspiracyTheoryRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TweetConspiracyTheory extends TableImpl<TweetConspiracyTheoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.tweet_conspiracy_theory</code>
     */
    public static final TweetConspiracyTheory TWEET_CONSPIRACY_THEORY = new TweetConspiracyTheory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TweetConspiracyTheoryRecord> getRecordType() {
        return TweetConspiracyTheoryRecord.class;
    }

    /**
     * The column <code>public.tweet_conspiracy_theory.id</code>.
     */
    public final TableField<TweetConspiracyTheoryRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.tweet_conspiracy_theory.tweet_id</code>.
     */
    public final TableField<TweetConspiracyTheoryRecord, String> TWEET_ID = createField(DSL.name("tweet_id"), SQLDataType.VARCHAR(20), this, "");

    /**
     * The column
     * <code>public.tweet_conspiracy_theory.conspiracy_theory_id</code>.
     */
    public final TableField<TweetConspiracyTheoryRecord, Integer> CONSPIRACY_THEORY_ID = createField(DSL.name("conspiracy_theory_id"), SQLDataType.INTEGER, this, "");

    private TweetConspiracyTheory(Name alias, Table<TweetConspiracyTheoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private TweetConspiracyTheory(Name alias, Table<TweetConspiracyTheoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.tweet_conspiracy_theory</code> table
     * reference
     */
    public TweetConspiracyTheory(String alias) {
        this(DSL.name(alias), TWEET_CONSPIRACY_THEORY);
    }

    /**
     * Create an aliased <code>public.tweet_conspiracy_theory</code> table
     * reference
     */
    public TweetConspiracyTheory(Name alias) {
        this(alias, TWEET_CONSPIRACY_THEORY);
    }

    /**
     * Create a <code>public.tweet_conspiracy_theory</code> table reference
     */
    public TweetConspiracyTheory() {
        this(DSL.name("tweet_conspiracy_theory"), null);
    }

    public <O extends Record> TweetConspiracyTheory(Table<O> child, ForeignKey<O, TweetConspiracyTheoryRecord> key) {
        super(child, key, TWEET_CONSPIRACY_THEORY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<TweetConspiracyTheoryRecord> getPrimaryKey() {
        return Keys.TWEET_CONSPIRACY_THEORY_PKEY;
    }

    @Override
    public TweetConspiracyTheory as(String alias) {
        return new TweetConspiracyTheory(DSL.name(alias), this);
    }

    @Override
    public TweetConspiracyTheory as(Name alias) {
        return new TweetConspiracyTheory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TweetConspiracyTheory rename(String name) {
        return new TweetConspiracyTheory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TweetConspiracyTheory rename(Name name) {
        return new TweetConspiracyTheory(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}