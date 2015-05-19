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
 * Generated model class for type OrderRestriction first defined at extension voucher.
 */
@SuppressWarnings("all")
public class OrderRestrictionModel extends RestrictionModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "OrderRestriction";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderRestriction.total</code> attribute defined at extension <code>voucher</code>. */
	public static final String TOTAL = "total";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderRestriction.currency</code> attribute defined at extension <code>voucher</code>. */
	public static final String CURRENCY = "currency";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderRestriction.net</code> attribute defined at extension <code>voucher</code>. */
	public static final String NET = "net";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderRestriction.valueofgoodsonly</code> attribute defined at extension <code>voucher</code>. */
	public static final String VALUEOFGOODSONLY = "valueofgoodsonly";
	
	
	/** <i>Generated variable</i> - Variable of <code>OrderRestriction.total</code> attribute defined at extension <code>voucher</code>. */
	private Double _total;
	
	/** <i>Generated variable</i> - Variable of <code>OrderRestriction.currency</code> attribute defined at extension <code>voucher</code>. */
	private CurrencyModel _currency;
	
	/** <i>Generated variable</i> - Variable of <code>OrderRestriction.net</code> attribute defined at extension <code>voucher</code>. */
	private Boolean _net;
	
	/** <i>Generated variable</i> - Variable of <code>OrderRestriction.valueofgoodsonly</code> attribute defined at extension <code>voucher</code>. */
	private Boolean _valueofgoodsonly;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public OrderRestrictionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public OrderRestrictionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _currency initial attribute declared by type <code>OrderRestriction</code> at extension <code>voucher</code>
	 * @param _total initial attribute declared by type <code>OrderRestriction</code> at extension <code>voucher</code>
	 * @param _voucher initial attribute declared by type <code>Restriction</code> at extension <code>voucher</code>
	 */
	@Deprecated
	public OrderRestrictionModel(final CurrencyModel _currency, final Double _total, final VoucherModel _voucher)
	{
		super();
		setCurrency(_currency);
		setTotal(_total);
		setVoucher(_voucher);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _currency initial attribute declared by type <code>OrderRestriction</code> at extension <code>voucher</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _total initial attribute declared by type <code>OrderRestriction</code> at extension <code>voucher</code>
	 * @param _voucher initial attribute declared by type <code>Restriction</code> at extension <code>voucher</code>
	 */
	@Deprecated
	public OrderRestrictionModel(final CurrencyModel _currency, final ItemModel _owner, final Double _total, final VoucherModel _voucher)
	{
		super();
		setCurrency(_currency);
		setOwner(_owner);
		setTotal(_total);
		setVoucher(_voucher);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRestriction.currency</code> attribute defined at extension <code>voucher</code>. 
	 * @return the currency - the currency of the total sum of an order for which the given voucher is valid.
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
	 * <i>Generated method</i> - Getter of the <code>OrderRestriction.net</code> attribute defined at extension <code>voucher</code>. 
	 * @return the net - Specifies if total sum of an order is consulted inclusive or exclusive VAT. 
	 * 						Default is true (exclusive VAT).
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
	 * <i>Generated method</i> - Getter of the <code>OrderRestriction.total</code> attribute defined at extension <code>voucher</code>. 
	 * @return the total - the total sum of an order for which the given voucher is valid.
	 */
	public Double getTotal()
	{
		if (this._total!=null)
		{
			return _total;
		}
		return _total = getPersistenceContext().getValue(TOTAL, _total);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRestriction.valueofgoodsonly</code> attribute defined at extension <code>voucher</code>. 
	 * @return the valueofgoodsonly - Specifies if total sum of an order is consulted inclusive or exclusive shipping and payment costs.
	 * 						Default is true (exclusive shipping costs).
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
	 * <i>Generated method</i> - Setter of <code>OrderRestriction.currency</code> attribute defined at extension <code>voucher</code>. 
	 *  
	 * @param value the currency - the currency of the total sum of an order for which the given voucher is valid.
	 */
	public void setCurrency(final CurrencyModel value)
	{
		_currency = getPersistenceContext().setValue(CURRENCY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderRestriction.net</code> attribute defined at extension <code>voucher</code>. 
	 *  
	 * @param value the net - Specifies if total sum of an order is consulted inclusive or exclusive VAT. 
	 * 						Default is true (exclusive VAT).
	 */
	public void setNet(final Boolean value)
	{
		_net = getPersistenceContext().setValue(NET, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderRestriction.total</code> attribute defined at extension <code>voucher</code>. 
	 *  
	 * @param value the total - the total sum of an order for which the given voucher is valid.
	 */
	public void setTotal(final Double value)
	{
		_total = getPersistenceContext().setValue(TOTAL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderRestriction.valueofgoodsonly</code> attribute defined at extension <code>voucher</code>. 
	 *  
	 * @param value the valueofgoodsonly - Specifies if total sum of an order is consulted inclusive or exclusive shipping and payment costs.
	 * 						Default is true (exclusive shipping costs).
	 */
	public void setValueofgoodsonly(final Boolean value)
	{
		_valueofgoodsonly = getPersistenceContext().setValue(VALUEOFGOODSONLY, value);
	}
	
}
