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
package de.hybris.platform.commercefacades.catalog.data;

import de.hybris.platform.commercefacades.catalog.data.AbstractCatalogItemData;
import de.hybris.platform.commercefacades.catalog.data.CategoryHierarchyData;
import java.util.Collection;

public class CatalogVersionData extends AbstractCatalogItemData 
{

	/** <i>Generated property</i> for <code>CatalogVersionData.categoriesHierarchyData</code> property defined at extension <code>commercefacades</code>. */
	private Collection<CategoryHierarchyData> categoriesHierarchyData;
		
	public CatalogVersionData()
	{
		// default constructor
	}
	
		
	public void setCategoriesHierarchyData(final Collection<CategoryHierarchyData> categoriesHierarchyData)
	{
		this.categoriesHierarchyData = categoriesHierarchyData;
	}
	
		
	public Collection<CategoryHierarchyData> getCategoriesHierarchyData() 
	{
		return categoriesHierarchyData;
	}
		
	
}