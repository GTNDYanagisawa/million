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
package de.hybris.platform.core.model.order.payment;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.orderscheduling.model.CartToOrderCronJobModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type PaymentInfo first defined at extension core.
 */
@SuppressWarnings("all")
public class PaymentInfoModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PaymentInfo";
	
	/** <i>Generated constant</i> - Attribute key of <code>PaymentInfo.original</code> attribute defined at extension <code>core</code>. */
	public static final String ORIGINAL = "original";
	
	/** <i>Generated constant</i> - Attribute key of <code>PaymentInfo.code</code> attribute defined at extension <code>core</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>PaymentInfo.user</code> attribute defined at extension <code>core</code>. */
	public static final String USER = "user";
	
	/** <i>Generated constant</i> - Attribute key of <code>PaymentInfo.duplicate</code> attribute defined at extension <code>core</code>. */
	public static final String DUPLICATE = "duplicate";
	
	/** <i>Generated constant</i> - Attribute key of <code>PaymentInfo.cartToOrderCronJob</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CARTTOORDERCRONJOB = "cartToOrderCronJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>PaymentInfo.billingAddress</code> attribute defined at extension <code>payment</code>. */
	public static final String BILLINGADDRESS = "billingAddress";
	
	/** <i>Generated constant</i> - Attribute key of <code>PaymentInfo.saved</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String SAVED = "saved";
	
	
	/** <i>Generated variable</i> - Variable of <code>PaymentInfo.original</code> attribute defined at extension <code>core</code>. */
	private ItemModel _original;
	
	/** <i>Generated variable</i> - Variable of <code>PaymentInfo.code</code> attribute defined at extension <code>core</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>PaymentInfo.user</code> attribute defined at extension <code>core</code>. */
	private UserModel _user;
	
	/** <i>Generated variable</i> - Variable of <code>PaymentInfo.duplicate</code> attribute defined at extension <code>core</code>. */
	private Boolean _duplicate;
	
	/** <i>Generated variable</i> - Variable of <code>PaymentInfo.cartToOrderCronJob</code> attribute defined at extension <code>basecommerce</code>. */
	private Collection<CartToOrderCronJobModel> _cartToOrderCronJob;
	
	/** <i>Generated variable</i> - Variable of <code>PaymentInfo.billingAddress</code> attribute defined at extension <code>payment</code>. */
	private AddressModel _billingAddress;
	
	/** <i>Generated variable</i> - Variable of <code>PaymentInfo.saved</code> attribute defined at extension <code>commerceservices</code>. */
	private Boolean _saved;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PaymentInfoModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PaymentInfoModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>PaymentInfo</code> at extension <code>core</code>
	 * @param _user initial attribute declared by type <code>PaymentInfo</code> at extension <code>core</code>
	 */
	@Deprecated
	public PaymentInfoModel(final String _code, final UserModel _user)
	{
		super();
		setCode(_code);
		setUser(_user);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>PaymentInfo</code> at extension <code>core</code>
	 * @param _original initial attribute declared by type <code>PaymentInfo</code> at extension <code>core</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _user initial attribute declared by type <code>PaymentInfo</code> at extension <code>core</code>
	 */
	@Deprecated
	public PaymentInfoModel(final String _code, final ItemModel _original, final ItemModel _owner, final UserModel _user)
	{
		super();
		setCode(_code);
		setOriginal(_original);
		setOwner(_owner);
		setUser(_user);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentInfo.billingAddress</code> attribute defined at extension <code>payment</code>. 
	 * @return the billingAddress
	 */
	public AddressModel getBillingAddress()
	{
		if (this._billingAddress!=null)
		{
			return _billingAddress;
		}
		return _billingAddress = getPersistenceContext().getValue(BILLINGADDRESS, _billingAddress);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentInfo.cartToOrderCronJob</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the cartToOrderCronJob
	 */
	public Collection<CartToOrderCronJobModel> getCartToOrderCronJob()
	{
		if (this._cartToOrderCronJob!=null)
		{
			return _cartToOrderCronJob;
		}
		return _cartToOrderCronJob = getPersistenceContext().getValue(CARTTOORDERCRONJOB, _cartToOrderCronJob);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentInfo.code</code> attribute defined at extension <code>core</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>PaymentInfo.duplicate</code> attribute defined at extension <code>core</code>. 
	 * @return the duplicate
	 */
	public Boolean getDuplicate()
	{
		if (this._duplicate!=null)
		{
			return _duplicate;
		}
		return _duplicate = getPersistenceContext().getValue(DUPLICATE, _duplicate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentInfo.original</code> attribute defined at extension <code>core</code>. 
	 * @return the original
	 */
	public ItemModel getOriginal()
	{
		if (this._original!=null)
		{
			return _original;
		}
		return _original = getPersistenceContext().getValue(ORIGINAL, _original);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentInfo.user</code> attribute defined at extension <code>core</code>. 
	 * @return the user
	 */
	public UserModel getUser()
	{
		if (this._user!=null)
		{
			return _user;
		}
		return _user = getPersistenceContext().getValue(USER, _user);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentInfo.saved</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the saved - Indicates the item is saved for reuse.
	 */
	public boolean isSaved()
	{
		return toPrimitive( _saved = getPersistenceContext().getValue(SAVED, _saved));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PaymentInfo.billingAddress</code> attribute defined at extension <code>payment</code>. 
	 *  
	 * @param value the billingAddress
	 */
	public void setBillingAddress(final AddressModel value)
	{
		_billingAddress = getPersistenceContext().setValue(BILLINGADDRESS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PaymentInfo.cartToOrderCronJob</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the cartToOrderCronJob
	 */
	public void setCartToOrderCronJob(final Collection<CartToOrderCronJobModel> value)
	{
		_cartToOrderCronJob = getPersistenceContext().setValue(CARTTOORDERCRONJOB, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PaymentInfo.code</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PaymentInfo.duplicate</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the duplicate
	 */
	public void setDuplicate(final Boolean value)
	{
		_duplicate = getPersistenceContext().setValue(DUPLICATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>PaymentInfo.original</code> attribute defined at extension <code>core</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the original
	 */
	public void setOriginal(final ItemModel value)
	{
		_original = getPersistenceContext().setValue(ORIGINAL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PaymentInfo.saved</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the saved - Indicates the item is saved for reuse.
	 */
	public void setSaved(final boolean value)
	{
		_saved = getPersistenceContext().setValue(SAVED, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>PaymentInfo.user</code> attribute defined at extension <code>core</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the user
	 */
	public void setUser(final UserModel value)
	{
		_user = getPersistenceContext().setValue(USER, value);
	}
	
}
