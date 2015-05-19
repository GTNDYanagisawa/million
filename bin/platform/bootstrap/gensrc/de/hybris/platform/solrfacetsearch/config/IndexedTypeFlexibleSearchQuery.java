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

import de.hybris.platform.solrfacetsearch.config.IndexOperation;
import java.util.Map;

public class IndexedTypeFlexibleSearchQuery  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>IndexedTypeFlexibleSearchQuery.injectCurrentDate</code> property defined at extension <code>solrfacetsearch</code>. */
	private boolean injectCurrentDate;
	/** <i>Generated property</i> for <code>IndexedTypeFlexibleSearchQuery.injectLastIndexTime</code> property defined at extension <code>solrfacetsearch</code>. */
	private boolean injectLastIndexTime;
	/** <i>Generated property</i> for <code>IndexedTypeFlexibleSearchQuery.query</code> property defined at extension <code>solrfacetsearch</code>. */
	private String query;
	/** <i>Generated property</i> for <code>IndexedTypeFlexibleSearchQuery.injectCurrentTime</code> property defined at extension <code>solrfacetsearch</code>. */
	private boolean injectCurrentTime;
	/** <i>Generated property</i> for <code>IndexedTypeFlexibleSearchQuery.userId</code> property defined at extension <code>solrfacetsearch</code>. */
	private String userId;
	/** <i>Generated property</i> for <code>IndexedTypeFlexibleSearchQuery.parameters</code> property defined at extension <code>solrfacetsearch</code>. */
	private Map<String,Object> parameters;
	/** <i>Generated property</i> for <code>IndexedTypeFlexibleSearchQuery.type</code> property defined at extension <code>solrfacetsearch</code>. */
	private IndexOperation type;
	/** <i>Generated property</i> for <code>IndexedTypeFlexibleSearchQuery.parameterProviderId</code> property defined at extension <code>solrfacetsearch</code>. */
	private String parameterProviderId;
		
	public IndexedTypeFlexibleSearchQuery()
	{
		// default constructor
	}
	
		
	public void setInjectCurrentDate(final boolean injectCurrentDate)
	{
		this.injectCurrentDate = injectCurrentDate;
	}
	
		
	public boolean isInjectCurrentDate() 
	{
		return injectCurrentDate;
	}
		
		
	public void setInjectLastIndexTime(final boolean injectLastIndexTime)
	{
		this.injectLastIndexTime = injectLastIndexTime;
	}
	
		
	public boolean isInjectLastIndexTime() 
	{
		return injectLastIndexTime;
	}
		
		
	public void setQuery(final String query)
	{
		this.query = query;
	}
	
		
	public String getQuery() 
	{
		return query;
	}
		
		
	public void setInjectCurrentTime(final boolean injectCurrentTime)
	{
		this.injectCurrentTime = injectCurrentTime;
	}
	
		
	public boolean isInjectCurrentTime() 
	{
		return injectCurrentTime;
	}
		
		
	public void setUserId(final String userId)
	{
		this.userId = userId;
	}
	
		
	public String getUserId() 
	{
		return userId;
	}
		
		
	public void setParameters(final Map<String,Object> parameters)
	{
		this.parameters = parameters;
	}
	
		
	public Map<String,Object> getParameters() 
	{
		return parameters;
	}
		
		
	public void setType(final IndexOperation type)
	{
		this.type = type;
	}
	
		
	public IndexOperation getType() 
	{
		return type;
	}
		
		
	public void setParameterProviderId(final String parameterProviderId)
	{
		this.parameterProviderId = parameterProviderId;
	}
	
		
	public String getParameterProviderId() 
	{
		return parameterProviderId;
	}
		
	
}