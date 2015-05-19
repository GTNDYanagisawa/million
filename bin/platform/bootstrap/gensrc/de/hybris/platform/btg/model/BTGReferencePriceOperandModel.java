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

import de.hybris.platform.btg.model.BTGAbstractReferenceOperandModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type BTGReferencePriceOperand first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGReferencePriceOperandModel extends BTGAbstractReferenceOperandModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGReferencePriceOperand";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGReferencePriceOperand.value</code> attribute defined at extension <code>btg</code>. */
	public static final String VALUE = "value";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGReferencePriceOperand.currency</code> attribute defined at extension <code>btg</code>. */
	public static final String CURRENCY = "currency";
	
	
	/** <i>Generated variable</i> - Variable of <code>BTGReferencePriceOperand.value</code> attribute defined at extension <code>btg</code>. */
	private Double _value;
	
	/** <i>Generated variable</i> - Variable of <code>BTGReferencePriceOperand.currency</code> attribute defined at extension <code>btg</code>. */
	private CurrencyModel _currency;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGReferencePriceOperandModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGReferencePriceOperandModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _value initial attribute declared by type <code>BTGReferencePriceOperand</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGReferencePriceOperandModel(final CatalogVersionModel _catalogVersion, final String _uid, final Double _value)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setUid(_uid);
		setValue(_value);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _value initial attribute declared by type <code>BTGReferencePriceOperand</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGReferencePriceOperandModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final String _uid, final Double _value)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setUid(_uid);
		setValue(_value);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGReferencePriceOperand.currency</code> attribute defined at extension <code>btg</code>. 
	 * @return the currency
	 */
	public CurrencyModel getCurrency()
	{
		if (this._currency!=null)
		{
			return _currency;
		}
		return _currency = getPersistenceContext().getValue(CURRENCY, _currency);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGReferencePriceOperand.value</code> attribute defined at extension <code>btg</code>. 
	 * @return the value
	 */
	public Double getValue()
	{
		if (this._value!=null)
		{
			return _value;
		}
		return _value = getPersistenceContext().getValue(VALUE, _value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGReferencePriceOperand.currency</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the currency
	 */
	public void setCurrency(final CurrencyModel value)
	{
		_currency = getPersistenceContext().setValue(CURRENCY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGReferencePriceOperand.value</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the value
	 */
	public void setValue(final Double value)
	{
		_value = getPersistenceContext().setValue(VALUE, value);
	}
	
}
