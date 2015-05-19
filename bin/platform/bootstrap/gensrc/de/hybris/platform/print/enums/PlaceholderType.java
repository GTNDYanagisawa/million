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
 * Generated enum PlaceholderType declared at extension print.
 */
@SuppressWarnings("PMD")
public enum PlaceholderType implements HybrisEnumValue
{
	/**
	 * Generated enum value for PlaceholderType.crossref declared at extension print.
	 */
	CROSSREF("crossref"),
	/**
	 * Generated enum value for PlaceholderType.document declared at extension print.
	 */
	DOCUMENT("document"),
	/**
	 * Generated enum value for PlaceholderType.imageframe declared at extension print.
	 */
	IMAGEFRAME("imageframe"),
	/**
	 * Generated enum value for PlaceholderType.multi_frames declared at extension print.
	 */
	MULTI_FRAMES("multi_frames"),
	/**
	 * Generated enum value for PlaceholderType.multi_text declared at extension print.
	 */
	MULTI_TEXT("multi_text"),
	/**
	 * Generated enum value for PlaceholderType.table declared at extension print.
	 */
	TABLE("table"),
	/**
	 * Generated enum value for PlaceholderType.text declared at extension print.
	 */
	TEXT("text"),
	/**
	 * Generated enum value for PlaceholderType.textframe declared at extension print.
	 */
	TEXTFRAME("textframe"),
	/**
	 * Generated enum value for PlaceholderType.xml_element declared at extension print.
	 */
	XML_ELEMENT("xml_element");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PlaceholderType";
	
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private PlaceholderType(final String code)
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
