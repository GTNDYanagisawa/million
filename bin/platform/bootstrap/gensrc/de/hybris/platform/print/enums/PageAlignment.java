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
 * Generated enum PageAlignment declared at extension print.
 */
@SuppressWarnings("PMD")
public enum PageAlignment implements HybrisEnumValue
{
	/**
	 * Generated enum value for PageAlignment.LEFT declared at extension print.
	 */
	LEFT("LEFT"),
	/**
	 * Generated enum value for PageAlignment.RIGHT declared at extension print.
	 */
	RIGHT("RIGHT"),
	/**
	 * Generated enum value for PageAlignment.AUTO declared at extension print.
	 */
	AUTO("AUTO");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PageAlignment";
	
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private PageAlignment(final String code)
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
