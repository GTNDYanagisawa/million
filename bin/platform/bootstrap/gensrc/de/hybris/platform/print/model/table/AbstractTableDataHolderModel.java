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
import de.hybris.platform.print.model.table.MapParameterValueModel;
import de.hybris.platform.print.model.table.ParameterValueModel;
import de.hybris.platform.print.model.table.TableBlockModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Map;

/**
 * Generated model class for type AbstractTableDataHolder first defined at extension print.
 */
@SuppressWarnings("all")
public class AbstractTableDataHolderModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "AbstractTableDataHolder";
	
	/**<i>Generated relation code constant for relation <code>Table2DataHolderRelation</code> defining source attribute <code>table</code> in extension <code>print</code>.</i>*/
	public final static String _TABLE2DATAHOLDERRELATION = "Table2DataHolderRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractTableDataHolder.id</code> attribute defined at extension <code>print</code>. */
	public static final String ID = "id";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractTableDataHolder.catalogVersion</code> attribute defined at extension <code>print</code>. */
	public static final String CATALOGVERSION = "catalogVersion";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractTableDataHolder.parametersInternal</code> attribute defined at extension <code>print</code>. */
	public static final String PARAMETERSINTERNAL = "parametersInternal";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractTableDataHolder.parameters</code> attribute defined at extension <code>print</code>. */
	public static final String PARAMETERS = "parameters";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractTableDataHolder.table</code> attribute defined at extension <code>print</code>. */
	public static final String TABLE = "table";
	
	
	/** <i>Generated variable</i> - Variable of <code>AbstractTableDataHolder.id</code> attribute defined at extension <code>print</code>. */
	private String _id;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractTableDataHolder.catalogVersion</code> attribute defined at extension <code>print</code>. */
	private CatalogVersionModel _catalogVersion;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractTableDataHolder.parametersInternal</code> attribute defined at extension <code>print</code>. */
	private MapParameterValueModel _parametersInternal;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractTableDataHolder.parameters</code> attribute defined at extension <code>print</code>. */
	private Map<String,ParameterValueModel> _parameters;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractTableDataHolder.table</code> attribute defined at extension <code>print</code>. */
	private TableBlockModel _table;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AbstractTableDataHolderModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AbstractTableDataHolderModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _table initial attribute declared by type <code>AbstractTableDataHolder</code> at extension <code>print</code>
	 */
	@Deprecated
	public AbstractTableDataHolderModel(final TableBlockModel _table)
	{
		super();
		setTable(_table);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _table initial attribute declared by type <code>AbstractTableDataHolder</code> at extension <code>print</code>
	 */
	@Deprecated
	public AbstractTableDataHolderModel(final ItemModel _owner, final TableBlockModel _table)
	{
		super();
		setOwner(_owner);
		setTable(_table);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTableDataHolder.catalogVersion</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>AbstractTableDataHolder.id</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>AbstractTableDataHolder.parameters</code> attribute defined at extension <code>print</code>. 
	 * @return the parameters
	 */
	public Map<String,ParameterValueModel> getParameters()
	{
		if (this._parameters!=null)
		{
			return _parameters;
		}
		return _parameters = getPersistenceContext().getValue(PARAMETERS, _parameters);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTableDataHolder.parametersInternal</code> attribute defined at extension <code>print</code>. 
	 * @return the parametersInternal
	 */
	public MapParameterValueModel getParametersInternal()
	{
		if (this._parametersInternal!=null)
		{
			return _parametersInternal;
		}
		return _parametersInternal = getPersistenceContext().getValue(PARAMETERSINTERNAL, _parametersInternal);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTableDataHolder.table</code> attribute defined at extension <code>print</code>. 
	 * @return the table
	 */
	public TableBlockModel getTable()
	{
		if (this._table!=null)
		{
			return _table;
		}
		return _table = getPersistenceContext().getValue(TABLE, _table);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractTableDataHolder.catalogVersion</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the catalogVersion
	 */
	public void setCatalogVersion(final CatalogVersionModel value)
	{
		_catalogVersion = getPersistenceContext().setValue(CATALOGVERSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractTableDataHolder.id</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the id
	 */
	public void setId(final String value)
	{
		_id = getPersistenceContext().setValue(ID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractTableDataHolder.parameters</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the parameters
	 */
	public void setParameters(final Map<String,ParameterValueModel> value)
	{
		_parameters = getPersistenceContext().setValue(PARAMETERS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractTableDataHolder.parametersInternal</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the parametersInternal
	 */
	public void setParametersInternal(final MapParameterValueModel value)
	{
		_parametersInternal = getPersistenceContext().setValue(PARAMETERSINTERNAL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractTableDataHolder.table</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the table
	 */
	public void setTable(final TableBlockModel value)
	{
		_table = getPersistenceContext().setValue(TABLE, value);
	}
	
}
