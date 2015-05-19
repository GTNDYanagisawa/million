/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 2015/05/18 13:26:00
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
package de.hybris.platform.commercefacades.search.data;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.search.data.AutocompleteSuggestionData;
import java.util.List;

public class AutocompleteResultData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>AutocompleteResultData.suggestions</code> property defined at extension <code>commercefacades</code>. */
	private List<AutocompleteSuggestionData> suggestions;
	/** <i>Generated property</i> for <code>AutocompleteResultData.products</code> property defined at extension <code>commercefacades</code>. */
	private List<ProductData> products;
		
	public AutocompleteResultData()
	{
		// default constructor
	}
	
		
	public void setSuggestions(final List<AutocompleteSuggestionData> suggestions)
	{
		this.suggestions = suggestions;
	}
	
		
	public List<AutocompleteSuggestionData> getSuggestions() 
	{
		return suggestions;
	}
		
		
	public void setProducts(final List<ProductData> products)
	{
		this.products = products;
	}
	
		
	public List<ProductData> getProducts() 
	{
		return products;
	}
		
	
}