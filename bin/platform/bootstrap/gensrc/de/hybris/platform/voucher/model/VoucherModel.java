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
package de.hybris.platform.voucher.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.order.price.DiscountModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.voucher.model.RestrictionModel;
import de.hybris.platform.voucher.model.VoucherInvalidationModel;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;

/**
 * Generated model class for type Voucher first defined at extension voucher.
 */
@SuppressWarnings("all")
public class VoucherModel extends DiscountModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "Voucher";
	
	/**<i>Generated relation code constant for relation <code>OrderDiscountRelation</code> defining source attribute <code>orders</code> in extension <code>core</code>.</i>*/
	public final static String _ORDERDISCOUNTRELATION = "OrderDiscountRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>Voucher.description</code> attribute defined at extension <code>voucher</code>. */
	public static final String DESCRIPTION = "description";
	
	/** <i>Generated constant</i> - Attribute key of <code>Voucher.freeShipping</code> attribute defined at extension <code>voucher</code>. */
	public static final String FREESHIPPING = "freeShipping";
	
	/** <i>Generated constant</i> - Attribute key of <code>Voucher.valueString</code> attribute defined at extension <code>voucher</code>. */
	public static final String VALUESTRING = "valueString";
	
	/** <i>Generated constant</i> - Attribute key of <code>Voucher.restrictions</code> attribute defined at extension <code>voucher</code>. */
	public static final String RESTRICTIONS = "restrictions";
	
	/** <i>Generated constant</i> - Attribute key of <code>Voucher.invalidations</code> attribute defined at extension <code>voucher</code>. */
	public static final String INVALIDATIONS = "invalidations";
	
	
	/** <i>Generated variable</i> - Variable of <code>Voucher.freeShipping</code> attribute defined at extension <code>voucher</code>. */
	private Boolean _freeShipping;
	
	/** <i>Generated variable</i> - Variable of <code>Voucher.valueString</code> attribute defined at extension <code>voucher</code>. */
	private String _valueString;
	
	/** <i>Generated variable</i> - Variable of <code>Voucher.restrictions</code> attribute defined at extension <code>voucher</code>. */
	private Set<RestrictionModel> _restrictions;
	
	/** <i>Generated variable</i> - Variable of <code>Voucher.invalidations</code> attribute defined at extension <code>voucher</code>. */
	private Collection<VoucherInvalidationModel> _invalidations;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public VoucherModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public VoucherModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>Voucher</code> at extension <code>voucher</code>
	 */
	@Deprecated
	public VoucherModel(final String _code)
	{
		super();
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>Voucher</code> at extension <code>voucher</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public VoucherModel(final String _code, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Voucher.description</code> attribute defined at extension <code>voucher</code>. 
	 * @return the description - the description of the voucher.
	 */
	public String getDescription()
	{
		return getDescription(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>Voucher.description</code> attribute defined at extension <code>voucher</code>. 
	 * @param loc the value localization key 
	 * @return the description - the description of the voucher.
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getDescription(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(DESCRIPTION, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Voucher.freeShipping</code> attribute defined at extension <code>voucher</code>. 
	 * @return the freeShipping - Specifies if the order this voucher is applied to is shipped 
	 * 						for free (true) or not (false). Default is not (false).
	 */
	public Boolean getFreeShipping()
	{
		if (this._freeShipping!=null)
		{
			return _freeShipping;
		}
		return _freeShipping = getPersistenceContext().getValue(FREESHIPPING, _freeShipping);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Voucher.invalidations</code> attribute defined at extension <code>voucher</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the invalidations
	 */
	public Collection<VoucherInvalidationModel> getInvalidations()
	{
		if (this._invalidations!=null)
		{
			return _invalidations;
		}
		return _invalidations = getPersistenceContext().getValue(INVALIDATIONS, _invalidations);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Voucher.restrictions</code> attribute defined at extension <code>voucher</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the restrictions
	 */
	public Set<RestrictionModel> getRestrictions()
	{
		if (this._restrictions!=null)
		{
			return _restrictions;
		}
		return _restrictions = getPersistenceContext().getValue(RESTRICTIONS, _restrictions);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Voucher.valueString</code> attribute defined at extension <code>voucher</code>. 
	 * @return the valueString - the value of this voucher to display.
	 */
	public String getValueString()
	{
		if (this._valueString!=null)
		{
			return _valueString;
		}
		return _valueString = getPersistenceContext().getValue(VALUESTRING, _valueString);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Voucher.description</code> attribute defined at extension <code>voucher</code>. 
	 *  
	 * @param value the description - the description of the voucher.
	 */
	public void setDescription(final String value)
	{
		setDescription(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>Voucher.description</code> attribute defined at extension <code>voucher</code>. 
	 *  
	 * @param value the description - the description of the voucher.
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setDescription(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(DESCRIPTION, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Voucher.freeShipping</code> attribute defined at extension <code>voucher</code>. 
	 *  
	 * @param value the freeShipping - Specifies if the order this voucher is applied to is shipped 
	 * 						for free (true) or not (false). Default is not (false).
	 */
	public void setFreeShipping(final Boolean value)
	{
		_freeShipping = getPersistenceContext().setValue(FREESHIPPING, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Voucher.invalidations</code> attribute defined at extension <code>voucher</code>. 
	 *  
	 * @param value the invalidations
	 */
	public void setInvalidations(final Collection<VoucherInvalidationModel> value)
	{
		_invalidations = getPersistenceContext().setValue(INVALIDATIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Voucher.restrictions</code> attribute defined at extension <code>voucher</code>. 
	 *  
	 * @param value the restrictions
	 */
	public void setRestrictions(final Set<RestrictionModel> value)
	{
		_restrictions = getPersistenceContext().setValue(RESTRICTIONS, value);
	}
	
}
