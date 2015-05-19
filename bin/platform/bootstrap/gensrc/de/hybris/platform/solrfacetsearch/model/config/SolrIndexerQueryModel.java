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
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.solrfacetsearch.enums.IndexerOperationValues;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexedTypeModel;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexerQueryParameterModel;
import java.util.List;

/**
 * Generated model class for type SolrIndexerQuery first defined at extension solrfacetsearch.
 */
@SuppressWarnings("all")
public class SolrIndexerQueryModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SolrIndexerQuery";
	
	/**<i>Generated relation code constant for relation <code>SolrIndexedType2SolrIndexerQuery</code> defining source attribute <code>solrIndexedType</code> in extension <code>solrfacetsearch</code>.</i>*/
	public final static String _SOLRINDEXEDTYPE2SOLRINDEXERQUERY = "SolrIndexedType2SolrIndexerQuery";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexerQuery.identifier</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String IDENTIFIER = "identifier";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexerQuery.type</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String TYPE = "type";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexerQuery.query</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String QUERY = "query";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexerQuery.injectLastIndexTime</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String INJECTLASTINDEXTIME = "injectLastIndexTime";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexerQuery.injectCurrentTime</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String INJECTCURRENTTIME = "injectCurrentTime";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexerQuery.injectCurrentDate</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String INJECTCURRENTDATE = "injectCurrentDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexerQuery.user</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String USER = "user";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexerQuery.parameterProvider</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String PARAMETERPROVIDER = "parameterProvider";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexerQuery.solrIndexedType</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String SOLRINDEXEDTYPE = "solrIndexedType";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexerQuery.solrIndexerQueryParameters</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String SOLRINDEXERQUERYPARAMETERS = "solrIndexerQueryParameters";
	
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexerQuery.identifier</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _identifier;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexerQuery.type</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private IndexerOperationValues _type;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexerQuery.query</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _query;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexerQuery.injectLastIndexTime</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Boolean _injectLastIndexTime;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexerQuery.injectCurrentTime</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Boolean _injectCurrentTime;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexerQuery.injectCurrentDate</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Boolean _injectCurrentDate;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexerQuery.user</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private UserModel _user;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexerQuery.parameterProvider</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _parameterProvider;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexerQuery.solrIndexedType</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private SolrIndexedTypeModel _solrIndexedType;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexerQuery.solrIndexerQueryParameters</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private List<SolrIndexerQueryParameterModel> _solrIndexerQueryParameters;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SolrIndexerQueryModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SolrIndexerQueryModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _identifier initial attribute declared by type <code>SolrIndexerQuery</code> at extension <code>solrfacetsearch</code>
	 * @param _query initial attribute declared by type <code>SolrIndexerQuery</code> at extension <code>solrfacetsearch</code>
	 * @param _type initial attribute declared by type <code>SolrIndexerQuery</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrIndexerQueryModel(final String _identifier, final String _query, final IndexerOperationValues _type)
	{
		super();
		setIdentifier(_identifier);
		setQuery(_query);
		setType(_type);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _identifier initial attribute declared by type <code>SolrIndexerQuery</code> at extension <code>solrfacetsearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _query initial attribute declared by type <code>SolrIndexerQuery</code> at extension <code>solrfacetsearch</code>
	 * @param _type initial attribute declared by type <code>SolrIndexerQuery</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrIndexerQueryModel(final String _identifier, final ItemModel _owner, final String _query, final IndexerOperationValues _type)
	{
		super();
		setIdentifier(_identifier);
		setOwner(_owner);
		setQuery(_query);
		setType(_type);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexerQuery.identifier</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the identifier - id of the query
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
	 * <i>Generated method</i> - Getter of the <code>SolrIndexerQuery.parameterProvider</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the parameterProvider
	 */
	public String getParameterProvider()
	{
		if (this._parameterProvider!=null)
		{
			return _parameterProvider;
		}
		return _parameterProvider = getPersistenceContext().getValue(PARAMETERPROVIDER, _parameterProvider);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexerQuery.query</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the query
	 */
	public String getQuery()
	{
		if (this._query!=null)
		{
			return _query;
		}
		return _query = getPersistenceContext().getValue(QUERY, _query);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexerQuery.solrIndexedType</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the solrIndexedType
	 */
	public SolrIndexedTypeModel getSolrIndexedType()
	{
		if (this._solrIndexedType!=null)
		{
			return _solrIndexedType;
		}
		return _solrIndexedType = getPersistenceContext().getValue(SOLRINDEXEDTYPE, _solrIndexedType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexerQuery.solrIndexerQueryParameters</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the solrIndexerQueryParameters
	 */
	public List<SolrIndexerQueryParameterModel> getSolrIndexerQueryParameters()
	{
		if (this._solrIndexerQueryParameters!=null)
		{
			return _solrIndexerQueryParameters;
		}
		return _solrIndexerQueryParameters = getPersistenceContext().getValue(SOLRINDEXERQUERYPARAMETERS, _solrIndexerQueryParameters);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexerQuery.type</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the type - type of operation: full, update or delete
	 */
	public IndexerOperationValues getType()
	{
		if (this._type!=null)
		{
			return _type;
		}
		return _type = getPersistenceContext().getValue(TYPE, _type);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexerQuery.user</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the user
	 */
	public UserModel getUser()
	{
		if (this._user!=null)
		{
			return _user;
		}
		return _user = getPersistenceContext().getValue(USER, _user);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexerQuery.injectCurrentDate</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the injectCurrentDate
	 */
	public boolean isInjectCurrentDate()
	{
		return toPrimitive( _injectCurrentDate = getPersistenceContext().getValue(INJECTCURRENTDATE, _injectCurrentDate));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexerQuery.injectCurrentTime</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the injectCurrentTime
	 */
	public boolean isInjectCurrentTime()
	{
		return toPrimitive( _injectCurrentTime = getPersistenceContext().getValue(INJECTCURRENTTIME, _injectCurrentTime));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexerQuery.injectLastIndexTime</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the injectLastIndexTime
	 */
	public boolean isInjectLastIndexTime()
	{
		return toPrimitive( _injectLastIndexTime = getPersistenceContext().getValue(INJECTLASTINDEXTIME, _injectLastIndexTime));
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>SolrIndexerQuery.identifier</code> attribute defined at extension <code>solrfacetsearch</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the identifier - id of the query
	 */
	public void setIdentifier(final String value)
	{
		_identifier = getPersistenceContext().setValue(IDENTIFIER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexerQuery.injectCurrentDate</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the injectCurrentDate
	 */
	public void setInjectCurrentDate(final boolean value)
	{
		_injectCurrentDate = getPersistenceContext().setValue(INJECTCURRENTDATE, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexerQuery.injectCurrentTime</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the injectCurrentTime
	 */
	public void setInjectCurrentTime(final boolean value)
	{
		_injectCurrentTime = getPersistenceContext().setValue(INJECTCURRENTTIME, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexerQuery.injectLastIndexTime</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the injectLastIndexTime
	 */
	public void setInjectLastIndexTime(final boolean value)
	{
		_injectLastIndexTime = getPersistenceContext().setValue(INJECTLASTINDEXTIME, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexerQuery.parameterProvider</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the parameterProvider
	 */
	public void setParameterProvider(final String value)
	{
		_parameterProvider = getPersistenceContext().setValue(PARAMETERPROVIDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexerQuery.query</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the query
	 */
	public void setQuery(final String value)
	{
		_query = getPersistenceContext().setValue(QUERY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexerQuery.solrIndexedType</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the solrIndexedType
	 */
	public void setSolrIndexedType(final SolrIndexedTypeModel value)
	{
		_solrIndexedType = getPersistenceContext().setValue(SOLRINDEXEDTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexerQuery.solrIndexerQueryParameters</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the solrIndexerQueryParameters
	 */
	public void setSolrIndexerQueryParameters(final List<SolrIndexerQueryParameterModel> value)
	{
		_solrIndexerQueryParameters = getPersistenceContext().setValue(SOLRINDEXERQUERYPARAMETERS, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>SolrIndexerQuery.type</code> attribute defined at extension <code>solrfacetsearch</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the type - type of operation: full, update or delete
	 */
	public void setType(final IndexerOperationValues value)
	{
		_type = getPersistenceContext().setValue(TYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexerQuery.user</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the user
	 */
	public void setUser(final UserModel value)
	{
		_user = getPersistenceContext().setValue(USER, value);
	}
	
}
