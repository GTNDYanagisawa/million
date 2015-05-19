/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 2015/05/18 13:25:58
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
package de.hybris.platform.commercefacades.address.data;

import  de.hybris.platform.commercefacades.address.data.AddressVerificationErrorField;
import de.hybris.platform.commercefacades.user.data.AddressData;
import java.util.List;
import java.util.Map;

public class AddressVerificationResult<DECISION>  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>AddressVerificationResult<DECISION>.errors</code> property defined at extension <code>commercefacades</code>. */
	private Map<String,AddressVerificationErrorField> errors;
	/** <i>Generated property</i> for <code>AddressVerificationResult<DECISION>.suggestedAddresses</code> property defined at extension <code>commercefacades</code>. */
	private List<AddressData> suggestedAddresses;
	/** <i>Generated property</i> for <code>AddressVerificationResult<DECISION>.decision</code> property defined at extension <code>commercefacades</code>. */
	private DECISION decision;
		
	public AddressVerificationResult()
	{
		// default constructor
	}
	
		
	public void setErrors(final Map<String,AddressVerificationErrorField> errors)
	{
		this.errors = errors;
	}
	
		
	public Map<String,AddressVerificationErrorField> getErrors() 
	{
		return errors;
	}
		
		
	public void setSuggestedAddresses(final List<AddressData> suggestedAddresses)
	{
		this.suggestedAddresses = suggestedAddresses;
	}
	
		
	public List<AddressData> getSuggestedAddresses() 
	{
		return suggestedAddresses;
	}
		
		
	public void setDecision(final DECISION decision)
	{
		this.decision = decision;
	}
	
		
	public DECISION getDecision() 
	{
		return decision;
	}
		
	
}