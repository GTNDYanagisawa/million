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

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexConfigModel;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexedTypeModel;
import de.hybris.platform.solrfacetsearch.model.config.SolrSearchConfigModel;
import de.hybris.platform.solrfacetsearch.model.config.SolrServerConfigModel;
import de.hybris.platform.solrfacetsearch.model.config.SolrStopWordModel;
import de.hybris.platform.solrfacetsearch.model.config.SolrSynonymConfigModel;
import de.hybris.platform.solrfacetsearch.model.config.SolrValueRangeSetModel;
import de.hybris.platform.solrfacetsearch.model.cron.SolrUpdateStopWordsCronJobModel;
import de.hybris.platform.solrfacetsearch.model.cron.SolrUpdateSynonymsCronJobModel;
import de.hybris.platform.solrfacetsearch.model.indexer.cron.SolrIndexerCronJobModel;
import de.hybris.platform.solrfacetsearch.model.redirect.SolrFacetSearchKeywordRedirectModel;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/**
 * Generated model class for type SolrFacetSearchConfig first defined at extension solrfacetsearch.
 */
@SuppressWarnings("all")
public class SolrFacetSearchConfigModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SolrFacetSearchConfig";
	
	/**<i>Generated relation code constant for relation <code>SolrSynonymConfig2SolrFacetSearchConfig</code> defining source attribute <code>synonyms</code> in extension <code>solrfacetsearch</code>.</i>*/
	public final static String _SOLRSYNONYMCONFIG2SOLRFACETSEARCHCONFIG = "SolrSynonymConfig2SolrFacetSearchConfig";
	
	/**<i>Generated relation code constant for relation <code>SolrStopWord2SolrFacetSearchConfig</code> defining source attribute <code>StopWords</code> in extension <code>solrfacetsearch</code>.</i>*/
	public final static String _SOLRSTOPWORD2SOLRFACETSEARCHCONFIG = "SolrStopWord2SolrFacetSearchConfig";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetSearchConfig.name</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetSearchConfig.description</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String DESCRIPTION = "description";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetSearchConfig.document</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String DOCUMENT = "document";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetSearchConfig.solrSearchConfig</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String SOLRSEARCHCONFIG = "solrSearchConfig";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetSearchConfig.solrIndexConfig</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String SOLRINDEXCONFIG = "solrIndexConfig";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetSearchConfig.solrServerConfig</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String SOLRSERVERCONFIG = "solrServerConfig";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetSearchConfig.indexNamePrefix</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String INDEXNAMEPREFIX = "indexNamePrefix";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetSearchConfig.languageSynonymMapping</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String LANGUAGESYNONYMMAPPING = "languageSynonymMapping";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetSearchConfig.languageStopWordMapping</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String LANGUAGESTOPWORDMAPPING = "languageStopWordMapping";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetSearchConfig.languageKeywordRedirectMapping</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String LANGUAGEKEYWORDREDIRECTMAPPING = "languageKeywordRedirectMapping";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetSearchConfig.enabledLanguageFallbackMechanism</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String ENABLEDLANGUAGEFALLBACKMECHANISM = "enabledLanguageFallbackMechanism";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetSearchConfig.catalogVersions</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String CATALOGVERSIONS = "catalogVersions";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetSearchConfig.currencies</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String CURRENCIES = "currencies";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetSearchConfig.languages</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String LANGUAGES = "languages";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetSearchConfig.solrValueRangeSets</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String SOLRVALUERANGESETS = "solrValueRangeSets";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetSearchConfig.solrIndexerCronJob</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String SOLRINDEXERCRONJOB = "solrIndexerCronJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetSearchConfig.solrIndexedTypes</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String SOLRINDEXEDTYPES = "solrIndexedTypes";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetSearchConfig.keywordRedirects</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String KEYWORDREDIRECTS = "keywordRedirects";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetSearchConfig.solrUpdateSynonymsCronJobs</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String SOLRUPDATESYNONYMSCRONJOBS = "solrUpdateSynonymsCronJobs";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetSearchConfig.solrUpdateStopWordsCronJobs</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String SOLRUPDATESTOPWORDSCRONJOBS = "solrUpdateStopWordsCronJobs";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetSearchConfig.synonyms</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String SYNONYMS = "synonyms";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrFacetSearchConfig.StopWords</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String STOPWORDS = "StopWords";
	
	
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.name</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _name;
	
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.description</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _description;
	
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.document</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private MediaModel _document;
	
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.solrSearchConfig</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private SolrSearchConfigModel _solrSearchConfig;
	
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.solrIndexConfig</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private SolrIndexConfigModel _solrIndexConfig;
	
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.solrServerConfig</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private SolrServerConfigModel _solrServerConfig;
	
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.indexNamePrefix</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _indexNamePrefix;
	
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.enabledLanguageFallbackMechanism</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Boolean _enabledLanguageFallbackMechanism;
	
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.catalogVersions</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private List<CatalogVersionModel> _catalogVersions;
	
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.currencies</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private List<CurrencyModel> _currencies;
	
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.languages</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private List<LanguageModel> _languages;
	
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.solrValueRangeSets</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private List<SolrValueRangeSetModel> _solrValueRangeSets;
	
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.solrIndexerCronJob</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private List<SolrIndexerCronJobModel> _solrIndexerCronJob;
	
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.solrIndexedTypes</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private List<SolrIndexedTypeModel> _solrIndexedTypes;
	
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.keywordRedirects</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Collection<SolrFacetSearchKeywordRedirectModel> _keywordRedirects;
	
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.solrUpdateSynonymsCronJobs</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private List<SolrUpdateSynonymsCronJobModel> _solrUpdateSynonymsCronJobs;
	
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.solrUpdateStopWordsCronJobs</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private List<SolrUpdateStopWordsCronJobModel> _solrUpdateStopWordsCronJobs;
	
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.synonyms</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private List<SolrSynonymConfigModel> _synonyms;
	
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.StopWords</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private List<SolrStopWordModel> _StopWords;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SolrFacetSearchConfigModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SolrFacetSearchConfigModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _enabledLanguageFallbackMechanism initial attribute declared by type <code>SolrFacetSearchConfig</code> at extension <code>solrfacetsearch</code>
	 * @param _name initial attribute declared by type <code>SolrFacetSearchConfig</code> at extension <code>solrfacetsearch</code>
	 * @param _solrSearchConfig initial attribute declared by type <code>SolrFacetSearchConfig</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrFacetSearchConfigModel(final boolean _enabledLanguageFallbackMechanism, final String _name, final SolrSearchConfigModel _solrSearchConfig)
	{
		super();
		setEnabledLanguageFallbackMechanism(_enabledLanguageFallbackMechanism);
		setName(_name);
		setSolrSearchConfig(_solrSearchConfig);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _enabledLanguageFallbackMechanism initial attribute declared by type <code>SolrFacetSearchConfig</code> at extension <code>solrfacetsearch</code>
	 * @param _name initial attribute declared by type <code>SolrFacetSearchConfig</code> at extension <code>solrfacetsearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _solrSearchConfig initial attribute declared by type <code>SolrFacetSearchConfig</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrFacetSearchConfigModel(final boolean _enabledLanguageFallbackMechanism, final String _name, final ItemModel _owner, final SolrSearchConfigModel _solrSearchConfig)
	{
		super();
		setEnabledLanguageFallbackMechanism(_enabledLanguageFallbackMechanism);
		setName(_name);
		setOwner(_owner);
		setSolrSearchConfig(_solrSearchConfig);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchConfig.catalogVersions</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the catalogVersions
	 */
	public List<CatalogVersionModel> getCatalogVersions()
	{
		if (this._catalogVersions!=null)
		{
			return _catalogVersions;
		}
		return _catalogVersions = getPersistenceContext().getValue(CATALOGVERSIONS, _catalogVersions);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchConfig.currencies</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the currencies
	 */
	public List<CurrencyModel> getCurrencies()
	{
		if (this._currencies!=null)
		{
			return _currencies;
		}
		return _currencies = getPersistenceContext().getValue(CURRENCIES, _currencies);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchConfig.description</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the description - description of the Config
	 */
	public String getDescription()
	{
		if (this._description!=null)
		{
			return _description;
		}
		return _description = getPersistenceContext().getValue(DESCRIPTION, _description);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchConfig.document</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the document - non hmc-configurable part of FacetSearchConfig.
	 */
	@Deprecated
	public MediaModel getDocument()
	{
		if (this._document!=null)
		{
			return _document;
		}
		return _document = getPersistenceContext().getValue(DOCUMENT, _document);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchConfig.indexNamePrefix</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the indexNamePrefix
	 */
	public String getIndexNamePrefix()
	{
		if (this._indexNamePrefix!=null)
		{
			return _indexNamePrefix;
		}
		return _indexNamePrefix = getPersistenceContext().getValue(INDEXNAMEPREFIX, _indexNamePrefix);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchConfig.keywordRedirects</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the keywordRedirects
	 */
	public Collection<SolrFacetSearchKeywordRedirectModel> getKeywordRedirects()
	{
		if (this._keywordRedirects!=null)
		{
			return _keywordRedirects;
		}
		return _keywordRedirects = getPersistenceContext().getValue(KEYWORDREDIRECTS, _keywordRedirects);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchConfig.languageKeywordRedirectMapping</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the languageKeywordRedirectMapping
	 */
	public List<SolrFacetSearchKeywordRedirectModel> getLanguageKeywordRedirectMapping()
	{
		return getLanguageKeywordRedirectMapping(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchConfig.languageKeywordRedirectMapping</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @param loc the value localization key 
	 * @return the languageKeywordRedirectMapping
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public List<SolrFacetSearchKeywordRedirectModel> getLanguageKeywordRedirectMapping(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(LANGUAGEKEYWORDREDIRECTMAPPING, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchConfig.languages</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the languages
	 */
	public List<LanguageModel> getLanguages()
	{
		if (this._languages!=null)
		{
			return _languages;
		}
		return _languages = getPersistenceContext().getValue(LANGUAGES, _languages);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchConfig.languageStopWordMapping</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the languageStopWordMapping
	 */
	public List<SolrStopWordModel> getLanguageStopWordMapping()
	{
		return getLanguageStopWordMapping(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchConfig.languageStopWordMapping</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @param loc the value localization key 
	 * @return the languageStopWordMapping
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public List<SolrStopWordModel> getLanguageStopWordMapping(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(LANGUAGESTOPWORDMAPPING, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchConfig.languageSynonymMapping</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the languageSynonymMapping
	 */
	public List<SolrSynonymConfigModel> getLanguageSynonymMapping()
	{
		return getLanguageSynonymMapping(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchConfig.languageSynonymMapping</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @param loc the value localization key 
	 * @return the languageSynonymMapping
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public List<SolrSynonymConfigModel> getLanguageSynonymMapping(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(LANGUAGESYNONYMMAPPING, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchConfig.name</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the name - name of the Config
	 */
	public String getName()
	{
		if (this._name!=null)
		{
			return _name;
		}
		return _name = getPersistenceContext().getValue(NAME, _name);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchConfig.solrIndexConfig</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the solrIndexConfig
	 */
	public SolrIndexConfigModel getSolrIndexConfig()
	{
		if (this._solrIndexConfig!=null)
		{
			return _solrIndexConfig;
		}
		return _solrIndexConfig = getPersistenceContext().getValue(SOLRINDEXCONFIG, _solrIndexConfig);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchConfig.solrIndexedTypes</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the solrIndexedTypes
	 */
	public List<SolrIndexedTypeModel> getSolrIndexedTypes()
	{
		if (this._solrIndexedTypes!=null)
		{
			return _solrIndexedTypes;
		}
		return _solrIndexedTypes = getPersistenceContext().getValue(SOLRINDEXEDTYPES, _solrIndexedTypes);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchConfig.solrIndexerCronJob</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the solrIndexerCronJob
	 */
	public List<SolrIndexerCronJobModel> getSolrIndexerCronJob()
	{
		if (this._solrIndexerCronJob!=null)
		{
			return _solrIndexerCronJob;
		}
		return _solrIndexerCronJob = getPersistenceContext().getValue(SOLRINDEXERCRONJOB, _solrIndexerCronJob);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchConfig.solrSearchConfig</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the solrSearchConfig
	 */
	public SolrSearchConfigModel getSolrSearchConfig()
	{
		if (this._solrSearchConfig!=null)
		{
			return _solrSearchConfig;
		}
		return _solrSearchConfig = getPersistenceContext().getValue(SOLRSEARCHCONFIG, _solrSearchConfig);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchConfig.solrServerConfig</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the solrServerConfig
	 */
	public SolrServerConfigModel getSolrServerConfig()
	{
		if (this._solrServerConfig!=null)
		{
			return _solrServerConfig;
		}
		return _solrServerConfig = getPersistenceContext().getValue(SOLRSERVERCONFIG, _solrServerConfig);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchConfig.solrUpdateStopWordsCronJobs</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the solrUpdateStopWordsCronJobs
	 */
	public List<SolrUpdateStopWordsCronJobModel> getSolrUpdateStopWordsCronJobs()
	{
		if (this._solrUpdateStopWordsCronJobs!=null)
		{
			return _solrUpdateStopWordsCronJobs;
		}
		return _solrUpdateStopWordsCronJobs = getPersistenceContext().getValue(SOLRUPDATESTOPWORDSCRONJOBS, _solrUpdateStopWordsCronJobs);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchConfig.solrUpdateSynonymsCronJobs</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the solrUpdateSynonymsCronJobs
	 */
	public List<SolrUpdateSynonymsCronJobModel> getSolrUpdateSynonymsCronJobs()
	{
		if (this._solrUpdateSynonymsCronJobs!=null)
		{
			return _solrUpdateSynonymsCronJobs;
		}
		return _solrUpdateSynonymsCronJobs = getPersistenceContext().getValue(SOLRUPDATESYNONYMSCRONJOBS, _solrUpdateSynonymsCronJobs);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchConfig.solrValueRangeSets</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the solrValueRangeSets
	 */
	public List<SolrValueRangeSetModel> getSolrValueRangeSets()
	{
		if (this._solrValueRangeSets!=null)
		{
			return _solrValueRangeSets;
		}
		return _solrValueRangeSets = getPersistenceContext().getValue(SOLRVALUERANGESETS, _solrValueRangeSets);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchConfig.StopWords</code> attribute defined at extension <code>solrfacetsearch</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchConfig.synonyms</code> attribute defined at extension <code>solrfacetsearch</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchConfig.enabledLanguageFallbackMechanism</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the enabledLanguageFallbackMechanism
	 */
	public boolean isEnabledLanguageFallbackMechanism()
	{
		return toPrimitive( _enabledLanguageFallbackMechanism = getPersistenceContext().getValue(ENABLEDLANGUAGEFALLBACKMECHANISM, _enabledLanguageFallbackMechanism));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetSearchConfig.catalogVersions</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the catalogVersions
	 */
	public void setCatalogVersions(final List<CatalogVersionModel> value)
	{
		_catalogVersions = getPersistenceContext().setValue(CATALOGVERSIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetSearchConfig.currencies</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the currencies
	 */
	public void setCurrencies(final List<CurrencyModel> value)
	{
		_currencies = getPersistenceContext().setValue(CURRENCIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetSearchConfig.description</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the description - description of the Config
	 */
	public void setDescription(final String value)
	{
		_description = getPersistenceContext().setValue(DESCRIPTION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetSearchConfig.document</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the document - non hmc-configurable part of FacetSearchConfig.
	 */
	@Deprecated
	public void setDocument(final MediaModel value)
	{
		_document = getPersistenceContext().setValue(DOCUMENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetSearchConfig.enabledLanguageFallbackMechanism</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the enabledLanguageFallbackMechanism
	 */
	public void setEnabledLanguageFallbackMechanism(final boolean value)
	{
		_enabledLanguageFallbackMechanism = getPersistenceContext().setValue(ENABLEDLANGUAGEFALLBACKMECHANISM, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetSearchConfig.indexNamePrefix</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the indexNamePrefix
	 */
	public void setIndexNamePrefix(final String value)
	{
		_indexNamePrefix = getPersistenceContext().setValue(INDEXNAMEPREFIX, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetSearchConfig.keywordRedirects</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the keywordRedirects
	 */
	public void setKeywordRedirects(final Collection<SolrFacetSearchKeywordRedirectModel> value)
	{
		_keywordRedirects = getPersistenceContext().setValue(KEYWORDREDIRECTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetSearchConfig.languageKeywordRedirectMapping</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the languageKeywordRedirectMapping
	 */
	public void setLanguageKeywordRedirectMapping(final List<SolrFacetSearchKeywordRedirectModel> value)
	{
		setLanguageKeywordRedirectMapping(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetSearchConfig.languageKeywordRedirectMapping</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the languageKeywordRedirectMapping
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setLanguageKeywordRedirectMapping(final List<SolrFacetSearchKeywordRedirectModel> value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(LANGUAGEKEYWORDREDIRECTMAPPING, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetSearchConfig.languages</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the languages
	 */
	public void setLanguages(final List<LanguageModel> value)
	{
		_languages = getPersistenceContext().setValue(LANGUAGES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetSearchConfig.languageStopWordMapping</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the languageStopWordMapping
	 */
	public void setLanguageStopWordMapping(final List<SolrStopWordModel> value)
	{
		setLanguageStopWordMapping(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetSearchConfig.languageStopWordMapping</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the languageStopWordMapping
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setLanguageStopWordMapping(final List<SolrStopWordModel> value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(LANGUAGESTOPWORDMAPPING, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetSearchConfig.languageSynonymMapping</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the languageSynonymMapping
	 */
	public void setLanguageSynonymMapping(final List<SolrSynonymConfigModel> value)
	{
		setLanguageSynonymMapping(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetSearchConfig.languageSynonymMapping</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the languageSynonymMapping
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setLanguageSynonymMapping(final List<SolrSynonymConfigModel> value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(LANGUAGESYNONYMMAPPING, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>SolrFacetSearchConfig.name</code> attribute defined at extension <code>solrfacetsearch</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the name - name of the Config
	 */
	public void setName(final String value)
	{
		_name = getPersistenceContext().setValue(NAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetSearchConfig.solrIndexConfig</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the solrIndexConfig
	 */
	public void setSolrIndexConfig(final SolrIndexConfigModel value)
	{
		_solrIndexConfig = getPersistenceContext().setValue(SOLRINDEXCONFIG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetSearchConfig.solrIndexedTypes</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the solrIndexedTypes
	 */
	public void setSolrIndexedTypes(final List<SolrIndexedTypeModel> value)
	{
		_solrIndexedTypes = getPersistenceContext().setValue(SOLRINDEXEDTYPES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetSearchConfig.solrIndexerCronJob</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the solrIndexerCronJob
	 */
	public void setSolrIndexerCronJob(final List<SolrIndexerCronJobModel> value)
	{
		_solrIndexerCronJob = getPersistenceContext().setValue(SOLRINDEXERCRONJOB, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetSearchConfig.solrSearchConfig</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the solrSearchConfig
	 */
	public void setSolrSearchConfig(final SolrSearchConfigModel value)
	{
		_solrSearchConfig = getPersistenceContext().setValue(SOLRSEARCHCONFIG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetSearchConfig.solrServerConfig</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the solrServerConfig
	 */
	public void setSolrServerConfig(final SolrServerConfigModel value)
	{
		_solrServerConfig = getPersistenceContext().setValue(SOLRSERVERCONFIG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetSearchConfig.solrUpdateStopWordsCronJobs</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the solrUpdateStopWordsCronJobs
	 */
	public void setSolrUpdateStopWordsCronJobs(final List<SolrUpdateStopWordsCronJobModel> value)
	{
		_solrUpdateStopWordsCronJobs = getPersistenceContext().setValue(SOLRUPDATESTOPWORDSCRONJOBS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetSearchConfig.solrUpdateSynonymsCronJobs</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the solrUpdateSynonymsCronJobs
	 */
	public void setSolrUpdateSynonymsCronJobs(final List<SolrUpdateSynonymsCronJobModel> value)
	{
		_solrUpdateSynonymsCronJobs = getPersistenceContext().setValue(SOLRUPDATESYNONYMSCRONJOBS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetSearchConfig.solrValueRangeSets</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the solrValueRangeSets
	 */
	public void setSolrValueRangeSets(final List<SolrValueRangeSetModel> value)
	{
		_solrValueRangeSets = getPersistenceContext().setValue(SOLRVALUERANGESETS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetSearchConfig.StopWords</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the StopWords
	 */
	public void setStopWords(final List<SolrStopWordModel> value)
	{
		_StopWords = getPersistenceContext().setValue(STOPWORDS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrFacetSearchConfig.synonyms</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the synonyms
	 */
	public void setSynonyms(final List<SolrSynonymConfigModel> value)
	{
		_synonyms = getPersistenceContext().setValue(SYNONYMS, value);
	}
	
}
