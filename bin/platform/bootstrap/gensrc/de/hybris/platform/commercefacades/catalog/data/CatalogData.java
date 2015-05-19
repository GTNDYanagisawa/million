/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 2015/05/18 13:26:00
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
package de.hybris.platform.commercefacades.catalog.data;

import de.hybris.platform.commercefacades.catalog.data.AbstractCatalogItemData;
import de.hybris.platform.commercefacades.catalog.data.CatalogVersionData;
import java.util.Collection;

public class CatalogData extends AbstractCatalogItemData 
{

	/** <i>Generated property</i> for <code>CatalogData.catalogVersions</code> property defined at extension <code>commercefacades</code>. */
	private Collection<CatalogVersionData> catalogVersions;
		
	public CatalogData()
	{
		// default constructor
	}
	
		
	public void setCatalogVersions(final Collection<CatalogVersionData> catalogVersions)
	{
		this.catalogVersions = catalogVersions;
	}
	
		
	public Collection<CatalogVersionData> getCatalogVersions() 
	{
		return catalogVersions;
	}
		
	
}