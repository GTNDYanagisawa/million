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

import de.hybris.platform.commercefacades.user.data.CountryData;
import java.util.List;

public class CountryDataList  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>CountryDataList.countries</code> property defined at extension <code>ycommercewebservices</code>. */
	private List<CountryData> countries;
		
	public CountryDataList()
	{
		// default constructor
	}
	
		
	public void setCountries(final List<CountryData> countries)
	{
		this.countries = countries;
	}
	
		
	public List<CountryData> getCountries() 
	{
		return countries;
	}
		
	
}