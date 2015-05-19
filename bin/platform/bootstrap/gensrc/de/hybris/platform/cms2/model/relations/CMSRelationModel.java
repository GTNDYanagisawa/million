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
package de.hybris.platform.cms2.model.relations;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type CMSRelation first defined at extension cms2.
 */
@SuppressWarnings("all")
public class CMSRelationModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CMSRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSRelation.uid</code> attribute defined at extension <code>cms2</code>. */
	public static final String UID = "uid";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSRelation.catalogVersion</code> attribute defined at extension <code>cms2</code>. */
	public static final String CATALOGVERSION = "catalogVersion";
	
	
	/** <i>Generated variable</i> - Variable of <code>CMSRelation.uid</code> attribute defined at extension <code>cms2</code>. */
	private String _uid;
	
	/** <i>Generated variable</i> - Variable of <code>CMSRelation.catalogVersion</code> attribute defined at extension <code>cms2</code>. */
	private CatalogVersionModel _catalogVersion;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CMSRelationModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CMSRelationModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSRelation</code> at extension <code>cms2</code>
	 * @param _uid initial attribute declared by type <code>CMSRelation</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public CMSRelationModel(final CatalogVersionModel _catalogVersion, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSRelation</code> at extension <code>cms2</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>CMSRelation</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public CMSRelationModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSRelation.catalogVersion</code> attribute defined at extension <code>cms2</code>. 
	 * @return the catalogVersion
	 */
	public CatalogVersionModel getCatalogVersion()
	{
		if (this._catalogVersion!=null)
		{
			return _catalogVersion;
		}
		return _catalogVersion = getPersistenceContext().getValue(CATALOGVERSION, _catalogVersion);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSRelation.uid</code> attribute defined at extension <code>cms2</code>. 
	 * @return the uid
	 */
	public String getUid()
	{
		if (this._uid!=null)
		{
			return _uid;
		}
		return _uid = getPersistenceContext().getValue(UID, _uid);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSRelation.catalogVersion</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the catalogVersion
	 */
	public void setCatalogVersion(final CatalogVersionModel value)
	{
		_catalogVersion = getPersistenceContext().setValue(CATALOGVERSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSRelation.uid</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the uid
	 */
	public void setUid(final String value)
	{
		_uid = getPersistenceContext().setValue(UID, value);
	}
	
}
