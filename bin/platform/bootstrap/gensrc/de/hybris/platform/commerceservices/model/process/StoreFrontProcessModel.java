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

import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.processengine.model.BusinessProcessModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.store.BaseStoreModel;

/**
 * Generated model class for type StoreFrontProcess first defined at extension commerceservices.
 * <p>
 * It represents storefront business process.
 */
@SuppressWarnings("all")
public class StoreFrontProcessModel extends BusinessProcessModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "StoreFrontProcess";
	
	/** <i>Generated constant</i> - Attribute key of <code>StoreFrontProcess.site</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String SITE = "site";
	
	/** <i>Generated constant</i> - Attribute key of <code>StoreFrontProcess.store</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String STORE = "store";
	
	
	/** <i>Generated variable</i> - Variable of <code>StoreFrontProcess.site</code> attribute defined at extension <code>commerceservices</code>. */
	private BaseSiteModel _site;
	
	/** <i>Generated variable</i> - Variable of <code>StoreFrontProcess.store</code> attribute defined at extension <code>commerceservices</code>. */
	private BaseStoreModel _store;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public StoreFrontProcessModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public StoreFrontProcessModel(final ItemModelContext ctx)
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
	public StoreFrontProcessModel(final String _code, final String _processDefinitionName)
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
	public StoreFrontProcessModel(final String _code, final ItemModel _owner, final String _processDefinitionName)
	{
		super();
		setCode(_code);
		setOwner(_owner);
		setProcessDefinitionName(_processDefinitionName);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StoreFrontProcess.site</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the site - Attribute contains base site object that will be used in the process.
	 */
	public BaseSiteModel getSite()
	{
		if (this._site!=null)
		{
			return _site;
		}
		return _site = getPersistenceContext().getValue(SITE, _site);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StoreFrontProcess.store</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the store - Attribute contains base store object that will be used in the process.
	 */
	public BaseStoreModel getStore()
	{
		if (this._store!=null)
		{
			return _store;
		}
		return _store = getPersistenceContext().getValue(STORE, _store);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>StoreFrontProcess.site</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the site - Attribute contains base site object that will be used in the process.
	 */
	public void setSite(final BaseSiteModel value)
	{
		_site = getPersistenceContext().setValue(SITE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>StoreFrontProcess.store</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the store - Attribute contains base store object that will be used in the process.
	 */
	public void setStore(final BaseStoreModel value)
	{
		_store = getPersistenceContext().setValue(STORE, value);
	}
	
}
