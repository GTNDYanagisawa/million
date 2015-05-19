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

import de.hybris.platform.btg.model.BTGAbstractReferenceOperandModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.security.PrincipalGroupModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type BTGReferencePrincipalGroupsOperand first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGReferencePrincipalGroupsOperandModel extends BTGAbstractReferenceOperandModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGReferencePrincipalGroupsOperand";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGReferencePrincipalGroupsOperand.groups</code> attribute defined at extension <code>btg</code>. */
	public static final String GROUPS = "groups";
	
	
	/** <i>Generated variable</i> - Variable of <code>BTGReferencePrincipalGroupsOperand.groups</code> attribute defined at extension <code>btg</code>. */
	private Collection<PrincipalGroupModel> _groups;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGReferencePrincipalGroupsOperandModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGReferencePrincipalGroupsOperandModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _groups initial attribute declared by type <code>BTGReferencePrincipalGroupsOperand</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGReferencePrincipalGroupsOperandModel(final CatalogVersionModel _catalogVersion, final Collection<PrincipalGroupModel> _groups, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setGroups(_groups);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _groups initial attribute declared by type <code>BTGReferencePrincipalGroupsOperand</code> at extension <code>btg</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGReferencePrincipalGroupsOperandModel(final CatalogVersionModel _catalogVersion, final Collection<PrincipalGroupModel> _groups, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setGroups(_groups);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGReferencePrincipalGroupsOperand.groups</code> attribute defined at extension <code>btg</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the groups
	 */
	public Collection<PrincipalGroupModel> getGroups()
	{
		if (this._groups!=null)
		{
			return _groups;
		}
		return _groups = getPersistenceContext().getValue(GROUPS, _groups);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGReferencePrincipalGroupsOperand.groups</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the groups
	 */
	public void setGroups(final Collection<PrincipalGroupModel> value)
	{
		_groups = getPersistenceContext().setValue(GROUPS, value);
	}
	
}
