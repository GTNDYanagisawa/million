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
package de.hybris.platform.acceleratorservices.model.cms2.pages;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.cms2.model.pages.PageTemplateModel;
import de.hybris.platform.commons.model.renderer.RendererTemplateModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type EmailPageTemplate first defined at extension acceleratorservices.
 * <p>
 * Represents template to generate email messages.
 */
@SuppressWarnings("all")
public class EmailPageTemplateModel extends PageTemplateModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "EmailPageTemplate";
	
	/** <i>Generated constant</i> - Attribute key of <code>EmailPageTemplate.htmlTemplate</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String HTMLTEMPLATE = "htmlTemplate";
	
	/** <i>Generated constant</i> - Attribute key of <code>EmailPageTemplate.subject</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String SUBJECT = "subject";
	
	
	/** <i>Generated variable</i> - Variable of <code>EmailPageTemplate.htmlTemplate</code> attribute defined at extension <code>acceleratorservices</code>. */
	private RendererTemplateModel _htmlTemplate;
	
	/** <i>Generated variable</i> - Variable of <code>EmailPageTemplate.subject</code> attribute defined at extension <code>acceleratorservices</code>. */
	private RendererTemplateModel _subject;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public EmailPageTemplateModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public EmailPageTemplateModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public EmailPageTemplateModel(final CatalogVersionModel _catalogVersion, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public EmailPageTemplateModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailPageTemplate.htmlTemplate</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the htmlTemplate - Contains renderer that generates body of the email message.
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
	 * <i>Generated method</i> - Getter of the <code>EmailPageTemplate.subject</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the subject - Contains renderer that generates subject of the email message.
	 */
	public RendererTemplateModel getSubject()
	{
		if (this._subject!=null)
		{
			return _subject;
		}
		return _subject = getPersistenceContext().getValue(SUBJECT, _subject);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>EmailPageTemplate.htmlTemplate</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the htmlTemplate - Contains renderer that generates body of the email message.
	 */
	public void setHtmlTemplate(final RendererTemplateModel value)
	{
		_htmlTemplate = getPersistenceContext().setValue(HTMLTEMPLATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>EmailPageTemplate.subject</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the subject - Contains renderer that generates subject of the email message.
	 */
	public void setSubject(final RendererTemplateModel value)
	{
		_subject = getPersistenceContext().setValue(SUBJECT, value);
	}
	
}
