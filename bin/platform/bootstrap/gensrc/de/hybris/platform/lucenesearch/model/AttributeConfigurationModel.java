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
import de.hybris.platform.lucenesearch.model.AbstractLuceneItemModel;
import de.hybris.platform.lucenesearch.model.IndexConfigurationModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type AttributeConfiguration first defined at extension lucenesearch.
 */
@SuppressWarnings("all")
public class AttributeConfigurationModel extends AbstractLuceneItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "AttributeConfiguration";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeConfiguration.availableIndexableAttributes</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String AVAILABLEINDEXABLEATTRIBUTES = "availableIndexableAttributes";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeConfiguration.exact</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String EXACT = "exact";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeConfiguration.fieldName</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String FIELDNAME = "fieldName";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeConfiguration.indexConfiguration</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String INDEXCONFIGURATION = "indexConfiguration";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeConfiguration.indexedAttribute</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String INDEXEDATTRIBUTE = "indexedAttribute";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeConfiguration.storeData</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String STOREDATA = "storeData";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeConfiguration.weight</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String WEIGHT = "weight";
	
	
	/** <i>Generated variable</i> - Variable of <code>AttributeConfiguration.availableIndexableAttributes</code> attribute defined at extension <code>lucenesearch</code>. */
	private Collection<AttributeDescriptorModel> _availableIndexableAttributes;
	
	/** <i>Generated variable</i> - Variable of <code>AttributeConfiguration.exact</code> attribute defined at extension <code>lucenesearch</code>. */
	private Boolean _exact;
	
	/** <i>Generated variable</i> - Variable of <code>AttributeConfiguration.fieldName</code> attribute defined at extension <code>lucenesearch</code>. */
	private String _fieldName;
	
	/** <i>Generated variable</i> - Variable of <code>AttributeConfiguration.indexConfiguration</code> attribute defined at extension <code>lucenesearch</code>. */
	private IndexConfigurationModel _indexConfiguration;
	
	/** <i>Generated variable</i> - Variable of <code>AttributeConfiguration.indexedAttribute</code> attribute defined at extension <code>lucenesearch</code>. */
	private AttributeDescriptorModel _indexedAttribute;
	
	/** <i>Generated variable</i> - Variable of <code>AttributeConfiguration.storeData</code> attribute defined at extension <code>lucenesearch</code>. */
	private Boolean _storeData;
	
	/** <i>Generated variable</i> - Variable of <code>AttributeConfiguration.weight</code> attribute defined at extension <code>lucenesearch</code>. */
	private Double _weight;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AttributeConfigurationModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AttributeConfigurationModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _indexConfiguration initial attribute declared by type <code>AttributeConfiguration</code> at extension <code>lucenesearch</code>
	 * @param _indexedAttribute initial attribute declared by type <code>AttributeConfiguration</code> at extension <code>lucenesearch</code>
	 */
	@Deprecated
	public AttributeConfigurationModel(final IndexConfigurationModel _indexConfiguration, final AttributeDescriptorModel _indexedAttribute)
	{
		super();
		setIndexConfiguration(_indexConfiguration);
		setIndexedAttribute(_indexedAttribute);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _indexConfiguration initial attribute declared by type <code>AttributeConfiguration</code> at extension <code>lucenesearch</code>
	 * @param _indexedAttribute initial attribute declared by type <code>AttributeConfiguration</code> at extension <code>lucenesearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public AttributeConfigurationModel(final IndexConfigurationModel _indexConfiguration, final AttributeDescriptorModel _indexedAttribute, final ItemModel _owner)
	{
		super();
		setIndexConfiguration(_indexConfiguration);
		setIndexedAttribute(_indexedAttribute);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeConfiguration.availableIndexableAttributes</code> attribute defined at extension <code>lucenesearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the availableIndexableAttributes - Direct mapping of the
	 * 						availableIndexableAttribute attribute of the
	 * 						IndexConfiguration to which the
	 * 						AttributeConfiguration is assigned. Jalo-only
	 * 						attribute.
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
	 * <i>Generated method</i> - Getter of the <code>AttributeConfiguration.exact</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the exact - Indicates whether this attribute text must be indexed
	 * 						exactly (for example, without any stemming
	 * 						mechanism), such as codes or identification
	 * 						numbers. Defaults to Boolean.FALSE.
	 */
	public Boolean getExact()
	{
		if (this._exact!=null)
		{
			return _exact;
		}
		return _exact = getPersistenceContext().getValue(EXACT, _exact);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeConfiguration.fieldName</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the fieldName - Field name within the lucene index where the
	 * 						attribute will be stored.
	 */
	public String getFieldName()
	{
		if (this._fieldName!=null)
		{
			return _fieldName;
		}
		return _fieldName = getPersistenceContext().getValue(FIELDNAME, _fieldName);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeConfiguration.indexConfiguration</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the indexConfiguration - The IndexConfiguration to which this
	 * 						configuration belongs.
	 */
	public IndexConfigurationModel getIndexConfiguration()
	{
		if (this._indexConfiguration!=null)
		{
			return _indexConfiguration;
		}
		return _indexConfiguration = getPersistenceContext().getValue(INDEXCONFIGURATION, _indexConfiguration);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeConfiguration.indexedAttribute</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the indexedAttribute - Gets the attribute definition this configuration
	 * 						represents. Is limited to the values of the
	 * 						availableIndexableAttributes attribute.
	 */
	public AttributeDescriptorModel getIndexedAttribute()
	{
		if (this._indexedAttribute!=null)
		{
			return _indexedAttribute;
		}
		return _indexedAttribute = getPersistenceContext().getValue(INDEXEDATTRIBUTE, _indexedAttribute);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeConfiguration.storeData</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the storeData - Specifies whether the original text has to be stored
	 * 						inside the lucene index as well. Defaults to
	 * 						Boolean.TRUE.
	 */
	public Boolean getStoreData()
	{
		if (this._storeData!=null)
		{
			return _storeData;
		}
		return _storeData = getPersistenceContext().getValue(STOREDATA, _storeData);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeConfiguration.weight</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the weight - The weighting of the attribute within the Lucene
	 * 						index. Must be greater than 0. Defaults to new
	 * 						Double(1.0).
	 */
	public Double getWeight()
	{
		if (this._weight!=null)
		{
			return _weight;
		}
		return _weight = getPersistenceContext().getValue(WEIGHT, _weight);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AttributeConfiguration.exact</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the exact - Indicates whether this attribute text must be indexed
	 * 						exactly (for example, without any stemming
	 * 						mechanism), such as codes or identification
	 * 						numbers. Defaults to Boolean.FALSE.
	 */
	public void setExact(final Boolean value)
	{
		_exact = getPersistenceContext().setValue(EXACT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AttributeConfiguration.fieldName</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the fieldName - Field name within the lucene index where the
	 * 						attribute will be stored.
	 */
	public void setFieldName(final String value)
	{
		_fieldName = getPersistenceContext().setValue(FIELDNAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>AttributeConfiguration.indexConfiguration</code> attribute defined at extension <code>lucenesearch</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the indexConfiguration - The IndexConfiguration to which this
	 * 						configuration belongs.
	 */
	public void setIndexConfiguration(final IndexConfigurationModel value)
	{
		_indexConfiguration = getPersistenceContext().setValue(INDEXCONFIGURATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AttributeConfiguration.indexedAttribute</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the indexedAttribute - Gets the attribute definition this configuration
	 * 						represents. Is limited to the values of the
	 * 						availableIndexableAttributes attribute.
	 */
	public void setIndexedAttribute(final AttributeDescriptorModel value)
	{
		_indexedAttribute = getPersistenceContext().setValue(INDEXEDATTRIBUTE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AttributeConfiguration.storeData</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the storeData - Specifies whether the original text has to be stored
	 * 						inside the lucene index as well. Defaults to
	 * 						Boolean.TRUE.
	 */
	public void setStoreData(final Boolean value)
	{
		_storeData = getPersistenceContext().setValue(STOREDATA, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AttributeConfiguration.weight</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the weight - The weighting of the attribute within the Lucene
	 * 						index. Must be greater than 0. Defaults to new
	 * 						Double(1.0).
	 */
	public void setWeight(final Double value)
	{
		_weight = getPersistenceContext().setValue(WEIGHT, value);
	}
	
}
