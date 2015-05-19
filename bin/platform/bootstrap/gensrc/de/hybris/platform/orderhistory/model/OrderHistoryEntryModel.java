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
package de.hybris.platform.orderhistory.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Date;
import java.util.Set;

/**
 * Generated model class for type OrderHistoryEntry first defined at extension basecommerce.
 */
@SuppressWarnings("all")
public class OrderHistoryEntryModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "OrderHistoryEntry";
	
	/**<i>Generated relation code constant for relation <code>OrderHistoryRelation</code> defining source attribute <code>order</code> in extension <code>basecommerce</code>.</i>*/
	public final static String _ORDERHISTORYRELATION = "OrderHistoryRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderHistoryEntry.timestamp</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String TIMESTAMP = "timestamp";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderHistoryEntry.employee</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String EMPLOYEE = "employee";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderHistoryEntry.description</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String DESCRIPTION = "description";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderHistoryEntry.previousOrderVersion</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String PREVIOUSORDERVERSION = "previousOrderVersion";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderHistoryEntry.order</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String ORDER = "order";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderHistoryEntry.documents</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String DOCUMENTS = "documents";
	
	
	/** <i>Generated variable</i> - Variable of <code>OrderHistoryEntry.timestamp</code> attribute defined at extension <code>basecommerce</code>. */
	private Date _timestamp;
	
	/** <i>Generated variable</i> - Variable of <code>OrderHistoryEntry.employee</code> attribute defined at extension <code>basecommerce</code>. */
	private EmployeeModel _employee;
	
	/** <i>Generated variable</i> - Variable of <code>OrderHistoryEntry.description</code> attribute defined at extension <code>basecommerce</code>. */
	private String _description;
	
	/** <i>Generated variable</i> - Variable of <code>OrderHistoryEntry.previousOrderVersion</code> attribute defined at extension <code>basecommerce</code>. */
	private OrderModel _previousOrderVersion;
	
	/** <i>Generated variable</i> - Variable of <code>OrderHistoryEntry.order</code> attribute defined at extension <code>basecommerce</code>. */
	private OrderModel _order;
	
	/** <i>Generated variable</i> - Variable of <code>OrderHistoryEntry.documents</code> attribute defined at extension <code>basecommerce</code>. */
	private Set<MediaModel> _documents;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public OrderHistoryEntryModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public OrderHistoryEntryModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _order initial attribute declared by type <code>OrderHistoryEntry</code> at extension <code>basecommerce</code>
	 * @param _timestamp initial attribute declared by type <code>OrderHistoryEntry</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public OrderHistoryEntryModel(final OrderModel _order, final Date _timestamp)
	{
		super();
		setOrder(_order);
		setTimestamp(_timestamp);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _order initial attribute declared by type <code>OrderHistoryEntry</code> at extension <code>basecommerce</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _timestamp initial attribute declared by type <code>OrderHistoryEntry</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public OrderHistoryEntryModel(final OrderModel _order, final ItemModel _owner, final Date _timestamp)
	{
		super();
		setOrder(_order);
		setOwner(_owner);
		setTimestamp(_timestamp);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHistoryEntry.description</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the description
	 */
	public String getDescription()
	{
		if (this._description!=null)
		{
			return _description;
		}
		return _description = getPersistenceContext().getValue(DESCRIPTION, _description);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHistoryEntry.documents</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the documents
	 */
	public Set<MediaModel> getDocuments()
	{
		if (this._documents!=null)
		{
			return _documents;
		}
		return _documents = getPersistenceContext().getValue(DOCUMENTS, _documents);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHistoryEntry.employee</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the employee
	 */
	public EmployeeModel getEmployee()
	{
		if (this._employee!=null)
		{
			return _employee;
		}
		return _employee = getPersistenceContext().getValue(EMPLOYEE, _employee);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHistoryEntry.order</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the order
	 */
	public OrderModel getOrder()
	{
		if (this._order!=null)
		{
			return _order;
		}
		return _order = getPersistenceContext().getValue(ORDER, _order);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHistoryEntry.previousOrderVersion</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the previousOrderVersion
	 */
	public OrderModel getPreviousOrderVersion()
	{
		if (this._previousOrderVersion!=null)
		{
			return _previousOrderVersion;
		}
		return _previousOrderVersion = getPersistenceContext().getValue(PREVIOUSORDERVERSION, _previousOrderVersion);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHistoryEntry.timestamp</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the timestamp
	 */
	public Date getTimestamp()
	{
		if (this._timestamp!=null)
		{
			return _timestamp;
		}
		return _timestamp = getPersistenceContext().getValue(TIMESTAMP, _timestamp);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderHistoryEntry.description</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the description
	 */
	public void setDescription(final String value)
	{
		_description = getPersistenceContext().setValue(DESCRIPTION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderHistoryEntry.documents</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the documents
	 */
	public void setDocuments(final Set<MediaModel> value)
	{
		_documents = getPersistenceContext().setValue(DOCUMENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderHistoryEntry.employee</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the employee
	 */
	public void setEmployee(final EmployeeModel value)
	{
		_employee = getPersistenceContext().setValue(EMPLOYEE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>OrderHistoryEntry.order</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the order
	 */
	public void setOrder(final OrderModel value)
	{
		_order = getPersistenceContext().setValue(ORDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderHistoryEntry.previousOrderVersion</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the previousOrderVersion
	 */
	public void setPreviousOrderVersion(final OrderModel value)
	{
		_previousOrderVersion = getPersistenceContext().setValue(PREVIOUSORDERVERSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>OrderHistoryEntry.timestamp</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the timestamp
	 */
	public void setTimestamp(final Date value)
	{
		_timestamp = getPersistenceContext().setValue(TIMESTAMP, value);
	}
	
}
