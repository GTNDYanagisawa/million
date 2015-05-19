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
import de.hybris.platform.cronjob.enums.ErrorMode;
import de.hybris.platform.cronjob.enums.JobLogLevel;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.cronjob.model.JobSearchRestrictionModel;
import de.hybris.platform.cronjob.model.TriggerModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.List;

/**
 * Generated model class for type Job first defined at extension processing.
 */
@SuppressWarnings("all")
public class JobModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "Job";
	
	/** <i>Generated constant</i> - Attribute key of <code>Job.code</code> attribute defined at extension <code>processing</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>Job.nodeID</code> attribute defined at extension <code>processing</code>. */
	public static final String NODEID = "nodeID";
	
	/** <i>Generated constant</i> - Attribute key of <code>Job.errorMode</code> attribute defined at extension <code>processing</code>. */
	public static final String ERRORMODE = "errorMode";
	
	/** <i>Generated constant</i> - Attribute key of <code>Job.logToFile</code> attribute defined at extension <code>processing</code>. */
	public static final String LOGTOFILE = "logToFile";
	
	/** <i>Generated constant</i> - Attribute key of <code>Job.logToDatabase</code> attribute defined at extension <code>processing</code>. */
	public static final String LOGTODATABASE = "logToDatabase";
	
	/** <i>Generated constant</i> - Attribute key of <code>Job.logLevelFile</code> attribute defined at extension <code>processing</code>. */
	public static final String LOGLEVELFILE = "logLevelFile";
	
	/** <i>Generated constant</i> - Attribute key of <code>Job.logLevelDatabase</code> attribute defined at extension <code>processing</code>. */
	public static final String LOGLEVELDATABASE = "logLevelDatabase";
	
	/** <i>Generated constant</i> - Attribute key of <code>Job.sessionUser</code> attribute defined at extension <code>processing</code>. */
	public static final String SESSIONUSER = "sessionUser";
	
	/** <i>Generated constant</i> - Attribute key of <code>Job.sessionLanguage</code> attribute defined at extension <code>processing</code>. */
	public static final String SESSIONLANGUAGE = "sessionLanguage";
	
	/** <i>Generated constant</i> - Attribute key of <code>Job.sessionCurrency</code> attribute defined at extension <code>processing</code>. */
	public static final String SESSIONCURRENCY = "sessionCurrency";
	
	/** <i>Generated constant</i> - Attribute key of <code>Job.active</code> attribute defined at extension <code>processing</code>. */
	public static final String ACTIVE = "active";
	
	/** <i>Generated constant</i> - Attribute key of <code>Job.retry</code> attribute defined at extension <code>processing</code>. */
	public static final String RETRY = "retry";
	
	/** <i>Generated constant</i> - Attribute key of <code>Job.singleExecutable</code> attribute defined at extension <code>processing</code>. */
	public static final String SINGLEEXECUTABLE = "singleExecutable";
	
	/** <i>Generated constant</i> - Attribute key of <code>Job.emailAddress</code> attribute defined at extension <code>processing</code>. */
	public static final String EMAILADDRESS = "emailAddress";
	
	/** <i>Generated constant</i> - Attribute key of <code>Job.sendEmail</code> attribute defined at extension <code>processing</code>. */
	public static final String SENDEMAIL = "sendEmail";
	
	/** <i>Generated constant</i> - Attribute key of <code>Job.changeRecordingEnabled</code> attribute defined at extension <code>processing</code>. */
	public static final String CHANGERECORDINGENABLED = "changeRecordingEnabled";
	
	/** <i>Generated constant</i> - Attribute key of <code>Job.requestAbort</code> attribute defined at extension <code>processing</code>. */
	public static final String REQUESTABORT = "requestAbort";
	
	/** <i>Generated constant</i> - Attribute key of <code>Job.requestAbortStep</code> attribute defined at extension <code>processing</code>. */
	public static final String REQUESTABORTSTEP = "requestAbortStep";
	
	/** <i>Generated constant</i> - Attribute key of <code>Job.priority</code> attribute defined at extension <code>processing</code>. */
	public static final String PRIORITY = "priority";
	
	/** <i>Generated constant</i> - Attribute key of <code>Job.removeOnExit</code> attribute defined at extension <code>processing</code>. */
	public static final String REMOVEONEXIT = "removeOnExit";
	
	/** <i>Generated constant</i> - Attribute key of <code>Job.emailNotificationTemplate</code> attribute defined at extension <code>processing</code>. */
	public static final String EMAILNOTIFICATIONTEMPLATE = "emailNotificationTemplate";
	
	/** <i>Generated constant</i> - Attribute key of <code>Job.alternativeDataSourceID</code> attribute defined at extension <code>processing</code>. */
	public static final String ALTERNATIVEDATASOURCEID = "alternativeDataSourceID";
	
	/** <i>Generated constant</i> - Attribute key of <code>Job.restrictions</code> attribute defined at extension <code>processing</code>. */
	public static final String RESTRICTIONS = "restrictions";
	
	/** <i>Generated constant</i> - Attribute key of <code>Job.triggers</code> attribute defined at extension <code>processing</code>. */
	public static final String TRIGGERS = "triggers";
	
	/** <i>Generated constant</i> - Attribute key of <code>Job.cronJobs</code> attribute defined at extension <code>processing</code>. */
	public static final String CRONJOBS = "cronJobs";
	
	
	/** <i>Generated variable</i> - Variable of <code>Job.code</code> attribute defined at extension <code>processing</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>Job.nodeID</code> attribute defined at extension <code>processing</code>. */
	private Integer _nodeID;
	
	/** <i>Generated variable</i> - Variable of <code>Job.errorMode</code> attribute defined at extension <code>processing</code>. */
	private ErrorMode _errorMode;
	
	/** <i>Generated variable</i> - Variable of <code>Job.logToFile</code> attribute defined at extension <code>processing</code>. */
	private Boolean _logToFile;
	
	/** <i>Generated variable</i> - Variable of <code>Job.logToDatabase</code> attribute defined at extension <code>processing</code>. */
	private Boolean _logToDatabase;
	
	/** <i>Generated variable</i> - Variable of <code>Job.logLevelFile</code> attribute defined at extension <code>processing</code>. */
	private JobLogLevel _logLevelFile;
	
	/** <i>Generated variable</i> - Variable of <code>Job.logLevelDatabase</code> attribute defined at extension <code>processing</code>. */
	private JobLogLevel _logLevelDatabase;
	
	/** <i>Generated variable</i> - Variable of <code>Job.sessionUser</code> attribute defined at extension <code>processing</code>. */
	private UserModel _sessionUser;
	
	/** <i>Generated variable</i> - Variable of <code>Job.sessionLanguage</code> attribute defined at extension <code>processing</code>. */
	private LanguageModel _sessionLanguage;
	
	/** <i>Generated variable</i> - Variable of <code>Job.sessionCurrency</code> attribute defined at extension <code>processing</code>. */
	private CurrencyModel _sessionCurrency;
	
	/** <i>Generated variable</i> - Variable of <code>Job.active</code> attribute defined at extension <code>processing</code>. */
	private Boolean _active;
	
	/** <i>Generated variable</i> - Variable of <code>Job.retry</code> attribute defined at extension <code>processing</code>. */
	private Boolean _retry;
	
	/** <i>Generated variable</i> - Variable of <code>Job.singleExecutable</code> attribute defined at extension <code>processing</code>. */
	private Boolean _singleExecutable;
	
	/** <i>Generated variable</i> - Variable of <code>Job.emailAddress</code> attribute defined at extension <code>processing</code>. */
	private String _emailAddress;
	
	/** <i>Generated variable</i> - Variable of <code>Job.sendEmail</code> attribute defined at extension <code>processing</code>. */
	private Boolean _sendEmail;
	
	/** <i>Generated variable</i> - Variable of <code>Job.changeRecordingEnabled</code> attribute defined at extension <code>processing</code>. */
	private Boolean _changeRecordingEnabled;
	
	/** <i>Generated variable</i> - Variable of <code>Job.requestAbort</code> attribute defined at extension <code>processing</code>. */
	private Boolean _requestAbort;
	
	/** <i>Generated variable</i> - Variable of <code>Job.requestAbortStep</code> attribute defined at extension <code>processing</code>. */
	private Boolean _requestAbortStep;
	
	/** <i>Generated variable</i> - Variable of <code>Job.priority</code> attribute defined at extension <code>processing</code>. */
	private Integer _priority;
	
	/** <i>Generated variable</i> - Variable of <code>Job.removeOnExit</code> attribute defined at extension <code>processing</code>. */
	private Boolean _removeOnExit;
	
	/** <i>Generated variable</i> - Variable of <code>Job.emailNotificationTemplate</code> attribute defined at extension <code>processing</code>. */
	private RendererTemplateModel _emailNotificationTemplate;
	
	/** <i>Generated variable</i> - Variable of <code>Job.alternativeDataSourceID</code> attribute defined at extension <code>processing</code>. */
	private String _alternativeDataSourceID;
	
	/** <i>Generated variable</i> - Variable of <code>Job.restrictions</code> attribute defined at extension <code>processing</code>. */
	private List<JobSearchRestrictionModel> _restrictions;
	
	/** <i>Generated variable</i> - Variable of <code>Job.triggers</code> attribute defined at extension <code>processing</code>. */
	private List<TriggerModel> _triggers;
	
	/** <i>Generated variable</i> - Variable of <code>Job.cronJobs</code> attribute defined at extension <code>processing</code>. */
	private Collection<CronJobModel> _cronJobs;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public JobModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public JobModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>Job</code> at extension <code>processing</code>
	 */
	@Deprecated
	public JobModel(final String _code)
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
	public JobModel(final String _code, final Integer _nodeID, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setNodeID(_nodeID);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Job.active</code> attribute defined at extension <code>processing</code>. 
	 * @return the active
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
	 * <i>Generated method</i> - Getter of the <code>Job.alternativeDataSourceID</code> attribute defined at extension <code>processing</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Job.changeRecordingEnabled</code> attribute defined at extension <code>processing</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Job.code</code> attribute defined at extension <code>processing</code>. 
	 * @return the code
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
	 * <i>Generated method</i> - Getter of the <code>Job.cronJobs</code> attribute defined at extension <code>processing</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the cronJobs - CronJobs the job is assigned to
	 */
	public Collection<CronJobModel> getCronJobs()
	{
		if (this._cronJobs!=null)
		{
			return _cronJobs;
		}
		return _cronJobs = getPersistenceContext().getValue(CRONJOBS, _cronJobs);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Job.emailAddress</code> attribute defined at extension <code>processing</code>. 
	 * @return the emailAddress
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
	 * <i>Generated method</i> - Getter of the <code>Job.emailNotificationTemplate</code> attribute defined at extension <code>processing</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Job.errorMode</code> attribute defined at extension <code>processing</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Job.logLevelDatabase</code> attribute defined at extension <code>processing</code>. 
	 * @return the logLevelDatabase
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
	 * <i>Generated method</i> - Getter of the <code>Job.logLevelFile</code> attribute defined at extension <code>processing</code>. 
	 * @return the logLevelFile
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
	 * <i>Generated method</i> - Getter of the <code>Job.logToDatabase</code> attribute defined at extension <code>processing</code>. 
	 * @return the logToDatabase
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
	 * <i>Generated method</i> - Getter of the <code>Job.logToFile</code> attribute defined at extension <code>processing</code>. 
	 * @return the logToFile
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
	 * <i>Generated method</i> - Getter of the <code>Job.nodeID</code> attribute defined at extension <code>processing</code>. 
	 * @return the nodeID - Node ID
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
	 * <i>Generated method</i> - Getter of the <code>Job.priority</code> attribute defined at extension <code>processing</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Job.removeOnExit</code> attribute defined at extension <code>processing</code>. 
	 * @return the removeOnExit
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
	 * <i>Generated method</i> - Getter of the <code>Job.requestAbort</code> attribute defined at extension <code>processing</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Job.requestAbortStep</code> attribute defined at extension <code>processing</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Job.restrictions</code> attribute defined at extension <code>processing</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the restrictions - processed steps
	 */
	public List<JobSearchRestrictionModel> getRestrictions()
	{
		if (this._restrictions!=null)
		{
			return _restrictions;
		}
		return _restrictions = getPersistenceContext().getValue(RESTRICTIONS, _restrictions);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Job.retry</code> attribute defined at extension <code>processing</code>. 
	 * @return the retry
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
	 * <i>Generated method</i> - Getter of the <code>Job.sendEmail</code> attribute defined at extension <code>processing</code>. 
	 * @return the sendEmail
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
	 * <i>Generated method</i> - Getter of the <code>Job.sessionCurrency</code> attribute defined at extension <code>processing</code>. 
	 * @return the sessionCurrency
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
	 * <i>Generated method</i> - Getter of the <code>Job.sessionLanguage</code> attribute defined at extension <code>processing</code>. 
	 * @return the sessionLanguage
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
	 * <i>Generated method</i> - Getter of the <code>Job.sessionUser</code> attribute defined at extension <code>processing</code>. 
	 * @return the sessionUser
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
	 * <i>Generated method</i> - Getter of the <code>Job.singleExecutable</code> attribute defined at extension <code>processing</code>. 
	 * @return the singleExecutable
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
	 * <i>Generated method</i> - Getter of the <code>Job.triggers</code> attribute defined at extension <code>processing</code>. 
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
	 * <i>Generated method</i> - Setter of <code>Job.active</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the active
	 */
	public void setActive(final Boolean value)
	{
		_active = getPersistenceContext().setValue(ACTIVE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Job.alternativeDataSourceID</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the alternativeDataSourceID
	 */
	public void setAlternativeDataSourceID(final String value)
	{
		_alternativeDataSourceID = getPersistenceContext().setValue(ALTERNATIVEDATASOURCEID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Job.changeRecordingEnabled</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the changeRecordingEnabled
	 */
	public void setChangeRecordingEnabled(final Boolean value)
	{
		_changeRecordingEnabled = getPersistenceContext().setValue(CHANGERECORDINGENABLED, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Job.code</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Job.emailAddress</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the emailAddress
	 */
	public void setEmailAddress(final String value)
	{
		_emailAddress = getPersistenceContext().setValue(EMAILADDRESS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Job.emailNotificationTemplate</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the emailNotificationTemplate
	 */
	public void setEmailNotificationTemplate(final RendererTemplateModel value)
	{
		_emailNotificationTemplate = getPersistenceContext().setValue(EMAILNOTIFICATIONTEMPLATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Job.errorMode</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the errorMode - the error mode. @since 2.10
	 */
	public void setErrorMode(final ErrorMode value)
	{
		_errorMode = getPersistenceContext().setValue(ERRORMODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Job.logLevelDatabase</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the logLevelDatabase
	 */
	public void setLogLevelDatabase(final JobLogLevel value)
	{
		_logLevelDatabase = getPersistenceContext().setValue(LOGLEVELDATABASE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Job.logLevelFile</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the logLevelFile
	 */
	public void setLogLevelFile(final JobLogLevel value)
	{
		_logLevelFile = getPersistenceContext().setValue(LOGLEVELFILE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Job.logToDatabase</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the logToDatabase
	 */
	public void setLogToDatabase(final Boolean value)
	{
		_logToDatabase = getPersistenceContext().setValue(LOGTODATABASE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Job.logToFile</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the logToFile
	 */
	public void setLogToFile(final Boolean value)
	{
		_logToFile = getPersistenceContext().setValue(LOGTOFILE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>Job.nodeID</code> attribute defined at extension <code>processing</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the nodeID - Node ID
	 */
	public void setNodeID(final Integer value)
	{
		_nodeID = getPersistenceContext().setValue(NODEID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Job.priority</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the priority - the priority. @since 2.10
	 */
	public void setPriority(final Integer value)
	{
		_priority = getPersistenceContext().setValue(PRIORITY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Job.removeOnExit</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the removeOnExit
	 */
	public void setRemoveOnExit(final Boolean value)
	{
		_removeOnExit = getPersistenceContext().setValue(REMOVEONEXIT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Job.requestAbort</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the requestAbort
	 */
	public void setRequestAbort(final Boolean value)
	{
		_requestAbort = getPersistenceContext().setValue(REQUESTABORT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Job.requestAbortStep</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the requestAbortStep
	 */
	public void setRequestAbortStep(final Boolean value)
	{
		_requestAbortStep = getPersistenceContext().setValue(REQUESTABORTSTEP, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Job.restrictions</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the restrictions - processed steps
	 */
	public void setRestrictions(final List<JobSearchRestrictionModel> value)
	{
		_restrictions = getPersistenceContext().setValue(RESTRICTIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Job.retry</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the retry
	 */
	public void setRetry(final Boolean value)
	{
		_retry = getPersistenceContext().setValue(RETRY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Job.sendEmail</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the sendEmail
	 */
	public void setSendEmail(final Boolean value)
	{
		_sendEmail = getPersistenceContext().setValue(SENDEMAIL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Job.sessionCurrency</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the sessionCurrency
	 */
	public void setSessionCurrency(final CurrencyModel value)
	{
		_sessionCurrency = getPersistenceContext().setValue(SESSIONCURRENCY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Job.sessionLanguage</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the sessionLanguage
	 */
	public void setSessionLanguage(final LanguageModel value)
	{
		_sessionLanguage = getPersistenceContext().setValue(SESSIONLANGUAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Job.sessionUser</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the sessionUser
	 */
	public void setSessionUser(final UserModel value)
	{
		_sessionUser = getPersistenceContext().setValue(SESSIONUSER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Job.singleExecutable</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the singleExecutable
	 */
	public void setSingleExecutable(final Boolean value)
	{
		_singleExecutable = getPersistenceContext().setValue(SINGLEEXECUTABLE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Job.triggers</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the triggers - list of triggers
	 */
	public void setTriggers(final List<TriggerModel> value)
	{
		_triggers = getPersistenceContext().setValue(TRIGGERS, value);
	}
	
}
