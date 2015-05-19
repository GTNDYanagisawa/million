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
package de.hybris.platform.commerceservices.search.facetdata;

import de.hybris.platform.commerceservices.search.facetdata.BreadcrumbData;
import de.hybris.platform.commerceservices.search.facetdata.FacetData;
import java.util.List;

/**
 * POJO representing a facet refinement.
 */
public class FacetRefinement<STATE>  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>FacetRefinement<STATE>.count</code> property defined at extension <code>commerceservices</code>. */
	private long count;
	/** <i>Generated property</i> for <code>FacetRefinement<STATE>.facets</code> property defined at extension <code>commerceservices</code>. */
	private List<FacetData<STATE>> facets;
	/** <i>Generated property</i> for <code>FacetRefinement<STATE>.breadcrumbs</code> property defined at extension <code>commerceservices</code>. */
	private List<BreadcrumbData<STATE>> breadcrumbs;
		
	public FacetRefinement()
	{
		// default constructor
	}
	
		
	public void setCount(final long count)
	{
		this.count = count;
	}
	
		
	public long getCount() 
	{
		return count;
	}
		
		
	public void setFacets(final List<FacetData<STATE>> facets)
	{
		this.facets = facets;
	}
	
		
	public List<FacetData<STATE>> getFacets() 
	{
		return facets;
	}
		
		
	public void setBreadcrumbs(final List<BreadcrumbData<STATE>> breadcrumbs)
	{
		this.breadcrumbs = breadcrumbs;
	}
	
		
	public List<BreadcrumbData<STATE>> getBreadcrumbs() 
	{
		return breadcrumbs;
	}
		
	
}