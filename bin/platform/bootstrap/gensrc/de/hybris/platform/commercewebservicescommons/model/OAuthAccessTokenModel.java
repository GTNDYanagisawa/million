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

import de.hybris.platform.commercewebservicescommons.model.OAuthRefreshTokenModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type OAuthAccessToken first defined at extension commercewebservicescommons.
 */
@SuppressWarnings("all")
public class OAuthAccessTokenModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "OAuthAccessToken";
	
	/** <i>Generated constant</i> - Attribute key of <code>OAuthAccessToken.tokenId</code> attribute defined at extension <code>commercewebservicescommons</code>. */
	public static final String TOKENID = "tokenId";
	
	/** <i>Generated constant</i> - Attribute key of <code>OAuthAccessToken.token</code> attribute defined at extension <code>commercewebservicescommons</code>. */
	public static final String TOKEN = "token";
	
	/** <i>Generated constant</i> - Attribute key of <code>OAuthAccessToken.authenticationId</code> attribute defined at extension <code>commercewebservicescommons</code>. */
	public static final String AUTHENTICATIONID = "authenticationId";
	
	/** <i>Generated constant</i> - Attribute key of <code>OAuthAccessToken.userName</code> attribute defined at extension <code>commercewebservicescommons</code>. */
	public static final String USERNAME = "userName";
	
	/** <i>Generated constant</i> - Attribute key of <code>OAuthAccessToken.clientId</code> attribute defined at extension <code>commercewebservicescommons</code>. */
	public static final String CLIENTID = "clientId";
	
	/** <i>Generated constant</i> - Attribute key of <code>OAuthAccessToken.authentication</code> attribute defined at extension <code>commercewebservicescommons</code>. */
	public static final String AUTHENTICATION = "authentication";
	
	/** <i>Generated constant</i> - Attribute key of <code>OAuthAccessToken.refreshToken</code> attribute defined at extension <code>commercewebservicescommons</code>. */
	public static final String REFRESHTOKEN = "refreshToken";
	
	
	/** <i>Generated variable</i> - Variable of <code>OAuthAccessToken.tokenId</code> attribute defined at extension <code>commercewebservicescommons</code>. */
	private String _tokenId;
	
	/** <i>Generated variable</i> - Variable of <code>OAuthAccessToken.token</code> attribute defined at extension <code>commercewebservicescommons</code>. */
	private Object _token;
	
	/** <i>Generated variable</i> - Variable of <code>OAuthAccessToken.authenticationId</code> attribute defined at extension <code>commercewebservicescommons</code>. */
	private String _authenticationId;
	
	/** <i>Generated variable</i> - Variable of <code>OAuthAccessToken.userName</code> attribute defined at extension <code>commercewebservicescommons</code>. */
	private String _userName;
	
	/** <i>Generated variable</i> - Variable of <code>OAuthAccessToken.clientId</code> attribute defined at extension <code>commercewebservicescommons</code>. */
	private String _clientId;
	
	/** <i>Generated variable</i> - Variable of <code>OAuthAccessToken.authentication</code> attribute defined at extension <code>commercewebservicescommons</code>. */
	private Object _authentication;
	
	/** <i>Generated variable</i> - Variable of <code>OAuthAccessToken.refreshToken</code> attribute defined at extension <code>commercewebservicescommons</code>. */
	private OAuthRefreshTokenModel _refreshToken;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public OAuthAccessTokenModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public OAuthAccessTokenModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _tokenId initial attribute declared by type <code>OAuthAccessToken</code> at extension <code>commercewebservicescommons</code>
	 */
	@Deprecated
	public OAuthAccessTokenModel(final String _tokenId)
	{
		super();
		setTokenId(_tokenId);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _tokenId initial attribute declared by type <code>OAuthAccessToken</code> at extension <code>commercewebservicescommons</code>
	 */
	@Deprecated
	public OAuthAccessTokenModel(final ItemModel _owner, final String _tokenId)
	{
		super();
		setOwner(_owner);
		setTokenId(_tokenId);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OAuthAccessToken.authentication</code> attribute defined at extension <code>commercewebservicescommons</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>OAuthAccessToken.authenticationId</code> attribute defined at extension <code>commercewebservicescommons</code>. 
	 * @return the authenticationId - Authentication identifier
	 */
	public String getAuthenticationId()
	{
		if (this._authenticationId!=null)
		{
			return _authenticationId;
		}
		return _authenticationId = getPersistenceContext().getValue(AUTHENTICATIONID, _authenticationId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OAuthAccessToken.clientId</code> attribute defined at extension <code>commercewebservicescommons</code>. 
	 * @return the clientId - Client identifier
	 */
	public String getClientId()
	{
		if (this._clientId!=null)
		{
			return _clientId;
		}
		return _clientId = getPersistenceContext().getValue(CLIENTID, _clientId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OAuthAccessToken.refreshToken</code> attribute defined at extension <code>commercewebservicescommons</code>. 
	 * @return the refreshToken
	 */
	public OAuthRefreshTokenModel getRefreshToken()
	{
		if (this._refreshToken!=null)
		{
			return _refreshToken;
		}
		return _refreshToken = getPersistenceContext().getValue(REFRESHTOKEN, _refreshToken);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OAuthAccessToken.token</code> attribute defined at extension <code>commercewebservicescommons</code>. 
	 * @return the token - serialized token object
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
	 * <i>Generated method</i> - Getter of the <code>OAuthAccessToken.tokenId</code> attribute defined at extension <code>commercewebservicescommons</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>OAuthAccessToken.userName</code> attribute defined at extension <code>commercewebservicescommons</code>. 
	 * @return the userName - Authenticated user name
	 */
	public String getUserName()
	{
		if (this._userName!=null)
		{
			return _userName;
		}
		return _userName = getPersistenceContext().getValue(USERNAME, _userName);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OAuthAccessToken.authentication</code> attribute defined at extension <code>commercewebservicescommons</code>. 
	 *  
	 * @param value the authentication - Serialized authentication object
	 */
	public void setAuthentication(final Object value)
	{
		_authentication = getPersistenceContext().setValue(AUTHENTICATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OAuthAccessToken.authenticationId</code> attribute defined at extension <code>commercewebservicescommons</code>. 
	 *  
	 * @param value the authenticationId - Authentication identifier
	 */
	public void setAuthenticationId(final String value)
	{
		_authenticationId = getPersistenceContext().setValue(AUTHENTICATIONID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OAuthAccessToken.clientId</code> attribute defined at extension <code>commercewebservicescommons</code>. 
	 *  
	 * @param value the clientId - Client identifier
	 */
	public void setClientId(final String value)
	{
		_clientId = getPersistenceContext().setValue(CLIENTID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OAuthAccessToken.refreshToken</code> attribute defined at extension <code>commercewebservicescommons</code>. 
	 *  
	 * @param value the refreshToken
	 */
	public void setRefreshToken(final OAuthRefreshTokenModel value)
	{
		_refreshToken = getPersistenceContext().setValue(REFRESHTOKEN, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OAuthAccessToken.token</code> attribute defined at extension <code>commercewebservicescommons</code>. 
	 *  
	 * @param value the token - serialized token object
	 */
	public void setToken(final Object value)
	{
		_token = getPersistenceContext().setValue(TOKEN, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OAuthAccessToken.tokenId</code> attribute defined at extension <code>commercewebservicescommons</code>. 
	 *  
	 * @param value the tokenId - Token key
	 */
	public void setTokenId(final String value)
	{
		_tokenId = getPersistenceContext().setValue(TOKENID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OAuthAccessToken.userName</code> attribute defined at extension <code>commercewebservicescommons</code>. 
	 *  
	 * @param value the userName - Authenticated user name
	 */
	public void setUserName(final String value)
	{
		_userName = getPersistenceContext().setValue(USERNAME, value);
	}
	
}
