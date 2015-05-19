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

import de.hybris.platform.cms2.model.site.CMSSiteModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.cronjob.model.JobModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SiteMapMediaCronJob first defined at extension acceleratorservices.
 * <p>
 * Cronjob to generate the sitemap media per site.
 */
@SuppressWarnings("all")
public class SiteMapMediaCronJobModel extends CronJobModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SiteMapMediaCronJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>SiteMapMediaCronJob.contentSite</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String CONTENTSITE = "contentSite";
	
	/** <i>Generated constant</i> - Attribute key of <code>SiteMapMediaCronJob.siteMapUrlLimitPerFile</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String SITEMAPURLLIMITPERFILE = "siteMapUrlLimitPerFile";
	
	
	/** <i>Generated variable</i> - Variable of <code>SiteMapMediaCronJob.contentSite</code> attribute defined at extension <code>acceleratorservices</code>. */
	private CMSSiteModel _contentSite;
	
	/** <i>Generated variable</i> - Variable of <code>SiteMapMediaCronJob.siteMapUrlLimitPerFile</code> attribute defined at extension <code>acceleratorservices</code>. */
	private Integer _siteMapUrlLimitPerFile;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SiteMapMediaCronJobModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SiteMapMediaCronJobModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 */
	@Deprecated
	public SiteMapMediaCronJobModel(final JobModel _job)
	{
		super();
		setJob(_job);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public SiteMapMediaCronJobModel(final JobModel _job, final ItemModel _owner)
	{
		super();
		setJob(_job);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapMediaCronJob.contentSite</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the contentSite
	 */
	public CMSSiteModel getContentSite()
	{
		if (this._contentSite!=null)
		{
			return _contentSite;
		}
		return _contentSite = getPersistenceContext().getValue(CONTENTSITE, _contentSite);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapMediaCronJob.siteMapUrlLimitPerFile</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the siteMapUrlLimitPerFile
	 */
	public Integer getSiteMapUrlLimitPerFile()
	{
		if (this._siteMapUrlLimitPerFile!=null)
		{
			return _siteMapUrlLimitPerFile;
		}
		return _siteMapUrlLimitPerFile = getPersistenceContext().getValue(SITEMAPURLLIMITPERFILE, _siteMapUrlLimitPerFile);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SiteMapMediaCronJob.contentSite</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the contentSite
	 */
	public void setContentSite(final CMSSiteModel value)
	{
		_contentSite = getPersistenceContext().setValue(CONTENTSITE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SiteMapMediaCronJob.siteMapUrlLimitPerFile</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the siteMapUrlLimitPerFile
	 */
	public void setSiteMapUrlLimitPerFile(final Integer value)
	{
		_siteMapUrlLimitPerFile = getPersistenceContext().setValue(SITEMAPURLLIMITPERFILE, value);
	}
	
}
