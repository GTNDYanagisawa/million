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

import de.hybris.platform.basecommerce.enums.ReturnAction;
import de.hybris.platform.basecommerce.enums.ReturnStatus;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.returns.model.ReturnRequestModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Date;

/**
 * Generated model class for type ReturnEntry first defined at extension basecommerce.
 */
@SuppressWarnings("all")
public class ReturnEntryModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ReturnEntry";
	
	/**<i>Generated relation code constant for relation <code>ReturnRequest2ReturnEntry</code> defining source attribute <code>returnRequest</code> in extension <code>basecommerce</code>.</i>*/
	public final static String _RETURNREQUEST2RETURNENTRY = "ReturnRequest2ReturnEntry";
	
	/** <i>Generated constant</i> - Attribute key of <code>ReturnEntry.orderEntry</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String ORDERENTRY = "orderEntry";
	
	/** <i>Generated constant</i> - Attribute key of <code>ReturnEntry.expectedQuantity</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String EXPECTEDQUANTITY = "expectedQuantity";
	
	/** <i>Generated constant</i> - Attribute key of <code>ReturnEntry.receivedQuantity</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String RECEIVEDQUANTITY = "receivedQuantity";
	
	/** <i>Generated constant</i> - Attribute key of <code>ReturnEntry.reachedDate</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String REACHEDDATE = "reachedDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>ReturnEntry.status</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String STATUS = "status";
	
	/** <i>Generated constant</i> - Attribute key of <code>ReturnEntry.action</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String ACTION = "action";
	
	/** <i>Generated constant</i> - Attribute key of <code>ReturnEntry.notes</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String NOTES = "notes";
	
	/** <i>Generated constant</i> - Attribute key of <code>ReturnEntry.returnRequest</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String RETURNREQUEST = "returnRequest";
	
	
	/** <i>Generated variable</i> - Variable of <code>ReturnEntry.orderEntry</code> attribute defined at extension <code>basecommerce</code>. */
	private AbstractOrderEntryModel _orderEntry;
	
	/** <i>Generated variable</i> - Variable of <code>ReturnEntry.expectedQuantity</code> attribute defined at extension <code>basecommerce</code>. */
	private Long _expectedQuantity;
	
	/** <i>Generated variable</i> - Variable of <code>ReturnEntry.receivedQuantity</code> attribute defined at extension <code>basecommerce</code>. */
	private Long _receivedQuantity;
	
	/** <i>Generated variable</i> - Variable of <code>ReturnEntry.reachedDate</code> attribute defined at extension <code>basecommerce</code>. */
	private Date _reachedDate;
	
	/** <i>Generated variable</i> - Variable of <code>ReturnEntry.status</code> attribute defined at extension <code>basecommerce</code>. */
	private ReturnStatus _status;
	
	/** <i>Generated variable</i> - Variable of <code>ReturnEntry.action</code> attribute defined at extension <code>basecommerce</code>. */
	private ReturnAction _action;
	
	/** <i>Generated variable</i> - Variable of <code>ReturnEntry.notes</code> attribute defined at extension <code>basecommerce</code>. */
	private String _notes;
	
	/** <i>Generated variable</i> - Variable of <code>ReturnEntry.returnRequest</code> attribute defined at extension <code>basecommerce</code>. */
	private ReturnRequestModel _returnRequest;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ReturnEntryModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ReturnEntryModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _action initial attribute declared by type <code>ReturnEntry</code> at extension <code>basecommerce</code>
	 * @param _orderEntry initial attribute declared by type <code>ReturnEntry</code> at extension <code>basecommerce</code>
	 * @param _status initial attribute declared by type <code>ReturnEntry</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public ReturnEntryModel(final ReturnAction _action, final AbstractOrderEntryModel _orderEntry, final ReturnStatus _status)
	{
		super();
		setAction(_action);
		setOrderEntry(_orderEntry);
		setStatus(_status);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _action initial attribute declared by type <code>ReturnEntry</code> at extension <code>basecommerce</code>
	 * @param _orderEntry initial attribute declared by type <code>ReturnEntry</code> at extension <code>basecommerce</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _status initial attribute declared by type <code>ReturnEntry</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public ReturnEntryModel(final ReturnAction _action, final AbstractOrderEntryModel _orderEntry, final ItemModel _owner, final ReturnStatus _status)
	{
		super();
		setAction(_action);
		setOrderEntry(_orderEntry);
		setOwner(_owner);
		setStatus(_status);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReturnEntry.action</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the action
	 */
	public ReturnAction getAction()
	{
		if (this._action!=null)
		{
			return _action;
		}
		return _action = getPersistenceContext().getValue(ACTION, _action);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReturnEntry.expectedQuantity</code> attribute defined at extension <code>basecommerce</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>ReturnEntry.notes</code> attribute defined at extension <code>basecommerce</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>ReturnEntry.orderEntry</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the orderEntry
	 */
	public AbstractOrderEntryModel getOrderEntry()
	{
		if (this._orderEntry!=null)
		{
			return _orderEntry;
		}
		return _orderEntry = getPersistenceContext().getValue(ORDERENTRY, _orderEntry);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReturnEntry.reachedDate</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the reachedDate
	 */
	public Date getReachedDate()
	{
		if (this._reachedDate!=null)
		{
			return _reachedDate;
		}
		return _reachedDate = getPersistenceContext().getValue(REACHEDDATE, _reachedDate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReturnEntry.receivedQuantity</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the receivedQuantity
	 */
	public Long getReceivedQuantity()
	{
		if (this._receivedQuantity!=null)
		{
			return _receivedQuantity;
		}
		return _receivedQuantity = getPersistenceContext().getValue(RECEIVEDQUANTITY, _receivedQuantity);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReturnEntry.returnRequest</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the returnRequest
	 */
	public ReturnRequestModel getReturnRequest()
	{
		if (this._returnRequest!=null)
		{
			return _returnRequest;
		}
		return _returnRequest = getPersistenceContext().getValue(RETURNREQUEST, _returnRequest);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReturnEntry.status</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the status
	 */
	public ReturnStatus getStatus()
	{
		if (this._status!=null)
		{
			return _status;
		}
		return _status = getPersistenceContext().getValue(STATUS, _status);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ReturnEntry.action</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the action
	 */
	public void setAction(final ReturnAction value)
	{
		_action = getPersistenceContext().setValue(ACTION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ReturnEntry.expectedQuantity</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the expectedQuantity
	 */
	public void setExpectedQuantity(final Long value)
	{
		_expectedQuantity = getPersistenceContext().setValue(EXPECTEDQUANTITY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ReturnEntry.notes</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the notes
	 */
	public void setNotes(final String value)
	{
		_notes = getPersistenceContext().setValue(NOTES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ReturnEntry.orderEntry</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the orderEntry
	 */
	public void setOrderEntry(final AbstractOrderEntryModel value)
	{
		_orderEntry = getPersistenceContext().setValue(ORDERENTRY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ReturnEntry.reachedDate</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the reachedDate
	 */
	public void setReachedDate(final Date value)
	{
		_reachedDate = getPersistenceContext().setValue(REACHEDDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ReturnEntry.receivedQuantity</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the receivedQuantity
	 */
	public void setReceivedQuantity(final Long value)
	{
		_receivedQuantity = getPersistenceContext().setValue(RECEIVEDQUANTITY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ReturnEntry.returnRequest</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the returnRequest
	 */
	public void setReturnRequest(final ReturnRequestModel value)
	{
		_returnRequest = getPersistenceContext().setValue(RETURNREQUEST, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ReturnEntry.status</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the status
	 */
	public void setStatus(final ReturnStatus value)
	{
		_status = getPersistenceContext().setValue(STATUS, value);
	}
	
}
