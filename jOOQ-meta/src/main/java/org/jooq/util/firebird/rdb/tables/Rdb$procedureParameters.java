/**
 * This class is generated by jOOQ
 */
package org.jooq.util.firebird.rdb.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.0"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Rdb$procedureParameters extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 1112918214;

	/**
	 * The singleton instance of <code>RDB$PROCEDURE_PARAMETERS</code>
	 */
	public static final org.jooq.util.firebird.rdb.tables.Rdb$procedureParameters RDB$PROCEDURE_PARAMETERS = new org.jooq.util.firebird.rdb.tables.Rdb$procedureParameters();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>RDB$PROCEDURE_PARAMETERS.RDB$PARAMETER_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$PARAMETER_NAME = createField("RDB$PARAMETER_NAME", org.jooq.impl.SQLDataType.CHAR, this, "");

	/**
	 * The column <code>RDB$PROCEDURE_PARAMETERS.RDB$PROCEDURE_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$PROCEDURE_NAME = createField("RDB$PROCEDURE_NAME", org.jooq.impl.SQLDataType.CHAR, this, "");

	/**
	 * The column <code>RDB$PROCEDURE_PARAMETERS.RDB$PARAMETER_NUMBER</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$PARAMETER_NUMBER = createField("RDB$PARAMETER_NUMBER", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>RDB$PROCEDURE_PARAMETERS.RDB$PARAMETER_TYPE</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$PARAMETER_TYPE = createField("RDB$PARAMETER_TYPE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>RDB$PROCEDURE_PARAMETERS.RDB$FIELD_SOURCE</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$FIELD_SOURCE = createField("RDB$FIELD_SOURCE", org.jooq.impl.SQLDataType.CHAR, this, "");

	/**
	 * The column <code>RDB$PROCEDURE_PARAMETERS.RDB$DESCRIPTION</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$DESCRIPTION = createField("RDB$DESCRIPTION", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>RDB$PROCEDURE_PARAMETERS.RDB$SYSTEM_FLAG</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$SYSTEM_FLAG = createField("RDB$SYSTEM_FLAG", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>RDB$PROCEDURE_PARAMETERS.RDB$DEFAULT_VALUE</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, byte[]> RDB$DEFAULT_VALUE = createField("RDB$DEFAULT_VALUE", org.jooq.impl.SQLDataType.BLOB, this, "");

	/**
	 * The column <code>RDB$PROCEDURE_PARAMETERS.RDB$DEFAULT_SOURCE</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$DEFAULT_SOURCE = createField("RDB$DEFAULT_SOURCE", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>RDB$PROCEDURE_PARAMETERS.RDB$COLLATION_ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$COLLATION_ID = createField("RDB$COLLATION_ID", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>RDB$PROCEDURE_PARAMETERS.RDB$NULL_FLAG</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$NULL_FLAG = createField("RDB$NULL_FLAG", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>RDB$PROCEDURE_PARAMETERS.RDB$PARAMETER_MECHANISM</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$PARAMETER_MECHANISM = createField("RDB$PARAMETER_MECHANISM", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>RDB$PROCEDURE_PARAMETERS.RDB$FIELD_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$FIELD_NAME = createField("RDB$FIELD_NAME", org.jooq.impl.SQLDataType.CHAR, this, "");

	/**
	 * The column <code>RDB$PROCEDURE_PARAMETERS.RDB$RELATION_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$RELATION_NAME = createField("RDB$RELATION_NAME", org.jooq.impl.SQLDataType.CHAR, this, "");

	/**
	 * Create a <code>RDB$PROCEDURE_PARAMETERS</code> table reference
	 */
	public Rdb$procedureParameters() {
		this("RDB$PROCEDURE_PARAMETERS", null);
	}

	/**
	 * Create an aliased <code>RDB$PROCEDURE_PARAMETERS</code> table reference
	 */
	public Rdb$procedureParameters(java.lang.String alias) {
		this(alias, org.jooq.util.firebird.rdb.tables.Rdb$procedureParameters.RDB$PROCEDURE_PARAMETERS);
	}

	private Rdb$procedureParameters(java.lang.String alias, org.jooq.Table<org.jooq.Record> aliased) {
		this(alias, aliased, null);
	}

	private Rdb$procedureParameters(java.lang.String alias, org.jooq.Table<org.jooq.Record> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.util.firebird.rdb.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.util.firebird.rdb.tables.Rdb$procedureParameters as(java.lang.String alias) {
		return new org.jooq.util.firebird.rdb.tables.Rdb$procedureParameters(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.util.firebird.rdb.tables.Rdb$procedureParameters rename(java.lang.String name) {
		return new org.jooq.util.firebird.rdb.tables.Rdb$procedureParameters(name, null);
	}
}
