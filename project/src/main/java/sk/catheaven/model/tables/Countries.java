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
import sk.catheaven.model.tables.records.CountriesRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Countries extends TableImpl<CountriesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.countries</code>
     */
    public static final Countries COUNTRIES = new Countries();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CountriesRecord> getRecordType() {
        return CountriesRecord.class;
    }

    /**
     * The column <code>public.countries.id</code>.
     */
    public final TableField<CountriesRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.countries.code</code>.
     */
    public final TableField<CountriesRecord, String> CODE = createField(DSL.name("code"), SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>public.countries.name</code>.
     */
    public final TableField<CountriesRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(200), this, "");

    private Countries(Name alias, Table<CountriesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Countries(Name alias, Table<CountriesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.countries</code> table reference
     */
    public Countries(String alias) {
        this(DSL.name(alias), COUNTRIES);
    }

    /**
     * Create an aliased <code>public.countries</code> table reference
     */
    public Countries(Name alias) {
        this(alias, COUNTRIES);
    }

    /**
     * Create a <code>public.countries</code> table reference
     */
    public Countries() {
        this(DSL.name("countries"), null);
    }

    public <O extends Record> Countries(Table<O> child, ForeignKey<O, CountriesRecord> key) {
        super(child, key, COUNTRIES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<CountriesRecord, Integer> getIdentity() {
        return (Identity<CountriesRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<CountriesRecord> getPrimaryKey() {
        return Keys.COUNTRIES_PKEY;
    }

    @Override
    public List<UniqueKey<CountriesRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.COUNTRIES_CODE_KEY);
    }

    @Override
    public Countries as(String alias) {
        return new Countries(DSL.name(alias), this);
    }

    @Override
    public Countries as(Name alias) {
        return new Countries(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Countries rename(String name) {
        return new Countries(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Countries rename(Name name) {
        return new Countries(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
