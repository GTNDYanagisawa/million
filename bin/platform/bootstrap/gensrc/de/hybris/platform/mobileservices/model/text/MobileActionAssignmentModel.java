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
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.mobileservices.enums.MobileActionAssignmentStateType;
import de.hybris.platform.mobileservices.model.text.MobileActionKeywordModel;
import de.hybris.platform.mobileservices.model.text.MobileReceiveGenericActionModel;
import de.hybris.platform.mobileservices.model.text.MobileShortcodeModel;
import de.hybris.platform.mobileservices.model.text.PhoneNumberListModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Date;

/**
 * Generated model class for type MobileActionAssignment first defined at extension mobileservices.
 */
@SuppressWarnings("all")
public class MobileActionAssignmentModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "MobileActionAssignment";
	
	/**<i>Generated relation code constant for relation <code>ShortcodesActionAssignmentsRelation</code> defining source attribute <code>shortcode</code> in extension <code>mobileservices</code>.</i>*/
	public final static String _SHORTCODESACTIONASSIGNMENTSRELATION = "ShortcodesActionAssignmentsRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileActionAssignment.action</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String ACTION = "action";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileActionAssignment.keyword</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String KEYWORD = "keyword";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileActionAssignment.state</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String STATE = "state";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileActionAssignment.language</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String LANGUAGE = "language";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileActionAssignment.startDate</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String STARTDATE = "startDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileActionAssignment.endDate</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String ENDDATE = "endDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileActionAssignment.shortcode</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String SHORTCODE = "shortcode";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileActionAssignment.phoneNumberFilters</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String PHONENUMBERFILTERS = "phoneNumberFilters";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileActionAssignment.testingPhoneNumbers</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String TESTINGPHONENUMBERS = "testingPhoneNumbers";
	
	
	/** <i>Generated variable</i> - Variable of <code>MobileActionAssignment.action</code> attribute defined at extension <code>mobileservices</code>. */
	private MobileReceiveGenericActionModel _action;
	
	/** <i>Generated variable</i> - Variable of <code>MobileActionAssignment.keyword</code> attribute defined at extension <code>mobileservices</code>. */
	private MobileActionKeywordModel _keyword;
	
	/** <i>Generated variable</i> - Variable of <code>MobileActionAssignment.state</code> attribute defined at extension <code>mobileservices</code>. */
	private MobileActionAssignmentStateType _state;
	
	/** <i>Generated variable</i> - Variable of <code>MobileActionAssignment.language</code> attribute defined at extension <code>mobileservices</code>. */
	private LanguageModel _language;
	
	/** <i>Generated variable</i> - Variable of <code>MobileActionAssignment.startDate</code> attribute defined at extension <code>mobileservices</code>. */
	private Date _startDate;
	
	/** <i>Generated variable</i> - Variable of <code>MobileActionAssignment.endDate</code> attribute defined at extension <code>mobileservices</code>. */
	private Date _endDate;
	
	/** <i>Generated variable</i> - Variable of <code>MobileActionAssignment.shortcode</code> attribute defined at extension <code>mobileservices</code>. */
	private MobileShortcodeModel _shortcode;
	
	/** <i>Generated variable</i> - Variable of <code>MobileActionAssignment.phoneNumberFilters</code> attribute defined at extension <code>mobileservices</code>. */
	private Collection<PhoneNumberListModel> _phoneNumberFilters;
	
	/** <i>Generated variable</i> - Variable of <code>MobileActionAssignment.testingPhoneNumbers</code> attribute defined at extension <code>mobileservices</code>. */
	private Collection<PhoneNumberListModel> _testingPhoneNumbers;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public MobileActionAssignmentModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public MobileActionAssignmentModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _action initial attribute declared by type <code>MobileActionAssignment</code> at extension <code>mobileservices</code>
	 * @param _keyword initial attribute declared by type <code>MobileActionAssignment</code> at extension <code>mobileservices</code>
	 * @param _shortcode initial attribute declared by type <code>MobileActionAssignment</code> at extension <code>mobileservices</code>
	 */
	@Deprecated
	public MobileActionAssignmentModel(final MobileReceiveGenericActionModel _action, final MobileActionKeywordModel _keyword, final MobileShortcodeModel _shortcode)
	{
		super();
		setAction(_action);
		setKeyword(_keyword);
		setShortcode(_shortcode);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _action initial attribute declared by type <code>MobileActionAssignment</code> at extension <code>mobileservices</code>
	 * @param _keyword initial attribute declared by type <code>MobileActionAssignment</code> at extension <code>mobileservices</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _shortcode initial attribute declared by type <code>MobileActionAssignment</code> at extension <code>mobileservices</code>
	 */
	@Deprecated
	public MobileActionAssignmentModel(final MobileReceiveGenericActionModel _action, final MobileActionKeywordModel _keyword, final ItemModel _owner, final MobileShortcodeModel _shortcode)
	{
		super();
		setAction(_action);
		setKeyword(_keyword);
		setOwner(_owner);
		setShortcode(_shortcode);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileActionAssignment.action</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the action
	 */
	public MobileReceiveGenericActionModel getAction()
	{
		if (this._action!=null)
		{
			return _action;
		}
		return _action = getPersistenceContext().getValue(ACTION, _action);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileActionAssignment.endDate</code> attribute defined at extension <code>mobileservices</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>MobileActionAssignment.keyword</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the keyword
	 */
	public MobileActionKeywordModel getKeyword()
	{
		if (this._keyword!=null)
		{
			return _keyword;
		}
		return _keyword = getPersistenceContext().getValue(KEYWORD, _keyword);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileActionAssignment.language</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the language
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
	 * <i>Generated method</i> - Getter of the <code>MobileActionAssignment.phoneNumberFilters</code> attribute defined at extension <code>mobileservices</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>MobileActionAssignment.shortcode</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the shortcode
	 */
	public MobileShortcodeModel getShortcode()
	{
		if (this._shortcode!=null)
		{
			return _shortcode;
		}
		return _shortcode = getPersistenceContext().getValue(SHORTCODE, _shortcode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileActionAssignment.startDate</code> attribute defined at extension <code>mobileservices</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>MobileActionAssignment.state</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the state
	 */
	public MobileActionAssignmentStateType getState()
	{
		if (this._state!=null)
		{
			return _state;
		}
		return _state = getPersistenceContext().getValue(STATE, _state);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileActionAssignment.testingPhoneNumbers</code> attribute defined at extension <code>mobileservices</code>. 
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
	 * <i>Generated method</i> - Setter of <code>MobileActionAssignment.action</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the action
	 */
	public void setAction(final MobileReceiveGenericActionModel value)
	{
		_action = getPersistenceContext().setValue(ACTION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileActionAssignment.endDate</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the endDate
	 */
	public void setEndDate(final Date value)
	{
		_endDate = getPersistenceContext().setValue(ENDDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileActionAssignment.keyword</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the keyword
	 */
	public void setKeyword(final MobileActionKeywordModel value)
	{
		_keyword = getPersistenceContext().setValue(KEYWORD, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileActionAssignment.language</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the language
	 */
	public void setLanguage(final LanguageModel value)
	{
		_language = getPersistenceContext().setValue(LANGUAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileActionAssignment.phoneNumberFilters</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the phoneNumberFilters
	 */
	public void setPhoneNumberFilters(final Collection<PhoneNumberListModel> value)
	{
		_phoneNumberFilters = getPersistenceContext().setValue(PHONENUMBERFILTERS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileActionAssignment.shortcode</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the shortcode
	 */
	public void setShortcode(final MobileShortcodeModel value)
	{
		_shortcode = getPersistenceContext().setValue(SHORTCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileActionAssignment.startDate</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the startDate
	 */
	public void setStartDate(final Date value)
	{
		_startDate = getPersistenceContext().setValue(STARTDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileActionAssignment.state</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the state
	 */
	public void setState(final MobileActionAssignmentStateType value)
	{
		_state = getPersistenceContext().setValue(STATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileActionAssignment.testingPhoneNumbers</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the testingPhoneNumbers
	 */
	public void setTestingPhoneNumbers(final Collection<PhoneNumberListModel> value)
	{
		_testingPhoneNumbers = getPersistenceContext().setValue(TESTINGPHONENUMBERS, value);
	}
	
}
