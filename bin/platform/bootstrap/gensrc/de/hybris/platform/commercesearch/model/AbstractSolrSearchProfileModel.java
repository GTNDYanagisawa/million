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

import de.hybris.platform.commercesearch.model.SolrBoostRuleModel;
import de.hybris.platform.commercesearch.model.SolrFacetReconfigurationModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexedTypeModel;
import java.util.Collection;

/**
 * Generated model class for type AbstractSolrSearchProfile first defined at extension commercesearch.
 */
@SuppressWarnings("all")
public class AbstractSolrSearchProfileModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "AbstractSolrSearchProfile";
	
	/**<i>Generated relation code constant for relation <code>SolrFacetReconfiguration2SolrSearchProfile</code> defining source attribute <code>solrFacetReconfigurations</code> in extension <code>commercesearch</code>.</i>*/
	public final static String _SOLRFACETRECONFIGURATION2SOLRSEARCHPROFILE = "SolrFacetReconfiguration2SolrSearchProfile";
	
	/**<i>Generated relation code constant for relation <code>SolrBoostRule2SolrSearchProfile</code> defining source attribute <code>boostRules</code> in extension <code>commercesearch</code>.</i>*/
	public final static String _SOLRBOOSTRULE2SOLRSEARCHPROFILE = "SolrBoostRule2SolrSearchProfile";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractSolrSearchProfile.code</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractSolrSearchProfile.indexedType</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String INDEXEDTYPE = "indexedType";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractSolrSearchProfile.description</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String DESCRIPTION = "description";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractSolrSearchProfile.solrFacetReconfigurations</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String SOLRFACETRECONFIGURATIONS = "solrFacetReconfigurations";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractSolrSearchProfile.boostRules</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String BOOSTRULES = "boostRules";
	
	
	/** <i>Generated variable</i> - Variable of <code>AbstractSolrSearchProfile.code</code> attribute defined at extension <code>commercesearch</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractSolrSearchProfile.indexedType</code> attribute defined at extension <code>commercesearch</code>. */
	private SolrIndexedTypeModel _indexedType;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractSolrSearchProfile.description</code> attribute defined at extension <code>commercesearch</code>. */
	private String _description;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractSolrSearchProfile.solrFacetReconfigurations</code> attribute defined at extension <code>commercesearch</code>. */
	private Collection<SolrFacetReconfigurationModel> _solrFacetReconfigurations;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractSolrSearchProfile.boostRules</code> attribute defined at extension <code>commercesearch</code>. */
	private Collection<SolrBoostRuleModel> _boostRules;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AbstractSolrSearchProfileModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AbstractSolrSearchProfileModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>AbstractSolrSearchProfile</code> at extension <code>commercesearch</code>
	 * @param _indexedType initial attribute declared by type <code>AbstractSolrSearchProfile</code> at extension <code>commercesearch</code>
	 */
	@Deprecated
	public AbstractSolrSearchProfileModel(final String _code, final SolrIndexedTypeModel _indexedType)
	{
		super();
		setCode(_code);
		setIndexedType(_indexedType);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>AbstractSolrSearchProfile</code> at extension <code>commercesearch</code>
	 * @param _indexedType initial attribute declared by type <code>AbstractSolrSearchProfile</code> at extension <code>commercesearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public AbstractSolrSearchProfileModel(final String _code, final SolrIndexedTypeModel _indexedType, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setIndexedType(_indexedType);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSolrSearchProfile.boostRules</code> attribute defined at extension <code>commercesearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the boostRules
	 */
	public Collection<SolrBoostRuleModel> getBoostRules()
	{
		if (this._boostRules!=null)
		{
			return _boostRules;
		}
		return _boostRules = getPersistenceContext().getValue(BOOSTRULES, _boostRules);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSolrSearchProfile.code</code> attribute defined at extension <code>commercesearch</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>AbstractSolrSearchProfile.description</code> dynamic attribute defined at extension <code>commercesearch</code>. 
	 * @return the description
	 */
	public String getDescription()
	{
		return getPersistenceContext().getDynamicValue(this,DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSolrSearchProfile.indexedType</code> attribute defined at extension <code>commercesearch</code>. 
	 * @return the indexedType
	 */
	public SolrIndexedTypeModel getIndexedType()
	{
		if (this._indexedType!=null)
		{
			return _indexedType;
		}
		return _indexedType = getPersistenceContext().getValue(INDEXEDTYPE, _indexedType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSolrSearchProfile.solrFacetReconfigurations</code> attribute defined at extension <code>commercesearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the solrFacetReconfigurations
	 */
	public Collection<SolrFacetReconfigurationModel> getSolrFacetReconfigurations()
	{
		if (this._solrFacetReconfigurations!=null)
		{
			return _solrFacetReconfigurations;
		}
		return _solrFacetReconfigurations = getPersistenceContext().getValue(SOLRFACETRECONFIGURATIONS, _solrFacetReconfigurations);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractSolrSearchProfile.boostRules</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the boostRules
	 */
	public void setBoostRules(final Collection<SolrBoostRuleModel> value)
	{
		_boostRules = getPersistenceContext().setValue(BOOSTRULES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractSolrSearchProfile.code</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractSolrSearchProfile.indexedType</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the indexedType
	 */
	public void setIndexedType(final SolrIndexedTypeModel value)
	{
		_indexedType = getPersistenceContext().setValue(INDEXEDTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractSolrSearchProfile.solrFacetReconfigurations</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the solrFacetReconfigurations
	 */
	public void setSolrFacetReconfigurations(final Collection<SolrFacetReconfigurationModel> value)
	{
		_solrFacetReconfigurations = getPersistenceContext().setValue(SOLRFACETRECONFIGURATIONS, value);
	}
	
}
