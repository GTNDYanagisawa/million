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
package de.hybris.platform.commerceservices.product.data;

public class ReferenceData<TYPE, TARGET>  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>ReferenceData<TYPE, TARGET>.referenceType</code> property defined at extension <code>commerceservices</code>. */
	private TYPE referenceType;
	/** <i>Generated property</i> for <code>ReferenceData<TYPE, TARGET>.description</code> property defined at extension <code>commerceservices</code>. */
	private String description;
	/** <i>Generated property</i> for <code>ReferenceData<TYPE, TARGET>.target</code> property defined at extension <code>commerceservices</code>. */
	private TARGET target;
	/** <i>Generated property</i> for <code>ReferenceData<TYPE, TARGET>.quantity</code> property defined at extension <code>commerceservices</code>. */
	private Integer quantity;
		
	public ReferenceData()
	{
		// default constructor
	}
	
		
	public void setReferenceType(final TYPE referenceType)
	{
		this.referenceType = referenceType;
	}
	
		
	public TYPE getReferenceType() 
	{
		return referenceType;
	}
		
		
	public void setDescription(final String description)
	{
		this.description = description;
	}
	
		
	public String getDescription() 
	{
		return description;
	}
		
		
	public void setTarget(final TARGET target)
	{
		this.target = target;
	}
	
		
	public TARGET getTarget() 
	{
		return target;
	}
		
		
	public void setQuantity(final Integer quantity)
	{
		this.quantity = quantity;
	}
	
		
	public Integer getQuantity() 
	{
		return quantity;
	}
		
	
}