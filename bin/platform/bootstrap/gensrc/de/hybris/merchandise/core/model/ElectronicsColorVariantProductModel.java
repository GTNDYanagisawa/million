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
package de.hybris.merchandise.core.model;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.variants.model.VariantProductModel;
import java.util.Locale;

/**
 * Generated model class for type ElectronicsColorVariantProduct first defined at extension merchandisecore.
 * <p>
 * Electronics color variant type that contains additional attribute describing variant color.
 */
@SuppressWarnings("all")
public class ElectronicsColorVariantProductModel extends VariantProductModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ElectronicsColorVariantProduct";
	
	/** <i>Generated constant</i> - Attribute key of <code>ElectronicsColorVariantProduct.color</code> attribute defined at extension <code>merchandisecore</code>. */
	public static final String COLOR = "color";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ElectronicsColorVariantProductModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ElectronicsColorVariantProductModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _baseProduct initial attribute declared by type <code>VariantProduct</code> at extension <code>catalog</code>
	 * @param _catalogVersion initial attribute declared by type <code>Product</code> at extension <code>catalog</code>
	 * @param _code initial attribute declared by type <code>Product</code> at extension <code>core</code>
	 */
	@Deprecated
	public ElectronicsColorVariantProductModel(final ProductModel _baseProduct, final CatalogVersionModel _catalogVersion, final String _code)
	{
		super();
		setBaseProduct(_baseProduct);
		setCatalogVersion(_catalogVersion);
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _baseProduct initial attribute declared by type <code>VariantProduct</code> at extension <code>catalog</code>
	 * @param _catalogVersion initial attribute declared by type <code>Product</code> at extension <code>catalog</code>
	 * @param _code initial attribute declared by type <code>Product</code> at extension <code>core</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public ElectronicsColorVariantProductModel(final ProductModel _baseProduct, final CatalogVersionModel _catalogVersion, final String _code, final ItemModel _owner)
	{
		super();
		setBaseProduct(_baseProduct);
		setCatalogVersion(_catalogVersion);
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ElectronicsColorVariantProduct.color</code> attribute defined at extension <code>merchandisecore</code>. 
	 * @return the color - Color of the product.
	 */
	public String getColor()
	{
		return getColor(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>ElectronicsColorVariantProduct.color</code> attribute defined at extension <code>merchandisecore</code>. 
	 * @param loc the value localization key 
	 * @return the color - Color of the product.
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getColor(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(COLOR, loc);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ElectronicsColorVariantProduct.color</code> attribute defined at extension <code>merchandisecore</code>. 
	 *  
	 * @param value the color - Color of the product.
	 */
	public void setColor(final String value)
	{
		setColor(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>ElectronicsColorVariantProduct.color</code> attribute defined at extension <code>merchandisecore</code>. 
	 *  
	 * @param value the color - Color of the product.
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setColor(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(COLOR, loc, value);
	}
	
}