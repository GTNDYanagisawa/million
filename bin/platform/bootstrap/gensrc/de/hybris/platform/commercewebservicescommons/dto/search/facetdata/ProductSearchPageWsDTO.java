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

import de.hybris.platform.commercewebservicescommons.dto.product.ProductWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.search.SearchStateWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.search.facetdata.BreadcrumbWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.search.facetdata.FacetWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.search.facetdata.SpellingSuggestionWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.search.pagedata.PaginationWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.search.pagedata.SortWsDTO;
import java.util.List;

/**
 * POJO containing the result page for product search.
 */
public class ProductSearchPageWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>ProductSearchPageWsDTO.currentQuery</code> property defined at extension <code>commercewebservicescommons</code>. */
	private SearchStateWsDTO currentQuery;
	/** <i>Generated property</i> for <code>ProductSearchPageWsDTO.freeTextSearch</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String freeTextSearch;
	/** <i>Generated property</i> for <code>ProductSearchPageWsDTO.keywordRedirectUrl</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String keywordRedirectUrl;
	/** <i>Generated property</i> for <code>ProductSearchPageWsDTO.facets</code> property defined at extension <code>commercewebservicescommons</code>. */
	private List<FacetWsDTO> facets;
	/** <i>Generated property</i> for <code>ProductSearchPageWsDTO.categoryCode</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String categoryCode;
	/** <i>Generated property</i> for <code>ProductSearchPageWsDTO.spellingSuggestion</code> property defined at extension <code>commercewebservicescommons</code>. */
	private SpellingSuggestionWsDTO spellingSuggestion;
	/** <i>Generated property</i> for <code>ProductSearchPageWsDTO.pagination</code> property defined at extension <code>commercewebservicescommons</code>. */
	private PaginationWsDTO pagination;
	/** <i>Generated property</i> for <code>ProductSearchPageWsDTO.sorts</code> property defined at extension <code>commercewebservicescommons</code>. */
	private List<SortWsDTO> sorts;
	/** <i>Generated property</i> for <code>ProductSearchPageWsDTO.products</code> property defined at extension <code>commercewebservicescommons</code>. */
	private List<ProductWsDTO> products;
	/** <i>Generated property</i> for <code>ProductSearchPageWsDTO.breadcrumbs</code> property defined at extension <code>commercewebservicescommons</code>. */
	private List<BreadcrumbWsDTO> breadcrumbs;
		
	public ProductSearchPageWsDTO()
	{
		// default constructor
	}
	
		
	public void setCurrentQuery(final SearchStateWsDTO currentQuery)
	{
		this.currentQuery = currentQuery;
	}
	
		
	public SearchStateWsDTO getCurrentQuery() 
	{
		return currentQuery;
	}
		
		
	public void setFreeTextSearch(final String freeTextSearch)
	{
		this.freeTextSearch = freeTextSearch;
	}
	
		
	public String getFreeTextSearch() 
	{
		return freeTextSearch;
	}
		
		
	public void setKeywordRedirectUrl(final String keywordRedirectUrl)
	{
		this.keywordRedirectUrl = keywordRedirectUrl;
	}
	
		
	public String getKeywordRedirectUrl() 
	{
		return keywordRedirectUrl;
	}
		
		
	public void setFacets(final List<FacetWsDTO> facets)
	{
		this.facets = facets;
	}
	
		
	public List<FacetWsDTO> getFacets() 
	{
		return facets;
	}
		
		
	public void setCategoryCode(final String categoryCode)
	{
		this.categoryCode = categoryCode;
	}
	
		
	public String getCategoryCode() 
	{
		return categoryCode;
	}
		
		
	public void setSpellingSuggestion(final SpellingSuggestionWsDTO spellingSuggestion)
	{
		this.spellingSuggestion = spellingSuggestion;
	}
	
		
	public SpellingSuggestionWsDTO getSpellingSuggestion() 
	{
		return spellingSuggestion;
	}
		
		
	public void setPagination(final PaginationWsDTO pagination)
	{
		this.pagination = pagination;
	}
	
		
	public PaginationWsDTO getPagination() 
	{
		return pagination;
	}
		
		
	public void setSorts(final List<SortWsDTO> sorts)
	{
		this.sorts = sorts;
	}
	
		
	public List<SortWsDTO> getSorts() 
	{
		return sorts;
	}
		
		
	public void setProducts(final List<ProductWsDTO> products)
	{
		this.products = products;
	}
	
		
	public List<ProductWsDTO> getProducts() 
	{
		return products;
	}
		
		
	public void setBreadcrumbs(final List<BreadcrumbWsDTO> breadcrumbs)
	{
		this.breadcrumbs = breadcrumbs;
	}
	
		
	public List<BreadcrumbWsDTO> getBreadcrumbs() 
	{
		return breadcrumbs;
	}
		
	
}