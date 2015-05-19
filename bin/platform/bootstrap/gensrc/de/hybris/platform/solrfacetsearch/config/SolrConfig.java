/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 2015/05/18 13:25:59
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

import de.hybris.platform.solrfacetsearch.config.ClusterConfig;
import de.hybris.platform.solrfacetsearch.config.SolrServerMode;

public class SolrConfig  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>SolrConfig.clusterConfig</code> property defined at extension <code>solrfacetsearch</code>. */
	private ClusterConfig clusterConfig;
	/** <i>Generated property</i> for <code>SolrConfig.mode</code> property defined at extension <code>solrfacetsearch</code>. */
	private SolrServerMode mode;
		
	public SolrConfig()
	{
		// default constructor
	}
	
		
	public void setClusterConfig(final ClusterConfig clusterConfig)
	{
		this.clusterConfig = clusterConfig;
	}
	
		
	public ClusterConfig getClusterConfig() 
	{
		return clusterConfig;
	}
		
		
	public void setMode(final SolrServerMode mode)
	{
		this.mode = mode;
	}
	
		
	public SolrServerMode getMode() 
	{
		return mode;
	}
		
	
}