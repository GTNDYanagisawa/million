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
package de.hybris.platform.btg.model;

import de.hybris.platform.btg.model.BTGAbstractCartOperandModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type BTGQuantityOfProductInCartOperand first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGQuantityOfProductInCartOperandModel extends BTGAbstractCartOperandModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGQuantityOfProductInCartOperand";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGQuantityOfProductInCartOperand.product</code> attribute defined at extension <code>btg</code>. */
	public static final String PRODUCT = "product";
	
	
	/** <i>Generated variable</i> - Variable of <code>BTGQuantityOfProductInCartOperand.product</code> attribute defined at extension <code>btg</code>. */
	private ProductModel _product;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGQuantityOfProductInCartOperandModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGQuantityOfProductInCartOperandModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _product initial attribute declared by type <code>BTGQuantityOfProductInCartOperand</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGQuantityOfProductInCartOperandModel(final CatalogVersionModel _catalogVersion, final ProductModel _product, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setProduct(_product);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _product initial attribute declared by type <code>BTGQuantityOfProductInCartOperand</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGQuantityOfProductInCartOperandModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final ProductModel _product, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setProduct(_product);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGQuantityOfProductInCartOperand.product</code> attribute defined at extension <code>btg</code>. 
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
	 * <i>Generated method</i> - Setter of <code>BTGQuantityOfProductInCartOperand.product</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the product
	 */
	public void setProduct(final ProductModel value)
	{
		_product = getPersistenceContext().setValue(PRODUCT, value);
	}
	
}
