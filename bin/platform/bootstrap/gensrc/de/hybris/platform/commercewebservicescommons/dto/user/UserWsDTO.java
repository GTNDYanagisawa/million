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
package de.hybris.platform.commercewebservicescommons.dto.user;

import de.hybris.platform.commercewebservicescommons.dto.storesession.CurrencyWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.storesession.LanguageWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.user.AddressWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.user.PrincipalWsDTO;

public class UserWsDTO extends PrincipalWsDTO 
{

	/** <i>Generated property</i> for <code>UserWsDTO.lastName</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String lastName;
	/** <i>Generated property</i> for <code>UserWsDTO.title</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String title;
	/** <i>Generated property</i> for <code>UserWsDTO.titleCode</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String titleCode;
	/** <i>Generated property</i> for <code>UserWsDTO.displayUid</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String displayUid;
	/** <i>Generated property</i> for <code>UserWsDTO.defaultAddress</code> property defined at extension <code>commercewebservicescommons</code>. */
	private AddressWsDTO defaultAddress;
	/** <i>Generated property</i> for <code>UserWsDTO.language</code> property defined at extension <code>commercewebservicescommons</code>. */
	private LanguageWsDTO language;
	/** <i>Generated property</i> for <code>UserWsDTO.firstName</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String firstName;
	/** <i>Generated property</i> for <code>UserWsDTO.currency</code> property defined at extension <code>commercewebservicescommons</code>. */
	private CurrencyWsDTO currency;
		
	public UserWsDTO()
	{
		// default constructor
	}
	
		
	public void setLastName(final String lastName)
	{
		this.lastName = lastName;
	}
	
		
	public String getLastName() 
	{
		return lastName;
	}
		
		
	public void setTitle(final String title)
	{
		this.title = title;
	}
	
		
	public String getTitle() 
	{
		return title;
	}
		
		
	public void setTitleCode(final String titleCode)
	{
		this.titleCode = titleCode;
	}
	
		
	public String getTitleCode() 
	{
		return titleCode;
	}
		
		
	public void setDisplayUid(final String displayUid)
	{
		this.displayUid = displayUid;
	}
	
		
	public String getDisplayUid() 
	{
		return displayUid;
	}
		
		
	public void setDefaultAddress(final AddressWsDTO defaultAddress)
	{
		this.defaultAddress = defaultAddress;
	}
	
		
	public AddressWsDTO getDefaultAddress() 
	{
		return defaultAddress;
	}
		
		
	public void setLanguage(final LanguageWsDTO language)
	{
		this.language = language;
	}
	
		
	public LanguageWsDTO getLanguage() 
	{
		return language;
	}
		
		
	public void setFirstName(final String firstName)
	{
		this.firstName = firstName;
	}
	
		
	public String getFirstName() 
	{
		return firstName;
	}
		
		
	public void setCurrency(final CurrencyWsDTO currency)
	{
		this.currency = currency;
	}
	
		
	public CurrencyWsDTO getCurrency() 
	{
		return currency;
	}
		
	
}