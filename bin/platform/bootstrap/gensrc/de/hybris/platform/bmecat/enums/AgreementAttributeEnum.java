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
 * Generated enum AgreementAttributeEnum declared at extension bmecat.
 */
@SuppressWarnings("PMD")
public enum AgreementAttributeEnum implements HybrisEnumValue
{
	/**
	 * Generated enum value for AgreementAttributeEnum.ID declared at extension bmecat.
	 */
	ID("ID"),
	/**
	 * Generated enum value for AgreementAttributeEnum.StartDate declared at extension bmecat.
	 */
	STARTDATE("StartDate"),
	/**
	 * Generated enum value for AgreementAttributeEnum.EndDate declared at extension bmecat.
	 */
	ENDDATE("EndDate"),
	/**
	 * Generated enum value for AgreementAttributeEnum.CatalogVersion declared at extension bmecat.
	 */
	CATALOGVERSION("CatalogVersion");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "AgreementAttributeEnum";
	
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private AgreementAttributeEnum(final String code)
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
