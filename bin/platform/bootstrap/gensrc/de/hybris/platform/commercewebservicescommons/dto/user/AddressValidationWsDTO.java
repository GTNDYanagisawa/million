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
package de.hybris.platform.commercewebservicescommons.dto.user;

import de.hybris.platform.commercewebservicescommons.dto.error.ErrorListWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.user.AddressWsDTO;
import java.util.List;

public class AddressValidationWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>AddressValidationWsDTO.errors</code> property defined at extension <code>commercewebservicescommons</code>. */
	private ErrorListWsDTO errors;
	/** <i>Generated property</i> for <code>AddressValidationWsDTO.suggestedAddresses</code> property defined at extension <code>commercewebservicescommons</code>. */
	private List<AddressWsDTO> suggestedAddresses;
	/** <i>Generated property</i> for <code>AddressValidationWsDTO.decision</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String decision;
		
	public AddressValidationWsDTO()
	{
		// default constructor
	}
	
		
	public void setErrors(final ErrorListWsDTO errors)
	{
		this.errors = errors;
	}
	
		
	public ErrorListWsDTO getErrors() 
	{
		return errors;
	}
		
		
	public void setSuggestedAddresses(final List<AddressWsDTO> suggestedAddresses)
	{
		this.suggestedAddresses = suggestedAddresses;
	}
	
		
	public List<AddressWsDTO> getSuggestedAddresses() 
	{
		return suggestedAddresses;
	}
		
		
	public void setDecision(final String decision)
	{
		this.decision = decision;
	}
	
		
	public String getDecision() 
	{
		return decision;
	}
		
	
}