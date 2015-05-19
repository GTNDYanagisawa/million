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

import de.hybris.platform.commercewebservicescommons.dto.product.FeatureUnitWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.product.FeatureValueWsDTO;
import java.util.Collection;

public class FeatureWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>FeatureWsDTO.range</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Boolean range;
	/** <i>Generated property</i> for <code>FeatureWsDTO.description</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String description;
	/** <i>Generated property</i> for <code>FeatureWsDTO.name</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String name;
	/** <i>Generated property</i> for <code>FeatureWsDTO.featureUnit</code> property defined at extension <code>commercewebservicescommons</code>. */
	private FeatureUnitWsDTO featureUnit;
	/** <i>Generated property</i> for <code>FeatureWsDTO.featureValues</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Collection<FeatureValueWsDTO> featureValues;
	/** <i>Generated property</i> for <code>FeatureWsDTO.comparable</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Boolean comparable;
	/** <i>Generated property</i> for <code>FeatureWsDTO.code</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String code;
	/** <i>Generated property</i> for <code>FeatureWsDTO.type</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String type;
		
	public FeatureWsDTO()
	{
		// default constructor
	}
	
		
	public void setRange(final Boolean range)
	{
		this.range = range;
	}
	
		
	public Boolean getRange() 
	{
		return range;
	}
		
		
	public void setDescription(final String description)
	{
		this.description = description;
	}
	
		
	public String getDescription() 
	{
		return description;
	}
		
		
	public void setName(final String name)
	{
		this.name = name;
	}
	
		
	public String getName() 
	{
		return name;
	}
		
		
	public void setFeatureUnit(final FeatureUnitWsDTO featureUnit)
	{
		this.featureUnit = featureUnit;
	}
	
		
	public FeatureUnitWsDTO getFeatureUnit() 
	{
		return featureUnit;
	}
		
		
	public void setFeatureValues(final Collection<FeatureValueWsDTO> featureValues)
	{
		this.featureValues = featureValues;
	}
	
		
	public Collection<FeatureValueWsDTO> getFeatureValues() 
	{
		return featureValues;
	}
		
		
	public void setComparable(final Boolean comparable)
	{
		this.comparable = comparable;
	}
	
		
	public Boolean getComparable() 
	{
		return comparable;
	}
		
		
	public void setCode(final String code)
	{
		this.code = code;
	}
	
		
	public String getCode() 
	{
		return code;
	}
		
		
	public void setType(final String type)
	{
		this.type = type;
	}
	
		
	public String getType() 
	{
		return type;
	}
		
	
}