/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 2015/05/18 13:26:00
 * ----------------------------------------------------------------
 *
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package de.hybris.platform.solrfacetsearch.config;

import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.solrfacetsearch.config.IndexedType;
import de.hybris.platform.solrfacetsearch.enums.IndexMode;
import java.util.Collection;
import java.util.Map;

public class IndexConfig  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>IndexConfig.languages</code> property defined at extension <code>solrfacetsearch</code>. */
	private Collection<LanguageModel> languages;
	/** <i>Generated property</i> for <code>IndexConfig.currencies</code> property defined at extension <code>solrfacetsearch</code>. */
	private Collection<CurrencyModel> currencies;
	/** <i>Generated property</i> for <code>IndexConfig.catalogVersions</code> property defined at extension <code>solrfacetsearch</code>. */
	private Collection<CatalogVersionModel> catalogVersions;
	/** <i>Generated property</i> for <code>IndexConfig.batchSize</code> property defined at extension <code>solrfacetsearch</code>. */
	private int batchSize;
	/** <i>Generated property</i> for <code>IndexConfig.baseSite</code> property defined at extension <code>commerceservices</code>. */
	private BaseSiteModel baseSite;
	/** <i>Generated property</i> for <code>IndexConfig.exportPath</code> property defined at extension <code>solrfacetsearch</code>. */
	private String exportPath;
	/** <i>Generated property</i> for <code>IndexConfig.indexedTypes</code> property defined at extension <code>solrfacetsearch</code>. */
	private Map<String,IndexedType> indexedTypes;
	/** <i>Generated property</i> for <code>IndexConfig.indexMode</code> property defined at extension <code>solrfacetsearch</code>. */
	private IndexMode indexMode;
	/** <i>Generated property</i> for <code>IndexConfig.numberOfThreads</code> property defined at extension <code>solrfacetsearch</code>. */
	private int numberOfThreads;
	/** <i>Generated property</i> for <code>IndexConfig.enabledLanguageFallbackMechanism</code> property defined at extension <code>solrfacetsearch</code>. */
	private boolean enabledLanguageFallbackMechanism;
		
	public IndexConfig()
	{
		// default constructor
	}
	
		
	public void setLanguages(final Collection<LanguageModel> languages)
	{
		this.languages = languages;
	}
	
		
	public Collection<LanguageModel> getLanguages() 
	{
		return languages;
	}
		
		
	public void setCurrencies(final Collection<CurrencyModel> currencies)
	{
		this.currencies = currencies;
	}
	
		
	public Collection<CurrencyModel> getCurrencies() 
	{
		return currencies;
	}
		
		
	public void setCatalogVersions(final Collection<CatalogVersionModel> catalogVersions)
	{
		this.catalogVersions = catalogVersions;
	}
	
		
	public Collection<CatalogVersionModel> getCatalogVersions() 
	{
		return catalogVersions;
	}
		
		
	public void setBatchSize(final int batchSize)
	{
		this.batchSize = batchSize;
	}
	
		
	public int getBatchSize() 
	{
		return batchSize;
	}
		
		
	public void setBaseSite(final BaseSiteModel baseSite)
	{
		this.baseSite = baseSite;
	}
	
		
	public BaseSiteModel getBaseSite() 
	{
		return baseSite;
	}
		
		
	public void setExportPath(final String exportPath)
	{
		this.exportPath = exportPath;
	}
	
		
	public String getExportPath() 
	{
		return exportPath;
	}
		
		
	public void setIndexedTypes(final Map<String,IndexedType> indexedTypes)
	{
		this.indexedTypes = indexedTypes;
	}
	
		
	public Map<String,IndexedType> getIndexedTypes() 
	{
		return indexedTypes;
	}
		
		
	public void setIndexMode(final IndexMode indexMode)
	{
		this.indexMode = indexMode;
	}
	
		
	public IndexMode getIndexMode() 
	{
		return indexMode;
	}
		
		
	public void setNumberOfThreads(final int numberOfThreads)
	{
		this.numberOfThreads = numberOfThreads;
	}
	
		
	public int getNumberOfThreads() 
	{
		return numberOfThreads;
	}
		
		
	public void setEnabledLanguageFallbackMechanism(final boolean enabledLanguageFallbackMechanism)
	{
		this.enabledLanguageFallbackMechanism = enabledLanguageFallbackMechanism;
	}
	
		
	public boolean isEnabledLanguageFallbackMechanism() 
	{
		return enabledLanguageFallbackMechanism;
	}
		
	
}