/*
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2011 hybris AG
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *  
 */
package de.hybris.platform.commercesearch.enums;

import de.hybris.platform.core.HybrisEnumValue;

/**
 * Generated enum FacetVisibilityRuleCondition declared at extension commercesearch.
 */
@SuppressWarnings("PMD")
public enum FacetVisibilityRuleCondition implements HybrisEnumValue
{
	/**
	 * Generated enum value for FacetVisibilityRuleCondition.OR declared at extension commercesearch.
	 */
	OR("OR"),
	/**
	 * Generated enum value for FacetVisibilityRuleCondition.AND declared at extension commercesearch.
	 */
	AND("AND"),
	/**
	 * Generated enum value for FacetVisibilityRuleCondition.NOT declared at extension commercesearch.
	 */
	NOT("NOT");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "FacetVisibilityRuleCondition";
	
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private FacetVisibilityRuleCondition(final String code)
	{
		this.code = code.intern();
	}
	
	
	/**
	 * Gets the code of this enum value.
	 *  
	 * @return code of value
	 */
	@Override
	public String getCode()
	{
		return this.code;
	}
	
	/**
	 * Gets the type this enum value belongs to.
	 *  
	 * @return code of type
	 */
	@Override
	public String getType()
	{
		return getClass().getSimpleName();
	}
	
}
