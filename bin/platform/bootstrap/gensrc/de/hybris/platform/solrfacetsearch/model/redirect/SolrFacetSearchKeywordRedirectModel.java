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
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.solrfacetsearch.enums.KeywordRedirectMatchType;
import de.hybris.platform.solrfacetsearch.model.config.SolrFacetSearchConfigModel;
import de.hybris.platform.solrfacetsearch.model.redirect.SolrAbstractKeywordRedirectModel;

/**
 * Generated model class for type SolrFacetSearchKeywordRedirect first defined at extension solrfacetsearch.
 */
@SuppressWarnings("all")
public class SolrFacetSearchKeywordRedirectModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SolrFacetSearchKeywordRedirect";
	
	/**<i>Generated relation code constant for relation <code>SolrFacetSearchConfig2SolrFacetSearchKeywordRedirect</code> defining source attribute <code>facetSearchConfig</code> in extension <code>solrfacetsearch</code>.</i>*/
	public final static String _SOLRFACETSEARCHCONFIG2SOLRFACETSEARCHKEYWORDREDIRECT = "SolrFacetSearchConfig2SolrFacetSearchKeywordRedirect";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetSearchKeywordRedirect.language</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String LANGUAGE = "language";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetSearchKeywordRedirect.keyword</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String KEYWORD = "keyword";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetSearchKeywordRedirect.matchType</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String MATCHTYPE = "matchType";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetSearchKeywordRedirect.ignoreCase</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String IGNORECASE = "ignoreCase";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetSearchKeywordRedirect.redirect</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String REDIRECT = "redirect";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetSearchKeywordRedirect.facetSearchConfig</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String FACETSEARCHCONFIG = "facetSearchConfig";
	
	
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchKeywordRedirect.language</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private LanguageModel _language;
	
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchKeywordRedirect.keyword</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _keyword;
	
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchKeywordRedirect.matchType</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private KeywordRedirectMatchType _matchType;
	
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchKeywordRedirect.ignoreCase</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Boolean _ignoreCase;
	
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchKeywordRedirect.redirect</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private SolrAbstractKeywordRedirectModel _redirect;
	
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchKeywordRedirect.facetSearchConfig</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private SolrFacetSearchConfigModel _facetSearchConfig;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SolrFacetSearchKeywordRedirectModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SolrFacetSearchKeywordRedirectModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _keyword initial attribute declared by type <code>SolrFacetSearchKeywordRedirect</code> at extension <code>solrfacetsearch</code>
	 * @param _language initial attribute declared by type <code>SolrFacetSearchKeywordRedirect</code> at extension <code>solrfacetsearch</code>
	 * @param _redirect initial attribute declared by type <code>SolrFacetSearchKeywordRedirect</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrFacetSearchKeywordRedirectModel(final String _keyword, final LanguageModel _language, final SolrAbstractKeywordRedirectModel _redirect)
	{
		super();
		setKeyword(_keyword);
		setLanguage(_language);
		setRedirect(_redirect);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _keyword initial attribute declared by type <code>SolrFacetSearchKeywordRedirect</code> at extension <code>solrfacetsearch</code>
	 * @param _language initial attribute declared by type <code>SolrFacetSearchKeywordRedirect</code> at extension <code>solrfacetsearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _redirect initial attribute declared by type <code>SolrFacetSearchKeywordRedirect</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrFacetSearchKeywordRedirectModel(final String _keyword, final LanguageModel _language, final ItemModel _owner, final SolrAbstractKeywordRedirectModel _redirect)
	{
		super();
		setKeyword(_keyword);
		setLanguage(_language);
		setOwner(_owner);
		setRedirect(_redirect);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchKeywordRedirect.facetSearchConfig</code> attribute defined at extension <code>solrfacetsearch</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchKeywordRedirect.ignoreCase</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the ignoreCase
	 */
	public Boolean getIgnoreCase()
	{
		if (this._ignoreCase!=null)
		{
			return _ignoreCase;
		}
		return _ignoreCase = getPersistenceContext().getValue(IGNORECASE, _ignoreCase);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchKeywordRedirect.keyword</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the keyword
	 */
	public String getKeyword()
	{
		if (this._keyword!=null)
		{
			return _keyword;
		}
		return _keyword = getPersistenceContext().getValue(KEYWORD, _keyword);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchKeywordRedirect.language</code> attribute defined at extension <code>solrfacetsearch</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchKeywordRedirect.matchType</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the matchType
	 */
	public KeywordRedirectMatchType getMatchType()
	{
		if (this._matchType!=null)
		{
			return _matchType;
		}
		return _matchType = getPersistenceContext().getValue(MATCHTYPE, _matchType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchKeywordRedirect.redirect</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the redirect
	 */
	public SolrAbstractKeywordRedirectModel getRedirect()
	{
		if (this._redirect!=null)
		{
			return _redirect;
		}
		return _redirect = getPersistenceContext().getValue(REDIRECT, _redirect);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetSearchKeywordRedirect.facetSearchConfig</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the facetSearchConfig
	 */
	public void setFacetSearchConfig(final SolrFacetSearchConfigModel value)
	{
		_facetSearchConfig = getPersistenceContext().setValue(FACETSEARCHCONFIG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetSearchKeywordRedirect.ignoreCase</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the ignoreCase
	 */
	public void setIgnoreCase(final Boolean value)
	{
		_ignoreCase = getPersistenceContext().setValue(IGNORECASE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetSearchKeywordRedirect.keyword</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the keyword
	 */
	public void setKeyword(final String value)
	{
		_keyword = getPersistenceContext().setValue(KEYWORD, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetSearchKeywordRedirect.language</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the language
	 */
	public void setLanguage(final LanguageModel value)
	{
		_language = getPersistenceContext().setValue(LANGUAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetSearchKeywordRedirect.matchType</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the matchType
	 */
	public void setMatchType(final KeywordRedirectMatchType value)
	{
		_matchType = getPersistenceContext().setValue(MATCHTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetSearchKeywordRedirect.redirect</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the redirect
	 */
	public void setRedirect(final SolrAbstractKeywordRedirectModel value)
	{
		_redirect = getPersistenceContext().setValue(REDIRECT, value);
	}
	
}
