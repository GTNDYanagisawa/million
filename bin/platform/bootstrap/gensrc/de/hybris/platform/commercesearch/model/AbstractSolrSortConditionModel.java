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
package de.hybris.platform.commercesearch.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type AbstractSolrSortCondition first defined at extension commercesearch.
 */
@SuppressWarnings("all")
public class AbstractSolrSortConditionModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "AbstractSolrSortCondition";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractSolrSortCondition.inverse</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String INVERSE = "inverse";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractSolrSortCondition.description</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String DESCRIPTION = "description";
	
	
	/** <i>Generated variable</i> - Variable of <code>AbstractSolrSortCondition.inverse</code> attribute defined at extension <code>commercesearch</code>. */
	private Boolean _inverse;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractSolrSortCondition.description</code> attribute defined at extension <code>commercesearch</code>. */
	private String _description;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AbstractSolrSortConditionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AbstractSolrSortConditionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public AbstractSolrSortConditionModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSolrSortCondition.description</code> dynamic attribute defined at extension <code>commercesearch</code>. 
	 * @return the description
	 */
	public String getDescription()
	{
		return getPersistenceContext().getDynamicValue(this,DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSolrSortCondition.inverse</code> attribute defined at extension <code>commercesearch</code>. 
	 * @return the inverse
	 */
	public Boolean getInverse()
	{
		if (this._inverse!=null)
		{
			return _inverse;
		}
		return _inverse = getPersistenceContext().getValue(INVERSE, _inverse);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractSolrSortCondition.inverse</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the inverse
	 */
	public void setInverse(final Boolean value)
	{
		_inverse = getPersistenceContext().setValue(INVERSE, value);
	}
	
}
