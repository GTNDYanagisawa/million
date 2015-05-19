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
package de.hybris.platform.commerceservices.model.solrsearch.config;

import de.hybris.platform.commerceservices.model.solrsearch.config.SolrSortModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SolrSortField first defined at extension commerceservices.
 * <p>
 * Extending SolrSortField type with additional attributes.
 */
@SuppressWarnings("all")
public class SolrSortFieldModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SolrSortField";
	
	/**<i>Generated relation code constant for relation <code>SolrSort2SolrSortFieldRel</code> defining source attribute <code>sort</code> in extension <code>commerceservices</code>.</i>*/
	public final static String _SOLRSORT2SOLRSORTFIELDREL = "SolrSort2SolrSortFieldRel";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrSortField.fieldName</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String FIELDNAME = "fieldName";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrSortField.ascending</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String ASCENDING = "ascending";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrSortField.sort</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String SORT = "sort";
	
	
	/** <i>Generated variable</i> - Variable of <code>SolrSortField.fieldName</code> attribute defined at extension <code>commerceservices</code>. */
	private String _fieldName;
	
	/** <i>Generated variable</i> - Variable of <code>SolrSortField.ascending</code> attribute defined at extension <code>commerceservices</code>. */
	private Boolean _ascending;
	
	/** <i>Generated variable</i> - Variable of <code>SolrSortField.sort</code> attribute defined at extension <code>commerceservices</code>. */
	private SolrSortModel _sort;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SolrSortFieldModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SolrSortFieldModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _ascending initial attribute declared by type <code>SolrSortField</code> at extension <code>commerceservices</code>
	 * @param _fieldName initial attribute declared by type <code>SolrSortField</code> at extension <code>commerceservices</code>
	 * @param _sort initial attribute declared by type <code>SolrSortField</code> at extension <code>commerceservices</code>
	 */
	@Deprecated
	public SolrSortFieldModel(final boolean _ascending, final String _fieldName, final SolrSortModel _sort)
	{
		super();
		setAscending(_ascending);
		setFieldName(_fieldName);
		setSort(_sort);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _ascending initial attribute declared by type <code>SolrSortField</code> at extension <code>commerceservices</code>
	 * @param _fieldName initial attribute declared by type <code>SolrSortField</code> at extension <code>commerceservices</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _sort initial attribute declared by type <code>SolrSortField</code> at extension <code>commerceservices</code>
	 */
	@Deprecated
	public SolrSortFieldModel(final boolean _ascending, final String _fieldName, final ItemModel _owner, final SolrSortModel _sort)
	{
		super();
		setAscending(_ascending);
		setFieldName(_fieldName);
		setOwner(_owner);
		setSort(_sort);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrSortField.fieldName</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the fieldName - The field name to sort with.
	 */
	public String getFieldName()
	{
		if (this._fieldName!=null)
		{
			return _fieldName;
		}
		return _fieldName = getPersistenceContext().getValue(FIELDNAME, _fieldName);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrSortField.sort</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the sort
	 */
	public SolrSortModel getSort()
	{
		if (this._sort!=null)
		{
			return _sort;
		}
		return _sort = getPersistenceContext().getValue(SORT, _sort);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrSortField.ascending</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the ascending - Is this field sorted ascending.
	 */
	public boolean isAscending()
	{
		return toPrimitive( _ascending = getPersistenceContext().getValue(ASCENDING, _ascending));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrSortField.ascending</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the ascending - Is this field sorted ascending.
	 */
	public void setAscending(final boolean value)
	{
		_ascending = getPersistenceContext().setValue(ASCENDING, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrSortField.fieldName</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the fieldName - The field name to sort with.
	 */
	public void setFieldName(final String value)
	{
		_fieldName = getPersistenceContext().setValue(FIELDNAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrSortField.sort</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the sort
	 */
	public void setSort(final SolrSortModel value)
	{
		_sort = getPersistenceContext().setValue(SORT, value);
	}
	
}
