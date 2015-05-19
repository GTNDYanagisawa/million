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
import de.hybris.platform.acceleratorcms.jalo.components.NavigationBarComponent;
import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.acceleratorcms.jalo.components.NavigationBarCollectionComponent NavigationBarCollectionComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedNavigationBarCollectionComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>NavigationBarCollectionComponent.components</code> attribute **/
	public static final String COMPONENTS = "components";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(COMPONENTS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NavigationBarCollectionComponent.components</code> attribute.
	 * @return the components - A collection of navigation bar components
	 */
	public List<NavigationBarComponent> getComponents(final SessionContext ctx)
	{
		List<NavigationBarComponent> coll = (List<NavigationBarComponent>)getProperty( ctx, COMPONENTS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NavigationBarCollectionComponent.components</code> attribute.
	 * @return the components - A collection of navigation bar components
	 */
	public List<NavigationBarComponent> getComponents()
	{
		return getComponents( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NavigationBarCollectionComponent.components</code> attribute. 
	 * @param value the components - A collection of navigation bar components
	 */
	public void setComponents(final SessionContext ctx, final List<NavigationBarComponent> value)
	{
		setProperty(ctx, COMPONENTS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NavigationBarCollectionComponent.components</code> attribute. 
	 * @param value the components - A collection of navigation bar components
	 */
	public void setComponents(final List<NavigationBarComponent> value)
	{
		setComponents( getSession().getSessionContext(), value );
	}
	
}
