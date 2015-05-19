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
import de.hybris.platform.print.model.table.AxisEntryModel;
import de.hybris.platform.print.model.table.TableBlockModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type RowEntry first defined at extension print.
 */
@SuppressWarnings("all")
public class RowEntryModel extends AxisEntryModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "RowEntry";
	
	/**<i>Generated relation code constant for relation <code>Table2RowEntryRelation</code> defining source attribute <code>table</code> in extension <code>print</code>.</i>*/
	public final static String _TABLE2ROWENTRYRELATION = "Table2RowEntryRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>RowEntry.height</code> attribute defined at extension <code>print</code>. */
	public static final String HEIGHT = "height";
	
	/** <i>Generated constant</i> - Attribute key of <code>RowEntry.maxHeight</code> attribute defined at extension <code>print</code>. */
	public static final String MAXHEIGHT = "maxHeight";
	
	/** <i>Generated constant</i> - Attribute key of <code>RowEntry.autoGrow</code> attribute defined at extension <code>print</code>. */
	public static final String AUTOGROW = "autoGrow";
	
	/** <i>Generated constant</i> - Attribute key of <code>RowEntry.table</code> attribute defined at extension <code>print</code>. */
	public static final String TABLE = "table";
	
	
	/** <i>Generated variable</i> - Variable of <code>RowEntry.height</code> attribute defined at extension <code>print</code>. */
	private Double _height;
	
	/** <i>Generated variable</i> - Variable of <code>RowEntry.maxHeight</code> attribute defined at extension <code>print</code>. */
	private Double _maxHeight;
	
	/** <i>Generated variable</i> - Variable of <code>RowEntry.autoGrow</code> attribute defined at extension <code>print</code>. */
	private Boolean _autoGrow;
	
	/** <i>Generated variable</i> - Variable of <code>RowEntry.table</code> attribute defined at extension <code>print</code>. */
	private TableBlockModel _table;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public RowEntryModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public RowEntryModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>AxisEntry</code> at extension <code>print</code>
	 * @param _table initial attribute declared by type <code>RowEntry</code> at extension <code>print</code>
	 */
	@Deprecated
	public RowEntryModel(final CatalogVersionModel _catalogVersion, final TableBlockModel _table)
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
	 * @param _table initial attribute declared by type <code>RowEntry</code> at extension <code>print</code>
	 */
	@Deprecated
	public RowEntryModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final TableBlockModel _table)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setTable(_table);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RowEntry.autoGrow</code> attribute defined at extension <code>print</code>. 
	 * @return the autoGrow
	 */
	public Boolean getAutoGrow()
	{
		if (this._autoGrow!=null)
		{
			return _autoGrow;
		}
		return _autoGrow = getPersistenceContext().getValue(AUTOGROW, _autoGrow);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RowEntry.height</code> attribute defined at extension <code>print</code>. 
	 * @return the height
	 */
	public Double getHeight()
	{
		if (this._height!=null)
		{
			return _height;
		}
		return _height = getPersistenceContext().getValue(HEIGHT, _height);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RowEntry.maxHeight</code> attribute defined at extension <code>print</code>. 
	 * @return the maxHeight
	 */
	public Double getMaxHeight()
	{
		if (this._maxHeight!=null)
		{
			return _maxHeight;
		}
		return _maxHeight = getPersistenceContext().getValue(MAXHEIGHT, _maxHeight);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RowEntry.table</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Setter of <code>RowEntry.autoGrow</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the autoGrow
	 */
	public void setAutoGrow(final Boolean value)
	{
		_autoGrow = getPersistenceContext().setValue(AUTOGROW, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>RowEntry.height</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the height
	 */
	public void setHeight(final Double value)
	{
		_height = getPersistenceContext().setValue(HEIGHT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>RowEntry.maxHeight</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the maxHeight
	 */
	public void setMaxHeight(final Double value)
	{
		_maxHeight = getPersistenceContext().setValue(MAXHEIGHT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>RowEntry.table</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the table
	 */
	public void setTable(final TableBlockModel value)
	{
		_table = getPersistenceContext().setValue(TABLE, value);
	}
	
}
