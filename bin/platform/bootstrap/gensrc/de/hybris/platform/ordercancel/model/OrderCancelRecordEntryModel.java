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
package de.hybris.platform.ordercancel.model;

import de.hybris.platform.basecommerce.enums.CancelReason;
import de.hybris.platform.basecommerce.enums.OrderCancelEntryStatus;
import de.hybris.platform.basecommerce.enums.OrderModificationEntryStatus;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.orderhistory.model.OrderHistoryEntryModel;
import de.hybris.platform.ordermodify.model.OrderModificationRecordEntryModel;
import de.hybris.platform.ordermodify.model.OrderModificationRecordModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Date;

/**
 * Generated model class for type OrderCancelRecordEntry first defined at extension basecommerce.
 */
@SuppressWarnings("all")
public class OrderCancelRecordEntryModel extends OrderModificationRecordEntryModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "OrderCancelRecordEntry";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderCancelRecordEntry.refusedMessage</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String REFUSEDMESSAGE = "refusedMessage";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderCancelRecordEntry.cancelResult</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CANCELRESULT = "cancelResult";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderCancelRecordEntry.cancelReason</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CANCELREASON = "cancelReason";
	
	
	/** <i>Generated variable</i> - Variable of <code>OrderCancelRecordEntry.refusedMessage</code> attribute defined at extension <code>basecommerce</code>. */
	private String _refusedMessage;
	
	/** <i>Generated variable</i> - Variable of <code>OrderCancelRecordEntry.cancelResult</code> attribute defined at extension <code>basecommerce</code>. */
	private OrderCancelEntryStatus _cancelResult;
	
	/** <i>Generated variable</i> - Variable of <code>OrderCancelRecordEntry.cancelReason</code> attribute defined at extension <code>basecommerce</code>. */
	private CancelReason _cancelReason;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public OrderCancelRecordEntryModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public OrderCancelRecordEntryModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>OrderModificationRecordEntry</code> at extension <code>basecommerce</code>
	 * @param _modificationRecord initial attribute declared by type <code>OrderModificationRecordEntry</code> at extension <code>basecommerce</code>
	 * @param _originalVersion initial attribute declared by type <code>OrderModificationRecordEntry</code> at extension <code>basecommerce</code>
	 * @param _status initial attribute declared by type <code>OrderModificationRecordEntry</code> at extension <code>basecommerce</code>
	 * @param _timestamp initial attribute declared by type <code>OrderModificationRecordEntry</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public OrderCancelRecordEntryModel(final String _code, final OrderModificationRecordModel _modificationRecord, final OrderHistoryEntryModel _originalVersion, final OrderModificationEntryStatus _status, final Date _timestamp)
	{
		super();
		setCode(_code);
		setModificationRecord(_modificationRecord);
		setOriginalVersion(_originalVersion);
		setStatus(_status);
		setTimestamp(_timestamp);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>OrderModificationRecordEntry</code> at extension <code>basecommerce</code>
	 * @param _modificationRecord initial attribute declared by type <code>OrderModificationRecordEntry</code> at extension <code>basecommerce</code>
	 * @param _originalVersion initial attribute declared by type <code>OrderModificationRecordEntry</code> at extension <code>basecommerce</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _status initial attribute declared by type <code>OrderModificationRecordEntry</code> at extension <code>basecommerce</code>
	 * @param _timestamp initial attribute declared by type <code>OrderModificationRecordEntry</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public OrderCancelRecordEntryModel(final String _code, final OrderModificationRecordModel _modificationRecord, final OrderHistoryEntryModel _originalVersion, final ItemModel _owner, final OrderModificationEntryStatus _status, final Date _timestamp)
	{
		super();
		setCode(_code);
		setModificationRecord(_modificationRecord);
		setOriginalVersion(_originalVersion);
		setOwner(_owner);
		setStatus(_status);
		setTimestamp(_timestamp);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderCancelRecordEntry.cancelReason</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the cancelReason
	 */
	public CancelReason getCancelReason()
	{
		if (this._cancelReason!=null)
		{
			return _cancelReason;
		}
		return _cancelReason = getPersistenceContext().getValue(CANCELREASON, _cancelReason);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderCancelRecordEntry.cancelResult</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the cancelResult
	 */
	public OrderCancelEntryStatus getCancelResult()
	{
		if (this._cancelResult!=null)
		{
			return _cancelResult;
		}
		return _cancelResult = getPersistenceContext().getValue(CANCELRESULT, _cancelResult);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderCancelRecordEntry.refusedMessage</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the refusedMessage
	 */
	public String getRefusedMessage()
	{
		if (this._refusedMessage!=null)
		{
			return _refusedMessage;
		}
		return _refusedMessage = getPersistenceContext().getValue(REFUSEDMESSAGE, _refusedMessage);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderCancelRecordEntry.cancelReason</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the cancelReason
	 */
	public void setCancelReason(final CancelReason value)
	{
		_cancelReason = getPersistenceContext().setValue(CANCELREASON, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderCancelRecordEntry.cancelResult</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the cancelResult
	 */
	public void setCancelResult(final OrderCancelEntryStatus value)
	{
		_cancelResult = getPersistenceContext().setValue(CANCELRESULT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderCancelRecordEntry.refusedMessage</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the refusedMessage
	 */
	public void setRefusedMessage(final String value)
	{
		_refusedMessage = getPersistenceContext().setValue(REFUSEDMESSAGE, value);
	}
	
}
