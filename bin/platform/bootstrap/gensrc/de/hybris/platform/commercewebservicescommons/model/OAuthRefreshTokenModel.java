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
package de.hybris.platform.commercewebservicescommons.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type OAuthRefreshToken first defined at extension commercewebservicescommons.
 */
@SuppressWarnings("all")
public class OAuthRefreshTokenModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "OAuthRefreshToken";
	
	/** <i>Generated constant</i> - Attribute key of <code>OAuthRefreshToken.tokenId</code> attribute defined at extension <code>commercewebservicescommons</code>. */
	public static final String TOKENID = "tokenId";
	
	/** <i>Generated constant</i> - Attribute key of <code>OAuthRefreshToken.token</code> attribute defined at extension <code>commercewebservicescommons</code>. */
	public static final String TOKEN = "token";
	
	/** <i>Generated constant</i> - Attribute key of <code>OAuthRefreshToken.authentication</code> attribute defined at extension <code>commercewebservicescommons</code>. */
	public static final String AUTHENTICATION = "authentication";
	
	
	/** <i>Generated variable</i> - Variable of <code>OAuthRefreshToken.tokenId</code> attribute defined at extension <code>commercewebservicescommons</code>. */
	private String _tokenId;
	
	/** <i>Generated variable</i> - Variable of <code>OAuthRefreshToken.token</code> attribute defined at extension <code>commercewebservicescommons</code>. */
	private Object _token;
	
	/** <i>Generated variable</i> - Variable of <code>OAuthRefreshToken.authentication</code> attribute defined at extension <code>commercewebservicescommons</code>. */
	private Object _authentication;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public OAuthRefreshTokenModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public OAuthRefreshTokenModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _tokenId initial attribute declared by type <code>OAuthRefreshToken</code> at extension <code>commercewebservicescommons</code>
	 */
	@Deprecated
	public OAuthRefreshTokenModel(final String _tokenId)
	{
		super();
		setTokenId(_tokenId);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _tokenId initial attribute declared by type <code>OAuthRefreshToken</code> at extension <code>commercewebservicescommons</code>
	 */
	@Deprecated
	public OAuthRefreshTokenModel(final ItemModel _owner, final String _tokenId)
	{
		super();
		setOwner(_owner);
		setTokenId(_tokenId);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OAuthRefreshToken.authentication</code> attribute defined at extension <code>commercewebservicescommons</code>. 
	 * @return the authentication - Serialized authentication object
	 */
	public Object getAuthentication()
	{
		if (this._authentication!=null)
		{
			return _authentication;
		}
		return _authentication = getPersistenceContext().getValue(AUTHENTICATION, _authentication);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OAuthRefreshToken.token</code> attribute defined at extension <code>commercewebservicescommons</code>. 
	 * @return the token - Serialized token object
	 */
	public Object getToken()
	{
		if (this._token!=null)
		{
			return _token;
		}
		return _token = getPersistenceContext().getValue(TOKEN, _token);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OAuthRefreshToken.tokenId</code> attribute defined at extension <code>commercewebservicescommons</code>. 
	 * @return the tokenId - Token key
	 */
	public String getTokenId()
	{
		if (this._tokenId!=null)
		{
			return _tokenId;
		}
		return _tokenId = getPersistenceContext().getValue(TOKENID, _tokenId);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OAuthRefreshToken.authentication</code> attribute defined at extension <code>commercewebservicescommons</code>. 
	 *  
	 * @param value the authentication - Serialized authentication object
	 */
	public void setAuthentication(final Object value)
	{
		_authentication = getPersistenceContext().setValue(AUTHENTICATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OAuthRefreshToken.token</code> attribute defined at extension <code>commercewebservicescommons</code>. 
	 *  
	 * @param value the token - Serialized token object
	 */
	public void setToken(final Object value)
	{
		_token = getPersistenceContext().setValue(TOKEN, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OAuthRefreshToken.tokenId</code> attribute defined at extension <code>commercewebservicescommons</code>. 
	 *  
	 * @param value the tokenId - Token key
	 */
	public void setTokenId(final String value)
	{
		_tokenId = getPersistenceContext().setValue(TOKENID, value);
	}
	
}
