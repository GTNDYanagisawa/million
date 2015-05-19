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
package de.hybris.platform.acceleratorcms.model.components;

import de.hybris.platform.acceleratorcms.model.components.SimpleSuggestionComponentModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type PurchasedCategorySuggestionComponent first defined at extension acceleratorcms.
 * <p>
 * Represents the suggestion component that displays product references that can be filtered by purchased or from specified category.
 */
@SuppressWarnings("all")
public class PurchasedCategorySuggestionComponentModel extends SimpleSuggestionComponentModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PurchasedCategorySuggestionComponent";
	
	/** <i>Generated constant</i> - Attribute key of <code>PurchasedCategorySuggestionComponent.category</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String CATEGORY = "category";
	
	
	/** <i>Generated variable</i> - Variable of <code>PurchasedCategorySuggestionComponent.category</code> attribute defined at extension <code>acceleratorcms</code>. */
	private CategoryModel _category;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PurchasedCategorySuggestionComponentModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PurchasedCategorySuggestionComponentModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _category initial attribute declared by type <code>PurchasedCategorySuggestionComponent</code> at extension <code>acceleratorcms</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public PurchasedCategorySuggestionComponentModel(final CatalogVersionModel _catalogVersion, final CategoryModel _category, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCategory(_category);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _category initial attribute declared by type <code>PurchasedCategorySuggestionComponent</code> at extension <code>acceleratorcms</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public PurchasedCategorySuggestionComponentModel(final CatalogVersionModel _catalogVersion, final CategoryModel _category, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCategory(_category);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PurchasedCategorySuggestionComponent.category</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the category - Category to filter displayed references with.
	 */
	public CategoryModel getCategory()
	{
		if (this._category!=null)
		{
			return _category;
		}
		return _category = getPersistenceContext().getValue(CATEGORY, _category);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PurchasedCategorySuggestionComponent.category</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the category - Category to filter displayed references with.
	 */
	public void setCategory(final CategoryModel value)
	{
		_category = getPersistenceContext().setValue(CATEGORY, value);
	}
	
}
