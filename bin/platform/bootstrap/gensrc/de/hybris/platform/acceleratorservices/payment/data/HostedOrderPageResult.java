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

import java.util.Map;

public class HostedOrderPageResult  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>HostedOrderPageResult.errors</code> property defined at extension <code>acceleratorservices</code>. */
	private Map<Integer, String> errors;
	/** <i>Generated property</i> for <code>HostedOrderPageResult.requestId</code> property defined at extension <code>acceleratorservices</code>. */
	private String requestId;
	/** <i>Generated property</i> for <code>HostedOrderPageResult.reasonCode</code> property defined at extension <code>acceleratorservices</code>. */
	private Integer reasonCode;
		
	public HostedOrderPageResult()
	{
		// default constructor
	}
	
		
	public void setErrors(final Map<Integer, String> errors)
	{
		this.errors = errors;
	}
	
		
	public Map<Integer, String> getErrors() 
	{
		return errors;
	}
		
		
	public void setRequestId(final String requestId)
	{
		this.requestId = requestId;
	}
	
		
	public String getRequestId() 
	{
		return requestId;
	}
		
		
	public void setReasonCode(final Integer reasonCode)
	{
		this.reasonCode = reasonCode;
	}
	
		
	public Integer getReasonCode() 
	{
		return reasonCode;
	}
		
	
}