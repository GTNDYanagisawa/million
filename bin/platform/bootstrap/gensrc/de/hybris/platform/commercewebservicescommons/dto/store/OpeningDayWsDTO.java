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

import de.hybris.platform.commercewebservicescommons.dto.store.TimeWsDTO;

public class OpeningDayWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>OpeningDayWsDTO.closingTime</code> property defined at extension <code>commercewebservicescommons</code>. */
	private TimeWsDTO closingTime;
	/** <i>Generated property</i> for <code>OpeningDayWsDTO.openingTime</code> property defined at extension <code>commercewebservicescommons</code>. */
	private TimeWsDTO openingTime;
		
	public OpeningDayWsDTO()
	{
		// default constructor
	}
	
		
	public void setClosingTime(final TimeWsDTO closingTime)
	{
		this.closingTime = closingTime;
	}
	
		
	public TimeWsDTO getClosingTime() 
	{
		return closingTime;
	}
		
		
	public void setOpeningTime(final TimeWsDTO openingTime)
	{
		this.openingTime = openingTime;
	}
	
		
	public TimeWsDTO getOpeningTime() 
	{
		return openingTime;
	}
		
	
}