/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 2015/05/18 13:25:58
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
package de.hybris.platform.commercefacades.search.data;

import de.hybris.platform.commercefacades.search.data.SearchQueryData;

public class SearchStateData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>SearchStateData.query</code> property defined at extension <code>commercefacades</code>. */
	private SearchQueryData query;
	/** <i>Generated property</i> for <code>SearchStateData.url</code> property defined at extension <code>commercefacades</code>. */
	private String url;
		
	public SearchStateData()
	{
		// default constructor
	}
	
		
	public void setQuery(final SearchQueryData query)
	{
		this.query = query;
	}
	
		
	public SearchQueryData getQuery() 
	{
		return query;
	}
		
		
	public void setUrl(final String url)
	{
		this.url = url;
	}
	
		
	public String getUrl() 
	{
		return url;
	}
		
	
}