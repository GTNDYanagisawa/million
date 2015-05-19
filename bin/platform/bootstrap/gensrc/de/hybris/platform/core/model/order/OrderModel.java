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

import de.hybris.platform.commerceservices.enums.SalesApplication;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.fraud.model.FraudReportModel;
import de.hybris.platform.orderhistory.model.OrderHistoryEntryModel;
import de.hybris.platform.ordermodify.model.OrderModificationRecordModel;
import de.hybris.platform.orderprocessing.model.OrderProcessModel;
import de.hybris.platform.orderscheduling.model.OrderScheduleCronJobModel;
import de.hybris.platform.orderscheduling.model.OrderTemplateToOrderCronJobModel;
import de.hybris.platform.returns.model.ReturnRequestModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Generated model class for type Order first defined at extension core.
 */
@SuppressWarnings("all")
public class OrderModel extends AbstractOrderModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "Order";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.versionID</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String VERSIONID = "versionID";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.originalVersion</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String ORIGINALVERSION = "originalVersion";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.fraudulent</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String FRAUDULENT = "fraudulent";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.potentiallyFraudulent</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String POTENTIALLYFRAUDULENT = "potentiallyFraudulent";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.statusDisplay</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String STATUSDISPLAY = "statusDisplay";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.fraudReports</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String FRAUDREPORTS = "fraudReports";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.historyEntries</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String HISTORYENTRIES = "historyEntries";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.orderTemplateCronJob</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String ORDERTEMPLATECRONJOB = "orderTemplateCronJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.orderScheduleCronJob</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String ORDERSCHEDULECRONJOB = "orderScheduleCronJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.modificationRecords</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String MODIFICATIONRECORDS = "modificationRecords";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.returnRequests</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String RETURNREQUESTS = "returnRequests";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.orderProcess</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String ORDERPROCESS = "orderProcess";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.salesApplication</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String SALESAPPLICATION = "salesApplication";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.language</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String LANGUAGE = "language";
	
	
	/** <i>Generated variable</i> - Variable of <code>Order.versionID</code> attribute defined at extension <code>basecommerce</code>. */
	private String _versionID;
	
	/** <i>Generated variable</i> - Variable of <code>Order.originalVersion</code> attribute defined at extension <code>basecommerce</code>. */
	private OrderModel _originalVersion;
	
	/** <i>Generated variable</i> - Variable of <code>Order.fraudulent</code> attribute defined at extension <code>basecommerce</code>. */
	private Boolean _fraudulent;
	
	/** <i>Generated variable</i> - Variable of <code>Order.potentiallyFraudulent</code> attribute defined at extension <code>basecommerce</code>. */
	private Boolean _potentiallyFraudulent;
	
	/** <i>Generated variable</i> - Variable of <code>Order.statusDisplay</code> attribute defined at extension <code>basecommerce</code>. */
	private String _statusDisplay;
	
	/** <i>Generated variable</i> - Variable of <code>Order.fraudReports</code> attribute defined at extension <code>basecommerce</code>. */
	private Set<FraudReportModel> _fraudReports;
	
	/** <i>Generated variable</i> - Variable of <code>Order.historyEntries</code> attribute defined at extension <code>basecommerce</code>. */
	private List<OrderHistoryEntryModel> _historyEntries;
	
	/** <i>Generated variable</i> - Variable of <code>Order.orderTemplateCronJob</code> attribute defined at extension <code>basecommerce</code>. */
	private Collection<OrderTemplateToOrderCronJobModel> _orderTemplateCronJob;
	
	/** <i>Generated variable</i> - Variable of <code>Order.orderScheduleCronJob</code> attribute defined at extension <code>basecommerce</code>. */
	private Collection<OrderScheduleCronJobModel> _orderScheduleCronJob;
	
	/** <i>Generated variable</i> - Variable of <code>Order.modificationRecords</code> attribute defined at extension <code>basecommerce</code>. */
	private Set<OrderModificationRecordModel> _modificationRecords;
	
	/** <i>Generated variable</i> - Variable of <code>Order.returnRequests</code> attribute defined at extension <code>basecommerce</code>. */
	private List<ReturnRequestModel> _returnRequests;
	
	/** <i>Generated variable</i> - Variable of <code>Order.orderProcess</code> attribute defined at extension <code>basecommerce</code>. */
	private Collection<OrderProcessModel> _orderProcess;
	
	/** <i>Generated variable</i> - Variable of <code>Order.salesApplication</code> attribute defined at extension <code>commerceservices</code>. */
	private SalesApplication _salesApplication;
	
	/** <i>Generated variable</i> - Variable of <code>Order.language</code> attribute defined at extension <code>commerceservices</code>. */
	private LanguageModel _language;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public OrderModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public OrderModel(final ItemModelContext ctx)
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
	public OrderModel(final CurrencyModel _currency, final Date _date, final UserModel _user)
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
	 * @param _originalVersion initial attribute declared by type <code>Order</code> at extension <code>basecommerce</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _user initial attribute declared by type <code>AbstractOrder</code> at extension <code>core</code>
	 * @param _versionID initial attribute declared by type <code>Order</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public OrderModel(final CurrencyModel _currency, final Date _date, final OrderModel _originalVersion, final ItemModel _owner, final UserModel _user, final String _versionID)
	{
		super();
		setCurrency(_currency);
		setDate(_date);
		setOriginalVersion(_originalVersion);
		setOwner(_owner);
		setUser(_user);
		setVersionID(_versionID);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.fraudReports</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the fraudReports
	 */
	public Set<FraudReportModel> getFraudReports()
	{
		if (this._fraudReports!=null)
		{
			return _fraudReports;
		}
		return _fraudReports = getPersistenceContext().getValue(FRAUDREPORTS, _fraudReports);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.fraudulent</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the fraudulent
	 */
	public Boolean getFraudulent()
	{
		if (this._fraudulent!=null)
		{
			return _fraudulent;
		}
		return _fraudulent = getPersistenceContext().getValue(FRAUDULENT, _fraudulent);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.historyEntries</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the historyEntries
	 */
	public List<OrderHistoryEntryModel> getHistoryEntries()
	{
		if (this._historyEntries!=null)
		{
			return _historyEntries;
		}
		return _historyEntries = getPersistenceContext().getValue(HISTORYENTRIES, _historyEntries);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.language</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the language - The language used when the order is placed.
	 */
	public LanguageModel getLanguage()
	{
		if (this._language!=null)
		{
			return _language;
		}
		return _language = getPersistenceContext().getValue(LANGUAGE, _language);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.modificationRecords</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the modificationRecords
	 */
	public Set<OrderModificationRecordModel> getModificationRecords()
	{
		if (this._modificationRecords!=null)
		{
			return _modificationRecords;
		}
		return _modificationRecords = getPersistenceContext().getValue(MODIFICATIONRECORDS, _modificationRecords);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.orderProcess</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the orderProcess
	 */
	public Collection<OrderProcessModel> getOrderProcess()
	{
		if (this._orderProcess!=null)
		{
			return _orderProcess;
		}
		return _orderProcess = getPersistenceContext().getValue(ORDERPROCESS, _orderProcess);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.orderScheduleCronJob</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the orderScheduleCronJob
	 */
	public Collection<OrderScheduleCronJobModel> getOrderScheduleCronJob()
	{
		if (this._orderScheduleCronJob!=null)
		{
			return _orderScheduleCronJob;
		}
		return _orderScheduleCronJob = getPersistenceContext().getValue(ORDERSCHEDULECRONJOB, _orderScheduleCronJob);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.orderTemplateCronJob</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the orderTemplateCronJob
	 */
	public Collection<OrderTemplateToOrderCronJobModel> getOrderTemplateCronJob()
	{
		if (this._orderTemplateCronJob!=null)
		{
			return _orderTemplateCronJob;
		}
		return _orderTemplateCronJob = getPersistenceContext().getValue(ORDERTEMPLATECRONJOB, _orderTemplateCronJob);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.originalVersion</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the originalVersion
	 */
	public OrderModel getOriginalVersion()
	{
		if (this._originalVersion!=null)
		{
			return _originalVersion;
		}
		return _originalVersion = getPersistenceContext().getValue(ORIGINALVERSION, _originalVersion);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.potentiallyFraudulent</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the potentiallyFraudulent
	 */
	public Boolean getPotentiallyFraudulent()
	{
		if (this._potentiallyFraudulent!=null)
		{
			return _potentiallyFraudulent;
		}
		return _potentiallyFraudulent = getPersistenceContext().getValue(POTENTIALLYFRAUDULENT, _potentiallyFraudulent);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.returnRequests</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the returnRequests
	 */
	public List<ReturnRequestModel> getReturnRequests()
	{
		if (this._returnRequests!=null)
		{
			return _returnRequests;
		}
		return _returnRequests = getPersistenceContext().getValue(RETURNREQUESTS, _returnRequests);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.salesApplication</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the salesApplication - The sales application for which the order was placed.
	 */
	public SalesApplication getSalesApplication()
	{
		if (this._salesApplication!=null)
		{
			return _salesApplication;
		}
		return _salesApplication = getPersistenceContext().getValue(SALESAPPLICATION, _salesApplication);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.statusDisplay</code> dynamic attribute defined at extension <code>basecommerce</code>. 
	 * @return the statusDisplay
	 */
	public String getStatusDisplay()
	{
		return getPersistenceContext().getDynamicValue(this,STATUSDISPLAY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.versionID</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the versionID
	 */
	public String getVersionID()
	{
		if (this._versionID!=null)
		{
			return _versionID;
		}
		return _versionID = getPersistenceContext().getValue(VERSIONID, _versionID);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Order.fraudReports</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the fraudReports
	 */
	public void setFraudReports(final Set<FraudReportModel> value)
	{
		_fraudReports = getPersistenceContext().setValue(FRAUDREPORTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Order.fraudulent</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the fraudulent
	 */
	public void setFraudulent(final Boolean value)
	{
		_fraudulent = getPersistenceContext().setValue(FRAUDULENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Order.historyEntries</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the historyEntries
	 */
	public void setHistoryEntries(final List<OrderHistoryEntryModel> value)
	{
		_historyEntries = getPersistenceContext().setValue(HISTORYENTRIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Order.language</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the language - The language used when the order is placed.
	 */
	public void setLanguage(final LanguageModel value)
	{
		_language = getPersistenceContext().setValue(LANGUAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Order.modificationRecords</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the modificationRecords
	 */
	public void setModificationRecords(final Set<OrderModificationRecordModel> value)
	{
		_modificationRecords = getPersistenceContext().setValue(MODIFICATIONRECORDS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Order.orderProcess</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the orderProcess
	 */
	public void setOrderProcess(final Collection<OrderProcessModel> value)
	{
		_orderProcess = getPersistenceContext().setValue(ORDERPROCESS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Order.orderScheduleCronJob</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the orderScheduleCronJob
	 */
	public void setOrderScheduleCronJob(final Collection<OrderScheduleCronJobModel> value)
	{
		_orderScheduleCronJob = getPersistenceContext().setValue(ORDERSCHEDULECRONJOB, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Order.orderTemplateCronJob</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the orderTemplateCronJob
	 */
	public void setOrderTemplateCronJob(final Collection<OrderTemplateToOrderCronJobModel> value)
	{
		_orderTemplateCronJob = getPersistenceContext().setValue(ORDERTEMPLATECRONJOB, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>Order.originalVersion</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the originalVersion
	 */
	public void setOriginalVersion(final OrderModel value)
	{
		_originalVersion = getPersistenceContext().setValue(ORIGINALVERSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Order.potentiallyFraudulent</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the potentiallyFraudulent
	 */
	public void setPotentiallyFraudulent(final Boolean value)
	{
		_potentiallyFraudulent = getPersistenceContext().setValue(POTENTIALLYFRAUDULENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Order.returnRequests</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the returnRequests
	 */
	public void setReturnRequests(final List<ReturnRequestModel> value)
	{
		_returnRequests = getPersistenceContext().setValue(RETURNREQUESTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Order.salesApplication</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the salesApplication - The sales application for which the order was placed.
	 */
	public void setSalesApplication(final SalesApplication value)
	{
		_salesApplication = getPersistenceContext().setValue(SALESAPPLICATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>Order.versionID</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the versionID
	 */
	public void setVersionID(final String value)
	{
		_versionID = getPersistenceContext().setValue(VERSIONID, value);
	}
	
}
