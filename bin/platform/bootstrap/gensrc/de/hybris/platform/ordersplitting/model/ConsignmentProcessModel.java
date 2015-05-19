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
package de.hybris.platform.ordersplitting.model;

import de.hybris.platform.commerceservices.enums.WarehouseConsignmentState;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.orderprocessing.model.OrderProcessModel;
import de.hybris.platform.ordersplitting.model.ConsignmentModel;
import de.hybris.platform.processengine.model.BusinessProcessModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type ConsignmentProcess first defined at extension basecommerce.
 */
@SuppressWarnings("all")
public class ConsignmentProcessModel extends BusinessProcessModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ConsignmentProcess";
	
	/**<i>Generated relation code constant for relation <code>Consignment2ConsignmentProcess</code> defining source attribute <code>consignment</code> in extension <code>basecommerce</code>.</i>*/
	public final static String _CONSIGNMENT2CONSIGNMENTPROCESS = "Consignment2ConsignmentProcess";
	
	/**<i>Generated relation code constant for relation <code>OrderProcess2ConsignmentProcess</code> defining source attribute <code>parentProcess</code> in extension <code>basecommerce</code>.</i>*/
	public final static String _ORDERPROCESS2CONSIGNMENTPROCESS = "OrderProcess2ConsignmentProcess";
	
	/** <i>Generated constant</i> - Attribute key of <code>ConsignmentProcess.consignment</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CONSIGNMENT = "consignment";
	
	/** <i>Generated constant</i> - Attribute key of <code>ConsignmentProcess.parentProcess</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String PARENTPROCESS = "parentProcess";
	
	/** <i>Generated constant</i> - Attribute key of <code>ConsignmentProcess.done</code> attribute defined at extension <code>merchandisefulfilmentprocess</code>. */
	public static final String DONE = "done";
	
	/** <i>Generated constant</i> - Attribute key of <code>ConsignmentProcess.waitingForConsignment</code> attribute defined at extension <code>merchandisefulfilmentprocess</code>. */
	public static final String WAITINGFORCONSIGNMENT = "waitingForConsignment";
	
	/** <i>Generated constant</i> - Attribute key of <code>ConsignmentProcess.warehouseConsignmentState</code> attribute defined at extension <code>merchandisefulfilmentprocess</code>. */
	public static final String WAREHOUSECONSIGNMENTSTATE = "warehouseConsignmentState";
	
	
	/** <i>Generated variable</i> - Variable of <code>ConsignmentProcess.consignment</code> attribute defined at extension <code>basecommerce</code>. */
	private ConsignmentModel _consignment;
	
	/** <i>Generated variable</i> - Variable of <code>ConsignmentProcess.parentProcess</code> attribute defined at extension <code>basecommerce</code>. */
	private OrderProcessModel _parentProcess;
	
	/** <i>Generated variable</i> - Variable of <code>ConsignmentProcess.done</code> attribute defined at extension <code>merchandisefulfilmentprocess</code>. */
	private Boolean _done;
	
	/** <i>Generated variable</i> - Variable of <code>ConsignmentProcess.waitingForConsignment</code> attribute defined at extension <code>merchandisefulfilmentprocess</code>. */
	private Boolean _waitingForConsignment;
	
	/** <i>Generated variable</i> - Variable of <code>ConsignmentProcess.warehouseConsignmentState</code> attribute defined at extension <code>merchandisefulfilmentprocess</code>. */
	private WarehouseConsignmentState _warehouseConsignmentState;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ConsignmentProcessModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ConsignmentProcessModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 * @param _processDefinitionName initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 */
	@Deprecated
	public ConsignmentProcessModel(final String _code, final String _processDefinitionName)
	{
		super();
		setCode(_code);
		setProcessDefinitionName(_processDefinitionName);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _processDefinitionName initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 */
	@Deprecated
	public ConsignmentProcessModel(final String _code, final ItemModel _owner, final String _processDefinitionName)
	{
		super();
		setCode(_code);
		setOwner(_owner);
		setProcessDefinitionName(_processDefinitionName);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConsignmentProcess.consignment</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the consignment
	 */
	public ConsignmentModel getConsignment()
	{
		if (this._consignment!=null)
		{
			return _consignment;
		}
		return _consignment = getPersistenceContext().getValue(CONSIGNMENT, _consignment);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConsignmentProcess.parentProcess</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the parentProcess
	 */
	public OrderProcessModel getParentProcess()
	{
		if (this._parentProcess!=null)
		{
			return _parentProcess;
		}
		return _parentProcess = getPersistenceContext().getValue(PARENTPROCESS, _parentProcess);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConsignmentProcess.warehouseConsignmentState</code> attribute defined at extension <code>merchandisefulfilmentprocess</code>. 
	 * @return the warehouseConsignmentState - State of warehouse process.
	 */
	public WarehouseConsignmentState getWarehouseConsignmentState()
	{
		if (this._warehouseConsignmentState!=null)
		{
			return _warehouseConsignmentState;
		}
		return _warehouseConsignmentState = getPersistenceContext().getValue(WAREHOUSECONSIGNMENTSTATE, _warehouseConsignmentState);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConsignmentProcess.done</code> attribute defined at extension <code>merchandisefulfilmentprocess</code>. 
	 * @return the done - Mark process as done
	 */
	public boolean isDone()
	{
		return toPrimitive( _done = getPersistenceContext().getValue(DONE, _done));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConsignmentProcess.waitingForConsignment</code> attribute defined at extension <code>merchandisefulfilmentprocess</code>. 
	 * @return the waitingForConsignment - Mark that process is waiting for consignment
	 */
	public boolean isWaitingForConsignment()
	{
		return toPrimitive( _waitingForConsignment = getPersistenceContext().getValue(WAITINGFORCONSIGNMENT, _waitingForConsignment));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ConsignmentProcess.consignment</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the consignment
	 */
	public void setConsignment(final ConsignmentModel value)
	{
		_consignment = getPersistenceContext().setValue(CONSIGNMENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ConsignmentProcess.done</code> attribute defined at extension <code>merchandisefulfilmentprocess</code>. 
	 *  
	 * @param value the done - Mark process as done
	 */
	public void setDone(final boolean value)
	{
		_done = getPersistenceContext().setValue(DONE, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ConsignmentProcess.parentProcess</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the parentProcess
	 */
	public void setParentProcess(final OrderProcessModel value)
	{
		_parentProcess = getPersistenceContext().setValue(PARENTPROCESS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ConsignmentProcess.waitingForConsignment</code> attribute defined at extension <code>merchandisefulfilmentprocess</code>. 
	 *  
	 * @param value the waitingForConsignment - Mark that process is waiting for consignment
	 */
	public void setWaitingForConsignment(final boolean value)
	{
		_waitingForConsignment = getPersistenceContext().setValue(WAITINGFORCONSIGNMENT, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ConsignmentProcess.warehouseConsignmentState</code> attribute defined at extension <code>merchandisefulfilmentprocess</code>. 
	 *  
	 * @param value the warehouseConsignmentState - State of warehouse process.
	 */
	public void setWarehouseConsignmentState(final WarehouseConsignmentState value)
	{
		_warehouseConsignmentState = getPersistenceContext().setValue(WAREHOUSECONSIGNMENTSTATE, value);
	}
	
}
