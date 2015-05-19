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

import de.hybris.platform.commerceservices.model.solrsearch.config.SolrSortModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.type.ComposedTypeModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.solrfacetsearch.model.config.SolrFacetSearchConfigModel;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexedPropertyModel;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexerQueryModel;
import java.util.List;

/**
 * Generated model class for type SolrIndexedType first defined at extension solrfacetsearch.
 */
@SuppressWarnings("all")
public class SolrIndexedTypeModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SolrIndexedType";
	
	/**<i>Generated relation code constant for relation <code>SolrFacetSearchConfig2SolrIndexedType</code> defining source attribute <code>solrFacetSearchConfig</code> in extension <code>solrfacetsearch</code>.</i>*/
	public final static String _SOLRFACETSEARCHCONFIG2SOLRINDEXEDTYPE = "SolrFacetSearchConfig2SolrIndexedType";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedType.identifier</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String IDENTIFIER = "identifier";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedType.type</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String TYPE = "type";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedType.variant</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String VARIANT = "variant";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedType.identityProvider</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String IDENTITYPROVIDER = "identityProvider";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedType.modelLoader</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String MODELLOADER = "modelLoader";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedType.valuesProvider</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String VALUESPROVIDER = "valuesProvider";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedType.indexName</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String INDEXNAME = "indexName";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedType.solrResultConverter</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String SOLRRESULTCONVERTER = "solrResultConverter";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedType.solrIndexerQueries</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String SOLRINDEXERQUERIES = "solrIndexerQueries";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedType.solrIndexedProperties</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String SOLRINDEXEDPROPERTIES = "solrIndexedProperties";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedType.solrFacetSearchConfig</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String SOLRFACETSEARCHCONFIG = "solrFacetSearchConfig";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedType.sorts</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String SORTS = "sorts";
	
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.identifier</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _identifier;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.type</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private ComposedTypeModel _type;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.variant</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Boolean _variant;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.identityProvider</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _identityProvider;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.modelLoader</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _modelLoader;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.valuesProvider</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _valuesProvider;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.indexName</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _indexName;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.solrResultConverter</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _solrResultConverter;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.solrIndexerQueries</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private List<SolrIndexerQueryModel> _solrIndexerQueries;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.solrIndexedProperties</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private List<SolrIndexedPropertyModel> _solrIndexedProperties;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.solrFacetSearchConfig</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private SolrFacetSearchConfigModel _solrFacetSearchConfig;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.sorts</code> attribute defined at extension <code>commerceservices</code>. */
	private List<SolrSortModel> _sorts;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SolrIndexedTypeModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SolrIndexedTypeModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _identifier initial attribute declared by type <code>SolrIndexedType</code> at extension <code>solrfacetsearch</code>
	 * @param _type initial attribute declared by type <code>SolrIndexedType</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrIndexedTypeModel(final String _identifier, final ComposedTypeModel _type)
	{
		super();
		setIdentifier(_identifier);
		setType(_type);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _identifier initial attribute declared by type <code>SolrIndexedType</code> at extension <code>solrfacetsearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _type initial attribute declared by type <code>SolrIndexedType</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrIndexedTypeModel(final String _identifier, final ItemModel _owner, final ComposedTypeModel _type)
	{
		super();
		setIdentifier(_identifier);
		setOwner(_owner);
		setType(_type);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedType.identifier</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the identifier - name of the Indexed Type
	 */
	public String getIdentifier()
	{
		if (this._identifier!=null)
		{
			return _identifier;
		}
		return _identifier = getPersistenceContext().getValue(IDENTIFIER, _identifier);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedType.identityProvider</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the identityProvider
	 */
	public String getIdentityProvider()
	{
		if (this._identityProvider!=null)
		{
			return _identityProvider;
		}
		return _identityProvider = getPersistenceContext().getValue(IDENTITYPROVIDER, _identityProvider);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedType.indexName</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the indexName
	 */
	public String getIndexName()
	{
		if (this._indexName!=null)
		{
			return _indexName;
		}
		return _indexName = getPersistenceContext().getValue(INDEXNAME, _indexName);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedType.modelLoader</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the modelLoader
	 */
	public String getModelLoader()
	{
		if (this._modelLoader!=null)
		{
			return _modelLoader;
		}
		return _modelLoader = getPersistenceContext().getValue(MODELLOADER, _modelLoader);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedType.solrFacetSearchConfig</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the solrFacetSearchConfig
	 */
	public SolrFacetSearchConfigModel getSolrFacetSearchConfig()
	{
		if (this._solrFacetSearchConfig!=null)
		{
			return _solrFacetSearchConfig;
		}
		return _solrFacetSearchConfig = getPersistenceContext().getValue(SOLRFACETSEARCHCONFIG, _solrFacetSearchConfig);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedType.solrIndexedProperties</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the solrIndexedProperties
	 */
	public List<SolrIndexedPropertyModel> getSolrIndexedProperties()
	{
		if (this._solrIndexedProperties!=null)
		{
			return _solrIndexedProperties;
		}
		return _solrIndexedProperties = getPersistenceContext().getValue(SOLRINDEXEDPROPERTIES, _solrIndexedProperties);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedType.solrIndexerQueries</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the solrIndexerQueries
	 */
	public List<SolrIndexerQueryModel> getSolrIndexerQueries()
	{
		if (this._solrIndexerQueries!=null)
		{
			return _solrIndexerQueries;
		}
		return _solrIndexerQueries = getPersistenceContext().getValue(SOLRINDEXERQUERIES, _solrIndexerQueries);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedType.solrResultConverter</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the solrResultConverter
	 */
	public String getSolrResultConverter()
	{
		if (this._solrResultConverter!=null)
		{
			return _solrResultConverter;
		}
		return _solrResultConverter = getPersistenceContext().getValue(SOLRRESULTCONVERTER, _solrResultConverter);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedType.sorts</code> attribute defined at extension <code>commerceservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the sorts
	 */
	public List<SolrSortModel> getSorts()
	{
		if (this._sorts!=null)
		{
			return _sorts;
		}
		return _sorts = getPersistenceContext().getValue(SORTS, _sorts);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedType.type</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the type - enclosing type of the Indexed Type
	 */
	public ComposedTypeModel getType()
	{
		if (this._type!=null)
		{
			return _type;
		}
		return _type = getPersistenceContext().getValue(TYPE, _type);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedType.valuesProvider</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the valuesProvider
	 */
	public String getValuesProvider()
	{
		if (this._valuesProvider!=null)
		{
			return _valuesProvider;
		}
		return _valuesProvider = getPersistenceContext().getValue(VALUESPROVIDER, _valuesProvider);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedType.variant</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the variant
	 */
	public boolean isVariant()
	{
		return toPrimitive( _variant = getPersistenceContext().getValue(VARIANT, _variant));
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>SolrIndexedType.identifier</code> attribute defined at extension <code>solrfacetsearch</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the identifier - name of the Indexed Type
	 */
	public void setIdentifier(final String value)
	{
		_identifier = getPersistenceContext().setValue(IDENTIFIER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedType.identityProvider</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the identityProvider
	 */
	public void setIdentityProvider(final String value)
	{
		_identityProvider = getPersistenceContext().setValue(IDENTITYPROVIDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedType.indexName</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the indexName
	 */
	public void setIndexName(final String value)
	{
		_indexName = getPersistenceContext().setValue(INDEXNAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedType.modelLoader</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the modelLoader
	 */
	public void setModelLoader(final String value)
	{
		_modelLoader = getPersistenceContext().setValue(MODELLOADER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedType.solrFacetSearchConfig</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the solrFacetSearchConfig
	 */
	public void setSolrFacetSearchConfig(final SolrFacetSearchConfigModel value)
	{
		_solrFacetSearchConfig = getPersistenceContext().setValue(SOLRFACETSEARCHCONFIG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedType.solrIndexedProperties</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the solrIndexedProperties
	 */
	public void setSolrIndexedProperties(final List<SolrIndexedPropertyModel> value)
	{
		_solrIndexedProperties = getPersistenceContext().setValue(SOLRINDEXEDPROPERTIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedType.solrIndexerQueries</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the solrIndexerQueries
	 */
	public void setSolrIndexerQueries(final List<SolrIndexerQueryModel> value)
	{
		_solrIndexerQueries = getPersistenceContext().setValue(SOLRINDEXERQUERIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedType.solrResultConverter</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the solrResultConverter
	 */
	public void setSolrResultConverter(final String value)
	{
		_solrResultConverter = getPersistenceContext().setValue(SOLRRESULTCONVERTER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedType.sorts</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the sorts
	 */
	public void setSorts(final List<SolrSortModel> value)
	{
		_sorts = getPersistenceContext().setValue(SORTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedType.type</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the type - enclosing type of the Indexed Type
	 */
	public void setType(final ComposedTypeModel value)
	{
		_type = getPersistenceContext().setValue(TYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedType.valuesProvider</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the valuesProvider
	 */
	public void setValuesProvider(final String value)
	{
		_valuesProvider = getPersistenceContext().setValue(VALUESPROVIDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedType.variant</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the variant
	 */
	public void setVariant(final boolean value)
	{
		_variant = getPersistenceContext().setValue(VARIANT, toObject(value));
	}
	
}
