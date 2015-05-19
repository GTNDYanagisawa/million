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
import de.hybris.platform.solrfacetsearch.model.config.SolrServerConfigModel;

/**
 * Generated model class for type SolrEndpointUrl first defined at extension solrfacetsearch.
 */
@SuppressWarnings("all")
public class SolrEndpointUrlModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SolrEndpointUrl";
	
	/**<i>Generated relation code constant for relation <code>SolrServerConfig2SolrEndpointUrl</code> defining source attribute <code>solrServerConfig</code> in extension <code>solrfacetsearch</code>.</i>*/
	public final static String _SOLRSERVERCONFIG2SOLRENDPOINTURL = "SolrServerConfig2SolrEndpointUrl";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrEndpointUrl.url</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String URL = "url";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrEndpointUrl.master</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String MASTER = "master";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrEndpointUrl.solrServerConfig</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String SOLRSERVERCONFIG = "solrServerConfig";
	
	
	/** <i>Generated variable</i> - Variable of <code>SolrEndpointUrl.url</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _url;
	
	/** <i>Generated variable</i> - Variable of <code>SolrEndpointUrl.master</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Boolean _master;
	
	/** <i>Generated variable</i> - Variable of <code>SolrEndpointUrl.solrServerConfig</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private SolrServerConfigModel _solrServerConfig;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SolrEndpointUrlModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SolrEndpointUrlModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _url initial attribute declared by type <code>SolrEndpointUrl</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrEndpointUrlModel(final String _url)
	{
		super();
		setUrl(_url);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _url initial attribute declared by type <code>SolrEndpointUrl</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrEndpointUrlModel(final ItemModel _owner, final String _url)
	{
		super();
		setOwner(_owner);
		setUrl(_url);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrEndpointUrl.solrServerConfig</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the solrServerConfig
	 */
	public SolrServerConfigModel getSolrServerConfig()
	{
		if (this._solrServerConfig!=null)
		{
			return _solrServerConfig;
		}
		return _solrServerConfig = getPersistenceContext().getValue(SOLRSERVERCONFIG, _solrServerConfig);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrEndpointUrl.url</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the url
	 */
	public String getUrl()
	{
		if (this._url!=null)
		{
			return _url;
		}
		return _url = getPersistenceContext().getValue(URL, _url);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrEndpointUrl.master</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the master
	 */
	public boolean isMaster()
	{
		return toPrimitive( _master = getPersistenceContext().getValue(MASTER, _master));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrEndpointUrl.master</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the master
	 */
	public void setMaster(final boolean value)
	{
		_master = getPersistenceContext().setValue(MASTER, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrEndpointUrl.solrServerConfig</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the solrServerConfig
	 */
	public void setSolrServerConfig(final SolrServerConfigModel value)
	{
		_solrServerConfig = getPersistenceContext().setValue(SOLRSERVERCONFIG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrEndpointUrl.url</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the url
	 */
	public void setUrl(final String value)
	{
		_url = getPersistenceContext().setValue(URL, value);
	}
	
}
