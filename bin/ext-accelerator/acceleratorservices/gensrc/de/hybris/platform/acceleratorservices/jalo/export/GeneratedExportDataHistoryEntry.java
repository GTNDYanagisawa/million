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
import de.hybris.platform.acceleratorservices.jalo.export.ExportDataCronJob;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.acceleratorservices.jalo.export.ExportDataHistoryEntry ExportDataHistoryEntry}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedExportDataHistoryEntry extends GenericItem
{
	/** Qualifier of the <code>ExportDataHistoryEntry.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>ExportDataHistoryEntry.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>ExportDataHistoryEntry.startTime</code> attribute **/
	public static final String STARTTIME = "startTime";
	/** Qualifier of the <code>ExportDataHistoryEntry.finishTime</code> attribute **/
	public static final String FINISHTIME = "finishTime";
	/** Qualifier of the <code>ExportDataHistoryEntry.processedResultCount</code> attribute **/
	public static final String PROCESSEDRESULTCOUNT = "processedResultCount";
	/** Qualifier of the <code>ExportDataHistoryEntry.failureMessage</code> attribute **/
	public static final String FAILUREMESSAGE = "failureMessage";
	/** Qualifier of the <code>ExportDataHistoryEntry.exportDataCronJob</code> attribute **/
	public static final String EXPORTDATACRONJOB = "exportDataCronJob";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n EXPORTDATACRONJOB's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedExportDataHistoryEntry> EXPORTDATACRONJOBHANDLER = new BidirectionalOneToManyHandler<GeneratedExportDataHistoryEntry>(
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		tmp.put(STARTTIME, AttributeMode.INITIAL);
		tmp.put(FINISHTIME, AttributeMode.INITIAL);
		tmp.put(PROCESSEDRESULTCOUNT, AttributeMode.INITIAL);
		tmp.put(FAILUREMESSAGE, AttributeMode.INITIAL);
		tmp.put(EXPORTDATACRONJOB, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataHistoryEntry.code</code> attribute.
	 * @return the code - unique code that identifies the export data history
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataHistoryEntry.code</code> attribute.
	 * @return the code - unique code that identifies the export data history
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataHistoryEntry.code</code> attribute. 
	 * @param value the code - unique code that identifies the export data history
	 */
	protected void setCode(final SessionContext ctx, final String value)
	{
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+CODE+"' is not changeable", 0 );
		}
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataHistoryEntry.code</code> attribute. 
	 * @param value the code - unique code that identifies the export data history
	 */
	protected void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		EXPORTDATACRONJOBHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataHistoryEntry.exportDataCronJob</code> attribute.
	 * @return the exportDataCronJob
	 */
	public ExportDataCronJob getExportDataCronJob(final SessionContext ctx)
	{
		return (ExportDataCronJob)getProperty( ctx, EXPORTDATACRONJOB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataHistoryEntry.exportDataCronJob</code> attribute.
	 * @return the exportDataCronJob
	 */
	public ExportDataCronJob getExportDataCronJob()
	{
		return getExportDataCronJob( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataHistoryEntry.exportDataCronJob</code> attribute. 
	 * @param value the exportDataCronJob
	 */
	public void setExportDataCronJob(final SessionContext ctx, final ExportDataCronJob value)
	{
		EXPORTDATACRONJOBHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataHistoryEntry.exportDataCronJob</code> attribute. 
	 * @param value the exportDataCronJob
	 */
	public void setExportDataCronJob(final ExportDataCronJob value)
	{
		setExportDataCronJob( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataHistoryEntry.failureMessage</code> attribute.
	 * @return the failureMessage - Message if failure occurred
	 */
	public String getFailureMessage(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FAILUREMESSAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataHistoryEntry.failureMessage</code> attribute.
	 * @return the failureMessage - Message if failure occurred
	 */
	public String getFailureMessage()
	{
		return getFailureMessage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataHistoryEntry.failureMessage</code> attribute. 
	 * @param value the failureMessage - Message if failure occurred
	 */
	public void setFailureMessage(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FAILUREMESSAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataHistoryEntry.failureMessage</code> attribute. 
	 * @param value the failureMessage - Message if failure occurred
	 */
	public void setFailureMessage(final String value)
	{
		setFailureMessage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataHistoryEntry.finishTime</code> attribute.
	 * @return the finishTime - Start time of this export
	 */
	public Date getFinishTime(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, FINISHTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataHistoryEntry.finishTime</code> attribute.
	 * @return the finishTime - Start time of this export
	 */
	public Date getFinishTime()
	{
		return getFinishTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataHistoryEntry.finishTime</code> attribute. 
	 * @param value the finishTime - Start time of this export
	 */
	public void setFinishTime(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, FINISHTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataHistoryEntry.finishTime</code> attribute. 
	 * @param value the finishTime - Start time of this export
	 */
	public void setFinishTime(final Date value)
	{
		setFinishTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataHistoryEntry.processedResultCount</code> attribute.
	 * @return the processedResultCount - The amount of records that was written to the export file
	 */
	public Integer getProcessedResultCount(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, PROCESSEDRESULTCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataHistoryEntry.processedResultCount</code> attribute.
	 * @return the processedResultCount - The amount of records that was written to the export file
	 */
	public Integer getProcessedResultCount()
	{
		return getProcessedResultCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataHistoryEntry.processedResultCount</code> attribute. 
	 * @return the processedResultCount - The amount of records that was written to the export file
	 */
	public int getProcessedResultCountAsPrimitive(final SessionContext ctx)
	{
		Integer value = getProcessedResultCount( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataHistoryEntry.processedResultCount</code> attribute. 
	 * @return the processedResultCount - The amount of records that was written to the export file
	 */
	public int getProcessedResultCountAsPrimitive()
	{
		return getProcessedResultCountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataHistoryEntry.processedResultCount</code> attribute. 
	 * @param value the processedResultCount - The amount of records that was written to the export file
	 */
	public void setProcessedResultCount(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, PROCESSEDRESULTCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataHistoryEntry.processedResultCount</code> attribute. 
	 * @param value the processedResultCount - The amount of records that was written to the export file
	 */
	public void setProcessedResultCount(final Integer value)
	{
		setProcessedResultCount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataHistoryEntry.processedResultCount</code> attribute. 
	 * @param value the processedResultCount - The amount of records that was written to the export file
	 */
	public void setProcessedResultCount(final SessionContext ctx, final int value)
	{
		setProcessedResultCount( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataHistoryEntry.processedResultCount</code> attribute. 
	 * @param value the processedResultCount - The amount of records that was written to the export file
	 */
	public void setProcessedResultCount(final int value)
	{
		setProcessedResultCount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataHistoryEntry.startTime</code> attribute.
	 * @return the startTime - Start time of this export
	 */
	public Date getStartTime(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, STARTTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataHistoryEntry.startTime</code> attribute.
	 * @return the startTime - Start time of this export
	 */
	public Date getStartTime()
	{
		return getStartTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataHistoryEntry.startTime</code> attribute. 
	 * @param value the startTime - Start time of this export
	 */
	public void setStartTime(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, STARTTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataHistoryEntry.startTime</code> attribute. 
	 * @param value the startTime - Start time of this export
	 */
	public void setStartTime(final Date value)
	{
		setStartTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataHistoryEntry.status</code> attribute.
	 * @return the status - The status of this particular export
	 */
	public EnumerationValue getStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportDataHistoryEntry.status</code> attribute.
	 * @return the status - The status of this particular export
	 */
	public EnumerationValue getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataHistoryEntry.status</code> attribute. 
	 * @param value the status - The status of this particular export
	 */
	public void setStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportDataHistoryEntry.status</code> attribute. 
	 * @param value the status - The status of this particular export
	 */
	public void setStatus(final EnumerationValue value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
}
