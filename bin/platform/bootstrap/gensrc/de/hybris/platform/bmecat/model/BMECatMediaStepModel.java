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

import de.hybris.platform.bmecat.enums.BMECatMimePurposeEnum;
import de.hybris.platform.bmecat.model.BMECatImportStepModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.type.AttributeDescriptorModel;
import de.hybris.platform.core.model.type.ComposedTypeModel;
import de.hybris.platform.cronjob.model.BatchJobModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Map;

/**
 * Generated model class for type BMECatMediaStep first defined at extension bmecat.
 */
@SuppressWarnings("all")
public class BMECatMediaStepModel extends BMECatImportStepModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BMECatMediaStep";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatMediaStep.MediaType</code> attribute defined at extension <code>bmecat</code>. */
	public static final String MEDIATYPE = "MediaType";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatMediaStep.ProductType</code> attribute defined at extension <code>bmecat</code>. */
	public static final String PRODUCTTYPE = "ProductType";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatMediaStep.CategoryType</code> attribute defined at extension <code>bmecat</code>. */
	public static final String CATEGORYTYPE = "CategoryType";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatMediaStep.ProductMimePurposeMapping</code> attribute defined at extension <code>bmecat</code>. */
	public static final String PRODUCTMIMEPURPOSEMAPPING = "ProductMimePurposeMapping";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatMediaStep.CategoryMimePurposeMapping</code> attribute defined at extension <code>bmecat</code>. */
	public static final String CATEGORYMIMEPURPOSEMAPPING = "CategoryMimePurposeMapping";
	
	
	/** <i>Generated variable</i> - Variable of <code>BMECatMediaStep.MediaType</code> attribute defined at extension <code>bmecat</code>. */
	private ComposedTypeModel _MediaType;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatMediaStep.ProductType</code> attribute defined at extension <code>bmecat</code>. */
	private ComposedTypeModel _ProductType;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatMediaStep.CategoryType</code> attribute defined at extension <code>bmecat</code>. */
	private ComposedTypeModel _CategoryType;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatMediaStep.ProductMimePurposeMapping</code> attribute defined at extension <code>bmecat</code>. */
	private Map<BMECatMimePurposeEnum,AttributeDescriptorModel> _ProductMimePurposeMapping;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatMediaStep.CategoryMimePurposeMapping</code> attribute defined at extension <code>bmecat</code>. */
	private Map<BMECatMimePurposeEnum,AttributeDescriptorModel> _CategoryMimePurposeMapping;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BMECatMediaStepModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BMECatMediaStepModel(final ItemModelContext ctx)
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
	public BMECatMediaStepModel(final BatchJobModel _batchJob, final String _code, final Integer _sequenceNumber)
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
	public BMECatMediaStepModel(final BatchJobModel _batchJob, final String _code, final ItemModel _owner, final Integer _sequenceNumber)
	{
		super();
		setBatchJob(_batchJob);
		setCode(_code);
		setOwner(_owner);
		setSequenceNumber(_sequenceNumber);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatMediaStep.CategoryMimePurposeMapping</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the CategoryMimePurposeMapping
	 */
	public Map<BMECatMimePurposeEnum,AttributeDescriptorModel> getCategoryMimePurposeMapping()
	{
		if (this._CategoryMimePurposeMapping!=null)
		{
			return _CategoryMimePurposeMapping;
		}
		return _CategoryMimePurposeMapping = getPersistenceContext().getValue(CATEGORYMIMEPURPOSEMAPPING, _CategoryMimePurposeMapping);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatMediaStep.CategoryType</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the CategoryType
	 */
	public ComposedTypeModel getCategoryType()
	{
		if (this._CategoryType!=null)
		{
			return _CategoryType;
		}
		return _CategoryType = getPersistenceContext().getValue(CATEGORYTYPE, _CategoryType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatMediaStep.MediaType</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the MediaType
	 */
	public ComposedTypeModel getMediaType()
	{
		if (this._MediaType!=null)
		{
			return _MediaType;
		}
		return _MediaType = getPersistenceContext().getValue(MEDIATYPE, _MediaType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatMediaStep.ProductMimePurposeMapping</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the ProductMimePurposeMapping
	 */
	public Map<BMECatMimePurposeEnum,AttributeDescriptorModel> getProductMimePurposeMapping()
	{
		if (this._ProductMimePurposeMapping!=null)
		{
			return _ProductMimePurposeMapping;
		}
		return _ProductMimePurposeMapping = getPersistenceContext().getValue(PRODUCTMIMEPURPOSEMAPPING, _ProductMimePurposeMapping);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatMediaStep.ProductType</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the ProductType
	 */
	public ComposedTypeModel getProductType()
	{
		if (this._ProductType!=null)
		{
			return _ProductType;
		}
		return _ProductType = getPersistenceContext().getValue(PRODUCTTYPE, _ProductType);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatMediaStep.CategoryMimePurposeMapping</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the CategoryMimePurposeMapping
	 */
	public void setCategoryMimePurposeMapping(final Map<BMECatMimePurposeEnum,AttributeDescriptorModel> value)
	{
		_CategoryMimePurposeMapping = getPersistenceContext().setValue(CATEGORYMIMEPURPOSEMAPPING, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatMediaStep.CategoryType</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the CategoryType
	 */
	public void setCategoryType(final ComposedTypeModel value)
	{
		_CategoryType = getPersistenceContext().setValue(CATEGORYTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatMediaStep.MediaType</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the MediaType
	 */
	public void setMediaType(final ComposedTypeModel value)
	{
		_MediaType = getPersistenceContext().setValue(MEDIATYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatMediaStep.ProductMimePurposeMapping</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the ProductMimePurposeMapping
	 */
	public void setProductMimePurposeMapping(final Map<BMECatMimePurposeEnum,AttributeDescriptorModel> value)
	{
		_ProductMimePurposeMapping = getPersistenceContext().setValue(PRODUCTMIMEPURPOSEMAPPING, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatMediaStep.ProductType</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the ProductType
	 */
	public void setProductType(final ComposedTypeModel value)
	{
		_ProductType = getPersistenceContext().setValue(PRODUCTTYPE, value);
	}
	
}
