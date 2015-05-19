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
 * Generated enum PDFPresetEnum declared at extension print.
 */
@SuppressWarnings("PMD")
public enum PDFPresetEnum implements HybrisEnumValue
{
	/**
	 * Generated enum value for PDFPresetEnum.HighQualityPrint declared at extension print.
	 */
	HIGHQUALITYPRINT("HighQualityPrint"),
	/**
	 * Generated enum value for PDFPresetEnum.PDFX_1a declared at extension print.
	 */
	PDFX_1A("PDFX_1a"),
	/**
	 * Generated enum value for PDFPresetEnum.PDFX_3 declared at extension print.
	 */
	PDFX_3("PDFX_3"),
	/**
	 * Generated enum value for PDFPresetEnum.PDFX_4 declared at extension print.
	 */
	PDFX_4("PDFX_4"),
	/**
	 * Generated enum value for PDFPresetEnum.PressQuality declared at extension print.
	 */
	PRESSQUALITY("PressQuality"),
	/**
	 * Generated enum value for PDFPresetEnum.RichContentPDF declared at extension print.
	 */
	RICHCONTENTPDF("RichContentPDF"),
	/**
	 * Generated enum value for PDFPresetEnum.SmallestFileSize declared at extension print.
	 */
	SMALLESTFILESIZE("SmallestFileSize");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PDFPresetEnum";
	
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private PDFPresetEnum(final String code)
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
