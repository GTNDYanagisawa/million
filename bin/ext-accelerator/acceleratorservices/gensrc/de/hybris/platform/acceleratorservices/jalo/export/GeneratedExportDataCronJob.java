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
package de.hybris.platform.acceleratorservices.jalo.export;

import de.hybris.platform.acceleratorservices.constants.AcceleratorServicesConstants;
import de.hybris.platform.acceleratorservices.jalo.export.ExportDataHistoryEntry;
import de.hybris.platform.cms2.jalo.site.CMSSite;
import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.processing.constants.ProcessingConstants;
import de.hybris.platform.store.BaseStore;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.acceleratorservices.jalo.export.ExportDataCronJob ExportDataCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedExportDataCronJob extends CronJob
{
	/** Qualifier of the <code>ExportDataCronJob.baseStore</code> attribute **/
	public static final String BASESTORE = "baseStore";
	/** Qualifier of the <code>ExportDataCronJob.cmsSite</code> attribute **/
	public static final String CMSSITE = "cmsSite";
	/** Qualifier of the <code>ExportDataCronJob.language</code> attribute **/
	public static final String LANGUAGE = "language";
	/** Qualifier of the <code>ExportDataCronJob.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>ExportDataCronJob.user</code> attribute **/
	public static final String USER = "user";
	/** Qualifier of the <code>ExportDataCronJob.thirdPartyHost</code> attribute **/
	public static final String THIRDPARTYHOST = "thirdPartyHost";
	/** Qualifier of the <code>ExportDataCronJob.thirdPartyUsername</code> attribute **/
	public static final String THIRDPARTYUSERNAME = "thirdPartyUsername";
	/** Qualifier of the <code>ExportDataCronJob.thirdPartyPassword</code> attribute **/
	public static final String THIRDPARTYPASSWORD = "thirdPartyPassword";
	/** Qualifier of the <code>ExportDataCronJob.dataGenerationPipeline</code> attribute **/
	public static final String DATAGENERATIONPIPELINE = "dataGenerationPipeline";
	/** Qualifier of the <code>ExportDataCronJob.historyEntries</code> attribute **/
	public static final String HISTORYENTRIES = "historyEntries";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n JOB's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedExportDataCronJob> JOBHANDLER = new BidirectionalOneToManyHandler<GeneratedExportDataCronJob>(
	ProcessingConstants.TC.SERVICELAYERJOB,
	false,
	"job",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n HISTORYENTRIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ExportDataHistoryEntry> HISTORYENTRIESHANDLER = new OneToManyHandler<ExportDataHistoryEntry>(
	AcceleratorServicesConstants.TC.EXPORTDATAHISTORYENTRY,
	false,
	"exportDataCronJob",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(BASESTORE, AttributeMode.INITIAL);
		tmp.put(CMSSITE, AttributeMode.INITIAL);
		tmp.put(LANGUAGE, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(USER, AttributeMode.INITIAL);
		tmp.put(THIRDPARTYHOST, AttributeMode.INITIAL);
		tmp.put(THIRDPARTYUSERNAME, AttributeMode.INITIAL);
		tmp.put(THIRDPARTYPASSWORD, AttributeMode.INITIAL);
		tmp.put(DATAGENERATIONPIPELINE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataCronJob.baseStore</code> attribute.
	 * @return the baseStore - The base store to run against
	 */
	public BaseStore getBaseStore(final SessionContext ctx)
	{
		return (BaseStore)getProperty( ctx, BASESTORE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataCronJob.baseStore</code> attribute.
	 * @return the baseStore - The base store to run against
	 */
	public BaseStore getBaseStore()
	{
		return getBaseStore( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataCronJob.baseStore</code> attribute. 
	 * @param value the baseStore - The base store to run against
	 */
	public void setBaseStore(final SessionContext ctx, final BaseStore value)
	{
		setProperty(ctx, BASESTORE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataCronJob.baseStore</code> attribute. 
	 * @param value the baseStore - The base store to run against
	 */
	public void setBaseStore(final BaseStore value)
	{
		setBaseStore( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataCronJob.cmsSite</code> attribute.
	 * @return the cmsSite - The cms site to run against
	 */
	public CMSSite getCmsSite(final SessionContext ctx)
	{
		return (CMSSite)getProperty( ctx, CMSSITE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataCronJob.cmsSite</code> attribute.
	 * @return the cmsSite - The cms site to run against
	 */
	public CMSSite getCmsSite()
	{
		return getCmsSite( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataCronJob.cmsSite</code> attribute. 
	 * @param value the cmsSite - The cms site to run against
	 */
	public void setCmsSite(final SessionContext ctx, final CMSSite value)
	{
		setProperty(ctx, CMSSITE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataCronJob.cmsSite</code> attribute. 
	 * @param value the cmsSite - The cms site to run against
	 */
	public void setCmsSite(final CMSSite value)
	{
		setCmsSite( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		JOBHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataCronJob.currency</code> attribute.
	 * @return the currency - The currency context
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataCronJob.currency</code> attribute.
	 * @return the currency - The currency context
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataCronJob.currency</code> attribute. 
	 * @param value the currency - The currency context
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataCronJob.currency</code> attribute. 
	 * @param value the currency - The currency context
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataCronJob.dataGenerationPipeline</code> attribute.
	 * @return the dataGenerationPipeline - The name of the pipeline that generates the data
	 */
	public String getDataGenerationPipeline(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DATAGENERATIONPIPELINE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataCronJob.dataGenerationPipeline</code> attribute.
	 * @return the dataGenerationPipeline - The name of the pipeline that generates the data
	 */
	public String getDataGenerationPipeline()
	{
		return getDataGenerationPipeline( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataCronJob.dataGenerationPipeline</code> attribute. 
	 * @param value the dataGenerationPipeline - The name of the pipeline that generates the data
	 */
	protected void setDataGenerationPipeline(final SessionContext ctx, final String value)
	{
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+DATAGENERATIONPIPELINE+"' is not changeable", 0 );
		}
		setProperty(ctx, DATAGENERATIONPIPELINE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataCronJob.dataGenerationPipeline</code> attribute. 
	 * @param value the dataGenerationPipeline - The name of the pipeline that generates the data
	 */
	protected void setDataGenerationPipeline(final String value)
	{
		setDataGenerationPipeline( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataCronJob.historyEntries</code> attribute.
	 * @return the historyEntries
	 */
	public List<ExportDataHistoryEntry> getHistoryEntries(final SessionContext ctx)
	{
		return (List<ExportDataHistoryEntry>)HISTORYENTRIESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataCronJob.historyEntries</code> attribute.
	 * @return the historyEntries
	 */
	public List<ExportDataHistoryEntry> getHistoryEntries()
	{
		return getHistoryEntries( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataCronJob.historyEntries</code> attribute. 
	 * @param value the historyEntries
	 */
	public void setHistoryEntries(final SessionContext ctx, final List<ExportDataHistoryEntry> value)
	{
		HISTORYENTRIESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataCronJob.historyEntries</code> attribute. 
	 * @param value the historyEntries
	 */
	public void setHistoryEntries(final List<ExportDataHistoryEntry> value)
	{
		setHistoryEntries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to historyEntries. 
	 * @param value the item to add to historyEntries
	 */
	public void addToHistoryEntries(final SessionContext ctx, final ExportDataHistoryEntry value)
	{
		HISTORYENTRIESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to historyEntries. 
	 * @param value the item to add to historyEntries
	 */
	public void addToHistoryEntries(final ExportDataHistoryEntry value)
	{
		addToHistoryEntries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from historyEntries. 
	 * @param value the item to remove from historyEntries
	 */
	public void removeFromHistoryEntries(final SessionContext ctx, final ExportDataHistoryEntry value)
	{
		HISTORYENTRIESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from historyEntries. 
	 * @param value the item to remove from historyEntries
	 */
	public void removeFromHistoryEntries(final ExportDataHistoryEntry value)
	{
		removeFromHistoryEntries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataCronJob.language</code> attribute.
	 * @return the language - The language context
	 */
	public Language getLanguage(final SessionContext ctx)
	{
		return (Language)getProperty( ctx, LANGUAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataCronJob.language</code> attribute.
	 * @return the language - The language context
	 */
	public Language getLanguage()
	{
		return getLanguage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataCronJob.language</code> attribute. 
	 * @param value the language - The language context
	 */
	public void setLanguage(final SessionContext ctx, final Language value)
	{
		setProperty(ctx, LANGUAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataCronJob.language</code> attribute. 
	 * @param value the language - The language context
	 */
	public void setLanguage(final Language value)
	{
		setLanguage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataCronJob.thirdPartyHost</code> attribute.
	 * @return the thirdPartyHost - The location of the third party account
	 */
	public String getThirdPartyHost(final SessionContext ctx)
	{
		return (String)getProperty( ctx, THIRDPARTYHOST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataCronJob.thirdPartyHost</code> attribute.
	 * @return the thirdPartyHost - The location of the third party account
	 */
	public String getThirdPartyHost()
	{
		return getThirdPartyHost( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataCronJob.thirdPartyHost</code> attribute. 
	 * @param value the thirdPartyHost - The location of the third party account
	 */
	public void setThirdPartyHost(final SessionContext ctx, final String value)
	{
		setProperty(ctx, THIRDPARTYHOST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataCronJob.thirdPartyHost</code> attribute. 
	 * @param value the thirdPartyHost - The location of the third party account
	 */
	public void setThirdPartyHost(final String value)
	{
		setThirdPartyHost( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataCronJob.thirdPartyPassword</code> attribute.
	 * @return the thirdPartyPassword - The password of the third party account
	 */
	public String getThirdPartyPassword(final SessionContext ctx)
	{
		return (String)getProperty( ctx, THIRDPARTYPASSWORD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataCronJob.thirdPartyPassword</code> attribute.
	 * @return the thirdPartyPassword - The password of the third party account
	 */
	public String getThirdPartyPassword()
	{
		return getThirdPartyPassword( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataCronJob.thirdPartyPassword</code> attribute. 
	 * @param value the thirdPartyPassword - The password of the third party account
	 */
	public void setThirdPartyPassword(final SessionContext ctx, final String value)
	{
		setProperty(ctx, THIRDPARTYPASSWORD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataCronJob.thirdPartyPassword</code> attribute. 
	 * @param value the thirdPartyPassword - The password of the third party account
	 */
	public void setThirdPartyPassword(final String value)
	{
		setThirdPartyPassword( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataCronJob.thirdPartyUsername</code> attribute.
	 * @return the thirdPartyUsername - The username of the third party account
	 */
	public String getThirdPartyUsername(final SessionContext ctx)
	{
		return (String)getProperty( ctx, THIRDPARTYUSERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataCronJob.thirdPartyUsername</code> attribute.
	 * @return the thirdPartyUsername - The username of the third party account
	 */
	public String getThirdPartyUsername()
	{
		return getThirdPartyUsername( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataCronJob.thirdPartyUsername</code> attribute. 
	 * @param value the thirdPartyUsername - The username of the third party account
	 */
	public void setThirdPartyUsername(final SessionContext ctx, final String value)
	{
		setProperty(ctx, THIRDPARTYUSERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataCronJob.thirdPartyUsername</code> attribute. 
	 * @param value the thirdPartyUsername - The username of the third party account
	 */
	public void setThirdPartyUsername(final String value)
	{
		setThirdPartyUsername( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataCronJob.user</code> attribute.
	 * @return the user - The user to set the export context to
	 */
	public User getUser(final SessionContext ctx)
	{
		return (User)getProperty( ctx, USER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataCronJob.user</code> attribute.
	 * @return the user - The user to set the export context to
	 */
	public User getUser()
	{
		return getUser( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataCronJob.user</code> attribute. 
	 * @param value the user - The user to set the export context to
	 */
	public void setUser(final SessionContext ctx, final User value)
	{
		setProperty(ctx, USER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataCronJob.user</code> attribute. 
	 * @param value the user - The user to set the export context to
	 */
	public void setUser(final User value)
	{
		setUser( getSession().getSessionContext(), value );
	}
	
}
