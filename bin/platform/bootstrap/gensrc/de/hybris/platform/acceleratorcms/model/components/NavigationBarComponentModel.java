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

import de.hybris.platform.acceleratorcms.enums.NavigationBarMenuLayout;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.cms2.model.contents.components.CMSLinkComponentModel;
import de.hybris.platform.cms2.model.contents.components.SimpleCMSComponentModel;
import de.hybris.platform.cms2.model.navigation.CMSNavigationNodeModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type NavigationBarComponent first defined at extension acceleratorcms.
 * <p>
 * It represents navigation bar component that contains cms navigation node. Nodes structure can be built in a hierarchical way.
 */
@SuppressWarnings("all")
public class NavigationBarComponentModel extends SimpleCMSComponentModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "NavigationBarComponent";
	
	/** <i>Generated constant</i> - Attribute key of <code>NavigationBarComponent.dropDownLayout</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String DROPDOWNLAYOUT = "dropDownLayout";
	
	/** <i>Generated constant</i> - Attribute key of <code>NavigationBarComponent.navigationNode</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String NAVIGATIONNODE = "navigationNode";
	
	/** <i>Generated constant</i> - Attribute key of <code>NavigationBarComponent.wrapAfter</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String WRAPAFTER = "wrapAfter";
	
	/** <i>Generated constant</i> - Attribute key of <code>NavigationBarComponent.link</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String LINK = "link";
	
	/** <i>Generated constant</i> - Attribute key of <code>NavigationBarComponent.styleClass</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String STYLECLASS = "styleClass";
	
	
	/** <i>Generated variable</i> - Variable of <code>NavigationBarComponent.dropDownLayout</code> attribute defined at extension <code>acceleratorcms</code>. */
	private NavigationBarMenuLayout _dropDownLayout;
	
	/** <i>Generated variable</i> - Variable of <code>NavigationBarComponent.navigationNode</code> attribute defined at extension <code>acceleratorcms</code>. */
	private CMSNavigationNodeModel _navigationNode;
	
	/** <i>Generated variable</i> - Variable of <code>NavigationBarComponent.wrapAfter</code> attribute defined at extension <code>acceleratorcms</code>. */
	private Integer _wrapAfter;
	
	/** <i>Generated variable</i> - Variable of <code>NavigationBarComponent.link</code> attribute defined at extension <code>acceleratorcms</code>. */
	private CMSLinkComponentModel _link;
	
	/** <i>Generated variable</i> - Variable of <code>NavigationBarComponent.styleClass</code> attribute defined at extension <code>acceleratorcms</code>. */
	private String _styleClass;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public NavigationBarComponentModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public NavigationBarComponentModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _link initial attribute declared by type <code>NavigationBarComponent</code> at extension <code>acceleratorcms</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public NavigationBarComponentModel(final CatalogVersionModel _catalogVersion, final CMSLinkComponentModel _link, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setLink(_link);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _link initial attribute declared by type <code>NavigationBarComponent</code> at extension <code>acceleratorcms</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public NavigationBarComponentModel(final CatalogVersionModel _catalogVersion, final CMSLinkComponentModel _link, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setLink(_link);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NavigationBarComponent.dropDownLayout</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the dropDownLayout - Determines the way navigation drop down is positioned.
	 */
	public NavigationBarMenuLayout getDropDownLayout()
	{
		if (this._dropDownLayout!=null)
		{
			return _dropDownLayout;
		}
		return _dropDownLayout = getPersistenceContext().getValue(DROPDOWNLAYOUT, _dropDownLayout);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NavigationBarComponent.link</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the link - The cms link component that is attached to this bar component.
	 */
	public CMSLinkComponentModel getLink()
	{
		if (this._link!=null)
		{
			return _link;
		}
		return _link = getPersistenceContext().getValue(LINK, _link);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NavigationBarComponent.navigationNode</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the navigationNode - The cms navigation node of this navigation bar component.
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
	 * <i>Generated method</i> - Getter of the <code>NavigationBarComponent.styleClass</code> attribute defined at extension <code>acceleratorcms</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>NavigationBarComponent.wrapAfter</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the wrapAfter - Determines the number of navigation nodes when the following elements will be wrapped.
	 */
	public Integer getWrapAfter()
	{
		if (this._wrapAfter!=null)
		{
			return _wrapAfter;
		}
		return _wrapAfter = getPersistenceContext().getValue(WRAPAFTER, _wrapAfter);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>NavigationBarComponent.dropDownLayout</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the dropDownLayout - Determines the way navigation drop down is positioned.
	 */
	public void setDropDownLayout(final NavigationBarMenuLayout value)
	{
		_dropDownLayout = getPersistenceContext().setValue(DROPDOWNLAYOUT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>NavigationBarComponent.link</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the link - The cms link component that is attached to this bar component.
	 */
	public void setLink(final CMSLinkComponentModel value)
	{
		_link = getPersistenceContext().setValue(LINK, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>NavigationBarComponent.navigationNode</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the navigationNode - The cms navigation node of this navigation bar component.
	 */
	public void setNavigationNode(final CMSNavigationNodeModel value)
	{
		_navigationNode = getPersistenceContext().setValue(NAVIGATIONNODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>NavigationBarComponent.styleClass</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the styleClass - CSS style class of this bar component.
	 */
	public void setStyleClass(final String value)
	{
		_styleClass = getPersistenceContext().setValue(STYLECLASS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>NavigationBarComponent.wrapAfter</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the wrapAfter - Determines the number of navigation nodes when the following elements will be wrapped.
	 */
	public void setWrapAfter(final Integer value)
	{
		_wrapAfter = getPersistenceContext().setValue(WRAPAFTER, value);
	}
	
}
