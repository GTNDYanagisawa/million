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
import de.hybris.platform.core.model.type.AttributeDescriptorModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.ticket.events.model.CsTicketEventModel;

/**
 * Generated model class for type CsTicketChangeEventEntry first defined at extension ticketsystem.
 */
@SuppressWarnings("all")
public class CsTicketChangeEventEntryModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CsTicketChangeEventEntry";
	
	/**<i>Generated relation code constant for relation <code>CsTicketEvent2CsTicketChangeEntry</code> defining source attribute <code>event</code> in extension <code>ticketsystem</code>.</i>*/
	public final static String _CSTICKETEVENT2CSTICKETCHANGEENTRY = "CsTicketEvent2CsTicketChangeEntry";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicketChangeEventEntry.alteredAttribute</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String ALTEREDATTRIBUTE = "alteredAttribute";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicketChangeEventEntry.oldStringValue</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String OLDSTRINGVALUE = "oldStringValue";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicketChangeEventEntry.newStringValue</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String NEWSTRINGVALUE = "newStringValue";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicketChangeEventEntry.oldBinaryValue</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String OLDBINARYVALUE = "oldBinaryValue";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicketChangeEventEntry.newBinaryValue</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String NEWBINARYVALUE = "newBinaryValue";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicketChangeEventEntry.event</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String EVENT = "event";
	
	
	/** <i>Generated variable</i> - Variable of <code>CsTicketChangeEventEntry.alteredAttribute</code> attribute defined at extension <code>ticketsystem</code>. */
	private AttributeDescriptorModel _alteredAttribute;
	
	/** <i>Generated variable</i> - Variable of <code>CsTicketChangeEventEntry.oldStringValue</code> attribute defined at extension <code>ticketsystem</code>. */
	private String _oldStringValue;
	
	/** <i>Generated variable</i> - Variable of <code>CsTicketChangeEventEntry.newStringValue</code> attribute defined at extension <code>ticketsystem</code>. */
	private String _newStringValue;
	
	/** <i>Generated variable</i> - Variable of <code>CsTicketChangeEventEntry.oldBinaryValue</code> attribute defined at extension <code>ticketsystem</code>. */
	private Object _oldBinaryValue;
	
	/** <i>Generated variable</i> - Variable of <code>CsTicketChangeEventEntry.newBinaryValue</code> attribute defined at extension <code>ticketsystem</code>. */
	private Object _newBinaryValue;
	
	/** <i>Generated variable</i> - Variable of <code>CsTicketChangeEventEntry.event</code> attribute defined at extension <code>ticketsystem</code>. */
	private CsTicketEventModel _event;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CsTicketChangeEventEntryModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CsTicketChangeEventEntryModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public CsTicketChangeEventEntryModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketChangeEventEntry.alteredAttribute</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the alteredAttribute
	 */
	public AttributeDescriptorModel getAlteredAttribute()
	{
		if (this._alteredAttribute!=null)
		{
			return _alteredAttribute;
		}
		return _alteredAttribute = getPersistenceContext().getValue(ALTEREDATTRIBUTE, _alteredAttribute);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketChangeEventEntry.event</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the event
	 */
	public CsTicketEventModel getEvent()
	{
		if (this._event!=null)
		{
			return _event;
		}
		return _event = getPersistenceContext().getValue(EVENT, _event);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketChangeEventEntry.newBinaryValue</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the newBinaryValue
	 */
	public Object getNewBinaryValue()
	{
		if (this._newBinaryValue!=null)
		{
			return _newBinaryValue;
		}
		return _newBinaryValue = getPersistenceContext().getValue(NEWBINARYVALUE, _newBinaryValue);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketChangeEventEntry.newStringValue</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the newStringValue
	 */
	public String getNewStringValue()
	{
		if (this._newStringValue!=null)
		{
			return _newStringValue;
		}
		return _newStringValue = getPersistenceContext().getValue(NEWSTRINGVALUE, _newStringValue);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketChangeEventEntry.oldBinaryValue</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the oldBinaryValue
	 */
	public Object getOldBinaryValue()
	{
		if (this._oldBinaryValue!=null)
		{
			return _oldBinaryValue;
		}
		return _oldBinaryValue = getPersistenceContext().getValue(OLDBINARYVALUE, _oldBinaryValue);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketChangeEventEntry.oldStringValue</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the oldStringValue
	 */
	public String getOldStringValue()
	{
		if (this._oldStringValue!=null)
		{
			return _oldStringValue;
		}
		return _oldStringValue = getPersistenceContext().getValue(OLDSTRINGVALUE, _oldStringValue);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicketChangeEventEntry.alteredAttribute</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the alteredAttribute
	 */
	public void setAlteredAttribute(final AttributeDescriptorModel value)
	{
		_alteredAttribute = getPersistenceContext().setValue(ALTEREDATTRIBUTE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicketChangeEventEntry.event</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the event
	 */
	public void setEvent(final CsTicketEventModel value)
	{
		_event = getPersistenceContext().setValue(EVENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicketChangeEventEntry.newBinaryValue</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the newBinaryValue
	 */
	public void setNewBinaryValue(final Object value)
	{
		_newBinaryValue = getPersistenceContext().setValue(NEWBINARYVALUE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicketChangeEventEntry.newStringValue</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the newStringValue
	 */
	public void setNewStringValue(final String value)
	{
		_newStringValue = getPersistenceContext().setValue(NEWSTRINGVALUE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicketChangeEventEntry.oldBinaryValue</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the oldBinaryValue
	 */
	public void setOldBinaryValue(final Object value)
	{
		_oldBinaryValue = getPersistenceContext().setValue(OLDBINARYVALUE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicketChangeEventEntry.oldStringValue</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the oldStringValue
	 */
	public void setOldStringValue(final String value)
	{
		_oldStringValue = getPersistenceContext().setValue(OLDSTRINGVALUE, value);
	}
	
}
