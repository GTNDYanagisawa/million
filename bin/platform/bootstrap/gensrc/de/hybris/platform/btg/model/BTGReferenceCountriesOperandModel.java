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

import de.hybris.platform.btg.model.BTGAbstractReferenceOperandModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type BTGReferenceCountriesOperand first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGReferenceCountriesOperandModel extends BTGAbstractReferenceOperandModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGReferenceCountriesOperand";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGReferenceCountriesOperand.countries</code> attribute defined at extension <code>btg</code>. */
	public static final String COUNTRIES = "countries";
	
	
	/** <i>Generated variable</i> - Variable of <code>BTGReferenceCountriesOperand.countries</code> attribute defined at extension <code>btg</code>. */
	private Collection<CountryModel> _countries;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGReferenceCountriesOperandModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGReferenceCountriesOperandModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _countries initial attribute declared by type <code>BTGReferenceCountriesOperand</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGReferenceCountriesOperandModel(final CatalogVersionModel _catalogVersion, final Collection<CountryModel> _countries, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCountries(_countries);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _countries initial attribute declared by type <code>BTGReferenceCountriesOperand</code> at extension <code>btg</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGReferenceCountriesOperandModel(final CatalogVersionModel _catalogVersion, final Collection<CountryModel> _countries, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCountries(_countries);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGReferenceCountriesOperand.countries</code> attribute defined at extension <code>btg</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the countries
	 */
	public Collection<CountryModel> getCountries()
	{
		if (this._countries!=null)
		{
			return _countries;
		}
		return _countries = getPersistenceContext().getValue(COUNTRIES, _countries);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGReferenceCountriesOperand.countries</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the countries
	 */
	public void setCountries(final Collection<CountryModel> value)
	{
		_countries = getPersistenceContext().setValue(COUNTRIES, value);
	}
	
}
