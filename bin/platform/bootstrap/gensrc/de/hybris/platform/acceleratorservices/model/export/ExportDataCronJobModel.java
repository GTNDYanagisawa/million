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

import de.hybris.platform.acceleratorservices.model.export.ExportDataHistoryEntryModel;
import de.hybris.platform.cms2.model.site.CMSSiteModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.cronjob.model.JobModel;
import de.hybris.platform.servicelayer.internal.model.ServicelayerJobModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.store.BaseStoreModel;
import java.util.List;

/**
 * Generated model class for type ExportDataCronJob first defined at extension acceleratorservices.
 * <p>
 * CronJob holding information to export to a third party.
 */
@SuppressWarnings("all")
public class ExportDataCronJobModel extends CronJobModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ExportDataCronJob";
	
	/**<i>Generated relation code constant for relation <code>JobCronJobRelation</code> defining source attribute <code>job</code> in extension <code>processing</code>.</i>*/
	public final static String _JOBCRONJOBRELATION = "JobCronJobRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>ExportDataCronJob.baseStore</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String BASESTORE = "baseStore";
	
	/** <i>Generated constant</i> - Attribute key of <code>ExportDataCronJob.cmsSite</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String CMSSITE = "cmsSite";
	
	/** <i>Generated constant</i> - Attribute key of <code>ExportDataCronJob.language</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String LANGUAGE = "language";
	
	/** <i>Generated constant</i> - Attribute key of <code>ExportDataCronJob.currency</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String CURRENCY = "currency";
	
	/** <i>Generated constant</i> - Attribute key of <code>ExportDataCronJob.user</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String USER = "user";
	
	/** <i>Generated constant</i> - Attribute key of <code>ExportDataCronJob.thirdPartyHost</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String THIRDPARTYHOST = "thirdPartyHost";
	
	/** <i>Generated constant</i> - Attribute key of <code>ExportDataCronJob.thirdPartyUsername</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String THIRDPARTYUSERNAME = "thirdPartyUsername";
	
	/** <i>Generated constant</i> - Attribute key of <code>ExportDataCronJob.thirdPartyPassword</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String THIRDPARTYPASSWORD = "thirdPartyPassword";
	
	/** <i>Generated constant</i> - Attribute key of <code>ExportDataCronJob.dataGenerationPipeline</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String DATAGENERATIONPIPELINE = "dataGenerationPipeline";
	
	/** <i>Generated constant</i> - Attribute key of <code>ExportDataCronJob.historyEntries</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String HISTORYENTRIES = "historyEntries";
	
	
	/** <i>Generated variable</i> - Variable of <code>ExportDataCronJob.baseStore</code> attribute defined at extension <code>acceleratorservices</code>. */
	private BaseStoreModel _baseStore;
	
	/** <i>Generated variable</i> - Variable of <code>ExportDataCronJob.cmsSite</code> attribute defined at extension <code>acceleratorservices</code>. */
	private CMSSiteModel _cmsSite;
	
	/** <i>Generated variable</i> - Variable of <code>ExportDataCronJob.language</code> attribute defined at extension <code>acceleratorservices</code>. */
	private LanguageModel _language;
	
	/** <i>Generated variable</i> - Variable of <code>ExportDataCronJob.currency</code> attribute defined at extension <code>acceleratorservices</code>. */
	private CurrencyModel _currency;
	
	/** <i>Generated variable</i> - Variable of <code>ExportDataCronJob.user</code> attribute defined at extension <code>acceleratorservices</code>. */
	private UserModel _user;
	
	/** <i>Generated variable</i> - Variable of <code>ExportDataCronJob.thirdPartyHost</code> attribute defined at extension <code>acceleratorservices</code>. */
	private String _thirdPartyHost;
	
	/** <i>Generated variable</i> - Variable of <code>ExportDataCronJob.thirdPartyUsername</code> attribute defined at extension <code>acceleratorservices</code>. */
	private String _thirdPartyUsername;
	
	/** <i>Generated variable</i> - Variable of <code>ExportDataCronJob.thirdPartyPassword</code> attribute defined at extension <code>acceleratorservices</code>. */
	private String _thirdPartyPassword;
	
	/** <i>Generated variable</i> - Variable of <code>ExportDataCronJob.dataGenerationPipeline</code> attribute defined at extension <code>acceleratorservices</code>. */
	private String _dataGenerationPipeline;
	
	/** <i>Generated variable</i> - Variable of <code>ExportDataCronJob.historyEntries</code> attribute defined at extension <code>acceleratorservices</code>. */
	private List<ExportDataHistoryEntryModel> _historyEntries;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ExportDataCronJobModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ExportDataCronJobModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _dataGenerationPipeline initial attribute declared by type <code>ExportDataCronJob</code> at extension <code>acceleratorservices</code>
	 * @param _job initial attribute declared by type <code>ExportDataCronJob</code> at extension <code>acceleratorservices</code>
	 */
	@Deprecated
	public ExportDataCronJobModel(final String _dataGenerationPipeline, final ServicelayerJobModel _job)
	{
		super();
		setDataGenerationPipeline(_dataGenerationPipeline);
		setJob(_job);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _dataGenerationPipeline initial attribute declared by type <code>ExportDataCronJob</code> at extension <code>acceleratorservices</code>
	 * @param _job initial attribute declared by type <code>ExportDataCronJob</code> at extension <code>acceleratorservices</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public ExportDataCronJobModel(final String _dataGenerationPipeline, final ServicelayerJobModel _job, final ItemModel _owner)
	{
		super();
		setDataGenerationPipeline(_dataGenerationPipeline);
		setJob(_job);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataCronJob.baseStore</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the baseStore - The base store to run against
	 */
	public BaseStoreModel getBaseStore()
	{
		if (this._baseStore!=null)
		{
			return _baseStore;
		}
		return _baseStore = getPersistenceContext().getValue(BASESTORE, _baseStore);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataCronJob.cmsSite</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the cmsSite - The cms site to run against
	 */
	public CMSSiteModel getCmsSite()
	{
		if (this._cmsSite!=null)
		{
			return _cmsSite;
		}
		return _cmsSite = getPersistenceContext().getValue(CMSSITE, _cmsSite);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataCronJob.currency</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the currency - The currency context
	 */
	public CurrencyModel getCurrency()
	{
		if (this._currency!=null)
		{
			return _currency;
		}
		return _currency = getPersistenceContext().getValue(CURRENCY, _currency);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataCronJob.dataGenerationPipeline</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the dataGenerationPipeline - The name of the pipeline that generates the data
	 */
	public String getDataGenerationPipeline()
	{
		if (this._dataGenerationPipeline!=null)
		{
			return _dataGenerationPipeline;
		}
		return _dataGenerationPipeline = getPersistenceContext().getValue(DATAGENERATIONPIPELINE, _dataGenerationPipeline);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataCronJob.historyEntries</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the historyEntries
	 */
	public List<ExportDataHistoryEntryModel> getHistoryEntries()
	{
		if (this._historyEntries!=null)
		{
			return _historyEntries;
		}
		return _historyEntries = getPersistenceContext().getValue(HISTORYENTRIES, _historyEntries);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.job</code> attribute defined at extension <code>processing</code> and redeclared at extension <code>acceleratorservices</code>. 
	 * @return the job - Redeclare job type as ServicelayerJob
	 */
	@Override
	public ServicelayerJobModel getJob()
	{
		return (ServicelayerJobModel) super.getJob();
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataCronJob.language</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the language - The language context
	 */
	public LanguageModel getLanguage()
	{
		if (this._language!=null)
		{
			return _language;
		}
		return _language = getPersistenceContext().getValue(LANGUAGE, _language);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataCronJob.thirdPartyHost</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the thirdPartyHost - The location of the third party account
	 */
	public String getThirdPartyHost()
	{
		if (this._thirdPartyHost!=null)
		{
			return _thirdPartyHost;
		}
		return _thirdPartyHost = getPersistenceContext().getValue(THIRDPARTYHOST, _thirdPartyHost);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataCronJob.thirdPartyPassword</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the thirdPartyPassword - The password of the third party account
	 */
	public String getThirdPartyPassword()
	{
		if (this._thirdPartyPassword!=null)
		{
			return _thirdPartyPassword;
		}
		return _thirdPartyPassword = getPersistenceContext().getValue(THIRDPARTYPASSWORD, _thirdPartyPassword);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataCronJob.thirdPartyUsername</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the thirdPartyUsername - The username of the third party account
	 */
	public String getThirdPartyUsername()
	{
		if (this._thirdPartyUsername!=null)
		{
			return _thirdPartyUsername;
		}
		return _thirdPartyUsername = getPersistenceContext().getValue(THIRDPARTYUSERNAME, _thirdPartyUsername);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataCronJob.user</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the user - The user to set the export context to
	 */
	public UserModel getUser()
	{
		if (this._user!=null)
		{
			return _user;
		}
		return _user = getPersistenceContext().getValue(USER, _user);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ExportDataCronJob.baseStore</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the baseStore - The base store to run against
	 */
	public void setBaseStore(final BaseStoreModel value)
	{
		_baseStore = getPersistenceContext().setValue(BASESTORE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ExportDataCronJob.cmsSite</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the cmsSite - The cms site to run against
	 */
	public void setCmsSite(final CMSSiteModel value)
	{
		_cmsSite = getPersistenceContext().setValue(CMSSITE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ExportDataCronJob.currency</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the currency - The currency context
	 */
	public void setCurrency(final CurrencyModel value)
	{
		_currency = getPersistenceContext().setValue(CURRENCY, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>ExportDataCronJob.dataGenerationPipeline</code> attribute defined at extension <code>acceleratorservices</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the dataGenerationPipeline - The name of the pipeline that generates the data
	 */
	public void setDataGenerationPipeline(final String value)
	{
		_dataGenerationPipeline = getPersistenceContext().setValue(DATAGENERATIONPIPELINE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ExportDataCronJob.historyEntries</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the historyEntries
	 */
	public void setHistoryEntries(final List<ExportDataHistoryEntryModel> value)
	{
		_historyEntries = getPersistenceContext().setValue(HISTORYENTRIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>CronJob.job</code> attribute defined at extension <code>processing</code> and redeclared at extension <code>acceleratorservices</code>. Can only be used at creation of model - before first save. Will only accept values of type {@link de.hybris.platform.servicelayer.internal.model.ServicelayerJobModel}.  
	 *  
	 * @param value the job - Redeclare job type as ServicelayerJob
	 */
	@Override
	public void setJob(final JobModel value)
	{
		super.setJob(value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ExportDataCronJob.language</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the language - The language context
	 */
	public void setLanguage(final LanguageModel value)
	{
		_language = getPersistenceContext().setValue(LANGUAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ExportDataCronJob.thirdPartyHost</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the thirdPartyHost - The location of the third party account
	 */
	public void setThirdPartyHost(final String value)
	{
		_thirdPartyHost = getPersistenceContext().setValue(THIRDPARTYHOST, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ExportDataCronJob.thirdPartyPassword</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the thirdPartyPassword - The password of the third party account
	 */
	public void setThirdPartyPassword(final String value)
	{
		_thirdPartyPassword = getPersistenceContext().setValue(THIRDPARTYPASSWORD, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ExportDataCronJob.thirdPartyUsername</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the thirdPartyUsername - The username of the third party account
	 */
	public void setThirdPartyUsername(final String value)
	{
		_thirdPartyUsername = getPersistenceContext().setValue(THIRDPARTYUSERNAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ExportDataCronJob.user</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the user - The user to set the export context to
	 */
	public void setUser(final UserModel value)
	{
		_user = getPersistenceContext().setValue(USER, value);
	}
	
}
