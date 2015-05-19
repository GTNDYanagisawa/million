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
package de.hybris.platform.voucher.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.voucher.model.VoucherModel;

/**
 * Generated model class for type VoucherInvalidation first defined at extension voucher.
 */
@SuppressWarnings("all")
public class VoucherInvalidationModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "VoucherInvalidation";
	
	/**<i>Generated relation code constant for relation <code>VoucherInvalidationsRelation</code> defining source attribute <code>voucher</code> in extension <code>voucher</code>.</i>*/
	public final static String _VOUCHERINVALIDATIONSRELATION = "VoucherInvalidationsRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>VoucherInvalidation.code</code> attribute defined at extension <code>voucher</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>VoucherInvalidation.user</code> attribute defined at extension <code>voucher</code>. */
	public static final String USER = "user";
	
	/** <i>Generated constant</i> - Attribute key of <code>VoucherInvalidation.order</code> attribute defined at extension <code>voucher</code>. */
	public static final String ORDER = "order";
	
	/** <i>Generated constant</i> - Attribute key of <code>VoucherInvalidation.status</code> attribute defined at extension <code>voucher</code>. */
	public static final String STATUS = "status";
	
	/** <i>Generated constant</i> - Attribute key of <code>VoucherInvalidation.voucher</code> attribute defined at extension <code>voucher</code>. */
	public static final String VOUCHER = "voucher";
	
	
	/** <i>Generated variable</i> - Variable of <code>VoucherInvalidation.code</code> attribute defined at extension <code>voucher</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>VoucherInvalidation.user</code> attribute defined at extension <code>voucher</code>. */
	private UserModel _user;
	
	/** <i>Generated variable</i> - Variable of <code>VoucherInvalidation.order</code> attribute defined at extension <code>voucher</code>. */
	private OrderModel _order;
	
	/** <i>Generated variable</i> - Variable of <code>VoucherInvalidation.status</code> attribute defined at extension <code>voucher</code>. */
	private String _status;
	
	/** <i>Generated variable</i> - Variable of <code>VoucherInvalidation.voucher</code> attribute defined at extension <code>voucher</code>. */
	private VoucherModel _voucher;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public VoucherInvalidationModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public VoucherInvalidationModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>VoucherInvalidation</code> at extension <code>voucher</code>
	 * @param _order initial attribute declared by type <code>VoucherInvalidation</code> at extension <code>voucher</code>
	 * @param _user initial attribute declared by type <code>VoucherInvalidation</code> at extension <code>voucher</code>
	 * @param _voucher initial attribute declared by type <code>VoucherInvalidation</code> at extension <code>voucher</code>
	 */
	@Deprecated
	public VoucherInvalidationModel(final String _code, final OrderModel _order, final UserModel _user, final VoucherModel _voucher)
	{
		super();
		setCode(_code);
		setOrder(_order);
		setUser(_user);
		setVoucher(_voucher);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>VoucherInvalidation</code> at extension <code>voucher</code>
	 * @param _order initial attribute declared by type <code>VoucherInvalidation</code> at extension <code>voucher</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _user initial attribute declared by type <code>VoucherInvalidation</code> at extension <code>voucher</code>
	 * @param _voucher initial attribute declared by type <code>VoucherInvalidation</code> at extension <code>voucher</code>
	 */
	@Deprecated
	public VoucherInvalidationModel(final String _code, final OrderModel _order, final ItemModel _owner, final UserModel _user, final VoucherModel _voucher)
	{
		super();
		setCode(_code);
		setOrder(_order);
		setOwner(_owner);
		setUser(_user);
		setVoucher(_voucher);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VoucherInvalidation.code</code> attribute defined at extension <code>voucher</code>. 
	 * @return the code - the code used redeeming the voucher.
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
	 * <i>Generated method</i> - Getter of the <code>VoucherInvalidation.order</code> attribute defined at extension <code>voucher</code>. 
	 * @return the order - the order for which the voucher code was applied.
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
	 * <i>Generated method</i> - Getter of the <code>VoucherInvalidation.status</code> attribute defined at extension <code>voucher</code>. 
	 * @return the status - the status of the invalidation.
	 */
	public String getStatus()
	{
		if (this._status!=null)
		{
			return _status;
		}
		return _status = getPersistenceContext().getValue(STATUS, _status);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VoucherInvalidation.user</code> attribute defined at extension <code>voucher</code>. 
	 * @return the user - the user who redeemed the voucher.
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
	 * <i>Generated method</i> - Getter of the <code>VoucherInvalidation.voucher</code> attribute defined at extension <code>voucher</code>. 
	 * @return the voucher
	 */
	public VoucherModel getVoucher()
	{
		if (this._voucher!=null)
		{
			return _voucher;
		}
		return _voucher = getPersistenceContext().getValue(VOUCHER, _voucher);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>VoucherInvalidation.code</code> attribute defined at extension <code>voucher</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the code - the code used redeeming the voucher.
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>VoucherInvalidation.order</code> attribute defined at extension <code>voucher</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the order - the order for which the voucher code was applied.
	 */
	public void setOrder(final OrderModel value)
	{
		_order = getPersistenceContext().setValue(ORDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>VoucherInvalidation.status</code> attribute defined at extension <code>voucher</code>. 
	 *  
	 * @param value the status - the status of the invalidation.
	 */
	public void setStatus(final String value)
	{
		_status = getPersistenceContext().setValue(STATUS, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>VoucherInvalidation.user</code> attribute defined at extension <code>voucher</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the user - the user who redeemed the voucher.
	 */
	public void setUser(final UserModel value)
	{
		_user = getPersistenceContext().setValue(USER, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>VoucherInvalidation.voucher</code> attribute defined at extension <code>voucher</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the voucher
	 */
	public void setVoucher(final VoucherModel value)
	{
		_voucher = getPersistenceContext().setValue(VOUCHER, value);
	}
	
}
