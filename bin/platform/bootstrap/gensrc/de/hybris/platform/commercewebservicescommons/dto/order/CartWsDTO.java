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
package de.hybris.platform.commercewebservicescommons.dto.order;

import de.hybris.platform.commercewebservicescommons.dto.order.AbstractOrderWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.product.PromotionResultWsDTO;
import java.util.List;

public class CartWsDTO extends AbstractOrderWsDTO 
{

	/** <i>Generated property</i> for <code>CartWsDTO.potentialProductPromotions</code> property defined at extension <code>commercewebservicescommons</code>. */
	private List<PromotionResultWsDTO> potentialProductPromotions;
	/** <i>Generated property</i> for <code>CartWsDTO.potentialOrderPromotions</code> property defined at extension <code>commercewebservicescommons</code>. */
	private List<PromotionResultWsDTO> potentialOrderPromotions;
	/** <i>Generated property</i> for <code>CartWsDTO.totalUnitCount</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Integer totalUnitCount;
		
	public CartWsDTO()
	{
		// default constructor
	}
	
		
	public void setPotentialProductPromotions(final List<PromotionResultWsDTO> potentialProductPromotions)
	{
		this.potentialProductPromotions = potentialProductPromotions;
	}
	
		
	public List<PromotionResultWsDTO> getPotentialProductPromotions() 
	{
		return potentialProductPromotions;
	}
		
		
	public void setPotentialOrderPromotions(final List<PromotionResultWsDTO> potentialOrderPromotions)
	{
		this.potentialOrderPromotions = potentialOrderPromotions;
	}
	
		
	public List<PromotionResultWsDTO> getPotentialOrderPromotions() 
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