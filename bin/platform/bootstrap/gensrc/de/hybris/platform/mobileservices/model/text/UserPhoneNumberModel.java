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
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.mobileservices.enums.PhoneType;
import de.hybris.platform.mobileservices.model.text.PhoneNumberModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type UserPhoneNumber first defined at extension mobileservices.
 */
@SuppressWarnings("all")
public class UserPhoneNumberModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "UserPhoneNumber";
	
	/**<i>Generated relation code constant for relation <code>UserPhoneNumberRelation</code> defining source attribute <code>user</code> in extension <code>mobileservices</code>.</i>*/
	public final static String _USERPHONENUMBERRELATION = "UserPhoneNumberRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>UserPhoneNumber.type</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String TYPE = "type";
	
	/** <i>Generated constant</i> - Attribute key of <code>UserPhoneNumber.phoneNumber</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String PHONENUMBER = "phoneNumber";
	
	/** <i>Generated constant</i> - Attribute key of <code>UserPhoneNumber.default</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String DEFAULT = "default";
	
	/** <i>Generated constant</i> - Attribute key of <code>UserPhoneNumber.user</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String USER = "user";
	
	
	/** <i>Generated variable</i> - Variable of <code>UserPhoneNumber.type</code> attribute defined at extension <code>mobileservices</code>. */
	private PhoneType _type;
	
	/** <i>Generated variable</i> - Variable of <code>UserPhoneNumber.phoneNumber</code> attribute defined at extension <code>mobileservices</code>. */
	private PhoneNumberModel _phoneNumber;
	
	/** <i>Generated variable</i> - Variable of <code>UserPhoneNumber.default</code> attribute defined at extension <code>mobileservices</code>. */
	private Boolean _default;
	
	/** <i>Generated variable</i> - Variable of <code>UserPhoneNumber.user</code> attribute defined at extension <code>mobileservices</code>. */
	private UserModel _user;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public UserPhoneNumberModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public UserPhoneNumberModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _phoneNumber initial attribute declared by type <code>UserPhoneNumber</code> at extension <code>mobileservices</code>
	 */
	@Deprecated
	public UserPhoneNumberModel(final PhoneNumberModel _phoneNumber)
	{
		super();
		setPhoneNumber(_phoneNumber);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _phoneNumber initial attribute declared by type <code>UserPhoneNumber</code> at extension <code>mobileservices</code>
	 */
	@Deprecated
	public UserPhoneNumberModel(final ItemModel _owner, final PhoneNumberModel _phoneNumber)
	{
		super();
		setOwner(_owner);
		setPhoneNumber(_phoneNumber);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserPhoneNumber.default</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the default
	 */
	public Boolean getDefault()
	{
		if (this._default!=null)
		{
			return _default;
		}
		return _default = getPersistenceContext().getValue(DEFAULT, _default);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserPhoneNumber.phoneNumber</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the phoneNumber
	 */
	public PhoneNumberModel getPhoneNumber()
	{
		if (this._phoneNumber!=null)
		{
			return _phoneNumber;
		}
		return _phoneNumber = getPersistenceContext().getValue(PHONENUMBER, _phoneNumber);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserPhoneNumber.type</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the type
	 */
	public PhoneType getType()
	{
		if (this._type!=null)
		{
			return _type;
		}
		return _type = getPersistenceContext().getValue(TYPE, _type);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserPhoneNumber.user</code> attribute defined at extension <code>mobileservices</code>. 
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
	 * <i>Generated method</i> - Setter of <code>UserPhoneNumber.default</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the default
	 */
	public void setDefault(final Boolean value)
	{
		_default = getPersistenceContext().setValue(DEFAULT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>UserPhoneNumber.phoneNumber</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the phoneNumber
	 */
	public void setPhoneNumber(final PhoneNumberModel value)
	{
		_phoneNumber = getPersistenceContext().setValue(PHONENUMBER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>UserPhoneNumber.type</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the type
	 */
	public void setType(final PhoneType value)
	{
		_type = getPersistenceContext().setValue(TYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>UserPhoneNumber.user</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the user
	 */
	public void setUser(final UserModel value)
	{
		_user = getPersistenceContext().setValue(USER, value);
	}
	
}
