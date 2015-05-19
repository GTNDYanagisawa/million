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
package de.hybris.platform.commerceservices.model.process;

import de.hybris.platform.commerceservices.model.process.StoreFrontCustomerProcessModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type ForgottenPasswordProcess first defined at extension commerceservices.
 * <p>
 * Represents process that is used for retrieving forgotten password.
 */
@SuppressWarnings("all")
public class ForgottenPasswordProcessModel extends StoreFrontCustomerProcessModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ForgottenPasswordProcess";
	
	/** <i>Generated constant</i> - Attribute key of <code>ForgottenPasswordProcess.token</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String TOKEN = "token";
	
	
	/** <i>Generated variable</i> - Variable of <code>ForgottenPasswordProcess.token</code> attribute defined at extension <code>commerceservices</code>. */
	private String _token;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ForgottenPasswordProcessModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ForgottenPasswordProcessModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 * @param _processDefinitionName initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 */
	@Deprecated
	public ForgottenPasswordProcessModel(final String _code, final String _processDefinitionName)
	{
		super();
		setCode(_code);
		setProcessDefinitionName(_processDefinitionName);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _processDefinitionName initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 */
	@Deprecated
	public ForgottenPasswordProcessModel(final String _code, final ItemModel _owner, final String _processDefinitionName)
	{
		super();
		setCode(_code);
		setOwner(_owner);
		setProcessDefinitionName(_processDefinitionName);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ForgottenPasswordProcess.token</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the token - Attribute contains token that is used in this process.
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
	 * <i>Generated method</i> - Setter of <code>ForgottenPasswordProcess.token</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the token - Attribute contains token that is used in this process.
	 */
	public void setToken(final String value)
	{
		_token = getPersistenceContext().setValue(TOKEN, value);
	}
	
}
