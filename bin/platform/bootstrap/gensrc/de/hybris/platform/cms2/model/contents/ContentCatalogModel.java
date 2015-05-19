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
package de.hybris.platform.cms2.model.contents;

import de.hybris.platform.catalog.model.CatalogModel;
import de.hybris.platform.cms2.model.site.CMSSiteModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type ContentCatalog first defined at extension cms2.
 */
@SuppressWarnings("all")
public class ContentCatalogModel extends CatalogModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ContentCatalog";
	
	/**<i>Generated relation code constant for relation <code>CatalogsForCMSSite</code> defining source attribute <code>cmsSites</code> in extension <code>cms2</code>.</i>*/
	public final static String _CATALOGSFORCMSSITE = "CatalogsForCMSSite";
	
	/** <i>Generated constant</i> - Attribute key of <code>ContentCatalog.cmsSites</code> attribute defined at extension <code>cms2</code>. */
	public static final String CMSSITES = "cmsSites";
	
	
	/** <i>Generated variable</i> - Variable of <code>ContentCatalog.cmsSites</code> attribute defined at extension <code>cms2</code>. */
	private Collection<CMSSiteModel> _cmsSites;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ContentCatalogModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ContentCatalogModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _id initial attribute declared by type <code>Catalog</code> at extension <code>catalog</code>
	 */
	@Deprecated
	public ContentCatalogModel(final String _id)
	{
		super();
		setId(_id);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _id initial attribute declared by type <code>Catalog</code> at extension <code>catalog</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public ContentCatalogModel(final String _id, final ItemModel _owner)
	{
		super();
		setId(_id);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentCatalog.cmsSites</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the cmsSites
	 */
	public Collection<CMSSiteModel> getCmsSites()
	{
		if (this._cmsSites!=null)
		{
			return _cmsSites;
		}
		return _cmsSites = getPersistenceContext().getValue(CMSSITES, _cmsSites);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ContentCatalog.cmsSites</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the cmsSites
	 */
	public void setCmsSites(final Collection<CMSSiteModel> value)
	{
		_cmsSites = getPersistenceContext().setValue(CMSSITES, value);
	}
	
}
