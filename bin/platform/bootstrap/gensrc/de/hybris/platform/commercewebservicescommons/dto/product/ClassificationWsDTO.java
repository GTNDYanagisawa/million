/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 2015/05/18 13:25:59
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

import de.hybris.platform.commercewebservicescommons.dto.product.FeatureWsDTO;
import java.util.Collection;

public class ClassificationWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>ClassificationWsDTO.name</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String name;
	/** <i>Generated property</i> for <code>ClassificationWsDTO.features</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Collection<FeatureWsDTO> features;
	/** <i>Generated property</i> for <code>ClassificationWsDTO.code</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String code;
		
	public ClassificationWsDTO()
	{
		// default constructor
	}
	
		
	public void setName(final String name)
	{
		this.name = name;
	}
	
		
	public String getName() 
	{
		return name;
	}
		
		
	public void setFeatures(final Collection<FeatureWsDTO> features)
	{
		this.features = features;
	}
	
		
	public Collection<FeatureWsDTO> getFeatures() 
	{
		return features;
	}
		
		
	public void setCode(final String code)
	{
		this.code = code;
	}
	
		
	public String getCode() 
	{
		return code;
	}
		
	
}