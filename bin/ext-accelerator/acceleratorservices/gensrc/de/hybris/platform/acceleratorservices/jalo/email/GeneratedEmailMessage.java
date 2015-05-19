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
package de.hybris.platform.acceleratorservices.jalo.email;

import de.hybris.platform.acceleratorservices.constants.AcceleratorServicesConstants;
import de.hybris.platform.acceleratorservices.jalo.email.EmailAddress;
import de.hybris.platform.acceleratorservices.jalo.email.EmailAttachment;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.processengine.jalo.BusinessProcess;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.PartOfHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.acceleratorservices.jalo.email.EmailMessage EmailMessage}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEmailMessage extends GenericItem
{
	/** Qualifier of the <code>EmailMessage.sent</code> attribute **/
	public static final String SENT = "sent";
	/** Qualifier of the <code>EmailMessage.replyToAddress</code> attribute **/
	public static final String REPLYTOADDRESS = "replyToAddress";
	/** Qualifier of the <code>EmailMessage.subject</code> attribute **/
	public static final String SUBJECT = "subject";
	/** Qualifier of the <code>EmailMessage.body</code> attribute **/
	public static final String BODY = "body";
	/** Qualifier of the <code>EmailMessage.bodyMedia</code> attribute **/
	public static final String BODYMEDIA = "bodyMedia";
	/** Qualifier of the <code>EmailMessage.sentDate</code> attribute **/
	public static final String SENTDATE = "sentDate";
	/** Qualifier of the <code>EmailMessage.sentMessageID</code> attribute **/
	public static final String SENTMESSAGEID = "sentMessageID";
	/** Qualifier of the <code>EmailMessage.toAddresses</code> attribute **/
	public static final String TOADDRESSES = "toAddresses";
	/** Relation ordering override parameter constants for EmailMessage2ToAddressesRel from ((acceleratorservices))*/
	protected static String EMAILMESSAGE2TOADDRESSESREL_SRC_ORDERED = "relation.EmailMessage2ToAddressesRel.source.ordered";
	protected static String EMAILMESSAGE2TOADDRESSESREL_TGT_ORDERED = "relation.EmailMessage2ToAddressesRel.target.ordered";
	/** Relation disable markmodifed parameter constants for EmailMessage2ToAddressesRel from ((acceleratorservices))*/
	protected static String EMAILMESSAGE2TOADDRESSESREL_MARKMODIFIED = "relation.EmailMessage2ToAddressesRel.markmodified";
	/** Qualifier of the <code>EmailMessage.ccAddresses</code> attribute **/
	public static final String CCADDRESSES = "ccAddresses";
	/** Relation ordering override parameter constants for EmailMessage2CcAddressesRel from ((acceleratorservices))*/
	protected static String EMAILMESSAGE2CCADDRESSESREL_SRC_ORDERED = "relation.EmailMessage2CcAddressesRel.source.ordered";
	protected static String EMAILMESSAGE2CCADDRESSESREL_TGT_ORDERED = "relation.EmailMessage2CcAddressesRel.target.ordered";
	/** Relation disable markmodifed parameter constants for EmailMessage2CcAddressesRel from ((acceleratorservices))*/
	protected static String EMAILMESSAGE2CCADDRESSESREL_MARKMODIFIED = "relation.EmailMessage2CcAddressesRel.markmodified";
	/** Qualifier of the <code>EmailMessage.bccAddresses</code> attribute **/
	public static final String BCCADDRESSES = "bccAddresses";
	/** Relation ordering override parameter constants for EmailMessage2BccAddressesRel from ((acceleratorservices))*/
	protected static String EMAILMESSAGE2BCCADDRESSESREL_SRC_ORDERED = "relation.EmailMessage2BccAddressesRel.source.ordered";
	protected static String EMAILMESSAGE2BCCADDRESSESREL_TGT_ORDERED = "relation.EmailMessage2BccAddressesRel.target.ordered";
	/** Relation disable markmodifed parameter constants for EmailMessage2BccAddressesRel from ((acceleratorservices))*/
	protected static String EMAILMESSAGE2BCCADDRESSESREL_MARKMODIFIED = "relation.EmailMessage2BccAddressesRel.markmodified";
	/** Qualifier of the <code>EmailMessage.fromAddress</code> attribute **/
	public static final String FROMADDRESS = "fromAddress";
	/** Qualifier of the <code>EmailMessage.attachments</code> attribute **/
	public static final String ATTACHMENTS = "attachments";
	/** Qualifier of the <code>EmailMessage.process</code> attribute **/
	public static final String PROCESS = "process";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n FROMADDRESS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedEmailMessage> FROMADDRESSHANDLER = new BidirectionalOneToManyHandler<GeneratedEmailMessage>(
	AcceleratorServicesConstants.TC.EMAILMESSAGE,
	false,
	"fromAddress",
	null,
	false,
	true,
	CollectionType.LIST
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ATTACHMENTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<EmailAttachment> ATTACHMENTSHANDLER = new OneToManyHandler<EmailAttachment>(
	AcceleratorServicesConstants.TC.EMAILATTACHMENT,
	true,
	"message",
	null,
	false,
	true,
	CollectionType.LIST
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PROCESS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedEmailMessage> PROCESSHANDLER = new BidirectionalOneToManyHandler<GeneratedEmailMessage>(
	AcceleratorServicesConstants.TC.EMAILMESSAGE,
	false,
	"process",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SENT, AttributeMode.INITIAL);
		tmp.put(REPLYTOADDRESS, AttributeMode.INITIAL);
		tmp.put(SUBJECT, AttributeMode.INITIAL);
		tmp.put(BODY, AttributeMode.INITIAL);
		tmp.put(BODYMEDIA, AttributeMode.INITIAL);
		tmp.put(SENTDATE, AttributeMode.INITIAL);
		tmp.put(SENTMESSAGEID, AttributeMode.INITIAL);
		tmp.put(FROMADDRESS, AttributeMode.INITIAL);
		tmp.put(PROCESS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.attachments</code> attribute.
	 * @return the attachments
	 */
	public List<EmailAttachment> getAttachments(final SessionContext ctx)
	{
		return (List<EmailAttachment>)ATTACHMENTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.attachments</code> attribute.
	 * @return the attachments
	 */
	public List<EmailAttachment> getAttachments()
	{
		return getAttachments( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailMessage.attachments</code> attribute. 
	 * @param value the attachments
	 */
	public void setAttachments(final SessionContext ctx, final List<EmailAttachment> value)
	{
		ATTACHMENTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailMessage.attachments</code> attribute. 
	 * @param value the attachments
	 */
	public void setAttachments(final List<EmailAttachment> value)
	{
		setAttachments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to attachments. 
	 * @param value the item to add to attachments
	 */
	public void addToAttachments(final SessionContext ctx, final EmailAttachment value)
	{
		ATTACHMENTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to attachments. 
	 * @param value the item to add to attachments
	 */
	public void addToAttachments(final EmailAttachment value)
	{
		addToAttachments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from attachments. 
	 * @param value the item to remove from attachments
	 */
	public void removeFromAttachments(final SessionContext ctx, final EmailAttachment value)
	{
		ATTACHMENTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from attachments. 
	 * @param value the item to remove from attachments
	 */
	public void removeFromAttachments(final EmailAttachment value)
	{
		removeFromAttachments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.bccAddresses</code> attribute.
	 * @return the bccAddresses
	 */
	public List<EmailAddress> getBccAddresses(final SessionContext ctx)
	{
		final List<EmailAddress> items = getLinkedItems( 
			ctx,
			true,
			AcceleratorServicesConstants.Relations.EMAILMESSAGE2BCCADDRESSESREL,
			null,
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2BCCADDRESSESREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2BCCADDRESSESREL_TGT_ORDERED, true)
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.bccAddresses</code> attribute.
	 * @return the bccAddresses
	 */
	public List<EmailAddress> getBccAddresses()
	{
		return getBccAddresses( getSession().getSessionContext() );
	}
	
	public long getBccAddressesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			AcceleratorServicesConstants.Relations.EMAILMESSAGE2BCCADDRESSESREL,
			null
		);
	}
	
	public long getBccAddressesCount()
	{
		return getBccAddressesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailMessage.bccAddresses</code> attribute. 
	 * @param value the bccAddresses
	 */
	public void setBccAddresses(final SessionContext ctx, final List<EmailAddress> value)
	{
		setLinkedItems( 
			ctx,
			true,
			AcceleratorServicesConstants.Relations.EMAILMESSAGE2BCCADDRESSESREL,
			null,
			value,
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2BCCADDRESSESREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2BCCADDRESSESREL_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(EMAILMESSAGE2BCCADDRESSESREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailMessage.bccAddresses</code> attribute. 
	 * @param value the bccAddresses
	 */
	public void setBccAddresses(final List<EmailAddress> value)
	{
		setBccAddresses( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bccAddresses. 
	 * @param value the item to add to bccAddresses
	 */
	public void addToBccAddresses(final SessionContext ctx, final EmailAddress value)
	{
		addLinkedItems( 
			ctx,
			true,
			AcceleratorServicesConstants.Relations.EMAILMESSAGE2BCCADDRESSESREL,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2BCCADDRESSESREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2BCCADDRESSESREL_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(EMAILMESSAGE2BCCADDRESSESREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bccAddresses. 
	 * @param value the item to add to bccAddresses
	 */
	public void addToBccAddresses(final EmailAddress value)
	{
		addToBccAddresses( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bccAddresses. 
	 * @param value the item to remove from bccAddresses
	 */
	public void removeFromBccAddresses(final SessionContext ctx, final EmailAddress value)
	{
		removeLinkedItems( 
			ctx,
			true,
			AcceleratorServicesConstants.Relations.EMAILMESSAGE2BCCADDRESSESREL,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2BCCADDRESSESREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2BCCADDRESSESREL_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(EMAILMESSAGE2BCCADDRESSESREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bccAddresses. 
	 * @param value the item to remove from bccAddresses
	 */
	public void removeFromBccAddresses(final EmailAddress value)
	{
		removeFromBccAddresses( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.body</code> attribute.
	 * @return the body - Body of the email message.
	 */
	public String getBody(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BODY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.body</code> attribute.
	 * @return the body - Body of the email message.
	 */
	public String getBody()
	{
		return getBody( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailMessage.body</code> attribute. 
	 * @param value the body - Body of the email message.
	 */
	public void setBody(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BODY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailMessage.body</code> attribute. 
	 * @param value the body - Body of the email message.
	 */
	public void setBody(final String value)
	{
		setBody( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.bodyMedia</code> attribute.
	 * @return the bodyMedia - Body of the email message which is too big to put in 'body' attribute
	 */
	public Media getBodyMedia(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, BODYMEDIA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.bodyMedia</code> attribute.
	 * @return the bodyMedia - Body of the email message which is too big to put in 'body' attribute
	 */
	public Media getBodyMedia()
	{
		return getBodyMedia( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailMessage.bodyMedia</code> attribute. 
	 * @param value the bodyMedia - Body of the email message which is too big to put in 'body' attribute
	 */
	public void setBodyMedia(final SessionContext ctx, final Media value)
	{
		new PartOfHandler<Media>()
		{
			@Override
			protected Media doGetValue(final SessionContext ctx)
			{
				return getBodyMedia( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final Media _value)
			{
				final Media value = _value;
				setProperty(ctx, BODYMEDIA,value);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailMessage.bodyMedia</code> attribute. 
	 * @param value the bodyMedia - Body of the email message which is too big to put in 'body' attribute
	 */
	public void setBodyMedia(final Media value)
	{
		setBodyMedia( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.ccAddresses</code> attribute.
	 * @return the ccAddresses
	 */
	public List<EmailAddress> getCcAddresses(final SessionContext ctx)
	{
		final List<EmailAddress> items = getLinkedItems( 
			ctx,
			true,
			AcceleratorServicesConstants.Relations.EMAILMESSAGE2CCADDRESSESREL,
			null,
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2CCADDRESSESREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2CCADDRESSESREL_TGT_ORDERED, true)
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.ccAddresses</code> attribute.
	 * @return the ccAddresses
	 */
	public List<EmailAddress> getCcAddresses()
	{
		return getCcAddresses( getSession().getSessionContext() );
	}
	
	public long getCcAddressesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			AcceleratorServicesConstants.Relations.EMAILMESSAGE2CCADDRESSESREL,
			null
		);
	}
	
	public long getCcAddressesCount()
	{
		return getCcAddressesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailMessage.ccAddresses</code> attribute. 
	 * @param value the ccAddresses
	 */
	public void setCcAddresses(final SessionContext ctx, final List<EmailAddress> value)
	{
		setLinkedItems( 
			ctx,
			true,
			AcceleratorServicesConstants.Relations.EMAILMESSAGE2CCADDRESSESREL,
			null,
			value,
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2CCADDRESSESREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2CCADDRESSESREL_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(EMAILMESSAGE2CCADDRESSESREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailMessage.ccAddresses</code> attribute. 
	 * @param value the ccAddresses
	 */
	public void setCcAddresses(final List<EmailAddress> value)
	{
		setCcAddresses( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to ccAddresses. 
	 * @param value the item to add to ccAddresses
	 */
	public void addToCcAddresses(final SessionContext ctx, final EmailAddress value)
	{
		addLinkedItems( 
			ctx,
			true,
			AcceleratorServicesConstants.Relations.EMAILMESSAGE2CCADDRESSESREL,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2CCADDRESSESREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2CCADDRESSESREL_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(EMAILMESSAGE2CCADDRESSESREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to ccAddresses. 
	 * @param value the item to add to ccAddresses
	 */
	public void addToCcAddresses(final EmailAddress value)
	{
		addToCcAddresses( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from ccAddresses. 
	 * @param value the item to remove from ccAddresses
	 */
	public void removeFromCcAddresses(final SessionContext ctx, final EmailAddress value)
	{
		removeLinkedItems( 
			ctx,
			true,
			AcceleratorServicesConstants.Relations.EMAILMESSAGE2CCADDRESSESREL,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2CCADDRESSESREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2CCADDRESSESREL_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(EMAILMESSAGE2CCADDRESSESREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from ccAddresses. 
	 * @param value the item to remove from ccAddresses
	 */
	public void removeFromCcAddresses(final EmailAddress value)
	{
		removeFromCcAddresses( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		FROMADDRESSHANDLER.newInstance(ctx, allAttributes);
		PROCESSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.fromAddress</code> attribute.
	 * @return the fromAddress
	 */
	public EmailAddress getFromAddress(final SessionContext ctx)
	{
		return (EmailAddress)getProperty( ctx, FROMADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.fromAddress</code> attribute.
	 * @return the fromAddress
	 */
	public EmailAddress getFromAddress()
	{
		return getFromAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailMessage.fromAddress</code> attribute. 
	 * @param value the fromAddress
	 */
	public void setFromAddress(final SessionContext ctx, final EmailAddress value)
	{
		FROMADDRESSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailMessage.fromAddress</code> attribute. 
	 * @param value the fromAddress
	 */
	public void setFromAddress(final EmailAddress value)
	{
		setFromAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.process</code> attribute.
	 * @return the process
	 */
	public BusinessProcess getProcess(final SessionContext ctx)
	{
		return (BusinessProcess)getProperty( ctx, PROCESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.process</code> attribute.
	 * @return the process
	 */
	public BusinessProcess getProcess()
	{
		return getProcess( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailMessage.process</code> attribute. 
	 * @param value the process
	 */
	public void setProcess(final SessionContext ctx, final BusinessProcess value)
	{
		PROCESSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailMessage.process</code> attribute. 
	 * @param value the process
	 */
	public void setProcess(final BusinessProcess value)
	{
		setProcess( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.replyToAddress</code> attribute.
	 * @return the replyToAddress - It's a string value with email address that message has to be replied to.
	 */
	public String getReplyToAddress(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REPLYTOADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.replyToAddress</code> attribute.
	 * @return the replyToAddress - It's a string value with email address that message has to be replied to.
	 */
	public String getReplyToAddress()
	{
		return getReplyToAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailMessage.replyToAddress</code> attribute. 
	 * @param value the replyToAddress - It's a string value with email address that message has to be replied to.
	 */
	protected void setReplyToAddress(final SessionContext ctx, final String value)
	{
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+REPLYTOADDRESS+"' is not changeable", 0 );
		}
		setProperty(ctx, REPLYTOADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailMessage.replyToAddress</code> attribute. 
	 * @param value the replyToAddress - It's a string value with email address that message has to be replied to.
	 */
	protected void setReplyToAddress(final String value)
	{
		setReplyToAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.sent</code> attribute.
	 * @return the sent - Is set when the email message has been already sent.
	 */
	public Boolean isSent(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.sent</code> attribute.
	 * @return the sent - Is set when the email message has been already sent.
	 */
	public Boolean isSent()
	{
		return isSent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.sent</code> attribute. 
	 * @return the sent - Is set when the email message has been already sent.
	 */
	public boolean isSentAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSent( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.sent</code> attribute. 
	 * @return the sent - Is set when the email message has been already sent.
	 */
	public boolean isSentAsPrimitive()
	{
		return isSentAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailMessage.sent</code> attribute. 
	 * @param value the sent - Is set when the email message has been already sent.
	 */
	public void setSent(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailMessage.sent</code> attribute. 
	 * @param value the sent - Is set when the email message has been already sent.
	 */
	public void setSent(final Boolean value)
	{
		setSent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailMessage.sent</code> attribute. 
	 * @param value the sent - Is set when the email message has been already sent.
	 */
	public void setSent(final SessionContext ctx, final boolean value)
	{
		setSent( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailMessage.sent</code> attribute. 
	 * @param value the sent - Is set when the email message has been already sent.
	 */
	public void setSent(final boolean value)
	{
		setSent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.sentDate</code> attribute.
	 * @return the sentDate - Date of sending the email message.
	 */
	public Date getSentDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, SENTDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.sentDate</code> attribute.
	 * @return the sentDate - Date of sending the email message.
	 */
	public Date getSentDate()
	{
		return getSentDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailMessage.sentDate</code> attribute. 
	 * @param value the sentDate - Date of sending the email message.
	 */
	public void setSentDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, SENTDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailMessage.sentDate</code> attribute. 
	 * @param value the sentDate - Date of sending the email message.
	 */
	public void setSentDate(final Date value)
	{
		setSentDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.sentMessageID</code> attribute.
	 * @return the sentMessageID - Identifier of the email message.
	 */
	public String getSentMessageID(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SENTMESSAGEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.sentMessageID</code> attribute.
	 * @return the sentMessageID - Identifier of the email message.
	 */
	public String getSentMessageID()
	{
		return getSentMessageID( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailMessage.sentMessageID</code> attribute. 
	 * @param value the sentMessageID - Identifier of the email message.
	 */
	public void setSentMessageID(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SENTMESSAGEID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailMessage.sentMessageID</code> attribute. 
	 * @param value the sentMessageID - Identifier of the email message.
	 */
	public void setSentMessageID(final String value)
	{
		setSentMessageID( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.subject</code> attribute.
	 * @return the subject - Subject of the email message.
	 */
	public String getSubject(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUBJECT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.subject</code> attribute.
	 * @return the subject - Subject of the email message.
	 */
	public String getSubject()
	{
		return getSubject( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailMessage.subject</code> attribute. 
	 * @param value the subject - Subject of the email message.
	 */
	protected void setSubject(final SessionContext ctx, final String value)
	{
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+SUBJECT+"' is not changeable", 0 );
		}
		setProperty(ctx, SUBJECT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailMessage.subject</code> attribute. 
	 * @param value the subject - Subject of the email message.
	 */
	protected void setSubject(final String value)
	{
		setSubject( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.toAddresses</code> attribute.
	 * @return the toAddresses
	 */
	public List<EmailAddress> getToAddresses(final SessionContext ctx)
	{
		final List<EmailAddress> items = getLinkedItems( 
			ctx,
			true,
			AcceleratorServicesConstants.Relations.EMAILMESSAGE2TOADDRESSESREL,
			null,
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2TOADDRESSESREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2TOADDRESSESREL_TGT_ORDERED, true)
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.toAddresses</code> attribute.
	 * @return the toAddresses
	 */
	public List<EmailAddress> getToAddresses()
	{
		return getToAddresses( getSession().getSessionContext() );
	}
	
	public long getToAddressesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			AcceleratorServicesConstants.Relations.EMAILMESSAGE2TOADDRESSESREL,
			null
		);
	}
	
	public long getToAddressesCount()
	{
		return getToAddressesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailMessage.toAddresses</code> attribute. 
	 * @param value the toAddresses
	 */
	public void setToAddresses(final SessionContext ctx, final List<EmailAddress> value)
	{
		setLinkedItems( 
			ctx,
			true,
			AcceleratorServicesConstants.Relations.EMAILMESSAGE2TOADDRESSESREL,
			null,
			value,
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2TOADDRESSESREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2TOADDRESSESREL_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(EMAILMESSAGE2TOADDRESSESREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailMessage.toAddresses</code> attribute. 
	 * @param value the toAddresses
	 */
	public void setToAddresses(final List<EmailAddress> value)
	{
		setToAddresses( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to toAddresses. 
	 * @param value the item to add to toAddresses
	 */
	public void addToToAddresses(final SessionContext ctx, final EmailAddress value)
	{
		addLinkedItems( 
			ctx,
			true,
			AcceleratorServicesConstants.Relations.EMAILMESSAGE2TOADDRESSESREL,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2TOADDRESSESREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2TOADDRESSESREL_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(EMAILMESSAGE2TOADDRESSESREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to toAddresses. 
	 * @param value the item to add to toAddresses
	 */
	public void addToToAddresses(final EmailAddress value)
	{
		addToToAddresses( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from toAddresses. 
	 * @param value the item to remove from toAddresses
	 */
	public void removeFromToAddresses(final SessionContext ctx, final EmailAddress value)
	{
		removeLinkedItems( 
			ctx,
			true,
			AcceleratorServicesConstants.Relations.EMAILMESSAGE2TOADDRESSESREL,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2TOADDRESSESREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2TOADDRESSESREL_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(EMAILMESSAGE2TOADDRESSESREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from toAddresses. 
	 * @param value the item to remove from toAddresses
	 */
	public void removeFromToAddresses(final EmailAddress value)
	{
		removeFromToAddresses( getSession().getSessionContext(), value );
	}
	
}
