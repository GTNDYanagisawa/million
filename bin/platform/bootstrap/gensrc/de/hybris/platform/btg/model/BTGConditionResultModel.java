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
package de.hybris.platform.btg.model;

import de.hybris.platform.btg.enums.BTGResultScope;
import de.hybris.platform.btg.model.BTGAbstractResultModel;
import de.hybris.platform.btg.model.BTGConditionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type BTGConditionResult first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGConditionResultModel extends BTGAbstractResultModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGConditionResult";
	
	/**<i>Generated relation code constant for relation <code>BTGConditionBTGConditionResultRelation</code> defining source attribute <code>condition</code> in extension <code>btg</code>.</i>*/
	public final static String _BTGCONDITIONBTGCONDITIONRESULTRELATION = "BTGConditionBTGConditionResultRelation";
	
	/**<i>Generated relation code constant for relation <code>UserBTGConditionResultRelation</code> defining source attribute <code>user</code> in extension <code>btg</code>.</i>*/
	public final static String _USERBTGCONDITIONRESULTRELATION = "UserBTGConditionResultRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGConditionResult.condition</code> attribute defined at extension <code>btg</code>. */
	public static final String CONDITION = "condition";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGConditionResult.user</code> attribute defined at extension <code>btg</code>. */
	public static final String USER = "user";
	
	
	/** <i>Generated variable</i> - Variable of <code>BTGConditionResult.condition</code> attribute defined at extension <code>btg</code>. */
	private BTGConditionModel _condition;
	
	/** <i>Generated variable</i> - Variable of <code>BTGConditionResult.user</code> attribute defined at extension <code>btg</code>. */
	private UserModel _user;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGConditionResultModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGConditionResultModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _condition initial attribute declared by type <code>BTGConditionResult</code> at extension <code>btg</code>
	 * @param _resultScope initial attribute declared by type <code>BTGAbstractResult</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGConditionResultModel(final BTGConditionModel _condition, final BTGResultScope _resultScope)
	{
		super();
		setCondition(_condition);
		setResultScope(_resultScope);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _condition initial attribute declared by type <code>BTGConditionResult</code> at extension <code>btg</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _resultScope initial attribute declared by type <code>BTGAbstractResult</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGConditionResultModel(final BTGConditionModel _condition, final ItemModel _owner, final BTGResultScope _resultScope)
	{
		super();
		setCondition(_condition);
		setOwner(_owner);
		setResultScope(_resultScope);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGConditionResult.condition</code> attribute defined at extension <code>btg</code>. 
	 * @return the condition
	 */
	public BTGConditionModel getCondition()
	{
		if (this._condition!=null)
		{
			return _condition;
		}
		return _condition = getPersistenceContext().getValue(CONDITION, _condition);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGConditionResult.user</code> attribute defined at extension <code>btg</code>. 
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
	 * <i>Generated method</i> - Setter of <code>BTGConditionResult.condition</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the condition
	 */
	public void setCondition(final BTGConditionModel value)
	{
		_condition = getPersistenceContext().setValue(CONDITION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGConditionResult.user</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the user
	 */
	public void setUser(final UserModel value)
	{
		_user = getPersistenceContext().setValue(USER, value);
	}
	
}
