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
package de.hybris.platform.importcockpit.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.cronjob.model.JobModel;
import de.hybris.platform.impex.model.cronjob.ImpExImportCronJobModel;
import de.hybris.platform.importcockpit.model.ImportCockpitInputMediaModel;
import de.hybris.platform.importcockpit.model.ImportCockpitJobModel;
import de.hybris.platform.importcockpit.model.ImportCockpitMappingModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Date;

/**
 * Generated model class for type ImportCockpitCronJob first defined at extension importcockpit.
 */
@SuppressWarnings("all")
public class ImportCockpitCronJobModel extends ImpExImportCronJobModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ImportCockpitCronJob";
	
	/**<i>Generated relation code constant for relation <code>JobCronJobRelation</code> defining source attribute <code>job</code> in extension <code>processing</code>.</i>*/
	public final static String _JOBCRONJOBRELATION = "JobCronJobRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>ImportCockpitCronJob.mapping</code> attribute defined at extension <code>importcockpit</code>. */
	public static final String MAPPING = "mapping";
	
	/** <i>Generated constant</i> - Attribute key of <code>ImportCockpitCronJob.mappingValid</code> attribute defined at extension <code>importcockpit</code>. */
	public static final String MAPPINGVALID = "mappingValid";
	
	/** <i>Generated constant</i> - Attribute key of <code>ImportCockpitCronJob.inputMedia</code> attribute defined at extension <code>importcockpit</code>. */
	public static final String INPUTMEDIA = "inputMedia";
	
	/** <i>Generated constant</i> - Attribute key of <code>ImportCockpitCronJob.nextExecutionTime</code> attribute defined at extension <code>importcockpit</code>. */
	public static final String NEXTEXECUTIONTIME = "nextExecutionTime";
	
	
	/** <i>Generated variable</i> - Variable of <code>ImportCockpitCronJob.mapping</code> attribute defined at extension <code>importcockpit</code>. */
	private ImportCockpitMappingModel _mapping;
	
	/** <i>Generated variable</i> - Variable of <code>ImportCockpitCronJob.mappingValid</code> attribute defined at extension <code>importcockpit</code>. */
	private Boolean _mappingValid;
	
	/** <i>Generated variable</i> - Variable of <code>ImportCockpitCronJob.inputMedia</code> attribute defined at extension <code>importcockpit</code>. */
	private ImportCockpitInputMediaModel _inputMedia;
	
	/** <i>Generated variable</i> - Variable of <code>ImportCockpitCronJob.nextExecutionTime</code> attribute defined at extension <code>importcockpit</code>. */
	private Date _nextExecutionTime;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ImportCockpitCronJobModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ImportCockpitCronJobModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _inputMedia initial attribute declared by type <code>ImportCockpitCronJob</code> at extension <code>importcockpit</code>
	 * @param _job initial attribute declared by type <code>ImportCockpitCronJob</code> at extension <code>importcockpit</code>
	 */
	@Deprecated
	public ImportCockpitCronJobModel(final ImportCockpitInputMediaModel _inputMedia, final ImportCockpitJobModel _job)
	{
		super();
		setInputMedia(_inputMedia);
		setJob(_job);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _inputMedia initial attribute declared by type <code>ImportCockpitCronJob</code> at extension <code>importcockpit</code>
	 * @param _job initial attribute declared by type <code>ImportCockpitCronJob</code> at extension <code>importcockpit</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public ImportCockpitCronJobModel(final ImportCockpitInputMediaModel _inputMedia, final ImportCockpitJobModel _job, final ItemModel _owner)
	{
		super();
		setInputMedia(_inputMedia);
		setJob(_job);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImportCockpitCronJob.inputMedia</code> attribute defined at extension <code>importcockpit</code>. 
	 * @return the inputMedia
	 */
	public ImportCockpitInputMediaModel getInputMedia()
	{
		if (this._inputMedia!=null)
		{
			return _inputMedia;
		}
		return _inputMedia = getPersistenceContext().getValue(INPUTMEDIA, _inputMedia);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.job</code> attribute defined at extension <code>processing</code> and redeclared at extension <code>importcockpit</code>. 
	 * @return the job
	 */
	@Override
	public ImportCockpitJobModel getJob()
	{
		return (ImportCockpitJobModel) super.getJob();
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImportCockpitCronJob.mapping</code> attribute defined at extension <code>importcockpit</code>. 
	 * @return the mapping
	 */
	public ImportCockpitMappingModel getMapping()
	{
		if (this._mapping!=null)
		{
			return _mapping;
		}
		return _mapping = getPersistenceContext().getValue(MAPPING, _mapping);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImportCockpitCronJob.nextExecutionTime</code> dynamic attribute defined at extension <code>importcockpit</code>. 
	 * @return the nextExecutionTime
	 */
	public Date getNextExecutionTime()
	{
		return getPersistenceContext().getDynamicValue(this,NEXTEXECUTIONTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImportCockpitCronJob.mappingValid</code> attribute defined at extension <code>importcockpit</code>. 
	 * @return the mappingValid
	 */
	public boolean isMappingValid()
	{
		return toPrimitive( _mappingValid = getPersistenceContext().getValue(MAPPINGVALID, _mappingValid));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ImportCockpitCronJob.inputMedia</code> attribute defined at extension <code>importcockpit</code>. 
	 *  
	 * @param value the inputMedia
	 */
	public void setInputMedia(final ImportCockpitInputMediaModel value)
	{
		_inputMedia = getPersistenceContext().setValue(INPUTMEDIA, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>CronJob.job</code> attribute defined at extension <code>processing</code> and redeclared at extension <code>importcockpit</code>. Can only be used at creation of model - before first save. Will only accept values of type {@link de.hybris.platform.importcockpit.model.ImportCockpitJobModel}.  
	 *  
	 * @param value the job
	 */
	@Override
	public void setJob(final JobModel value)
	{
		super.setJob(value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ImportCockpitCronJob.mapping</code> attribute defined at extension <code>importcockpit</code>. 
	 *  
	 * @param value the mapping
	 */
	public void setMapping(final ImportCockpitMappingModel value)
	{
		_mapping = getPersistenceContext().setValue(MAPPING, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ImportCockpitCronJob.mappingValid</code> attribute defined at extension <code>importcockpit</code>. 
	 *  
	 * @param value the mappingValid
	 */
	public void setMappingValid(final boolean value)
	{
		_mappingValid = getPersistenceContext().setValue(MAPPINGVALID, toObject(value));
	}
	
}
