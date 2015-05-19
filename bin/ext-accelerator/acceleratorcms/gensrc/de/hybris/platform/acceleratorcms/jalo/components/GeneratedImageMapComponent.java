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
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.acceleratorcms.jalo.components.ImageMapComponent ImageMapComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedImageMapComponent extends AbstractBannerComponent
{
	/** Qualifier of the <code>ImageMapComponent.imageMapHTML</code> attribute **/
	public static final String IMAGEMAPHTML = "imageMapHTML";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractBannerComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(IMAGEMAPHTML, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImageMapComponent.imageMapHTML</code> attribute.
	 * @return the imageMapHTML - It is localized HTML string that is displayed under the banner.
	 */
	public String getImageMapHTML(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedImageMapComponent.getImageMapHTML requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, IMAGEMAPHTML);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImageMapComponent.imageMapHTML</code> attribute.
	 * @return the imageMapHTML - It is localized HTML string that is displayed under the banner.
	 */
	public String getImageMapHTML()
	{
		return getImageMapHTML( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImageMapComponent.imageMapHTML</code> attribute. 
	 * @return the localized imageMapHTML - It is localized HTML string that is displayed under the banner.
	 */
	public Map<Language,String> getAllImageMapHTML(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,IMAGEMAPHTML,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImageMapComponent.imageMapHTML</code> attribute. 
	 * @return the localized imageMapHTML - It is localized HTML string that is displayed under the banner.
	 */
	public Map<Language,String> getAllImageMapHTML()
	{
		return getAllImageMapHTML( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ImageMapComponent.imageMapHTML</code> attribute. 
	 * @param value the imageMapHTML - It is localized HTML string that is displayed under the banner.
	 */
	public void setImageMapHTML(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedImageMapComponent.setImageMapHTML requires a session language", 0 );
		}
		setLocalizedProperty(ctx, IMAGEMAPHTML,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ImageMapComponent.imageMapHTML</code> attribute. 
	 * @param value the imageMapHTML - It is localized HTML string that is displayed under the banner.
	 */
	public void setImageMapHTML(final String value)
	{
		setImageMapHTML( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ImageMapComponent.imageMapHTML</code> attribute. 
	 * @param value the imageMapHTML - It is localized HTML string that is displayed under the banner.
	 */
	public void setAllImageMapHTML(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,IMAGEMAPHTML,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ImageMapComponent.imageMapHTML</code> attribute. 
	 * @param value the imageMapHTML - It is localized HTML string that is displayed under the banner.
	 */
	public void setAllImageMapHTML(final Map<Language,String> value)
	{
		setAllImageMapHTML( getSession().getSessionContext(), value );
	}
	
}
