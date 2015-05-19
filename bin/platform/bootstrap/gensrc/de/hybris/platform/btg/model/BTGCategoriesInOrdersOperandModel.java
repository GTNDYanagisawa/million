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
package de.hybris.platform.btg.model;

import de.hybris.platform.btg.model.BTGLastOrdersOperandModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type BTGCategoriesInOrdersOperand first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGCategoriesInOrdersOperandModel extends BTGLastOrdersOperandModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGCategoriesInOrdersOperand";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGCategoriesInOrdersOperand.withSupercategories</code> attribute defined at extension <code>btg</code>. */
	public static final String WITHSUPERCATEGORIES = "withSupercategories";
	
	
	/** <i>Generated variable</i> - Variable of <code>BTGCategoriesInOrdersOperand.withSupercategories</code> attribute defined at extension <code>btg</code>. */
	private Boolean _withSupercategories;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGCategoriesInOrdersOperandModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGCategoriesInOrdersOperandModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGCategoriesInOrdersOperandModel(final CatalogVersionModel _catalogVersion, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGCategoriesInOrdersOperandModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGCategoriesInOrdersOperand.withSupercategories</code> attribute defined at extension <code>btg</code>. 
	 * @return the withSupercategories
	 */
	public Boolean getWithSupercategories()
	{
		if (this._withSupercategories!=null)
		{
			return _withSupercategories;
		}
		return _withSupercategories = getPersistenceContext().getValue(WITHSUPERCATEGORIES, _withSupercategories);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGCategoriesInOrdersOperand.withSupercategories</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the withSupercategories
	 */
	public void setWithSupercategories(final Boolean value)
	{
		_withSupercategories = getPersistenceContext().setValue(WITHSUPERCATEGORIES, value);
	}
	
}
