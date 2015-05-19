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
package de.hybris.platform.ticket.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.ticket.enums.CsTicketCategory;
import de.hybris.platform.ticket.enums.CsTicketPriority;
import de.hybris.platform.ticket.enums.CsTicketState;
import de.hybris.platform.ticket.events.model.CsTicketEventModel;
import de.hybris.platform.ticket.events.model.CsTicketResolutionEventModel;
import de.hybris.platform.ticket.model.CsAgentGroupModel;
import java.util.List;

/**
 * Generated model class for type CsTicket first defined at extension ticketsystem.
 */
@SuppressWarnings("all")
public class CsTicketModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CsTicket";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicket.ticketID</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String TICKETID = "ticketID";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicket.customer</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String CUSTOMER = "customer";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicket.order</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String ORDER = "order";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicket.headline</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String HEADLINE = "headline";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicket.category</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String CATEGORY = "category";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicket.priority</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String PRIORITY = "priority";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicket.state</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String STATE = "state";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicket.assignedAgent</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String ASSIGNEDAGENT = "assignedAgent";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicket.assignedGroup</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String ASSIGNEDGROUP = "assignedGroup";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicket.resolution</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String RESOLUTION = "resolution";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicket.events</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String EVENTS = "events";
	
	
	/** <i>Generated variable</i> - Variable of <code>CsTicket.ticketID</code> attribute defined at extension <code>ticketsystem</code>. */
	private String _ticketID;
	
	/** <i>Generated variable</i> - Variable of <code>CsTicket.customer</code> attribute defined at extension <code>ticketsystem</code>. */
	private UserModel _customer;
	
	/** <i>Generated variable</i> - Variable of <code>CsTicket.order</code> attribute defined at extension <code>ticketsystem</code>. */
	private AbstractOrderModel _order;
	
	/** <i>Generated variable</i> - Variable of <code>CsTicket.headline</code> attribute defined at extension <code>ticketsystem</code>. */
	private String _headline;
	
	/** <i>Generated variable</i> - Variable of <code>CsTicket.category</code> attribute defined at extension <code>ticketsystem</code>. */
	private CsTicketCategory _category;
	
	/** <i>Generated variable</i> - Variable of <code>CsTicket.priority</code> attribute defined at extension <code>ticketsystem</code>. */
	private CsTicketPriority _priority;
	
	/** <i>Generated variable</i> - Variable of <code>CsTicket.state</code> attribute defined at extension <code>ticketsystem</code>. */
	private CsTicketState _state;
	
	/** <i>Generated variable</i> - Variable of <code>CsTicket.assignedAgent</code> attribute defined at extension <code>ticketsystem</code>. */
	private EmployeeModel _assignedAgent;
	
	/** <i>Generated variable</i> - Variable of <code>CsTicket.assignedGroup</code> attribute defined at extension <code>ticketsystem</code>. */
	private CsAgentGroupModel _assignedGroup;
	
	/** <i>Generated variable</i> - Variable of <code>CsTicket.resolution</code> attribute defined at extension <code>ticketsystem</code>. */
	private CsTicketResolutionEventModel _resolution;
	
	/** <i>Generated variable</i> - Variable of <code>CsTicket.events</code> attribute defined at extension <code>ticketsystem</code>. */
	private List<CsTicketEventModel> _events;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CsTicketModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CsTicketModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _ticketID initial attribute declared by type <code>CsTicket</code> at extension <code>ticketsystem</code>
	 */
	@Deprecated
	public CsTicketModel(final ItemModel _owner, final String _ticketID)
	{
		super();
		setOwner(_owner);
		setTicketID(_ticketID);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicket.assignedAgent</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the assignedAgent
	 */
	public EmployeeModel getAssignedAgent()
	{
		if (this._assignedAgent!=null)
		{
			return _assignedAgent;
		}
		return _assignedAgent = getPersistenceContext().getValue(ASSIGNEDAGENT, _assignedAgent);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicket.assignedGroup</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the assignedGroup
	 */
	public CsAgentGroupModel getAssignedGroup()
	{
		if (this._assignedGroup!=null)
		{
			return _assignedGroup;
		}
		return _assignedGroup = getPersistenceContext().getValue(ASSIGNEDGROUP, _assignedGroup);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicket.category</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the category
	 */
	public CsTicketCategory getCategory()
	{
		if (this._category!=null)
		{
			return _category;
		}
		return _category = getPersistenceContext().getValue(CATEGORY, _category);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicket.customer</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the customer
	 */
	public UserModel getCustomer()
	{
		if (this._customer!=null)
		{
			return _customer;
		}
		return _customer = getPersistenceContext().getValue(CUSTOMER, _customer);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicket.events</code> attribute defined at extension <code>ticketsystem</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the events
	 */
	@Deprecated
	public List<CsTicketEventModel> getEvents()
	{
		if (this._events!=null)
		{
			return _events;
		}
		return _events = getPersistenceContext().getValue(EVENTS, _events);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicket.headline</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the headline
	 */
	public String getHeadline()
	{
		if (this._headline!=null)
		{
			return _headline;
		}
		return _headline = getPersistenceContext().getValue(HEADLINE, _headline);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicket.order</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the order
	 */
	public AbstractOrderModel getOrder()
	{
		if (this._order!=null)
		{
			return _order;
		}
		return _order = getPersistenceContext().getValue(ORDER, _order);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicket.priority</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the priority
	 */
	public CsTicketPriority getPriority()
	{
		if (this._priority!=null)
		{
			return _priority;
		}
		return _priority = getPersistenceContext().getValue(PRIORITY, _priority);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicket.resolution</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the resolution
	 */
	public CsTicketResolutionEventModel getResolution()
	{
		if (this._resolution!=null)
		{
			return _resolution;
		}
		return _resolution = getPersistenceContext().getValue(RESOLUTION, _resolution);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicket.state</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the state
	 */
	public CsTicketState getState()
	{
		if (this._state!=null)
		{
			return _state;
		}
		return _state = getPersistenceContext().getValue(STATE, _state);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicket.ticketID</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the ticketID
	 */
	public String getTicketID()
	{
		if (this._ticketID!=null)
		{
			return _ticketID;
		}
		return _ticketID = getPersistenceContext().getValue(TICKETID, _ticketID);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicket.assignedAgent</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the assignedAgent
	 */
	public void setAssignedAgent(final EmployeeModel value)
	{
		_assignedAgent = getPersistenceContext().setValue(ASSIGNEDAGENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicket.assignedGroup</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the assignedGroup
	 */
	public void setAssignedGroup(final CsAgentGroupModel value)
	{
		_assignedGroup = getPersistenceContext().setValue(ASSIGNEDGROUP, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicket.category</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the category
	 */
	public void setCategory(final CsTicketCategory value)
	{
		_category = getPersistenceContext().setValue(CATEGORY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicket.customer</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the customer
	 */
	public void setCustomer(final UserModel value)
	{
		_customer = getPersistenceContext().setValue(CUSTOMER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicket.headline</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the headline
	 */
	public void setHeadline(final String value)
	{
		_headline = getPersistenceContext().setValue(HEADLINE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicket.order</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the order
	 */
	public void setOrder(final AbstractOrderModel value)
	{
		_order = getPersistenceContext().setValue(ORDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicket.priority</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the priority
	 */
	public void setPriority(final CsTicketPriority value)
	{
		_priority = getPersistenceContext().setValue(PRIORITY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicket.resolution</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the resolution
	 */
	public void setResolution(final CsTicketResolutionEventModel value)
	{
		_resolution = getPersistenceContext().setValue(RESOLUTION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicket.state</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the state
	 */
	public void setState(final CsTicketState value)
	{
		_state = getPersistenceContext().setValue(STATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>CsTicket.ticketID</code> attribute defined at extension <code>ticketsystem</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the ticketID
	 */
	public void setTicketID(final String value)
	{
		_ticketID = getPersistenceContext().setValue(TICKETID, value);
	}
	
}
