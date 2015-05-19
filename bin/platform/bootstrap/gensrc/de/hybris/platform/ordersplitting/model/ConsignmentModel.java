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
package de.hybris.platform.ordersplitting.model;

import de.hybris.platform.basecommerce.enums.ConsignmentStatus;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.core.model.order.delivery.DeliveryModeModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.ordersplitting.model.ConsignmentEntryModel;
import de.hybris.platform.ordersplitting.model.ConsignmentProcessModel;
import de.hybris.platform.ordersplitting.model.WarehouseModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.storelocator.model.PointOfServiceModel;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

/**
 * Generated model class for type Consignment first defined at extension basecommerce.
 */
@SuppressWarnings("all")
public class ConsignmentModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "Consignment";
	
	/**<i>Generated relation code constant for relation <code>ConsignmentEntryConsignmentRelation</code> defining source attribute <code>consignmentEntries</code> in extension <code>basecommerce</code>.</i>*/
	public final static String _CONSIGNMENTENTRYCONSIGNMENTRELATION = "ConsignmentEntryConsignmentRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>Consignment.code</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>Consignment.shippingAddress</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String SHIPPINGADDRESS = "shippingAddress";
	
	/** <i>Generated constant</i> - Attribute key of <code>Consignment.deliveryMode</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String DELIVERYMODE = "deliveryMode";
	
	/** <i>Generated constant</i> - Attribute key of <code>Consignment.namedDeliveryDate</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String NAMEDDELIVERYDATE = "namedDeliveryDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>Consignment.shippingDate</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String SHIPPINGDATE = "shippingDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>Consignment.trackingID</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String TRACKINGID = "trackingID";
	
	/** <i>Generated constant</i> - Attribute key of <code>Consignment.carrier</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CARRIER = "carrier";
	
	/** <i>Generated constant</i> - Attribute key of <code>Consignment.status</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String STATUS = "status";
	
	/** <i>Generated constant</i> - Attribute key of <code>Consignment.warehouse</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String WAREHOUSE = "warehouse";
	
	/** <i>Generated constant</i> - Attribute key of <code>Consignment.consignmentEntries</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CONSIGNMENTENTRIES = "consignmentEntries";
	
	/** <i>Generated constant</i> - Attribute key of <code>Consignment.order</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String ORDER = "order";
	
	/** <i>Generated constant</i> - Attribute key of <code>Consignment.consignmentProcesses</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CONSIGNMENTPROCESSES = "consignmentProcesses";
	
	/** <i>Generated constant</i> - Attribute key of <code>Consignment.deliveryPointOfService</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String DELIVERYPOINTOFSERVICE = "deliveryPointOfService";
	
	/** <i>Generated constant</i> - Attribute key of <code>Consignment.statusDisplay</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String STATUSDISPLAY = "statusDisplay";
	
	
	/** <i>Generated variable</i> - Variable of <code>Consignment.code</code> attribute defined at extension <code>basecommerce</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>Consignment.shippingAddress</code> attribute defined at extension <code>basecommerce</code>. */
	private AddressModel _shippingAddress;
	
	/** <i>Generated variable</i> - Variable of <code>Consignment.deliveryMode</code> attribute defined at extension <code>basecommerce</code>. */
	private DeliveryModeModel _deliveryMode;
	
	/** <i>Generated variable</i> - Variable of <code>Consignment.namedDeliveryDate</code> attribute defined at extension <code>basecommerce</code>. */
	private Date _namedDeliveryDate;
	
	/** <i>Generated variable</i> - Variable of <code>Consignment.shippingDate</code> attribute defined at extension <code>basecommerce</code>. */
	private Date _shippingDate;
	
	/** <i>Generated variable</i> - Variable of <code>Consignment.trackingID</code> attribute defined at extension <code>basecommerce</code>. */
	private String _trackingID;
	
	/** <i>Generated variable</i> - Variable of <code>Consignment.carrier</code> attribute defined at extension <code>basecommerce</code>. */
	private String _carrier;
	
	/** <i>Generated variable</i> - Variable of <code>Consignment.status</code> attribute defined at extension <code>basecommerce</code>. */
	private ConsignmentStatus _status;
	
	/** <i>Generated variable</i> - Variable of <code>Consignment.warehouse</code> attribute defined at extension <code>basecommerce</code>. */
	private WarehouseModel _warehouse;
	
	/** <i>Generated variable</i> - Variable of <code>Consignment.consignmentEntries</code> attribute defined at extension <code>basecommerce</code>. */
	private Set<ConsignmentEntryModel> _consignmentEntries;
	
	/** <i>Generated variable</i> - Variable of <code>Consignment.order</code> attribute defined at extension <code>basecommerce</code>. */
	private AbstractOrderModel _order;
	
	/** <i>Generated variable</i> - Variable of <code>Consignment.consignmentProcesses</code> attribute defined at extension <code>basecommerce</code>. */
	private Collection<ConsignmentProcessModel> _consignmentProcesses;
	
	/** <i>Generated variable</i> - Variable of <code>Consignment.deliveryPointOfService</code> attribute defined at extension <code>commerceservices</code>. */
	private PointOfServiceModel _deliveryPointOfService;
	
	/** <i>Generated variable</i> - Variable of <code>Consignment.statusDisplay</code> attribute defined at extension <code>acceleratorservices</code>. */
	private String _statusDisplay;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ConsignmentModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ConsignmentModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>Consignment</code> at extension <code>basecommerce</code>
	 * @param _shippingAddress initial attribute declared by type <code>Consignment</code> at extension <code>basecommerce</code>
	 * @param _status initial attribute declared by type <code>Consignment</code> at extension <code>basecommerce</code>
	 * @param _warehouse initial attribute declared by type <code>Consignment</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public ConsignmentModel(final String _code, final AddressModel _shippingAddress, final ConsignmentStatus _status, final WarehouseModel _warehouse)
	{
		super();
		setCode(_code);
		setShippingAddress(_shippingAddress);
		setStatus(_status);
		setWarehouse(_warehouse);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>Consignment</code> at extension <code>basecommerce</code>
	 * @param _deliveryMode initial attribute declared by type <code>Consignment</code> at extension <code>basecommerce</code>
	 * @param _namedDeliveryDate initial attribute declared by type <code>Consignment</code> at extension <code>basecommerce</code>
	 * @param _order initial attribute declared by type <code>Consignment</code> at extension <code>basecommerce</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _shippingAddress initial attribute declared by type <code>Consignment</code> at extension <code>basecommerce</code>
	 * @param _status initial attribute declared by type <code>Consignment</code> at extension <code>basecommerce</code>
	 * @param _warehouse initial attribute declared by type <code>Consignment</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public ConsignmentModel(final String _code, final DeliveryModeModel _deliveryMode, final Date _namedDeliveryDate, final AbstractOrderModel _order, final ItemModel _owner, final AddressModel _shippingAddress, final ConsignmentStatus _status, final WarehouseModel _warehouse)
	{
		super();
		setCode(_code);
		setDeliveryMode(_deliveryMode);
		setNamedDeliveryDate(_namedDeliveryDate);
		setOrder(_order);
		setOwner(_owner);
		setShippingAddress(_shippingAddress);
		setStatus(_status);
		setWarehouse(_warehouse);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Consignment.carrier</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the carrier
	 */
	public String getCarrier()
	{
		if (this._carrier!=null)
		{
			return _carrier;
		}
		return _carrier = getPersistenceContext().getValue(CARRIER, _carrier);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Consignment.code</code> attribute defined at extension <code>basecommerce</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Consignment.consignmentEntries</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the consignmentEntries
	 */
	public Set<ConsignmentEntryModel> getConsignmentEntries()
	{
		if (this._consignmentEntries!=null)
		{
			return _consignmentEntries;
		}
		return _consignmentEntries = getPersistenceContext().getValue(CONSIGNMENTENTRIES, _consignmentEntries);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Consignment.consignmentProcesses</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the consignmentProcesses
	 */
	public Collection<ConsignmentProcessModel> getConsignmentProcesses()
	{
		if (this._consignmentProcesses!=null)
		{
			return _consignmentProcesses;
		}
		return _consignmentProcesses = getPersistenceContext().getValue(CONSIGNMENTPROCESSES, _consignmentProcesses);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Consignment.deliveryMode</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the deliveryMode
	 */
	public DeliveryModeModel getDeliveryMode()
	{
		if (this._deliveryMode!=null)
		{
			return _deliveryMode;
		}
		return _deliveryMode = getPersistenceContext().getValue(DELIVERYMODE, _deliveryMode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Consignment.deliveryPointOfService</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the deliveryPointOfService - The point of service to deliver to/collect from.
	 */
	public PointOfServiceModel getDeliveryPointOfService()
	{
		if (this._deliveryPointOfService!=null)
		{
			return _deliveryPointOfService;
		}
		return _deliveryPointOfService = getPersistenceContext().getValue(DELIVERYPOINTOFSERVICE, _deliveryPointOfService);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Consignment.namedDeliveryDate</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the namedDeliveryDate
	 */
	public Date getNamedDeliveryDate()
	{
		if (this._namedDeliveryDate!=null)
		{
			return _namedDeliveryDate;
		}
		return _namedDeliveryDate = getPersistenceContext().getValue(NAMEDDELIVERYDATE, _namedDeliveryDate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Consignment.order</code> attribute defined at extension <code>basecommerce</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Consignment.shippingAddress</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the shippingAddress
	 */
	public AddressModel getShippingAddress()
	{
		if (this._shippingAddress!=null)
		{
			return _shippingAddress;
		}
		return _shippingAddress = getPersistenceContext().getValue(SHIPPINGADDRESS, _shippingAddress);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Consignment.shippingDate</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the shippingDate
	 */
	public Date getShippingDate()
	{
		if (this._shippingDate!=null)
		{
			return _shippingDate;
		}
		return _shippingDate = getPersistenceContext().getValue(SHIPPINGDATE, _shippingDate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Consignment.status</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the status
	 */
	public ConsignmentStatus getStatus()
	{
		if (this._status!=null)
		{
			return _status;
		}
		return _status = getPersistenceContext().getValue(STATUS, _status);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Consignment.statusDisplay</code> dynamic attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the statusDisplay
	 */
	public String getStatusDisplay()
	{
		return getPersistenceContext().getDynamicValue(this,STATUSDISPLAY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Consignment.trackingID</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the trackingID
	 */
	public String getTrackingID()
	{
		if (this._trackingID!=null)
		{
			return _trackingID;
		}
		return _trackingID = getPersistenceContext().getValue(TRACKINGID, _trackingID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Consignment.warehouse</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the warehouse
	 */
	public WarehouseModel getWarehouse()
	{
		if (this._warehouse!=null)
		{
			return _warehouse;
		}
		return _warehouse = getPersistenceContext().getValue(WAREHOUSE, _warehouse);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Consignment.carrier</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the carrier
	 */
	public void setCarrier(final String value)
	{
		_carrier = getPersistenceContext().setValue(CARRIER, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>Consignment.code</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Consignment.consignmentEntries</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the consignmentEntries
	 */
	public void setConsignmentEntries(final Set<ConsignmentEntryModel> value)
	{
		_consignmentEntries = getPersistenceContext().setValue(CONSIGNMENTENTRIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Consignment.consignmentProcesses</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the consignmentProcesses
	 */
	public void setConsignmentProcesses(final Collection<ConsignmentProcessModel> value)
	{
		_consignmentProcesses = getPersistenceContext().setValue(CONSIGNMENTPROCESSES, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>Consignment.deliveryMode</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the deliveryMode
	 */
	public void setDeliveryMode(final DeliveryModeModel value)
	{
		_deliveryMode = getPersistenceContext().setValue(DELIVERYMODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Consignment.deliveryPointOfService</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the deliveryPointOfService - The point of service to deliver to/collect from.
	 */
	public void setDeliveryPointOfService(final PointOfServiceModel value)
	{
		_deliveryPointOfService = getPersistenceContext().setValue(DELIVERYPOINTOFSERVICE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>Consignment.namedDeliveryDate</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the namedDeliveryDate
	 */
	public void setNamedDeliveryDate(final Date value)
	{
		_namedDeliveryDate = getPersistenceContext().setValue(NAMEDDELIVERYDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>Consignment.order</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the order
	 */
	public void setOrder(final AbstractOrderModel value)
	{
		_order = getPersistenceContext().setValue(ORDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>Consignment.shippingAddress</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the shippingAddress
	 */
	public void setShippingAddress(final AddressModel value)
	{
		_shippingAddress = getPersistenceContext().setValue(SHIPPINGADDRESS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Consignment.shippingDate</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the shippingDate
	 */
	public void setShippingDate(final Date value)
	{
		_shippingDate = getPersistenceContext().setValue(SHIPPINGDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Consignment.status</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the status
	 */
	public void setStatus(final ConsignmentStatus value)
	{
		_status = getPersistenceContext().setValue(STATUS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Consignment.trackingID</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the trackingID
	 */
	public void setTrackingID(final String value)
	{
		_trackingID = getPersistenceContext().setValue(TRACKINGID, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>Consignment.warehouse</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the warehouse
	 */
	public void setWarehouse(final WarehouseModel value)
	{
		_warehouse = getPersistenceContext().setValue(WAREHOUSE, value);
	}
	
}
