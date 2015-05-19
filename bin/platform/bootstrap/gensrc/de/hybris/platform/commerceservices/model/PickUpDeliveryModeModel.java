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
package de.hybris.platform.commerceservices.model;

import de.hybris.platform.commerceservices.enums.PickupInStoreMode;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.order.delivery.DeliveryModeModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type PickUpDeliveryMode first defined at extension commerceservices.
 * <p>
 * A Delivery Mode that represents a collection from a PointOfService.
 */
@SuppressWarnings("all")
public class PickUpDeliveryModeModel extends DeliveryModeModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PickUpDeliveryMode";
	
	/** <i>Generated constant</i> - Attribute key of <code>PickUpDeliveryMode.supportedMode</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String SUPPORTEDMODE = "supportedMode";
	
	
	/** <i>Generated variable</i> - Variable of <code>PickUpDeliveryMode.supportedMode</code> attribute defined at extension <code>commerceservices</code>. */
	private PickupInStoreMode _supportedMode;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PickUpDeliveryModeModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PickUpDeliveryModeModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>DeliveryMode</code> at extension <code>core</code>
	 */
	@Deprecated
	public PickUpDeliveryModeModel(final String _code)
	{
		super();
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>DeliveryMode</code> at extension <code>core</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public PickUpDeliveryModeModel(final String _code, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickUpDeliveryMode.supportedMode</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the supportedMode - The mode supported by the pickup delivery mode
	 */
	public PickupInStoreMode getSupportedMode()
	{
		if (this._supportedMode!=null)
		{
			return _supportedMode;
		}
		return _supportedMode = getPersistenceContext().getValue(SUPPORTEDMODE, _supportedMode);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PickUpDeliveryMode.supportedMode</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the supportedMode - The mode supported by the pickup delivery mode
	 */
	public void setSupportedMode(final PickupInStoreMode value)
	{
		_supportedMode = getPersistenceContext().setValue(SUPPORTEDMODE, value);
	}
	
}
