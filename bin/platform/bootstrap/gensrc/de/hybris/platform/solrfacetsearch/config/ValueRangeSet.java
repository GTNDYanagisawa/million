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
package de.hybris.platform.solrfacetsearch.config;

import de.hybris.platform.solrfacetsearch.config.ValueRange;
import de.hybris.platform.solrfacetsearch.config.ValueRangeType;
import java.util.List;

public class ValueRangeSet  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>ValueRangeSet.valueRanges</code> property defined at extension <code>solrfacetsearch</code>. */
	private List<ValueRange> valueRanges;
	/** <i>Generated property</i> for <code>ValueRangeSet.qualifier</code> property defined at extension <code>solrfacetsearch</code>. */
	private String qualifier;
	/** <i>Generated property</i> for <code>ValueRangeSet.type</code> property defined at extension <code>solrfacetsearch</code>. */
	private ValueRangeType type;
		
	public ValueRangeSet()
	{
		// default constructor
	}
	
		
	public void setValueRanges(final List<ValueRange> valueRanges)
	{
		this.valueRanges = valueRanges;
	}
	
		
	public List<ValueRange> getValueRanges() 
	{
		return valueRanges;
	}
		
		
	public void setQualifier(final String qualifier)
	{
		this.qualifier = qualifier;
	}
	
		
	public String getQualifier() 
	{
		return qualifier;
	}
		
		
	public void setType(final ValueRangeType type)
	{
		this.type = type;
	}
	
		
	public ValueRangeType getType() 
	{
		return type;
	}
		
	
}