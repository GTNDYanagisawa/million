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
package de.hybris.platform.commercefacades.order.data;

import de.hybris.platform.commercefacades.product.data.PriceData;
import de.hybris.platform.core.enums.OrderStatus;
import java.util.Date;

public class OrderHistoryData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>OrderHistoryData.total</code> property defined at extension <code>commercefacades</code>. */
	private PriceData total;
	/** <i>Generated property</i> for <code>OrderHistoryData.guid</code> property defined at extension <code>commercefacades</code>. */
	private String guid;
	/** <i>Generated property</i> for <code>OrderHistoryData.status</code> property defined at extension <code>commercefacades</code>. */
	private OrderStatus status;
	/** <i>Generated property</i> for <code>OrderHistoryData.statusDisplay</code> property defined at extension <code>commercefacades</code>. */
	private String statusDisplay;
	/** <i>Generated property</i> for <code>OrderHistoryData.code</code> property defined at extension <code>commercefacades</code>. */
	private String code;
	/** <i>Generated property</i> for <code>OrderHistoryData.placed</code> property defined at extension <code>commercefacades</code>. */
	private Date placed;
		
	public OrderHistoryData()
	{
		// default constructor
	}
	
		
	public void setTotal(final PriceData total)
	{
		this.total = total;
	}
	
		
	public PriceData getTotal() 
	{
		return total;
	}
		
		
	public void setGuid(final String guid)
	{
		this.guid = guid;
	}
	
		
	public String getGuid() 
	{
		return guid;
	}
		
		
	public void setStatus(final OrderStatus status)
	{
		this.status = status;
	}
	
		
	public OrderStatus getStatus() 
	{
		return status;
	}
		
		
	public void setStatusDisplay(final String statusDisplay)
	{
		this.statusDisplay = statusDisplay;
	}
	
		
	public String getStatusDisplay() 
	{
		return statusDisplay;
	}
		
		
	public void setCode(final String code)
	{
		this.code = code;
	}
	
		
	public String getCode() 
	{
		return code;
	}
		
		
	public void setPlaced(final Date placed)
	{
		this.placed = placed;
	}
	
		
	public Date getPlaced() 
	{
		return placed;
	}
		
	
}