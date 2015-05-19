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
package de.hybris.platform.print.model.table;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.print.model.table.CellEntryModel;
import de.hybris.platform.print.model.table.SortConfigModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.List;

/**
 * Generated model class for type AxisEntry first defined at extension print.
 */
@SuppressWarnings("all")
public class AxisEntryModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "AxisEntry";
	
	/** <i>Generated constant</i> - Attribute key of <code>AxisEntry.id</code> attribute defined at extension <code>print</code>. */
	public static final String ID = "id";
	
	/** <i>Generated constant</i> - Attribute key of <code>AxisEntry.catalogVersion</code> attribute defined at extension <code>print</code>. */
	public static final String CATALOGVERSION = "catalogVersion";
	
	/** <i>Generated constant</i> - Attribute key of <code>AxisEntry.locked</code> attribute defined at extension <code>print</code>. */
	public static final String LOCKED = "locked";
	
	/** <i>Generated constant</i> - Attribute key of <code>AxisEntry.cells</code> attribute defined at extension <code>print</code>. */
	public static final String CELLS = "cells";
	
	/** <i>Generated constant</i> - Attribute key of <code>AxisEntry.sortConfigs</code> attribute defined at extension <code>print</code>. */
	public static final String SORTCONFIGS = "sortConfigs";
	
	
	/** <i>Generated variable</i> - Variable of <code>AxisEntry.id</code> attribute defined at extension <code>print</code>. */
	private String _id;
	
	/** <i>Generated variable</i> - Variable of <code>AxisEntry.catalogVersion</code> attribute defined at extension <code>print</code>. */
	private CatalogVersionModel _catalogVersion;
	
	/** <i>Generated variable</i> - Variable of <code>AxisEntry.locked</code> attribute defined at extension <code>print</code>. */
	private Boolean _locked;
	
	/** <i>Generated variable</i> - Variable of <code>AxisEntry.cells</code> attribute defined at extension <code>print</code>. */
	private Collection<CellEntryModel> _cells;
	
	/** <i>Generated variable</i> - Variable of <code>AxisEntry.sortConfigs</code> attribute defined at extension <code>print</code>. */
	private List<SortConfigModel> _sortConfigs;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AxisEntryModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AxisEntryModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>AxisEntry</code> at extension <code>print</code>
	 */
	@Deprecated
	public AxisEntryModel(final CatalogVersionModel _catalogVersion)
	{
		super();
		setCatalogVersion(_catalogVersion);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>AxisEntry</code> at extension <code>print</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public AxisEntryModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AxisEntry.catalogVersion</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>AxisEntry.cells</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the cells
	 */
	public Collection<CellEntryModel> getCells()
	{
		if (this._cells!=null)
		{
			return _cells;
		}
		return _cells = getPersistenceContext().getValue(CELLS, _cells);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AxisEntry.id</code> attribute defined at extension <code>print</code>. 
	 * @return the id
	 */
	public String getId()
	{
		if (this._id!=null)
		{
			return _id;
		}
		return _id = getPersistenceContext().getValue(ID, _id);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AxisEntry.locked</code> attribute defined at extension <code>print</code>. 
	 * @return the locked
	 */
	public Boolean getLocked()
	{
		if (this._locked!=null)
		{
			return _locked;
		}
		return _locked = getPersistenceContext().getValue(LOCKED, _locked);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AxisEntry.sortConfigs</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the sortConfigs
	 */
	public List<SortConfigModel> getSortConfigs()
	{
		if (this._sortConfigs!=null)
		{
			return _sortConfigs;
		}
		return _sortConfigs = getPersistenceContext().getValue(SORTCONFIGS, _sortConfigs);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AxisEntry.catalogVersion</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the catalogVersion
	 */
	public void setCatalogVersion(final CatalogVersionModel value)
	{
		_catalogVersion = getPersistenceContext().setValue(CATALOGVERSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AxisEntry.id</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the id
	 */
	public void setId(final String value)
	{
		_id = getPersistenceContext().setValue(ID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AxisEntry.locked</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the locked
	 */
	public void setLocked(final Boolean value)
	{
		_locked = getPersistenceContext().setValue(LOCKED, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AxisEntry.sortConfigs</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the sortConfigs
	 */
	public void setSortConfigs(final List<SortConfigModel> value)
	{
		_sortConfigs = getPersistenceContext().setValue(SORTCONFIGS, value);
	}
	
}
