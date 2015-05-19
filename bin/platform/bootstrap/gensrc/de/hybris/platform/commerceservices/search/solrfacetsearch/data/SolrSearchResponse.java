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
package de.hybris.platform.commerceservices.search.solrfacetsearch.data;

import de.hybris.platform.commerceservices.search.solrfacetsearch.data.SolrSearchRequest;

public class SolrSearchResponse<FACET_SEARCH_CONFIG_TYPE, INDEXED_TYPE_TYPE, INDEXED_PROPERTY_TYPE, SEARCH_QUERY_TYPE, INDEXED_TYPE_SORT_TYPE, SEARCH_RESULT_TYPE>  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>SolrSearchResponse<FACET_SEARCH_CONFIG_TYPE, INDEXED_TYPE_TYPE, INDEXED_PROPERTY_TYPE, SEARCH_QUERY_TYPE, INDEXED_TYPE_SORT_TYPE, SEARCH_RESULT_TYPE>.searchResult</code> property defined at extension <code>commerceservices</code>. */
	private SEARCH_RESULT_TYPE searchResult;
	/** <i>Generated property</i> for <code>SolrSearchResponse<FACET_SEARCH_CONFIG_TYPE, INDEXED_TYPE_TYPE, INDEXED_PROPERTY_TYPE, SEARCH_QUERY_TYPE, INDEXED_TYPE_SORT_TYPE, SEARCH_RESULT_TYPE>.request</code> property defined at extension <code>commerceservices</code>. */
	private SolrSearchRequest<FACET_SEARCH_CONFIG_TYPE, INDEXED_TYPE_TYPE, INDEXED_PROPERTY_TYPE, SEARCH_QUERY_TYPE, INDEXED_TYPE_SORT_TYPE> request;
		
	public SolrSearchResponse()
	{
		// default constructor
	}
	
		
	public void setSearchResult(final SEARCH_RESULT_TYPE searchResult)
	{
		this.searchResult = searchResult;
	}
	
		
	public SEARCH_RESULT_TYPE getSearchResult() 
	{
		return searchResult;
	}
		
		
	public void setRequest(final SolrSearchRequest<FACET_SEARCH_CONFIG_TYPE, INDEXED_TYPE_TYPE, INDEXED_PROPERTY_TYPE, SEARCH_QUERY_TYPE, INDEXED_TYPE_SORT_TYPE> request)
	{
		this.request = request;
	}
	
		
	public SolrSearchRequest<FACET_SEARCH_CONFIG_TYPE, INDEXED_TYPE_TYPE, INDEXED_PROPERTY_TYPE, SEARCH_QUERY_TYPE, INDEXED_TYPE_SORT_TYPE> getRequest() 
	{
		return request;
	}
		
	
}