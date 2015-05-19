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
 * Generated enum ArticleReference declared at extension bmecat.
 */
@SuppressWarnings("PMD")
public enum ArticleReference implements HybrisEnumValue
{
	/**
	 * Generated enum value for ArticleReference.sparepart declared at extension bmecat.
	 */
	SPAREPART("sparepart"),
	/**
	 * Generated enum value for ArticleReference.similar declared at extension bmecat.
	 */
	SIMILAR("similar"),
	/**
	 * Generated enum value for ArticleReference.followup declared at extension bmecat.
	 */
	FOLLOWUP("followup"),
	/**
	 * Generated enum value for ArticleReference.mandatory declared at extension bmecat.
	 */
	MANDATORY("mandatory"),
	/**
	 * Generated enum value for ArticleReference.select declared at extension bmecat.
	 */
	SELECT("select"),
	/**
	 * Generated enum value for ArticleReference.diff_orderunit declared at extension bmecat.
	 */
	DIFF_ORDERUNIT("diff_orderunit"),
	/**
	 * Generated enum value for ArticleReference.accessories declared at extension bmecat.
	 */
	ACCESSORIES("accessories"),
	/**
	 * Generated enum value for ArticleReference.consists_of declared at extension bmecat.
	 */
	CONSISTS_OF("consists_of"),
	/**
	 * Generated enum value for ArticleReference.others declared at extension bmecat.
	 */
	OTHERS("others");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ArticleReference";
	
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private ArticleReference(final String code)
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
