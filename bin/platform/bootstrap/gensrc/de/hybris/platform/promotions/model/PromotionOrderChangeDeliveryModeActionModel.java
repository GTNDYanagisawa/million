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
import de.hybris.platform.core.model.order.delivery.DeliveryModeModel;
import de.hybris.platform.promotions.model.AbstractPromotionActionModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type PromotionOrderChangeDeliveryModeAction first defined at extension promotions.
 */
@SuppressWarnings("all")
public class PromotionOrderChangeDeliveryModeActionModel extends AbstractPromotionActionModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PromotionOrderChangeDeliveryModeAction";
	
	/** <i>Generated constant</i> - Attribute key of <code>PromotionOrderChangeDeliveryModeAction.deliveryMode</code> attribute defined at extension <code>promotions</code>. */
	public static final String DELIVERYMODE = "deliveryMode";
	
	
	/** <i>Generated variable</i> - Variable of <code>PromotionOrderChangeDeliveryModeAction.deliveryMode</code> attribute defined at extension <code>promotions</code>. */
	private DeliveryModeModel _deliveryMode;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PromotionOrderChangeDeliveryModeActionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PromotionOrderChangeDeliveryModeActionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _deliveryMode initial attribute declared by type <code>PromotionOrderChangeDeliveryModeAction</code> at extension <code>promotions</code>
	 */
	@Deprecated
	public PromotionOrderChangeDeliveryModeActionModel(final DeliveryModeModel _deliveryMode)
	{
		super();
		setDeliveryMode(_deliveryMode);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _deliveryMode initial attribute declared by type <code>PromotionOrderChangeDeliveryModeAction</code> at extension <code>promotions</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public PromotionOrderChangeDeliveryModeActionModel(final DeliveryModeModel _deliveryMode, final ItemModel _owner)
	{
		super();
		setDeliveryMode(_deliveryMode);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PromotionOrderChangeDeliveryModeAction.deliveryMode</code> attribute defined at extension <code>promotions</code>. 
	 * @return the deliveryMode - The delivery mode to apply to the order
	 */
	public DeliveryModeModel getDeliveryMode()
	{
		if (this._deliveryMode!=null)
		{
			return _deliveryMode;
		}
		return _deliveryMode = getPersistenceContext().getValue(DELIVERYMODE, _deliveryMode);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PromotionOrderChangeDeliveryModeAction.deliveryMode</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the deliveryMode - The delivery mode to apply to the order
	 */
	public void setDeliveryMode(final DeliveryModeModel value)
	{
		_deliveryMode = getPersistenceContext().setValue(DELIVERYMODE, value);
	}
	
}
