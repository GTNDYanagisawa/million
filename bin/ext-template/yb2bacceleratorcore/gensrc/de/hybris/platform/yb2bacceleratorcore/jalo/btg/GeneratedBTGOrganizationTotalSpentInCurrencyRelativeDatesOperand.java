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

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.yb2bacceleratorcore.constants.YB2BAcceleratorCoreConstants;
import de.hybris.platform.yb2bacceleratorcore.jalo.btg.BTGOrganizationTotalSpentInCurrencyLastYearOperand;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.yb2bacceleratorcore.jalo.btg.BTGOrganizationTotalSpentInCurrencyRelativeDatesOperand BTGOrganizationTotalSpentInCurrencyRelativeDatesOperand}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBTGOrganizationTotalSpentInCurrencyRelativeDatesOperand extends BTGOrganizationTotalSpentInCurrencyLastYearOperand
{
	/** Qualifier of the <code>BTGOrganizationTotalSpentInCurrencyRelativeDatesOperand.value</code> attribute **/
	public static final String VALUE = "value";
	/** Qualifier of the <code>BTGOrganizationTotalSpentInCurrencyRelativeDatesOperand.unit</code> attribute **/
	public static final String UNIT = "unit";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(BTGOrganizationTotalSpentInCurrencyLastYearOperand.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(VALUE, AttributeMode.INITIAL);
		tmp.put(UNIT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGOrganizationTotalSpentInCurrencyRelativeDatesOperand.unit</code> attribute.
	 * @return the unit
	 */
	public EnumerationValue getUnit(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, UNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGOrganizationTotalSpentInCurrencyRelativeDatesOperand.unit</code> attribute.
	 * @return the unit
	 */
	public EnumerationValue getUnit()
	{
		return getUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BTGOrganizationTotalSpentInCurrencyRelativeDatesOperand.unit</code> attribute. 
	 * @param value the unit
	 */
	public void setUnit(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, UNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BTGOrganizationTotalSpentInCurrencyRelativeDatesOperand.unit</code> attribute. 
	 * @param value the unit
	 */
	public void setUnit(final EnumerationValue value)
	{
		setUnit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGOrganizationTotalSpentInCurrencyRelativeDatesOperand.value</code> attribute.
	 * @return the value
	 */
	public Integer getValue(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, VALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGOrganizationTotalSpentInCurrencyRelativeDatesOperand.value</code> attribute.
	 * @return the value
	 */
	public Integer getValue()
	{
		return getValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGOrganizationTotalSpentInCurrencyRelativeDatesOperand.value</code> attribute. 
	 * @return the value
	 */
	public int getValueAsPrimitive(final SessionContext ctx)
	{
		Integer value = getValue( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGOrganizationTotalSpentInCurrencyRelativeDatesOperand.value</code> attribute. 
	 * @return the value
	 */
	public int getValueAsPrimitive()
	{
		return getValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BTGOrganizationTotalSpentInCurrencyRelativeDatesOperand.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, VALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BTGOrganizationTotalSpentInCurrencyRelativeDatesOperand.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final Integer value)
	{
		setValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BTGOrganizationTotalSpentInCurrencyRelativeDatesOperand.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final SessionContext ctx, final int value)
	{
		setValue( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BTGOrganizationTotalSpentInCurrencyRelativeDatesOperand.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final int value)
	{
		setValue( getSession().getSessionContext(), value );
	}
	
}
