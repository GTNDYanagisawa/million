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
package de.hybris.platform.core.model.order;

import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commerceservices.model.promotions.PromotionOrderRestrictionModel;
import de.hybris.platform.core.enums.DeliveryStatus;
import de.hybris.platform.core.enums.ExportStatus;
import de.hybris.platform.core.enums.OrderStatus;
import de.hybris.platform.core.enums.PaymentStatus;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.delivery.DeliveryModeModel;
import de.hybris.platform.core.model.order.payment.PaymentInfoModel;
import de.hybris.platform.core.model.order.payment.PaymentModeModel;
import de.hybris.platform.core.model.order.price.DiscountModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.ordersplitting.model.ConsignmentModel;
import de.hybris.platform.payment.model.PaymentTransactionModel;
import de.hybris.platform.promotions.model.PromotionResultModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.store.BaseStoreModel;
import de.hybris.platform.util.DiscountValue;
import de.hybris.platform.util.TaxValue;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Generated model class for type AbstractOrder first defined at extension core.
 */
@SuppressWarnings("all")
public class AbstractOrderModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "AbstractOrder";
	
	/**<i>Generated relation code constant for relation <code>ConsignmentOrderRelation</code> defining source attribute <code>consignments</code> in extension <code>basecommerce</code>.</i>*/
	public final static String _CONSIGNMENTORDERRELATION = "ConsignmentOrderRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.calculated</code> attribute defined at extension <code>core</code>. */
	public static final String CALCULATED = "calculated";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.code</code> attribute defined at extension <code>core</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.currency</code> attribute defined at extension <code>core</code>. */
	public static final String CURRENCY = "currency";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.date</code> attribute defined at extension <code>core</code>. */
	public static final String DATE = "date";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.deliveryAddress</code> attribute defined at extension <code>core</code>. */
	public static final String DELIVERYADDRESS = "deliveryAddress";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.deliveryCost</code> attribute defined at extension <code>core</code>. */
	public static final String DELIVERYCOST = "deliveryCost";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.deliveryMode</code> attribute defined at extension <code>core</code>. */
	public static final String DELIVERYMODE = "deliveryMode";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.deliveryStatus</code> attribute defined at extension <code>core</code>. */
	public static final String DELIVERYSTATUS = "deliveryStatus";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.globalDiscountValuesInternal</code> attribute defined at extension <code>core</code>. */
	public static final String GLOBALDISCOUNTVALUESINTERNAL = "globalDiscountValuesInternal";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.globalDiscountValues</code> attribute defined at extension <code>core</code>. */
	public static final String GLOBALDISCOUNTVALUES = "globalDiscountValues";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.net</code> attribute defined at extension <code>core</code>. */
	public static final String NET = "net";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.paymentAddress</code> attribute defined at extension <code>core</code>. */
	public static final String PAYMENTADDRESS = "paymentAddress";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.paymentCost</code> attribute defined at extension <code>core</code>. */
	public static final String PAYMENTCOST = "paymentCost";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.paymentInfo</code> attribute defined at extension <code>core</code>. */
	public static final String PAYMENTINFO = "paymentInfo";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.paymentMode</code> attribute defined at extension <code>core</code>. */
	public static final String PAYMENTMODE = "paymentMode";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.paymentStatus</code> attribute defined at extension <code>core</code>. */
	public static final String PAYMENTSTATUS = "paymentStatus";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.status</code> attribute defined at extension <code>core</code>. */
	public static final String STATUS = "status";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.exportStatus</code> attribute defined at extension <code>core</code>. */
	public static final String EXPORTSTATUS = "exportStatus";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.statusInfo</code> attribute defined at extension <code>core</code>. */
	public static final String STATUSINFO = "statusInfo";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.totalPrice</code> attribute defined at extension <code>core</code>. */
	public static final String TOTALPRICE = "totalPrice";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.totalDiscounts</code> attribute defined at extension <code>core</code>. */
	public static final String TOTALDISCOUNTS = "totalDiscounts";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.totalTax</code> attribute defined at extension <code>core</code>. */
	public static final String TOTALTAX = "totalTax";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.totalTaxValuesInternal</code> attribute defined at extension <code>core</code>. */
	public static final String TOTALTAXVALUESINTERNAL = "totalTaxValuesInternal";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.totalTaxValues</code> attribute defined at extension <code>core</code>. */
	public static final String TOTALTAXVALUES = "totalTaxValues";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.user</code> attribute defined at extension <code>core</code>. */
	public static final String USER = "user";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.subtotal</code> attribute defined at extension <code>core</code>. */
	public static final String SUBTOTAL = "subtotal";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.discountsIncludeDeliveryCost</code> attribute defined at extension <code>core</code>. */
	public static final String DISCOUNTSINCLUDEDELIVERYCOST = "discountsIncludeDeliveryCost";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.discountsIncludePaymentCost</code> attribute defined at extension <code>core</code>. */
	public static final String DISCOUNTSINCLUDEPAYMENTCOST = "discountsIncludePaymentCost";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.entries</code> attribute defined at extension <code>core</code>. */
	public static final String ENTRIES = "entries";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.discounts</code> attribute defined at extension <code>core</code>. */
	public static final String DISCOUNTS = "discounts";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.previousDeliveryMode</code> attribute defined at extension <code>promotions</code>. */
	public static final String PREVIOUSDELIVERYMODE = "previousDeliveryMode";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.allPromotionResults</code> attribute defined at extension <code>promotions</code>. */
	public static final String ALLPROMOTIONRESULTS = "allPromotionResults";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.consignments</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CONSIGNMENTS = "consignments";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.paymentTransactions</code> attribute defined at extension <code>payment</code>. */
	public static final String PAYMENTTRANSACTIONS = "paymentTransactions";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.site</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String SITE = "site";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.store</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String STORE = "store";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.guid</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String GUID = "guid";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrder.promotionOrderRestrictions</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String PROMOTIONORDERRESTRICTIONS = "promotionOrderRestrictions";
	
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.calculated</code> attribute defined at extension <code>core</code>. */
	private Boolean _calculated;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.code</code> attribute defined at extension <code>core</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.currency</code> attribute defined at extension <code>core</code>. */
	private CurrencyModel _currency;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.date</code> attribute defined at extension <code>core</code>. */
	private Date _date;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.deliveryAddress</code> attribute defined at extension <code>core</code>. */
	private AddressModel _deliveryAddress;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.deliveryCost</code> attribute defined at extension <code>core</code>. */
	private Double _deliveryCost;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.deliveryMode</code> attribute defined at extension <code>core</code>. */
	private DeliveryModeModel _deliveryMode;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.deliveryStatus</code> attribute defined at extension <code>core</code>. */
	private DeliveryStatus _deliveryStatus;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.globalDiscountValuesInternal</code> attribute defined at extension <code>core</code>. */
	private String _globalDiscountValuesInternal;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.globalDiscountValues</code> attribute defined at extension <code>core</code>. */
	private List<DiscountValue> _globalDiscountValues;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.net</code> attribute defined at extension <code>core</code>. */
	private Boolean _net;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.paymentAddress</code> attribute defined at extension <code>core</code>. */
	private AddressModel _paymentAddress;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.paymentCost</code> attribute defined at extension <code>core</code>. */
	private Double _paymentCost;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.paymentInfo</code> attribute defined at extension <code>core</code>. */
	private PaymentInfoModel _paymentInfo;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.paymentMode</code> attribute defined at extension <code>core</code>. */
	private PaymentModeModel _paymentMode;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.paymentStatus</code> attribute defined at extension <code>core</code>. */
	private PaymentStatus _paymentStatus;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.status</code> attribute defined at extension <code>core</code>. */
	private OrderStatus _status;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.exportStatus</code> attribute defined at extension <code>core</code>. */
	private ExportStatus _exportStatus;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.statusInfo</code> attribute defined at extension <code>core</code>. */
	private String _statusInfo;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.totalPrice</code> attribute defined at extension <code>core</code>. */
	private Double _totalPrice;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.totalDiscounts</code> attribute defined at extension <code>core</code>. */
	private Double _totalDiscounts;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.totalTax</code> attribute defined at extension <code>core</code>. */
	private Double _totalTax;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.totalTaxValuesInternal</code> attribute defined at extension <code>core</code>. */
	private String _totalTaxValuesInternal;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.totalTaxValues</code> attribute defined at extension <code>core</code>. */
	private Collection<TaxValue> _totalTaxValues;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.user</code> attribute defined at extension <code>core</code>. */
	private UserModel _user;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.subtotal</code> attribute defined at extension <code>core</code>. */
	private Double _subtotal;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.discountsIncludeDeliveryCost</code> attribute defined at extension <code>core</code>. */
	private Boolean _discountsIncludeDeliveryCost;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.discountsIncludePaymentCost</code> attribute defined at extension <code>core</code>. */
	private Boolean _discountsIncludePaymentCost;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.entries</code> attribute defined at extension <code>core</code>. */
	private List<AbstractOrderEntryModel> _entries;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.discounts</code> attribute defined at extension <code>core</code>. */
	private List<DiscountModel> _discounts;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.previousDeliveryMode</code> attribute defined at extension <code>promotions</code>. */
	private DeliveryModeModel _previousDeliveryMode;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.allPromotionResults</code> attribute defined at extension <code>promotions</code>. */
	private Set<PromotionResultModel> _allPromotionResults;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.consignments</code> attribute defined at extension <code>basecommerce</code>. */
	private Set<ConsignmentModel> _consignments;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.paymentTransactions</code> attribute defined at extension <code>payment</code>. */
	private List<PaymentTransactionModel> _paymentTransactions;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.site</code> attribute defined at extension <code>commerceservices</code>. */
	private BaseSiteModel _site;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.store</code> attribute defined at extension <code>commerceservices</code>. */
	private BaseStoreModel _store;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.guid</code> attribute defined at extension <code>commerceservices</code>. */
	private String _guid;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.promotionOrderRestrictions</code> attribute defined at extension <code>commerceservices</code>. */
	private Collection<PromotionOrderRestrictionModel> _promotionOrderRestrictions;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AbstractOrderModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AbstractOrderModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _currency initial attribute declared by type <code>AbstractOrder</code> at extension <code>core</code>
	 * @param _date initial attribute declared by type <code>AbstractOrder</code> at extension <code>core</code>
	 * @param _user initial attribute declared by type <code>AbstractOrder</code> at extension <code>core</code>
	 */
	@Deprecated
	public AbstractOrderModel(final CurrencyModel _currency, final Date _date, final UserModel _user)
	{
		super();
		setCurrency(_currency);
		setDate(_date);
		setUser(_user);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _currency initial attribute declared by type <code>AbstractOrder</code> at extension <code>core</code>
	 * @param _date initial attribute declared by type <code>AbstractOrder</code> at extension <code>core</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _user initial attribute declared by type <code>AbstractOrder</code> at extension <code>core</code>
	 */
	@Deprecated
	public AbstractOrderModel(final CurrencyModel _currency, final Date _date, final ItemModel _owner, final UserModel _user)
	{
		super();
		setCurrency(_currency);
		setDate(_date);
		setOwner(_owner);
		setUser(_user);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.allPromotionResults</code> attribute defined at extension <code>promotions</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the allPromotionResults
	 */
	public Set<PromotionResultModel> getAllPromotionResults()
	{
		if (this._allPromotionResults!=null)
		{
			return _allPromotionResults;
		}
		return _allPromotionResults = getPersistenceContext().getValue(ALLPROMOTIONRESULTS, _allPromotionResults);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.calculated</code> attribute defined at extension <code>core</code>. 
	 * @return the calculated
	 */
	public Boolean getCalculated()
	{
		if (this._calculated!=null)
		{
			return _calculated;
		}
		return _calculated = getPersistenceContext().getValue(CALCULATED, _calculated);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.code</code> attribute defined at extension <code>core</code>. 
	 * @return the code
	 */
	public String getCode()
	{
		if (this._code!=null)
		{
			return _code;
		}
		return _code = getPersistenceContext().getValue(CODE, _code);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.consignments</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the consignments
	 */
	public Set<ConsignmentModel> getConsignments()
	{
		if (this._consignments!=null)
		{
			return _consignments;
		}
		return _consignments = getPersistenceContext().getValue(CONSIGNMENTS, _consignments);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.currency</code> attribute defined at extension <code>core</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.date</code> attribute defined at extension <code>core</code>. 
	 * @return the date
	 */
	public Date getDate()
	{
		if (this._date!=null)
		{
			return _date;
		}
		return _date = getPersistenceContext().getValue(DATE, _date);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.deliveryAddress</code> attribute defined at extension <code>core</code>. 
	 * @return the deliveryAddress
	 */
	public AddressModel getDeliveryAddress()
	{
		if (this._deliveryAddress!=null)
		{
			return _deliveryAddress;
		}
		return _deliveryAddress = getPersistenceContext().getValue(DELIVERYADDRESS, _deliveryAddress);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.deliveryCost</code> attribute defined at extension <code>core</code>. 
	 * @return the deliveryCost
	 */
	public Double getDeliveryCost()
	{
		if (this._deliveryCost!=null)
		{
			return _deliveryCost;
		}
		return _deliveryCost = getPersistenceContext().getValue(DELIVERYCOST, _deliveryCost);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.deliveryMode</code> attribute defined at extension <code>core</code>. 
	 * @return the deliveryMode
	 */
	public DeliveryModeModel getDeliveryMode()
	{
		if (this._deliveryMode!=null)
		{
			return _deliveryMode;
		}
		return _deliveryMode = getPersistenceContext().getValue(DELIVERYMODE, _deliveryMode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.deliveryStatus</code> attribute defined at extension <code>core</code>. 
	 * @return the deliveryStatus
	 */
	public DeliveryStatus getDeliveryStatus()
	{
		if (this._deliveryStatus!=null)
		{
			return _deliveryStatus;
		}
		return _deliveryStatus = getPersistenceContext().getValue(DELIVERYSTATUS, _deliveryStatus);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.discounts</code> attribute defined at extension <code>core</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the discounts
	 */
	public List<DiscountModel> getDiscounts()
	{
		if (this._discounts!=null)
		{
			return _discounts;
		}
		return _discounts = getPersistenceContext().getValue(DISCOUNTS, _discounts);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.entries</code> attribute defined at extension <code>core</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the entries
	 */
	public List<AbstractOrderEntryModel> getEntries()
	{
		if (this._entries!=null)
		{
			return _entries;
		}
		return _entries = getPersistenceContext().getValue(ENTRIES, _entries);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.exportStatus</code> attribute defined at extension <code>core</code>. 
	 * @return the exportStatus
	 */
	public ExportStatus getExportStatus()
	{
		if (this._exportStatus!=null)
		{
			return _exportStatus;
		}
		return _exportStatus = getPersistenceContext().getValue(EXPORTSTATUS, _exportStatus);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.globalDiscountValues</code> dynamic attribute defined at extension <code>core</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the globalDiscountValues
	 */
	public List<DiscountValue> getGlobalDiscountValues()
	{
		return getPersistenceContext().getDynamicValue(this,GLOBALDISCOUNTVALUES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.globalDiscountValuesInternal</code> attribute defined at extension <code>core</code>. 
	 * @return the globalDiscountValuesInternal
	 */
	public String getGlobalDiscountValuesInternal()
	{
		if (this._globalDiscountValuesInternal!=null)
		{
			return _globalDiscountValuesInternal;
		}
		return _globalDiscountValuesInternal = getPersistenceContext().getValue(GLOBALDISCOUNTVALUESINTERNAL, _globalDiscountValuesInternal);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.guid</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the guid - The guid for the anonymous cart used to lookup stored carts.
	 * 							The order guid is used as a non-authenticated deep link to the order history page.
	 */
	public String getGuid()
	{
		if (this._guid!=null)
		{
			return _guid;
		}
		return _guid = getPersistenceContext().getValue(GUID, _guid);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.net</code> attribute defined at extension <code>core</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.paymentAddress</code> attribute defined at extension <code>core</code>. 
	 * @return the paymentAddress
	 */
	public AddressModel getPaymentAddress()
	{
		if (this._paymentAddress!=null)
		{
			return _paymentAddress;
		}
		return _paymentAddress = getPersistenceContext().getValue(PAYMENTADDRESS, _paymentAddress);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.paymentCost</code> attribute defined at extension <code>core</code>. 
	 * @return the paymentCost
	 */
	public Double getPaymentCost()
	{
		if (this._paymentCost!=null)
		{
			return _paymentCost;
		}
		return _paymentCost = getPersistenceContext().getValue(PAYMENTCOST, _paymentCost);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.paymentInfo</code> attribute defined at extension <code>core</code>. 
	 * @return the paymentInfo
	 */
	public PaymentInfoModel getPaymentInfo()
	{
		if (this._paymentInfo!=null)
		{
			return _paymentInfo;
		}
		return _paymentInfo = getPersistenceContext().getValue(PAYMENTINFO, _paymentInfo);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.paymentMode</code> attribute defined at extension <code>core</code>. 
	 * @return the paymentMode
	 */
	public PaymentModeModel getPaymentMode()
	{
		if (this._paymentMode!=null)
		{
			return _paymentMode;
		}
		return _paymentMode = getPersistenceContext().getValue(PAYMENTMODE, _paymentMode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.paymentStatus</code> attribute defined at extension <code>core</code>. 
	 * @return the paymentStatus
	 */
	public PaymentStatus getPaymentStatus()
	{
		if (this._paymentStatus!=null)
		{
			return _paymentStatus;
		}
		return _paymentStatus = getPersistenceContext().getValue(PAYMENTSTATUS, _paymentStatus);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.paymentTransactions</code> attribute defined at extension <code>payment</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the paymentTransactions
	 */
	public List<PaymentTransactionModel> getPaymentTransactions()
	{
		if (this._paymentTransactions!=null)
		{
			return _paymentTransactions;
		}
		return _paymentTransactions = getPersistenceContext().getValue(PAYMENTTRANSACTIONS, _paymentTransactions);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.previousDeliveryMode</code> attribute defined at extension <code>promotions</code>. 
	 * @return the previousDeliveryMode - The old delivery mode stored by the PromotionOrderChangeDeliveryModeAction.
	 */
	public DeliveryModeModel getPreviousDeliveryMode()
	{
		if (this._previousDeliveryMode!=null)
		{
			return _previousDeliveryMode;
		}
		return _previousDeliveryMode = getPersistenceContext().getValue(PREVIOUSDELIVERYMODE, _previousDeliveryMode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.promotionOrderRestrictions</code> attribute defined at extension <code>commerceservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the promotionOrderRestrictions - Promotion restrictions for order
	 */
	public Collection<PromotionOrderRestrictionModel> getPromotionOrderRestrictions()
	{
		if (this._promotionOrderRestrictions!=null)
		{
			return _promotionOrderRestrictions;
		}
		return _promotionOrderRestrictions = getPersistenceContext().getValue(PROMOTIONORDERRESTRICTIONS, _promotionOrderRestrictions);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.site</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the site - The site on which the cart was created and the order was placed.
	 */
	public BaseSiteModel getSite()
	{
		if (this._site!=null)
		{
			return _site;
		}
		return _site = getPersistenceContext().getValue(SITE, _site);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.status</code> attribute defined at extension <code>core</code>. 
	 * @return the status
	 */
	public OrderStatus getStatus()
	{
		if (this._status!=null)
		{
			return _status;
		}
		return _status = getPersistenceContext().getValue(STATUS, _status);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.statusInfo</code> attribute defined at extension <code>core</code>. 
	 * @return the statusInfo
	 */
	public String getStatusInfo()
	{
		if (this._statusInfo!=null)
		{
			return _statusInfo;
		}
		return _statusInfo = getPersistenceContext().getValue(STATUSINFO, _statusInfo);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.store</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the store - The store for which the cart was created and the order was placed.
	 */
	public BaseStoreModel getStore()
	{
		if (this._store!=null)
		{
			return _store;
		}
		return _store = getPersistenceContext().getValue(STORE, _store);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.subtotal</code> attribute defined at extension <code>core</code>. 
	 * @return the subtotal
	 */
	public Double getSubtotal()
	{
		if (this._subtotal!=null)
		{
			return _subtotal;
		}
		return _subtotal = getPersistenceContext().getValue(SUBTOTAL, _subtotal);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalDiscounts</code> attribute defined at extension <code>core</code>. 
	 * @return the totalDiscounts
	 */
	public Double getTotalDiscounts()
	{
		if (this._totalDiscounts!=null)
		{
			return _totalDiscounts;
		}
		return _totalDiscounts = getPersistenceContext().getValue(TOTALDISCOUNTS, _totalDiscounts);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalPrice</code> attribute defined at extension <code>core</code>. 
	 * @return the totalPrice
	 */
	public Double getTotalPrice()
	{
		if (this._totalPrice!=null)
		{
			return _totalPrice;
		}
		return _totalPrice = getPersistenceContext().getValue(TOTALPRICE, _totalPrice);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalTax</code> attribute defined at extension <code>core</code>. 
	 * @return the totalTax
	 */
	public Double getTotalTax()
	{
		if (this._totalTax!=null)
		{
			return _totalTax;
		}
		return _totalTax = getPersistenceContext().getValue(TOTALTAX, _totalTax);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalTaxValues</code> dynamic attribute defined at extension <code>core</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the totalTaxValues
	 */
	public Collection<TaxValue> getTotalTaxValues()
	{
		return getPersistenceContext().getDynamicValue(this,TOTALTAXVALUES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalTaxValuesInternal</code> attribute defined at extension <code>core</code>. 
	 * @return the totalTaxValuesInternal
	 */
	public String getTotalTaxValuesInternal()
	{
		if (this._totalTaxValuesInternal!=null)
		{
			return _totalTaxValuesInternal;
		}
		return _totalTaxValuesInternal = getPersistenceContext().getValue(TOTALTAXVALUESINTERNAL, _totalTaxValuesInternal);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.user</code> attribute defined at extension <code>core</code>. 
	 * @return the user
	 */
	public UserModel getUser()
	{
		if (this._user!=null)
		{
			return _user;
		}
		return _user = getPersistenceContext().getValue(USER, _user);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.discountsIncludeDeliveryCost</code> attribute defined at extension <code>core</code>. 
	 * @return the discountsIncludeDeliveryCost - Tells whether delivery costs should be included in discount calculation or not. If this field is true
	 * 						delivery costs are changed the same way as product costs if discount values are set at this order.
	 */
	public boolean isDiscountsIncludeDeliveryCost()
	{
		return toPrimitive( _discountsIncludeDeliveryCost = getPersistenceContext().getValue(DISCOUNTSINCLUDEDELIVERYCOST, _discountsIncludeDeliveryCost));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.discountsIncludePaymentCost</code> attribute defined at extension <code>core</code>. 
	 * @return the discountsIncludePaymentCost - Tells whether payment costs should be included in discount calculation or not. If this field is true
	 * 						payment costs are changed the same way as product costs if discount values are set at this order.
	 */
	public boolean isDiscountsIncludePaymentCost()
	{
		return toPrimitive( _discountsIncludePaymentCost = getPersistenceContext().getValue(DISCOUNTSINCLUDEPAYMENTCOST, _discountsIncludePaymentCost));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.allPromotionResults</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the allPromotionResults
	 */
	public void setAllPromotionResults(final Set<PromotionResultModel> value)
	{
		_allPromotionResults = getPersistenceContext().setValue(ALLPROMOTIONRESULTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.calculated</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the calculated
	 */
	public void setCalculated(final Boolean value)
	{
		_calculated = getPersistenceContext().setValue(CALCULATED, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.code</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.consignments</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the consignments
	 */
	public void setConsignments(final Set<ConsignmentModel> value)
	{
		_consignments = getPersistenceContext().setValue(CONSIGNMENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.currency</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the currency
	 */
	public void setCurrency(final CurrencyModel value)
	{
		_currency = getPersistenceContext().setValue(CURRENCY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.date</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the date
	 */
	public void setDate(final Date value)
	{
		_date = getPersistenceContext().setValue(DATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.deliveryAddress</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the deliveryAddress
	 */
	public void setDeliveryAddress(final AddressModel value)
	{
		_deliveryAddress = getPersistenceContext().setValue(DELIVERYADDRESS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.deliveryCost</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the deliveryCost
	 */
	public void setDeliveryCost(final Double value)
	{
		_deliveryCost = getPersistenceContext().setValue(DELIVERYCOST, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.deliveryMode</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the deliveryMode
	 */
	public void setDeliveryMode(final DeliveryModeModel value)
	{
		_deliveryMode = getPersistenceContext().setValue(DELIVERYMODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.deliveryStatus</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the deliveryStatus
	 */
	public void setDeliveryStatus(final DeliveryStatus value)
	{
		_deliveryStatus = getPersistenceContext().setValue(DELIVERYSTATUS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.discounts</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the discounts
	 */
	public void setDiscounts(final List<DiscountModel> value)
	{
		_discounts = getPersistenceContext().setValue(DISCOUNTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.discountsIncludeDeliveryCost</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the discountsIncludeDeliveryCost - Tells whether delivery costs should be included in discount calculation or not. If this field is true
	 * 						delivery costs are changed the same way as product costs if discount values are set at this order.
	 */
	public void setDiscountsIncludeDeliveryCost(final boolean value)
	{
		_discountsIncludeDeliveryCost = getPersistenceContext().setValue(DISCOUNTSINCLUDEDELIVERYCOST, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.discountsIncludePaymentCost</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the discountsIncludePaymentCost - Tells whether payment costs should be included in discount calculation or not. If this field is true
	 * 						payment costs are changed the same way as product costs if discount values are set at this order.
	 */
	public void setDiscountsIncludePaymentCost(final boolean value)
	{
		_discountsIncludePaymentCost = getPersistenceContext().setValue(DISCOUNTSINCLUDEPAYMENTCOST, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.entries</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the entries
	 */
	public void setEntries(final List<AbstractOrderEntryModel> value)
	{
		_entries = getPersistenceContext().setValue(ENTRIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.exportStatus</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the exportStatus
	 */
	public void setExportStatus(final ExportStatus value)
	{
		_exportStatus = getPersistenceContext().setValue(EXPORTSTATUS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.globalDiscountValues</code> dynamic attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the globalDiscountValues
	 */
	public void setGlobalDiscountValues(final List<DiscountValue> value)
	{
		getPersistenceContext().setDynamicValue(this,GLOBALDISCOUNTVALUES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.globalDiscountValuesInternal</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the globalDiscountValuesInternal
	 */
	public void setGlobalDiscountValuesInternal(final String value)
	{
		_globalDiscountValuesInternal = getPersistenceContext().setValue(GLOBALDISCOUNTVALUESINTERNAL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.guid</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the guid - The guid for the anonymous cart used to lookup stored carts.
	 * 							The order guid is used as a non-authenticated deep link to the order history page.
	 */
	public void setGuid(final String value)
	{
		_guid = getPersistenceContext().setValue(GUID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.net</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the net
	 */
	public void setNet(final Boolean value)
	{
		_net = getPersistenceContext().setValue(NET, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.paymentAddress</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the paymentAddress
	 */
	public void setPaymentAddress(final AddressModel value)
	{
		_paymentAddress = getPersistenceContext().setValue(PAYMENTADDRESS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.paymentCost</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the paymentCost
	 */
	public void setPaymentCost(final Double value)
	{
		_paymentCost = getPersistenceContext().setValue(PAYMENTCOST, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.paymentInfo</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the paymentInfo
	 */
	public void setPaymentInfo(final PaymentInfoModel value)
	{
		_paymentInfo = getPersistenceContext().setValue(PAYMENTINFO, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.paymentMode</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the paymentMode
	 */
	public void setPaymentMode(final PaymentModeModel value)
	{
		_paymentMode = getPersistenceContext().setValue(PAYMENTMODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.paymentStatus</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the paymentStatus
	 */
	public void setPaymentStatus(final PaymentStatus value)
	{
		_paymentStatus = getPersistenceContext().setValue(PAYMENTSTATUS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.paymentTransactions</code> attribute defined at extension <code>payment</code>. 
	 *  
	 * @param value the paymentTransactions
	 */
	public void setPaymentTransactions(final List<PaymentTransactionModel> value)
	{
		_paymentTransactions = getPersistenceContext().setValue(PAYMENTTRANSACTIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.previousDeliveryMode</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the previousDeliveryMode - The old delivery mode stored by the PromotionOrderChangeDeliveryModeAction.
	 */
	public void setPreviousDeliveryMode(final DeliveryModeModel value)
	{
		_previousDeliveryMode = getPersistenceContext().setValue(PREVIOUSDELIVERYMODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.promotionOrderRestrictions</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the promotionOrderRestrictions - Promotion restrictions for order
	 */
	public void setPromotionOrderRestrictions(final Collection<PromotionOrderRestrictionModel> value)
	{
		_promotionOrderRestrictions = getPersistenceContext().setValue(PROMOTIONORDERRESTRICTIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.site</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the site - The site on which the cart was created and the order was placed.
	 */
	public void setSite(final BaseSiteModel value)
	{
		_site = getPersistenceContext().setValue(SITE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.status</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the status
	 */
	public void setStatus(final OrderStatus value)
	{
		_status = getPersistenceContext().setValue(STATUS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.statusInfo</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the statusInfo
	 */
	public void setStatusInfo(final String value)
	{
		_statusInfo = getPersistenceContext().setValue(STATUSINFO, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.store</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the store - The store for which the cart was created and the order was placed.
	 */
	public void setStore(final BaseStoreModel value)
	{
		_store = getPersistenceContext().setValue(STORE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.subtotal</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the subtotal
	 */
	public void setSubtotal(final Double value)
	{
		_subtotal = getPersistenceContext().setValue(SUBTOTAL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.totalDiscounts</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the totalDiscounts
	 */
	public void setTotalDiscounts(final Double value)
	{
		_totalDiscounts = getPersistenceContext().setValue(TOTALDISCOUNTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.totalPrice</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the totalPrice
	 */
	public void setTotalPrice(final Double value)
	{
		_totalPrice = getPersistenceContext().setValue(TOTALPRICE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.totalTax</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the totalTax
	 */
	public void setTotalTax(final Double value)
	{
		_totalTax = getPersistenceContext().setValue(TOTALTAX, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.totalTaxValues</code> dynamic attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the totalTaxValues
	 */
	public void setTotalTaxValues(final Collection<TaxValue> value)
	{
		getPersistenceContext().setDynamicValue(this,TOTALTAXVALUES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.totalTaxValuesInternal</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the totalTaxValuesInternal
	 */
	public void setTotalTaxValuesInternal(final String value)
	{
		_totalTaxValuesInternal = getPersistenceContext().setValue(TOTALTAXVALUESINTERNAL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrder.user</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the user
	 */
	public void setUser(final UserModel value)
	{
		_user = getPersistenceContext().setValue(USER, value);
	}
	
}
