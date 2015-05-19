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
package de.hybris.platform.commerceservices.search.facetdata;

import de.hybris.platform.commerceservices.search.facetdata.FacetValueData;
import java.util.List;

/**
 * POJO representing a facet.
 */
public class FacetData<STATE>  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>FacetData<STATE>.multiSelect</code> property defined at extension <code>commerceservices</code>. */
	private boolean multiSelect;
	/** <i>Generated property</i> for <code>FacetData<STATE>.category</code> property defined at extension <code>commerceservices</code>. */
	private boolean category;
	/** <i>Generated property</i> for <code>FacetData<STATE>.values</code> property defined at extension <code>commerceservices</code>. */
	private List<FacetValueData<STATE>> values;
	/** <i>Generated property</i> for <code>FacetData<STATE>.visible</code> property defined at extension <code>commerceservices</code>. */
	private boolean visible;
	/** <i>Generated property</i> for <code>FacetData<STATE>.priority</code> property defined at extension <code>commerceservices</code>. */
	private int priority;
	/** <i>Generated property</i> for <code>FacetData<STATE>.name</code> property defined at extension <code>commerceservices</code>. */
	private String name;
	/** <i>Generated property</i> for <code>FacetData<STATE>.topValues</code> property defined at extension <code>commerceservices</code>. */
	private List<FacetValueData<STATE>> topValues;
	/** <i>Generated property</i> for <code>FacetData<STATE>.code</code> property defined at extension <code>commerceservices</code>. */
	private String code;
		
	public FacetData()
	{
		// default constructor
	}
	
		
	public void setMultiSelect(final boolean multiSelect)
	{
		this.multiSelect = multiSelect;
	}
	
		
	public boolean isMultiSelect() 
	{
		return multiSelect;
	}
		
		
	public void setCategory(final boolean category)
	{
		this.category = category;
	}
	
		
	public boolean isCategory() 
	{
		return category;
	}
		
		
	public void setValues(final List<FacetValueData<STATE>> values)
	{
		this.values = values;
	}
	
		
	public List<FacetValueData<STATE>> getValues() 
	{
		return values;
	}
		
		
	public void setVisible(final boolean visible)
	{
		this.visible = visible;
	}
	
		
	public boolean isVisible() 
	{
		return visible;
	}
		
		
	public void setPriority(final int priority)
	{
		this.priority = priority;
	}
	
		
	public int getPriority() 
	{
		return priority;
	}
		
		
	public void setName(final String name)
	{
		this.name = name;
	}
	
		
	public String getName() 
	{
		return name;
	}
		
		
	public void setTopValues(final List<FacetValueData<STATE>> topValues)
	{
		this.topValues = topValues;
	}
	
		
	public List<FacetValueData<STATE>> getTopValues() 
	{
		return topValues;
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