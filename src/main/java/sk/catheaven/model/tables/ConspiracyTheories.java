/*
 * This file is generated by jOOQ.
 */
package sk.catheaven.model.tables;


import org.jooq.Field;
import org.jooq.ForeignKey;
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
import sk.catheaven.model.tables.records.ConspiracyTheoriesRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConspiracyTheories extends TableImpl<ConspiracyTheoriesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.conspiracy_theories</code>
     */
    public static final ConspiracyTheories CONSPIRACY_THEORIES = new ConspiracyTheories();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ConspiracyTheoriesRecord> getRecordType() {
        return ConspiracyTheoriesRecord.class;
    }

    /**
     * The column <code>public.conspiracy_theories.id</code>.
     */
    public final TableField<ConspiracyTheoriesRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.conspiracy_theories.name</code>.
     */
    public final TableField<ConspiracyTheoriesRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    private ConspiracyTheories(Name alias, Table<ConspiracyTheoriesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ConspiracyTheories(Name alias, Table<ConspiracyTheoriesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.conspiracy_theories</code> table reference
     */
    public ConspiracyTheories(String alias) {
        this(DSL.name(alias), CONSPIRACY_THEORIES);
    }

    /**
     * Create an aliased <code>public.conspiracy_theories</code> table reference
     */
    public ConspiracyTheories(Name alias) {
        this(alias, CONSPIRACY_THEORIES);
    }

    /**
     * Create a <code>public.conspiracy_theories</code> table reference
     */
    public ConspiracyTheories() {
        this(DSL.name("conspiracy_theories"), null);
    }

    public <O extends Record> ConspiracyTheories(Table<O> child, ForeignKey<O, ConspiracyTheoriesRecord> key) {
        super(child, key, CONSPIRACY_THEORIES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<ConspiracyTheoriesRecord> getPrimaryKey() {
        return Keys.CONSPIRACY_THEORIES_PKEY;
    }

    @Override
    public ConspiracyTheories as(String alias) {
        return new ConspiracyTheories(DSL.name(alias), this);
    }

    @Override
    public ConspiracyTheories as(Name alias) {
        return new ConspiracyTheories(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ConspiracyTheories rename(String name) {
        return new ConspiracyTheories(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ConspiracyTheories rename(Name name) {
        return new ConspiracyTheories(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}