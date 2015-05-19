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
package de.hybris.platform.ticket.events.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.ticket.events.model.CsTicketChangeEventEntryModel;

/**
 * Generated model class for type CsTicketChangeEventEmployeeEntry first defined at extension ticketsystem.
 */
@SuppressWarnings("all")
public class CsTicketChangeEventEmployeeEntryModel extends CsTicketChangeEventEntryModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CsTicketChangeEventEmployeeEntry";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicketChangeEventEmployeeEntry.oldValue</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String OLDVALUE = "oldValue";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicketChangeEventEmployeeEntry.newValue</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String NEWVALUE = "newValue";
	
	
	/** <i>Generated variable</i> - Variable of <code>CsTicketChangeEventEmployeeEntry.oldValue</code> attribute defined at extension <code>ticketsystem</code>. */
	private EmployeeModel _oldValue;
	
	/** <i>Generated variable</i> - Variable of <code>CsTicketChangeEventEmployeeEntry.newValue</code> attribute defined at extension <code>ticketsystem</code>. */
	private EmployeeModel _newValue;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CsTicketChangeEventEmployeeEntryModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CsTicketChangeEventEmployeeEntryModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public CsTicketChangeEventEmployeeEntryModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketChangeEventEmployeeEntry.newValue</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the newValue
	 */
	public EmployeeModel getNewValue()
	{
		if (this._newValue!=null)
		{
			return _newValue;
		}
		return _newValue = getPersistenceContext().getValue(NEWVALUE, _newValue);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketChangeEventEmployeeEntry.oldValue</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the oldValue
	 */
	public EmployeeModel getOldValue()
	{
		if (this._oldValue!=null)
		{
			return _oldValue;
		}
		return _oldValue = getPersistenceContext().getValue(OLDVALUE, _oldValue);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicketChangeEventEmployeeEntry.newValue</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the newValue
	 */
	public void setNewValue(final EmployeeModel value)
	{
		_newValue = getPersistenceContext().setValue(NEWVALUE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicketChangeEventEmployeeEntry.oldValue</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the oldValue
	 */
	public void setOldValue(final EmployeeModel value)
	{
		_oldValue = getPersistenceContext().setValue(OLDVALUE, value);
	}
	
}
