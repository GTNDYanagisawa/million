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
package de.hybris.platform.acceleratorfacades.order.data;

import de.hybris.platform.commercefacades.product.data.PriceData;

public class PriceRangeData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>PriceRangeData.maxPrice</code> property defined at extension <code>acceleratorfacades</code>. */
	private PriceData maxPrice;
	/** <i>Generated property</i> for <code>PriceRangeData.minPrice</code> property defined at extension <code>acceleratorfacades</code>. */
	private PriceData minPrice;
		
	public PriceRangeData()
	{
		// default constructor
	}
	
		
	public void setMaxPrice(final PriceData maxPrice)
	{
		this.maxPrice = maxPrice;
	}
	
		
	public PriceData getMaxPrice() 
	{
		return maxPrice;
	}
		
		
	public void setMinPrice(final PriceData minPrice)
	{
		this.minPrice = minPrice;
	}
	
		
	public PriceData getMinPrice() 
	{
		return minPrice;
	}
		
	
}