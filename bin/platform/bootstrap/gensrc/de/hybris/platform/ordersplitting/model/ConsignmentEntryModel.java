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

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.ordersplitting.model.ConsignmentModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type ConsignmentEntry first defined at extension basecommerce.
 */
@SuppressWarnings("all")
public class ConsignmentEntryModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ConsignmentEntry";
	
	/** <i>Generated constant</i> - Attribute key of <code>ConsignmentEntry.quantity</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String QUANTITY = "quantity";
	
	/** <i>Generated constant</i> - Attribute key of <code>ConsignmentEntry.shippedQuantity</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String SHIPPEDQUANTITY = "shippedQuantity";
	
	/** <i>Generated constant</i> - Attribute key of <code>ConsignmentEntry.orderEntry</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String ORDERENTRY = "orderEntry";
	
	/** <i>Generated constant</i> - Attribute key of <code>ConsignmentEntry.consignment</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CONSIGNMENT = "consignment";
	
	
	/** <i>Generated variable</i> - Variable of <code>ConsignmentEntry.quantity</code> attribute defined at extension <code>basecommerce</code>. */
	private Long _quantity;
	
	/** <i>Generated variable</i> - Variable of <code>ConsignmentEntry.shippedQuantity</code> attribute defined at extension <code>basecommerce</code>. */
	private Long _shippedQuantity;
	
	/** <i>Generated variable</i> - Variable of <code>ConsignmentEntry.orderEntry</code> attribute defined at extension <code>basecommerce</code>. */
	private AbstractOrderEntryModel _orderEntry;
	
	/** <i>Generated variable</i> - Variable of <code>ConsignmentEntry.consignment</code> attribute defined at extension <code>basecommerce</code>. */
	private ConsignmentModel _consignment;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ConsignmentEntryModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ConsignmentEntryModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _consignment initial attribute declared by type <code>ConsignmentEntry</code> at extension <code>basecommerce</code>
	 * @param _orderEntry initial attribute declared by type <code>ConsignmentEntry</code> at extension <code>basecommerce</code>
	 * @param _quantity initial attribute declared by type <code>ConsignmentEntry</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public ConsignmentEntryModel(final ConsignmentModel _consignment, final AbstractOrderEntryModel _orderEntry, final Long _quantity)
	{
		super();
		setConsignment(_consignment);
		setOrderEntry(_orderEntry);
		setQuantity(_quantity);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _consignment initial attribute declared by type <code>ConsignmentEntry</code> at extension <code>basecommerce</code>
	 * @param _orderEntry initial attribute declared by type <code>ConsignmentEntry</code> at extension <code>basecommerce</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _quantity initial attribute declared by type <code>ConsignmentEntry</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public ConsignmentEntryModel(final ConsignmentModel _consignment, final AbstractOrderEntryModel _orderEntry, final ItemModel _owner, final Long _quantity)
	{
		super();
		setConsignment(_consignment);
		setOrderEntry(_orderEntry);
		setOwner(_owner);
		setQuantity(_quantity);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConsignmentEntry.consignment</code> attribute defined at extension <code>basecommerce</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>ConsignmentEntry.orderEntry</code> attribute defined at extension <code>basecommerce</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>ConsignmentEntry.quantity</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the quantity
	 */
	public Long getQuantity()
	{
		if (this._quantity!=null)
		{
			return _quantity;
		}
		return _quantity = getPersistenceContext().getValue(QUANTITY, _quantity);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConsignmentEntry.shippedQuantity</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the shippedQuantity
	 */
	public Long getShippedQuantity()
	{
		if (this._shippedQuantity!=null)
		{
			return _shippedQuantity;
		}
		return _shippedQuantity = getPersistenceContext().getValue(SHIPPEDQUANTITY, _shippedQuantity);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>ConsignmentEntry.consignment</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the consignment
	 */
	public void setConsignment(final ConsignmentModel value)
	{
		_consignment = getPersistenceContext().setValue(CONSIGNMENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>ConsignmentEntry.orderEntry</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the orderEntry
	 */
	public void setOrderEntry(final AbstractOrderEntryModel value)
	{
		_orderEntry = getPersistenceContext().setValue(ORDERENTRY, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>ConsignmentEntry.quantity</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the quantity
	 */
	public void setQuantity(final Long value)
	{
		_quantity = getPersistenceContext().setValue(QUANTITY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ConsignmentEntry.shippedQuantity</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the shippedQuantity
	 */
	public void setShippedQuantity(final Long value)
	{
		_shippedQuantity = getPersistenceContext().setValue(SHIPPEDQUANTITY, value);
	}
	
}
