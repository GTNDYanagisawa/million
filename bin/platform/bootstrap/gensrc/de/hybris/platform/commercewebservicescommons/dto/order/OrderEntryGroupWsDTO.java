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
package de.hybris.platform.commercewebservicescommons.dto.order;

import de.hybris.platform.commercewebservicescommons.dto.order.OrderEntryWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.product.PriceWsDTO;
import java.util.Collection;

public class OrderEntryGroupWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>OrderEntryGroupWsDTO.entries</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Collection<OrderEntryWsDTO> entries;
	/** <i>Generated property</i> for <code>OrderEntryGroupWsDTO.quantity</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Long quantity;
	/** <i>Generated property</i> for <code>OrderEntryGroupWsDTO.totalPriceWithTax</code> property defined at extension <code>commercewebservicescommons</code>. */
	private PriceWsDTO totalPriceWithTax;
		
	public OrderEntryGroupWsDTO()
	{
		// default constructor
	}
	
		
	public void setEntries(final Collection<OrderEntryWsDTO> entries)
	{
		this.entries = entries;
	}
	
		
	public Collection<OrderEntryWsDTO> getEntries() 
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
		
		
	public void setTotalPriceWithTax(final PriceWsDTO totalPriceWithTax)
	{
		this.totalPriceWithTax = totalPriceWithTax;
	}
	
		
	public PriceWsDTO getTotalPriceWithTax() 
	{
		return totalPriceWithTax;
	}
		
	
}