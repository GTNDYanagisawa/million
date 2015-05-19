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
package de.hybris.platform.solrfacetsearch.model.config;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.solrfacetsearch.model.config.SolrFacetSearchConfigModel;

/**
 * Generated model class for type SolrSynonymConfig first defined at extension solrfacetsearch.
 */
@SuppressWarnings("all")
public class SolrSynonymConfigModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SolrSynonymConfig";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrSynonymConfig.synonymFrom</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String SYNONYMFROM = "synonymFrom";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrSynonymConfig.synonymTo</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String SYNONYMTO = "synonymTo";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrSynonymConfig.language</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String LANGUAGE = "language";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrSynonymConfig.facetSearchConfig</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String FACETSEARCHCONFIG = "facetSearchConfig";
	
	
	/** <i>Generated variable</i> - Variable of <code>SolrSynonymConfig.synonymFrom</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _synonymFrom;
	
	/** <i>Generated variable</i> - Variable of <code>SolrSynonymConfig.synonymTo</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _synonymTo;
	
	/** <i>Generated variable</i> - Variable of <code>SolrSynonymConfig.language</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private LanguageModel _language;
	
	/** <i>Generated variable</i> - Variable of <code>SolrSynonymConfig.facetSearchConfig</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private SolrFacetSearchConfigModel _facetSearchConfig;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SolrSynonymConfigModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SolrSynonymConfigModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _language initial attribute declared by type <code>SolrSynonymConfig</code> at extension <code>solrfacetsearch</code>
	 * @param _synonymFrom initial attribute declared by type <code>SolrSynonymConfig</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrSynonymConfigModel(final LanguageModel _language, final String _synonymFrom)
	{
		super();
		setLanguage(_language);
		setSynonymFrom(_synonymFrom);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _language initial attribute declared by type <code>SolrSynonymConfig</code> at extension <code>solrfacetsearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _synonymFrom initial attribute declared by type <code>SolrSynonymConfig</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrSynonymConfigModel(final LanguageModel _language, final ItemModel _owner, final String _synonymFrom)
	{
		super();
		setLanguage(_language);
		setOwner(_owner);
		setSynonymFrom(_synonymFrom);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrSynonymConfig.facetSearchConfig</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the facetSearchConfig
	 */
	public SolrFacetSearchConfigModel getFacetSearchConfig()
	{
		if (this._facetSearchConfig!=null)
		{
			return _facetSearchConfig;
		}
		return _facetSearchConfig = getPersistenceContext().getValue(FACETSEARCHCONFIG, _facetSearchConfig);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrSynonymConfig.language</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the language
	 */
	public LanguageModel getLanguage()
	{
		if (this._language!=null)
		{
			return _language;
		}
		return _language = getPersistenceContext().getValue(LANGUAGE, _language);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrSynonymConfig.synonymFrom</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the synonymFrom
	 */
	public String getSynonymFrom()
	{
		if (this._synonymFrom!=null)
		{
			return _synonymFrom;
		}
		return _synonymFrom = getPersistenceContext().getValue(SYNONYMFROM, _synonymFrom);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrSynonymConfig.synonymTo</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the synonymTo
	 */
	public String getSynonymTo()
	{
		if (this._synonymTo!=null)
		{
			return _synonymTo;
		}
		return _synonymTo = getPersistenceContext().getValue(SYNONYMTO, _synonymTo);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrSynonymConfig.facetSearchConfig</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the facetSearchConfig
	 */
	public void setFacetSearchConfig(final SolrFacetSearchConfigModel value)
	{
		_facetSearchConfig = getPersistenceContext().setValue(FACETSEARCHCONFIG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrSynonymConfig.language</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the language
	 */
	public void setLanguage(final LanguageModel value)
	{
		_language = getPersistenceContext().setValue(LANGUAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrSynonymConfig.synonymFrom</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the synonymFrom
	 */
	public void setSynonymFrom(final String value)
	{
		_synonymFrom = getPersistenceContext().setValue(SYNONYMFROM, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrSynonymConfig.synonymTo</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the synonymTo
	 */
	public void setSynonymTo(final String value)
	{
		_synonymTo = getPersistenceContext().setValue(SYNONYMTO, value);
	}
	
}
