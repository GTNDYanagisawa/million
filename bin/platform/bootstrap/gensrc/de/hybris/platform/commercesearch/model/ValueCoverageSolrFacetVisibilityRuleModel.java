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

import de.hybris.platform.commercesearch.model.AbstractSolrFacetVisibilityRuleModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexedPropertyModel;

/**
 * Generated model class for type ValueCoverageSolrFacetVisibilityRule first defined at extension commercesearch.
 */
@SuppressWarnings("all")
public class ValueCoverageSolrFacetVisibilityRuleModel extends AbstractSolrFacetVisibilityRuleModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ValueCoverageSolrFacetVisibilityRule";
	
	/** <i>Generated constant</i> - Attribute key of <code>ValueCoverageSolrFacetVisibilityRule.coveragePercentage</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String COVERAGEPERCENTAGE = "coveragePercentage";
	
	
	/** <i>Generated variable</i> - Variable of <code>ValueCoverageSolrFacetVisibilityRule.coveragePercentage</code> attribute defined at extension <code>commercesearch</code>. */
	private Integer _coveragePercentage;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ValueCoverageSolrFacetVisibilityRuleModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ValueCoverageSolrFacetVisibilityRuleModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>AbstractSolrFacetVisibilityRule</code> at extension <code>commercesearch</code>
	 * @param _coveragePercentage initial attribute declared by type <code>ValueCoverageSolrFacetVisibilityRule</code> at extension <code>commercesearch</code>
	 * @param _facet initial attribute declared by type <code>AbstractSolrFacetVisibilityRule</code> at extension <code>commercesearch</code>
	 */
	@Deprecated
	public ValueCoverageSolrFacetVisibilityRuleModel(final String _code, final Integer _coveragePercentage, final SolrIndexedPropertyModel _facet)
	{
		super();
		setCode(_code);
		setCoveragePercentage(_coveragePercentage);
		setFacet(_facet);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>AbstractSolrFacetVisibilityRule</code> at extension <code>commercesearch</code>
	 * @param _coveragePercentage initial attribute declared by type <code>ValueCoverageSolrFacetVisibilityRule</code> at extension <code>commercesearch</code>
	 * @param _facet initial attribute declared by type <code>AbstractSolrFacetVisibilityRule</code> at extension <code>commercesearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public ValueCoverageSolrFacetVisibilityRuleModel(final String _code, final Integer _coveragePercentage, final SolrIndexedPropertyModel _facet, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setCoveragePercentage(_coveragePercentage);
		setFacet(_facet);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ValueCoverageSolrFacetVisibilityRule.coveragePercentage</code> attribute defined at extension <code>commercesearch</code>. 
	 * @return the coveragePercentage
	 */
	public Integer getCoveragePercentage()
	{
		if (this._coveragePercentage!=null)
		{
			return _coveragePercentage;
		}
		return _coveragePercentage = getPersistenceContext().getValue(COVERAGEPERCENTAGE, _coveragePercentage);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ValueCoverageSolrFacetVisibilityRule.coveragePercentage</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the coveragePercentage
	 */
	public void setCoveragePercentage(final Integer value)
	{
		_coveragePercentage = getPersistenceContext().setValue(COVERAGEPERCENTAGE, value);
	}
	
}
