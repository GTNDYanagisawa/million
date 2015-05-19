/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 2015/05/18 13:25:59
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

import  de.hybris.platform.commerceservices.search.solrfacetsearch.config.IndexedTypeSort;
import de.hybris.platform.commerceservices.search.solrfacetsearch.config.IndexedTypeSort;
import de.hybris.platform.core.model.type.ComposedTypeModel;
import de.hybris.platform.solrfacetsearch.config.IndexOperation;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.IndexedTypeFlexibleSearchQuery;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IndexedType  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>IndexedType.composedType</code> property defined at extension <code>solrfacetsearch</code>. */
	private ComposedTypeModel composedType;
	/** <i>Generated property</i> for <code>IndexedType.solrResultConverter</code> property defined at extension <code>solrfacetsearch</code>. */
	private String solrResultConverter;
	/** <i>Generated property</i> for <code>IndexedType.indexNameFromConfig</code> property defined at extension <code>solrfacetsearch</code>. */
	private String indexNameFromConfig;
	/** <i>Generated property</i> for <code>IndexedType.fieldsValuesProvider</code> property defined at extension <code>solrfacetsearch</code>. */
	private String fieldsValuesProvider;
	/** <i>Generated property</i> for <code>IndexedType.code</code> property defined at extension <code>solrfacetsearch</code>. */
	private String code;
	/** <i>Generated property</i> for <code>IndexedType.indexedProperties</code> property defined at extension <code>solrfacetsearch</code>. */
	private Map<String,IndexedProperty> indexedProperties;
	/** <i>Generated property</i> for <code>IndexedType.modelLoader</code> property defined at extension <code>solrfacetsearch</code>. */
	private String modelLoader;
	/** <i>Generated property</i> for <code>IndexedType.uniqueIndexedTypeCode</code> property defined at extension <code>solrfacetsearch</code>. */
	private String uniqueIndexedTypeCode;
	/** <i>Generated property</i> for <code>IndexedType.variant</code> property defined at extension <code>solrfacetsearch</code>. */
	private boolean variant;
	/** <i>Generated property</i> for <code>IndexedType.flexibleSearchQueries</code> property defined at extension <code>solrfacetsearch</code>. */
	private Map<IndexOperation,IndexedTypeFlexibleSearchQuery> flexibleSearchQueries;
	/** <i>Generated property</i> for <code>IndexedType.typeFacets</code> property defined at extension <code>solrfacetsearch</code>. */
	private Set<String> typeFacets;
	/** <i>Generated property</i> for <code>IndexedType.sortsByCode</code> property defined at extension <code>commerceservices</code>. */
	private Map<String,IndexedTypeSort> sortsByCode;
	/** <i>Generated property</i> for <code>IndexedType.indexName</code> property defined at extension <code>solrfacetsearch</code>. */
	private String indexName;
	/** <i>Generated property</i> for <code>IndexedType.identityProvider</code> property defined at extension <code>solrfacetsearch</code>. */
	private String identityProvider;
	/** <i>Generated property</i> for <code>IndexedType.staged</code> property defined at extension <code>solrfacetsearch</code>. */
	private boolean staged;
	/** <i>Generated property</i> for <code>IndexedType.sorts</code> property defined at extension <code>commerceservices</code>. */
	private List<IndexedTypeSort> sorts;
		
	public IndexedType()
	{
		// default constructor
	}
	
		
	public void setComposedType(final ComposedTypeModel composedType)
	{
		this.composedType = composedType;
	}
	
		
	public ComposedTypeModel getComposedType() 
	{
		return composedType;
	}
		
		
	public void setSolrResultConverter(final String solrResultConverter)
	{
		this.solrResultConverter = solrResultConverter;
	}
	
		
	public String getSolrResultConverter() 
	{
		return solrResultConverter;
	}
		
		
	public void setIndexNameFromConfig(final String indexNameFromConfig)
	{
		this.indexNameFromConfig = indexNameFromConfig;
	}
	
		
	public String getIndexNameFromConfig() 
	{
		return indexNameFromConfig;
	}
		
		
	public void setFieldsValuesProvider(final String fieldsValuesProvider)
	{
		this.fieldsValuesProvider = fieldsValuesProvider;
	}
	
		
	public String getFieldsValuesProvider() 
	{
		return fieldsValuesProvider;
	}
		
		
	public void setCode(final String code)
	{
		this.code = code;
	}
	
		
	public String getCode() 
	{
		return code;
	}
		
		
	public void setIndexedProperties(final Map<String,IndexedProperty> indexedProperties)
	{
		this.indexedProperties = indexedProperties;
	}
	
		
	public Map<String,IndexedProperty> getIndexedProperties() 
	{
		return indexedProperties;
	}
		
		
	public void setModelLoader(final String modelLoader)
	{
		this.modelLoader = modelLoader;
	}
	
		
	public String getModelLoader() 
	{
		return modelLoader;
	}
		
		
	public void setUniqueIndexedTypeCode(final String uniqueIndexedTypeCode)
	{
		this.uniqueIndexedTypeCode = uniqueIndexedTypeCode;
	}
	
		
	public String getUniqueIndexedTypeCode() 
	{
		return uniqueIndexedTypeCode;
	}
		
		
	public void setVariant(final boolean variant)
	{
		this.variant = variant;
	}
	
		
	public boolean isVariant() 
	{
		return variant;
	}
		
		
	public void setFlexibleSearchQueries(final Map<IndexOperation,IndexedTypeFlexibleSearchQuery> flexibleSearchQueries)
	{
		this.flexibleSearchQueries = flexibleSearchQueries;
	}
	
		
	public Map<IndexOperation,IndexedTypeFlexibleSearchQuery> getFlexibleSearchQueries() 
	{
		return flexibleSearchQueries;
	}
		
		
	public void setTypeFacets(final Set<String> typeFacets)
	{
		this.typeFacets = typeFacets;
	}
	
		
	public Set<String> getTypeFacets() 
	{
		return typeFacets;
	}
		
		
	public void setSortsByCode(final Map<String,IndexedTypeSort> sortsByCode)
	{
		this.sortsByCode = sortsByCode;
	}
	
		
	public Map<String,IndexedTypeSort> getSortsByCode() 
	{
		return sortsByCode;
	}
		
		
	public void setIndexName(final String indexName)
	{
		this.indexName = indexName;
	}
	
		
	public String getIndexName() 
	{
		return indexName;
	}
		
		
	public void setIdentityProvider(final String identityProvider)
	{
		this.identityProvider = identityProvider;
	}
	
		
	public String getIdentityProvider() 
	{
		return identityProvider;
	}
		
		
	public void setStaged(final boolean staged)
	{
		this.staged = staged;
	}
	
		
	public boolean isStaged() 
	{
		return staged;
	}
		
		
	public void setSorts(final List<IndexedTypeSort> sorts)
	{
		this.sorts = sorts;
	}
	
		
	public List<IndexedTypeSort> getSorts() 
	{
		return sorts;
	}
		
	
}