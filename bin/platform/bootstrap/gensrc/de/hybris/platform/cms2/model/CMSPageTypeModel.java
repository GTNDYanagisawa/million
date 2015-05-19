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
package de.hybris.platform.cms2.model;

import de.hybris.platform.cms2.model.RestrictionTypeModel;
import de.hybris.platform.cms2.model.pages.PageTemplateModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.type.ComposedTypeModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Set;

/**
 * Generated model class for type CMSPageType first defined at extension cms2.
 */
@SuppressWarnings("all")
public class CMSPageTypeModel extends ComposedTypeModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CMSPageType";
	
	/**<i>Generated relation code constant for relation <code>ApplicableRestrictionTypeForPageTypes</code> defining source attribute <code>restrictionTypes</code> in extension <code>cms2</code>.</i>*/
	public final static String _APPLICABLERESTRICTIONTYPEFORPAGETYPES = "ApplicableRestrictionTypeForPageTypes";
	
	/**<i>Generated relation code constant for relation <code>ValidPageTypesForTemplates</code> defining source attribute <code>templates</code> in extension <code>cms2</code>.</i>*/
	public final static String _VALIDPAGETYPESFORTEMPLATES = "ValidPageTypesForTemplates";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSPageType.previewDisabled</code> attribute defined at extension <code>cms2</code>. */
	public static final String PREVIEWDISABLED = "previewDisabled";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSPageType.restrictionTypes</code> attribute defined at extension <code>cms2</code>. */
	public static final String RESTRICTIONTYPES = "restrictionTypes";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSPageType.templates</code> attribute defined at extension <code>cms2</code>. */
	public static final String TEMPLATES = "templates";
	
	
	/** <i>Generated variable</i> - Variable of <code>CMSPageType.previewDisabled</code> attribute defined at extension <code>cms2</code>. */
	private Boolean _previewDisabled;
	
	/** <i>Generated variable</i> - Variable of <code>CMSPageType.restrictionTypes</code> attribute defined at extension <code>cms2</code>. */
	private Collection<RestrictionTypeModel> _restrictionTypes;
	
	/** <i>Generated variable</i> - Variable of <code>CMSPageType.templates</code> attribute defined at extension <code>cms2</code>. */
	private Set<PageTemplateModel> _templates;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CMSPageTypeModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CMSPageTypeModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogItemType initial attribute declared by type <code>ComposedType</code> at extension <code>catalog</code>
	 * @param _code initial attribute declared by type <code>Type</code> at extension <code>core</code>
	 * @param _generate initial attribute declared by type <code>TypeManagerManaged</code> at extension <code>core</code>
	 * @param _singleton initial attribute declared by type <code>ComposedType</code> at extension <code>core</code>
	 * @param _superType initial attribute declared by type <code>ComposedType</code> at extension <code>core</code>
	 */
	@Deprecated
	public CMSPageTypeModel(final Boolean _catalogItemType, final String _code, final Boolean _generate, final Boolean _singleton, final ComposedTypeModel _superType)
	{
		super();
		setCatalogItemType(_catalogItemType);
		setCode(_code);
		setGenerate(_generate);
		setSingleton(_singleton);
		setSuperType(_superType);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogItemType initial attribute declared by type <code>ComposedType</code> at extension <code>catalog</code>
	 * @param _code initial attribute declared by type <code>Type</code> at extension <code>core</code>
	 * @param _generate initial attribute declared by type <code>TypeManagerManaged</code> at extension <code>core</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _singleton initial attribute declared by type <code>ComposedType</code> at extension <code>core</code>
	 * @param _superType initial attribute declared by type <code>ComposedType</code> at extension <code>core</code>
	 */
	@Deprecated
	public CMSPageTypeModel(final Boolean _catalogItemType, final String _code, final Boolean _generate, final ItemModel _owner, final Boolean _singleton, final ComposedTypeModel _superType)
	{
		super();
		setCatalogItemType(_catalogItemType);
		setCode(_code);
		setGenerate(_generate);
		setOwner(_owner);
		setSingleton(_singleton);
		setSuperType(_superType);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSPageType.restrictionTypes</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the restrictionTypes
	 */
	public Collection<RestrictionTypeModel> getRestrictionTypes()
	{
		if (this._restrictionTypes!=null)
		{
			return _restrictionTypes;
		}
		return _restrictionTypes = getPersistenceContext().getValue(RESTRICTIONTYPES, _restrictionTypes);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSPageType.templates</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the templates
	 */
	public Set<PageTemplateModel> getTemplates()
	{
		if (this._templates!=null)
		{
			return _templates;
		}
		return _templates = getPersistenceContext().getValue(TEMPLATES, _templates);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSPageType.previewDisabled</code> attribute defined at extension <code>cms2</code>. 
	 * @return the previewDisabled
	 */
	public boolean isPreviewDisabled()
	{
		return toPrimitive( _previewDisabled = getPersistenceContext().getValue(PREVIEWDISABLED, _previewDisabled));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSPageType.previewDisabled</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the previewDisabled
	 */
	public void setPreviewDisabled(final boolean value)
	{
		_previewDisabled = getPersistenceContext().setValue(PREVIEWDISABLED, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSPageType.restrictionTypes</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the restrictionTypes
	 */
	public void setRestrictionTypes(final Collection<RestrictionTypeModel> value)
	{
		_restrictionTypes = getPersistenceContext().setValue(RESTRICTIONTYPES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSPageType.templates</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the templates
	 */
	public void setTemplates(final Set<PageTemplateModel> value)
	{
		_templates = getPersistenceContext().setValue(TEMPLATES, value);
	}
	
}
