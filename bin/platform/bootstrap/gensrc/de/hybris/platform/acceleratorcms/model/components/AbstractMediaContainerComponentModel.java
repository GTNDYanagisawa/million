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
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.media.MediaContainerModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Locale;

/**
 * Generated model class for type AbstractMediaContainerComponent first defined at extension acceleratorcms.
 */
@SuppressWarnings("all")
public class AbstractMediaContainerComponentModel extends SimpleCMSComponentModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "AbstractMediaContainerComponent";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractMediaContainerComponent.media</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String MEDIA = "media";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AbstractMediaContainerComponentModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AbstractMediaContainerComponentModel(final ItemModelContext ctx)
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
	public AbstractMediaContainerComponentModel(final CatalogVersionModel _catalogVersion, final String _uid)
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
	public AbstractMediaContainerComponentModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractMediaContainerComponent.media</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the media - It is a media container containing images for specific resolutions
	 */
	public MediaContainerModel getMedia()
	{
		return getMedia(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractMediaContainerComponent.media</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @param loc the value localization key 
	 * @return the media - It is a media container containing images for specific resolutions
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public MediaContainerModel getMedia(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(MEDIA, loc);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractMediaContainerComponent.media</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the media - It is a media container containing images for specific resolutions
	 */
	public void setMedia(final MediaContainerModel value)
	{
		setMedia(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractMediaContainerComponent.media</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the media - It is a media container containing images for specific resolutions
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setMedia(final MediaContainerModel value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(MEDIA, loc, value);
	}
	
}
