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
import de.hybris.platform.ordersplitting.model.ConsignmentModel;
import de.hybris.platform.ordersplitting.model.StockLevelModel;
import de.hybris.platform.ordersplitting.model.VendorModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.store.BaseStoreModel;
import de.hybris.platform.storelocator.model.PointOfServiceModel;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;

/**
 * Generated model class for type Warehouse first defined at extension basecommerce.
 */
@SuppressWarnings("all")
public class WarehouseModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "Warehouse";
	
	/**<i>Generated relation code constant for relation <code>VendorWarehouseRelation</code> defining source attribute <code>vendor</code> in extension <code>basecommerce</code>.</i>*/
	public final static String _VENDORWAREHOUSERELATION = "VendorWarehouseRelation";
	
	/**<i>Generated relation code constant for relation <code>ConsignmentWarehouseRelation</code> defining source attribute <code>consignments</code> in extension <code>basecommerce</code>.</i>*/
	public final static String _CONSIGNMENTWAREHOUSERELATION = "ConsignmentWarehouseRelation";
	
	/**<i>Generated relation code constant for relation <code>StockLevelWarehouseRelation</code> defining source attribute <code>stockLevels</code> in extension <code>basecommerce</code>.</i>*/
	public final static String _STOCKLEVELWAREHOUSERELATION = "StockLevelWarehouseRelation";
	
	/**<i>Generated relation code constant for relation <code>PoS2WarehouseRel</code> defining source attribute <code>pointsOfService</code> in extension <code>commerceservices</code>.</i>*/
	public final static String _POS2WAREHOUSEREL = "PoS2WarehouseRel";
	
	/**<i>Generated relation code constant for relation <code>BaseStore2WarehouseRel</code> defining source attribute <code>baseStores</code> in extension <code>commerceservices</code>.</i>*/
	public final static String _BASESTORE2WAREHOUSEREL = "BaseStore2WarehouseRel";
	
	/** <i>Generated constant</i> - Attribute key of <code>Warehouse.code</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>Warehouse.name</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>Warehouse.default</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String DEFAULT = "default";
	
	/** <i>Generated constant</i> - Attribute key of <code>Warehouse.vendor</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String VENDOR = "vendor";
	
	/** <i>Generated constant</i> - Attribute key of <code>Warehouse.consignments</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CONSIGNMENTS = "consignments";
	
	/** <i>Generated constant</i> - Attribute key of <code>Warehouse.stockLevels</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String STOCKLEVELS = "stockLevels";
	
	/** <i>Generated constant</i> - Attribute key of <code>Warehouse.pointsOfService</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String POINTSOFSERVICE = "pointsOfService";
	
	/** <i>Generated constant</i> - Attribute key of <code>Warehouse.baseStores</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String BASESTORES = "baseStores";
	
	
	/** <i>Generated variable</i> - Variable of <code>Warehouse.code</code> attribute defined at extension <code>basecommerce</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>Warehouse.default</code> attribute defined at extension <code>basecommerce</code>. */
	private Boolean _default;
	
	/** <i>Generated variable</i> - Variable of <code>Warehouse.vendor</code> attribute defined at extension <code>basecommerce</code>. */
	private VendorModel _vendor;
	
	/** <i>Generated variable</i> - Variable of <code>Warehouse.consignments</code> attribute defined at extension <code>basecommerce</code>. */
	private Set<ConsignmentModel> _consignments;
	
	/** <i>Generated variable</i> - Variable of <code>Warehouse.stockLevels</code> attribute defined at extension <code>basecommerce</code>. */
	private Set<StockLevelModel> _stockLevels;
	
	/** <i>Generated variable</i> - Variable of <code>Warehouse.pointsOfService</code> attribute defined at extension <code>commerceservices</code>. */
	private Collection<PointOfServiceModel> _pointsOfService;
	
	/** <i>Generated variable</i> - Variable of <code>Warehouse.baseStores</code> attribute defined at extension <code>commerceservices</code>. */
	private Collection<BaseStoreModel> _baseStores;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public WarehouseModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public WarehouseModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>Warehouse</code> at extension <code>basecommerce</code>
	 * @param _vendor initial attribute declared by type <code>Warehouse</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public WarehouseModel(final String _code, final VendorModel _vendor)
	{
		super();
		setCode(_code);
		setVendor(_vendor);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>Warehouse</code> at extension <code>basecommerce</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _vendor initial attribute declared by type <code>Warehouse</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public WarehouseModel(final String _code, final ItemModel _owner, final VendorModel _vendor)
	{
		super();
		setCode(_code);
		setOwner(_owner);
		setVendor(_vendor);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Warehouse.baseStores</code> attribute defined at extension <code>commerceservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the baseStores
	 */
	public Collection<BaseStoreModel> getBaseStores()
	{
		if (this._baseStores!=null)
		{
			return _baseStores;
		}
		return _baseStores = getPersistenceContext().getValue(BASESTORES, _baseStores);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Warehouse.code</code> attribute defined at extension <code>basecommerce</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Warehouse.consignments</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the consignments
	 */
	public Set<ConsignmentModel> getConsignments()
	{
		if (this._consignments!=null)
		{
			return _consignments;
		}
		return _consignments = getPersistenceContext().getValue(CONSIGNMENTS, _consignments);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Warehouse.default</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the default
	 */
	public Boolean getDefault()
	{
		if (this._default!=null)
		{
			return _default;
		}
		return _default = getPersistenceContext().getValue(DEFAULT, _default);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Warehouse.name</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the name
	 */
	public String getName()
	{
		return getName(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>Warehouse.name</code> attribute defined at extension <code>basecommerce</code>. 
	 * @param loc the value localization key 
	 * @return the name
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getName(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(NAME, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Warehouse.pointsOfService</code> attribute defined at extension <code>commerceservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the pointsOfService
	 */
	public Collection<PointOfServiceModel> getPointsOfService()
	{
		if (this._pointsOfService!=null)
		{
			return _pointsOfService;
		}
		return _pointsOfService = getPersistenceContext().getValue(POINTSOFSERVICE, _pointsOfService);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Warehouse.stockLevels</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the stockLevels
	 */
	public Set<StockLevelModel> getStockLevels()
	{
		if (this._stockLevels!=null)
		{
			return _stockLevels;
		}
		return _stockLevels = getPersistenceContext().getValue(STOCKLEVELS, _stockLevels);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Warehouse.vendor</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the vendor
	 */
	public VendorModel getVendor()
	{
		if (this._vendor!=null)
		{
			return _vendor;
		}
		return _vendor = getPersistenceContext().getValue(VENDOR, _vendor);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Warehouse.baseStores</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the baseStores
	 */
	public void setBaseStores(final Collection<BaseStoreModel> value)
	{
		_baseStores = getPersistenceContext().setValue(BASESTORES, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>Warehouse.code</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Warehouse.consignments</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the consignments
	 */
	public void setConsignments(final Set<ConsignmentModel> value)
	{
		_consignments = getPersistenceContext().setValue(CONSIGNMENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>Warehouse.default</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the default
	 */
	public void setDefault(final Boolean value)
	{
		_default = getPersistenceContext().setValue(DEFAULT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Warehouse.name</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>Warehouse.name</code> attribute defined at extension <code>basecommerce</code>. 
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
	 * <i>Generated method</i> - Setter of <code>Warehouse.pointsOfService</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the pointsOfService
	 */
	public void setPointsOfService(final Collection<PointOfServiceModel> value)
	{
		_pointsOfService = getPersistenceContext().setValue(POINTSOFSERVICE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Warehouse.stockLevels</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the stockLevels
	 */
	public void setStockLevels(final Set<StockLevelModel> value)
	{
		_stockLevels = getPersistenceContext().setValue(STOCKLEVELS, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>Warehouse.vendor</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the vendor
	 */
	public void setVendor(final VendorModel value)
	{
		_vendor = getPersistenceContext().setValue(VENDOR, value);
	}
	
}
