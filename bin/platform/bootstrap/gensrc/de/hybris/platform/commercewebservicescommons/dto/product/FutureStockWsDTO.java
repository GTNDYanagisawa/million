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

import de.hybris.platform.commercewebservicescommons.dto.product.StockWsDTO;
import java.util.Date;

public class FutureStockWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>FutureStockWsDTO.stock</code> property defined at extension <code>commercewebservicescommons</code>. */
	private StockWsDTO stock;
	/** <i>Generated property</i> for <code>FutureStockWsDTO.formattedDate</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String formattedDate;
	/** <i>Generated property</i> for <code>FutureStockWsDTO.date</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Date date;
		
	public FutureStockWsDTO()
	{
		// default constructor
	}
	
		
	public void setStock(final StockWsDTO stock)
	{
		this.stock = stock;
	}
	
		
	public StockWsDTO getStock() 
	{
		return stock;
	}
		
		
	public void setFormattedDate(final String formattedDate)
	{
		this.formattedDate = formattedDate;
	}
	
		
	public String getFormattedDate() 
	{
		return formattedDate;
	}
		
		
	public void setDate(final Date date)
	{
		this.date = date;
	}
	
		
	public Date getDate() 
	{
		return date;
	}
		
	
}