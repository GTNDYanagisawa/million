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
import de.hybris.platform.core.model.type.ComposedTypeModel;
import de.hybris.platform.print.model.AbstractLayoutTemplateModel;
import de.hybris.platform.print.model.CometConfigurationModel;
import de.hybris.platform.print.model.PlaceholderModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.List;

/**
 * Generated model class for type PlaceholderTemplate first defined at extension print.
 */
@SuppressWarnings("all")
public class PlaceholderTemplateModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PlaceholderTemplate";
	
	/**<i>Generated relation code constant for relation <code>ComposedType2PlaceholderTemplateRelation</code> defining source attribute <code>type</code> in extension <code>print</code>.</i>*/
	public final static String _COMPOSEDTYPE2PLACEHOLDERTEMPLATERELATION = "ComposedType2PlaceholderTemplateRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>PlaceholderTemplate.code</code> attribute defined at extension <code>print</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>PlaceholderTemplate.displayNamePattern</code> attribute defined at extension <code>print</code>. */
	public static final String DISPLAYNAMEPATTERN = "displayNamePattern";
	
	/** <i>Generated constant</i> - Attribute key of <code>PlaceholderTemplate.previewTemplate</code> attribute defined at extension <code>print</code>. */
	public static final String PREVIEWTEMPLATE = "previewTemplate";
	
	/** <i>Generated constant</i> - Attribute key of <code>PlaceholderTemplate.alternativeMediaExpression</code> attribute defined at extension <code>print</code>. */
	public static final String ALTERNATIVEMEDIAEXPRESSION = "alternativeMediaExpression";
	
	/** <i>Generated constant</i> - Attribute key of <code>PlaceholderTemplate.placeholders</code> attribute defined at extension <code>print</code>. */
	public static final String PLACEHOLDERS = "placeholders";
	
	/** <i>Generated constant</i> - Attribute key of <code>PlaceholderTemplate.type</code> attribute defined at extension <code>print</code>. */
	public static final String TYPE = "type";
	
	/** <i>Generated constant</i> - Attribute key of <code>PlaceholderTemplate.layoutTemplates</code> attribute defined at extension <code>print</code>. */
	public static final String LAYOUTTEMPLATES = "layoutTemplates";
	
	/** <i>Generated constant</i> - Attribute key of <code>PlaceholderTemplate.cometConfig</code> attribute defined at extension <code>print</code>. */
	public static final String COMETCONFIG = "cometConfig";
	
	
	/** <i>Generated variable</i> - Variable of <code>PlaceholderTemplate.code</code> attribute defined at extension <code>print</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>PlaceholderTemplate.displayNamePattern</code> attribute defined at extension <code>print</code>. */
	private String _displayNamePattern;
	
	/** <i>Generated variable</i> - Variable of <code>PlaceholderTemplate.previewTemplate</code> attribute defined at extension <code>print</code>. */
	private String _previewTemplate;
	
	/** <i>Generated variable</i> - Variable of <code>PlaceholderTemplate.alternativeMediaExpression</code> attribute defined at extension <code>print</code>. */
	private String _alternativeMediaExpression;
	
	/** <i>Generated variable</i> - Variable of <code>PlaceholderTemplate.placeholders</code> attribute defined at extension <code>print</code>. */
	private Collection<PlaceholderModel> _placeholders;
	
	/** <i>Generated variable</i> - Variable of <code>PlaceholderTemplate.type</code> attribute defined at extension <code>print</code>. */
	private ComposedTypeModel _type;
	
	/** <i>Generated variable</i> - Variable of <code>PlaceholderTemplate.layoutTemplates</code> attribute defined at extension <code>print</code>. */
	private List<AbstractLayoutTemplateModel> _layoutTemplates;
	
	/** <i>Generated variable</i> - Variable of <code>PlaceholderTemplate.cometConfig</code> attribute defined at extension <code>print</code>. */
	private CometConfigurationModel _cometConfig;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PlaceholderTemplateModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PlaceholderTemplateModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>PlaceholderTemplate</code> at extension <code>print</code>
	 * @param _cometConfig initial attribute declared by type <code>PlaceholderTemplate</code> at extension <code>print</code>
	 */
	@Deprecated
	public PlaceholderTemplateModel(final String _code, final CometConfigurationModel _cometConfig)
	{
		super();
		setCode(_code);
		setCometConfig(_cometConfig);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>PlaceholderTemplate</code> at extension <code>print</code>
	 * @param _cometConfig initial attribute declared by type <code>PlaceholderTemplate</code> at extension <code>print</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public PlaceholderTemplateModel(final String _code, final CometConfigurationModel _cometConfig, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setCometConfig(_cometConfig);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PlaceholderTemplate.alternativeMediaExpression</code> attribute defined at extension <code>print</code>. 
	 * @return the alternativeMediaExpression
	 */
	public String getAlternativeMediaExpression()
	{
		if (this._alternativeMediaExpression!=null)
		{
			return _alternativeMediaExpression;
		}
		return _alternativeMediaExpression = getPersistenceContext().getValue(ALTERNATIVEMEDIAEXPRESSION, _alternativeMediaExpression);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PlaceholderTemplate.code</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>PlaceholderTemplate.cometConfig</code> attribute defined at extension <code>print</code>. 
	 * @return the cometConfig
	 */
	public CometConfigurationModel getCometConfig()
	{
		if (this._cometConfig!=null)
		{
			return _cometConfig;
		}
		return _cometConfig = getPersistenceContext().getValue(COMETCONFIG, _cometConfig);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PlaceholderTemplate.displayNamePattern</code> attribute defined at extension <code>print</code>. 
	 * @return the displayNamePattern
	 */
	public String getDisplayNamePattern()
	{
		if (this._displayNamePattern!=null)
		{
			return _displayNamePattern;
		}
		return _displayNamePattern = getPersistenceContext().getValue(DISPLAYNAMEPATTERN, _displayNamePattern);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PlaceholderTemplate.layoutTemplates</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the layoutTemplates
	 */
	public List<AbstractLayoutTemplateModel> getLayoutTemplates()
	{
		if (this._layoutTemplates!=null)
		{
			return _layoutTemplates;
		}
		return _layoutTemplates = getPersistenceContext().getValue(LAYOUTTEMPLATES, _layoutTemplates);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PlaceholderTemplate.placeholders</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the placeholders
	 */
	public Collection<PlaceholderModel> getPlaceholders()
	{
		if (this._placeholders!=null)
		{
			return _placeholders;
		}
		return _placeholders = getPersistenceContext().getValue(PLACEHOLDERS, _placeholders);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PlaceholderTemplate.previewTemplate</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>PlaceholderTemplate.type</code> attribute defined at extension <code>print</code>. 
	 * @return the type
	 */
	public ComposedTypeModel getType()
	{
		if (this._type!=null)
		{
			return _type;
		}
		return _type = getPersistenceContext().getValue(TYPE, _type);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PlaceholderTemplate.alternativeMediaExpression</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the alternativeMediaExpression
	 */
	public void setAlternativeMediaExpression(final String value)
	{
		_alternativeMediaExpression = getPersistenceContext().setValue(ALTERNATIVEMEDIAEXPRESSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PlaceholderTemplate.code</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PlaceholderTemplate.cometConfig</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the cometConfig
	 */
	public void setCometConfig(final CometConfigurationModel value)
	{
		_cometConfig = getPersistenceContext().setValue(COMETCONFIG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PlaceholderTemplate.displayNamePattern</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the displayNamePattern
	 */
	public void setDisplayNamePattern(final String value)
	{
		_displayNamePattern = getPersistenceContext().setValue(DISPLAYNAMEPATTERN, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PlaceholderTemplate.layoutTemplates</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the layoutTemplates
	 */
	public void setLayoutTemplates(final List<AbstractLayoutTemplateModel> value)
	{
		_layoutTemplates = getPersistenceContext().setValue(LAYOUTTEMPLATES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PlaceholderTemplate.placeholders</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the placeholders
	 */
	public void setPlaceholders(final Collection<PlaceholderModel> value)
	{
		_placeholders = getPersistenceContext().setValue(PLACEHOLDERS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PlaceholderTemplate.previewTemplate</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the previewTemplate
	 */
	public void setPreviewTemplate(final String value)
	{
		_previewTemplate = getPersistenceContext().setValue(PREVIEWTEMPLATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PlaceholderTemplate.type</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the type
	 */
	public void setType(final ComposedTypeModel value)
	{
		_type = getPersistenceContext().setValue(TYPE, value);
	}
	
}
