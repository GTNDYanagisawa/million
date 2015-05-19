/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 2015/05/18 13:26:00
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
package de.hybris.platform.commercefacades.storelocator.data;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.storelocator.model.PointOfServiceModel;

public class StoreStockHolder  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>StoreStockHolder.product</code> property defined at extension <code>commercefacades</code>. */
	private ProductModel product;
	/** <i>Generated property</i> for <code>StoreStockHolder.pointOfService</code> property defined at extension <code>commercefacades</code>. */
	private PointOfServiceModel pointOfService;
		
	public StoreStockHolder()
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
		
		
	public void setPointOfService(final PointOfServiceModel pointOfService)
	{
		this.pointOfService = pointOfService;
	}
	
		
	public PointOfServiceModel getPointOfService() 
	{
		return pointOfService;
	}
		
	
}