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
import de.hybris.platform.print.model.table.ParameterValueModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Map;

/**
 * Generated model class for type MapParameterValue first defined at extension print.
 */
@SuppressWarnings("all")
public class MapParameterValueModel extends ParameterValueModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "MapParameterValue";
	
	/** <i>Generated constant</i> - Attribute key of <code>MapParameterValue.parameterMap</code> attribute defined at extension <code>print</code>. */
	public static final String PARAMETERMAP = "parameterMap";
	
	/** <i>Generated constant</i> - Attribute key of <code>MapParameterValue.entries</code> attribute defined at extension <code>print</code>. */
	public static final String ENTRIES = "entries";
	
	
	/** <i>Generated variable</i> - Variable of <code>MapParameterValue.parameterMap</code> attribute defined at extension <code>print</code>. */
	private Map<Object,ParameterValueModel> _parameterMap;
	
	/** <i>Generated variable</i> - Variable of <code>MapParameterValue.entries</code> attribute defined at extension <code>print</code>. */
	private Collection<ParameterValueModel> _entries;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public MapParameterValueModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public MapParameterValueModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public MapParameterValueModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MapParameterValue.entries</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the entries
	 */
	public Collection<ParameterValueModel> getEntries()
	{
		if (this._entries!=null)
		{
			return _entries;
		}
		return _entries = getPersistenceContext().getValue(ENTRIES, _entries);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MapParameterValue.parameterMap</code> attribute defined at extension <code>print</code>. 
	 * @return the parameterMap
	 */
	public Map<Object,ParameterValueModel> getParameterMap()
	{
		if (this._parameterMap!=null)
		{
			return _parameterMap;
		}
		return _parameterMap = getPersistenceContext().getValue(PARAMETERMAP, _parameterMap);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MapParameterValue.entries</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the entries
	 */
	public void setEntries(final Collection<ParameterValueModel> value)
	{
		_entries = getPersistenceContext().setValue(ENTRIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MapParameterValue.parameterMap</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the parameterMap
	 */
	public void setParameterMap(final Map<Object,ParameterValueModel> value)
	{
		_parameterMap = getPersistenceContext().setValue(PARAMETERMAP, value);
	}
	
}
