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

import de.hybris.platform.commercewebservicescommons.dto.product.PriceWsDTO;
import java.util.Date;

public class OrderHistoryWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>OrderHistoryWsDTO.total</code> property defined at extension <code>commercewebservicescommons</code>. */
	private PriceWsDTO total;
	/** <i>Generated property</i> for <code>OrderHistoryWsDTO.guid</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String guid;
	/** <i>Generated property</i> for <code>OrderHistoryWsDTO.status</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String status;
	/** <i>Generated property</i> for <code>OrderHistoryWsDTO.statusDisplay</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String statusDisplay;
	/** <i>Generated property</i> for <code>OrderHistoryWsDTO.code</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String code;
	/** <i>Generated property</i> for <code>OrderHistoryWsDTO.placed</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Date placed;
		
	public OrderHistoryWsDTO()
	{
		// default constructor
	}
	
		
	public void setTotal(final PriceWsDTO total)
	{
		this.total = total;
	}
	
		
	public PriceWsDTO getTotal() 
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
		
		
	public void setStatus(final String status)
	{
		this.status = status;
	}
	
		
	public String getStatus() 
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