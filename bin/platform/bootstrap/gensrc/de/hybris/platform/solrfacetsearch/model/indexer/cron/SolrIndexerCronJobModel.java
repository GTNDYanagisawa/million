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
package de.hybris.platform.solrfacetsearch.model.indexer.cron;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.cronjob.model.JobModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.solrfacetsearch.enums.IndexerOperationValues;
import de.hybris.platform.solrfacetsearch.model.config.SolrFacetSearchConfigModel;

/**
 * Generated model class for type SolrIndexerCronJob first defined at extension solrfacetsearch.
 */
@SuppressWarnings("all")
public class SolrIndexerCronJobModel extends CronJobModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SolrIndexerCronJob";
	
	/**<i>Generated relation code constant for relation <code>SolrFacetSearchConfig2SolrIndexerCronJob</code> defining source attribute <code>facetSearchConfig</code> in extension <code>solrfacetsearch</code>.</i>*/
	public final static String _SOLRFACETSEARCHCONFIG2SOLRINDEXERCRONJOB = "SolrFacetSearchConfig2SolrIndexerCronJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexerCronJob.indexerOperation</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String INDEXEROPERATION = "indexerOperation";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexerCronJob.facetSearchConfig</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String FACETSEARCHCONFIG = "facetSearchConfig";
	
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexerCronJob.indexerOperation</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private IndexerOperationValues _indexerOperation;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexerCronJob.facetSearchConfig</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private SolrFacetSearchConfigModel _facetSearchConfig;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SolrIndexerCronJobModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SolrIndexerCronJobModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _facetSearchConfig initial attribute declared by type <code>SolrIndexerCronJob</code> at extension <code>solrfacetsearch</code>
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 */
	@Deprecated
	public SolrIndexerCronJobModel(final SolrFacetSearchConfigModel _facetSearchConfig, final JobModel _job)
	{
		super();
		setFacetSearchConfig(_facetSearchConfig);
		setJob(_job);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _facetSearchConfig initial attribute declared by type <code>SolrIndexerCronJob</code> at extension <code>solrfacetsearch</code>
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public SolrIndexerCronJobModel(final SolrFacetSearchConfigModel _facetSearchConfig, final JobModel _job, final ItemModel _owner)
	{
		super();
		setFacetSearchConfig(_facetSearchConfig);
		setJob(_job);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexerCronJob.facetSearchConfig</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the facetSearchConfig
	 */
	public SolrFacetSearchConfigModel getFacetSearchConfig()
	{
		if (this._facetSearchConfig!=null)
		{
			return _facetSearchConfig;
		}
		return _facetSearchConfig = getPersistenceContext().getValue(FACETSEARCHCONFIG, _facetSearchConfig);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexerCronJob.indexerOperation</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the indexerOperation
	 */
	public IndexerOperationValues getIndexerOperation()
	{
		if (this._indexerOperation!=null)
		{
			return _indexerOperation;
		}
		return _indexerOperation = getPersistenceContext().getValue(INDEXEROPERATION, _indexerOperation);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexerCronJob.facetSearchConfig</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the facetSearchConfig
	 */
	public void setFacetSearchConfig(final SolrFacetSearchConfigModel value)
	{
		_facetSearchConfig = getPersistenceContext().setValue(FACETSEARCHCONFIG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexerCronJob.indexerOperation</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the indexerOperation
	 */
	public void setIndexerOperation(final IndexerOperationValues value)
	{
		_indexerOperation = getPersistenceContext().setValue(INDEXEROPERATION, value);
	}
	
}
