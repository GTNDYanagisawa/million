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
package de.hybris.platform.commercefacades.product.data;

import de.hybris.platform.commercefacades.product.data.FeatureData;
import java.util.Collection;

public class ClassificationData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>ClassificationData.name</code> property defined at extension <code>commercefacades</code>. */
	private String name;
	/** <i>Generated property</i> for <code>ClassificationData.features</code> property defined at extension <code>commercefacades</code>. */
	private Collection<FeatureData> features;
	/** <i>Generated property</i> for <code>ClassificationData.code</code> property defined at extension <code>commercefacades</code>. */
	private String code;
		
	public ClassificationData()
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
		
		
	public void setFeatures(final Collection<FeatureData> features)
	{
		this.features = features;
	}
	
		
	public Collection<FeatureData> getFeatures() 
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