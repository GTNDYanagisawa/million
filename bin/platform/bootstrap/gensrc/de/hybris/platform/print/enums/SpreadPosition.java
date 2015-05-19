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
 * Generated enum SpreadPosition declared at extension print.
 */
@SuppressWarnings("PMD")
public enum SpreadPosition implements HybrisEnumValue
{
	/**
	 * Generated enum value for SpreadPosition.left declared at extension print.
	 */
	LEFT("left"),
	/**
	 * Generated enum value for SpreadPosition.middle declared at extension print.
	 */
	MIDDLE("middle"),
	/**
	 * Generated enum value for SpreadPosition.right declared at extension print.
	 */
	RIGHT("right"),
	/**
	 * Generated enum value for SpreadPosition.unisex declared at extension print.
	 */
	UNISEX("unisex"),
	/**
	 * Generated enum value for SpreadPosition.continue declared at extension print.
	 */
	CONTINUE("continue"),
	/**
	 * Generated enum value for SpreadPosition.continue_left declared at extension print.
	 */
	CONTINUE_LEFT("continue_left"),
	/**
	 * Generated enum value for SpreadPosition.continue_right declared at extension print.
	 */
	CONTINUE_RIGHT("continue_right");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SpreadPosition";
	
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private SpreadPosition(final String code)
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
