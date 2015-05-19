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

import de.hybris.platform.acceleratorcms.model.components.SimpleBannerComponentModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.cms2.model.contents.components.SimpleCMSComponentModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type LogoComponent first defined at extension acceleratorcms.
 * <p>
 * It represents header logo.
 */
@SuppressWarnings("all")
public class LogoComponentModel extends SimpleCMSComponentModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "LogoComponent";
	
	/** <i>Generated constant</i> - Attribute key of <code>LogoComponent.logo</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String LOGO = "logo";
	
	
	/** <i>Generated variable</i> - Variable of <code>LogoComponent.logo</code> attribute defined at extension <code>acceleratorcms</code>. */
	private SimpleBannerComponentModel _logo;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public LogoComponentModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public LogoComponentModel(final ItemModelContext ctx)
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
	public LogoComponentModel(final CatalogVersionModel _catalogVersion, final String _uid)
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
	public LogoComponentModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LogoComponent.logo</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the logo - It is a banner component to be displayed.
	 */
	public SimpleBannerComponentModel getLogo()
	{
		if (this._logo!=null)
		{
			return _logo;
		}
		return _logo = getPersistenceContext().getValue(LOGO, _logo);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LogoComponent.logo</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the logo - It is a banner component to be displayed.
	 */
	public void setLogo(final SimpleBannerComponentModel value)
	{
		_logo = getPersistenceContext().setValue(LOGO, value);
	}
	
}
