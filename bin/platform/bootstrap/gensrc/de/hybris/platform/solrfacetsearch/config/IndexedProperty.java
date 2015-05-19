/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 2015/05/18 13:25:58
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

import de.hybris.platform.catalog.model.classification.ClassAttributeAssignmentModel;
import de.hybris.platform.commercesearch.model.SolrBoostRuleModel;
import de.hybris.platform.solrfacetsearch.config.FacetType;
import de.hybris.platform.solrfacetsearch.config.ValueRangeSet;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class IndexedProperty  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>IndexedProperty.facet</code> property defined at extension <code>solrfacetsearch</code>. */
	private boolean facet;
	/** <i>Generated property</i> for <code>IndexedProperty.visible</code> property defined at extension <code>commerceservices</code>. */
	private boolean visible;
	/** <i>Generated property</i> for <code>IndexedProperty.valueRangeSets</code> property defined at extension <code>solrfacetsearch</code>. */
	private Map<String,ValueRangeSet> valueRangeSets;
	/** <i>Generated property</i> for <code>IndexedProperty.valueProviderParameter</code> property defined at extension <code>solrfacetsearch</code>. */
	private String valueProviderParameter;
	/** <i>Generated property</i> for <code>IndexedProperty.type</code> property defined at extension <code>solrfacetsearch</code>. */
	private String type;
	/** <i>Generated property</i> for <code>IndexedProperty.facetDisplayNameProvider</code> property defined at extension <code>solrfacetsearch</code>. */
	private String facetDisplayNameProvider;
	/** <i>Generated property</i> for <code>IndexedProperty.categoryField</code> property defined at extension <code>commerceservices</code>. */
	private boolean categoryField;
	/** <i>Generated property</i> for <code>IndexedProperty.currency</code> property defined at extension <code>solrfacetsearch</code>. */
	private boolean currency;
	/** <i>Generated property</i> for <code>IndexedProperty.topValuesProvider</code> property defined at extension <code>commerceservices</code>. */
	private String topValuesProvider;
	/** <i>Generated property</i> for <code>IndexedProperty.facetVisibilityRules</code> property defined at extension <code>commercesearch</code>. */
	private List<? extends AbstractSolrFacetVisibilityRuleData> facetVisibilityRules;
	/** <i>Generated property</i> for <code>IndexedProperty.spellCheck</code> property defined at extension <code>solrfacetsearch</code>. */
	private boolean spellCheck;
	/** <i>Generated property</i> for <code>IndexedProperty.sortableType</code> property defined at extension <code>solrfacetsearch</code>. */
	private String sortableType;
	/** <i>Generated property</i> for <code>IndexedProperty.multiSelect</code> property defined at extension <code>commerceservices</code>. */
	private boolean multiSelect;
	/** <i>Generated property</i> for <code>IndexedProperty.priority</code> property defined at extension <code>solrfacetsearch</code>. */
	private int priority;
	/** <i>Generated property</i> for <code>IndexedProperty.name</code> property defined at extension <code>solrfacetsearch</code>. */
	private String name;
	/** <i>Generated property</i> for <code>IndexedProperty.autoSuggest</code> property defined at extension <code>solrfacetsearch</code>. */
	private boolean autoSuggest;
	/** <i>Generated property</i> for <code>IndexedProperty.exportId</code> property defined at extension <code>solrfacetsearch</code>. */
	private String exportId;
	/** <i>Generated property</i> for <code>IndexedProperty.multiValue</code> property defined at extension <code>solrfacetsearch</code>. */
	private boolean multiValue;
	/** <i>Generated property</i> for <code>IndexedProperty.facetSortProvider</code> property defined at extension <code>solrfacetsearch</code>. */
	private String facetSortProvider;
	/** <i>Generated property</i> for <code>IndexedProperty.boostRules</code> property defined at extension <code>commercesearch</code>. */
	private Collection<SolrBoostRuleModel> boostRules;
	/** <i>Generated property</i> for <code>IndexedProperty.localized</code> property defined at extension <code>solrfacetsearch</code>. */
	private boolean localized;
	/** <i>Generated property</i> for <code>IndexedProperty.classAttributeAssignment</code> property defined at extension <code>commerceservices</code>. */
	private ClassAttributeAssignmentModel classAttributeAssignment;
	/** <i>Generated property</i> for <code>IndexedProperty.facetType</code> property defined at extension <code>solrfacetsearch</code>. */
	private FacetType facetType;
	/** <i>Generated property</i> for <code>IndexedProperty.fieldValueProvider</code> property defined at extension <code>solrfacetsearch</code>. */
	private String fieldValueProvider;
	/** <i>Generated property</i> for <code>IndexedProperty.displayName</code> property defined at extension <code>commerceservices</code>. */
	private String displayName;
		
	public IndexedProperty()
	{
		// default constructor
	}
	
		
	public void setFacet(final boolean facet)
	{
		this.facet = facet;
	}
	
		
	public boolean isFacet() 
	{
		return facet;
	}
		
		
	public void setVisible(final boolean visible)
	{
		this.visible = visible;
	}
	
		
	public boolean isVisible() 
	{
		return visible;
	}
		
		
	public void setValueRangeSets(final Map<String,ValueRangeSet> valueRangeSets)
	{
		this.valueRangeSets = valueRangeSets;
	}
	
		
	public Map<String,ValueRangeSet> getValueRangeSets() 
	{
		return valueRangeSets;
	}
		
		
	public void setValueProviderParameter(final String valueProviderParameter)
	{
		this.valueProviderParameter = valueProviderParameter;
	}
	
		
	public String getValueProviderParameter() 
	{
		return valueProviderParameter;
	}
		
		
	public void setType(final String type)
	{
		this.type = type;
	}
	
		
	public String getType() 
	{
		return type;
	}
		
		
	public void setFacetDisplayNameProvider(final String facetDisplayNameProvider)
	{
		this.facetDisplayNameProvider = facetDisplayNameProvider;
	}
	
		
	public String getFacetDisplayNameProvider() 
	{
		return facetDisplayNameProvider;
	}
		
		
	public void setCategoryField(final boolean categoryField)
	{
		this.categoryField = categoryField;
	}
	
		
	public boolean isCategoryField() 
	{
		return categoryField;
	}
		
		
	public void setCurrency(final boolean currency)
	{
		this.currency = currency;
	}
	
		
	public boolean isCurrency() 
	{
		return currency;
	}
		
		
	public void setTopValuesProvider(final String topValuesProvider)
	{
		this.topValuesProvider = topValuesProvider;
	}
	
		
	public String getTopValuesProvider() 
	{
		return topValuesProvider;
	}
		
		
	public void setFacetVisibilityRules(final List<? extends AbstractSolrFacetVisibilityRuleData> facetVisibilityRules)
	{
		this.facetVisibilityRules = facetVisibilityRules;
	}
	
		
	public List<? extends AbstractSolrFacetVisibilityRuleData> getFacetVisibilityRules() 
	{
		return facetVisibilityRules;
	}
		
		
	public void setSpellCheck(final boolean spellCheck)
	{
		this.spellCheck = spellCheck;
	}
	
		
	public boolean isSpellCheck() 
	{
		return spellCheck;
	}
		
		
	public void setSortableType(final String sortableType)
	{
		this.sortableType = sortableType;
	}
	
		
	public String getSortableType() 
	{
		return sortableType;
	}
		
		
	public void setMultiSelect(final boolean multiSelect)
	{
		this.multiSelect = multiSelect;
	}
	
		
	public boolean isMultiSelect() 
	{
		return multiSelect;
	}
		
		
	public void setPriority(final int priority)
	{
		this.priority = priority;
	}
	
		
	public int getPriority() 
	{
		return priority;
	}
		
		
	public void setName(final String name)
	{
		this.name = name;
	}
	
		
	public String getName() 
	{
		return name;
	}
		
		
	public void setAutoSuggest(final boolean autoSuggest)
	{
		this.autoSuggest = autoSuggest;
	}
	
		
	public boolean isAutoSuggest() 
	{
		return autoSuggest;
	}
		
		
	public void setExportId(final String exportId)
	{
		this.exportId = exportId;
	}
	
		
	public String getExportId() 
	{
		return exportId;
	}
		
		
	public void setMultiValue(final boolean multiValue)
	{
		this.multiValue = multiValue;
	}
	
		
	public boolean isMultiValue() 
	{
		return multiValue;
	}
		
		
	public void setFacetSortProvider(final String facetSortProvider)
	{
		this.facetSortProvider = facetSortProvider;
	}
	
		
	public String getFacetSortProvider() 
	{
		return facetSortProvider;
	}
		
		
	public void setBoostRules(final Collection<SolrBoostRuleModel> boostRules)
	{
		this.boostRules = boostRules;
	}
	
		
	public Collection<SolrBoostRuleModel> getBoostRules() 
	{
		return boostRules;
	}
		
		
	public void setLocalized(final boolean localized)
	{
		this.localized = localized;
	}
	
		
	public boolean isLocalized() 
	{
		return localized;
	}
		
		
	public void setClassAttributeAssignment(final ClassAttributeAssignmentModel classAttributeAssignment)
	{
		this.classAttributeAssignment = classAttributeAssignment;
	}
	
		
	public ClassAttributeAssignmentModel getClassAttributeAssignment() 
	{
		return classAttributeAssignment;
	}
		
		
	public void setFacetType(final FacetType facetType)
	{
		this.facetType = facetType;
	}
	
		
	public FacetType getFacetType() 
	{
		return facetType;
	}
		
		
	public void setFieldValueProvider(final String fieldValueProvider)
	{
		this.fieldValueProvider = fieldValueProvider;
	}
	
		
	public String getFieldValueProvider() 
	{
		return fieldValueProvider;
	}
		
		
	public void setDisplayName(final String displayName)
	{
		this.displayName = displayName;
	}
	
		
	public String getDisplayName() 
	{
		return displayName;
	}
		
	
}