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
package de.hybris.platform.cms2.model.pages;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.cms2.model.CMSPageTypeModel;
import de.hybris.platform.cms2.model.contents.CMSItemModel;
import de.hybris.platform.cms2.model.contents.ContentSlotNameModel;
import de.hybris.platform.cms2.model.relations.ContentSlotForTemplateModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.List;
import java.util.Set;

/**
 * Generated model class for type PageTemplate first defined at extension cms2.
 */
@SuppressWarnings("all")
public class PageTemplateModel extends CMSItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PageTemplate";
	
	/** <i>Generated constant</i> - Attribute key of <code>PageTemplate.active</code> attribute defined at extension <code>cms2</code>. */
	public static final String ACTIVE = "active";
	
	/** <i>Generated constant</i> - Attribute key of <code>PageTemplate.velocityTemplate</code> attribute defined at extension <code>cms2</code>. */
	public static final String VELOCITYTEMPLATE = "velocityTemplate";
	
	/** <i>Generated constant</i> - Attribute key of <code>PageTemplate.frontendTemplateName</code> attribute defined at extension <code>cms2</code>. */
	public static final String FRONTENDTEMPLATENAME = "frontendTemplateName";
	
	/** <i>Generated constant</i> - Attribute key of <code>PageTemplate.contentSlots</code> attribute defined at extension <code>cms2</code>. */
	public static final String CONTENTSLOTS = "contentSlots";
	
	/** <i>Generated constant</i> - Attribute key of <code>PageTemplate.previewIcon</code> attribute defined at extension <code>cms2</code>. */
	public static final String PREVIEWICON = "previewIcon";
	
	/** <i>Generated constant</i> - Attribute key of <code>PageTemplate.availableContentSlots</code> attribute defined at extension <code>cms2</code>. */
	public static final String AVAILABLECONTENTSLOTS = "availableContentSlots";
	
	/** <i>Generated constant</i> - Attribute key of <code>PageTemplate.restrictedPageTypes</code> attribute defined at extension <code>cms2</code>. */
	public static final String RESTRICTEDPAGETYPES = "restrictedPageTypes";
	
	
	/** <i>Generated variable</i> - Variable of <code>PageTemplate.active</code> attribute defined at extension <code>cms2</code>. */
	private Boolean _active;
	
	/** <i>Generated variable</i> - Variable of <code>PageTemplate.velocityTemplate</code> attribute defined at extension <code>cms2</code>. */
	private String _velocityTemplate;
	
	/** <i>Generated variable</i> - Variable of <code>PageTemplate.frontendTemplateName</code> attribute defined at extension <code>cms2</code>. */
	private String _frontendTemplateName;
	
	/** <i>Generated variable</i> - Variable of <code>PageTemplate.contentSlots</code> attribute defined at extension <code>cms2</code>. */
	private List<ContentSlotForTemplateModel> _contentSlots;
	
	/** <i>Generated variable</i> - Variable of <code>PageTemplate.previewIcon</code> attribute defined at extension <code>cms2</code>. */
	private MediaModel _previewIcon;
	
	/** <i>Generated variable</i> - Variable of <code>PageTemplate.availableContentSlots</code> attribute defined at extension <code>cms2</code>. */
	private List<ContentSlotNameModel> _availableContentSlots;
	
	/** <i>Generated variable</i> - Variable of <code>PageTemplate.restrictedPageTypes</code> attribute defined at extension <code>cms2</code>. */
	private Set<CMSPageTypeModel> _restrictedPageTypes;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PageTemplateModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PageTemplateModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public PageTemplateModel(final CatalogVersionModel _catalogVersion, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public PageTemplateModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PageTemplate.active</code> attribute defined at extension <code>cms2</code>. 
	 * @return the active
	 */
	public Boolean getActive()
	{
		if (this._active!=null)
		{
			return _active;
		}
		return _active = getPersistenceContext().getValue(ACTIVE, _active);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PageTemplate.availableContentSlots</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the availableContentSlots
	 */
	public List<ContentSlotNameModel> getAvailableContentSlots()
	{
		if (this._availableContentSlots!=null)
		{
			return _availableContentSlots;
		}
		return _availableContentSlots = getPersistenceContext().getValue(AVAILABLECONTENTSLOTS, _availableContentSlots);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PageTemplate.contentSlots</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the contentSlots
	 */
	@Deprecated
	public List<ContentSlotForTemplateModel> getContentSlots()
	{
		if (this._contentSlots!=null)
		{
			return _contentSlots;
		}
		return _contentSlots = getPersistenceContext().getValue(CONTENTSLOTS, _contentSlots);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PageTemplate.frontendTemplateName</code> attribute defined at extension <code>cms2</code>. 
	 * @return the frontendTemplateName
	 */
	public String getFrontendTemplateName()
	{
		if (this._frontendTemplateName!=null)
		{
			return _frontendTemplateName;
		}
		return _frontendTemplateName = getPersistenceContext().getValue(FRONTENDTEMPLATENAME, _frontendTemplateName);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PageTemplate.previewIcon</code> attribute defined at extension <code>cms2</code>. 
	 * @return the previewIcon
	 */
	public MediaModel getPreviewIcon()
	{
		if (this._previewIcon!=null)
		{
			return _previewIcon;
		}
		return _previewIcon = getPersistenceContext().getValue(PREVIEWICON, _previewIcon);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PageTemplate.restrictedPageTypes</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the restrictedPageTypes
	 */
	public Set<CMSPageTypeModel> getRestrictedPageTypes()
	{
		if (this._restrictedPageTypes!=null)
		{
			return _restrictedPageTypes;
		}
		return _restrictedPageTypes = getPersistenceContext().getValue(RESTRICTEDPAGETYPES, _restrictedPageTypes);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PageTemplate.velocityTemplate</code> attribute defined at extension <code>cms2</code>. 
	 * @return the velocityTemplate
	 */
	public String getVelocityTemplate()
	{
		if (this._velocityTemplate!=null)
		{
			return _velocityTemplate;
		}
		return _velocityTemplate = getPersistenceContext().getValue(VELOCITYTEMPLATE, _velocityTemplate);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PageTemplate.active</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the active
	 */
	public void setActive(final Boolean value)
	{
		_active = getPersistenceContext().setValue(ACTIVE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PageTemplate.availableContentSlots</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the availableContentSlots
	 */
	public void setAvailableContentSlots(final List<ContentSlotNameModel> value)
	{
		_availableContentSlots = getPersistenceContext().setValue(AVAILABLECONTENTSLOTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PageTemplate.frontendTemplateName</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the frontendTemplateName
	 */
	public void setFrontendTemplateName(final String value)
	{
		_frontendTemplateName = getPersistenceContext().setValue(FRONTENDTEMPLATENAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PageTemplate.previewIcon</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the previewIcon
	 */
	public void setPreviewIcon(final MediaModel value)
	{
		_previewIcon = getPersistenceContext().setValue(PREVIEWICON, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PageTemplate.restrictedPageTypes</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the restrictedPageTypes
	 */
	public void setRestrictedPageTypes(final Set<CMSPageTypeModel> value)
	{
		_restrictedPageTypes = getPersistenceContext().setValue(RESTRICTEDPAGETYPES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PageTemplate.velocityTemplate</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the velocityTemplate
	 */
	public void setVelocityTemplate(final String value)
	{
		_velocityTemplate = getPersistenceContext().setValue(VELOCITYTEMPLATE, value);
	}
	
}
