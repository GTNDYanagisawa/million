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
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.voucher.model.RestrictionModel;
import de.hybris.platform.voucher.model.VoucherModel;

/**
 * Generated model class for type RegularCustomerOrderTotalRestriction first defined at extension voucher.
 */
@SuppressWarnings("all")
public class RegularCustomerOrderTotalRestrictionModel extends RestrictionModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "RegularCustomerOrderTotalRestriction";
	
	/** <i>Generated constant</i> - Attribute key of <code>RegularCustomerOrderTotalRestriction.allOrdersTotal</code> attribute defined at extension <code>voucher</code>. */
	public static final String ALLORDERSTOTAL = "allOrdersTotal";
	
	/** <i>Generated constant</i> - Attribute key of <code>RegularCustomerOrderTotalRestriction.currency</code> attribute defined at extension <code>voucher</code>. */
	public static final String CURRENCY = "currency";
	
	/** <i>Generated constant</i> - Attribute key of <code>RegularCustomerOrderTotalRestriction.net</code> attribute defined at extension <code>voucher</code>. */
	public static final String NET = "net";
	
	/** <i>Generated constant</i> - Attribute key of <code>RegularCustomerOrderTotalRestriction.valueofgoodsonly</code> attribute defined at extension <code>voucher</code>. */
	public static final String VALUEOFGOODSONLY = "valueofgoodsonly";
	
	
	/** <i>Generated variable</i> - Variable of <code>RegularCustomerOrderTotalRestriction.allOrdersTotal</code> attribute defined at extension <code>voucher</code>. */
	private Double _allOrdersTotal;
	
	/** <i>Generated variable</i> - Variable of <code>RegularCustomerOrderTotalRestriction.currency</code> attribute defined at extension <code>voucher</code>. */
	private CurrencyModel _currency;
	
	/** <i>Generated variable</i> - Variable of <code>RegularCustomerOrderTotalRestriction.net</code> attribute defined at extension <code>voucher</code>. */
	private Boolean _net;
	
	/** <i>Generated variable</i> - Variable of <code>RegularCustomerOrderTotalRestriction.valueofgoodsonly</code> attribute defined at extension <code>voucher</code>. */
	private Boolean _valueofgoodsonly;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public RegularCustomerOrderTotalRestrictionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public RegularCustomerOrderTotalRestrictionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _allOrdersTotal initial attribute declared by type <code>RegularCustomerOrderTotalRestriction</code> at extension <code>voucher</code>
	 * @param _currency initial attribute declared by type <code>RegularCustomerOrderTotalRestriction</code> at extension <code>voucher</code>
	 * @param _voucher initial attribute declared by type <code>Restriction</code> at extension <code>voucher</code>
	 */
	@Deprecated
	public RegularCustomerOrderTotalRestrictionModel(final Double _allOrdersTotal, final CurrencyModel _currency, final VoucherModel _voucher)
	{
		super();
		setAllOrdersTotal(_allOrdersTotal);
		setCurrency(_currency);
		setVoucher(_voucher);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _allOrdersTotal initial attribute declared by type <code>RegularCustomerOrderTotalRestriction</code> at extension <code>voucher</code>
	 * @param _currency initial attribute declared by type <code>RegularCustomerOrderTotalRestriction</code> at extension <code>voucher</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _voucher initial attribute declared by type <code>Restriction</code> at extension <code>voucher</code>
	 */
	@Deprecated
	public RegularCustomerOrderTotalRestrictionModel(final Double _allOrdersTotal, final CurrencyModel _currency, final ItemModel _owner, final VoucherModel _voucher)
	{
		super();
		setAllOrdersTotal(_allOrdersTotal);
		setCurrency(_currency);
		setOwner(_owner);
		setVoucher(_voucher);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RegularCustomerOrderTotalRestriction.allOrdersTotal</code> attribute defined at extension <code>voucher</code>. 
	 * @return the allOrdersTotal - restrict to customers who ordered a total of x or greater in 
	 * 						their lifetime.
	 */
	public Double getAllOrdersTotal()
	{
		if (this._allOrdersTotal!=null)
		{
			return _allOrdersTotal;
		}
		return _allOrdersTotal = getPersistenceContext().getValue(ALLORDERSTOTAL, _allOrdersTotal);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RegularCustomerOrderTotalRestriction.currency</code> attribute defined at extension <code>voucher</code>. 
	 * @return the currency - the currency associated with the orderTotalSum.
	 */
	public CurrencyModel getCurrency()
	{
		if (this._currency!=null)
		{
			return _currency;
		}
		return _currency = getPersistenceContext().getValue(CURRENCY, _currency);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RegularCustomerOrderTotalRestriction.net</code> attribute defined at extension <code>voucher</code>. 
	 * @return the net - Specifies if total sum of all existing orders is consulted 
	 * 						inclusive or exclusive VAT. Default is true (exclusive VAT).
	 */
	public Boolean getNet()
	{
		if (this._net!=null)
		{
			return _net;
		}
		return _net = getPersistenceContext().getValue(NET, _net);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RegularCustomerOrderTotalRestriction.valueofgoodsonly</code> attribute defined at extension <code>voucher</code>. 
	 * @return the valueofgoodsonly - Specifies if total sum of all orders is consulted inclusive or 
	 * 						exclusive shipping and payment costs. Default is true (exclusive shipping 
	 * 						and payment costs).
	 */
	public Boolean getValueofgoodsonly()
	{
		if (this._valueofgoodsonly!=null)
		{
			return _valueofgoodsonly;
		}
		return _valueofgoodsonly = getPersistenceContext().getValue(VALUEOFGOODSONLY, _valueofgoodsonly);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>RegularCustomerOrderTotalRestriction.allOrdersTotal</code> attribute defined at extension <code>voucher</code>. 
	 *  
	 * @param value the allOrdersTotal - restrict to customers who ordered a total of x or greater in 
	 * 						their lifetime.
	 */
	public void setAllOrdersTotal(final Double value)
	{
		_allOrdersTotal = getPersistenceContext().setValue(ALLORDERSTOTAL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>RegularCustomerOrderTotalRestriction.currency</code> attribute defined at extension <code>voucher</code>. 
	 *  
	 * @param value the currency - the currency associated with the orderTotalSum.
	 */
	public void setCurrency(final CurrencyModel value)
	{
		_currency = getPersistenceContext().setValue(CURRENCY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>RegularCustomerOrderTotalRestriction.net</code> attribute defined at extension <code>voucher</code>. 
	 *  
	 * @param value the net - Specifies if total sum of all existing orders is consulted 
	 * 						inclusive or exclusive VAT. Default is true (exclusive VAT).
	 */
	public void setNet(final Boolean value)
	{
		_net = getPersistenceContext().setValue(NET, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>RegularCustomerOrderTotalRestriction.valueofgoodsonly</code> attribute defined at extension <code>voucher</code>. 
	 *  
	 * @param value the valueofgoodsonly - Specifies if total sum of all orders is consulted inclusive or 
	 * 						exclusive shipping and payment costs. Default is true (exclusive shipping 
	 * 						and payment costs).
	 */
	public void setValueofgoodsonly(final Boolean value)
	{
		_valueofgoodsonly = getPersistenceContext().setValue(VALUEOFGOODSONLY, value);
	}
	
}
