/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 2015/05/18 13:25:59
 * ----------------------------------------------------------------
 *
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package de.hybris.platform.commercewebservicescommons.dto.product;

import de.hybris.platform.commercewebservicescommons.dto.product.PriceWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.product.StockWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.product.VariantOptionQualifierWsDTO;
import java.util.Collection;

public class VariantOptionWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>VariantOptionWsDTO.variantOptionQualifiers</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Collection<VariantOptionQualifierWsDTO> variantOptionQualifiers;
	/** <i>Generated property</i> for <code>VariantOptionWsDTO.stock</code> property defined at extension <code>commercewebservicescommons</code>. */
	private StockWsDTO stock;
	/** <i>Generated property</i> for <code>VariantOptionWsDTO.priceData</code> property defined at extension <code>commercewebservicescommons</code>. */
	private PriceWsDTO priceData;
	/** <i>Generated property</i> for <code>VariantOptionWsDTO.code</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String code;
	/** <i>Generated property</i> for <code>VariantOptionWsDTO.url</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String url;
		
	public VariantOptionWsDTO()
	{
		// default constructor
	}
	
		
	public void setVariantOptionQualifiers(final Collection<VariantOptionQualifierWsDTO> variantOptionQualifiers)
	{
		this.variantOptionQualifiers = variantOptionQualifiers;
	}
	
		
	public Collection<VariantOptionQualifierWsDTO> getVariantOptionQualifiers() 
	{
		return variantOptionQualifiers;
	}
		
		
	public void setStock(final StockWsDTO stock)
	{
		this.stock = stock;
	}
	
		
	public StockWsDTO getStock() 
	{
		return stock;
	}
		
		
	public void setPriceData(final PriceWsDTO priceData)
	{
		this.priceData = priceData;
	}
	
		
	public PriceWsDTO getPriceData() 
	{
		return priceData;
	}
		
		
	public void setCode(final String code)
	{
		this.code = code;
	}
	
		
	public String getCode() 
	{
		return code;
	}
		
		
	public void setUrl(final String url)
	{
		this.url = url;
	}
	
		
	public String getUrl() 
	{
		return url;
	}
		
	
}