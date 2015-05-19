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
package de.hybris.platform.solrfacetsearch.model.config;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.solrfacetsearch.enums.IndexMode;

/**
 * Generated model class for type SolrIndexConfig first defined at extension solrfacetsearch.
 */
@SuppressWarnings("all")
public class SolrIndexConfigModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SolrIndexConfig";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexConfig.name</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexConfig.batchSize</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String BATCHSIZE = "batchSize";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexConfig.exportPath</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String EXPORTPATH = "exportPath";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexConfig.numberOfThreads</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String NUMBEROFTHREADS = "numberOfThreads";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexConfig.indexMode</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String INDEXMODE = "indexMode";
	
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexConfig.name</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _name;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexConfig.batchSize</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Integer _batchSize;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexConfig.exportPath</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _exportPath;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexConfig.numberOfThreads</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Integer _numberOfThreads;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexConfig.indexMode</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private IndexMode _indexMode;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SolrIndexConfigModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SolrIndexConfigModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _name initial attribute declared by type <code>SolrIndexConfig</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrIndexConfigModel(final String _name)
	{
		super();
		setName(_name);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _name initial attribute declared by type <code>SolrIndexConfig</code> at extension <code>solrfacetsearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public SolrIndexConfigModel(final String _name, final ItemModel _owner)
	{
		super();
		setName(_name);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexConfig.batchSize</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the batchSize
	 */
	public int getBatchSize()
	{
		return toPrimitive( _batchSize = getPersistenceContext().getValue(BATCHSIZE, _batchSize));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexConfig.exportPath</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the exportPath
	 */
	public String getExportPath()
	{
		if (this._exportPath!=null)
		{
			return _exportPath;
		}
		return _exportPath = getPersistenceContext().getValue(EXPORTPATH, _exportPath);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexConfig.indexMode</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the indexMode
	 */
	public IndexMode getIndexMode()
	{
		if (this._indexMode!=null)
		{
			return _indexMode;
		}
		return _indexMode = getPersistenceContext().getValue(INDEXMODE, _indexMode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexConfig.name</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the name - unique identifier of indexer configuration
	 */
	public String getName()
	{
		if (this._name!=null)
		{
			return _name;
		}
		return _name = getPersistenceContext().getValue(NAME, _name);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexConfig.numberOfThreads</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the numberOfThreads
	 */
	public int getNumberOfThreads()
	{
		return toPrimitive( _numberOfThreads = getPersistenceContext().getValue(NUMBEROFTHREADS, _numberOfThreads));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexConfig.batchSize</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the batchSize
	 */
	public void setBatchSize(final int value)
	{
		_batchSize = getPersistenceContext().setValue(BATCHSIZE, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexConfig.exportPath</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the exportPath
	 */
	public void setExportPath(final String value)
	{
		_exportPath = getPersistenceContext().setValue(EXPORTPATH, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexConfig.indexMode</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the indexMode
	 */
	public void setIndexMode(final IndexMode value)
	{
		_indexMode = getPersistenceContext().setValue(INDEXMODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>SolrIndexConfig.name</code> attribute defined at extension <code>solrfacetsearch</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the name - unique identifier of indexer configuration
	 */
	public void setName(final String value)
	{
		_name = getPersistenceContext().setValue(NAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexConfig.numberOfThreads</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the numberOfThreads
	 */
	public void setNumberOfThreads(final int value)
	{
		_numberOfThreads = getPersistenceContext().setValue(NUMBEROFTHREADS, toObject(value));
	}
	
}
