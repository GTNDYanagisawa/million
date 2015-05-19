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
package de.hybris.platform.core.model.c2l;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.C2LItemModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.solrfacetsearch.model.config.SolrFacetSearchConfigModel;
import de.hybris.platform.solrfacetsearch.model.config.SolrStopWordModel;
import de.hybris.platform.solrfacetsearch.model.config.SolrSynonymConfigModel;
import de.hybris.platform.store.BaseStoreModel;
import java.util.Collection;
import java.util.List;

/**
 * Generated model class for type Language first defined at extension core.
 */
@SuppressWarnings("all")
public class LanguageModel extends C2LItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "Language";
	
	/**<i>Generated relation code constant for relation <code>SolrFacetSearchConfig2LanguageRelation</code> defining source attribute <code>facetSearchConfigs</code> in extension <code>solrfacetsearch</code>.</i>*/
	public final static String _SOLRFACETSEARCHCONFIG2LANGUAGERELATION = "SolrFacetSearchConfig2LanguageRelation";
	
	/**<i>Generated relation code constant for relation <code>SolrSynonymConfig2Language</code> defining source attribute <code>synonyms</code> in extension <code>solrfacetsearch</code>.</i>*/
	public final static String _SOLRSYNONYMCONFIG2LANGUAGE = "SolrSynonymConfig2Language";
	
	/**<i>Generated relation code constant for relation <code>SolrStopWord2Language</code> defining source attribute <code>StopWords</code> in extension <code>solrfacetsearch</code>.</i>*/
	public final static String _SOLRSTOPWORD2LANGUAGE = "SolrStopWord2Language";
	
	/**<i>Generated relation code constant for relation <code>BaseStore2LanguageRel</code> defining source attribute <code>baseStores</code> in extension <code>commerceservices</code>.</i>*/
	public final static String _BASESTORE2LANGUAGEREL = "BaseStore2LanguageRel";
	
	/** <i>Generated constant</i> - Attribute key of <code>Language.fallbackLanguages</code> attribute defined at extension <code>core</code>. */
	public static final String FALLBACKLANGUAGES = "fallbackLanguages";
	
	/** <i>Generated constant</i> - Attribute key of <code>Language.facetSearchConfigs</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String FACETSEARCHCONFIGS = "facetSearchConfigs";
	
	/** <i>Generated constant</i> - Attribute key of <code>Language.synonyms</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String SYNONYMS = "synonyms";
	
	/** <i>Generated constant</i> - Attribute key of <code>Language.StopWords</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String STOPWORDS = "StopWords";
	
	/** <i>Generated constant</i> - Attribute key of <code>Language.baseStores</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String BASESTORES = "baseStores";
	
	
	/** <i>Generated variable</i> - Variable of <code>Language.fallbackLanguages</code> attribute defined at extension <code>core</code>. */
	private List<LanguageModel> _fallbackLanguages;
	
	/** <i>Generated variable</i> - Variable of <code>Language.facetSearchConfigs</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private List<SolrFacetSearchConfigModel> _facetSearchConfigs;
	
	/** <i>Generated variable</i> - Variable of <code>Language.synonyms</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private List<SolrSynonymConfigModel> _synonyms;
	
	/** <i>Generated variable</i> - Variable of <code>Language.StopWords</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private List<SolrStopWordModel> _StopWords;
	
	/** <i>Generated variable</i> - Variable of <code>Language.baseStores</code> attribute defined at extension <code>commerceservices</code>. */
	private Collection<BaseStoreModel> _baseStores;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public LanguageModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public LanguageModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _isocode initial attribute declared by type <code>Language</code> at extension <code>core</code>
	 */
	@Deprecated
	public LanguageModel(final String _isocode)
	{
		super();
		setIsocode(_isocode);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _isocode initial attribute declared by type <code>Language</code> at extension <code>core</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public LanguageModel(final String _isocode, final ItemModel _owner)
	{
		super();
		setIsocode(_isocode);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Language.baseStores</code> attribute defined at extension <code>commerceservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the baseStores
	 */
	public Collection<BaseStoreModel> getBaseStores()
	{
		if (this._baseStores!=null)
		{
			return _baseStores;
		}
		return _baseStores = getPersistenceContext().getValue(BASESTORES, _baseStores);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Language.facetSearchConfigs</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the facetSearchConfigs
	 */
	public List<SolrFacetSearchConfigModel> getFacetSearchConfigs()
	{
		if (this._facetSearchConfigs!=null)
		{
			return _facetSearchConfigs;
		}
		return _facetSearchConfigs = getPersistenceContext().getValue(FACETSEARCHCONFIGS, _facetSearchConfigs);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Language.fallbackLanguages</code> attribute defined at extension <code>core</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the fallbackLanguages
	 */
	public List<LanguageModel> getFallbackLanguages()
	{
		if (this._fallbackLanguages!=null)
		{
			return _fallbackLanguages;
		}
		return _fallbackLanguages = getPersistenceContext().getValue(FALLBACKLANGUAGES, _fallbackLanguages);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Language.StopWords</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the StopWords
	 */
	public List<SolrStopWordModel> getStopWords()
	{
		if (this._StopWords!=null)
		{
			return _StopWords;
		}
		return _StopWords = getPersistenceContext().getValue(STOPWORDS, _StopWords);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Language.synonyms</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the synonyms
	 */
	public List<SolrSynonymConfigModel> getSynonyms()
	{
		if (this._synonyms!=null)
		{
			return _synonyms;
		}
		return _synonyms = getPersistenceContext().getValue(SYNONYMS, _synonyms);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Language.baseStores</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the baseStores
	 */
	public void setBaseStores(final Collection<BaseStoreModel> value)
	{
		_baseStores = getPersistenceContext().setValue(BASESTORES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Language.facetSearchConfigs</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the facetSearchConfigs
	 */
	public void setFacetSearchConfigs(final List<SolrFacetSearchConfigModel> value)
	{
		_facetSearchConfigs = getPersistenceContext().setValue(FACETSEARCHCONFIGS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Language.fallbackLanguages</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the fallbackLanguages
	 */
	public void setFallbackLanguages(final List<LanguageModel> value)
	{
		_fallbackLanguages = getPersistenceContext().setValue(FALLBACKLANGUAGES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Language.StopWords</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the StopWords
	 */
	public void setStopWords(final List<SolrStopWordModel> value)
	{
		_StopWords = getPersistenceContext().setValue(STOPWORDS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Language.synonyms</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the synonyms
	 */
	public void setSynonyms(final List<SolrSynonymConfigModel> value)
	{
		_synonyms = getPersistenceContext().setValue(SYNONYMS, value);
	}
	
}
