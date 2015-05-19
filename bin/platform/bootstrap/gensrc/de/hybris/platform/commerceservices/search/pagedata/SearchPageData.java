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
package de.hybris.platform.commerceservices.search.pagedata;

import de.hybris.platform.commerceservices.search.pagedata.PaginationData;
import de.hybris.platform.commerceservices.search.pagedata.SortData;
import java.util.List;

/**
 * POJO that includes all necessary data for creating proper result in refine search.
 */
public class SearchPageData<RESULT>  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>SearchPageData<RESULT>.results</code> property defined at extension <code>commerceservices</code>. */
	private List<RESULT> results;
	/** <i>Generated property</i> for <code>SearchPageData<RESULT>.pagination</code> property defined at extension <code>commerceservices</code>. */
	private PaginationData pagination;
	/** <i>Generated property</i> for <code>SearchPageData<RESULT>.sorts</code> property defined at extension <code>commerceservices</code>. */
	private List<SortData> sorts;
		
	public SearchPageData()
	{
		// default constructor
	}
	
		
	public void setResults(final List<RESULT> results)
	{
		this.results = results;
	}
	
		
	public List<RESULT> getResults() 
	{
		return results;
	}
		
		
	public void setPagination(final PaginationData pagination)
	{
		this.pagination = pagination;
	}
	
		
	public PaginationData getPagination() 
	{
		return pagination;
	}
		
		
	public void setSorts(final List<SortData> sorts)
	{
		this.sorts = sorts;
	}
	
		
	public List<SortData> getSorts() 
	{
		return sorts;
	}
		
	
}