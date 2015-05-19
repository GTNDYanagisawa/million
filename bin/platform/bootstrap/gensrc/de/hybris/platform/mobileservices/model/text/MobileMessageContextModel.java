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
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.mobileservices.enums.MessageType;
import de.hybris.platform.mobileservices.enums.MobileAggregatorError;
import de.hybris.platform.mobileservices.enums.MobileMessageError;
import de.hybris.platform.mobileservices.enums.MobileMessageStatus;
import de.hybris.platform.mobileservices.model.text.MobileActionAssignmentModel;
import de.hybris.platform.mobileservices.model.text.MobileShortcodeModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.servicelayer.model.action.AbstractActionModel;
import java.math.BigDecimal;

/**
 * Generated model class for type MobileMessageContext first defined at extension mobileservices.
 */
@SuppressWarnings("all")
public class MobileMessageContextModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "MobileMessageContext";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.incomingMessageId</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String INCOMINGMESSAGEID = "incomingMessageId";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.incomingText</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String INCOMINGTEXT = "incomingText";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.outgoingMessageId</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String OUTGOINGMESSAGEID = "outgoingMessageId";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.outgoingText</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String OUTGOINGTEXT = "outgoingText";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.outgoingSubject</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String OUTGOINGSUBJECT = "outgoingSubject";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.phoneNumber</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String PHONENUMBER = "phoneNumber";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.normalizedPhoneNumber</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String NORMALIZEDPHONENUMBER = "normalizedPhoneNumber";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.countryIsoCode</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String COUNTRYISOCODE = "countryIsoCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.phoneCountryIsoCode</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String PHONECOUNTRYISOCODE = "phoneCountryIsoCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.type</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String TYPE = "type";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.user</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String USER = "user";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.status</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String STATUS = "status";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.usingDefaultAction</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String USINGDEFAULTACTION = "usingDefaultAction";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.messageError</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String MESSAGEERROR = "messageError";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.messageErrorDescription</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String MESSAGEERRORDESCRIPTION = "messageErrorDescription";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.aggregatorError</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String AGGREGATORERROR = "aggregatorError";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.aggregatorErrorDescription</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String AGGREGATORERRORDESCRIPTION = "aggregatorErrorDescription";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.isLink</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String ISLINK = "isLink";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.shortcode</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String SHORTCODE = "shortcode";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.normalizedShortcode</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String NORMALIZEDSHORTCODE = "normalizedShortcode";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.matchedActionAssignment</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String MATCHEDACTIONASSIGNMENT = "matchedActionAssignment";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.matchedAction</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String MATCHEDACTION = "matchedAction";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.matchedShortcode</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String MATCHEDSHORTCODE = "matchedShortcode";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.outgoingShortcode</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String OUTGOINGSHORTCODE = "outgoingShortcode";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.failures</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String FAILURES = "failures";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.price</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String PRICE = "price";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.priceCurrency</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String PRICECURRENCY = "priceCurrency";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.revenue</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String REVENUE = "revenue";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.revenueCurrency</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String REVENUECURRENCY = "revenueCurrency";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.optOperator</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String OPTOPERATOR = "optOperator";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.optTariff</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String OPTTARIFF = "optTariff";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.optSessionId</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String OPTSESSIONID = "optSessionId";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.rawMessageDetails</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String RAWMESSAGEDETAILS = "rawMessageDetails";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.incomingEngineId</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String INCOMINGENGINEID = "incomingEngineId";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileMessageContext.outgoingEngineId</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String OUTGOINGENGINEID = "outgoingEngineId";
	
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.incomingMessageId</code> attribute defined at extension <code>mobileservices</code>. */
	private String _incomingMessageId;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.incomingText</code> attribute defined at extension <code>mobileservices</code>. */
	private String _incomingText;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.outgoingMessageId</code> attribute defined at extension <code>mobileservices</code>. */
	private String _outgoingMessageId;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.outgoingText</code> attribute defined at extension <code>mobileservices</code>. */
	private String _outgoingText;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.outgoingSubject</code> attribute defined at extension <code>mobileservices</code>. */
	private String _outgoingSubject;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.phoneNumber</code> attribute defined at extension <code>mobileservices</code>. */
	private String _phoneNumber;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.normalizedPhoneNumber</code> attribute defined at extension <code>mobileservices</code>. */
	private String _normalizedPhoneNumber;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.countryIsoCode</code> attribute defined at extension <code>mobileservices</code>. */
	private String _countryIsoCode;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.phoneCountryIsoCode</code> attribute defined at extension <code>mobileservices</code>. */
	private String _phoneCountryIsoCode;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.type</code> attribute defined at extension <code>mobileservices</code>. */
	private MessageType _type;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.user</code> attribute defined at extension <code>mobileservices</code>. */
	private UserModel _user;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.status</code> attribute defined at extension <code>mobileservices</code>. */
	private MobileMessageStatus _status;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.usingDefaultAction</code> attribute defined at extension <code>mobileservices</code>. */
	private Boolean _usingDefaultAction;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.messageError</code> attribute defined at extension <code>mobileservices</code>. */
	private MobileMessageError _messageError;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.messageErrorDescription</code> attribute defined at extension <code>mobileservices</code>. */
	private String _messageErrorDescription;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.aggregatorError</code> attribute defined at extension <code>mobileservices</code>. */
	private MobileAggregatorError _aggregatorError;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.aggregatorErrorDescription</code> attribute defined at extension <code>mobileservices</code>. */
	private String _aggregatorErrorDescription;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.isLink</code> attribute defined at extension <code>mobileservices</code>. */
	private Boolean _isLink;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.shortcode</code> attribute defined at extension <code>mobileservices</code>. */
	private String _shortcode;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.normalizedShortcode</code> attribute defined at extension <code>mobileservices</code>. */
	private String _normalizedShortcode;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.matchedActionAssignment</code> attribute defined at extension <code>mobileservices</code>. */
	private MobileActionAssignmentModel _matchedActionAssignment;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.matchedAction</code> attribute defined at extension <code>mobileservices</code>. */
	private AbstractActionModel _matchedAction;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.matchedShortcode</code> attribute defined at extension <code>mobileservices</code>. */
	private MobileShortcodeModel _matchedShortcode;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.outgoingShortcode</code> attribute defined at extension <code>mobileservices</code>. */
	private MobileShortcodeModel _outgoingShortcode;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.failures</code> attribute defined at extension <code>mobileservices</code>. */
	private Integer _failures;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.price</code> attribute defined at extension <code>mobileservices</code>. */
	private BigDecimal _price;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.priceCurrency</code> attribute defined at extension <code>mobileservices</code>. */
	private CurrencyModel _priceCurrency;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.revenue</code> attribute defined at extension <code>mobileservices</code>. */
	private BigDecimal _revenue;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.revenueCurrency</code> attribute defined at extension <code>mobileservices</code>. */
	private CurrencyModel _revenueCurrency;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.optOperator</code> attribute defined at extension <code>mobileservices</code>. */
	private String _optOperator;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.optTariff</code> attribute defined at extension <code>mobileservices</code>. */
	private String _optTariff;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.optSessionId</code> attribute defined at extension <code>mobileservices</code>. */
	private String _optSessionId;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.rawMessageDetails</code> attribute defined at extension <code>mobileservices</code>. */
	private String _rawMessageDetails;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.incomingEngineId</code> attribute defined at extension <code>mobileservices</code>. */
	private String _incomingEngineId;
	
	/** <i>Generated variable</i> - Variable of <code>MobileMessageContext.outgoingEngineId</code> attribute defined at extension <code>mobileservices</code>. */
	private String _outgoingEngineId;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public MobileMessageContextModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public MobileMessageContextModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _phoneNumber initial attribute declared by type <code>MobileMessageContext</code> at extension <code>mobileservices</code>
	 * @param _status initial attribute declared by type <code>MobileMessageContext</code> at extension <code>mobileservices</code>
	 * @param _type initial attribute declared by type <code>MobileMessageContext</code> at extension <code>mobileservices</code>
	 */
	@Deprecated
	public MobileMessageContextModel(final String _phoneNumber, final MobileMessageStatus _status, final MessageType _type)
	{
		super();
		setPhoneNumber(_phoneNumber);
		setStatus(_status);
		setType(_type);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _incomingEngineId initial attribute declared by type <code>MobileMessageContext</code> at extension <code>mobileservices</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _phoneNumber initial attribute declared by type <code>MobileMessageContext</code> at extension <code>mobileservices</code>
	 * @param _rawMessageDetails initial attribute declared by type <code>MobileMessageContext</code> at extension <code>mobileservices</code>
	 * @param _status initial attribute declared by type <code>MobileMessageContext</code> at extension <code>mobileservices</code>
	 * @param _type initial attribute declared by type <code>MobileMessageContext</code> at extension <code>mobileservices</code>
	 */
	@Deprecated
	public MobileMessageContextModel(final String _incomingEngineId, final ItemModel _owner, final String _phoneNumber, final String _rawMessageDetails, final MobileMessageStatus _status, final MessageType _type)
	{
		super();
		setIncomingEngineId(_incomingEngineId);
		setOwner(_owner);
		setPhoneNumber(_phoneNumber);
		setRawMessageDetails(_rawMessageDetails);
		setStatus(_status);
		setType(_type);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.aggregatorError</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the aggregatorError
	 */
	public MobileAggregatorError getAggregatorError()
	{
		if (this._aggregatorError!=null)
		{
			return _aggregatorError;
		}
		return _aggregatorError = getPersistenceContext().getValue(AGGREGATORERROR, _aggregatorError);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.aggregatorErrorDescription</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the aggregatorErrorDescription
	 */
	public String getAggregatorErrorDescription()
	{
		if (this._aggregatorErrorDescription!=null)
		{
			return _aggregatorErrorDescription;
		}
		return _aggregatorErrorDescription = getPersistenceContext().getValue(AGGREGATORERRORDESCRIPTION, _aggregatorErrorDescription);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.countryIsoCode</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the countryIsoCode
	 */
	public String getCountryIsoCode()
	{
		if (this._countryIsoCode!=null)
		{
			return _countryIsoCode;
		}
		return _countryIsoCode = getPersistenceContext().getValue(COUNTRYISOCODE, _countryIsoCode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.failures</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the failures
	 */
	public Integer getFailures()
	{
		if (this._failures!=null)
		{
			return _failures;
		}
		return _failures = getPersistenceContext().getValue(FAILURES, _failures);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.incomingEngineId</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the incomingEngineId
	 */
	public String getIncomingEngineId()
	{
		if (this._incomingEngineId!=null)
		{
			return _incomingEngineId;
		}
		return _incomingEngineId = getPersistenceContext().getValue(INCOMINGENGINEID, _incomingEngineId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.incomingMessageId</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the incomingMessageId
	 */
	public String getIncomingMessageId()
	{
		if (this._incomingMessageId!=null)
		{
			return _incomingMessageId;
		}
		return _incomingMessageId = getPersistenceContext().getValue(INCOMINGMESSAGEID, _incomingMessageId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.incomingText</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the incomingText
	 */
	public String getIncomingText()
	{
		if (this._incomingText!=null)
		{
			return _incomingText;
		}
		return _incomingText = getPersistenceContext().getValue(INCOMINGTEXT, _incomingText);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.isLink</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the isLink
	 */
	public Boolean getIsLink()
	{
		if (this._isLink!=null)
		{
			return _isLink;
		}
		return _isLink = getPersistenceContext().getValue(ISLINK, _isLink);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.matchedAction</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the matchedAction
	 */
	public AbstractActionModel getMatchedAction()
	{
		if (this._matchedAction!=null)
		{
			return _matchedAction;
		}
		return _matchedAction = getPersistenceContext().getValue(MATCHEDACTION, _matchedAction);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.matchedActionAssignment</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the matchedActionAssignment
	 */
	public MobileActionAssignmentModel getMatchedActionAssignment()
	{
		if (this._matchedActionAssignment!=null)
		{
			return _matchedActionAssignment;
		}
		return _matchedActionAssignment = getPersistenceContext().getValue(MATCHEDACTIONASSIGNMENT, _matchedActionAssignment);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.matchedShortcode</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the matchedShortcode
	 */
	public MobileShortcodeModel getMatchedShortcode()
	{
		if (this._matchedShortcode!=null)
		{
			return _matchedShortcode;
		}
		return _matchedShortcode = getPersistenceContext().getValue(MATCHEDSHORTCODE, _matchedShortcode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.messageError</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the messageError
	 */
	public MobileMessageError getMessageError()
	{
		if (this._messageError!=null)
		{
			return _messageError;
		}
		return _messageError = getPersistenceContext().getValue(MESSAGEERROR, _messageError);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.messageErrorDescription</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the messageErrorDescription
	 */
	public String getMessageErrorDescription()
	{
		if (this._messageErrorDescription!=null)
		{
			return _messageErrorDescription;
		}
		return _messageErrorDescription = getPersistenceContext().getValue(MESSAGEERRORDESCRIPTION, _messageErrorDescription);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.normalizedPhoneNumber</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the normalizedPhoneNumber
	 */
	public String getNormalizedPhoneNumber()
	{
		if (this._normalizedPhoneNumber!=null)
		{
			return _normalizedPhoneNumber;
		}
		return _normalizedPhoneNumber = getPersistenceContext().getValue(NORMALIZEDPHONENUMBER, _normalizedPhoneNumber);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.normalizedShortcode</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the normalizedShortcode
	 */
	public String getNormalizedShortcode()
	{
		if (this._normalizedShortcode!=null)
		{
			return _normalizedShortcode;
		}
		return _normalizedShortcode = getPersistenceContext().getValue(NORMALIZEDSHORTCODE, _normalizedShortcode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.optOperator</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the optOperator
	 */
	public String getOptOperator()
	{
		if (this._optOperator!=null)
		{
			return _optOperator;
		}
		return _optOperator = getPersistenceContext().getValue(OPTOPERATOR, _optOperator);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.optSessionId</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the optSessionId
	 */
	public String getOptSessionId()
	{
		if (this._optSessionId!=null)
		{
			return _optSessionId;
		}
		return _optSessionId = getPersistenceContext().getValue(OPTSESSIONID, _optSessionId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.optTariff</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the optTariff
	 */
	public String getOptTariff()
	{
		if (this._optTariff!=null)
		{
			return _optTariff;
		}
		return _optTariff = getPersistenceContext().getValue(OPTTARIFF, _optTariff);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.outgoingEngineId</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the outgoingEngineId
	 */
	public String getOutgoingEngineId()
	{
		if (this._outgoingEngineId!=null)
		{
			return _outgoingEngineId;
		}
		return _outgoingEngineId = getPersistenceContext().getValue(OUTGOINGENGINEID, _outgoingEngineId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.outgoingMessageId</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the outgoingMessageId
	 */
	public String getOutgoingMessageId()
	{
		if (this._outgoingMessageId!=null)
		{
			return _outgoingMessageId;
		}
		return _outgoingMessageId = getPersistenceContext().getValue(OUTGOINGMESSAGEID, _outgoingMessageId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.outgoingShortcode</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the outgoingShortcode
	 */
	public MobileShortcodeModel getOutgoingShortcode()
	{
		if (this._outgoingShortcode!=null)
		{
			return _outgoingShortcode;
		}
		return _outgoingShortcode = getPersistenceContext().getValue(OUTGOINGSHORTCODE, _outgoingShortcode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.outgoingSubject</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the outgoingSubject
	 */
	public String getOutgoingSubject()
	{
		if (this._outgoingSubject!=null)
		{
			return _outgoingSubject;
		}
		return _outgoingSubject = getPersistenceContext().getValue(OUTGOINGSUBJECT, _outgoingSubject);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.outgoingText</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the outgoingText
	 */
	public String getOutgoingText()
	{
		if (this._outgoingText!=null)
		{
			return _outgoingText;
		}
		return _outgoingText = getPersistenceContext().getValue(OUTGOINGTEXT, _outgoingText);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.phoneCountryIsoCode</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the phoneCountryIsoCode
	 */
	public String getPhoneCountryIsoCode()
	{
		if (this._phoneCountryIsoCode!=null)
		{
			return _phoneCountryIsoCode;
		}
		return _phoneCountryIsoCode = getPersistenceContext().getValue(PHONECOUNTRYISOCODE, _phoneCountryIsoCode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.phoneNumber</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the phoneNumber
	 */
	public String getPhoneNumber()
	{
		if (this._phoneNumber!=null)
		{
			return _phoneNumber;
		}
		return _phoneNumber = getPersistenceContext().getValue(PHONENUMBER, _phoneNumber);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.price</code> attribute defined at extension <code>mobileservices</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.priceCurrency</code> attribute defined at extension <code>mobileservices</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.rawMessageDetails</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the rawMessageDetails
	 */
	public String getRawMessageDetails()
	{
		if (this._rawMessageDetails!=null)
		{
			return _rawMessageDetails;
		}
		return _rawMessageDetails = getPersistenceContext().getValue(RAWMESSAGEDETAILS, _rawMessageDetails);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.revenue</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the revenue
	 */
	public BigDecimal getRevenue()
	{
		if (this._revenue!=null)
		{
			return _revenue;
		}
		return _revenue = getPersistenceContext().getValue(REVENUE, _revenue);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.revenueCurrency</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the revenueCurrency
	 */
	public CurrencyModel getRevenueCurrency()
	{
		if (this._revenueCurrency!=null)
		{
			return _revenueCurrency;
		}
		return _revenueCurrency = getPersistenceContext().getValue(REVENUECURRENCY, _revenueCurrency);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.shortcode</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the shortcode
	 */
	public String getShortcode()
	{
		if (this._shortcode!=null)
		{
			return _shortcode;
		}
		return _shortcode = getPersistenceContext().getValue(SHORTCODE, _shortcode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.status</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the status
	 */
	public MobileMessageStatus getStatus()
	{
		if (this._status!=null)
		{
			return _status;
		}
		return _status = getPersistenceContext().getValue(STATUS, _status);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.type</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the type
	 */
	public MessageType getType()
	{
		if (this._type!=null)
		{
			return _type;
		}
		return _type = getPersistenceContext().getValue(TYPE, _type);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.user</code> attribute defined at extension <code>mobileservices</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>MobileMessageContext.usingDefaultAction</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the usingDefaultAction
	 */
	public Boolean getUsingDefaultAction()
	{
		if (this._usingDefaultAction!=null)
		{
			return _usingDefaultAction;
		}
		return _usingDefaultAction = getPersistenceContext().getValue(USINGDEFAULTACTION, _usingDefaultAction);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileMessageContext.aggregatorError</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the aggregatorError
	 */
	public void setAggregatorError(final MobileAggregatorError value)
	{
		_aggregatorError = getPersistenceContext().setValue(AGGREGATORERROR, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileMessageContext.aggregatorErrorDescription</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the aggregatorErrorDescription
	 */
	public void setAggregatorErrorDescription(final String value)
	{
		_aggregatorErrorDescription = getPersistenceContext().setValue(AGGREGATORERRORDESCRIPTION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileMessageContext.countryIsoCode</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the countryIsoCode
	 */
	public void setCountryIsoCode(final String value)
	{
		_countryIsoCode = getPersistenceContext().setValue(COUNTRYISOCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileMessageContext.failures</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the failures
	 */
	public void setFailures(final Integer value)
	{
		_failures = getPersistenceContext().setValue(FAILURES, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>MobileMessageContext.incomingEngineId</code> attribute defined at extension <code>mobileservices</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the incomingEngineId
	 */
	public void setIncomingEngineId(final String value)
	{
		_incomingEngineId = getPersistenceContext().setValue(INCOMINGENGINEID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileMessageContext.incomingMessageId</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the incomingMessageId
	 */
	public void setIncomingMessageId(final String value)
	{
		_incomingMessageId = getPersistenceContext().setValue(INCOMINGMESSAGEID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileMessageContext.incomingText</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the incomingText
	 */
	public void setIncomingText(final String value)
	{
		_incomingText = getPersistenceContext().setValue(INCOMINGTEXT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileMessageContext.isLink</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the isLink
	 */
	public void setIsLink(final Boolean value)
	{
		_isLink = getPersistenceContext().setValue(ISLINK, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileMessageContext.matchedAction</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the matchedAction
	 */
	public void setMatchedAction(final AbstractActionModel value)
	{
		_matchedAction = getPersistenceContext().setValue(MATCHEDACTION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileMessageContext.matchedActionAssignment</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the matchedActionAssignment
	 */
	public void setMatchedActionAssignment(final MobileActionAssignmentModel value)
	{
		_matchedActionAssignment = getPersistenceContext().setValue(MATCHEDACTIONASSIGNMENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileMessageContext.matchedShortcode</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the matchedShortcode
	 */
	public void setMatchedShortcode(final MobileShortcodeModel value)
	{
		_matchedShortcode = getPersistenceContext().setValue(MATCHEDSHORTCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileMessageContext.messageError</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the messageError
	 */
	public void setMessageError(final MobileMessageError value)
	{
		_messageError = getPersistenceContext().setValue(MESSAGEERROR, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileMessageContext.messageErrorDescription</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the messageErrorDescription
	 */
	public void setMessageErrorDescription(final String value)
	{
		_messageErrorDescription = getPersistenceContext().setValue(MESSAGEERRORDESCRIPTION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileMessageContext.normalizedPhoneNumber</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the normalizedPhoneNumber
	 */
	public void setNormalizedPhoneNumber(final String value)
	{
		_normalizedPhoneNumber = getPersistenceContext().setValue(NORMALIZEDPHONENUMBER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileMessageContext.normalizedShortcode</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the normalizedShortcode
	 */
	public void setNormalizedShortcode(final String value)
	{
		_normalizedShortcode = getPersistenceContext().setValue(NORMALIZEDSHORTCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileMessageContext.optOperator</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the optOperator
	 */
	public void setOptOperator(final String value)
	{
		_optOperator = getPersistenceContext().setValue(OPTOPERATOR, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileMessageContext.optSessionId</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the optSessionId
	 */
	public void setOptSessionId(final String value)
	{
		_optSessionId = getPersistenceContext().setValue(OPTSESSIONID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileMessageContext.optTariff</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the optTariff
	 */
	public void setOptTariff(final String value)
	{
		_optTariff = getPersistenceContext().setValue(OPTTARIFF, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileMessageContext.outgoingEngineId</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the outgoingEngineId
	 */
	public void setOutgoingEngineId(final String value)
	{
		_outgoingEngineId = getPersistenceContext().setValue(OUTGOINGENGINEID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileMessageContext.outgoingMessageId</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the outgoingMessageId
	 */
	public void setOutgoingMessageId(final String value)
	{
		_outgoingMessageId = getPersistenceContext().setValue(OUTGOINGMESSAGEID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileMessageContext.outgoingShortcode</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the outgoingShortcode
	 */
	public void setOutgoingShortcode(final MobileShortcodeModel value)
	{
		_outgoingShortcode = getPersistenceContext().setValue(OUTGOINGSHORTCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileMessageContext.outgoingSubject</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the outgoingSubject
	 */
	public void setOutgoingSubject(final String value)
	{
		_outgoingSubject = getPersistenceContext().setValue(OUTGOINGSUBJECT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileMessageContext.outgoingText</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the outgoingText
	 */
	public void setOutgoingText(final String value)
	{
		_outgoingText = getPersistenceContext().setValue(OUTGOINGTEXT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileMessageContext.phoneCountryIsoCode</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the phoneCountryIsoCode
	 */
	public void setPhoneCountryIsoCode(final String value)
	{
		_phoneCountryIsoCode = getPersistenceContext().setValue(PHONECOUNTRYISOCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileMessageContext.phoneNumber</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the phoneNumber
	 */
	public void setPhoneNumber(final String value)
	{
		_phoneNumber = getPersistenceContext().setValue(PHONENUMBER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileMessageContext.price</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the price
	 */
	public void setPrice(final BigDecimal value)
	{
		_price = getPersistenceContext().setValue(PRICE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileMessageContext.priceCurrency</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the priceCurrency
	 */
	public void setPriceCurrency(final CurrencyModel value)
	{
		_priceCurrency = getPersistenceContext().setValue(PRICECURRENCY, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>MobileMessageContext.rawMessageDetails</code> attribute defined at extension <code>mobileservices</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the rawMessageDetails
	 */
	public void setRawMessageDetails(final String value)
	{
		_rawMessageDetails = getPersistenceContext().setValue(RAWMESSAGEDETAILS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileMessageContext.revenue</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the revenue
	 */
	public void setRevenue(final BigDecimal value)
	{
		_revenue = getPersistenceContext().setValue(REVENUE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileMessageContext.revenueCurrency</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the revenueCurrency
	 */
	public void setRevenueCurrency(final CurrencyModel value)
	{
		_revenueCurrency = getPersistenceContext().setValue(REVENUECURRENCY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileMessageContext.shortcode</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the shortcode
	 */
	public void setShortcode(final String value)
	{
		_shortcode = getPersistenceContext().setValue(SHORTCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileMessageContext.status</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the status
	 */
	public void setStatus(final MobileMessageStatus value)
	{
		_status = getPersistenceContext().setValue(STATUS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileMessageContext.type</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the type
	 */
	public void setType(final MessageType value)
	{
		_type = getPersistenceContext().setValue(TYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileMessageContext.user</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the user
	 */
	public void setUser(final UserModel value)
	{
		_user = getPersistenceContext().setValue(USER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileMessageContext.usingDefaultAction</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the usingDefaultAction
	 */
	public void setUsingDefaultAction(final Boolean value)
	{
		_usingDefaultAction = getPersistenceContext().setValue(USINGDEFAULTACTION, value);
	}
	
}
