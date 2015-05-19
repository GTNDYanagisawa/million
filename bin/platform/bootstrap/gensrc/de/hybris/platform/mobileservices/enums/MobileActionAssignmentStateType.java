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
package de.hybris.platform.mobileservices.enums;

import de.hybris.platform.core.HybrisEnumValue;

/**
 * Generated enum MobileActionAssignmentStateType declared at extension mobileservices.
 */
@SuppressWarnings("PMD")
public enum MobileActionAssignmentStateType implements HybrisEnumValue
{
	/**
	 * Generated enum value for MobileActionAssignmentStateType.ACTIVE declared at extension mobileservices.
	 */
	ACTIVE("ACTIVE"),
	/**
	 * Generated enum value for MobileActionAssignmentStateType.TESTMODE declared at extension mobileservices.
	 */
	TESTMODE("TESTMODE"),
	/**
	 * Generated enum value for MobileActionAssignmentStateType.OFF declared at extension mobileservices.
	 */
	OFF("OFF");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "MobileActionAssignmentStateType";
	
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private MobileActionAssignmentStateType(final String code)
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
