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
import de.hybris.platform.btg.model.BTGRuleModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type BTGRuleResult first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGRuleResultModel extends BTGAbstractResultModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGRuleResult";
	
	/**<i>Generated relation code constant for relation <code>BTGRuleBTGRuleResultRelation</code> defining source attribute <code>rule</code> in extension <code>btg</code>.</i>*/
	public final static String _BTGRULEBTGRULERESULTRELATION = "BTGRuleBTGRuleResultRelation";
	
	/**<i>Generated relation code constant for relation <code>UserBTGRuleResultRelation</code> defining source attribute <code>user</code> in extension <code>btg</code>.</i>*/
	public final static String _USERBTGRULERESULTRELATION = "UserBTGRuleResultRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGRuleResult.rule</code> attribute defined at extension <code>btg</code>. */
	public static final String RULE = "rule";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGRuleResult.user</code> attribute defined at extension <code>btg</code>. */
	public static final String USER = "user";
	
	
	/** <i>Generated variable</i> - Variable of <code>BTGRuleResult.rule</code> attribute defined at extension <code>btg</code>. */
	private BTGRuleModel _rule;
	
	/** <i>Generated variable</i> - Variable of <code>BTGRuleResult.user</code> attribute defined at extension <code>btg</code>. */
	private UserModel _user;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGRuleResultModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGRuleResultModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _resultScope initial attribute declared by type <code>BTGAbstractResult</code> at extension <code>btg</code>
	 * @param _rule initial attribute declared by type <code>BTGRuleResult</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGRuleResultModel(final BTGResultScope _resultScope, final BTGRuleModel _rule)
	{
		super();
		setResultScope(_resultScope);
		setRule(_rule);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _resultScope initial attribute declared by type <code>BTGAbstractResult</code> at extension <code>btg</code>
	 * @param _rule initial attribute declared by type <code>BTGRuleResult</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGRuleResultModel(final ItemModel _owner, final BTGResultScope _resultScope, final BTGRuleModel _rule)
	{
		super();
		setOwner(_owner);
		setResultScope(_resultScope);
		setRule(_rule);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGRuleResult.rule</code> attribute defined at extension <code>btg</code>. 
	 * @return the rule
	 */
	public BTGRuleModel getRule()
	{
		if (this._rule!=null)
		{
			return _rule;
		}
		return _rule = getPersistenceContext().getValue(RULE, _rule);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGRuleResult.user</code> attribute defined at extension <code>btg</code>. 
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
	 * <i>Generated method</i> - Setter of <code>BTGRuleResult.rule</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the rule
	 */
	public void setRule(final BTGRuleModel value)
	{
		_rule = getPersistenceContext().setValue(RULE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGRuleResult.user</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the user
	 */
	public void setUser(final UserModel value)
	{
		_user = getPersistenceContext().setValue(USER, value);
	}
	
}
