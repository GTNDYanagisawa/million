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
import de.hybris.platform.mobileservices.model.text.AbstractMobileSendActionModel;
import de.hybris.platform.mobileservices.model.text.MobileActionAssignmentModel;
import de.hybris.platform.mobileservices.model.text.MobileShortcodeModel;
import de.hybris.platform.mobileservices.model.text.PhoneNumberModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Locale;

/**
 * Generated model class for type PhoneNumberList first defined at extension mobileservices.
 */
@SuppressWarnings("all")
public class PhoneNumberListModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PhoneNumberList";
	
	/**<i>Generated relation code constant for relation <code>ShortcodeListRelation</code> defining source attribute <code>blockedShortcodes</code> in extension <code>mobileservices</code>.</i>*/
	public final static String _SHORTCODELISTRELATION = "ShortcodeListRelation";
	
	/**<i>Generated relation code constant for relation <code>ShortcodeTestListRelation</code> defining source attribute <code>testingShortcodes</code> in extension <code>mobileservices</code>.</i>*/
	public final static String _SHORTCODETESTLISTRELATION = "ShortcodeTestListRelation";
	
	/**<i>Generated relation code constant for relation <code>AssignmentListRelation</code> defining source attribute <code>blockedAssignments</code> in extension <code>mobileservices</code>.</i>*/
	public final static String _ASSIGNMENTLISTRELATION = "AssignmentListRelation";
	
	/**<i>Generated relation code constant for relation <code>AssignmentTestListRelation</code> defining source attribute <code>testingAssignments</code> in extension <code>mobileservices</code>.</i>*/
	public final static String _ASSIGNMENTTESTLISTRELATION = "AssignmentTestListRelation";
	
	/**<i>Generated relation code constant for relation <code>SendActionsPhoneListRelation</code> defining source attribute <code>sendingActions</code> in extension <code>mobileservices</code>.</i>*/
	public final static String _SENDACTIONSPHONELISTRELATION = "SendActionsPhoneListRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>PhoneNumberList.code</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>PhoneNumberList.name</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>PhoneNumberList.memberSize</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String MEMBERSIZE = "memberSize";
	
	/** <i>Generated constant</i> - Attribute key of <code>PhoneNumberList.numbers</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String NUMBERS = "numbers";
	
	/** <i>Generated constant</i> - Attribute key of <code>PhoneNumberList.blockedShortcodes</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String BLOCKEDSHORTCODES = "blockedShortcodes";
	
	/** <i>Generated constant</i> - Attribute key of <code>PhoneNumberList.testingShortcodes</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String TESTINGSHORTCODES = "testingShortcodes";
	
	/** <i>Generated constant</i> - Attribute key of <code>PhoneNumberList.blockedAssignments</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String BLOCKEDASSIGNMENTS = "blockedAssignments";
	
	/** <i>Generated constant</i> - Attribute key of <code>PhoneNumberList.testingAssignments</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String TESTINGASSIGNMENTS = "testingAssignments";
	
	/** <i>Generated constant</i> - Attribute key of <code>PhoneNumberList.sendingActions</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String SENDINGACTIONS = "sendingActions";
	
	
	/** <i>Generated variable</i> - Variable of <code>PhoneNumberList.code</code> attribute defined at extension <code>mobileservices</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>PhoneNumberList.memberSize</code> attribute defined at extension <code>mobileservices</code>. */
	private Integer _memberSize;
	
	/** <i>Generated variable</i> - Variable of <code>PhoneNumberList.numbers</code> attribute defined at extension <code>mobileservices</code>. */
	private Collection<PhoneNumberModel> _numbers;
	
	/** <i>Generated variable</i> - Variable of <code>PhoneNumberList.blockedShortcodes</code> attribute defined at extension <code>mobileservices</code>. */
	private Collection<MobileShortcodeModel> _blockedShortcodes;
	
	/** <i>Generated variable</i> - Variable of <code>PhoneNumberList.testingShortcodes</code> attribute defined at extension <code>mobileservices</code>. */
	private Collection<MobileShortcodeModel> _testingShortcodes;
	
	/** <i>Generated variable</i> - Variable of <code>PhoneNumberList.blockedAssignments</code> attribute defined at extension <code>mobileservices</code>. */
	private Collection<MobileActionAssignmentModel> _blockedAssignments;
	
	/** <i>Generated variable</i> - Variable of <code>PhoneNumberList.testingAssignments</code> attribute defined at extension <code>mobileservices</code>. */
	private Collection<MobileActionAssignmentModel> _testingAssignments;
	
	/** <i>Generated variable</i> - Variable of <code>PhoneNumberList.sendingActions</code> attribute defined at extension <code>mobileservices</code>. */
	private Collection<AbstractMobileSendActionModel> _sendingActions;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PhoneNumberListModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PhoneNumberListModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>PhoneNumberList</code> at extension <code>mobileservices</code>
	 */
	@Deprecated
	public PhoneNumberListModel(final String _code)
	{
		super();
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>PhoneNumberList</code> at extension <code>mobileservices</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public PhoneNumberListModel(final String _code, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PhoneNumberList.blockedAssignments</code> attribute defined at extension <code>mobileservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the blockedAssignments
	 */
	public Collection<MobileActionAssignmentModel> getBlockedAssignments()
	{
		if (this._blockedAssignments!=null)
		{
			return _blockedAssignments;
		}
		return _blockedAssignments = getPersistenceContext().getValue(BLOCKEDASSIGNMENTS, _blockedAssignments);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PhoneNumberList.blockedShortcodes</code> attribute defined at extension <code>mobileservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the blockedShortcodes
	 */
	public Collection<MobileShortcodeModel> getBlockedShortcodes()
	{
		if (this._blockedShortcodes!=null)
		{
			return _blockedShortcodes;
		}
		return _blockedShortcodes = getPersistenceContext().getValue(BLOCKEDSHORTCODES, _blockedShortcodes);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PhoneNumberList.code</code> attribute defined at extension <code>mobileservices</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>PhoneNumberList.memberSize</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the memberSize
	 */
	public Integer getMemberSize()
	{
		if (this._memberSize!=null)
		{
			return _memberSize;
		}
		return _memberSize = getPersistenceContext().getValue(MEMBERSIZE, _memberSize);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PhoneNumberList.name</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the name
	 */
	public String getName()
	{
		return getName(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>PhoneNumberList.name</code> attribute defined at extension <code>mobileservices</code>. 
	 * @param loc the value localization key 
	 * @return the name
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getName(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(NAME, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PhoneNumberList.numbers</code> attribute defined at extension <code>mobileservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the numbers
	 */
	public Collection<PhoneNumberModel> getNumbers()
	{
		if (this._numbers!=null)
		{
			return _numbers;
		}
		return _numbers = getPersistenceContext().getValue(NUMBERS, _numbers);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PhoneNumberList.sendingActions</code> attribute defined at extension <code>mobileservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the sendingActions
	 */
	public Collection<AbstractMobileSendActionModel> getSendingActions()
	{
		if (this._sendingActions!=null)
		{
			return _sendingActions;
		}
		return _sendingActions = getPersistenceContext().getValue(SENDINGACTIONS, _sendingActions);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PhoneNumberList.testingAssignments</code> attribute defined at extension <code>mobileservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the testingAssignments
	 */
	public Collection<MobileActionAssignmentModel> getTestingAssignments()
	{
		if (this._testingAssignments!=null)
		{
			return _testingAssignments;
		}
		return _testingAssignments = getPersistenceContext().getValue(TESTINGASSIGNMENTS, _testingAssignments);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PhoneNumberList.testingShortcodes</code> attribute defined at extension <code>mobileservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the testingShortcodes
	 */
	public Collection<MobileShortcodeModel> getTestingShortcodes()
	{
		if (this._testingShortcodes!=null)
		{
			return _testingShortcodes;
		}
		return _testingShortcodes = getPersistenceContext().getValue(TESTINGSHORTCODES, _testingShortcodes);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PhoneNumberList.blockedAssignments</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the blockedAssignments
	 */
	public void setBlockedAssignments(final Collection<MobileActionAssignmentModel> value)
	{
		_blockedAssignments = getPersistenceContext().setValue(BLOCKEDASSIGNMENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PhoneNumberList.blockedShortcodes</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the blockedShortcodes
	 */
	public void setBlockedShortcodes(final Collection<MobileShortcodeModel> value)
	{
		_blockedShortcodes = getPersistenceContext().setValue(BLOCKEDSHORTCODES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PhoneNumberList.code</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PhoneNumberList.name</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>PhoneNumberList.name</code> attribute defined at extension <code>mobileservices</code>. 
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
	 * <i>Generated method</i> - Setter of <code>PhoneNumberList.numbers</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the numbers
	 */
	public void setNumbers(final Collection<PhoneNumberModel> value)
	{
		_numbers = getPersistenceContext().setValue(NUMBERS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PhoneNumberList.sendingActions</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the sendingActions
	 */
	public void setSendingActions(final Collection<AbstractMobileSendActionModel> value)
	{
		_sendingActions = getPersistenceContext().setValue(SENDINGACTIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PhoneNumberList.testingAssignments</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the testingAssignments
	 */
	public void setTestingAssignments(final Collection<MobileActionAssignmentModel> value)
	{
		_testingAssignments = getPersistenceContext().setValue(TESTINGASSIGNMENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PhoneNumberList.testingShortcodes</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the testingShortcodes
	 */
	public void setTestingShortcodes(final Collection<MobileShortcodeModel> value)
	{
		_testingShortcodes = getPersistenceContext().setValue(TESTINGSHORTCODES, value);
	}
	
}
