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
package de.hybris.platform.wishlist2.enums;

import de.hybris.platform.core.HybrisEnumValue;

/**
 * Generated enum Wishlist2EntryPriority declared at extension wishlist.
 */
@SuppressWarnings("PMD")
public enum Wishlist2EntryPriority implements HybrisEnumValue
{
	/**
	 * Generated enum value for Wishlist2EntryPriority.highest declared at extension wishlist.
	 */
	HIGHEST("highest"),
	/**
	 * Generated enum value for Wishlist2EntryPriority.high declared at extension wishlist.
	 */
	HIGH("high"),
	/**
	 * Generated enum value for Wishlist2EntryPriority.medium declared at extension wishlist.
	 */
	MEDIUM("medium"),
	/**
	 * Generated enum value for Wishlist2EntryPriority.low declared at extension wishlist.
	 */
	LOW("low"),
	/**
	 * Generated enum value for Wishlist2EntryPriority.lowest declared at extension wishlist.
	 */
	LOWEST("lowest");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "Wishlist2EntryPriority";
	
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private Wishlist2EntryPriority(final String code)
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
