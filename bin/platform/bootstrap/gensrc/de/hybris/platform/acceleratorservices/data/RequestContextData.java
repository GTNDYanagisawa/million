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
package de.hybris.platform.acceleratorservices.data;

import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;
import de.hybris.platform.core.model.product.ProductModel;

/**
 * Holds context data for rendering the current request
 */
public class RequestContextData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>RequestContextData.product</code> property defined at extension <code>acceleratorservices</code>. */
	private ProductModel product;
	/** <i>Generated property</i> for <code>RequestContextData.category</code> property defined at extension <code>acceleratorservices</code>. */
	private CategoryModel category;
	/** <i>Generated property</i> for <code>RequestContextData.search</code> property defined at extension <code>acceleratorservices</code>. */
	private SearchPageData search;
		
	public RequestContextData()
	{
		// default constructor
	}
	
		
	public void setProduct(final ProductModel product)
	{
		this.product = product;
	}
	
		
	public ProductModel getProduct() 
	{
		return product;
	}
		
		
	public void setCategory(final CategoryModel category)
	{
		this.category = category;
	}
	
		
	public CategoryModel getCategory() 
	{
		return category;
	}
		
		
	public void setSearch(final SearchPageData search)
	{
		this.search = search;
	}
	
		
	public SearchPageData getSearch() 
	{
		return search;
	}
		
	
}