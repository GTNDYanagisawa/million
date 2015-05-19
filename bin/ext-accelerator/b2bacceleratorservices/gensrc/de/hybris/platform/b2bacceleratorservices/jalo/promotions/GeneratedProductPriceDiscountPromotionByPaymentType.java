/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2015/04/16 16:55:23                         ---
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
package de.hybris.platform.b2bacceleratorservices.jalo.promotions;

import de.hybris.platform.b2bacceleratorservices.constants.B2BAcceleratorServicesConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.promotions.jalo.ProductPromotion;
import de.hybris.platform.promotions.jalo.PromotionPriceRow;
import de.hybris.platform.util.PartOfHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.b2bacceleratorservices.jalo.promotions.ProductPriceDiscountPromotionByPaymentType ProductPriceDiscountPromotionByPaymentType}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedProductPriceDiscountPromotionByPaymentType extends ProductPromotion
{
	/** Qualifier of the <code>ProductPriceDiscountPromotionByPaymentType.productDiscountPrice</code> attribute **/
	public static final String PRODUCTDISCOUNTPRICE = "productDiscountPrice";
	/** Qualifier of the <code>ProductPriceDiscountPromotionByPaymentType.messageFired</code> attribute **/
	public static final String MESSAGEFIRED = "messageFired";
	/** Qualifier of the <code>ProductPriceDiscountPromotionByPaymentType.messageCouldHaveFired</code> attribute **/
	public static final String MESSAGECOULDHAVEFIRED = "messageCouldHaveFired";
	/** Qualifier of the <code>ProductPriceDiscountPromotionByPaymentType.paymentType</code> attribute **/
	public static final String PAYMENTTYPE = "paymentType";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(ProductPromotion.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PRODUCTDISCOUNTPRICE, AttributeMode.INITIAL);
		tmp.put(MESSAGEFIRED, AttributeMode.INITIAL);
		tmp.put(MESSAGECOULDHAVEFIRED, AttributeMode.INITIAL);
		tmp.put(PAYMENTTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductPriceDiscountPromotionByPaymentType.messageCouldHaveFired</code> attribute.
	 * @return the messageCouldHaveFired - The message to show when the promotion could have potentially fire.
	 */
	public String getMessageCouldHaveFired(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProductPriceDiscountPromotionByPaymentType.getMessageCouldHaveFired requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, MESSAGECOULDHAVEFIRED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductPriceDiscountPromotionByPaymentType.messageCouldHaveFired</code> attribute.
	 * @return the messageCouldHaveFired - The message to show when the promotion could have potentially fire.
	 */
	public String getMessageCouldHaveFired()
	{
		return getMessageCouldHaveFired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductPriceDiscountPromotionByPaymentType.messageCouldHaveFired</code> attribute. 
	 * @return the localized messageCouldHaveFired - The message to show when the promotion could have potentially fire.
	 */
	public Map<Language,String> getAllMessageCouldHaveFired(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,MESSAGECOULDHAVEFIRED,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductPriceDiscountPromotionByPaymentType.messageCouldHaveFired</code> attribute. 
	 * @return the localized messageCouldHaveFired - The message to show when the promotion could have potentially fire.
	 */
	public Map<Language,String> getAllMessageCouldHaveFired()
	{
		return getAllMessageCouldHaveFired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductPriceDiscountPromotionByPaymentType.messageCouldHaveFired</code> attribute. 
	 * @param value the messageCouldHaveFired - The message to show when the promotion could have potentially fire.
	 */
	public void setMessageCouldHaveFired(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProductPriceDiscountPromotionByPaymentType.setMessageCouldHaveFired requires a session language", 0 );
		}
		setLocalizedProperty(ctx, MESSAGECOULDHAVEFIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductPriceDiscountPromotionByPaymentType.messageCouldHaveFired</code> attribute. 
	 * @param value the messageCouldHaveFired - The message to show when the promotion could have potentially fire.
	 */
	public void setMessageCouldHaveFired(final String value)
	{
		setMessageCouldHaveFired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductPriceDiscountPromotionByPaymentType.messageCouldHaveFired</code> attribute. 
	 * @param value the messageCouldHaveFired - The message to show when the promotion could have potentially fire.
	 */
	public void setAllMessageCouldHaveFired(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,MESSAGECOULDHAVEFIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductPriceDiscountPromotionByPaymentType.messageCouldHaveFired</code> attribute. 
	 * @param value the messageCouldHaveFired - The message to show when the promotion could have potentially fire.
	 */
	public void setAllMessageCouldHaveFired(final Map<Language,String> value)
	{
		setAllMessageCouldHaveFired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductPriceDiscountPromotionByPaymentType.messageFired</code> attribute.
	 * @return the messageFired - The message to show when the promotion has fired.
	 */
	public String getMessageFired(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProductPriceDiscountPromotionByPaymentType.getMessageFired requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, MESSAGEFIRED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductPriceDiscountPromotionByPaymentType.messageFired</code> attribute.
	 * @return the messageFired - The message to show when the promotion has fired.
	 */
	public String getMessageFired()
	{
		return getMessageFired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductPriceDiscountPromotionByPaymentType.messageFired</code> attribute. 
	 * @return the localized messageFired - The message to show when the promotion has fired.
	 */
	public Map<Language,String> getAllMessageFired(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,MESSAGEFIRED,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductPriceDiscountPromotionByPaymentType.messageFired</code> attribute. 
	 * @return the localized messageFired - The message to show when the promotion has fired.
	 */
	public Map<Language,String> getAllMessageFired()
	{
		return getAllMessageFired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductPriceDiscountPromotionByPaymentType.messageFired</code> attribute. 
	 * @param value the messageFired - The message to show when the promotion has fired.
	 */
	public void setMessageFired(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProductPriceDiscountPromotionByPaymentType.setMessageFired requires a session language", 0 );
		}
		setLocalizedProperty(ctx, MESSAGEFIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductPriceDiscountPromotionByPaymentType.messageFired</code> attribute. 
	 * @param value the messageFired - The message to show when the promotion has fired.
	 */
	public void setMessageFired(final String value)
	{
		setMessageFired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductPriceDiscountPromotionByPaymentType.messageFired</code> attribute. 
	 * @param value the messageFired - The message to show when the promotion has fired.
	 */
	public void setAllMessageFired(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,MESSAGEFIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductPriceDiscountPromotionByPaymentType.messageFired</code> attribute. 
	 * @param value the messageFired - The message to show when the promotion has fired.
	 */
	public void setAllMessageFired(final Map<Language,String> value)
	{
		setAllMessageFired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductPriceDiscountPromotionByPaymentType.paymentType</code> attribute.
	 * @return the paymentType - Payment type for Checkout summary
	 */
	public EnumerationValue getPaymentType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PAYMENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductPriceDiscountPromotionByPaymentType.paymentType</code> attribute.
	 * @return the paymentType - Payment type for Checkout summary
	 */
	public EnumerationValue getPaymentType()
	{
		return getPaymentType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductPriceDiscountPromotionByPaymentType.paymentType</code> attribute. 
	 * @param value the paymentType - Payment type for Checkout summary
	 */
	public void setPaymentType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PAYMENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductPriceDiscountPromotionByPaymentType.paymentType</code> attribute. 
	 * @param value the paymentType - Payment type for Checkout summary
	 */
	public void setPaymentType(final EnumerationValue value)
	{
		setPaymentType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductPriceDiscountPromotionByPaymentType.productDiscountPrice</code> attribute.
	 * @return the productDiscountPrice - Fixed price for discount in specific currencies.
	 */
	public Collection<PromotionPriceRow> getProductDiscountPrice(final SessionContext ctx)
	{
		Collection<PromotionPriceRow> coll = (Collection<PromotionPriceRow>)getProperty( ctx, PRODUCTDISCOUNTPRICE);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductPriceDiscountPromotionByPaymentType.productDiscountPrice</code> attribute.
	 * @return the productDiscountPrice - Fixed price for discount in specific currencies.
	 */
	public Collection<PromotionPriceRow> getProductDiscountPrice()
	{
		return getProductDiscountPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductPriceDiscountPromotionByPaymentType.productDiscountPrice</code> attribute. 
	 * @param value the productDiscountPrice - Fixed price for discount in specific currencies.
	 */
	public void setProductDiscountPrice(final SessionContext ctx, final Collection<PromotionPriceRow> value)
	{
		new PartOfHandler<Collection<PromotionPriceRow>>()
		{
			@Override
			protected Collection<PromotionPriceRow> doGetValue(final SessionContext ctx)
			{
				return getProductDiscountPrice( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final Collection<PromotionPriceRow> _value)
			{
				final Collection<PromotionPriceRow> value = _value;
				setProperty(ctx, PRODUCTDISCOUNTPRICE,value == null || !value.isEmpty() ? value : null );
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductPriceDiscountPromotionByPaymentType.productDiscountPrice</code> attribute. 
	 * @param value the productDiscountPrice - Fixed price for discount in specific currencies.
	 */
	public void setProductDiscountPrice(final Collection<PromotionPriceRow> value)
	{
		setProductDiscountPrice( getSession().getSessionContext(), value );
	}
	
}
