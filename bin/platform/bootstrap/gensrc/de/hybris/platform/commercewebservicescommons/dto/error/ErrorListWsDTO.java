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
package de.hybris.platform.commercewebservicescommons.dto.error;

import de.hybris.platform.commercewebservicescommons.dto.error.ErrorWsDTO;
import java.util.List;

/**
 * List of errors
 */
public class ErrorListWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>ErrorListWsDTO.errors</code> property defined at extension <code>commercewebservicescommons</code>. */
	private List<ErrorWsDTO> errors;
		
	public ErrorListWsDTO()
	{
		// default constructor
	}
	
		
	public void setErrors(final List<ErrorWsDTO> errors)
	{
		this.errors = errors;
	}
	
		
	public List<ErrorWsDTO> getErrors() 
	{
		return errors;
	}
		
	
}