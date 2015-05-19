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

public class PaymentData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>PaymentData.postUrl</code> property defined at extension <code>acceleratorservices</code>. */
	private String postUrl;
	/** <i>Generated property</i> for <code>PaymentData.parameters</code> property defined at extension <code>acceleratorservices</code>. */
	private Map<String, String> parameters;
		
	public PaymentData()
	{
		// default constructor
	}
	
		
	public void setPostUrl(final String postUrl)
	{
		this.postUrl = postUrl;
	}
	
		
	public String getPostUrl() 
	{
		return postUrl;
	}
		
		
	public void setParameters(final Map<String, String> parameters)
	{
		this.parameters = parameters;
	}
	
		
	public Map<String, String> getParameters() 
	{
		return parameters;
	}
		
	
}