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
package de.hybris.platform.commercewebservicescommons.jalo;

import de.hybris.platform.commercewebservicescommons.constants.CommercewebservicescommonsConstants;
import de.hybris.platform.commercewebservicescommons.jalo.OAuthRefreshToken;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.commercewebservicescommons.jalo.OAuthAccessToken OAuthAccessToken}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOAuthAccessToken extends GenericItem
{
	/** Qualifier of the <code>OAuthAccessToken.tokenId</code> attribute **/
	public static final String TOKENID = "tokenId";
	/** Qualifier of the <code>OAuthAccessToken.token</code> attribute **/
	public static final String TOKEN = "token";
	/** Qualifier of the <code>OAuthAccessToken.authenticationId</code> attribute **/
	public static final String AUTHENTICATIONID = "authenticationId";
	/** Qualifier of the <code>OAuthAccessToken.userName</code> attribute **/
	public static final String USERNAME = "userName";
	/** Qualifier of the <code>OAuthAccessToken.clientId</code> attribute **/
	public static final String CLIENTID = "clientId";
	/** Qualifier of the <code>OAuthAccessToken.authentication</code> attribute **/
	public static final String AUTHENTICATION = "authentication";
	/** Qualifier of the <code>OAuthAccessToken.refreshToken</code> attribute **/
	public static final String REFRESHTOKEN = "refreshToken";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TOKENID, AttributeMode.INITIAL);
		tmp.put(TOKEN, AttributeMode.INITIAL);
		tmp.put(AUTHENTICATIONID, AttributeMode.INITIAL);
		tmp.put(USERNAME, AttributeMode.INITIAL);
		tmp.put(CLIENTID, AttributeMode.INITIAL);
		tmp.put(AUTHENTICATION, AttributeMode.INITIAL);
		tmp.put(REFRESHTOKEN, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OAuthAccessToken.authentication</code> attribute.
	 * @return the authentication - Serialized authentication object
	 */
	public Object getAuthentication(final SessionContext ctx)
	{
		return getProperty( ctx, AUTHENTICATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OAuthAccessToken.authentication</code> attribute.
	 * @return the authentication - Serialized authentication object
	 */
	public Object getAuthentication()
	{
		return getAuthentication( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OAuthAccessToken.authentication</code> attribute. 
	 * @param value the authentication - Serialized authentication object
	 */
	public void setAuthentication(final SessionContext ctx, final Object value)
	{
		setProperty(ctx, AUTHENTICATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OAuthAccessToken.authentication</code> attribute. 
	 * @param value the authentication - Serialized authentication object
	 */
	public void setAuthentication(final Object value)
	{
		setAuthentication( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OAuthAccessToken.authenticationId</code> attribute.
	 * @return the authenticationId - Authentication identifier
	 */
	public String getAuthenticationId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, AUTHENTICATIONID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OAuthAccessToken.authenticationId</code> attribute.
	 * @return the authenticationId - Authentication identifier
	 */
	public String getAuthenticationId()
	{
		return getAuthenticationId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OAuthAccessToken.authenticationId</code> attribute. 
	 * @param value the authenticationId - Authentication identifier
	 */
	public void setAuthenticationId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, AUTHENTICATIONID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OAuthAccessToken.authenticationId</code> attribute. 
	 * @param value the authenticationId - Authentication identifier
	 */
	public void setAuthenticationId(final String value)
	{
		setAuthenticationId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OAuthAccessToken.clientId</code> attribute.
	 * @return the clientId - Client identifier
	 */
	public String getClientId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CLIENTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OAuthAccessToken.clientId</code> attribute.
	 * @return the clientId - Client identifier
	 */
	public String getClientId()
	{
		return getClientId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OAuthAccessToken.clientId</code> attribute. 
	 * @param value the clientId - Client identifier
	 */
	public void setClientId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CLIENTID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OAuthAccessToken.clientId</code> attribute. 
	 * @param value the clientId - Client identifier
	 */
	public void setClientId(final String value)
	{
		setClientId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OAuthAccessToken.refreshToken</code> attribute.
	 * @return the refreshToken
	 */
	public OAuthRefreshToken getRefreshToken(final SessionContext ctx)
	{
		return (OAuthRefreshToken)getProperty( ctx, REFRESHTOKEN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OAuthAccessToken.refreshToken</code> attribute.
	 * @return the refreshToken
	 */
	public OAuthRefreshToken getRefreshToken()
	{
		return getRefreshToken( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OAuthAccessToken.refreshToken</code> attribute. 
	 * @param value the refreshToken
	 */
	public void setRefreshToken(final SessionContext ctx, final OAuthRefreshToken value)
	{
		setProperty(ctx, REFRESHTOKEN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OAuthAccessToken.refreshToken</code> attribute. 
	 * @param value the refreshToken
	 */
	public void setRefreshToken(final OAuthRefreshToken value)
	{
		setRefreshToken( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OAuthAccessToken.token</code> attribute.
	 * @return the token - serialized token object
	 */
	public Object getToken(final SessionContext ctx)
	{
		return getProperty( ctx, TOKEN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OAuthAccessToken.token</code> attribute.
	 * @return the token - serialized token object
	 */
	public Object getToken()
	{
		return getToken( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OAuthAccessToken.token</code> attribute. 
	 * @param value the token - serialized token object
	 */
	public void setToken(final SessionContext ctx, final Object value)
	{
		setProperty(ctx, TOKEN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OAuthAccessToken.token</code> attribute. 
	 * @param value the token - serialized token object
	 */
	public void setToken(final Object value)
	{
		setToken( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OAuthAccessToken.tokenId</code> attribute.
	 * @return the tokenId - Token key
	 */
	public String getTokenId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TOKENID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OAuthAccessToken.tokenId</code> attribute.
	 * @return the tokenId - Token key
	 */
	public String getTokenId()
	{
		return getTokenId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OAuthAccessToken.tokenId</code> attribute. 
	 * @param value the tokenId - Token key
	 */
	public void setTokenId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TOKENID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OAuthAccessToken.tokenId</code> attribute. 
	 * @param value the tokenId - Token key
	 */
	public void setTokenId(final String value)
	{
		setTokenId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OAuthAccessToken.userName</code> attribute.
	 * @return the userName - Authenticated user name
	 */
	public String getUserName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, USERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OAuthAccessToken.userName</code> attribute.
	 * @return the userName - Authenticated user name
	 */
	public String getUserName()
	{
		return getUserName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OAuthAccessToken.userName</code> attribute. 
	 * @param value the userName - Authenticated user name
	 */
	public void setUserName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, USERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OAuthAccessToken.userName</code> attribute. 
	 * @param value the userName - Authenticated user name
	 */
	public void setUserName(final String value)
	{
		setUserName( getSession().getSessionContext(), value );
	}
	
}
