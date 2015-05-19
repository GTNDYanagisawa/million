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
package de.hybris.platform.commercewebservicescommons.dto.store;

public class TimeWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>TimeWsDTO.minute</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Byte minute;
	/** <i>Generated property</i> for <code>TimeWsDTO.hour</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Byte hour;
	/** <i>Generated property</i> for <code>TimeWsDTO.formattedHour</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String formattedHour;
		
	public TimeWsDTO()
	{
		// default constructor
	}
	
		
	public void setMinute(final Byte minute)
	{
		this.minute = minute;
	}
	
		
	public Byte getMinute() 
	{
		return minute;
	}
		
		
	public void setHour(final Byte hour)
	{
		this.hour = hour;
	}
	
		
	public Byte getHour() 
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