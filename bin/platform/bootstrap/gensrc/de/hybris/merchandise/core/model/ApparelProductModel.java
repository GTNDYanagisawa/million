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
import de.hybris.platform.core.enums.Gender;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.List;

/**
 * Generated model class for type ApparelProduct first defined at extension merchandisecore.
 * <p>
 * Base apparel product extension that contains additional attributes.
 */
@SuppressWarnings("all")
public class ApparelProductModel extends ProductModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ApparelProduct";
	
	/** <i>Generated constant</i> - Attribute key of <code>ApparelProduct.genders</code> attribute defined at extension <code>merchandisecore</code>. */
	public static final String GENDERS = "genders";
	
	
	/** <i>Generated variable</i> - Variable of <code>ApparelProduct.genders</code> attribute defined at extension <code>merchandisecore</code>. */
	private List<Gender> _genders;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ApparelProductModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ApparelProductModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>Product</code> at extension <code>catalog</code>
	 * @param _code initial attribute declared by type <code>Product</code> at extension <code>core</code>
	 */
	@Deprecated
	public ApparelProductModel(final CatalogVersionModel _catalogVersion, final String _code)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>Product</code> at extension <code>catalog</code>
	 * @param _code initial attribute declared by type <code>Product</code> at extension <code>core</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public ApparelProductModel(final CatalogVersionModel _catalogVersion, final String _code, final ItemModel _owner)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelProduct.genders</code> attribute defined at extension <code>merchandisecore</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the genders - List of genders that the ApparelProduct is designed for
	 */
	public List<Gender> getGenders()
	{
		if (this._genders!=null)
		{
			return _genders;
		}
		return _genders = getPersistenceContext().getValue(GENDERS, _genders);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ApparelProduct.genders</code> attribute defined at extension <code>merchandisecore</code>. 
	 *  
	 * @param value the genders - List of genders that the ApparelProduct is designed for
	 */
	public void setGenders(final List<Gender> value)
	{
		_genders = getPersistenceContext().setValue(GENDERS, value);
	}
	
}
