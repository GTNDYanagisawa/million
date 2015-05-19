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
package de.hybris.platform.solrfacetsearch.model.cron;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.cronjob.model.JobModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.solrfacetsearch.model.config.SolrFacetSearchConfigModel;

/**
 * Generated model class for type SolrUpdateStopWordsCronJob first defined at extension solrfacetsearch.
 */
@SuppressWarnings("all")
public class SolrUpdateStopWordsCronJobModel extends CronJobModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SolrUpdateStopWordsCronJob";
	
	/**<i>Generated relation code constant for relation <code>SolrFacetSearchConfig2SolrUpdateStopWordsCronJob</code> defining source attribute <code>solrFacetSearchConfig</code> in extension <code>solrfacetsearch</code>.</i>*/
	public final static String _SOLRFACETSEARCHCONFIG2SOLRUPDATESTOPWORDSCRONJOB = "SolrFacetSearchConfig2SolrUpdateStopWordsCronJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrUpdateStopWordsCronJob.language</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String LANGUAGE = "language";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrUpdateStopWordsCronJob.solrFacetSearchConfig</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String SOLRFACETSEARCHCONFIG = "solrFacetSearchConfig";
	
	
	/** <i>Generated variable</i> - Variable of <code>SolrUpdateStopWordsCronJob.language</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private LanguageModel _language;
	
	/** <i>Generated variable</i> - Variable of <code>SolrUpdateStopWordsCronJob.solrFacetSearchConfig</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private SolrFacetSearchConfigModel _solrFacetSearchConfig;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SolrUpdateStopWordsCronJobModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SolrUpdateStopWordsCronJobModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 * @param _solrFacetSearchConfig initial attribute declared by type <code>SolrUpdateStopWordsCronJob</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrUpdateStopWordsCronJobModel(final JobModel _job, final SolrFacetSearchConfigModel _solrFacetSearchConfig)
	{
		super();
		setJob(_job);
		setSolrFacetSearchConfig(_solrFacetSearchConfig);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _solrFacetSearchConfig initial attribute declared by type <code>SolrUpdateStopWordsCronJob</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrUpdateStopWordsCronJobModel(final JobModel _job, final ItemModel _owner, final SolrFacetSearchConfigModel _solrFacetSearchConfig)
	{
		super();
		setJob(_job);
		setOwner(_owner);
		setSolrFacetSearchConfig(_solrFacetSearchConfig);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrUpdateStopWordsCronJob.language</code> attribute defined at extension <code>solrfacetsearch</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>SolrUpdateStopWordsCronJob.solrFacetSearchConfig</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the solrFacetSearchConfig
	 */
	public SolrFacetSearchConfigModel getSolrFacetSearchConfig()
	{
		if (this._solrFacetSearchConfig!=null)
		{
			return _solrFacetSearchConfig;
		}
		return _solrFacetSearchConfig = getPersistenceContext().getValue(SOLRFACETSEARCHCONFIG, _solrFacetSearchConfig);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrUpdateStopWordsCronJob.language</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the language
	 */
	public void setLanguage(final LanguageModel value)
	{
		_language = getPersistenceContext().setValue(LANGUAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrUpdateStopWordsCronJob.solrFacetSearchConfig</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the solrFacetSearchConfig
	 */
	public void setSolrFacetSearchConfig(final SolrFacetSearchConfigModel value)
	{
		_solrFacetSearchConfig = getPersistenceContext().setValue(SOLRFACETSEARCHCONFIG, value);
	}
	
}
