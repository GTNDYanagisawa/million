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

import de.hybris.platform.commercesearch.enums.FacetVisibilityRuleCondition;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexedPropertyModel;

/**
 * Generated model class for type AbstractSolrFacetVisibilityRule first defined at extension commercesearch.
 */
@SuppressWarnings("all")
public class AbstractSolrFacetVisibilityRuleModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "AbstractSolrFacetVisibilityRule";
	
	/**<i>Generated relation code constant for relation <code>SolrIndexedProperty2FacetVisibilityRules</code> defining source attribute <code>facet</code> in extension <code>commercesearch</code>.</i>*/
	public final static String _SOLRINDEXEDPROPERTY2FACETVISIBILITYRULES = "SolrIndexedProperty2FacetVisibilityRules";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractSolrFacetVisibilityRule.code</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractSolrFacetVisibilityRule.name</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractSolrFacetVisibilityRule.condition</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String CONDITION = "condition";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractSolrFacetVisibilityRule.facet</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String FACET = "facet";
	
	
	/** <i>Generated variable</i> - Variable of <code>AbstractSolrFacetVisibilityRule.code</code> attribute defined at extension <code>commercesearch</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractSolrFacetVisibilityRule.name</code> attribute defined at extension <code>commercesearch</code>. */
	private String _name;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractSolrFacetVisibilityRule.condition</code> attribute defined at extension <code>commercesearch</code>. */
	private FacetVisibilityRuleCondition _condition;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractSolrFacetVisibilityRule.facet</code> attribute defined at extension <code>commercesearch</code>. */
	private SolrIndexedPropertyModel _facet;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AbstractSolrFacetVisibilityRuleModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AbstractSolrFacetVisibilityRuleModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>AbstractSolrFacetVisibilityRule</code> at extension <code>commercesearch</code>
	 * @param _facet initial attribute declared by type <code>AbstractSolrFacetVisibilityRule</code> at extension <code>commercesearch</code>
	 */
	@Deprecated
	public AbstractSolrFacetVisibilityRuleModel(final String _code, final SolrIndexedPropertyModel _facet)
	{
		super();
		setCode(_code);
		setFacet(_facet);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>AbstractSolrFacetVisibilityRule</code> at extension <code>commercesearch</code>
	 * @param _facet initial attribute declared by type <code>AbstractSolrFacetVisibilityRule</code> at extension <code>commercesearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public AbstractSolrFacetVisibilityRuleModel(final String _code, final SolrIndexedPropertyModel _facet, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setFacet(_facet);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSolrFacetVisibilityRule.code</code> attribute defined at extension <code>commercesearch</code>. 
	 * @return the code
	 */
	public String getCode()
	{
		if (this._code!=null)
		{
			return _code;
		}
		return _code = getPersistenceContext().getValue(CODE, _code);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSolrFacetVisibilityRule.condition</code> attribute defined at extension <code>commercesearch</code>. 
	 * @return the condition
	 */
	public FacetVisibilityRuleCondition getCondition()
	{
		if (this._condition!=null)
		{
			return _condition;
		}
		return _condition = getPersistenceContext().getValue(CONDITION, _condition);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSolrFacetVisibilityRule.facet</code> attribute defined at extension <code>commercesearch</code>. 
	 * @return the facet
	 */
	public SolrIndexedPropertyModel getFacet()
	{
		if (this._facet!=null)
		{
			return _facet;
		}
		return _facet = getPersistenceContext().getValue(FACET, _facet);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSolrFacetVisibilityRule.name</code> attribute defined at extension <code>commercesearch</code>. 
	 * @return the name
	 */
	public String getName()
	{
		if (this._name!=null)
		{
			return _name;
		}
		return _name = getPersistenceContext().getValue(NAME, _name);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractSolrFacetVisibilityRule.code</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractSolrFacetVisibilityRule.condition</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the condition
	 */
	public void setCondition(final FacetVisibilityRuleCondition value)
	{
		_condition = getPersistenceContext().setValue(CONDITION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractSolrFacetVisibilityRule.facet</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the facet
	 */
	public void setFacet(final SolrIndexedPropertyModel value)
	{
		_facet = getPersistenceContext().setValue(FACET, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractSolrFacetVisibilityRule.name</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the name
	 */
	public void setName(final String value)
	{
		_name = getPersistenceContext().setValue(NAME, value);
	}
	
}
