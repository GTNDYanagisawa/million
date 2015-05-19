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

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.cronjob.enums.DayOfWeek;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.cronjob.model.JobModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.util.StandardDateRange;
import java.util.Date;
import java.util.List;

/**
 * Generated model class for type Trigger first defined at extension processing.
 */
@SuppressWarnings("all")
public class TriggerModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "Trigger";
	
	/**<i>Generated relation code constant for relation <code>JobTriggerRelation</code> defining source attribute <code>job</code> in extension <code>processing</code>.</i>*/
	public final static String _JOBTRIGGERRELATION = "JobTriggerRelation";
	
	/**<i>Generated relation code constant for relation <code>CronJobTriggerRelation</code> defining source attribute <code>cronJob</code> in extension <code>processing</code>.</i>*/
	public final static String _CRONJOBTRIGGERRELATION = "CronJobTriggerRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>Trigger.active</code> attribute defined at extension <code>processing</code>. */
	public static final String ACTIVE = "active";
	
	/** <i>Generated constant</i> - Attribute key of <code>Trigger.second</code> attribute defined at extension <code>processing</code>. */
	public static final String SECOND = "second";
	
	/** <i>Generated constant</i> - Attribute key of <code>Trigger.minute</code> attribute defined at extension <code>processing</code>. */
	public static final String MINUTE = "minute";
	
	/** <i>Generated constant</i> - Attribute key of <code>Trigger.hour</code> attribute defined at extension <code>processing</code>. */
	public static final String HOUR = "hour";
	
	/** <i>Generated constant</i> - Attribute key of <code>Trigger.day</code> attribute defined at extension <code>processing</code>. */
	public static final String DAY = "day";
	
	/** <i>Generated constant</i> - Attribute key of <code>Trigger.month</code> attribute defined at extension <code>processing</code>. */
	public static final String MONTH = "month";
	
	/** <i>Generated constant</i> - Attribute key of <code>Trigger.year</code> attribute defined at extension <code>processing</code>. */
	public static final String YEAR = "year";
	
	/** <i>Generated constant</i> - Attribute key of <code>Trigger.relative</code> attribute defined at extension <code>processing</code>. */
	public static final String RELATIVE = "relative";
	
	/** <i>Generated constant</i> - Attribute key of <code>Trigger.daysOfWeek</code> attribute defined at extension <code>processing</code>. */
	public static final String DAYSOFWEEK = "daysOfWeek";
	
	/** <i>Generated constant</i> - Attribute key of <code>Trigger.weekInterval</code> attribute defined at extension <code>processing</code>. */
	public static final String WEEKINTERVAL = "weekInterval";
	
	/** <i>Generated constant</i> - Attribute key of <code>Trigger.dateRange</code> attribute defined at extension <code>processing</code>. */
	public static final String DATERANGE = "dateRange";
	
	/** <i>Generated constant</i> - Attribute key of <code>Trigger.activationTime</code> attribute defined at extension <code>processing</code>. */
	public static final String ACTIVATIONTIME = "activationTime";
	
	/** <i>Generated constant</i> - Attribute key of <code>Trigger.timeTable</code> attribute defined at extension <code>processing</code>. */
	public static final String TIMETABLE = "timeTable";
	
	/** <i>Generated constant</i> - Attribute key of <code>Trigger.cronExpression</code> attribute defined at extension <code>processing</code>. */
	public static final String CRONEXPRESSION = "cronExpression";
	
	/** <i>Generated constant</i> - Attribute key of <code>Trigger.maxAcceptableDelay</code> attribute defined at extension <code>processing</code>. */
	public static final String MAXACCEPTABLEDELAY = "maxAcceptableDelay";
	
	/** <i>Generated constant</i> - Attribute key of <code>Trigger.job</code> attribute defined at extension <code>processing</code>. */
	public static final String JOB = "job";
	
	/** <i>Generated constant</i> - Attribute key of <code>Trigger.cronJob</code> attribute defined at extension <code>processing</code>. */
	public static final String CRONJOB = "cronJob";
	
	
	/** <i>Generated variable</i> - Variable of <code>Trigger.active</code> attribute defined at extension <code>processing</code>. */
	private Boolean _active;
	
	/** <i>Generated variable</i> - Variable of <code>Trigger.second</code> attribute defined at extension <code>processing</code>. */
	private Integer _second;
	
	/** <i>Generated variable</i> - Variable of <code>Trigger.minute</code> attribute defined at extension <code>processing</code>. */
	private Integer _minute;
	
	/** <i>Generated variable</i> - Variable of <code>Trigger.hour</code> attribute defined at extension <code>processing</code>. */
	private Integer _hour;
	
	/** <i>Generated variable</i> - Variable of <code>Trigger.day</code> attribute defined at extension <code>processing</code>. */
	private Integer _day;
	
	/** <i>Generated variable</i> - Variable of <code>Trigger.month</code> attribute defined at extension <code>processing</code>. */
	private Integer _month;
	
	/** <i>Generated variable</i> - Variable of <code>Trigger.year</code> attribute defined at extension <code>processing</code>. */
	private Integer _year;
	
	/** <i>Generated variable</i> - Variable of <code>Trigger.relative</code> attribute defined at extension <code>processing</code>. */
	private Boolean _relative;
	
	/** <i>Generated variable</i> - Variable of <code>Trigger.daysOfWeek</code> attribute defined at extension <code>processing</code>. */
	private List<DayOfWeek> _daysOfWeek;
	
	/** <i>Generated variable</i> - Variable of <code>Trigger.weekInterval</code> attribute defined at extension <code>processing</code>. */
	private Integer _weekInterval;
	
	/** <i>Generated variable</i> - Variable of <code>Trigger.dateRange</code> attribute defined at extension <code>processing</code>. */
	private StandardDateRange _dateRange;
	
	/** <i>Generated variable</i> - Variable of <code>Trigger.activationTime</code> attribute defined at extension <code>processing</code>. */
	private Date _activationTime;
	
	/** <i>Generated variable</i> - Variable of <code>Trigger.timeTable</code> attribute defined at extension <code>processing</code>. */
	private String _timeTable;
	
	/** <i>Generated variable</i> - Variable of <code>Trigger.cronExpression</code> attribute defined at extension <code>processing</code>. */
	private String _cronExpression;
	
	/** <i>Generated variable</i> - Variable of <code>Trigger.maxAcceptableDelay</code> attribute defined at extension <code>processing</code>. */
	private Integer _maxAcceptableDelay;
	
	/** <i>Generated variable</i> - Variable of <code>Trigger.job</code> attribute defined at extension <code>processing</code>. */
	private JobModel _job;
	
	/** <i>Generated variable</i> - Variable of <code>Trigger.cronJob</code> attribute defined at extension <code>processing</code>. */
	private CronJobModel _cronJob;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public TriggerModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public TriggerModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _cronJob initial attribute declared by type <code>Trigger</code> at extension <code>processing</code>
	 * @param _job initial attribute declared by type <code>Trigger</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public TriggerModel(final CronJobModel _cronJob, final JobModel _job, final ItemModel _owner)
	{
		super();
		setCronJob(_cronJob);
		setJob(_job);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trigger.activationTime</code> attribute defined at extension <code>processing</code>. 
	 * @return the activationTime - next activation time
	 */
	public Date getActivationTime()
	{
		if (this._activationTime!=null)
		{
			return _activationTime;
		}
		return _activationTime = getPersistenceContext().getValue(ACTIVATIONTIME, _activationTime);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trigger.active</code> attribute defined at extension <code>processing</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Trigger.cronExpression</code> attribute defined at extension <code>processing</code>. 
	 * @return the cronExpression
	 */
	public String getCronExpression()
	{
		if (this._cronExpression!=null)
		{
			return _cronExpression;
		}
		return _cronExpression = getPersistenceContext().getValue(CRONEXPRESSION, _cronExpression);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trigger.cronJob</code> attribute defined at extension <code>processing</code>. 
	 * @return the cronJob - assigned cronjob
	 */
	public CronJobModel getCronJob()
	{
		if (this._cronJob!=null)
		{
			return _cronJob;
		}
		return _cronJob = getPersistenceContext().getValue(CRONJOB, _cronJob);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trigger.dateRange</code> attribute defined at extension <code>processing</code>. 
	 * @return the dateRange - date range the trigger is active
	 */
	public StandardDateRange getDateRange()
	{
		if (this._dateRange!=null)
		{
			return _dateRange;
		}
		return _dateRange = getPersistenceContext().getValue(DATERANGE, _dateRange);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trigger.day</code> attribute defined at extension <code>processing</code>. 
	 * @return the day - time value day
	 */
	public Integer getDay()
	{
		if (this._day!=null)
		{
			return _day;
		}
		return _day = getPersistenceContext().getValue(DAY, _day);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trigger.daysOfWeek</code> attribute defined at extension <code>processing</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the daysOfWeek - days of week the trigger is active
	 */
	public List<DayOfWeek> getDaysOfWeek()
	{
		if (this._daysOfWeek!=null)
		{
			return _daysOfWeek;
		}
		return _daysOfWeek = getPersistenceContext().getValue(DAYSOFWEEK, _daysOfWeek);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trigger.hour</code> attribute defined at extension <code>processing</code>. 
	 * @return the hour - time value hour
	 */
	public Integer getHour()
	{
		if (this._hour!=null)
		{
			return _hour;
		}
		return _hour = getPersistenceContext().getValue(HOUR, _hour);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trigger.job</code> attribute defined at extension <code>processing</code>. 
	 * @return the job - assigned job
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
	 * <i>Generated method</i> - Getter of the <code>Trigger.maxAcceptableDelay</code> attribute defined at extension <code>processing</code>. 
	 * @return the maxAcceptableDelay - the maximum acceptable delay (s) in which the job can be triggered, after which it is
	 *                         ignored.
	 */
	public Integer getMaxAcceptableDelay()
	{
		if (this._maxAcceptableDelay!=null)
		{
			return _maxAcceptableDelay;
		}
		return _maxAcceptableDelay = getPersistenceContext().getValue(MAXACCEPTABLEDELAY, _maxAcceptableDelay);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trigger.minute</code> attribute defined at extension <code>processing</code>. 
	 * @return the minute - time value minute
	 */
	public Integer getMinute()
	{
		if (this._minute!=null)
		{
			return _minute;
		}
		return _minute = getPersistenceContext().getValue(MINUTE, _minute);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trigger.month</code> attribute defined at extension <code>processing</code>. 
	 * @return the month - time value month
	 */
	public Integer getMonth()
	{
		if (this._month!=null)
		{
			return _month;
		}
		return _month = getPersistenceContext().getValue(MONTH, _month);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trigger.relative</code> attribute defined at extension <code>processing</code>. 
	 * @return the relative - time values are considered as relative values
	 */
	public Boolean getRelative()
	{
		if (this._relative!=null)
		{
			return _relative;
		}
		return _relative = getPersistenceContext().getValue(RELATIVE, _relative);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trigger.second</code> attribute defined at extension <code>processing</code>. 
	 * @return the second - time value second
	 */
	public Integer getSecond()
	{
		if (this._second!=null)
		{
			return _second;
		}
		return _second = getPersistenceContext().getValue(SECOND, _second);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trigger.timeTable</code> dynamic attribute defined at extension <code>processing</code>. 
	 * @return the timeTable
	 */
	public String getTimeTable()
	{
		return getPersistenceContext().getDynamicValue(this,TIMETABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trigger.weekInterval</code> attribute defined at extension <code>processing</code>. 
	 * @return the weekInterval - week interval for days of week
	 */
	public Integer getWeekInterval()
	{
		if (this._weekInterval!=null)
		{
			return _weekInterval;
		}
		return _weekInterval = getPersistenceContext().getValue(WEEKINTERVAL, _weekInterval);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trigger.year</code> attribute defined at extension <code>processing</code>. 
	 * @return the year - time value year
	 */
	public Integer getYear()
	{
		if (this._year!=null)
		{
			return _year;
		}
		return _year = getPersistenceContext().getValue(YEAR, _year);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Trigger.activationTime</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the activationTime - next activation time
	 */
	public void setActivationTime(final Date value)
	{
		_activationTime = getPersistenceContext().setValue(ACTIVATIONTIME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Trigger.active</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the active
	 */
	public void setActive(final Boolean value)
	{
		_active = getPersistenceContext().setValue(ACTIVE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Trigger.cronExpression</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the cronExpression
	 */
	public void setCronExpression(final String value)
	{
		_cronExpression = getPersistenceContext().setValue(CRONEXPRESSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>Trigger.cronJob</code> attribute defined at extension <code>processing</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the cronJob - assigned cronjob
	 */
	public void setCronJob(final CronJobModel value)
	{
		_cronJob = getPersistenceContext().setValue(CRONJOB, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Trigger.dateRange</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the dateRange - date range the trigger is active
	 */
	public void setDateRange(final StandardDateRange value)
	{
		_dateRange = getPersistenceContext().setValue(DATERANGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Trigger.day</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the day - time value day
	 */
	public void setDay(final Integer value)
	{
		_day = getPersistenceContext().setValue(DAY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Trigger.daysOfWeek</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the daysOfWeek - days of week the trigger is active
	 */
	public void setDaysOfWeek(final List<DayOfWeek> value)
	{
		_daysOfWeek = getPersistenceContext().setValue(DAYSOFWEEK, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Trigger.hour</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the hour - time value hour
	 */
	public void setHour(final Integer value)
	{
		_hour = getPersistenceContext().setValue(HOUR, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>Trigger.job</code> attribute defined at extension <code>processing</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the job - assigned job
	 */
	public void setJob(final JobModel value)
	{
		_job = getPersistenceContext().setValue(JOB, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Trigger.maxAcceptableDelay</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the maxAcceptableDelay - the maximum acceptable delay (s) in which the job can be triggered, after which it is
	 *                         ignored.
	 */
	public void setMaxAcceptableDelay(final Integer value)
	{
		_maxAcceptableDelay = getPersistenceContext().setValue(MAXACCEPTABLEDELAY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Trigger.minute</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the minute - time value minute
	 */
	public void setMinute(final Integer value)
	{
		_minute = getPersistenceContext().setValue(MINUTE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Trigger.month</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the month - time value month
	 */
	public void setMonth(final Integer value)
	{
		_month = getPersistenceContext().setValue(MONTH, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Trigger.relative</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the relative - time values are considered as relative values
	 */
	public void setRelative(final Boolean value)
	{
		_relative = getPersistenceContext().setValue(RELATIVE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Trigger.second</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the second - time value second
	 */
	public void setSecond(final Integer value)
	{
		_second = getPersistenceContext().setValue(SECOND, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Trigger.weekInterval</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the weekInterval - week interval for days of week
	 */
	public void setWeekInterval(final Integer value)
	{
		_weekInterval = getPersistenceContext().setValue(WEEKINTERVAL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Trigger.year</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the year - time value year
	 */
	public void setYear(final Integer value)
	{
		_year = getPersistenceContext().setValue(YEAR, value);
	}
	
}
