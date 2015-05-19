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
package de.hybris.platform.acceleratorservices.jalo;

import de.hybris.platform.acceleratorservices.constants.AcceleratorServicesConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem SiteMapPage}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSiteMapPage extends GenericItem
{
	/** Qualifier of the <code>SiteMapPage.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>SiteMapPage.frequency</code> attribute **/
	public static final String FREQUENCY = "frequency";
	/** Qualifier of the <code>SiteMapPage.priority</code> attribute **/
	public static final String PRIORITY = "priority";
	/** Qualifier of the <code>SiteMapPage.active</code> attribute **/
	public static final String ACTIVE = "active";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(FREQUENCY, AttributeMode.INITIAL);
		tmp.put(PRIORITY, AttributeMode.INITIAL);
		tmp.put(ACTIVE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapPage.active</code> attribute.
	 * @return the active - Is sitemap page enabled or disabled
	 */
	public Boolean isActive(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ACTIVE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapPage.active</code> attribute.
	 * @return the active - Is sitemap page enabled or disabled
	 */
	public Boolean isActive()
	{
		return isActive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapPage.active</code> attribute. 
	 * @return the active - Is sitemap page enabled or disabled
	 */
	public boolean isActiveAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isActive( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapPage.active</code> attribute. 
	 * @return the active - Is sitemap page enabled or disabled
	 */
	public boolean isActiveAsPrimitive()
	{
		return isActiveAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SiteMapPage.active</code> attribute. 
	 * @param value the active - Is sitemap page enabled or disabled
	 */
	public void setActive(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ACTIVE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SiteMapPage.active</code> attribute. 
	 * @param value the active - Is sitemap page enabled or disabled
	 */
	public void setActive(final Boolean value)
	{
		setActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SiteMapPage.active</code> attribute. 
	 * @param value the active - Is sitemap page enabled or disabled
	 */
	public void setActive(final SessionContext ctx, final boolean value)
	{
		setActive( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SiteMapPage.active</code> attribute. 
	 * @param value the active - Is sitemap page enabled or disabled
	 */
	public void setActive(final boolean value)
	{
		setActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapPage.code</code> attribute.
	 * @return the code - The type of page to be qualified
	 */
	public EnumerationValue getCode(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapPage.code</code> attribute.
	 * @return the code - The type of page to be qualified
	 */
	public EnumerationValue getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SiteMapPage.code</code> attribute. 
	 * @param value the code - The type of page to be qualified
	 */
	public void setCode(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SiteMapPage.code</code> attribute. 
	 * @param value the code - The type of page to be qualified
	 */
	public void setCode(final EnumerationValue value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapPage.frequency</code> attribute.
	 * @return the frequency - How often the page should be updated.
	 */
	public EnumerationValue getFrequency(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, FREQUENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapPage.frequency</code> attribute.
	 * @return the frequency - How often the page should be updated.
	 */
	public EnumerationValue getFrequency()
	{
		return getFrequency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SiteMapPage.frequency</code> attribute. 
	 * @param value the frequency - How often the page should be updated.
	 */
	public void setFrequency(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, FREQUENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SiteMapPage.frequency</code> attribute. 
	 * @param value the frequency - How often the page should be updated.
	 */
	public void setFrequency(final EnumerationValue value)
	{
		setFrequency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapPage.priority</code> attribute.
	 * @return the priority - The weight the page should have in the sitemap
	 */
	public Double getPriority(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, PRIORITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapPage.priority</code> attribute.
	 * @return the priority - The weight the page should have in the sitemap
	 */
	public Double getPriority()
	{
		return getPriority( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapPage.priority</code> attribute. 
	 * @return the priority - The weight the page should have in the sitemap
	 */
	public double getPriorityAsPrimitive(final SessionContext ctx)
	{
		Double value = getPriority( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapPage.priority</code> attribute. 
	 * @return the priority - The weight the page should have in the sitemap
	 */
	public double getPriorityAsPrimitive()
	{
		return getPriorityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SiteMapPage.priority</code> attribute. 
	 * @param value the priority - The weight the page should have in the sitemap
	 */
	public void setPriority(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, PRIORITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SiteMapPage.priority</code> attribute. 
	 * @param value the priority - The weight the page should have in the sitemap
	 */
	public void setPriority(final Double value)
	{
		setPriority( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SiteMapPage.priority</code> attribute. 
	 * @param value the priority - The weight the page should have in the sitemap
	 */
	public void setPriority(final SessionContext ctx, final double value)
	{
		setPriority( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SiteMapPage.priority</code> attribute. 
	 * @param value the priority - The weight the page should have in the sitemap
	 */
	public void setPriority(final double value)
	{
		setPriority( getSession().getSessionContext(), value );
	}
	
}
