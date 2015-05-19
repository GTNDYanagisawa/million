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
package de.hybris.platform.workflow.model;

import de.hybris.platform.comments.model.AbstractCommentModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.security.PrincipalModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.cronjob.model.JobModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.workflow.model.WorkflowActionModel;
import de.hybris.platform.workflow.model.WorkflowItemAttachmentModel;
import de.hybris.platform.workflow.model.WorkflowTemplateModel;
import java.util.List;
import java.util.Locale;

/**
 * Generated model class for type Workflow first defined at extension workflow.
 */
@SuppressWarnings("all")
public class WorkflowModel extends CronJobModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "Workflow";
	
	/**<i>Generated relation code constant for relation <code>JobCronJobRelation</code> defining source attribute <code>job</code> in extension <code>processing</code>.</i>*/
	public final static String _JOBCRONJOBRELATION = "JobCronJobRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>Workflow.name</code> attribute defined at extension <code>workflow</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>Workflow.description</code> attribute defined at extension <code>workflow</code>. */
	public static final String DESCRIPTION = "description";
	
	/** <i>Generated constant</i> - Attribute key of <code>Workflow.actions</code> attribute defined at extension <code>workflow</code>. */
	public static final String ACTIONS = "actions";
	
	/** <i>Generated constant</i> - Attribute key of <code>Workflow.attachments</code> attribute defined at extension <code>workflow</code>. */
	public static final String ATTACHMENTS = "attachments";
	
	/** <i>Generated constant</i> - Attribute key of <code>Workflow.principalAssigned</code> attribute defined at extension <code>print</code>. */
	public static final String PRINCIPALASSIGNED = "principalAssigned";
	
	/** <i>Generated constant</i> - Attribute key of <code>Workflow.assignedJob</code> attribute defined at extension <code>print</code>. */
	public static final String ASSIGNEDJOB = "assignedJob";
	
	
	/** <i>Generated variable</i> - Variable of <code>Workflow.actions</code> attribute defined at extension <code>workflow</code>. */
	private List<WorkflowActionModel> _actions;
	
	/** <i>Generated variable</i> - Variable of <code>Workflow.attachments</code> attribute defined at extension <code>workflow</code>. */
	private List<WorkflowItemAttachmentModel> _attachments;
	
	/** <i>Generated variable</i> - Variable of <code>Workflow.principalAssigned</code> attribute defined at extension <code>print</code>. */
	private PrincipalModel _principalAssigned;
	
	/** <i>Generated variable</i> - Variable of <code>Workflow.assignedJob</code> attribute defined at extension <code>print</code>. */
	private AbstractCommentModel _assignedJob;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public WorkflowModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public WorkflowModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>Workflow</code> at extension <code>workflow</code>
	 * @param _principalAssigned initial attribute declared by type <code>Workflow</code> at extension <code>print</code>
	 */
	@Deprecated
	public WorkflowModel(final WorkflowTemplateModel _job, final PrincipalModel _principalAssigned)
	{
		super();
		setJob(_job);
		setPrincipalAssigned(_principalAssigned);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>Workflow</code> at extension <code>workflow</code>
	 * @param _owner initial attribute declared by type <code>Workflow</code> at extension <code>workflow</code>
	 * @param _principalAssigned initial attribute declared by type <code>Workflow</code> at extension <code>print</code>
	 */
	@Deprecated
	public WorkflowModel(final WorkflowTemplateModel _job, final UserModel _owner, final PrincipalModel _principalAssigned)
	{
		super();
		setJob(_job);
		setOwner(_owner);
		setPrincipalAssigned(_principalAssigned);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Workflow.actions</code> attribute defined at extension <code>workflow</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the actions
	 */
	public List<WorkflowActionModel> getActions()
	{
		if (this._actions!=null)
		{
			return _actions;
		}
		return _actions = getPersistenceContext().getValue(ACTIONS, _actions);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Workflow.assignedJob</code> dynamic attribute defined at extension <code>print</code>. 
	 * @return the assignedJob
	 */
	public AbstractCommentModel getAssignedJob()
	{
		return getPersistenceContext().getDynamicValue(this,ASSIGNEDJOB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Workflow.attachments</code> attribute defined at extension <code>workflow</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the attachments - n-part of the WorkflowItemAttachmentRelation; holds a set of attachments (item references) belonging to the topic of workflow
	 */
	public List<WorkflowItemAttachmentModel> getAttachments()
	{
		if (this._attachments!=null)
		{
			return _attachments;
		}
		return _attachments = getPersistenceContext().getValue(ATTACHMENTS, _attachments);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Workflow.description</code> attribute defined at extension <code>workflow</code>. 
	 * @return the description - global description of the workflow while each action has its own description
	 */
	public String getDescription()
	{
		return getDescription(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>Workflow.description</code> attribute defined at extension <code>workflow</code>. 
	 * @param loc the value localization key 
	 * @return the description - global description of the workflow while each action has its own description
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getDescription(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(DESCRIPTION, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.job</code> attribute defined at extension <code>processing</code> and redeclared at extension <code>workflow</code>. 
	 * @return the job - related workflow template this workflow is created from (never changable)
	 */
	@Override
	public WorkflowTemplateModel getJob()
	{
		return (WorkflowTemplateModel) super.getJob();
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Workflow.name</code> attribute defined at extension <code>workflow</code>. 
	 * @return the name - name of the workflow
	 */
	public String getName()
	{
		return getName(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>Workflow.name</code> attribute defined at extension <code>workflow</code>. 
	 * @param loc the value localization key 
	 * @return the name - name of the workflow
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getName(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(NAME, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Item.owner</code> attribute defined at extension <code>core</code> and redeclared at extension <code>workflow</code>. 
	 * @return the owner - user responsible for this workflow
	 */
	@Override
	public UserModel getOwner()
	{
		return (UserModel) super.getOwner();
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Workflow.principalAssigned</code> attribute defined at extension <code>print</code>. 
	 * @return the principalAssigned - assigned principal who has to assure the completion (can also be a principal group where any member of the group can process the action)
	 */
	public PrincipalModel getPrincipalAssigned()
	{
		if (this._principalAssigned!=null)
		{
			return _principalAssigned;
		}
		return _principalAssigned = getPersistenceContext().getValue(PRINCIPALASSIGNED, _principalAssigned);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Workflow.actions</code> attribute defined at extension <code>workflow</code>. 
	 *  
	 * @param value the actions
	 */
	public void setActions(final List<WorkflowActionModel> value)
	{
		_actions = getPersistenceContext().setValue(ACTIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Workflow.assignedJob</code> dynamic attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the assignedJob
	 */
	public void setAssignedJob(final AbstractCommentModel value)
	{
		getPersistenceContext().setDynamicValue(this,ASSIGNEDJOB, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Workflow.attachments</code> attribute defined at extension <code>workflow</code>. 
	 *  
	 * @param value the attachments - n-part of the WorkflowItemAttachmentRelation; holds a set of attachments (item references) belonging to the topic of workflow
	 */
	public void setAttachments(final List<WorkflowItemAttachmentModel> value)
	{
		_attachments = getPersistenceContext().setValue(ATTACHMENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Workflow.description</code> attribute defined at extension <code>workflow</code>. 
	 *  
	 * @param value the description - global description of the workflow while each action has its own description
	 */
	public void setDescription(final String value)
	{
		setDescription(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>Workflow.description</code> attribute defined at extension <code>workflow</code>. 
	 *  
	 * @param value the description - global description of the workflow while each action has its own description
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setDescription(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(DESCRIPTION, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>CronJob.job</code> attribute defined at extension <code>processing</code> and redeclared at extension <code>workflow</code>. Can only be used at creation of model - before first save. Will only accept values of type {@link de.hybris.platform.workflow.model.WorkflowTemplateModel}.  
	 *  
	 * @param value the job - related workflow template this workflow is created from (never changable)
	 */
	@Override
	public void setJob(final JobModel value)
	{
		super.setJob(value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Workflow.name</code> attribute defined at extension <code>workflow</code>. 
	 *  
	 * @param value the name - name of the workflow
	 */
	public void setName(final String value)
	{
		setName(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>Workflow.name</code> attribute defined at extension <code>workflow</code>. 
	 *  
	 * @param value the name - name of the workflow
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setName(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(NAME, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Item.owner</code> attribute defined at extension <code>core</code> and redeclared at extension <code>workflow</code>. Will only accept values of type {@link de.hybris.platform.core.model.user.UserModel}. 
	 *  
	 * @param value the owner - user responsible for this workflow
	 */
	@Override
	public void setOwner(final ItemModel value)
	{
		super.setOwner(value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Workflow.principalAssigned</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the principalAssigned - assigned principal who has to assure the completion (can also be a principal group where any member of the group can process the action)
	 */
	public void setPrincipalAssigned(final PrincipalModel value)
	{
		_principalAssigned = getPersistenceContext().setValue(PRINCIPALASSIGNED, value);
	}
	
}
