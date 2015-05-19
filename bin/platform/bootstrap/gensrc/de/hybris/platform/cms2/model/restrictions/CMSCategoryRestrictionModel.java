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
package de.hybris.platform.cms2.model.restrictions;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.cms2.model.restrictions.AbstractRestrictionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.List;

/**
 * Generated model class for type CMSCategoryRestriction first defined at extension cms2.
 */
@SuppressWarnings("all")
public class CMSCategoryRestrictionModel extends AbstractRestrictionModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CMSCategoryRestriction";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSCategoryRestriction.recursive</code> attribute defined at extension <code>cms2</code>. */
	public static final String RECURSIVE = "recursive";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSCategoryRestriction.categoryCodes</code> attribute defined at extension <code>cms2</code>. */
	public static final String CATEGORYCODES = "categoryCodes";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSCategoryRestriction.categories</code> attribute defined at extension <code>cms2</code>. */
	public static final String CATEGORIES = "categories";
	
	
	/** <i>Generated variable</i> - Variable of <code>CMSCategoryRestriction.recursive</code> attribute defined at extension <code>cms2</code>. */
	private Boolean _recursive;
	
	/** <i>Generated variable</i> - Variable of <code>CMSCategoryRestriction.categoryCodes</code> attribute defined at extension <code>cms2</code>. */
	private List<String> _categoryCodes;
	
	/** <i>Generated variable</i> - Variable of <code>CMSCategoryRestriction.categories</code> attribute defined at extension <code>cms2</code>. */
	private Collection<CategoryModel> _categories;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CMSCategoryRestrictionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CMSCategoryRestrictionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public CMSCategoryRestrictionModel(final CatalogVersionModel _catalogVersion, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public CMSCategoryRestrictionModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSCategoryRestriction.categories</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the categories
	 */
	public Collection<CategoryModel> getCategories()
	{
		if (this._categories!=null)
		{
			return _categories;
		}
		return _categories = getPersistenceContext().getValue(CATEGORIES, _categories);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSCategoryRestriction.categoryCodes</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the categoryCodes
	 */
	@Deprecated
	public List<String> getCategoryCodes()
	{
		if (this._categoryCodes!=null)
		{
			return _categoryCodes;
		}
		return _categoryCodes = getPersistenceContext().getValue(CATEGORYCODES, _categoryCodes);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSCategoryRestriction.recursive</code> attribute defined at extension <code>cms2</code>. 
	 * @return the recursive
	 */
	public boolean isRecursive()
	{
		return toPrimitive( _recursive = getPersistenceContext().getValue(RECURSIVE, _recursive));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSCategoryRestriction.categories</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the categories
	 */
	public void setCategories(final Collection<CategoryModel> value)
	{
		_categories = getPersistenceContext().setValue(CATEGORIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSCategoryRestriction.recursive</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the recursive
	 */
	public void setRecursive(final boolean value)
	{
		_recursive = getPersistenceContext().setValue(RECURSIVE, toObject(value));
	}
	
}
