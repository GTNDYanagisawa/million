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
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.acceleratorcms.jalo.components.FooterComponent FooterComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFooterComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>FooterComponent.navigationNodes</code> attribute **/
	public static final String NAVIGATIONNODES = "navigationNodes";
	/** Qualifier of the <code>FooterComponent.wrapAfter</code> attribute **/
	public static final String WRAPAFTER = "wrapAfter";
	/** Qualifier of the <code>FooterComponent.showLanguageCurrency</code> attribute **/
	public static final String SHOWLANGUAGECURRENCY = "showLanguageCurrency";
	/** Qualifier of the <code>FooterComponent.notice</code> attribute **/
	public static final String NOTICE = "notice";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(NAVIGATIONNODES, AttributeMode.INITIAL);
		tmp.put(WRAPAFTER, AttributeMode.INITIAL);
		tmp.put(SHOWLANGUAGECURRENCY, AttributeMode.INITIAL);
		tmp.put(NOTICE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FooterComponent.navigationNodes</code> attribute.
	 * @return the navigationNodes - List of navigation nodes that are rendered in this footer component.
	 */
	public List<CMSNavigationNode> getNavigationNodes(final SessionContext ctx)
	{
		List<CMSNavigationNode> coll = (List<CMSNavigationNode>)getProperty( ctx, NAVIGATIONNODES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FooterComponent.navigationNodes</code> attribute.
	 * @return the navigationNodes - List of navigation nodes that are rendered in this footer component.
	 */
	public List<CMSNavigationNode> getNavigationNodes()
	{
		return getNavigationNodes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FooterComponent.navigationNodes</code> attribute. 
	 * @param value the navigationNodes - List of navigation nodes that are rendered in this footer component.
	 */
	public void setNavigationNodes(final SessionContext ctx, final List<CMSNavigationNode> value)
	{
		setProperty(ctx, NAVIGATIONNODES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FooterComponent.navigationNodes</code> attribute. 
	 * @param value the navigationNodes - List of navigation nodes that are rendered in this footer component.
	 */
	public void setNavigationNodes(final List<CMSNavigationNode> value)
	{
		setNavigationNodes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FooterComponent.notice</code> attribute.
	 * @return the notice - Intended to store a copyright notice or other text to be displayed in the footer
	 */
	public String getNotice(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedFooterComponent.getNotice requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NOTICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FooterComponent.notice</code> attribute.
	 * @return the notice - Intended to store a copyright notice or other text to be displayed in the footer
	 */
	public String getNotice()
	{
		return getNotice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FooterComponent.notice</code> attribute. 
	 * @return the localized notice - Intended to store a copyright notice or other text to be displayed in the footer
	 */
	public Map<Language,String> getAllNotice(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NOTICE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FooterComponent.notice</code> attribute. 
	 * @return the localized notice - Intended to store a copyright notice or other text to be displayed in the footer
	 */
	public Map<Language,String> getAllNotice()
	{
		return getAllNotice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FooterComponent.notice</code> attribute. 
	 * @param value the notice - Intended to store a copyright notice or other text to be displayed in the footer
	 */
	public void setNotice(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedFooterComponent.setNotice requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NOTICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FooterComponent.notice</code> attribute. 
	 * @param value the notice - Intended to store a copyright notice or other text to be displayed in the footer
	 */
	public void setNotice(final String value)
	{
		setNotice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FooterComponent.notice</code> attribute. 
	 * @param value the notice - Intended to store a copyright notice or other text to be displayed in the footer
	 */
	public void setAllNotice(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NOTICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FooterComponent.notice</code> attribute. 
	 * @param value the notice - Intended to store a copyright notice or other text to be displayed in the footer
	 */
	public void setAllNotice(final Map<Language,String> value)
	{
		setAllNotice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FooterComponent.showLanguageCurrency</code> attribute.
	 * @return the showLanguageCurrency - Determines whether or not to show the language currency selection.
	 */
	public Boolean isShowLanguageCurrency(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SHOWLANGUAGECURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FooterComponent.showLanguageCurrency</code> attribute.
	 * @return the showLanguageCurrency - Determines whether or not to show the language currency selection.
	 */
	public Boolean isShowLanguageCurrency()
	{
		return isShowLanguageCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FooterComponent.showLanguageCurrency</code> attribute. 
	 * @return the showLanguageCurrency - Determines whether or not to show the language currency selection.
	 */
	public boolean isShowLanguageCurrencyAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isShowLanguageCurrency( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FooterComponent.showLanguageCurrency</code> attribute. 
	 * @return the showLanguageCurrency - Determines whether or not to show the language currency selection.
	 */
	public boolean isShowLanguageCurrencyAsPrimitive()
	{
		return isShowLanguageCurrencyAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FooterComponent.showLanguageCurrency</code> attribute. 
	 * @param value the showLanguageCurrency - Determines whether or not to show the language currency selection.
	 */
	public void setShowLanguageCurrency(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SHOWLANGUAGECURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FooterComponent.showLanguageCurrency</code> attribute. 
	 * @param value the showLanguageCurrency - Determines whether or not to show the language currency selection.
	 */
	public void setShowLanguageCurrency(final Boolean value)
	{
		setShowLanguageCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FooterComponent.showLanguageCurrency</code> attribute. 
	 * @param value the showLanguageCurrency - Determines whether or not to show the language currency selection.
	 */
	public void setShowLanguageCurrency(final SessionContext ctx, final boolean value)
	{
		setShowLanguageCurrency( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FooterComponent.showLanguageCurrency</code> attribute. 
	 * @param value the showLanguageCurrency - Determines whether or not to show the language currency selection.
	 */
	public void setShowLanguageCurrency(final boolean value)
	{
		setShowLanguageCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FooterComponent.wrapAfter</code> attribute.
	 * @return the wrapAfter - Determines the number of navigation nodes when the following elements will be wrapped.
	 */
	public Integer getWrapAfter(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, WRAPAFTER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FooterComponent.wrapAfter</code> attribute.
	 * @return the wrapAfter - Determines the number of navigation nodes when the following elements will be wrapped.
	 */
	public Integer getWrapAfter()
	{
		return getWrapAfter( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FooterComponent.wrapAfter</code> attribute. 
	 * @return the wrapAfter - Determines the number of navigation nodes when the following elements will be wrapped.
	 */
	public int getWrapAfterAsPrimitive(final SessionContext ctx)
	{
		Integer value = getWrapAfter( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FooterComponent.wrapAfter</code> attribute. 
	 * @return the wrapAfter - Determines the number of navigation nodes when the following elements will be wrapped.
	 */
	public int getWrapAfterAsPrimitive()
	{
		return getWrapAfterAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FooterComponent.wrapAfter</code> attribute. 
	 * @param value the wrapAfter - Determines the number of navigation nodes when the following elements will be wrapped.
	 */
	public void setWrapAfter(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, WRAPAFTER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FooterComponent.wrapAfter</code> attribute. 
	 * @param value the wrapAfter - Determines the number of navigation nodes when the following elements will be wrapped.
	 */
	public void setWrapAfter(final Integer value)
	{
		setWrapAfter( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FooterComponent.wrapAfter</code> attribute. 
	 * @param value the wrapAfter - Determines the number of navigation nodes when the following elements will be wrapped.
	 */
	public void setWrapAfter(final SessionContext ctx, final int value)
	{
		setWrapAfter( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FooterComponent.wrapAfter</code> attribute. 
	 * @param value the wrapAfter - Determines the number of navigation nodes when the following elements will be wrapped.
	 */
	public void setWrapAfter(final int value)
	{
		setWrapAfter( getSession().getSessionContext(), value );
	}
	
}
