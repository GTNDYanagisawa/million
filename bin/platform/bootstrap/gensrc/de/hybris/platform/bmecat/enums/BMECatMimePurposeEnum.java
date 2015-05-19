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
package de.hybris.platform.bmecat.enums;

import de.hybris.platform.core.HybrisEnumValue;

/**
 * Generated enum BMECatMimePurposeEnum declared at extension bmecat.
 */
@SuppressWarnings("PMD")
public enum BMECatMimePurposeEnum implements HybrisEnumValue
{
	/**
	 * Generated enum value for BMECatMimePurposeEnum.thumbnail declared at extension bmecat.
	 */
	THUMBNAIL("thumbnail"),
	/**
	 * Generated enum value for BMECatMimePurposeEnum.normal declared at extension bmecat.
	 */
	NORMAL("normal"),
	/**
	 * Generated enum value for BMECatMimePurposeEnum.detail declared at extension bmecat.
	 */
	DETAIL("detail"),
	/**
	 * Generated enum value for BMECatMimePurposeEnum.data_sheet declared at extension bmecat.
	 */
	DATA_SHEET("data_sheet"),
	/**
	 * Generated enum value for BMECatMimePurposeEnum.logo declared at extension bmecat.
	 */
	LOGO("logo"),
	/**
	 * Generated enum value for BMECatMimePurposeEnum.others declared at extension bmecat.
	 */
	OTHERS("others");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BMECatMimePurposeEnum";
	
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private BMECatMimePurposeEnum(final String code)
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
