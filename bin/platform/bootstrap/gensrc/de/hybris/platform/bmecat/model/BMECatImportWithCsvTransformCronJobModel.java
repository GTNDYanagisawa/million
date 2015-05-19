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

import de.hybris.platform.bmecat.model.BMECatImportWithCsvCronJobModel;
import de.hybris.platform.bmecat.model.BMECatJobMediaModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.cronjob.model.JobModel;
import de.hybris.platform.cronjob.model.MediaProcessCronJobModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type BMECatImportWithCsvTransformCronJob first defined at extension bmecat.
 */
@SuppressWarnings("all")
public class BMECatImportWithCsvTransformCronJobModel extends MediaProcessCronJobModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BMECatImportWithCsvTransformCronJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportWithCsvTransformCronJob.MediasMedia</code> attribute defined at extension <code>bmecat</code>. */
	public static final String MEDIASMEDIA = "MediasMedia";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportWithCsvTransformCronJob.referenceMedias</code> attribute defined at extension <code>bmecat</code>. */
	public static final String REFERENCEMEDIAS = "referenceMedias";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportWithCsvTransformCronJob.bmecatImportWithCsvCronJob</code> attribute defined at extension <code>bmecat</code>. */
	public static final String BMECATIMPORTWITHCSVCRONJOB = "bmecatImportWithCsvCronJob";
	
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportWithCsvTransformCronJob.MediasMedia</code> attribute defined at extension <code>bmecat</code>. */
	private BMECatJobMediaModel _MediasMedia;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportWithCsvTransformCronJob.referenceMedias</code> attribute defined at extension <code>bmecat</code>. */
	private Boolean _referenceMedias;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportWithCsvTransformCronJob.bmecatImportWithCsvCronJob</code> attribute defined at extension <code>bmecat</code>. */
	private BMECatImportWithCsvCronJobModel _bmecatImportWithCsvCronJob;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BMECatImportWithCsvTransformCronJobModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BMECatImportWithCsvTransformCronJobModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 */
	@Deprecated
	public BMECatImportWithCsvTransformCronJobModel(final JobModel _job)
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
	public BMECatImportWithCsvTransformCronJobModel(final JobModel _job, final ItemModel _owner)
	{
		super();
		setJob(_job);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportWithCsvTransformCronJob.bmecatImportWithCsvCronJob</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the bmecatImportWithCsvCronJob
	 */
	public BMECatImportWithCsvCronJobModel getBmecatImportWithCsvCronJob()
	{
		if (this._bmecatImportWithCsvCronJob!=null)
		{
			return _bmecatImportWithCsvCronJob;
		}
		return _bmecatImportWithCsvCronJob = getPersistenceContext().getValue(BMECATIMPORTWITHCSVCRONJOB, _bmecatImportWithCsvCronJob);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportWithCsvTransformCronJob.MediasMedia</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the MediasMedia
	 */
	public BMECatJobMediaModel getMediasMedia()
	{
		if (this._MediasMedia!=null)
		{
			return _MediasMedia;
		}
		return _MediasMedia = getPersistenceContext().getValue(MEDIASMEDIA, _MediasMedia);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportWithCsvTransformCronJob.referenceMedias</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the referenceMedias
	 */
	public Boolean getReferenceMedias()
	{
		if (this._referenceMedias!=null)
		{
			return _referenceMedias;
		}
		return _referenceMedias = getPersistenceContext().getValue(REFERENCEMEDIAS, _referenceMedias);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportWithCsvTransformCronJob.bmecatImportWithCsvCronJob</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the bmecatImportWithCsvCronJob
	 */
	public void setBmecatImportWithCsvCronJob(final BMECatImportWithCsvCronJobModel value)
	{
		_bmecatImportWithCsvCronJob = getPersistenceContext().setValue(BMECATIMPORTWITHCSVCRONJOB, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportWithCsvTransformCronJob.MediasMedia</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the MediasMedia
	 */
	public void setMediasMedia(final BMECatJobMediaModel value)
	{
		_MediasMedia = getPersistenceContext().setValue(MEDIASMEDIA, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportWithCsvTransformCronJob.referenceMedias</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the referenceMedias
	 */
	public void setReferenceMedias(final Boolean value)
	{
		_referenceMedias = getPersistenceContext().setValue(REFERENCEMEDIAS, value);
	}
	
}
