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
import de.hybris.platform.promotions.model.ProductPromotionModel;
import de.hybris.platform.promotions.model.PromotionPriceRowModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Locale;

/**
 * Generated model class for type ProductOneToOnePerfectPartnerPromotion first defined at extension promotions.
 */
@SuppressWarnings("all")
public class ProductOneToOnePerfectPartnerPromotionModel extends ProductPromotionModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ProductOneToOnePerfectPartnerPromotion";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductOneToOnePerfectPartnerPromotion.baseProduct</code> attribute defined at extension <code>promotions</code>. */
	public static final String BASEPRODUCT = "baseProduct";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductOneToOnePerfectPartnerPromotion.partnerProduct</code> attribute defined at extension <code>promotions</code>. */
	public static final String PARTNERPRODUCT = "partnerProduct";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductOneToOnePerfectPartnerPromotion.bundlePrices</code> attribute defined at extension <code>promotions</code>. */
	public static final String BUNDLEPRICES = "bundlePrices";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductOneToOnePerfectPartnerPromotion.messageFired</code> attribute defined at extension <code>promotions</code>. */
	public static final String MESSAGEFIRED = "messageFired";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductOneToOnePerfectPartnerPromotion.messageCouldHaveFired</code> attribute defined at extension <code>promotions</code>. */
	public static final String MESSAGECOULDHAVEFIRED = "messageCouldHaveFired";
	
	
	/** <i>Generated variable</i> - Variable of <code>ProductOneToOnePerfectPartnerPromotion.baseProduct</code> attribute defined at extension <code>promotions</code>. */
	private ProductModel _baseProduct;
	
	/** <i>Generated variable</i> - Variable of <code>ProductOneToOnePerfectPartnerPromotion.partnerProduct</code> attribute defined at extension <code>promotions</code>. */
	private ProductModel _partnerProduct;
	
	/** <i>Generated variable</i> - Variable of <code>ProductOneToOnePerfectPartnerPromotion.bundlePrices</code> attribute defined at extension <code>promotions</code>. */
	private Collection<PromotionPriceRowModel> _bundlePrices;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ProductOneToOnePerfectPartnerPromotionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ProductOneToOnePerfectPartnerPromotionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>AbstractPromotion</code> at extension <code>promotions</code>
	 */
	@Deprecated
	public ProductOneToOnePerfectPartnerPromotionModel(final String _code)
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
	public ProductOneToOnePerfectPartnerPromotionModel(final String _code, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductOneToOnePerfectPartnerPromotion.baseProduct</code> attribute defined at extension <code>promotions</code>. 
	 * @return the baseProduct - The base product.
	 */
	public ProductModel getBaseProduct()
	{
		if (this._baseProduct!=null)
		{
			return _baseProduct;
		}
		return _baseProduct = getPersistenceContext().getValue(BASEPRODUCT, _baseProduct);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductOneToOnePerfectPartnerPromotion.bundlePrices</code> attribute defined at extension <code>promotions</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the bundlePrices - Fixed bundle price for both the products in specific currencies.
	 */
	public Collection<PromotionPriceRowModel> getBundlePrices()
	{
		if (this._bundlePrices!=null)
		{
			return _bundlePrices;
		}
		return _bundlePrices = getPersistenceContext().getValue(BUNDLEPRICES, _bundlePrices);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductOneToOnePerfectPartnerPromotion.messageCouldHaveFired</code> attribute defined at extension <code>promotions</code>. 
	 * @return the messageCouldHaveFired - The message to show when the promotion could have potentially fire.
	 */
	public String getMessageCouldHaveFired()
	{
		return getMessageCouldHaveFired(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductOneToOnePerfectPartnerPromotion.messageCouldHaveFired</code> attribute defined at extension <code>promotions</code>. 
	 * @param loc the value localization key 
	 * @return the messageCouldHaveFired - The message to show when the promotion could have potentially fire.
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getMessageCouldHaveFired(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(MESSAGECOULDHAVEFIRED, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductOneToOnePerfectPartnerPromotion.messageFired</code> attribute defined at extension <code>promotions</code>. 
	 * @return the messageFired - The message to show when the promotion has fired.
	 */
	public String getMessageFired()
	{
		return getMessageFired(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductOneToOnePerfectPartnerPromotion.messageFired</code> attribute defined at extension <code>promotions</code>. 
	 * @param loc the value localization key 
	 * @return the messageFired - The message to show when the promotion has fired.
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getMessageFired(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(MESSAGEFIRED, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductOneToOnePerfectPartnerPromotion.partnerProduct</code> attribute defined at extension <code>promotions</code>. 
	 * @return the partnerProduct - The partner product.
	 */
	public ProductModel getPartnerProduct()
	{
		if (this._partnerProduct!=null)
		{
			return _partnerProduct;
		}
		return _partnerProduct = getPersistenceContext().getValue(PARTNERPRODUCT, _partnerProduct);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ProductOneToOnePerfectPartnerPromotion.baseProduct</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the baseProduct - The base product.
	 */
	public void setBaseProduct(final ProductModel value)
	{
		_baseProduct = getPersistenceContext().setValue(BASEPRODUCT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ProductOneToOnePerfectPartnerPromotion.bundlePrices</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the bundlePrices - Fixed bundle price for both the products in specific currencies.
	 */
	public void setBundlePrices(final Collection<PromotionPriceRowModel> value)
	{
		_bundlePrices = getPersistenceContext().setValue(BUNDLEPRICES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ProductOneToOnePerfectPartnerPromotion.messageCouldHaveFired</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the messageCouldHaveFired - The message to show when the promotion could have potentially fire.
	 */
	public void setMessageCouldHaveFired(final String value)
	{
		setMessageCouldHaveFired(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>ProductOneToOnePerfectPartnerPromotion.messageCouldHaveFired</code> attribute defined at extension <code>promotions</code>. 
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
	 * <i>Generated method</i> - Setter of <code>ProductOneToOnePerfectPartnerPromotion.messageFired</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the messageFired - The message to show when the promotion has fired.
	 */
	public void setMessageFired(final String value)
	{
		setMessageFired(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>ProductOneToOnePerfectPartnerPromotion.messageFired</code> attribute defined at extension <code>promotions</code>. 
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
	 * <i>Generated method</i> - Setter of <code>ProductOneToOnePerfectPartnerPromotion.partnerProduct</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the partnerProduct - The partner product.
	 */
	public void setPartnerProduct(final ProductModel value)
	{
		_partnerProduct = getPersistenceContext().setValue(PARTNERPRODUCT, value);
	}
	
}
