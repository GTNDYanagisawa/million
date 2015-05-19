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

import de.hybris.platform.catalog.model.CatalogModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.deeplink.model.rules.DeeplinkUrlModel;
import de.hybris.platform.mobileservices.model.text.MobileReceiveAndSendItemActionModel;
import de.hybris.platform.servicelayer.enums.ActionType;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type MobileReceiveAndSendCatalogAction first defined at extension mobileservices.
 */
@SuppressWarnings("all")
public class MobileReceiveAndSendCatalogActionModel extends MobileReceiveAndSendItemActionModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "MobileReceiveAndSendCatalogAction";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public MobileReceiveAndSendCatalogActionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public MobileReceiveAndSendCatalogActionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>MobileReceiveGenericAction</code> at extension <code>mobileservices</code>
	 * @param _content initial attribute declared by type <code>MobileReceiveAndSendCatalogAction</code> at extension <code>mobileservices</code>
	 * @param _deeplinkUrl initial attribute declared by type <code>MobileReceiveAndSendItemAction</code> at extension <code>mobileservices</code>
	 * @param _target initial attribute declared by type <code>MobileReceiveAndSendItemAction</code> at extension <code>mobileservices</code>
	 * @param _type initial attribute declared by type <code>MobileReceiveGenericAction</code> at extension <code>mobileservices</code>
	 */
	@Deprecated
	public MobileReceiveAndSendCatalogActionModel(final String _code, final CatalogModel _content, final DeeplinkUrlModel _deeplinkUrl, final String _target, final ActionType _type)
	{
		super();
		setCode(_code);
		setContent(_content);
		setDeeplinkUrl(_deeplinkUrl);
		setTarget(_target);
		setType(_type);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>MobileReceiveGenericAction</code> at extension <code>mobileservices</code>
	 * @param _content initial attribute declared by type <code>MobileReceiveAndSendCatalogAction</code> at extension <code>mobileservices</code>
	 * @param _deeplinkUrl initial attribute declared by type <code>MobileReceiveAndSendItemAction</code> at extension <code>mobileservices</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _target initial attribute declared by type <code>MobileReceiveAndSendItemAction</code> at extension <code>mobileservices</code>
	 * @param _type initial attribute declared by type <code>MobileReceiveGenericAction</code> at extension <code>mobileservices</code>
	 */
	@Deprecated
	public MobileReceiveAndSendCatalogActionModel(final String _code, final CatalogModel _content, final DeeplinkUrlModel _deeplinkUrl, final ItemModel _owner, final String _target, final ActionType _type)
	{
		super();
		setCode(_code);
		setContent(_content);
		setDeeplinkUrl(_deeplinkUrl);
		setOwner(_owner);
		setTarget(_target);
		setType(_type);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileReceiveAndSendItemAction.content</code> attribute defined at extension <code>mobileservices</code> and redeclared at extension <code>mobileservices</code>. 
	 * @return the content
	 */
	@Override
	public CatalogModel getContent()
	{
		return (CatalogModel) super.getContent();
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileReceiveAndSendItemAction.content</code> attribute defined at extension <code>mobileservices</code> and redeclared at extension <code>mobileservices</code>. Will only accept values of type {@link de.hybris.platform.catalog.model.CatalogModel}. 
	 *  
	 * @param value the content
	 */
	@Override
	public void setContent(final ItemModel value)
	{
		if( value == null || value instanceof CatalogModel)
		{
			super.setContent(value);
		}
		else
		{
			throw new IllegalArgumentException("Given value is not instance of de.hybris.platform.catalog.model.CatalogModel");
		}
	}
	
}
