/*
 * This file is generated by jOOQ.
 */
package sk.catheaven.model.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;

import sk.catheaven.model.tables.StSubdivide;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StSubdivideRecord extends TableRecordImpl<StSubdivideRecord> implements Record1<Object> {

    private static final long serialVersionUID = 1L;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public void setStSubdivide(Object value) {
        set(0, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public Object getStSubdivide() {
        return get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<Object> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<Object> valuesRow() {
        return (Row1) super.valuesRow();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    @Override
    public Field<Object> field1() {
        return StSubdivide.ST_SUBDIVIDE.ST_SUBDIVIDE_;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    @Override
    public Object component1() {
        return getStSubdivide();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    @Override
    public Object value1() {
        return getStSubdivide();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    @Override
    public StSubdivideRecord value1(Object value) {
        setStSubdivide(value);
        return this;
    }

    @Override
    public StSubdivideRecord values(Object value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StSubdivideRecord
     */
    public StSubdivideRecord() {
        super(StSubdivide.ST_SUBDIVIDE);
    }

    /**
     * Create a detached, initialised StSubdivideRecord
     */
    public StSubdivideRecord(Object stSubdivide) {
        super(StSubdivide.ST_SUBDIVIDE);

        setStSubdivide(stSubdivide);
    }
}
