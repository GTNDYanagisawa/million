/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 2015/05/18 13:26:00
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
import java.util.List;

public class CCPaymentInfoDatas  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>CCPaymentInfoDatas.paymentInfos</code> property defined at extension <code>commercefacades</code>. */
	private List<CCPaymentInfoData> paymentInfos;
		
	public CCPaymentInfoDatas()
	{
		// default constructor
	}
	
		
	public void setPaymentInfos(final List<CCPaymentInfoData> paymentInfos)
	{
		this.paymentInfos = paymentInfos;
	}
	
		
	public List<CCPaymentInfoData> getPaymentInfos() 
	{
		return paymentInfos;
	}
		
	
}