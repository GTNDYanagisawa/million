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
 * Generated enum ArticleAttributeEnum declared at extension bmecat.
 */
@SuppressWarnings("PMD")
public enum ArticleAttributeEnum implements HybrisEnumValue
{
	/**
	 * Generated enum value for ArticleAttributeEnum.ArticleReferences declared at extension bmecat.
	 */
	ARTICLEREFERENCES("ArticleReferences"),
	/**
	 * Generated enum value for ArticleAttributeEnum.ArticleStatus declared at extension bmecat.
	 */
	ARTICLESTATUS("ArticleStatus"),
	/**
	 * Generated enum value for ArticleAttributeEnum.BuyerIDS declared at extension bmecat.
	 */
	BUYERIDS("BuyerIDS"),
	/**
	 * Generated enum value for ArticleAttributeEnum.Catalog declared at extension bmecat.
	 */
	CATALOG("Catalog"),
	/**
	 * Generated enum value for ArticleAttributeEnum.CatalogVersion declared at extension bmecat.
	 */
	CATALOGVERSION("CatalogVersion"),
	/**
	 * Generated enum value for ArticleAttributeEnum.ContentUnit declared at extension bmecat.
	 */
	CONTENTUNIT("ContentUnit"),
	/**
	 * Generated enum value for ArticleAttributeEnum.DeliveryTime declared at extension bmecat.
	 */
	DELIVERYTIME("DeliveryTime"),
	/**
	 * Generated enum value for ArticleAttributeEnum.EAN declared at extension bmecat.
	 */
	EAN("EAN"),
	/**
	 * Generated enum value for ArticleAttributeEnum.ErpGroupBuyer declared at extension bmecat.
	 */
	ERPGROUPBUYER("ErpGroupBuyer"),
	/**
	 * Generated enum value for ArticleAttributeEnum.ErpGroupSupplier declared at extension bmecat.
	 */
	ERPGROUPSUPPLIER("ErpGroupSupplier"),
	/**
	 * Generated enum value for ArticleAttributeEnum.Features declared at extension bmecat.
	 */
	FEATURES("Features"),
	/**
	 * Generated enum value for ArticleAttributeEnum.Keywords declared at extension bmecat.
	 */
	KEYWORDS("Keywords"),
	/**
	 * Generated enum value for ArticleAttributeEnum.LongDescription declared at extension bmecat.
	 */
	LONGDESCRIPTION("LongDescription"),
	/**
	 * Generated enum value for ArticleAttributeEnum.ManufacturerAID declared at extension bmecat.
	 */
	MANUFACTURERAID("ManufacturerAID"),
	/**
	 * Generated enum value for ArticleAttributeEnum.ManufacturerName declared at extension bmecat.
	 */
	MANUFACTURERNAME("ManufacturerName"),
	/**
	 * Generated enum value for ArticleAttributeEnum.ManufacturerTypeDescription declared at extension bmecat.
	 */
	MANUFACTURERTYPEDESCRIPTION("ManufacturerTypeDescription"),
	/**
	 * Generated enum value for ArticleAttributeEnum.MinOrderQuantity declared at extension bmecat.
	 */
	MINORDERQUANTITY("MinOrderQuantity"),
	/**
	 * Generated enum value for ArticleAttributeEnum.NumberContentUnits declared at extension bmecat.
	 */
	NUMBERCONTENTUNITS("NumberContentUnits"),
	/**
	 * Generated enum value for ArticleAttributeEnum.Order declared at extension bmecat.
	 */
	ORDER("Order"),
	/**
	 * Generated enum value for ArticleAttributeEnum.OrderQuantityInterval declared at extension bmecat.
	 */
	ORDERQUANTITYINTERVAL("OrderQuantityInterval"),
	/**
	 * Generated enum value for ArticleAttributeEnum.OrderUnit declared at extension bmecat.
	 */
	ORDERUNIT("OrderUnit"),
	/**
	 * Generated enum value for ArticleAttributeEnum.PriceDetails declared at extension bmecat.
	 */
	PRICEDETAILS("PriceDetails"),
	/**
	 * Generated enum value for ArticleAttributeEnum.PriceQuantity declared at extension bmecat.
	 */
	PRICEQUANTITY("PriceQuantity"),
	/**
	 * Generated enum value for ArticleAttributeEnum.Remarks declared at extension bmecat.
	 */
	REMARKS("Remarks"),
	/**
	 * Generated enum value for ArticleAttributeEnum.Segment declared at extension bmecat.
	 */
	SEGMENT("Segment"),
	/**
	 * Generated enum value for ArticleAttributeEnum.ShortDescription declared at extension bmecat.
	 */
	SHORTDESCRIPTION("ShortDescription"),
	/**
	 * Generated enum value for ArticleAttributeEnum.SpecialTreatmentClasses declared at extension bmecat.
	 */
	SPECIALTREATMENTCLASSES("SpecialTreatmentClasses"),
	/**
	 * Generated enum value for ArticleAttributeEnum.SupplierAID declared at extension bmecat.
	 */
	SUPPLIERAID("SupplierAID"),
	/**
	 * Generated enum value for ArticleAttributeEnum.SupplierAlternativeAID declared at extension bmecat.
	 */
	SUPPLIERALTERNATIVEAID("SupplierAlternativeAID");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ArticleAttributeEnum";
	
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private ArticleAttributeEnum(final String code)
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
