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
package de.hybris.platform.storelocator.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.storelocator.model.OpeningDayModel;
import java.util.Collection;
import java.util.Locale;

/**
 * Generated model class for type OpeningSchedule first defined at extension basecommerce.
 */
@SuppressWarnings("all")
public class OpeningScheduleModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "OpeningSchedule";
	
	/**<i>Generated relation code constant for relation <code>OpeningDays2ScheduleRelation</code> defining source attribute <code>openingDays</code> in extension <code>basecommerce</code>.</i>*/
	public final static String _OPENINGDAYS2SCHEDULERELATION = "OpeningDays2ScheduleRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>OpeningSchedule.code</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>OpeningSchedule.name</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>OpeningSchedule.openingDays</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String OPENINGDAYS = "openingDays";
	
	
	/** <i>Generated variable</i> - Variable of <code>OpeningSchedule.code</code> attribute defined at extension <code>basecommerce</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>OpeningSchedule.openingDays</code> attribute defined at extension <code>basecommerce</code>. */
	private Collection<OpeningDayModel> _openingDays;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public OpeningScheduleModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public OpeningScheduleModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>OpeningSchedule</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public OpeningScheduleModel(final String _code)
	{
		super();
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>OpeningSchedule</code> at extension <code>basecommerce</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public OpeningScheduleModel(final String _code, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OpeningSchedule.code</code> attribute defined at extension <code>basecommerce</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>OpeningSchedule.name</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the name
	 */
	public String getName()
	{
		return getName(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>OpeningSchedule.name</code> attribute defined at extension <code>basecommerce</code>. 
	 * @param loc the value localization key 
	 * @return the name
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getName(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(NAME, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OpeningSchedule.openingDays</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the openingDays
	 */
	public Collection<OpeningDayModel> getOpeningDays()
	{
		if (this._openingDays!=null)
		{
			return _openingDays;
		}
		return _openingDays = getPersistenceContext().getValue(OPENINGDAYS, _openingDays);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OpeningSchedule.code</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OpeningSchedule.name</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>OpeningSchedule.name</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the name
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setName(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(NAME, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OpeningSchedule.openingDays</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the openingDays
	 */
	public void setOpeningDays(final Collection<OpeningDayModel> value)
	{
		_openingDays = getPersistenceContext().setValue(OPENINGDAYS, value);
	}
	
}
