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
package de.hybris.platform.ticket.model;

import de.hybris.platform.comments.model.CommentTypeModel;
import de.hybris.platform.commons.model.renderer.RendererTemplateModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.type.AttributeDescriptorModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.ticket.enums.CsEmailRecipients;
import java.util.Set;

/**
 * Generated model class for type CsTicketEventEmailConfiguration first defined at extension ticketsystem.
 */
@SuppressWarnings("all")
public class CsTicketEventEmailConfigurationModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CsTicketEventEmailConfiguration";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicketEventEmailConfiguration.code</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicketEventEmailConfiguration.plainTextTemplate</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String PLAINTEXTTEMPLATE = "plainTextTemplate";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicketEventEmailConfiguration.htmlTemplate</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String HTMLTEMPLATE = "htmlTemplate";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicketEventEmailConfiguration.subject</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String SUBJECT = "subject";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicketEventEmailConfiguration.eventType</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String EVENTTYPE = "eventType";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicketEventEmailConfiguration.alteredAttributes</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String ALTEREDATTRIBUTES = "alteredAttributes";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicketEventEmailConfiguration.recipientType</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String RECIPIENTTYPE = "recipientType";
	
	
	/** <i>Generated variable</i> - Variable of <code>CsTicketEventEmailConfiguration.code</code> attribute defined at extension <code>ticketsystem</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>CsTicketEventEmailConfiguration.plainTextTemplate</code> attribute defined at extension <code>ticketsystem</code>. */
	private RendererTemplateModel _plainTextTemplate;
	
	/** <i>Generated variable</i> - Variable of <code>CsTicketEventEmailConfiguration.htmlTemplate</code> attribute defined at extension <code>ticketsystem</code>. */
	private RendererTemplateModel _htmlTemplate;
	
	/** <i>Generated variable</i> - Variable of <code>CsTicketEventEmailConfiguration.subject</code> attribute defined at extension <code>ticketsystem</code>. */
	private String _subject;
	
	/** <i>Generated variable</i> - Variable of <code>CsTicketEventEmailConfiguration.eventType</code> attribute defined at extension <code>ticketsystem</code>. */
	private CommentTypeModel _eventType;
	
	/** <i>Generated variable</i> - Variable of <code>CsTicketEventEmailConfiguration.alteredAttributes</code> attribute defined at extension <code>ticketsystem</code>. */
	private Set<AttributeDescriptorModel> _alteredAttributes;
	
	/** <i>Generated variable</i> - Variable of <code>CsTicketEventEmailConfiguration.recipientType</code> attribute defined at extension <code>ticketsystem</code>. */
	private CsEmailRecipients _recipientType;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CsTicketEventEmailConfigurationModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CsTicketEventEmailConfigurationModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>CsTicketEventEmailConfiguration</code> at extension <code>ticketsystem</code>
	 */
	@Deprecated
	public CsTicketEventEmailConfigurationModel(final String _code)
	{
		super();
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>CsTicketEventEmailConfiguration</code> at extension <code>ticketsystem</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public CsTicketEventEmailConfigurationModel(final String _code, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketEventEmailConfiguration.alteredAttributes</code> attribute defined at extension <code>ticketsystem</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the alteredAttributes
	 */
	public Set<AttributeDescriptorModel> getAlteredAttributes()
	{
		if (this._alteredAttributes!=null)
		{
			return _alteredAttributes;
		}
		return _alteredAttributes = getPersistenceContext().getValue(ALTEREDATTRIBUTES, _alteredAttributes);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketEventEmailConfiguration.code</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the code
	 */
	public String getCode()
	{
		if (this._code!=null)
		{
			return _code;
		}
		return _code = getPersistenceContext().getValue(CODE, _code);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketEventEmailConfiguration.eventType</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the eventType
	 */
	public CommentTypeModel getEventType()
	{
		if (this._eventType!=null)
		{
			return _eventType;
		}
		return _eventType = getPersistenceContext().getValue(EVENTTYPE, _eventType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketEventEmailConfiguration.htmlTemplate</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the htmlTemplate
	 */
	public RendererTemplateModel getHtmlTemplate()
	{
		if (this._htmlTemplate!=null)
		{
			return _htmlTemplate;
		}
		return _htmlTemplate = getPersistenceContext().getValue(HTMLTEMPLATE, _htmlTemplate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketEventEmailConfiguration.plainTextTemplate</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the plainTextTemplate
	 */
	public RendererTemplateModel getPlainTextTemplate()
	{
		if (this._plainTextTemplate!=null)
		{
			return _plainTextTemplate;
		}
		return _plainTextTemplate = getPersistenceContext().getValue(PLAINTEXTTEMPLATE, _plainTextTemplate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketEventEmailConfiguration.recipientType</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the recipientType
	 */
	public CsEmailRecipients getRecipientType()
	{
		if (this._recipientType!=null)
		{
			return _recipientType;
		}
		return _recipientType = getPersistenceContext().getValue(RECIPIENTTYPE, _recipientType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketEventEmailConfiguration.subject</code> attribute defined at extension <code>ticketsystem</code>. 
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
	 * <i>Generated method</i> - Setter of <code>CsTicketEventEmailConfiguration.alteredAttributes</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the alteredAttributes
	 */
	public void setAlteredAttributes(final Set<AttributeDescriptorModel> value)
	{
		_alteredAttributes = getPersistenceContext().setValue(ALTEREDATTRIBUTES, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>CsTicketEventEmailConfiguration.code</code> attribute defined at extension <code>ticketsystem</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicketEventEmailConfiguration.eventType</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the eventType
	 */
	public void setEventType(final CommentTypeModel value)
	{
		_eventType = getPersistenceContext().setValue(EVENTTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicketEventEmailConfiguration.htmlTemplate</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the htmlTemplate
	 */
	public void setHtmlTemplate(final RendererTemplateModel value)
	{
		_htmlTemplate = getPersistenceContext().setValue(HTMLTEMPLATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicketEventEmailConfiguration.plainTextTemplate</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the plainTextTemplate
	 */
	public void setPlainTextTemplate(final RendererTemplateModel value)
	{
		_plainTextTemplate = getPersistenceContext().setValue(PLAINTEXTTEMPLATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicketEventEmailConfiguration.recipientType</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the recipientType
	 */
	public void setRecipientType(final CsEmailRecipients value)
	{
		_recipientType = getPersistenceContext().setValue(RECIPIENTTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicketEventEmailConfiguration.subject</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the subject
	 */
	public void setSubject(final String value)
	{
		_subject = getPersistenceContext().setValue(SUBJECT, value);
	}
	
}
