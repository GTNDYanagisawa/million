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
package de.hybris.platform.print.model;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.print.model.ContentBlockModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Locale;

/**
 * Generated model class for type ImageBlock first defined at extension print.
 */
@SuppressWarnings("all")
public class ImageBlockModel extends ContentBlockModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ImageBlock";
	
	/** <i>Generated constant</i> - Attribute key of <code>ImageBlock.image</code> attribute defined at extension <code>print</code>. */
	public static final String IMAGE = "image";
	
	/** <i>Generated constant</i> - Attribute key of <code>ImageBlock.caption</code> attribute defined at extension <code>print</code>. */
	public static final String CAPTION = "caption";
	
	
	/** <i>Generated variable</i> - Variable of <code>ImageBlock.image</code> attribute defined at extension <code>print</code>. */
	private MediaModel _image;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ImageBlockModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ImageBlockModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>ContentBlock</code> at extension <code>print</code>
	 * @param _code initial attribute declared by type <code>ContentBlock</code> at extension <code>print</code>
	 */
	@Deprecated
	public ImageBlockModel(final CatalogVersionModel _catalogVersion, final String _code)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>ContentBlock</code> at extension <code>print</code>
	 * @param _code initial attribute declared by type <code>ContentBlock</code> at extension <code>print</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public ImageBlockModel(final CatalogVersionModel _catalogVersion, final String _code, final ItemModel _owner)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImageBlock.caption</code> attribute defined at extension <code>print</code>. 
	 * @return the caption
	 */
	public String getCaption()
	{
		return getCaption(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>ImageBlock.caption</code> attribute defined at extension <code>print</code>. 
	 * @param loc the value localization key 
	 * @return the caption
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getCaption(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(CAPTION, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImageBlock.image</code> attribute defined at extension <code>print</code>. 
	 * @return the image
	 */
	public MediaModel getImage()
	{
		if (this._image!=null)
		{
			return _image;
		}
		return _image = getPersistenceContext().getValue(IMAGE, _image);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ImageBlock.caption</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the caption
	 */
	public void setCaption(final String value)
	{
		setCaption(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>ImageBlock.caption</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the caption
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setCaption(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(CAPTION, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ImageBlock.image</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the image
	 */
	public void setImage(final MediaModel value)
	{
		_image = getPersistenceContext().setValue(IMAGE, value);
	}
	
}
