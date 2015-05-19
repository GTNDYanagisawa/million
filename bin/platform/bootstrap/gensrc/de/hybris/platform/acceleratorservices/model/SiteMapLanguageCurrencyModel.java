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
package de.hybris.platform.acceleratorservices.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SiteMapLanguageCurrency first defined at extension acceleratorservices.
 * <p>
 * Holds the language and currency combination allowed for a site.
 */
@SuppressWarnings("all")
public class SiteMapLanguageCurrencyModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SiteMapLanguageCurrency";
	
	/** <i>Generated constant</i> - Attribute key of <code>SiteMapLanguageCurrency.language</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String LANGUAGE = "language";
	
	/** <i>Generated constant</i> - Attribute key of <code>SiteMapLanguageCurrency.currency</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String CURRENCY = "currency";
	
	
	/** <i>Generated variable</i> - Variable of <code>SiteMapLanguageCurrency.language</code> attribute defined at extension <code>acceleratorservices</code>. */
	private LanguageModel _language;
	
	/** <i>Generated variable</i> - Variable of <code>SiteMapLanguageCurrency.currency</code> attribute defined at extension <code>acceleratorservices</code>. */
	private CurrencyModel _currency;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SiteMapLanguageCurrencyModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SiteMapLanguageCurrencyModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public SiteMapLanguageCurrencyModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapLanguageCurrency.currency</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the currency
	 */
	public CurrencyModel getCurrency()
	{
		if (this._currency!=null)
		{
			return _currency;
		}
		return _currency = getPersistenceContext().getValue(CURRENCY, _currency);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapLanguageCurrency.language</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the language
	 */
	public LanguageModel getLanguage()
	{
		if (this._language!=null)
		{
			return _language;
		}
		return _language = getPersistenceContext().getValue(LANGUAGE, _language);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SiteMapLanguageCurrency.currency</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the currency
	 */
	public void setCurrency(final CurrencyModel value)
	{
		_currency = getPersistenceContext().setValue(CURRENCY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SiteMapLanguageCurrency.language</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the language
	 */
	public void setLanguage(final LanguageModel value)
	{
		_language = getPersistenceContext().setValue(LANGUAGE, value);
	}
	
}
