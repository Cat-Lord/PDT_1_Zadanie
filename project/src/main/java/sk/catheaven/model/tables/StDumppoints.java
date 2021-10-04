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
import sk.catheaven.model.tables.records.StDumppointsRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StDumppoints extends TableImpl<StDumppointsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.st_dumppoints</code>
     */
    public static final StDumppoints ST_DUMPPOINTS = new StDumppoints();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StDumppointsRecord> getRecordType() {
        return StDumppointsRecord.class;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public final TableField<StDumppointsRecord, Object> ST_DUMPPOINTS_ = createField(DSL.name("st_dumppoints"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"geometry_dump\""), this, "");

    private StDumppoints(Name alias, Table<StDumppointsRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"geometry\""))
        });
    }

    private StDumppoints(Name alias, Table<StDumppointsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>public.st_dumppoints</code> table reference
     */
    public StDumppoints(String alias) {
        this(DSL.name(alias), ST_DUMPPOINTS);
    }

    /**
     * Create an aliased <code>public.st_dumppoints</code> table reference
     */
    public StDumppoints(Name alias) {
        this(alias, ST_DUMPPOINTS);
    }

    /**
     * Create a <code>public.st_dumppoints</code> table reference
     */
    public StDumppoints() {
        this(DSL.name("st_dumppoints"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public StDumppoints as(String alias) {
        return new StDumppoints(DSL.name(alias), this, parameters);
    }

    @Override
    public StDumppoints as(Name alias) {
        return new StDumppoints(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public StDumppoints rename(String name) {
        return new StDumppoints(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public StDumppoints rename(Name name) {
        return new StDumppoints(name, null, parameters);
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
    public StDumppoints call(
          Object __1
    ) {
        StDumppoints result = new StDumppoints(DSL.name("st_dumppoints"), null, new Field[] {
            DSL.val(__1, org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"geometry\""))
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public StDumppoints call(
          Field<Object> __1
    ) {
        StDumppoints result = new StDumppoints(DSL.name("st_dumppoints"), null, new Field[] {
            __1
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
