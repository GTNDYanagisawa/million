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

import de.hybris.platform.commercewebservicescommons.dto.order.PromotionOrderEntryConsumedWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.product.PromotionWsDTO;
import java.util.List;

public class PromotionResultWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>PromotionResultWsDTO.description</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String description;
	/** <i>Generated property</i> for <code>PromotionResultWsDTO.promotion</code> property defined at extension <code>commercewebservicescommons</code>. */
	private PromotionWsDTO promotion;
	/** <i>Generated property</i> for <code>PromotionResultWsDTO.consumedEntries</code> property defined at extension <code>commercewebservicescommons</code>. */
	private List<PromotionOrderEntryConsumedWsDTO> consumedEntries;
		
	public PromotionResultWsDTO()
	{
		// default constructor
	}
	
		
	public void setDescription(final String description)
	{
		this.description = description;
	}
	
		
	public String getDescription() 
	{
		return description;
	}
		
		
	public void setPromotion(final PromotionWsDTO promotion)
	{
		this.promotion = promotion;
	}
	
		
	public PromotionWsDTO getPromotion() 
	{
		return promotion;
	}
		
		
	public void setConsumedEntries(final List<PromotionOrderEntryConsumedWsDTO> consumedEntries)
	{
		this.consumedEntries = consumedEntries;
	}
	
		
	public List<PromotionOrderEntryConsumedWsDTO> getConsumedEntries() 
	{
		return consumedEntries;
	}
		
	
}