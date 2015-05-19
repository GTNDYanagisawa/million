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

import de.hybris.platform.commerceservices.search.pagedata.PageableData;

/**
 * POJO representation of search results pagination.
 */
public class PaginationData extends PageableData 
{

	/** The total number of matched results across all pages.<br/><br/><i>Generated property</i> for <code>PaginationData.totalNumberOfResults</code> property defined at extension <code>commerceservices</code>. */
	private long totalNumberOfResults;
	/** The total number of pages. This is the number of pages, each of pageSize, required to display the totalNumberOfResults.<br/><br/><i>Generated property</i> for <code>PaginationData.numberOfPages</code> property defined at extension <code>commerceservices</code>. */
	private int numberOfPages;
		
	public PaginationData()
	{
		// default constructor
	}
	
		
	public void setTotalNumberOfResults(final long totalNumberOfResults)
	{
		this.totalNumberOfResults = totalNumberOfResults;
	}
	
		
	public long getTotalNumberOfResults() 
	{
		return totalNumberOfResults;
	}
		
		
	public void setNumberOfPages(final int numberOfPages)
	{
		this.numberOfPages = numberOfPages;
	}
	
		
	public int getNumberOfPages() 
	{
		return numberOfPages;
	}
		
	
}