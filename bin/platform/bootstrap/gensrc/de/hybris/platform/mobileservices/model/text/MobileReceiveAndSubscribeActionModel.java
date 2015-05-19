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
import de.hybris.platform.mobileservices.model.text.MobileReceiveGenericActionModel;
import de.hybris.platform.mobileservices.model.text.PhoneNumberListModel;
import de.hybris.platform.servicelayer.enums.ActionType;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type MobileReceiveAndSubscribeAction first defined at extension mobileservices.
 */
@SuppressWarnings("all")
public class MobileReceiveAndSubscribeActionModel extends MobileReceiveGenericActionModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "MobileReceiveAndSubscribeAction";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileReceiveAndSubscribeAction.remove</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String REMOVE = "remove";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileReceiveAndSubscribeAction.list</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String LIST = "list";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileReceiveAndSubscribeAction.successMessage</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String SUCCESSMESSAGE = "successMessage";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileReceiveAndSubscribeAction.defaultErrorMessage</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String DEFAULTERRORMESSAGE = "defaultErrorMessage";
	
	
	/** <i>Generated variable</i> - Variable of <code>MobileReceiveAndSubscribeAction.remove</code> attribute defined at extension <code>mobileservices</code>. */
	private Boolean _remove;
	
	/** <i>Generated variable</i> - Variable of <code>MobileReceiveAndSubscribeAction.list</code> attribute defined at extension <code>mobileservices</code>. */
	private PhoneNumberListModel _list;
	
	/** <i>Generated variable</i> - Variable of <code>MobileReceiveAndSubscribeAction.successMessage</code> attribute defined at extension <code>mobileservices</code>. */
	private String _successMessage;
	
	/** <i>Generated variable</i> - Variable of <code>MobileReceiveAndSubscribeAction.defaultErrorMessage</code> attribute defined at extension <code>mobileservices</code>. */
	private String _defaultErrorMessage;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public MobileReceiveAndSubscribeActionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public MobileReceiveAndSubscribeActionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>MobileReceiveGenericAction</code> at extension <code>mobileservices</code>
	 * @param _list initial attribute declared by type <code>MobileReceiveAndSubscribeAction</code> at extension <code>mobileservices</code>
	 * @param _successMessage initial attribute declared by type <code>MobileReceiveAndSubscribeAction</code> at extension <code>mobileservices</code>
	 * @param _target initial attribute declared by type <code>MobileReceiveAndSubscribeAction</code> at extension <code>mobileservices</code>
	 * @param _type initial attribute declared by type <code>MobileReceiveGenericAction</code> at extension <code>mobileservices</code>
	 */
	@Deprecated
	public MobileReceiveAndSubscribeActionModel(final String _code, final PhoneNumberListModel _list, final String _successMessage, final String _target, final ActionType _type)
	{
		super();
		setCode(_code);
		setList(_list);
		setSuccessMessage(_successMessage);
		setTarget(_target);
		setType(_type);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>MobileReceiveGenericAction</code> at extension <code>mobileservices</code>
	 * @param _list initial attribute declared by type <code>MobileReceiveAndSubscribeAction</code> at extension <code>mobileservices</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _successMessage initial attribute declared by type <code>MobileReceiveAndSubscribeAction</code> at extension <code>mobileservices</code>
	 * @param _target initial attribute declared by type <code>MobileReceiveAndSubscribeAction</code> at extension <code>mobileservices</code>
	 * @param _type initial attribute declared by type <code>MobileReceiveGenericAction</code> at extension <code>mobileservices</code>
	 */
	@Deprecated
	public MobileReceiveAndSubscribeActionModel(final String _code, final PhoneNumberListModel _list, final ItemModel _owner, final String _successMessage, final String _target, final ActionType _type)
	{
		super();
		setCode(_code);
		setList(_list);
		setOwner(_owner);
		setSuccessMessage(_successMessage);
		setTarget(_target);
		setType(_type);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileReceiveAndSubscribeAction.defaultErrorMessage</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the defaultErrorMessage
	 */
	public String getDefaultErrorMessage()
	{
		if (this._defaultErrorMessage!=null)
		{
			return _defaultErrorMessage;
		}
		return _defaultErrorMessage = getPersistenceContext().getValue(DEFAULTERRORMESSAGE, _defaultErrorMessage);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileReceiveAndSubscribeAction.list</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the list
	 */
	public PhoneNumberListModel getList()
	{
		if (this._list!=null)
		{
			return _list;
		}
		return _list = getPersistenceContext().getValue(LIST, _list);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileReceiveAndSubscribeAction.remove</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the remove
	 */
	public Boolean getRemove()
	{
		if (this._remove!=null)
		{
			return _remove;
		}
		return _remove = getPersistenceContext().getValue(REMOVE, _remove);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileReceiveAndSubscribeAction.successMessage</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the successMessage
	 */
	public String getSuccessMessage()
	{
		if (this._successMessage!=null)
		{
			return _successMessage;
		}
		return _successMessage = getPersistenceContext().getValue(SUCCESSMESSAGE, _successMessage);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileReceiveAndSubscribeAction.defaultErrorMessage</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the defaultErrorMessage
	 */
	public void setDefaultErrorMessage(final String value)
	{
		_defaultErrorMessage = getPersistenceContext().setValue(DEFAULTERRORMESSAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileReceiveAndSubscribeAction.list</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the list
	 */
	public void setList(final PhoneNumberListModel value)
	{
		_list = getPersistenceContext().setValue(LIST, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileReceiveAndSubscribeAction.remove</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the remove
	 */
	public void setRemove(final Boolean value)
	{
		_remove = getPersistenceContext().setValue(REMOVE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileReceiveAndSubscribeAction.successMessage</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the successMessage
	 */
	public void setSuccessMessage(final String value)
	{
		_successMessage = getPersistenceContext().setValue(SUCCESSMESSAGE, value);
	}
	
}
