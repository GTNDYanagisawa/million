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
package de.hybris.platform.mobileservices.model.text;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.mobileservices.model.text.MobileShortcodeModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Generated model class for type MobileCostPlan first defined at extension mobileservices.
 */
@SuppressWarnings("all")
public class MobileCostPlanModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "MobileCostPlan";
	
	/**<i>Generated relation code constant for relation <code>ShortcodeRevenueRelation</code> defining source attribute <code>receivingShortcode</code> in extension <code>mobileservices</code>.</i>*/
	public final static String _SHORTCODEREVENUERELATION = "ShortcodeRevenueRelation";
	
	/**<i>Generated relation code constant for relation <code>ShortcodeCostRelation</code> defining source attribute <code>sendingShortcode</code> in extension <code>mobileservices</code>.</i>*/
	public final static String _SHORTCODECOSTRELATION = "ShortcodeCostRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileCostPlan.price</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String PRICE = "price";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileCostPlan.priceCurrency</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String PRICECURRENCY = "priceCurrency";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileCostPlan.startDate</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String STARTDATE = "startDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileCostPlan.endDate</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String ENDDATE = "endDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileCostPlan.receivingShortcode</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String RECEIVINGSHORTCODE = "receivingShortcode";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileCostPlan.sendingShortcode</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String SENDINGSHORTCODE = "sendingShortcode";
	
	
	/** <i>Generated variable</i> - Variable of <code>MobileCostPlan.price</code> attribute defined at extension <code>mobileservices</code>. */
	private BigDecimal _price;
	
	/** <i>Generated variable</i> - Variable of <code>MobileCostPlan.priceCurrency</code> attribute defined at extension <code>mobileservices</code>. */
	private CurrencyModel _priceCurrency;
	
	/** <i>Generated variable</i> - Variable of <code>MobileCostPlan.startDate</code> attribute defined at extension <code>mobileservices</code>. */
	private Date _startDate;
	
	/** <i>Generated variable</i> - Variable of <code>MobileCostPlan.endDate</code> attribute defined at extension <code>mobileservices</code>. */
	private Date _endDate;
	
	/** <i>Generated variable</i> - Variable of <code>MobileCostPlan.receivingShortcode</code> attribute defined at extension <code>mobileservices</code>. */
	private MobileShortcodeModel _receivingShortcode;
	
	/** <i>Generated variable</i> - Variable of <code>MobileCostPlan.sendingShortcode</code> attribute defined at extension <code>mobileservices</code>. */
	private MobileShortcodeModel _sendingShortcode;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public MobileCostPlanModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public MobileCostPlanModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public MobileCostPlanModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileCostPlan.endDate</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the endDate
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
	 * <i>Generated method</i> - Getter of the <code>MobileCostPlan.price</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the price
	 */
	public BigDecimal getPrice()
	{
		if (this._price!=null)
		{
			return _price;
		}
		return _price = getPersistenceContext().getValue(PRICE, _price);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileCostPlan.priceCurrency</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the priceCurrency
	 */
	public CurrencyModel getPriceCurrency()
	{
		if (this._priceCurrency!=null)
		{
			return _priceCurrency;
		}
		return _priceCurrency = getPersistenceContext().getValue(PRICECURRENCY, _priceCurrency);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileCostPlan.receivingShortcode</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the receivingShortcode
	 */
	public MobileShortcodeModel getReceivingShortcode()
	{
		if (this._receivingShortcode!=null)
		{
			return _receivingShortcode;
		}
		return _receivingShortcode = getPersistenceContext().getValue(RECEIVINGSHORTCODE, _receivingShortcode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileCostPlan.sendingShortcode</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the sendingShortcode
	 */
	public MobileShortcodeModel getSendingShortcode()
	{
		if (this._sendingShortcode!=null)
		{
			return _sendingShortcode;
		}
		return _sendingShortcode = getPersistenceContext().getValue(SENDINGSHORTCODE, _sendingShortcode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileCostPlan.startDate</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the startDate
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
	 * <i>Generated method</i> - Setter of <code>MobileCostPlan.endDate</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the endDate
	 */
	public void setEndDate(final Date value)
	{
		_endDate = getPersistenceContext().setValue(ENDDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileCostPlan.price</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the price
	 */
	public void setPrice(final BigDecimal value)
	{
		_price = getPersistenceContext().setValue(PRICE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileCostPlan.priceCurrency</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the priceCurrency
	 */
	public void setPriceCurrency(final CurrencyModel value)
	{
		_priceCurrency = getPersistenceContext().setValue(PRICECURRENCY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileCostPlan.receivingShortcode</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the receivingShortcode
	 */
	public void setReceivingShortcode(final MobileShortcodeModel value)
	{
		_receivingShortcode = getPersistenceContext().setValue(RECEIVINGSHORTCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileCostPlan.sendingShortcode</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the sendingShortcode
	 */
	public void setSendingShortcode(final MobileShortcodeModel value)
	{
		_sendingShortcode = getPersistenceContext().setValue(SENDINGSHORTCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileCostPlan.startDate</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the startDate
	 */
	public void setStartDate(final Date value)
	{
		_startDate = getPersistenceContext().setValue(STARTDATE, value);
	}
	
}
