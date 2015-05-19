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
package de.hybris.platform.commercesearch.data;

import de.hybris.platform.commercesearch.enums.SolrBoostConditionOperator;

public class BoostRuleData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>BoostRuleData.propertyName</code> property defined at extension <code>commercesearch</code>. */
	private String propertyName;
	/** <i>Generated property</i> for <code>BoostRuleData.operatorType</code> property defined at extension <code>commercesearch</code>. */
	private SolrBoostConditionOperator operatorType;
	/** <i>Generated property</i> for <code>BoostRuleData.boostFactor</code> property defined at extension <code>commercesearch</code>. */
	private Integer boostFactor;
	/** <i>Generated property</i> for <code>BoostRuleData.propertyValue</code> property defined at extension <code>commercesearch</code>. */
	private String propertyValue;
	/** <i>Generated property</i> for <code>BoostRuleData.boost</code> property defined at extension <code>commercesearch</code>. */
	private String boost;
	/** <i>Generated property</i> for <code>BoostRuleData.operator</code> property defined at extension <code>commercesearch</code>. */
	private String operator;
	/** <i>Generated property</i> for <code>BoostRuleData.pk</code> property defined at extension <code>commercesearch</code>. */
	private String pk;
		
	public BoostRuleData()
	{
		// default constructor
	}
	
		
	public void setPropertyName(final String propertyName)
	{
		this.propertyName = propertyName;
	}
	
		
	public String getPropertyName() 
	{
		return propertyName;
	}
		
		
	public void setOperatorType(final SolrBoostConditionOperator operatorType)
	{
		this.operatorType = operatorType;
	}
	
		
	public SolrBoostConditionOperator getOperatorType() 
	{
		return operatorType;
	}
		
		
	public void setBoostFactor(final Integer boostFactor)
	{
		this.boostFactor = boostFactor;
	}
	
		
	public Integer getBoostFactor() 
	{
		return boostFactor;
	}
		
		
	public void setPropertyValue(final String propertyValue)
	{
		this.propertyValue = propertyValue;
	}
	
		
	public String getPropertyValue() 
	{
		return propertyValue;
	}
		
		
	public void setBoost(final String boost)
	{
		this.boost = boost;
	}
	
		
	public String getBoost() 
	{
		return boost;
	}
		
		
	public void setOperator(final String operator)
	{
		this.operator = operator;
	}
	
		
	public String getOperator() 
	{
		return operator;
	}
		
		
	public void setPk(final String pk)
	{
		this.pk = pk;
	}
	
		
	public String getPk() 
	{
		return pk;
	}
		
	
}