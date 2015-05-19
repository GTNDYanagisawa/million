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
package de.hybris.platform.print.enums;

import de.hybris.platform.core.HybrisEnumValue;

/**
 * Generated enum PlaceholderValueType declared at extension print.
 */
@SuppressWarnings("PMD")
public enum PlaceholderValueType implements HybrisEnumValue
{
	/**
	 * Generated enum value for PlaceholderValueType.automatic declared at extension print.
	 */
	AUTOMATIC("automatic"),
	/**
	 * Generated enum value for PlaceholderValueType.text declared at extension print.
	 */
	TEXT("text"),
	/**
	 * Generated enum value for PlaceholderValueType.date declared at extension print.
	 */
	DATE("date"),
	/**
	 * Generated enum value for PlaceholderValueType.media declared at extension print.
	 */
	MEDIA("media"),
	/**
	 * Generated enum value for PlaceholderValueType.number declared at extension print.
	 */
	NUMBER("number"),
	/**
	 * Generated enum value for PlaceholderValueType.currency declared at extension print.
	 */
	CURRENCY("currency"),
	/**
	 * Generated enum value for PlaceholderValueType.classification declared at extension print.
	 */
	CLASSIFICATION("classification");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PlaceholderValueType";
	
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private PlaceholderValueType(final String code)
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
