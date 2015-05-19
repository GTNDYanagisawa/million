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
package de.hybris.platform.commerceservices.search.facetdata;

import de.hybris.platform.commerceservices.search.facetdata.ProductSearchPageData;
import java.util.List;

/**
 * POJO containing the result page for product or category search.
 */
public class ProductCategorySearchPageData<STATE, RESULT, CATEGORY> extends ProductSearchPageData<STATE, RESULT> 
{

	/** <i>Generated property</i> for <code>ProductCategorySearchPageData<STATE, RESULT, CATEGORY>.subCategories</code> property defined at extension <code>commerceservices</code>. */
	private List<CATEGORY> subCategories;
		
	public ProductCategorySearchPageData()
	{
		// default constructor
	}
	
		
	public void setSubCategories(final List<CATEGORY> subCategories)
	{
		this.subCategories = subCategories;
	}
	
		
	public List<CATEGORY> getSubCategories() 
	{
		return subCategories;
	}
		
	
}