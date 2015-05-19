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
package de.hybris.platform.acceleratorservices.payment.data;

import java.math.BigDecimal;

public class SignatureData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>SignatureData.amount</code> property defined at extension <code>acceleratorservices</code>. */
	private BigDecimal amount;
	/** <i>Generated property</i> for <code>SignatureData.orderPageSerialNumber</code> property defined at extension <code>acceleratorservices</code>. */
	private String orderPageSerialNumber;
	/** <i>Generated property</i> for <code>SignatureData.orderPageVersion</code> property defined at extension <code>acceleratorservices</code>. */
	private String orderPageVersion;
	/** <i>Generated property</i> for <code>SignatureData.merchantID</code> property defined at extension <code>acceleratorservices</code>. */
	private String merchantID;
	/** <i>Generated property</i> for <code>SignatureData.transactionSignature</code> property defined at extension <code>acceleratorservices</code>. */
	private String transactionSignature;
	/** <i>Generated property</i> for <code>SignatureData.currencyPublicSignature</code> property defined at extension <code>acceleratorservices</code>. */
	private String currencyPublicSignature;
	/** <i>Generated property</i> for <code>SignatureData.signedFields</code> property defined at extension <code>acceleratorservices</code>. */
	private String signedFields;
	/** <i>Generated property</i> for <code>SignatureData.amountPublicSignature</code> property defined at extension <code>acceleratorservices</code>. */
	private String amountPublicSignature;
	/** <i>Generated property</i> for <code>SignatureData.sharedSecret</code> property defined at extension <code>acceleratorservices</code>. */
	private String sharedSecret;
	/** <i>Generated property</i> for <code>SignatureData.currency</code> property defined at extension <code>acceleratorservices</code>. */
	private String currency;
		
	public SignatureData()
	{
		// default constructor
	}
	
		
	public void setAmount(final BigDecimal amount)
	{
		this.amount = amount;
	}
	
		
	public BigDecimal getAmount() 
	{
		return amount;
	}
		
		
	public void setOrderPageSerialNumber(final String orderPageSerialNumber)
	{
		this.orderPageSerialNumber = orderPageSerialNumber;
	}
	
		
	public String getOrderPageSerialNumber() 
	{
		return orderPageSerialNumber;
	}
		
		
	public void setOrderPageVersion(final String orderPageVersion)
	{
		this.orderPageVersion = orderPageVersion;
	}
	
		
	public String getOrderPageVersion() 
	{
		return orderPageVersion;
	}
		
		
	public void setMerchantID(final String merchantID)
	{
		this.merchantID = merchantID;
	}
	
		
	public String getMerchantID() 
	{
		return merchantID;
	}
		
		
	public void setTransactionSignature(final String transactionSignature)
	{
		this.transactionSignature = transactionSignature;
	}
	
		
	public String getTransactionSignature() 
	{
		return transactionSignature;
	}
		
		
	public void setCurrencyPublicSignature(final String currencyPublicSignature)
	{
		this.currencyPublicSignature = currencyPublicSignature;
	}
	
		
	public String getCurrencyPublicSignature() 
	{
		return currencyPublicSignature;
	}
		
		
	public void setSignedFields(final String signedFields)
	{
		this.signedFields = signedFields;
	}
	
		
	public String getSignedFields() 
	{
		return signedFields;
	}
		
		
	public void setAmountPublicSignature(final String amountPublicSignature)
	{
		this.amountPublicSignature = amountPublicSignature;
	}
	
		
	public String getAmountPublicSignature() 
	{
		return amountPublicSignature;
	}
		
		
	public void setSharedSecret(final String sharedSecret)
	{
		this.sharedSecret = sharedSecret;
	}
	
		
	public String getSharedSecret() 
	{
		return sharedSecret;
	}
		
		
	public void setCurrency(final String currency)
	{
		this.currency = currency;
	}
	
		
	public String getCurrency() 
	{
		return currency;
	}
		
	
}