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
package de.hybris.platform.core.model.order.delivery;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.order.payment.PaymentModeModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.store.BaseStoreModel;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;

/**
 * Generated model class for type DeliveryMode first defined at extension core.
 */
@SuppressWarnings("all")
public class DeliveryModeModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "DeliveryMode";
	
	/**<i>Generated relation code constant for relation <code>BaseStore2DeliveryModeRel</code> defining source attribute <code>stores</code> in extension <code>commerceservices</code>.</i>*/
	public final static String _BASESTORE2DELIVERYMODEREL = "BaseStore2DeliveryModeRel";
	
	/** <i>Generated constant</i> - Attribute key of <code>DeliveryMode.active</code> attribute defined at extension <code>core</code>. */
	public static final String ACTIVE = "active";
	
	/** <i>Generated constant</i> - Attribute key of <code>DeliveryMode.code</code> attribute defined at extension <code>core</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>DeliveryMode.description</code> attribute defined at extension <code>core</code>. */
	public static final String DESCRIPTION = "description";
	
	/** <i>Generated constant</i> - Attribute key of <code>DeliveryMode.name</code> attribute defined at extension <code>core</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>DeliveryMode.supportedPaymentModes</code> attribute defined at extension <code>core</code>. */
	public static final String SUPPORTEDPAYMENTMODES = "supportedPaymentModes";
	
	/** <i>Generated constant</i> - Attribute key of <code>DeliveryMode.stores</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String STORES = "stores";
	
	
	/** <i>Generated variable</i> - Variable of <code>DeliveryMode.active</code> attribute defined at extension <code>core</code>. */
	private Boolean _active;
	
	/** <i>Generated variable</i> - Variable of <code>DeliveryMode.code</code> attribute defined at extension <code>core</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>DeliveryMode.supportedPaymentModes</code> attribute defined at extension <code>core</code>. */
	private Collection<PaymentModeModel> _supportedPaymentModes;
	
	/** <i>Generated variable</i> - Variable of <code>DeliveryMode.stores</code> attribute defined at extension <code>commerceservices</code>. */
	private Set<BaseStoreModel> _stores;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public DeliveryModeModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public DeliveryModeModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>DeliveryMode</code> at extension <code>core</code>
	 */
	@Deprecated
	public DeliveryModeModel(final String _code)
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
	public DeliveryModeModel(final String _code, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeliveryMode.active</code> attribute defined at extension <code>core</code>. 
	 * @return the active
	 */
	public Boolean getActive()
	{
		if (this._active!=null)
		{
			return _active;
		}
		return _active = getPersistenceContext().getValue(ACTIVE, _active);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeliveryMode.code</code> attribute defined at extension <code>core</code>. 
	 * @return the code
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
	 * <i>Generated method</i> - Getter of the <code>DeliveryMode.description</code> attribute defined at extension <code>core</code>. 
	 * @return the description
	 */
	public String getDescription()
	{
		return getDescription(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>DeliveryMode.description</code> attribute defined at extension <code>core</code>. 
	 * @param loc the value localization key 
	 * @return the description
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getDescription(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(DESCRIPTION, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeliveryMode.name</code> attribute defined at extension <code>core</code>. 
	 * @return the name
	 */
	public String getName()
	{
		return getName(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>DeliveryMode.name</code> attribute defined at extension <code>core</code>. 
	 * @param loc the value localization key 
	 * @return the name
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getName(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(NAME, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeliveryMode.stores</code> attribute defined at extension <code>commerceservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the stores
	 */
	public Set<BaseStoreModel> getStores()
	{
		if (this._stores!=null)
		{
			return _stores;
		}
		return _stores = getPersistenceContext().getValue(STORES, _stores);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeliveryMode.supportedPaymentModes</code> attribute defined at extension <code>core</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the supportedPaymentModes
	 */
	public Collection<PaymentModeModel> getSupportedPaymentModes()
	{
		if (this._supportedPaymentModes!=null)
		{
			return _supportedPaymentModes;
		}
		return _supportedPaymentModes = getPersistenceContext().getValue(SUPPORTEDPAYMENTMODES, _supportedPaymentModes);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>DeliveryMode.active</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the active
	 */
	public void setActive(final Boolean value)
	{
		_active = getPersistenceContext().setValue(ACTIVE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>DeliveryMode.code</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>DeliveryMode.description</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the description
	 */
	public void setDescription(final String value)
	{
		setDescription(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>DeliveryMode.description</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the description
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setDescription(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(DESCRIPTION, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>DeliveryMode.name</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>DeliveryMode.name</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the name
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setName(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(NAME, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>DeliveryMode.stores</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the stores
	 */
	public void setStores(final Set<BaseStoreModel> value)
	{
		_stores = getPersistenceContext().setValue(STORES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>DeliveryMode.supportedPaymentModes</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the supportedPaymentModes
	 */
	public void setSupportedPaymentModes(final Collection<PaymentModeModel> value)
	{
		_supportedPaymentModes = getPersistenceContext().setValue(SUPPORTEDPAYMENTMODES, value);
	}
	
}
