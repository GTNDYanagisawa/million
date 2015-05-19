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

import de.hybris.platform.commercesearch.enums.SolrBoostConditionOperator;
import de.hybris.platform.commercesearch.model.AbstractSolrSearchProfileModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexedPropertyModel;
import java.util.Collection;

/**
 * Generated model class for type SolrBoostRule first defined at extension commercesearch.
 */
@SuppressWarnings("all")
public class SolrBoostRuleModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SolrBoostRule";
	
	/**<i>Generated relation code constant for relation <code>SolrIndexedProperty2SolrBoostRuleRelation</code> defining source attribute <code>solrIndexedProperty</code> in extension <code>commercesearch</code>.</i>*/
	public final static String _SOLRINDEXEDPROPERTY2SOLRBOOSTRULERELATION = "SolrIndexedProperty2SolrBoostRuleRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrBoostRule.operator</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String OPERATOR = "operator";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrBoostRule.propertyValue</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String PROPERTYVALUE = "propertyValue";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrBoostRule.boostFactor</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String BOOSTFACTOR = "boostFactor";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrBoostRule.solrIndexedProperty</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String SOLRINDEXEDPROPERTY = "solrIndexedProperty";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrBoostRule.solrSearchProfiles</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String SOLRSEARCHPROFILES = "solrSearchProfiles";
	
	
	/** <i>Generated variable</i> - Variable of <code>SolrBoostRule.operator</code> attribute defined at extension <code>commercesearch</code>. */
	private SolrBoostConditionOperator _operator;
	
	/** <i>Generated variable</i> - Variable of <code>SolrBoostRule.propertyValue</code> attribute defined at extension <code>commercesearch</code>. */
	private String _propertyValue;
	
	/** <i>Generated variable</i> - Variable of <code>SolrBoostRule.boostFactor</code> attribute defined at extension <code>commercesearch</code>. */
	private Integer _boostFactor;
	
	/** <i>Generated variable</i> - Variable of <code>SolrBoostRule.solrIndexedProperty</code> attribute defined at extension <code>commercesearch</code>. */
	private SolrIndexedPropertyModel _solrIndexedProperty;
	
	/** <i>Generated variable</i> - Variable of <code>SolrBoostRule.solrSearchProfiles</code> attribute defined at extension <code>commercesearch</code>. */
	private Collection<AbstractSolrSearchProfileModel> _solrSearchProfiles;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SolrBoostRuleModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SolrBoostRuleModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _boostFactor initial attribute declared by type <code>SolrBoostRule</code> at extension <code>commercesearch</code>
	 * @param _propertyValue initial attribute declared by type <code>SolrBoostRule</code> at extension <code>commercesearch</code>
	 * @param _solrIndexedProperty initial attribute declared by type <code>SolrBoostRule</code> at extension <code>commercesearch</code>
	 * @param _solrSearchProfiles initial attribute declared by type <code>SolrBoostRule</code> at extension <code>commercesearch</code>
	 */
	@Deprecated
	public SolrBoostRuleModel(final int _boostFactor, final String _propertyValue, final SolrIndexedPropertyModel _solrIndexedProperty, final Collection<AbstractSolrSearchProfileModel> _solrSearchProfiles)
	{
		super();
		setBoostFactor(_boostFactor);
		setPropertyValue(_propertyValue);
		setSolrIndexedProperty(_solrIndexedProperty);
		setSolrSearchProfiles(_solrSearchProfiles);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _boostFactor initial attribute declared by type <code>SolrBoostRule</code> at extension <code>commercesearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _propertyValue initial attribute declared by type <code>SolrBoostRule</code> at extension <code>commercesearch</code>
	 * @param _solrIndexedProperty initial attribute declared by type <code>SolrBoostRule</code> at extension <code>commercesearch</code>
	 * @param _solrSearchProfiles initial attribute declared by type <code>SolrBoostRule</code> at extension <code>commercesearch</code>
	 */
	@Deprecated
	public SolrBoostRuleModel(final int _boostFactor, final ItemModel _owner, final String _propertyValue, final SolrIndexedPropertyModel _solrIndexedProperty, final Collection<AbstractSolrSearchProfileModel> _solrSearchProfiles)
	{
		super();
		setBoostFactor(_boostFactor);
		setOwner(_owner);
		setPropertyValue(_propertyValue);
		setSolrIndexedProperty(_solrIndexedProperty);
		setSolrSearchProfiles(_solrSearchProfiles);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrBoostRule.boostFactor</code> attribute defined at extension <code>commercesearch</code>. 
	 * @return the boostFactor
	 */
	public int getBoostFactor()
	{
		return toPrimitive( _boostFactor = getPersistenceContext().getValue(BOOSTFACTOR, _boostFactor));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrBoostRule.operator</code> attribute defined at extension <code>commercesearch</code>. 
	 * @return the operator
	 */
	public SolrBoostConditionOperator getOperator()
	{
		if (this._operator!=null)
		{
			return _operator;
		}
		return _operator = getPersistenceContext().getValue(OPERATOR, _operator);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrBoostRule.propertyValue</code> attribute defined at extension <code>commercesearch</code>. 
	 * @return the propertyValue
	 */
	public String getPropertyValue()
	{
		if (this._propertyValue!=null)
		{
			return _propertyValue;
		}
		return _propertyValue = getPersistenceContext().getValue(PROPERTYVALUE, _propertyValue);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrBoostRule.solrIndexedProperty</code> attribute defined at extension <code>commercesearch</code>. 
	 * @return the solrIndexedProperty
	 */
	public SolrIndexedPropertyModel getSolrIndexedProperty()
	{
		if (this._solrIndexedProperty!=null)
		{
			return _solrIndexedProperty;
		}
		return _solrIndexedProperty = getPersistenceContext().getValue(SOLRINDEXEDPROPERTY, _solrIndexedProperty);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrBoostRule.solrSearchProfiles</code> attribute defined at extension <code>commercesearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the solrSearchProfiles
	 */
	public Collection<AbstractSolrSearchProfileModel> getSolrSearchProfiles()
	{
		if (this._solrSearchProfiles!=null)
		{
			return _solrSearchProfiles;
		}
		return _solrSearchProfiles = getPersistenceContext().getValue(SOLRSEARCHPROFILES, _solrSearchProfiles);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrBoostRule.boostFactor</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the boostFactor
	 */
	public void setBoostFactor(final int value)
	{
		_boostFactor = getPersistenceContext().setValue(BOOSTFACTOR, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrBoostRule.operator</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the operator
	 */
	public void setOperator(final SolrBoostConditionOperator value)
	{
		_operator = getPersistenceContext().setValue(OPERATOR, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrBoostRule.propertyValue</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the propertyValue
	 */
	public void setPropertyValue(final String value)
	{
		_propertyValue = getPersistenceContext().setValue(PROPERTYVALUE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrBoostRule.solrIndexedProperty</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the solrIndexedProperty
	 */
	public void setSolrIndexedProperty(final SolrIndexedPropertyModel value)
	{
		_solrIndexedProperty = getPersistenceContext().setValue(SOLRINDEXEDPROPERTY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrBoostRule.solrSearchProfiles</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the solrSearchProfiles
	 */
	public void setSolrSearchProfiles(final Collection<AbstractSolrSearchProfileModel> value)
	{
		_solrSearchProfiles = getPersistenceContext().setValue(SOLRSEARCHPROFILES, value);
	}
	
}
