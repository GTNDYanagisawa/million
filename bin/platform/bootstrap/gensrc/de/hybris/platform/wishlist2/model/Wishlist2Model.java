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
package de.hybris.platform.wishlist2.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.wishlist2.model.Wishlist2EntryModel;
import java.util.List;

/**
 * Generated model class for type Wishlist2 first defined at extension wishlist.
 */
@SuppressWarnings("all")
public class Wishlist2Model extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "Wishlist2";
	
	/**<i>Generated relation code constant for relation <code>User2Wishlist2</code> defining source attribute <code>user</code> in extension <code>wishlist</code>.</i>*/
	public final static String _USER2WISHLIST2 = "User2Wishlist2";
	
	/** <i>Generated constant</i> - Attribute key of <code>Wishlist2.name</code> attribute defined at extension <code>wishlist</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>Wishlist2.description</code> attribute defined at extension <code>wishlist</code>. */
	public static final String DESCRIPTION = "description";
	
	/** <i>Generated constant</i> - Attribute key of <code>Wishlist2.default</code> attribute defined at extension <code>wishlist</code>. */
	public static final String DEFAULT = "default";
	
	/** <i>Generated constant</i> - Attribute key of <code>Wishlist2.user</code> attribute defined at extension <code>wishlist</code>. */
	public static final String USER = "user";
	
	/** <i>Generated constant</i> - Attribute key of <code>Wishlist2.entries</code> attribute defined at extension <code>wishlist</code>. */
	public static final String ENTRIES = "entries";
	
	
	/** <i>Generated variable</i> - Variable of <code>Wishlist2.name</code> attribute defined at extension <code>wishlist</code>. */
	private String _name;
	
	/** <i>Generated variable</i> - Variable of <code>Wishlist2.description</code> attribute defined at extension <code>wishlist</code>. */
	private String _description;
	
	/** <i>Generated variable</i> - Variable of <code>Wishlist2.default</code> attribute defined at extension <code>wishlist</code>. */
	private Boolean _default;
	
	/** <i>Generated variable</i> - Variable of <code>Wishlist2.user</code> attribute defined at extension <code>wishlist</code>. */
	private UserModel _user;
	
	/** <i>Generated variable</i> - Variable of <code>Wishlist2.entries</code> attribute defined at extension <code>wishlist</code>. */
	private List<Wishlist2EntryModel> _entries;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public Wishlist2Model()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public Wishlist2Model(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _name initial attribute declared by type <code>Wishlist2</code> at extension <code>wishlist</code>
	 */
	@Deprecated
	public Wishlist2Model(final String _name)
	{
		super();
		setName(_name);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _name initial attribute declared by type <code>Wishlist2</code> at extension <code>wishlist</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public Wishlist2Model(final String _name, final ItemModel _owner)
	{
		super();
		setName(_name);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Wishlist2.default</code> attribute defined at extension <code>wishlist</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Wishlist2.description</code> attribute defined at extension <code>wishlist</code>. 
	 * @return the description
	 */
	public String getDescription()
	{
		if (this._description!=null)
		{
			return _description;
		}
		return _description = getPersistenceContext().getValue(DESCRIPTION, _description);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Wishlist2.entries</code> attribute defined at extension <code>wishlist</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the entries
	 */
	public List<Wishlist2EntryModel> getEntries()
	{
		if (this._entries!=null)
		{
			return _entries;
		}
		return _entries = getPersistenceContext().getValue(ENTRIES, _entries);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Wishlist2.name</code> attribute defined at extension <code>wishlist</code>. 
	 * @return the name
	 */
	public String getName()
	{
		if (this._name!=null)
		{
			return _name;
		}
		return _name = getPersistenceContext().getValue(NAME, _name);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Wishlist2.user</code> attribute defined at extension <code>wishlist</code>. 
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
	 * <i>Generated method</i> - Setter of <code>Wishlist2.default</code> attribute defined at extension <code>wishlist</code>. 
	 *  
	 * @param value the default
	 */
	public void setDefault(final Boolean value)
	{
		_default = getPersistenceContext().setValue(DEFAULT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Wishlist2.description</code> attribute defined at extension <code>wishlist</code>. 
	 *  
	 * @param value the description
	 */
	public void setDescription(final String value)
	{
		_description = getPersistenceContext().setValue(DESCRIPTION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Wishlist2.entries</code> attribute defined at extension <code>wishlist</code>. 
	 *  
	 * @param value the entries
	 */
	public void setEntries(final List<Wishlist2EntryModel> value)
	{
		_entries = getPersistenceContext().setValue(ENTRIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Wishlist2.name</code> attribute defined at extension <code>wishlist</code>. 
	 *  
	 * @param value the name
	 */
	public void setName(final String value)
	{
		_name = getPersistenceContext().setValue(NAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Wishlist2.user</code> attribute defined at extension <code>wishlist</code>. 
	 *  
	 * @param value the user
	 */
	public void setUser(final UserModel value)
	{
		_user = getPersistenceContext().setValue(USER, value);
	}
	
}
