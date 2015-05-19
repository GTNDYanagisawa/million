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
package de.hybris.platform.commercewebservicescommons.dto.order;

import de.hybris.platform.commercewebservicescommons.dto.product.PriceWsDTO;

public class DeliveryModeWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>DeliveryModeWsDTO.description</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String description;
	/** <i>Generated property</i> for <code>DeliveryModeWsDTO.name</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String name;
	/** <i>Generated property</i> for <code>DeliveryModeWsDTO.code</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String code;
	/** <i>Generated property</i> for <code>DeliveryModeWsDTO.deliveryCost</code> property defined at extension <code>commercewebservicescommons</code>. */
	private PriceWsDTO deliveryCost;
		
	public DeliveryModeWsDTO()
	{
		// default constructor
	}
	
		
	public void setDescription(final String description)
	{
		this.description = description;
	}
	
		
	public String getDescription() 
	{
		return description;
	}
		
		
	public void setName(final String name)
	{
		this.name = name;
	}
	
		
	public String getName() 
	{
		return name;
	}
		
		
	public void setCode(final String code)
	{
		this.code = code;
	}
	
		
	public String getCode() 
	{
		return code;
	}
		
		
	public void setDeliveryCost(final PriceWsDTO deliveryCost)
	{
		this.deliveryCost = deliveryCost;
	}
	
		
	public PriceWsDTO getDeliveryCost() 
	{
		return deliveryCost;
	}
		
	
}