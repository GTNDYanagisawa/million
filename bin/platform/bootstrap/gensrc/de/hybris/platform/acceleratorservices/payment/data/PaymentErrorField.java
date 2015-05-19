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

public class PaymentErrorField  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>PaymentErrorField.missing</code> property defined at extension <code>acceleratorservices</code>. */
	private boolean missing;
	/** <i>Generated property</i> for <code>PaymentErrorField.invalid</code> property defined at extension <code>acceleratorservices</code>. */
	private boolean invalid;
	/** <i>Generated property</i> for <code>PaymentErrorField.name</code> property defined at extension <code>acceleratorservices</code>. */
	private String name;
		
	public PaymentErrorField()
	{
		// default constructor
	}
	
		
	public void setMissing(final boolean missing)
	{
		this.missing = missing;
	}
	
		
	public boolean isMissing() 
	{
		return missing;
	}
		
		
	public void setInvalid(final boolean invalid)
	{
		this.invalid = invalid;
	}
	
		
	public boolean isInvalid() 
	{
		return invalid;
	}
		
		
	public void setName(final String name)
	{
		this.name = name;
	}
	
		
	public String getName() 
	{
		return name;
	}
		
	
}