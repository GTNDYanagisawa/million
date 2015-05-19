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
import de.hybris.platform.acceleratorservices.jalo.SiteMapLanguageCurrency;
import de.hybris.platform.acceleratorservices.jalo.SiteMapPage;
import de.hybris.platform.commons.jalo.renderer.RendererTemplate;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem SiteMapConfig}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSiteMapConfig extends GenericItem
{
	/** Qualifier of the <code>SiteMapConfig.configId</code> attribute **/
	public static final String CONFIGID = "configId";
	/** Qualifier of the <code>SiteMapConfig.siteMapLanguageCurrencies</code> attribute **/
	public static final String SITEMAPLANGUAGECURRENCIES = "siteMapLanguageCurrencies";
	/** Qualifier of the <code>SiteMapConfig.siteMapPages</code> attribute **/
	public static final String SITEMAPPAGES = "siteMapPages";
	/** Qualifier of the <code>SiteMapConfig.siteMapTemplate</code> attribute **/
	public static final String SITEMAPTEMPLATE = "siteMapTemplate";
	/** Qualifier of the <code>SiteMapConfig.customUrls</code> attribute **/
	public static final String CUSTOMURLS = "customUrls";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CONFIGID, AttributeMode.INITIAL);
		tmp.put(SITEMAPLANGUAGECURRENCIES, AttributeMode.INITIAL);
		tmp.put(SITEMAPPAGES, AttributeMode.INITIAL);
		tmp.put(SITEMAPTEMPLATE, AttributeMode.INITIAL);
		tmp.put(CUSTOMURLS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapConfig.configId</code> attribute.
	 * @return the configId
	 */
	public String getConfigId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONFIGID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapConfig.configId</code> attribute.
	 * @return the configId
	 */
	public String getConfigId()
	{
		return getConfigId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SiteMapConfig.configId</code> attribute. 
	 * @param value the configId
	 */
	public void setConfigId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONFIGID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SiteMapConfig.configId</code> attribute. 
	 * @param value the configId
	 */
	public void setConfigId(final String value)
	{
		setConfigId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapConfig.customUrls</code> attribute.
	 * @return the customUrls
	 */
	public Collection<String> getCustomUrls(final SessionContext ctx)
	{
		Collection<String> coll = (Collection<String>)getProperty( ctx, CUSTOMURLS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapConfig.customUrls</code> attribute.
	 * @return the customUrls
	 */
	public Collection<String> getCustomUrls()
	{
		return getCustomUrls( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SiteMapConfig.customUrls</code> attribute. 
	 * @param value the customUrls
	 */
	public void setCustomUrls(final SessionContext ctx, final Collection<String> value)
	{
		setProperty(ctx, CUSTOMURLS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SiteMapConfig.customUrls</code> attribute. 
	 * @param value the customUrls
	 */
	public void setCustomUrls(final Collection<String> value)
	{
		setCustomUrls( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapConfig.siteMapLanguageCurrencies</code> attribute.
	 * @return the siteMapLanguageCurrencies
	 */
	public Collection<SiteMapLanguageCurrency> getSiteMapLanguageCurrencies(final SessionContext ctx)
	{
		Collection<SiteMapLanguageCurrency> coll = (Collection<SiteMapLanguageCurrency>)getProperty( ctx, SITEMAPLANGUAGECURRENCIES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapConfig.siteMapLanguageCurrencies</code> attribute.
	 * @return the siteMapLanguageCurrencies
	 */
	public Collection<SiteMapLanguageCurrency> getSiteMapLanguageCurrencies()
	{
		return getSiteMapLanguageCurrencies( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SiteMapConfig.siteMapLanguageCurrencies</code> attribute. 
	 * @param value the siteMapLanguageCurrencies
	 */
	public void setSiteMapLanguageCurrencies(final SessionContext ctx, final Collection<SiteMapLanguageCurrency> value)
	{
		setProperty(ctx, SITEMAPLANGUAGECURRENCIES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SiteMapConfig.siteMapLanguageCurrencies</code> attribute. 
	 * @param value the siteMapLanguageCurrencies
	 */
	public void setSiteMapLanguageCurrencies(final Collection<SiteMapLanguageCurrency> value)
	{
		setSiteMapLanguageCurrencies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapConfig.siteMapPages</code> attribute.
	 * @return the siteMapPages
	 */
	public Collection<SiteMapPage> getSiteMapPages(final SessionContext ctx)
	{
		Collection<SiteMapPage> coll = (Collection<SiteMapPage>)getProperty( ctx, SITEMAPPAGES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapConfig.siteMapPages</code> attribute.
	 * @return the siteMapPages
	 */
	public Collection<SiteMapPage> getSiteMapPages()
	{
		return getSiteMapPages( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SiteMapConfig.siteMapPages</code> attribute. 
	 * @param value the siteMapPages
	 */
	public void setSiteMapPages(final SessionContext ctx, final Collection<SiteMapPage> value)
	{
		setProperty(ctx, SITEMAPPAGES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SiteMapConfig.siteMapPages</code> attribute. 
	 * @param value the siteMapPages
	 */
	public void setSiteMapPages(final Collection<SiteMapPage> value)
	{
		setSiteMapPages( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapConfig.siteMapTemplate</code> attribute.
	 * @return the siteMapTemplate
	 */
	public RendererTemplate getSiteMapTemplate(final SessionContext ctx)
	{
		return (RendererTemplate)getProperty( ctx, SITEMAPTEMPLATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapConfig.siteMapTemplate</code> attribute.
	 * @return the siteMapTemplate
	 */
	public RendererTemplate getSiteMapTemplate()
	{
		return getSiteMapTemplate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SiteMapConfig.siteMapTemplate</code> attribute. 
	 * @param value the siteMapTemplate
	 */
	public void setSiteMapTemplate(final SessionContext ctx, final RendererTemplate value)
	{
		setProperty(ctx, SITEMAPTEMPLATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SiteMapConfig.siteMapTemplate</code> attribute. 
	 * @param value the siteMapTemplate
	 */
	public void setSiteMapTemplate(final RendererTemplate value)
	{
		setSiteMapTemplate( getSession().getSessionContext(), value );
	}
	
}
