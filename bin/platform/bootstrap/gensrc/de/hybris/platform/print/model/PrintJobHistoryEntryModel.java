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
package de.hybris.platform.print.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.workflow.model.AbstractWorkflowActionModel;
import de.hybris.platform.workflow.model.WorkflowActionCommentModel;
import de.hybris.platform.workflow.model.WorkflowActionModel;
import java.util.List;

/**
 * Generated model class for type PrintJobHistoryEntry first defined at extension print.
 */
@SuppressWarnings("all")
public class PrintJobHistoryEntryModel extends WorkflowActionCommentModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PrintJobHistoryEntry";
	
	/** <i>Generated constant</i> - Attribute key of <code>PrintJobHistoryEntry.toActions</code> attribute defined at extension <code>print</code>. */
	public static final String TOACTIONS = "toActions";
	
	/** <i>Generated constant</i> - Attribute key of <code>PrintJobHistoryEntry.causedBy</code> attribute defined at extension <code>print</code>. */
	public static final String CAUSEDBY = "causedBy";
	
	
	/** <i>Generated variable</i> - Variable of <code>PrintJobHistoryEntry.toActions</code> attribute defined at extension <code>print</code>. */
	private List<WorkflowActionModel> _toActions;
	
	/** <i>Generated variable</i> - Variable of <code>PrintJobHistoryEntry.causedBy</code> attribute defined at extension <code>print</code>. */
	private UserModel _causedBy;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PrintJobHistoryEntryModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PrintJobHistoryEntryModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _causedBy initial attribute declared by type <code>PrintJobHistoryEntry</code> at extension <code>print</code>
	 * @param _comment initial attribute declared by type <code>WorkflowActionComment</code> at extension <code>workflow</code>
	 * @param _toActions initial attribute declared by type <code>PrintJobHistoryEntry</code> at extension <code>print</code>
	 * @param _workflowAction initial attribute declared by type <code>WorkflowActionComment</code> at extension <code>workflow</code>
	 */
	@Deprecated
	public PrintJobHistoryEntryModel(final UserModel _causedBy, final String _comment, final List<WorkflowActionModel> _toActions, final AbstractWorkflowActionModel _workflowAction)
	{
		super();
		setCausedBy(_causedBy);
		setComment(_comment);
		setToActions(_toActions);
		setWorkflowAction(_workflowAction);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _causedBy initial attribute declared by type <code>PrintJobHistoryEntry</code> at extension <code>print</code>
	 * @param _comment initial attribute declared by type <code>WorkflowActionComment</code> at extension <code>workflow</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _toActions initial attribute declared by type <code>PrintJobHistoryEntry</code> at extension <code>print</code>
	 * @param _workflowAction initial attribute declared by type <code>WorkflowActionComment</code> at extension <code>workflow</code>
	 */
	@Deprecated
	public PrintJobHistoryEntryModel(final UserModel _causedBy, final String _comment, final ItemModel _owner, final List<WorkflowActionModel> _toActions, final AbstractWorkflowActionModel _workflowAction)
	{
		super();
		setCausedBy(_causedBy);
		setComment(_comment);
		setOwner(_owner);
		setToActions(_toActions);
		setWorkflowAction(_workflowAction);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PrintJobHistoryEntry.causedBy</code> attribute defined at extension <code>print</code>. 
	 * @return the causedBy
	 */
	public UserModel getCausedBy()
	{
		if (this._causedBy!=null)
		{
			return _causedBy;
		}
		return _causedBy = getPersistenceContext().getValue(CAUSEDBY, _causedBy);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PrintJobHistoryEntry.toActions</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the toActions
	 */
	public List<WorkflowActionModel> getToActions()
	{
		if (this._toActions!=null)
		{
			return _toActions;
		}
		return _toActions = getPersistenceContext().getValue(TOACTIONS, _toActions);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PrintJobHistoryEntry.causedBy</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the causedBy
	 */
	public void setCausedBy(final UserModel value)
	{
		_causedBy = getPersistenceContext().setValue(CAUSEDBY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PrintJobHistoryEntry.toActions</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the toActions
	 */
	public void setToActions(final List<WorkflowActionModel> value)
	{
		_toActions = getPersistenceContext().setValue(TOACTIONS, value);
	}
	
}
