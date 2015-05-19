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
package de.hybris.platform.cms2lib.model.components;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.cms2.model.contents.components.SimpleCMSComponentModel;
import de.hybris.platform.cms2lib.enums.ProductListLayouts;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.List;
import java.util.Locale;

/**
 * Generated model class for type ProductListComponent first defined at extension cms2lib.
 */
@SuppressWarnings("all")
public class ProductListComponentModel extends SimpleCMSComponentModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ProductListComponent";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductListComponent.headline</code> attribute defined at extension <code>cms2lib</code>. */
	public static final String HEADLINE = "headline";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductListComponent.categoryCode</code> attribute defined at extension <code>cms2lib</code>. */
	public static final String CATEGORYCODE = "categoryCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductListComponent.productsFromContext</code> attribute defined at extension <code>cms2lib</code>. */
	public static final String PRODUCTSFROMCONTEXT = "productsFromContext";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductListComponent.searchQuery</code> attribute defined at extension <code>cms2lib</code>. */
	public static final String SEARCHQUERY = "searchQuery";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductListComponent.pagination</code> attribute defined at extension <code>cms2lib</code>. */
	public static final String PAGINATION = "pagination";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductListComponent.layout</code> attribute defined at extension <code>cms2lib</code>. */
	public static final String LAYOUT = "layout";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductListComponent.productCodes</code> attribute defined at extension <code>cms2lib</code>. */
	public static final String PRODUCTCODES = "productCodes";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductListComponent.products</code> attribute defined at extension <code>cms2lib</code>. */
	public static final String PRODUCTS = "products";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductListComponent.category</code> attribute defined at extension <code>cms2lib</code>. */
	public static final String CATEGORY = "category";
	
	
	/** <i>Generated variable</i> - Variable of <code>ProductListComponent.categoryCode</code> attribute defined at extension <code>cms2lib</code>. */
	private String _categoryCode;
	
	/** <i>Generated variable</i> - Variable of <code>ProductListComponent.productsFromContext</code> attribute defined at extension <code>cms2lib</code>. */
	private Boolean _productsFromContext;
	
	/** <i>Generated variable</i> - Variable of <code>ProductListComponent.pagination</code> attribute defined at extension <code>cms2lib</code>. */
	private Boolean _pagination;
	
	/** <i>Generated variable</i> - Variable of <code>ProductListComponent.layout</code> attribute defined at extension <code>cms2lib</code>. */
	private ProductListLayouts _layout;
	
	/** <i>Generated variable</i> - Variable of <code>ProductListComponent.productCodes</code> attribute defined at extension <code>cms2lib</code>. */
	private List<String> _productCodes;
	
	/** <i>Generated variable</i> - Variable of <code>ProductListComponent.products</code> attribute defined at extension <code>cms2lib</code>. */
	private List<ProductModel> _products;
	
	/** <i>Generated variable</i> - Variable of <code>ProductListComponent.category</code> attribute defined at extension <code>cms2lib</code>. */
	private CategoryModel _category;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ProductListComponentModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ProductListComponentModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _pagination initial attribute declared by type <code>ProductListComponent</code> at extension <code>cms2lib</code>
	 * @param _productsFromContext initial attribute declared by type <code>ProductListComponent</code> at extension <code>cms2lib</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public ProductListComponentModel(final CatalogVersionModel _catalogVersion, final boolean _pagination, final boolean _productsFromContext, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setPagination(_pagination);
		setProductsFromContext(_productsFromContext);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _pagination initial attribute declared by type <code>ProductListComponent</code> at extension <code>cms2lib</code>
	 * @param _productsFromContext initial attribute declared by type <code>ProductListComponent</code> at extension <code>cms2lib</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public ProductListComponentModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final boolean _pagination, final boolean _productsFromContext, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setPagination(_pagination);
		setProductsFromContext(_productsFromContext);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductListComponent.category</code> attribute defined at extension <code>cms2lib</code>. 
	 * @return the category
	 */
	public CategoryModel getCategory()
	{
		if (this._category!=null)
		{
			return _category;
		}
		return _category = getPersistenceContext().getValue(CATEGORY, _category);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductListComponent.categoryCode</code> attribute defined at extension <code>cms2lib</code>. 
	 * @return the categoryCode
	 */
	public String getCategoryCode()
	{
		if (this._categoryCode!=null)
		{
			return _categoryCode;
		}
		return _categoryCode = getPersistenceContext().getValue(CATEGORYCODE, _categoryCode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductListComponent.headline</code> attribute defined at extension <code>cms2lib</code>. 
	 * @return the headline
	 */
	public String getHeadline()
	{
		return getHeadline(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductListComponent.headline</code> attribute defined at extension <code>cms2lib</code>. 
	 * @param loc the value localization key 
	 * @return the headline
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getHeadline(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(HEADLINE, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductListComponent.layout</code> attribute defined at extension <code>cms2lib</code>. 
	 * @return the layout
	 */
	public ProductListLayouts getLayout()
	{
		if (this._layout!=null)
		{
			return _layout;
		}
		return _layout = getPersistenceContext().getValue(LAYOUT, _layout);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductListComponent.productCodes</code> attribute defined at extension <code>cms2lib</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the productCodes
	 */
	public List<String> getProductCodes()
	{
		if (this._productCodes!=null)
		{
			return _productCodes;
		}
		return _productCodes = getPersistenceContext().getValue(PRODUCTCODES, _productCodes);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductListComponent.products</code> attribute defined at extension <code>cms2lib</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the products
	 */
	public List<ProductModel> getProducts()
	{
		if (this._products!=null)
		{
			return _products;
		}
		return _products = getPersistenceContext().getValue(PRODUCTS, _products);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductListComponent.searchQuery</code> attribute defined at extension <code>cms2lib</code>. 
	 * @return the searchQuery
	 */
	public String getSearchQuery()
	{
		return getSearchQuery(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductListComponent.searchQuery</code> attribute defined at extension <code>cms2lib</code>. 
	 * @param loc the value localization key 
	 * @return the searchQuery
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getSearchQuery(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(SEARCHQUERY, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductListComponent.pagination</code> attribute defined at extension <code>cms2lib</code>. 
	 * @return the pagination
	 */
	public boolean isPagination()
	{
		return toPrimitive( _pagination = getPersistenceContext().getValue(PAGINATION, _pagination));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductListComponent.productsFromContext</code> attribute defined at extension <code>cms2lib</code>. 
	 * @return the productsFromContext
	 */
	public boolean isProductsFromContext()
	{
		return toPrimitive( _productsFromContext = getPersistenceContext().getValue(PRODUCTSFROMCONTEXT, _productsFromContext));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ProductListComponent.category</code> attribute defined at extension <code>cms2lib</code>. 
	 *  
	 * @param value the category
	 */
	public void setCategory(final CategoryModel value)
	{
		_category = getPersistenceContext().setValue(CATEGORY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ProductListComponent.headline</code> attribute defined at extension <code>cms2lib</code>. 
	 *  
	 * @param value the headline
	 */
	public void setHeadline(final String value)
	{
		setHeadline(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>ProductListComponent.headline</code> attribute defined at extension <code>cms2lib</code>. 
	 *  
	 * @param value the headline
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setHeadline(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(HEADLINE, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ProductListComponent.layout</code> attribute defined at extension <code>cms2lib</code>. 
	 *  
	 * @param value the layout
	 */
	public void setLayout(final ProductListLayouts value)
	{
		_layout = getPersistenceContext().setValue(LAYOUT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ProductListComponent.pagination</code> attribute defined at extension <code>cms2lib</code>. 
	 *  
	 * @param value the pagination
	 */
	public void setPagination(final boolean value)
	{
		_pagination = getPersistenceContext().setValue(PAGINATION, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ProductListComponent.products</code> attribute defined at extension <code>cms2lib</code>. 
	 *  
	 * @param value the products
	 */
	public void setProducts(final List<ProductModel> value)
	{
		_products = getPersistenceContext().setValue(PRODUCTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ProductListComponent.productsFromContext</code> attribute defined at extension <code>cms2lib</code>. 
	 *  
	 * @param value the productsFromContext
	 */
	public void setProductsFromContext(final boolean value)
	{
		_productsFromContext = getPersistenceContext().setValue(PRODUCTSFROMCONTEXT, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ProductListComponent.searchQuery</code> attribute defined at extension <code>cms2lib</code>. 
	 *  
	 * @param value the searchQuery
	 */
	public void setSearchQuery(final String value)
	{
		setSearchQuery(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>ProductListComponent.searchQuery</code> attribute defined at extension <code>cms2lib</code>. 
	 *  
	 * @param value the searchQuery
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setSearchQuery(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(SEARCHQUERY, loc, value);
	}
	
}
