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

import de.hybris.platform.commercewebservicescommons.dto.product.VariantCategoryWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.product.VariantMatrixElementWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.product.VariantOptionWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.product.VariantValueCategoryWsDTO;
import java.util.List;

public class VariantMatrixElementWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>VariantMatrixElementWsDTO.parentVariantCategory</code> property defined at extension <code>commercewebservicescommons</code>. */
	private VariantCategoryWsDTO parentVariantCategory;
	/** <i>Generated property</i> for <code>VariantMatrixElementWsDTO.isLeaf</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Boolean isLeaf;
	/** <i>Generated property</i> for <code>VariantMatrixElementWsDTO.variantOption</code> property defined at extension <code>commercewebservicescommons</code>. */
	private VariantOptionWsDTO variantOption;
	/** <i>Generated property</i> for <code>VariantMatrixElementWsDTO.elements</code> property defined at extension <code>commercewebservicescommons</code>. */
	private List<VariantMatrixElementWsDTO> elements;
	/** <i>Generated property</i> for <code>VariantMatrixElementWsDTO.variantValueCategory</code> property defined at extension <code>commercewebservicescommons</code>. */
	private VariantValueCategoryWsDTO variantValueCategory;
		
	public VariantMatrixElementWsDTO()
	{
		// default constructor
	}
	
		
	public void setParentVariantCategory(final VariantCategoryWsDTO parentVariantCategory)
	{
		this.parentVariantCategory = parentVariantCategory;
	}
	
		
	public VariantCategoryWsDTO getParentVariantCategory() 
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
		
		
	public void setVariantOption(final VariantOptionWsDTO variantOption)
	{
		this.variantOption = variantOption;
	}
	
		
	public VariantOptionWsDTO getVariantOption() 
	{
		return variantOption;
	}
		
		
	public void setElements(final List<VariantMatrixElementWsDTO> elements)
	{
		this.elements = elements;
	}
	
		
	public List<VariantMatrixElementWsDTO> getElements() 
	{
		return elements;
	}
		
		
	public void setVariantValueCategory(final VariantValueCategoryWsDTO variantValueCategory)
	{
		this.variantValueCategory = variantValueCategory;
	}
	
		
	public VariantValueCategoryWsDTO getVariantValueCategory() 
	{
		return variantValueCategory;
	}
		
	
}