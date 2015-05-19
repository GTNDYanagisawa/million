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
import de.hybris.platform.print.model.table.CollectionParameterValueModel;
import de.hybris.platform.print.model.table.MapParameterValueModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type ParameterValue first defined at extension print.
 */
@SuppressWarnings("all")
public class ParameterValueModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ParameterValue";
	
	/**<i>Generated relation code constant for relation <code>ColParam2EntryRelation</code> defining source attribute <code>collParam</code> in extension <code>print</code>.</i>*/
	public final static String _COLPARAM2ENTRYRELATION = "ColParam2EntryRelation";
	
	/**<i>Generated relation code constant for relation <code>MapParam2EntryRelation</code> defining source attribute <code>mapParam</code> in extension <code>print</code>.</i>*/
	public final static String _MAPPARAM2ENTRYRELATION = "MapParam2EntryRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>ParameterValue.mapEntryKey</code> attribute defined at extension <code>print</code>. */
	public static final String MAPENTRYKEY = "mapEntryKey";
	
	/** <i>Generated constant</i> - Attribute key of <code>ParameterValue.collParam</code> attribute defined at extension <code>print</code>. */
	public static final String COLLPARAM = "collParam";
	
	/** <i>Generated constant</i> - Attribute key of <code>ParameterValue.mapParam</code> attribute defined at extension <code>print</code>. */
	public static final String MAPPARAM = "mapParam";
	
	
	/** <i>Generated variable</i> - Variable of <code>ParameterValue.mapEntryKey</code> attribute defined at extension <code>print</code>. */
	private Object _mapEntryKey;
	
	/** <i>Generated variable</i> - Variable of <code>ParameterValue.collParam</code> attribute defined at extension <code>print</code>. */
	private CollectionParameterValueModel _collParam;
	
	/** <i>Generated variable</i> - Variable of <code>ParameterValue.mapParam</code> attribute defined at extension <code>print</code>. */
	private MapParameterValueModel _mapParam;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ParameterValueModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ParameterValueModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public ParameterValueModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ParameterValue.collParam</code> attribute defined at extension <code>print</code>. 
	 * @return the collParam
	 */
	public CollectionParameterValueModel getCollParam()
	{
		if (this._collParam!=null)
		{
			return _collParam;
		}
		return _collParam = getPersistenceContext().getValue(COLLPARAM, _collParam);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ParameterValue.mapEntryKey</code> attribute defined at extension <code>print</code>. 
	 * @return the mapEntryKey
	 */
	public Object getMapEntryKey()
	{
		if (this._mapEntryKey!=null)
		{
			return _mapEntryKey;
		}
		return _mapEntryKey = getPersistenceContext().getValue(MAPENTRYKEY, _mapEntryKey);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ParameterValue.mapParam</code> attribute defined at extension <code>print</code>. 
	 * @return the mapParam
	 */
	public MapParameterValueModel getMapParam()
	{
		if (this._mapParam!=null)
		{
			return _mapParam;
		}
		return _mapParam = getPersistenceContext().getValue(MAPPARAM, _mapParam);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ParameterValue.collParam</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the collParam
	 */
	public void setCollParam(final CollectionParameterValueModel value)
	{
		_collParam = getPersistenceContext().setValue(COLLPARAM, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ParameterValue.mapEntryKey</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the mapEntryKey
	 */
	public void setMapEntryKey(final Object value)
	{
		_mapEntryKey = getPersistenceContext().setValue(MAPENTRYKEY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ParameterValue.mapParam</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the mapParam
	 */
	public void setMapParam(final MapParameterValueModel value)
	{
		_mapParam = getPersistenceContext().setValue(MAPPARAM, value);
	}
	
}
