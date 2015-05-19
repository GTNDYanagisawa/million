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
package de.hybris.platform.commercewebservicescommons.dto.store;

import de.hybris.platform.commercewebservicescommons.dto.product.StockWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.store.PointOfServiceWsDTO;

public class PointOfServiceStockWsDTO extends PointOfServiceWsDTO 
{

	/** <i>Generated property</i> for <code>PointOfServiceStockWsDTO.stockInfo</code> property defined at extension <code>commercewebservicescommons</code>. */
	private StockWsDTO stockInfo;
		
	public PointOfServiceStockWsDTO()
	{
		// default constructor
	}
	
		
	public void setStockInfo(final StockWsDTO stockInfo)
	{
		this.stockInfo = stockInfo;
	}
	
		
	public StockWsDTO getStockInfo() 
	{
		return stockInfo;
	}
		
	
}