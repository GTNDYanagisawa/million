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
package de.hybris.platform.fraud.model;

import de.hybris.platform.basecommerce.enums.IntervalResolution;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Set;

/**
 * Generated model class for type ProductOrderLimit first defined at extension basecommerce.
 */
@SuppressWarnings("all")
public class ProductOrderLimitModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ProductOrderLimit";
	
	/**<i>Generated relation code constant for relation <code>ProductProductOrderLimitRelation</code> defining source attribute <code>products</code> in extension <code>basecommerce</code>.</i>*/
	public final static String _PRODUCTPRODUCTORDERLIMITRELATION = "ProductProductOrderLimitRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductOrderLimit.code</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductOrderLimit.intervalResolution</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String INTERVALRESOLUTION = "intervalResolution";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductOrderLimit.intervalValue</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String INTERVALVALUE = "intervalValue";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductOrderLimit.intervalMaxOrdersNumber</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String INTERVALMAXORDERSNUMBER = "intervalMaxOrdersNumber";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductOrderLimit.maxNumberPerOrder</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String MAXNUMBERPERORDER = "maxNumberPerOrder";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductOrderLimit.products</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String PRODUCTS = "products";
	
	
	/** <i>Generated variable</i> - Variable of <code>ProductOrderLimit.code</code> attribute defined at extension <code>basecommerce</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>ProductOrderLimit.intervalResolution</code> attribute defined at extension <code>basecommerce</code>. */
	private IntervalResolution _intervalResolution;
	
	/** <i>Generated variable</i> - Variable of <code>ProductOrderLimit.intervalValue</code> attribute defined at extension <code>basecommerce</code>. */
	private Integer _intervalValue;
	
	/** <i>Generated variable</i> - Variable of <code>ProductOrderLimit.intervalMaxOrdersNumber</code> attribute defined at extension <code>basecommerce</code>. */
	private Integer _intervalMaxOrdersNumber;
	
	/** <i>Generated variable</i> - Variable of <code>ProductOrderLimit.maxNumberPerOrder</code> attribute defined at extension <code>basecommerce</code>. */
	private Integer _maxNumberPerOrder;
	
	/** <i>Generated variable</i> - Variable of <code>ProductOrderLimit.products</code> attribute defined at extension <code>basecommerce</code>. */
	private Set<ProductModel> _products;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ProductOrderLimitModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ProductOrderLimitModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>ProductOrderLimit</code> at extension <code>basecommerce</code>
	 * @param _intervalMaxOrdersNumber initial attribute declared by type <code>ProductOrderLimit</code> at extension <code>basecommerce</code>
	 * @param _intervalResolution initial attribute declared by type <code>ProductOrderLimit</code> at extension <code>basecommerce</code>
	 * @param _intervalValue initial attribute declared by type <code>ProductOrderLimit</code> at extension <code>basecommerce</code>
	 * @param _maxNumberPerOrder initial attribute declared by type <code>ProductOrderLimit</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public ProductOrderLimitModel(final String _code, final Integer _intervalMaxOrdersNumber, final IntervalResolution _intervalResolution, final Integer _intervalValue, final Integer _maxNumberPerOrder)
	{
		super();
		setCode(_code);
		setIntervalMaxOrdersNumber(_intervalMaxOrdersNumber);
		setIntervalResolution(_intervalResolution);
		setIntervalValue(_intervalValue);
		setMaxNumberPerOrder(_maxNumberPerOrder);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>ProductOrderLimit</code> at extension <code>basecommerce</code>
	 * @param _intervalMaxOrdersNumber initial attribute declared by type <code>ProductOrderLimit</code> at extension <code>basecommerce</code>
	 * @param _intervalResolution initial attribute declared by type <code>ProductOrderLimit</code> at extension <code>basecommerce</code>
	 * @param _intervalValue initial attribute declared by type <code>ProductOrderLimit</code> at extension <code>basecommerce</code>
	 * @param _maxNumberPerOrder initial attribute declared by type <code>ProductOrderLimit</code> at extension <code>basecommerce</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public ProductOrderLimitModel(final String _code, final Integer _intervalMaxOrdersNumber, final IntervalResolution _intervalResolution, final Integer _intervalValue, final Integer _maxNumberPerOrder, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setIntervalMaxOrdersNumber(_intervalMaxOrdersNumber);
		setIntervalResolution(_intervalResolution);
		setIntervalValue(_intervalValue);
		setMaxNumberPerOrder(_maxNumberPerOrder);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductOrderLimit.code</code> attribute defined at extension <code>basecommerce</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>ProductOrderLimit.intervalMaxOrdersNumber</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the intervalMaxOrdersNumber
	 */
	public Integer getIntervalMaxOrdersNumber()
	{
		if (this._intervalMaxOrdersNumber!=null)
		{
			return _intervalMaxOrdersNumber;
		}
		return _intervalMaxOrdersNumber = getPersistenceContext().getValue(INTERVALMAXORDERSNUMBER, _intervalMaxOrdersNumber);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductOrderLimit.intervalResolution</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the intervalResolution
	 */
	public IntervalResolution getIntervalResolution()
	{
		if (this._intervalResolution!=null)
		{
			return _intervalResolution;
		}
		return _intervalResolution = getPersistenceContext().getValue(INTERVALRESOLUTION, _intervalResolution);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductOrderLimit.intervalValue</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the intervalValue
	 */
	public Integer getIntervalValue()
	{
		if (this._intervalValue!=null)
		{
			return _intervalValue;
		}
		return _intervalValue = getPersistenceContext().getValue(INTERVALVALUE, _intervalValue);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductOrderLimit.maxNumberPerOrder</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the maxNumberPerOrder
	 */
	public Integer getMaxNumberPerOrder()
	{
		if (this._maxNumberPerOrder!=null)
		{
			return _maxNumberPerOrder;
		}
		return _maxNumberPerOrder = getPersistenceContext().getValue(MAXNUMBERPERORDER, _maxNumberPerOrder);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductOrderLimit.products</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the products
	 */
	public Set<ProductModel> getProducts()
	{
		if (this._products!=null)
		{
			return _products;
		}
		return _products = getPersistenceContext().getValue(PRODUCTS, _products);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>ProductOrderLimit.code</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>ProductOrderLimit.intervalMaxOrdersNumber</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the intervalMaxOrdersNumber
	 */
	public void setIntervalMaxOrdersNumber(final Integer value)
	{
		_intervalMaxOrdersNumber = getPersistenceContext().setValue(INTERVALMAXORDERSNUMBER, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>ProductOrderLimit.intervalResolution</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the intervalResolution
	 */
	public void setIntervalResolution(final IntervalResolution value)
	{
		_intervalResolution = getPersistenceContext().setValue(INTERVALRESOLUTION, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>ProductOrderLimit.intervalValue</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the intervalValue
	 */
	public void setIntervalValue(final Integer value)
	{
		_intervalValue = getPersistenceContext().setValue(INTERVALVALUE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>ProductOrderLimit.maxNumberPerOrder</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the maxNumberPerOrder
	 */
	public void setMaxNumberPerOrder(final Integer value)
	{
		_maxNumberPerOrder = getPersistenceContext().setValue(MAXNUMBERPERORDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ProductOrderLimit.products</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the products
	 */
	public void setProducts(final Set<ProductModel> value)
	{
		_products = getPersistenceContext().setValue(PRODUCTS, value);
	}
	
}
