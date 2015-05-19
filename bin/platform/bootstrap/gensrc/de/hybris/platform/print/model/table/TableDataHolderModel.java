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
import de.hybris.platform.print.model.table.TableBlockModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type TableDataHolder first defined at extension print.
 */
@SuppressWarnings("all")
public class TableDataHolderModel extends AbstractTableDataHolderModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "TableDataHolder";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public TableDataHolderModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public TableDataHolderModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _table initial attribute declared by type <code>AbstractTableDataHolder</code> at extension <code>print</code>
	 */
	@Deprecated
	public TableDataHolderModel(final TableBlockModel _table)
	{
		super();
		setTable(_table);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _table initial attribute declared by type <code>AbstractTableDataHolder</code> at extension <code>print</code>
	 */
	@Deprecated
	public TableDataHolderModel(final ItemModel _owner, final TableBlockModel _table)
	{
		super();
		setOwner(_owner);
		setTable(_table);
	}
	
	
}
