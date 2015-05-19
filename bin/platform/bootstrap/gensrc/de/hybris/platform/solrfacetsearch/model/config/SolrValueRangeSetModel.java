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
package de.hybris.platform.solrfacetsearch.model.config;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.solrfacetsearch.model.config.SolrFacetSearchConfigModel;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexedPropertyModel;
import de.hybris.platform.solrfacetsearch.model.config.SolrValueRangeModel;
import java.util.List;

/**
 * Generated model class for type SolrValueRangeSet first defined at extension solrfacetsearch.
 */
@SuppressWarnings("all")
public class SolrValueRangeSetModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SolrValueRangeSet";
	
	/**<i>Generated relation code constant for relation <code>SolrFacetSearchConfig2SolrValueRangeSetRelation</code> defining source attribute <code>facetSearchConfigs</code> in extension <code>solrfacetsearch</code>.</i>*/
	public final static String _SOLRFACETSEARCHCONFIG2SOLRVALUERANGESETRELATION = "SolrFacetSearchConfig2SolrValueRangeSetRelation";
	
	/**<i>Generated relation code constant for relation <code>SolrIndexedProperty2SolrValueRangeSetRelation</code> defining source attribute <code>indexedProperties</code> in extension <code>solrfacetsearch</code>.</i>*/
	public final static String _SOLRINDEXEDPROPERTY2SOLRVALUERANGESETRELATION = "SolrIndexedProperty2SolrValueRangeSetRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrValueRangeSet.name</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrValueRangeSet.type</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String TYPE = "type";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrValueRangeSet.qualifier</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String QUALIFIER = "qualifier";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrValueRangeSet.facetSearchConfigs</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String FACETSEARCHCONFIGS = "facetSearchConfigs";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrValueRangeSet.solrValueRanges</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String SOLRVALUERANGES = "solrValueRanges";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrValueRangeSet.indexedProperties</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String INDEXEDPROPERTIES = "indexedProperties";
	
	
	/** <i>Generated variable</i> - Variable of <code>SolrValueRangeSet.name</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _name;
	
	/** <i>Generated variable</i> - Variable of <code>SolrValueRangeSet.type</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _type;
	
	/** <i>Generated variable</i> - Variable of <code>SolrValueRangeSet.qualifier</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _qualifier;
	
	/** <i>Generated variable</i> - Variable of <code>SolrValueRangeSet.facetSearchConfigs</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private List<SolrFacetSearchConfigModel> _facetSearchConfigs;
	
	/** <i>Generated variable</i> - Variable of <code>SolrValueRangeSet.solrValueRanges</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private List<SolrValueRangeModel> _solrValueRanges;
	
	/** <i>Generated variable</i> - Variable of <code>SolrValueRangeSet.indexedProperties</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private List<SolrIndexedPropertyModel> _indexedProperties;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SolrValueRangeSetModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SolrValueRangeSetModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _name initial attribute declared by type <code>SolrValueRangeSet</code> at extension <code>solrfacetsearch</code>
	 * @param _type initial attribute declared by type <code>SolrValueRangeSet</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrValueRangeSetModel(final String _name, final String _type)
	{
		super();
		setName(_name);
		setType(_type);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _name initial attribute declared by type <code>SolrValueRangeSet</code> at extension <code>solrfacetsearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _type initial attribute declared by type <code>SolrValueRangeSet</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrValueRangeSetModel(final String _name, final ItemModel _owner, final String _type)
	{
		super();
		setName(_name);
		setOwner(_owner);
		setType(_type);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrValueRangeSet.facetSearchConfigs</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the facetSearchConfigs
	 */
	public List<SolrFacetSearchConfigModel> getFacetSearchConfigs()
	{
		if (this._facetSearchConfigs!=null)
		{
			return _facetSearchConfigs;
		}
		return _facetSearchConfigs = getPersistenceContext().getValue(FACETSEARCHCONFIGS, _facetSearchConfigs);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrValueRangeSet.indexedProperties</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the indexedProperties
	 */
	public List<SolrIndexedPropertyModel> getIndexedProperties()
	{
		if (this._indexedProperties!=null)
		{
			return _indexedProperties;
		}
		return _indexedProperties = getPersistenceContext().getValue(INDEXEDPROPERTIES, _indexedProperties);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrValueRangeSet.name</code> attribute defined at extension <code>solrfacetsearch</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>SolrValueRangeSet.qualifier</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the qualifier
	 */
	public String getQualifier()
	{
		if (this._qualifier!=null)
		{
			return _qualifier;
		}
		return _qualifier = getPersistenceContext().getValue(QUALIFIER, _qualifier);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrValueRangeSet.solrValueRanges</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the solrValueRanges
	 */
	public List<SolrValueRangeModel> getSolrValueRanges()
	{
		if (this._solrValueRanges!=null)
		{
			return _solrValueRanges;
		}
		return _solrValueRanges = getPersistenceContext().getValue(SOLRVALUERANGES, _solrValueRanges);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrValueRangeSet.type</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the type
	 */
	public String getType()
	{
		if (this._type!=null)
		{
			return _type;
		}
		return _type = getPersistenceContext().getValue(TYPE, _type);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrValueRangeSet.facetSearchConfigs</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the facetSearchConfigs
	 */
	public void setFacetSearchConfigs(final List<SolrFacetSearchConfigModel> value)
	{
		_facetSearchConfigs = getPersistenceContext().setValue(FACETSEARCHCONFIGS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrValueRangeSet.indexedProperties</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the indexedProperties
	 */
	public void setIndexedProperties(final List<SolrIndexedPropertyModel> value)
	{
		_indexedProperties = getPersistenceContext().setValue(INDEXEDPROPERTIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrValueRangeSet.name</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the name
	 */
	public void setName(final String value)
	{
		_name = getPersistenceContext().setValue(NAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrValueRangeSet.qualifier</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the qualifier
	 */
	public void setQualifier(final String value)
	{
		_qualifier = getPersistenceContext().setValue(QUALIFIER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrValueRangeSet.solrValueRanges</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the solrValueRanges
	 */
	public void setSolrValueRanges(final List<SolrValueRangeModel> value)
	{
		_solrValueRanges = getPersistenceContext().setValue(SOLRVALUERANGES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrValueRangeSet.type</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the type
	 */
	public void setType(final String value)
	{
		_type = getPersistenceContext().setValue(TYPE, value);
	}
	
}
