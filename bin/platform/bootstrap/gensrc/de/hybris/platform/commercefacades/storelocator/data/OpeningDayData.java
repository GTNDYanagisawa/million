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
package de.hybris.platform.commercefacades.storelocator.data;

import de.hybris.platform.commercefacades.storelocator.data.TimeData;

public class OpeningDayData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>OpeningDayData.closingTime</code> property defined at extension <code>commercefacades</code>. */
	private TimeData closingTime;
	/** <i>Generated property</i> for <code>OpeningDayData.openingTime</code> property defined at extension <code>commercefacades</code>. */
	private TimeData openingTime;
		
	public OpeningDayData()
	{
		// default constructor
	}
	
		
	public void setClosingTime(final TimeData closingTime)
	{
		this.closingTime = closingTime;
	}
	
		
	public TimeData getClosingTime() 
	{
		return closingTime;
	}
		
		
	public void setOpeningTime(final TimeData openingTime)
	{
		this.openingTime = openingTime;
	}
	
		
	public TimeData getOpeningTime() 
	{
		return openingTime;
	}
		
	
}