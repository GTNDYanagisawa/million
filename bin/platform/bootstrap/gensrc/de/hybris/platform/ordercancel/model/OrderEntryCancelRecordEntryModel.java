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
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.ordermodify.model.OrderEntryModificationRecordEntryModel;
import de.hybris.platform.ordermodify.model.OrderModificationRecordEntryModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type OrderEntryCancelRecordEntry first defined at extension basecommerce.
 */
@SuppressWarnings("all")
public class OrderEntryCancelRecordEntryModel extends OrderEntryModificationRecordEntryModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "OrderEntryCancelRecordEntry";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderEntryCancelRecordEntry.cancelRequestQuantity</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CANCELREQUESTQUANTITY = "cancelRequestQuantity";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderEntryCancelRecordEntry.cancelledQuantity</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CANCELLEDQUANTITY = "cancelledQuantity";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderEntryCancelRecordEntry.cancelReason</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CANCELREASON = "cancelReason";
	
	
	/** <i>Generated variable</i> - Variable of <code>OrderEntryCancelRecordEntry.cancelRequestQuantity</code> attribute defined at extension <code>basecommerce</code>. */
	private Integer _cancelRequestQuantity;
	
	/** <i>Generated variable</i> - Variable of <code>OrderEntryCancelRecordEntry.cancelledQuantity</code> attribute defined at extension <code>basecommerce</code>. */
	private Integer _cancelledQuantity;
	
	/** <i>Generated variable</i> - Variable of <code>OrderEntryCancelRecordEntry.cancelReason</code> attribute defined at extension <code>basecommerce</code>. */
	private CancelReason _cancelReason;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public OrderEntryCancelRecordEntryModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public OrderEntryCancelRecordEntryModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>OrderEntryModificationRecordEntry</code> at extension <code>basecommerce</code>
	 * @param _modificationRecordEntry initial attribute declared by type <code>OrderEntryModificationRecordEntry</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public OrderEntryCancelRecordEntryModel(final String _code, final OrderModificationRecordEntryModel _modificationRecordEntry)
	{
		super();
		setCode(_code);
		setModificationRecordEntry(_modificationRecordEntry);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>OrderEntryModificationRecordEntry</code> at extension <code>basecommerce</code>
	 * @param _modificationRecordEntry initial attribute declared by type <code>OrderEntryModificationRecordEntry</code> at extension <code>basecommerce</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public OrderEntryCancelRecordEntryModel(final String _code, final OrderModificationRecordEntryModel _modificationRecordEntry, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setModificationRecordEntry(_modificationRecordEntry);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderEntryCancelRecordEntry.cancelledQuantity</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the cancelledQuantity
	 */
	public Integer getCancelledQuantity()
	{
		if (this._cancelledQuantity!=null)
		{
			return _cancelledQuantity;
		}
		return _cancelledQuantity = getPersistenceContext().getValue(CANCELLEDQUANTITY, _cancelledQuantity);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderEntryCancelRecordEntry.cancelReason</code> attribute defined at extension <code>basecommerce</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>OrderEntryCancelRecordEntry.cancelRequestQuantity</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the cancelRequestQuantity
	 */
	public Integer getCancelRequestQuantity()
	{
		if (this._cancelRequestQuantity!=null)
		{
			return _cancelRequestQuantity;
		}
		return _cancelRequestQuantity = getPersistenceContext().getValue(CANCELREQUESTQUANTITY, _cancelRequestQuantity);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderEntryCancelRecordEntry.cancelledQuantity</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the cancelledQuantity
	 */
	public void setCancelledQuantity(final Integer value)
	{
		_cancelledQuantity = getPersistenceContext().setValue(CANCELLEDQUANTITY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderEntryCancelRecordEntry.cancelReason</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the cancelReason
	 */
	public void setCancelReason(final CancelReason value)
	{
		_cancelReason = getPersistenceContext().setValue(CANCELREASON, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderEntryCancelRecordEntry.cancelRequestQuantity</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the cancelRequestQuantity
	 */
	public void setCancelRequestQuantity(final Integer value)
	{
		_cancelRequestQuantity = getPersistenceContext().setValue(CANCELREQUESTQUANTITY, value);
	}
	
}
