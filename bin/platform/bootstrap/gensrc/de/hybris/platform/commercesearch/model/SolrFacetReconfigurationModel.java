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

import de.hybris.platform.commercesearch.model.AbstractSolrSearchProfileModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.solrfacetsearch.enums.SolrIndexedPropertyFacetType;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexedPropertyModel;
import java.util.Collection;

/**
 * Generated model class for type SolrFacetReconfiguration first defined at extension commercesearch.
 */
@SuppressWarnings("all")
public class SolrFacetReconfigurationModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SolrFacetReconfiguration";
	
	/**<i>Generated relation code constant for relation <code>SolrIndexedProperty2SolrFacetReconfiguration</code> defining source attribute <code>facet</code> in extension <code>commercesearch</code>.</i>*/
	public final static String _SOLRINDEXEDPROPERTY2SOLRFACETRECONFIGURATION = "SolrIndexedProperty2SolrFacetReconfiguration";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetReconfiguration.customFacetSortProvider</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String CUSTOMFACETSORTPROVIDER = "customFacetSortProvider";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetReconfiguration.facetType</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String FACETTYPE = "facetType";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetReconfiguration.priority</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String PRIORITY = "priority";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetReconfiguration.visible</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String VISIBLE = "visible";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetReconfiguration.description</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String DESCRIPTION = "description";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetReconfiguration.facet</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String FACET = "facet";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetReconfiguration.solrSearchProfiles</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String SOLRSEARCHPROFILES = "solrSearchProfiles";
	
	
	/** <i>Generated variable</i> - Variable of <code>SolrFacetReconfiguration.customFacetSortProvider</code> attribute defined at extension <code>commercesearch</code>. */
	private String _customFacetSortProvider;
	
	/** <i>Generated variable</i> - Variable of <code>SolrFacetReconfiguration.facetType</code> attribute defined at extension <code>commercesearch</code>. */
	private SolrIndexedPropertyFacetType _facetType;
	
	/** <i>Generated variable</i> - Variable of <code>SolrFacetReconfiguration.priority</code> attribute defined at extension <code>commercesearch</code>. */
	private Integer _priority;
	
	/** <i>Generated variable</i> - Variable of <code>SolrFacetReconfiguration.visible</code> attribute defined at extension <code>commercesearch</code>. */
	private Boolean _visible;
	
	/** <i>Generated variable</i> - Variable of <code>SolrFacetReconfiguration.description</code> attribute defined at extension <code>commercesearch</code>. */
	private String _description;
	
	/** <i>Generated variable</i> - Variable of <code>SolrFacetReconfiguration.facet</code> attribute defined at extension <code>commercesearch</code>. */
	private SolrIndexedPropertyModel _facet;
	
	/** <i>Generated variable</i> - Variable of <code>SolrFacetReconfiguration.solrSearchProfiles</code> attribute defined at extension <code>commercesearch</code>. */
	private Collection<AbstractSolrSearchProfileModel> _solrSearchProfiles;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SolrFacetReconfigurationModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SolrFacetReconfigurationModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _facet initial attribute declared by type <code>SolrFacetReconfiguration</code> at extension <code>commercesearch</code>
	 * @param _solrSearchProfiles initial attribute declared by type <code>SolrFacetReconfiguration</code> at extension <code>commercesearch</code>
	 */
	@Deprecated
	public SolrFacetReconfigurationModel(final SolrIndexedPropertyModel _facet, final Collection<AbstractSolrSearchProfileModel> _solrSearchProfiles)
	{
		super();
		setFacet(_facet);
		setSolrSearchProfiles(_solrSearchProfiles);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _facet initial attribute declared by type <code>SolrFacetReconfiguration</code> at extension <code>commercesearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _solrSearchProfiles initial attribute declared by type <code>SolrFacetReconfiguration</code> at extension <code>commercesearch</code>
	 */
	@Deprecated
	public SolrFacetReconfigurationModel(final SolrIndexedPropertyModel _facet, final ItemModel _owner, final Collection<AbstractSolrSearchProfileModel> _solrSearchProfiles)
	{
		super();
		setFacet(_facet);
		setOwner(_owner);
		setSolrSearchProfiles(_solrSearchProfiles);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetReconfiguration.customFacetSortProvider</code> attribute defined at extension <code>commercesearch</code>. 
	 * @return the customFacetSortProvider - Facet sort values are facet being dependent
	 */
	public String getCustomFacetSortProvider()
	{
		if (this._customFacetSortProvider!=null)
		{
			return _customFacetSortProvider;
		}
		return _customFacetSortProvider = getPersistenceContext().getValue(CUSTOMFACETSORTPROVIDER, _customFacetSortProvider);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetReconfiguration.description</code> dynamic attribute defined at extension <code>commercesearch</code>. 
	 * @return the description
	 */
	public String getDescription()
	{
		return getPersistenceContext().getDynamicValue(this,DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetReconfiguration.facet</code> attribute defined at extension <code>commercesearch</code>. 
	 * @return the facet
	 */
	public SolrIndexedPropertyModel getFacet()
	{
		if (this._facet!=null)
		{
			return _facet;
		}
		return _facet = getPersistenceContext().getValue(FACET, _facet);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetReconfiguration.facetType</code> attribute defined at extension <code>commercesearch</code>. 
	 * @return the facetType
	 */
	public SolrIndexedPropertyFacetType getFacetType()
	{
		if (this._facetType!=null)
		{
			return _facetType;
		}
		return _facetType = getPersistenceContext().getValue(FACETTYPE, _facetType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetReconfiguration.priority</code> attribute defined at extension <code>commercesearch</code>. 
	 * @return the priority
	 */
	public Integer getPriority()
	{
		if (this._priority!=null)
		{
			return _priority;
		}
		return _priority = getPersistenceContext().getValue(PRIORITY, _priority);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetReconfiguration.solrSearchProfiles</code> attribute defined at extension <code>commercesearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the solrSearchProfiles
	 */
	public Collection<AbstractSolrSearchProfileModel> getSolrSearchProfiles()
	{
		if (this._solrSearchProfiles!=null)
		{
			return _solrSearchProfiles;
		}
		return _solrSearchProfiles = getPersistenceContext().getValue(SOLRSEARCHPROFILES, _solrSearchProfiles);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetReconfiguration.visible</code> attribute defined at extension <code>commercesearch</code>. 
	 * @return the visible - This property is used to define whether a facet should be visible for frontend users or not.
	 */
	public boolean isVisible()
	{
		return toPrimitive( _visible = getPersistenceContext().getValue(VISIBLE, _visible));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetReconfiguration.customFacetSortProvider</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the customFacetSortProvider - Facet sort values are facet being dependent
	 */
	public void setCustomFacetSortProvider(final String value)
	{
		_customFacetSortProvider = getPersistenceContext().setValue(CUSTOMFACETSORTPROVIDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetReconfiguration.facet</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the facet
	 */
	public void setFacet(final SolrIndexedPropertyModel value)
	{
		_facet = getPersistenceContext().setValue(FACET, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetReconfiguration.facetType</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the facetType
	 */
	public void setFacetType(final SolrIndexedPropertyFacetType value)
	{
		_facetType = getPersistenceContext().setValue(FACETTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetReconfiguration.priority</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the priority
	 */
	public void setPriority(final Integer value)
	{
		_priority = getPersistenceContext().setValue(PRIORITY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetReconfiguration.solrSearchProfiles</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the solrSearchProfiles
	 */
	public void setSolrSearchProfiles(final Collection<AbstractSolrSearchProfileModel> value)
	{
		_solrSearchProfiles = getPersistenceContext().setValue(SOLRSEARCHPROFILES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetReconfiguration.visible</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the visible - This property is used to define whether a facet should be visible for frontend users or not.
	 */
	public void setVisible(final boolean value)
	{
		_visible = getPersistenceContext().setValue(VISIBLE, toObject(value));
	}
	
}
