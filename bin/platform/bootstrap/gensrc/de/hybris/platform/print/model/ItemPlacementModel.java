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
import de.hybris.platform.print.model.PlacementModel;
import de.hybris.platform.print.model.PublicationModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type ItemPlacement first defined at extension print.
 */
@SuppressWarnings("all")
public class ItemPlacementModel extends PlacementModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ItemPlacement";
	
	/** <i>Generated constant</i> - Attribute key of <code>ItemPlacement.item</code> attribute defined at extension <code>print</code>. */
	public static final String ITEM = "item";
	
	
	/** <i>Generated variable</i> - Variable of <code>ItemPlacement.item</code> attribute defined at extension <code>print</code>. */
	private ItemModel _item;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ItemPlacementModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ItemPlacementModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _item initial attribute declared by type <code>ItemPlacement</code> at extension <code>print</code>
	 * @param _publication initial attribute declared by type <code>PublicationComponent</code> at extension <code>print</code>
	 */
	@Deprecated
	public ItemPlacementModel(final ItemModel _item, final PublicationModel _publication)
	{
		super();
		setItem(_item);
		setPublication(_publication);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _item initial attribute declared by type <code>ItemPlacement</code> at extension <code>print</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _publication initial attribute declared by type <code>PublicationComponent</code> at extension <code>print</code>
	 */
	@Deprecated
	public ItemPlacementModel(final ItemModel _item, final ItemModel _owner, final PublicationModel _publication)
	{
		super();
		setItem(_item);
		setOwner(_owner);
		setPublication(_publication);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItemPlacement.item</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Setter of <code>ItemPlacement.item</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the item
	 */
	public void setItem(final ItemModel value)
	{
		_item = getPersistenceContext().setValue(ITEM, value);
	}
	
}
