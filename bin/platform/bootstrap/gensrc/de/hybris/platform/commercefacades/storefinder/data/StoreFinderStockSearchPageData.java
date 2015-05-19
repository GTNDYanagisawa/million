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
package de.hybris.platform.commercefacades.storefinder.data;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commerceservices.storefinder.data.StoreFinderSearchPageData;

public class StoreFinderStockSearchPageData<RESULT> extends StoreFinderSearchPageData<RESULT> 
{

	/** <i>Generated property</i> for <code>StoreFinderStockSearchPageData<RESULT>.product</code> property defined at extension <code>commercefacades</code>. */
	private ProductData product;
		
	public StoreFinderStockSearchPageData()
	{
		// default constructor
	}
	
		
	public void setProduct(final ProductData product)
	{
		this.product = product;
	}
	
		
	public ProductData getProduct() 
	{
		return product;
	}
		
	
}