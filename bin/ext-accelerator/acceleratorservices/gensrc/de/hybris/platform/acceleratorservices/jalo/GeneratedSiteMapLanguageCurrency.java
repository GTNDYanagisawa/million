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
package de.hybris.platform.acceleratorservices.jalo;

import de.hybris.platform.acceleratorservices.constants.AcceleratorServicesConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.c2l.Language;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem SiteMapLanguageCurrency}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSiteMapLanguageCurrency extends GenericItem
{
	/** Qualifier of the <code>SiteMapLanguageCurrency.language</code> attribute **/
	public static final String LANGUAGE = "language";
	/** Qualifier of the <code>SiteMapLanguageCurrency.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(LANGUAGE, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapLanguageCurrency.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapLanguageCurrency.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SiteMapLanguageCurrency.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SiteMapLanguageCurrency.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapLanguageCurrency.language</code> attribute.
	 * @return the language
	 */
	public Language getLanguage(final SessionContext ctx)
	{
		return (Language)getProperty( ctx, LANGUAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapLanguageCurrency.language</code> attribute.
	 * @return the language
	 */
	public Language getLanguage()
	{
		return getLanguage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SiteMapLanguageCurrency.language</code> attribute. 
	 * @param value the language
	 */
	public void setLanguage(final SessionContext ctx, final Language value)
	{
		setProperty(ctx, LANGUAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SiteMapLanguageCurrency.language</code> attribute. 
	 * @param value the language
	 */
	public void setLanguage(final Language value)
	{
		setLanguage( getSession().getSessionContext(), value );
	}
	
}
