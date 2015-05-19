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
package de.hybris.platform.acceleratorservices.payment.data;

import de.hybris.platform.acceleratorservices.payment.data.AbstractPaymentResult;

public class CreateSubscriptionResult extends AbstractPaymentResult 
{

	/** <i>Generated property</i> for <code>CreateSubscriptionResult.subscriptionInfoData</code> property defined at extension <code>acceleratorservices</code>. */
	private SubscriptionInfoData subscriptionInfoData;
	/** <i>Generated property</i> for <code>CreateSubscriptionResult.authReplyData</code> property defined at extension <code>acceleratorservices</code>. */
	private AuthReplyData authReplyData;
	/** <i>Generated property</i> for <code>CreateSubscriptionResult.signatureData</code> property defined at extension <code>acceleratorservices</code>. */
	private SignatureData signatureData;
	/** <i>Generated property</i> for <code>CreateSubscriptionResult.subscriptionSignatureData</code> property defined at extension <code>acceleratorservices</code>. */
	private SubscriptionSignatureData subscriptionSignatureData;
	/** <i>Generated property</i> for <code>CreateSubscriptionResult.customerInfoData</code> property defined at extension <code>acceleratorservices</code>. */
	private CustomerInfoData customerInfoData;
	/** <i>Generated property</i> for <code>CreateSubscriptionResult.orderInfoData</code> property defined at extension <code>acceleratorservices</code>. */
	private OrderInfoData orderInfoData;
	/** <i>Generated property</i> for <code>CreateSubscriptionResult.paymentInfoData</code> property defined at extension <code>acceleratorservices</code>. */
	private PaymentInfoData paymentInfoData;
		
	public CreateSubscriptionResult()
	{
		// default constructor
	}
	
		
	public void setSubscriptionInfoData(final SubscriptionInfoData subscriptionInfoData)
	{
		this.subscriptionInfoData = subscriptionInfoData;
	}
	
		
	public SubscriptionInfoData getSubscriptionInfoData() 
	{
		return subscriptionInfoData;
	}
		
		
	public void setAuthReplyData(final AuthReplyData authReplyData)
	{
		this.authReplyData = authReplyData;
	}
	
		
	public AuthReplyData getAuthReplyData() 
	{
		return authReplyData;
	}
		
		
	public void setSignatureData(final SignatureData signatureData)
	{
		this.signatureData = signatureData;
	}
	
		
	public SignatureData getSignatureData() 
	{
		return signatureData;
	}
		
		
	public void setSubscriptionSignatureData(final SubscriptionSignatureData subscriptionSignatureData)
	{
		this.subscriptionSignatureData = subscriptionSignatureData;
	}
	
		
	public SubscriptionSignatureData getSubscriptionSignatureData() 
	{
		return subscriptionSignatureData;
	}
		
		
	public void setCustomerInfoData(final CustomerInfoData customerInfoData)
	{
		this.customerInfoData = customerInfoData;
	}
	
		
	public CustomerInfoData getCustomerInfoData() 
	{
		return customerInfoData;
	}
		
		
	public void setOrderInfoData(final OrderInfoData orderInfoData)
	{
		this.orderInfoData = orderInfoData;
	}
	
		
	public OrderInfoData getOrderInfoData() 
	{
		return orderInfoData;
	}
		
		
	public void setPaymentInfoData(final PaymentInfoData paymentInfoData)
	{
		this.paymentInfoData = paymentInfoData;
	}
	
		
	public PaymentInfoData getPaymentInfoData() 
	{
		return paymentInfoData;
	}
		
	
}