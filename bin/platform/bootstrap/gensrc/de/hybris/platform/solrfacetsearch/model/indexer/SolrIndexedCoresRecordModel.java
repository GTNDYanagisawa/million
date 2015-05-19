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
package de.hybris.platform.solrfacetsearch.model.indexer;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.solrfacetsearch.enums.SolrServerModes;
import de.hybris.platform.solrfacetsearch.model.SolrIndexOperationRecordModel;
import java.util.Collection;
import java.util.Date;

/**
 * Generated model class for type SolrIndexedCoresRecord first defined at extension solrfacetsearch.
 */
@SuppressWarnings("all")
public class SolrIndexedCoresRecordModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SolrIndexedCoresRecord";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedCoresRecord.coreName</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String CORENAME = "coreName";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedCoresRecord.indexName</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String INDEXNAME = "indexName";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedCoresRecord.indexTime</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String INDEXTIME = "indexTime";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedCoresRecord.currentIndexDataSubDirectory</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String CURRENTINDEXDATASUBDIRECTORY = "currentIndexDataSubDirectory";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedCoresRecord.serverMode</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String SERVERMODE = "serverMode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedCoresRecord.indexOperations</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String INDEXOPERATIONS = "indexOperations";
	
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedCoresRecord.coreName</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _coreName;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedCoresRecord.indexName</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _indexName;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedCoresRecord.indexTime</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Date _indexTime;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedCoresRecord.currentIndexDataSubDirectory</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _currentIndexDataSubDirectory;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedCoresRecord.serverMode</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private SolrServerModes _serverMode;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedCoresRecord.indexOperations</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Collection<SolrIndexOperationRecordModel> _indexOperations;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SolrIndexedCoresRecordModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SolrIndexedCoresRecordModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _coreName initial attribute declared by type <code>SolrIndexedCoresRecord</code> at extension <code>solrfacetsearch</code>
	 * @param _indexName initial attribute declared by type <code>SolrIndexedCoresRecord</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrIndexedCoresRecordModel(final String _coreName, final String _indexName)
	{
		super();
		setCoreName(_coreName);
		setIndexName(_indexName);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _coreName initial attribute declared by type <code>SolrIndexedCoresRecord</code> at extension <code>solrfacetsearch</code>
	 * @param _indexName initial attribute declared by type <code>SolrIndexedCoresRecord</code> at extension <code>solrfacetsearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public SolrIndexedCoresRecordModel(final String _coreName, final String _indexName, final ItemModel _owner)
	{
		super();
		setCoreName(_coreName);
		setIndexName(_indexName);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedCoresRecord.coreName</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the coreName
	 */
	public String getCoreName()
	{
		if (this._coreName!=null)
		{
			return _coreName;
		}
		return _coreName = getPersistenceContext().getValue(CORENAME, _coreName);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedCoresRecord.currentIndexDataSubDirectory</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the currentIndexDataSubDirectory
	 */
	public String getCurrentIndexDataSubDirectory()
	{
		if (this._currentIndexDataSubDirectory!=null)
		{
			return _currentIndexDataSubDirectory;
		}
		return _currentIndexDataSubDirectory = getPersistenceContext().getValue(CURRENTINDEXDATASUBDIRECTORY, _currentIndexDataSubDirectory);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedCoresRecord.indexName</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the indexName
	 */
	public String getIndexName()
	{
		if (this._indexName!=null)
		{
			return _indexName;
		}
		return _indexName = getPersistenceContext().getValue(INDEXNAME, _indexName);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedCoresRecord.indexOperations</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the indexOperations
	 */
	public Collection<SolrIndexOperationRecordModel> getIndexOperations()
	{
		if (this._indexOperations!=null)
		{
			return _indexOperations;
		}
		return _indexOperations = getPersistenceContext().getValue(INDEXOPERATIONS, _indexOperations);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedCoresRecord.indexTime</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the indexTime
	 */
	@Deprecated
	public Date getIndexTime()
	{
		if (this._indexTime!=null)
		{
			return _indexTime;
		}
		return _indexTime = getPersistenceContext().getValue(INDEXTIME, _indexTime);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedCoresRecord.serverMode</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the serverMode
	 */
	public SolrServerModes getServerMode()
	{
		if (this._serverMode!=null)
		{
			return _serverMode;
		}
		return _serverMode = getPersistenceContext().getValue(SERVERMODE, _serverMode);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>SolrIndexedCoresRecord.coreName</code> attribute defined at extension <code>solrfacetsearch</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the coreName
	 */
	public void setCoreName(final String value)
	{
		_coreName = getPersistenceContext().setValue(CORENAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedCoresRecord.currentIndexDataSubDirectory</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the currentIndexDataSubDirectory
	 */
	public void setCurrentIndexDataSubDirectory(final String value)
	{
		_currentIndexDataSubDirectory = getPersistenceContext().setValue(CURRENTINDEXDATASUBDIRECTORY, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>SolrIndexedCoresRecord.indexName</code> attribute defined at extension <code>solrfacetsearch</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the indexName
	 */
	public void setIndexName(final String value)
	{
		_indexName = getPersistenceContext().setValue(INDEXNAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedCoresRecord.indexOperations</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the indexOperations
	 */
	public void setIndexOperations(final Collection<SolrIndexOperationRecordModel> value)
	{
		_indexOperations = getPersistenceContext().setValue(INDEXOPERATIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedCoresRecord.indexTime</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the indexTime
	 */
	@Deprecated
	public void setIndexTime(final Date value)
	{
		_indexTime = getPersistenceContext().setValue(INDEXTIME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedCoresRecord.serverMode</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the serverMode
	 */
	public void setServerMode(final SolrServerModes value)
	{
		_serverMode = getPersistenceContext().setValue(SERVERMODE, value);
	}
	
}
