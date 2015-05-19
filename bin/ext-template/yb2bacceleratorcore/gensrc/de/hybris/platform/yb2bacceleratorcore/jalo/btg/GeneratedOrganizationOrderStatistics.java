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
package de.hybris.platform.yb2bacceleratorcore.jalo.btg;

import de.hybris.platform.b2b.jalo.B2BUnit;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.yb2bacceleratorcore.constants.YB2BAcceleratorCoreConstants;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.yb2bacceleratorcore.jalo.btg.OrganizationOrderStatistics OrganizationOrderStatistics}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOrganizationOrderStatistics extends GenericItem
{
	/** Qualifier of the <code>OrganizationOrderStatistics.unit</code> attribute **/
	public static final String UNIT = "unit";
	/** Qualifier of the <code>OrganizationOrderStatistics.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>OrganizationOrderStatistics.orderTotal</code> attribute **/
	public static final String ORDERTOTAL = "orderTotal";
	/** Qualifier of the <code>OrganizationOrderStatistics.date</code> attribute **/
	public static final String DATE = "date";
	/** Qualifier of the <code>OrganizationOrderStatistics.category</code> attribute **/
	public static final String CATEGORY = "category";
	/** Qualifier of the <code>OrganizationOrderStatistics.catalog</code> attribute **/
	public static final String CATALOG = "catalog";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(UNIT, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(ORDERTOTAL, AttributeMode.INITIAL);
		tmp.put(DATE, AttributeMode.INITIAL);
		tmp.put(CATEGORY, AttributeMode.INITIAL);
		tmp.put(CATALOG, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrganizationOrderStatistics.catalog</code> attribute.
	 * @return the catalog - The catalog code to which the category belongs to
	 */
	public String getCatalog(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CATALOG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrganizationOrderStatistics.catalog</code> attribute.
	 * @return the catalog - The catalog code to which the category belongs to
	 */
	public String getCatalog()
	{
		return getCatalog( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrganizationOrderStatistics.catalog</code> attribute. 
	 * @param value the catalog - The catalog code to which the category belongs to
	 */
	public void setCatalog(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CATALOG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrganizationOrderStatistics.catalog</code> attribute. 
	 * @param value the catalog - The catalog code to which the category belongs to
	 */
	public void setCatalog(final String value)
	{
		setCatalog( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrganizationOrderStatistics.category</code> attribute.
	 * @return the category - The category for which to gather order total information
	 */
	public String getCategory(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrganizationOrderStatistics.category</code> attribute.
	 * @return the category - The category for which to gather order total information
	 */
	public String getCategory()
	{
		return getCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrganizationOrderStatistics.category</code> attribute. 
	 * @param value the category - The category for which to gather order total information
	 */
	public void setCategory(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrganizationOrderStatistics.category</code> attribute. 
	 * @param value the category - The category for which to gather order total information
	 */
	public void setCategory(final String value)
	{
		setCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrganizationOrderStatistics.currency</code> attribute.
	 * @return the currency - The currency of orders
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrganizationOrderStatistics.currency</code> attribute.
	 * @return the currency - The currency of orders
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrganizationOrderStatistics.currency</code> attribute. 
	 * @param value the currency - The currency of orders
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrganizationOrderStatistics.currency</code> attribute. 
	 * @param value the currency - The currency of orders
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrganizationOrderStatistics.date</code> attribute.
	 * @return the date - The date for which to gather order total information
	 */
	public Date getDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrganizationOrderStatistics.date</code> attribute.
	 * @return the date - The date for which to gather order total information
	 */
	public Date getDate()
	{
		return getDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrganizationOrderStatistics.date</code> attribute. 
	 * @param value the date - The date for which to gather order total information
	 */
	public void setDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrganizationOrderStatistics.date</code> attribute. 
	 * @param value the date - The date for which to gather order total information
	 */
	public void setDate(final Date value)
	{
		setDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrganizationOrderStatistics.orderTotal</code> attribute.
	 * @return the orderTotal - The total of all orders for an organization
	 */
	public Double getOrderTotal(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, ORDERTOTAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrganizationOrderStatistics.orderTotal</code> attribute.
	 * @return the orderTotal - The total of all orders for an organization
	 */
	public Double getOrderTotal()
	{
		return getOrderTotal( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrganizationOrderStatistics.orderTotal</code> attribute. 
	 * @return the orderTotal - The total of all orders for an organization
	 */
	public double getOrderTotalAsPrimitive(final SessionContext ctx)
	{
		Double value = getOrderTotal( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrganizationOrderStatistics.orderTotal</code> attribute. 
	 * @return the orderTotal - The total of all orders for an organization
	 */
	public double getOrderTotalAsPrimitive()
	{
		return getOrderTotalAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrganizationOrderStatistics.orderTotal</code> attribute. 
	 * @param value the orderTotal - The total of all orders for an organization
	 */
	public void setOrderTotal(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, ORDERTOTAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrganizationOrderStatistics.orderTotal</code> attribute. 
	 * @param value the orderTotal - The total of all orders for an organization
	 */
	public void setOrderTotal(final Double value)
	{
		setOrderTotal( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrganizationOrderStatistics.orderTotal</code> attribute. 
	 * @param value the orderTotal - The total of all orders for an organization
	 */
	public void setOrderTotal(final SessionContext ctx, final double value)
	{
		setOrderTotal( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrganizationOrderStatistics.orderTotal</code> attribute. 
	 * @param value the orderTotal - The total of all orders for an organization
	 */
	public void setOrderTotal(final double value)
	{
		setOrderTotal( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrganizationOrderStatistics.unit</code> attribute.
	 * @return the unit - The root unit of an organization
	 */
	public B2BUnit getUnit(final SessionContext ctx)
	{
		return (B2BUnit)getProperty( ctx, UNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrganizationOrderStatistics.unit</code> attribute.
	 * @return the unit - The root unit of an organization
	 */
	public B2BUnit getUnit()
	{
		return getUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrganizationOrderStatistics.unit</code> attribute. 
	 * @param value the unit - The root unit of an organization
	 */
	public void setUnit(final SessionContext ctx, final B2BUnit value)
	{
		setProperty(ctx, UNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrganizationOrderStatistics.unit</code> attribute. 
	 * @param value the unit - The root unit of an organization
	 */
	public void setUnit(final B2BUnit value)
	{
		setUnit( getSession().getSessionContext(), value );
	}
	
}
