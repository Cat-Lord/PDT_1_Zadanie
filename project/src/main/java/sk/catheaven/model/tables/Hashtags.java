/*
 * This file is generated by jOOQ.
 */
package sk.catheaven.model.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
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
import sk.catheaven.model.tables.records.HashtagsRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Hashtags extends TableImpl<HashtagsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.hashtags</code>
     */
    public static final Hashtags HASHTAGS = new Hashtags();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HashtagsRecord> getRecordType() {
        return HashtagsRecord.class;
    }

    /**
     * The column <code>public.hashtags.id</code>.
     */
    public final TableField<HashtagsRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.hashtags.value</code>.
     */
    public final TableField<HashtagsRecord, String> VALUE = createField(DSL.name("value"), SQLDataType.CLOB.nullable(false), this, "");

    private Hashtags(Name alias, Table<HashtagsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Hashtags(Name alias, Table<HashtagsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.hashtags</code> table reference
     */
    public Hashtags(String alias) {
        this(DSL.name(alias), HASHTAGS);
    }

    /**
     * Create an aliased <code>public.hashtags</code> table reference
     */
    public Hashtags(Name alias) {
        this(alias, HASHTAGS);
    }

    /**
     * Create a <code>public.hashtags</code> table reference
     */
    public Hashtags() {
        this(DSL.name("hashtags"), null);
    }

    public <O extends Record> Hashtags(Table<O> child, ForeignKey<O, HashtagsRecord> key) {
        super(child, key, HASHTAGS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<HashtagsRecord, Integer> getIdentity() {
        return (Identity<HashtagsRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<HashtagsRecord> getPrimaryKey() {
        return Keys.HASHTAGS_PKEY;
    }

    @Override
    public List<UniqueKey<HashtagsRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.HASHTAGS_VALUE_KEY);
    }

    @Override
    public Hashtags as(String alias) {
        return new Hashtags(DSL.name(alias), this);
    }

    @Override
    public Hashtags as(Name alias) {
        return new Hashtags(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Hashtags rename(String name) {
        return new Hashtags(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Hashtags rename(Name name) {
        return new Hashtags(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
