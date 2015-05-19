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
package de.hybris.platform.ycommercewebservices.user.data;

import de.hybris.platform.commercefacades.user.data.AddressData;
import java.util.List;

public class AddressDataList  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>AddressDataList.addresses</code> property defined at extension <code>ycommercewebservices</code>. */
	private List<AddressData> addresses;
		
	public AddressDataList()
	{
		// default constructor
	}
	
		
	public void setAddresses(final List<AddressData> addresses)
	{
		this.addresses = addresses;
	}
	
		
	public List<AddressData> getAddresses() 
	{
		return addresses;
	}
		
	
}