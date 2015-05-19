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
package de.hybris.platform.solrfacetsearch.model.reporting;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.solrfacetsearch.model.config.SolrFacetSearchConfigModel;
import java.util.Date;

/**
 * Generated model class for type SolrQueryAggregatedStats first defined at extension solrfacetsearch.
 */
@SuppressWarnings("all")
public class SolrQueryAggregatedStatsModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SolrQueryAggregatedStats";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrQueryAggregatedStats.time</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String TIME = "time";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrQueryAggregatedStats.indexConfig</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String INDEXCONFIG = "indexConfig";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrQueryAggregatedStats.language</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String LANGUAGE = "language";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrQueryAggregatedStats.query</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String QUERY = "query";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrQueryAggregatedStats.count</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String COUNT = "count";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrQueryAggregatedStats.avgNumberOfResults</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String AVGNUMBEROFRESULTS = "avgNumberOfResults";
	
	
	/** <i>Generated variable</i> - Variable of <code>SolrQueryAggregatedStats.time</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Date _time;
	
	/** <i>Generated variable</i> - Variable of <code>SolrQueryAggregatedStats.indexConfig</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private SolrFacetSearchConfigModel _indexConfig;
	
	/** <i>Generated variable</i> - Variable of <code>SolrQueryAggregatedStats.language</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private LanguageModel _language;
	
	/** <i>Generated variable</i> - Variable of <code>SolrQueryAggregatedStats.query</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _query;
	
	/** <i>Generated variable</i> - Variable of <code>SolrQueryAggregatedStats.count</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Long _count;
	
	/** <i>Generated variable</i> - Variable of <code>SolrQueryAggregatedStats.avgNumberOfResults</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Double _avgNumberOfResults;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SolrQueryAggregatedStatsModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SolrQueryAggregatedStatsModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _avgNumberOfResults initial attribute declared by type <code>SolrQueryAggregatedStats</code> at extension <code>solrfacetsearch</code>
	 * @param _count initial attribute declared by type <code>SolrQueryAggregatedStats</code> at extension <code>solrfacetsearch</code>
	 * @param _indexConfig initial attribute declared by type <code>SolrQueryAggregatedStats</code> at extension <code>solrfacetsearch</code>
	 * @param _language initial attribute declared by type <code>SolrQueryAggregatedStats</code> at extension <code>solrfacetsearch</code>
	 * @param _query initial attribute declared by type <code>SolrQueryAggregatedStats</code> at extension <code>solrfacetsearch</code>
	 * @param _time initial attribute declared by type <code>SolrQueryAggregatedStats</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrQueryAggregatedStatsModel(final double _avgNumberOfResults, final long _count, final SolrFacetSearchConfigModel _indexConfig, final LanguageModel _language, final String _query, final Date _time)
	{
		super();
		setAvgNumberOfResults(_avgNumberOfResults);
		setCount(_count);
		setIndexConfig(_indexConfig);
		setLanguage(_language);
		setQuery(_query);
		setTime(_time);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _avgNumberOfResults initial attribute declared by type <code>SolrQueryAggregatedStats</code> at extension <code>solrfacetsearch</code>
	 * @param _count initial attribute declared by type <code>SolrQueryAggregatedStats</code> at extension <code>solrfacetsearch</code>
	 * @param _indexConfig initial attribute declared by type <code>SolrQueryAggregatedStats</code> at extension <code>solrfacetsearch</code>
	 * @param _language initial attribute declared by type <code>SolrQueryAggregatedStats</code> at extension <code>solrfacetsearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _query initial attribute declared by type <code>SolrQueryAggregatedStats</code> at extension <code>solrfacetsearch</code>
	 * @param _time initial attribute declared by type <code>SolrQueryAggregatedStats</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrQueryAggregatedStatsModel(final double _avgNumberOfResults, final long _count, final SolrFacetSearchConfigModel _indexConfig, final LanguageModel _language, final ItemModel _owner, final String _query, final Date _time)
	{
		super();
		setAvgNumberOfResults(_avgNumberOfResults);
		setCount(_count);
		setIndexConfig(_indexConfig);
		setLanguage(_language);
		setOwner(_owner);
		setQuery(_query);
		setTime(_time);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrQueryAggregatedStats.avgNumberOfResults</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the avgNumberOfResults
	 */
	public double getAvgNumberOfResults()
	{
		return toPrimitive( _avgNumberOfResults = getPersistenceContext().getValue(AVGNUMBEROFRESULTS, _avgNumberOfResults));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrQueryAggregatedStats.count</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the count
	 */
	public long getCount()
	{
		return toPrimitive( _count = getPersistenceContext().getValue(COUNT, _count));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrQueryAggregatedStats.indexConfig</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the indexConfig
	 */
	public SolrFacetSearchConfigModel getIndexConfig()
	{
		if (this._indexConfig!=null)
		{
			return _indexConfig;
		}
		return _indexConfig = getPersistenceContext().getValue(INDEXCONFIG, _indexConfig);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrQueryAggregatedStats.language</code> attribute defined at extension <code>solrfacetsearch</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>SolrQueryAggregatedStats.query</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the query
	 */
	public String getQuery()
	{
		if (this._query!=null)
		{
			return _query;
		}
		return _query = getPersistenceContext().getValue(QUERY, _query);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrQueryAggregatedStats.time</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the time
	 */
	public Date getTime()
	{
		if (this._time!=null)
		{
			return _time;
		}
		return _time = getPersistenceContext().getValue(TIME, _time);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrQueryAggregatedStats.avgNumberOfResults</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the avgNumberOfResults
	 */
	public void setAvgNumberOfResults(final double value)
	{
		_avgNumberOfResults = getPersistenceContext().setValue(AVGNUMBEROFRESULTS, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrQueryAggregatedStats.count</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the count
	 */
	public void setCount(final long value)
	{
		_count = getPersistenceContext().setValue(COUNT, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrQueryAggregatedStats.indexConfig</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the indexConfig
	 */
	public void setIndexConfig(final SolrFacetSearchConfigModel value)
	{
		_indexConfig = getPersistenceContext().setValue(INDEXCONFIG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrQueryAggregatedStats.language</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the language
	 */
	public void setLanguage(final LanguageModel value)
	{
		_language = getPersistenceContext().setValue(LANGUAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrQueryAggregatedStats.query</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the query
	 */
	public void setQuery(final String value)
	{
		_query = getPersistenceContext().setValue(QUERY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrQueryAggregatedStats.time</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the time
	 */
	public void setTime(final Date value)
	{
		_time = getPersistenceContext().setValue(TIME, value);
	}
	
}
