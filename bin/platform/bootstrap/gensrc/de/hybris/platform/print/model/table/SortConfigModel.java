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

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.print.model.table.AxisEntryModel;
import de.hybris.platform.print.model.table.CellEntryModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SortConfig first defined at extension print.
 */
@SuppressWarnings("all")
public class SortConfigModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SortConfig";
	
	/**<i>Generated relation code constant for relation <code>Axis2SortConfigRelation</code> defining source attribute <code>axis</code> in extension <code>print</code>.</i>*/
	public final static String _AXIS2SORTCONFIGRELATION = "Axis2SortConfigRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>SortConfig.cell</code> attribute defined at extension <code>print</code>. */
	public static final String CELL = "cell";
	
	/** <i>Generated constant</i> - Attribute key of <code>SortConfig.ascending</code> attribute defined at extension <code>print</code>. */
	public static final String ASCENDING = "ascending";
	
	/** <i>Generated constant</i> - Attribute key of <code>SortConfig.caseSensitive</code> attribute defined at extension <code>print</code>. */
	public static final String CASESENSITIVE = "caseSensitive";
	
	/** <i>Generated constant</i> - Attribute key of <code>SortConfig.sortByRawValue</code> attribute defined at extension <code>print</code>. */
	public static final String SORTBYRAWVALUE = "sortByRawValue";
	
	/** <i>Generated constant</i> - Attribute key of <code>SortConfig.comparatorClass</code> attribute defined at extension <code>print</code>. */
	public static final String COMPARATORCLASS = "comparatorClass";
	
	/** <i>Generated constant</i> - Attribute key of <code>SortConfig.axis</code> attribute defined at extension <code>print</code>. */
	public static final String AXIS = "axis";
	
	
	/** <i>Generated variable</i> - Variable of <code>SortConfig.cell</code> attribute defined at extension <code>print</code>. */
	private CellEntryModel _cell;
	
	/** <i>Generated variable</i> - Variable of <code>SortConfig.ascending</code> attribute defined at extension <code>print</code>. */
	private Boolean _ascending;
	
	/** <i>Generated variable</i> - Variable of <code>SortConfig.caseSensitive</code> attribute defined at extension <code>print</code>. */
	private Boolean _caseSensitive;
	
	/** <i>Generated variable</i> - Variable of <code>SortConfig.sortByRawValue</code> attribute defined at extension <code>print</code>. */
	private Boolean _sortByRawValue;
	
	/** <i>Generated variable</i> - Variable of <code>SortConfig.comparatorClass</code> attribute defined at extension <code>print</code>. */
	private Class _comparatorClass;
	
	/** <i>Generated variable</i> - Variable of <code>SortConfig.axis</code> attribute defined at extension <code>print</code>. */
	private AxisEntryModel _axis;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SortConfigModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SortConfigModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _axis initial attribute declared by type <code>SortConfig</code> at extension <code>print</code>
	 * @param _cell initial attribute declared by type <code>SortConfig</code> at extension <code>print</code>
	 */
	@Deprecated
	public SortConfigModel(final AxisEntryModel _axis, final CellEntryModel _cell)
	{
		super();
		setAxis(_axis);
		setCell(_cell);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _axis initial attribute declared by type <code>SortConfig</code> at extension <code>print</code>
	 * @param _cell initial attribute declared by type <code>SortConfig</code> at extension <code>print</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public SortConfigModel(final AxisEntryModel _axis, final CellEntryModel _cell, final ItemModel _owner)
	{
		super();
		setAxis(_axis);
		setCell(_cell);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SortConfig.ascending</code> attribute defined at extension <code>print</code>. 
	 * @return the ascending
	 */
	public Boolean getAscending()
	{
		if (this._ascending!=null)
		{
			return _ascending;
		}
		return _ascending = getPersistenceContext().getValue(ASCENDING, _ascending);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SortConfig.axis</code> attribute defined at extension <code>print</code>. 
	 * @return the axis
	 */
	public AxisEntryModel getAxis()
	{
		if (this._axis!=null)
		{
			return _axis;
		}
		return _axis = getPersistenceContext().getValue(AXIS, _axis);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SortConfig.caseSensitive</code> attribute defined at extension <code>print</code>. 
	 * @return the caseSensitive
	 */
	public Boolean getCaseSensitive()
	{
		if (this._caseSensitive!=null)
		{
			return _caseSensitive;
		}
		return _caseSensitive = getPersistenceContext().getValue(CASESENSITIVE, _caseSensitive);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SortConfig.cell</code> attribute defined at extension <code>print</code>. 
	 * @return the cell
	 */
	public CellEntryModel getCell()
	{
		if (this._cell!=null)
		{
			return _cell;
		}
		return _cell = getPersistenceContext().getValue(CELL, _cell);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SortConfig.comparatorClass</code> attribute defined at extension <code>print</code>. 
	 * @return the comparatorClass
	 */
	public Class getComparatorClass()
	{
		if (this._comparatorClass!=null)
		{
			return _comparatorClass;
		}
		return _comparatorClass = getPersistenceContext().getValue(COMPARATORCLASS, _comparatorClass);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SortConfig.sortByRawValue</code> attribute defined at extension <code>print</code>. 
	 * @return the sortByRawValue
	 */
	public Boolean getSortByRawValue()
	{
		if (this._sortByRawValue!=null)
		{
			return _sortByRawValue;
		}
		return _sortByRawValue = getPersistenceContext().getValue(SORTBYRAWVALUE, _sortByRawValue);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SortConfig.ascending</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the ascending
	 */
	public void setAscending(final Boolean value)
	{
		_ascending = getPersistenceContext().setValue(ASCENDING, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SortConfig.axis</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the axis
	 */
	public void setAxis(final AxisEntryModel value)
	{
		_axis = getPersistenceContext().setValue(AXIS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SortConfig.caseSensitive</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the caseSensitive
	 */
	public void setCaseSensitive(final Boolean value)
	{
		_caseSensitive = getPersistenceContext().setValue(CASESENSITIVE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SortConfig.cell</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the cell
	 */
	public void setCell(final CellEntryModel value)
	{
		_cell = getPersistenceContext().setValue(CELL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SortConfig.comparatorClass</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the comparatorClass
	 */
	public void setComparatorClass(final Class value)
	{
		_comparatorClass = getPersistenceContext().setValue(COMPARATORCLASS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SortConfig.sortByRawValue</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the sortByRawValue
	 */
	public void setSortByRawValue(final Boolean value)
	{
		_sortByRawValue = getPersistenceContext().setValue(SORTBYRAWVALUE, value);
	}
	
}
