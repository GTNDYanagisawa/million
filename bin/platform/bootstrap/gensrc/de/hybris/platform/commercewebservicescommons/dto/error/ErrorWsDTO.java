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
package de.hybris.platform.commercewebservicescommons.dto.error;

/**
 * Error message
 */
public class ErrorWsDTO  implements java.io.Serializable 
{

	/** Descriptive, human readable error message.<br/><br/><i>Generated property</i> for <code>ErrorWsDTO.message</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String message;
	/** Additional classification specific for each error type e.g. 'noStock'.<br/><br/><i>Generated property</i> for <code>ErrorWsDTO.reason</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String reason;
	/** Identifier of the related object e.g. '1'.<br/><br/><i>Generated property</i> for <code>ErrorWsDTO.subject</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String subject;
	/** Type of the object related to the error e.g. 'entry'.<br/><br/><i>Generated property</i> for <code>ErrorWsDTO.subjectType</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String subjectType;
	/** Type of the error e.g. 'LowStockError'.<br/><br/><i>Generated property</i> for <code>ErrorWsDTO.type</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String type;
		
	public ErrorWsDTO()
	{
		// default constructor
	}
	
		
	public void setMessage(final String message)
	{
		this.message = message;
	}
	
		
	public String getMessage() 
	{
		return message;
	}
		
		
	public void setReason(final String reason)
	{
		this.reason = reason;
	}
	
		
	public String getReason() 
	{
		return reason;
	}
		
		
	public void setSubject(final String subject)
	{
		this.subject = subject;
	}
	
		
	public String getSubject() 
	{
		return subject;
	}
		
		
	public void setSubjectType(final String subjectType)
	{
		this.subjectType = subjectType;
	}
	
		
	public String getSubjectType() 
	{
		return subjectType;
	}
		
		
	public void setType(final String type)
	{
		this.type = type;
	}
	
		
	public String getType() 
	{
		return type;
	}
		
	
}