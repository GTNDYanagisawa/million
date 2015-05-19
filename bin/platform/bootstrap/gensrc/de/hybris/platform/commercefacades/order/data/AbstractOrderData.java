/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 2015/05/18 13:25:59
 * ----------------------------------------------------------------
 *
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package de.hybris.platform.commercefacades.order.data;

import de.hybris.platform.commercefacades.order.data.CCPaymentInfoData;
import de.hybris.platform.commercefacades.order.data.DeliveryModeData;
import de.hybris.platform.commercefacades.order.data.DeliveryOrderEntryGroupData;
import de.hybris.platform.commercefacades.order.data.OrderEntryData;
import de.hybris.platform.commercefacades.order.data.PickupOrderEntryGroupData;
import de.hybris.platform.commercefacades.product.data.PriceData;
import de.hybris.platform.commercefacades.product.data.PromotionResultData;
import de.hybris.platform.commercefacades.user.data.AddressData;
import de.hybris.platform.commercefacades.user.data.PrincipalData;
import de.hybris.platform.commercefacades.voucher.data.VoucherData;
import java.util.List;

public class AbstractOrderData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>AbstractOrderData.store</code> property defined at extension <code>commercefacades</code>. */
	private String store;
	/** <i>Generated property</i> for <code>AbstractOrderData.appliedOrderPromotions</code> property defined at extension <code>commercefacades</code>. */
	private List<PromotionResultData> appliedOrderPromotions;
	/** <i>Generated property</i> for <code>AbstractOrderData.pickupItemsQuantity</code> property defined at extension <code>commercefacades</code>. */
	private Long pickupItemsQuantity;
	/** <i>Generated property</i> for <code>AbstractOrderData.net</code> property defined at extension <code>commercefacades</code>. */
	private boolean net;
	/** <i>Generated property</i> for <code>AbstractOrderData.calculated</code> property defined at extension <code>commercefacades</code>. */
	private boolean calculated;
	/** <i>Generated property</i> for <code>AbstractOrderData.appliedVouchers</code> property defined at extension <code>commercefacades</code>. */
	private List<VoucherData> appliedVouchers;
	/** <i>Generated property</i> for <code>AbstractOrderData.productDiscounts</code> property defined at extension <code>commercefacades</code>. */
	private PriceData productDiscounts;
	/** <i>Generated property</i> for <code>AbstractOrderData.totalDiscounts</code> property defined at extension <code>commercefacades</code>. */
	private PriceData totalDiscounts;
	/** <i>Generated property</i> for <code>AbstractOrderData.subTotal</code> property defined at extension <code>commercefacades</code>. */
	private PriceData subTotal;
	/** <i>Generated property</i> for <code>AbstractOrderData.orderDiscounts</code> property defined at extension <code>commercefacades</code>. */
	private PriceData orderDiscounts;
	/** <i>Generated property</i> for <code>AbstractOrderData.entries</code> property defined at extension <code>commercefacades</code>. */
	private List<OrderEntryData> entries;
	/** <i>Generated property</i> for <code>AbstractOrderData.appliedProductPromotions</code> property defined at extension <code>commercefacades</code>. */
	private List<PromotionResultData> appliedProductPromotions;
	/** <i>Generated property</i> for <code>AbstractOrderData.totalPrice</code> property defined at extension <code>commercefacades</code>. */
	private PriceData totalPrice;
	/** <i>Generated property</i> for <code>AbstractOrderData.site</code> property defined at extension <code>commercefacades</code>. */
	private String site;
	/** <i>Generated property</i> for <code>AbstractOrderData.deliveryMode</code> property defined at extension <code>commercefacades</code>. */
	private DeliveryModeData deliveryMode;
	/** <i>Generated property</i> for <code>AbstractOrderData.code</code> property defined at extension <code>commercefacades</code>. */
	private String code;
	/** <i>Generated property</i> for <code>AbstractOrderData.deliveryOrderGroups</code> property defined at extension <code>commercefacades</code>. */
	private List<DeliveryOrderEntryGroupData> deliveryOrderGroups;
	/** <i>Generated property</i> for <code>AbstractOrderData.guid</code> property defined at extension <code>commercefacades</code>. */
	private String guid;
	/** <i>Generated property</i> for <code>AbstractOrderData.paymentInfo</code> property defined at extension <code>commercefacades</code>. */
	private CCPaymentInfoData paymentInfo;
	/** <i>Generated property</i> for <code>AbstractOrderData.pickupOrderGroups</code> property defined at extension <code>commercefacades</code>. */
	private List<PickupOrderEntryGroupData> pickupOrderGroups;
	/** <i>Generated property</i> for <code>AbstractOrderData.totalItems</code> property defined at extension <code>commercefacades</code>. */
	private Integer totalItems;
	/** <i>Generated property</i> for <code>AbstractOrderData.totalPriceWithTax</code> property defined at extension <code>commercefacades</code>. */
	private PriceData totalPriceWithTax;
	/** <i>Generated property</i> for <code>AbstractOrderData.deliveryItemsQuantity</code> property defined at extension <code>commercefacades</code>. */
	private Long deliveryItemsQuantity;
	/** <i>Generated property</i> for <code>AbstractOrderData.totalTax</code> property defined at extension <code>commercefacades</code>. */
	private PriceData totalTax;
	/** <i>Generated property</i> for <code>AbstractOrderData.user</code> property defined at extension <code>commercefacades</code>. */
	private PrincipalData user;
	/** <i>Generated property</i> for <code>AbstractOrderData.deliveryAddress</code> property defined at extension <code>commercefacades</code>. */
	private AddressData deliveryAddress;
	/** <i>Generated property</i> for <code>AbstractOrderData.deliveryCost</code> property defined at extension <code>commercefacades</code>. */
	private PriceData deliveryCost;
		
	public AbstractOrderData()
	{
		// default constructor
	}
	
		
	public void setStore(final String store)
	{
		this.store = store;
	}
	
		
	public String getStore() 
	{
		return store;
	}
		
		
	public void setAppliedOrderPromotions(final List<PromotionResultData> appliedOrderPromotions)
	{
		this.appliedOrderPromotions = appliedOrderPromotions;
	}
	
		
	public List<PromotionResultData> getAppliedOrderPromotions() 
	{
		return appliedOrderPromotions;
	}
		
		
	public void setPickupItemsQuantity(final Long pickupItemsQuantity)
	{
		this.pickupItemsQuantity = pickupItemsQuantity;
	}
	
		
	public Long getPickupItemsQuantity() 
	{
		return pickupItemsQuantity;
	}
		
		
	public void setNet(final boolean net)
	{
		this.net = net;
	}
	
		
	public boolean isNet() 
	{
		return net;
	}
		
		
	public void setCalculated(final boolean calculated)
	{
		this.calculated = calculated;
	}
	
		
	public boolean isCalculated() 
	{
		return calculated;
	}
		
		
	public void setAppliedVouchers(final List<VoucherData> appliedVouchers)
	{
		this.appliedVouchers = appliedVouchers;
	}
	
		
	public List<VoucherData> getAppliedVouchers() 
	{
		return appliedVouchers;
	}
		
		
	public void setProductDiscounts(final PriceData productDiscounts)
	{
		this.productDiscounts = productDiscounts;
	}
	
		
	public PriceData getProductDiscounts() 
	{
		return productDiscounts;
	}
		
		
	public void setTotalDiscounts(final PriceData totalDiscounts)
	{
		this.totalDiscounts = totalDiscounts;
	}
	
		
	public PriceData getTotalDiscounts() 
	{
		return totalDiscounts;
	}
		
		
	public void setSubTotal(final PriceData subTotal)
	{
		this.subTotal = subTotal;
	}
	
		
	public PriceData getSubTotal() 
	{
		return subTotal;
	}
		
		
	public void setOrderDiscounts(final PriceData orderDiscounts)
	{
		this.orderDiscounts = orderDiscounts;
	}
	
		
	public PriceData getOrderDiscounts() 
	{
		return orderDiscounts;
	}
		
		
	public void setEntries(final List<OrderEntryData> entries)
	{
		this.entries = entries;
	}
	
		
	public List<OrderEntryData> getEntries() 
	{
		return entries;
	}
		
		
	public void setAppliedProductPromotions(final List<PromotionResultData> appliedProductPromotions)
	{
		this.appliedProductPromotions = appliedProductPromotions;
	}
	
		
	public List<PromotionResultData> getAppliedProductPromotions() 
	{
		return appliedProductPromotions;
	}
		
		
	public void setTotalPrice(final PriceData totalPrice)
	{
		this.totalPrice = totalPrice;
	}
	
		
	public PriceData getTotalPrice() 
	{
		return totalPrice;
	}
		
		
	public void setSite(final String site)
	{
		this.site = site;
	}
	
		
	public String getSite() 
	{
		return site;
	}
		
		
	public void setDeliveryMode(final DeliveryModeData deliveryMode)
	{
		this.deliveryMode = deliveryMode;
	}
	
		
	public DeliveryModeData getDeliveryMode() 
	{
		return deliveryMode;
	}
		
		
	public void setCode(final String code)
	{
		this.code = code;
	}
	
		
	public String getCode() 
	{
		return code;
	}
		
		
	public void setDeliveryOrderGroups(final List<DeliveryOrderEntryGroupData> deliveryOrderGroups)
	{
		this.deliveryOrderGroups = deliveryOrderGroups;
	}
	
		
	public List<DeliveryOrderEntryGroupData> getDeliveryOrderGroups() 
	{
		return deliveryOrderGroups;
	}
		
		
	public void setGuid(final String guid)
	{
		this.guid = guid;
	}
	
		
	public String getGuid() 
	{
		return guid;
	}
		
		
	public void setPaymentInfo(final CCPaymentInfoData paymentInfo)
	{
		this.paymentInfo = paymentInfo;
	}
	
		
	public CCPaymentInfoData getPaymentInfo() 
	{
		return paymentInfo;
	}
		
		
	public void setPickupOrderGroups(final List<PickupOrderEntryGroupData> pickupOrderGroups)
	{
		this.pickupOrderGroups = pickupOrderGroups;
	}
	
		
	public List<PickupOrderEntryGroupData> getPickupOrderGroups() 
	{
		return pickupOrderGroups;
	}
		
		
	public void setTotalItems(final Integer totalItems)
	{
		this.totalItems = totalItems;
	}
	
		
	public Integer getTotalItems() 
	{
		return totalItems;
	}
		
		
	public void setTotalPriceWithTax(final PriceData totalPriceWithTax)
	{
		this.totalPriceWithTax = totalPriceWithTax;
	}
	
		
	public PriceData getTotalPriceWithTax() 
	{
		return totalPriceWithTax;
	}
		
		
	public void setDeliveryItemsQuantity(final Long deliveryItemsQuantity)
	{
		this.deliveryItemsQuantity = deliveryItemsQuantity;
	}
	
		
	public Long getDeliveryItemsQuantity() 
	{
		return deliveryItemsQuantity;
	}
		
		
	public void setTotalTax(final PriceData totalTax)
	{
		this.totalTax = totalTax;
	}
	
		
	public PriceData getTotalTax() 
	{
		return totalTax;
	}
		
		
	public void setUser(final PrincipalData user)
	{
		this.user = user;
	}
	
		
	public PrincipalData getUser() 
	{
		return user;
	}
		
		
	public void setDeliveryAddress(final AddressData deliveryAddress)
	{
		this.deliveryAddress = deliveryAddress;
	}
	
		
	public AddressData getDeliveryAddress() 
	{
		return deliveryAddress;
	}
		
		
	public void setDeliveryCost(final PriceData deliveryCost)
	{
		this.deliveryCost = deliveryCost;
	}
	
		
	public PriceData getDeliveryCost() 
	{
		return deliveryCost;
	}
		
	
}