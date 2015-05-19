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
package de.hybris.platform.mobileoptionals.model.text;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.mobileservices.model.text.MobileReceiveGenericActionModel;
import de.hybris.platform.servicelayer.enums.ActionType;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.voucher.model.VoucherModel;

/**
 * Generated model class for type MobileReceiveAndSendVoucherAction first defined at extension mobileoptionals.
 */
@SuppressWarnings("all")
public class MobileReceiveAndSendVoucherActionModel extends MobileReceiveGenericActionModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "MobileReceiveAndSendVoucherAction";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileReceiveAndSendVoucherAction.voucher</code> attribute defined at extension <code>mobileoptionals</code>. */
	public static final String VOUCHER = "voucher";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileReceiveAndSendVoucherAction.message</code> attribute defined at extension <code>mobileoptionals</code>. */
	public static final String MESSAGE = "message";
	
	
	/** <i>Generated variable</i> - Variable of <code>MobileReceiveAndSendVoucherAction.voucher</code> attribute defined at extension <code>mobileoptionals</code>. */
	private VoucherModel _voucher;
	
	/** <i>Generated variable</i> - Variable of <code>MobileReceiveAndSendVoucherAction.message</code> attribute defined at extension <code>mobileoptionals</code>. */
	private String _message;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public MobileReceiveAndSendVoucherActionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public MobileReceiveAndSendVoucherActionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>MobileReceiveGenericAction</code> at extension <code>mobileservices</code>
	 * @param _message initial attribute declared by type <code>MobileReceiveAndSendVoucherAction</code> at extension <code>mobileoptionals</code>
	 * @param _target initial attribute declared by type <code>MobileReceiveAndSendVoucherAction</code> at extension <code>mobileoptionals</code>
	 * @param _type initial attribute declared by type <code>MobileReceiveGenericAction</code> at extension <code>mobileservices</code>
	 * @param _voucher initial attribute declared by type <code>MobileReceiveAndSendVoucherAction</code> at extension <code>mobileoptionals</code>
	 */
	@Deprecated
	public MobileReceiveAndSendVoucherActionModel(final String _code, final String _message, final String _target, final ActionType _type, final VoucherModel _voucher)
	{
		super();
		setCode(_code);
		setMessage(_message);
		setTarget(_target);
		setType(_type);
		setVoucher(_voucher);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>MobileReceiveGenericAction</code> at extension <code>mobileservices</code>
	 * @param _message initial attribute declared by type <code>MobileReceiveAndSendVoucherAction</code> at extension <code>mobileoptionals</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _target initial attribute declared by type <code>MobileReceiveAndSendVoucherAction</code> at extension <code>mobileoptionals</code>
	 * @param _type initial attribute declared by type <code>MobileReceiveGenericAction</code> at extension <code>mobileservices</code>
	 * @param _voucher initial attribute declared by type <code>MobileReceiveAndSendVoucherAction</code> at extension <code>mobileoptionals</code>
	 */
	@Deprecated
	public MobileReceiveAndSendVoucherActionModel(final String _code, final String _message, final ItemModel _owner, final String _target, final ActionType _type, final VoucherModel _voucher)
	{
		super();
		setCode(_code);
		setMessage(_message);
		setOwner(_owner);
		setTarget(_target);
		setType(_type);
		setVoucher(_voucher);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileReceiveAndSendVoucherAction.message</code> attribute defined at extension <code>mobileoptionals</code>. 
	 * @return the message
	 */
	public String getMessage()
	{
		if (this._message!=null)
		{
			return _message;
		}
		return _message = getPersistenceContext().getValue(MESSAGE, _message);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileReceiveAndSendVoucherAction.voucher</code> attribute defined at extension <code>mobileoptionals</code>. 
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
	 * <i>Generated method</i> - Setter of <code>MobileReceiveAndSendVoucherAction.message</code> attribute defined at extension <code>mobileoptionals</code>. 
	 *  
	 * @param value the message
	 */
	public void setMessage(final String value)
	{
		_message = getPersistenceContext().setValue(MESSAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileReceiveAndSendVoucherAction.voucher</code> attribute defined at extension <code>mobileoptionals</code>. 
	 *  
	 * @param value the voucher
	 */
	public void setVoucher(final VoucherModel value)
	{
		_voucher = getPersistenceContext().setValue(VOUCHER, value);
	}
	
}
