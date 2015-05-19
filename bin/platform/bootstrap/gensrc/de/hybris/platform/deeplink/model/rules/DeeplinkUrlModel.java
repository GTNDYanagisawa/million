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
package de.hybris.platform.deeplink.model.rules;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.deeplink.model.media.BarcodeMediaModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type DeeplinkUrl first defined at extension basecommerce.
 */
@SuppressWarnings("all")
public class DeeplinkUrlModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "DeeplinkUrl";
	
	/**<i>Generated relation code constant for relation <code>BarcodeMedia2DeeplinkUrl</code> defining source attribute <code>barcodeMedias</code> in extension <code>basecommerce</code>.</i>*/
	public final static String _BARCODEMEDIA2DEEPLINKURL = "BarcodeMedia2DeeplinkUrl";
	
	/** <i>Generated constant</i> - Attribute key of <code>DeeplinkUrl.code</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>DeeplinkUrl.name</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>DeeplinkUrl.baseUrl</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String BASEURL = "baseUrl";
	
	/** <i>Generated constant</i> - Attribute key of <code>DeeplinkUrl.barcodeMedias</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String BARCODEMEDIAS = "barcodeMedias";
	
	
	/** <i>Generated variable</i> - Variable of <code>DeeplinkUrl.code</code> attribute defined at extension <code>basecommerce</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>DeeplinkUrl.name</code> attribute defined at extension <code>basecommerce</code>. */
	private String _name;
	
	/** <i>Generated variable</i> - Variable of <code>DeeplinkUrl.baseUrl</code> attribute defined at extension <code>basecommerce</code>. */
	private String _baseUrl;
	
	/** <i>Generated variable</i> - Variable of <code>DeeplinkUrl.barcodeMedias</code> attribute defined at extension <code>basecommerce</code>. */
	private Collection<BarcodeMediaModel> _barcodeMedias;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public DeeplinkUrlModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public DeeplinkUrlModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _baseUrl initial attribute declared by type <code>DeeplinkUrl</code> at extension <code>basecommerce</code>
	 * @param _code initial attribute declared by type <code>DeeplinkUrl</code> at extension <code>basecommerce</code>
	 * @param _name initial attribute declared by type <code>DeeplinkUrl</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public DeeplinkUrlModel(final String _baseUrl, final String _code, final String _name)
	{
		super();
		setBaseUrl(_baseUrl);
		setCode(_code);
		setName(_name);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _baseUrl initial attribute declared by type <code>DeeplinkUrl</code> at extension <code>basecommerce</code>
	 * @param _code initial attribute declared by type <code>DeeplinkUrl</code> at extension <code>basecommerce</code>
	 * @param _name initial attribute declared by type <code>DeeplinkUrl</code> at extension <code>basecommerce</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public DeeplinkUrlModel(final String _baseUrl, final String _code, final String _name, final ItemModel _owner)
	{
		super();
		setBaseUrl(_baseUrl);
		setCode(_code);
		setName(_name);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeeplinkUrl.barcodeMedias</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the barcodeMedias
	 */
	public Collection<BarcodeMediaModel> getBarcodeMedias()
	{
		if (this._barcodeMedias!=null)
		{
			return _barcodeMedias;
		}
		return _barcodeMedias = getPersistenceContext().getValue(BARCODEMEDIAS, _barcodeMedias);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeeplinkUrl.baseUrl</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the baseUrl
	 */
	public String getBaseUrl()
	{
		if (this._baseUrl!=null)
		{
			return _baseUrl;
		}
		return _baseUrl = getPersistenceContext().getValue(BASEURL, _baseUrl);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeeplinkUrl.code</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the code
	 */
	public String getCode()
	{
		if (this._code!=null)
		{
			return _code;
		}
		return _code = getPersistenceContext().getValue(CODE, _code);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeeplinkUrl.name</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the name
	 */
	public String getName()
	{
		if (this._name!=null)
		{
			return _name;
		}
		return _name = getPersistenceContext().getValue(NAME, _name);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>DeeplinkUrl.barcodeMedias</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the barcodeMedias
	 */
	public void setBarcodeMedias(final Collection<BarcodeMediaModel> value)
	{
		_barcodeMedias = getPersistenceContext().setValue(BARCODEMEDIAS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>DeeplinkUrl.baseUrl</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the baseUrl
	 */
	public void setBaseUrl(final String value)
	{
		_baseUrl = getPersistenceContext().setValue(BASEURL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>DeeplinkUrl.code</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>DeeplinkUrl.name</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the name
	 */
	public void setName(final String value)
	{
		_name = getPersistenceContext().setValue(NAME, value);
	}
	
}
