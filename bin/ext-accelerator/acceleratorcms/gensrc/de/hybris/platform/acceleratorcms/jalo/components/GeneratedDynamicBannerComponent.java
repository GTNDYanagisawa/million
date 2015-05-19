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
import de.hybris.platform.cms2lib.components.AbstractBannerComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.acceleratorcms.jalo.components.DynamicBannerComponent DynamicBannerComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDynamicBannerComponent extends AbstractBannerComponent
{
	/** Qualifier of the <code>DynamicBannerComponent.mediaCodePattern</code> attribute **/
	public static final String MEDIACODEPATTERN = "mediaCodePattern";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractBannerComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MEDIACODEPATTERN, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DynamicBannerComponent.mediaCodePattern</code> attribute.
	 * @return the mediaCodePattern - Media code pattern that will be used for evaluation.
	 */
	public String getMediaCodePattern(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MEDIACODEPATTERN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DynamicBannerComponent.mediaCodePattern</code> attribute.
	 * @return the mediaCodePattern - Media code pattern that will be used for evaluation.
	 */
	public String getMediaCodePattern()
	{
		return getMediaCodePattern( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DynamicBannerComponent.mediaCodePattern</code> attribute. 
	 * @param value the mediaCodePattern - Media code pattern that will be used for evaluation.
	 */
	public void setMediaCodePattern(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MEDIACODEPATTERN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DynamicBannerComponent.mediaCodePattern</code> attribute. 
	 * @param value the mediaCodePattern - Media code pattern that will be used for evaluation.
	 */
	public void setMediaCodePattern(final String value)
	{
		setMediaCodePattern( getSession().getSessionContext(), value );
	}
	
}
