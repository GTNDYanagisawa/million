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
 * Generated enum CatalogVersionAttributeEnum declared at extension bmecat.
 */
@SuppressWarnings("PMD")
public enum CatalogVersionAttributeEnum implements HybrisEnumValue
{
	/**
	 * Generated enum value for CatalogVersionAttributeEnum.Agreements declared at extension bmecat.
	 */
	AGREEMENTS("Agreements"),
	/**
	 * Generated enum value for CatalogVersionAttributeEnum.DefaultCurrency declared at extension bmecat.
	 */
	DEFAULTCURRENCY("DefaultCurrency"),
	/**
	 * Generated enum value for CatalogVersionAttributeEnum.GenerationDate declared at extension bmecat.
	 */
	GENERATIONDATE("GenerationDate"),
	/**
	 * Generated enum value for CatalogVersionAttributeEnum.GeneratorInfo declared at extension bmecat.
	 */
	GENERATORINFO("GeneratorInfo"),
	/**
	 * Generated enum value for CatalogVersionAttributeEnum.InclAssurance declared at extension bmecat.
	 */
	INCLASSURANCE("InclAssurance"),
	/**
	 * Generated enum value for CatalogVersionAttributeEnum.InclDuty declared at extension bmecat.
	 */
	INCLDUTY("InclDuty"),
	/**
	 * Generated enum value for CatalogVersionAttributeEnum.InclFreight declared at extension bmecat.
	 */
	INCLFREIGHT("InclFreight"),
	/**
	 * Generated enum value for CatalogVersionAttributeEnum.InclPacking declared at extension bmecat.
	 */
	INCLPACKING("InclPacking"),
	/**
	 * Generated enum value for CatalogVersionAttributeEnum.Language declared at extension bmecat.
	 */
	LANGUAGE("Language"),
	/**
	 * Generated enum value for CatalogVersionAttributeEnum.MimeRootDirectory declared at extension bmecat.
	 */
	MIMEROOTDIRECTORY("MimeRootDirectory"),
	/**
	 * Generated enum value for CatalogVersionAttributeEnum.Territories declared at extension bmecat.
	 */
	TERRITORIES("Territories"),
	/**
	 * Generated enum value for CatalogVersionAttributeEnum.FeatureSystems declared at extension bmecat.
	 */
	FEATURESYSTEMS("FeatureSystems"),
	/**
	 * Generated enum value for CatalogVersionAttributeEnum.Version declared at extension bmecat.
	 */
	VERSION("Version"),
	/**
	 * Generated enum value for CatalogVersionAttributeEnum.Catalog declared at extension bmecat.
	 */
	CATALOG("Catalog");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CatalogVersionAttributeEnum";
	
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private CatalogVersionAttributeEnum(final String code)
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
