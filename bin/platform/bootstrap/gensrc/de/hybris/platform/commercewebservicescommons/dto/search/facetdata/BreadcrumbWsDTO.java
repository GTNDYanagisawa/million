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
package de.hybris.platform.commercewebservicescommons.dto.search.facetdata;

import de.hybris.platform.commercewebservicescommons.dto.search.SearchStateWsDTO;

/**
 * POJO representing a section of the Breadcrumb.
 */
public class BreadcrumbWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>BreadcrumbWsDTO.truncateQuery</code> property defined at extension <code>commercewebservicescommons</code>. */
	private SearchStateWsDTO truncateQuery;
	/** <i>Generated property</i> for <code>BreadcrumbWsDTO.removeQuery</code> property defined at extension <code>commercewebservicescommons</code>. */
	private SearchStateWsDTO removeQuery;
	/** <i>Generated property</i> for <code>BreadcrumbWsDTO.facetName</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String facetName;
	/** <i>Generated property</i> for <code>BreadcrumbWsDTO.facetValueName</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String facetValueName;
	/** <i>Generated property</i> for <code>BreadcrumbWsDTO.facetCode</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String facetCode;
	/** <i>Generated property</i> for <code>BreadcrumbWsDTO.facetValueCode</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String facetValueCode;
		
	public BreadcrumbWsDTO()
	{
		// default constructor
	}
	
		
	public void setTruncateQuery(final SearchStateWsDTO truncateQuery)
	{
		this.truncateQuery = truncateQuery;
	}
	
		
	public SearchStateWsDTO getTruncateQuery() 
	{
		return truncateQuery;
	}
		
		
	public void setRemoveQuery(final SearchStateWsDTO removeQuery)
	{
		this.removeQuery = removeQuery;
	}
	
		
	public SearchStateWsDTO getRemoveQuery() 
	{
		return removeQuery;
	}
		
		
	public void setFacetName(final String facetName)
	{
		this.facetName = facetName;
	}
	
		
	public String getFacetName() 
	{
		return facetName;
	}
		
		
	public void setFacetValueName(final String facetValueName)
	{
		this.facetValueName = facetValueName;
	}
	
		
	public String getFacetValueName() 
	{
		return facetValueName;
	}
		
		
	public void setFacetCode(final String facetCode)
	{
		this.facetCode = facetCode;
	}
	
		
	public String getFacetCode() 
	{
		return facetCode;
	}
		
		
	public void setFacetValueCode(final String facetValueCode)
	{
		this.facetValueCode = facetValueCode;
	}
	
		
	public String getFacetValueCode() 
	{
		return facetValueCode;
	}
		
	
}