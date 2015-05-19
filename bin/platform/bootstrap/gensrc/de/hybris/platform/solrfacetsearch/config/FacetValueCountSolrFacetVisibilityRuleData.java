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
package de.hybris.platform.solrfacetsearch.config;

import de.hybris.platform.commercesearch.enums.FacetSelectedState;
import de.hybris.platform.commercesearch.enums.FacetValueCountOperator;
import de.hybris.platform.solrfacetsearch.config.AbstractSolrFacetVisibilityRuleData;
import java.util.Set;

public class FacetValueCountSolrFacetVisibilityRuleData extends AbstractSolrFacetVisibilityRuleData 
{

	/** <i>Generated property</i> for <code>FacetValueCountSolrFacetVisibilityRuleData.selectedStates</code> property defined at extension <code>commercesearch</code>. */
	private Set<FacetSelectedState> selectedStates;
	/** <i>Generated property</i> for <code>FacetValueCountSolrFacetVisibilityRuleData.count</code> property defined at extension <code>commercesearch</code>. */
	private Integer count;
	/** <i>Generated property</i> for <code>FacetValueCountSolrFacetVisibilityRuleData.operator</code> property defined at extension <code>commercesearch</code>. */
	private FacetValueCountOperator operator;
		
	public FacetValueCountSolrFacetVisibilityRuleData()
	{
		// default constructor
	}
	
		
	public void setSelectedStates(final Set<FacetSelectedState> selectedStates)
	{
		this.selectedStates = selectedStates;
	}
	
		
	public Set<FacetSelectedState> getSelectedStates() 
	{
		return selectedStates;
	}
		
		
	public void setCount(final Integer count)
	{
		this.count = count;
	}
	
		
	public Integer getCount() 
	{
		return count;
	}
		
		
	public void setOperator(final FacetValueCountOperator operator)
	{
		this.operator = operator;
	}
	
		
	public FacetValueCountOperator getOperator() 
	{
		return operator;
	}
		
	
}