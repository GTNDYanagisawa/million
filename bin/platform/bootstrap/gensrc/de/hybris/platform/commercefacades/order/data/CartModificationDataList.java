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

import de.hybris.platform.commercefacades.order.data.CartModificationData;
import java.util.List;

public class CartModificationDataList  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>CartModificationDataList.cartModificationList</code> property defined at extension <code>ycommercewebservices</code>. */
	private List<CartModificationData> cartModificationList;
		
	public CartModificationDataList()
	{
		// default constructor
	}
	
		
	public void setCartModificationList(final List<CartModificationData> cartModificationList)
	{
		this.cartModificationList = cartModificationList;
	}
	
		
	public List<CartModificationData> getCartModificationList() 
	{
		return cartModificationList;
	}
		
	
}