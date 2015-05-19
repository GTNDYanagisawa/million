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

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.print.model.table.AbstractTableDataHolderModel;
import de.hybris.platform.print.model.table.CellEntryModel;
import de.hybris.platform.print.model.table.TableBlockModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type CellDataHolder first defined at extension print.
 */
@SuppressWarnings("all")
public class CellDataHolderModel extends AbstractTableDataHolderModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CellDataHolder";
	
	/** <i>Generated constant</i> - Attribute key of <code>CellDataHolder.cell</code> attribute defined at extension <code>print</code>. */
	public static final String CELL = "cell";
	
	/** <i>Generated constant</i> - Attribute key of <code>CellDataHolder.dataResolverClass</code> attribute defined at extension <code>print</code>. */
	public static final String DATARESOLVERCLASS = "dataResolverClass";
	
	
	/** <i>Generated variable</i> - Variable of <code>CellDataHolder.cell</code> attribute defined at extension <code>print</code>. */
	private CellEntryModel _cell;
	
	/** <i>Generated variable</i> - Variable of <code>CellDataHolder.dataResolverClass</code> attribute defined at extension <code>print</code>. */
	private Class _dataResolverClass;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CellDataHolderModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CellDataHolderModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _cell initial attribute declared by type <code>CellDataHolder</code> at extension <code>print</code>
	 * @param _table initial attribute declared by type <code>AbstractTableDataHolder</code> at extension <code>print</code>
	 */
	@Deprecated
	public CellDataHolderModel(final CellEntryModel _cell, final TableBlockModel _table)
	{
		super();
		setCell(_cell);
		setTable(_table);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _cell initial attribute declared by type <code>CellDataHolder</code> at extension <code>print</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _table initial attribute declared by type <code>AbstractTableDataHolder</code> at extension <code>print</code>
	 */
	@Deprecated
	public CellDataHolderModel(final CellEntryModel _cell, final ItemModel _owner, final TableBlockModel _table)
	{
		super();
		setCell(_cell);
		setOwner(_owner);
		setTable(_table);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CellDataHolder.cell</code> attribute defined at extension <code>print</code>. 
	 * @return the cell
	 */
	public CellEntryModel getCell()
	{
		if (this._cell!=null)
		{
			return _cell;
		}
		return _cell = getPersistenceContext().getValue(CELL, _cell);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CellDataHolder.dataResolverClass</code> attribute defined at extension <code>print</code>. 
	 * @return the dataResolverClass
	 */
	public Class getDataResolverClass()
	{
		if (this._dataResolverClass!=null)
		{
			return _dataResolverClass;
		}
		return _dataResolverClass = getPersistenceContext().getValue(DATARESOLVERCLASS, _dataResolverClass);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CellDataHolder.cell</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the cell
	 */
	public void setCell(final CellEntryModel value)
	{
		_cell = getPersistenceContext().setValue(CELL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CellDataHolder.dataResolverClass</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the dataResolverClass
	 */
	public void setDataResolverClass(final Class value)
	{
		_dataResolverClass = getPersistenceContext().setValue(DATARESOLVERCLASS, value);
	}
	
}
