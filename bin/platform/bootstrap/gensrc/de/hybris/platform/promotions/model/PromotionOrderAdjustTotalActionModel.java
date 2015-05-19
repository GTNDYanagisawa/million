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
import de.hybris.platform.promotions.model.AbstractPromotionActionModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type PromotionOrderAdjustTotalAction first defined at extension promotions.
 */
@SuppressWarnings("all")
public class PromotionOrderAdjustTotalActionModel extends AbstractPromotionActionModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PromotionOrderAdjustTotalAction";
	
	/** <i>Generated constant</i> - Attribute key of <code>PromotionOrderAdjustTotalAction.amount</code> attribute defined at extension <code>promotions</code>. */
	public static final String AMOUNT = "amount";
	
	
	/** <i>Generated variable</i> - Variable of <code>PromotionOrderAdjustTotalAction.amount</code> attribute defined at extension <code>promotions</code>. */
	private Double _amount;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PromotionOrderAdjustTotalActionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PromotionOrderAdjustTotalActionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public PromotionOrderAdjustTotalActionModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PromotionOrderAdjustTotalAction.amount</code> attribute defined at extension <code>promotions</code>. 
	 * @return the amount - The amount to adjust the cart total by.
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
	 * <i>Generated method</i> - Setter of <code>PromotionOrderAdjustTotalAction.amount</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the amount - The amount to adjust the cart total by.
	 */
	public void setAmount(final Double value)
	{
		_amount = getPersistenceContext().setValue(AMOUNT, value);
	}
	
}
