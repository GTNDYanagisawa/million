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
package de.hybris.platform.acceleratorcms.jalo.components;

import de.hybris.platform.acceleratorcms.constants.AcceleratorCmsConstants;
import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.acceleratorcms.jalo.components.JspIncludeComponent JspIncludeComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedJspIncludeComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>JspIncludeComponent.page</code> attribute **/
	public static final String PAGE = "page";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PAGE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JspIncludeComponent.page</code> attribute.
	 * @return the page - A jsp view
	 */
	public String getPage(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JspIncludeComponent.page</code> attribute.
	 * @return the page - A jsp view
	 */
	public String getPage()
	{
		return getPage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JspIncludeComponent.page</code> attribute. 
	 * @param value the page - A jsp view
	 */
	public void setPage(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JspIncludeComponent.page</code> attribute. 
	 * @param value the page - A jsp view
	 */
	public void setPage(final String value)
	{
		setPage( getSession().getSessionContext(), value );
	}
	
}
