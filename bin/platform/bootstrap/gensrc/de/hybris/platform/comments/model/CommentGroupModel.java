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
package de.hybris.platform.comments.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Date;
import java.util.Locale;

/**
 * Generated model class for type CommentGroup first defined at extension print.
 */
@SuppressWarnings("all")
public class CommentGroupModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CommentGroup";
	
	/** <i>Generated constant</i> - Attribute key of <code>CommentGroup.code</code> attribute defined at extension <code>print</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>CommentGroup.date</code> attribute defined at extension <code>print</code>. */
	public static final String DATE = "date";
	
	/** <i>Generated constant</i> - Attribute key of <code>CommentGroup.name</code> attribute defined at extension <code>print</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>CommentGroup.item</code> attribute defined at extension <code>print</code>. */
	public static final String ITEM = "item";
	
	/** <i>Generated constant</i> - Attribute key of <code>CommentGroup.user</code> attribute defined at extension <code>print</code>. */
	public static final String USER = "user";
	
	
	/** <i>Generated variable</i> - Variable of <code>CommentGroup.code</code> attribute defined at extension <code>print</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>CommentGroup.date</code> attribute defined at extension <code>print</code>. */
	private Date _date;
	
	/** <i>Generated variable</i> - Variable of <code>CommentGroup.item</code> attribute defined at extension <code>print</code>. */
	private ItemModel _item;
	
	/** <i>Generated variable</i> - Variable of <code>CommentGroup.user</code> attribute defined at extension <code>print</code>. */
	private UserModel _user;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CommentGroupModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CommentGroupModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>CommentGroup</code> at extension <code>print</code>
	 */
	@Deprecated
	public CommentGroupModel(final String _code)
	{
		super();
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>CommentGroup</code> at extension <code>print</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public CommentGroupModel(final String _code, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommentGroup.code</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>CommentGroup.date</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>CommentGroup.item</code> attribute defined at extension <code>print</code>. 
	 * @return the item
	 */
	public ItemModel getItem()
	{
		if (this._item!=null)
		{
			return _item;
		}
		return _item = getPersistenceContext().getValue(ITEM, _item);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommentGroup.name</code> attribute defined at extension <code>print</code>. 
	 * @return the name
	 */
	public String getName()
	{
		return getName(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>CommentGroup.name</code> attribute defined at extension <code>print</code>. 
	 * @param loc the value localization key 
	 * @return the name
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getName(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(NAME, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommentGroup.user</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Setter of <code>CommentGroup.code</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CommentGroup.date</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the date
	 */
	public void setDate(final Date value)
	{
		_date = getPersistenceContext().setValue(DATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CommentGroup.item</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the item
	 */
	public void setItem(final ItemModel value)
	{
		_item = getPersistenceContext().setValue(ITEM, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CommentGroup.name</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>CommentGroup.name</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Setter of <code>CommentGroup.user</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the user
	 */
	public void setUser(final UserModel value)
	{
		_user = getPersistenceContext().setValue(USER, value);
	}
	
}
