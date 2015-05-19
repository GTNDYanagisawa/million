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
package de.hybris.platform.lucenesearch.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.cronjob.model.JobModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type UpdateIndexJob first defined at extension lucenesearch.
 */
@SuppressWarnings("all")
public class UpdateIndexJobModel extends JobModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "UpdateIndexJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>UpdateIndexJob.maxUpdatesPerRun</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String MAXUPDATESPERRUN = "maxUpdatesPerRun";
	
	
	/** <i>Generated variable</i> - Variable of <code>UpdateIndexJob.maxUpdatesPerRun</code> attribute defined at extension <code>lucenesearch</code>. */
	private Integer _maxUpdatesPerRun;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public UpdateIndexJobModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public UpdateIndexJobModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>Job</code> at extension <code>processing</code>
	 */
	@Deprecated
	public UpdateIndexJobModel(final String _code)
	{
		super();
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>Job</code> at extension <code>processing</code>
	 * @param _nodeID initial attribute declared by type <code>Job</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public UpdateIndexJobModel(final String _code, final Integer _nodeID, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setNodeID(_nodeID);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpdateIndexJob.maxUpdatesPerRun</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the maxUpdatesPerRun - The maximum number of items updated per
	 * 						UpdateIndexJob run.
	 */
	public Integer getMaxUpdatesPerRun()
	{
		if (this._maxUpdatesPerRun!=null)
		{
			return _maxUpdatesPerRun;
		}
		return _maxUpdatesPerRun = getPersistenceContext().getValue(MAXUPDATESPERRUN, _maxUpdatesPerRun);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>UpdateIndexJob.maxUpdatesPerRun</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the maxUpdatesPerRun - The maximum number of items updated per
	 * 						UpdateIndexJob run.
	 */
	public void setMaxUpdatesPerRun(final Integer value)
	{
		_maxUpdatesPerRun = getPersistenceContext().setValue(MAXUPDATESPERRUN, value);
	}
	
}
