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
package de.hybris.platform.cms2.model.navigation;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.cms2.model.contents.CMSItemModel;
import de.hybris.platform.cms2.model.navigation.CMSNavigationNodeModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type CMSNavigationEntry first defined at extension cms2.
 */
@SuppressWarnings("all")
public class CMSNavigationEntryModel extends CMSItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CMSNavigationEntry";
	
	/**<i>Generated relation code constant for relation <code>CMSNavNodesToCMSNavEntries</code> defining source attribute <code>navigationNode</code> in extension <code>cms2</code>.</i>*/
	public final static String _CMSNAVNODESTOCMSNAVENTRIES = "CMSNavNodesToCMSNavEntries";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSNavigationEntry.item</code> attribute defined at extension <code>cms2</code>. */
	public static final String ITEM = "item";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSNavigationEntry.navigationNode</code> attribute defined at extension <code>cms2</code>. */
	public static final String NAVIGATIONNODE = "navigationNode";
	
	
	/** <i>Generated variable</i> - Variable of <code>CMSNavigationEntry.item</code> attribute defined at extension <code>cms2</code>. */
	private ItemModel _item;
	
	/** <i>Generated variable</i> - Variable of <code>CMSNavigationEntry.navigationNode</code> attribute defined at extension <code>cms2</code>. */
	private CMSNavigationNodeModel _navigationNode;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CMSNavigationEntryModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CMSNavigationEntryModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _item initial attribute declared by type <code>CMSNavigationEntry</code> at extension <code>cms2</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public CMSNavigationEntryModel(final CatalogVersionModel _catalogVersion, final ItemModel _item, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setItem(_item);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _item initial attribute declared by type <code>CMSNavigationEntry</code> at extension <code>cms2</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public CMSNavigationEntryModel(final CatalogVersionModel _catalogVersion, final ItemModel _item, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setItem(_item);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSNavigationEntry.item</code> attribute defined at extension <code>cms2</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>CMSNavigationEntry.navigationNode</code> attribute defined at extension <code>cms2</code>. 
	 * @return the navigationNode
	 */
	public CMSNavigationNodeModel getNavigationNode()
	{
		if (this._navigationNode!=null)
		{
			return _navigationNode;
		}
		return _navigationNode = getPersistenceContext().getValue(NAVIGATIONNODE, _navigationNode);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSNavigationEntry.item</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the item
	 */
	public void setItem(final ItemModel value)
	{
		_item = getPersistenceContext().setValue(ITEM, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSNavigationEntry.navigationNode</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the navigationNode
	 */
	public void setNavigationNode(final CMSNavigationNodeModel value)
	{
		_navigationNode = getPersistenceContext().setValue(NAVIGATIONNODE, value);
	}
	
}
