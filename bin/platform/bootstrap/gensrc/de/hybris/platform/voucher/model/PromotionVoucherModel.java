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
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.voucher.model.VoucherModel;

/**
 * Generated model class for type PromotionVoucher first defined at extension voucher.
 */
@SuppressWarnings("all")
public class PromotionVoucherModel extends VoucherModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PromotionVoucher";
	
	/** <i>Generated constant</i> - Attribute key of <code>PromotionVoucher.voucherCode</code> attribute defined at extension <code>voucher</code>. */
	public static final String VOUCHERCODE = "voucherCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>PromotionVoucher.redemptionQuantityLimit</code> attribute defined at extension <code>voucher</code>. */
	public static final String REDEMPTIONQUANTITYLIMIT = "redemptionQuantityLimit";
	
	/** <i>Generated constant</i> - Attribute key of <code>PromotionVoucher.redemptionQuantityLimitPerUser</code> attribute defined at extension <code>voucher</code>. */
	public static final String REDEMPTIONQUANTITYLIMITPERUSER = "redemptionQuantityLimitPerUser";
	
	
	/** <i>Generated variable</i> - Variable of <code>PromotionVoucher.voucherCode</code> attribute defined at extension <code>voucher</code>. */
	private String _voucherCode;
	
	/** <i>Generated variable</i> - Variable of <code>PromotionVoucher.redemptionQuantityLimit</code> attribute defined at extension <code>voucher</code>. */
	private Integer _redemptionQuantityLimit;
	
	/** <i>Generated variable</i> - Variable of <code>PromotionVoucher.redemptionQuantityLimitPerUser</code> attribute defined at extension <code>voucher</code>. */
	private Integer _redemptionQuantityLimitPerUser;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PromotionVoucherModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PromotionVoucherModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>Voucher</code> at extension <code>voucher</code>
	 */
	@Deprecated
	public PromotionVoucherModel(final String _code)
	{
		super();
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>Voucher</code> at extension <code>voucher</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public PromotionVoucherModel(final String _code, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PromotionVoucher.redemptionQuantityLimit</code> attribute defined at extension <code>voucher</code>. 
	 * @return the redemptionQuantityLimit - the upper limit of uses possible for this voucher.
	 */
	public Integer getRedemptionQuantityLimit()
	{
		if (this._redemptionQuantityLimit!=null)
		{
			return _redemptionQuantityLimit;
		}
		return _redemptionQuantityLimit = getPersistenceContext().getValue(REDEMPTIONQUANTITYLIMIT, _redemptionQuantityLimit);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PromotionVoucher.redemptionQuantityLimitPerUser</code> attribute defined at extension <code>voucher</code>. 
	 * @return the redemptionQuantityLimitPerUser - the upper limit of voucher uses possible per user. Default is one.
	 */
	public Integer getRedemptionQuantityLimitPerUser()
	{
		if (this._redemptionQuantityLimitPerUser!=null)
		{
			return _redemptionQuantityLimitPerUser;
		}
		return _redemptionQuantityLimitPerUser = getPersistenceContext().getValue(REDEMPTIONQUANTITYLIMITPERUSER, _redemptionQuantityLimitPerUser);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PromotionVoucher.voucherCode</code> attribute defined at extension <code>voucher</code>. 
	 * @return the voucherCode - the voucher code.
	 */
	public String getVoucherCode()
	{
		if (this._voucherCode!=null)
		{
			return _voucherCode;
		}
		return _voucherCode = getPersistenceContext().getValue(VOUCHERCODE, _voucherCode);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PromotionVoucher.redemptionQuantityLimit</code> attribute defined at extension <code>voucher</code>. 
	 *  
	 * @param value the redemptionQuantityLimit - the upper limit of uses possible for this voucher.
	 */
	public void setRedemptionQuantityLimit(final Integer value)
	{
		_redemptionQuantityLimit = getPersistenceContext().setValue(REDEMPTIONQUANTITYLIMIT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PromotionVoucher.redemptionQuantityLimitPerUser</code> attribute defined at extension <code>voucher</code>. 
	 *  
	 * @param value the redemptionQuantityLimitPerUser - the upper limit of voucher uses possible per user. Default is one.
	 */
	public void setRedemptionQuantityLimitPerUser(final Integer value)
	{
		_redemptionQuantityLimitPerUser = getPersistenceContext().setValue(REDEMPTIONQUANTITYLIMITPERUSER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PromotionVoucher.voucherCode</code> attribute defined at extension <code>voucher</code>. 
	 *  
	 * @param value the voucherCode - the voucher code.
	 */
	public void setVoucherCode(final String value)
	{
		_voucherCode = getPersistenceContext().setValue(VOUCHERCODE, value);
	}
	
}
