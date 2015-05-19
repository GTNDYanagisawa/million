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
 * Generated enum FileHandling declared at extension print.
 */
@SuppressWarnings("PMD")
public enum FileHandling implements HybrisEnumValue
{
	/**
	 * Generated enum value for FileHandling.PUBLICATION declared at extension print.
	 */
	PUBLICATION("PUBLICATION"),
	/**
	 * Generated enum value for FileHandling.CHAPTER declared at extension print.
	 */
	CHAPTER("CHAPTER"),
	/**
	 * Generated enum value for FileHandling.PAGE declared at extension print.
	 */
	PAGE("PAGE"),
	/**
	 * Generated enum value for FileHandling.CUSTOM declared at extension print.
	 */
	CUSTOM("CUSTOM"),
	/**
	 * Generated enum value for FileHandling.DISABLED declared at extension print.
	 */
	DISABLED("DISABLED");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "FileHandling";
	
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private FileHandling(final String code)
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
