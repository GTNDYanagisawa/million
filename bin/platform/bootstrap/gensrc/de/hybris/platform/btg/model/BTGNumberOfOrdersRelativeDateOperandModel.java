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
package de.hybris.platform.btg.model;

import de.hybris.platform.basecommerce.enums.IntervalResolution;
import de.hybris.platform.btg.model.BTGAbstractOrderOperandModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type BTGNumberOfOrdersRelativeDateOperand first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGNumberOfOrdersRelativeDateOperandModel extends BTGAbstractOrderOperandModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGNumberOfOrdersRelativeDateOperand";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGNumberOfOrdersRelativeDateOperand.value</code> attribute defined at extension <code>btg</code>. */
	public static final String VALUE = "value";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGNumberOfOrdersRelativeDateOperand.unit</code> attribute defined at extension <code>btg</code>. */
	public static final String UNIT = "unit";
	
	
	/** <i>Generated variable</i> - Variable of <code>BTGNumberOfOrdersRelativeDateOperand.value</code> attribute defined at extension <code>btg</code>. */
	private Integer _value;
	
	/** <i>Generated variable</i> - Variable of <code>BTGNumberOfOrdersRelativeDateOperand.unit</code> attribute defined at extension <code>btg</code>. */
	private IntervalResolution _unit;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGNumberOfOrdersRelativeDateOperandModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGNumberOfOrdersRelativeDateOperandModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGNumberOfOrdersRelativeDateOperandModel(final CatalogVersionModel _catalogVersion, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGNumberOfOrdersRelativeDateOperandModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGNumberOfOrdersRelativeDateOperand.unit</code> attribute defined at extension <code>btg</code>. 
	 * @return the unit
	 */
	public IntervalResolution getUnit()
	{
		if (this._unit!=null)
		{
			return _unit;
		}
		return _unit = getPersistenceContext().getValue(UNIT, _unit);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGNumberOfOrdersRelativeDateOperand.value</code> attribute defined at extension <code>btg</code>. 
	 * @return the value
	 */
	public Integer getValue()
	{
		if (this._value!=null)
		{
			return _value;
		}
		return _value = getPersistenceContext().getValue(VALUE, _value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGNumberOfOrdersRelativeDateOperand.unit</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the unit
	 */
	public void setUnit(final IntervalResolution value)
	{
		_unit = getPersistenceContext().setValue(UNIT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGNumberOfOrdersRelativeDateOperand.value</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the value
	 */
	public void setValue(final Integer value)
	{
		_value = getPersistenceContext().setValue(VALUE, value);
	}
	
}
