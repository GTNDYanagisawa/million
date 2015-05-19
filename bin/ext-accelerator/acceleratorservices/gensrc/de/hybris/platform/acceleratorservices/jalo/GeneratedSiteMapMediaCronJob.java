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
import de.hybris.platform.cms2.jalo.site.CMSSite;
import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.cronjob.jalo.CronJob SiteMapMediaCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSiteMapMediaCronJob extends CronJob
{
	/** Qualifier of the <code>SiteMapMediaCronJob.contentSite</code> attribute **/
	public static final String CONTENTSITE = "contentSite";
	/** Qualifier of the <code>SiteMapMediaCronJob.siteMapUrlLimitPerFile</code> attribute **/
	public static final String SITEMAPURLLIMITPERFILE = "siteMapUrlLimitPerFile";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CONTENTSITE, AttributeMode.INITIAL);
		tmp.put(SITEMAPURLLIMITPERFILE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapMediaCronJob.contentSite</code> attribute.
	 * @return the contentSite
	 */
	public CMSSite getContentSite(final SessionContext ctx)
	{
		return (CMSSite)getProperty( ctx, CONTENTSITE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapMediaCronJob.contentSite</code> attribute.
	 * @return the contentSite
	 */
	public CMSSite getContentSite()
	{
		return getContentSite( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SiteMapMediaCronJob.contentSite</code> attribute. 
	 * @param value the contentSite
	 */
	public void setContentSite(final SessionContext ctx, final CMSSite value)
	{
		setProperty(ctx, CONTENTSITE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SiteMapMediaCronJob.contentSite</code> attribute. 
	 * @param value the contentSite
	 */
	public void setContentSite(final CMSSite value)
	{
		setContentSite( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapMediaCronJob.siteMapUrlLimitPerFile</code> attribute.
	 * @return the siteMapUrlLimitPerFile
	 */
	public Integer getSiteMapUrlLimitPerFile(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, SITEMAPURLLIMITPERFILE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapMediaCronJob.siteMapUrlLimitPerFile</code> attribute.
	 * @return the siteMapUrlLimitPerFile
	 */
	public Integer getSiteMapUrlLimitPerFile()
	{
		return getSiteMapUrlLimitPerFile( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapMediaCronJob.siteMapUrlLimitPerFile</code> attribute. 
	 * @return the siteMapUrlLimitPerFile
	 */
	public int getSiteMapUrlLimitPerFileAsPrimitive(final SessionContext ctx)
	{
		Integer value = getSiteMapUrlLimitPerFile( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapMediaCronJob.siteMapUrlLimitPerFile</code> attribute. 
	 * @return the siteMapUrlLimitPerFile
	 */
	public int getSiteMapUrlLimitPerFileAsPrimitive()
	{
		return getSiteMapUrlLimitPerFileAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SiteMapMediaCronJob.siteMapUrlLimitPerFile</code> attribute. 
	 * @param value the siteMapUrlLimitPerFile
	 */
	public void setSiteMapUrlLimitPerFile(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, SITEMAPURLLIMITPERFILE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SiteMapMediaCronJob.siteMapUrlLimitPerFile</code> attribute. 
	 * @param value the siteMapUrlLimitPerFile
	 */
	public void setSiteMapUrlLimitPerFile(final Integer value)
	{
		setSiteMapUrlLimitPerFile( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SiteMapMediaCronJob.siteMapUrlLimitPerFile</code> attribute. 
	 * @param value the siteMapUrlLimitPerFile
	 */
	public void setSiteMapUrlLimitPerFile(final SessionContext ctx, final int value)
	{
		setSiteMapUrlLimitPerFile( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SiteMapMediaCronJob.siteMapUrlLimitPerFile</code> attribute. 
	 * @param value the siteMapUrlLimitPerFile
	 */
	public void setSiteMapUrlLimitPerFile(final int value)
	{
		setSiteMapUrlLimitPerFile( getSession().getSessionContext(), value );
	}
	
}
