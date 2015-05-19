/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 2015/05/18 13:25:58
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
package de.hybris.platform.commercefacades.order.data;

import de.hybris.platform.commercefacades.order.data.OrderEntryData;
import de.hybris.platform.commercefacades.product.data.PriceData;
import java.util.Collection;

public class OrderEntryGroupData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>OrderEntryGroupData.entries</code> property defined at extension <code>commercefacades</code>. */
	private Collection<OrderEntryData> entries;
	/** <i>Generated property</i> for <code>OrderEntryGroupData.quantity</code> property defined at extension <code>commercefacades</code>. */
	private Long quantity;
	/** <i>Generated property</i> for <code>OrderEntryGroupData.totalPriceWithTax</code> property defined at extension <code>commercefacades</code>. */
	private PriceData totalPriceWithTax;
		
	public OrderEntryGroupData()
	{
		// default constructor
	}
	
		
	public void setEntries(final Collection<OrderEntryData> entries)
	{
		this.entries = entries;
	}
	
		
	public Collection<OrderEntryData> getEntries() 
	{
		return entries;
	}
		
		
	public void setQuantity(final Long quantity)
	{
		this.quantity = quantity;
	}
	
		
	public Long getQuantity() 
	{
		return quantity;
	}
		
		
	public void setTotalPriceWithTax(final PriceData totalPriceWithTax)
	{
		this.totalPriceWithTax = totalPriceWithTax;
	}
	
		
	public PriceData getTotalPriceWithTax() 
	{
		return totalPriceWithTax;
	}
		
	
}