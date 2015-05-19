/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 2015/05/18 13:26:00
 * ----------------------------------------------------------------
 *
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package de.hybris.platform.solrfacetsearch.config;

import de.hybris.platform.solrfacetsearch.config.EndpointURL;
import java.util.List;

public class ClusterConfig  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>ClusterConfig.readTimeout</code> property defined at extension <code>solrfacetsearch</code>. */
	private Integer readTimeout;
	/** <i>Generated property</i> for <code>ClusterConfig.tcpNoDelay</code> property defined at extension <code>solrfacetsearch</code>. */
	private boolean tcpNoDelay;
	/** <i>Generated property</i> for <code>ClusterConfig.aliveCheckInterval</code> property defined at extension <code>solrfacetsearch</code>. */
	private Integer aliveCheckInterval;
	/** <i>Generated property</i> for <code>ClusterConfig.maxConnections</code> property defined at extension <code>solrfacetsearch</code>. */
	private Integer maxConnections;
	/** <i>Generated property</i> for <code>ClusterConfig.connectionTimeout</code> property defined at extension <code>solrfacetsearch</code>. */
	private Integer connectionTimeout;
	/** <i>Generated property</i> for <code>ClusterConfig.maxConnectionsPerHost</code> property defined at extension <code>solrfacetsearch</code>. */
	private Integer maxConnectionsPerHost;
	/** <i>Generated property</i> for <code>ClusterConfig.socketTimeout</code> property defined at extension <code>solrfacetsearch</code>. */
	private Integer socketTimeout;
	/** <i>Generated property</i> for <code>ClusterConfig.endpointURLs</code> property defined at extension <code>solrfacetsearch</code>. */
	private List<EndpointURL> endpointURLs;
	/** <i>Generated property</i> for <code>ClusterConfig.embeddedMaster</code> property defined at extension <code>solrfacetsearch</code>. */
	private boolean embeddedMaster;
	/** <i>Generated property</i> for <code>ClusterConfig.useMasterNodeExclusivelyForIndexing</code> property defined at extension <code>solrfacetsearch</code>. */
	private boolean useMasterNodeExclusivelyForIndexing;
		
	public ClusterConfig()
	{
		// default constructor
	}
	
		
	public void setReadTimeout(final Integer readTimeout)
	{
		this.readTimeout = readTimeout;
	}
	
		
	public Integer getReadTimeout() 
	{
		return readTimeout;
	}
		
		
	public void setTcpNoDelay(final boolean tcpNoDelay)
	{
		this.tcpNoDelay = tcpNoDelay;
	}
	
		
	public boolean isTcpNoDelay() 
	{
		return tcpNoDelay;
	}
		
		
	public void setAliveCheckInterval(final Integer aliveCheckInterval)
	{
		this.aliveCheckInterval = aliveCheckInterval;
	}
	
		
	public Integer getAliveCheckInterval() 
	{
		return aliveCheckInterval;
	}
		
		
	public void setMaxConnections(final Integer maxConnections)
	{
		this.maxConnections = maxConnections;
	}
	
		
	public Integer getMaxConnections() 
	{
		return maxConnections;
	}
		
		
	public void setConnectionTimeout(final Integer connectionTimeout)
	{
		this.connectionTimeout = connectionTimeout;
	}
	
		
	public Integer getConnectionTimeout() 
	{
		return connectionTimeout;
	}
		
		
	public void setMaxConnectionsPerHost(final Integer maxConnectionsPerHost)
	{
		this.maxConnectionsPerHost = maxConnectionsPerHost;
	}
	
		
	public Integer getMaxConnectionsPerHost() 
	{
		return maxConnectionsPerHost;
	}
		
		
	public void setSocketTimeout(final Integer socketTimeout)
	{
		this.socketTimeout = socketTimeout;
	}
	
		
	public Integer getSocketTimeout() 
	{
		return socketTimeout;
	}
		
		
	public void setEndpointURLs(final List<EndpointURL> endpointURLs)
	{
		this.endpointURLs = endpointURLs;
	}
	
		
	public List<EndpointURL> getEndpointURLs() 
	{
		return endpointURLs;
	}
		
		
	public void setEmbeddedMaster(final boolean embeddedMaster)
	{
		this.embeddedMaster = embeddedMaster;
	}
	
		
	public boolean isEmbeddedMaster() 
	{
		return embeddedMaster;
	}
		
		
	public void setUseMasterNodeExclusivelyForIndexing(final boolean useMasterNodeExclusivelyForIndexing)
	{
		this.useMasterNodeExclusivelyForIndexing = useMasterNodeExclusivelyForIndexing;
	}
	
		
	public boolean isUseMasterNodeExclusivelyForIndexing() 
	{
		return useMasterNodeExclusivelyForIndexing;
	}
		
	
}