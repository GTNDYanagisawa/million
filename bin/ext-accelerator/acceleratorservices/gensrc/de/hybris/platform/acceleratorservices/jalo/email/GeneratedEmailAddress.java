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
import de.hybris.platform.acceleratorservices.jalo.email.EmailMessage;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.acceleratorservices.jalo.email.EmailAddress EmailAddress}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEmailAddress extends GenericItem
{
	/** Qualifier of the <code>EmailAddress.emailAddress</code> attribute **/
	public static final String EMAILADDRESS = "emailAddress";
	/** Qualifier of the <code>EmailAddress.displayName</code> attribute **/
	public static final String DISPLAYNAME = "displayName";
	/** Qualifier of the <code>EmailAddress.toMessages</code> attribute **/
	public static final String TOMESSAGES = "toMessages";
	/** Relation ordering override parameter constants for EmailMessage2ToAddressesRel from ((acceleratorservices))*/
	protected static String EMAILMESSAGE2TOADDRESSESREL_SRC_ORDERED = "relation.EmailMessage2ToAddressesRel.source.ordered";
	protected static String EMAILMESSAGE2TOADDRESSESREL_TGT_ORDERED = "relation.EmailMessage2ToAddressesRel.target.ordered";
	/** Relation disable markmodifed parameter constants for EmailMessage2ToAddressesRel from ((acceleratorservices))*/
	protected static String EMAILMESSAGE2TOADDRESSESREL_MARKMODIFIED = "relation.EmailMessage2ToAddressesRel.markmodified";
	/** Qualifier of the <code>EmailAddress.ccMessages</code> attribute **/
	public static final String CCMESSAGES = "ccMessages";
	/** Relation ordering override parameter constants for EmailMessage2CcAddressesRel from ((acceleratorservices))*/
	protected static String EMAILMESSAGE2CCADDRESSESREL_SRC_ORDERED = "relation.EmailMessage2CcAddressesRel.source.ordered";
	protected static String EMAILMESSAGE2CCADDRESSESREL_TGT_ORDERED = "relation.EmailMessage2CcAddressesRel.target.ordered";
	/** Relation disable markmodifed parameter constants for EmailMessage2CcAddressesRel from ((acceleratorservices))*/
	protected static String EMAILMESSAGE2CCADDRESSESREL_MARKMODIFIED = "relation.EmailMessage2CcAddressesRel.markmodified";
	/** Qualifier of the <code>EmailAddress.bccMessages</code> attribute **/
	public static final String BCCMESSAGES = "bccMessages";
	/** Relation ordering override parameter constants for EmailMessage2BccAddressesRel from ((acceleratorservices))*/
	protected static String EMAILMESSAGE2BCCADDRESSESREL_SRC_ORDERED = "relation.EmailMessage2BccAddressesRel.source.ordered";
	protected static String EMAILMESSAGE2BCCADDRESSESREL_TGT_ORDERED = "relation.EmailMessage2BccAddressesRel.target.ordered";
	/** Relation disable markmodifed parameter constants for EmailMessage2BccAddressesRel from ((acceleratorservices))*/
	protected static String EMAILMESSAGE2BCCADDRESSESREL_MARKMODIFIED = "relation.EmailMessage2BccAddressesRel.markmodified";
	/** Qualifier of the <code>EmailAddress.messagesSent</code> attribute **/
	public static final String MESSAGESSENT = "messagesSent";
	/**
	* {@link OneToManyHandler} for handling 1:n MESSAGESSENT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<EmailMessage> MESSAGESSENTHANDLER = new OneToManyHandler<EmailMessage>(
	AcceleratorServicesConstants.TC.EMAILMESSAGE,
	false,
	"fromAddress",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(EMAILADDRESS, AttributeMode.INITIAL);
		tmp.put(DISPLAYNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAddress.bccMessages</code> attribute.
	 * @return the bccMessages
	 */
	public List<EmailMessage> getBccMessages(final SessionContext ctx)
	{
		final List<EmailMessage> items = getLinkedItems( 
			ctx,
			false,
			AcceleratorServicesConstants.Relations.EMAILMESSAGE2BCCADDRESSESREL,
			null,
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2BCCADDRESSESREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2BCCADDRESSESREL_TGT_ORDERED, true)
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAddress.bccMessages</code> attribute.
	 * @return the bccMessages
	 */
	public List<EmailMessage> getBccMessages()
	{
		return getBccMessages( getSession().getSessionContext() );
	}
	
	public long getBccMessagesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			AcceleratorServicesConstants.Relations.EMAILMESSAGE2BCCADDRESSESREL,
			null
		);
	}
	
	public long getBccMessagesCount()
	{
		return getBccMessagesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailAddress.bccMessages</code> attribute. 
	 * @param value the bccMessages
	 */
	public void setBccMessages(final SessionContext ctx, final List<EmailMessage> value)
	{
		setLinkedItems( 
			ctx,
			false,
			AcceleratorServicesConstants.Relations.EMAILMESSAGE2BCCADDRESSESREL,
			null,
			value,
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2BCCADDRESSESREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2BCCADDRESSESREL_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(EMAILMESSAGE2BCCADDRESSESREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailAddress.bccMessages</code> attribute. 
	 * @param value the bccMessages
	 */
	public void setBccMessages(final List<EmailMessage> value)
	{
		setBccMessages( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bccMessages. 
	 * @param value the item to add to bccMessages
	 */
	public void addToBccMessages(final SessionContext ctx, final EmailMessage value)
	{
		addLinkedItems( 
			ctx,
			false,
			AcceleratorServicesConstants.Relations.EMAILMESSAGE2BCCADDRESSESREL,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2BCCADDRESSESREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2BCCADDRESSESREL_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(EMAILMESSAGE2BCCADDRESSESREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bccMessages. 
	 * @param value the item to add to bccMessages
	 */
	public void addToBccMessages(final EmailMessage value)
	{
		addToBccMessages( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bccMessages. 
	 * @param value the item to remove from bccMessages
	 */
	public void removeFromBccMessages(final SessionContext ctx, final EmailMessage value)
	{
		removeLinkedItems( 
			ctx,
			false,
			AcceleratorServicesConstants.Relations.EMAILMESSAGE2BCCADDRESSESREL,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2BCCADDRESSESREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2BCCADDRESSESREL_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(EMAILMESSAGE2BCCADDRESSESREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bccMessages. 
	 * @param value the item to remove from bccMessages
	 */
	public void removeFromBccMessages(final EmailMessage value)
	{
		removeFromBccMessages( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAddress.ccMessages</code> attribute.
	 * @return the ccMessages
	 */
	public List<EmailMessage> getCcMessages(final SessionContext ctx)
	{
		final List<EmailMessage> items = getLinkedItems( 
			ctx,
			false,
			AcceleratorServicesConstants.Relations.EMAILMESSAGE2CCADDRESSESREL,
			null,
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2CCADDRESSESREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2CCADDRESSESREL_TGT_ORDERED, true)
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAddress.ccMessages</code> attribute.
	 * @return the ccMessages
	 */
	public List<EmailMessage> getCcMessages()
	{
		return getCcMessages( getSession().getSessionContext() );
	}
	
	public long getCcMessagesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			AcceleratorServicesConstants.Relations.EMAILMESSAGE2CCADDRESSESREL,
			null
		);
	}
	
	public long getCcMessagesCount()
	{
		return getCcMessagesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailAddress.ccMessages</code> attribute. 
	 * @param value the ccMessages
	 */
	public void setCcMessages(final SessionContext ctx, final List<EmailMessage> value)
	{
		setLinkedItems( 
			ctx,
			false,
			AcceleratorServicesConstants.Relations.EMAILMESSAGE2CCADDRESSESREL,
			null,
			value,
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2CCADDRESSESREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2CCADDRESSESREL_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(EMAILMESSAGE2CCADDRESSESREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailAddress.ccMessages</code> attribute. 
	 * @param value the ccMessages
	 */
	public void setCcMessages(final List<EmailMessage> value)
	{
		setCcMessages( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to ccMessages. 
	 * @param value the item to add to ccMessages
	 */
	public void addToCcMessages(final SessionContext ctx, final EmailMessage value)
	{
		addLinkedItems( 
			ctx,
			false,
			AcceleratorServicesConstants.Relations.EMAILMESSAGE2CCADDRESSESREL,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2CCADDRESSESREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2CCADDRESSESREL_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(EMAILMESSAGE2CCADDRESSESREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to ccMessages. 
	 * @param value the item to add to ccMessages
	 */
	public void addToCcMessages(final EmailMessage value)
	{
		addToCcMessages( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from ccMessages. 
	 * @param value the item to remove from ccMessages
	 */
	public void removeFromCcMessages(final SessionContext ctx, final EmailMessage value)
	{
		removeLinkedItems( 
			ctx,
			false,
			AcceleratorServicesConstants.Relations.EMAILMESSAGE2CCADDRESSESREL,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2CCADDRESSESREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2CCADDRESSESREL_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(EMAILMESSAGE2CCADDRESSESREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from ccMessages. 
	 * @param value the item to remove from ccMessages
	 */
	public void removeFromCcMessages(final EmailMessage value)
	{
		removeFromCcMessages( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAddress.displayName</code> attribute.
	 * @return the displayName - Display name displayed for given item.
	 */
	public String getDisplayName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DISPLAYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAddress.displayName</code> attribute.
	 * @return the displayName - Display name displayed for given item.
	 */
	public String getDisplayName()
	{
		return getDisplayName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailAddress.displayName</code> attribute. 
	 * @param value the displayName - Display name displayed for given item.
	 */
	protected void setDisplayName(final SessionContext ctx, final String value)
	{
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+DISPLAYNAME+"' is not changeable", 0 );
		}
		setProperty(ctx, DISPLAYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailAddress.displayName</code> attribute. 
	 * @param value the displayName - Display name displayed for given item.
	 */
	protected void setDisplayName(final String value)
	{
		setDisplayName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAddress.emailAddress</code> attribute.
	 * @return the emailAddress - Email address of the given item.
	 */
	public String getEmailAddress(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAILADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAddress.emailAddress</code> attribute.
	 * @return the emailAddress - Email address of the given item.
	 */
	public String getEmailAddress()
	{
		return getEmailAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailAddress.emailAddress</code> attribute. 
	 * @param value the emailAddress - Email address of the given item.
	 */
	protected void setEmailAddress(final SessionContext ctx, final String value)
	{
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+EMAILADDRESS+"' is not changeable", 0 );
		}
		setProperty(ctx, EMAILADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailAddress.emailAddress</code> attribute. 
	 * @param value the emailAddress - Email address of the given item.
	 */
	protected void setEmailAddress(final String value)
	{
		setEmailAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAddress.messagesSent</code> attribute.
	 * @return the messagesSent
	 */
	public List<EmailMessage> getMessagesSent(final SessionContext ctx)
	{
		return (List<EmailMessage>)MESSAGESSENTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAddress.messagesSent</code> attribute.
	 * @return the messagesSent
	 */
	public List<EmailMessage> getMessagesSent()
	{
		return getMessagesSent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailAddress.messagesSent</code> attribute. 
	 * @param value the messagesSent
	 */
	public void setMessagesSent(final SessionContext ctx, final List<EmailMessage> value)
	{
		MESSAGESSENTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailAddress.messagesSent</code> attribute. 
	 * @param value the messagesSent
	 */
	public void setMessagesSent(final List<EmailMessage> value)
	{
		setMessagesSent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to messagesSent. 
	 * @param value the item to add to messagesSent
	 */
	public void addToMessagesSent(final SessionContext ctx, final EmailMessage value)
	{
		MESSAGESSENTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to messagesSent. 
	 * @param value the item to add to messagesSent
	 */
	public void addToMessagesSent(final EmailMessage value)
	{
		addToMessagesSent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from messagesSent. 
	 * @param value the item to remove from messagesSent
	 */
	public void removeFromMessagesSent(final SessionContext ctx, final EmailMessage value)
	{
		MESSAGESSENTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from messagesSent. 
	 * @param value the item to remove from messagesSent
	 */
	public void removeFromMessagesSent(final EmailMessage value)
	{
		removeFromMessagesSent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAddress.toMessages</code> attribute.
	 * @return the toMessages
	 */
	public List<EmailMessage> getToMessages(final SessionContext ctx)
	{
		final List<EmailMessage> items = getLinkedItems( 
			ctx,
			false,
			AcceleratorServicesConstants.Relations.EMAILMESSAGE2TOADDRESSESREL,
			null,
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2TOADDRESSESREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2TOADDRESSESREL_TGT_ORDERED, true)
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAddress.toMessages</code> attribute.
	 * @return the toMessages
	 */
	public List<EmailMessage> getToMessages()
	{
		return getToMessages( getSession().getSessionContext() );
	}
	
	public long getToMessagesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			AcceleratorServicesConstants.Relations.EMAILMESSAGE2TOADDRESSESREL,
			null
		);
	}
	
	public long getToMessagesCount()
	{
		return getToMessagesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailAddress.toMessages</code> attribute. 
	 * @param value the toMessages
	 */
	public void setToMessages(final SessionContext ctx, final List<EmailMessage> value)
	{
		setLinkedItems( 
			ctx,
			false,
			AcceleratorServicesConstants.Relations.EMAILMESSAGE2TOADDRESSESREL,
			null,
			value,
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2TOADDRESSESREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2TOADDRESSESREL_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(EMAILMESSAGE2TOADDRESSESREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailAddress.toMessages</code> attribute. 
	 * @param value the toMessages
	 */
	public void setToMessages(final List<EmailMessage> value)
	{
		setToMessages( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to toMessages. 
	 * @param value the item to add to toMessages
	 */
	public void addToToMessages(final SessionContext ctx, final EmailMessage value)
	{
		addLinkedItems( 
			ctx,
			false,
			AcceleratorServicesConstants.Relations.EMAILMESSAGE2TOADDRESSESREL,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2TOADDRESSESREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2TOADDRESSESREL_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(EMAILMESSAGE2TOADDRESSESREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to toMessages. 
	 * @param value the item to add to toMessages
	 */
	public void addToToMessages(final EmailMessage value)
	{
		addToToMessages( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from toMessages. 
	 * @param value the item to remove from toMessages
	 */
	public void removeFromToMessages(final SessionContext ctx, final EmailMessage value)
	{
		removeLinkedItems( 
			ctx,
			false,
			AcceleratorServicesConstants.Relations.EMAILMESSAGE2TOADDRESSESREL,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2TOADDRESSESREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(EMAILMESSAGE2TOADDRESSESREL_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(EMAILMESSAGE2TOADDRESSESREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from toMessages. 
	 * @param value the item to remove from toMessages
	 */
	public void removeFromToMessages(final EmailMessage value)
	{
		removeFromToMessages( getSession().getSessionContext(), value );
	}
	
}
