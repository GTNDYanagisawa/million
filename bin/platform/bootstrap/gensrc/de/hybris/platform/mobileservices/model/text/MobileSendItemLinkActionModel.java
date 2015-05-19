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
package de.hybris.platform.mobileservices.model.text;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.deeplink.model.rules.DeeplinkUrlModel;
import de.hybris.platform.mobileservices.model.text.AbstractMobileSendActionModel;
import de.hybris.platform.servicelayer.enums.ActionType;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Locale;

/**
 * Generated model class for type MobileSendItemLinkAction first defined at extension mobileservices.
 */
@SuppressWarnings("all")
public class MobileSendItemLinkActionModel extends AbstractMobileSendActionModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "MobileSendItemLinkAction";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileSendItemLinkAction.subject</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String SUBJECT = "subject";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileSendItemLinkAction.defaultItem</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String DEFAULTITEM = "defaultItem";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileSendItemLinkAction.deeplinkUrl</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String DEEPLINKURL = "deeplinkUrl";
	
	
	/** <i>Generated variable</i> - Variable of <code>MobileSendItemLinkAction.defaultItem</code> attribute defined at extension <code>mobileservices</code>. */
	private ItemModel _defaultItem;
	
	/** <i>Generated variable</i> - Variable of <code>MobileSendItemLinkAction.deeplinkUrl</code> attribute defined at extension <code>mobileservices</code>. */
	private DeeplinkUrlModel _deeplinkUrl;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public MobileSendItemLinkActionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public MobileSendItemLinkActionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>AbstractMobileSendAction</code> at extension <code>mobileservices</code>
	 * @param _defaultItem initial attribute declared by type <code>MobileSendItemLinkAction</code> at extension <code>mobileservices</code>
	 * @param _defaultLanguage initial attribute declared by type <code>AbstractMobileSendAction</code> at extension <code>mobileservices</code>
	 * @param _target initial attribute declared by type <code>MobileSendItemLinkAction</code> at extension <code>mobileservices</code>
	 * @param _type initial attribute declared by type <code>AbstractMobileSendAction</code> at extension <code>mobileservices</code>
	 */
	@Deprecated
	public MobileSendItemLinkActionModel(final String _code, final ItemModel _defaultItem, final LanguageModel _defaultLanguage, final String _target, final ActionType _type)
	{
		super();
		setCode(_code);
		setDefaultItem(_defaultItem);
		setDefaultLanguage(_defaultLanguage);
		setTarget(_target);
		setType(_type);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>AbstractMobileSendAction</code> at extension <code>mobileservices</code>
	 * @param _defaultItem initial attribute declared by type <code>MobileSendItemLinkAction</code> at extension <code>mobileservices</code>
	 * @param _defaultLanguage initial attribute declared by type <code>AbstractMobileSendAction</code> at extension <code>mobileservices</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _target initial attribute declared by type <code>MobileSendItemLinkAction</code> at extension <code>mobileservices</code>
	 * @param _type initial attribute declared by type <code>AbstractMobileSendAction</code> at extension <code>mobileservices</code>
	 */
	@Deprecated
	public MobileSendItemLinkActionModel(final String _code, final ItemModel _defaultItem, final LanguageModel _defaultLanguage, final ItemModel _owner, final String _target, final ActionType _type)
	{
		super();
		setCode(_code);
		setDefaultItem(_defaultItem);
		setDefaultLanguage(_defaultLanguage);
		setOwner(_owner);
		setTarget(_target);
		setType(_type);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileSendItemLinkAction.deeplinkUrl</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the deeplinkUrl
	 */
	public DeeplinkUrlModel getDeeplinkUrl()
	{
		if (this._deeplinkUrl!=null)
		{
			return _deeplinkUrl;
		}
		return _deeplinkUrl = getPersistenceContext().getValue(DEEPLINKURL, _deeplinkUrl);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileSendItemLinkAction.defaultItem</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the defaultItem
	 */
	public ItemModel getDefaultItem()
	{
		if (this._defaultItem!=null)
		{
			return _defaultItem;
		}
		return _defaultItem = getPersistenceContext().getValue(DEFAULTITEM, _defaultItem);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileSendItemLinkAction.subject</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the subject
	 */
	public String getSubject()
	{
		return getSubject(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileSendItemLinkAction.subject</code> attribute defined at extension <code>mobileservices</code>. 
	 * @param loc the value localization key 
	 * @return the subject
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getSubject(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(SUBJECT, loc);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileSendItemLinkAction.deeplinkUrl</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the deeplinkUrl
	 */
	public void setDeeplinkUrl(final DeeplinkUrlModel value)
	{
		_deeplinkUrl = getPersistenceContext().setValue(DEEPLINKURL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileSendItemLinkAction.defaultItem</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the defaultItem
	 */
	public void setDefaultItem(final ItemModel value)
	{
		_defaultItem = getPersistenceContext().setValue(DEFAULTITEM, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileSendItemLinkAction.subject</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the subject
	 */
	public void setSubject(final String value)
	{
		setSubject(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>MobileSendItemLinkAction.subject</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the subject
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setSubject(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(SUBJECT, loc, value);
	}
	
}