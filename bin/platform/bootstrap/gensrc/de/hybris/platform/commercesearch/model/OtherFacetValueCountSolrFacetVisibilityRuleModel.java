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

import de.hybris.platform.commercesearch.model.FacetValueCountSolrFacetVisibilityRuleModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexedPropertyModel;

/**
 * Generated model class for type OtherFacetValueCountSolrFacetVisibilityRule first defined at extension commercesearch.
 */
@SuppressWarnings("all")
public class OtherFacetValueCountSolrFacetVisibilityRuleModel extends FacetValueCountSolrFacetVisibilityRuleModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "OtherFacetValueCountSolrFacetVisibilityRule";
	
	/** <i>Generated constant</i> - Attribute key of <code>OtherFacetValueCountSolrFacetVisibilityRule.otherFacet</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String OTHERFACET = "otherFacet";
	
	
	/** <i>Generated variable</i> - Variable of <code>OtherFacetValueCountSolrFacetVisibilityRule.otherFacet</code> attribute defined at extension <code>commercesearch</code>. */
	private SolrIndexedPropertyModel _otherFacet;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public OtherFacetValueCountSolrFacetVisibilityRuleModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public OtherFacetValueCountSolrFacetVisibilityRuleModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>AbstractSolrFacetVisibilityRule</code> at extension <code>commercesearch</code>
	 * @param _count initial attribute declared by type <code>FacetValueCountSolrFacetVisibilityRule</code> at extension <code>commercesearch</code>
	 * @param _facet initial attribute declared by type <code>AbstractSolrFacetVisibilityRule</code> at extension <code>commercesearch</code>
	 * @param _otherFacet initial attribute declared by type <code>OtherFacetValueCountSolrFacetVisibilityRule</code> at extension <code>commercesearch</code>
	 */
	@Deprecated
	public OtherFacetValueCountSolrFacetVisibilityRuleModel(final String _code, final Integer _count, final SolrIndexedPropertyModel _facet, final SolrIndexedPropertyModel _otherFacet)
	{
		super();
		setCode(_code);
		setCount(_count);
		setFacet(_facet);
		setOtherFacet(_otherFacet);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>AbstractSolrFacetVisibilityRule</code> at extension <code>commercesearch</code>
	 * @param _count initial attribute declared by type <code>FacetValueCountSolrFacetVisibilityRule</code> at extension <code>commercesearch</code>
	 * @param _facet initial attribute declared by type <code>AbstractSolrFacetVisibilityRule</code> at extension <code>commercesearch</code>
	 * @param _otherFacet initial attribute declared by type <code>OtherFacetValueCountSolrFacetVisibilityRule</code> at extension <code>commercesearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public OtherFacetValueCountSolrFacetVisibilityRuleModel(final String _code, final Integer _count, final SolrIndexedPropertyModel _facet, final SolrIndexedPropertyModel _otherFacet, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setCount(_count);
		setFacet(_facet);
		setOtherFacet(_otherFacet);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherFacetValueCountSolrFacetVisibilityRule.otherFacet</code> attribute defined at extension <code>commercesearch</code>. 
	 * @return the otherFacet
	 */
	public SolrIndexedPropertyModel getOtherFacet()
	{
		if (this._otherFacet!=null)
		{
			return _otherFacet;
		}
		return _otherFacet = getPersistenceContext().getValue(OTHERFACET, _otherFacet);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OtherFacetValueCountSolrFacetVisibilityRule.otherFacet</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the otherFacet
	 */
	public void setOtherFacet(final SolrIndexedPropertyModel value)
	{
		_otherFacet = getPersistenceContext().setValue(OTHERFACET, value);
	}
	
}
