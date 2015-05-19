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
package de.hybris.platform.bmecat.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type ProductUpdateVersion first defined at extension bmecat.
 */
@SuppressWarnings("all")
public class ProductUpdateVersionModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ProductUpdateVersion";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductUpdateVersion.originalProduct</code> attribute defined at extension <code>bmecat</code>. */
	public static final String ORIGINALPRODUCT = "originalProduct";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductUpdateVersion.originalProductCode</code> attribute defined at extension <code>bmecat</code>. */
	public static final String ORIGINALPRODUCTCODE = "originalProductCode";
	
	
	/** <i>Generated variable</i> - Variable of <code>ProductUpdateVersion.originalProduct</code> attribute defined at extension <code>bmecat</code>. */
	private ProductModel _originalProduct;
	
	/** <i>Generated variable</i> - Variable of <code>ProductUpdateVersion.originalProductCode</code> attribute defined at extension <code>bmecat</code>. */
	private String _originalProductCode;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ProductUpdateVersionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ProductUpdateVersionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _originalProduct initial attribute declared by type <code>ProductUpdateVersion</code> at extension <code>bmecat</code>
	 * @param _originalProductCode initial attribute declared by type <code>ProductUpdateVersion</code> at extension <code>bmecat</code>
	 */
	@Deprecated
	public ProductUpdateVersionModel(final ProductModel _originalProduct, final String _originalProductCode)
	{
		super();
		setOriginalProduct(_originalProduct);
		setOriginalProductCode(_originalProductCode);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _originalProduct initial attribute declared by type <code>ProductUpdateVersion</code> at extension <code>bmecat</code>
	 * @param _originalProductCode initial attribute declared by type <code>ProductUpdateVersion</code> at extension <code>bmecat</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public ProductUpdateVersionModel(final ProductModel _originalProduct, final String _originalProductCode, final ItemModel _owner)
	{
		super();
		setOriginalProduct(_originalProduct);
		setOriginalProductCode(_originalProductCode);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductUpdateVersion.originalProduct</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the originalProduct
	 */
	public ProductModel getOriginalProduct()
	{
		if (this._originalProduct!=null)
		{
			return _originalProduct;
		}
		return _originalProduct = getPersistenceContext().getValue(ORIGINALPRODUCT, _originalProduct);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductUpdateVersion.originalProductCode</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the originalProductCode
	 */
	public String getOriginalProductCode()
	{
		if (this._originalProductCode!=null)
		{
			return _originalProductCode;
		}
		return _originalProductCode = getPersistenceContext().getValue(ORIGINALPRODUCTCODE, _originalProductCode);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ProductUpdateVersion.originalProduct</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the originalProduct
	 */
	public void setOriginalProduct(final ProductModel value)
	{
		_originalProduct = getPersistenceContext().setValue(ORIGINALPRODUCT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ProductUpdateVersion.originalProductCode</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the originalProductCode
	 */
	public void setOriginalProductCode(final String value)
	{
		_originalProductCode = getPersistenceContext().setValue(ORIGINALPRODUCTCODE, value);
	}
	
}
