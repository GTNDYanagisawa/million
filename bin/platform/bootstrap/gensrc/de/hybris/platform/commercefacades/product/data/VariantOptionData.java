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
package de.hybris.platform.commercefacades.product.data;

import de.hybris.platform.commercefacades.product.data.PriceData;
import de.hybris.platform.commercefacades.product.data.StockData;
import de.hybris.platform.commercefacades.product.data.VariantOptionQualifierData;
import java.util.Collection;

public class VariantOptionData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>VariantOptionData.variantOptionQualifiers</code> property defined at extension <code>commercefacades</code>. */
	private Collection<VariantOptionQualifierData> variantOptionQualifiers;
	/** <i>Generated property</i> for <code>VariantOptionData.stock</code> property defined at extension <code>commercefacades</code>. */
	private StockData stock;
	/** <i>Generated property</i> for <code>VariantOptionData.priceData</code> property defined at extension <code>commercefacades</code>. */
	private PriceData priceData;
	/** <i>Generated property</i> for <code>VariantOptionData.code</code> property defined at extension <code>commercefacades</code>. */
	private String code;
	/** <i>Generated property</i> for <code>VariantOptionData.url</code> property defined at extension <code>commercefacades</code>. */
	private String url;
		
	public VariantOptionData()
	{
		// default constructor
	}
	
		
	public void setVariantOptionQualifiers(final Collection<VariantOptionQualifierData> variantOptionQualifiers)
	{
		this.variantOptionQualifiers = variantOptionQualifiers;
	}
	
		
	public Collection<VariantOptionQualifierData> getVariantOptionQualifiers() 
	{
		return variantOptionQualifiers;
	}
		
		
	public void setStock(final StockData stock)
	{
		this.stock = stock;
	}
	
		
	public StockData getStock() 
	{
		return stock;
	}
		
		
	public void setPriceData(final PriceData priceData)
	{
		this.priceData = priceData;
	}
	
		
	public PriceData getPriceData() 
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