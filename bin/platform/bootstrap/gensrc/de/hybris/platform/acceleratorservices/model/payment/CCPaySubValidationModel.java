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
package de.hybris.platform.acceleratorservices.model.payment;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type CCPaySubValidation first defined at extension acceleratorservices.
 * <p>
 * Used for keeping track of valid subscriptions.
 */
@SuppressWarnings("all")
public class CCPaySubValidationModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CCPaySubValidation";
	
	/** <i>Generated constant</i> - Attribute key of <code>CCPaySubValidation.subscriptionId</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String SUBSCRIPTIONID = "subscriptionId";
	
	
	/** <i>Generated variable</i> - Variable of <code>CCPaySubValidation.subscriptionId</code> attribute defined at extension <code>acceleratorservices</code>. */
	private String _subscriptionId;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CCPaySubValidationModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CCPaySubValidationModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public CCPaySubValidationModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CCPaySubValidation.subscriptionId</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the subscriptionId
	 */
	public String getSubscriptionId()
	{
		if (this._subscriptionId!=null)
		{
			return _subscriptionId;
		}
		return _subscriptionId = getPersistenceContext().getValue(SUBSCRIPTIONID, _subscriptionId);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CCPaySubValidation.subscriptionId</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the subscriptionId
	 */
	public void setSubscriptionId(final String value)
	{
		_subscriptionId = getPersistenceContext().setValue(SUBSCRIPTIONID, value);
	}
	
}
