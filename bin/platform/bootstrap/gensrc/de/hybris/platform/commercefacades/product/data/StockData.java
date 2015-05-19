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
package de.hybris.platform.commercefacades.product.data;

import de.hybris.platform.basecommerce.enums.StockLevelStatus;

public class StockData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>StockData.stockLevelStatus</code> property defined at extension <code>commercefacades</code>. */
	private StockLevelStatus stockLevelStatus;
	/** <i>Generated property</i> for <code>StockData.stockLevel</code> property defined at extension <code>commercefacades</code>. */
	private Long stockLevel;
		
	public StockData()
	{
		// default constructor
	}
	
		
	public void setStockLevelStatus(final StockLevelStatus stockLevelStatus)
	{
		this.stockLevelStatus = stockLevelStatus;
	}
	
		
	public StockLevelStatus getStockLevelStatus() 
	{
		return stockLevelStatus;
	}
		
		
	public void setStockLevel(final Long stockLevel)
	{
		this.stockLevel = stockLevel;
	}
	
		
	public Long getStockLevel() 
	{
		return stockLevel;
	}
		
	
}