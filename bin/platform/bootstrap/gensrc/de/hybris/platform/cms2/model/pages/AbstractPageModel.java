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
import de.hybris.platform.cms2.enums.CmsApprovalStatus;
import de.hybris.platform.cms2.model.contents.CMSItemModel;
import de.hybris.platform.cms2.model.navigation.CMSNavigationNodeModel;
import de.hybris.platform.cms2.model.pages.PageTemplateModel;
import de.hybris.platform.cms2.model.relations.ContentSlotForPageModel;
import de.hybris.platform.cms2.model.restrictions.AbstractRestrictionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.List;
import java.util.Locale;

/**
 * Generated model class for type AbstractPage first defined at extension cms2.
 */
@SuppressWarnings("all")
public class AbstractPageModel extends CMSItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "AbstractPage";
	
	/**<i>Generated relation code constant for relation <code>AbstractPage2UserRelation</code> defining source attribute <code>lockedBy</code> in extension <code>cms2</code>.</i>*/
	public final static String _ABSTRACTPAGE2USERRELATION = "AbstractPage2UserRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPage.approvalStatus</code> attribute defined at extension <code>cms2</code>. */
	public static final String APPROVALSTATUS = "approvalStatus";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPage.title</code> attribute defined at extension <code>cms2</code>. */
	public static final String TITLE = "title";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPage.masterTemplate</code> attribute defined at extension <code>cms2</code>. */
	public static final String MASTERTEMPLATE = "masterTemplate";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPage.defaultPage</code> attribute defined at extension <code>cms2</code>. */
	public static final String DEFAULTPAGE = "defaultPage";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPage.onlyOneRestrictionMustApply</code> attribute defined at extension <code>cms2</code>. */
	public static final String ONLYONERESTRICTIONMUSTAPPLY = "onlyOneRestrictionMustApply";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPage.previewImage</code> attribute defined at extension <code>cms2</code>. */
	public static final String PREVIEWIMAGE = "previewImage";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPage.contentSlots</code> attribute defined at extension <code>cms2</code>. */
	public static final String CONTENTSLOTS = "contentSlots";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPage.type</code> attribute defined at extension <code>cms2</code>. */
	public static final String TYPE = "type";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPage.typeCode</code> attribute defined at extension <code>cms2</code>. */
	public static final String TYPECODE = "typeCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPage.missingContentSlots</code> attribute defined at extension <code>cms2</code>. */
	public static final String MISSINGCONTENTSLOTS = "missingContentSlots";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPage.availableContentSlots</code> attribute defined at extension <code>cms2</code>. */
	public static final String AVAILABLECONTENTSLOTS = "availableContentSlots";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPage.view</code> attribute defined at extension <code>cms2</code>. */
	public static final String VIEW = "view";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPage.navigationNodeList</code> attribute defined at extension <code>cms2</code>. */
	public static final String NAVIGATIONNODELIST = "navigationNodeList";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPage.restrictions</code> attribute defined at extension <code>cms2</code>. */
	public static final String RESTRICTIONS = "restrictions";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPage.lockedBy</code> attribute defined at extension <code>cms2</code>. */
	public static final String LOCKEDBY = "lockedBy";
	
	
	/** <i>Generated variable</i> - Variable of <code>AbstractPage.approvalStatus</code> attribute defined at extension <code>cms2</code>. */
	private CmsApprovalStatus _approvalStatus;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractPage.masterTemplate</code> attribute defined at extension <code>cms2</code>. */
	private PageTemplateModel _masterTemplate;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractPage.defaultPage</code> attribute defined at extension <code>cms2</code>. */
	private Boolean _defaultPage;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractPage.onlyOneRestrictionMustApply</code> attribute defined at extension <code>cms2</code>. */
	private Boolean _onlyOneRestrictionMustApply;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractPage.previewImage</code> attribute defined at extension <code>cms2</code>. */
	private MediaModel _previewImage;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractPage.contentSlots</code> attribute defined at extension <code>cms2</code>. */
	private List<ContentSlotForPageModel> _contentSlots;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractPage.typeCode</code> attribute defined at extension <code>cms2</code>. */
	private String _typeCode;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractPage.missingContentSlots</code> attribute defined at extension <code>cms2</code>. */
	private String _missingContentSlots;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractPage.availableContentSlots</code> attribute defined at extension <code>cms2</code>. */
	private String _availableContentSlots;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractPage.view</code> attribute defined at extension <code>cms2</code>. */
	private String _view;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractPage.navigationNodeList</code> attribute defined at extension <code>cms2</code>. */
	private List<CMSNavigationNodeModel> _navigationNodeList;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractPage.restrictions</code> attribute defined at extension <code>cms2</code>. */
	private List<AbstractRestrictionModel> _restrictions;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractPage.lockedBy</code> attribute defined at extension <code>cms2</code>. */
	private UserModel _lockedBy;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AbstractPageModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AbstractPageModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _masterTemplate initial attribute declared by type <code>AbstractPage</code> at extension <code>cms2</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public AbstractPageModel(final CatalogVersionModel _catalogVersion, final PageTemplateModel _masterTemplate, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setMasterTemplate(_masterTemplate);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _masterTemplate initial attribute declared by type <code>AbstractPage</code> at extension <code>cms2</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public AbstractPageModel(final CatalogVersionModel _catalogVersion, final PageTemplateModel _masterTemplate, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setMasterTemplate(_masterTemplate);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPage.approvalStatus</code> attribute defined at extension <code>cms2</code>. 
	 * @return the approvalStatus
	 */
	public CmsApprovalStatus getApprovalStatus()
	{
		if (this._approvalStatus!=null)
		{
			return _approvalStatus;
		}
		return _approvalStatus = getPersistenceContext().getValue(APPROVALSTATUS, _approvalStatus);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPage.availableContentSlots</code> attribute defined at extension <code>cms2</code>. 
	 * @return the availableContentSlots
	 */
	@Deprecated
	public String getAvailableContentSlots()
	{
		if (this._availableContentSlots!=null)
		{
			return _availableContentSlots;
		}
		return _availableContentSlots = getPersistenceContext().getValue(AVAILABLECONTENTSLOTS, _availableContentSlots);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPage.contentSlots</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the contentSlots
	 */
	@Deprecated
	public List<ContentSlotForPageModel> getContentSlots()
	{
		if (this._contentSlots!=null)
		{
			return _contentSlots;
		}
		return _contentSlots = getPersistenceContext().getValue(CONTENTSLOTS, _contentSlots);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPage.defaultPage</code> attribute defined at extension <code>cms2</code>. 
	 * @return the defaultPage
	 */
	public Boolean getDefaultPage()
	{
		if (this._defaultPage!=null)
		{
			return _defaultPage;
		}
		return _defaultPage = getPersistenceContext().getValue(DEFAULTPAGE, _defaultPage);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPage.lockedBy</code> attribute defined at extension <code>cms2</code>. 
	 * @return the lockedBy
	 */
	public UserModel getLockedBy()
	{
		if (this._lockedBy!=null)
		{
			return _lockedBy;
		}
		return _lockedBy = getPersistenceContext().getValue(LOCKEDBY, _lockedBy);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPage.masterTemplate</code> attribute defined at extension <code>cms2</code>. 
	 * @return the masterTemplate
	 */
	public PageTemplateModel getMasterTemplate()
	{
		if (this._masterTemplate!=null)
		{
			return _masterTemplate;
		}
		return _masterTemplate = getPersistenceContext().getValue(MASTERTEMPLATE, _masterTemplate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPage.missingContentSlots</code> attribute defined at extension <code>cms2</code>. 
	 * @return the missingContentSlots
	 */
	@Deprecated
	public String getMissingContentSlots()
	{
		if (this._missingContentSlots!=null)
		{
			return _missingContentSlots;
		}
		return _missingContentSlots = getPersistenceContext().getValue(MISSINGCONTENTSLOTS, _missingContentSlots);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPage.navigationNodeList</code> dynamic attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the navigationNodeList
	 */
	public List<CMSNavigationNodeModel> getNavigationNodeList()
	{
		return getPersistenceContext().getDynamicValue(this,NAVIGATIONNODELIST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPage.previewImage</code> attribute defined at extension <code>cms2</code>. 
	 * @return the previewImage
	 */
	public MediaModel getPreviewImage()
	{
		if (this._previewImage!=null)
		{
			return _previewImage;
		}
		return _previewImage = getPersistenceContext().getValue(PREVIEWIMAGE, _previewImage);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPage.restrictions</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the restrictions
	 */
	public List<AbstractRestrictionModel> getRestrictions()
	{
		if (this._restrictions!=null)
		{
			return _restrictions;
		}
		return _restrictions = getPersistenceContext().getValue(RESTRICTIONS, _restrictions);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPage.title</code> attribute defined at extension <code>cms2</code>. 
	 * @return the title
	 */
	public String getTitle()
	{
		return getTitle(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPage.title</code> attribute defined at extension <code>cms2</code>. 
	 * @param loc the value localization key 
	 * @return the title
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getTitle(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(TITLE, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPage.type</code> attribute defined at extension <code>cms2</code>. 
	 * @return the type
	 */
	@Deprecated
	public String getType()
	{
		return getType(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPage.type</code> attribute defined at extension <code>cms2</code>. 
	 * @param loc the value localization key 
	 * @return the type
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Deprecated
	public String getType(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(TYPE, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPage.typeCode</code> attribute defined at extension <code>cms2</code>. 
	 * @return the typeCode
	 */
	@Deprecated
	public String getTypeCode()
	{
		if (this._typeCode!=null)
		{
			return _typeCode;
		}
		return _typeCode = getPersistenceContext().getValue(TYPECODE, _typeCode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPage.view</code> attribute defined at extension <code>cms2</code>. 
	 * @return the view
	 */
	@Deprecated
	public String getView()
	{
		if (this._view!=null)
		{
			return _view;
		}
		return _view = getPersistenceContext().getValue(VIEW, _view);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPage.onlyOneRestrictionMustApply</code> attribute defined at extension <code>cms2</code>. 
	 * @return the onlyOneRestrictionMustApply
	 */
	public boolean isOnlyOneRestrictionMustApply()
	{
		return toPrimitive( _onlyOneRestrictionMustApply = getPersistenceContext().getValue(ONLYONERESTRICTIONMUSTAPPLY, _onlyOneRestrictionMustApply));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractPage.approvalStatus</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the approvalStatus
	 */
	public void setApprovalStatus(final CmsApprovalStatus value)
	{
		_approvalStatus = getPersistenceContext().setValue(APPROVALSTATUS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractPage.defaultPage</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the defaultPage
	 */
	public void setDefaultPage(final Boolean value)
	{
		_defaultPage = getPersistenceContext().setValue(DEFAULTPAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractPage.lockedBy</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the lockedBy
	 */
	public void setLockedBy(final UserModel value)
	{
		_lockedBy = getPersistenceContext().setValue(LOCKEDBY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractPage.masterTemplate</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the masterTemplate
	 */
	public void setMasterTemplate(final PageTemplateModel value)
	{
		_masterTemplate = getPersistenceContext().setValue(MASTERTEMPLATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractPage.navigationNodeList</code> dynamic attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the navigationNodeList
	 */
	public void setNavigationNodeList(final List<CMSNavigationNodeModel> value)
	{
		getPersistenceContext().setDynamicValue(this,NAVIGATIONNODELIST, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractPage.onlyOneRestrictionMustApply</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the onlyOneRestrictionMustApply
	 */
	public void setOnlyOneRestrictionMustApply(final boolean value)
	{
		_onlyOneRestrictionMustApply = getPersistenceContext().setValue(ONLYONERESTRICTIONMUSTAPPLY, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractPage.previewImage</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the previewImage
	 */
	public void setPreviewImage(final MediaModel value)
	{
		_previewImage = getPersistenceContext().setValue(PREVIEWIMAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractPage.restrictions</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the restrictions
	 */
	public void setRestrictions(final List<AbstractRestrictionModel> value)
	{
		_restrictions = getPersistenceContext().setValue(RESTRICTIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractPage.title</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the title
	 */
	public void setTitle(final String value)
	{
		setTitle(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractPage.title</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the title
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setTitle(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(TITLE, loc, value);
	}
	
}
