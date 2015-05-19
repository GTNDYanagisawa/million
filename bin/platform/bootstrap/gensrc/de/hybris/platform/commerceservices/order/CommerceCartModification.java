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
package de.hybris.platform.commerceservices.order;

import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.product.ProductModel;

/**
 * Represents the result of a modification to a cart entry.
 */
public class CommerceCartModification  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>CommerceCartModification.product</code> property defined at extension <code>commerceservices</code>. */
	private ProductModel product;
	/** <i>Generated property</i> for <code>CommerceCartModification.statusCode</code> property defined at extension <code>commerceservices</code>. */
	private String statusCode;
	/** <i>Generated property</i> for <code>CommerceCartModification.entry</code> property defined at extension <code>commerceservices</code>. */
	private AbstractOrderEntryModel entry;
	/** <i>Generated property</i> for <code>CommerceCartModification.quantity</code> property defined at extension <code>commerceservices</code>. */
	private long quantity;
	/** <i>Generated property</i> for <code>CommerceCartModification.quantityAdded</code> property defined at extension <code>commerceservices</code>. */
	private long quantityAdded;
	/** <i>Generated property</i> for <code>CommerceCartModification.deliveryModeChanged</code> property defined at extension <code>commerceservices</code>. */
	private Boolean deliveryModeChanged;
		
	public CommerceCartModification()
	{
		// default constructor
	}
	
		
	public void setProduct(final ProductModel product)
	{
		this.product = product;
	}
	
		
	public ProductModel getProduct() 
	{
		return product;
	}
		
		
	public void setStatusCode(final String statusCode)
	{
		this.statusCode = statusCode;
	}
	
		
	public String getStatusCode() 
	{
		return statusCode;
	}
		
		
	public void setEntry(final AbstractOrderEntryModel entry)
	{
		this.entry = entry;
	}
	
		
	public AbstractOrderEntryModel getEntry() 
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