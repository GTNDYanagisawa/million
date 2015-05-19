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
 * Generated enum CategoryAttributeEnum declared at extension bmecat.
 */
@SuppressWarnings("PMD")
public enum CategoryAttributeEnum implements HybrisEnumValue
{
	/**
	 * Generated enum value for CategoryAttributeEnum.ID declared at extension bmecat.
	 */
	ID("ID"),
	/**
	 * Generated enum value for CategoryAttributeEnum.Order declared at extension bmecat.
	 */
	ORDER("Order"),
	/**
	 * Generated enum value for CategoryAttributeEnum.Parent declared at extension bmecat.
	 */
	PARENT("Parent"),
	/**
	 * Generated enum value for CategoryAttributeEnum.Description declared at extension bmecat.
	 */
	DESCRIPTION("Description"),
	/**
	 * Generated enum value for CategoryAttributeEnum.Keywords declared at extension bmecat.
	 */
	KEYWORDS("Keywords"),
	/**
	 * Generated enum value for CategoryAttributeEnum.Name declared at extension bmecat.
	 */
	NAME("Name"),
	/**
	 * Generated enum value for CategoryAttributeEnum.Catalog declared at extension bmecat.
	 */
	CATALOG("Catalog"),
	/**
	 * Generated enum value for CategoryAttributeEnum.CatalogVersion declared at extension bmecat.
	 */
	CATALOGVERSION("CatalogVersion");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CategoryAttributeEnum";
	
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private CategoryAttributeEnum(final String code)
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
