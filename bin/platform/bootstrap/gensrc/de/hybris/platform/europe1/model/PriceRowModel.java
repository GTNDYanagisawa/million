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
package de.hybris.platform.europe1.model;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.HybrisEnumValue;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.product.UnitModel;
import de.hybris.platform.europe1.enums.PriceRowChannel;
import de.hybris.platform.europe1.enums.ProductPriceGroup;
import de.hybris.platform.europe1.model.PDTRowModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type PriceRow first defined at extension europe1.
 */
@SuppressWarnings("all")
public class PriceRowModel extends PDTRowModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PriceRow";
	
	/** <i>Generated constant</i> - Attribute key of <code>PriceRow.catalogVersion</code> attribute defined at extension <code>europe1</code>. */
	public static final String CATALOGVERSION = "catalogVersion";
	
	/** <i>Generated constant</i> - Attribute key of <code>PriceRow.matchValue</code> attribute defined at extension <code>europe1</code>. */
	public static final String MATCHVALUE = "matchValue";
	
	/** <i>Generated constant</i> - Attribute key of <code>PriceRow.currency</code> attribute defined at extension <code>europe1</code>. */
	public static final String CURRENCY = "currency";
	
	/** <i>Generated constant</i> - Attribute key of <code>PriceRow.minqtd</code> attribute defined at extension <code>europe1</code>. */
	public static final String MINQTD = "minqtd";
	
	/** <i>Generated constant</i> - Attribute key of <code>PriceRow.net</code> attribute defined at extension <code>europe1</code>. */
	public static final String NET = "net";
	
	/** <i>Generated constant</i> - Attribute key of <code>PriceRow.price</code> attribute defined at extension <code>europe1</code>. */
	public static final String PRICE = "price";
	
	/** <i>Generated constant</i> - Attribute key of <code>PriceRow.unit</code> attribute defined at extension <code>europe1</code>. */
	public static final String UNIT = "unit";
	
	/** <i>Generated constant</i> - Attribute key of <code>PriceRow.unitFactor</code> attribute defined at extension <code>europe1</code>. */
	public static final String UNITFACTOR = "unitFactor";
	
	/** <i>Generated constant</i> - Attribute key of <code>PriceRow.giveAwayPrice</code> attribute defined at extension <code>europe1</code>. */
	public static final String GIVEAWAYPRICE = "giveAwayPrice";
	
	/** <i>Generated constant</i> - Attribute key of <code>PriceRow.channel</code> attribute defined at extension <code>europe1</code>. */
	public static final String CHANNEL = "channel";
	
	/** <i>Generated constant</i> - Attribute key of <code>PriceRow.sequenceId</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String SEQUENCEID = "sequenceId";
	
	
	/** <i>Generated variable</i> - Variable of <code>PriceRow.catalogVersion</code> attribute defined at extension <code>europe1</code>. */
	private CatalogVersionModel _catalogVersion;
	
	/** <i>Generated variable</i> - Variable of <code>PriceRow.matchValue</code> attribute defined at extension <code>europe1</code>. */
	private Integer _matchValue;
	
	/** <i>Generated variable</i> - Variable of <code>PriceRow.currency</code> attribute defined at extension <code>europe1</code>. */
	private CurrencyModel _currency;
	
	/** <i>Generated variable</i> - Variable of <code>PriceRow.minqtd</code> attribute defined at extension <code>europe1</code>. */
	private Long _minqtd;
	
	/** <i>Generated variable</i> - Variable of <code>PriceRow.net</code> attribute defined at extension <code>europe1</code>. */
	private Boolean _net;
	
	/** <i>Generated variable</i> - Variable of <code>PriceRow.price</code> attribute defined at extension <code>europe1</code>. */
	private Double _price;
	
	/** <i>Generated variable</i> - Variable of <code>PriceRow.unit</code> attribute defined at extension <code>europe1</code>. */
	private UnitModel _unit;
	
	/** <i>Generated variable</i> - Variable of <code>PriceRow.unitFactor</code> attribute defined at extension <code>europe1</code>. */
	private Integer _unitFactor;
	
	/** <i>Generated variable</i> - Variable of <code>PriceRow.giveAwayPrice</code> attribute defined at extension <code>europe1</code>. */
	private Boolean _giveAwayPrice;
	
	/** <i>Generated variable</i> - Variable of <code>PriceRow.channel</code> attribute defined at extension <code>europe1</code>. */
	private PriceRowChannel _channel;
	
	/** <i>Generated variable</i> - Variable of <code>PriceRow.sequenceId</code> attribute defined at extension <code>acceleratorservices</code>. */
	private Long _sequenceId;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PriceRowModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PriceRowModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _currency initial attribute declared by type <code>PriceRow</code> at extension <code>europe1</code>
	 * @param _price initial attribute declared by type <code>PriceRow</code> at extension <code>europe1</code>
	 * @param _unit initial attribute declared by type <code>PriceRow</code> at extension <code>europe1</code>
	 */
	@Deprecated
	public PriceRowModel(final CurrencyModel _currency, final Double _price, final UnitModel _unit)
	{
		super();
		setCurrency(_currency);
		setPrice(_price);
		setUnit(_unit);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _currency initial attribute declared by type <code>PriceRow</code> at extension <code>europe1</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _pg initial attribute declared by type <code>PriceRow</code> at extension <code>europe1</code>
	 * @param _price initial attribute declared by type <code>PriceRow</code> at extension <code>europe1</code>
	 * @param _product initial attribute declared by type <code>PDTRow</code> at extension <code>europe1</code>
	 * @param _productId initial attribute declared by type <code>PDTRow</code> at extension <code>europe1</code>
	 * @param _unit initial attribute declared by type <code>PriceRow</code> at extension <code>europe1</code>
	 */
	@Deprecated
	public PriceRowModel(final CurrencyModel _currency, final ItemModel _owner, final ProductPriceGroup _pg, final Double _price, final ProductModel _product, final String _productId, final UnitModel _unit)
	{
		super();
		setCurrency(_currency);
		setOwner(_owner);
		setPg(_pg);
		setPrice(_price);
		setProduct(_product);
		setProductId(_productId);
		setUnit(_unit);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRow.catalogVersion</code> attribute defined at extension <code>europe1</code>. 
	 * @return the catalogVersion
	 */
	public CatalogVersionModel getCatalogVersion()
	{
		if (this._catalogVersion!=null)
		{
			return _catalogVersion;
		}
		return _catalogVersion = getPersistenceContext().getValue(CATALOGVERSION, _catalogVersion);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRow.channel</code> attribute defined at extension <code>europe1</code>. 
	 * @return the channel
	 */
	public PriceRowChannel getChannel()
	{
		if (this._channel!=null)
		{
			return _channel;
		}
		return _channel = getPersistenceContext().getValue(CHANNEL, _channel);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRow.currency</code> attribute defined at extension <code>europe1</code>. 
	 * @return the currency
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
	 * <i>Generated method</i> - Getter of the <code>PriceRow.giveAwayPrice</code> attribute defined at extension <code>europe1</code>. 
	 * @return the giveAwayPrice
	 */
	public Boolean getGiveAwayPrice()
	{
		if (this._giveAwayPrice!=null)
		{
			return _giveAwayPrice;
		}
		return _giveAwayPrice = getPersistenceContext().getValue(GIVEAWAYPRICE, _giveAwayPrice);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRow.matchValue</code> attribute defined at extension <code>europe1</code>. 
	 * @return the matchValue
	 */
	public Integer getMatchValue()
	{
		if (this._matchValue!=null)
		{
			return _matchValue;
		}
		return _matchValue = getPersistenceContext().getValue(MATCHVALUE, _matchValue);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRow.minqtd</code> attribute defined at extension <code>europe1</code>. 
	 * @return the minqtd
	 */
	public Long getMinqtd()
	{
		if (this._minqtd!=null)
		{
			return _minqtd;
		}
		return _minqtd = getPersistenceContext().getValue(MINQTD, _minqtd);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRow.net</code> attribute defined at extension <code>europe1</code>. 
	 * @return the net
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
	 * <i>Generated method</i> - Getter of the <code>PriceRow.price</code> attribute defined at extension <code>europe1</code>. 
	 * @return the price
	 */
	public Double getPrice()
	{
		if (this._price!=null)
		{
			return _price;
		}
		return _price = getPersistenceContext().getValue(PRICE, _price);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRow.sequenceId</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the sequenceId - Attribute is used in batch import process for avoiding multiple imports.
	 */
	public Long getSequenceId()
	{
		if (this._sequenceId!=null)
		{
			return _sequenceId;
		}
		return _sequenceId = getPersistenceContext().getValue(SEQUENCEID, _sequenceId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRow.unit</code> attribute defined at extension <code>europe1</code>. 
	 * @return the unit
	 */
	public UnitModel getUnit()
	{
		if (this._unit!=null)
		{
			return _unit;
		}
		return _unit = getPersistenceContext().getValue(UNIT, _unit);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRow.unitFactor</code> attribute defined at extension <code>europe1</code>. 
	 * @return the unitFactor
	 */
	public Integer getUnitFactor()
	{
		if (this._unitFactor!=null)
		{
			return _unitFactor;
		}
		return _unitFactor = getPersistenceContext().getValue(UNITFACTOR, _unitFactor);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PriceRow.catalogVersion</code> attribute defined at extension <code>europe1</code>. 
	 *  
	 * @param value the catalogVersion
	 */
	public void setCatalogVersion(final CatalogVersionModel value)
	{
		_catalogVersion = getPersistenceContext().setValue(CATALOGVERSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PriceRow.channel</code> attribute defined at extension <code>europe1</code>. 
	 *  
	 * @param value the channel
	 */
	public void setChannel(final PriceRowChannel value)
	{
		_channel = getPersistenceContext().setValue(CHANNEL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PriceRow.currency</code> attribute defined at extension <code>europe1</code>. 
	 *  
	 * @param value the currency
	 */
	public void setCurrency(final CurrencyModel value)
	{
		_currency = getPersistenceContext().setValue(CURRENCY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PriceRow.giveAwayPrice</code> attribute defined at extension <code>europe1</code>. 
	 *  
	 * @param value the giveAwayPrice
	 */
	public void setGiveAwayPrice(final Boolean value)
	{
		_giveAwayPrice = getPersistenceContext().setValue(GIVEAWAYPRICE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PriceRow.matchValue</code> attribute defined at extension <code>europe1</code>. 
	 *  
	 * @param value the matchValue
	 */
	public void setMatchValue(final Integer value)
	{
		_matchValue = getPersistenceContext().setValue(MATCHVALUE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PriceRow.minqtd</code> attribute defined at extension <code>europe1</code>. 
	 *  
	 * @param value the minqtd
	 */
	public void setMinqtd(final Long value)
	{
		_minqtd = getPersistenceContext().setValue(MINQTD, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PriceRow.net</code> attribute defined at extension <code>europe1</code>. 
	 *  
	 * @param value the net
	 */
	public void setNet(final Boolean value)
	{
		_net = getPersistenceContext().setValue(NET, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>PDTRow.pg</code> attribute defined at extension <code>europe1</code> and redeclared at extension <code>europe1</code>. Can only be used at creation of model - before first save. Will only accept values of type {@link de.hybris.platform.europe1.enums.ProductPriceGroup}.  
	 *  
	 * @param value the pg
	 */
	@Override
	public void setPg(final HybrisEnumValue value)
	{
		super.setPg(value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PriceRow.price</code> attribute defined at extension <code>europe1</code>. 
	 *  
	 * @param value the price
	 */
	public void setPrice(final Double value)
	{
		_price = getPersistenceContext().setValue(PRICE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PriceRow.sequenceId</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the sequenceId - Attribute is used in batch import process for avoiding multiple imports.
	 */
	public void setSequenceId(final Long value)
	{
		_sequenceId = getPersistenceContext().setValue(SEQUENCEID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PriceRow.unit</code> attribute defined at extension <code>europe1</code>. 
	 *  
	 * @param value the unit
	 */
	public void setUnit(final UnitModel value)
	{
		_unit = getPersistenceContext().setValue(UNIT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PriceRow.unitFactor</code> attribute defined at extension <code>europe1</code>. 
	 *  
	 * @param value the unitFactor
	 */
	public void setUnitFactor(final Integer value)
	{
		_unitFactor = getPersistenceContext().setValue(UNITFACTOR, value);
	}
	
}
