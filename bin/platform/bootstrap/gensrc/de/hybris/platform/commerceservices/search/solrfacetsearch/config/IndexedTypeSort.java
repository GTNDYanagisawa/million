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
package de.hybris.platform.commerceservices.search.solrfacetsearch.config;

import de.hybris.platform.commerceservices.model.solrsearch.config.SolrSortModel;

public class IndexedTypeSort  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>IndexedTypeSort.sort</code> property defined at extension <code>commerceservices</code>. */
	private SolrSortModel sort;
	/** <i>Generated property</i> for <code>IndexedTypeSort.name</code> property defined at extension <code>commerceservices</code>. */
	private String name;
	/** <i>Generated property</i> for <code>IndexedTypeSort.code</code> property defined at extension <code>commerceservices</code>. */
	private String code;
		
	public IndexedTypeSort()
	{
		// default constructor
	}
	
		
	public void setSort(final SolrSortModel sort)
	{
		this.sort = sort;
	}
	
		
	public SolrSortModel getSort() 
	{
		return sort;
	}
		
		
	public void setName(final String name)
	{
		this.name = name;
	}
	
		
	public String getName() 
	{
		return name;
	}
		
		
	public void setCode(final String code)
	{
		this.code = code;
	}
	
		
	public String getCode() 
	{
		return code;
	}
		
	
}