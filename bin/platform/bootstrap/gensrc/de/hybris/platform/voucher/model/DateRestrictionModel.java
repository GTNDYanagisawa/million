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
package de.hybris.platform.voucher.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.voucher.model.RestrictionModel;
import de.hybris.platform.voucher.model.VoucherModel;
import java.util.Date;

/**
 * Generated model class for type DateRestriction first defined at extension voucher.
 */
@SuppressWarnings("all")
public class DateRestrictionModel extends RestrictionModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "DateRestriction";
	
	/** <i>Generated constant</i> - Attribute key of <code>DateRestriction.startDate</code> attribute defined at extension <code>voucher</code>. */
	public static final String STARTDATE = "startDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>DateRestriction.endDate</code> attribute defined at extension <code>voucher</code>. */
	public static final String ENDDATE = "endDate";
	
	
	/** <i>Generated variable</i> - Variable of <code>DateRestriction.startDate</code> attribute defined at extension <code>voucher</code>. */
	private Date _startDate;
	
	/** <i>Generated variable</i> - Variable of <code>DateRestriction.endDate</code> attribute defined at extension <code>voucher</code>. */
	private Date _endDate;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public DateRestrictionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public DateRestrictionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _endDate initial attribute declared by type <code>DateRestriction</code> at extension <code>voucher</code>
	 * @param _startDate initial attribute declared by type <code>DateRestriction</code> at extension <code>voucher</code>
	 * @param _voucher initial attribute declared by type <code>Restriction</code> at extension <code>voucher</code>
	 */
	@Deprecated
	public DateRestrictionModel(final Date _endDate, final Date _startDate, final VoucherModel _voucher)
	{
		super();
		setEndDate(_endDate);
		setStartDate(_startDate);
		setVoucher(_voucher);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _endDate initial attribute declared by type <code>DateRestriction</code> at extension <code>voucher</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _startDate initial attribute declared by type <code>DateRestriction</code> at extension <code>voucher</code>
	 * @param _voucher initial attribute declared by type <code>Restriction</code> at extension <code>voucher</code>
	 */
	@Deprecated
	public DateRestrictionModel(final Date _endDate, final ItemModel _owner, final Date _startDate, final VoucherModel _voucher)
	{
		super();
		setEndDate(_endDate);
		setOwner(_owner);
		setStartDate(_startDate);
		setVoucher(_voucher);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DateRestriction.endDate</code> attribute defined at extension <code>voucher</code>. 
	 * @return the endDate - the date until the given voucher is valid.
	 */
	public Date getEndDate()
	{
		if (this._endDate!=null)
		{
			return _endDate;
		}
		return _endDate = getPersistenceContext().getValue(ENDDATE, _endDate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DateRestriction.startDate</code> attribute defined at extension <code>voucher</code>. 
	 * @return the startDate - the date past which the given voucher is valid.
	 */
	public Date getStartDate()
	{
		if (this._startDate!=null)
		{
			return _startDate;
		}
		return _startDate = getPersistenceContext().getValue(STARTDATE, _startDate);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>DateRestriction.endDate</code> attribute defined at extension <code>voucher</code>. 
	 *  
	 * @param value the endDate - the date until the given voucher is valid.
	 */
	public void setEndDate(final Date value)
	{
		_endDate = getPersistenceContext().setValue(ENDDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>DateRestriction.startDate</code> attribute defined at extension <code>voucher</code>. 
	 *  
	 * @param value the startDate - the date past which the given voucher is valid.
	 */
	public void setStartDate(final Date value)
	{
		_startDate = getPersistenceContext().setValue(STARTDATE, value);
	}
	
}
