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
package de.hybris.platform.acceleratorservices.store.data;

import de.hybris.platform.commerceservices.store.data.GeoPoint;

public class UserLocationData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>UserLocationData.point</code> property defined at extension <code>acceleratorservices</code>. */
	private GeoPoint point;
	/** <i>Generated property</i> for <code>UserLocationData.searchTerm</code> property defined at extension <code>acceleratorservices</code>. */
	private String searchTerm;
		
	public UserLocationData()
	{
		// default constructor
	}
	
		
	public void setPoint(final GeoPoint point)
	{
		this.point = point;
	}
	
		
	public GeoPoint getPoint() 
	{
		return point;
	}
		
		
	public void setSearchTerm(final String searchTerm)
	{
		this.searchTerm = searchTerm;
	}
	
		
	public String getSearchTerm() 
	{
		return searchTerm;
	}
		
	
}