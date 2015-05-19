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
package de.hybris.platform.cronjob.model;

import de.hybris.platform.commons.model.renderer.RendererTemplateModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.enums.ErrorMode;
import de.hybris.platform.cronjob.enums.JobLogLevel;
import de.hybris.platform.cronjob.model.ChangeDescriptorModel;
import de.hybris.platform.cronjob.model.JobLogModel;
import de.hybris.platform.cronjob.model.JobModel;
import de.hybris.platform.cronjob.model.LogFileModel;
import de.hybris.platform.cronjob.model.StepModel;
import de.hybris.platform.cronjob.model.TriggerModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Generated model class for type CronJob first defined at extension processing.
 */
@SuppressWarnings("all")
public class CronJobModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CronJob";
	
	/**<i>Generated relation code constant for relation <code>JobCronJobRelation</code> defining source attribute <code>job</code> in extension <code>processing</code>.</i>*/
	public final static String _JOBCRONJOBRELATION = "JobCronJobRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.code</code> attribute defined at extension <code>processing</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.errorMode</code> attribute defined at extension <code>processing</code>. */
	public static final String ERRORMODE = "errorMode";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.logToFile</code> attribute defined at extension <code>processing</code>. */
	public static final String LOGTOFILE = "logToFile";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.logToDatabase</code> attribute defined at extension <code>processing</code>. */
	public static final String LOGTODATABASE = "logToDatabase";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.logLevelFile</code> attribute defined at extension <code>processing</code>. */
	public static final String LOGLEVELFILE = "logLevelFile";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.logLevelDatabase</code> attribute defined at extension <code>processing</code>. */
	public static final String LOGLEVELDATABASE = "logLevelDatabase";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.logFiles</code> attribute defined at extension <code>processing</code>. */
	public static final String LOGFILES = "logFiles";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.sessionUser</code> attribute defined at extension <code>processing</code>. */
	public static final String SESSIONUSER = "sessionUser";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.sessionLanguage</code> attribute defined at extension <code>processing</code>. */
	public static final String SESSIONLANGUAGE = "sessionLanguage";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.sessionCurrency</code> attribute defined at extension <code>processing</code>. */
	public static final String SESSIONCURRENCY = "sessionCurrency";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.active</code> attribute defined at extension <code>processing</code>. */
	public static final String ACTIVE = "active";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.retry</code> attribute defined at extension <code>processing</code>. */
	public static final String RETRY = "retry";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.singleExecutable</code> attribute defined at extension <code>processing</code>. */
	public static final String SINGLEEXECUTABLE = "singleExecutable";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.emailAddress</code> attribute defined at extension <code>processing</code>. */
	public static final String EMAILADDRESS = "emailAddress";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.sendEmail</code> attribute defined at extension <code>processing</code>. */
	public static final String SENDEMAIL = "sendEmail";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.startTime</code> attribute defined at extension <code>processing</code>. */
	public static final String STARTTIME = "startTime";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.endTime</code> attribute defined at extension <code>processing</code>. */
	public static final String ENDTIME = "endTime";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.status</code> attribute defined at extension <code>processing</code>. */
	public static final String STATUS = "status";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.result</code> attribute defined at extension <code>processing</code>. */
	public static final String RESULT = "result";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.logText</code> attribute defined at extension <code>processing</code>. */
	public static final String LOGTEXT = "logText";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.nodeID</code> attribute defined at extension <code>processing</code>. */
	public static final String NODEID = "nodeID";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.currentStep</code> attribute defined at extension <code>processing</code>. */
	public static final String CURRENTSTEP = "currentStep";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.changeRecordingEnabled</code> attribute defined at extension <code>processing</code>. */
	public static final String CHANGERECORDINGENABLED = "changeRecordingEnabled";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.changes</code> attribute defined at extension <code>processing</code>. */
	public static final String CHANGES = "changes";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.requestAbort</code> attribute defined at extension <code>processing</code>. */
	public static final String REQUESTABORT = "requestAbort";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.requestAbortStep</code> attribute defined at extension <code>processing</code>. */
	public static final String REQUESTABORTSTEP = "requestAbortStep";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.timeTable</code> attribute defined at extension <code>processing</code>. */
	public static final String TIMETABLE = "timeTable";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.priority</code> attribute defined at extension <code>processing</code>. */
	public static final String PRIORITY = "priority";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.removeOnExit</code> attribute defined at extension <code>processing</code>. */
	public static final String REMOVEONEXIT = "removeOnExit";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.emailNotificationTemplate</code> attribute defined at extension <code>processing</code>. */
	public static final String EMAILNOTIFICATIONTEMPLATE = "emailNotificationTemplate";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.alternativeDataSourceID</code> attribute defined at extension <code>processing</code>. */
	public static final String ALTERNATIVEDATASOURCEID = "alternativeDataSourceID";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.processedSteps</code> attribute defined at extension <code>processing</code>. */
	public static final String PROCESSEDSTEPS = "processedSteps";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.pendingSteps</code> attribute defined at extension <code>processing</code>. */
	public static final String PENDINGSTEPS = "pendingSteps";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.logs</code> attribute defined at extension <code>processing</code>. */
	public static final String LOGS = "logs";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.triggers</code> attribute defined at extension <code>processing</code>. */
	public static final String TRIGGERS = "triggers";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJob.job</code> attribute defined at extension <code>processing</code>. */
	public static final String JOB = "job";
	
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.code</code> attribute defined at extension <code>processing</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.errorMode</code> attribute defined at extension <code>processing</code>. */
	private ErrorMode _errorMode;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.logToFile</code> attribute defined at extension <code>processing</code>. */
	private Boolean _logToFile;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.logToDatabase</code> attribute defined at extension <code>processing</code>. */
	private Boolean _logToDatabase;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.logLevelFile</code> attribute defined at extension <code>processing</code>. */
	private JobLogLevel _logLevelFile;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.logLevelDatabase</code> attribute defined at extension <code>processing</code>. */
	private JobLogLevel _logLevelDatabase;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.logFiles</code> attribute defined at extension <code>processing</code>. */
	private Collection<LogFileModel> _logFiles;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.sessionUser</code> attribute defined at extension <code>processing</code>. */
	private UserModel _sessionUser;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.sessionLanguage</code> attribute defined at extension <code>processing</code>. */
	private LanguageModel _sessionLanguage;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.sessionCurrency</code> attribute defined at extension <code>processing</code>. */
	private CurrencyModel _sessionCurrency;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.active</code> attribute defined at extension <code>processing</code>. */
	private Boolean _active;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.retry</code> attribute defined at extension <code>processing</code>. */
	private Boolean _retry;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.singleExecutable</code> attribute defined at extension <code>processing</code>. */
	private Boolean _singleExecutable;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.emailAddress</code> attribute defined at extension <code>processing</code>. */
	private String _emailAddress;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.sendEmail</code> attribute defined at extension <code>processing</code>. */
	private Boolean _sendEmail;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.startTime</code> attribute defined at extension <code>processing</code>. */
	private Date _startTime;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.endTime</code> attribute defined at extension <code>processing</code>. */
	private Date _endTime;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.status</code> attribute defined at extension <code>processing</code>. */
	private CronJobStatus _status;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.result</code> attribute defined at extension <code>processing</code>. */
	private CronJobResult _result;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.logText</code> attribute defined at extension <code>processing</code>. */
	private String _logText;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.nodeID</code> attribute defined at extension <code>processing</code>. */
	private Integer _nodeID;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.currentStep</code> attribute defined at extension <code>processing</code>. */
	private StepModel _currentStep;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.changeRecordingEnabled</code> attribute defined at extension <code>processing</code>. */
	private Boolean _changeRecordingEnabled;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.changes</code> attribute defined at extension <code>processing</code>. */
	private Collection<ChangeDescriptorModel> _changes;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.requestAbort</code> attribute defined at extension <code>processing</code>. */
	private Boolean _requestAbort;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.requestAbortStep</code> attribute defined at extension <code>processing</code>. */
	private Boolean _requestAbortStep;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.timeTable</code> attribute defined at extension <code>processing</code>. */
	private String _timeTable;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.priority</code> attribute defined at extension <code>processing</code>. */
	private Integer _priority;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.removeOnExit</code> attribute defined at extension <code>processing</code>. */
	private Boolean _removeOnExit;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.emailNotificationTemplate</code> attribute defined at extension <code>processing</code>. */
	private RendererTemplateModel _emailNotificationTemplate;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.alternativeDataSourceID</code> attribute defined at extension <code>processing</code>. */
	private String _alternativeDataSourceID;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.processedSteps</code> attribute defined at extension <code>processing</code>. */
	private List<StepModel> _processedSteps;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.pendingSteps</code> attribute defined at extension <code>processing</code>. */
	private List<StepModel> _pendingSteps;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.logs</code> attribute defined at extension <code>processing</code>. */
	private List<JobLogModel> _logs;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.triggers</code> attribute defined at extension <code>processing</code>. */
	private List<TriggerModel> _triggers;
	
	/** <i>Generated variable</i> - Variable of <code>CronJob.job</code> attribute defined at extension <code>processing</code>. */
	private JobModel _job;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CronJobModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CronJobModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 */
	@Deprecated
	public CronJobModel(final JobModel _job)
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
	public CronJobModel(final JobModel _job, final ItemModel _owner)
	{
		super();
		setJob(_job);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.active</code> attribute defined at extension <code>processing</code>. 
	 * @return the active - Whether the CronJob is active (is run when its trigger is due). If set to false, the
	 *                         CronJob will not be executed if its trigger is due
	 */
	public Boolean getActive()
	{
		if (this._active!=null)
		{
			return _active;
		}
		return _active = getPersistenceContext().getValue(ACTIVE, _active);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.alternativeDataSourceID</code> attribute defined at extension <code>processing</code>. 
	 * @return the alternativeDataSourceID
	 */
	public String getAlternativeDataSourceID()
	{
		if (this._alternativeDataSourceID!=null)
		{
			return _alternativeDataSourceID;
		}
		return _alternativeDataSourceID = getPersistenceContext().getValue(ALTERNATIVEDATASOURCEID, _alternativeDataSourceID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.changeRecordingEnabled</code> attribute defined at extension <code>processing</code>. 
	 * @return the changeRecordingEnabled
	 */
	public Boolean getChangeRecordingEnabled()
	{
		if (this._changeRecordingEnabled!=null)
		{
			return _changeRecordingEnabled;
		}
		return _changeRecordingEnabled = getPersistenceContext().getValue(CHANGERECORDINGENABLED, _changeRecordingEnabled);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.changes</code> attribute defined at extension <code>processing</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the changes
	 */
	public Collection<ChangeDescriptorModel> getChanges()
	{
		if (this._changes!=null)
		{
			return _changes;
		}
		return _changes = getPersistenceContext().getValue(CHANGES, _changes);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.code</code> attribute defined at extension <code>processing</code>. 
	 * @return the code - Identifier for the CronJob
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
	 * <i>Generated method</i> - Getter of the <code>CronJob.currentStep</code> attribute defined at extension <code>processing</code>. 
	 * @return the currentStep
	 */
	public StepModel getCurrentStep()
	{
		if (this._currentStep!=null)
		{
			return _currentStep;
		}
		return _currentStep = getPersistenceContext().getValue(CURRENTSTEP, _currentStep);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.emailAddress</code> attribute defined at extension <code>processing</code>. 
	 * @return the emailAddress - The e-mail address to which to send a notification on the CronJob's execution
	 */
	public String getEmailAddress()
	{
		if (this._emailAddress!=null)
		{
			return _emailAddress;
		}
		return _emailAddress = getPersistenceContext().getValue(EMAILADDRESS, _emailAddress);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.emailNotificationTemplate</code> attribute defined at extension <code>processing</code>. 
	 * @return the emailNotificationTemplate
	 */
	public RendererTemplateModel getEmailNotificationTemplate()
	{
		if (this._emailNotificationTemplate!=null)
		{
			return _emailNotificationTemplate;
		}
		return _emailNotificationTemplate = getPersistenceContext().getValue(EMAILNOTIFICATIONTEMPLATE, _emailNotificationTemplate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.endTime</code> attribute defined at extension <code>processing</code>. 
	 * @return the endTime
	 */
	public Date getEndTime()
	{
		if (this._endTime!=null)
		{
			return _endTime;
		}
		return _endTime = getPersistenceContext().getValue(ENDTIME, _endTime);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.errorMode</code> attribute defined at extension <code>processing</code>. 
	 * @return the errorMode - the error mode. @since 2.10
	 */
	public ErrorMode getErrorMode()
	{
		if (this._errorMode!=null)
		{
			return _errorMode;
		}
		return _errorMode = getPersistenceContext().getValue(ERRORMODE, _errorMode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.job</code> attribute defined at extension <code>processing</code>. 
	 * @return the job - References to the Job assigned to the CronJob
	 */
	public JobModel getJob()
	{
		if (this._job!=null)
		{
			return _job;
		}
		return _job = getPersistenceContext().getValue(JOB, _job);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.logFiles</code> attribute defined at extension <code>processing</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the logFiles - A list of log files related to the current CronJob
	 */
	public Collection<LogFileModel> getLogFiles()
	{
		if (this._logFiles!=null)
		{
			return _logFiles;
		}
		return _logFiles = getPersistenceContext().getValue(LOGFILES, _logFiles);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.logLevelDatabase</code> attribute defined at extension <code>processing</code>. 
	 * @return the logLevelDatabase - Specifies the log level for logging to the database
	 */
	public JobLogLevel getLogLevelDatabase()
	{
		if (this._logLevelDatabase!=null)
		{
			return _logLevelDatabase;
		}
		return _logLevelDatabase = getPersistenceContext().getValue(LOGLEVELDATABASE, _logLevelDatabase);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.logLevelFile</code> attribute defined at extension <code>processing</code>. 
	 * @return the logLevelFile - Specifies the log level for logging to the file
	 */
	public JobLogLevel getLogLevelFile()
	{
		if (this._logLevelFile!=null)
		{
			return _logLevelFile;
		}
		return _logLevelFile = getPersistenceContext().getValue(LOGLEVELFILE, _logLevelFile);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.logs</code> attribute defined at extension <code>processing</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the logs - list of jobLogs
	 */
	public List<JobLogModel> getLogs()
	{
		if (this._logs!=null)
		{
			return _logs;
		}
		return _logs = getPersistenceContext().getValue(LOGS, _logs);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.logText</code> attribute defined at extension <code>processing</code>. 
	 * @return the logText
	 */
	public String getLogText()
	{
		if (this._logText!=null)
		{
			return _logText;
		}
		return _logText = getPersistenceContext().getValue(LOGTEXT, _logText);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.logToDatabase</code> attribute defined at extension <code>processing</code>. 
	 * @return the logToDatabase - Whether the CronJob's execution log is written to a log entry in the hybris Suite's
	 *                         database
	 */
	public Boolean getLogToDatabase()
	{
		if (this._logToDatabase!=null)
		{
			return _logToDatabase;
		}
		return _logToDatabase = getPersistenceContext().getValue(LOGTODATABASE, _logToDatabase);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.logToFile</code> attribute defined at extension <code>processing</code>. 
	 * @return the logToFile - Whether the CronJob's execution log is written to a log file
	 */
	public Boolean getLogToFile()
	{
		if (this._logToFile!=null)
		{
			return _logToFile;
		}
		return _logToFile = getPersistenceContext().getValue(LOGTOFILE, _logToFile);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.nodeID</code> attribute defined at extension <code>processing</code>. 
	 * @return the nodeID - The number of the cluster node on which the CronJob is to be run. This setting is
	 *                         relevant for clustered hybris Suite installations only.
	 */
	public Integer getNodeID()
	{
		if (this._nodeID!=null)
		{
			return _nodeID;
		}
		return _nodeID = getPersistenceContext().getValue(NODEID, _nodeID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.pendingSteps</code> attribute defined at extension <code>processing</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the pendingSteps - pending steps
	 */
	public List<StepModel> getPendingSteps()
	{
		if (this._pendingSteps!=null)
		{
			return _pendingSteps;
		}
		return _pendingSteps = getPersistenceContext().getValue(PENDINGSTEPS, _pendingSteps);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.priority</code> attribute defined at extension <code>processing</code>. 
	 * @return the priority - the priority. @since 2.10
	 */
	public Integer getPriority()
	{
		if (this._priority!=null)
		{
			return _priority;
		}
		return _priority = getPersistenceContext().getValue(PRIORITY, _priority);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.processedSteps</code> attribute defined at extension <code>processing</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the processedSteps - processed steps
	 */
	public List<StepModel> getProcessedSteps()
	{
		if (this._processedSteps!=null)
		{
			return _processedSteps;
		}
		return _processedSteps = getPersistenceContext().getValue(PROCESSEDSTEPS, _processedSteps);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.removeOnExit</code> attribute defined at extension <code>processing</code>. 
	 * @return the removeOnExit - If set to true, the CronJob is removed from the hybris Suite after execution
	 */
	public Boolean getRemoveOnExit()
	{
		if (this._removeOnExit!=null)
		{
			return _removeOnExit;
		}
		return _removeOnExit = getPersistenceContext().getValue(REMOVEONEXIT, _removeOnExit);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.requestAbort</code> attribute defined at extension <code>processing</code>. 
	 * @return the requestAbort
	 */
	public Boolean getRequestAbort()
	{
		if (this._requestAbort!=null)
		{
			return _requestAbort;
		}
		return _requestAbort = getPersistenceContext().getValue(REQUESTABORT, _requestAbort);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.requestAbortStep</code> attribute defined at extension <code>processing</code>. 
	 * @return the requestAbortStep
	 */
	public Boolean getRequestAbortStep()
	{
		if (this._requestAbortStep!=null)
		{
			return _requestAbortStep;
		}
		return _requestAbortStep = getPersistenceContext().getValue(REQUESTABORTSTEP, _requestAbortStep);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.result</code> attribute defined at extension <code>processing</code>. 
	 * @return the result - The CronJob's execution result
	 */
	public CronJobResult getResult()
	{
		if (this._result!=null)
		{
			return _result;
		}
		return _result = getPersistenceContext().getValue(RESULT, _result);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.retry</code> attribute defined at extension <code>processing</code>. 
	 * @return the retry - If an assigned job can't be started because of an already running job, a trigger will
	 *                         be created for the the cronjob instance with current time as activation time. This one will be
	 *                         triggerd on next poll repeatedly till the cronjob gets executed once
	 */
	public Boolean getRetry()
	{
		if (this._retry!=null)
		{
			return _retry;
		}
		return _retry = getPersistenceContext().getValue(RETRY, _retry);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.sendEmail</code> attribute defined at extension <code>processing</code>. 
	 * @return the sendEmail - Whether a status e-mail is to be sent after the CronJob's execution
	 */
	public Boolean getSendEmail()
	{
		if (this._sendEmail!=null)
		{
			return _sendEmail;
		}
		return _sendEmail = getPersistenceContext().getValue(SENDEMAIL, _sendEmail);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.sessionCurrency</code> attribute defined at extension <code>processing</code>. 
	 * @return the sessionCurrency - The system currency with which to execute the CronJob
	 */
	public CurrencyModel getSessionCurrency()
	{
		if (this._sessionCurrency!=null)
		{
			return _sessionCurrency;
		}
		return _sessionCurrency = getPersistenceContext().getValue(SESSIONCURRENCY, _sessionCurrency);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.sessionLanguage</code> attribute defined at extension <code>processing</code>. 
	 * @return the sessionLanguage - The system language to execute the CronJob in
	 */
	public LanguageModel getSessionLanguage()
	{
		if (this._sessionLanguage!=null)
		{
			return _sessionLanguage;
		}
		return _sessionLanguage = getPersistenceContext().getValue(SESSIONLANGUAGE, _sessionLanguage);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.sessionUser</code> attribute defined at extension <code>processing</code>. 
	 * @return the sessionUser - The user in whose context (access rights, restrictions, etc) the CronJob will be
	 *                         executed
	 */
	public UserModel getSessionUser()
	{
		if (this._sessionUser!=null)
		{
			return _sessionUser;
		}
		return _sessionUser = getPersistenceContext().getValue(SESSIONUSER, _sessionUser);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.singleExecutable</code> attribute defined at extension <code>processing</code>. 
	 * @return the singleExecutable - If the assigned TriggerableJob instance can not be performed yet, a new Trigger for
	 *                         this CronJob will be created
	 */
	public Boolean getSingleExecutable()
	{
		if (this._singleExecutable!=null)
		{
			return _singleExecutable;
		}
		return _singleExecutable = getPersistenceContext().getValue(SINGLEEXECUTABLE, _singleExecutable);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.startTime</code> attribute defined at extension <code>processing</code>. 
	 * @return the startTime
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
	 * <i>Generated method</i> - Getter of the <code>CronJob.status</code> attribute defined at extension <code>processing</code>. 
	 * @return the status - The CronJob's execution status
	 */
	public CronJobStatus getStatus()
	{
		if (this._status!=null)
		{
			return _status;
		}
		return _status = getPersistenceContext().getValue(STATUS, _status);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.timeTable</code> dynamic attribute defined at extension <code>processing</code>. 
	 * @return the timeTable
	 */
	public String getTimeTable()
	{
		return getPersistenceContext().getDynamicValue(this,TIMETABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.triggers</code> attribute defined at extension <code>processing</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the triggers - list of triggers
	 */
	public List<TriggerModel> getTriggers()
	{
		if (this._triggers!=null)
		{
			return _triggers;
		}
		return _triggers = getPersistenceContext().getValue(TRIGGERS, _triggers);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CronJob.active</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the active - Whether the CronJob is active (is run when its trigger is due). If set to false, the
	 *                         CronJob will not be executed if its trigger is due
	 */
	public void setActive(final Boolean value)
	{
		_active = getPersistenceContext().setValue(ACTIVE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CronJob.alternativeDataSourceID</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the alternativeDataSourceID
	 */
	public void setAlternativeDataSourceID(final String value)
	{
		_alternativeDataSourceID = getPersistenceContext().setValue(ALTERNATIVEDATASOURCEID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CronJob.changeRecordingEnabled</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the changeRecordingEnabled
	 */
	public void setChangeRecordingEnabled(final Boolean value)
	{
		_changeRecordingEnabled = getPersistenceContext().setValue(CHANGERECORDINGENABLED, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CronJob.code</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the code - Identifier for the CronJob
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CronJob.emailAddress</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the emailAddress - The e-mail address to which to send a notification on the CronJob's execution
	 */
	public void setEmailAddress(final String value)
	{
		_emailAddress = getPersistenceContext().setValue(EMAILADDRESS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CronJob.emailNotificationTemplate</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the emailNotificationTemplate
	 */
	public void setEmailNotificationTemplate(final RendererTemplateModel value)
	{
		_emailNotificationTemplate = getPersistenceContext().setValue(EMAILNOTIFICATIONTEMPLATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CronJob.endTime</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the endTime
	 */
	public void setEndTime(final Date value)
	{
		_endTime = getPersistenceContext().setValue(ENDTIME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CronJob.errorMode</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the errorMode - the error mode. @since 2.10
	 */
	public void setErrorMode(final ErrorMode value)
	{
		_errorMode = getPersistenceContext().setValue(ERRORMODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>CronJob.job</code> attribute defined at extension <code>processing</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the job - References to the Job assigned to the CronJob
	 */
	public void setJob(final JobModel value)
	{
		_job = getPersistenceContext().setValue(JOB, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CronJob.logFiles</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the logFiles - A list of log files related to the current CronJob
	 */
	public void setLogFiles(final Collection<LogFileModel> value)
	{
		_logFiles = getPersistenceContext().setValue(LOGFILES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CronJob.logLevelDatabase</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the logLevelDatabase - Specifies the log level for logging to the database
	 */
	public void setLogLevelDatabase(final JobLogLevel value)
	{
		_logLevelDatabase = getPersistenceContext().setValue(LOGLEVELDATABASE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CronJob.logLevelFile</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the logLevelFile - Specifies the log level for logging to the file
	 */
	public void setLogLevelFile(final JobLogLevel value)
	{
		_logLevelFile = getPersistenceContext().setValue(LOGLEVELFILE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CronJob.logToDatabase</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the logToDatabase - Whether the CronJob's execution log is written to a log entry in the hybris Suite's
	 *                         database
	 */
	public void setLogToDatabase(final Boolean value)
	{
		_logToDatabase = getPersistenceContext().setValue(LOGTODATABASE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CronJob.logToFile</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the logToFile - Whether the CronJob's execution log is written to a log file
	 */
	public void setLogToFile(final Boolean value)
	{
		_logToFile = getPersistenceContext().setValue(LOGTOFILE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CronJob.nodeID</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the nodeID - The number of the cluster node on which the CronJob is to be run. This setting is
	 *                         relevant for clustered hybris Suite installations only.
	 */
	public void setNodeID(final Integer value)
	{
		_nodeID = getPersistenceContext().setValue(NODEID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CronJob.pendingSteps</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the pendingSteps - pending steps
	 */
	public void setPendingSteps(final List<StepModel> value)
	{
		_pendingSteps = getPersistenceContext().setValue(PENDINGSTEPS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CronJob.priority</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the priority - the priority. @since 2.10
	 */
	public void setPriority(final Integer value)
	{
		_priority = getPersistenceContext().setValue(PRIORITY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CronJob.processedSteps</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the processedSteps - processed steps
	 */
	public void setProcessedSteps(final List<StepModel> value)
	{
		_processedSteps = getPersistenceContext().setValue(PROCESSEDSTEPS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CronJob.removeOnExit</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the removeOnExit - If set to true, the CronJob is removed from the hybris Suite after execution
	 */
	public void setRemoveOnExit(final Boolean value)
	{
		_removeOnExit = getPersistenceContext().setValue(REMOVEONEXIT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CronJob.requestAbort</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the requestAbort
	 */
	public void setRequestAbort(final Boolean value)
	{
		_requestAbort = getPersistenceContext().setValue(REQUESTABORT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CronJob.requestAbortStep</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the requestAbortStep
	 */
	public void setRequestAbortStep(final Boolean value)
	{
		_requestAbortStep = getPersistenceContext().setValue(REQUESTABORTSTEP, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CronJob.result</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the result - The CronJob's execution result
	 */
	public void setResult(final CronJobResult value)
	{
		_result = getPersistenceContext().setValue(RESULT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CronJob.retry</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the retry - If an assigned job can't be started because of an already running job, a trigger will
	 *                         be created for the the cronjob instance with current time as activation time. This one will be
	 *                         triggerd on next poll repeatedly till the cronjob gets executed once
	 */
	public void setRetry(final Boolean value)
	{
		_retry = getPersistenceContext().setValue(RETRY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CronJob.sendEmail</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the sendEmail - Whether a status e-mail is to be sent after the CronJob's execution
	 */
	public void setSendEmail(final Boolean value)
	{
		_sendEmail = getPersistenceContext().setValue(SENDEMAIL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CronJob.sessionCurrency</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the sessionCurrency - The system currency with which to execute the CronJob
	 */
	public void setSessionCurrency(final CurrencyModel value)
	{
		_sessionCurrency = getPersistenceContext().setValue(SESSIONCURRENCY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CronJob.sessionLanguage</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the sessionLanguage - The system language to execute the CronJob in
	 */
	public void setSessionLanguage(final LanguageModel value)
	{
		_sessionLanguage = getPersistenceContext().setValue(SESSIONLANGUAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CronJob.sessionUser</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the sessionUser - The user in whose context (access rights, restrictions, etc) the CronJob will be
	 *                         executed
	 */
	public void setSessionUser(final UserModel value)
	{
		_sessionUser = getPersistenceContext().setValue(SESSIONUSER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CronJob.singleExecutable</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the singleExecutable - If the assigned TriggerableJob instance can not be performed yet, a new Trigger for
	 *                         this CronJob will be created
	 */
	public void setSingleExecutable(final Boolean value)
	{
		_singleExecutable = getPersistenceContext().setValue(SINGLEEXECUTABLE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CronJob.startTime</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the startTime
	 */
	public void setStartTime(final Date value)
	{
		_startTime = getPersistenceContext().setValue(STARTTIME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CronJob.status</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the status - The CronJob's execution status
	 */
	public void setStatus(final CronJobStatus value)
	{
		_status = getPersistenceContext().setValue(STATUS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CronJob.triggers</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the triggers - list of triggers
	 */
	public void setTriggers(final List<TriggerModel> value)
	{
		_triggers = getPersistenceContext().setValue(TRIGGERS, value);
	}
	
}
