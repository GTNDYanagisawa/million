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
import de.hybris.platform.cms2.jalo.contents.components.CMSLinkComponent;
import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.acceleratorcms.jalo.components.AccountBookmarkComponent AccountBookmarkComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAccountBookmarkComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>AccountBookmarkComponent.styleClass</code> attribute **/
	public static final String STYLECLASS = "styleClass";
	/** Qualifier of the <code>AccountBookmarkComponent.link</code> attribute **/
	public static final String LINK = "link";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(STYLECLASS, AttributeMode.INITIAL);
		tmp.put(LINK, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccountBookmarkComponent.link</code> attribute.
	 * @return the link - The cms navigation node of this navigation component.
	 */
	public CMSLinkComponent getLink(final SessionContext ctx)
	{
		return (CMSLinkComponent)getProperty( ctx, LINK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccountBookmarkComponent.link</code> attribute.
	 * @return the link - The cms navigation node of this navigation component.
	 */
	public CMSLinkComponent getLink()
	{
		return getLink( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccountBookmarkComponent.link</code> attribute. 
	 * @param value the link - The cms navigation node of this navigation component.
	 */
	public void setLink(final SessionContext ctx, final CMSLinkComponent value)
	{
		setProperty(ctx, LINK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccountBookmarkComponent.link</code> attribute. 
	 * @param value the link - The cms navigation node of this navigation component.
	 */
	public void setLink(final CMSLinkComponent value)
	{
		setLink( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccountBookmarkComponent.styleClass</code> attribute.
	 * @return the styleClass - CSS style class of this bar component.
	 */
	public String getStyleClass(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STYLECLASS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccountBookmarkComponent.styleClass</code> attribute.
	 * @return the styleClass - CSS style class of this bar component.
	 */
	public String getStyleClass()
	{
		return getStyleClass( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccountBookmarkComponent.styleClass</code> attribute. 
	 * @param value the styleClass - CSS style class of this bar component.
	 */
	public void setStyleClass(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STYLECLASS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccountBookmarkComponent.styleClass</code> attribute. 
	 * @param value the styleClass - CSS style class of this bar component.
	 */
	public void setStyleClass(final String value)
	{
		setStyleClass( getSession().getSessionContext(), value );
	}
	
}
