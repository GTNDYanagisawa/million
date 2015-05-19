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
package de.hybris.platform.acceleratorservices.model.export;

import de.hybris.platform.acceleratorservices.enums.ExportDataStatus;
import de.hybris.platform.acceleratorservices.model.export.ExportDataCronJobModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Date;

/**
 * Generated model class for type ExportDataHistoryEntry first defined at extension acceleratorservices.
 * <p>
 * Contains a history of executed exports.
 */
@SuppressWarnings("all")
public class ExportDataHistoryEntryModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ExportDataHistoryEntry";
	
	/**<i>Generated relation code constant for relation <code>ExportDataCronJob2ExportDataHistoryRel</code> defining source attribute <code>exportDataCronJob</code> in extension <code>acceleratorservices</code>.</i>*/
	public final static String _EXPORTDATACRONJOB2EXPORTDATAHISTORYREL = "ExportDataCronJob2ExportDataHistoryRel";
	
	/** <i>Generated constant</i> - Attribute key of <code>ExportDataHistoryEntry.code</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>ExportDataHistoryEntry.status</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String STATUS = "status";
	
	/** <i>Generated constant</i> - Attribute key of <code>ExportDataHistoryEntry.startTime</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String STARTTIME = "startTime";
	
	/** <i>Generated constant</i> - Attribute key of <code>ExportDataHistoryEntry.finishTime</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String FINISHTIME = "finishTime";
	
	/** <i>Generated constant</i> - Attribute key of <code>ExportDataHistoryEntry.processedResultCount</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String PROCESSEDRESULTCOUNT = "processedResultCount";
	
	/** <i>Generated constant</i> - Attribute key of <code>ExportDataHistoryEntry.failureMessage</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String FAILUREMESSAGE = "failureMessage";
	
	/** <i>Generated constant</i> - Attribute key of <code>ExportDataHistoryEntry.exportDataCronJob</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String EXPORTDATACRONJOB = "exportDataCronJob";
	
	
	/** <i>Generated variable</i> - Variable of <code>ExportDataHistoryEntry.code</code> attribute defined at extension <code>acceleratorservices</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>ExportDataHistoryEntry.status</code> attribute defined at extension <code>acceleratorservices</code>. */
	private ExportDataStatus _status;
	
	/** <i>Generated variable</i> - Variable of <code>ExportDataHistoryEntry.startTime</code> attribute defined at extension <code>acceleratorservices</code>. */
	private Date _startTime;
	
	/** <i>Generated variable</i> - Variable of <code>ExportDataHistoryEntry.finishTime</code> attribute defined at extension <code>acceleratorservices</code>. */
	private Date _finishTime;
	
	/** <i>Generated variable</i> - Variable of <code>ExportDataHistoryEntry.processedResultCount</code> attribute defined at extension <code>acceleratorservices</code>. */
	private Integer _processedResultCount;
	
	/** <i>Generated variable</i> - Variable of <code>ExportDataHistoryEntry.failureMessage</code> attribute defined at extension <code>acceleratorservices</code>. */
	private String _failureMessage;
	
	/** <i>Generated variable</i> - Variable of <code>ExportDataHistoryEntry.exportDataCronJob</code> attribute defined at extension <code>acceleratorservices</code>. */
	private ExportDataCronJobModel _exportDataCronJob;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ExportDataHistoryEntryModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ExportDataHistoryEntryModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>ExportDataHistoryEntry</code> at extension <code>acceleratorservices</code>
	 */
	@Deprecated
	public ExportDataHistoryEntryModel(final String _code)
	{
		super();
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>ExportDataHistoryEntry</code> at extension <code>acceleratorservices</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public ExportDataHistoryEntryModel(final String _code, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataHistoryEntry.code</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the code - unique code that identifies the export data history
	 */
	public String getCode()
	{
		if (this._code!=null)
		{
			return _code;
		}
		return _code = getPersistenceContext().getValue(CODE, _code);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataHistoryEntry.exportDataCronJob</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the exportDataCronJob
	 */
	public ExportDataCronJobModel getExportDataCronJob()
	{
		if (this._exportDataCronJob!=null)
		{
			return _exportDataCronJob;
		}
		return _exportDataCronJob = getPersistenceContext().getValue(EXPORTDATACRONJOB, _exportDataCronJob);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataHistoryEntry.failureMessage</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the failureMessage - Message if failure occurred
	 */
	public String getFailureMessage()
	{
		if (this._failureMessage!=null)
		{
			return _failureMessage;
		}
		return _failureMessage = getPersistenceContext().getValue(FAILUREMESSAGE, _failureMessage);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataHistoryEntry.finishTime</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the finishTime - Start time of this export
	 */
	public Date getFinishTime()
	{
		if (this._finishTime!=null)
		{
			return _finishTime;
		}
		return _finishTime = getPersistenceContext().getValue(FINISHTIME, _finishTime);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataHistoryEntry.processedResultCount</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the processedResultCount - The amount of records that was written to the export file
	 */
	public Integer getProcessedResultCount()
	{
		if (this._processedResultCount!=null)
		{
			return _processedResultCount;
		}
		return _processedResultCount = getPersistenceContext().getValue(PROCESSEDRESULTCOUNT, _processedResultCount);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataHistoryEntry.startTime</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the startTime - Start time of this export
	 */
	public Date getStartTime()
	{
		if (this._startTime!=null)
		{
			return _startTime;
		}
		return _startTime = getPersistenceContext().getValue(STARTTIME, _startTime);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataHistoryEntry.status</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the status - The status of this particular export
	 */
	public ExportDataStatus getStatus()
	{
		if (this._status!=null)
		{
			return _status;
		}
		return _status = getPersistenceContext().getValue(STATUS, _status);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>ExportDataHistoryEntry.code</code> attribute defined at extension <code>acceleratorservices</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the code - unique code that identifies the export data history
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ExportDataHistoryEntry.exportDataCronJob</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the exportDataCronJob
	 */
	public void setExportDataCronJob(final ExportDataCronJobModel value)
	{
		_exportDataCronJob = getPersistenceContext().setValue(EXPORTDATACRONJOB, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ExportDataHistoryEntry.failureMessage</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the failureMessage - Message if failure occurred
	 */
	public void setFailureMessage(final String value)
	{
		_failureMessage = getPersistenceContext().setValue(FAILUREMESSAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ExportDataHistoryEntry.finishTime</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the finishTime - Start time of this export
	 */
	public void setFinishTime(final Date value)
	{
		_finishTime = getPersistenceContext().setValue(FINISHTIME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ExportDataHistoryEntry.processedResultCount</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the processedResultCount - The amount of records that was written to the export file
	 */
	public void setProcessedResultCount(final Integer value)
	{
		_processedResultCount = getPersistenceContext().setValue(PROCESSEDRESULTCOUNT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ExportDataHistoryEntry.startTime</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the startTime - Start time of this export
	 */
	public void setStartTime(final Date value)
	{
		_startTime = getPersistenceContext().setValue(STARTTIME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ExportDataHistoryEntry.status</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the status - The status of this particular export
	 */
	public void setStatus(final ExportDataStatus value)
	{
		_status = getPersistenceContext().setValue(STATUS, value);
	}
	
}
