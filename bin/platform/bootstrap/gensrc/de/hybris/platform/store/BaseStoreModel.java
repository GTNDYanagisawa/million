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
package de.hybris.platform.store;

import de.hybris.platform.basecommerce.enums.DistanceUnit;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.catalog.model.CatalogModel;
import de.hybris.platform.commerceservices.enums.PickupInStoreMode;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.order.delivery.DeliveryModeModel;
import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.europe1.enums.UserTaxGroup;
import de.hybris.platform.ordersplitting.model.WarehouseModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.solrfacetsearch.model.config.SolrFacetSearchConfigModel;
import de.hybris.platform.storelocator.model.PointOfServiceModel;
import de.hybris.platform.ticket.model.CsAgentGroupModel;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/**
 * Generated model class for type BaseStore first defined at extension basecommerce.
 */
@SuppressWarnings("all")
public class BaseStoreModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BaseStore";
	
	/**<i>Generated relation code constant for relation <code>StoresForCMSSite</code> defining source attribute <code>cmsSites</code> in extension <code>basecommerce</code>.</i>*/
	public final static String _STORESFORCMSSITE = "StoresForCMSSite";
	
	/**<i>Generated relation code constant for relation <code>Agent2BaseStore</code> defining source attribute <code>ticketemployees</code> in extension <code>ticketsystem</code>.</i>*/
	public final static String _AGENT2BASESTORE = "Agent2BaseStore";
	
	/**<i>Generated relation code constant for relation <code>CsAgentGroup2BaseStore</code> defining source attribute <code>ticketgroups</code> in extension <code>ticketsystem</code>.</i>*/
	public final static String _CSAGENTGROUP2BASESTORE = "CsAgentGroup2BaseStore";
	
	/**<i>Generated relation code constant for relation <code>BaseStore2CountryRel</code> defining source attribute <code>deliveryCountries</code> in extension <code>commerceservices</code>.</i>*/
	public final static String _BASESTORE2COUNTRYREL = "BaseStore2CountryRel";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseStore.uid</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String UID = "uid";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseStore.name</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseStore.storelocatorDistanceUnit</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String STORELOCATORDISTANCEUNIT = "storelocatorDistanceUnit";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseStore.cmsSites</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CMSSITES = "cmsSites";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseStore.catalogs</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CATALOGS = "catalogs";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseStore.pointsOfService</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String POINTSOFSERVICE = "pointsOfService";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseStore.ticketemployees</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String TICKETEMPLOYEES = "ticketemployees";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseStore.ticketgroups</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String TICKETGROUPS = "ticketgroups";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseStore.net</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String NET = "net";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseStore.taxGroup</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String TAXGROUP = "taxGroup";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseStore.defaultLanguage</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String DEFAULTLANGUAGE = "defaultLanguage";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseStore.defaultCurrency</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String DEFAULTCURRENCY = "defaultCurrency";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseStore.defaultDeliveryOrigin</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String DEFAULTDELIVERYORIGIN = "defaultDeliveryOrigin";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseStore.solrFacetSearchConfiguration</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String SOLRFACETSEARCHCONFIGURATION = "solrFacetSearchConfiguration";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseStore.submitOrderProcessCode</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String SUBMITORDERPROCESSCODE = "submitOrderProcessCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseStore.externalTaxEnabled</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String EXTERNALTAXENABLED = "externalTaxEnabled";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseStore.pickupInStoreMode</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String PICKUPINSTOREMODE = "pickupInStoreMode";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseStore.maxRadiusForPoSSearch</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String MAXRADIUSFORPOSSEARCH = "maxRadiusForPoSSearch";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseStore.customerAllowedToIgnoreSuggestions</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String CUSTOMERALLOWEDTOIGNORESUGGESTIONS = "customerAllowedToIgnoreSuggestions";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseStore.paymentProvider</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String PAYMENTPROVIDER = "paymentProvider";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseStore.currencies</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String CURRENCIES = "currencies";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseStore.languages</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String LANGUAGES = "languages";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseStore.deliveryCountries</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String DELIVERYCOUNTRIES = "deliveryCountries";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseStore.warehouses</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String WAREHOUSES = "warehouses";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseStore.deliveryModes</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String DELIVERYMODES = "deliveryModes";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseStore.expressCheckoutEnabled</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String EXPRESSCHECKOUTENABLED = "expressCheckoutEnabled";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseStore.taxEstimationEnabled</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String TAXESTIMATIONENABLED = "taxEstimationEnabled";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseStore.checkoutFlowGroup</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String CHECKOUTFLOWGROUP = "checkoutFlowGroup";
	
	
	/** <i>Generated variable</i> - Variable of <code>BaseStore.uid</code> attribute defined at extension <code>basecommerce</code>. */
	private String _uid;
	
	/** <i>Generated variable</i> - Variable of <code>BaseStore.storelocatorDistanceUnit</code> attribute defined at extension <code>basecommerce</code>. */
	private DistanceUnit _storelocatorDistanceUnit;
	
	/** <i>Generated variable</i> - Variable of <code>BaseStore.cmsSites</code> attribute defined at extension <code>basecommerce</code>. */
	private Collection<BaseSiteModel> _cmsSites;
	
	/** <i>Generated variable</i> - Variable of <code>BaseStore.catalogs</code> attribute defined at extension <code>basecommerce</code>. */
	private List<CatalogModel> _catalogs;
	
	/** <i>Generated variable</i> - Variable of <code>BaseStore.pointsOfService</code> attribute defined at extension <code>basecommerce</code>. */
	private List<PointOfServiceModel> _pointsOfService;
	
	/** <i>Generated variable</i> - Variable of <code>BaseStore.ticketemployees</code> attribute defined at extension <code>ticketsystem</code>. */
	private List<EmployeeModel> _ticketemployees;
	
	/** <i>Generated variable</i> - Variable of <code>BaseStore.ticketgroups</code> attribute defined at extension <code>ticketsystem</code>. */
	private List<CsAgentGroupModel> _ticketgroups;
	
	/** <i>Generated variable</i> - Variable of <code>BaseStore.net</code> attribute defined at extension <code>commerceservices</code>. */
	private Boolean _net;
	
	/** <i>Generated variable</i> - Variable of <code>BaseStore.taxGroup</code> attribute defined at extension <code>commerceservices</code>. */
	private UserTaxGroup _taxGroup;
	
	/** <i>Generated variable</i> - Variable of <code>BaseStore.defaultLanguage</code> attribute defined at extension <code>commerceservices</code>. */
	private LanguageModel _defaultLanguage;
	
	/** <i>Generated variable</i> - Variable of <code>BaseStore.defaultCurrency</code> attribute defined at extension <code>commerceservices</code>. */
	private CurrencyModel _defaultCurrency;
	
	/** <i>Generated variable</i> - Variable of <code>BaseStore.defaultDeliveryOrigin</code> attribute defined at extension <code>commerceservices</code>. */
	private PointOfServiceModel _defaultDeliveryOrigin;
	
	/** <i>Generated variable</i> - Variable of <code>BaseStore.solrFacetSearchConfiguration</code> attribute defined at extension <code>commerceservices</code>. */
	private SolrFacetSearchConfigModel _solrFacetSearchConfiguration;
	
	/** <i>Generated variable</i> - Variable of <code>BaseStore.submitOrderProcessCode</code> attribute defined at extension <code>commerceservices</code>. */
	private String _submitOrderProcessCode;
	
	/** <i>Generated variable</i> - Variable of <code>BaseStore.externalTaxEnabled</code> attribute defined at extension <code>commerceservices</code>. */
	private Boolean _externalTaxEnabled;
	
	/** <i>Generated variable</i> - Variable of <code>BaseStore.pickupInStoreMode</code> attribute defined at extension <code>commerceservices</code>. */
	private PickupInStoreMode _pickupInStoreMode;
	
	/** <i>Generated variable</i> - Variable of <code>BaseStore.maxRadiusForPoSSearch</code> attribute defined at extension <code>commerceservices</code>. */
	private Double _maxRadiusForPoSSearch;
	
	/** <i>Generated variable</i> - Variable of <code>BaseStore.customerAllowedToIgnoreSuggestions</code> attribute defined at extension <code>commerceservices</code>. */
	private Boolean _customerAllowedToIgnoreSuggestions;
	
	/** <i>Generated variable</i> - Variable of <code>BaseStore.paymentProvider</code> attribute defined at extension <code>commerceservices</code>. */
	private String _paymentProvider;
	
	/** <i>Generated variable</i> - Variable of <code>BaseStore.currencies</code> attribute defined at extension <code>commerceservices</code>. */
	private Set<CurrencyModel> _currencies;
	
	/** <i>Generated variable</i> - Variable of <code>BaseStore.languages</code> attribute defined at extension <code>commerceservices</code>. */
	private Set<LanguageModel> _languages;
	
	/** <i>Generated variable</i> - Variable of <code>BaseStore.deliveryCountries</code> attribute defined at extension <code>commerceservices</code>. */
	private Collection<CountryModel> _deliveryCountries;
	
	/** <i>Generated variable</i> - Variable of <code>BaseStore.warehouses</code> attribute defined at extension <code>commerceservices</code>. */
	private List<WarehouseModel> _warehouses;
	
	/** <i>Generated variable</i> - Variable of <code>BaseStore.deliveryModes</code> attribute defined at extension <code>commerceservices</code>. */
	private Set<DeliveryModeModel> _deliveryModes;
	
	/** <i>Generated variable</i> - Variable of <code>BaseStore.expressCheckoutEnabled</code> attribute defined at extension <code>acceleratorservices</code>. */
	private Boolean _expressCheckoutEnabled;
	
	/** <i>Generated variable</i> - Variable of <code>BaseStore.taxEstimationEnabled</code> attribute defined at extension <code>acceleratorservices</code>. */
	private Boolean _taxEstimationEnabled;
	
	/** <i>Generated variable</i> - Variable of <code>BaseStore.checkoutFlowGroup</code> attribute defined at extension <code>acceleratorservices</code>. */
	private String _checkoutFlowGroup;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BaseStoreModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BaseStoreModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _uid initial attribute declared by type <code>BaseStore</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public BaseStoreModel(final String _uid)
	{
		super();
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>BaseStore</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public BaseStoreModel(final ItemModel _owner, final String _uid)
	{
		super();
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseStore.catalogs</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the catalogs
	 */
	public List<CatalogModel> getCatalogs()
	{
		if (this._catalogs!=null)
		{
			return _catalogs;
		}
		return _catalogs = getPersistenceContext().getValue(CATALOGS, _catalogs);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseStore.checkoutFlowGroup</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the checkoutFlowGroup - Determines the checkout group
	 */
	public String getCheckoutFlowGroup()
	{
		if (this._checkoutFlowGroup!=null)
		{
			return _checkoutFlowGroup;
		}
		return _checkoutFlowGroup = getPersistenceContext().getValue(CHECKOUTFLOWGROUP, _checkoutFlowGroup);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseStore.cmsSites</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the cmsSites
	 */
	public Collection<BaseSiteModel> getCmsSites()
	{
		if (this._cmsSites!=null)
		{
			return _cmsSites;
		}
		return _cmsSites = getPersistenceContext().getValue(CMSSITES, _cmsSites);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseStore.currencies</code> attribute defined at extension <code>commerceservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the currencies
	 */
	public Set<CurrencyModel> getCurrencies()
	{
		if (this._currencies!=null)
		{
			return _currencies;
		}
		return _currencies = getPersistenceContext().getValue(CURRENCIES, _currencies);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseStore.defaultCurrency</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the defaultCurrency - The default currency for the site.
	 */
	public CurrencyModel getDefaultCurrency()
	{
		if (this._defaultCurrency!=null)
		{
			return _defaultCurrency;
		}
		return _defaultCurrency = getPersistenceContext().getValue(DEFAULTCURRENCY, _defaultCurrency);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseStore.defaultDeliveryOrigin</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the defaultDeliveryOrigin - The default delivery origin for the site.
	 */
	public PointOfServiceModel getDefaultDeliveryOrigin()
	{
		if (this._defaultDeliveryOrigin!=null)
		{
			return _defaultDeliveryOrigin;
		}
		return _defaultDeliveryOrigin = getPersistenceContext().getValue(DEFAULTDELIVERYORIGIN, _defaultDeliveryOrigin);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseStore.defaultLanguage</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the defaultLanguage - The default language for the site.
	 */
	public LanguageModel getDefaultLanguage()
	{
		if (this._defaultLanguage!=null)
		{
			return _defaultLanguage;
		}
		return _defaultLanguage = getPersistenceContext().getValue(DEFAULTLANGUAGE, _defaultLanguage);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseStore.deliveryCountries</code> attribute defined at extension <code>commerceservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the deliveryCountries
	 */
	public Collection<CountryModel> getDeliveryCountries()
	{
		if (this._deliveryCountries!=null)
		{
			return _deliveryCountries;
		}
		return _deliveryCountries = getPersistenceContext().getValue(DELIVERYCOUNTRIES, _deliveryCountries);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseStore.deliveryModes</code> attribute defined at extension <code>commerceservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the deliveryModes
	 */
	public Set<DeliveryModeModel> getDeliveryModes()
	{
		if (this._deliveryModes!=null)
		{
			return _deliveryModes;
		}
		return _deliveryModes = getPersistenceContext().getValue(DELIVERYMODES, _deliveryModes);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseStore.expressCheckoutEnabled</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the expressCheckoutEnabled - Determines if a site has the express checkout option.
	 */
	public Boolean getExpressCheckoutEnabled()
	{
		if (this._expressCheckoutEnabled!=null)
		{
			return _expressCheckoutEnabled;
		}
		return _expressCheckoutEnabled = getPersistenceContext().getValue(EXPRESSCHECKOUTENABLED, _expressCheckoutEnabled);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseStore.externalTaxEnabled</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the externalTaxEnabled - Determines whether the site should use external tax calculation
	 */
	public Boolean getExternalTaxEnabled()
	{
		if (this._externalTaxEnabled!=null)
		{
			return _externalTaxEnabled;
		}
		return _externalTaxEnabled = getPersistenceContext().getValue(EXTERNALTAXENABLED, _externalTaxEnabled);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseStore.languages</code> attribute defined at extension <code>commerceservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the languages
	 */
	public Set<LanguageModel> getLanguages()
	{
		if (this._languages!=null)
		{
			return _languages;
		}
		return _languages = getPersistenceContext().getValue(LANGUAGES, _languages);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseStore.maxRadiusForPoSSearch</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the maxRadiusForPoSSearch - The max radius when searching for PoS for a basestore.
	 */
	public Double getMaxRadiusForPoSSearch()
	{
		if (this._maxRadiusForPoSSearch!=null)
		{
			return _maxRadiusForPoSSearch;
		}
		return _maxRadiusForPoSSearch = getPersistenceContext().getValue(MAXRADIUSFORPOSSEARCH, _maxRadiusForPoSSearch);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseStore.name</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the name
	 */
	public String getName()
	{
		return getName(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseStore.name</code> attribute defined at extension <code>basecommerce</code>. 
	 * @param loc the value localization key 
	 * @return the name
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getName(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(NAME, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseStore.paymentProvider</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the paymentProvider - The name of the payment provider that will get used for credit card subscriptions and any psp interaction
	 */
	public String getPaymentProvider()
	{
		if (this._paymentProvider!=null)
		{
			return _paymentProvider;
		}
		return _paymentProvider = getPersistenceContext().getValue(PAYMENTPROVIDER, _paymentProvider);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseStore.pickupInStoreMode</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the pickupInStoreMode - The pickup mode for this store.
	 */
	public PickupInStoreMode getPickupInStoreMode()
	{
		if (this._pickupInStoreMode!=null)
		{
			return _pickupInStoreMode;
		}
		return _pickupInStoreMode = getPersistenceContext().getValue(PICKUPINSTOREMODE, _pickupInStoreMode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseStore.pointsOfService</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the pointsOfService
	 */
	public List<PointOfServiceModel> getPointsOfService()
	{
		if (this._pointsOfService!=null)
		{
			return _pointsOfService;
		}
		return _pointsOfService = getPersistenceContext().getValue(POINTSOFSERVICE, _pointsOfService);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseStore.solrFacetSearchConfiguration</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the solrFacetSearchConfiguration - Solr search configuration for this store.
	 */
	public SolrFacetSearchConfigModel getSolrFacetSearchConfiguration()
	{
		if (this._solrFacetSearchConfiguration!=null)
		{
			return _solrFacetSearchConfiguration;
		}
		return _solrFacetSearchConfiguration = getPersistenceContext().getValue(SOLRFACETSEARCHCONFIGURATION, _solrFacetSearchConfiguration);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseStore.storelocatorDistanceUnit</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the storelocatorDistanceUnit - Specifies the unit the distances in the store will be presented
	 */
	public DistanceUnit getStorelocatorDistanceUnit()
	{
		if (this._storelocatorDistanceUnit!=null)
		{
			return _storelocatorDistanceUnit;
		}
		return _storelocatorDistanceUnit = getPersistenceContext().getValue(STORELOCATORDISTANCEUNIT, _storelocatorDistanceUnit);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseStore.submitOrderProcessCode</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the submitOrderProcessCode - The process name for fullfilment business process.
	 */
	public String getSubmitOrderProcessCode()
	{
		if (this._submitOrderProcessCode!=null)
		{
			return _submitOrderProcessCode;
		}
		return _submitOrderProcessCode = getPersistenceContext().getValue(SUBMITORDERPROCESSCODE, _submitOrderProcessCode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseStore.taxEstimationEnabled</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the taxEstimationEnabled - Determines if a site has the tax estimation enabled.
	 */
	public Boolean getTaxEstimationEnabled()
	{
		if (this._taxEstimationEnabled!=null)
		{
			return _taxEstimationEnabled;
		}
		return _taxEstimationEnabled = getPersistenceContext().getValue(TAXESTIMATIONENABLED, _taxEstimationEnabled);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseStore.taxGroup</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the taxGroup - The site specific tax group.
	 */
	public UserTaxGroup getTaxGroup()
	{
		if (this._taxGroup!=null)
		{
			return _taxGroup;
		}
		return _taxGroup = getPersistenceContext().getValue(TAXGROUP, _taxGroup);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseStore.ticketemployees</code> attribute defined at extension <code>ticketsystem</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the ticketemployees
	 */
	public List<EmployeeModel> getTicketemployees()
	{
		if (this._ticketemployees!=null)
		{
			return _ticketemployees;
		}
		return _ticketemployees = getPersistenceContext().getValue(TICKETEMPLOYEES, _ticketemployees);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseStore.ticketgroups</code> attribute defined at extension <code>ticketsystem</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the ticketgroups
	 */
	public List<CsAgentGroupModel> getTicketgroups()
	{
		if (this._ticketgroups!=null)
		{
			return _ticketgroups;
		}
		return _ticketgroups = getPersistenceContext().getValue(TICKETGROUPS, _ticketgroups);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseStore.uid</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the uid
	 */
	public String getUid()
	{
		if (this._uid!=null)
		{
			return _uid;
		}
		return _uid = getPersistenceContext().getValue(UID, _uid);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseStore.warehouses</code> attribute defined at extension <code>commerceservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the warehouses
	 */
	public List<WarehouseModel> getWarehouses()
	{
		if (this._warehouses!=null)
		{
			return _warehouses;
		}
		return _warehouses = getPersistenceContext().getValue(WAREHOUSES, _warehouses);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseStore.customerAllowedToIgnoreSuggestions</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the customerAllowedToIgnoreSuggestions - Determines whether the customer is allowed to bypass the list of suggested addresses and proceed with their unverified entry.
	 */
	public boolean isCustomerAllowedToIgnoreSuggestions()
	{
		return toPrimitive( _customerAllowedToIgnoreSuggestions = getPersistenceContext().getValue(CUSTOMERALLOWEDTOIGNORESUGGESTIONS, _customerAllowedToIgnoreSuggestions));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseStore.net</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the net - Determines if the prices are treated as net or gross prices in the given base
	 * 							store.
	 */
	public boolean isNet()
	{
		return toPrimitive( _net = getPersistenceContext().getValue(NET, _net));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseStore.catalogs</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the catalogs
	 */
	public void setCatalogs(final List<CatalogModel> value)
	{
		_catalogs = getPersistenceContext().setValue(CATALOGS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseStore.checkoutFlowGroup</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the checkoutFlowGroup - Determines the checkout group
	 */
	public void setCheckoutFlowGroup(final String value)
	{
		_checkoutFlowGroup = getPersistenceContext().setValue(CHECKOUTFLOWGROUP, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseStore.cmsSites</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the cmsSites
	 */
	public void setCmsSites(final Collection<BaseSiteModel> value)
	{
		_cmsSites = getPersistenceContext().setValue(CMSSITES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseStore.currencies</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the currencies
	 */
	public void setCurrencies(final Set<CurrencyModel> value)
	{
		_currencies = getPersistenceContext().setValue(CURRENCIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseStore.customerAllowedToIgnoreSuggestions</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the customerAllowedToIgnoreSuggestions - Determines whether the customer is allowed to bypass the list of suggested addresses and proceed with their unverified entry.
	 */
	public void setCustomerAllowedToIgnoreSuggestions(final boolean value)
	{
		_customerAllowedToIgnoreSuggestions = getPersistenceContext().setValue(CUSTOMERALLOWEDTOIGNORESUGGESTIONS, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseStore.defaultCurrency</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the defaultCurrency - The default currency for the site.
	 */
	public void setDefaultCurrency(final CurrencyModel value)
	{
		_defaultCurrency = getPersistenceContext().setValue(DEFAULTCURRENCY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseStore.defaultDeliveryOrigin</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the defaultDeliveryOrigin - The default delivery origin for the site.
	 */
	public void setDefaultDeliveryOrigin(final PointOfServiceModel value)
	{
		_defaultDeliveryOrigin = getPersistenceContext().setValue(DEFAULTDELIVERYORIGIN, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseStore.defaultLanguage</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the defaultLanguage - The default language for the site.
	 */
	public void setDefaultLanguage(final LanguageModel value)
	{
		_defaultLanguage = getPersistenceContext().setValue(DEFAULTLANGUAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseStore.deliveryCountries</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the deliveryCountries
	 */
	public void setDeliveryCountries(final Collection<CountryModel> value)
	{
		_deliveryCountries = getPersistenceContext().setValue(DELIVERYCOUNTRIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseStore.deliveryModes</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the deliveryModes
	 */
	public void setDeliveryModes(final Set<DeliveryModeModel> value)
	{
		_deliveryModes = getPersistenceContext().setValue(DELIVERYMODES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseStore.expressCheckoutEnabled</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the expressCheckoutEnabled - Determines if a site has the express checkout option.
	 */
	public void setExpressCheckoutEnabled(final Boolean value)
	{
		_expressCheckoutEnabled = getPersistenceContext().setValue(EXPRESSCHECKOUTENABLED, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseStore.externalTaxEnabled</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the externalTaxEnabled - Determines whether the site should use external tax calculation
	 */
	public void setExternalTaxEnabled(final Boolean value)
	{
		_externalTaxEnabled = getPersistenceContext().setValue(EXTERNALTAXENABLED, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseStore.languages</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the languages
	 */
	public void setLanguages(final Set<LanguageModel> value)
	{
		_languages = getPersistenceContext().setValue(LANGUAGES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseStore.maxRadiusForPoSSearch</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the maxRadiusForPoSSearch - The max radius when searching for PoS for a basestore.
	 */
	public void setMaxRadiusForPoSSearch(final Double value)
	{
		_maxRadiusForPoSSearch = getPersistenceContext().setValue(MAXRADIUSFORPOSSEARCH, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseStore.name</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>BaseStore.name</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the name
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setName(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(NAME, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseStore.net</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the net - Determines if the prices are treated as net or gross prices in the given base
	 * 							store.
	 */
	public void setNet(final boolean value)
	{
		_net = getPersistenceContext().setValue(NET, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseStore.paymentProvider</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the paymentProvider - The name of the payment provider that will get used for credit card subscriptions and any psp interaction
	 */
	public void setPaymentProvider(final String value)
	{
		_paymentProvider = getPersistenceContext().setValue(PAYMENTPROVIDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseStore.pickupInStoreMode</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the pickupInStoreMode - The pickup mode for this store.
	 */
	public void setPickupInStoreMode(final PickupInStoreMode value)
	{
		_pickupInStoreMode = getPersistenceContext().setValue(PICKUPINSTOREMODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseStore.pointsOfService</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the pointsOfService
	 */
	public void setPointsOfService(final List<PointOfServiceModel> value)
	{
		_pointsOfService = getPersistenceContext().setValue(POINTSOFSERVICE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseStore.solrFacetSearchConfiguration</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the solrFacetSearchConfiguration - Solr search configuration for this store.
	 */
	public void setSolrFacetSearchConfiguration(final SolrFacetSearchConfigModel value)
	{
		_solrFacetSearchConfiguration = getPersistenceContext().setValue(SOLRFACETSEARCHCONFIGURATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseStore.storelocatorDistanceUnit</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the storelocatorDistanceUnit - Specifies the unit the distances in the store will be presented
	 */
	public void setStorelocatorDistanceUnit(final DistanceUnit value)
	{
		_storelocatorDistanceUnit = getPersistenceContext().setValue(STORELOCATORDISTANCEUNIT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseStore.submitOrderProcessCode</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the submitOrderProcessCode - The process name for fullfilment business process.
	 */
	public void setSubmitOrderProcessCode(final String value)
	{
		_submitOrderProcessCode = getPersistenceContext().setValue(SUBMITORDERPROCESSCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseStore.taxEstimationEnabled</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the taxEstimationEnabled - Determines if a site has the tax estimation enabled.
	 */
	public void setTaxEstimationEnabled(final Boolean value)
	{
		_taxEstimationEnabled = getPersistenceContext().setValue(TAXESTIMATIONENABLED, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseStore.taxGroup</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the taxGroup - The site specific tax group.
	 */
	public void setTaxGroup(final UserTaxGroup value)
	{
		_taxGroup = getPersistenceContext().setValue(TAXGROUP, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseStore.ticketemployees</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the ticketemployees
	 */
	public void setTicketemployees(final List<EmployeeModel> value)
	{
		_ticketemployees = getPersistenceContext().setValue(TICKETEMPLOYEES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseStore.ticketgroups</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the ticketgroups
	 */
	public void setTicketgroups(final List<CsAgentGroupModel> value)
	{
		_ticketgroups = getPersistenceContext().setValue(TICKETGROUPS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseStore.uid</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the uid
	 */
	public void setUid(final String value)
	{
		_uid = getPersistenceContext().setValue(UID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseStore.warehouses</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the warehouses
	 */
	public void setWarehouses(final List<WarehouseModel> value)
	{
		_warehouses = getPersistenceContext().setValue(WAREHOUSES, value);
	}
	
}
