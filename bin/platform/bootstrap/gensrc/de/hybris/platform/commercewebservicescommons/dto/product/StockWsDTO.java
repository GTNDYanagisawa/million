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
package de.hybris.platform.commercewebservicescommons.dto.product;

public class StockWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>StockWsDTO.stockLevelStatus</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String stockLevelStatus;
	/** <i>Generated property</i> for <code>StockWsDTO.stockLevel</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Long stockLevel;
		
	public StockWsDTO()
	{
		// default constructor
	}
	
		
	public void setStockLevelStatus(final String stockLevelStatus)
	{
		this.stockLevelStatus = stockLevelStatus;
	}
	
		
	public String getStockLevelStatus() 
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