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
package de.hybris.platform.print.model;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.print.model.ContentBlockModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type TOCBlock first defined at extension print.
 */
@SuppressWarnings("all")
public class TOCBlockModel extends ContentBlockModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "TOCBlock";
	
	/** <i>Generated constant</i> - Attribute key of <code>TOCBlock.tocStyle</code> attribute defined at extension <code>print</code>. */
	public static final String TOCSTYLE = "tocStyle";
	
	
	/** <i>Generated variable</i> - Variable of <code>TOCBlock.tocStyle</code> attribute defined at extension <code>print</code>. */
	private String _tocStyle;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public TOCBlockModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public TOCBlockModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>ContentBlock</code> at extension <code>print</code>
	 * @param _code initial attribute declared by type <code>ContentBlock</code> at extension <code>print</code>
	 */
	@Deprecated
	public TOCBlockModel(final CatalogVersionModel _catalogVersion, final String _code)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>ContentBlock</code> at extension <code>print</code>
	 * @param _code initial attribute declared by type <code>ContentBlock</code> at extension <code>print</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public TOCBlockModel(final CatalogVersionModel _catalogVersion, final String _code, final ItemModel _owner)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TOCBlock.tocStyle</code> attribute defined at extension <code>print</code>. 
	 * @return the tocStyle
	 */
	public String getTocStyle()
	{
		if (this._tocStyle!=null)
		{
			return _tocStyle;
		}
		return _tocStyle = getPersistenceContext().getValue(TOCSTYLE, _tocStyle);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TOCBlock.tocStyle</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the tocStyle
	 */
	public void setTocStyle(final String value)
	{
		_tocStyle = getPersistenceContext().setValue(TOCSTYLE, value);
	}
	
}
