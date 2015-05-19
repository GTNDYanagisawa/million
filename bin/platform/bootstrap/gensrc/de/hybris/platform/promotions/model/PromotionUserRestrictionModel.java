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
package de.hybris.platform.promotions.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.security.PrincipalModel;
import de.hybris.platform.promotions.model.AbstractPromotionRestrictionModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type PromotionUserRestriction first defined at extension promotions.
 */
@SuppressWarnings("all")
public class PromotionUserRestrictionModel extends AbstractPromotionRestrictionModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PromotionUserRestriction";
	
	/** <i>Generated constant</i> - Attribute key of <code>PromotionUserRestriction.positive</code> attribute defined at extension <code>promotions</code>. */
	public static final String POSITIVE = "positive";
	
	/** <i>Generated constant</i> - Attribute key of <code>PromotionUserRestriction.users</code> attribute defined at extension <code>promotions</code>. */
	public static final String USERS = "users";
	
	
	/** <i>Generated variable</i> - Variable of <code>PromotionUserRestriction.positive</code> attribute defined at extension <code>promotions</code>. */
	private Boolean _positive;
	
	/** <i>Generated variable</i> - Variable of <code>PromotionUserRestriction.users</code> attribute defined at extension <code>promotions</code>. */
	private Collection<PrincipalModel> _users;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PromotionUserRestrictionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PromotionUserRestrictionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public PromotionUserRestrictionModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PromotionUserRestriction.positive</code> attribute defined at extension <code>promotions</code>. 
	 * @return the positive - Specifies if this restriction is a positive (true) or negative (false) one.
	 */
	public Boolean getPositive()
	{
		if (this._positive!=null)
		{
			return _positive;
		}
		return _positive = getPersistenceContext().getValue(POSITIVE, _positive);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PromotionUserRestriction.users</code> attribute defined at extension <code>promotions</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the users - The principals the promotion is not applied for
	 */
	public Collection<PrincipalModel> getUsers()
	{
		if (this._users!=null)
		{
			return _users;
		}
		return _users = getPersistenceContext().getValue(USERS, _users);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PromotionUserRestriction.positive</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the positive - Specifies if this restriction is a positive (true) or negative (false) one.
	 */
	public void setPositive(final Boolean value)
	{
		_positive = getPersistenceContext().setValue(POSITIVE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PromotionUserRestriction.users</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the users - The principals the promotion is not applied for
	 */
	public void setUsers(final Collection<PrincipalModel> value)
	{
		_users = getPersistenceContext().setValue(USERS, value);
	}
	
}
