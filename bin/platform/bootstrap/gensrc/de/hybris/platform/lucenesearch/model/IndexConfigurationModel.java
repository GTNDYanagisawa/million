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
package de.hybris.platform.lucenesearch.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.type.AttributeDescriptorModel;
import de.hybris.platform.core.model.type.ComposedTypeModel;
import de.hybris.platform.lucenesearch.model.AbstractLuceneItemModel;
import de.hybris.platform.lucenesearch.model.AttributeConfigurationModel;
import de.hybris.platform.lucenesearch.model.IndexUpdateModel;
import de.hybris.platform.lucenesearch.model.LuceneIndexModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type IndexConfiguration first defined at extension lucenesearch.
 */
@SuppressWarnings("all")
public class IndexConfigurationModel extends AbstractLuceneItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "IndexConfiguration";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexConfiguration.activationAttribute</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String ACTIVATIONATTRIBUTE = "activationAttribute";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexConfiguration.allAvailableAttributes</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String ALLAVAILABLEATTRIBUTES = "allAvailableAttributes";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexConfiguration.attributeConfigurations</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String ATTRIBUTECONFIGURATIONS = "attributeConfigurations";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexConfiguration.availableActivationAttributes</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String AVAILABLEACTIVATIONATTRIBUTES = "availableActivationAttributes";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexConfiguration.availableGroupingAttributes</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String AVAILABLEGROUPINGATTRIBUTES = "availableGroupingAttributes";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexConfiguration.availableIndexableAttributes</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String AVAILABLEINDEXABLEATTRIBUTES = "availableIndexableAttributes";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexConfiguration.groupingAttribute</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String GROUPINGATTRIBUTE = "groupingAttribute";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexConfiguration.indexedDataFactoryClassName</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String INDEXEDDATAFACTORYCLASSNAME = "indexedDataFactoryClassName";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexConfiguration.indexedDataParams</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String INDEXEDDATAPARAMS = "indexedDataParams";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexConfiguration.indexedType</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String INDEXEDTYPE = "indexedType";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexConfiguration.luceneIndex</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String LUCENEINDEX = "luceneIndex";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexConfiguration.pendingUpdates</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String PENDINGUPDATES = "pendingUpdates";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexConfiguration.includedTypes</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String INCLUDEDTYPES = "includedTypes";
	
	
	/** <i>Generated variable</i> - Variable of <code>IndexConfiguration.activationAttribute</code> attribute defined at extension <code>lucenesearch</code>. */
	private AttributeDescriptorModel _activationAttribute;
	
	/** <i>Generated variable</i> - Variable of <code>IndexConfiguration.allAvailableAttributes</code> attribute defined at extension <code>lucenesearch</code>. */
	private Collection<AttributeDescriptorModel> _allAvailableAttributes;
	
	/** <i>Generated variable</i> - Variable of <code>IndexConfiguration.attributeConfigurations</code> attribute defined at extension <code>lucenesearch</code>. */
	private Collection<AttributeConfigurationModel> _attributeConfigurations;
	
	/** <i>Generated variable</i> - Variable of <code>IndexConfiguration.availableActivationAttributes</code> attribute defined at extension <code>lucenesearch</code>. */
	private Collection<AttributeDescriptorModel> _availableActivationAttributes;
	
	/** <i>Generated variable</i> - Variable of <code>IndexConfiguration.availableGroupingAttributes</code> attribute defined at extension <code>lucenesearch</code>. */
	private Collection<AttributeDescriptorModel> _availableGroupingAttributes;
	
	/** <i>Generated variable</i> - Variable of <code>IndexConfiguration.availableIndexableAttributes</code> attribute defined at extension <code>lucenesearch</code>. */
	private Collection<AttributeDescriptorModel> _availableIndexableAttributes;
	
	/** <i>Generated variable</i> - Variable of <code>IndexConfiguration.groupingAttribute</code> attribute defined at extension <code>lucenesearch</code>. */
	private AttributeDescriptorModel _groupingAttribute;
	
	/** <i>Generated variable</i> - Variable of <code>IndexConfiguration.indexedDataFactoryClassName</code> attribute defined at extension <code>lucenesearch</code>. */
	private String _indexedDataFactoryClassName;
	
	/** <i>Generated variable</i> - Variable of <code>IndexConfiguration.indexedDataParams</code> attribute defined at extension <code>lucenesearch</code>. */
	private String _indexedDataParams;
	
	/** <i>Generated variable</i> - Variable of <code>IndexConfiguration.indexedType</code> attribute defined at extension <code>lucenesearch</code>. */
	private ComposedTypeModel _indexedType;
	
	/** <i>Generated variable</i> - Variable of <code>IndexConfiguration.luceneIndex</code> attribute defined at extension <code>lucenesearch</code>. */
	private LuceneIndexModel _luceneIndex;
	
	/** <i>Generated variable</i> - Variable of <code>IndexConfiguration.pendingUpdates</code> attribute defined at extension <code>lucenesearch</code>. */
	private Collection<IndexUpdateModel> _pendingUpdates;
	
	/** <i>Generated variable</i> - Variable of <code>IndexConfiguration.includedTypes</code> attribute defined at extension <code>lucenesearch</code>. */
	private Collection<ComposedTypeModel> _includedTypes;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public IndexConfigurationModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public IndexConfigurationModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _indexedType initial attribute declared by type <code>IndexConfiguration</code> at extension <code>lucenesearch</code>
	 * @param _luceneIndex initial attribute declared by type <code>IndexConfiguration</code> at extension <code>lucenesearch</code>
	 */
	@Deprecated
	public IndexConfigurationModel(final ComposedTypeModel _indexedType, final LuceneIndexModel _luceneIndex)
	{
		super();
		setIndexedType(_indexedType);
		setLuceneIndex(_luceneIndex);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _indexedType initial attribute declared by type <code>IndexConfiguration</code> at extension <code>lucenesearch</code>
	 * @param _luceneIndex initial attribute declared by type <code>IndexConfiguration</code> at extension <code>lucenesearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public IndexConfigurationModel(final ComposedTypeModel _indexedType, final LuceneIndexModel _luceneIndex, final ItemModel _owner)
	{
		super();
		setIndexedType(_indexedType);
		setLuceneIndex(_luceneIndex);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexConfiguration.activationAttribute</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the activationAttribute - Optional descriptor of boolean attribute.
	 * 						Instances must have the value true in this
	 * 						attribute to be indexed. Is limited to the
	 * 						values of the availableActivationAttributes
	 * 						attribute.
	 */
	public AttributeDescriptorModel getActivationAttribute()
	{
		if (this._activationAttribute!=null)
		{
			return _activationAttribute;
		}
		return _activationAttribute = getPersistenceContext().getValue(ACTIVATIONATTRIBUTE, _activationAttribute);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexConfiguration.allAvailableAttributes</code> attribute defined at extension <code>lucenesearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the allAvailableAttributes - Returns all attributes of the type specified by
	 * 						the indexedType attribute. Jalo-only attribute.
	 */
	public Collection<AttributeDescriptorModel> getAllAvailableAttributes()
	{
		if (this._allAvailableAttributes!=null)
		{
			return _allAvailableAttributes;
		}
		return _allAvailableAttributes = getPersistenceContext().getValue(ALLAVAILABLEATTRIBUTES, _allAvailableAttributes);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexConfiguration.attributeConfigurations</code> attribute defined at extension <code>lucenesearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the attributeConfigurations - All AttributeConfiguration objects that belong
	 * 						to this IndexConfiguration. Jalo-only attribute.
	 */
	public Collection<AttributeConfigurationModel> getAttributeConfigurations()
	{
		if (this._attributeConfigurations!=null)
		{
			return _attributeConfigurations;
		}
		return _attributeConfigurations = getPersistenceContext().getValue(ATTRIBUTECONFIGURATIONS, _attributeConfigurations);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexConfiguration.availableActivationAttributes</code> attribute defined at extension <code>lucenesearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the availableActivationAttributes - all AttributeDescriptors of the indexed type.
	 * 						Jalo-only attribute. Deprecated.
	 */
	public Collection<AttributeDescriptorModel> getAvailableActivationAttributes()
	{
		if (this._availableActivationAttributes!=null)
		{
			return _availableActivationAttributes;
		}
		return _availableActivationAttributes = getPersistenceContext().getValue(AVAILABLEACTIVATIONATTRIBUTES, _availableActivationAttributes);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexConfiguration.availableGroupingAttributes</code> attribute defined at extension <code>lucenesearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the availableGroupingAttributes - all groupable AttributeDescriptors of the
	 * 						indexed type. Jalo-only attribute. Deprecated.
	 */
	public Collection<AttributeDescriptorModel> getAvailableGroupingAttributes()
	{
		if (this._availableGroupingAttributes!=null)
		{
			return _availableGroupingAttributes;
		}
		return _availableGroupingAttributes = getPersistenceContext().getValue(AVAILABLEGROUPINGATTRIBUTES, _availableGroupingAttributes);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexConfiguration.availableIndexableAttributes</code> attribute defined at extension <code>lucenesearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the availableIndexableAttributes - Gets all available attributes of the specified
	 * 						type which are indexable. Jalo-only attribute.
	 */
	public Collection<AttributeDescriptorModel> getAvailableIndexableAttributes()
	{
		if (this._availableIndexableAttributes!=null)
		{
			return _availableIndexableAttributes;
		}
		return _availableIndexableAttributes = getPersistenceContext().getValue(AVAILABLEINDEXABLEATTRIBUTES, _availableIndexableAttributes);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexConfiguration.groupingAttribute</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the groupingAttribute - Optional descriptor of an attribute that puts
	 * 						the indexed item into one or more groups; see
	 * 						the documentation of LucenesearchManager
	 * 						for a description of grouping. Is limited to the
	 * 						values of the availableGroupingAttributes
	 * 						attribute.
	 */
	public AttributeDescriptorModel getGroupingAttribute()
	{
		if (this._groupingAttribute!=null)
		{
			return _groupingAttribute;
		}
		return _groupingAttribute = getPersistenceContext().getValue(GROUPINGATTRIBUTE, _groupingAttribute);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexConfiguration.includedTypes</code> attribute defined at extension <code>lucenesearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the includedTypes - Only types specified here will be used within the
	 * 					index. Types not specified will not be indexed.
	 * 					Attribute created via the IndexTypeRelation
	 * 					relation.
	 */
	public Collection<ComposedTypeModel> getIncludedTypes()
	{
		if (this._includedTypes!=null)
		{
			return _includedTypes;
		}
		return _includedTypes = getPersistenceContext().getValue(INCLUDEDTYPES, _includedTypes);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexConfiguration.indexedDataFactoryClassName</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the indexedDataFactoryClassName - Optionally, you can specify an IndexedDataFactory 
	 * 						Uses the DefaultIndexedDataFactory by default.
	 */
	public String getIndexedDataFactoryClassName()
	{
		if (this._indexedDataFactoryClassName!=null)
		{
			return _indexedDataFactoryClassName;
		}
		return _indexedDataFactoryClassName = getPersistenceContext().getValue(INDEXEDDATAFACTORYCLASSNAME, _indexedDataFactoryClassName);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexConfiguration.indexedDataParams</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the indexedDataParams - Additional parameters which may be evaluated by
	 * 						the associated IndexedDataFactory.
	 */
	public String getIndexedDataParams()
	{
		if (this._indexedDataParams!=null)
		{
			return _indexedDataParams;
		}
		return _indexedDataParams = getPersistenceContext().getValue(INDEXEDDATAPARAMS, _indexedDataParams);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexConfiguration.indexedType</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the indexedType - The item type whose instances will be indexed.
	 * 						Initial attribute, cannot be edited after the
	 * 						IndexConfiguration has been created.
	 */
	public ComposedTypeModel getIndexedType()
	{
		if (this._indexedType!=null)
		{
			return _indexedType;
		}
		return _indexedType = getPersistenceContext().getValue(INDEXEDTYPE, _indexedType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexConfiguration.luceneIndex</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the luceneIndex - The LuceneIndex to which this IndexConfiguration
	 * 						belongs.
	 */
	public LuceneIndexModel getLuceneIndex()
	{
		if (this._luceneIndex!=null)
		{
			return _luceneIndex;
		}
		return _luceneIndex = getPersistenceContext().getValue(LUCENEINDEX, _luceneIndex);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexConfiguration.pendingUpdates</code> attribute defined at extension <code>lucenesearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the pendingUpdates - A collection of all IndexUpdate objects that
	 * 						refer to objects of the given type which
	 * 						currently exist and which have to be updated.
	 * 						Jalo-only attribute. Entries are retrieved via a
	 * 						FlexibleSearch statement.
	 */
	public Collection<IndexUpdateModel> getPendingUpdates()
	{
		if (this._pendingUpdates!=null)
		{
			return _pendingUpdates;
		}
		return _pendingUpdates = getPersistenceContext().getValue(PENDINGUPDATES, _pendingUpdates);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>IndexConfiguration.activationAttribute</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the activationAttribute - Optional descriptor of boolean attribute.
	 * 						Instances must have the value true in this
	 * 						attribute to be indexed. Is limited to the
	 * 						values of the availableActivationAttributes
	 * 						attribute.
	 */
	public void setActivationAttribute(final AttributeDescriptorModel value)
	{
		_activationAttribute = getPersistenceContext().setValue(ACTIVATIONATTRIBUTE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>IndexConfiguration.attributeConfigurations</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the attributeConfigurations - All AttributeConfiguration objects that belong
	 * 						to this IndexConfiguration. Jalo-only attribute.
	 */
	public void setAttributeConfigurations(final Collection<AttributeConfigurationModel> value)
	{
		_attributeConfigurations = getPersistenceContext().setValue(ATTRIBUTECONFIGURATIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>IndexConfiguration.groupingAttribute</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the groupingAttribute - Optional descriptor of an attribute that puts
	 * 						the indexed item into one or more groups; see
	 * 						the documentation of LucenesearchManager
	 * 						for a description of grouping. Is limited to the
	 * 						values of the availableGroupingAttributes
	 * 						attribute.
	 */
	public void setGroupingAttribute(final AttributeDescriptorModel value)
	{
		_groupingAttribute = getPersistenceContext().setValue(GROUPINGATTRIBUTE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>IndexConfiguration.includedTypes</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the includedTypes - Only types specified here will be used within the
	 * 					index. Types not specified will not be indexed.
	 * 					Attribute created via the IndexTypeRelation
	 * 					relation.
	 */
	public void setIncludedTypes(final Collection<ComposedTypeModel> value)
	{
		_includedTypes = getPersistenceContext().setValue(INCLUDEDTYPES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>IndexConfiguration.indexedDataFactoryClassName</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the indexedDataFactoryClassName - Optionally, you can specify an IndexedDataFactory 
	 * 						Uses the DefaultIndexedDataFactory by default.
	 */
	public void setIndexedDataFactoryClassName(final String value)
	{
		_indexedDataFactoryClassName = getPersistenceContext().setValue(INDEXEDDATAFACTORYCLASSNAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>IndexConfiguration.indexedDataParams</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the indexedDataParams - Additional parameters which may be evaluated by
	 * 						the associated IndexedDataFactory.
	 */
	public void setIndexedDataParams(final String value)
	{
		_indexedDataParams = getPersistenceContext().setValue(INDEXEDDATAPARAMS, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>IndexConfiguration.indexedType</code> attribute defined at extension <code>lucenesearch</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the indexedType - The item type whose instances will be indexed.
	 * 						Initial attribute, cannot be edited after the
	 * 						IndexConfiguration has been created.
	 */
	public void setIndexedType(final ComposedTypeModel value)
	{
		_indexedType = getPersistenceContext().setValue(INDEXEDTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>IndexConfiguration.luceneIndex</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the luceneIndex - The LuceneIndex to which this IndexConfiguration
	 * 						belongs.
	 */
	public void setLuceneIndex(final LuceneIndexModel value)
	{
		_luceneIndex = getPersistenceContext().setValue(LUCENEINDEX, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>IndexConfiguration.pendingUpdates</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the pendingUpdates - A collection of all IndexUpdate objects that
	 * 						refer to objects of the given type which
	 * 						currently exist and which have to be updated.
	 * 						Jalo-only attribute. Entries are retrieved via a
	 * 						FlexibleSearch statement.
	 */
	public void setPendingUpdates(final Collection<IndexUpdateModel> value)
	{
		_pendingUpdates = getPersistenceContext().setValue(PENDINGUPDATES, value);
	}
	
}
