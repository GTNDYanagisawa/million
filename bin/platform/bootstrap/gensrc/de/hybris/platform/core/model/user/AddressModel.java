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

import de.hybris.platform.core.enums.Gender;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.core.model.c2l.RegionModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.TitleModel;
import de.hybris.platform.orderscheduling.model.CartToOrderCronJobModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Date;

/**
 * Generated model class for type Address first defined at extension core.
 */
@SuppressWarnings("all")
public class AddressModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "Address";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.original</code> attribute defined at extension <code>core</code>. */
	public static final String ORIGINAL = "original";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.duplicate</code> attribute defined at extension <code>core</code>. */
	public static final String DUPLICATE = "duplicate";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.appartment</code> attribute defined at extension <code>core</code>. */
	public static final String APPARTMENT = "appartment";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.building</code> attribute defined at extension <code>core</code>. */
	public static final String BUILDING = "building";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.cellphone</code> attribute defined at extension <code>core</code>. */
	public static final String CELLPHONE = "cellphone";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.company</code> attribute defined at extension <code>core</code>. */
	public static final String COMPANY = "company";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.country</code> attribute defined at extension <code>core</code>. */
	public static final String COUNTRY = "country";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.department</code> attribute defined at extension <code>core</code>. */
	public static final String DEPARTMENT = "department";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.district</code> attribute defined at extension <code>core</code>. */
	public static final String DISTRICT = "district";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.email</code> attribute defined at extension <code>core</code>. */
	public static final String EMAIL = "email";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.fax</code> attribute defined at extension <code>core</code>. */
	public static final String FAX = "fax";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.firstname</code> attribute defined at extension <code>core</code>. */
	public static final String FIRSTNAME = "firstname";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.lastname</code> attribute defined at extension <code>core</code>. */
	public static final String LASTNAME = "lastname";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.middlename</code> attribute defined at extension <code>core</code>. */
	public static final String MIDDLENAME = "middlename";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.middlename2</code> attribute defined at extension <code>core</code>. */
	public static final String MIDDLENAME2 = "middlename2";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.phone1</code> attribute defined at extension <code>core</code>. */
	public static final String PHONE1 = "phone1";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.phone2</code> attribute defined at extension <code>core</code>. */
	public static final String PHONE2 = "phone2";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.pobox</code> attribute defined at extension <code>core</code>. */
	public static final String POBOX = "pobox";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.postalcode</code> attribute defined at extension <code>core</code>. */
	public static final String POSTALCODE = "postalcode";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.region</code> attribute defined at extension <code>core</code>. */
	public static final String REGION = "region";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.streetname</code> attribute defined at extension <code>core</code>. */
	public static final String STREETNAME = "streetname";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.streetnumber</code> attribute defined at extension <code>core</code>. */
	public static final String STREETNUMBER = "streetnumber";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.title</code> attribute defined at extension <code>core</code>. */
	public static final String TITLE = "title";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.town</code> attribute defined at extension <code>core</code>. */
	public static final String TOWN = "town";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.gender</code> attribute defined at extension <code>core</code>. */
	public static final String GENDER = "gender";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.dateOfBirth</code> attribute defined at extension <code>core</code>. */
	public static final String DATEOFBIRTH = "dateOfBirth";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.remarks</code> attribute defined at extension <code>catalog</code>. */
	public static final String REMARKS = "remarks";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.publicKey</code> attribute defined at extension <code>catalog</code>. */
	public static final String PUBLICKEY = "publicKey";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.url</code> attribute defined at extension <code>catalog</code>. */
	public static final String URL = "url";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.typeQualifier</code> attribute defined at extension <code>catalog</code>. */
	public static final String TYPEQUALIFIER = "typeQualifier";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.shippingAddress</code> attribute defined at extension <code>catalog</code>. */
	public static final String SHIPPINGADDRESS = "shippingAddress";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.unloadingAddress</code> attribute defined at extension <code>catalog</code>. */
	public static final String UNLOADINGADDRESS = "unloadingAddress";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.billingAddress</code> attribute defined at extension <code>catalog</code>. */
	public static final String BILLINGADDRESS = "billingAddress";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.contactAddress</code> attribute defined at extension <code>catalog</code>. */
	public static final String CONTACTADDRESS = "contactAddress";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.line1</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String LINE1 = "line1";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.line2</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String LINE2 = "line2";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.deliveryAddresss2CartToOrderCronJob</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String DELIVERYADDRESSS2CARTTOORDERCRONJOB = "deliveryAddresss2CartToOrderCronJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.paymentAddresss2CartToOrderCronJob</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String PAYMENTADDRESSS2CARTTOORDERCRONJOB = "paymentAddresss2CartToOrderCronJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>Address.visibleInAddressBook</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String VISIBLEINADDRESSBOOK = "visibleInAddressBook";
	
	
	/** <i>Generated variable</i> - Variable of <code>Address.original</code> attribute defined at extension <code>core</code>. */
	private AddressModel _original;
	
	/** <i>Generated variable</i> - Variable of <code>Address.duplicate</code> attribute defined at extension <code>core</code>. */
	private Boolean _duplicate;
	
	/** <i>Generated variable</i> - Variable of <code>Address.appartment</code> attribute defined at extension <code>core</code>. */
	private String _appartment;
	
	/** <i>Generated variable</i> - Variable of <code>Address.building</code> attribute defined at extension <code>core</code>. */
	private String _building;
	
	/** <i>Generated variable</i> - Variable of <code>Address.cellphone</code> attribute defined at extension <code>core</code>. */
	private String _cellphone;
	
	/** <i>Generated variable</i> - Variable of <code>Address.company</code> attribute defined at extension <code>core</code>. */
	private String _company;
	
	/** <i>Generated variable</i> - Variable of <code>Address.country</code> attribute defined at extension <code>core</code>. */
	private CountryModel _country;
	
	/** <i>Generated variable</i> - Variable of <code>Address.department</code> attribute defined at extension <code>core</code>. */
	private String _department;
	
	/** <i>Generated variable</i> - Variable of <code>Address.district</code> attribute defined at extension <code>core</code>. */
	private String _district;
	
	/** <i>Generated variable</i> - Variable of <code>Address.email</code> attribute defined at extension <code>core</code>. */
	private String _email;
	
	/** <i>Generated variable</i> - Variable of <code>Address.fax</code> attribute defined at extension <code>core</code>. */
	private String _fax;
	
	/** <i>Generated variable</i> - Variable of <code>Address.firstname</code> attribute defined at extension <code>core</code>. */
	private String _firstname;
	
	/** <i>Generated variable</i> - Variable of <code>Address.lastname</code> attribute defined at extension <code>core</code>. */
	private String _lastname;
	
	/** <i>Generated variable</i> - Variable of <code>Address.middlename</code> attribute defined at extension <code>core</code>. */
	private String _middlename;
	
	/** <i>Generated variable</i> - Variable of <code>Address.middlename2</code> attribute defined at extension <code>core</code>. */
	private String _middlename2;
	
	/** <i>Generated variable</i> - Variable of <code>Address.phone1</code> attribute defined at extension <code>core</code>. */
	private String _phone1;
	
	/** <i>Generated variable</i> - Variable of <code>Address.phone2</code> attribute defined at extension <code>core</code>. */
	private String _phone2;
	
	/** <i>Generated variable</i> - Variable of <code>Address.pobox</code> attribute defined at extension <code>core</code>. */
	private String _pobox;
	
	/** <i>Generated variable</i> - Variable of <code>Address.postalcode</code> attribute defined at extension <code>core</code>. */
	private String _postalcode;
	
	/** <i>Generated variable</i> - Variable of <code>Address.region</code> attribute defined at extension <code>core</code>. */
	private RegionModel _region;
	
	/** <i>Generated variable</i> - Variable of <code>Address.streetname</code> attribute defined at extension <code>core</code>. */
	private String _streetname;
	
	/** <i>Generated variable</i> - Variable of <code>Address.streetnumber</code> attribute defined at extension <code>core</code>. */
	private String _streetnumber;
	
	/** <i>Generated variable</i> - Variable of <code>Address.title</code> attribute defined at extension <code>core</code>. */
	private TitleModel _title;
	
	/** <i>Generated variable</i> - Variable of <code>Address.town</code> attribute defined at extension <code>core</code>. */
	private String _town;
	
	/** <i>Generated variable</i> - Variable of <code>Address.gender</code> attribute defined at extension <code>core</code>. */
	private Gender _gender;
	
	/** <i>Generated variable</i> - Variable of <code>Address.dateOfBirth</code> attribute defined at extension <code>core</code>. */
	private Date _dateOfBirth;
	
	/** <i>Generated variable</i> - Variable of <code>Address.remarks</code> attribute defined at extension <code>catalog</code>. */
	private String _remarks;
	
	/** <i>Generated variable</i> - Variable of <code>Address.publicKey</code> attribute defined at extension <code>catalog</code>. */
	private String _publicKey;
	
	/** <i>Generated variable</i> - Variable of <code>Address.url</code> attribute defined at extension <code>catalog</code>. */
	private String _url;
	
	/** <i>Generated variable</i> - Variable of <code>Address.typeQualifier</code> attribute defined at extension <code>catalog</code>. */
	private String _typeQualifier;
	
	/** <i>Generated variable</i> - Variable of <code>Address.shippingAddress</code> attribute defined at extension <code>catalog</code>. */
	private Boolean _shippingAddress;
	
	/** <i>Generated variable</i> - Variable of <code>Address.unloadingAddress</code> attribute defined at extension <code>catalog</code>. */
	private Boolean _unloadingAddress;
	
	/** <i>Generated variable</i> - Variable of <code>Address.billingAddress</code> attribute defined at extension <code>catalog</code>. */
	private Boolean _billingAddress;
	
	/** <i>Generated variable</i> - Variable of <code>Address.contactAddress</code> attribute defined at extension <code>catalog</code>. */
	private Boolean _contactAddress;
	
	/** <i>Generated variable</i> - Variable of <code>Address.line1</code> attribute defined at extension <code>basecommerce</code>. */
	private String _line1;
	
	/** <i>Generated variable</i> - Variable of <code>Address.line2</code> attribute defined at extension <code>basecommerce</code>. */
	private String _line2;
	
	/** <i>Generated variable</i> - Variable of <code>Address.deliveryAddresss2CartToOrderCronJob</code> attribute defined at extension <code>basecommerce</code>. */
	private Collection<CartToOrderCronJobModel> _deliveryAddresss2CartToOrderCronJob;
	
	/** <i>Generated variable</i> - Variable of <code>Address.paymentAddresss2CartToOrderCronJob</code> attribute defined at extension <code>basecommerce</code>. */
	private Collection<CartToOrderCronJobModel> _paymentAddresss2CartToOrderCronJob;
	
	/** <i>Generated variable</i> - Variable of <code>Address.visibleInAddressBook</code> attribute defined at extension <code>commerceservices</code>. */
	private Boolean _visibleInAddressBook;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AddressModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AddressModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _original initial attribute declared by type <code>Address</code> at extension <code>core</code>
	 * @param _owner initial attribute declared by type <code>Address</code> at extension <code>core</code>
	 */
	@Deprecated
	public AddressModel(final AddressModel _original, final ItemModel _owner)
	{
		super();
		setOriginal(_original);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.appartment</code> attribute defined at extension <code>core</code>. 
	 * @return the appartment
	 */
	public String getAppartment()
	{
		if (this._appartment!=null)
		{
			return _appartment;
		}
		return _appartment = getPersistenceContext().getValue(APPARTMENT, _appartment);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.billingAddress</code> attribute defined at extension <code>catalog</code>. 
	 * @return the billingAddress - billingAddress
	 */
	public Boolean getBillingAddress()
	{
		if (this._billingAddress!=null)
		{
			return _billingAddress;
		}
		return _billingAddress = getPersistenceContext().getValue(BILLINGADDRESS, _billingAddress);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.building</code> attribute defined at extension <code>core</code>. 
	 * @return the building
	 */
	public String getBuilding()
	{
		if (this._building!=null)
		{
			return _building;
		}
		return _building = getPersistenceContext().getValue(BUILDING, _building);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.cellphone</code> attribute defined at extension <code>core</code>. 
	 * @return the cellphone
	 */
	public String getCellphone()
	{
		if (this._cellphone!=null)
		{
			return _cellphone;
		}
		return _cellphone = getPersistenceContext().getValue(CELLPHONE, _cellphone);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.company</code> attribute defined at extension <code>core</code>. 
	 * @return the company
	 */
	public String getCompany()
	{
		if (this._company!=null)
		{
			return _company;
		}
		return _company = getPersistenceContext().getValue(COMPANY, _company);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.contactAddress</code> attribute defined at extension <code>catalog</code>. 
	 * @return the contactAddress - contactAddress
	 */
	public Boolean getContactAddress()
	{
		if (this._contactAddress!=null)
		{
			return _contactAddress;
		}
		return _contactAddress = getPersistenceContext().getValue(CONTACTADDRESS, _contactAddress);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.country</code> attribute defined at extension <code>core</code>. 
	 * @return the country
	 */
	public CountryModel getCountry()
	{
		if (this._country!=null)
		{
			return _country;
		}
		return _country = getPersistenceContext().getValue(COUNTRY, _country);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.dateOfBirth</code> attribute defined at extension <code>core</code>. 
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth()
	{
		if (this._dateOfBirth!=null)
		{
			return _dateOfBirth;
		}
		return _dateOfBirth = getPersistenceContext().getValue(DATEOFBIRTH, _dateOfBirth);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.dateOfBirth</code> attribute defined at extension <code>core</code>. 
	 * @return the dateOfBirth
	 * @deprecated use {@link #getDateOfBirth()} instead
	 */
	@Deprecated
	public Date getDateofbirth()
	{
		return this.getDateOfBirth();
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.deliveryAddresss2CartToOrderCronJob</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the deliveryAddresss2CartToOrderCronJob
	 */
	public Collection<CartToOrderCronJobModel> getDeliveryAddresss2CartToOrderCronJob()
	{
		if (this._deliveryAddresss2CartToOrderCronJob!=null)
		{
			return _deliveryAddresss2CartToOrderCronJob;
		}
		return _deliveryAddresss2CartToOrderCronJob = getPersistenceContext().getValue(DELIVERYADDRESSS2CARTTOORDERCRONJOB, _deliveryAddresss2CartToOrderCronJob);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.department</code> attribute defined at extension <code>core</code>. 
	 * @return the department
	 */
	public String getDepartment()
	{
		if (this._department!=null)
		{
			return _department;
		}
		return _department = getPersistenceContext().getValue(DEPARTMENT, _department);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.district</code> attribute defined at extension <code>core</code>. 
	 * @return the district
	 */
	public String getDistrict()
	{
		if (this._district!=null)
		{
			return _district;
		}
		return _district = getPersistenceContext().getValue(DISTRICT, _district);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.duplicate</code> attribute defined at extension <code>core</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Address.email</code> attribute defined at extension <code>core</code>. 
	 * @return the email
	 */
	public String getEmail()
	{
		if (this._email!=null)
		{
			return _email;
		}
		return _email = getPersistenceContext().getValue(EMAIL, _email);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.fax</code> attribute defined at extension <code>core</code>. 
	 * @return the fax
	 */
	public String getFax()
	{
		if (this._fax!=null)
		{
			return _fax;
		}
		return _fax = getPersistenceContext().getValue(FAX, _fax);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.firstname</code> attribute defined at extension <code>core</code>. 
	 * @return the firstname
	 */
	public String getFirstname()
	{
		if (this._firstname!=null)
		{
			return _firstname;
		}
		return _firstname = getPersistenceContext().getValue(FIRSTNAME, _firstname);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.gender</code> attribute defined at extension <code>core</code>. 
	 * @return the gender
	 */
	public Gender getGender()
	{
		if (this._gender!=null)
		{
			return _gender;
		}
		return _gender = getPersistenceContext().getValue(GENDER, _gender);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.lastname</code> attribute defined at extension <code>core</code>. 
	 * @return the lastname
	 */
	public String getLastname()
	{
		if (this._lastname!=null)
		{
			return _lastname;
		}
		return _lastname = getPersistenceContext().getValue(LASTNAME, _lastname);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.line1</code> dynamic attribute defined at extension <code>basecommerce</code>. 
	 * @return the line1 - Address line1 is a dynamic attribute that is stored in the Address.streetname field
	 */
	public String getLine1()
	{
		return getPersistenceContext().getDynamicValue(this,LINE1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.line2</code> dynamic attribute defined at extension <code>basecommerce</code>. 
	 * @return the line2 - Address line2 is a dynamic attribute that is stored in the Address.streetnumber field
	 */
	public String getLine2()
	{
		return getPersistenceContext().getDynamicValue(this,LINE2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.middlename</code> attribute defined at extension <code>core</code>. 
	 * @return the middlename
	 */
	public String getMiddlename()
	{
		if (this._middlename!=null)
		{
			return _middlename;
		}
		return _middlename = getPersistenceContext().getValue(MIDDLENAME, _middlename);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.middlename2</code> attribute defined at extension <code>core</code>. 
	 * @return the middlename2
	 */
	public String getMiddlename2()
	{
		if (this._middlename2!=null)
		{
			return _middlename2;
		}
		return _middlename2 = getPersistenceContext().getValue(MIDDLENAME2, _middlename2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.original</code> attribute defined at extension <code>core</code>. 
	 * @return the original
	 */
	public AddressModel getOriginal()
	{
		if (this._original!=null)
		{
			return _original;
		}
		return _original = getPersistenceContext().getValue(ORIGINAL, _original);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.paymentAddresss2CartToOrderCronJob</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the paymentAddresss2CartToOrderCronJob
	 */
	public Collection<CartToOrderCronJobModel> getPaymentAddresss2CartToOrderCronJob()
	{
		if (this._paymentAddresss2CartToOrderCronJob!=null)
		{
			return _paymentAddresss2CartToOrderCronJob;
		}
		return _paymentAddresss2CartToOrderCronJob = getPersistenceContext().getValue(PAYMENTADDRESSS2CARTTOORDERCRONJOB, _paymentAddresss2CartToOrderCronJob);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.phone1</code> attribute defined at extension <code>core</code>. 
	 * @return the phone1
	 */
	public String getPhone1()
	{
		if (this._phone1!=null)
		{
			return _phone1;
		}
		return _phone1 = getPersistenceContext().getValue(PHONE1, _phone1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.phone2</code> attribute defined at extension <code>core</code>. 
	 * @return the phone2
	 */
	public String getPhone2()
	{
		if (this._phone2!=null)
		{
			return _phone2;
		}
		return _phone2 = getPersistenceContext().getValue(PHONE2, _phone2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.pobox</code> attribute defined at extension <code>core</code>. 
	 * @return the pobox
	 */
	public String getPobox()
	{
		if (this._pobox!=null)
		{
			return _pobox;
		}
		return _pobox = getPersistenceContext().getValue(POBOX, _pobox);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.postalcode</code> attribute defined at extension <code>core</code>. 
	 * @return the postalcode
	 */
	public String getPostalcode()
	{
		if (this._postalcode!=null)
		{
			return _postalcode;
		}
		return _postalcode = getPersistenceContext().getValue(POSTALCODE, _postalcode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.publicKey</code> attribute defined at extension <code>catalog</code>. 
	 * @return the publicKey
	 */
	public String getPublicKey()
	{
		if (this._publicKey!=null)
		{
			return _publicKey;
		}
		return _publicKey = getPersistenceContext().getValue(PUBLICKEY, _publicKey);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.region</code> attribute defined at extension <code>core</code>. 
	 * @return the region
	 */
	public RegionModel getRegion()
	{
		if (this._region!=null)
		{
			return _region;
		}
		return _region = getPersistenceContext().getValue(REGION, _region);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.remarks</code> attribute defined at extension <code>catalog</code>. 
	 * @return the remarks
	 */
	public String getRemarks()
	{
		if (this._remarks!=null)
		{
			return _remarks;
		}
		return _remarks = getPersistenceContext().getValue(REMARKS, _remarks);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.shippingAddress</code> attribute defined at extension <code>catalog</code>. 
	 * @return the shippingAddress - shippingAddress
	 */
	public Boolean getShippingAddress()
	{
		if (this._shippingAddress!=null)
		{
			return _shippingAddress;
		}
		return _shippingAddress = getPersistenceContext().getValue(SHIPPINGADDRESS, _shippingAddress);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.streetname</code> attribute defined at extension <code>core</code>. 
	 * @return the streetname
	 */
	public String getStreetname()
	{
		if (this._streetname!=null)
		{
			return _streetname;
		}
		return _streetname = getPersistenceContext().getValue(STREETNAME, _streetname);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.streetnumber</code> attribute defined at extension <code>core</code>. 
	 * @return the streetnumber
	 */
	public String getStreetnumber()
	{
		if (this._streetnumber!=null)
		{
			return _streetnumber;
		}
		return _streetnumber = getPersistenceContext().getValue(STREETNUMBER, _streetnumber);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.title</code> attribute defined at extension <code>core</code>. 
	 * @return the title
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
	 * <i>Generated method</i> - Getter of the <code>Address.town</code> attribute defined at extension <code>core</code>. 
	 * @return the town
	 */
	public String getTown()
	{
		if (this._town!=null)
		{
			return _town;
		}
		return _town = getPersistenceContext().getValue(TOWN, _town);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.typeQualifier</code> attribute defined at extension <code>catalog</code>. 
	 * @return the typeQualifier - typeQualifier
	 */
	public String getTypeQualifier()
	{
		if (this._typeQualifier!=null)
		{
			return _typeQualifier;
		}
		return _typeQualifier = getPersistenceContext().getValue(TYPEQUALIFIER, _typeQualifier);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.unloadingAddress</code> attribute defined at extension <code>catalog</code>. 
	 * @return the unloadingAddress - unloadingAddress
	 */
	public Boolean getUnloadingAddress()
	{
		if (this._unloadingAddress!=null)
		{
			return _unloadingAddress;
		}
		return _unloadingAddress = getPersistenceContext().getValue(UNLOADINGADDRESS, _unloadingAddress);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.url</code> attribute defined at extension <code>catalog</code>. 
	 * @return the url
	 */
	public String getUrl()
	{
		if (this._url!=null)
		{
			return _url;
		}
		return _url = getPersistenceContext().getValue(URL, _url);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.visibleInAddressBook</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the visibleInAddressBook - Indicates if the address will be displayed to the user in the address book.
	 */
	public Boolean getVisibleInAddressBook()
	{
		if (this._visibleInAddressBook!=null)
		{
			return _visibleInAddressBook;
		}
		return _visibleInAddressBook = getPersistenceContext().getValue(VISIBLEINADDRESSBOOK, _visibleInAddressBook);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.appartment</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the appartment
	 */
	public void setAppartment(final String value)
	{
		_appartment = getPersistenceContext().setValue(APPARTMENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.billingAddress</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the billingAddress - billingAddress
	 */
	public void setBillingAddress(final Boolean value)
	{
		_billingAddress = getPersistenceContext().setValue(BILLINGADDRESS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.building</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the building
	 */
	public void setBuilding(final String value)
	{
		_building = getPersistenceContext().setValue(BUILDING, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.cellphone</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the cellphone
	 */
	public void setCellphone(final String value)
	{
		_cellphone = getPersistenceContext().setValue(CELLPHONE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.company</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the company
	 */
	public void setCompany(final String value)
	{
		_company = getPersistenceContext().setValue(COMPANY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.contactAddress</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the contactAddress - contactAddress
	 */
	public void setContactAddress(final Boolean value)
	{
		_contactAddress = getPersistenceContext().setValue(CONTACTADDRESS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.country</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the country
	 */
	public void setCountry(final CountryModel value)
	{
		_country = getPersistenceContext().setValue(COUNTRY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.dateOfBirth</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the dateOfBirth
	 */
	public void setDateOfBirth(final Date value)
	{
		_dateOfBirth = getPersistenceContext().setValue(DATEOFBIRTH, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.dateOfBirth</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the dateOfBirth
	 * @deprecated use {@link #setDateOfBirth(java.util.Date)} instead
	 */
	@Deprecated
	public void setDateofbirth(final Date value)
	{
		this.setDateOfBirth(value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.deliveryAddresss2CartToOrderCronJob</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the deliveryAddresss2CartToOrderCronJob
	 */
	public void setDeliveryAddresss2CartToOrderCronJob(final Collection<CartToOrderCronJobModel> value)
	{
		_deliveryAddresss2CartToOrderCronJob = getPersistenceContext().setValue(DELIVERYADDRESSS2CARTTOORDERCRONJOB, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.department</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the department
	 */
	public void setDepartment(final String value)
	{
		_department = getPersistenceContext().setValue(DEPARTMENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.district</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the district
	 */
	public void setDistrict(final String value)
	{
		_district = getPersistenceContext().setValue(DISTRICT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.duplicate</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the duplicate
	 */
	public void setDuplicate(final Boolean value)
	{
		_duplicate = getPersistenceContext().setValue(DUPLICATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.email</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the email
	 */
	public void setEmail(final String value)
	{
		_email = getPersistenceContext().setValue(EMAIL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.fax</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the fax
	 */
	public void setFax(final String value)
	{
		_fax = getPersistenceContext().setValue(FAX, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.firstname</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the firstname
	 */
	public void setFirstname(final String value)
	{
		_firstname = getPersistenceContext().setValue(FIRSTNAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.gender</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the gender
	 */
	public void setGender(final Gender value)
	{
		_gender = getPersistenceContext().setValue(GENDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.lastname</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the lastname
	 */
	public void setLastname(final String value)
	{
		_lastname = getPersistenceContext().setValue(LASTNAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.line1</code> dynamic attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the line1 - Address line1 is a dynamic attribute that is stored in the Address.streetname field
	 */
	public void setLine1(final String value)
	{
		getPersistenceContext().setDynamicValue(this,LINE1, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.line2</code> dynamic attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the line2 - Address line2 is a dynamic attribute that is stored in the Address.streetnumber field
	 */
	public void setLine2(final String value)
	{
		getPersistenceContext().setDynamicValue(this,LINE2, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.middlename</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the middlename
	 */
	public void setMiddlename(final String value)
	{
		_middlename = getPersistenceContext().setValue(MIDDLENAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.middlename2</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the middlename2
	 */
	public void setMiddlename2(final String value)
	{
		_middlename2 = getPersistenceContext().setValue(MIDDLENAME2, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>Address.original</code> attribute defined at extension <code>core</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the original
	 */
	public void setOriginal(final AddressModel value)
	{
		_original = getPersistenceContext().setValue(ORIGINAL, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>Item.owner</code> attribute defined at extension <code>core</code> and redeclared at extension <code>core</code>. Can only be used at creation of model - before first save. Will only accept values of type {@link de.hybris.platform.core.model.ItemModel}.  
	 *  
	 * @param value the owner
	 */
	@Override
	public void setOwner(final ItemModel value)
	{
		super.setOwner(value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.paymentAddresss2CartToOrderCronJob</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the paymentAddresss2CartToOrderCronJob
	 */
	public void setPaymentAddresss2CartToOrderCronJob(final Collection<CartToOrderCronJobModel> value)
	{
		_paymentAddresss2CartToOrderCronJob = getPersistenceContext().setValue(PAYMENTADDRESSS2CARTTOORDERCRONJOB, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.phone1</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the phone1
	 */
	public void setPhone1(final String value)
	{
		_phone1 = getPersistenceContext().setValue(PHONE1, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.phone2</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the phone2
	 */
	public void setPhone2(final String value)
	{
		_phone2 = getPersistenceContext().setValue(PHONE2, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.pobox</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the pobox
	 */
	public void setPobox(final String value)
	{
		_pobox = getPersistenceContext().setValue(POBOX, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.postalcode</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the postalcode
	 */
	public void setPostalcode(final String value)
	{
		_postalcode = getPersistenceContext().setValue(POSTALCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.publicKey</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the publicKey
	 */
	public void setPublicKey(final String value)
	{
		_publicKey = getPersistenceContext().setValue(PUBLICKEY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.region</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the region
	 */
	public void setRegion(final RegionModel value)
	{
		_region = getPersistenceContext().setValue(REGION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.remarks</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the remarks
	 */
	public void setRemarks(final String value)
	{
		_remarks = getPersistenceContext().setValue(REMARKS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.shippingAddress</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the shippingAddress - shippingAddress
	 */
	public void setShippingAddress(final Boolean value)
	{
		_shippingAddress = getPersistenceContext().setValue(SHIPPINGADDRESS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.streetname</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the streetname
	 */
	public void setStreetname(final String value)
	{
		_streetname = getPersistenceContext().setValue(STREETNAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.streetnumber</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the streetnumber
	 */
	public void setStreetnumber(final String value)
	{
		_streetnumber = getPersistenceContext().setValue(STREETNUMBER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.title</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the title
	 */
	public void setTitle(final TitleModel value)
	{
		_title = getPersistenceContext().setValue(TITLE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.town</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the town
	 */
	public void setTown(final String value)
	{
		_town = getPersistenceContext().setValue(TOWN, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.unloadingAddress</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the unloadingAddress - unloadingAddress
	 */
	public void setUnloadingAddress(final Boolean value)
	{
		_unloadingAddress = getPersistenceContext().setValue(UNLOADINGADDRESS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.url</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the url
	 */
	public void setUrl(final String value)
	{
		_url = getPersistenceContext().setValue(URL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Address.visibleInAddressBook</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the visibleInAddressBook - Indicates if the address will be displayed to the user in the address book.
	 */
	public void setVisibleInAddressBook(final Boolean value)
	{
		_visibleInAddressBook = getPersistenceContext().setValue(VISIBLEINADDRESSBOOK, value);
	}
	
}
