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
import de.hybris.platform.print.model.table.AbstractTableDataHolderModel;
import de.hybris.platform.print.model.table.AxisEntryModel;
import de.hybris.platform.print.model.table.TableBlockModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type AxisDataHolder first defined at extension print.
 */
@SuppressWarnings("all")
public class AxisDataHolderModel extends AbstractTableDataHolderModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "AxisDataHolder";
	
	/** <i>Generated constant</i> - Attribute key of <code>AxisDataHolder.axis</code> attribute defined at extension <code>print</code>. */
	public static final String AXIS = "axis";
	
	/** <i>Generated constant</i> - Attribute key of <code>AxisDataHolder.dataProviderClass</code> attribute defined at extension <code>print</code>. */
	public static final String DATAPROVIDERCLASS = "dataProviderClass";
	
	
	/** <i>Generated variable</i> - Variable of <code>AxisDataHolder.axis</code> attribute defined at extension <code>print</code>. */
	private AxisEntryModel _axis;
	
	/** <i>Generated variable</i> - Variable of <code>AxisDataHolder.dataProviderClass</code> attribute defined at extension <code>print</code>. */
	private Class _dataProviderClass;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AxisDataHolderModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AxisDataHolderModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _axis initial attribute declared by type <code>AxisDataHolder</code> at extension <code>print</code>
	 * @param _table initial attribute declared by type <code>AbstractTableDataHolder</code> at extension <code>print</code>
	 */
	@Deprecated
	public AxisDataHolderModel(final AxisEntryModel _axis, final TableBlockModel _table)
	{
		super();
		setAxis(_axis);
		setTable(_table);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _axis initial attribute declared by type <code>AxisDataHolder</code> at extension <code>print</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _table initial attribute declared by type <code>AbstractTableDataHolder</code> at extension <code>print</code>
	 */
	@Deprecated
	public AxisDataHolderModel(final AxisEntryModel _axis, final ItemModel _owner, final TableBlockModel _table)
	{
		super();
		setAxis(_axis);
		setOwner(_owner);
		setTable(_table);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AxisDataHolder.axis</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>AxisDataHolder.dataProviderClass</code> attribute defined at extension <code>print</code>. 
	 * @return the dataProviderClass
	 */
	public Class getDataProviderClass()
	{
		if (this._dataProviderClass!=null)
		{
			return _dataProviderClass;
		}
		return _dataProviderClass = getPersistenceContext().getValue(DATAPROVIDERCLASS, _dataProviderClass);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AxisDataHolder.axis</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the axis
	 */
	public void setAxis(final AxisEntryModel value)
	{
		_axis = getPersistenceContext().setValue(AXIS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AxisDataHolder.dataProviderClass</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the dataProviderClass
	 */
	public void setDataProviderClass(final Class value)
	{
		_dataProviderClass = getPersistenceContext().setValue(DATAPROVIDERCLASS, value);
	}
	
}
