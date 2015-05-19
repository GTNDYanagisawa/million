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
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.media.MediaContainer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.acceleratorcms.jalo.components.AbstractMediaContainerComponent AbstractMediaContainerComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractMediaContainerComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>AbstractMediaContainerComponent.media</code> attribute **/
	public static final String MEDIA = "media";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MEDIA, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractMediaContainerComponent.media</code> attribute.
	 * @return the media - It is a media container containing images for specific resolutions
	 */
	public MediaContainer getMedia(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractMediaContainerComponent.getMedia requires a session language", 0 );
		}
		return (MediaContainer)getLocalizedProperty( ctx, MEDIA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractMediaContainerComponent.media</code> attribute.
	 * @return the media - It is a media container containing images for specific resolutions
	 */
	public MediaContainer getMedia()
	{
		return getMedia( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractMediaContainerComponent.media</code> attribute. 
	 * @return the localized media - It is a media container containing images for specific resolutions
	 */
	public Map<Language,MediaContainer> getAllMedia(final SessionContext ctx)
	{
		return (Map<Language,MediaContainer>)getAllLocalizedProperties(ctx,MEDIA,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractMediaContainerComponent.media</code> attribute. 
	 * @return the localized media - It is a media container containing images for specific resolutions
	 */
	public Map<Language,MediaContainer> getAllMedia()
	{
		return getAllMedia( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractMediaContainerComponent.media</code> attribute. 
	 * @param value the media - It is a media container containing images for specific resolutions
	 */
	public void setMedia(final SessionContext ctx, final MediaContainer value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractMediaContainerComponent.setMedia requires a session language", 0 );
		}
		setLocalizedProperty(ctx, MEDIA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractMediaContainerComponent.media</code> attribute. 
	 * @param value the media - It is a media container containing images for specific resolutions
	 */
	public void setMedia(final MediaContainer value)
	{
		setMedia( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractMediaContainerComponent.media</code> attribute. 
	 * @param value the media - It is a media container containing images for specific resolutions
	 */
	public void setAllMedia(final SessionContext ctx, final Map<Language,MediaContainer> value)
	{
		setAllLocalizedProperties(ctx,MEDIA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractMediaContainerComponent.media</code> attribute. 
	 * @param value the media - It is a media container containing images for specific resolutions
	 */
	public void setAllMedia(final Map<Language,MediaContainer> value)
	{
		setAllMedia( getSession().getSessionContext(), value );
	}
	
}
