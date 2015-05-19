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

import de.hybris.platform.commercewebservicescommons.dto.order.CartWsDTO;
import java.util.List;

public class CartListWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>CartListWsDTO.carts</code> property defined at extension <code>commercewebservicescommons</code>. */
	private List<CartWsDTO> carts;
		
	public CartListWsDTO()
	{
		// default constructor
	}
	
		
	public void setCarts(final List<CartWsDTO> carts)
	{
		this.carts = carts;
	}
	
		
	public List<CartWsDTO> getCarts() 
	{
		return carts;
	}
		
	
}