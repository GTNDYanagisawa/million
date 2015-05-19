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
import java.util.List;

/**
 * Generated model class for type CollectionParameterValue first defined at extension print.
 */
@SuppressWarnings("all")
public class CollectionParameterValueModel extends ParameterValueModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CollectionParameterValue";
	
	/** <i>Generated constant</i> - Attribute key of <code>CollectionParameterValue.entries</code> attribute defined at extension <code>print</code>. */
	public static final String ENTRIES = "entries";
	
	
	/** <i>Generated variable</i> - Variable of <code>CollectionParameterValue.entries</code> attribute defined at extension <code>print</code>. */
	private List<ParameterValueModel> _entries;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CollectionParameterValueModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CollectionParameterValueModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public CollectionParameterValueModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CollectionParameterValue.entries</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the entries
	 */
	public List<ParameterValueModel> getEntries()
	{
		if (this._entries!=null)
		{
			return _entries;
		}
		return _entries = getPersistenceContext().getValue(ENTRIES, _entries);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CollectionParameterValue.entries</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the entries
	 */
	public void setEntries(final List<ParameterValueModel> value)
	{
		_entries = getPersistenceContext().setValue(ENTRIES, value);
	}
	
}
