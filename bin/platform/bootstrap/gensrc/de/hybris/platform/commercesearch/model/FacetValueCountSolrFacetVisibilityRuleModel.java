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

import de.hybris.platform.commercesearch.enums.FacetSelectedState;
import de.hybris.platform.commercesearch.enums.FacetValueCountOperator;
import de.hybris.platform.commercesearch.model.AbstractSolrFacetVisibilityRuleModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexedPropertyModel;
import java.util.Set;

/**
 * Generated model class for type FacetValueCountSolrFacetVisibilityRule first defined at extension commercesearch.
 */
@SuppressWarnings("all")
public class FacetValueCountSolrFacetVisibilityRuleModel extends AbstractSolrFacetVisibilityRuleModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "FacetValueCountSolrFacetVisibilityRule";
	
	/** <i>Generated constant</i> - Attribute key of <code>FacetValueCountSolrFacetVisibilityRule.operator</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String OPERATOR = "operator";
	
	/** <i>Generated constant</i> - Attribute key of <code>FacetValueCountSolrFacetVisibilityRule.count</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String COUNT = "count";
	
	/** <i>Generated constant</i> - Attribute key of <code>FacetValueCountSolrFacetVisibilityRule.selectedStates</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String SELECTEDSTATES = "selectedStates";
	
	
	/** <i>Generated variable</i> - Variable of <code>FacetValueCountSolrFacetVisibilityRule.operator</code> attribute defined at extension <code>commercesearch</code>. */
	private FacetValueCountOperator _operator;
	
	/** <i>Generated variable</i> - Variable of <code>FacetValueCountSolrFacetVisibilityRule.count</code> attribute defined at extension <code>commercesearch</code>. */
	private Integer _count;
	
	/** <i>Generated variable</i> - Variable of <code>FacetValueCountSolrFacetVisibilityRule.selectedStates</code> attribute defined at extension <code>commercesearch</code>. */
	private Set<FacetSelectedState> _selectedStates;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public FacetValueCountSolrFacetVisibilityRuleModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public FacetValueCountSolrFacetVisibilityRuleModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>AbstractSolrFacetVisibilityRule</code> at extension <code>commercesearch</code>
	 * @param _count initial attribute declared by type <code>FacetValueCountSolrFacetVisibilityRule</code> at extension <code>commercesearch</code>
	 * @param _facet initial attribute declared by type <code>AbstractSolrFacetVisibilityRule</code> at extension <code>commercesearch</code>
	 */
	@Deprecated
	public FacetValueCountSolrFacetVisibilityRuleModel(final String _code, final Integer _count, final SolrIndexedPropertyModel _facet)
	{
		super();
		setCode(_code);
		setCount(_count);
		setFacet(_facet);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>AbstractSolrFacetVisibilityRule</code> at extension <code>commercesearch</code>
	 * @param _count initial attribute declared by type <code>FacetValueCountSolrFacetVisibilityRule</code> at extension <code>commercesearch</code>
	 * @param _facet initial attribute declared by type <code>AbstractSolrFacetVisibilityRule</code> at extension <code>commercesearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public FacetValueCountSolrFacetVisibilityRuleModel(final String _code, final Integer _count, final SolrIndexedPropertyModel _facet, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setCount(_count);
		setFacet(_facet);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FacetValueCountSolrFacetVisibilityRule.count</code> attribute defined at extension <code>commercesearch</code>. 
	 * @return the count
	 */
	public Integer getCount()
	{
		if (this._count!=null)
		{
			return _count;
		}
		return _count = getPersistenceContext().getValue(COUNT, _count);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FacetValueCountSolrFacetVisibilityRule.operator</code> attribute defined at extension <code>commercesearch</code>. 
	 * @return the operator
	 */
	public FacetValueCountOperator getOperator()
	{
		if (this._operator!=null)
		{
			return _operator;
		}
		return _operator = getPersistenceContext().getValue(OPERATOR, _operator);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FacetValueCountSolrFacetVisibilityRule.selectedStates</code> attribute defined at extension <code>commercesearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the selectedStates
	 */
	public Set<FacetSelectedState> getSelectedStates()
	{
		if (this._selectedStates!=null)
		{
			return _selectedStates;
		}
		return _selectedStates = getPersistenceContext().getValue(SELECTEDSTATES, _selectedStates);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>FacetValueCountSolrFacetVisibilityRule.count</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the count
	 */
	public void setCount(final Integer value)
	{
		_count = getPersistenceContext().setValue(COUNT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>FacetValueCountSolrFacetVisibilityRule.operator</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the operator
	 */
	public void setOperator(final FacetValueCountOperator value)
	{
		_operator = getPersistenceContext().setValue(OPERATOR, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>FacetValueCountSolrFacetVisibilityRule.selectedStates</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the selectedStates
	 */
	public void setSelectedStates(final Set<FacetSelectedState> value)
	{
		_selectedStates = getPersistenceContext().setValue(SELECTEDSTATES, value);
	}
	
}
