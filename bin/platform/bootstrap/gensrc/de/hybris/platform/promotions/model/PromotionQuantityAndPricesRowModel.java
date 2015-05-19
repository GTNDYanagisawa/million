/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2015/05/18 13:25:55                         ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2011 hybris AG
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *  
 */
package de.hybris.platform.promotions.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.promotions.model.PromotionPriceRowModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type PromotionQuantityAndPricesRow first defined at extension promotions.
 */
@SuppressWarnings("all")
public class PromotionQuantityAndPricesRowModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PromotionQuantityAndPricesRow";
	
	/** <i>Generated constant</i> - Attribute key of <code>PromotionQuantityAndPricesRow.quantity</code> attribute defined at extension <code>promotions</code>. */
	public static final String QUANTITY = "quantity";
	
	/** <i>Generated constant</i> - Attribute key of <code>PromotionQuantityAndPricesRow.prices</code> attribute defined at extension <code>promotions</code>. */
	public static final String PRICES = "prices";
	
	
	/** <i>Generated variable</i> - Variable of <code>PromotionQuantityAndPricesRow.quantity</code> attribute defined at extension <code>promotions</code>. */
	private Long _quantity;
	
	/** <i>Generated variable</i> - Variable of <code>PromotionQuantityAndPricesRow.prices</code> attribute defined at extension <code>promotions</code>. */
	private Collection<PromotionPriceRowModel> _prices;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PromotionQuantityAndPricesRowModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PromotionQuantityAndPricesRowModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public PromotionQuantityAndPricesRowModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PromotionQuantityAndPricesRow.prices</code> attribute defined at extension <code>promotions</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the prices - Prices in specific currencies.
	 */
	public Collection<PromotionPriceRowModel> getPrices()
	{
		if (this._prices!=null)
		{
			return _prices;
		}
		return _prices = getPersistenceContext().getValue(PRICES, _prices);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PromotionQuantityAndPricesRow.quantity</code> attribute defined at extension <code>promotions</code>. 
	 * @return the quantity
	 */
	public Long getQuantity()
	{
		if (this._quantity!=null)
		{
			return _quantity;
		}
		return _quantity = getPersistenceContext().getValue(QUANTITY, _quantity);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PromotionQuantityAndPricesRow.prices</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the prices - Prices in specific currencies.
	 */
	public void setPrices(final Collection<PromotionPriceRowModel> value)
	{
		_prices = getPersistenceContext().setValue(PRICES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PromotionQuantityAndPricesRow.quantity</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the quantity
	 */
	public void setQuantity(final Long value)
	{
		_quantity = getPersistenceContext().setValue(QUANTITY, value);
	}
	
}
