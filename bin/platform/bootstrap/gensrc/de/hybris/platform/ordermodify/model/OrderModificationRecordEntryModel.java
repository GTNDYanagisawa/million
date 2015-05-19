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
package de.hybris.platform.ordermodify.model;

import de.hybris.platform.basecommerce.enums.OrderModificationEntryStatus;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.security.PrincipalModel;
import de.hybris.platform.orderhistory.model.OrderHistoryEntryModel;
import de.hybris.platform.ordermodify.model.OrderEntryModificationRecordEntryModel;
import de.hybris.platform.ordermodify.model.OrderModificationRecordModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Date;

/**
 * Generated model class for type OrderModificationRecordEntry first defined at extension basecommerce.
 */
@SuppressWarnings("all")
public class OrderModificationRecordEntryModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "OrderModificationRecordEntry";
	
	/**<i>Generated relation code constant for relation <code>OrderModificationRecord2OrderModificationRecordEntries</code> defining source attribute <code>modificationRecord</code> in extension <code>basecommerce</code>.</i>*/
	public final static String _ORDERMODIFICATIONRECORD2ORDERMODIFICATIONRECORDENTRIES = "OrderModificationRecord2OrderModificationRecordEntries";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderModificationRecordEntry.code</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderModificationRecordEntry.timestamp</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String TIMESTAMP = "timestamp";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderModificationRecordEntry.status</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String STATUS = "status";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderModificationRecordEntry.originalVersion</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String ORIGINALVERSION = "originalVersion";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderModificationRecordEntry.principal</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String PRINCIPAL = "principal";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderModificationRecordEntry.failedMessage</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String FAILEDMESSAGE = "failedMessage";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderModificationRecordEntry.notes</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String NOTES = "notes";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderModificationRecordEntry.modificationRecord</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String MODIFICATIONRECORD = "modificationRecord";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderModificationRecordEntry.orderEntriesModificationEntries</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String ORDERENTRIESMODIFICATIONENTRIES = "orderEntriesModificationEntries";
	
	
	/** <i>Generated variable</i> - Variable of <code>OrderModificationRecordEntry.code</code> attribute defined at extension <code>basecommerce</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>OrderModificationRecordEntry.timestamp</code> attribute defined at extension <code>basecommerce</code>. */
	private Date _timestamp;
	
	/** <i>Generated variable</i> - Variable of <code>OrderModificationRecordEntry.status</code> attribute defined at extension <code>basecommerce</code>. */
	private OrderModificationEntryStatus _status;
	
	/** <i>Generated variable</i> - Variable of <code>OrderModificationRecordEntry.originalVersion</code> attribute defined at extension <code>basecommerce</code>. */
	private OrderHistoryEntryModel _originalVersion;
	
	/** <i>Generated variable</i> - Variable of <code>OrderModificationRecordEntry.principal</code> attribute defined at extension <code>basecommerce</code>. */
	private PrincipalModel _principal;
	
	/** <i>Generated variable</i> - Variable of <code>OrderModificationRecordEntry.failedMessage</code> attribute defined at extension <code>basecommerce</code>. */
	private String _failedMessage;
	
	/** <i>Generated variable</i> - Variable of <code>OrderModificationRecordEntry.notes</code> attribute defined at extension <code>basecommerce</code>. */
	private String _notes;
	
	/** <i>Generated variable</i> - Variable of <code>OrderModificationRecordEntry.modificationRecord</code> attribute defined at extension <code>basecommerce</code>. */
	private OrderModificationRecordModel _modificationRecord;
	
	/** <i>Generated variable</i> - Variable of <code>OrderModificationRecordEntry.orderEntriesModificationEntries</code> attribute defined at extension <code>basecommerce</code>. */
	private Collection<OrderEntryModificationRecordEntryModel> _orderEntriesModificationEntries;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public OrderModificationRecordEntryModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public OrderModificationRecordEntryModel(final ItemModelContext ctx)
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
	public OrderModificationRecordEntryModel(final String _code, final OrderModificationRecordModel _modificationRecord, final OrderHistoryEntryModel _originalVersion, final OrderModificationEntryStatus _status, final Date _timestamp)
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
	public OrderModificationRecordEntryModel(final String _code, final OrderModificationRecordModel _modificationRecord, final OrderHistoryEntryModel _originalVersion, final ItemModel _owner, final OrderModificationEntryStatus _status, final Date _timestamp)
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
	 * <i>Generated method</i> - Getter of the <code>OrderModificationRecordEntry.code</code> attribute defined at extension <code>basecommerce</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>OrderModificationRecordEntry.failedMessage</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the failedMessage
	 */
	public String getFailedMessage()
	{
		if (this._failedMessage!=null)
		{
			return _failedMessage;
		}
		return _failedMessage = getPersistenceContext().getValue(FAILEDMESSAGE, _failedMessage);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderModificationRecordEntry.modificationRecord</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the modificationRecord
	 */
	public OrderModificationRecordModel getModificationRecord()
	{
		if (this._modificationRecord!=null)
		{
			return _modificationRecord;
		}
		return _modificationRecord = getPersistenceContext().getValue(MODIFICATIONRECORD, _modificationRecord);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderModificationRecordEntry.notes</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the notes
	 */
	public String getNotes()
	{
		if (this._notes!=null)
		{
			return _notes;
		}
		return _notes = getPersistenceContext().getValue(NOTES, _notes);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderModificationRecordEntry.orderEntriesModificationEntries</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the orderEntriesModificationEntries
	 */
	public Collection<OrderEntryModificationRecordEntryModel> getOrderEntriesModificationEntries()
	{
		if (this._orderEntriesModificationEntries!=null)
		{
			return _orderEntriesModificationEntries;
		}
		return _orderEntriesModificationEntries = getPersistenceContext().getValue(ORDERENTRIESMODIFICATIONENTRIES, _orderEntriesModificationEntries);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderModificationRecordEntry.originalVersion</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the originalVersion
	 */
	public OrderHistoryEntryModel getOriginalVersion()
	{
		if (this._originalVersion!=null)
		{
			return _originalVersion;
		}
		return _originalVersion = getPersistenceContext().getValue(ORIGINALVERSION, _originalVersion);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderModificationRecordEntry.principal</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the principal
	 */
	public PrincipalModel getPrincipal()
	{
		if (this._principal!=null)
		{
			return _principal;
		}
		return _principal = getPersistenceContext().getValue(PRINCIPAL, _principal);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderModificationRecordEntry.status</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the status
	 */
	public OrderModificationEntryStatus getStatus()
	{
		if (this._status!=null)
		{
			return _status;
		}
		return _status = getPersistenceContext().getValue(STATUS, _status);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderModificationRecordEntry.timestamp</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the timestamp
	 */
	public Date getTimestamp()
	{
		if (this._timestamp!=null)
		{
			return _timestamp;
		}
		return _timestamp = getPersistenceContext().getValue(TIMESTAMP, _timestamp);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderModificationRecordEntry.code</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderModificationRecordEntry.failedMessage</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the failedMessage
	 */
	public void setFailedMessage(final String value)
	{
		_failedMessage = getPersistenceContext().setValue(FAILEDMESSAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderModificationRecordEntry.modificationRecord</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the modificationRecord
	 */
	public void setModificationRecord(final OrderModificationRecordModel value)
	{
		_modificationRecord = getPersistenceContext().setValue(MODIFICATIONRECORD, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderModificationRecordEntry.notes</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the notes
	 */
	public void setNotes(final String value)
	{
		_notes = getPersistenceContext().setValue(NOTES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderModificationRecordEntry.orderEntriesModificationEntries</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the orderEntriesModificationEntries
	 */
	public void setOrderEntriesModificationEntries(final Collection<OrderEntryModificationRecordEntryModel> value)
	{
		_orderEntriesModificationEntries = getPersistenceContext().setValue(ORDERENTRIESMODIFICATIONENTRIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>OrderModificationRecordEntry.originalVersion</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the originalVersion
	 */
	public void setOriginalVersion(final OrderHistoryEntryModel value)
	{
		_originalVersion = getPersistenceContext().setValue(ORIGINALVERSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderModificationRecordEntry.principal</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the principal
	 */
	public void setPrincipal(final PrincipalModel value)
	{
		_principal = getPersistenceContext().setValue(PRINCIPAL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderModificationRecordEntry.status</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the status
	 */
	public void setStatus(final OrderModificationEntryStatus value)
	{
		_status = getPersistenceContext().setValue(STATUS, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>OrderModificationRecordEntry.timestamp</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the timestamp
	 */
	public void setTimestamp(final Date value)
	{
		_timestamp = getPersistenceContext().setValue(TIMESTAMP, value);
	}
	
}
