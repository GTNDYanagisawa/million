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
package de.hybris.platform.print.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.print.model.CometConfigurationModel;
import de.hybris.platform.print.model.PlaceholderModel;
import de.hybris.platform.print.model.table.TableBlockModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type TablePlaceholder first defined at extension print.
 */
@SuppressWarnings("all")
public class TablePlaceholderModel extends PlaceholderModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "TablePlaceholder";
	
	/** <i>Generated constant</i> - Attribute key of <code>TablePlaceholder.table</code> attribute defined at extension <code>print</code>. */
	public static final String TABLE = "table";
	
	/** <i>Generated constant</i> - Attribute key of <code>TablePlaceholder.itemParameter</code> attribute defined at extension <code>print</code>. */
	public static final String ITEMPARAMETER = "itemParameter";
	
	
	/** <i>Generated variable</i> - Variable of <code>TablePlaceholder.table</code> attribute defined at extension <code>print</code>. */
	private TableBlockModel _table;
	
	/** <i>Generated variable</i> - Variable of <code>TablePlaceholder.itemParameter</code> attribute defined at extension <code>print</code>. */
	private String _itemParameter;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public TablePlaceholderModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public TablePlaceholderModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _cometConfig initial attribute declared by type <code>Placeholder</code> at extension <code>print</code>
	 * @param _qualifier initial attribute declared by type <code>Placeholder</code> at extension <code>print</code>
	 * @param _table initial attribute declared by type <code>TablePlaceholder</code> at extension <code>print</code>
	 */
	@Deprecated
	public TablePlaceholderModel(final CometConfigurationModel _cometConfig, final String _qualifier, final TableBlockModel _table)
	{
		super();
		setCometConfig(_cometConfig);
		setQualifier(_qualifier);
		setTable(_table);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _cometConfig initial attribute declared by type <code>Placeholder</code> at extension <code>print</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _qualifier initial attribute declared by type <code>Placeholder</code> at extension <code>print</code>
	 * @param _table initial attribute declared by type <code>TablePlaceholder</code> at extension <code>print</code>
	 */
	@Deprecated
	public TablePlaceholderModel(final CometConfigurationModel _cometConfig, final ItemModel _owner, final String _qualifier, final TableBlockModel _table)
	{
		super();
		setCometConfig(_cometConfig);
		setOwner(_owner);
		setQualifier(_qualifier);
		setTable(_table);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TablePlaceholder.itemParameter</code> attribute defined at extension <code>print</code>. 
	 * @return the itemParameter
	 */
	public String getItemParameter()
	{
		if (this._itemParameter!=null)
		{
			return _itemParameter;
		}
		return _itemParameter = getPersistenceContext().getValue(ITEMPARAMETER, _itemParameter);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TablePlaceholder.table</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Setter of <code>TablePlaceholder.itemParameter</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the itemParameter
	 */
	public void setItemParameter(final String value)
	{
		_itemParameter = getPersistenceContext().setValue(ITEMPARAMETER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TablePlaceholder.table</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the table
	 */
	public void setTable(final TableBlockModel value)
	{
		_table = getPersistenceContext().setValue(TABLE, value);
	}
	
}
