/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2015/05/18 13:25:55                         ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2011 hybris AG
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *  
 */
package de.hybris.platform.acceleratorservices.model.email;

import de.hybris.platform.acceleratorservices.model.email.EmailMessageModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.List;

/**
 * Generated model class for type EmailAddress first defined at extension acceleratorservices.
 * <p>
 * Extending EmailAddress type with additional attributes.
 */
@SuppressWarnings("all")
public class EmailAddressModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "EmailAddress";
	
	/**<i>Generated relation code constant for relation <code>EmailMessage2ToAddressesRel</code> defining source attribute <code>toMessages</code> in extension <code>acceleratorservices</code>.</i>*/
	public final static String _EMAILMESSAGE2TOADDRESSESREL = "EmailMessage2ToAddressesRel";
	
	/**<i>Generated relation code constant for relation <code>EmailMessage2CcAddressesRel</code> defining source attribute <code>ccMessages</code> in extension <code>acceleratorservices</code>.</i>*/
	public final static String _EMAILMESSAGE2CCADDRESSESREL = "EmailMessage2CcAddressesRel";
	
	/**<i>Generated relation code constant for relation <code>EmailMessage2BccAddressesRel</code> defining source attribute <code>bccMessages</code> in extension <code>acceleratorservices</code>.</i>*/
	public final static String _EMAILMESSAGE2BCCADDRESSESREL = "EmailMessage2BccAddressesRel";
	
	/**<i>Generated relation code constant for relation <code>EmailMessage2FromAddressRel</code> defining source attribute <code>messagesSent</code> in extension <code>acceleratorservices</code>.</i>*/
	public final static String _EMAILMESSAGE2FROMADDRESSREL = "EmailMessage2FromAddressRel";
	
	/** <i>Generated constant</i> - Attribute key of <code>EmailAddress.emailAddress</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String EMAILADDRESS = "emailAddress";
	
	/** <i>Generated constant</i> - Attribute key of <code>EmailAddress.displayName</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String DISPLAYNAME = "displayName";
	
	/** <i>Generated constant</i> - Attribute key of <code>EmailAddress.toMessages</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String TOMESSAGES = "toMessages";
	
	/** <i>Generated constant</i> - Attribute key of <code>EmailAddress.ccMessages</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String CCMESSAGES = "ccMessages";
	
	/** <i>Generated constant</i> - Attribute key of <code>EmailAddress.bccMessages</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String BCCMESSAGES = "bccMessages";
	
	/** <i>Generated constant</i> - Attribute key of <code>EmailAddress.messagesSent</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String MESSAGESSENT = "messagesSent";
	
	
	/** <i>Generated variable</i> - Variable of <code>EmailAddress.emailAddress</code> attribute defined at extension <code>acceleratorservices</code>. */
	private String _emailAddress;
	
	/** <i>Generated variable</i> - Variable of <code>EmailAddress.displayName</code> attribute defined at extension <code>acceleratorservices</code>. */
	private String _displayName;
	
	/** <i>Generated variable</i> - Variable of <code>EmailAddress.toMessages</code> attribute defined at extension <code>acceleratorservices</code>. */
	private List<EmailMessageModel> _toMessages;
	
	/** <i>Generated variable</i> - Variable of <code>EmailAddress.ccMessages</code> attribute defined at extension <code>acceleratorservices</code>. */
	private List<EmailMessageModel> _ccMessages;
	
	/** <i>Generated variable</i> - Variable of <code>EmailAddress.bccMessages</code> attribute defined at extension <code>acceleratorservices</code>. */
	private List<EmailMessageModel> _bccMessages;
	
	/** <i>Generated variable</i> - Variable of <code>EmailAddress.messagesSent</code> attribute defined at extension <code>acceleratorservices</code>. */
	private List<EmailMessageModel> _messagesSent;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public EmailAddressModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public EmailAddressModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _displayName initial attribute declared by type <code>EmailAddress</code> at extension <code>acceleratorservices</code>
	 * @param _emailAddress initial attribute declared by type <code>EmailAddress</code> at extension <code>acceleratorservices</code>
	 */
	@Deprecated
	public EmailAddressModel(final String _displayName, final String _emailAddress)
	{
		super();
		setDisplayName(_displayName);
		setEmailAddress(_emailAddress);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _displayName initial attribute declared by type <code>EmailAddress</code> at extension <code>acceleratorservices</code>
	 * @param _emailAddress initial attribute declared by type <code>EmailAddress</code> at extension <code>acceleratorservices</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public EmailAddressModel(final String _displayName, final String _emailAddress, final ItemModel _owner)
	{
		super();
		setDisplayName(_displayName);
		setEmailAddress(_emailAddress);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAddress.bccMessages</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the bccMessages
	 */
	public List<EmailMessageModel> getBccMessages()
	{
		if (this._bccMessages!=null)
		{
			return _bccMessages;
		}
		return _bccMessages = getPersistenceContext().getValue(BCCMESSAGES, _bccMessages);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAddress.ccMessages</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the ccMessages
	 */
	public List<EmailMessageModel> getCcMessages()
	{
		if (this._ccMessages!=null)
		{
			return _ccMessages;
		}
		return _ccMessages = getPersistenceContext().getValue(CCMESSAGES, _ccMessages);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAddress.displayName</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the displayName - Display name displayed for given item.
	 */
	public String getDisplayName()
	{
		if (this._displayName!=null)
		{
			return _displayName;
		}
		return _displayName = getPersistenceContext().getValue(DISPLAYNAME, _displayName);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAddress.emailAddress</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the emailAddress - Email address of the given item.
	 */
	public String getEmailAddress()
	{
		if (this._emailAddress!=null)
		{
			return _emailAddress;
		}
		return _emailAddress = getPersistenceContext().getValue(EMAILADDRESS, _emailAddress);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAddress.messagesSent</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the messagesSent
	 */
	public List<EmailMessageModel> getMessagesSent()
	{
		if (this._messagesSent!=null)
		{
			return _messagesSent;
		}
		return _messagesSent = getPersistenceContext().getValue(MESSAGESSENT, _messagesSent);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAddress.toMessages</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the toMessages
	 */
	public List<EmailMessageModel> getToMessages()
	{
		if (this._toMessages!=null)
		{
			return _toMessages;
		}
		return _toMessages = getPersistenceContext().getValue(TOMESSAGES, _toMessages);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>EmailAddress.bccMessages</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the bccMessages
	 */
	public void setBccMessages(final List<EmailMessageModel> value)
	{
		_bccMessages = getPersistenceContext().setValue(BCCMESSAGES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>EmailAddress.ccMessages</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the ccMessages
	 */
	public void setCcMessages(final List<EmailMessageModel> value)
	{
		_ccMessages = getPersistenceContext().setValue(CCMESSAGES, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>EmailAddress.displayName</code> attribute defined at extension <code>acceleratorservices</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the displayName - Display name displayed for given item.
	 */
	public void setDisplayName(final String value)
	{
		_displayName = getPersistenceContext().setValue(DISPLAYNAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>EmailAddress.emailAddress</code> attribute defined at extension <code>acceleratorservices</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the emailAddress - Email address of the given item.
	 */
	public void setEmailAddress(final String value)
	{
		_emailAddress = getPersistenceContext().setValue(EMAILADDRESS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>EmailAddress.messagesSent</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the messagesSent
	 */
	public void setMessagesSent(final List<EmailMessageModel> value)
	{
		_messagesSent = getPersistenceContext().setValue(MESSAGESSENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>EmailAddress.toMessages</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the toMessages
	 */
	public void setToMessages(final List<EmailMessageModel> value)
	{
		_toMessages = getPersistenceContext().setValue(TOMESSAGES, value);
	}
	
}
