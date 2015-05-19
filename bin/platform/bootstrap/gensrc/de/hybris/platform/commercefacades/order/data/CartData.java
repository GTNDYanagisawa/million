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
package de.hybris.platform.commercefacades.order.data;

import de.hybris.platform.commercefacades.order.data.AbstractOrderData;
import de.hybris.platform.commercefacades.product.data.PromotionResultData;
import java.util.List;

public class CartData extends AbstractOrderData 
{

	/** <i>Generated property</i> for <code>CartData.potentialProductPromotions</code> property defined at extension <code>commercefacades</code>. */
	private List<PromotionResultData> potentialProductPromotions;
	/** <i>Generated property</i> for <code>CartData.potentialOrderPromotions</code> property defined at extension <code>commercefacades</code>. */
	private List<PromotionResultData> potentialOrderPromotions;
	/** <i>Generated property</i> for <code>CartData.totalUnitCount</code> property defined at extension <code>commercefacades</code>. */
	private Integer totalUnitCount;
		
	public CartData()
	{
		// default constructor
	}
	
		
	public void setPotentialProductPromotions(final List<PromotionResultData> potentialProductPromotions)
	{
		this.potentialProductPromotions = potentialProductPromotions;
	}
	
		
	public List<PromotionResultData> getPotentialProductPromotions() 
	{
		return potentialProductPromotions;
	}
		
		
	public void setPotentialOrderPromotions(final List<PromotionResultData> potentialOrderPromotions)
	{
		this.potentialOrderPromotions = potentialOrderPromotions;
	}
	
		
	public List<PromotionResultData> getPotentialOrderPromotions() 
	{
		return potentialOrderPromotions;
	}
		
		
	public void setTotalUnitCount(final Integer totalUnitCount)
	{
		this.totalUnitCount = totalUnitCount;
	}
	
		
	public Integer getTotalUnitCount() 
	{
		return totalUnitCount;
	}
		
	
}