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
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type PromotionPriceRow first defined at extension promotions.
 */
@SuppressWarnings("all")
public class PromotionPriceRowModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PromotionPriceRow";
	
	/** <i>Generated constant</i> - Attribute key of <code>PromotionPriceRow.currency</code> attribute defined at extension <code>promotions</code>. */
	public static final String CURRENCY = "currency";
	
	/** <i>Generated constant</i> - Attribute key of <code>PromotionPriceRow.price</code> attribute defined at extension <code>promotions</code>. */
	public static final String PRICE = "price";
	
	
	/** <i>Generated variable</i> - Variable of <code>PromotionPriceRow.currency</code> attribute defined at extension <code>promotions</code>. */
	private CurrencyModel _currency;
	
	/** <i>Generated variable</i> - Variable of <code>PromotionPriceRow.price</code> attribute defined at extension <code>promotions</code>. */
	private Double _price;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PromotionPriceRowModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PromotionPriceRowModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _currency initial attribute declared by type <code>PromotionPriceRow</code> at extension <code>promotions</code>
	 */
	@Deprecated
	public PromotionPriceRowModel(final CurrencyModel _currency)
	{
		super();
		setCurrency(_currency);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _currency initial attribute declared by type <code>PromotionPriceRow</code> at extension <code>promotions</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public PromotionPriceRowModel(final CurrencyModel _currency, final ItemModel _owner)
	{
		super();
		setCurrency(_currency);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PromotionPriceRow.currency</code> attribute defined at extension <code>promotions</code>. 
	 * @return the currency
	 */
	public CurrencyModel getCurrency()
	{
		if (this._currency!=null)
		{
			return _currency;
		}
		return _currency = getPersistenceContext().getValue(CURRENCY, _currency);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PromotionPriceRow.price</code> attribute defined at extension <code>promotions</code>. 
	 * @return the price
	 */
	public Double getPrice()
	{
		if (this._price!=null)
		{
			return _price;
		}
		return _price = getPersistenceContext().getValue(PRICE, _price);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PromotionPriceRow.currency</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the currency
	 */
	public void setCurrency(final CurrencyModel value)
	{
		_currency = getPersistenceContext().setValue(CURRENCY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PromotionPriceRow.price</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the price
	 */
	public void setPrice(final Double value)
	{
		_price = getPersistenceContext().setValue(PRICE, value);
	}
	
}
