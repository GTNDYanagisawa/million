/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 2015/05/18 13:26:00
 * ----------------------------------------------------------------
 *
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package de.hybris.platform.commercewebservicescommons.dto.product;

import de.hybris.platform.commercefacades.product.data.ImageDataType;

public class ImageWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>ImageWsDTO.galleryIndex</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Integer galleryIndex;
	/** <i>Generated property</i> for <code>ImageWsDTO.imageType</code> property defined at extension <code>commercewebservicescommons</code>. */
	private ImageDataType imageType;
	/** <i>Generated property</i> for <code>ImageWsDTO.format</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String format;
	/** <i>Generated property</i> for <code>ImageWsDTO.altText</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String altText;
	/** <i>Generated property</i> for <code>ImageWsDTO.url</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String url;
		
	public ImageWsDTO()
	{
		// default constructor
	}
	
		
	public void setGalleryIndex(final Integer galleryIndex)
	{
		this.galleryIndex = galleryIndex;
	}
	
		
	public Integer getGalleryIndex() 
	{
		return galleryIndex;
	}
		
		
	public void setImageType(final ImageDataType imageType)
	{
		this.imageType = imageType;
	}
	
		
	public ImageDataType getImageType() 
	{
		return imageType;
	}
		
		
	public void setFormat(final String format)
	{
		this.format = format;
	}
	
		
	public String getFormat() 
	{
		return format;
	}
		
		
	public void setAltText(final String altText)
	{
		this.altText = altText;
	}
	
		
	public String getAltText() 
	{
		return altText;
	}
		
		
	public void setUrl(final String url)
	{
		this.url = url;
	}
	
		
	public String getUrl() 
	{
		return url;
	}
		
	
}