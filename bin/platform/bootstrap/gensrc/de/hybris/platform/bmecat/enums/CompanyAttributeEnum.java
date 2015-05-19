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
 * Generated enum CompanyAttributeEnum declared at extension bmecat.
 */
@SuppressWarnings("PMD")
public enum CompanyAttributeEnum implements HybrisEnumValue
{
	/**
	 * Generated enum value for CompanyAttributeEnum.Name declared at extension bmecat.
	 */
	NAME("Name"),
	/**
	 * Generated enum value for CompanyAttributeEnum.DUNSID declared at extension bmecat.
	 */
	DUNSID("DUNSID"),
	/**
	 * Generated enum value for CompanyAttributeEnum.ILNID declared at extension bmecat.
	 */
	ILNID("ILNID"),
	/**
	 * Generated enum value for CompanyAttributeEnum.Id declared at extension bmecat.
	 */
	ID("Id"),
	/**
	 * Generated enum value for CompanyAttributeEnum.BuyerSpecificID declared at extension bmecat.
	 */
	BUYERSPECIFICID("BuyerSpecificID"),
	/**
	 * Generated enum value for CompanyAttributeEnum.SupplierSpecificID declared at extension bmecat.
	 */
	SUPPLIERSPECIFICID("SupplierSpecificID"),
	/**
	 * Generated enum value for CompanyAttributeEnum.Address declared at extension bmecat.
	 */
	ADDRESS("Address");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CompanyAttributeEnum";
	
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private CompanyAttributeEnum(final String code)
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
