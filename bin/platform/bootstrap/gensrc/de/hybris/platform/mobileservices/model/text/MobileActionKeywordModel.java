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
import de.hybris.platform.mobileservices.enums.MobileKeywordType;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type MobileActionKeyword first defined at extension mobileservices.
 */
@SuppressWarnings("all")
public class MobileActionKeywordModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "MobileActionKeyword";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileActionKeyword.type</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String TYPE = "type";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileActionKeyword.keyword</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String KEYWORD = "keyword";
	
	
	/** <i>Generated variable</i> - Variable of <code>MobileActionKeyword.type</code> attribute defined at extension <code>mobileservices</code>. */
	private MobileKeywordType _type;
	
	/** <i>Generated variable</i> - Variable of <code>MobileActionKeyword.keyword</code> attribute defined at extension <code>mobileservices</code>. */
	private String _keyword;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public MobileActionKeywordModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public MobileActionKeywordModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _keyword initial attribute declared by type <code>MobileActionKeyword</code> at extension <code>mobileservices</code>
	 */
	@Deprecated
	public MobileActionKeywordModel(final String _keyword)
	{
		super();
		setKeyword(_keyword);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _keyword initial attribute declared by type <code>MobileActionKeyword</code> at extension <code>mobileservices</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public MobileActionKeywordModel(final String _keyword, final ItemModel _owner)
	{
		super();
		setKeyword(_keyword);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileActionKeyword.keyword</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the keyword
	 */
	public String getKeyword()
	{
		if (this._keyword!=null)
		{
			return _keyword;
		}
		return _keyword = getPersistenceContext().getValue(KEYWORD, _keyword);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileActionKeyword.type</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the type
	 */
	public MobileKeywordType getType()
	{
		if (this._type!=null)
		{
			return _type;
		}
		return _type = getPersistenceContext().getValue(TYPE, _type);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileActionKeyword.keyword</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the keyword
	 */
	public void setKeyword(final String value)
	{
		_keyword = getPersistenceContext().setValue(KEYWORD, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileActionKeyword.type</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the type
	 */
	public void setType(final MobileKeywordType value)
	{
		_type = getPersistenceContext().setValue(TYPE, value);
	}
	
}
