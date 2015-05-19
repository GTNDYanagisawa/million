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
package de.hybris.platform.commerceservices.service.data;

import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.product.UnitModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.storelocator.model.PointOfServiceModel;

public class CommerceCartParameter  implements java.io.Serializable 
{

	/** The entry number to update<br/><br/><i>Generated property</i> for <code>CommerceCartParameter.entryNumber</code> property defined at extension <code>commerceservices</code>. */
	private long entryNumber;
	/** The PointOfServiceModel<br/><br/><i>Generated property</i> for <code>CommerceCartParameter.pointOfService</code> property defined at extension <code>commerceservices</code>. */
	private PointOfServiceModel pointOfService;
	/** Should cart be calculated or recalculated<br/><br/><i>Generated property</i> for <code>CommerceCartParameter.recalculate</code> property defined at extension <code>commerceservices</code>. */
	private boolean recalculate;
	/** The CartModel<br/><br/><i>Generated property</i> for <code>CommerceCartParameter.cart</code> property defined at extension <code>commerceservices</code>. */
	private CartModel cart;
	/** The ProductModel<br/><br/><i>Generated property</i> for <code>CommerceCartParameter.product</code> property defined at extension <code>commerceservices</code>. */
	private ProductModel product;
	/** A unique identifier<br/><br/><i>Generated property</i> for <code>CommerceCartParameter.guid</code> property defined at extension <code>commerceservices</code>. */
	private String guid;
	/** The units to add<br/><br/><i>Generated property</i> for <code>CommerceCartParameter.unit</code> property defined at extension <code>commerceservices</code>. */
	private UnitModel unit;
	/** Should create new Entry<br/><br/><i>Generated property</i> for <code>CommerceCartParameter.createNewEntry</code> property defined at extension <code>commerceservices</code>. */
	private boolean createNewEntry;
	/** Country ISO code of delivery address<br/><br/><i>Generated property</i> for <code>CommerceCartParameter.deliveryCountryIso</code> property defined at extension <code>commerceservices</code>. */
	private String deliveryCountryIso;
	/** Should the method hooks be executed<br/><br/><i>Generated property</i> for <code>CommerceCartParameter.enableHooks</code> property defined at extension <code>commerceservices</code>. */
	private boolean enableHooks;
	/** Delivery zip code<br/><br/><i>Generated property</i> for <code>CommerceCartParameter.deliveryZipCode</code> property defined at extension <code>commerceservices</code>. */
	private String deliveryZipCode;
	/** The quantity to add<br/><br/><i>Generated property</i> for <code>CommerceCartParameter.quantity</code> property defined at extension <code>commerceservices</code>. */
	private long quantity;
	/** The current base site<br/><br/><i>Generated property</i> for <code>CommerceCartParameter.baseSite</code> property defined at extension <code>commerceservices</code>. */
	private BaseSiteModel baseSite;
	/** The current user<br/><br/><i>Generated property</i> for <code>CommerceCartParameter.user</code> property defined at extension <code>commerceservices</code>. */
	private UserModel user;
		
	public CommerceCartParameter()
	{
		// default constructor
	}
	
		
	public void setEntryNumber(final long entryNumber)
	{
		this.entryNumber = entryNumber;
	}
	
		
	public long getEntryNumber() 
	{
		return entryNumber;
	}
		
		
	public void setPointOfService(final PointOfServiceModel pointOfService)
	{
		this.pointOfService = pointOfService;
	}
	
		
	public PointOfServiceModel getPointOfService() 
	{
		return pointOfService;
	}
		
		
	public void setRecalculate(final boolean recalculate)
	{
		this.recalculate = recalculate;
	}
	
		
	public boolean isRecalculate() 
	{
		return recalculate;
	}
		
		
	public void setCart(final CartModel cart)
	{
		this.cart = cart;
	}
	
		
	public CartModel getCart() 
	{
		return cart;
	}
		
		
	public void setProduct(final ProductModel product)
	{
		this.product = product;
	}
	
		
	public ProductModel getProduct() 
	{
		return product;
	}
		
		
	public void setGuid(final String guid)
	{
		this.guid = guid;
	}
	
		
	public String getGuid() 
	{
		return guid;
	}
		
		
	public void setUnit(final UnitModel unit)
	{
		this.unit = unit;
	}
	
		
	public UnitModel getUnit() 
	{
		return unit;
	}
		
		
	public void setCreateNewEntry(final boolean createNewEntry)
	{
		this.createNewEntry = createNewEntry;
	}
	
		
	public boolean isCreateNewEntry() 
	{
		return createNewEntry;
	}
		
		
	public void setDeliveryCountryIso(final String deliveryCountryIso)
	{
		this.deliveryCountryIso = deliveryCountryIso;
	}
	
		
	public String getDeliveryCountryIso() 
	{
		return deliveryCountryIso;
	}
		
		
	public void setEnableHooks(final boolean enableHooks)
	{
		this.enableHooks = enableHooks;
	}
	
		
	public boolean isEnableHooks() 
	{
		return enableHooks;
	}
		
		
	public void setDeliveryZipCode(final String deliveryZipCode)
	{
		this.deliveryZipCode = deliveryZipCode;
	}
	
		
	public String getDeliveryZipCode() 
	{
		return deliveryZipCode;
	}
		
		
	public void setQuantity(final long quantity)
	{
		this.quantity = quantity;
	}
	
		
	public long getQuantity() 
	{
		return quantity;
	}
		
		
	public void setBaseSite(final BaseSiteModel baseSite)
	{
		this.baseSite = baseSite;
	}
	
		
	public BaseSiteModel getBaseSite() 
	{
		return baseSite;
	}
		
		
	public void setUser(final UserModel user)
	{
		this.user = user;
	}
	
		
	public UserModel getUser() 
	{
		return user;
	}
		
	
}