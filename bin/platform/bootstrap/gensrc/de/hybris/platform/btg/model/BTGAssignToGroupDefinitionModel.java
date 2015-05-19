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

import de.hybris.platform.btg.model.BTGOutputActionDefinitionModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.user.UserGroupModel;
import de.hybris.platform.servicelayer.enums.ActionType;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type BTGAssignToGroupDefinition first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGAssignToGroupDefinitionModel extends BTGOutputActionDefinitionModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGAssignToGroupDefinition";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGAssignToGroupDefinition.userGroups</code> attribute defined at extension <code>btg</code>. */
	public static final String USERGROUPS = "userGroups";
	
	
	/** <i>Generated variable</i> - Variable of <code>BTGAssignToGroupDefinition.userGroups</code> attribute defined at extension <code>btg</code>. */
	private Collection<UserGroupModel> _userGroups;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGAssignToGroupDefinitionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGAssignToGroupDefinitionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGOutputActionDefinition</code> at extension <code>btg</code>
	 * @param _code initial attribute declared by type <code>AbstractAction</code> at extension <code>processing</code>
	 * @param _target initial attribute declared by type <code>BTGAssignToGroupDefinition</code> at extension <code>btg</code>
	 * @param _type initial attribute declared by type <code>BTGOutputActionDefinition</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGOutputActionDefinition</code> at extension <code>btg</code>
	 * @param _userGroups initial attribute declared by type <code>BTGAssignToGroupDefinition</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGAssignToGroupDefinitionModel(final CatalogVersionModel _catalogVersion, final String _code, final String _target, final ActionType _type, final String _uid, final Collection<UserGroupModel> _userGroups)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCode(_code);
		setTarget(_target);
		setType(_type);
		setUid(_uid);
		setUserGroups(_userGroups);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGOutputActionDefinition</code> at extension <code>btg</code>
	 * @param _code initial attribute declared by type <code>AbstractAction</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _target initial attribute declared by type <code>BTGAssignToGroupDefinition</code> at extension <code>btg</code>
	 * @param _type initial attribute declared by type <code>BTGOutputActionDefinition</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGOutputActionDefinition</code> at extension <code>btg</code>
	 * @param _userGroups initial attribute declared by type <code>BTGAssignToGroupDefinition</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGAssignToGroupDefinitionModel(final CatalogVersionModel _catalogVersion, final String _code, final ItemModel _owner, final String _target, final ActionType _type, final String _uid, final Collection<UserGroupModel> _userGroups)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCode(_code);
		setOwner(_owner);
		setTarget(_target);
		setType(_type);
		setUid(_uid);
		setUserGroups(_userGroups);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGAssignToGroupDefinition.userGroups</code> attribute defined at extension <code>btg</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the userGroups
	 */
	public Collection<UserGroupModel> getUserGroups()
	{
		if (this._userGroups!=null)
		{
			return _userGroups;
		}
		return _userGroups = getPersistenceContext().getValue(USERGROUPS, _userGroups);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>AbstractAction.target</code> attribute defined at extension <code>processing</code> and redeclared at extension <code>btg</code>. Can only be used at creation of model - before first save. Will only accept values of type {@link java.lang.String}.  
	 *  
	 * @param value the target
	 */
	@Override
	public void setTarget(final String value)
	{
		super.setTarget(value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGAssignToGroupDefinition.userGroups</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the userGroups
	 */
	public void setUserGroups(final Collection<UserGroupModel> value)
	{
		_userGroups = getPersistenceContext().setValue(USERGROUPS, value);
	}
	
}
