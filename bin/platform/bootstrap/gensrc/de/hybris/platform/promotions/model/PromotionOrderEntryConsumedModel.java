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
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.promotions.model.PromotionResultModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type PromotionOrderEntryConsumed first defined at extension promotions.
 */
@SuppressWarnings("all")
public class PromotionOrderEntryConsumedModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PromotionOrderEntryConsumed";
	
	/** <i>Generated constant</i> - Attribute key of <code>PromotionOrderEntryConsumed.code</code> attribute defined at extension <code>promotions</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>PromotionOrderEntryConsumed.promotionResult</code> attribute defined at extension <code>promotions</code>. */
	public static final String PROMOTIONRESULT = "promotionResult";
	
	/** <i>Generated constant</i> - Attribute key of <code>PromotionOrderEntryConsumed.quantity</code> attribute defined at extension <code>promotions</code>. */
	public static final String QUANTITY = "quantity";
	
	/** <i>Generated constant</i> - Attribute key of <code>PromotionOrderEntryConsumed.adjustedUnitPrice</code> attribute defined at extension <code>promotions</code>. */
	public static final String ADJUSTEDUNITPRICE = "adjustedUnitPrice";
	
	/** <i>Generated constant</i> - Attribute key of <code>PromotionOrderEntryConsumed.orderEntry</code> attribute defined at extension <code>promotions</code>. */
	public static final String ORDERENTRY = "orderEntry";
	
	
	/** <i>Generated variable</i> - Variable of <code>PromotionOrderEntryConsumed.code</code> attribute defined at extension <code>promotions</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>PromotionOrderEntryConsumed.promotionResult</code> attribute defined at extension <code>promotions</code>. */
	private PromotionResultModel _promotionResult;
	
	/** <i>Generated variable</i> - Variable of <code>PromotionOrderEntryConsumed.quantity</code> attribute defined at extension <code>promotions</code>. */
	private Long _quantity;
	
	/** <i>Generated variable</i> - Variable of <code>PromotionOrderEntryConsumed.adjustedUnitPrice</code> attribute defined at extension <code>promotions</code>. */
	private Double _adjustedUnitPrice;
	
	/** <i>Generated variable</i> - Variable of <code>PromotionOrderEntryConsumed.orderEntry</code> attribute defined at extension <code>promotions</code>. */
	private AbstractOrderEntryModel _orderEntry;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PromotionOrderEntryConsumedModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PromotionOrderEntryConsumedModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public PromotionOrderEntryConsumedModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PromotionOrderEntryConsumed.adjustedUnitPrice</code> attribute defined at extension <code>promotions</code>. 
	 * @return the adjustedUnitPrice - The quantity.
	 */
	public Double getAdjustedUnitPrice()
	{
		if (this._adjustedUnitPrice!=null)
		{
			return _adjustedUnitPrice;
		}
		return _adjustedUnitPrice = getPersistenceContext().getValue(ADJUSTEDUNITPRICE, _adjustedUnitPrice);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PromotionOrderEntryConsumed.code</code> attribute defined at extension <code>promotions</code>. 
	 * @return the code - The code for this consumed entry
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
	 * <i>Generated method</i> - Getter of the <code>PromotionOrderEntryConsumed.orderEntry</code> attribute defined at extension <code>promotions</code>. 
	 * @return the orderEntry - The order entry.
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
	 * <i>Generated method</i> - Getter of the <code>PromotionOrderEntryConsumed.promotionResult</code> attribute defined at extension <code>promotions</code>. 
	 * @return the promotionResult - The promotion result.
	 */
	public PromotionResultModel getPromotionResult()
	{
		if (this._promotionResult!=null)
		{
			return _promotionResult;
		}
		return _promotionResult = getPersistenceContext().getValue(PROMOTIONRESULT, _promotionResult);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PromotionOrderEntryConsumed.quantity</code> attribute defined at extension <code>promotions</code>. 
	 * @return the quantity - The quantity.
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
	 * <i>Generated method</i> - Setter of <code>PromotionOrderEntryConsumed.adjustedUnitPrice</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the adjustedUnitPrice - The quantity.
	 */
	public void setAdjustedUnitPrice(final Double value)
	{
		_adjustedUnitPrice = getPersistenceContext().setValue(ADJUSTEDUNITPRICE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PromotionOrderEntryConsumed.code</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the code - The code for this consumed entry
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PromotionOrderEntryConsumed.orderEntry</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the orderEntry - The order entry.
	 */
	public void setOrderEntry(final AbstractOrderEntryModel value)
	{
		_orderEntry = getPersistenceContext().setValue(ORDERENTRY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PromotionOrderEntryConsumed.promotionResult</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the promotionResult - The promotion result.
	 */
	public void setPromotionResult(final PromotionResultModel value)
	{
		_promotionResult = getPersistenceContext().setValue(PROMOTIONRESULT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PromotionOrderEntryConsumed.quantity</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the quantity - The quantity.
	 */
	public void setQuantity(final Long value)
	{
		_quantity = getPersistenceContext().setValue(QUANTITY, value);
	}
	
}
