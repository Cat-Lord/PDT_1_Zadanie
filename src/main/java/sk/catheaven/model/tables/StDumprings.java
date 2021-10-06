/*
 * This file is generated by jOOQ.
 */
package sk.catheaven.model.tables;


import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row1;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import sk.catheaven.model.Public;
import sk.catheaven.model.tables.records.StDumpringsRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StDumprings extends TableImpl<StDumpringsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.st_dumprings</code>
     */
    public static final StDumprings ST_DUMPRINGS = new StDumprings();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StDumpringsRecord> getRecordType() {
        return StDumpringsRecord.class;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public final TableField<StDumpringsRecord, Object> ST_DUMPRINGS_ = createField(DSL.name("st_dumprings"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"geometry_dump\""), this, "");

    private StDumprings(Name alias, Table<StDumpringsRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"geometry\""))
        });
    }

    private StDumprings(Name alias, Table<StDumpringsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>public.st_dumprings</code> table reference
     */
    public StDumprings(String alias) {
        this(DSL.name(alias), ST_DUMPRINGS);
    }

    /**
     * Create an aliased <code>public.st_dumprings</code> table reference
     */
    public StDumprings(Name alias) {
        this(alias, ST_DUMPRINGS);
    }

    /**
     * Create a <code>public.st_dumprings</code> table reference
     */
    public StDumprings() {
        this(DSL.name("st_dumprings"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public StDumprings as(String alias) {
        return new StDumprings(DSL.name(alias), this, parameters);
    }

    @Override
    public StDumprings as(Name alias) {
        return new StDumprings(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public StDumprings rename(String name) {
        return new StDumprings(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public StDumprings rename(Name name) {
        return new StDumprings(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row1<Object> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public StDumprings call(
          Object __1
    ) {
        StDumprings result = new StDumprings(DSL.name("st_dumprings"), null, new Field[] {
            DSL.val(__1, org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"geometry\""))
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public StDumprings call(
          Field<Object> __1
    ) {
        StDumprings result = new StDumprings(DSL.name("st_dumprings"), null, new Field[] {
            __1
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
