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
package de.hybris.platform.promotions.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.promotions.model.AbstractPromotionActionModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type PromotionOrderEntryAdjustAction first defined at extension promotions.
 */
@SuppressWarnings("all")
public class PromotionOrderEntryAdjustActionModel extends AbstractPromotionActionModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PromotionOrderEntryAdjustAction";
	
	/** <i>Generated constant</i> - Attribute key of <code>PromotionOrderEntryAdjustAction.amount</code> attribute defined at extension <code>promotions</code>. */
	public static final String AMOUNT = "amount";
	
	/** <i>Generated constant</i> - Attribute key of <code>PromotionOrderEntryAdjustAction.orderEntryProduct</code> attribute defined at extension <code>promotions</code>. */
	public static final String ORDERENTRYPRODUCT = "orderEntryProduct";
	
	/** <i>Generated constant</i> - Attribute key of <code>PromotionOrderEntryAdjustAction.orderEntryQuantity</code> attribute defined at extension <code>promotions</code>. */
	public static final String ORDERENTRYQUANTITY = "orderEntryQuantity";
	
	/** <i>Generated constant</i> - Attribute key of <code>PromotionOrderEntryAdjustAction.orderEntryNumber</code> attribute defined at extension <code>promotions</code>. */
	public static final String ORDERENTRYNUMBER = "orderEntryNumber";
	
	
	/** <i>Generated variable</i> - Variable of <code>PromotionOrderEntryAdjustAction.amount</code> attribute defined at extension <code>promotions</code>. */
	private Double _amount;
	
	/** <i>Generated variable</i> - Variable of <code>PromotionOrderEntryAdjustAction.orderEntryProduct</code> attribute defined at extension <code>promotions</code>. */
	private ProductModel _orderEntryProduct;
	
	/** <i>Generated variable</i> - Variable of <code>PromotionOrderEntryAdjustAction.orderEntryQuantity</code> attribute defined at extension <code>promotions</code>. */
	private Long _orderEntryQuantity;
	
	/** <i>Generated variable</i> - Variable of <code>PromotionOrderEntryAdjustAction.orderEntryNumber</code> attribute defined at extension <code>promotions</code>. */
	private Integer _orderEntryNumber;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PromotionOrderEntryAdjustActionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PromotionOrderEntryAdjustActionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public PromotionOrderEntryAdjustActionModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PromotionOrderEntryAdjustAction.amount</code> attribute defined at extension <code>promotions</code>. 
	 * @return the amount - The amount to adjust the order entry by.
	 */
	public Double getAmount()
	{
		if (this._amount!=null)
		{
			return _amount;
		}
		return _amount = getPersistenceContext().getValue(AMOUNT, _amount);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PromotionOrderEntryAdjustAction.orderEntryNumber</code> attribute defined at extension <code>promotions</code>. 
	 * @return the orderEntryNumber - The entry number in the order
	 */
	public Integer getOrderEntryNumber()
	{
		if (this._orderEntryNumber!=null)
		{
			return _orderEntryNumber;
		}
		return _orderEntryNumber = getPersistenceContext().getValue(ORDERENTRYNUMBER, _orderEntryNumber);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PromotionOrderEntryAdjustAction.orderEntryProduct</code> attribute defined at extension <code>promotions</code>. 
	 * @return the orderEntryProduct - The product of the order entry to adjust
	 */
	public ProductModel getOrderEntryProduct()
	{
		if (this._orderEntryProduct!=null)
		{
			return _orderEntryProduct;
		}
		return _orderEntryProduct = getPersistenceContext().getValue(ORDERENTRYPRODUCT, _orderEntryProduct);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PromotionOrderEntryAdjustAction.orderEntryQuantity</code> attribute defined at extension <code>promotions</code>. 
	 * @return the orderEntryQuantity - The quantity of the order entry to adjust
	 */
	public Long getOrderEntryQuantity()
	{
		if (this._orderEntryQuantity!=null)
		{
			return _orderEntryQuantity;
		}
		return _orderEntryQuantity = getPersistenceContext().getValue(ORDERENTRYQUANTITY, _orderEntryQuantity);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PromotionOrderEntryAdjustAction.amount</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the amount - The amount to adjust the order entry by.
	 */
	public void setAmount(final Double value)
	{
		_amount = getPersistenceContext().setValue(AMOUNT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PromotionOrderEntryAdjustAction.orderEntryNumber</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the orderEntryNumber - The entry number in the order
	 */
	public void setOrderEntryNumber(final Integer value)
	{
		_orderEntryNumber = getPersistenceContext().setValue(ORDERENTRYNUMBER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PromotionOrderEntryAdjustAction.orderEntryProduct</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the orderEntryProduct - The product of the order entry to adjust
	 */
	public void setOrderEntryProduct(final ProductModel value)
	{
		_orderEntryProduct = getPersistenceContext().setValue(ORDERENTRYPRODUCT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PromotionOrderEntryAdjustAction.orderEntryQuantity</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the orderEntryQuantity - The quantity of the order entry to adjust
	 */
	public void setOrderEntryQuantity(final Long value)
	{
		_orderEntryQuantity = getPersistenceContext().setValue(ORDERENTRYQUANTITY, value);
	}
	
}
