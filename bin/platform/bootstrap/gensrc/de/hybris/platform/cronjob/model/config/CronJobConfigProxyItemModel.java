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
package de.hybris.platform.cronjob.model.config;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type CronJobConfigProxyItem first defined at extension processing.
 */
@SuppressWarnings("all")
public class CronJobConfigProxyItemModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CronJobConfigProxyItem";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJobConfigProxyItem.cronjob_trigger_interval</code> attribute defined at extension <code>processing</code>. */
	public static final String CRONJOB_TRIGGER_INTERVAL = "cronjob_trigger_interval";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJobConfigProxyItem.cronjob_timertask_loadonstartup</code> attribute defined at extension <code>processing</code>. */
	public static final String CRONJOB_TIMERTASK_LOADONSTARTUP = "cronjob_timertask_loadonstartup";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJobConfigProxyItem.timerTaskStatus</code> attribute defined at extension <code>processing</code>. */
	public static final String TIMERTASKSTATUS = "timerTaskStatus";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJobConfigProxyItem.timerTaskNextRun</code> attribute defined at extension <code>processing</code>. */
	public static final String TIMERTASKNEXTRUN = "timerTaskNextRun";
	
	/** <i>Generated constant</i> - Attribute key of <code>CronJobConfigProxyItem.testEmailAddress</code> attribute defined at extension <code>processing</code>. */
	public static final String TESTEMAILADDRESS = "testEmailAddress";
	
	
	/** <i>Generated variable</i> - Variable of <code>CronJobConfigProxyItem.cronjob_trigger_interval</code> attribute defined at extension <code>processing</code>. */
	private Integer _cronjob_trigger_interval;
	
	/** <i>Generated variable</i> - Variable of <code>CronJobConfigProxyItem.cronjob_timertask_loadonstartup</code> attribute defined at extension <code>processing</code>. */
	private Boolean _cronjob_timertask_loadonstartup;
	
	/** <i>Generated variable</i> - Variable of <code>CronJobConfigProxyItem.timerTaskStatus</code> attribute defined at extension <code>processing</code>. */
	private String _timerTaskStatus;
	
	/** <i>Generated variable</i> - Variable of <code>CronJobConfigProxyItem.timerTaskNextRun</code> attribute defined at extension <code>processing</code>. */
	private String _timerTaskNextRun;
	
	/** <i>Generated variable</i> - Variable of <code>CronJobConfigProxyItem.testEmailAddress</code> attribute defined at extension <code>processing</code>. */
	private String _testEmailAddress;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CronJobConfigProxyItemModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CronJobConfigProxyItemModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _cronjob_timertask_loadonstartup initial attribute declared by type <code>CronJobConfigProxyItem</code> at extension <code>processing</code>
	 */
	@Deprecated
	public CronJobConfigProxyItemModel(final Boolean _cronjob_timertask_loadonstartup)
	{
		super();
		setCronjob_timertask_loadonstartup(_cronjob_timertask_loadonstartup);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _cronjob_timertask_loadonstartup initial attribute declared by type <code>CronJobConfigProxyItem</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public CronJobConfigProxyItemModel(final Boolean _cronjob_timertask_loadonstartup, final ItemModel _owner)
	{
		super();
		setCronjob_timertask_loadonstartup(_cronjob_timertask_loadonstartup);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJobConfigProxyItem.cronjob_timertask_loadonstartup</code> attribute defined at extension <code>processing</code>. 
	 * @return the cronjob_timertask_loadonstartup
	 */
	public Boolean getCronjob_timertask_loadonstartup()
	{
		if (this._cronjob_timertask_loadonstartup!=null)
		{
			return _cronjob_timertask_loadonstartup;
		}
		return _cronjob_timertask_loadonstartup = getPersistenceContext().getValue(CRONJOB_TIMERTASK_LOADONSTARTUP, _cronjob_timertask_loadonstartup);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJobConfigProxyItem.cronjob_trigger_interval</code> attribute defined at extension <code>processing</code>. 
	 * @return the cronjob_trigger_interval
	 */
	public Integer getCronjob_trigger_interval()
	{
		if (this._cronjob_trigger_interval!=null)
		{
			return _cronjob_trigger_interval;
		}
		return _cronjob_trigger_interval = getPersistenceContext().getValue(CRONJOB_TRIGGER_INTERVAL, _cronjob_trigger_interval);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJobConfigProxyItem.testEmailAddress</code> attribute defined at extension <code>processing</code>. 
	 * @return the testEmailAddress
	 */
	public String getTestEmailAddress()
	{
		if (this._testEmailAddress!=null)
		{
			return _testEmailAddress;
		}
		return _testEmailAddress = getPersistenceContext().getValue(TESTEMAILADDRESS, _testEmailAddress);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJobConfigProxyItem.timerTaskNextRun</code> attribute defined at extension <code>processing</code>. 
	 * @return the timerTaskNextRun
	 */
	public String getTimerTaskNextRun()
	{
		if (this._timerTaskNextRun!=null)
		{
			return _timerTaskNextRun;
		}
		return _timerTaskNextRun = getPersistenceContext().getValue(TIMERTASKNEXTRUN, _timerTaskNextRun);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJobConfigProxyItem.timerTaskStatus</code> attribute defined at extension <code>processing</code>. 
	 * @return the timerTaskStatus
	 */
	public String getTimerTaskStatus()
	{
		if (this._timerTaskStatus!=null)
		{
			return _timerTaskStatus;
		}
		return _timerTaskStatus = getPersistenceContext().getValue(TIMERTASKSTATUS, _timerTaskStatus);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CronJobConfigProxyItem.cronjob_timertask_loadonstartup</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the cronjob_timertask_loadonstartup
	 */
	public void setCronjob_timertask_loadonstartup(final Boolean value)
	{
		_cronjob_timertask_loadonstartup = getPersistenceContext().setValue(CRONJOB_TIMERTASK_LOADONSTARTUP, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CronJobConfigProxyItem.cronjob_trigger_interval</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the cronjob_trigger_interval
	 */
	public void setCronjob_trigger_interval(final Integer value)
	{
		_cronjob_trigger_interval = getPersistenceContext().setValue(CRONJOB_TRIGGER_INTERVAL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CronJobConfigProxyItem.testEmailAddress</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the testEmailAddress
	 */
	public void setTestEmailAddress(final String value)
	{
		_testEmailAddress = getPersistenceContext().setValue(TESTEMAILADDRESS, value);
	}
	
}
