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
package de.hybris.platform.b2bacceleratorservices.jalo.btg;

import de.hybris.platform.b2bacceleratorservices.constants.B2BAcceleratorServicesConstants;
import de.hybris.platform.btg.jalo.BTGNumberOfOrdersRelativeDateOperand;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.b2bacceleratorservices.jalo.btg.BTGNumberOfOrdersAboveAmountRelativeDateOperand BTGNumberOfOrdersAboveAmountRelativeDateOperand}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBTGNumberOfOrdersAboveAmountRelativeDateOperand extends BTGNumberOfOrdersRelativeDateOperand
{
	/** Qualifier of the <code>BTGNumberOfOrdersAboveAmountRelativeDateOperand.amount</code> attribute **/
	public static final String AMOUNT = "amount";
	/** Qualifier of the <code>BTGNumberOfOrdersAboveAmountRelativeDateOperand.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>BTGNumberOfOrdersAboveAmountRelativeDateOperand.orderStatus</code> attribute **/
	public static final String ORDERSTATUS = "orderStatus";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(BTGNumberOfOrdersRelativeDateOperand.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(AMOUNT, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(ORDERSTATUS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGNumberOfOrdersAboveAmountRelativeDateOperand.amount</code> attribute.
	 * @return the amount
	 */
	public Double getAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, AMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGNumberOfOrdersAboveAmountRelativeDateOperand.amount</code> attribute.
	 * @return the amount
	 */
	public Double getAmount()
	{
		return getAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGNumberOfOrdersAboveAmountRelativeDateOperand.amount</code> attribute. 
	 * @return the amount
	 */
	public double getAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGNumberOfOrdersAboveAmountRelativeDateOperand.amount</code> attribute. 
	 * @return the amount
	 */
	public double getAmountAsPrimitive()
	{
		return getAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BTGNumberOfOrdersAboveAmountRelativeDateOperand.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, AMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BTGNumberOfOrdersAboveAmountRelativeDateOperand.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final Double value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BTGNumberOfOrdersAboveAmountRelativeDateOperand.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final double value)
	{
		setAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BTGNumberOfOrdersAboveAmountRelativeDateOperand.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final double value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGNumberOfOrdersAboveAmountRelativeDateOperand.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGNumberOfOrdersAboveAmountRelativeDateOperand.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BTGNumberOfOrdersAboveAmountRelativeDateOperand.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BTGNumberOfOrdersAboveAmountRelativeDateOperand.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGNumberOfOrdersAboveAmountRelativeDateOperand.orderStatus</code> attribute.
	 * @return the orderStatus
	 */
	public EnumerationValue getOrderStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ORDERSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGNumberOfOrdersAboveAmountRelativeDateOperand.orderStatus</code> attribute.
	 * @return the orderStatus
	 */
	public EnumerationValue getOrderStatus()
	{
		return getOrderStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BTGNumberOfOrdersAboveAmountRelativeDateOperand.orderStatus</code> attribute. 
	 * @param value the orderStatus
	 */
	public void setOrderStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ORDERSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BTGNumberOfOrdersAboveAmountRelativeDateOperand.orderStatus</code> attribute. 
	 * @param value the orderStatus
	 */
	public void setOrderStatus(final EnumerationValue value)
	{
		setOrderStatus( getSession().getSessionContext(), value );
	}
	
}
