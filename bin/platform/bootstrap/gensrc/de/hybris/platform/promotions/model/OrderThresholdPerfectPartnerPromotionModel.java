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
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.promotions.model.OrderPromotionModel;
import de.hybris.platform.promotions.model.PromotionPriceRowModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Locale;

/**
 * Generated model class for type OrderThresholdPerfectPartnerPromotion first defined at extension promotions.
 */
@SuppressWarnings("all")
public class OrderThresholdPerfectPartnerPromotionModel extends OrderPromotionModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "OrderThresholdPerfectPartnerPromotion";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderThresholdPerfectPartnerPromotion.thresholdTotals</code> attribute defined at extension <code>promotions</code>. */
	public static final String THRESHOLDTOTALS = "thresholdTotals";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderThresholdPerfectPartnerPromotion.discountProduct</code> attribute defined at extension <code>promotions</code>. */
	public static final String DISCOUNTPRODUCT = "discountProduct";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderThresholdPerfectPartnerPromotion.productPrices</code> attribute defined at extension <code>promotions</code>. */
	public static final String PRODUCTPRICES = "productPrices";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderThresholdPerfectPartnerPromotion.includeDiscountedPriceInThreshold</code> attribute defined at extension <code>promotions</code>. */
	public static final String INCLUDEDISCOUNTEDPRICEINTHRESHOLD = "includeDiscountedPriceInThreshold";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderThresholdPerfectPartnerPromotion.messageFired</code> attribute defined at extension <code>promotions</code>. */
	public static final String MESSAGEFIRED = "messageFired";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderThresholdPerfectPartnerPromotion.messageCouldHaveFired</code> attribute defined at extension <code>promotions</code>. */
	public static final String MESSAGECOULDHAVEFIRED = "messageCouldHaveFired";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderThresholdPerfectPartnerPromotion.messageProductNoThreshold</code> attribute defined at extension <code>promotions</code>. */
	public static final String MESSAGEPRODUCTNOTHRESHOLD = "messageProductNoThreshold";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderThresholdPerfectPartnerPromotion.messageThresholdNoProduct</code> attribute defined at extension <code>promotions</code>. */
	public static final String MESSAGETHRESHOLDNOPRODUCT = "messageThresholdNoProduct";
	
	
	/** <i>Generated variable</i> - Variable of <code>OrderThresholdPerfectPartnerPromotion.thresholdTotals</code> attribute defined at extension <code>promotions</code>. */
	private Collection<PromotionPriceRowModel> _thresholdTotals;
	
	/** <i>Generated variable</i> - Variable of <code>OrderThresholdPerfectPartnerPromotion.discountProduct</code> attribute defined at extension <code>promotions</code>. */
	private ProductModel _discountProduct;
	
	/** <i>Generated variable</i> - Variable of <code>OrderThresholdPerfectPartnerPromotion.productPrices</code> attribute defined at extension <code>promotions</code>. */
	private Collection<PromotionPriceRowModel> _productPrices;
	
	/** <i>Generated variable</i> - Variable of <code>OrderThresholdPerfectPartnerPromotion.includeDiscountedPriceInThreshold</code> attribute defined at extension <code>promotions</code>. */
	private Boolean _includeDiscountedPriceInThreshold;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public OrderThresholdPerfectPartnerPromotionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public OrderThresholdPerfectPartnerPromotionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>AbstractPromotion</code> at extension <code>promotions</code>
	 */
	@Deprecated
	public OrderThresholdPerfectPartnerPromotionModel(final String _code)
	{
		super();
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>AbstractPromotion</code> at extension <code>promotions</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public OrderThresholdPerfectPartnerPromotionModel(final String _code, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderThresholdPerfectPartnerPromotion.discountProduct</code> attribute defined at extension <code>promotions</code>. 
	 * @return the discountProduct - The product to discount if it is in the cart.
	 */
	public ProductModel getDiscountProduct()
	{
		if (this._discountProduct!=null)
		{
			return _discountProduct;
		}
		return _discountProduct = getPersistenceContext().getValue(DISCOUNTPRODUCT, _discountProduct);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderThresholdPerfectPartnerPromotion.includeDiscountedPriceInThreshold</code> attribute defined at extension <code>promotions</code>. 
	 * @return the includeDiscountedPriceInThreshold - Flag to indicate if the discounted price of the product is allowed to count towards the threshold, otherwise it does not count towards the threshold.
	 */
	public Boolean getIncludeDiscountedPriceInThreshold()
	{
		if (this._includeDiscountedPriceInThreshold!=null)
		{
			return _includeDiscountedPriceInThreshold;
		}
		return _includeDiscountedPriceInThreshold = getPersistenceContext().getValue(INCLUDEDISCOUNTEDPRICEINTHRESHOLD, _includeDiscountedPriceInThreshold);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderThresholdPerfectPartnerPromotion.messageCouldHaveFired</code> attribute defined at extension <code>promotions</code>. 
	 * @return the messageCouldHaveFired - The message to show when the promotion could have potentially fire.
	 */
	public String getMessageCouldHaveFired()
	{
		return getMessageCouldHaveFired(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderThresholdPerfectPartnerPromotion.messageCouldHaveFired</code> attribute defined at extension <code>promotions</code>. 
	 * @param loc the value localization key 
	 * @return the messageCouldHaveFired - The message to show when the promotion could have potentially fire.
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getMessageCouldHaveFired(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(MESSAGECOULDHAVEFIRED, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderThresholdPerfectPartnerPromotion.messageFired</code> attribute defined at extension <code>promotions</code>. 
	 * @return the messageFired - The message to show when the promotion has fired.
	 */
	public String getMessageFired()
	{
		return getMessageFired(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderThresholdPerfectPartnerPromotion.messageFired</code> attribute defined at extension <code>promotions</code>. 
	 * @param loc the value localization key 
	 * @return the messageFired - The message to show when the promotion has fired.
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getMessageFired(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(MESSAGEFIRED, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderThresholdPerfectPartnerPromotion.messageProductNoThreshold</code> attribute defined at extension <code>promotions</code>. 
	 * @return the messageProductNoThreshold - The message to show when there is a partner product but the threshold has not been reached.
	 */
	public String getMessageProductNoThreshold()
	{
		return getMessageProductNoThreshold(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderThresholdPerfectPartnerPromotion.messageProductNoThreshold</code> attribute defined at extension <code>promotions</code>. 
	 * @param loc the value localization key 
	 * @return the messageProductNoThreshold - The message to show when there is a partner product but the threshold has not been reached.
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getMessageProductNoThreshold(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(MESSAGEPRODUCTNOTHRESHOLD, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderThresholdPerfectPartnerPromotion.messageThresholdNoProduct</code> attribute defined at extension <code>promotions</code>. 
	 * @return the messageThresholdNoProduct - The message to show when the threshold is reached, but there is no partner product.
	 */
	public String getMessageThresholdNoProduct()
	{
		return getMessageThresholdNoProduct(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderThresholdPerfectPartnerPromotion.messageThresholdNoProduct</code> attribute defined at extension <code>promotions</code>. 
	 * @param loc the value localization key 
	 * @return the messageThresholdNoProduct - The message to show when the threshold is reached, but there is no partner product.
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getMessageThresholdNoProduct(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(MESSAGETHRESHOLDNOPRODUCT, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderThresholdPerfectPartnerPromotion.productPrices</code> attribute defined at extension <code>promotions</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the productPrices - Fixed price for discounted product in specific currencies.
	 */
	public Collection<PromotionPriceRowModel> getProductPrices()
	{
		if (this._productPrices!=null)
		{
			return _productPrices;
		}
		return _productPrices = getPersistenceContext().getValue(PRODUCTPRICES, _productPrices);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderThresholdPerfectPartnerPromotion.thresholdTotals</code> attribute defined at extension <code>promotions</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the thresholdTotals - The cart total value threshold in specific currencies.
	 */
	public Collection<PromotionPriceRowModel> getThresholdTotals()
	{
		if (this._thresholdTotals!=null)
		{
			return _thresholdTotals;
		}
		return _thresholdTotals = getPersistenceContext().getValue(THRESHOLDTOTALS, _thresholdTotals);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderThresholdPerfectPartnerPromotion.discountProduct</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the discountProduct - The product to discount if it is in the cart.
	 */
	public void setDiscountProduct(final ProductModel value)
	{
		_discountProduct = getPersistenceContext().setValue(DISCOUNTPRODUCT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderThresholdPerfectPartnerPromotion.includeDiscountedPriceInThreshold</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the includeDiscountedPriceInThreshold - Flag to indicate if the discounted price of the product is allowed to count towards the threshold, otherwise it does not count towards the threshold.
	 */
	public void setIncludeDiscountedPriceInThreshold(final Boolean value)
	{
		_includeDiscountedPriceInThreshold = getPersistenceContext().setValue(INCLUDEDISCOUNTEDPRICEINTHRESHOLD, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderThresholdPerfectPartnerPromotion.messageCouldHaveFired</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the messageCouldHaveFired - The message to show when the promotion could have potentially fire.
	 */
	public void setMessageCouldHaveFired(final String value)
	{
		setMessageCouldHaveFired(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>OrderThresholdPerfectPartnerPromotion.messageCouldHaveFired</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the messageCouldHaveFired - The message to show when the promotion could have potentially fire.
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setMessageCouldHaveFired(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(MESSAGECOULDHAVEFIRED, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderThresholdPerfectPartnerPromotion.messageFired</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the messageFired - The message to show when the promotion has fired.
	 */
	public void setMessageFired(final String value)
	{
		setMessageFired(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>OrderThresholdPerfectPartnerPromotion.messageFired</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the messageFired - The message to show when the promotion has fired.
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setMessageFired(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(MESSAGEFIRED, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderThresholdPerfectPartnerPromotion.messageProductNoThreshold</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the messageProductNoThreshold - The message to show when there is a partner product but the threshold has not been reached.
	 */
	public void setMessageProductNoThreshold(final String value)
	{
		setMessageProductNoThreshold(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>OrderThresholdPerfectPartnerPromotion.messageProductNoThreshold</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the messageProductNoThreshold - The message to show when there is a partner product but the threshold has not been reached.
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setMessageProductNoThreshold(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(MESSAGEPRODUCTNOTHRESHOLD, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderThresholdPerfectPartnerPromotion.messageThresholdNoProduct</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the messageThresholdNoProduct - The message to show when the threshold is reached, but there is no partner product.
	 */
	public void setMessageThresholdNoProduct(final String value)
	{
		setMessageThresholdNoProduct(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>OrderThresholdPerfectPartnerPromotion.messageThresholdNoProduct</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the messageThresholdNoProduct - The message to show when the threshold is reached, but there is no partner product.
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setMessageThresholdNoProduct(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(MESSAGETHRESHOLDNOPRODUCT, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderThresholdPerfectPartnerPromotion.productPrices</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the productPrices - Fixed price for discounted product in specific currencies.
	 */
	public void setProductPrices(final Collection<PromotionPriceRowModel> value)
	{
		_productPrices = getPersistenceContext().setValue(PRODUCTPRICES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderThresholdPerfectPartnerPromotion.thresholdTotals</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the thresholdTotals - The cart total value threshold in specific currencies.
	 */
	public void setThresholdTotals(final Collection<PromotionPriceRowModel> value)
	{
		_thresholdTotals = getPersistenceContext().setValue(THRESHOLDTOTALS, value);
	}
	
}
