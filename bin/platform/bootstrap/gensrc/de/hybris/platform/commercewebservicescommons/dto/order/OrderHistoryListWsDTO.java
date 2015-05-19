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
package de.hybris.platform.commercewebservicescommons.dto.order;

import de.hybris.platform.commercewebservicescommons.dto.order.OrderHistoryWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.search.pagedata.PaginationWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.search.pagedata.SortWsDTO;
import java.util.List;

public class OrderHistoryListWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>OrderHistoryListWsDTO.orders</code> property defined at extension <code>commercewebservicescommons</code>. */
	private List<OrderHistoryWsDTO> orders;
	/** <i>Generated property</i> for <code>OrderHistoryListWsDTO.pagination</code> property defined at extension <code>commercewebservicescommons</code>. */
	private PaginationWsDTO pagination;
	/** <i>Generated property</i> for <code>OrderHistoryListWsDTO.sorts</code> property defined at extension <code>commercewebservicescommons</code>. */
	private List<SortWsDTO> sorts;
		
	public OrderHistoryListWsDTO()
	{
		// default constructor
	}
	
		
	public void setOrders(final List<OrderHistoryWsDTO> orders)
	{
		this.orders = orders;
	}
	
		
	public List<OrderHistoryWsDTO> getOrders() 
	{
		return orders;
	}
		
		
	public void setPagination(final PaginationWsDTO pagination)
	{
		this.pagination = pagination;
	}
	
		
	public PaginationWsDTO getPagination() 
	{
		return pagination;
	}
		
		
	public void setSorts(final List<SortWsDTO> sorts)
	{
		this.sorts = sorts;
	}
	
		
	public List<SortWsDTO> getSorts() 
	{
		return sorts;
	}
		
	
}