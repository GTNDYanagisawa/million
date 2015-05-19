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

import de.hybris.platform.commercewebservicescommons.dto.product.ProductWsDTO;
import java.util.List;

public class ProductListWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>ProductListWsDTO.totalPageCount</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Integer totalPageCount;
	/** <i>Generated property</i> for <code>ProductListWsDTO.catalog</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String catalog;
	/** <i>Generated property</i> for <code>ProductListWsDTO.totalProductCount</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Integer totalProductCount;
	/** <i>Generated property</i> for <code>ProductListWsDTO.currentPage</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Integer currentPage;
	/** <i>Generated property</i> for <code>ProductListWsDTO.products</code> property defined at extension <code>commercewebservicescommons</code>. */
	private List<ProductWsDTO> products;
	/** <i>Generated property</i> for <code>ProductListWsDTO.version</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String version;
		
	public ProductListWsDTO()
	{
		// default constructor
	}
	
		
	public void setTotalPageCount(final Integer totalPageCount)
	{
		this.totalPageCount = totalPageCount;
	}
	
		
	public Integer getTotalPageCount() 
	{
		return totalPageCount;
	}
		
		
	public void setCatalog(final String catalog)
	{
		this.catalog = catalog;
	}
	
		
	public String getCatalog() 
	{
		return catalog;
	}
		
		
	public void setTotalProductCount(final Integer totalProductCount)
	{
		this.totalProductCount = totalProductCount;
	}
	
		
	public Integer getTotalProductCount() 
	{
		return totalProductCount;
	}
		
		
	public void setCurrentPage(final Integer currentPage)
	{
		this.currentPage = currentPage;
	}
	
		
	public Integer getCurrentPage() 
	{
		return currentPage;
	}
		
		
	public void setProducts(final List<ProductWsDTO> products)
	{
		this.products = products;
	}
	
		
	public List<ProductWsDTO> getProducts() 
	{
		return products;
	}
		
		
	public void setVersion(final String version)
	{
		this.version = version;
	}
	
		
	public String getVersion() 
	{
		return version;
	}
		
	
}