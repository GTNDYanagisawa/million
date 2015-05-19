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
 * Generated enum CrossReferenceReplacement declared at extension print.
 */
@SuppressWarnings("PMD")
public enum CrossReferenceReplacement implements HybrisEnumValue
{
	/**
	 * Generated enum value for CrossReferenceReplacement.Document declared at extension print.
	 */
	DOCUMENT("Document"),
	/**
	 * Generated enum value for CrossReferenceReplacement.DocumentFolder declared at extension print.
	 */
	DOCUMENTFOLDER("DocumentFolder"),
	/**
	 * Generated enum value for CrossReferenceReplacement.DocumentPath declared at extension print.
	 */
	DOCUMENTPATH("DocumentPath"),
	/**
	 * Generated enum value for CrossReferenceReplacement.Page declared at extension print.
	 */
	PAGE("Page"),
	/**
	 * Generated enum value for CrossReferenceReplacement.DocumentPage declared at extension print.
	 */
	DOCUMENTPAGE("DocumentPage"),
	/**
	 * Generated enum value for CrossReferenceReplacement.PageName declared at extension print.
	 */
	PAGENAME("PageName"),
	/**
	 * Generated enum value for CrossReferenceReplacement.DocumentPageName declared at extension print.
	 */
	DOCUMENTPAGENAME("DocumentPageName"),
	/**
	 * Generated enum value for CrossReferenceReplacement.Name declared at extension print.
	 */
	NAME("Name"),
	/**
	 * Generated enum value for CrossReferenceReplacement.Destination declared at extension print.
	 */
	DESTINATION("Destination");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CrossReferenceReplacement";
	
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private CrossReferenceReplacement(final String code)
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
