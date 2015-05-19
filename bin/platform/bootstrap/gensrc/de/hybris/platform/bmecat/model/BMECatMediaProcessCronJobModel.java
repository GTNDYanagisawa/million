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
package de.hybris.platform.bmecat.model;

import de.hybris.platform.bmecat.model.BMECatJobMediaModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.cronjob.model.JobMediaModel;
import de.hybris.platform.cronjob.model.JobModel;
import de.hybris.platform.cronjob.model.MediaProcessCronJobModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type BMECatMediaProcessCronJob first defined at extension bmecat.
 */
@SuppressWarnings("all")
public class BMECatMediaProcessCronJobModel extends MediaProcessCronJobModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BMECatMediaProcessCronJob";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BMECatMediaProcessCronJobModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BMECatMediaProcessCronJobModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 */
	@Deprecated
	public BMECatMediaProcessCronJobModel(final JobModel _job)
	{
		super();
		setJob(_job);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public BMECatMediaProcessCronJobModel(final JobModel _job, final ItemModel _owner)
	{
		super();
		setJob(_job);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MediaProcessCronJob.jobMedia</code> attribute defined at extension <code>processing</code> and redeclared at extension <code>bmecat</code>. 
	 * @return the jobMedia
	 */
	@Override
	public BMECatJobMediaModel getJobMedia()
	{
		return (BMECatJobMediaModel) super.getJobMedia();
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MediaProcessCronJob.jobMedia</code> attribute defined at extension <code>processing</code> and redeclared at extension <code>bmecat</code>. Will only accept values of type {@link de.hybris.platform.bmecat.model.BMECatJobMediaModel}. 
	 *  
	 * @param value the jobMedia
	 */
	@Override
	public void setJobMedia(final JobMediaModel value)
	{
		if( value == null || value instanceof BMECatJobMediaModel)
		{
			super.setJobMedia(value);
		}
		else
		{
			throw new IllegalArgumentException("Given value is not instance of de.hybris.platform.bmecat.model.BMECatJobMediaModel");
		}
	}
	
}
