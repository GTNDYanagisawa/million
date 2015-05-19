/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2015/04/16 16:55:23                         ---
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
package de.hybris.platform.b2bacceleratorservices.jalo;

import de.hybris.platform.b2bacceleratorservices.constants.B2BAcceleratorServicesConstants;
import de.hybris.platform.b2bacceleratorservices.jalo.btg.BTGAssignOrganizationToGroupDefinition;
import de.hybris.platform.b2bacceleratorservices.jalo.btg.BTGNumberOfOrdersAboveAmountRelativeDateOperand;
import de.hybris.platform.b2bacceleratorservices.jalo.btg.BTGOrganizationUIDOfUserOperand;
import de.hybris.platform.b2bacceleratorservices.jalo.btg.BTGOrganizationUIDsOperand;
import de.hybris.platform.b2bacceleratorservices.jalo.process.ReplenishmentProcess;
import de.hybris.platform.b2bacceleratorservices.jalo.promotions.OrderThresholdDiscountPercentagePromotion;
import de.hybris.platform.b2bacceleratorservices.jalo.promotions.ProductPriceDiscountPromotionByPaymentType;
import de.hybris.platform.b2bacceleratorservices.jalo.promotions.ProductThresholdPriceDiscountPromotion;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.order.AbstractOrder;
import de.hybris.platform.jalo.order.Order;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.orderscheduling.jalo.CartToOrderCronJob;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>B2BAcceleratorServicesManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedB2BAcceleratorServicesManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n ORDERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Order> ORDER2CARTTOORDERCRONJOBORDERSHANDLER = new OneToManyHandler<Order>(
	CoreConstants.TC.ORDER,
	false,
	"schedulingCronJob",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("purchaseOrderNumber", AttributeMode.INITIAL);
		tmp.put("paymentType", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.AbstractOrder", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("schedulingCronJob", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.Order", Collections.unmodifiableMap(tmp));
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
	
	public BTGAssignOrganizationToGroupDefinition createBTGAssignOrganizationToGroupDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( B2BAcceleratorServicesConstants.TC.BTGASSIGNORGANIZATIONTOGROUPDEFINITION );
			return (BTGAssignOrganizationToGroupDefinition)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating BTGAssignOrganizationToGroupDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public BTGAssignOrganizationToGroupDefinition createBTGAssignOrganizationToGroupDefinition(final Map attributeValues)
	{
		return createBTGAssignOrganizationToGroupDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public BTGNumberOfOrdersAboveAmountRelativeDateOperand createBTGNumberOfOrdersAboveAmountRelativeDateOperand(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( B2BAcceleratorServicesConstants.TC.BTGNUMBEROFORDERSABOVEAMOUNTRELATIVEDATEOPERAND );
			return (BTGNumberOfOrdersAboveAmountRelativeDateOperand)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating BTGNumberOfOrdersAboveAmountRelativeDateOperand : "+e.getMessage(), 0 );
		}
	}
	
	public BTGNumberOfOrdersAboveAmountRelativeDateOperand createBTGNumberOfOrdersAboveAmountRelativeDateOperand(final Map attributeValues)
	{
		return createBTGNumberOfOrdersAboveAmountRelativeDateOperand( getSession().getSessionContext(), attributeValues );
	}
	
	public BTGOrganizationUIDOfUserOperand createBTGOrganizationUIDOfUserOperand(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( B2BAcceleratorServicesConstants.TC.BTGORGANIZATIONUIDOFUSEROPERAND );
			return (BTGOrganizationUIDOfUserOperand)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating BTGOrganizationUIDOfUserOperand : "+e.getMessage(), 0 );
		}
	}
	
	public BTGOrganizationUIDOfUserOperand createBTGOrganizationUIDOfUserOperand(final Map attributeValues)
	{
		return createBTGOrganizationUIDOfUserOperand( getSession().getSessionContext(), attributeValues );
	}
	
	public BTGOrganizationUIDsOperand createBTGOrganizationUIDsOperand(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( B2BAcceleratorServicesConstants.TC.BTGORGANIZATIONUIDSOPERAND );
			return (BTGOrganizationUIDsOperand)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating BTGOrganizationUIDsOperand : "+e.getMessage(), 0 );
		}
	}
	
	public BTGOrganizationUIDsOperand createBTGOrganizationUIDsOperand(final Map attributeValues)
	{
		return createBTGOrganizationUIDsOperand( getSession().getSessionContext(), attributeValues );
	}
	
	public OrderThresholdDiscountPercentagePromotion createOrderThresholdDiscountPercentagePromotion(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( B2BAcceleratorServicesConstants.TC.ORDERTHRESHOLDDISCOUNTPERCENTAGEPROMOTION );
			return (OrderThresholdDiscountPercentagePromotion)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating OrderThresholdDiscountPercentagePromotion : "+e.getMessage(), 0 );
		}
	}
	
	public OrderThresholdDiscountPercentagePromotion createOrderThresholdDiscountPercentagePromotion(final Map attributeValues)
	{
		return createOrderThresholdDiscountPercentagePromotion( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductPriceDiscountPromotionByPaymentType createProductPriceDiscountPromotionByPaymentType(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( B2BAcceleratorServicesConstants.TC.PRODUCTPRICEDISCOUNTPROMOTIONBYPAYMENTTYPE );
			return (ProductPriceDiscountPromotionByPaymentType)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductPriceDiscountPromotionByPaymentType : "+e.getMessage(), 0 );
		}
	}
	
	public ProductPriceDiscountPromotionByPaymentType createProductPriceDiscountPromotionByPaymentType(final Map attributeValues)
	{
		return createProductPriceDiscountPromotionByPaymentType( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductThresholdPriceDiscountPromotion createProductThresholdPriceDiscountPromotion(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( B2BAcceleratorServicesConstants.TC.PRODUCTTHRESHOLDPRICEDISCOUNTPROMOTION );
			return (ProductThresholdPriceDiscountPromotion)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductThresholdPriceDiscountPromotion : "+e.getMessage(), 0 );
		}
	}
	
	public ProductThresholdPriceDiscountPromotion createProductThresholdPriceDiscountPromotion(final Map attributeValues)
	{
		return createProductThresholdPriceDiscountPromotion( getSession().getSessionContext(), attributeValues );
	}
	
	public ReplenishmentProcess createReplenishmentProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( B2BAcceleratorServicesConstants.TC.REPLENISHMENTPROCESS );
			return (ReplenishmentProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ReplenishmentProcess : "+e.getMessage(), 0 );
		}
	}
	
	public ReplenishmentProcess createReplenishmentProcess(final Map attributeValues)
	{
		return createReplenishmentProcess( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return B2BAcceleratorServicesConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CartToOrderCronJob.orders</code> attribute.
	 * @return the orders
	 */
	public Collection<Order> getOrders(final SessionContext ctx, final CartToOrderCronJob item)
	{
		return ORDER2CARTTOORDERCRONJOBORDERSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CartToOrderCronJob.orders</code> attribute.
	 * @return the orders
	 */
	public Collection<Order> getOrders(final CartToOrderCronJob item)
	{
		return getOrders( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CartToOrderCronJob.orders</code> attribute. 
	 * @param value the orders
	 */
	public void setOrders(final SessionContext ctx, final CartToOrderCronJob item, final Collection<Order> value)
	{
		ORDER2CARTTOORDERCRONJOBORDERSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CartToOrderCronJob.orders</code> attribute. 
	 * @param value the orders
	 */
	public void setOrders(final CartToOrderCronJob item, final Collection<Order> value)
	{
		setOrders( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to orders. 
	 * @param value the item to add to orders
	 */
	public void addToOrders(final SessionContext ctx, final CartToOrderCronJob item, final Order value)
	{
		ORDER2CARTTOORDERCRONJOBORDERSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to orders. 
	 * @param value the item to add to orders
	 */
	public void addToOrders(final CartToOrderCronJob item, final Order value)
	{
		addToOrders( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from orders. 
	 * @param value the item to remove from orders
	 */
	public void removeFromOrders(final SessionContext ctx, final CartToOrderCronJob item, final Order value)
	{
		ORDER2CARTTOORDERCRONJOBORDERSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from orders. 
	 * @param value the item to remove from orders
	 */
	public void removeFromOrders(final CartToOrderCronJob item, final Order value)
	{
		removeFromOrders( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.paymentType</code> attribute.
	 * @return the paymentType - Payment type for Checkout summary
	 */
	public EnumerationValue getPaymentType(final SessionContext ctx, final AbstractOrder item)
	{
		return (EnumerationValue)item.getProperty( ctx, B2BAcceleratorServicesConstants.Attributes.AbstractOrder.PAYMENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.paymentType</code> attribute.
	 * @return the paymentType - Payment type for Checkout summary
	 */
	public EnumerationValue getPaymentType(final AbstractOrder item)
	{
		return getPaymentType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.paymentType</code> attribute. 
	 * @param value the paymentType - Payment type for Checkout summary
	 */
	public void setPaymentType(final SessionContext ctx, final AbstractOrder item, final EnumerationValue value)
	{
		item.setProperty(ctx, B2BAcceleratorServicesConstants.Attributes.AbstractOrder.PAYMENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.paymentType</code> attribute. 
	 * @param value the paymentType - Payment type for Checkout summary
	 */
	public void setPaymentType(final AbstractOrder item, final EnumerationValue value)
	{
		setPaymentType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.purchaseOrderNumber</code> attribute.
	 * @return the purchaseOrderNumber - PO number is a string up to 255 chars.
	 */
	public String getPurchaseOrderNumber(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, B2BAcceleratorServicesConstants.Attributes.AbstractOrder.PURCHASEORDERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.purchaseOrderNumber</code> attribute.
	 * @return the purchaseOrderNumber - PO number is a string up to 255 chars.
	 */
	public String getPurchaseOrderNumber(final AbstractOrder item)
	{
		return getPurchaseOrderNumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.purchaseOrderNumber</code> attribute. 
	 * @param value the purchaseOrderNumber - PO number is a string up to 255 chars.
	 */
	public void setPurchaseOrderNumber(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, B2BAcceleratorServicesConstants.Attributes.AbstractOrder.PURCHASEORDERNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.purchaseOrderNumber</code> attribute. 
	 * @param value the purchaseOrderNumber - PO number is a string up to 255 chars.
	 */
	public void setPurchaseOrderNumber(final AbstractOrder item, final String value)
	{
		setPurchaseOrderNumber( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.schedulingCronJob</code> attribute.
	 * @return the schedulingCronJob
	 */
	public CartToOrderCronJob getSchedulingCronJob(final SessionContext ctx, final Order item)
	{
		return (CartToOrderCronJob)item.getProperty( ctx, B2BAcceleratorServicesConstants.Attributes.Order.SCHEDULINGCRONJOB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.schedulingCronJob</code> attribute.
	 * @return the schedulingCronJob
	 */
	public CartToOrderCronJob getSchedulingCronJob(final Order item)
	{
		return getSchedulingCronJob( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.schedulingCronJob</code> attribute. 
	 * @param value the schedulingCronJob
	 */
	public void setSchedulingCronJob(final SessionContext ctx, final Order item, final CartToOrderCronJob value)
	{
		item.setProperty(ctx, B2BAcceleratorServicesConstants.Attributes.Order.SCHEDULINGCRONJOB,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.schedulingCronJob</code> attribute. 
	 * @param value the schedulingCronJob
	 */
	public void setSchedulingCronJob(final Order item, final CartToOrderCronJob value)
	{
		setSchedulingCronJob( getSession().getSessionContext(), item, value );
	}
	
}
