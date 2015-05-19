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

import de.hybris.platform.commercefacades.product.data.VariantOptionData;
import java.util.List;

public class BaseOptionData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>BaseOptionData.selected</code> property defined at extension <code>commercefacades</code>. */
	private VariantOptionData selected;
	/** <i>Generated property</i> for <code>BaseOptionData.variantType</code> property defined at extension <code>commercefacades</code>. */
	private String variantType;
	/** <i>Generated property</i> for <code>BaseOptionData.options</code> property defined at extension <code>commercefacades</code>. */
	private List<VariantOptionData> options;
		
	public BaseOptionData()
	{
		// default constructor
	}
	
		
	public void setSelected(final VariantOptionData selected)
	{
		this.selected = selected;
	}
	
		
	public VariantOptionData getSelected() 
	{
		return selected;
	}
		
		
	public void setVariantType(final String variantType)
	{
		this.variantType = variantType;
	}
	
		
	public String getVariantType() 
	{
		return variantType;
	}
		
		
	public void setOptions(final List<VariantOptionData> options)
	{
		this.options = options;
	}
	
		
	public List<VariantOptionData> getOptions() 
	{
		return options;
	}
		
	
}