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

import de.hybris.platform.comments.model.CommentModel;
import de.hybris.platform.comments.model.CommentTypeModel;
import de.hybris.platform.comments.model.ComponentModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.ticket.events.model.CsTicketChangeEventEntryModel;
import de.hybris.platform.ticket.events.model.CsTicketEmailModel;
import de.hybris.platform.ticket.model.CsTicketModel;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Generated model class for type CsTicketEvent first defined at extension ticketsystem.
 */
@SuppressWarnings("all")
public class CsTicketEventModel extends CommentModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CsTicketEvent";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicketEvent.startDateTime</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String STARTDATETIME = "startDateTime";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicketEvent.endDateTime</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String ENDDATETIME = "endDateTime";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicketEvent.ticket</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String TICKET = "ticket";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicketEvent.emails</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String EMAILS = "emails";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicketEvent.entries</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String ENTRIES = "entries";
	
	
	/** <i>Generated variable</i> - Variable of <code>CsTicketEvent.startDateTime</code> attribute defined at extension <code>ticketsystem</code>. */
	private Date _startDateTime;
	
	/** <i>Generated variable</i> - Variable of <code>CsTicketEvent.endDateTime</code> attribute defined at extension <code>ticketsystem</code>. */
	private Date _endDateTime;
	
	/** <i>Generated variable</i> - Variable of <code>CsTicketEvent.ticket</code> attribute defined at extension <code>ticketsystem</code>. */
	private CsTicketModel _ticket;
	
	/** <i>Generated variable</i> - Variable of <code>CsTicketEvent.emails</code> attribute defined at extension <code>ticketsystem</code>. */
	private List<CsTicketEmailModel> _emails;
	
	/** <i>Generated variable</i> - Variable of <code>CsTicketEvent.entries</code> attribute defined at extension <code>ticketsystem</code>. */
	private Set<CsTicketChangeEventEntryModel> _entries;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CsTicketEventModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CsTicketEventModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _author initial attribute declared by type <code>AbstractComment</code> at extension <code>comments</code>
	 * @param _commentType initial attribute declared by type <code>Comment</code> at extension <code>comments</code>
	 * @param _component initial attribute declared by type <code>Comment</code> at extension <code>comments</code>
	 * @param _text initial attribute declared by type <code>AbstractComment</code> at extension <code>comments</code>
	 */
	@Deprecated
	public CsTicketEventModel(final UserModel _author, final CommentTypeModel _commentType, final ComponentModel _component, final String _text)
	{
		super();
		setAuthor(_author);
		setCommentType(_commentType);
		setComponent(_component);
		setText(_text);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _author initial attribute declared by type <code>AbstractComment</code> at extension <code>comments</code>
	 * @param _commentType initial attribute declared by type <code>Comment</code> at extension <code>comments</code>
	 * @param _component initial attribute declared by type <code>Comment</code> at extension <code>comments</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _text initial attribute declared by type <code>AbstractComment</code> at extension <code>comments</code>
	 */
	@Deprecated
	public CsTicketEventModel(final UserModel _author, final CommentTypeModel _commentType, final ComponentModel _component, final ItemModel _owner, final String _text)
	{
		super();
		setAuthor(_author);
		setCommentType(_commentType);
		setComponent(_component);
		setOwner(_owner);
		setText(_text);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketEvent.emails</code> attribute defined at extension <code>ticketsystem</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the emails
	 */
	public List<CsTicketEmailModel> getEmails()
	{
		if (this._emails!=null)
		{
			return _emails;
		}
		return _emails = getPersistenceContext().getValue(EMAILS, _emails);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketEvent.endDateTime</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the endDateTime
	 */
	public Date getEndDateTime()
	{
		if (this._endDateTime!=null)
		{
			return _endDateTime;
		}
		return _endDateTime = getPersistenceContext().getValue(ENDDATETIME, _endDateTime);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketEvent.entries</code> attribute defined at extension <code>ticketsystem</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the entries
	 */
	public Set<CsTicketChangeEventEntryModel> getEntries()
	{
		if (this._entries!=null)
		{
			return _entries;
		}
		return _entries = getPersistenceContext().getValue(ENTRIES, _entries);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketEvent.startDateTime</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the startDateTime
	 */
	public Date getStartDateTime()
	{
		if (this._startDateTime!=null)
		{
			return _startDateTime;
		}
		return _startDateTime = getPersistenceContext().getValue(STARTDATETIME, _startDateTime);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketEvent.ticket</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the ticket
	 */
	@Deprecated
	public CsTicketModel getTicket()
	{
		if (this._ticket!=null)
		{
			return _ticket;
		}
		return _ticket = getPersistenceContext().getValue(TICKET, _ticket);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicketEvent.emails</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the emails
	 */
	public void setEmails(final List<CsTicketEmailModel> value)
	{
		_emails = getPersistenceContext().setValue(EMAILS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicketEvent.endDateTime</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the endDateTime
	 */
	public void setEndDateTime(final Date value)
	{
		_endDateTime = getPersistenceContext().setValue(ENDDATETIME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicketEvent.entries</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the entries
	 */
	public void setEntries(final Set<CsTicketChangeEventEntryModel> value)
	{
		_entries = getPersistenceContext().setValue(ENTRIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicketEvent.startDateTime</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the startDateTime
	 */
	public void setStartDateTime(final Date value)
	{
		_startDateTime = getPersistenceContext().setValue(STARTDATETIME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicketEvent.ticket</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the ticket
	 */
	@Deprecated
	public void setTicket(final CsTicketModel value)
	{
		_ticket = getPersistenceContext().setValue(TICKET, value);
	}
	
}
