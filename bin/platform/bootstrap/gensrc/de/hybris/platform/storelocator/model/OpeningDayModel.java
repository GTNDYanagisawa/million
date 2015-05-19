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
import de.hybris.platform.storelocator.model.OpeningScheduleModel;
import java.util.Date;

/**
 * Generated model class for type OpeningDay first defined at extension basecommerce.
 */
@SuppressWarnings("all")
public class OpeningDayModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "OpeningDay";
	
	/** <i>Generated constant</i> - Attribute key of <code>OpeningDay.openingTime</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String OPENINGTIME = "openingTime";
	
	/** <i>Generated constant</i> - Attribute key of <code>OpeningDay.closingTime</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CLOSINGTIME = "closingTime";
	
	/** <i>Generated constant</i> - Attribute key of <code>OpeningDay.openingSchedule</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String OPENINGSCHEDULE = "openingSchedule";
	
	
	/** <i>Generated variable</i> - Variable of <code>OpeningDay.openingTime</code> attribute defined at extension <code>basecommerce</code>. */
	private Date _openingTime;
	
	/** <i>Generated variable</i> - Variable of <code>OpeningDay.closingTime</code> attribute defined at extension <code>basecommerce</code>. */
	private Date _closingTime;
	
	/** <i>Generated variable</i> - Variable of <code>OpeningDay.openingSchedule</code> attribute defined at extension <code>basecommerce</code>. */
	private OpeningScheduleModel _openingSchedule;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public OpeningDayModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public OpeningDayModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public OpeningDayModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OpeningDay.closingTime</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the closingTime
	 */
	public Date getClosingTime()
	{
		if (this._closingTime!=null)
		{
			return _closingTime;
		}
		return _closingTime = getPersistenceContext().getValue(CLOSINGTIME, _closingTime);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OpeningDay.openingSchedule</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the openingSchedule
	 */
	public OpeningScheduleModel getOpeningSchedule()
	{
		if (this._openingSchedule!=null)
		{
			return _openingSchedule;
		}
		return _openingSchedule = getPersistenceContext().getValue(OPENINGSCHEDULE, _openingSchedule);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OpeningDay.openingTime</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the openingTime
	 */
	public Date getOpeningTime()
	{
		if (this._openingTime!=null)
		{
			return _openingTime;
		}
		return _openingTime = getPersistenceContext().getValue(OPENINGTIME, _openingTime);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OpeningDay.closingTime</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the closingTime
	 */
	public void setClosingTime(final Date value)
	{
		_closingTime = getPersistenceContext().setValue(CLOSINGTIME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OpeningDay.openingSchedule</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the openingSchedule
	 */
	public void setOpeningSchedule(final OpeningScheduleModel value)
	{
		_openingSchedule = getPersistenceContext().setValue(OPENINGSCHEDULE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OpeningDay.openingTime</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the openingTime
	 */
	public void setOpeningTime(final Date value)
	{
		_openingTime = getPersistenceContext().setValue(OPENINGTIME, value);
	}
	
}
