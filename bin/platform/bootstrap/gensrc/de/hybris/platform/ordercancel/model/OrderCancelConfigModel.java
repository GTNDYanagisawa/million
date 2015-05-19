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

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type OrderCancelConfig first defined at extension basecommerce.
 */
@SuppressWarnings("all")
public class OrderCancelConfigModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "OrderCancelConfig";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderCancelConfig.orderCancelAllowed</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String ORDERCANCELALLOWED = "orderCancelAllowed";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderCancelConfig.cancelAfterWarehouseAllowed</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CANCELAFTERWAREHOUSEALLOWED = "cancelAfterWarehouseAllowed";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderCancelConfig.completeCancelAfterShippingStartedAllowed</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String COMPLETECANCELAFTERSHIPPINGSTARTEDALLOWED = "completeCancelAfterShippingStartedAllowed";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderCancelConfig.partialCancelAllowed</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String PARTIALCANCELALLOWED = "partialCancelAllowed";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderCancelConfig.partialOrderEntryCancelAllowed</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String PARTIALORDERENTRYCANCELALLOWED = "partialOrderEntryCancelAllowed";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderCancelConfig.queuedOrderWaitingTime</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String QUEUEDORDERWAITINGTIME = "queuedOrderWaitingTime";
	
	
	/** <i>Generated variable</i> - Variable of <code>OrderCancelConfig.orderCancelAllowed</code> attribute defined at extension <code>basecommerce</code>. */
	private Boolean _orderCancelAllowed;
	
	/** <i>Generated variable</i> - Variable of <code>OrderCancelConfig.cancelAfterWarehouseAllowed</code> attribute defined at extension <code>basecommerce</code>. */
	private Boolean _cancelAfterWarehouseAllowed;
	
	/** <i>Generated variable</i> - Variable of <code>OrderCancelConfig.completeCancelAfterShippingStartedAllowed</code> attribute defined at extension <code>basecommerce</code>. */
	private Boolean _completeCancelAfterShippingStartedAllowed;
	
	/** <i>Generated variable</i> - Variable of <code>OrderCancelConfig.partialCancelAllowed</code> attribute defined at extension <code>basecommerce</code>. */
	private Boolean _partialCancelAllowed;
	
	/** <i>Generated variable</i> - Variable of <code>OrderCancelConfig.partialOrderEntryCancelAllowed</code> attribute defined at extension <code>basecommerce</code>. */
	private Boolean _partialOrderEntryCancelAllowed;
	
	/** <i>Generated variable</i> - Variable of <code>OrderCancelConfig.queuedOrderWaitingTime</code> attribute defined at extension <code>basecommerce</code>. */
	private Integer _queuedOrderWaitingTime;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public OrderCancelConfigModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public OrderCancelConfigModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _cancelAfterWarehouseAllowed initial attribute declared by type <code>OrderCancelConfig</code> at extension <code>basecommerce</code>
	 * @param _completeCancelAfterShippingStartedAllowed initial attribute declared by type <code>OrderCancelConfig</code> at extension <code>basecommerce</code>
	 * @param _orderCancelAllowed initial attribute declared by type <code>OrderCancelConfig</code> at extension <code>basecommerce</code>
	 * @param _partialCancelAllowed initial attribute declared by type <code>OrderCancelConfig</code> at extension <code>basecommerce</code>
	 * @param _partialOrderEntryCancelAllowed initial attribute declared by type <code>OrderCancelConfig</code> at extension <code>basecommerce</code>
	 * @param _queuedOrderWaitingTime initial attribute declared by type <code>OrderCancelConfig</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public OrderCancelConfigModel(final boolean _cancelAfterWarehouseAllowed, final boolean _completeCancelAfterShippingStartedAllowed, final boolean _orderCancelAllowed, final boolean _partialCancelAllowed, final boolean _partialOrderEntryCancelAllowed, final int _queuedOrderWaitingTime)
	{
		super();
		setCancelAfterWarehouseAllowed(_cancelAfterWarehouseAllowed);
		setCompleteCancelAfterShippingStartedAllowed(_completeCancelAfterShippingStartedAllowed);
		setOrderCancelAllowed(_orderCancelAllowed);
		setPartialCancelAllowed(_partialCancelAllowed);
		setPartialOrderEntryCancelAllowed(_partialOrderEntryCancelAllowed);
		setQueuedOrderWaitingTime(_queuedOrderWaitingTime);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _cancelAfterWarehouseAllowed initial attribute declared by type <code>OrderCancelConfig</code> at extension <code>basecommerce</code>
	 * @param _completeCancelAfterShippingStartedAllowed initial attribute declared by type <code>OrderCancelConfig</code> at extension <code>basecommerce</code>
	 * @param _orderCancelAllowed initial attribute declared by type <code>OrderCancelConfig</code> at extension <code>basecommerce</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _partialCancelAllowed initial attribute declared by type <code>OrderCancelConfig</code> at extension <code>basecommerce</code>
	 * @param _partialOrderEntryCancelAllowed initial attribute declared by type <code>OrderCancelConfig</code> at extension <code>basecommerce</code>
	 * @param _queuedOrderWaitingTime initial attribute declared by type <code>OrderCancelConfig</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public OrderCancelConfigModel(final boolean _cancelAfterWarehouseAllowed, final boolean _completeCancelAfterShippingStartedAllowed, final boolean _orderCancelAllowed, final ItemModel _owner, final boolean _partialCancelAllowed, final boolean _partialOrderEntryCancelAllowed, final int _queuedOrderWaitingTime)
	{
		super();
		setCancelAfterWarehouseAllowed(_cancelAfterWarehouseAllowed);
		setCompleteCancelAfterShippingStartedAllowed(_completeCancelAfterShippingStartedAllowed);
		setOrderCancelAllowed(_orderCancelAllowed);
		setOwner(_owner);
		setPartialCancelAllowed(_partialCancelAllowed);
		setPartialOrderEntryCancelAllowed(_partialOrderEntryCancelAllowed);
		setQueuedOrderWaitingTime(_queuedOrderWaitingTime);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderCancelConfig.queuedOrderWaitingTime</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the queuedOrderWaitingTime - Determines how long an order should wait in queue before it's started to be fullfilled
	 */
	public int getQueuedOrderWaitingTime()
	{
		return toPrimitive( _queuedOrderWaitingTime = getPersistenceContext().getValue(QUEUEDORDERWAITINGTIME, _queuedOrderWaitingTime));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderCancelConfig.cancelAfterWarehouseAllowed</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the cancelAfterWarehouseAllowed - Determines if the order cancelling is still possible after sending it to warehouse
	 */
	public boolean isCancelAfterWarehouseAllowed()
	{
		return toPrimitive( _cancelAfterWarehouseAllowed = getPersistenceContext().getValue(CANCELAFTERWAREHOUSEALLOWED, _cancelAfterWarehouseAllowed));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderCancelConfig.completeCancelAfterShippingStartedAllowed</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the completeCancelAfterShippingStartedAllowed - Determines if a complete cancel request is allowed after shipping has been started. This means: Cancel the part of the order that has not been shipped yet. Evaluated only if cancelAfterWarehouseAllowed is true.
	 */
	public boolean isCompleteCancelAfterShippingStartedAllowed()
	{
		return toPrimitive( _completeCancelAfterShippingStartedAllowed = getPersistenceContext().getValue(COMPLETECANCELAFTERSHIPPINGSTARTEDALLOWED, _completeCancelAfterShippingStartedAllowed));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderCancelConfig.orderCancelAllowed</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the orderCancelAllowed - Determines if the order cancelling is at all possible
	 */
	public boolean isOrderCancelAllowed()
	{
		return toPrimitive( _orderCancelAllowed = getPersistenceContext().getValue(ORDERCANCELALLOWED, _orderCancelAllowed));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderCancelConfig.partialCancelAllowed</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the partialCancelAllowed - Determines if the partial order cancelling (discarding whole order entries) is possible.
	 */
	public boolean isPartialCancelAllowed()
	{
		return toPrimitive( _partialCancelAllowed = getPersistenceContext().getValue(PARTIALCANCELALLOWED, _partialCancelAllowed));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderCancelConfig.partialOrderEntryCancelAllowed</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the partialOrderEntryCancelAllowed - Determines if the partial order entry cancelling (discarding parts of order entries) is possible.  This parameter is evaluated only if partialCancelAllowed is set to true.
	 */
	public boolean isPartialOrderEntryCancelAllowed()
	{
		return toPrimitive( _partialOrderEntryCancelAllowed = getPersistenceContext().getValue(PARTIALORDERENTRYCANCELALLOWED, _partialOrderEntryCancelAllowed));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderCancelConfig.cancelAfterWarehouseAllowed</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the cancelAfterWarehouseAllowed - Determines if the order cancelling is still possible after sending it to warehouse
	 */
	public void setCancelAfterWarehouseAllowed(final boolean value)
	{
		_cancelAfterWarehouseAllowed = getPersistenceContext().setValue(CANCELAFTERWAREHOUSEALLOWED, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderCancelConfig.completeCancelAfterShippingStartedAllowed</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the completeCancelAfterShippingStartedAllowed - Determines if a complete cancel request is allowed after shipping has been started. This means: Cancel the part of the order that has not been shipped yet. Evaluated only if cancelAfterWarehouseAllowed is true.
	 */
	public void setCompleteCancelAfterShippingStartedAllowed(final boolean value)
	{
		_completeCancelAfterShippingStartedAllowed = getPersistenceContext().setValue(COMPLETECANCELAFTERSHIPPINGSTARTEDALLOWED, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderCancelConfig.orderCancelAllowed</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the orderCancelAllowed - Determines if the order cancelling is at all possible
	 */
	public void setOrderCancelAllowed(final boolean value)
	{
		_orderCancelAllowed = getPersistenceContext().setValue(ORDERCANCELALLOWED, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderCancelConfig.partialCancelAllowed</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the partialCancelAllowed - Determines if the partial order cancelling (discarding whole order entries) is possible.
	 */
	public void setPartialCancelAllowed(final boolean value)
	{
		_partialCancelAllowed = getPersistenceContext().setValue(PARTIALCANCELALLOWED, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderCancelConfig.partialOrderEntryCancelAllowed</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the partialOrderEntryCancelAllowed - Determines if the partial order entry cancelling (discarding parts of order entries) is possible.  This parameter is evaluated only if partialCancelAllowed is set to true.
	 */
	public void setPartialOrderEntryCancelAllowed(final boolean value)
	{
		_partialOrderEntryCancelAllowed = getPersistenceContext().setValue(PARTIALORDERENTRYCANCELALLOWED, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderCancelConfig.queuedOrderWaitingTime</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the queuedOrderWaitingTime - Determines how long an order should wait in queue before it's started to be fullfilled
	 */
	public void setQueuedOrderWaitingTime(final int value)
	{
		_queuedOrderWaitingTime = getPersistenceContext().setValue(QUEUEDORDERWAITINGTIME, toObject(value));
	}
	
}
