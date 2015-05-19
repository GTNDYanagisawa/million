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
package de.hybris.merchandise.fulfilmentprocess.jalo;

import de.hybris.merchandise.fulfilmentprocess.constants.MerchandiseFulfilmentProcessConstants;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.ordersplitting.jalo.ConsignmentProcess;
import de.hybris.platform.processengine.jalo.BusinessProcess;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>MerchandiseFulfilmentProcessManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMerchandiseFulfilmentProcessManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("done", AttributeMode.INITIAL);
		tmp.put("waitingForConsignment", AttributeMode.INITIAL);
		tmp.put("warehouseConsignmentState", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.ordersplitting.jalo.ConsignmentProcess", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConsignmentProcess.done</code> attribute.
	 * @return the done - Mark process as done
	 */
	public Boolean isDone(final SessionContext ctx, final ConsignmentProcess item)
	{
		return (Boolean)item.getProperty( ctx, MerchandiseFulfilmentProcessConstants.Attributes.ConsignmentProcess.DONE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConsignmentProcess.done</code> attribute.
	 * @return the done - Mark process as done
	 */
	public Boolean isDone(final ConsignmentProcess item)
	{
		return isDone( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConsignmentProcess.done</code> attribute. 
	 * @return the done - Mark process as done
	 */
	public boolean isDoneAsPrimitive(final SessionContext ctx, final ConsignmentProcess item)
	{
		Boolean value = isDone( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConsignmentProcess.done</code> attribute. 
	 * @return the done - Mark process as done
	 */
	public boolean isDoneAsPrimitive(final ConsignmentProcess item)
	{
		return isDoneAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConsignmentProcess.done</code> attribute. 
	 * @param value the done - Mark process as done
	 */
	public void setDone(final SessionContext ctx, final ConsignmentProcess item, final Boolean value)
	{
		item.setProperty(ctx, MerchandiseFulfilmentProcessConstants.Attributes.ConsignmentProcess.DONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConsignmentProcess.done</code> attribute. 
	 * @param value the done - Mark process as done
	 */
	public void setDone(final ConsignmentProcess item, final Boolean value)
	{
		setDone( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConsignmentProcess.done</code> attribute. 
	 * @param value the done - Mark process as done
	 */
	public void setDone(final SessionContext ctx, final ConsignmentProcess item, final boolean value)
	{
		setDone( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConsignmentProcess.done</code> attribute. 
	 * @param value the done - Mark process as done
	 */
	public void setDone(final ConsignmentProcess item, final boolean value)
	{
		setDone( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return MerchandiseFulfilmentProcessConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConsignmentProcess.waitingForConsignment</code> attribute.
	 * @return the waitingForConsignment - Mark that process is waiting for consignment
	 */
	public Boolean isWaitingForConsignment(final SessionContext ctx, final ConsignmentProcess item)
	{
		return (Boolean)item.getProperty( ctx, MerchandiseFulfilmentProcessConstants.Attributes.ConsignmentProcess.WAITINGFORCONSIGNMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConsignmentProcess.waitingForConsignment</code> attribute.
	 * @return the waitingForConsignment - Mark that process is waiting for consignment
	 */
	public Boolean isWaitingForConsignment(final ConsignmentProcess item)
	{
		return isWaitingForConsignment( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConsignmentProcess.waitingForConsignment</code> attribute. 
	 * @return the waitingForConsignment - Mark that process is waiting for consignment
	 */
	public boolean isWaitingForConsignmentAsPrimitive(final SessionContext ctx, final ConsignmentProcess item)
	{
		Boolean value = isWaitingForConsignment( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConsignmentProcess.waitingForConsignment</code> attribute. 
	 * @return the waitingForConsignment - Mark that process is waiting for consignment
	 */
	public boolean isWaitingForConsignmentAsPrimitive(final ConsignmentProcess item)
	{
		return isWaitingForConsignmentAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConsignmentProcess.waitingForConsignment</code> attribute. 
	 * @param value the waitingForConsignment - Mark that process is waiting for consignment
	 */
	public void setWaitingForConsignment(final SessionContext ctx, final ConsignmentProcess item, final Boolean value)
	{
		item.setProperty(ctx, MerchandiseFulfilmentProcessConstants.Attributes.ConsignmentProcess.WAITINGFORCONSIGNMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConsignmentProcess.waitingForConsignment</code> attribute. 
	 * @param value the waitingForConsignment - Mark that process is waiting for consignment
	 */
	public void setWaitingForConsignment(final ConsignmentProcess item, final Boolean value)
	{
		setWaitingForConsignment( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConsignmentProcess.waitingForConsignment</code> attribute. 
	 * @param value the waitingForConsignment - Mark that process is waiting for consignment
	 */
	public void setWaitingForConsignment(final SessionContext ctx, final ConsignmentProcess item, final boolean value)
	{
		setWaitingForConsignment( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConsignmentProcess.waitingForConsignment</code> attribute. 
	 * @param value the waitingForConsignment - Mark that process is waiting for consignment
	 */
	public void setWaitingForConsignment(final ConsignmentProcess item, final boolean value)
	{
		setWaitingForConsignment( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConsignmentProcess.warehouseConsignmentState</code> attribute.
	 * @return the warehouseConsignmentState - State of warehouse process.
	 */
	public EnumerationValue getWarehouseConsignmentState(final SessionContext ctx, final ConsignmentProcess item)
	{
		return (EnumerationValue)item.getProperty( ctx, MerchandiseFulfilmentProcessConstants.Attributes.ConsignmentProcess.WAREHOUSECONSIGNMENTSTATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConsignmentProcess.warehouseConsignmentState</code> attribute.
	 * @return the warehouseConsignmentState - State of warehouse process.
	 */
	public EnumerationValue getWarehouseConsignmentState(final ConsignmentProcess item)
	{
		return getWarehouseConsignmentState( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConsignmentProcess.warehouseConsignmentState</code> attribute. 
	 * @param value the warehouseConsignmentState - State of warehouse process.
	 */
	public void setWarehouseConsignmentState(final SessionContext ctx, final ConsignmentProcess item, final EnumerationValue value)
	{
		item.setProperty(ctx, MerchandiseFulfilmentProcessConstants.Attributes.ConsignmentProcess.WAREHOUSECONSIGNMENTSTATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConsignmentProcess.warehouseConsignmentState</code> attribute. 
	 * @param value the warehouseConsignmentState - State of warehouse process.
	 */
	public void setWarehouseConsignmentState(final ConsignmentProcess item, final EnumerationValue value)
	{
		setWarehouseConsignmentState( getSession().getSessionContext(), item, value );
	}
	
}
