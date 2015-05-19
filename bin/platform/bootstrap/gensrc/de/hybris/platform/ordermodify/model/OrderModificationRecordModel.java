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

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.ordermodify.model.OrderModificationRecordEntryModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type OrderModificationRecord first defined at extension basecommerce.
 */
@SuppressWarnings("all")
public class OrderModificationRecordModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "OrderModificationRecord";
	
	/**<i>Generated relation code constant for relation <code>Order2OrderModificationRecords</code> defining source attribute <code>order</code> in extension <code>basecommerce</code>.</i>*/
	public final static String _ORDER2ORDERMODIFICATIONRECORDS = "Order2OrderModificationRecords";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderModificationRecord.inProgress</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String INPROGRESS = "inProgress";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderModificationRecord.identifier</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String IDENTIFIER = "identifier";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderModificationRecord.order</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String ORDER = "order";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderModificationRecord.modificationRecordEntries</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String MODIFICATIONRECORDENTRIES = "modificationRecordEntries";
	
	
	/** <i>Generated variable</i> - Variable of <code>OrderModificationRecord.inProgress</code> attribute defined at extension <code>basecommerce</code>. */
	private Boolean _inProgress;
	
	/** <i>Generated variable</i> - Variable of <code>OrderModificationRecord.identifier</code> attribute defined at extension <code>basecommerce</code>. */
	private String _identifier;
	
	/** <i>Generated variable</i> - Variable of <code>OrderModificationRecord.order</code> attribute defined at extension <code>basecommerce</code>. */
	private OrderModel _order;
	
	/** <i>Generated variable</i> - Variable of <code>OrderModificationRecord.modificationRecordEntries</code> attribute defined at extension <code>basecommerce</code>. */
	private Collection<OrderModificationRecordEntryModel> _modificationRecordEntries;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public OrderModificationRecordModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public OrderModificationRecordModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _inProgress initial attribute declared by type <code>OrderModificationRecord</code> at extension <code>basecommerce</code>
	 * @param _order initial attribute declared by type <code>OrderModificationRecord</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public OrderModificationRecordModel(final boolean _inProgress, final OrderModel _order)
	{
		super();
		setInProgress(_inProgress);
		setOrder(_order);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _inProgress initial attribute declared by type <code>OrderModificationRecord</code> at extension <code>basecommerce</code>
	 * @param _order initial attribute declared by type <code>OrderModificationRecord</code> at extension <code>basecommerce</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public OrderModificationRecordModel(final boolean _inProgress, final OrderModel _order, final ItemModel _owner)
	{
		super();
		setInProgress(_inProgress);
		setOrder(_order);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderModificationRecord.identifier</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the identifier
	 */
	public String getIdentifier()
	{
		if (this._identifier!=null)
		{
			return _identifier;
		}
		return _identifier = getPersistenceContext().getValue(IDENTIFIER, _identifier);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderModificationRecord.modificationRecordEntries</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the modificationRecordEntries
	 */
	public Collection<OrderModificationRecordEntryModel> getModificationRecordEntries()
	{
		if (this._modificationRecordEntries!=null)
		{
			return _modificationRecordEntries;
		}
		return _modificationRecordEntries = getPersistenceContext().getValue(MODIFICATIONRECORDENTRIES, _modificationRecordEntries);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderModificationRecord.order</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the order
	 */
	public OrderModel getOrder()
	{
		if (this._order!=null)
		{
			return _order;
		}
		return _order = getPersistenceContext().getValue(ORDER, _order);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderModificationRecord.inProgress</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the inProgress - Determines if the partial type of orderModification is currently in progress
	 */
	public boolean isInProgress()
	{
		return toPrimitive( _inProgress = getPersistenceContext().getValue(INPROGRESS, _inProgress));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderModificationRecord.identifier</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the identifier
	 */
	public void setIdentifier(final String value)
	{
		_identifier = getPersistenceContext().setValue(IDENTIFIER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderModificationRecord.inProgress</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the inProgress - Determines if the partial type of orderModification is currently in progress
	 */
	public void setInProgress(final boolean value)
	{
		_inProgress = getPersistenceContext().setValue(INPROGRESS, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderModificationRecord.modificationRecordEntries</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the modificationRecordEntries
	 */
	public void setModificationRecordEntries(final Collection<OrderModificationRecordEntryModel> value)
	{
		_modificationRecordEntries = getPersistenceContext().setValue(MODIFICATIONRECORDENTRIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderModificationRecord.order</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the order
	 */
	public void setOrder(final OrderModel value)
	{
		_order = getPersistenceContext().setValue(ORDER, value);
	}
	
}
