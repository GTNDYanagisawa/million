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
package de.hybris.platform.mobileservices.model.text;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.mobileservices.enums.PhoneNumberFormat;
import de.hybris.platform.mobileservices.model.text.PhoneNumberListModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type PhoneNumber first defined at extension mobileservices.
 */
@SuppressWarnings("all")
public class PhoneNumberModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PhoneNumber";
	
	/**<i>Generated relation code constant for relation <code>ListNumberRelation</code> defining source attribute <code>lists</code> in extension <code>mobileservices</code>.</i>*/
	public final static String _LISTNUMBERRELATION = "ListNumberRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>PhoneNumber.format</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String FORMAT = "format";
	
	/** <i>Generated constant</i> - Attribute key of <code>PhoneNumber.number</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String NUMBER = "number";
	
	/** <i>Generated constant</i> - Attribute key of <code>PhoneNumber.country</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String COUNTRY = "country";
	
	/** <i>Generated constant</i> - Attribute key of <code>PhoneNumber.normalizedNumber</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String NORMALIZEDNUMBER = "normalizedNumber";
	
	/** <i>Generated constant</i> - Attribute key of <code>PhoneNumber.lists</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String LISTS = "lists";
	
	
	/** <i>Generated variable</i> - Variable of <code>PhoneNumber.format</code> attribute defined at extension <code>mobileservices</code>. */
	private PhoneNumberFormat _format;
	
	/** <i>Generated variable</i> - Variable of <code>PhoneNumber.number</code> attribute defined at extension <code>mobileservices</code>. */
	private String _number;
	
	/** <i>Generated variable</i> - Variable of <code>PhoneNumber.country</code> attribute defined at extension <code>mobileservices</code>. */
	private CountryModel _country;
	
	/** <i>Generated variable</i> - Variable of <code>PhoneNumber.normalizedNumber</code> attribute defined at extension <code>mobileservices</code>. */
	private String _normalizedNumber;
	
	/** <i>Generated variable</i> - Variable of <code>PhoneNumber.lists</code> attribute defined at extension <code>mobileservices</code>. */
	private Collection<PhoneNumberListModel> _lists;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PhoneNumberModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PhoneNumberModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _number initial attribute declared by type <code>PhoneNumber</code> at extension <code>mobileservices</code>
	 */
	@Deprecated
	public PhoneNumberModel(final String _number)
	{
		super();
		setNumber(_number);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _number initial attribute declared by type <code>PhoneNumber</code> at extension <code>mobileservices</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public PhoneNumberModel(final String _number, final ItemModel _owner)
	{
		super();
		setNumber(_number);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PhoneNumber.country</code> attribute defined at extension <code>mobileservices</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>PhoneNumber.format</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the format
	 */
	public PhoneNumberFormat getFormat()
	{
		if (this._format!=null)
		{
			return _format;
		}
		return _format = getPersistenceContext().getValue(FORMAT, _format);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PhoneNumber.lists</code> attribute defined at extension <code>mobileservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the lists
	 */
	public Collection<PhoneNumberListModel> getLists()
	{
		if (this._lists!=null)
		{
			return _lists;
		}
		return _lists = getPersistenceContext().getValue(LISTS, _lists);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PhoneNumber.normalizedNumber</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the normalizedNumber
	 */
	public String getNormalizedNumber()
	{
		if (this._normalizedNumber!=null)
		{
			return _normalizedNumber;
		}
		return _normalizedNumber = getPersistenceContext().getValue(NORMALIZEDNUMBER, _normalizedNumber);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PhoneNumber.number</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the number
	 */
	public String getNumber()
	{
		if (this._number!=null)
		{
			return _number;
		}
		return _number = getPersistenceContext().getValue(NUMBER, _number);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PhoneNumber.country</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the country
	 */
	public void setCountry(final CountryModel value)
	{
		_country = getPersistenceContext().setValue(COUNTRY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PhoneNumber.format</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the format
	 */
	public void setFormat(final PhoneNumberFormat value)
	{
		_format = getPersistenceContext().setValue(FORMAT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PhoneNumber.lists</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the lists
	 */
	public void setLists(final Collection<PhoneNumberListModel> value)
	{
		_lists = getPersistenceContext().setValue(LISTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PhoneNumber.number</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the number
	 */
	public void setNumber(final String value)
	{
		_number = getPersistenceContext().setValue(NUMBER, value);
	}
	
}
