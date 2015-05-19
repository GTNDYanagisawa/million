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
package de.hybris.platform.commercesearch.model;

import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.commercesearch.model.AbstractSolrFacetVisibilityRuleModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexedPropertyModel;
import java.util.Collection;

/**
 * Generated model class for type CategorySelectedSolrFacetVisibilityRule first defined at extension commercesearch.
 */
@SuppressWarnings("all")
public class CategorySelectedSolrFacetVisibilityRuleModel extends AbstractSolrFacetVisibilityRuleModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CategorySelectedSolrFacetVisibilityRule";
	
	/** <i>Generated constant</i> - Attribute key of <code>CategorySelectedSolrFacetVisibilityRule.categories</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String CATEGORIES = "categories";
	
	
	/** <i>Generated variable</i> - Variable of <code>CategorySelectedSolrFacetVisibilityRule.categories</code> attribute defined at extension <code>commercesearch</code>. */
	private Collection<CategoryModel> _categories;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CategorySelectedSolrFacetVisibilityRuleModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CategorySelectedSolrFacetVisibilityRuleModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _categories initial attribute declared by type <code>CategorySelectedSolrFacetVisibilityRule</code> at extension <code>commercesearch</code>
	 * @param _code initial attribute declared by type <code>AbstractSolrFacetVisibilityRule</code> at extension <code>commercesearch</code>
	 * @param _facet initial attribute declared by type <code>AbstractSolrFacetVisibilityRule</code> at extension <code>commercesearch</code>
	 */
	@Deprecated
	public CategorySelectedSolrFacetVisibilityRuleModel(final Collection<CategoryModel> _categories, final String _code, final SolrIndexedPropertyModel _facet)
	{
		super();
		setCategories(_categories);
		setCode(_code);
		setFacet(_facet);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _categories initial attribute declared by type <code>CategorySelectedSolrFacetVisibilityRule</code> at extension <code>commercesearch</code>
	 * @param _code initial attribute declared by type <code>AbstractSolrFacetVisibilityRule</code> at extension <code>commercesearch</code>
	 * @param _facet initial attribute declared by type <code>AbstractSolrFacetVisibilityRule</code> at extension <code>commercesearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public CategorySelectedSolrFacetVisibilityRuleModel(final Collection<CategoryModel> _categories, final String _code, final SolrIndexedPropertyModel _facet, final ItemModel _owner)
	{
		super();
		setCategories(_categories);
		setCode(_code);
		setFacet(_facet);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategorySelectedSolrFacetVisibilityRule.categories</code> attribute defined at extension <code>commercesearch</code>. 
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
	 * <i>Generated method</i> - Setter of <code>CategorySelectedSolrFacetVisibilityRule.categories</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the categories
	 */
	public void setCategories(final Collection<CategoryModel> value)
	{
		_categories = getPersistenceContext().setValue(CATEGORIES, value);
	}
	
}
