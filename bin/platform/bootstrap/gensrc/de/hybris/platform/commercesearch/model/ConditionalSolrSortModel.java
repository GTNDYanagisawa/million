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
package de.hybris.platform.commercesearch.model;

import de.hybris.platform.commercesearch.model.AbstractSolrSortConditionModel;
import de.hybris.platform.commerceservices.model.solrsearch.config.SolrSortModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexedTypeModel;
import java.util.List;

/**
 * Generated model class for type ConditionalSolrSort first defined at extension commercesearch.
 */
@SuppressWarnings("all")
public class ConditionalSolrSortModel extends SolrSortModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ConditionalSolrSort";
	
	/** <i>Generated constant</i> - Attribute key of <code>ConditionalSolrSort.conditions</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String CONDITIONS = "conditions";
	
	
	/** <i>Generated variable</i> - Variable of <code>ConditionalSolrSort.conditions</code> attribute defined at extension <code>commercesearch</code>. */
	private List<AbstractSolrSortConditionModel> _conditions;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ConditionalSolrSortModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ConditionalSolrSortModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>SolrSort</code> at extension <code>commerceservices</code>
	 * @param _indexedType initial attribute declared by type <code>SolrSort</code> at extension <code>commerceservices</code>
	 */
	@Deprecated
	public ConditionalSolrSortModel(final String _code, final SolrIndexedTypeModel _indexedType)
	{
		super();
		setCode(_code);
		setIndexedType(_indexedType);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>SolrSort</code> at extension <code>commerceservices</code>
	 * @param _indexedType initial attribute declared by type <code>SolrSort</code> at extension <code>commerceservices</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public ConditionalSolrSortModel(final String _code, final SolrIndexedTypeModel _indexedType, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setIndexedType(_indexedType);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConditionalSolrSort.conditions</code> attribute defined at extension <code>commercesearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the conditions
	 */
	public List<AbstractSolrSortConditionModel> getConditions()
	{
		if (this._conditions!=null)
		{
			return _conditions;
		}
		return _conditions = getPersistenceContext().getValue(CONDITIONS, _conditions);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ConditionalSolrSort.conditions</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the conditions
	 */
	public void setConditions(final List<AbstractSolrSortConditionModel> value)
	{
		_conditions = getPersistenceContext().setValue(CONDITIONS, value);
	}
	
}
