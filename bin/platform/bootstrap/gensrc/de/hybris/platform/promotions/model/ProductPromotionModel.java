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

import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.promotions.model.AbstractPromotionModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type ProductPromotion first defined at extension promotions.
 */
@SuppressWarnings("all")
public class ProductPromotionModel extends AbstractPromotionModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ProductPromotion";
	
	/**<i>Generated relation code constant for relation <code>ProductPromotionRelation</code> defining source attribute <code>products</code> in extension <code>promotions</code>.</i>*/
	public final static String _PRODUCTPROMOTIONRELATION = "ProductPromotionRelation";
	
	/**<i>Generated relation code constant for relation <code>CategoryPromotionRelation</code> defining source attribute <code>categories</code> in extension <code>promotions</code>.</i>*/
	public final static String _CATEGORYPROMOTIONRELATION = "CategoryPromotionRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductPromotion.productBanner</code> attribute defined at extension <code>promotions</code>. */
	public static final String PRODUCTBANNER = "productBanner";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductPromotion.products</code> attribute defined at extension <code>promotions</code>. */
	public static final String PRODUCTS = "products";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductPromotion.categories</code> attribute defined at extension <code>promotions</code>. */
	public static final String CATEGORIES = "categories";
	
	
	/** <i>Generated variable</i> - Variable of <code>ProductPromotion.productBanner</code> attribute defined at extension <code>promotions</code>. */
	private MediaModel _productBanner;
	
	/** <i>Generated variable</i> - Variable of <code>ProductPromotion.products</code> attribute defined at extension <code>promotions</code>. */
	private Collection<ProductModel> _products;
	
	/** <i>Generated variable</i> - Variable of <code>ProductPromotion.categories</code> attribute defined at extension <code>promotions</code>. */
	private Collection<CategoryModel> _categories;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ProductPromotionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ProductPromotionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>AbstractPromotion</code> at extension <code>promotions</code>
	 */
	@Deprecated
	public ProductPromotionModel(final String _code)
	{
		super();
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>AbstractPromotion</code> at extension <code>promotions</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public ProductPromotionModel(final String _code, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductPromotion.categories</code> attribute defined at extension <code>promotions</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the categories - Categories
	 */
	public Collection<CategoryModel> getCategories()
	{
		if (this._categories!=null)
		{
			return _categories;
		}
		return _categories = getPersistenceContext().getValue(CATEGORIES, _categories);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductPromotion.productBanner</code> attribute defined at extension <code>promotions</code>. 
	 * @return the productBanner - Media to display on the product page when this promotion is available.
	 */
	public MediaModel getProductBanner()
	{
		if (this._productBanner!=null)
		{
			return _productBanner;
		}
		return _productBanner = getPersistenceContext().getValue(PRODUCTBANNER, _productBanner);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductPromotion.products</code> attribute defined at extension <code>promotions</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the products - Products
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
	 * <i>Generated method</i> - Setter of <code>ProductPromotion.categories</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the categories - Categories
	 */
	public void setCategories(final Collection<CategoryModel> value)
	{
		_categories = getPersistenceContext().setValue(CATEGORIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ProductPromotion.productBanner</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the productBanner - Media to display on the product page when this promotion is available.
	 */
	public void setProductBanner(final MediaModel value)
	{
		_productBanner = getPersistenceContext().setValue(PRODUCTBANNER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ProductPromotion.products</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the products - Products
	 */
	public void setProducts(final Collection<ProductModel> value)
	{
		_products = getPersistenceContext().setValue(PRODUCTS, value);
	}
	
}
