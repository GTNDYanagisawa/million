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
package de.hybris.platform.b2bacceleratorservices.constants;

/**
 * @deprecated use constants in Model classes instead
 */
@Deprecated
@SuppressWarnings({"unused","cast","PMD"})
public class GeneratedB2BAcceleratorServicesConstants
{
	public static final String EXTENSIONNAME = "b2bacceleratorservices";
	public static class TC
	{
		public static final String B2BPERMISSIONTYPEENUM = "B2BPermissionTypeEnum".intern();
		public static final String BTGASSIGNORGANIZATIONTOGROUPDEFINITION = "BTGAssignOrganizationToGroupDefinition".intern();
		public static final String BTGNUMBEROFORDERSABOVEAMOUNTRELATIVEDATEOPERAND = "BTGNumberOfOrdersAboveAmountRelativeDateOperand".intern();
		public static final String BTGORGANIZATIONUIDOFUSEROPERAND = "BTGOrganizationUIDOfUserOperand".intern();
		public static final String BTGORGANIZATIONUIDSOPERAND = "BTGOrganizationUIDsOperand".intern();
		public static final String CHECKOUTPAYMENTTYPE = "CheckoutPaymentType".intern();
		public static final String ORDERTHRESHOLDDISCOUNTPERCENTAGEPROMOTION = "OrderThresholdDiscountPercentagePromotion".intern();
		public static final String PRODUCTPRICEDISCOUNTPROMOTIONBYPAYMENTTYPE = "ProductPriceDiscountPromotionByPaymentType".intern();
		public static final String PRODUCTTHRESHOLDPRICEDISCOUNTPROMOTION = "ProductThresholdPriceDiscountPromotion".intern();
		public static final String REPLENISHMENTPROCESS = "ReplenishmentProcess".intern();
	}
	public static class Attributes
	{
		public static class AbstractOrder
		{
			public static final String PAYMENTTYPE = "paymentType".intern();
			public static final String PURCHASEORDERNUMBER = "purchaseOrderNumber".intern();
		}
		public static class CartToOrderCronJob
		{
			public static final String ORDERS = "orders".intern();
		}
		public static class Order
		{
			public static final String SCHEDULINGCRONJOB = "schedulingCronJob".intern();
		}
	}
	public static class Enumerations
	{
		public static class B2BPermissionTypeEnum
		{
			public static final String B2BORDERTHRESHOLDPERMISSION = "B2BOrderThresholdPermission".intern();
			public static final String B2BORDERTHRESHOLDTIMESPANPERMISSION = "B2BOrderThresholdTimespanPermission".intern();
			public static final String B2BBUDGETEXCEEDEDPERMISSION = "B2BBudgetExceededPermission".intern();
		}
		public static class CheckoutPaymentType
		{
			public static final String CARD = "CARD".intern();
			public static final String ACCOUNT = "ACCOUNT".intern();
		}
	}
	public static class Relations
	{
		public static final String ORDER2CARTTOORDERCRONJOB = "Order2CartToOrderCronJob".intern();
	}
	
	protected GeneratedB2BAcceleratorServicesConstants()
	{
		// private constructor
	}
	
	
}
