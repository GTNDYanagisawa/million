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
package de.hybris.platform.commercesearchbackoffice.data;

import de.hybris.platform.commercefacades.storesession.data.LanguageData;
import de.hybris.platform.commercesearchbackoffice.data.CategoryData;
import java.util.List;

public class CategoryData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>CategoryData.categoryPath</code> property defined at extension <code>commercesearchbackoffice</code>. */
	private List<CategoryData> categoryPath;
	/** <i>Generated property</i> for <code>CategoryData.catalogVersionId</code> property defined at extension <code>commercesearchbackoffice</code>. */
	private String catalogVersionId;
	/** <i>Generated property</i> for <code>CategoryData.categoryName</code> property defined at extension <code>commercesearchbackoffice</code>. */
	private String categoryName;
	/** <i>Generated property</i> for <code>CategoryData.categoryId</code> property defined at extension <code>commercesearchbackoffice</code>. */
	private String categoryId;
	/** <i>Generated property</i> for <code>CategoryData.catalogId</code> property defined at extension <code>commercesearchbackoffice</code>. */
	private String catalogId;
	/** <i>Generated property</i> for <code>CategoryData.language</code> property defined at extension <code>commercesearchbackoffice</code>. */
	private LanguageData language;
		
	public CategoryData()
	{
		// default constructor
	}
	
		
	public void setCategoryPath(final List<CategoryData> categoryPath)
	{
		this.categoryPath = categoryPath;
	}
	
		
	public List<CategoryData> getCategoryPath() 
	{
		return categoryPath;
	}
		
		
	public void setCatalogVersionId(final String catalogVersionId)
	{
		this.catalogVersionId = catalogVersionId;
	}
	
		
	public String getCatalogVersionId() 
	{
		return catalogVersionId;
	}
		
		
	public void setCategoryName(final String categoryName)
	{
		this.categoryName = categoryName;
	}
	
		
	public String getCategoryName() 
	{
		return categoryName;
	}
		
		
	public void setCategoryId(final String categoryId)
	{
		this.categoryId = categoryId;
	}
	
		
	public String getCategoryId() 
	{
		return categoryId;
	}
		
		
	public void setCatalogId(final String catalogId)
	{
		this.catalogId = catalogId;
	}
	
		
	public String getCatalogId() 
	{
		return catalogId;
	}
		
		
	public void setLanguage(final LanguageData language)
	{
		this.language = language;
	}
	
		
	public LanguageData getLanguage() 
	{
		return language;
	}
		
	
}