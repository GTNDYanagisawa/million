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
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexerQueryModel;

/**
 * Generated model class for type SolrIndexerQueryParameter first defined at extension solrfacetsearch.
 */
@SuppressWarnings("all")
public class SolrIndexerQueryParameterModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SolrIndexerQueryParameter";
	
	/**<i>Generated relation code constant for relation <code>SolrIndexerQuery2SolrIndexerQueryParameter</code> defining source attribute <code>solrIndexerQuery</code> in extension <code>solrfacetsearch</code>.</i>*/
	public final static String _SOLRINDEXERQUERY2SOLRINDEXERQUERYPARAMETER = "SolrIndexerQuery2SolrIndexerQueryParameter";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexerQueryParameter.name</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexerQueryParameter.value</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String VALUE = "value";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexerQueryParameter.solrIndexerQuery</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String SOLRINDEXERQUERY = "solrIndexerQuery";
	
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexerQueryParameter.name</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _name;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexerQueryParameter.value</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _value;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexerQueryParameter.solrIndexerQuery</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private SolrIndexerQueryModel _solrIndexerQuery;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SolrIndexerQueryParameterModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SolrIndexerQueryParameterModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _name initial attribute declared by type <code>SolrIndexerQueryParameter</code> at extension <code>solrfacetsearch</code>
	 * @param _value initial attribute declared by type <code>SolrIndexerQueryParameter</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrIndexerQueryParameterModel(final String _name, final String _value)
	{
		super();
		setName(_name);
		setValue(_value);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _name initial attribute declared by type <code>SolrIndexerQueryParameter</code> at extension <code>solrfacetsearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _value initial attribute declared by type <code>SolrIndexerQueryParameter</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrIndexerQueryParameterModel(final String _name, final ItemModel _owner, final String _value)
	{
		super();
		setName(_name);
		setOwner(_owner);
		setValue(_value);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexerQueryParameter.name</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the name - name of the parameter
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
	 * <i>Generated method</i> - Getter of the <code>SolrIndexerQueryParameter.solrIndexerQuery</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the solrIndexerQuery
	 */
	public SolrIndexerQueryModel getSolrIndexerQuery()
	{
		if (this._solrIndexerQuery!=null)
		{
			return _solrIndexerQuery;
		}
		return _solrIndexerQuery = getPersistenceContext().getValue(SOLRINDEXERQUERY, _solrIndexerQuery);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexerQueryParameter.value</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the value - value of the parameter
	 */
	public String getValue()
	{
		if (this._value!=null)
		{
			return _value;
		}
		return _value = getPersistenceContext().getValue(VALUE, _value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexerQueryParameter.name</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the name - name of the parameter
	 */
	public void setName(final String value)
	{
		_name = getPersistenceContext().setValue(NAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexerQueryParameter.solrIndexerQuery</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the solrIndexerQuery
	 */
	public void setSolrIndexerQuery(final SolrIndexerQueryModel value)
	{
		_solrIndexerQuery = getPersistenceContext().setValue(SOLRINDEXERQUERY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexerQueryParameter.value</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the value - value of the parameter
	 */
	public void setValue(final String value)
	{
		_value = getPersistenceContext().setValue(VALUE, value);
	}
	
}
