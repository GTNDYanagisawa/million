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
package de.hybris.platform.ticket.events.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.ticket.events.model.CsTicketEventModel;

/**
 * Generated model class for type CsTicketEmail first defined at extension ticketsystem.
 */
@SuppressWarnings("all")
public class CsTicketEmailModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CsTicketEmail";
	
	/**<i>Generated relation code constant for relation <code>CsTicketEvent2CsTicketEmail</code> defining source attribute <code>ticket</code> in extension <code>ticketsystem</code>.</i>*/
	public final static String _CSTICKETEVENT2CSTICKETEMAIL = "CsTicketEvent2CsTicketEmail";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicketEmail.messageId</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String MESSAGEID = "messageId";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicketEmail.from</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String FROM = "from";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicketEmail.to</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String TO = "to";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicketEmail.subject</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String SUBJECT = "subject";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicketEmail.body</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String BODY = "body";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicketEmail.ticket</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String TICKET = "ticket";
	
	
	/** <i>Generated variable</i> - Variable of <code>CsTicketEmail.messageId</code> attribute defined at extension <code>ticketsystem</code>. */
	private String _messageId;
	
	/** <i>Generated variable</i> - Variable of <code>CsTicketEmail.from</code> attribute defined at extension <code>ticketsystem</code>. */
	private String _from;
	
	/** <i>Generated variable</i> - Variable of <code>CsTicketEmail.to</code> attribute defined at extension <code>ticketsystem</code>. */
	private String _to;
	
	/** <i>Generated variable</i> - Variable of <code>CsTicketEmail.subject</code> attribute defined at extension <code>ticketsystem</code>. */
	private String _subject;
	
	/** <i>Generated variable</i> - Variable of <code>CsTicketEmail.body</code> attribute defined at extension <code>ticketsystem</code>. */
	private String _body;
	
	/** <i>Generated variable</i> - Variable of <code>CsTicketEmail.ticket</code> attribute defined at extension <code>ticketsystem</code>. */
	private CsTicketEventModel _ticket;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CsTicketEmailModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CsTicketEmailModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public CsTicketEmailModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketEmail.body</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the body
	 */
	public String getBody()
	{
		if (this._body!=null)
		{
			return _body;
		}
		return _body = getPersistenceContext().getValue(BODY, _body);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketEmail.from</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the from
	 */
	public String getFrom()
	{
		if (this._from!=null)
		{
			return _from;
		}
		return _from = getPersistenceContext().getValue(FROM, _from);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketEmail.messageId</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the messageId
	 */
	public String getMessageId()
	{
		if (this._messageId!=null)
		{
			return _messageId;
		}
		return _messageId = getPersistenceContext().getValue(MESSAGEID, _messageId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketEmail.subject</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the subject
	 */
	public String getSubject()
	{
		if (this._subject!=null)
		{
			return _subject;
		}
		return _subject = getPersistenceContext().getValue(SUBJECT, _subject);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketEmail.ticket</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the ticket
	 */
	public CsTicketEventModel getTicket()
	{
		if (this._ticket!=null)
		{
			return _ticket;
		}
		return _ticket = getPersistenceContext().getValue(TICKET, _ticket);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketEmail.to</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the to
	 */
	public String getTo()
	{
		if (this._to!=null)
		{
			return _to;
		}
		return _to = getPersistenceContext().getValue(TO, _to);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicketEmail.body</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the body
	 */
	public void setBody(final String value)
	{
		_body = getPersistenceContext().setValue(BODY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicketEmail.from</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the from
	 */
	public void setFrom(final String value)
	{
		_from = getPersistenceContext().setValue(FROM, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicketEmail.messageId</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the messageId
	 */
	public void setMessageId(final String value)
	{
		_messageId = getPersistenceContext().setValue(MESSAGEID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicketEmail.subject</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the subject
	 */
	public void setSubject(final String value)
	{
		_subject = getPersistenceContext().setValue(SUBJECT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicketEmail.ticket</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the ticket
	 */
	public void setTicket(final CsTicketEventModel value)
	{
		_ticket = getPersistenceContext().setValue(TICKET, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicketEmail.to</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the to
	 */
	public void setTo(final String value)
	{
		_to = getPersistenceContext().setValue(TO, value);
	}
	
}
