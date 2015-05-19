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
package de.hybris.platform.commercefacades.product.data;

import de.hybris.platform.commercefacades.product.data.StockData;
import java.util.Date;

public class FutureStockData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>FutureStockData.stock</code> property defined at extension <code>commercefacades</code>. */
	private StockData stock;
	/** <i>Generated property</i> for <code>FutureStockData.formattedDate</code> property defined at extension <code>commercefacades</code>. */
	private String formattedDate;
	/** <i>Generated property</i> for <code>FutureStockData.date</code> property defined at extension <code>commercefacades</code>. */
	private Date date;
		
	public FutureStockData()
	{
		// default constructor
	}
	
		
	public void setStock(final StockData stock)
	{
		this.stock = stock;
	}
	
		
	public StockData getStock() 
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