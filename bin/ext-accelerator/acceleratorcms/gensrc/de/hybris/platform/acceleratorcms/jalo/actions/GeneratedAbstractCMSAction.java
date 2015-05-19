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
package de.hybris.platform.acceleratorcms.jalo.actions;

import de.hybris.platform.acceleratorcms.constants.AcceleratorCmsConstants;
import de.hybris.platform.cms2.jalo.contents.components.AbstractCMSComponent;
import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.acceleratorcms.jalo.actions.AbstractCMSAction AbstractCMSAction}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractCMSAction extends SimpleCMSComponent
{
	/** Qualifier of the <code>AbstractCMSAction.url</code> attribute **/
	public static final String URL = "url";
	/** Qualifier of the <code>AbstractCMSAction.components</code> attribute **/
	public static final String COMPONENTS = "components";
	/** Relation ordering override parameter constants for CmsActionsForCmsComponents from ((acceleratorcms))*/
	protected static String CMSACTIONSFORCMSCOMPONENTS_SRC_ORDERED = "relation.CmsActionsForCmsComponents.source.ordered";
	protected static String CMSACTIONSFORCMSCOMPONENTS_TGT_ORDERED = "relation.CmsActionsForCmsComponents.target.ordered";
	/** Relation disable markmodifed parameter constants for CmsActionsForCmsComponents from ((acceleratorcms))*/
	protected static String CMSACTIONSFORCMSCOMPONENTS_MARKMODIFIED = "relation.CmsActionsForCmsComponents.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(URL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCMSAction.components</code> attribute.
	 * @return the components
	 */
	public Collection<AbstractCMSComponent> getComponents(final SessionContext ctx)
	{
		final List<AbstractCMSComponent> items = getLinkedItems( 
			ctx,
			false,
			AcceleratorCmsConstants.Relations.CMSACTIONSFORCMSCOMPONENTS,
			null,
			Utilities.getRelationOrderingOverride(CMSACTIONSFORCMSCOMPONENTS_SRC_ORDERED, true),
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCMSAction.components</code> attribute.
	 * @return the components
	 */
	public Collection<AbstractCMSComponent> getComponents()
	{
		return getComponents( getSession().getSessionContext() );
	}
	
	public long getComponentsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			AcceleratorCmsConstants.Relations.CMSACTIONSFORCMSCOMPONENTS,
			null
		);
	}
	
	public long getComponentsCount()
	{
		return getComponentsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCMSAction.components</code> attribute. 
	 * @param value the components
	 */
	public void setComponents(final SessionContext ctx, final Collection<AbstractCMSComponent> value)
	{
		setLinkedItems( 
			ctx,
			false,
			AcceleratorCmsConstants.Relations.CMSACTIONSFORCMSCOMPONENTS,
			null,
			value,
			Utilities.getRelationOrderingOverride(CMSACTIONSFORCMSCOMPONENTS_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(CMSACTIONSFORCMSCOMPONENTS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCMSAction.components</code> attribute. 
	 * @param value the components
	 */
	public void setComponents(final Collection<AbstractCMSComponent> value)
	{
		setComponents( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to components. 
	 * @param value the item to add to components
	 */
	public void addToComponents(final SessionContext ctx, final AbstractCMSComponent value)
	{
		addLinkedItems( 
			ctx,
			false,
			AcceleratorCmsConstants.Relations.CMSACTIONSFORCMSCOMPONENTS,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(CMSACTIONSFORCMSCOMPONENTS_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(CMSACTIONSFORCMSCOMPONENTS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to components. 
	 * @param value the item to add to components
	 */
	public void addToComponents(final AbstractCMSComponent value)
	{
		addToComponents( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from components. 
	 * @param value the item to remove from components
	 */
	public void removeFromComponents(final SessionContext ctx, final AbstractCMSComponent value)
	{
		removeLinkedItems( 
			ctx,
			false,
			AcceleratorCmsConstants.Relations.CMSACTIONSFORCMSCOMPONENTS,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(CMSACTIONSFORCMSCOMPONENTS_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(CMSACTIONSFORCMSCOMPONENTS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from components. 
	 * @param value the item to remove from components
	 */
	public void removeFromComponents(final AbstractCMSComponent value)
	{
		removeFromComponents( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCMSAction.url</code> attribute.
	 * @return the url
	 */
	public String getUrl(final SessionContext ctx)
	{
		return (String)getProperty( ctx, URL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCMSAction.url</code> attribute.
	 * @return the url
	 */
	public String getUrl()
	{
		return getUrl( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCMSAction.url</code> attribute. 
	 * @param value the url
	 */
	public void setUrl(final SessionContext ctx, final String value)
	{
		setProperty(ctx, URL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCMSAction.url</code> attribute. 
	 * @param value the url
	 */
	public void setUrl(final String value)
	{
		setUrl( getSession().getSessionContext(), value );
	}
	
}
