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
package de.hybris.platform.commercewebservicescommons.dto.catalog;

import de.hybris.platform.commercewebservicescommons.dto.catalog.AbstractCatalogItemWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.catalog.CategoryHierarchyWsDTO;
import java.util.List;

public class CategoryHierarchyWsDTO extends AbstractCatalogItemWsDTO 
{

	/** <i>Generated property</i> for <code>CategoryHierarchyWsDTO.totalNumber</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Integer totalNumber;
	/** <i>Generated property</i> for <code>CategoryHierarchyWsDTO.pageSize</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Integer pageSize;
	/** <i>Generated property</i> for <code>CategoryHierarchyWsDTO.numberOfPages</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Integer numberOfPages;
	/** <i>Generated property</i> for <code>CategoryHierarchyWsDTO.subcategories</code> property defined at extension <code>commercewebservicescommons</code>. */
	private List<CategoryHierarchyWsDTO> subcategories;
	/** <i>Generated property</i> for <code>CategoryHierarchyWsDTO.currentPage</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Integer currentPage;
		
	public CategoryHierarchyWsDTO()
	{
		// default constructor
	}
	
		
	public void setTotalNumber(final Integer totalNumber)
	{
		this.totalNumber = totalNumber;
	}
	
		
	public Integer getTotalNumber() 
	{
		return totalNumber;
	}
		
		
	public void setPageSize(final Integer pageSize)
	{
		this.pageSize = pageSize;
	}
	
		
	public Integer getPageSize() 
	{
		return pageSize;
	}
		
		
	public void setNumberOfPages(final Integer numberOfPages)
	{
		this.numberOfPages = numberOfPages;
	}
	
		
	public Integer getNumberOfPages() 
	{
		return numberOfPages;
	}
		
		
	public void setSubcategories(final List<CategoryHierarchyWsDTO> subcategories)
	{
		this.subcategories = subcategories;
	}
	
		
	public List<CategoryHierarchyWsDTO> getSubcategories() 
	{
		return subcategories;
	}
		
		
	public void setCurrentPage(final Integer currentPage)
	{
		this.currentPage = currentPage;
	}
	
		
	public Integer getCurrentPage() 
	{
		return currentPage;
	}
		
	
}