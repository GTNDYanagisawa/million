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
package de.hybris.platform.commercewebservicescommons.dto.voucher;

import de.hybris.platform.commercewebservicescommons.dto.voucher.VoucherWsDTO;
import java.util.List;

public class VoucherListWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>VoucherListWsDTO.vouchers</code> property defined at extension <code>commercewebservicescommons</code>. */
	private List<VoucherWsDTO> vouchers;
		
	public VoucherListWsDTO()
	{
		// default constructor
	}
	
		
	public void setVouchers(final List<VoucherWsDTO> vouchers)
	{
		this.vouchers = vouchers;
	}
	
		
	public List<VoucherWsDTO> getVouchers() 
	{
		return vouchers;
	}
		
	
}