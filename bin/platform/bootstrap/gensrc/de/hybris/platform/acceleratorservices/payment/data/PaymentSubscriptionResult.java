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

import  de.hybris.platform.acceleratorservices.payment.data.PaymentErrorField;
import java.util.Map;

public class PaymentSubscriptionResult  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>PaymentSubscriptionResult.errors</code> property defined at extension <code>acceleratorservices</code>. */
	private Map<String,PaymentErrorField> errors;
	/** <i>Generated property</i> for <code>PaymentSubscriptionResult.resultCode</code> property defined at extension <code>acceleratorservices</code>. */
	private String resultCode;
	/** <i>Generated property</i> for <code>PaymentSubscriptionResult.decision</code> property defined at extension <code>acceleratorservices</code>. */
	private String decision;
	/** <i>Generated property</i> for <code>PaymentSubscriptionResult.success</code> property defined at extension <code>acceleratorservices</code>. */
	private boolean success;
		
	public PaymentSubscriptionResult()
	{
		// default constructor
	}
	
		
	public void setErrors(final Map<String,PaymentErrorField> errors)
	{
		this.errors = errors;
	}
	
		
	public Map<String,PaymentErrorField> getErrors() 
	{
		return errors;
	}
		
		
	public void setResultCode(final String resultCode)
	{
		this.resultCode = resultCode;
	}
	
		
	public String getResultCode() 
	{
		return resultCode;
	}
		
		
	public void setDecision(final String decision)
	{
		this.decision = decision;
	}
	
		
	public String getDecision() 
	{
		return decision;
	}
		
		
	public void setSuccess(final boolean success)
	{
		this.success = success;
	}
	
		
	public boolean isSuccess() 
	{
		return success;
	}
		
	
}