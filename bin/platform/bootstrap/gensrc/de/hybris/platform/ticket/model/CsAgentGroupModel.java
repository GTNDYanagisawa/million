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
package de.hybris.platform.ticket.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.core.model.user.UserGroupModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.store.BaseStoreModel;
import java.util.List;

/**
 * Generated model class for type CsAgentGroup first defined at extension ticketsystem.
 */
@SuppressWarnings("all")
public class CsAgentGroupModel extends UserGroupModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CsAgentGroup";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsAgentGroup.emailDistributionList</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String EMAILDISTRIBUTIONLIST = "emailDistributionList";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsAgentGroup.defaultAssignee</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String DEFAULTASSIGNEE = "defaultAssignee";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsAgentGroup.ticketstores</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String TICKETSTORES = "ticketstores";
	
	
	/** <i>Generated variable</i> - Variable of <code>CsAgentGroup.emailDistributionList</code> attribute defined at extension <code>ticketsystem</code>. */
	private String _emailDistributionList;
	
	/** <i>Generated variable</i> - Variable of <code>CsAgentGroup.defaultAssignee</code> attribute defined at extension <code>ticketsystem</code>. */
	private EmployeeModel _defaultAssignee;
	
	/** <i>Generated variable</i> - Variable of <code>CsAgentGroup.ticketstores</code> attribute defined at extension <code>ticketsystem</code>. */
	private List<BaseStoreModel> _ticketstores;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CsAgentGroupModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CsAgentGroupModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _uid initial attribute declared by type <code>Principal</code> at extension <code>core</code>
	 */
	@Deprecated
	public CsAgentGroupModel(final String _uid)
	{
		super();
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>Principal</code> at extension <code>core</code>
	 */
	@Deprecated
	public CsAgentGroupModel(final ItemModel _owner, final String _uid)
	{
		super();
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsAgentGroup.defaultAssignee</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the defaultAssignee
	 */
	public EmployeeModel getDefaultAssignee()
	{
		if (this._defaultAssignee!=null)
		{
			return _defaultAssignee;
		}
		return _defaultAssignee = getPersistenceContext().getValue(DEFAULTASSIGNEE, _defaultAssignee);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsAgentGroup.emailDistributionList</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the emailDistributionList
	 */
	public String getEmailDistributionList()
	{
		if (this._emailDistributionList!=null)
		{
			return _emailDistributionList;
		}
		return _emailDistributionList = getPersistenceContext().getValue(EMAILDISTRIBUTIONLIST, _emailDistributionList);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsAgentGroup.ticketstores</code> attribute defined at extension <code>ticketsystem</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the ticketstores
	 */
	public List<BaseStoreModel> getTicketstores()
	{
		if (this._ticketstores!=null)
		{
			return _ticketstores;
		}
		return _ticketstores = getPersistenceContext().getValue(TICKETSTORES, _ticketstores);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsAgentGroup.defaultAssignee</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the defaultAssignee
	 */
	public void setDefaultAssignee(final EmployeeModel value)
	{
		_defaultAssignee = getPersistenceContext().setValue(DEFAULTASSIGNEE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsAgentGroup.emailDistributionList</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the emailDistributionList
	 */
	public void setEmailDistributionList(final String value)
	{
		_emailDistributionList = getPersistenceContext().setValue(EMAILDISTRIBUTIONLIST, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsAgentGroup.ticketstores</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the ticketstores
	 */
	public void setTicketstores(final List<BaseStoreModel> value)
	{
		_ticketstores = getPersistenceContext().setValue(TICKETSTORES, value);
	}
	
}
