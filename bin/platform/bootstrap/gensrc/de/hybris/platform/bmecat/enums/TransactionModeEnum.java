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
package de.hybris.platform.bmecat.enums;

import de.hybris.platform.core.HybrisEnumValue;

/**
 * Generated enum TransactionModeEnum declared at extension bmecat.
 */
@SuppressWarnings("PMD")
public enum TransactionModeEnum implements HybrisEnumValue
{
	/**
	 * Generated enum value for TransactionModeEnum.T_NEW_CATALOG declared at extension bmecat.
	 */
	T_NEW_CATALOG("T_NEW_CATALOG"),
	/**
	 * Generated enum value for TransactionModeEnum.T_UPDATE_PRODUCTS declared at extension bmecat.
	 */
	T_UPDATE_PRODUCTS("T_UPDATE_PRODUCTS"),
	/**
	 * Generated enum value for TransactionModeEnum.T_UPDATE_PRICES declared at extension bmecat.
	 */
	T_UPDATE_PRICES("T_UPDATE_PRICES");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "TransactionModeEnum";
	
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private TransactionModeEnum(final String code)
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
