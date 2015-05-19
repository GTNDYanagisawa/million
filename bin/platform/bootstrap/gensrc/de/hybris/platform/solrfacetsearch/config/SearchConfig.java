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

import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import java.util.Collection;

public class SearchConfig  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>SearchConfig.groupingProperty</code> property defined at extension <code>solrfacetsearch</code>. */
	private IndexedProperty groupingProperty;
	/** <i>Generated property</i> for <code>SearchConfig.defaultSortOrder</code> property defined at extension <code>solrfacetsearch</code>. */
	private Collection<String> defaultSortOrder;
	/** <i>Generated property</i> for <code>SearchConfig.pageSize</code> property defined at extension <code>solrfacetsearch</code>. */
	private int pageSize;
		
	public SearchConfig()
	{
		// default constructor
	}
	
		
	public void setGroupingProperty(final IndexedProperty groupingProperty)
	{
		this.groupingProperty = groupingProperty;
	}
	
		
	public IndexedProperty getGroupingProperty() 
	{
		return groupingProperty;
	}
		
		
	public void setDefaultSortOrder(final Collection<String> defaultSortOrder)
	{
		this.defaultSortOrder = defaultSortOrder;
	}
	
		
	public Collection<String> getDefaultSortOrder() 
	{
		return defaultSortOrder;
	}
		
		
	public void setPageSize(final int pageSize)
	{
		this.pageSize = pageSize;
	}
	
		
	public int getPageSize() 
	{
		return pageSize;
	}
		
	
}