/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 2015/05/18 13:25:59
 * ----------------------------------------------------------------
 *
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package de.hybris.platform.solrfacetsearch.config;

import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.solrfacetsearch.config.AbstractSolrFacetVisibilityRuleData;
import java.util.Collection;

public class CategorySelectedFacetVisibilityRuleData extends AbstractSolrFacetVisibilityRuleData 
{

	/** <i>Generated property</i> for <code>CategorySelectedFacetVisibilityRuleData.categories</code> property defined at extension <code>commercesearch</code>. */
	private Collection<CategoryModel> categories;
		
	public CategorySelectedFacetVisibilityRuleData()
	{
		// default constructor
	}
	
		
	public void setCategories(final Collection<CategoryModel> categories)
	{
		this.categories = categories;
	}
	
		
	public Collection<CategoryModel> getCategories() 
	{
		return categories;
	}
		
	
}