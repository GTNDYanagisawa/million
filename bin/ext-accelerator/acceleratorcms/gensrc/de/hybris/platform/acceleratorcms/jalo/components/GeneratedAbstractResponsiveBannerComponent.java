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
import de.hybris.platform.acceleratorcms.jalo.components.AbstractMediaContainerComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.acceleratorcms.jalo.components.AbstractResponsiveBannerComponent AbstractResponsiveBannerComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractResponsiveBannerComponent extends AbstractMediaContainerComponent
{
	/** Qualifier of the <code>AbstractResponsiveBannerComponent.urlLink</code> attribute **/
	public static final String URLLINK = "urlLink";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractMediaContainerComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(URLLINK, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractResponsiveBannerComponent.urlLink</code> attribute.
	 * @return the urlLink
	 */
	public String getUrlLink(final SessionContext ctx)
	{
		return (String)getProperty( ctx, URLLINK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractResponsiveBannerComponent.urlLink</code> attribute.
	 * @return the urlLink
	 */
	public String getUrlLink()
	{
		return getUrlLink( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractResponsiveBannerComponent.urlLink</code> attribute. 
	 * @param value the urlLink
	 */
	public void setUrlLink(final SessionContext ctx, final String value)
	{
		setProperty(ctx, URLLINK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractResponsiveBannerComponent.urlLink</code> attribute. 
	 * @param value the urlLink
	 */
	public void setUrlLink(final String value)
	{
		setUrlLink( getSession().getSessionContext(), value );
	}
	
}
