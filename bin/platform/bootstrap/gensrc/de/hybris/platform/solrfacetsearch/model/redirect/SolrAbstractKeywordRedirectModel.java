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
package de.hybris.platform.solrfacetsearch.model.redirect;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SolrAbstractKeywordRedirect first defined at extension solrfacetsearch.
 */
@SuppressWarnings("all")
public class SolrAbstractKeywordRedirectModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SolrAbstractKeywordRedirect";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrAbstractKeywordRedirect.hmcLabel</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String HMCLABEL = "hmcLabel";
	
	
	/** <i>Generated variable</i> - Variable of <code>SolrAbstractKeywordRedirect.hmcLabel</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _hmcLabel;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SolrAbstractKeywordRedirectModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SolrAbstractKeywordRedirectModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public SolrAbstractKeywordRedirectModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrAbstractKeywordRedirect.hmcLabel</code> dynamic attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the hmcLabel
	 */
	public String getHmcLabel()
	{
		return getPersistenceContext().getDynamicValue(this,HMCLABEL);
	}
	
}
