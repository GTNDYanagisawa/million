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

import de.hybris.platform.commercefacades.order.data.OrderEntryData;

public class CartModificationData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>CartModificationData.statusCode</code> property defined at extension <code>commercefacades</code>. */
	private String statusCode;
	/** <i>Generated property</i> for <code>CartModificationData.cartCode</code> property defined at extension <code>commercefacades</code>. */
	private String cartCode;
	/** <i>Generated property</i> for <code>CartModificationData.entry</code> property defined at extension <code>commercefacades</code>. */
	private OrderEntryData entry;
	/** <i>Generated property</i> for <code>CartModificationData.quantity</code> property defined at extension <code>commercefacades</code>. */
	private long quantity;
	/** <i>Generated property</i> for <code>CartModificationData.quantityAdded</code> property defined at extension <code>commercefacades</code>. */
	private long quantityAdded;
	/** <i>Generated property</i> for <code>CartModificationData.deliveryModeChanged</code> property defined at extension <code>commercefacades</code>. */
	private Boolean deliveryModeChanged;
		
	public CartModificationData()
	{
		// default constructor
	}
	
		
	public void setStatusCode(final String statusCode)
	{
		this.statusCode = statusCode;
	}
	
		
	public String getStatusCode() 
	{
		return statusCode;
	}
		
		
	public void setCartCode(final String cartCode)
	{
		this.cartCode = cartCode;
	}
	
		
	public String getCartCode() 
	{
		return cartCode;
	}
		
		
	public void setEntry(final OrderEntryData entry)
	{
		this.entry = entry;
	}
	
		
	public OrderEntryData getEntry() 
	{
		return entry;
	}
		
		
	public void setQuantity(final long quantity)
	{
		this.quantity = quantity;
	}
	
		
	public long getQuantity() 
	{
		return quantity;
	}
		
		
	public void setQuantityAdded(final long quantityAdded)
	{
		this.quantityAdded = quantityAdded;
	}
	
		
	public long getQuantityAdded() 
	{
		return quantityAdded;
	}
		
		
	public void setDeliveryModeChanged(final Boolean deliveryModeChanged)
	{
		this.deliveryModeChanged = deliveryModeChanged;
	}
	
		
	public Boolean getDeliveryModeChanged() 
	{
		return deliveryModeChanged;
	}
		
	
}