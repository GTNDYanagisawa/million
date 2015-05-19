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
package de.hybris.platform.commercefacades.product.data;

import  de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.catalog.enums.ProductReferenceTypeEnum;
import de.hybris.platform.commerceservices.product.data.ReferenceData;

public class ProductReferenceData extends ReferenceData<ProductReferenceTypeEnum,ProductData> 
{

	/** <i>Generated property</i> for <code>ProductReferenceData.preselected</code> property defined at extension <code>commercefacades</code>. */
	private Boolean preselected;
		
	public ProductReferenceData()
	{
		// default constructor
	}
	
		
	public void setPreselected(final Boolean preselected)
	{
		this.preselected = preselected;
	}
	
		
	public Boolean getPreselected() 
	{
		return preselected;
	}
		
	
}