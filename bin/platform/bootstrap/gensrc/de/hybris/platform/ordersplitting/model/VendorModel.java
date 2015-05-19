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
import de.hybris.platform.ordersplitting.model.WarehouseModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Locale;
import java.util.Set;

/**
 * Generated model class for type Vendor first defined at extension basecommerce.
 */
@SuppressWarnings("all")
public class VendorModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "Vendor";
	
	/** <i>Generated constant</i> - Attribute key of <code>Vendor.name</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>Vendor.code</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>Vendor.warehouses</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String WAREHOUSES = "warehouses";
	
	
	/** <i>Generated variable</i> - Variable of <code>Vendor.code</code> attribute defined at extension <code>basecommerce</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>Vendor.warehouses</code> attribute defined at extension <code>basecommerce</code>. */
	private Set<WarehouseModel> _warehouses;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public VendorModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public VendorModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>Vendor</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public VendorModel(final String _code)
	{
		super();
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>Vendor</code> at extension <code>basecommerce</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public VendorModel(final String _code, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vendor.code</code> attribute defined at extension <code>basecommerce</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Vendor.name</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the name
	 */
	public String getName()
	{
		return getName(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>Vendor.name</code> attribute defined at extension <code>basecommerce</code>. 
	 * @param loc the value localization key 
	 * @return the name
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getName(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(NAME, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vendor.warehouses</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the warehouses
	 */
	public Set<WarehouseModel> getWarehouses()
	{
		if (this._warehouses!=null)
		{
			return _warehouses;
		}
		return _warehouses = getPersistenceContext().getValue(WAREHOUSES, _warehouses);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>Vendor.code</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Vendor.name</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>Vendor.name</code> attribute defined at extension <code>basecommerce</code>. 
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
	 * <i>Generated method</i> - Setter of <code>Vendor.warehouses</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the warehouses
	 */
	public void setWarehouses(final Set<WarehouseModel> value)
	{
		_warehouses = getPersistenceContext().setValue(WAREHOUSES, value);
	}
	
}
