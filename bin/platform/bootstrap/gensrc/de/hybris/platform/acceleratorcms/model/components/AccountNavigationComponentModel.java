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
package de.hybris.platform.acceleratorcms.model.components;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.cms2.model.contents.components.SimpleCMSComponentModel;
import de.hybris.platform.cms2.model.navigation.CMSNavigationNodeModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Locale;

/**
 * Generated model class for type AccountNavigationComponent first defined at extension acceleratorcms.
 * <p>
 * It represents account navigation bar component that contains cms navigation node.
 */
@SuppressWarnings("all")
public class AccountNavigationComponentModel extends SimpleCMSComponentModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "AccountNavigationComponent";
	
	/** <i>Generated constant</i> - Attribute key of <code>AccountNavigationComponent.title</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String TITLE = "title";
	
	/** <i>Generated constant</i> - Attribute key of <code>AccountNavigationComponent.styleClass</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String STYLECLASS = "styleClass";
	
	/** <i>Generated constant</i> - Attribute key of <code>AccountNavigationComponent.navigationNode</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String NAVIGATIONNODE = "navigationNode";
	
	
	/** <i>Generated variable</i> - Variable of <code>AccountNavigationComponent.styleClass</code> attribute defined at extension <code>acceleratorcms</code>. */
	private String _styleClass;
	
	/** <i>Generated variable</i> - Variable of <code>AccountNavigationComponent.navigationNode</code> attribute defined at extension <code>acceleratorcms</code>. */
	private CMSNavigationNodeModel _navigationNode;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AccountNavigationComponentModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AccountNavigationComponentModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public AccountNavigationComponentModel(final CatalogVersionModel _catalogVersion, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public AccountNavigationComponentModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccountNavigationComponent.navigationNode</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the navigationNode - The cms navigation node of this navigation component.
	 */
	public CMSNavigationNodeModel getNavigationNode()
	{
		if (this._navigationNode!=null)
		{
			return _navigationNode;
		}
		return _navigationNode = getPersistenceContext().getValue(NAVIGATIONNODE, _navigationNode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccountNavigationComponent.styleClass</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the styleClass - CSS style class of this bar component.
	 */
	public String getStyleClass()
	{
		if (this._styleClass!=null)
		{
			return _styleClass;
		}
		return _styleClass = getPersistenceContext().getValue(STYLECLASS, _styleClass);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccountNavigationComponent.title</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the title - Localized title of the component.
	 */
	public String getTitle()
	{
		return getTitle(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>AccountNavigationComponent.title</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @param loc the value localization key 
	 * @return the title - Localized title of the component.
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getTitle(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(TITLE, loc);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AccountNavigationComponent.navigationNode</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the navigationNode - The cms navigation node of this navigation component.
	 */
	public void setNavigationNode(final CMSNavigationNodeModel value)
	{
		_navigationNode = getPersistenceContext().setValue(NAVIGATIONNODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AccountNavigationComponent.styleClass</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the styleClass - CSS style class of this bar component.
	 */
	public void setStyleClass(final String value)
	{
		_styleClass = getPersistenceContext().setValue(STYLECLASS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AccountNavigationComponent.title</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the title - Localized title of the component.
	 */
	public void setTitle(final String value)
	{
		setTitle(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>AccountNavigationComponent.title</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the title - Localized title of the component.
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setTitle(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(TITLE, loc, value);
	}
	
}
