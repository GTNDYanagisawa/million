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

import de.hybris.platform.basecommerce.enums.OrderModificationEntryStatus;
import de.hybris.platform.basecommerce.enums.ReturnStatus;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.orderhistory.model.OrderHistoryEntryModel;
import de.hybris.platform.ordermodify.model.OrderModificationRecordEntryModel;
import de.hybris.platform.ordermodify.model.OrderModificationRecordModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Date;

/**
 * Generated model class for type OrderReturnRecordEntry first defined at extension basecommerce.
 */
@SuppressWarnings("all")
public class OrderReturnRecordEntryModel extends OrderModificationRecordEntryModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "OrderReturnRecordEntry";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderReturnRecordEntry.returnStatus</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String RETURNSTATUS = "returnStatus";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderReturnRecordEntry.expectedQuantity</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String EXPECTEDQUANTITY = "expectedQuantity";
	
	
	/** <i>Generated variable</i> - Variable of <code>OrderReturnRecordEntry.returnStatus</code> attribute defined at extension <code>basecommerce</code>. */
	private ReturnStatus _returnStatus;
	
	/** <i>Generated variable</i> - Variable of <code>OrderReturnRecordEntry.expectedQuantity</code> attribute defined at extension <code>basecommerce</code>. */
	private Long _expectedQuantity;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public OrderReturnRecordEntryModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public OrderReturnRecordEntryModel(final ItemModelContext ctx)
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
	public OrderReturnRecordEntryModel(final String _code, final OrderModificationRecordModel _modificationRecord, final OrderHistoryEntryModel _originalVersion, final OrderModificationEntryStatus _status, final Date _timestamp)
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
	public OrderReturnRecordEntryModel(final String _code, final OrderModificationRecordModel _modificationRecord, final OrderHistoryEntryModel _originalVersion, final ItemModel _owner, final OrderModificationEntryStatus _status, final Date _timestamp)
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
	 * <i>Generated method</i> - Getter of the <code>OrderReturnRecordEntry.expectedQuantity</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the expectedQuantity
	 */
	public Long getExpectedQuantity()
	{
		if (this._expectedQuantity!=null)
		{
			return _expectedQuantity;
		}
		return _expectedQuantity = getPersistenceContext().getValue(EXPECTEDQUANTITY, _expectedQuantity);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderReturnRecordEntry.returnStatus</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the returnStatus
	 */
	public ReturnStatus getReturnStatus()
	{
		if (this._returnStatus!=null)
		{
			return _returnStatus;
		}
		return _returnStatus = getPersistenceContext().getValue(RETURNSTATUS, _returnStatus);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderReturnRecordEntry.expectedQuantity</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the expectedQuantity
	 */
	public void setExpectedQuantity(final Long value)
	{
		_expectedQuantity = getPersistenceContext().setValue(EXPECTEDQUANTITY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderReturnRecordEntry.returnStatus</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the returnStatus
	 */
	public void setReturnStatus(final ReturnStatus value)
	{
		_returnStatus = getPersistenceContext().setValue(RETURNSTATUS, value);
	}
	
}
