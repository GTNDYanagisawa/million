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
import de.hybris.platform.cms2.jalo.navigation.CMSNavigationNode;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.acceleratorcms.jalo.components.AccountNavigationComponent AccountNavigationComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAccountNavigationComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>AccountNavigationComponent.title</code> attribute **/
	public static final String TITLE = "title";
	/** Qualifier of the <code>AccountNavigationComponent.styleClass</code> attribute **/
	public static final String STYLECLASS = "styleClass";
	/** Qualifier of the <code>AccountNavigationComponent.navigationNode</code> attribute **/
	public static final String NAVIGATIONNODE = "navigationNode";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(TITLE, AttributeMode.INITIAL);
		tmp.put(STYLECLASS, AttributeMode.INITIAL);
		tmp.put(NAVIGATIONNODE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccountNavigationComponent.navigationNode</code> attribute.
	 * @return the navigationNode - The cms navigation node of this navigation component.
	 */
	public CMSNavigationNode getNavigationNode(final SessionContext ctx)
	{
		return (CMSNavigationNode)getProperty( ctx, NAVIGATIONNODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccountNavigationComponent.navigationNode</code> attribute.
	 * @return the navigationNode - The cms navigation node of this navigation component.
	 */
	public CMSNavigationNode getNavigationNode()
	{
		return getNavigationNode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccountNavigationComponent.navigationNode</code> attribute. 
	 * @param value the navigationNode - The cms navigation node of this navigation component.
	 */
	public void setNavigationNode(final SessionContext ctx, final CMSNavigationNode value)
	{
		setProperty(ctx, NAVIGATIONNODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccountNavigationComponent.navigationNode</code> attribute. 
	 * @param value the navigationNode - The cms navigation node of this navigation component.
	 */
	public void setNavigationNode(final CMSNavigationNode value)
	{
		setNavigationNode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccountNavigationComponent.styleClass</code> attribute.
	 * @return the styleClass - CSS style class of this bar component.
	 */
	public String getStyleClass(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STYLECLASS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccountNavigationComponent.styleClass</code> attribute.
	 * @return the styleClass - CSS style class of this bar component.
	 */
	public String getStyleClass()
	{
		return getStyleClass( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccountNavigationComponent.styleClass</code> attribute. 
	 * @param value the styleClass - CSS style class of this bar component.
	 */
	public void setStyleClass(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STYLECLASS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccountNavigationComponent.styleClass</code> attribute. 
	 * @param value the styleClass - CSS style class of this bar component.
	 */
	public void setStyleClass(final String value)
	{
		setStyleClass( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccountNavigationComponent.title</code> attribute.
	 * @return the title - Localized title of the component.
	 */
	public String getTitle(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAccountNavigationComponent.getTitle requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccountNavigationComponent.title</code> attribute.
	 * @return the title - Localized title of the component.
	 */
	public String getTitle()
	{
		return getTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccountNavigationComponent.title</code> attribute. 
	 * @return the localized title - Localized title of the component.
	 */
	public Map<Language,String> getAllTitle(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,TITLE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccountNavigationComponent.title</code> attribute. 
	 * @return the localized title - Localized title of the component.
	 */
	public Map<Language,String> getAllTitle()
	{
		return getAllTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccountNavigationComponent.title</code> attribute. 
	 * @param value the title - Localized title of the component.
	 */
	public void setTitle(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAccountNavigationComponent.setTitle requires a session language", 0 );
		}
		setLocalizedProperty(ctx, TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccountNavigationComponent.title</code> attribute. 
	 * @param value the title - Localized title of the component.
	 */
	public void setTitle(final String value)
	{
		setTitle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccountNavigationComponent.title</code> attribute. 
	 * @param value the title - Localized title of the component.
	 */
	public void setAllTitle(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccountNavigationComponent.title</code> attribute. 
	 * @param value the title - Localized title of the component.
	 */
	public void setAllTitle(final Map<Language,String> value)
	{
		setAllTitle( getSession().getSessionContext(), value );
	}
	
}
