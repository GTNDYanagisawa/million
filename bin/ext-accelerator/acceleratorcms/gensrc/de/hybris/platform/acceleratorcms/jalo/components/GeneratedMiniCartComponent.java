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
import de.hybris.platform.acceleratorcms.jalo.components.SimpleBannerComponent;
import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.acceleratorcms.jalo.components.MiniCartComponent MiniCartComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMiniCartComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>MiniCartComponent.title</code> attribute **/
	public static final String TITLE = "title";
	/** Qualifier of the <code>MiniCartComponent.totalDisplay</code> attribute **/
	public static final String TOTALDISPLAY = "totalDisplay";
	/** Qualifier of the <code>MiniCartComponent.shownProductCount</code> attribute **/
	public static final String SHOWNPRODUCTCOUNT = "shownProductCount";
	/** Qualifier of the <code>MiniCartComponent.lightboxBannerComponent</code> attribute **/
	public static final String LIGHTBOXBANNERCOMPONENT = "lightboxBannerComponent";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(TITLE, AttributeMode.INITIAL);
		tmp.put(TOTALDISPLAY, AttributeMode.INITIAL);
		tmp.put(SHOWNPRODUCTCOUNT, AttributeMode.INITIAL);
		tmp.put(LIGHTBOXBANNERCOMPONENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MiniCartComponent.lightboxBannerComponent</code> attribute.
	 * @return the lightboxBannerComponent - It is a banner component that can be displayed in the mini cart.
	 */
	public SimpleBannerComponent getLightboxBannerComponent(final SessionContext ctx)
	{
		return (SimpleBannerComponent)getProperty( ctx, LIGHTBOXBANNERCOMPONENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MiniCartComponent.lightboxBannerComponent</code> attribute.
	 * @return the lightboxBannerComponent - It is a banner component that can be displayed in the mini cart.
	 */
	public SimpleBannerComponent getLightboxBannerComponent()
	{
		return getLightboxBannerComponent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MiniCartComponent.lightboxBannerComponent</code> attribute. 
	 * @param value the lightboxBannerComponent - It is a banner component that can be displayed in the mini cart.
	 */
	public void setLightboxBannerComponent(final SessionContext ctx, final SimpleBannerComponent value)
	{
		setProperty(ctx, LIGHTBOXBANNERCOMPONENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MiniCartComponent.lightboxBannerComponent</code> attribute. 
	 * @param value the lightboxBannerComponent - It is a banner component that can be displayed in the mini cart.
	 */
	public void setLightboxBannerComponent(final SimpleBannerComponent value)
	{
		setLightboxBannerComponent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MiniCartComponent.shownProductCount</code> attribute.
	 * @return the shownProductCount - It controls the maximum number of products to display in the component.
	 */
	public Integer getShownProductCount(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, SHOWNPRODUCTCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MiniCartComponent.shownProductCount</code> attribute.
	 * @return the shownProductCount - It controls the maximum number of products to display in the component.
	 */
	public Integer getShownProductCount()
	{
		return getShownProductCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MiniCartComponent.shownProductCount</code> attribute. 
	 * @return the shownProductCount - It controls the maximum number of products to display in the component.
	 */
	public int getShownProductCountAsPrimitive(final SessionContext ctx)
	{
		Integer value = getShownProductCount( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MiniCartComponent.shownProductCount</code> attribute. 
	 * @return the shownProductCount - It controls the maximum number of products to display in the component.
	 */
	public int getShownProductCountAsPrimitive()
	{
		return getShownProductCountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MiniCartComponent.shownProductCount</code> attribute. 
	 * @param value the shownProductCount - It controls the maximum number of products to display in the component.
	 */
	public void setShownProductCount(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, SHOWNPRODUCTCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MiniCartComponent.shownProductCount</code> attribute. 
	 * @param value the shownProductCount - It controls the maximum number of products to display in the component.
	 */
	public void setShownProductCount(final Integer value)
	{
		setShownProductCount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MiniCartComponent.shownProductCount</code> attribute. 
	 * @param value the shownProductCount - It controls the maximum number of products to display in the component.
	 */
	public void setShownProductCount(final SessionContext ctx, final int value)
	{
		setShownProductCount( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MiniCartComponent.shownProductCount</code> attribute. 
	 * @param value the shownProductCount - It controls the maximum number of products to display in the component.
	 */
	public void setShownProductCount(final int value)
	{
		setShownProductCount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MiniCartComponent.title</code> attribute.
	 * @return the title - It is localized title of the component.
	 */
	public String getTitle(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedMiniCartComponent.getTitle requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MiniCartComponent.title</code> attribute.
	 * @return the title - It is localized title of the component.
	 */
	public String getTitle()
	{
		return getTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MiniCartComponent.title</code> attribute. 
	 * @return the localized title - It is localized title of the component.
	 */
	public Map<Language,String> getAllTitle(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,TITLE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MiniCartComponent.title</code> attribute. 
	 * @return the localized title - It is localized title of the component.
	 */
	public Map<Language,String> getAllTitle()
	{
		return getAllTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MiniCartComponent.title</code> attribute. 
	 * @param value the title - It is localized title of the component.
	 */
	public void setTitle(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedMiniCartComponent.setTitle requires a session language", 0 );
		}
		setLocalizedProperty(ctx, TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MiniCartComponent.title</code> attribute. 
	 * @param value the title - It is localized title of the component.
	 */
	public void setTitle(final String value)
	{
		setTitle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MiniCartComponent.title</code> attribute. 
	 * @param value the title - It is localized title of the component.
	 */
	public void setAllTitle(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MiniCartComponent.title</code> attribute. 
	 * @param value the title - It is localized title of the component.
	 */
	public void setAllTitle(final Map<Language,String> value)
	{
		setAllTitle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MiniCartComponent.totalDisplay</code> attribute.
	 * @return the totalDisplay - This attribute determines the type of displayed total cart value.
	 */
	public EnumerationValue getTotalDisplay(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TOTALDISPLAY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MiniCartComponent.totalDisplay</code> attribute.
	 * @return the totalDisplay - This attribute determines the type of displayed total cart value.
	 */
	public EnumerationValue getTotalDisplay()
	{
		return getTotalDisplay( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MiniCartComponent.totalDisplay</code> attribute. 
	 * @param value the totalDisplay - This attribute determines the type of displayed total cart value.
	 */
	public void setTotalDisplay(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TOTALDISPLAY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MiniCartComponent.totalDisplay</code> attribute. 
	 * @param value the totalDisplay - This attribute determines the type of displayed total cart value.
	 */
	public void setTotalDisplay(final EnumerationValue value)
	{
		setTotalDisplay( getSession().getSessionContext(), value );
	}
	
}
