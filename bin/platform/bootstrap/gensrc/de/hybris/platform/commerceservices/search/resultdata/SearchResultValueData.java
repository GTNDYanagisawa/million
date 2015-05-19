/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 2015/05/18 13:25:58
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
package de.hybris.platform.commerceservices.search.resultdata;

import de.hybris.platform.catalog.model.classification.ClassAttributeAssignmentModel;
import java.util.Map;

public class SearchResultValueData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>SearchResultValueData.values</code> property defined at extension <code>commerceservices</code>. */
	private Map<String, Object> values;
	/** <i>Generated property</i> for <code>SearchResultValueData.featureValues</code> property defined at extension <code>commerceservices</code>. */
	private Map<ClassAttributeAssignmentModel, Object> featureValues;
		
	public SearchResultValueData()
	{
		// default constructor
	}
	
		
	public void setValues(final Map<String, Object> values)
	{
		this.values = values;
	}
	
		
	public Map<String, Object> getValues() 
	{
		return values;
	}
		
		
	public void setFeatureValues(final Map<ClassAttributeAssignmentModel, Object> featureValues)
	{
		this.featureValues = featureValues;
	}
	
		
	public Map<ClassAttributeAssignmentModel, Object> getFeatureValues() 
	{
		return featureValues;
	}
		
	
}