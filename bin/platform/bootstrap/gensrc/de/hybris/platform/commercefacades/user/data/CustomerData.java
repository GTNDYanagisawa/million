/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 2015/05/18 13:25:58
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
package de.hybris.platform.commercefacades.user.data;

import de.hybris.platform.commercefacades.storesession.data.CurrencyData;
import de.hybris.platform.commercefacades.storesession.data.LanguageData;
import de.hybris.platform.commercefacades.user.data.AddressData;
import de.hybris.platform.commercefacades.user.data.PrincipalData;

public class CustomerData extends PrincipalData 
{

	/** <i>Generated property</i> for <code>CustomerData.lastName</code> property defined at extension <code>commercefacades</code>. */
	private String lastName;
	/** <i>Generated property</i> for <code>CustomerData.title</code> property defined at extension <code>ycommercewebservices</code>. */
	private String title;
	/** <i>Generated property</i> for <code>CustomerData.titleCode</code> property defined at extension <code>commercefacades</code>. */
	private String titleCode;
	/** <i>Generated property</i> for <code>CustomerData.defaultBillingAddress</code> property defined at extension <code>commercefacades</code>. */
	private AddressData defaultBillingAddress;
	/** <i>Generated property</i> for <code>CustomerData.displayUid</code> property defined at extension <code>commercefacades</code>. */
	private String displayUid;
	/** <i>Generated property</i> for <code>CustomerData.defaultShippingAddress</code> property defined at extension <code>commercefacades</code>. */
	private AddressData defaultShippingAddress;
	/** <i>Generated property</i> for <code>CustomerData.language</code> property defined at extension <code>commercefacades</code>. */
	private LanguageData language;
	/** <i>Generated property</i> for <code>CustomerData.firstName</code> property defined at extension <code>commercefacades</code>. */
	private String firstName;
	/** <i>Generated property</i> for <code>CustomerData.currency</code> property defined at extension <code>commercefacades</code>. */
	private CurrencyData currency;
		
	public CustomerData()
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
		
		
	public void setDefaultBillingAddress(final AddressData defaultBillingAddress)
	{
		this.defaultBillingAddress = defaultBillingAddress;
	}
	
		
	public AddressData getDefaultBillingAddress() 
	{
		return defaultBillingAddress;
	}
		
		
	public void setDisplayUid(final String displayUid)
	{
		this.displayUid = displayUid;
	}
	
		
	public String getDisplayUid() 
	{
		return displayUid;
	}
		
		
	public void setDefaultShippingAddress(final AddressData defaultShippingAddress)
	{
		this.defaultShippingAddress = defaultShippingAddress;
	}
	
		
	public AddressData getDefaultShippingAddress() 
	{
		return defaultShippingAddress;
	}
		
		
	public void setLanguage(final LanguageData language)
	{
		this.language = language;
	}
	
		
	public LanguageData getLanguage() 
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
		
		
	public void setCurrency(final CurrencyData currency)
	{
		this.currency = currency;
	}
	
		
	public CurrencyData getCurrency() 
	{
		return currency;
	}
		
	
}