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
package de.hybris.platform.acceleratorservices.jalo.payment;

import de.hybris.platform.acceleratorservices.constants.AcceleratorServicesConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.acceleratorservices.jalo.payment.CCPaySubValidation CCPaySubValidation}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCCPaySubValidation extends GenericItem
{
	/** Qualifier of the <code>CCPaySubValidation.subscriptionId</code> attribute **/
	public static final String SUBSCRIPTIONID = "subscriptionId";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SUBSCRIPTIONID, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CCPaySubValidation.subscriptionId</code> attribute.
	 * @return the subscriptionId
	 */
	public String getSubscriptionId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUBSCRIPTIONID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CCPaySubValidation.subscriptionId</code> attribute.
	 * @return the subscriptionId
	 */
	public String getSubscriptionId()
	{
		return getSubscriptionId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CCPaySubValidation.subscriptionId</code> attribute. 
	 * @param value the subscriptionId
	 */
	public void setSubscriptionId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUBSCRIPTIONID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CCPaySubValidation.subscriptionId</code> attribute. 
	 * @param value the subscriptionId
	 */
	public void setSubscriptionId(final String value)
	{
		setSubscriptionId( getSession().getSessionContext(), value );
	}
	
}
