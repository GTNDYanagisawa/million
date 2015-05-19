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
package de.hybris.platform.core.model.util;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.catalog.model.SyncItemCronJobModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Date;

/**
 * Generated model class for type ExecutedPublicationsView first defined at extension catalog.
 */
@SuppressWarnings("all")
public class ExecutedPublicationsViewModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ExecutedPublicationsView";
	
	/** <i>Generated constant</i> - Attribute key of <code>ExecutedPublicationsView.sourceVersion</code> attribute defined at extension <code>catalog</code>. */
	public static final String SOURCEVERSION = "sourceVersion";
	
	/** <i>Generated constant</i> - Attribute key of <code>ExecutedPublicationsView.targetVersion</code> attribute defined at extension <code>catalog</code>. */
	public static final String TARGETVERSION = "targetVersion";
	
	/** <i>Generated constant</i> - Attribute key of <code>ExecutedPublicationsView.code</code> attribute defined at extension <code>catalog</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>ExecutedPublicationsView.sicjpk</code> attribute defined at extension <code>catalog</code>. */
	public static final String SICJPK = "sicjpk";
	
	/** <i>Generated constant</i> - Attribute key of <code>ExecutedPublicationsView.result</code> attribute defined at extension <code>catalog</code>. */
	public static final String RESULT = "result";
	
	/** <i>Generated constant</i> - Attribute key of <code>ExecutedPublicationsView.startTime</code> attribute defined at extension <code>catalog</code>. */
	public static final String STARTTIME = "startTime";
	
	/** <i>Generated constant</i> - Attribute key of <code>ExecutedPublicationsView.endTime</code> attribute defined at extension <code>catalog</code>. */
	public static final String ENDTIME = "endTime";
	
	
	/** <i>Generated variable</i> - Variable of <code>ExecutedPublicationsView.sourceVersion</code> attribute defined at extension <code>catalog</code>. */
	private CatalogVersionModel _sourceVersion;
	
	/** <i>Generated variable</i> - Variable of <code>ExecutedPublicationsView.targetVersion</code> attribute defined at extension <code>catalog</code>. */
	private CatalogVersionModel _targetVersion;
	
	/** <i>Generated variable</i> - Variable of <code>ExecutedPublicationsView.code</code> attribute defined at extension <code>catalog</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>ExecutedPublicationsView.sicjpk</code> attribute defined at extension <code>catalog</code>. */
	private SyncItemCronJobModel _sicjpk;
	
	/** <i>Generated variable</i> - Variable of <code>ExecutedPublicationsView.result</code> attribute defined at extension <code>catalog</code>. */
	private CronJobResult _result;
	
	/** <i>Generated variable</i> - Variable of <code>ExecutedPublicationsView.startTime</code> attribute defined at extension <code>catalog</code>. */
	private Date _startTime;
	
	/** <i>Generated variable</i> - Variable of <code>ExecutedPublicationsView.endTime</code> attribute defined at extension <code>catalog</code>. */
	private Date _endTime;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ExecutedPublicationsViewModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ExecutedPublicationsViewModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public ExecutedPublicationsViewModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExecutedPublicationsView.code</code> attribute defined at extension <code>catalog</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>ExecutedPublicationsView.endTime</code> attribute defined at extension <code>catalog</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>ExecutedPublicationsView.result</code> attribute defined at extension <code>catalog</code>. 
	 * @return the result
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
	 * <i>Generated method</i> - Getter of the <code>ExecutedPublicationsView.sicjpk</code> attribute defined at extension <code>catalog</code>. 
	 * @return the sicjpk
	 */
	public SyncItemCronJobModel getSicjpk()
	{
		if (this._sicjpk!=null)
		{
			return _sicjpk;
		}
		return _sicjpk = getPersistenceContext().getValue(SICJPK, _sicjpk);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExecutedPublicationsView.sourceVersion</code> attribute defined at extension <code>catalog</code>. 
	 * @return the sourceVersion
	 */
	public CatalogVersionModel getSourceVersion()
	{
		if (this._sourceVersion!=null)
		{
			return _sourceVersion;
		}
		return _sourceVersion = getPersistenceContext().getValue(SOURCEVERSION, _sourceVersion);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExecutedPublicationsView.startTime</code> attribute defined at extension <code>catalog</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>ExecutedPublicationsView.targetVersion</code> attribute defined at extension <code>catalog</code>. 
	 * @return the targetVersion
	 */
	public CatalogVersionModel getTargetVersion()
	{
		if (this._targetVersion!=null)
		{
			return _targetVersion;
		}
		return _targetVersion = getPersistenceContext().getValue(TARGETVERSION, _targetVersion);
	}
	
}
