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
package de.hybris.platform.mobileservices.model.text;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.mobileservices.model.text.MobileAggregatorModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type MobileAggregatorParameter first defined at extension mobileservices.
 */
@SuppressWarnings("all")
public class MobileAggregatorParameterModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "MobileAggregatorParameter";
	
	/**<i>Generated relation code constant for relation <code>AggregatorParameterRelation</code> defining source attribute <code>aggregator</code> in extension <code>mobileservices</code>.</i>*/
	public final static String _AGGREGATORPARAMETERRELATION = "AggregatorParameterRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileAggregatorParameter.name</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileAggregatorParameter.value</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String VALUE = "value";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileAggregatorParameter.aggregator</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String AGGREGATOR = "aggregator";
	
	
	/** <i>Generated variable</i> - Variable of <code>MobileAggregatorParameter.name</code> attribute defined at extension <code>mobileservices</code>. */
	private String _name;
	
	/** <i>Generated variable</i> - Variable of <code>MobileAggregatorParameter.value</code> attribute defined at extension <code>mobileservices</code>. */
	private String _value;
	
	/** <i>Generated variable</i> - Variable of <code>MobileAggregatorParameter.aggregator</code> attribute defined at extension <code>mobileservices</code>. */
	private MobileAggregatorModel _aggregator;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public MobileAggregatorParameterModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public MobileAggregatorParameterModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _aggregator initial attribute declared by type <code>MobileAggregatorParameter</code> at extension <code>mobileservices</code>
	 * @param _name initial attribute declared by type <code>MobileAggregatorParameter</code> at extension <code>mobileservices</code>
	 */
	@Deprecated
	public MobileAggregatorParameterModel(final MobileAggregatorModel _aggregator, final String _name)
	{
		super();
		setAggregator(_aggregator);
		setName(_name);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _aggregator initial attribute declared by type <code>MobileAggregatorParameter</code> at extension <code>mobileservices</code>
	 * @param _name initial attribute declared by type <code>MobileAggregatorParameter</code> at extension <code>mobileservices</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public MobileAggregatorParameterModel(final MobileAggregatorModel _aggregator, final String _name, final ItemModel _owner)
	{
		super();
		setAggregator(_aggregator);
		setName(_name);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileAggregatorParameter.aggregator</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the aggregator
	 */
	public MobileAggregatorModel getAggregator()
	{
		if (this._aggregator!=null)
		{
			return _aggregator;
		}
		return _aggregator = getPersistenceContext().getValue(AGGREGATOR, _aggregator);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileAggregatorParameter.name</code> attribute defined at extension <code>mobileservices</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>MobileAggregatorParameter.value</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the value
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
	 * <i>Generated method</i> - Setter of <code>MobileAggregatorParameter.aggregator</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the aggregator
	 */
	public void setAggregator(final MobileAggregatorModel value)
	{
		_aggregator = getPersistenceContext().setValue(AGGREGATOR, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileAggregatorParameter.name</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the name
	 */
	public void setName(final String value)
	{
		_name = getPersistenceContext().setValue(NAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileAggregatorParameter.value</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the value
	 */
	public void setValue(final String value)
	{
		_value = getPersistenceContext().setValue(VALUE, value);
	}
	
}
