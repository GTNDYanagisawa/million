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
package de.hybris.platform.core.model.user;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.commerceservices.enums.CustomerType;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.order.payment.PaymentInfoModel;
import de.hybris.platform.core.model.user.TitleModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.customerreview.model.CustomerReviewModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type Customer first defined at extension core.
 */
@SuppressWarnings("all")
public class CustomerModel extends UserModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "Customer";
	
	/** <i>Generated constant</i> - Attribute key of <code>Customer.customerID</code> attribute defined at extension <code>core</code>. */
	public static final String CUSTOMERID = "customerID";
	
	/** <i>Generated constant</i> - Attribute key of <code>Customer.previewCatalogVersions</code> attribute defined at extension <code>catalog</code>. */
	public static final String PREVIEWCATALOGVERSIONS = "previewCatalogVersions";
	
	/** <i>Generated constant</i> - Attribute key of <code>Customer.title</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String TITLE = "title";
	
	/** <i>Generated constant</i> - Attribute key of <code>Customer.defaultPaymentInfo</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String DEFAULTPAYMENTINFO = "defaultPaymentInfo";
	
	/** <i>Generated constant</i> - Attribute key of <code>Customer.token</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String TOKEN = "token";
	
	/** <i>Generated constant</i> - Attribute key of <code>Customer.contactEmail</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String CONTACTEMAIL = "contactEmail";
	
	/** <i>Generated constant</i> - Attribute key of <code>Customer.originalUid</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String ORIGINALUID = "originalUid";
	
	/** <i>Generated constant</i> - Attribute key of <code>Customer.type</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String TYPE = "type";
	
	/** <i>Generated constant</i> - Attribute key of <code>Customer.isInternal</code> attribute defined at extension <code>merchandisecore</code>. */
	public static final String ISINTERNAL = "isInternal";
	
	
	/** <i>Generated variable</i> - Variable of <code>Customer.customerID</code> attribute defined at extension <code>core</code>. */
	private String _customerID;
	
	/** <i>Generated variable</i> - Variable of <code>Customer.previewCatalogVersions</code> attribute defined at extension <code>catalog</code>. */
	private Collection<CatalogVersionModel> _previewCatalogVersions;
	
	/** <i>Generated variable</i> - Variable of <code>Customer.title</code> attribute defined at extension <code>commerceservices</code>. */
	private TitleModel _title;
	
	/** <i>Generated variable</i> - Variable of <code>Customer.defaultPaymentInfo</code> attribute defined at extension <code>commerceservices</code>. */
	private PaymentInfoModel _defaultPaymentInfo;
	
	/** <i>Generated variable</i> - Variable of <code>Customer.token</code> attribute defined at extension <code>commerceservices</code>. */
	private String _token;
	
	/** <i>Generated variable</i> - Variable of <code>Customer.contactEmail</code> attribute defined at extension <code>commerceservices</code>. */
	private String _contactEmail;
	
	/** <i>Generated variable</i> - Variable of <code>Customer.originalUid</code> attribute defined at extension <code>commerceservices</code>. */
	private String _originalUid;
	
	/** <i>Generated variable</i> - Variable of <code>Customer.type</code> attribute defined at extension <code>commerceservices</code>. */
	private CustomerType _type;
	
	/** <i>Generated variable</i> - Variable of <code>Customer.isInternal</code> attribute defined at extension <code>merchandisecore</code>. */
	private Boolean _isInternal;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CustomerModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CustomerModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _loginDisabled initial attribute declared by type <code>User</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>Principal</code> at extension <code>core</code>
	 */
	@Deprecated
	public CustomerModel(final boolean _loginDisabled, final String _uid)
	{
		super();
		setLoginDisabled(_loginDisabled);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _customerReviews initial attribute declared by type <code>User</code> at extension <code>customerreview</code>
	 * @param _loginDisabled initial attribute declared by type <code>User</code> at extension <code>core</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>Principal</code> at extension <code>core</code>
	 */
	@Deprecated
	public CustomerModel(final Collection<CustomerReviewModel> _customerReviews, final boolean _loginDisabled, final ItemModel _owner, final String _uid)
	{
		super();
		setCustomerReviews(_customerReviews);
		setLoginDisabled(_loginDisabled);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.contactEmail</code> dynamic attribute defined at extension <code>commerceservices</code>. 
	 * @return the contactEmail - Contact email is a dynamic attribute that is used to determine contact email
	 * 							address.
	 */
	public String getContactEmail()
	{
		return getPersistenceContext().getDynamicValue(this,CONTACTEMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.customerID</code> attribute defined at extension <code>core</code>. 
	 * @return the customerID
	 */
	public String getCustomerID()
	{
		if (this._customerID!=null)
		{
			return _customerID;
		}
		return _customerID = getPersistenceContext().getValue(CUSTOMERID, _customerID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.defaultPaymentInfo</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the defaultPaymentInfo - It holds information about default payment that is used by the customer.
	 */
	public PaymentInfoModel getDefaultPaymentInfo()
	{
		if (this._defaultPaymentInfo!=null)
		{
			return _defaultPaymentInfo;
		}
		return _defaultPaymentInfo = getPersistenceContext().getValue(DEFAULTPAYMENTINFO, _defaultPaymentInfo);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isInternal</code> dynamic attribute defined at extension <code>merchandisecore</code>. 
	 * @return the isInternal - Defines if the customer is a hybris internal employee. Aggregated information
	 */
	public Boolean getIsInternal()
	{
		return getPersistenceContext().getDynamicValue(this,ISINTERNAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.originalUid</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the originalUid
	 */
	public String getOriginalUid()
	{
		if (this._originalUid!=null)
		{
			return _originalUid;
		}
		return _originalUid = getPersistenceContext().getValue(ORIGINALUID, _originalUid);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.previewCatalogVersions</code> attribute defined at extension <code>catalog</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the previewCatalogVersions
	 */
	public Collection<CatalogVersionModel> getPreviewCatalogVersions()
	{
		if (this._previewCatalogVersions!=null)
		{
			return _previewCatalogVersions;
		}
		return _previewCatalogVersions = getPersistenceContext().getValue(PREVIEWCATALOGVERSIONS, _previewCatalogVersions);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.title</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the title - It holds information about customer title (i.e. Mr, Dr, etc.)
	 */
	public TitleModel getTitle()
	{
		if (this._title!=null)
		{
			return _title;
		}
		return _title = getPersistenceContext().getValue(TITLE, _title);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.token</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the token - Attribute is used during forgotten password to ensure that the link can be used
	 * 							only once.
	 */
	public String getToken()
	{
		if (this._token!=null)
		{
			return _token;
		}
		return _token = getPersistenceContext().getValue(TOKEN, _token);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.type</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the type - Customer type
	 */
	public CustomerType getType()
	{
		if (this._type!=null)
		{
			return _type;
		}
		return _type = getPersistenceContext().getValue(TYPE, _type);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Customer.customerID</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the customerID
	 */
	public void setCustomerID(final String value)
	{
		_customerID = getPersistenceContext().setValue(CUSTOMERID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Customer.defaultPaymentInfo</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the defaultPaymentInfo - It holds information about default payment that is used by the customer.
	 */
	public void setDefaultPaymentInfo(final PaymentInfoModel value)
	{
		_defaultPaymentInfo = getPersistenceContext().setValue(DEFAULTPAYMENTINFO, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Customer.isInternal</code> dynamic attribute defined at extension <code>merchandisecore</code>. 
	 *  
	 * @param value the isInternal - Defines if the customer is a hybris internal employee. Aggregated information
	 */
	public void setIsInternal(final Boolean value)
	{
		getPersistenceContext().setDynamicValue(this,ISINTERNAL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Customer.originalUid</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the originalUid
	 */
	public void setOriginalUid(final String value)
	{
		_originalUid = getPersistenceContext().setValue(ORIGINALUID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Customer.previewCatalogVersions</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the previewCatalogVersions
	 */
	public void setPreviewCatalogVersions(final Collection<CatalogVersionModel> value)
	{
		_previewCatalogVersions = getPersistenceContext().setValue(PREVIEWCATALOGVERSIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Customer.title</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the title - It holds information about customer title (i.e. Mr, Dr, etc.)
	 */
	public void setTitle(final TitleModel value)
	{
		_title = getPersistenceContext().setValue(TITLE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Customer.token</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the token - Attribute is used during forgotten password to ensure that the link can be used
	 * 							only once.
	 */
	public void setToken(final String value)
	{
		_token = getPersistenceContext().setValue(TOKEN, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Customer.type</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the type - Customer type
	 */
	public void setType(final CustomerType value)
	{
		_type = getPersistenceContext().setValue(TYPE, value);
	}
	
}
