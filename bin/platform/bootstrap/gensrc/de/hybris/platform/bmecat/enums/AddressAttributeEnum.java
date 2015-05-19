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
 * Generated enum AddressAttributeEnum declared at extension bmecat.
 */
@SuppressWarnings("PMD")
public enum AddressAttributeEnum implements HybrisEnumValue
{
	/**
	 * Generated enum value for AddressAttributeEnum.Name declared at extension bmecat.
	 */
	NAME("Name"),
	/**
	 * Generated enum value for AddressAttributeEnum.Name2 declared at extension bmecat.
	 */
	NAME2("Name2"),
	/**
	 * Generated enum value for AddressAttributeEnum.Name3 declared at extension bmecat.
	 */
	NAME3("Name3"),
	/**
	 * Generated enum value for AddressAttributeEnum.Contact declared at extension bmecat.
	 */
	CONTACT("Contact"),
	/**
	 * Generated enum value for AddressAttributeEnum.Street declared at extension bmecat.
	 */
	STREET("Street"),
	/**
	 * Generated enum value for AddressAttributeEnum.Zip declared at extension bmecat.
	 */
	ZIP("Zip"),
	/**
	 * Generated enum value for AddressAttributeEnum.BoxNo declared at extension bmecat.
	 */
	BOXNO("BoxNo"),
	/**
	 * Generated enum value for AddressAttributeEnum.ZipBox declared at extension bmecat.
	 */
	ZIPBOX("ZipBox"),
	/**
	 * Generated enum value for AddressAttributeEnum.City declared at extension bmecat.
	 */
	CITY("City"),
	/**
	 * Generated enum value for AddressAttributeEnum.State declared at extension bmecat.
	 */
	STATE("State"),
	/**
	 * Generated enum value for AddressAttributeEnum.Country declared at extension bmecat.
	 */
	COUNTRY("Country"),
	/**
	 * Generated enum value for AddressAttributeEnum.Phone declared at extension bmecat.
	 */
	PHONE("Phone"),
	/**
	 * Generated enum value for AddressAttributeEnum.Fax declared at extension bmecat.
	 */
	FAX("Fax"),
	/**
	 * Generated enum value for AddressAttributeEnum.eMail declared at extension bmecat.
	 */
	EMAIL("eMail"),
	/**
	 * Generated enum value for AddressAttributeEnum.PublicKey declared at extension bmecat.
	 */
	PUBLICKEY("PublicKey"),
	/**
	 * Generated enum value for AddressAttributeEnum.Url declared at extension bmecat.
	 */
	URL("Url"),
	/**
	 * Generated enum value for AddressAttributeEnum.Remarks declared at extension bmecat.
	 */
	REMARKS("Remarks");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "AddressAttributeEnum";
	
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private AddressAttributeEnum(final String code)
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
