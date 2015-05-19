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
 * Generated enum FlowControlEnum declared at extension print.
 */
@SuppressWarnings("PMD")
public enum FlowControlEnum implements HybrisEnumValue
{
	/**
	 * Generated enum value for FlowControlEnum.Flow declared at extension print.
	 */
	FLOW("Flow"),
	/**
	 * Generated enum value for FlowControlEnum.ColumnBreak declared at extension print.
	 */
	COLUMNBREAK("ColumnBreak"),
	/**
	 * Generated enum value for FlowControlEnum.FrameBreak declared at extension print.
	 */
	FRAMEBREAK("FrameBreak"),
	/**
	 * Generated enum value for FlowControlEnum.PageBreak declared at extension print.
	 */
	PAGEBREAK("PageBreak");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "FlowControlEnum";
	
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private FlowControlEnum(final String code)
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
