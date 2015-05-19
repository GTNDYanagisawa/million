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

import de.hybris.platform.basecommerce.enums.RefundReason;
import de.hybris.platform.basecommerce.enums.ReturnAction;
import de.hybris.platform.basecommerce.enums.ReturnStatus;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.returns.model.ReturnEntryModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Generated model class for type RefundEntry first defined at extension basecommerce.
 */
@SuppressWarnings("all")
public class RefundEntryModel extends ReturnEntryModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "RefundEntry";
	
	/** <i>Generated constant</i> - Attribute key of <code>RefundEntry.reason</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String REASON = "reason";
	
	/** <i>Generated constant</i> - Attribute key of <code>RefundEntry.amount</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String AMOUNT = "amount";
	
	/** <i>Generated constant</i> - Attribute key of <code>RefundEntry.currency</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CURRENCY = "currency";
	
	/** <i>Generated constant</i> - Attribute key of <code>RefundEntry.refundedDate</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String REFUNDEDDATE = "refundedDate";
	
	
	/** <i>Generated variable</i> - Variable of <code>RefundEntry.reason</code> attribute defined at extension <code>basecommerce</code>. */
	private RefundReason _reason;
	
	/** <i>Generated variable</i> - Variable of <code>RefundEntry.amount</code> attribute defined at extension <code>basecommerce</code>. */
	private BigDecimal _amount;
	
	/** <i>Generated variable</i> - Variable of <code>RefundEntry.currency</code> attribute defined at extension <code>basecommerce</code>. */
	private CurrencyModel _currency;
	
	/** <i>Generated variable</i> - Variable of <code>RefundEntry.refundedDate</code> attribute defined at extension <code>basecommerce</code>. */
	private Date _refundedDate;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public RefundEntryModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public RefundEntryModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _action initial attribute declared by type <code>ReturnEntry</code> at extension <code>basecommerce</code>
	 * @param _orderEntry initial attribute declared by type <code>ReturnEntry</code> at extension <code>basecommerce</code>
	 * @param _reason initial attribute declared by type <code>RefundEntry</code> at extension <code>basecommerce</code>
	 * @param _status initial attribute declared by type <code>ReturnEntry</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public RefundEntryModel(final ReturnAction _action, final AbstractOrderEntryModel _orderEntry, final RefundReason _reason, final ReturnStatus _status)
	{
		super();
		setAction(_action);
		setOrderEntry(_orderEntry);
		setReason(_reason);
		setStatus(_status);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _action initial attribute declared by type <code>ReturnEntry</code> at extension <code>basecommerce</code>
	 * @param _orderEntry initial attribute declared by type <code>ReturnEntry</code> at extension <code>basecommerce</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _reason initial attribute declared by type <code>RefundEntry</code> at extension <code>basecommerce</code>
	 * @param _status initial attribute declared by type <code>ReturnEntry</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public RefundEntryModel(final ReturnAction _action, final AbstractOrderEntryModel _orderEntry, final ItemModel _owner, final RefundReason _reason, final ReturnStatus _status)
	{
		super();
		setAction(_action);
		setOrderEntry(_orderEntry);
		setOwner(_owner);
		setReason(_reason);
		setStatus(_status);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RefundEntry.amount</code> attribute defined at extension <code>basecommerce</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>RefundEntry.currency</code> attribute defined at extension <code>basecommerce</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>RefundEntry.reason</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the reason
	 */
	public RefundReason getReason()
	{
		if (this._reason!=null)
		{
			return _reason;
		}
		return _reason = getPersistenceContext().getValue(REASON, _reason);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RefundEntry.refundedDate</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the refundedDate
	 */
	public Date getRefundedDate()
	{
		if (this._refundedDate!=null)
		{
			return _refundedDate;
		}
		return _refundedDate = getPersistenceContext().getValue(REFUNDEDDATE, _refundedDate);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>RefundEntry.amount</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the amount
	 */
	public void setAmount(final BigDecimal value)
	{
		_amount = getPersistenceContext().setValue(AMOUNT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>RefundEntry.reason</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the reason
	 */
	public void setReason(final RefundReason value)
	{
		_reason = getPersistenceContext().setValue(REASON, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>RefundEntry.refundedDate</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the refundedDate
	 */
	public void setRefundedDate(final Date value)
	{
		_refundedDate = getPersistenceContext().setValue(REFUNDEDDATE, value);
	}
	
}
