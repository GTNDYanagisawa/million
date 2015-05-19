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
 * Generated enum TableWidthType declared at extension print.
 */
@SuppressWarnings("PMD")
public enum TableWidthType implements HybrisEnumValue
{
	/**
	 * Generated enum value for TableWidthType.AUTO declared at extension print.
	 */
	AUTO("AUTO"),
	/**
	 * Generated enum value for TableWidthType.FIXED_WIDTH declared at extension print.
	 */
	FIXED_WIDTH("FIXED_WIDTH"),
	/**
	 * Generated enum value for TableWidthType.FIT_TO_FRAME declared at extension print.
	 */
	FIT_TO_FRAME("FIT_TO_FRAME");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "TableWidthType";
	
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private TableWidthType(final String code)
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
