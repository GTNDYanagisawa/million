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
package de.hybris.platform.ycommercewebservices.queues.data;

import de.hybris.platform.ycommercewebservices.queues.data.OrderStatusUpdateElementData;
import java.util.List;

public class OrderStatusUpdateElementDataList  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>OrderStatusUpdateElementDataList.orderStatusUpdateElements</code> property defined at extension <code>ycommercewebservices</code>. */
	private List<OrderStatusUpdateElementData> orderStatusUpdateElements;
		
	public OrderStatusUpdateElementDataList()
	{
		// default constructor
	}
	
		
	public void setOrderStatusUpdateElements(final List<OrderStatusUpdateElementData> orderStatusUpdateElements)
	{
		this.orderStatusUpdateElements = orderStatusUpdateElements;
	}
	
		
	public List<OrderStatusUpdateElementData> getOrderStatusUpdateElements() 
	{
		return orderStatusUpdateElements;
	}
		
	
}