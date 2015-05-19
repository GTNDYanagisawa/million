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
package de.hybris.platform.bmecat.model;

import de.hybris.platform.bmecat.enums.CategoryAttributeEnum;
import de.hybris.platform.bmecat.model.BMECatImportStepModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.type.AttributeDescriptorModel;
import de.hybris.platform.core.model.type.ComposedTypeModel;
import de.hybris.platform.cronjob.model.BatchJobModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Map;

/**
 * Generated model class for type BMECatCategoryStep first defined at extension bmecat.
 */
@SuppressWarnings("all")
public class BMECatCategoryStepModel extends BMECatImportStepModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BMECatCategoryStep";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatCategoryStep.categoryType</code> attribute defined at extension <code>bmecat</code>. */
	public static final String CATEGORYTYPE = "categoryType";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatCategoryStep.categoryAttributeMapping</code> attribute defined at extension <code>bmecat</code>. */
	public static final String CATEGORYATTRIBUTEMAPPING = "categoryAttributeMapping";
	
	
	/** <i>Generated variable</i> - Variable of <code>BMECatCategoryStep.categoryType</code> attribute defined at extension <code>bmecat</code>. */
	private ComposedTypeModel _categoryType;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatCategoryStep.categoryAttributeMapping</code> attribute defined at extension <code>bmecat</code>. */
	private Map<CategoryAttributeEnum,AttributeDescriptorModel> _categoryAttributeMapping;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BMECatCategoryStepModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BMECatCategoryStepModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _batchJob initial attribute declared by type <code>Step</code> at extension <code>processing</code>
	 * @param _code initial attribute declared by type <code>Step</code> at extension <code>processing</code>
	 * @param _sequenceNumber initial attribute declared by type <code>Step</code> at extension <code>processing</code>
	 */
	@Deprecated
	public BMECatCategoryStepModel(final BatchJobModel _batchJob, final String _code, final Integer _sequenceNumber)
	{
		super();
		setBatchJob(_batchJob);
		setCode(_code);
		setSequenceNumber(_sequenceNumber);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _batchJob initial attribute declared by type <code>Step</code> at extension <code>processing</code>
	 * @param _code initial attribute declared by type <code>Step</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _sequenceNumber initial attribute declared by type <code>Step</code> at extension <code>processing</code>
	 */
	@Deprecated
	public BMECatCategoryStepModel(final BatchJobModel _batchJob, final String _code, final ItemModel _owner, final Integer _sequenceNumber)
	{
		super();
		setBatchJob(_batchJob);
		setCode(_code);
		setOwner(_owner);
		setSequenceNumber(_sequenceNumber);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatCategoryStep.categoryAttributeMapping</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the categoryAttributeMapping
	 */
	public Map<CategoryAttributeEnum,AttributeDescriptorModel> getCategoryAttributeMapping()
	{
		if (this._categoryAttributeMapping!=null)
		{
			return _categoryAttributeMapping;
		}
		return _categoryAttributeMapping = getPersistenceContext().getValue(CATEGORYATTRIBUTEMAPPING, _categoryAttributeMapping);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatCategoryStep.categoryType</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the categoryType
	 */
	public ComposedTypeModel getCategoryType()
	{
		if (this._categoryType!=null)
		{
			return _categoryType;
		}
		return _categoryType = getPersistenceContext().getValue(CATEGORYTYPE, _categoryType);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatCategoryStep.categoryAttributeMapping</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the categoryAttributeMapping
	 */
	public void setCategoryAttributeMapping(final Map<CategoryAttributeEnum,AttributeDescriptorModel> value)
	{
		_categoryAttributeMapping = getPersistenceContext().setValue(CATEGORYATTRIBUTEMAPPING, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatCategoryStep.categoryType</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the categoryType
	 */
	public void setCategoryType(final ComposedTypeModel value)
	{
		_categoryType = getPersistenceContext().setValue(CATEGORYTYPE, value);
	}
	
}
