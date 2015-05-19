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
package de.hybris.platform.acceleratorservices.constants;

/**
 * @deprecated use constants in Model classes instead
 */
@Deprecated
@SuppressWarnings({"unused","cast","PMD"})
public class GeneratedAcceleratorServicesConstants
{
	public static final String EXTENSIONNAME = "acceleratorservices";
	public static class TC
	{
		public static final String ACCELERATORPRODUCTBOGOFPROMOTION = "AcceleratorProductBOGOFPromotion".intern();
		public static final String ACCELERATORPRODUCTMULTIBUYPROMOTION = "AcceleratorProductMultiBuyPromotion".intern();
		public static final String CARTREMOVALCRONJOB = "CartRemovalCronJob".intern();
		public static final String CCPAYSUBVALIDATION = "CCPaySubValidation".intern();
		public static final String CHECKOUTFLOWENUM = "CheckoutFlowEnum".intern();
		public static final String CHECKOUTPCIOPTIONENUM = "CheckoutPciOptionEnum".intern();
		public static final String EMAILADDRESS = "EmailAddress".intern();
		public static final String EMAILATTACHMENT = "EmailAttachment".intern();
		public static final String EMAILMESSAGE = "EmailMessage".intern();
		public static final String EMAILPAGE = "EmailPage".intern();
		public static final String EMAILPAGETEMPLATE = "EmailPageTemplate".intern();
		public static final String EXPORTDATACRONJOB = "ExportDataCronJob".intern();
		public static final String EXPORTDATAHISTORYENTRY = "ExportDataHistoryEntry".intern();
		public static final String EXPORTDATASTATUS = "ExportDataStatus".intern();
		public static final String ORDERMODIFICATIONPROCESS = "OrderModificationProcess".intern();
		public static final String SITEMAPCHANGEFREQUENCYENUM = "SiteMapChangeFrequencyEnum".intern();
		public static final String SITEMAPCONFIG = "SiteMapConfig".intern();
		public static final String SITEMAPLANGUAGECURRENCY = "SiteMapLanguageCurrency".intern();
		public static final String SITEMAPMEDIACRONJOB = "SiteMapMediaCronJob".intern();
		public static final String SITEMAPPAGE = "SiteMapPage".intern();
		public static final String SITEMAPPAGEENUM = "SiteMapPageEnum".intern();
		public static final String SOLRPAGEREDIRECT = "SolrPageRedirect".intern();
		public static final String UNCOLLECTEDORDERSCRONJOB = "UncollectedOrdersCronJob".intern();
	}
	public static class Attributes
	{
		public static class AbstractPromotion
		{
			public static final String NAME = "name".intern();
		}
		public static class BaseSite
		{
			public static final String ANONYMOUSCARTREMOVALAGE = "anonymousCartRemovalAge".intern();
			public static final String CARTREMOVALAGE = "cartRemovalAge".intern();
			public static final String CARTREMOVALCRONJOB = "cartRemovalCronJob".intern();
			public static final String UNCOLLECTEDORDERSCRONJOB = "uncollectedOrdersCronJob".intern();
		}
		public static class BaseStore
		{
			public static final String CHECKOUTFLOWGROUP = "checkoutFlowGroup".intern();
			public static final String EXPRESSCHECKOUTENABLED = "expressCheckoutEnabled".intern();
			public static final String TAXESTIMATIONENABLED = "taxEstimationEnabled".intern();
		}
		public static class BusinessProcess
		{
			public static final String EMAILS = "emails".intern();
		}
		public static class CMSSite
		{
			public static final String SITEMAPCONFIG = "siteMapConfig".intern();
			public static final String SITEMAPS = "siteMaps".intern();
			public static final String URLENCODINGATTRIBUTES = "urlEncodingAttributes".intern();
		}
		public static class Consignment
		{
			public static final String STATUSDISPLAY = "statusDisplay".intern();
		}
		public static class CreditCardPaymentInfo
		{
			public static final String SUBSCRIPTIONVALIDATED = "subscriptionValidated".intern();
		}
		public static class PriceRow
		{
			public static final String SEQUENCEID = "sequenceId".intern();
		}
		public static class Product
		{
			public static final String SEQUENCEID = "sequenceId".intern();
		}
		public static class StoreFrontCustomerProcess
		{
			public static final String CURRENCY = "currency".intern();
		}
	}
	public static class Enumerations
	{
		public static class CheckoutFlowEnum
		{
			public static final String MULTISTEP = "MULTISTEP".intern();
		}
		public static class CheckoutPciOptionEnum
		{
			public static final String DEFAULT = "Default".intern();
			public static final String HOP = "HOP".intern();
			public static final String SOP = "SOP".intern();
		}
		public static class ExportDataStatus
		{
			public static final String COMPLETE = "COMPLETE".intern();
			public static final String FAILED = "FAILED".intern();
			public static final String RUNNING = "RUNNING".intern();
		}
		public static class SiteMapChangeFrequencyEnum
		{
			public static final String ALWAYS = "always".intern();
			public static final String HOURLY = "hourly".intern();
			public static final String DAILY = "daily".intern();
			public static final String WEEKLY = "weekly".intern();
			public static final String MONTHLY = "monthly".intern();
			public static final String YEARLY = "yearly".intern();
			public static final String NEVER = "never".intern();
		}
		public static class SiteMapPageEnum
		{
			public static final String HOMEPAGE = "Homepage".intern();
			public static final String PRODUCT = "Product".intern();
			public static final String CATEGORY = "Category".intern();
			public static final String CATEGORYLANDING = "CategoryLanding".intern();
			public static final String STORE = "Store".intern();
			public static final String CONTENT = "Content".intern();
			public static final String CUSTOM = "Custom".intern();
		}
	}
	public static class Relations
	{
		public static final String BASESITE2CARTREMOVALCRONJOB = "BaseSite2CartRemovalCronJob".intern();
		public static final String BASESITE2UNCOLLECTEDORDERSCRONJOB = "BaseSite2UncollectedOrdersCronJob".intern();
		public static final String BUSINESSPROCESS2EMAILMESSAGEREL = "BusinessProcess2EmailMessageRel".intern();
		public static final String EMAILMESSAGE2BCCADDRESSESREL = "EmailMessage2BccAddressesRel".intern();
		public static final String EMAILMESSAGE2CCADDRESSESREL = "EmailMessage2CcAddressesRel".intern();
		public static final String EMAILMESSAGE2EMAILATTACHMENTSREL = "EmailMessage2EmailAttachmentsRel".intern();
		public static final String EMAILMESSAGE2FROMADDRESSREL = "EmailMessage2FromAddressRel".intern();
		public static final String EMAILMESSAGE2TOADDRESSESREL = "EmailMessage2ToAddressesRel".intern();
		public static final String EXPORTDATACRONJOB2EXPORTDATAHISTORYREL = "ExportDataCronJob2ExportDataHistoryRel".intern();
	}
	
	protected GeneratedAcceleratorServicesConstants()
	{
		// private constructor
	}
	
	
}
