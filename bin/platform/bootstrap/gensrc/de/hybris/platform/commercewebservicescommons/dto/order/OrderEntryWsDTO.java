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

import de.hybris.platform.commercewebservicescommons.dto.order.DeliveryModeWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.product.PriceWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.product.ProductWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.store.PointOfServiceWsDTO;

public class OrderEntryWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>OrderEntryWsDTO.product</code> property defined at extension <code>commercewebservicescommons</code>. */
	private ProductWsDTO product;
	/** <i>Generated property</i> for <code>OrderEntryWsDTO.deliveryPointOfService</code> property defined at extension <code>commercewebservicescommons</code>. */
	private PointOfServiceWsDTO deliveryPointOfService;
	/** <i>Generated property</i> for <code>OrderEntryWsDTO.entryNumber</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Integer entryNumber;
	/** <i>Generated property</i> for <code>OrderEntryWsDTO.updateable</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Boolean updateable;
	/** <i>Generated property</i> for <code>OrderEntryWsDTO.deliveryMode</code> property defined at extension <code>commercewebservicescommons</code>. */
	private DeliveryModeWsDTO deliveryMode;
	/** <i>Generated property</i> for <code>OrderEntryWsDTO.quantity</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Long quantity;
	/** <i>Generated property</i> for <code>OrderEntryWsDTO.basePrice</code> property defined at extension <code>commercewebservicescommons</code>. */
	private PriceWsDTO basePrice;
	/** <i>Generated property</i> for <code>OrderEntryWsDTO.totalPrice</code> property defined at extension <code>commercewebservicescommons</code>. */
	private PriceWsDTO totalPrice;
		
	public OrderEntryWsDTO()
	{
		// default constructor
	}
	
		
	public void setProduct(final ProductWsDTO product)
	{
		this.product = product;
	}
	
		
	public ProductWsDTO getProduct() 
	{
		return product;
	}
		
		
	public void setDeliveryPointOfService(final PointOfServiceWsDTO deliveryPointOfService)
	{
		this.deliveryPointOfService = deliveryPointOfService;
	}
	
		
	public PointOfServiceWsDTO getDeliveryPointOfService() 
	{
		return deliveryPointOfService;
	}
		
		
	public void setEntryNumber(final Integer entryNumber)
	{
		this.entryNumber = entryNumber;
	}
	
		
	public Integer getEntryNumber() 
	{
		return entryNumber;
	}
		
		
	public void setUpdateable(final Boolean updateable)
	{
		this.updateable = updateable;
	}
	
		
	public Boolean getUpdateable() 
	{
		return updateable;
	}
		
		
	public void setDeliveryMode(final DeliveryModeWsDTO deliveryMode)
	{
		this.deliveryMode = deliveryMode;
	}
	
		
	public DeliveryModeWsDTO getDeliveryMode() 
	{
		return deliveryMode;
	}
		
		
	public void setQuantity(final Long quantity)
	{
		this.quantity = quantity;
	}
	
		
	public Long getQuantity() 
	{
		return quantity;
	}
		
		
	public void setBasePrice(final PriceWsDTO basePrice)
	{
		this.basePrice = basePrice;
	}
	
		
	public PriceWsDTO getBasePrice() 
	{
		return basePrice;
	}
		
		
	public void setTotalPrice(final PriceWsDTO totalPrice)
	{
		this.totalPrice = totalPrice;
	}
	
		
	public PriceWsDTO getTotalPrice() 
	{
		return totalPrice;
	}
		
	
}