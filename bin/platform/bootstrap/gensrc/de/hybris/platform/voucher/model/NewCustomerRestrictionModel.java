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
import de.hybris.platform.voucher.model.RestrictionModel;
import de.hybris.platform.voucher.model.VoucherModel;

/**
 * Generated model class for type NewCustomerRestriction first defined at extension voucher.
 */
@SuppressWarnings("all")
public class NewCustomerRestrictionModel extends RestrictionModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "NewCustomerRestriction";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public NewCustomerRestrictionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public NewCustomerRestrictionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _voucher initial attribute declared by type <code>Restriction</code> at extension <code>voucher</code>
	 */
	@Deprecated
	public NewCustomerRestrictionModel(final VoucherModel _voucher)
	{
		super();
		setVoucher(_voucher);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _voucher initial attribute declared by type <code>Restriction</code> at extension <code>voucher</code>
	 */
	@Deprecated
	public NewCustomerRestrictionModel(final ItemModel _owner, final VoucherModel _voucher)
	{
		super();
		setOwner(_owner);
		setVoucher(_voucher);
	}
	
	
}
