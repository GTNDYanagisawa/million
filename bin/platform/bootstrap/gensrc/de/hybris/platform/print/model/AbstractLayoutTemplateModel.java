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
package de.hybris.platform.print.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.print.model.PlaceholderTemplateModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type AbstractLayoutTemplate first defined at extension print.
 */
@SuppressWarnings("all")
public class AbstractLayoutTemplateModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "AbstractLayoutTemplate";
	
	/**<i>Generated relation code constant for relation <code>PlaceholderTemplate2LayoutTemplateRelation</code> defining source attribute <code>placeholderTemplate</code> in extension <code>print</code>.</i>*/
	public final static String _PLACEHOLDERTEMPLATE2LAYOUTTEMPLATERELATION = "PlaceholderTemplate2LayoutTemplateRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractLayoutTemplate.code</code> attribute defined at extension <code>print</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractLayoutTemplate.description</code> attribute defined at extension <code>print</code>. */
	public static final String DESCRIPTION = "description";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractLayoutTemplate.previewTemplate</code> attribute defined at extension <code>print</code>. */
	public static final String PREVIEWTEMPLATE = "previewTemplate";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractLayoutTemplate.previewMedia</code> attribute defined at extension <code>print</code>. */
	public static final String PREVIEWMEDIA = "previewMedia";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractLayoutTemplate.placeholderTemplate</code> attribute defined at extension <code>print</code>. */
	public static final String PLACEHOLDERTEMPLATE = "placeholderTemplate";
	
	
	/** <i>Generated variable</i> - Variable of <code>AbstractLayoutTemplate.code</code> attribute defined at extension <code>print</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractLayoutTemplate.description</code> attribute defined at extension <code>print</code>. */
	private String _description;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractLayoutTemplate.previewTemplate</code> attribute defined at extension <code>print</code>. */
	private String _previewTemplate;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractLayoutTemplate.previewMedia</code> attribute defined at extension <code>print</code>. */
	private MediaModel _previewMedia;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractLayoutTemplate.placeholderTemplate</code> attribute defined at extension <code>print</code>. */
	private PlaceholderTemplateModel _placeholderTemplate;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AbstractLayoutTemplateModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AbstractLayoutTemplateModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>AbstractLayoutTemplate</code> at extension <code>print</code>
	 */
	@Deprecated
	public AbstractLayoutTemplateModel(final String _code)
	{
		super();
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>AbstractLayoutTemplate</code> at extension <code>print</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public AbstractLayoutTemplateModel(final String _code, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractLayoutTemplate.code</code> attribute defined at extension <code>print</code>. 
	 * @return the code
	 */
	public String getCode()
	{
		if (this._code!=null)
		{
			return _code;
		}
		return _code = getPersistenceContext().getValue(CODE, _code);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractLayoutTemplate.description</code> attribute defined at extension <code>print</code>. 
	 * @return the description
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
	 * <i>Generated method</i> - Getter of the <code>AbstractLayoutTemplate.placeholderTemplate</code> attribute defined at extension <code>print</code>. 
	 * @return the placeholderTemplate
	 */
	public PlaceholderTemplateModel getPlaceholderTemplate()
	{
		if (this._placeholderTemplate!=null)
		{
			return _placeholderTemplate;
		}
		return _placeholderTemplate = getPersistenceContext().getValue(PLACEHOLDERTEMPLATE, _placeholderTemplate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractLayoutTemplate.previewMedia</code> attribute defined at extension <code>print</code>. 
	 * @return the previewMedia
	 */
	public MediaModel getPreviewMedia()
	{
		if (this._previewMedia!=null)
		{
			return _previewMedia;
		}
		return _previewMedia = getPersistenceContext().getValue(PREVIEWMEDIA, _previewMedia);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractLayoutTemplate.previewTemplate</code> attribute defined at extension <code>print</code>. 
	 * @return the previewTemplate
	 */
	public String getPreviewTemplate()
	{
		if (this._previewTemplate!=null)
		{
			return _previewTemplate;
		}
		return _previewTemplate = getPersistenceContext().getValue(PREVIEWTEMPLATE, _previewTemplate);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractLayoutTemplate.code</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractLayoutTemplate.description</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the description
	 */
	public void setDescription(final String value)
	{
		_description = getPersistenceContext().setValue(DESCRIPTION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractLayoutTemplate.placeholderTemplate</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the placeholderTemplate
	 */
	public void setPlaceholderTemplate(final PlaceholderTemplateModel value)
	{
		_placeholderTemplate = getPersistenceContext().setValue(PLACEHOLDERTEMPLATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractLayoutTemplate.previewMedia</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the previewMedia
	 */
	public void setPreviewMedia(final MediaModel value)
	{
		_previewMedia = getPersistenceContext().setValue(PREVIEWMEDIA, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractLayoutTemplate.previewTemplate</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the previewTemplate
	 */
	public void setPreviewTemplate(final String value)
	{
		_previewTemplate = getPersistenceContext().setValue(PREVIEWTEMPLATE, value);
	}
	
}
