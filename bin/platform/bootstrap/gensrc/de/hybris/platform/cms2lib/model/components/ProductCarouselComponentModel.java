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
import de.hybris.platform.cms2lib.enums.CarouselScroll;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.List;
import java.util.Locale;

/**
 * Generated model class for type ProductCarouselComponent first defined at extension cms2lib.
 */
@SuppressWarnings("all")
public class ProductCarouselComponentModel extends SimpleCMSComponentModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ProductCarouselComponent";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductCarouselComponent.scroll</code> attribute defined at extension <code>cms2lib</code>. */
	public static final String SCROLL = "scroll";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductCarouselComponent.productCodes</code> attribute defined at extension <code>cms2lib</code>. */
	public static final String PRODUCTCODES = "productCodes";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductCarouselComponent.categoryCodes</code> attribute defined at extension <code>cms2lib</code>. */
	public static final String CATEGORYCODES = "categoryCodes";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductCarouselComponent.products</code> attribute defined at extension <code>cms2lib</code>. */
	public static final String PRODUCTS = "products";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductCarouselComponent.categories</code> attribute defined at extension <code>cms2lib</code>. */
	public static final String CATEGORIES = "categories";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductCarouselComponent.title</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String TITLE = "title";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductCarouselComponent.searchQuery</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String SEARCHQUERY = "searchQuery";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductCarouselComponent.categoryCode</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String CATEGORYCODE = "categoryCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductCarouselComponent.popup</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String POPUP = "popup";
	
	
	/** <i>Generated variable</i> - Variable of <code>ProductCarouselComponent.scroll</code> attribute defined at extension <code>cms2lib</code>. */
	private CarouselScroll _scroll;
	
	/** <i>Generated variable</i> - Variable of <code>ProductCarouselComponent.productCodes</code> attribute defined at extension <code>cms2lib</code>. */
	private List<String> _productCodes;
	
	/** <i>Generated variable</i> - Variable of <code>ProductCarouselComponent.categoryCodes</code> attribute defined at extension <code>cms2lib</code>. */
	private List<String> _categoryCodes;
	
	/** <i>Generated variable</i> - Variable of <code>ProductCarouselComponent.products</code> attribute defined at extension <code>cms2lib</code>. */
	private List<ProductModel> _products;
	
	/** <i>Generated variable</i> - Variable of <code>ProductCarouselComponent.categories</code> attribute defined at extension <code>cms2lib</code>. */
	private List<CategoryModel> _categories;
	
	/** <i>Generated variable</i> - Variable of <code>ProductCarouselComponent.searchQuery</code> attribute defined at extension <code>acceleratorcms</code>. */
	private String _searchQuery;
	
	/** <i>Generated variable</i> - Variable of <code>ProductCarouselComponent.categoryCode</code> attribute defined at extension <code>acceleratorcms</code>. */
	private String _categoryCode;
	
	/** <i>Generated variable</i> - Variable of <code>ProductCarouselComponent.popup</code> attribute defined at extension <code>acceleratorcms</code>. */
	private Boolean _popup;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ProductCarouselComponentModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ProductCarouselComponentModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public ProductCarouselComponentModel(final CatalogVersionModel _catalogVersion, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public ProductCarouselComponentModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.categories</code> attribute defined at extension <code>cms2lib</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the categories
	 */
	public List<CategoryModel> getCategories()
	{
		if (this._categories!=null)
		{
			return _categories;
		}
		return _categories = getPersistenceContext().getValue(CATEGORIES, _categories);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.categoryCode</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the categoryCode - A code for a category for a solr search
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
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.categoryCodes</code> attribute defined at extension <code>cms2lib</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the categoryCodes
	 */
	public List<String> getCategoryCodes()
	{
		if (this._categoryCodes!=null)
		{
			return _categoryCodes;
		}
		return _categoryCodes = getPersistenceContext().getValue(CATEGORYCODES, _categoryCodes);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.productCodes</code> attribute defined at extension <code>cms2lib</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.products</code> attribute defined at extension <code>cms2lib</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.scroll</code> attribute defined at extension <code>cms2lib</code>. 
	 * @return the scroll
	 */
	public CarouselScroll getScroll()
	{
		if (this._scroll!=null)
		{
			return _scroll;
		}
		return _scroll = getPersistenceContext().getValue(SCROLL, _scroll);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.searchQuery</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the searchQuery - A solr query string
	 */
	public String getSearchQuery()
	{
		if (this._searchQuery!=null)
		{
			return _searchQuery;
		}
		return _searchQuery = getPersistenceContext().getValue(SEARCHQUERY, _searchQuery);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.title</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the title - Localized title of the component.
	 */
	public String getTitle()
	{
		return getTitle(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.title</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @param loc the value localization key 
	 * @return the title - Localized title of the component.
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getTitle(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(TITLE, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.popup</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the popup - If true shows a popup else redirects to products page
	 */
	public boolean isPopup()
	{
		return toPrimitive( _popup = getPersistenceContext().getValue(POPUP, _popup));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ProductCarouselComponent.categories</code> attribute defined at extension <code>cms2lib</code>. 
	 *  
	 * @param value the categories
	 */
	public void setCategories(final List<CategoryModel> value)
	{
		_categories = getPersistenceContext().setValue(CATEGORIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ProductCarouselComponent.categoryCode</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the categoryCode - A code for a category for a solr search
	 */
	public void setCategoryCode(final String value)
	{
		_categoryCode = getPersistenceContext().setValue(CATEGORYCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ProductCarouselComponent.popup</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the popup - If true shows a popup else redirects to products page
	 */
	public void setPopup(final boolean value)
	{
		_popup = getPersistenceContext().setValue(POPUP, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ProductCarouselComponent.products</code> attribute defined at extension <code>cms2lib</code>. 
	 *  
	 * @param value the products
	 */
	public void setProducts(final List<ProductModel> value)
	{
		_products = getPersistenceContext().setValue(PRODUCTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ProductCarouselComponent.scroll</code> attribute defined at extension <code>cms2lib</code>. 
	 *  
	 * @param value the scroll
	 */
	public void setScroll(final CarouselScroll value)
	{
		_scroll = getPersistenceContext().setValue(SCROLL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ProductCarouselComponent.searchQuery</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the searchQuery - A solr query string
	 */
	public void setSearchQuery(final String value)
	{
		_searchQuery = getPersistenceContext().setValue(SEARCHQUERY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ProductCarouselComponent.title</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the title - Localized title of the component.
	 */
	public void setTitle(final String value)
	{
		setTitle(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>ProductCarouselComponent.title</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the title - Localized title of the component.
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setTitle(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(TITLE, loc, value);
	}
	
}
