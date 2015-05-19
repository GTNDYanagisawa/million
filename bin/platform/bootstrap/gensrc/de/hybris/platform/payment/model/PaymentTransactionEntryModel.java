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
import de.hybris.platform.payment.enums.PaymentTransactionType;
import de.hybris.platform.payment.model.PaymentTransactionModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Generated model class for type PaymentTransactionEntry first defined at extension payment.
 */
@SuppressWarnings("all")
public class PaymentTransactionEntryModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PaymentTransactionEntry";
	
	/**<i>Generated relation code constant for relation <code>PaymentTransaction2PaymentTransactionEntry</code> defining source attribute <code>paymentTransaction</code> in extension <code>payment</code>.</i>*/
	public final static String _PAYMENTTRANSACTION2PAYMENTTRANSACTIONENTRY = "PaymentTransaction2PaymentTransactionEntry";
	
	/** <i>Generated constant</i> - Attribute key of <code>PaymentTransactionEntry.type</code> attribute defined at extension <code>payment</code>. */
	public static final String TYPE = "type";
	
	/** <i>Generated constant</i> - Attribute key of <code>PaymentTransactionEntry.amount</code> attribute defined at extension <code>payment</code>. */
	public static final String AMOUNT = "amount";
	
	/** <i>Generated constant</i> - Attribute key of <code>PaymentTransactionEntry.currency</code> attribute defined at extension <code>payment</code>. */
	public static final String CURRENCY = "currency";
	
	/** <i>Generated constant</i> - Attribute key of <code>PaymentTransactionEntry.time</code> attribute defined at extension <code>payment</code>. */
	public static final String TIME = "time";
	
	/** <i>Generated constant</i> - Attribute key of <code>PaymentTransactionEntry.transactionStatus</code> attribute defined at extension <code>payment</code>. */
	public static final String TRANSACTIONSTATUS = "transactionStatus";
	
	/** <i>Generated constant</i> - Attribute key of <code>PaymentTransactionEntry.transactionStatusDetails</code> attribute defined at extension <code>payment</code>. */
	public static final String TRANSACTIONSTATUSDETAILS = "transactionStatusDetails";
	
	/** <i>Generated constant</i> - Attribute key of <code>PaymentTransactionEntry.requestToken</code> attribute defined at extension <code>payment</code>. */
	public static final String REQUESTTOKEN = "requestToken";
	
	/** <i>Generated constant</i> - Attribute key of <code>PaymentTransactionEntry.requestId</code> attribute defined at extension <code>payment</code>. */
	public static final String REQUESTID = "requestId";
	
	/** <i>Generated constant</i> - Attribute key of <code>PaymentTransactionEntry.subscriptionID</code> attribute defined at extension <code>payment</code>. */
	public static final String SUBSCRIPTIONID = "subscriptionID";
	
	/** <i>Generated constant</i> - Attribute key of <code>PaymentTransactionEntry.code</code> attribute defined at extension <code>payment</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>PaymentTransactionEntry.versionID</code> attribute defined at extension <code>payment</code>. */
	public static final String VERSIONID = "versionID";
	
	/** <i>Generated constant</i> - Attribute key of <code>PaymentTransactionEntry.paymentTransaction</code> attribute defined at extension <code>payment</code>. */
	public static final String PAYMENTTRANSACTION = "paymentTransaction";
	
	
	/** <i>Generated variable</i> - Variable of <code>PaymentTransactionEntry.type</code> attribute defined at extension <code>payment</code>. */
	private PaymentTransactionType _type;
	
	/** <i>Generated variable</i> - Variable of <code>PaymentTransactionEntry.amount</code> attribute defined at extension <code>payment</code>. */
	private BigDecimal _amount;
	
	/** <i>Generated variable</i> - Variable of <code>PaymentTransactionEntry.currency</code> attribute defined at extension <code>payment</code>. */
	private CurrencyModel _currency;
	
	/** <i>Generated variable</i> - Variable of <code>PaymentTransactionEntry.time</code> attribute defined at extension <code>payment</code>. */
	private Date _time;
	
	/** <i>Generated variable</i> - Variable of <code>PaymentTransactionEntry.transactionStatus</code> attribute defined at extension <code>payment</code>. */
	private String _transactionStatus;
	
	/** <i>Generated variable</i> - Variable of <code>PaymentTransactionEntry.transactionStatusDetails</code> attribute defined at extension <code>payment</code>. */
	private String _transactionStatusDetails;
	
	/** <i>Generated variable</i> - Variable of <code>PaymentTransactionEntry.requestToken</code> attribute defined at extension <code>payment</code>. */
	private String _requestToken;
	
	/** <i>Generated variable</i> - Variable of <code>PaymentTransactionEntry.requestId</code> attribute defined at extension <code>payment</code>. */
	private String _requestId;
	
	/** <i>Generated variable</i> - Variable of <code>PaymentTransactionEntry.subscriptionID</code> attribute defined at extension <code>payment</code>. */
	private String _subscriptionID;
	
	/** <i>Generated variable</i> - Variable of <code>PaymentTransactionEntry.code</code> attribute defined at extension <code>payment</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>PaymentTransactionEntry.versionID</code> attribute defined at extension <code>payment</code>. */
	private String _versionID;
	
	/** <i>Generated variable</i> - Variable of <code>PaymentTransactionEntry.paymentTransaction</code> attribute defined at extension <code>payment</code>. */
	private PaymentTransactionModel _paymentTransaction;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PaymentTransactionEntryModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PaymentTransactionEntryModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>PaymentTransactionEntry</code> at extension <code>payment</code>
	 */
	@Deprecated
	public PaymentTransactionEntryModel(final String _code)
	{
		super();
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>PaymentTransactionEntry</code> at extension <code>payment</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _versionID initial attribute declared by type <code>PaymentTransactionEntry</code> at extension <code>payment</code>
	 */
	@Deprecated
	public PaymentTransactionEntryModel(final String _code, final ItemModel _owner, final String _versionID)
	{
		super();
		setCode(_code);
		setOwner(_owner);
		setVersionID(_versionID);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTransactionEntry.amount</code> attribute defined at extension <code>payment</code>. 
	 * @return the amount
	 */
	public BigDecimal getAmount()
	{
		if (this._amount!=null)
		{
			return _amount;
		}
		return _amount = getPersistenceContext().getValue(AMOUNT, _amount);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTransactionEntry.code</code> attribute defined at extension <code>payment</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>PaymentTransactionEntry.currency</code> attribute defined at extension <code>payment</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>PaymentTransactionEntry.paymentTransaction</code> attribute defined at extension <code>payment</code>. 
	 * @return the paymentTransaction
	 */
	public PaymentTransactionModel getPaymentTransaction()
	{
		if (this._paymentTransaction!=null)
		{
			return _paymentTransaction;
		}
		return _paymentTransaction = getPersistenceContext().getValue(PAYMENTTRANSACTION, _paymentTransaction);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTransactionEntry.requestId</code> attribute defined at extension <code>payment</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>PaymentTransactionEntry.requestToken</code> attribute defined at extension <code>payment</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>PaymentTransactionEntry.subscriptionID</code> attribute defined at extension <code>payment</code>. 
	 * @return the subscriptionID
	 */
	public String getSubscriptionID()
	{
		if (this._subscriptionID!=null)
		{
			return _subscriptionID;
		}
		return _subscriptionID = getPersistenceContext().getValue(SUBSCRIPTIONID, _subscriptionID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTransactionEntry.time</code> attribute defined at extension <code>payment</code>. 
	 * @return the time
	 */
	public Date getTime()
	{
		if (this._time!=null)
		{
			return _time;
		}
		return _time = getPersistenceContext().getValue(TIME, _time);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTransactionEntry.transactionStatus</code> attribute defined at extension <code>payment</code>. 
	 * @return the transactionStatus
	 */
	public String getTransactionStatus()
	{
		if (this._transactionStatus!=null)
		{
			return _transactionStatus;
		}
		return _transactionStatus = getPersistenceContext().getValue(TRANSACTIONSTATUS, _transactionStatus);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTransactionEntry.transactionStatusDetails</code> attribute defined at extension <code>payment</code>. 
	 * @return the transactionStatusDetails
	 */
	public String getTransactionStatusDetails()
	{
		if (this._transactionStatusDetails!=null)
		{
			return _transactionStatusDetails;
		}
		return _transactionStatusDetails = getPersistenceContext().getValue(TRANSACTIONSTATUSDETAILS, _transactionStatusDetails);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTransactionEntry.type</code> attribute defined at extension <code>payment</code>. 
	 * @return the type
	 */
	public PaymentTransactionType getType()
	{
		if (this._type!=null)
		{
			return _type;
		}
		return _type = getPersistenceContext().getValue(TYPE, _type);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTransactionEntry.versionID</code> attribute defined at extension <code>payment</code>. 
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
	 * <i>Generated method</i> - Setter of <code>PaymentTransactionEntry.amount</code> attribute defined at extension <code>payment</code>. 
	 *  
	 * @param value the amount
	 */
	public void setAmount(final BigDecimal value)
	{
		_amount = getPersistenceContext().setValue(AMOUNT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PaymentTransactionEntry.code</code> attribute defined at extension <code>payment</code>. 
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PaymentTransactionEntry.currency</code> attribute defined at extension <code>payment</code>. 
	 *  
	 * @param value the currency
	 */
	public void setCurrency(final CurrencyModel value)
	{
		_currency = getPersistenceContext().setValue(CURRENCY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PaymentTransactionEntry.paymentTransaction</code> attribute defined at extension <code>payment</code>. 
	 *  
	 * @param value the paymentTransaction
	 */
	public void setPaymentTransaction(final PaymentTransactionModel value)
	{
		_paymentTransaction = getPersistenceContext().setValue(PAYMENTTRANSACTION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PaymentTransactionEntry.requestId</code> attribute defined at extension <code>payment</code>. 
	 *  
	 * @param value the requestId
	 */
	public void setRequestId(final String value)
	{
		_requestId = getPersistenceContext().setValue(REQUESTID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PaymentTransactionEntry.requestToken</code> attribute defined at extension <code>payment</code>. 
	 *  
	 * @param value the requestToken
	 */
	public void setRequestToken(final String value)
	{
		_requestToken = getPersistenceContext().setValue(REQUESTTOKEN, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PaymentTransactionEntry.subscriptionID</code> attribute defined at extension <code>payment</code>. 
	 *  
	 * @param value the subscriptionID
	 */
	public void setSubscriptionID(final String value)
	{
		_subscriptionID = getPersistenceContext().setValue(SUBSCRIPTIONID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PaymentTransactionEntry.time</code> attribute defined at extension <code>payment</code>. 
	 *  
	 * @param value the time
	 */
	public void setTime(final Date value)
	{
		_time = getPersistenceContext().setValue(TIME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PaymentTransactionEntry.transactionStatus</code> attribute defined at extension <code>payment</code>. 
	 *  
	 * @param value the transactionStatus
	 */
	public void setTransactionStatus(final String value)
	{
		_transactionStatus = getPersistenceContext().setValue(TRANSACTIONSTATUS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PaymentTransactionEntry.transactionStatusDetails</code> attribute defined at extension <code>payment</code>. 
	 *  
	 * @param value the transactionStatusDetails
	 */
	public void setTransactionStatusDetails(final String value)
	{
		_transactionStatusDetails = getPersistenceContext().setValue(TRANSACTIONSTATUSDETAILS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PaymentTransactionEntry.type</code> attribute defined at extension <code>payment</code>. 
	 *  
	 * @param value the type
	 */
	public void setType(final PaymentTransactionType value)
	{
		_type = getPersistenceContext().setValue(TYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>PaymentTransactionEntry.versionID</code> attribute defined at extension <code>payment</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the versionID
	 */
	public void setVersionID(final String value)
	{
		_versionID = getPersistenceContext().setValue(VERSIONID, value);
	}
	
}
