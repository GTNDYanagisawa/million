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
 * Generated enum ChapterStatus declared at extension print.
 */
@SuppressWarnings("PMD")
public enum ChapterStatus implements HybrisEnumValue
{
	/**
	 * Generated enum value for ChapterStatus.DRAFT declared at extension print.
	 */
	DRAFT("DRAFT"),
	/**
	 * Generated enum value for ChapterStatus.DONE declared at extension print.
	 */
	DONE("DONE");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ChapterStatus";
	
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private ChapterStatus(final String code)
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