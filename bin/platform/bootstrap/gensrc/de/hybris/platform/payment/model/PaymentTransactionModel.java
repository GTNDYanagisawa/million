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
package de.hybris.platform.payment.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.core.model.order.payment.PaymentInfoModel;
import de.hybris.platform.payment.model.PaymentTransactionEntryModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.math.BigDecimal;
import java.util.List;

/**
 * Generated model class for type PaymentTransaction first defined at extension payment.
 */
@SuppressWarnings("all")
public class PaymentTransactionModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PaymentTransaction";
	
	/**<i>Generated relation code constant for relation <code>Order2PaymentTransaction</code> defining source attribute <code>order</code> in extension <code>payment</code>.</i>*/
	public final static String _ORDER2PAYMENTTRANSACTION = "Order2PaymentTransaction";
	
	/** <i>Generated constant</i> - Attribute key of <code>PaymentTransaction.code</code> attribute defined at extension <code>payment</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>PaymentTransaction.requestId</code> attribute defined at extension <code>payment</code>. */
	public static final String REQUESTID = "requestId";
	
	/** <i>Generated constant</i> - Attribute key of <code>PaymentTransaction.requestToken</code> attribute defined at extension <code>payment</code>. */
	public static final String REQUESTTOKEN = "requestToken";
	
	/** <i>Generated constant</i> - Attribute key of <code>PaymentTransaction.paymentProvider</code> attribute defined at extension <code>payment</code>. */
	public static final String PAYMENTPROVIDER = "paymentProvider";
	
	/** <i>Generated constant</i> - Attribute key of <code>PaymentTransaction.plannedAmount</code> attribute defined at extension <code>payment</code>. */
	public static final String PLANNEDAMOUNT = "plannedAmount";
	
	/** <i>Generated constant</i> - Attribute key of <code>PaymentTransaction.currency</code> attribute defined at extension <code>payment</code>. */
	public static final String CURRENCY = "currency";
	
	/** <i>Generated constant</i> - Attribute key of <code>PaymentTransaction.info</code> attribute defined at extension <code>payment</code>. */
	public static final String INFO = "info";
	
	/** <i>Generated constant</i> - Attribute key of <code>PaymentTransaction.versionID</code> attribute defined at extension <code>payment</code>. */
	public static final String VERSIONID = "versionID";
	
	/** <i>Generated constant</i> - Attribute key of <code>PaymentTransaction.entries</code> attribute defined at extension <code>payment</code>. */
	public static final String ENTRIES = "entries";
	
	/** <i>Generated constant</i> - Attribute key of <code>PaymentTransaction.order</code> attribute defined at extension <code>payment</code>. */
	public static final String ORDER = "order";
	
	
	/** <i>Generated variable</i> - Variable of <code>PaymentTransaction.code</code> attribute defined at extension <code>payment</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>PaymentTransaction.requestId</code> attribute defined at extension <code>payment</code>. */
	private String _requestId;
	
	/** <i>Generated variable</i> - Variable of <code>PaymentTransaction.requestToken</code> attribute defined at extension <code>payment</code>. */
	private String _requestToken;
	
	/** <i>Generated variable</i> - Variable of <code>PaymentTransaction.paymentProvider</code> attribute defined at extension <code>payment</code>. */
	private String _paymentProvider;
	
	/** <i>Generated variable</i> - Variable of <code>PaymentTransaction.plannedAmount</code> attribute defined at extension <code>payment</code>. */
	private BigDecimal _plannedAmount;
	
	/** <i>Generated variable</i> - Variable of <code>PaymentTransaction.currency</code> attribute defined at extension <code>payment</code>. */
	private CurrencyModel _currency;
	
	/** <i>Generated variable</i> - Variable of <code>PaymentTransaction.info</code> attribute defined at extension <code>payment</code>. */
	private PaymentInfoModel _info;
	
	/** <i>Generated variable</i> - Variable of <code>PaymentTransaction.versionID</code> attribute defined at extension <code>payment</code>. */
	private String _versionID;
	
	/** <i>Generated variable</i> - Variable of <code>PaymentTransaction.entries</code> attribute defined at extension <code>payment</code>. */
	private List<PaymentTransactionEntryModel> _entries;
	
	/** <i>Generated variable</i> - Variable of <code>PaymentTransaction.order</code> attribute defined at extension <code>payment</code>. */
	private AbstractOrderModel _order;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PaymentTransactionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PaymentTransactionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>PaymentTransaction</code> at extension <code>payment</code>
	 */
	@Deprecated
	public PaymentTransactionModel(final String _code)
	{
		super();
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>PaymentTransaction</code> at extension <code>payment</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _versionID initial attribute declared by type <code>PaymentTransaction</code> at extension <code>payment</code>
	 */
	@Deprecated
	public PaymentTransactionModel(final String _code, final ItemModel _owner, final String _versionID)
	{
		super();
		setCode(_code);
		setOwner(_owner);
		setVersionID(_versionID);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTransaction.code</code> attribute defined at extension <code>payment</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>PaymentTransaction.currency</code> attribute defined at extension <code>payment</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>PaymentTransaction.entries</code> attribute defined at extension <code>payment</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the entries
	 */
	public List<PaymentTransactionEntryModel> getEntries()
	{
		if (this._entries!=null)
		{
			return _entries;
		}
		return _entries = getPersistenceContext().getValue(ENTRIES, _entries);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTransaction.info</code> attribute defined at extension <code>payment</code>. 
	 * @return the info
	 */
	public PaymentInfoModel getInfo()
	{
		if (this._info!=null)
		{
			return _info;
		}
		return _info = getPersistenceContext().getValue(INFO, _info);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTransaction.order</code> attribute defined at extension <code>payment</code>. 
	 * @return the order
	 */
	public AbstractOrderModel getOrder()
	{
		if (this._order!=null)
		{
			return _order;
		}
		return _order = getPersistenceContext().getValue(ORDER, _order);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTransaction.paymentProvider</code> attribute defined at extension <code>payment</code>. 
	 * @return the paymentProvider
	 */
	public String getPaymentProvider()
	{
		if (this._paymentProvider!=null)
		{
			return _paymentProvider;
		}
		return _paymentProvider = getPersistenceContext().getValue(PAYMENTPROVIDER, _paymentProvider);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTransaction.plannedAmount</code> attribute defined at extension <code>payment</code>. 
	 * @return the plannedAmount
	 */
	public BigDecimal getPlannedAmount()
	{
		if (this._plannedAmount!=null)
		{
			return _plannedAmount;
		}
		return _plannedAmount = getPersistenceContext().getValue(PLANNEDAMOUNT, _plannedAmount);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTransaction.requestId</code> attribute defined at extension <code>payment</code>. 
	 * @return the requestId
	 */
	public String getRequestId()
	{
		if (this._requestId!=null)
		{
			return _requestId;
		}
		return _requestId = getPersistenceContext().getValue(REQUESTID, _requestId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTransaction.requestToken</code> attribute defined at extension <code>payment</code>. 
	 * @return the requestToken
	 */
	public String getRequestToken()
	{
		if (this._requestToken!=null)
		{
			return _requestToken;
		}
		return _requestToken = getPersistenceContext().getValue(REQUESTTOKEN, _requestToken);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTransaction.versionID</code> attribute defined at extension <code>payment</code>. 
	 * @return the versionID
	 */
	public String getVersionID()
	{
		if (this._versionID!=null)
		{
			return _versionID;
		}
		return _versionID = getPersistenceContext().getValue(VERSIONID, _versionID);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PaymentTransaction.code</code> attribute defined at extension <code>payment</code>. 
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PaymentTransaction.currency</code> attribute defined at extension <code>payment</code>. 
	 *  
	 * @param value the currency
	 */
	public void setCurrency(final CurrencyModel value)
	{
		_currency = getPersistenceContext().setValue(CURRENCY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PaymentTransaction.entries</code> attribute defined at extension <code>payment</code>. 
	 *  
	 * @param value the entries
	 */
	public void setEntries(final List<PaymentTransactionEntryModel> value)
	{
		_entries = getPersistenceContext().setValue(ENTRIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PaymentTransaction.info</code> attribute defined at extension <code>payment</code>. 
	 *  
	 * @param value the info
	 */
	public void setInfo(final PaymentInfoModel value)
	{
		_info = getPersistenceContext().setValue(INFO, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PaymentTransaction.order</code> attribute defined at extension <code>payment</code>. 
	 *  
	 * @param value the order
	 */
	public void setOrder(final AbstractOrderModel value)
	{
		_order = getPersistenceContext().setValue(ORDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PaymentTransaction.paymentProvider</code> attribute defined at extension <code>payment</code>. 
	 *  
	 * @param value the paymentProvider
	 */
	public void setPaymentProvider(final String value)
	{
		_paymentProvider = getPersistenceContext().setValue(PAYMENTPROVIDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PaymentTransaction.plannedAmount</code> attribute defined at extension <code>payment</code>. 
	 *  
	 * @param value the plannedAmount
	 */
	public void setPlannedAmount(final BigDecimal value)
	{
		_plannedAmount = getPersistenceContext().setValue(PLANNEDAMOUNT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PaymentTransaction.requestId</code> attribute defined at extension <code>payment</code>. 
	 *  
	 * @param value the requestId
	 */
	public void setRequestId(final String value)
	{
		_requestId = getPersistenceContext().setValue(REQUESTID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PaymentTransaction.requestToken</code> attribute defined at extension <code>payment</code>. 
	 *  
	 * @param value the requestToken
	 */
	public void setRequestToken(final String value)
	{
		_requestToken = getPersistenceContext().setValue(REQUESTTOKEN, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>PaymentTransaction.versionID</code> attribute defined at extension <code>payment</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the versionID
	 */
	public void setVersionID(final String value)
	{
		_versionID = getPersistenceContext().setValue(VERSIONID, value);
	}
	
}
