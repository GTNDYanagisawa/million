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
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.mobileservices.enums.MessageType;
import de.hybris.platform.mobileservices.enums.MobileActiveStateType;
import de.hybris.platform.mobileservices.enums.NetworkType;
import de.hybris.platform.mobileservices.model.text.MobileActionAssignmentModel;
import de.hybris.platform.mobileservices.model.text.MobileAggregatorModel;
import de.hybris.platform.mobileservices.model.text.MobileCostPlanModel;
import de.hybris.platform.mobileservices.model.text.MobileReceiveGenericActionModel;
import de.hybris.platform.mobileservices.model.text.MobileShortcodeModel;
import de.hybris.platform.mobileservices.model.text.PhoneNumberListModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type MobileShortcode first defined at extension mobileservices.
 */
@SuppressWarnings("all")
public class MobileShortcodeModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "MobileShortcode";
	
	/**<i>Generated relation code constant for relation <code>AggregatorShortCodeRelation</code> defining source attribute <code>aggregator</code> in extension <code>mobileservices</code>.</i>*/
	public final static String _AGGREGATORSHORTCODERELATION = "AggregatorShortCodeRelation";
	
	/**<i>Generated relation code constant for relation <code>ShortcodeAlternativeRouteRelation</code> defining source attribute <code>connectedShortcodes</code> in extension <code>mobileservices</code>.</i>*/
	public final static String _SHORTCODEALTERNATIVEROUTERELATION = "ShortcodeAlternativeRouteRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileShortcode.code</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileShortcode.keywordPrefix</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String KEYWORDPREFIX = "keywordPrefix";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileShortcode.supportedMessageType</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String SUPPORTEDMESSAGETYPE = "supportedMessageType";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileShortcode.country</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String COUNTRY = "country";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileShortcode.defaultAction</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String DEFAULTACTION = "defaultAction";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileShortcode.networkType</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String NETWORKTYPE = "networkType";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileShortcode.messageMaxSize</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String MESSAGEMAXSIZE = "messageMaxSize";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileShortcode.state</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String STATE = "state";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileShortcode.aggregator</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String AGGREGATOR = "aggregator";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileShortcode.assignments</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String ASSIGNMENTS = "assignments";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileShortcode.connectedShortcodes</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String CONNECTEDSHORTCODES = "connectedShortcodes";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileShortcode.alternativeReplyRoute</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String ALTERNATIVEREPLYROUTE = "alternativeReplyRoute";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileShortcode.revenuePlans</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String REVENUEPLANS = "revenuePlans";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileShortcode.costPlans</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String COSTPLANS = "costPlans";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileShortcode.phoneNumberFilters</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String PHONENUMBERFILTERS = "phoneNumberFilters";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileShortcode.testingPhoneNumbers</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String TESTINGPHONENUMBERS = "testingPhoneNumbers";
	
	
	/** <i>Generated variable</i> - Variable of <code>MobileShortcode.code</code> attribute defined at extension <code>mobileservices</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>MobileShortcode.keywordPrefix</code> attribute defined at extension <code>mobileservices</code>. */
	private String _keywordPrefix;
	
	/** <i>Generated variable</i> - Variable of <code>MobileShortcode.supportedMessageType</code> attribute defined at extension <code>mobileservices</code>. */
	private MessageType _supportedMessageType;
	
	/** <i>Generated variable</i> - Variable of <code>MobileShortcode.country</code> attribute defined at extension <code>mobileservices</code>. */
	private CountryModel _country;
	
	/** <i>Generated variable</i> - Variable of <code>MobileShortcode.defaultAction</code> attribute defined at extension <code>mobileservices</code>. */
	private MobileReceiveGenericActionModel _defaultAction;
	
	/** <i>Generated variable</i> - Variable of <code>MobileShortcode.networkType</code> attribute defined at extension <code>mobileservices</code>. */
	private NetworkType _networkType;
	
	/** <i>Generated variable</i> - Variable of <code>MobileShortcode.messageMaxSize</code> attribute defined at extension <code>mobileservices</code>. */
	private Integer _messageMaxSize;
	
	/** <i>Generated variable</i> - Variable of <code>MobileShortcode.state</code> attribute defined at extension <code>mobileservices</code>. */
	private MobileActiveStateType _state;
	
	/** <i>Generated variable</i> - Variable of <code>MobileShortcode.aggregator</code> attribute defined at extension <code>mobileservices</code>. */
	private MobileAggregatorModel _aggregator;
	
	/** <i>Generated variable</i> - Variable of <code>MobileShortcode.assignments</code> attribute defined at extension <code>mobileservices</code>. */
	private Collection<MobileActionAssignmentModel> _assignments;
	
	/** <i>Generated variable</i> - Variable of <code>MobileShortcode.connectedShortcodes</code> attribute defined at extension <code>mobileservices</code>. */
	private Collection<MobileShortcodeModel> _connectedShortcodes;
	
	/** <i>Generated variable</i> - Variable of <code>MobileShortcode.alternativeReplyRoute</code> attribute defined at extension <code>mobileservices</code>. */
	private MobileShortcodeModel _alternativeReplyRoute;
	
	/** <i>Generated variable</i> - Variable of <code>MobileShortcode.revenuePlans</code> attribute defined at extension <code>mobileservices</code>. */
	private Collection<MobileCostPlanModel> _revenuePlans;
	
	/** <i>Generated variable</i> - Variable of <code>MobileShortcode.costPlans</code> attribute defined at extension <code>mobileservices</code>. */
	private Collection<MobileCostPlanModel> _costPlans;
	
	/** <i>Generated variable</i> - Variable of <code>MobileShortcode.phoneNumberFilters</code> attribute defined at extension <code>mobileservices</code>. */
	private Collection<PhoneNumberListModel> _phoneNumberFilters;
	
	/** <i>Generated variable</i> - Variable of <code>MobileShortcode.testingPhoneNumbers</code> attribute defined at extension <code>mobileservices</code>. */
	private Collection<PhoneNumberListModel> _testingPhoneNumbers;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public MobileShortcodeModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public MobileShortcodeModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _aggregator initial attribute declared by type <code>MobileShortcode</code> at extension <code>mobileservices</code>
	 * @param _code initial attribute declared by type <code>MobileShortcode</code> at extension <code>mobileservices</code>
	 * @param _country initial attribute declared by type <code>MobileShortcode</code> at extension <code>mobileservices</code>
	 */
	@Deprecated
	public MobileShortcodeModel(final MobileAggregatorModel _aggregator, final String _code, final CountryModel _country)
	{
		super();
		setAggregator(_aggregator);
		setCode(_code);
		setCountry(_country);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _aggregator initial attribute declared by type <code>MobileShortcode</code> at extension <code>mobileservices</code>
	 * @param _code initial attribute declared by type <code>MobileShortcode</code> at extension <code>mobileservices</code>
	 * @param _country initial attribute declared by type <code>MobileShortcode</code> at extension <code>mobileservices</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public MobileShortcodeModel(final MobileAggregatorModel _aggregator, final String _code, final CountryModel _country, final ItemModel _owner)
	{
		super();
		setAggregator(_aggregator);
		setCode(_code);
		setCountry(_country);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileShortcode.aggregator</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the aggregator
	 */
	public MobileAggregatorModel getAggregator()
	{
		if (this._aggregator!=null)
		{
			return _aggregator;
		}
		return _aggregator = getPersistenceContext().getValue(AGGREGATOR, _aggregator);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileShortcode.alternativeReplyRoute</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the alternativeReplyRoute
	 */
	public MobileShortcodeModel getAlternativeReplyRoute()
	{
		if (this._alternativeReplyRoute!=null)
		{
			return _alternativeReplyRoute;
		}
		return _alternativeReplyRoute = getPersistenceContext().getValue(ALTERNATIVEREPLYROUTE, _alternativeReplyRoute);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileShortcode.assignments</code> attribute defined at extension <code>mobileservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the assignments
	 */
	public Collection<MobileActionAssignmentModel> getAssignments()
	{
		if (this._assignments!=null)
		{
			return _assignments;
		}
		return _assignments = getPersistenceContext().getValue(ASSIGNMENTS, _assignments);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileShortcode.code</code> attribute defined at extension <code>mobileservices</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>MobileShortcode.connectedShortcodes</code> attribute defined at extension <code>mobileservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the connectedShortcodes
	 */
	public Collection<MobileShortcodeModel> getConnectedShortcodes()
	{
		if (this._connectedShortcodes!=null)
		{
			return _connectedShortcodes;
		}
		return _connectedShortcodes = getPersistenceContext().getValue(CONNECTEDSHORTCODES, _connectedShortcodes);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileShortcode.costPlans</code> attribute defined at extension <code>mobileservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the costPlans
	 */
	public Collection<MobileCostPlanModel> getCostPlans()
	{
		if (this._costPlans!=null)
		{
			return _costPlans;
		}
		return _costPlans = getPersistenceContext().getValue(COSTPLANS, _costPlans);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileShortcode.country</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the country
	 */
	public CountryModel getCountry()
	{
		if (this._country!=null)
		{
			return _country;
		}
		return _country = getPersistenceContext().getValue(COUNTRY, _country);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileShortcode.defaultAction</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the defaultAction
	 */
	public MobileReceiveGenericActionModel getDefaultAction()
	{
		if (this._defaultAction!=null)
		{
			return _defaultAction;
		}
		return _defaultAction = getPersistenceContext().getValue(DEFAULTACTION, _defaultAction);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileShortcode.keywordPrefix</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the keywordPrefix
	 */
	public String getKeywordPrefix()
	{
		if (this._keywordPrefix!=null)
		{
			return _keywordPrefix;
		}
		return _keywordPrefix = getPersistenceContext().getValue(KEYWORDPREFIX, _keywordPrefix);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileShortcode.messageMaxSize</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the messageMaxSize
	 */
	public Integer getMessageMaxSize()
	{
		if (this._messageMaxSize!=null)
		{
			return _messageMaxSize;
		}
		return _messageMaxSize = getPersistenceContext().getValue(MESSAGEMAXSIZE, _messageMaxSize);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileShortcode.networkType</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the networkType
	 */
	public NetworkType getNetworkType()
	{
		if (this._networkType!=null)
		{
			return _networkType;
		}
		return _networkType = getPersistenceContext().getValue(NETWORKTYPE, _networkType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileShortcode.phoneNumberFilters</code> attribute defined at extension <code>mobileservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the phoneNumberFilters
	 */
	public Collection<PhoneNumberListModel> getPhoneNumberFilters()
	{
		if (this._phoneNumberFilters!=null)
		{
			return _phoneNumberFilters;
		}
		return _phoneNumberFilters = getPersistenceContext().getValue(PHONENUMBERFILTERS, _phoneNumberFilters);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileShortcode.revenuePlans</code> attribute defined at extension <code>mobileservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the revenuePlans
	 */
	public Collection<MobileCostPlanModel> getRevenuePlans()
	{
		if (this._revenuePlans!=null)
		{
			return _revenuePlans;
		}
		return _revenuePlans = getPersistenceContext().getValue(REVENUEPLANS, _revenuePlans);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileShortcode.state</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the state
	 */
	public MobileActiveStateType getState()
	{
		if (this._state!=null)
		{
			return _state;
		}
		return _state = getPersistenceContext().getValue(STATE, _state);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileShortcode.supportedMessageType</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the supportedMessageType
	 */
	public MessageType getSupportedMessageType()
	{
		if (this._supportedMessageType!=null)
		{
			return _supportedMessageType;
		}
		return _supportedMessageType = getPersistenceContext().getValue(SUPPORTEDMESSAGETYPE, _supportedMessageType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileShortcode.testingPhoneNumbers</code> attribute defined at extension <code>mobileservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the testingPhoneNumbers
	 */
	public Collection<PhoneNumberListModel> getTestingPhoneNumbers()
	{
		if (this._testingPhoneNumbers!=null)
		{
			return _testingPhoneNumbers;
		}
		return _testingPhoneNumbers = getPersistenceContext().getValue(TESTINGPHONENUMBERS, _testingPhoneNumbers);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileShortcode.aggregator</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the aggregator
	 */
	public void setAggregator(final MobileAggregatorModel value)
	{
		_aggregator = getPersistenceContext().setValue(AGGREGATOR, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileShortcode.alternativeReplyRoute</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the alternativeReplyRoute
	 */
	public void setAlternativeReplyRoute(final MobileShortcodeModel value)
	{
		_alternativeReplyRoute = getPersistenceContext().setValue(ALTERNATIVEREPLYROUTE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileShortcode.assignments</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the assignments
	 */
	public void setAssignments(final Collection<MobileActionAssignmentModel> value)
	{
		_assignments = getPersistenceContext().setValue(ASSIGNMENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileShortcode.code</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileShortcode.connectedShortcodes</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the connectedShortcodes
	 */
	public void setConnectedShortcodes(final Collection<MobileShortcodeModel> value)
	{
		_connectedShortcodes = getPersistenceContext().setValue(CONNECTEDSHORTCODES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileShortcode.costPlans</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the costPlans
	 */
	public void setCostPlans(final Collection<MobileCostPlanModel> value)
	{
		_costPlans = getPersistenceContext().setValue(COSTPLANS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileShortcode.country</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the country
	 */
	public void setCountry(final CountryModel value)
	{
		_country = getPersistenceContext().setValue(COUNTRY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileShortcode.defaultAction</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the defaultAction
	 */
	public void setDefaultAction(final MobileReceiveGenericActionModel value)
	{
		_defaultAction = getPersistenceContext().setValue(DEFAULTACTION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileShortcode.keywordPrefix</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the keywordPrefix
	 */
	public void setKeywordPrefix(final String value)
	{
		_keywordPrefix = getPersistenceContext().setValue(KEYWORDPREFIX, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileShortcode.messageMaxSize</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the messageMaxSize
	 */
	public void setMessageMaxSize(final Integer value)
	{
		_messageMaxSize = getPersistenceContext().setValue(MESSAGEMAXSIZE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileShortcode.networkType</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the networkType
	 */
	public void setNetworkType(final NetworkType value)
	{
		_networkType = getPersistenceContext().setValue(NETWORKTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileShortcode.phoneNumberFilters</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the phoneNumberFilters
	 */
	public void setPhoneNumberFilters(final Collection<PhoneNumberListModel> value)
	{
		_phoneNumberFilters = getPersistenceContext().setValue(PHONENUMBERFILTERS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileShortcode.revenuePlans</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the revenuePlans
	 */
	public void setRevenuePlans(final Collection<MobileCostPlanModel> value)
	{
		_revenuePlans = getPersistenceContext().setValue(REVENUEPLANS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileShortcode.state</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the state
	 */
	public void setState(final MobileActiveStateType value)
	{
		_state = getPersistenceContext().setValue(STATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileShortcode.supportedMessageType</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the supportedMessageType
	 */
	public void setSupportedMessageType(final MessageType value)
	{
		_supportedMessageType = getPersistenceContext().setValue(SUPPORTEDMESSAGETYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileShortcode.testingPhoneNumbers</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the testingPhoneNumbers
	 */
	public void setTestingPhoneNumbers(final Collection<PhoneNumberListModel> value)
	{
		_testingPhoneNumbers = getPersistenceContext().setValue(TESTINGPHONENUMBERS, value);
	}
	
}
