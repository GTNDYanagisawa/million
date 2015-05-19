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
package de.hybris.platform.commercewebservicescommons.dto.queues;

import de.hybris.platform.commercewebservicescommons.dto.queues.ProductExpressUpdateElementWsDTO;
import java.util.List;

public class ProductExpressUpdateElementListWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>ProductExpressUpdateElementListWsDTO.productExpressUpdateElements</code> property defined at extension <code>commercewebservicescommons</code>. */
	private List<ProductExpressUpdateElementWsDTO> productExpressUpdateElements;
		
	public ProductExpressUpdateElementListWsDTO()
	{
		// default constructor
	}
	
		
	public void setProductExpressUpdateElements(final List<ProductExpressUpdateElementWsDTO> productExpressUpdateElements)
	{
		this.productExpressUpdateElements = productExpressUpdateElements;
	}
	
		
	public List<ProductExpressUpdateElementWsDTO> getProductExpressUpdateElements() 
	{
		return productExpressUpdateElements;
	}
		
	
}