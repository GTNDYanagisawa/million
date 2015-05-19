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
package de.hybris.platform.solrfacetsearch.config;

import de.hybris.platform.commercesearch.enums.FacetVisibilityRuleCondition;

public class AbstractSolrFacetVisibilityRuleData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>AbstractSolrFacetVisibilityRuleData.condition</code> property defined at extension <code>commercesearch</code>. */
	private FacetVisibilityRuleCondition condition;
	/** <i>Generated property</i> for <code>AbstractSolrFacetVisibilityRuleData.name</code> property defined at extension <code>commercesearch</code>. */
	private String name;
	/** <i>Generated property</i> for <code>AbstractSolrFacetVisibilityRuleData.code</code> property defined at extension <code>commercesearch</code>. */
	private String code;
	/** <i>Generated property</i> for <code>AbstractSolrFacetVisibilityRuleData.ruleTypeCode</code> property defined at extension <code>commercesearch</code>. */
	private String ruleTypeCode;
		
	public AbstractSolrFacetVisibilityRuleData()
	{
		// default constructor
	}
	
		
	public void setCondition(final FacetVisibilityRuleCondition condition)
	{
		this.condition = condition;
	}
	
		
	public FacetVisibilityRuleCondition getCondition() 
	{
		return condition;
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
		
		
	public void setRuleTypeCode(final String ruleTypeCode)
	{
		this.ruleTypeCode = ruleTypeCode;
	}
	
		
	public String getRuleTypeCode() 
	{
		return ruleTypeCode;
	}
		
	
}