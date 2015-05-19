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
package de.hybris.platform.cms2lib.enums;

import de.hybris.platform.core.HybrisEnumValue;

/**
 * Generated enum FlashSalign declared at extension cms2lib.
 */
@SuppressWarnings("PMD")
public enum FlashSalign implements HybrisEnumValue
{
	/**
	 * Generated enum value for FlashSalign.l declared at extension cms2lib.
	 */
	L("l"),
	/**
	 * Generated enum value for FlashSalign.r declared at extension cms2lib.
	 */
	R("r"),
	/**
	 * Generated enum value for FlashSalign.t declared at extension cms2lib.
	 */
	T("t"),
	/**
	 * Generated enum value for FlashSalign.tl declared at extension cms2lib.
	 */
	TL("tl"),
	/**
	 * Generated enum value for FlashSalign.tr declared at extension cms2lib.
	 */
	TR("tr");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "FlashSalign";
	
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private FlashSalign(final String code)
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
