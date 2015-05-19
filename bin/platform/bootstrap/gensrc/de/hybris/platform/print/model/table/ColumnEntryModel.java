/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2015/05/18 13:25:55                         ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2011 hybris AG
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *  
 */
package de.hybris.platform.print.model.table;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.print.enums.ColumnWidthType;
import de.hybris.platform.print.model.table.AxisEntryModel;
import de.hybris.platform.print.model.table.TableBlockModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type ColumnEntry first defined at extension print.
 */
@SuppressWarnings("all")
public class ColumnEntryModel extends AxisEntryModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ColumnEntry";
	
	/**<i>Generated relation code constant for relation <code>Table2ColumnEntryRelation</code> defining source attribute <code>table</code> in extension <code>print</code>.</i>*/
	public final static String _TABLE2COLUMNENTRYRELATION = "Table2ColumnEntryRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>ColumnEntry.widthType</code> attribute defined at extension <code>print</code>. */
	public static final String WIDTHTYPE = "widthType";
	
	/** <i>Generated constant</i> - Attribute key of <code>ColumnEntry.width</code> attribute defined at extension <code>print</code>. */
	public static final String WIDTH = "width";
	
	/** <i>Generated constant</i> - Attribute key of <code>ColumnEntry.widthExpression</code> attribute defined at extension <code>print</code>. */
	public static final String WIDTHEXPRESSION = "widthExpression";
	
	/** <i>Generated constant</i> - Attribute key of <code>ColumnEntry.table</code> attribute defined at extension <code>print</code>. */
	public static final String TABLE = "table";
	
	
	/** <i>Generated variable</i> - Variable of <code>ColumnEntry.widthType</code> attribute defined at extension <code>print</code>. */
	private ColumnWidthType _widthType;
	
	/** <i>Generated variable</i> - Variable of <code>ColumnEntry.width</code> attribute defined at extension <code>print</code>. */
	private Double _width;
	
	/** <i>Generated variable</i> - Variable of <code>ColumnEntry.widthExpression</code> attribute defined at extension <code>print</code>. */
	private String _widthExpression;
	
	/** <i>Generated variable</i> - Variable of <code>ColumnEntry.table</code> attribute defined at extension <code>print</code>. */
	private TableBlockModel _table;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ColumnEntryModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ColumnEntryModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>AxisEntry</code> at extension <code>print</code>
	 * @param _table initial attribute declared by type <code>ColumnEntry</code> at extension <code>print</code>
	 */
	@Deprecated
	public ColumnEntryModel(final CatalogVersionModel _catalogVersion, final TableBlockModel _table)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setTable(_table);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>AxisEntry</code> at extension <code>print</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _table initial attribute declared by type <code>ColumnEntry</code> at extension <code>print</code>
	 */
	@Deprecated
	public ColumnEntryModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final TableBlockModel _table)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setTable(_table);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ColumnEntry.table</code> attribute defined at extension <code>print</code>. 
	 * @return the table
	 */
	public TableBlockModel getTable()
	{
		if (this._table!=null)
		{
			return _table;
		}
		return _table = getPersistenceContext().getValue(TABLE, _table);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ColumnEntry.width</code> attribute defined at extension <code>print</code>. 
	 * @return the width
	 */
	public Double getWidth()
	{
		if (this._width!=null)
		{
			return _width;
		}
		return _width = getPersistenceContext().getValue(WIDTH, _width);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ColumnEntry.widthExpression</code> attribute defined at extension <code>print</code>. 
	 * @return the widthExpression
	 */
	public String getWidthExpression()
	{
		if (this._widthExpression!=null)
		{
			return _widthExpression;
		}
		return _widthExpression = getPersistenceContext().getValue(WIDTHEXPRESSION, _widthExpression);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ColumnEntry.widthType</code> attribute defined at extension <code>print</code>. 
	 * @return the widthType
	 */
	public ColumnWidthType getWidthType()
	{
		if (this._widthType!=null)
		{
			return _widthType;
		}
		return _widthType = getPersistenceContext().getValue(WIDTHTYPE, _widthType);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ColumnEntry.table</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the table
	 */
	public void setTable(final TableBlockModel value)
	{
		_table = getPersistenceContext().setValue(TABLE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ColumnEntry.width</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the width
	 */
	public void setWidth(final Double value)
	{
		_width = getPersistenceContext().setValue(WIDTH, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ColumnEntry.widthExpression</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the widthExpression
	 */
	public void setWidthExpression(final String value)
	{
		_widthExpression = getPersistenceContext().setValue(WIDTHEXPRESSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ColumnEntry.widthType</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the widthType
	 */
	public void setWidthType(final ColumnWidthType value)
	{
		_widthType = getPersistenceContext().setValue(WIDTHTYPE, value);
	}
	
}
