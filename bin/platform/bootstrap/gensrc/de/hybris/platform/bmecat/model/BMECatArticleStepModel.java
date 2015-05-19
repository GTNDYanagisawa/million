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

import de.hybris.platform.bmecat.enums.ArticleAttributeEnum;
import de.hybris.platform.bmecat.model.BMECatImportStepModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.type.AttributeDescriptorModel;
import de.hybris.platform.core.model.type.ComposedTypeModel;
import de.hybris.platform.cronjob.model.BatchJobModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Map;

/**
 * Generated model class for type BMECatArticleStep first defined at extension bmecat.
 */
@SuppressWarnings("all")
public class BMECatArticleStepModel extends BMECatImportStepModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BMECatArticleStep";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatArticleStep.articleType</code> attribute defined at extension <code>bmecat</code>. */
	public static final String ARTICLETYPE = "articleType";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatArticleStep.articleAttributeMapping</code> attribute defined at extension <code>bmecat</code>. */
	public static final String ARTICLEATTRIBUTEMAPPING = "articleAttributeMapping";
	
	
	/** <i>Generated variable</i> - Variable of <code>BMECatArticleStep.articleType</code> attribute defined at extension <code>bmecat</code>. */
	private ComposedTypeModel _articleType;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatArticleStep.articleAttributeMapping</code> attribute defined at extension <code>bmecat</code>. */
	private Map<ArticleAttributeEnum,AttributeDescriptorModel> _articleAttributeMapping;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BMECatArticleStepModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BMECatArticleStepModel(final ItemModelContext ctx)
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
	public BMECatArticleStepModel(final BatchJobModel _batchJob, final String _code, final Integer _sequenceNumber)
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
	public BMECatArticleStepModel(final BatchJobModel _batchJob, final String _code, final ItemModel _owner, final Integer _sequenceNumber)
	{
		super();
		setBatchJob(_batchJob);
		setCode(_code);
		setOwner(_owner);
		setSequenceNumber(_sequenceNumber);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatArticleStep.articleAttributeMapping</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the articleAttributeMapping
	 */
	public Map<ArticleAttributeEnum,AttributeDescriptorModel> getArticleAttributeMapping()
	{
		if (this._articleAttributeMapping!=null)
		{
			return _articleAttributeMapping;
		}
		return _articleAttributeMapping = getPersistenceContext().getValue(ARTICLEATTRIBUTEMAPPING, _articleAttributeMapping);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatArticleStep.articleType</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the articleType
	 */
	public ComposedTypeModel getArticleType()
	{
		if (this._articleType!=null)
		{
			return _articleType;
		}
		return _articleType = getPersistenceContext().getValue(ARTICLETYPE, _articleType);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatArticleStep.articleAttributeMapping</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the articleAttributeMapping
	 */
	public void setArticleAttributeMapping(final Map<ArticleAttributeEnum,AttributeDescriptorModel> value)
	{
		_articleAttributeMapping = getPersistenceContext().setValue(ARTICLEATTRIBUTEMAPPING, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatArticleStep.articleType</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the articleType
	 */
	public void setArticleType(final ComposedTypeModel value)
	{
		_articleType = getPersistenceContext().setValue(ARTICLETYPE, value);
	}
	
}
