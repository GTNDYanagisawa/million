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
 * Generated enum BMECatPriceTypeEnum declared at extension bmecat.
 */
@SuppressWarnings("PMD")
public enum BMECatPriceTypeEnum implements HybrisEnumValue
{
	/**
	 * Generated enum value for BMECatPriceTypeEnum.net_list declared at extension bmecat.
	 */
	NET_LIST("net_list"),
	/**
	 * Generated enum value for BMECatPriceTypeEnum.gros_list declared at extension bmecat.
	 */
	GROS_LIST("gros_list"),
	/**
	 * Generated enum value for BMECatPriceTypeEnum.net_customer declared at extension bmecat.
	 */
	NET_CUSTOMER("net_customer"),
	/**
	 * Generated enum value for BMECatPriceTypeEnum.nrp declared at extension bmecat.
	 */
	NRP("nrp"),
	/**
	 * Generated enum value for BMECatPriceTypeEnum.net_customer_exp declared at extension bmecat.
	 */
	NET_CUSTOMER_EXP("net_customer_exp");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BMECatPriceTypeEnum";
	
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private BMECatPriceTypeEnum(final String code)
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
