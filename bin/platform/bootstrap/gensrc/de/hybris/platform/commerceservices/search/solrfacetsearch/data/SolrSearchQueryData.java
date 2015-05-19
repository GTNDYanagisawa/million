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

import de.hybris.platform.commerceservices.search.solrfacetsearch.data.SolrSearchQueryTermData;
import java.util.List;

/**
 * POJO representing a Search query.
 */
public class SolrSearchQueryData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>SolrSearchQueryData.filterTerms</code> property defined at extension <code>commerceservices</code>. */
	private List<SolrSearchQueryTermData> filterTerms;
	/** <i>Generated property</i> for <code>SolrSearchQueryData.sort</code> property defined at extension <code>commerceservices</code>. */
	private String sort;
	/** <i>Generated property</i> for <code>SolrSearchQueryData.freeTextSearch</code> property defined at extension <code>commerceservices</code>. */
	private String freeTextSearch;
	/** <i>Generated property</i> for <code>SolrSearchQueryData.categoryCode</code> property defined at extension <code>commerceservices</code>. */
	private String categoryCode;
		
	public SolrSearchQueryData()
	{
		// default constructor
	}
	
		
	public void setFilterTerms(final List<SolrSearchQueryTermData> filterTerms)
	{
		this.filterTerms = filterTerms;
	}
	
		
	public List<SolrSearchQueryTermData> getFilterTerms() 
	{
		return filterTerms;
	}
		
		
	public void setSort(final String sort)
	{
		this.sort = sort;
	}
	
		
	public String getSort() 
	{
		return sort;
	}
		
		
	public void setFreeTextSearch(final String freeTextSearch)
	{
		this.freeTextSearch = freeTextSearch;
	}
	
		
	public String getFreeTextSearch() 
	{
		return freeTextSearch;
	}
		
		
	public void setCategoryCode(final String categoryCode)
	{
		this.categoryCode = categoryCode;
	}
	
		
	public String getCategoryCode() 
	{
		return categoryCode;
	}
		
	
}