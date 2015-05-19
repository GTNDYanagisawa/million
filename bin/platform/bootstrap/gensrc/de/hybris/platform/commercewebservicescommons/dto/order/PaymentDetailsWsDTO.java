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
package de.hybris.platform.commercewebservicescommons.dto.order;

import de.hybris.platform.commercewebservicescommons.dto.order.CardTypeWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.user.AddressWsDTO;

public class PaymentDetailsWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>PaymentDetailsWsDTO.expiryYear</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String expiryYear;
	/** <i>Generated property</i> for <code>PaymentDetailsWsDTO.id</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String id;
	/** <i>Generated property</i> for <code>PaymentDetailsWsDTO.issueNumber</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String issueNumber;
	/** <i>Generated property</i> for <code>PaymentDetailsWsDTO.startYear</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String startYear;
	/** <i>Generated property</i> for <code>PaymentDetailsWsDTO.expiryMonth</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String expiryMonth;
	/** <i>Generated property</i> for <code>PaymentDetailsWsDTO.saved</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Boolean saved;
	/** <i>Generated property</i> for <code>PaymentDetailsWsDTO.billingAddress</code> property defined at extension <code>commercewebservicescommons</code>. */
	private AddressWsDTO billingAddress;
	/** <i>Generated property</i> for <code>PaymentDetailsWsDTO.startMonth</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String startMonth;
	/** <i>Generated property</i> for <code>PaymentDetailsWsDTO.cardType</code> property defined at extension <code>commercewebservicescommons</code>. */
	private CardTypeWsDTO cardType;
	/** <i>Generated property</i> for <code>PaymentDetailsWsDTO.subscriptionId</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String subscriptionId;
	/** <i>Generated property</i> for <code>PaymentDetailsWsDTO.defaultPayment</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Boolean defaultPayment;
	/** <i>Generated property</i> for <code>PaymentDetailsWsDTO.cardNumber</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String cardNumber;
	/** <i>Generated property</i> for <code>PaymentDetailsWsDTO.accountHolderName</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String accountHolderName;
		
	public PaymentDetailsWsDTO()
	{
		// default constructor
	}
	
		
	public void setExpiryYear(final String expiryYear)
	{
		this.expiryYear = expiryYear;
	}
	
		
	public String getExpiryYear() 
	{
		return expiryYear;
	}
		
		
	public void setId(final String id)
	{
		this.id = id;
	}
	
		
	public String getId() 
	{
		return id;
	}
		
		
	public void setIssueNumber(final String issueNumber)
	{
		this.issueNumber = issueNumber;
	}
	
		
	public String getIssueNumber() 
	{
		return issueNumber;
	}
		
		
	public void setStartYear(final String startYear)
	{
		this.startYear = startYear;
	}
	
		
	public String getStartYear() 
	{
		return startYear;
	}
		
		
	public void setExpiryMonth(final String expiryMonth)
	{
		this.expiryMonth = expiryMonth;
	}
	
		
	public String getExpiryMonth() 
	{
		return expiryMonth;
	}
		
		
	public void setSaved(final Boolean saved)
	{
		this.saved = saved;
	}
	
		
	public Boolean getSaved() 
	{
		return saved;
	}
		
		
	public void setBillingAddress(final AddressWsDTO billingAddress)
	{
		this.billingAddress = billingAddress;
	}
	
		
	public AddressWsDTO getBillingAddress() 
	{
		return billingAddress;
	}
		
		
	public void setStartMonth(final String startMonth)
	{
		this.startMonth = startMonth;
	}
	
		
	public String getStartMonth() 
	{
		return startMonth;
	}
		
		
	public void setCardType(final CardTypeWsDTO cardType)
	{
		this.cardType = cardType;
	}
	
		
	public CardTypeWsDTO getCardType() 
	{
		return cardType;
	}
		
		
	public void setSubscriptionId(final String subscriptionId)
	{
		this.subscriptionId = subscriptionId;
	}
	
		
	public String getSubscriptionId() 
	{
		return subscriptionId;
	}
		
		
	public void setDefaultPayment(final Boolean defaultPayment)
	{
		this.defaultPayment = defaultPayment;
	}
	
		
	public Boolean getDefaultPayment() 
	{
		return defaultPayment;
	}
		
		
	public void setCardNumber(final String cardNumber)
	{
		this.cardNumber = cardNumber;
	}
	
		
	public String getCardNumber() 
	{
		return cardNumber;
	}
		
		
	public void setAccountHolderName(final String accountHolderName)
	{
		this.accountHolderName = accountHolderName;
	}
	
		
	public String getAccountHolderName() 
	{
		return accountHolderName;
	}
		
	
}