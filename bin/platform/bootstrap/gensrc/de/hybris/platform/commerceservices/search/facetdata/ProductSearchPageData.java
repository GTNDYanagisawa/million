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
package de.hybris.platform.commerceservices.search.facetdata;

import de.hybris.platform.commerceservices.search.facetdata.FacetSearchPageData;
import de.hybris.platform.commerceservices.search.facetdata.SpellingSuggestionData;

/**
 * POJO containing the result page for product search.
 */
public class ProductSearchPageData<STATE, RESULT> extends FacetSearchPageData<STATE, RESULT> 
{

	/** <i>Generated property</i> for <code>ProductSearchPageData<STATE, RESULT>.freeTextSearch</code> property defined at extension <code>commerceservices</code>. */
	private String freeTextSearch;
	/** <i>Generated property</i> for <code>ProductSearchPageData<STATE, RESULT>.keywordRedirectUrl</code> property defined at extension <code>commerceservices</code>. */
	private String keywordRedirectUrl;
	/** <i>Generated property</i> for <code>ProductSearchPageData<STATE, RESULT>.categoryCode</code> property defined at extension <code>commerceservices</code>. */
	private String categoryCode;
	/** <i>Generated property</i> for <code>ProductSearchPageData<STATE, RESULT>.spellingSuggestion</code> property defined at extension <code>commerceservices</code>. */
	private SpellingSuggestionData<STATE> spellingSuggestion;
		
	public ProductSearchPageData()
	{
		// default constructor
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
		
		
	public void setCategoryCode(final String categoryCode)
	{
		this.categoryCode = categoryCode;
	}
	
		
	public String getCategoryCode() 
	{
		return categoryCode;
	}
		
		
	public void setSpellingSuggestion(final SpellingSuggestionData<STATE> spellingSuggestion)
	{
		this.spellingSuggestion = spellingSuggestion;
	}
	
		
	public SpellingSuggestionData<STATE> getSpellingSuggestion() 
	{
		return spellingSuggestion;
	}
		
	
}