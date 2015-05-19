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
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.print.enums.DeleteAutoCometJob;
import de.hybris.platform.print.enums.PDFPresetEnum;
import de.hybris.platform.print.model.CometConfigurationModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Date;

/**
 * Generated model class for type AutoCometJob first defined at extension print.
 */
@SuppressWarnings("all")
public class AutoCometJobModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "AutoCometJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>AutoCometJob.id</code> attribute defined at extension <code>print</code>. */
	public static final String ID = "id";
	
	/** <i>Generated constant</i> - Attribute key of <code>AutoCometJob.name</code> attribute defined at extension <code>print</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>AutoCometJob.command</code> attribute defined at extension <code>print</code>. */
	public static final String COMMAND = "command";
	
	/** <i>Generated constant</i> - Attribute key of <code>AutoCometJob.commandId</code> attribute defined at extension <code>print</code>. */
	public static final String COMMANDID = "commandId";
	
	/** <i>Generated constant</i> - Attribute key of <code>AutoCometJob.objectId</code> attribute defined at extension <code>print</code>. */
	public static final String OBJECTID = "objectId";
	
	/** <i>Generated constant</i> - Attribute key of <code>AutoCometJob.pdfPreset</code> attribute defined at extension <code>print</code>. */
	public static final String PDFPRESET = "pdfPreset";
	
	/** <i>Generated constant</i> - Attribute key of <code>AutoCometJob.clientLanguage</code> attribute defined at extension <code>print</code>. */
	public static final String CLIENTLANGUAGE = "clientLanguage";
	
	/** <i>Generated constant</i> - Attribute key of <code>AutoCometJob.configuration</code> attribute defined at extension <code>print</code>. */
	public static final String CONFIGURATION = "configuration";
	
	/** <i>Generated constant</i> - Attribute key of <code>AutoCometJob.priority</code> attribute defined at extension <code>print</code>. */
	public static final String PRIORITY = "priority";
	
	/** <i>Generated constant</i> - Attribute key of <code>AutoCometJob.doAgain</code> attribute defined at extension <code>print</code>. */
	public static final String DOAGAIN = "doAgain";
	
	/** <i>Generated constant</i> - Attribute key of <code>AutoCometJob.delay</code> attribute defined at extension <code>print</code>. */
	public static final String DELAY = "delay";
	
	/** <i>Generated constant</i> - Attribute key of <code>AutoCometJob.startTime</code> attribute defined at extension <code>print</code>. */
	public static final String STARTTIME = "startTime";
	
	/** <i>Generated constant</i> - Attribute key of <code>AutoCometJob.endTime</code> attribute defined at extension <code>print</code>. */
	public static final String ENDTIME = "endTime";
	
	/** <i>Generated constant</i> - Attribute key of <code>AutoCometJob.statusId</code> attribute defined at extension <code>print</code>. */
	public static final String STATUSID = "statusId";
	
	/** <i>Generated constant</i> - Attribute key of <code>AutoCometJob.duration</code> attribute defined at extension <code>print</code>. */
	public static final String DURATION = "duration";
	
	/** <i>Generated constant</i> - Attribute key of <code>AutoCometJob.contextItem</code> attribute defined at extension <code>print</code>. */
	public static final String CONTEXTITEM = "contextItem";
	
	/** <i>Generated constant</i> - Attribute key of <code>AutoCometJob.destroyJob</code> attribute defined at extension <code>print</code>. */
	public static final String DESTROYJOB = "destroyJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>AutoCometJob.serverTemplatePath</code> attribute defined at extension <code>print</code>. */
	public static final String SERVERTEMPLATEPATH = "serverTemplatePath";
	
	/** <i>Generated constant</i> - Attribute key of <code>AutoCometJob.templateFileName</code> attribute defined at extension <code>print</code>. */
	public static final String TEMPLATEFILENAME = "templateFileName";
	
	/** <i>Generated constant</i> - Attribute key of <code>AutoCometJob.templatePath</code> attribute defined at extension <code>print</code>. */
	public static final String TEMPLATEPATH = "templatePath";
	
	/** <i>Generated constant</i> - Attribute key of <code>AutoCometJob.serverWorkingPath</code> attribute defined at extension <code>print</code>. */
	public static final String SERVERWORKINGPATH = "serverWorkingPath";
	
	/** <i>Generated constant</i> - Attribute key of <code>AutoCometJob.objectFileNameInternal</code> attribute defined at extension <code>print</code>. */
	public static final String OBJECTFILENAMEINTERNAL = "objectFileNameInternal";
	
	/** <i>Generated constant</i> - Attribute key of <code>AutoCometJob.objectFileName</code> attribute defined at extension <code>print</code>. */
	public static final String OBJECTFILENAME = "objectFileName";
	
	/** <i>Generated constant</i> - Attribute key of <code>AutoCometJob.objectPath</code> attribute defined at extension <code>print</code>. */
	public static final String OBJECTPATH = "objectPath";
	
	/** <i>Generated constant</i> - Attribute key of <code>AutoCometJob.pagePreviewSize</code> attribute defined at extension <code>print</code>. */
	public static final String PAGEPREVIEWSIZE = "pagePreviewSize";
	
	
	/** <i>Generated variable</i> - Variable of <code>AutoCometJob.id</code> attribute defined at extension <code>print</code>. */
	private Integer _id;
	
	/** <i>Generated variable</i> - Variable of <code>AutoCometJob.name</code> attribute defined at extension <code>print</code>. */
	private String _name;
	
	/** <i>Generated variable</i> - Variable of <code>AutoCometJob.command</code> attribute defined at extension <code>print</code>. */
	private String _command;
	
	/** <i>Generated variable</i> - Variable of <code>AutoCometJob.commandId</code> attribute defined at extension <code>print</code>. */
	private Integer _commandId;
	
	/** <i>Generated variable</i> - Variable of <code>AutoCometJob.objectId</code> attribute defined at extension <code>print</code>. */
	private Integer _objectId;
	
	/** <i>Generated variable</i> - Variable of <code>AutoCometJob.pdfPreset</code> attribute defined at extension <code>print</code>. */
	private PDFPresetEnum _pdfPreset;
	
	/** <i>Generated variable</i> - Variable of <code>AutoCometJob.clientLanguage</code> attribute defined at extension <code>print</code>. */
	private LanguageModel _clientLanguage;
	
	/** <i>Generated variable</i> - Variable of <code>AutoCometJob.configuration</code> attribute defined at extension <code>print</code>. */
	private CometConfigurationModel _configuration;
	
	/** <i>Generated variable</i> - Variable of <code>AutoCometJob.priority</code> attribute defined at extension <code>print</code>. */
	private Integer _priority;
	
	/** <i>Generated variable</i> - Variable of <code>AutoCometJob.doAgain</code> attribute defined at extension <code>print</code>. */
	private Boolean _doAgain;
	
	/** <i>Generated variable</i> - Variable of <code>AutoCometJob.delay</code> attribute defined at extension <code>print</code>. */
	private Integer _delay;
	
	/** <i>Generated variable</i> - Variable of <code>AutoCometJob.startTime</code> attribute defined at extension <code>print</code>. */
	private Date _startTime;
	
	/** <i>Generated variable</i> - Variable of <code>AutoCometJob.endTime</code> attribute defined at extension <code>print</code>. */
	private Date _endTime;
	
	/** <i>Generated variable</i> - Variable of <code>AutoCometJob.statusId</code> attribute defined at extension <code>print</code>. */
	private Integer _statusId;
	
	/** <i>Generated variable</i> - Variable of <code>AutoCometJob.duration</code> attribute defined at extension <code>print</code>. */
	private String _duration;
	
	/** <i>Generated variable</i> - Variable of <code>AutoCometJob.contextItem</code> attribute defined at extension <code>print</code>. */
	private ItemModel _contextItem;
	
	/** <i>Generated variable</i> - Variable of <code>AutoCometJob.destroyJob</code> attribute defined at extension <code>print</code>. */
	private DeleteAutoCometJob _destroyJob;
	
	/** <i>Generated variable</i> - Variable of <code>AutoCometJob.serverTemplatePath</code> attribute defined at extension <code>print</code>. */
	private String _serverTemplatePath;
	
	/** <i>Generated variable</i> - Variable of <code>AutoCometJob.templateFileName</code> attribute defined at extension <code>print</code>. */
	private String _templateFileName;
	
	/** <i>Generated variable</i> - Variable of <code>AutoCometJob.templatePath</code> attribute defined at extension <code>print</code>. */
	private String _templatePath;
	
	/** <i>Generated variable</i> - Variable of <code>AutoCometJob.serverWorkingPath</code> attribute defined at extension <code>print</code>. */
	private String _serverWorkingPath;
	
	/** <i>Generated variable</i> - Variable of <code>AutoCometJob.objectFileNameInternal</code> attribute defined at extension <code>print</code>. */
	private String _objectFileNameInternal;
	
	/** <i>Generated variable</i> - Variable of <code>AutoCometJob.objectFileName</code> attribute defined at extension <code>print</code>. */
	private String _objectFileName;
	
	/** <i>Generated variable</i> - Variable of <code>AutoCometJob.objectPath</code> attribute defined at extension <code>print</code>. */
	private String _objectPath;
	
	/** <i>Generated variable</i> - Variable of <code>AutoCometJob.pagePreviewSize</code> attribute defined at extension <code>print</code>. */
	private Integer _pagePreviewSize;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AutoCometJobModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AutoCometJobModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _id initial attribute declared by type <code>AutoCometJob</code> at extension <code>print</code>
	 */
	@Deprecated
	public AutoCometJobModel(final Integer _id)
	{
		super();
		setId(_id);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _id initial attribute declared by type <code>AutoCometJob</code> at extension <code>print</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public AutoCometJobModel(final Integer _id, final ItemModel _owner)
	{
		super();
		setId(_id);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AutoCometJob.clientLanguage</code> attribute defined at extension <code>print</code>. 
	 * @return the clientLanguage
	 */
	public LanguageModel getClientLanguage()
	{
		if (this._clientLanguage!=null)
		{
			return _clientLanguage;
		}
		return _clientLanguage = getPersistenceContext().getValue(CLIENTLANGUAGE, _clientLanguage);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AutoCometJob.command</code> attribute defined at extension <code>print</code>. 
	 * @return the command
	 */
	public String getCommand()
	{
		if (this._command!=null)
		{
			return _command;
		}
		return _command = getPersistenceContext().getValue(COMMAND, _command);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AutoCometJob.commandId</code> attribute defined at extension <code>print</code>. 
	 * @return the commandId
	 */
	public Integer getCommandId()
	{
		if (this._commandId!=null)
		{
			return _commandId;
		}
		return _commandId = getPersistenceContext().getValue(COMMANDID, _commandId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AutoCometJob.configuration</code> attribute defined at extension <code>print</code>. 
	 * @return the configuration
	 */
	public CometConfigurationModel getConfiguration()
	{
		if (this._configuration!=null)
		{
			return _configuration;
		}
		return _configuration = getPersistenceContext().getValue(CONFIGURATION, _configuration);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AutoCometJob.contextItem</code> attribute defined at extension <code>print</code>. 
	 * @return the contextItem
	 */
	public ItemModel getContextItem()
	{
		if (this._contextItem!=null)
		{
			return _contextItem;
		}
		return _contextItem = getPersistenceContext().getValue(CONTEXTITEM, _contextItem);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AutoCometJob.delay</code> attribute defined at extension <code>print</code>. 
	 * @return the delay
	 */
	public Integer getDelay()
	{
		if (this._delay!=null)
		{
			return _delay;
		}
		return _delay = getPersistenceContext().getValue(DELAY, _delay);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AutoCometJob.destroyJob</code> attribute defined at extension <code>print</code>. 
	 * @return the destroyJob
	 */
	public DeleteAutoCometJob getDestroyJob()
	{
		if (this._destroyJob!=null)
		{
			return _destroyJob;
		}
		return _destroyJob = getPersistenceContext().getValue(DESTROYJOB, _destroyJob);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AutoCometJob.doAgain</code> attribute defined at extension <code>print</code>. 
	 * @return the doAgain
	 */
	public Boolean getDoAgain()
	{
		if (this._doAgain!=null)
		{
			return _doAgain;
		}
		return _doAgain = getPersistenceContext().getValue(DOAGAIN, _doAgain);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AutoCometJob.duration</code> attribute defined at extension <code>print</code>. 
	 * @return the duration
	 */
	public String getDuration()
	{
		if (this._duration!=null)
		{
			return _duration;
		}
		return _duration = getPersistenceContext().getValue(DURATION, _duration);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AutoCometJob.endTime</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>AutoCometJob.id</code> attribute defined at extension <code>print</code>. 
	 * @return the id
	 */
	public Integer getId()
	{
		if (this._id!=null)
		{
			return _id;
		}
		return _id = getPersistenceContext().getValue(ID, _id);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AutoCometJob.name</code> attribute defined at extension <code>print</code>. 
	 * @return the name
	 */
	public String getName()
	{
		if (this._name!=null)
		{
			return _name;
		}
		return _name = getPersistenceContext().getValue(NAME, _name);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AutoCometJob.objectFileName</code> attribute defined at extension <code>print</code>. 
	 * @return the objectFileName
	 */
	public String getObjectFileName()
	{
		if (this._objectFileName!=null)
		{
			return _objectFileName;
		}
		return _objectFileName = getPersistenceContext().getValue(OBJECTFILENAME, _objectFileName);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AutoCometJob.objectFileNameInternal</code> attribute defined at extension <code>print</code>. 
	 * @return the objectFileNameInternal
	 */
	public String getObjectFileNameInternal()
	{
		if (this._objectFileNameInternal!=null)
		{
			return _objectFileNameInternal;
		}
		return _objectFileNameInternal = getPersistenceContext().getValue(OBJECTFILENAMEINTERNAL, _objectFileNameInternal);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AutoCometJob.objectId</code> attribute defined at extension <code>print</code>. 
	 * @return the objectId
	 */
	public Integer getObjectId()
	{
		if (this._objectId!=null)
		{
			return _objectId;
		}
		return _objectId = getPersistenceContext().getValue(OBJECTID, _objectId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AutoCometJob.objectPath</code> attribute defined at extension <code>print</code>. 
	 * @return the objectPath
	 */
	public String getObjectPath()
	{
		if (this._objectPath!=null)
		{
			return _objectPath;
		}
		return _objectPath = getPersistenceContext().getValue(OBJECTPATH, _objectPath);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AutoCometJob.pagePreviewSize</code> attribute defined at extension <code>print</code>. 
	 * @return the pagePreviewSize
	 */
	public Integer getPagePreviewSize()
	{
		if (this._pagePreviewSize!=null)
		{
			return _pagePreviewSize;
		}
		return _pagePreviewSize = getPersistenceContext().getValue(PAGEPREVIEWSIZE, _pagePreviewSize);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AutoCometJob.pdfPreset</code> attribute defined at extension <code>print</code>. 
	 * @return the pdfPreset
	 */
	public PDFPresetEnum getPdfPreset()
	{
		if (this._pdfPreset!=null)
		{
			return _pdfPreset;
		}
		return _pdfPreset = getPersistenceContext().getValue(PDFPRESET, _pdfPreset);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AutoCometJob.priority</code> attribute defined at extension <code>print</code>. 
	 * @return the priority
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
	 * <i>Generated method</i> - Getter of the <code>AutoCometJob.serverTemplatePath</code> attribute defined at extension <code>print</code>. 
	 * @return the serverTemplatePath
	 */
	public String getServerTemplatePath()
	{
		if (this._serverTemplatePath!=null)
		{
			return _serverTemplatePath;
		}
		return _serverTemplatePath = getPersistenceContext().getValue(SERVERTEMPLATEPATH, _serverTemplatePath);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AutoCometJob.serverWorkingPath</code> attribute defined at extension <code>print</code>. 
	 * @return the serverWorkingPath
	 */
	public String getServerWorkingPath()
	{
		if (this._serverWorkingPath!=null)
		{
			return _serverWorkingPath;
		}
		return _serverWorkingPath = getPersistenceContext().getValue(SERVERWORKINGPATH, _serverWorkingPath);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AutoCometJob.startTime</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>AutoCometJob.statusId</code> attribute defined at extension <code>print</code>. 
	 * @return the statusId
	 */
	public Integer getStatusId()
	{
		if (this._statusId!=null)
		{
			return _statusId;
		}
		return _statusId = getPersistenceContext().getValue(STATUSID, _statusId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AutoCometJob.templateFileName</code> attribute defined at extension <code>print</code>. 
	 * @return the templateFileName
	 */
	public String getTemplateFileName()
	{
		if (this._templateFileName!=null)
		{
			return _templateFileName;
		}
		return _templateFileName = getPersistenceContext().getValue(TEMPLATEFILENAME, _templateFileName);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AutoCometJob.templatePath</code> attribute defined at extension <code>print</code>. 
	 * @return the templatePath
	 */
	public String getTemplatePath()
	{
		if (this._templatePath!=null)
		{
			return _templatePath;
		}
		return _templatePath = getPersistenceContext().getValue(TEMPLATEPATH, _templatePath);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AutoCometJob.clientLanguage</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the clientLanguage
	 */
	public void setClientLanguage(final LanguageModel value)
	{
		_clientLanguage = getPersistenceContext().setValue(CLIENTLANGUAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AutoCometJob.command</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the command
	 */
	public void setCommand(final String value)
	{
		_command = getPersistenceContext().setValue(COMMAND, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AutoCometJob.commandId</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the commandId
	 */
	public void setCommandId(final Integer value)
	{
		_commandId = getPersistenceContext().setValue(COMMANDID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AutoCometJob.contextItem</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the contextItem
	 */
	public void setContextItem(final ItemModel value)
	{
		_contextItem = getPersistenceContext().setValue(CONTEXTITEM, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AutoCometJob.delay</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the delay
	 */
	public void setDelay(final Integer value)
	{
		_delay = getPersistenceContext().setValue(DELAY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AutoCometJob.destroyJob</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the destroyJob
	 */
	public void setDestroyJob(final DeleteAutoCometJob value)
	{
		_destroyJob = getPersistenceContext().setValue(DESTROYJOB, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AutoCometJob.doAgain</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the doAgain
	 */
	public void setDoAgain(final Boolean value)
	{
		_doAgain = getPersistenceContext().setValue(DOAGAIN, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AutoCometJob.endTime</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the endTime
	 */
	public void setEndTime(final Date value)
	{
		_endTime = getPersistenceContext().setValue(ENDTIME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AutoCometJob.id</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the id
	 */
	public void setId(final Integer value)
	{
		_id = getPersistenceContext().setValue(ID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AutoCometJob.name</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the name
	 */
	public void setName(final String value)
	{
		_name = getPersistenceContext().setValue(NAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AutoCometJob.objectFileNameInternal</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the objectFileNameInternal
	 */
	public void setObjectFileNameInternal(final String value)
	{
		_objectFileNameInternal = getPersistenceContext().setValue(OBJECTFILENAMEINTERNAL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AutoCometJob.objectId</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the objectId
	 */
	public void setObjectId(final Integer value)
	{
		_objectId = getPersistenceContext().setValue(OBJECTID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AutoCometJob.pagePreviewSize</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the pagePreviewSize
	 */
	public void setPagePreviewSize(final Integer value)
	{
		_pagePreviewSize = getPersistenceContext().setValue(PAGEPREVIEWSIZE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AutoCometJob.pdfPreset</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the pdfPreset
	 */
	public void setPdfPreset(final PDFPresetEnum value)
	{
		_pdfPreset = getPersistenceContext().setValue(PDFPRESET, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AutoCometJob.priority</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the priority
	 */
	public void setPriority(final Integer value)
	{
		_priority = getPersistenceContext().setValue(PRIORITY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AutoCometJob.startTime</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the startTime
	 */
	public void setStartTime(final Date value)
	{
		_startTime = getPersistenceContext().setValue(STARTTIME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AutoCometJob.statusId</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the statusId
	 */
	public void setStatusId(final Integer value)
	{
		_statusId = getPersistenceContext().setValue(STATUSID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AutoCometJob.templateFileName</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the templateFileName
	 */
	public void setTemplateFileName(final String value)
	{
		_templateFileName = getPersistenceContext().setValue(TEMPLATEFILENAME, value);
	}
	
}
