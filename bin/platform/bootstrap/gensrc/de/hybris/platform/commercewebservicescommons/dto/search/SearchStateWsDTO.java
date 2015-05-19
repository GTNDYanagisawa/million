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
package de.hybris.platform.commercewebservicescommons.dto.search;

import de.hybris.platform.commercewebservicescommons.dto.search.SearchQueryWsDTO;

public class SearchStateWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>SearchStateWsDTO.query</code> property defined at extension <code>commercewebservicescommons</code>. */
	private SearchQueryWsDTO query;
	/** <i>Generated property</i> for <code>SearchStateWsDTO.url</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String url;
		
	public SearchStateWsDTO()
	{
		// default constructor
	}
	
		
	public void setQuery(final SearchQueryWsDTO query)
	{
		this.query = query;
	}
	
		
	public SearchQueryWsDTO getQuery() 
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