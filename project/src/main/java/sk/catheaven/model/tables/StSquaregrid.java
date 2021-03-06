/*
 * This file is generated by jOOQ.
 */
package sk.catheaven.model.tables;


import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import sk.catheaven.model.Public;
import sk.catheaven.model.tables.records.StSquaregridRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StSquaregrid extends TableImpl<StSquaregridRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.st_squaregrid</code>
     */
    public static final StSquaregrid ST_SQUAREGRID = new StSquaregrid();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StSquaregridRecord> getRecordType() {
        return StSquaregridRecord.class;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public final TableField<StSquaregridRecord, Object> GEOM = createField(DSL.name("geom"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"geometry\""), this, "");

    /**
     * The column <code>public.st_squaregrid.i</code>.
     */
    public final TableField<StSquaregridRecord, Integer> I = createField(DSL.name("i"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.st_squaregrid.j</code>.
     */
    public final TableField<StSquaregridRecord, Integer> J = createField(DSL.name("j"), SQLDataType.INTEGER, this, "");

    private StSquaregrid(Name alias, Table<StSquaregridRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.DOUBLE),
            DSL.val(null, org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"geometry\""))
        });
    }

    private StSquaregrid(Name alias, Table<StSquaregridRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>public.st_squaregrid</code> table reference
     */
    public StSquaregrid(String alias) {
        this(DSL.name(alias), ST_SQUAREGRID);
    }

    /**
     * Create an aliased <code>public.st_squaregrid</code> table reference
     */
    public StSquaregrid(Name alias) {
        this(alias, ST_SQUAREGRID);
    }

    /**
     * Create a <code>public.st_squaregrid</code> table reference
     */
    public StSquaregrid() {
        this(DSL.name("st_squaregrid"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public StSquaregrid as(String alias) {
        return new StSquaregrid(DSL.name(alias), this, parameters);
    }

    @Override
    public StSquaregrid as(Name alias) {
        return new StSquaregrid(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public StSquaregrid rename(String name) {
        return new StSquaregrid(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public StSquaregrid rename(Name name) {
        return new StSquaregrid(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Object, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public StSquaregrid call(
          Double size
        , Object bounds
    ) {
        StSquaregrid result = new StSquaregrid(DSL.name("st_squaregrid"), null, new Field[] {
            DSL.val(size, SQLDataType.DOUBLE),
            DSL.val(bounds, org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"geometry\""))
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public StSquaregrid call(
          Field<Double> size
        , Field<Object> bounds
    ) {
        StSquaregrid result = new StSquaregrid(DSL.name("st_squaregrid"), null, new Field[] {
            size,
            bounds
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
