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
import de.hybris.platform.solrfacetsearch.model.config.SolrValueRangeSetModel;

/**
 * Generated model class for type SolrValueRange first defined at extension solrfacetsearch.
 */
@SuppressWarnings("all")
public class SolrValueRangeModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SolrValueRange";
	
	/**<i>Generated relation code constant for relation <code>SolrValueRangeSet2SolrValueRangeRelation</code> defining source attribute <code>solrValueRangeSet</code> in extension <code>solrfacetsearch</code>.</i>*/
	public final static String _SOLRVALUERANGESET2SOLRVALUERANGERELATION = "SolrValueRangeSet2SolrValueRangeRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrValueRange.name</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrValueRange.from</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String FROM = "from";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrValueRange.to</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String TO = "to";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrValueRange.solrValueRangeSet</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String SOLRVALUERANGESET = "solrValueRangeSet";
	
	
	/** <i>Generated variable</i> - Variable of <code>SolrValueRange.name</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _name;
	
	/** <i>Generated variable</i> - Variable of <code>SolrValueRange.from</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _from;
	
	/** <i>Generated variable</i> - Variable of <code>SolrValueRange.to</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _to;
	
	/** <i>Generated variable</i> - Variable of <code>SolrValueRange.solrValueRangeSet</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private SolrValueRangeSetModel _solrValueRangeSet;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SolrValueRangeModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SolrValueRangeModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _from initial attribute declared by type <code>SolrValueRange</code> at extension <code>solrfacetsearch</code>
	 * @param _name initial attribute declared by type <code>SolrValueRange</code> at extension <code>solrfacetsearch</code>
	 * @param _solrValueRangeSet initial attribute declared by type <code>SolrValueRange</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrValueRangeModel(final String _from, final String _name, final SolrValueRangeSetModel _solrValueRangeSet)
	{
		super();
		setFrom(_from);
		setName(_name);
		setSolrValueRangeSet(_solrValueRangeSet);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _from initial attribute declared by type <code>SolrValueRange</code> at extension <code>solrfacetsearch</code>
	 * @param _name initial attribute declared by type <code>SolrValueRange</code> at extension <code>solrfacetsearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _solrValueRangeSet initial attribute declared by type <code>SolrValueRange</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrValueRangeModel(final String _from, final String _name, final ItemModel _owner, final SolrValueRangeSetModel _solrValueRangeSet)
	{
		super();
		setFrom(_from);
		setName(_name);
		setOwner(_owner);
		setSolrValueRangeSet(_solrValueRangeSet);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrValueRange.from</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the from
	 */
	public String getFrom()
	{
		if (this._from!=null)
		{
			return _from;
		}
		return _from = getPersistenceContext().getValue(FROM, _from);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrValueRange.name</code> attribute defined at extension <code>solrfacetsearch</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>SolrValueRange.solrValueRangeSet</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the solrValueRangeSet
	 */
	public SolrValueRangeSetModel getSolrValueRangeSet()
	{
		if (this._solrValueRangeSet!=null)
		{
			return _solrValueRangeSet;
		}
		return _solrValueRangeSet = getPersistenceContext().getValue(SOLRVALUERANGESET, _solrValueRangeSet);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrValueRange.to</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the to
	 */
	public String getTo()
	{
		if (this._to!=null)
		{
			return _to;
		}
		return _to = getPersistenceContext().getValue(TO, _to);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrValueRange.from</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the from
	 */
	public void setFrom(final String value)
	{
		_from = getPersistenceContext().setValue(FROM, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrValueRange.name</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the name
	 */
	public void setName(final String value)
	{
		_name = getPersistenceContext().setValue(NAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrValueRange.solrValueRangeSet</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the solrValueRangeSet
	 */
	public void setSolrValueRangeSet(final SolrValueRangeSetModel value)
	{
		_solrValueRangeSet = getPersistenceContext().setValue(SOLRVALUERANGESET, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrValueRange.to</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the to
	 */
	public void setTo(final String value)
	{
		_to = getPersistenceContext().setValue(TO, value);
	}
	
}
