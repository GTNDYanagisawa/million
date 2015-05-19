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
package de.hybris.platform.commerceservices.service.data;

import java.math.BigDecimal;

public class CommerceTaxEstimateResult  implements java.io.Serializable 
{

	/** the total tax<br/><br/><i>Generated property</i> for <code>CommerceTaxEstimateResult.tax</code> property defined at extension <code>commerceservices</code>. */
	private BigDecimal tax;
		
	public CommerceTaxEstimateResult()
	{
		// default constructor
	}
	
		
	public void setTax(final BigDecimal tax)
	{
		this.tax = tax;
	}
	
		
	public BigDecimal getTax() 
	{
		return tax;
	}
		
	
}