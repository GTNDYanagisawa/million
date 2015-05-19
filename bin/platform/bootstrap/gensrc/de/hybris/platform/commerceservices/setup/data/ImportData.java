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
package de.hybris.platform.commerceservices.setup.data;

import java.util.List;

public class ImportData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>ImportData.productCatalogName</code> property defined at extension <code>commerceservices</code>. */
	private String productCatalogName;
	/** <i>Generated property</i> for <code>ImportData.storeNames</code> property defined at extension <code>commerceservices</code>. */
	private List<String> storeNames;
	/** <i>Generated property</i> for <code>ImportData.contentCatalogNames</code> property defined at extension <code>commerceservices</code>. */
	private List<String> contentCatalogNames;
		
	public ImportData()
	{
		// default constructor
	}
	
		
	public void setProductCatalogName(final String productCatalogName)
	{
		this.productCatalogName = productCatalogName;
	}
	
		
	public String getProductCatalogName() 
	{
		return productCatalogName;
	}
		
		
	public void setStoreNames(final List<String> storeNames)
	{
		this.storeNames = storeNames;
	}
	
		
	public List<String> getStoreNames() 
	{
		return storeNames;
	}
		
		
	public void setContentCatalogNames(final List<String> contentCatalogNames)
	{
		this.contentCatalogNames = contentCatalogNames;
	}
	
		
	public List<String> getContentCatalogNames() 
	{
		return contentCatalogNames;
	}
		
	
}