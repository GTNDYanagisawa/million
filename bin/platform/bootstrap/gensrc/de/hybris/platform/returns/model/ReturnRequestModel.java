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
package de.hybris.platform.returns.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.returns.model.ReplacementOrderModel;
import de.hybris.platform.returns.model.ReturnEntryModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.List;

/**
 * Generated model class for type ReturnRequest first defined at extension basecommerce.
 */
@SuppressWarnings("all")
public class ReturnRequestModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ReturnRequest";
	
	/**<i>Generated relation code constant for relation <code>Order2ReturnRequest</code> defining source attribute <code>order</code> in extension <code>basecommerce</code>.</i>*/
	public final static String _ORDER2RETURNREQUEST = "Order2ReturnRequest";
	
	/** <i>Generated constant</i> - Attribute key of <code>ReturnRequest.code</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>ReturnRequest.RMA</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String RMA = "RMA";
	
	/** <i>Generated constant</i> - Attribute key of <code>ReturnRequest.replacementOrder</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String REPLACEMENTORDER = "replacementOrder";
	
	/** <i>Generated constant</i> - Attribute key of <code>ReturnRequest.currency</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CURRENCY = "currency";
	
	/** <i>Generated constant</i> - Attribute key of <code>ReturnRequest.order</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String ORDER = "order";
	
	/** <i>Generated constant</i> - Attribute key of <code>ReturnRequest.returnEntries</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String RETURNENTRIES = "returnEntries";
	
	
	/** <i>Generated variable</i> - Variable of <code>ReturnRequest.code</code> attribute defined at extension <code>basecommerce</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>ReturnRequest.RMA</code> attribute defined at extension <code>basecommerce</code>. */
	private String _RMA;
	
	/** <i>Generated variable</i> - Variable of <code>ReturnRequest.replacementOrder</code> attribute defined at extension <code>basecommerce</code>. */
	private ReplacementOrderModel _replacementOrder;
	
	/** <i>Generated variable</i> - Variable of <code>ReturnRequest.currency</code> attribute defined at extension <code>basecommerce</code>. */
	private CurrencyModel _currency;
	
	/** <i>Generated variable</i> - Variable of <code>ReturnRequest.order</code> attribute defined at extension <code>basecommerce</code>. */
	private OrderModel _order;
	
	/** <i>Generated variable</i> - Variable of <code>ReturnRequest.returnEntries</code> attribute defined at extension <code>basecommerce</code>. */
	private List<ReturnEntryModel> _returnEntries;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ReturnRequestModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ReturnRequestModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>ReturnRequest</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public ReturnRequestModel(final String _code)
	{
		super();
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>ReturnRequest</code> at extension <code>basecommerce</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public ReturnRequestModel(final String _code, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReturnRequest.code</code> attribute defined at extension <code>basecommerce</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>ReturnRequest.currency</code> attribute defined at extension <code>basecommerce</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>ReturnRequest.order</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the order
	 */
	public OrderModel getOrder()
	{
		if (this._order!=null)
		{
			return _order;
		}
		return _order = getPersistenceContext().getValue(ORDER, _order);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReturnRequest.replacementOrder</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the replacementOrder
	 */
	public ReplacementOrderModel getReplacementOrder()
	{
		if (this._replacementOrder!=null)
		{
			return _replacementOrder;
		}
		return _replacementOrder = getPersistenceContext().getValue(REPLACEMENTORDER, _replacementOrder);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReturnRequest.returnEntries</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the returnEntries
	 */
	public List<ReturnEntryModel> getReturnEntries()
	{
		if (this._returnEntries!=null)
		{
			return _returnEntries;
		}
		return _returnEntries = getPersistenceContext().getValue(RETURNENTRIES, _returnEntries);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReturnRequest.RMA</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the RMA
	 */
	public String getRMA()
	{
		if (this._RMA!=null)
		{
			return _RMA;
		}
		return _RMA = getPersistenceContext().getValue(RMA, _RMA);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ReturnRequest.code</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ReturnRequest.currency</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the currency
	 */
	public void setCurrency(final CurrencyModel value)
	{
		_currency = getPersistenceContext().setValue(CURRENCY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ReturnRequest.order</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the order
	 */
	public void setOrder(final OrderModel value)
	{
		_order = getPersistenceContext().setValue(ORDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ReturnRequest.replacementOrder</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the replacementOrder
	 */
	public void setReplacementOrder(final ReplacementOrderModel value)
	{
		_replacementOrder = getPersistenceContext().setValue(REPLACEMENTORDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ReturnRequest.returnEntries</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the returnEntries
	 */
	public void setReturnEntries(final List<ReturnEntryModel> value)
	{
		_returnEntries = getPersistenceContext().setValue(RETURNENTRIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ReturnRequest.RMA</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the RMA
	 */
	public void setRMA(final String value)
	{
		_RMA = getPersistenceContext().setValue(RMA, value);
	}
	
}
