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
 * Generated enum SolrBoostConditionOperator declared at extension commercesearch.
 */
@SuppressWarnings("PMD")
public enum SolrBoostConditionOperator implements HybrisEnumValue
{
	/**
	 * Generated enum value for SolrBoostConditionOperator.GREATER_THAN declared at extension commercesearch.
	 */
	GREATER_THAN("GREATER_THAN"),
	/**
	 * Generated enum value for SolrBoostConditionOperator.GREATER_THAN_OR_EQUAL_TO declared at extension commercesearch.
	 */
	GREATER_THAN_OR_EQUAL_TO("GREATER_THAN_OR_EQUAL_TO"),
	/**
	 * Generated enum value for SolrBoostConditionOperator.LESS_THAN declared at extension commercesearch.
	 */
	LESS_THAN("LESS_THAN"),
	/**
	 * Generated enum value for SolrBoostConditionOperator.LESS_THAN_OR_EQUAL_TO declared at extension commercesearch.
	 */
	LESS_THAN_OR_EQUAL_TO("LESS_THAN_OR_EQUAL_TO"),
	/**
	 * Generated enum value for SolrBoostConditionOperator.EQUAL_TO declared at extension commercesearch.
	 */
	EQUAL_TO("EQUAL_TO"),
	/**
	 * Generated enum value for SolrBoostConditionOperator.CONTAINS declared at extension commercesearch.
	 */
	CONTAINS("CONTAINS");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SolrBoostConditionOperator";
	
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private SolrBoostConditionOperator(final String code)
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
