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
import de.hybris.platform.solrfacetsearch.enums.SolrServerModes;
import de.hybris.platform.solrfacetsearch.model.config.SolrEndpointUrlModel;
import java.util.List;

/**
 * Generated model class for type SolrServerConfig first defined at extension solrfacetsearch.
 */
@SuppressWarnings("all")
public class SolrServerConfigModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SolrServerConfig";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrServerConfig.name</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrServerConfig.mode</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String MODE = "mode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrServerConfig.embeddedMaster</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String EMBEDDEDMASTER = "embeddedMaster";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrServerConfig.aliveCheckInterval</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String ALIVECHECKINTERVAL = "aliveCheckInterval";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrServerConfig.connectionTimeout</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String CONNECTIONTIMEOUT = "connectionTimeout";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrServerConfig.socketTimeout</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String SOCKETTIMEOUT = "socketTimeout";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrServerConfig.tcpNoDelay</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String TCPNODELAY = "tcpNoDelay";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrServerConfig.maxTotalConnections</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String MAXTOTALCONNECTIONS = "maxTotalConnections";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrServerConfig.maxTotalConnectionsPerHostConfig</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String MAXTOTALCONNECTIONSPERHOSTCONFIG = "maxTotalConnectionsPerHostConfig";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrServerConfig.readTimeout</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String READTIMEOUT = "readTimeout";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrServerConfig.useMasterNodeExclusivelyForIndexing</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String USEMASTERNODEEXCLUSIVELYFORINDEXING = "useMasterNodeExclusivelyForIndexing";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrServerConfig.solrEndpointUrls</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String SOLRENDPOINTURLS = "solrEndpointUrls";
	
	
	/** <i>Generated variable</i> - Variable of <code>SolrServerConfig.name</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _name;
	
	/** <i>Generated variable</i> - Variable of <code>SolrServerConfig.mode</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private SolrServerModes _mode;
	
	/** <i>Generated variable</i> - Variable of <code>SolrServerConfig.embeddedMaster</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Boolean _embeddedMaster;
	
	/** <i>Generated variable</i> - Variable of <code>SolrServerConfig.aliveCheckInterval</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Integer _aliveCheckInterval;
	
	/** <i>Generated variable</i> - Variable of <code>SolrServerConfig.connectionTimeout</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Integer _connectionTimeout;
	
	/** <i>Generated variable</i> - Variable of <code>SolrServerConfig.socketTimeout</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Integer _socketTimeout;
	
	/** <i>Generated variable</i> - Variable of <code>SolrServerConfig.tcpNoDelay</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Boolean _tcpNoDelay;
	
	/** <i>Generated variable</i> - Variable of <code>SolrServerConfig.maxTotalConnections</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Integer _maxTotalConnections;
	
	/** <i>Generated variable</i> - Variable of <code>SolrServerConfig.maxTotalConnectionsPerHostConfig</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Integer _maxTotalConnectionsPerHostConfig;
	
	/** <i>Generated variable</i> - Variable of <code>SolrServerConfig.readTimeout</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Integer _readTimeout;
	
	/** <i>Generated variable</i> - Variable of <code>SolrServerConfig.useMasterNodeExclusivelyForIndexing</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Boolean _useMasterNodeExclusivelyForIndexing;
	
	/** <i>Generated variable</i> - Variable of <code>SolrServerConfig.solrEndpointUrls</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private List<SolrEndpointUrlModel> _solrEndpointUrls;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SolrServerConfigModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SolrServerConfigModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _mode initial attribute declared by type <code>SolrServerConfig</code> at extension <code>solrfacetsearch</code>
	 * @param _name initial attribute declared by type <code>SolrServerConfig</code> at extension <code>solrfacetsearch</code>
	 * @param _useMasterNodeExclusivelyForIndexing initial attribute declared by type <code>SolrServerConfig</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrServerConfigModel(final SolrServerModes _mode, final String _name, final boolean _useMasterNodeExclusivelyForIndexing)
	{
		super();
		setMode(_mode);
		setName(_name);
		setUseMasterNodeExclusivelyForIndexing(_useMasterNodeExclusivelyForIndexing);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _mode initial attribute declared by type <code>SolrServerConfig</code> at extension <code>solrfacetsearch</code>
	 * @param _name initial attribute declared by type <code>SolrServerConfig</code> at extension <code>solrfacetsearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _useMasterNodeExclusivelyForIndexing initial attribute declared by type <code>SolrServerConfig</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrServerConfigModel(final SolrServerModes _mode, final String _name, final ItemModel _owner, final boolean _useMasterNodeExclusivelyForIndexing)
	{
		super();
		setMode(_mode);
		setName(_name);
		setOwner(_owner);
		setUseMasterNodeExclusivelyForIndexing(_useMasterNodeExclusivelyForIndexing);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrServerConfig.aliveCheckInterval</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the aliveCheckInterval - Time interval in miliseconds which is used to ping the dead servers to find if it is alive.
	 */
	public Integer getAliveCheckInterval()
	{
		if (this._aliveCheckInterval!=null)
		{
			return _aliveCheckInterval;
		}
		return _aliveCheckInterval = getPersistenceContext().getValue(ALIVECHECKINTERVAL, _aliveCheckInterval);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrServerConfig.connectionTimeout</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the connectionTimeout - Sets the timeout in miliseconds until a connection is etablished.
	 */
	public Integer getConnectionTimeout()
	{
		if (this._connectionTimeout!=null)
		{
			return _connectionTimeout;
		}
		return _connectionTimeout = getPersistenceContext().getValue(CONNECTIONTIMEOUT, _connectionTimeout);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrServerConfig.maxTotalConnections</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the maxTotalConnections - Sets the maximum total connections allowed
	 */
	public Integer getMaxTotalConnections()
	{
		if (this._maxTotalConnections!=null)
		{
			return _maxTotalConnections;
		}
		return _maxTotalConnections = getPersistenceContext().getValue(MAXTOTALCONNECTIONS, _maxTotalConnections);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrServerConfig.maxTotalConnectionsPerHostConfig</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the maxTotalConnectionsPerHostConfig - Sets the maximum number of connections to be used for the given host config
	 */
	public Integer getMaxTotalConnectionsPerHostConfig()
	{
		if (this._maxTotalConnectionsPerHostConfig!=null)
		{
			return _maxTotalConnectionsPerHostConfig;
		}
		return _maxTotalConnectionsPerHostConfig = getPersistenceContext().getValue(MAXTOTALCONNECTIONSPERHOSTCONFIG, _maxTotalConnectionsPerHostConfig);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrServerConfig.mode</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the mode - operation mode of Solr server
	 */
	public SolrServerModes getMode()
	{
		if (this._mode!=null)
		{
			return _mode;
		}
		return _mode = getPersistenceContext().getValue(MODE, _mode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrServerConfig.name</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the name - unique identifier of solr configuration
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
	 * <i>Generated method</i> - Getter of the <code>SolrServerConfig.readTimeout</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the readTimeout
	 */
	@Deprecated
	public Integer getReadTimeout()
	{
		if (this._readTimeout!=null)
		{
			return _readTimeout;
		}
		return _readTimeout = getPersistenceContext().getValue(READTIMEOUT, _readTimeout);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrServerConfig.socketTimeout</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the socketTimeout - Sets the default socket timeout in milliseconds which is the timeout for waiting for data
	 */
	public Integer getSocketTimeout()
	{
		if (this._socketTimeout!=null)
		{
			return _socketTimeout;
		}
		return _socketTimeout = getPersistenceContext().getValue(SOCKETTIMEOUT, _socketTimeout);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrServerConfig.solrEndpointUrls</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the solrEndpointUrls
	 */
	public List<SolrEndpointUrlModel> getSolrEndpointUrls()
	{
		if (this._solrEndpointUrls!=null)
		{
			return _solrEndpointUrls;
		}
		return _solrEndpointUrls = getPersistenceContext().getValue(SOLRENDPOINTURLS, _solrEndpointUrls);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrServerConfig.embeddedMaster</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the embeddedMaster
	 */
	public boolean isEmbeddedMaster()
	{
		return toPrimitive( _embeddedMaster = getPersistenceContext().getValue(EMBEDDEDMASTER, _embeddedMaster));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrServerConfig.tcpNoDelay</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the tcpNoDelay - Setting to true disables TCP packet batching
	 */
	public boolean isTcpNoDelay()
	{
		return toPrimitive( _tcpNoDelay = getPersistenceContext().getValue(TCPNODELAY, _tcpNoDelay));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrServerConfig.useMasterNodeExclusivelyForIndexing</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the useMasterNodeExclusivelyForIndexing
	 */
	public boolean isUseMasterNodeExclusivelyForIndexing()
	{
		return toPrimitive( _useMasterNodeExclusivelyForIndexing = getPersistenceContext().getValue(USEMASTERNODEEXCLUSIVELYFORINDEXING, _useMasterNodeExclusivelyForIndexing));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrServerConfig.aliveCheckInterval</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the aliveCheckInterval - Time interval in miliseconds which is used to ping the dead servers to find if it is alive.
	 */
	public void setAliveCheckInterval(final Integer value)
	{
		_aliveCheckInterval = getPersistenceContext().setValue(ALIVECHECKINTERVAL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrServerConfig.connectionTimeout</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the connectionTimeout - Sets the timeout in miliseconds until a connection is etablished.
	 */
	public void setConnectionTimeout(final Integer value)
	{
		_connectionTimeout = getPersistenceContext().setValue(CONNECTIONTIMEOUT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrServerConfig.embeddedMaster</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the embeddedMaster
	 */
	public void setEmbeddedMaster(final boolean value)
	{
		_embeddedMaster = getPersistenceContext().setValue(EMBEDDEDMASTER, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrServerConfig.maxTotalConnections</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the maxTotalConnections - Sets the maximum total connections allowed
	 */
	public void setMaxTotalConnections(final Integer value)
	{
		_maxTotalConnections = getPersistenceContext().setValue(MAXTOTALCONNECTIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrServerConfig.maxTotalConnectionsPerHostConfig</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the maxTotalConnectionsPerHostConfig - Sets the maximum number of connections to be used for the given host config
	 */
	public void setMaxTotalConnectionsPerHostConfig(final Integer value)
	{
		_maxTotalConnectionsPerHostConfig = getPersistenceContext().setValue(MAXTOTALCONNECTIONSPERHOSTCONFIG, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>SolrServerConfig.mode</code> attribute defined at extension <code>solrfacetsearch</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the mode - operation mode of Solr server
	 */
	public void setMode(final SolrServerModes value)
	{
		_mode = getPersistenceContext().setValue(MODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>SolrServerConfig.name</code> attribute defined at extension <code>solrfacetsearch</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the name - unique identifier of solr configuration
	 */
	public void setName(final String value)
	{
		_name = getPersistenceContext().setValue(NAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrServerConfig.readTimeout</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the readTimeout
	 */
	@Deprecated
	public void setReadTimeout(final Integer value)
	{
		_readTimeout = getPersistenceContext().setValue(READTIMEOUT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrServerConfig.socketTimeout</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the socketTimeout - Sets the default socket timeout in milliseconds which is the timeout for waiting for data
	 */
	public void setSocketTimeout(final Integer value)
	{
		_socketTimeout = getPersistenceContext().setValue(SOCKETTIMEOUT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrServerConfig.solrEndpointUrls</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the solrEndpointUrls
	 */
	public void setSolrEndpointUrls(final List<SolrEndpointUrlModel> value)
	{
		_solrEndpointUrls = getPersistenceContext().setValue(SOLRENDPOINTURLS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrServerConfig.tcpNoDelay</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the tcpNoDelay - Setting to true disables TCP packet batching
	 */
	public void setTcpNoDelay(final boolean value)
	{
		_tcpNoDelay = getPersistenceContext().setValue(TCPNODELAY, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrServerConfig.useMasterNodeExclusivelyForIndexing</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the useMasterNodeExclusivelyForIndexing
	 */
	public void setUseMasterNodeExclusivelyForIndexing(final boolean value)
	{
		_useMasterNodeExclusivelyForIndexing = getPersistenceContext().setValue(USEMASTERNODEEXCLUSIVELYFORINDEXING, toObject(value));
	}
	
}
