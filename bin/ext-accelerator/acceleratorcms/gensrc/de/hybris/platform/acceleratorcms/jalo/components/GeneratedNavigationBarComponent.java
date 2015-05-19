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
import de.hybris.platform.cms2.jalo.navigation.CMSNavigationNode;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.acceleratorcms.jalo.components.NavigationBarComponent NavigationBarComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedNavigationBarComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>NavigationBarComponent.dropDownLayout</code> attribute **/
	public static final String DROPDOWNLAYOUT = "dropDownLayout";
	/** Qualifier of the <code>NavigationBarComponent.navigationNode</code> attribute **/
	public static final String NAVIGATIONNODE = "navigationNode";
	/** Qualifier of the <code>NavigationBarComponent.wrapAfter</code> attribute **/
	public static final String WRAPAFTER = "wrapAfter";
	/** Qualifier of the <code>NavigationBarComponent.link</code> attribute **/
	public static final String LINK = "link";
	/** Qualifier of the <code>NavigationBarComponent.styleClass</code> attribute **/
	public static final String STYLECLASS = "styleClass";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(DROPDOWNLAYOUT, AttributeMode.INITIAL);
		tmp.put(NAVIGATIONNODE, AttributeMode.INITIAL);
		tmp.put(WRAPAFTER, AttributeMode.INITIAL);
		tmp.put(LINK, AttributeMode.INITIAL);
		tmp.put(STYLECLASS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NavigationBarComponent.dropDownLayout</code> attribute.
	 * @return the dropDownLayout - Determines the way navigation drop down is positioned.
	 */
	public EnumerationValue getDropDownLayout(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DROPDOWNLAYOUT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NavigationBarComponent.dropDownLayout</code> attribute.
	 * @return the dropDownLayout - Determines the way navigation drop down is positioned.
	 */
	public EnumerationValue getDropDownLayout()
	{
		return getDropDownLayout( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NavigationBarComponent.dropDownLayout</code> attribute. 
	 * @param value the dropDownLayout - Determines the way navigation drop down is positioned.
	 */
	public void setDropDownLayout(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DROPDOWNLAYOUT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NavigationBarComponent.dropDownLayout</code> attribute. 
	 * @param value the dropDownLayout - Determines the way navigation drop down is positioned.
	 */
	public void setDropDownLayout(final EnumerationValue value)
	{
		setDropDownLayout( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NavigationBarComponent.link</code> attribute.
	 * @return the link - The cms link component that is attached to this bar component.
	 */
	public CMSLinkComponent getLink(final SessionContext ctx)
	{
		return (CMSLinkComponent)getProperty( ctx, LINK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NavigationBarComponent.link</code> attribute.
	 * @return the link - The cms link component that is attached to this bar component.
	 */
	public CMSLinkComponent getLink()
	{
		return getLink( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NavigationBarComponent.link</code> attribute. 
	 * @param value the link - The cms link component that is attached to this bar component.
	 */
	public void setLink(final SessionContext ctx, final CMSLinkComponent value)
	{
		setProperty(ctx, LINK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NavigationBarComponent.link</code> attribute. 
	 * @param value the link - The cms link component that is attached to this bar component.
	 */
	public void setLink(final CMSLinkComponent value)
	{
		setLink( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NavigationBarComponent.navigationNode</code> attribute.
	 * @return the navigationNode - The cms navigation node of this navigation bar component.
	 */
	public CMSNavigationNode getNavigationNode(final SessionContext ctx)
	{
		return (CMSNavigationNode)getProperty( ctx, NAVIGATIONNODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NavigationBarComponent.navigationNode</code> attribute.
	 * @return the navigationNode - The cms navigation node of this navigation bar component.
	 */
	public CMSNavigationNode getNavigationNode()
	{
		return getNavigationNode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NavigationBarComponent.navigationNode</code> attribute. 
	 * @param value the navigationNode - The cms navigation node of this navigation bar component.
	 */
	public void setNavigationNode(final SessionContext ctx, final CMSNavigationNode value)
	{
		setProperty(ctx, NAVIGATIONNODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NavigationBarComponent.navigationNode</code> attribute. 
	 * @param value the navigationNode - The cms navigation node of this navigation bar component.
	 */
	public void setNavigationNode(final CMSNavigationNode value)
	{
		setNavigationNode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NavigationBarComponent.styleClass</code> attribute.
	 * @return the styleClass - CSS style class of this bar component.
	 */
	public String getStyleClass(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STYLECLASS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NavigationBarComponent.styleClass</code> attribute.
	 * @return the styleClass - CSS style class of this bar component.
	 */
	public String getStyleClass()
	{
		return getStyleClass( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NavigationBarComponent.styleClass</code> attribute. 
	 * @param value the styleClass - CSS style class of this bar component.
	 */
	public void setStyleClass(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STYLECLASS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NavigationBarComponent.styleClass</code> attribute. 
	 * @param value the styleClass - CSS style class of this bar component.
	 */
	public void setStyleClass(final String value)
	{
		setStyleClass( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NavigationBarComponent.wrapAfter</code> attribute.
	 * @return the wrapAfter - Determines the number of navigation nodes when the following elements will be wrapped.
	 */
	public Integer getWrapAfter(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, WRAPAFTER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NavigationBarComponent.wrapAfter</code> attribute.
	 * @return the wrapAfter - Determines the number of navigation nodes when the following elements will be wrapped.
	 */
	public Integer getWrapAfter()
	{
		return getWrapAfter( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NavigationBarComponent.wrapAfter</code> attribute. 
	 * @return the wrapAfter - Determines the number of navigation nodes when the following elements will be wrapped.
	 */
	public int getWrapAfterAsPrimitive(final SessionContext ctx)
	{
		Integer value = getWrapAfter( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NavigationBarComponent.wrapAfter</code> attribute. 
	 * @return the wrapAfter - Determines the number of navigation nodes when the following elements will be wrapped.
	 */
	public int getWrapAfterAsPrimitive()
	{
		return getWrapAfterAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NavigationBarComponent.wrapAfter</code> attribute. 
	 * @param value the wrapAfter - Determines the number of navigation nodes when the following elements will be wrapped.
	 */
	public void setWrapAfter(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, WRAPAFTER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NavigationBarComponent.wrapAfter</code> attribute. 
	 * @param value the wrapAfter - Determines the number of navigation nodes when the following elements will be wrapped.
	 */
	public void setWrapAfter(final Integer value)
	{
		setWrapAfter( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NavigationBarComponent.wrapAfter</code> attribute. 
	 * @param value the wrapAfter - Determines the number of navigation nodes when the following elements will be wrapped.
	 */
	public void setWrapAfter(final SessionContext ctx, final int value)
	{
		setWrapAfter( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NavigationBarComponent.wrapAfter</code> attribute. 
	 * @param value the wrapAfter - Determines the number of navigation nodes when the following elements will be wrapped.
	 */
	public void setWrapAfter(final int value)
	{
		setWrapAfter( getSession().getSessionContext(), value );
	}
	
}
