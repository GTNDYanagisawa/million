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

import de.hybris.platform.commercefacades.product.data.VariantCategoryData;
import de.hybris.platform.commercefacades.product.data.VariantMatrixElementData;
import de.hybris.platform.commercefacades.product.data.VariantOptionData;
import de.hybris.platform.commercefacades.product.data.VariantValueCategoryData;
import java.util.List;

public class VariantMatrixElementData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>VariantMatrixElementData.parentVariantCategory</code> property defined at extension <code>commercefacades</code>. */
	private VariantCategoryData parentVariantCategory;
	/** <i>Generated property</i> for <code>VariantMatrixElementData.isLeaf</code> property defined at extension <code>commercefacades</code>. */
	private Boolean isLeaf;
	/** <i>Generated property</i> for <code>VariantMatrixElementData.variantOption</code> property defined at extension <code>commercefacades</code>. */
	private VariantOptionData variantOption;
	/** <i>Generated property</i> for <code>VariantMatrixElementData.elements</code> property defined at extension <code>commercefacades</code>. */
	private List<VariantMatrixElementData> elements;
	/** <i>Generated property</i> for <code>VariantMatrixElementData.variantValueCategory</code> property defined at extension <code>commercefacades</code>. */
	private VariantValueCategoryData variantValueCategory;
		
	public VariantMatrixElementData()
	{
		// default constructor
	}
	
		
	public void setParentVariantCategory(final VariantCategoryData parentVariantCategory)
	{
		this.parentVariantCategory = parentVariantCategory;
	}
	
		
	public VariantCategoryData getParentVariantCategory() 
	{
		return parentVariantCategory;
	}
		
		
	public void setIsLeaf(final Boolean isLeaf)
	{
		this.isLeaf = isLeaf;
	}
	
		
	public Boolean getIsLeaf() 
	{
		return isLeaf;
	}
		
		
	public void setVariantOption(final VariantOptionData variantOption)
	{
		this.variantOption = variantOption;
	}
	
		
	public VariantOptionData getVariantOption() 
	{
		return variantOption;
	}
		
		
	public void setElements(final List<VariantMatrixElementData> elements)
	{
		this.elements = elements;
	}
	
		
	public List<VariantMatrixElementData> getElements() 
	{
		return elements;
	}
		
		
	public void setVariantValueCategory(final VariantValueCategoryData variantValueCategory)
	{
		this.variantValueCategory = variantValueCategory;
	}
	
		
	public VariantValueCategoryData getVariantValueCategory() 
	{
		return variantValueCategory;
	}
		
	
}