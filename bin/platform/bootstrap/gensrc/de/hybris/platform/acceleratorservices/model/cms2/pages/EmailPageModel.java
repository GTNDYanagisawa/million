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
import de.hybris.platform.cms2.model.pages.AbstractPageModel;
import de.hybris.platform.cms2.model.pages.PageTemplateModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Locale;

/**
 * Generated model class for type EmailPage first defined at extension acceleratorservices.
 * <p>
 * Represents generated or created email page. Extends AbstractPage type without adding any new attribute.
 */
@SuppressWarnings("all")
public class EmailPageModel extends AbstractPageModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "EmailPage";
	
	/** <i>Generated constant</i> - Attribute key of <code>EmailPage.fromEmail</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String FROMEMAIL = "fromEmail";
	
	/** <i>Generated constant</i> - Attribute key of <code>EmailPage.fromName</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String FROMNAME = "fromName";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public EmailPageModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public EmailPageModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _masterTemplate initial attribute declared by type <code>AbstractPage</code> at extension <code>cms2</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public EmailPageModel(final CatalogVersionModel _catalogVersion, final PageTemplateModel _masterTemplate, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setMasterTemplate(_masterTemplate);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _masterTemplate initial attribute declared by type <code>AbstractPage</code> at extension <code>cms2</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public EmailPageModel(final CatalogVersionModel _catalogVersion, final PageTemplateModel _masterTemplate, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setMasterTemplate(_masterTemplate);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailPage.fromEmail</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the fromEmail - Holds email From address information for the email page.
	 */
	public String getFromEmail()
	{
		return getFromEmail(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailPage.fromEmail</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @param loc the value localization key 
	 * @return the fromEmail - Holds email From address information for the email page.
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getFromEmail(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(FROMEMAIL, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailPage.fromName</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the fromName - Holds email address From name information for the email page.
	 */
	public String getFromName()
	{
		return getFromName(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailPage.fromName</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @param loc the value localization key 
	 * @return the fromName - Holds email address From name information for the email page.
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getFromName(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(FROMNAME, loc);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>EmailPage.fromEmail</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the fromEmail - Holds email From address information for the email page.
	 */
	public void setFromEmail(final String value)
	{
		setFromEmail(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>EmailPage.fromEmail</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the fromEmail - Holds email From address information for the email page.
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setFromEmail(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(FROMEMAIL, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>EmailPage.fromName</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the fromName - Holds email address From name information for the email page.
	 */
	public void setFromName(final String value)
	{
		setFromName(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>EmailPage.fromName</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the fromName - Holds email address From name information for the email page.
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setFromName(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(FROMNAME, loc, value);
	}
	
}
