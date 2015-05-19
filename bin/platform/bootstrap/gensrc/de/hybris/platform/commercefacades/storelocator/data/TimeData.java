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

public class TimeData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>TimeData.minute</code> property defined at extension <code>commercefacades</code>. */
	private byte minute;
	/** <i>Generated property</i> for <code>TimeData.hour</code> property defined at extension <code>commercefacades</code>. */
	private byte hour;
	/** <i>Generated property</i> for <code>TimeData.formattedHour</code> property defined at extension <code>commercefacades</code>. */
	private String formattedHour;
		
	public TimeData()
	{
		// default constructor
	}
	
		
	public void setMinute(final byte minute)
	{
		this.minute = minute;
	}
	
		
	public byte getMinute() 
	{
		return minute;
	}
		
		
	public void setHour(final byte hour)
	{
		this.hour = hour;
	}
	
		
	public byte getHour() 
	{
		return hour;
	}
		
		
	public void setFormattedHour(final String formattedHour)
	{
		this.formattedHour = formattedHour;
	}
	
		
	public String getFormattedHour() 
	{
		return formattedHour;
	}
		
	
}