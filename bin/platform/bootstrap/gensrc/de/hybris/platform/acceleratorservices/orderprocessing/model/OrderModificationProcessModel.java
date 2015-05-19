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
package de.hybris.platform.acceleratorservices.orderprocessing.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.ordermodify.model.OrderModificationRecordEntryModel;
import de.hybris.platform.orderprocessing.model.OrderProcessModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type OrderModificationProcess first defined at extension acceleratorservices.
 */
@SuppressWarnings("all")
public class OrderModificationProcessModel extends OrderProcessModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "OrderModificationProcess";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderModificationProcess.orderModificationRecordEntry</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String ORDERMODIFICATIONRECORDENTRY = "orderModificationRecordEntry";
	
	
	/** <i>Generated variable</i> - Variable of <code>OrderModificationProcess.orderModificationRecordEntry</code> attribute defined at extension <code>acceleratorservices</code>. */
	private OrderModificationRecordEntryModel _orderModificationRecordEntry;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public OrderModificationProcessModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public OrderModificationProcessModel(final ItemModelContext ctx)
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
	public OrderModificationProcessModel(final String _code, final String _processDefinitionName)
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
	public OrderModificationProcessModel(final String _code, final ItemModel _owner, final String _processDefinitionName)
	{
		super();
		setCode(_code);
		setOwner(_owner);
		setProcessDefinitionName(_processDefinitionName);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderModificationProcess.orderModificationRecordEntry</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the orderModificationRecordEntry - Object storing order modification details.
	 */
	public OrderModificationRecordEntryModel getOrderModificationRecordEntry()
	{
		if (this._orderModificationRecordEntry!=null)
		{
			return _orderModificationRecordEntry;
		}
		return _orderModificationRecordEntry = getPersistenceContext().getValue(ORDERMODIFICATIONRECORDENTRY, _orderModificationRecordEntry);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderModificationProcess.orderModificationRecordEntry</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the orderModificationRecordEntry - Object storing order modification details.
	 */
	public void setOrderModificationRecordEntry(final OrderModificationRecordEntryModel value)
	{
		_orderModificationRecordEntry = getPersistenceContext().setValue(ORDERMODIFICATIONRECORDENTRY, value);
	}
	
}
