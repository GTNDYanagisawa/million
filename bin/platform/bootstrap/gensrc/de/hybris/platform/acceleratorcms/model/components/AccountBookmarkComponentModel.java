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
import de.hybris.platform.cms2.model.contents.components.CMSLinkComponentModel;
import de.hybris.platform.cms2.model.contents.components.SimpleCMSComponentModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type AccountBookmarkComponent first defined at extension acceleratorcms.
 * <p>
 * It represents account bookmark component containing one link to the previous page usually.
 */
@SuppressWarnings("all")
public class AccountBookmarkComponentModel extends SimpleCMSComponentModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "AccountBookmarkComponent";
	
	/** <i>Generated constant</i> - Attribute key of <code>AccountBookmarkComponent.styleClass</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String STYLECLASS = "styleClass";
	
	/** <i>Generated constant</i> - Attribute key of <code>AccountBookmarkComponent.link</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String LINK = "link";
	
	
	/** <i>Generated variable</i> - Variable of <code>AccountBookmarkComponent.styleClass</code> attribute defined at extension <code>acceleratorcms</code>. */
	private String _styleClass;
	
	/** <i>Generated variable</i> - Variable of <code>AccountBookmarkComponent.link</code> attribute defined at extension <code>acceleratorcms</code>. */
	private CMSLinkComponentModel _link;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AccountBookmarkComponentModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AccountBookmarkComponentModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _link initial attribute declared by type <code>AccountBookmarkComponent</code> at extension <code>acceleratorcms</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public AccountBookmarkComponentModel(final CatalogVersionModel _catalogVersion, final CMSLinkComponentModel _link, final String _uid)
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
	 * @param _link initial attribute declared by type <code>AccountBookmarkComponent</code> at extension <code>acceleratorcms</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public AccountBookmarkComponentModel(final CatalogVersionModel _catalogVersion, final CMSLinkComponentModel _link, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setLink(_link);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccountBookmarkComponent.link</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the link - The cms navigation node of this navigation component.
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
	 * <i>Generated method</i> - Getter of the <code>AccountBookmarkComponent.styleClass</code> attribute defined at extension <code>acceleratorcms</code>. 
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
	 * <i>Generated method</i> - Setter of <code>AccountBookmarkComponent.link</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the link - The cms navigation node of this navigation component.
	 */
	public void setLink(final CMSLinkComponentModel value)
	{
		_link = getPersistenceContext().setValue(LINK, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AccountBookmarkComponent.styleClass</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the styleClass - CSS style class of this bar component.
	 */
	public void setStyleClass(final String value)
	{
		_styleClass = getPersistenceContext().setValue(STYLECLASS, value);
	}
	
}
