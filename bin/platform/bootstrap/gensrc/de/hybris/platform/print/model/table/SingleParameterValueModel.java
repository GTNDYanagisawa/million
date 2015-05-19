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
import de.hybris.platform.print.model.table.ParameterValueModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SingleParameterValue first defined at extension print.
 */
@SuppressWarnings("all")
public class SingleParameterValueModel extends ParameterValueModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SingleParameterValue";
	
	/** <i>Generated constant</i> - Attribute key of <code>SingleParameterValue.hasItem</code> attribute defined at extension <code>print</code>. */
	public static final String HASITEM = "hasItem";
	
	/** <i>Generated constant</i> - Attribute key of <code>SingleParameterValue.data</code> attribute defined at extension <code>print</code>. */
	public static final String DATA = "data";
	
	/** <i>Generated constant</i> - Attribute key of <code>SingleParameterValue.item</code> attribute defined at extension <code>print</code>. */
	public static final String ITEM = "item";
	
	
	/** <i>Generated variable</i> - Variable of <code>SingleParameterValue.hasItem</code> attribute defined at extension <code>print</code>. */
	private Boolean _hasItem;
	
	/** <i>Generated variable</i> - Variable of <code>SingleParameterValue.data</code> attribute defined at extension <code>print</code>. */
	private Object _data;
	
	/** <i>Generated variable</i> - Variable of <code>SingleParameterValue.item</code> attribute defined at extension <code>print</code>. */
	private ItemModel _item;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SingleParameterValueModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SingleParameterValueModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _hasItem initial attribute declared by type <code>SingleParameterValue</code> at extension <code>print</code>
	 */
	@Deprecated
	public SingleParameterValueModel(final Boolean _hasItem)
	{
		super();
		setHasItem(_hasItem);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _hasItem initial attribute declared by type <code>SingleParameterValue</code> at extension <code>print</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public SingleParameterValueModel(final Boolean _hasItem, final ItemModel _owner)
	{
		super();
		setHasItem(_hasItem);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SingleParameterValue.data</code> attribute defined at extension <code>print</code>. 
	 * @return the data
	 */
	public Object getData()
	{
		if (this._data!=null)
		{
			return _data;
		}
		return _data = getPersistenceContext().getValue(DATA, _data);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SingleParameterValue.hasItem</code> attribute defined at extension <code>print</code>. 
	 * @return the hasItem
	 */
	public Boolean getHasItem()
	{
		if (this._hasItem!=null)
		{
			return _hasItem;
		}
		return _hasItem = getPersistenceContext().getValue(HASITEM, _hasItem);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SingleParameterValue.item</code> attribute defined at extension <code>print</code>. 
	 * @return the item
	 */
	public ItemModel getItem()
	{
		if (this._item!=null)
		{
			return _item;
		}
		return _item = getPersistenceContext().getValue(ITEM, _item);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SingleParameterValue.data</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the data
	 */
	public void setData(final Object value)
	{
		_data = getPersistenceContext().setValue(DATA, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SingleParameterValue.hasItem</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the hasItem
	 */
	public void setHasItem(final Boolean value)
	{
		_hasItem = getPersistenceContext().setValue(HASITEM, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SingleParameterValue.item</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the item
	 */
	public void setItem(final ItemModel value)
	{
		_item = getPersistenceContext().setValue(ITEM, value);
	}
	
}
