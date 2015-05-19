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

import de.hybris.platform.commercewebservicescommons.dto.product.ImageWsDTO;

public class CategoryWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>CategoryWsDTO.image</code> property defined at extension <code>commercewebservicescommons</code>. */
	private ImageWsDTO image;
	/** <i>Generated property</i> for <code>CategoryWsDTO.code</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String code;
	/** <i>Generated property</i> for <code>CategoryWsDTO.url</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String url;
		
	public CategoryWsDTO()
	{
		// default constructor
	}
	
		
	public void setImage(final ImageWsDTO image)
	{
		this.image = image;
	}
	
		
	public ImageWsDTO getImage() 
	{
		return image;
	}
		
		
	public void setCode(final String code)
	{
		this.code = code;
	}
	
		
	public String getCode() 
	{
		return code;
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