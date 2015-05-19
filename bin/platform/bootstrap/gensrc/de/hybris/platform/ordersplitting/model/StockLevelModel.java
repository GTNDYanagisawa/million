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

import de.hybris.platform.basecommerce.enums.InStockStatus;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.ordersplitting.model.WarehouseModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.stock.model.StockLevelHistoryEntryModel;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Generated model class for type StockLevel first defined at extension basecommerce.
 */
@SuppressWarnings("all")
public class StockLevelModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "StockLevel";
	
	/** <i>Generated constant</i> - Attribute key of <code>StockLevel.product</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String PRODUCT = "product";
	
	/** <i>Generated constant</i> - Attribute key of <code>StockLevel.available</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String AVAILABLE = "available";
	
	/** <i>Generated constant</i> - Attribute key of <code>StockLevel.releaseDate</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String RELEASEDATE = "releaseDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>StockLevel.nextDeliveryTime</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String NEXTDELIVERYTIME = "nextDeliveryTime";
	
	/** <i>Generated constant</i> - Attribute key of <code>StockLevel.productCode</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String PRODUCTCODE = "productCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>StockLevel.reserved</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String RESERVED = "reserved";
	
	/** <i>Generated constant</i> - Attribute key of <code>StockLevel.overSelling</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String OVERSELLING = "overSelling";
	
	/** <i>Generated constant</i> - Attribute key of <code>StockLevel.preOrder</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String PREORDER = "preOrder";
	
	/** <i>Generated constant</i> - Attribute key of <code>StockLevel.maxPreOrder</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String MAXPREORDER = "maxPreOrder";
	
	/** <i>Generated constant</i> - Attribute key of <code>StockLevel.treatNegativeAsZero</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String TREATNEGATIVEASZERO = "treatNegativeAsZero";
	
	/** <i>Generated constant</i> - Attribute key of <code>StockLevel.inStockStatus</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String INSTOCKSTATUS = "inStockStatus";
	
	/** <i>Generated constant</i> - Attribute key of <code>StockLevel.maxStockLevelHistoryCount</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String MAXSTOCKLEVELHISTORYCOUNT = "maxStockLevelHistoryCount";
	
	/** <i>Generated constant</i> - Attribute key of <code>StockLevel.products</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String PRODUCTS = "products";
	
	/** <i>Generated constant</i> - Attribute key of <code>StockLevel.warehouse</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String WAREHOUSE = "warehouse";
	
	/** <i>Generated constant</i> - Attribute key of <code>StockLevel.stockLevelHistoryEntries</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String STOCKLEVELHISTORYENTRIES = "stockLevelHistoryEntries";
	
	
	/** <i>Generated variable</i> - Variable of <code>StockLevel.product</code> attribute defined at extension <code>basecommerce</code>. */
	private ProductModel _product;
	
	/** <i>Generated variable</i> - Variable of <code>StockLevel.available</code> attribute defined at extension <code>basecommerce</code>. */
	private Integer _available;
	
	/** <i>Generated variable</i> - Variable of <code>StockLevel.releaseDate</code> attribute defined at extension <code>basecommerce</code>. */
	private Date _releaseDate;
	
	/** <i>Generated variable</i> - Variable of <code>StockLevel.nextDeliveryTime</code> attribute defined at extension <code>basecommerce</code>. */
	private Date _nextDeliveryTime;
	
	/** <i>Generated variable</i> - Variable of <code>StockLevel.productCode</code> attribute defined at extension <code>basecommerce</code>. */
	private String _productCode;
	
	/** <i>Generated variable</i> - Variable of <code>StockLevel.reserved</code> attribute defined at extension <code>basecommerce</code>. */
	private Integer _reserved;
	
	/** <i>Generated variable</i> - Variable of <code>StockLevel.overSelling</code> attribute defined at extension <code>basecommerce</code>. */
	private Integer _overSelling;
	
	/** <i>Generated variable</i> - Variable of <code>StockLevel.preOrder</code> attribute defined at extension <code>basecommerce</code>. */
	private Integer _preOrder;
	
	/** <i>Generated variable</i> - Variable of <code>StockLevel.maxPreOrder</code> attribute defined at extension <code>basecommerce</code>. */
	private Integer _maxPreOrder;
	
	/** <i>Generated variable</i> - Variable of <code>StockLevel.treatNegativeAsZero</code> attribute defined at extension <code>basecommerce</code>. */
	private Boolean _treatNegativeAsZero;
	
	/** <i>Generated variable</i> - Variable of <code>StockLevel.inStockStatus</code> attribute defined at extension <code>basecommerce</code>. */
	private InStockStatus _inStockStatus;
	
	/** <i>Generated variable</i> - Variable of <code>StockLevel.maxStockLevelHistoryCount</code> attribute defined at extension <code>basecommerce</code>. */
	private Integer _maxStockLevelHistoryCount;
	
	/** <i>Generated variable</i> - Variable of <code>StockLevel.products</code> attribute defined at extension <code>basecommerce</code>. */
	private Collection<ProductModel> _products;
	
	/** <i>Generated variable</i> - Variable of <code>StockLevel.warehouse</code> attribute defined at extension <code>basecommerce</code>. */
	private WarehouseModel _warehouse;
	
	/** <i>Generated variable</i> - Variable of <code>StockLevel.stockLevelHistoryEntries</code> attribute defined at extension <code>basecommerce</code>. */
	private List<StockLevelHistoryEntryModel> _stockLevelHistoryEntries;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public StockLevelModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public StockLevelModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _available initial attribute declared by type <code>StockLevel</code> at extension <code>basecommerce</code>
	 * @param _productCode initial attribute declared by type <code>StockLevel</code> at extension <code>basecommerce</code>
	 * @param _warehouse initial attribute declared by type <code>StockLevel</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public StockLevelModel(final int _available, final String _productCode, final WarehouseModel _warehouse)
	{
		super();
		setAvailable(_available);
		setProductCode(_productCode);
		setWarehouse(_warehouse);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _available initial attribute declared by type <code>StockLevel</code> at extension <code>basecommerce</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _productCode initial attribute declared by type <code>StockLevel</code> at extension <code>basecommerce</code>
	 * @param _warehouse initial attribute declared by type <code>StockLevel</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public StockLevelModel(final int _available, final ItemModel _owner, final String _productCode, final WarehouseModel _warehouse)
	{
		super();
		setAvailable(_available);
		setOwner(_owner);
		setProductCode(_productCode);
		setWarehouse(_warehouse);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StockLevel.available</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the available
	 */
	public int getAvailable()
	{
		return toPrimitive( _available = getPersistenceContext().getValue(AVAILABLE, _available));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StockLevel.inStockStatus</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the inStockStatus
	 */
	public InStockStatus getInStockStatus()
	{
		if (this._inStockStatus!=null)
		{
			return _inStockStatus;
		}
		return _inStockStatus = getPersistenceContext().getValue(INSTOCKSTATUS, _inStockStatus);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StockLevel.maxPreOrder</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the maxPreOrder
	 */
	public int getMaxPreOrder()
	{
		return toPrimitive( _maxPreOrder = getPersistenceContext().getValue(MAXPREORDER, _maxPreOrder));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StockLevel.maxStockLevelHistoryCount</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the maxStockLevelHistoryCount - size of the StockLevelHistoyEntry, negative values for unlimited
	 */
	public int getMaxStockLevelHistoryCount()
	{
		return toPrimitive( _maxStockLevelHistoryCount = getPersistenceContext().getValue(MAXSTOCKLEVELHISTORYCOUNT, _maxStockLevelHistoryCount));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StockLevel.nextDeliveryTime</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the nextDeliveryTime
	 */
	public Date getNextDeliveryTime()
	{
		if (this._nextDeliveryTime!=null)
		{
			return _nextDeliveryTime;
		}
		return _nextDeliveryTime = getPersistenceContext().getValue(NEXTDELIVERYTIME, _nextDeliveryTime);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StockLevel.overSelling</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the overSelling
	 */
	public int getOverSelling()
	{
		return toPrimitive( _overSelling = getPersistenceContext().getValue(OVERSELLING, _overSelling));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StockLevel.preOrder</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the preOrder
	 */
	public int getPreOrder()
	{
		return toPrimitive( _preOrder = getPersistenceContext().getValue(PREORDER, _preOrder));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StockLevel.product</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the product
	 */
	public ProductModel getProduct()
	{
		if (this._product!=null)
		{
			return _product;
		}
		return _product = getPersistenceContext().getValue(PRODUCT, _product);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StockLevel.productCode</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the productCode
	 */
	public String getProductCode()
	{
		if (this._productCode!=null)
		{
			return _productCode;
		}
		return _productCode = getPersistenceContext().getValue(PRODUCTCODE, _productCode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StockLevel.products</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the products
	 */
	public Collection<ProductModel> getProducts()
	{
		if (this._products!=null)
		{
			return _products;
		}
		return _products = getPersistenceContext().getValue(PRODUCTS, _products);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StockLevel.releaseDate</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the releaseDate
	 */
	public Date getReleaseDate()
	{
		if (this._releaseDate!=null)
		{
			return _releaseDate;
		}
		return _releaseDate = getPersistenceContext().getValue(RELEASEDATE, _releaseDate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StockLevel.reserved</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the reserved
	 */
	public int getReserved()
	{
		return toPrimitive( _reserved = getPersistenceContext().getValue(RESERVED, _reserved));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StockLevel.stockLevelHistoryEntries</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the stockLevelHistoryEntries
	 */
	public List<StockLevelHistoryEntryModel> getStockLevelHistoryEntries()
	{
		if (this._stockLevelHistoryEntries!=null)
		{
			return _stockLevelHistoryEntries;
		}
		return _stockLevelHistoryEntries = getPersistenceContext().getValue(STOCKLEVELHISTORYENTRIES, _stockLevelHistoryEntries);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StockLevel.warehouse</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the warehouse
	 */
	public WarehouseModel getWarehouse()
	{
		if (this._warehouse!=null)
		{
			return _warehouse;
		}
		return _warehouse = getPersistenceContext().getValue(WAREHOUSE, _warehouse);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StockLevel.treatNegativeAsZero</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the treatNegativeAsZero
	 */
	public boolean isTreatNegativeAsZero()
	{
		return toPrimitive( _treatNegativeAsZero = getPersistenceContext().getValue(TREATNEGATIVEASZERO, _treatNegativeAsZero));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>StockLevel.available</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the available
	 */
	public void setAvailable(final int value)
	{
		_available = getPersistenceContext().setValue(AVAILABLE, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>StockLevel.inStockStatus</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the inStockStatus
	 */
	public void setInStockStatus(final InStockStatus value)
	{
		_inStockStatus = getPersistenceContext().setValue(INSTOCKSTATUS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>StockLevel.maxPreOrder</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the maxPreOrder
	 */
	public void setMaxPreOrder(final int value)
	{
		_maxPreOrder = getPersistenceContext().setValue(MAXPREORDER, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>StockLevel.maxStockLevelHistoryCount</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the maxStockLevelHistoryCount - size of the StockLevelHistoyEntry, negative values for unlimited
	 */
	public void setMaxStockLevelHistoryCount(final int value)
	{
		_maxStockLevelHistoryCount = getPersistenceContext().setValue(MAXSTOCKLEVELHISTORYCOUNT, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>StockLevel.nextDeliveryTime</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the nextDeliveryTime
	 */
	public void setNextDeliveryTime(final Date value)
	{
		_nextDeliveryTime = getPersistenceContext().setValue(NEXTDELIVERYTIME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>StockLevel.overSelling</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the overSelling
	 */
	public void setOverSelling(final int value)
	{
		_overSelling = getPersistenceContext().setValue(OVERSELLING, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>StockLevel.preOrder</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the preOrder
	 */
	public void setPreOrder(final int value)
	{
		_preOrder = getPersistenceContext().setValue(PREORDER, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>StockLevel.product</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the product
	 */
	public void setProduct(final ProductModel value)
	{
		_product = getPersistenceContext().setValue(PRODUCT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>StockLevel.productCode</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the productCode
	 */
	public void setProductCode(final String value)
	{
		_productCode = getPersistenceContext().setValue(PRODUCTCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>StockLevel.products</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the products
	 */
	public void setProducts(final Collection<ProductModel> value)
	{
		_products = getPersistenceContext().setValue(PRODUCTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>StockLevel.releaseDate</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the releaseDate
	 */
	public void setReleaseDate(final Date value)
	{
		_releaseDate = getPersistenceContext().setValue(RELEASEDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>StockLevel.reserved</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the reserved
	 */
	public void setReserved(final int value)
	{
		_reserved = getPersistenceContext().setValue(RESERVED, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>StockLevel.stockLevelHistoryEntries</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the stockLevelHistoryEntries
	 */
	public void setStockLevelHistoryEntries(final List<StockLevelHistoryEntryModel> value)
	{
		_stockLevelHistoryEntries = getPersistenceContext().setValue(STOCKLEVELHISTORYENTRIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>StockLevel.treatNegativeAsZero</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the treatNegativeAsZero
	 */
	public void setTreatNegativeAsZero(final boolean value)
	{
		_treatNegativeAsZero = getPersistenceContext().setValue(TREATNEGATIVEASZERO, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>StockLevel.warehouse</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the warehouse
	 */
	public void setWarehouse(final WarehouseModel value)
	{
		_warehouse = getPersistenceContext().setValue(WAREHOUSE, value);
	}
	
}
