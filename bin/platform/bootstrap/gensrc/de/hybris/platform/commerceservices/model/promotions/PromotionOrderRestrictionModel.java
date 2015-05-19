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
package de.hybris.platform.commerceservices.model.promotions;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.promotions.model.AbstractPromotionRestrictionModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type PromotionOrderRestriction first defined at extension commerceservices.
 */
@SuppressWarnings("all")
public class PromotionOrderRestrictionModel extends AbstractPromotionRestrictionModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PromotionOrderRestriction";
	
	/**<i>Generated relation code constant for relation <code>PromotionRestriction2OrderRel</code> defining source attribute <code>orders</code> in extension <code>commerceservices</code>.</i>*/
	public final static String _PROMOTIONRESTRICTION2ORDERREL = "PromotionRestriction2OrderRel";
	
	/** <i>Generated constant</i> - Attribute key of <code>PromotionOrderRestriction.orders</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String ORDERS = "orders";
	
	
	/** <i>Generated variable</i> - Variable of <code>PromotionOrderRestriction.orders</code> attribute defined at extension <code>commerceservices</code>. */
	private Collection<AbstractOrderModel> _orders;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PromotionOrderRestrictionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PromotionOrderRestrictionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public PromotionOrderRestrictionModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PromotionOrderRestriction.orders</code> attribute defined at extension <code>commerceservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the orders - Orders
	 */
	public Collection<AbstractOrderModel> getOrders()
	{
		if (this._orders!=null)
		{
			return _orders;
		}
		return _orders = getPersistenceContext().getValue(ORDERS, _orders);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PromotionOrderRestriction.orders</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the orders - Orders
	 */
	public void setOrders(final Collection<AbstractOrderModel> value)
	{
		_orders = getPersistenceContext().setValue(ORDERS, value);
	}
	
}
