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

import de.hybris.platform.core.HybrisEnumValue;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.product.UnitModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Date;

/**
 * Generated model class for type PriceCopy first defined at extension bmecat.
 */
@SuppressWarnings("all")
public class PriceCopyModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PriceCopy";
	
	/** <i>Generated constant</i> - Attribute key of <code>PriceCopy.productCode</code> attribute defined at extension <code>bmecat</code>. */
	public static final String PRODUCTCODE = "productCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>PriceCopy.unit</code> attribute defined at extension <code>bmecat</code>. */
	public static final String UNIT = "unit";
	
	/** <i>Generated constant</i> - Attribute key of <code>PriceCopy.unitFactor</code> attribute defined at extension <code>bmecat</code>. */
	public static final String UNITFACTOR = "unitFactor";
	
	/** <i>Generated constant</i> - Attribute key of <code>PriceCopy.userPriceGroup</code> attribute defined at extension <code>bmecat</code>. */
	public static final String USERPRICEGROUP = "userPriceGroup";
	
	/** <i>Generated constant</i> - Attribute key of <code>PriceCopy.minQuantity</code> attribute defined at extension <code>bmecat</code>. */
	public static final String MINQUANTITY = "minQuantity";
	
	/** <i>Generated constant</i> - Attribute key of <code>PriceCopy.currency</code> attribute defined at extension <code>bmecat</code>. */
	public static final String CURRENCY = "currency";
	
	/** <i>Generated constant</i> - Attribute key of <code>PriceCopy.net</code> attribute defined at extension <code>bmecat</code>. */
	public static final String NET = "net";
	
	/** <i>Generated constant</i> - Attribute key of <code>PriceCopy.startDate</code> attribute defined at extension <code>bmecat</code>. */
	public static final String STARTDATE = "startDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>PriceCopy.endDate</code> attribute defined at extension <code>bmecat</code>. */
	public static final String ENDDATE = "endDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>PriceCopy.priceValue</code> attribute defined at extension <code>bmecat</code>. */
	public static final String PRICEVALUE = "priceValue";
	
	
	/** <i>Generated variable</i> - Variable of <code>PriceCopy.productCode</code> attribute defined at extension <code>bmecat</code>. */
	private String _productCode;
	
	/** <i>Generated variable</i> - Variable of <code>PriceCopy.unit</code> attribute defined at extension <code>bmecat</code>. */
	private UnitModel _unit;
	
	/** <i>Generated variable</i> - Variable of <code>PriceCopy.unitFactor</code> attribute defined at extension <code>bmecat</code>. */
	private Integer _unitFactor;
	
	/** <i>Generated variable</i> - Variable of <code>PriceCopy.userPriceGroup</code> attribute defined at extension <code>bmecat</code>. */
	private HybrisEnumValue _userPriceGroup;
	
	/** <i>Generated variable</i> - Variable of <code>PriceCopy.minQuantity</code> attribute defined at extension <code>bmecat</code>. */
	private Long _minQuantity;
	
	/** <i>Generated variable</i> - Variable of <code>PriceCopy.currency</code> attribute defined at extension <code>bmecat</code>. */
	private CurrencyModel _currency;
	
	/** <i>Generated variable</i> - Variable of <code>PriceCopy.net</code> attribute defined at extension <code>bmecat</code>. */
	private Boolean _net;
	
	/** <i>Generated variable</i> - Variable of <code>PriceCopy.startDate</code> attribute defined at extension <code>bmecat</code>. */
	private Date _startDate;
	
	/** <i>Generated variable</i> - Variable of <code>PriceCopy.endDate</code> attribute defined at extension <code>bmecat</code>. */
	private Date _endDate;
	
	/** <i>Generated variable</i> - Variable of <code>PriceCopy.priceValue</code> attribute defined at extension <code>bmecat</code>. */
	private Double _priceValue;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PriceCopyModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PriceCopyModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _endDate initial attribute declared by type <code>PriceCopy</code> at extension <code>bmecat</code>
	 * @param _net initial attribute declared by type <code>PriceCopy</code> at extension <code>bmecat</code>
	 * @param _startDate initial attribute declared by type <code>PriceCopy</code> at extension <code>bmecat</code>
	 */
	@Deprecated
	public PriceCopyModel(final Date _endDate, final Boolean _net, final Date _startDate)
	{
		super();
		setEndDate(_endDate);
		setNet(_net);
		setStartDate(_startDate);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _endDate initial attribute declared by type <code>PriceCopy</code> at extension <code>bmecat</code>
	 * @param _net initial attribute declared by type <code>PriceCopy</code> at extension <code>bmecat</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _startDate initial attribute declared by type <code>PriceCopy</code> at extension <code>bmecat</code>
	 */
	@Deprecated
	public PriceCopyModel(final Date _endDate, final Boolean _net, final ItemModel _owner, final Date _startDate)
	{
		super();
		setEndDate(_endDate);
		setNet(_net);
		setOwner(_owner);
		setStartDate(_startDate);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceCopy.currency</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the currency - Currency
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
	 * <i>Generated method</i> - Getter of the <code>PriceCopy.endDate</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the endDate - EndDate
	 */
	public Date getEndDate()
	{
		if (this._endDate!=null)
		{
			return _endDate;
		}
		return _endDate = getPersistenceContext().getValue(ENDDATE, _endDate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceCopy.minQuantity</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the minQuantity - MinimumQuantity
	 */
	public Long getMinQuantity()
	{
		if (this._minQuantity!=null)
		{
			return _minQuantity;
		}
		return _minQuantity = getPersistenceContext().getValue(MINQUANTITY, _minQuantity);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceCopy.net</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the net - Net
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
	 * <i>Generated method</i> - Getter of the <code>PriceCopy.priceValue</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the priceValue
	 */
	public Double getPriceValue()
	{
		if (this._priceValue!=null)
		{
			return _priceValue;
		}
		return _priceValue = getPersistenceContext().getValue(PRICEVALUE, _priceValue);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceCopy.productCode</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the productCode - ProductCode
	 */
	public String getProductCode()
	{
		if (this._productCode!=null)
		{
			return _productCode;
		}
		return _productCode = getPersistenceContext().getValue(PRODUCTCODE, _productCode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceCopy.startDate</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the startDate - StartDate
	 */
	public Date getStartDate()
	{
		if (this._startDate!=null)
		{
			return _startDate;
		}
		return _startDate = getPersistenceContext().getValue(STARTDATE, _startDate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceCopy.unit</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the unit - Unit
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
	 * <i>Generated method</i> - Getter of the <code>PriceCopy.unitFactor</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the unitFactor - UnitFactor
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
	 * <i>Generated method</i> - Getter of the <code>PriceCopy.userPriceGroup</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the userPriceGroup - UserPriceGroup
	 */
	public HybrisEnumValue getUserPriceGroup()
	{
		if (this._userPriceGroup!=null)
		{
			return _userPriceGroup;
		}
		return _userPriceGroup = getPersistenceContext().getValue(USERPRICEGROUP, _userPriceGroup);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PriceCopy.currency</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the currency - Currency
	 */
	public void setCurrency(final CurrencyModel value)
	{
		_currency = getPersistenceContext().setValue(CURRENCY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PriceCopy.endDate</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the endDate - EndDate
	 */
	public void setEndDate(final Date value)
	{
		_endDate = getPersistenceContext().setValue(ENDDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PriceCopy.minQuantity</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the minQuantity - MinimumQuantity
	 */
	public void setMinQuantity(final Long value)
	{
		_minQuantity = getPersistenceContext().setValue(MINQUANTITY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PriceCopy.net</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the net - Net
	 */
	public void setNet(final Boolean value)
	{
		_net = getPersistenceContext().setValue(NET, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PriceCopy.priceValue</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the priceValue
	 */
	public void setPriceValue(final Double value)
	{
		_priceValue = getPersistenceContext().setValue(PRICEVALUE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PriceCopy.productCode</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the productCode - ProductCode
	 */
	public void setProductCode(final String value)
	{
		_productCode = getPersistenceContext().setValue(PRODUCTCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PriceCopy.startDate</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the startDate - StartDate
	 */
	public void setStartDate(final Date value)
	{
		_startDate = getPersistenceContext().setValue(STARTDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PriceCopy.unit</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the unit - Unit
	 */
	public void setUnit(final UnitModel value)
	{
		_unit = getPersistenceContext().setValue(UNIT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PriceCopy.unitFactor</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the unitFactor - UnitFactor
	 */
	public void setUnitFactor(final Integer value)
	{
		_unitFactor = getPersistenceContext().setValue(UNITFACTOR, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PriceCopy.userPriceGroup</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the userPriceGroup - UserPriceGroup
	 */
	public void setUserPriceGroup(final HybrisEnumValue value)
	{
		_userPriceGroup = getPersistenceContext().setValue(USERPRICEGROUP, value);
	}
	
}
