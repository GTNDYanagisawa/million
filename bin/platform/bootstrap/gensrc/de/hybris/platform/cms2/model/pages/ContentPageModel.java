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
import de.hybris.platform.cms2.model.contents.components.CMSLinkComponentModel;
import de.hybris.platform.cms2.model.navigation.CMSNavigationNodeModel;
import de.hybris.platform.cms2.model.pages.AbstractPageModel;
import de.hybris.platform.cms2.model.pages.PageTemplateModel;
import de.hybris.platform.cms2lib.model.components.BannerComponentModel;
import de.hybris.platform.cms2lib.model.components.FlashComponentModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.List;
import java.util.Locale;

/**
 * Generated model class for type ContentPage first defined at extension cms2.
 */
@SuppressWarnings("all")
public class ContentPageModel extends AbstractPageModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ContentPage";
	
	/**<i>Generated relation code constant for relation <code>BannersForContentPage</code> defining source attribute <code>bannerComponets</code> in extension <code>cms2lib</code>.</i>*/
	public final static String _BANNERSFORCONTENTPAGE = "BannersForContentPage";
	
	/**<i>Generated relation code constant for relation <code>FlashComponentsForContentPage</code> defining source attribute <code>flashComponents</code> in extension <code>cms2lib</code>.</i>*/
	public final static String _FLASHCOMPONENTSFORCONTENTPAGE = "FlashComponentsForContentPage";
	
	/** <i>Generated constant</i> - Attribute key of <code>ContentPage.label</code> attribute defined at extension <code>cms2</code>. */
	public static final String LABEL = "label";
	
	/** <i>Generated constant</i> - Attribute key of <code>ContentPage.homepage</code> attribute defined at extension <code>cms2</code>. */
	public static final String HOMEPAGE = "homepage";
	
	/** <i>Generated constant</i> - Attribute key of <code>ContentPage.labelOrId</code> attribute defined at extension <code>cms2</code>. */
	public static final String LABELORID = "labelOrId";
	
	/** <i>Generated constant</i> - Attribute key of <code>ContentPage.navigationNodes</code> attribute defined at extension <code>cms2</code>. */
	public static final String NAVIGATIONNODES = "navigationNodes";
	
	/** <i>Generated constant</i> - Attribute key of <code>ContentPage.linkComponents</code> attribute defined at extension <code>cms2</code>. */
	public static final String LINKCOMPONENTS = "linkComponents";
	
	/** <i>Generated constant</i> - Attribute key of <code>ContentPage.bannerComponets</code> attribute defined at extension <code>cms2lib</code>. */
	public static final String BANNERCOMPONETS = "bannerComponets";
	
	/** <i>Generated constant</i> - Attribute key of <code>ContentPage.flashComponents</code> attribute defined at extension <code>cms2lib</code>. */
	public static final String FLASHCOMPONENTS = "flashComponents";
	
	/** <i>Generated constant</i> - Attribute key of <code>ContentPage.keywords</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String KEYWORDS = "keywords";
	
	/** <i>Generated constant</i> - Attribute key of <code>ContentPage.description</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String DESCRIPTION = "description";
	
	
	/** <i>Generated variable</i> - Variable of <code>ContentPage.label</code> attribute defined at extension <code>cms2</code>. */
	private String _label;
	
	/** <i>Generated variable</i> - Variable of <code>ContentPage.homepage</code> attribute defined at extension <code>cms2</code>. */
	private Boolean _homepage;
	
	/** <i>Generated variable</i> - Variable of <code>ContentPage.labelOrId</code> attribute defined at extension <code>cms2</code>. */
	private String _labelOrId;
	
	/** <i>Generated variable</i> - Variable of <code>ContentPage.navigationNodes</code> attribute defined at extension <code>cms2</code>. */
	private List<CMSNavigationNodeModel> _navigationNodes;
	
	/** <i>Generated variable</i> - Variable of <code>ContentPage.linkComponents</code> attribute defined at extension <code>cms2</code>. */
	private List<CMSLinkComponentModel> _linkComponents;
	
	/** <i>Generated variable</i> - Variable of <code>ContentPage.bannerComponets</code> attribute defined at extension <code>cms2lib</code>. */
	private List<BannerComponentModel> _bannerComponets;
	
	/** <i>Generated variable</i> - Variable of <code>ContentPage.flashComponents</code> attribute defined at extension <code>cms2lib</code>. */
	private List<FlashComponentModel> _flashComponents;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ContentPageModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ContentPageModel(final ItemModelContext ctx)
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
	public ContentPageModel(final CatalogVersionModel _catalogVersion, final PageTemplateModel _masterTemplate, final String _uid)
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
	public ContentPageModel(final CatalogVersionModel _catalogVersion, final PageTemplateModel _masterTemplate, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setMasterTemplate(_masterTemplate);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentPage.bannerComponets</code> attribute defined at extension <code>cms2lib</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the bannerComponets
	 */
	public List<BannerComponentModel> getBannerComponets()
	{
		if (this._bannerComponets!=null)
		{
			return _bannerComponets;
		}
		return _bannerComponets = getPersistenceContext().getValue(BANNERCOMPONETS, _bannerComponets);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentPage.description</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the description - Localized content page description.
	 */
	public String getDescription()
	{
		return getDescription(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentPage.description</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @param loc the value localization key 
	 * @return the description - Localized content page description.
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getDescription(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(DESCRIPTION, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentPage.flashComponents</code> attribute defined at extension <code>cms2lib</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the flashComponents
	 */
	public List<FlashComponentModel> getFlashComponents()
	{
		if (this._flashComponents!=null)
		{
			return _flashComponents;
		}
		return _flashComponents = getPersistenceContext().getValue(FLASHCOMPONENTS, _flashComponents);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentPage.keywords</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the keywords - Localized content page keywords.
	 */
	public String getKeywords()
	{
		return getKeywords(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentPage.keywords</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @param loc the value localization key 
	 * @return the keywords - Localized content page keywords.
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getKeywords(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(KEYWORDS, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentPage.label</code> attribute defined at extension <code>cms2</code>. 
	 * @return the label
	 */
	public String getLabel()
	{
		if (this._label!=null)
		{
			return _label;
		}
		return _label = getPersistenceContext().getValue(LABEL, _label);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentPage.labelOrId</code> attribute defined at extension <code>cms2</code>. 
	 * @return the labelOrId
	 */
	@Deprecated
	public String getLabelOrId()
	{
		if (this._labelOrId!=null)
		{
			return _labelOrId;
		}
		return _labelOrId = getPersistenceContext().getValue(LABELORID, _labelOrId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentPage.linkComponents</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the linkComponents
	 */
	public List<CMSLinkComponentModel> getLinkComponents()
	{
		if (this._linkComponents!=null)
		{
			return _linkComponents;
		}
		return _linkComponents = getPersistenceContext().getValue(LINKCOMPONENTS, _linkComponents);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentPage.navigationNodes</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the navigationNodes
	 */
	@Deprecated
	public List<CMSNavigationNodeModel> getNavigationNodes()
	{
		if (this._navigationNodes!=null)
		{
			return _navigationNodes;
		}
		return _navigationNodes = getPersistenceContext().getValue(NAVIGATIONNODES, _navigationNodes);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentPage.homepage</code> attribute defined at extension <code>cms2</code>. 
	 * @return the homepage
	 */
	public boolean isHomepage()
	{
		return toPrimitive( _homepage = getPersistenceContext().getValue(HOMEPAGE, _homepage));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ContentPage.bannerComponets</code> attribute defined at extension <code>cms2lib</code>. 
	 *  
	 * @param value the bannerComponets
	 */
	public void setBannerComponets(final List<BannerComponentModel> value)
	{
		_bannerComponets = getPersistenceContext().setValue(BANNERCOMPONETS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ContentPage.description</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the description - Localized content page description.
	 */
	public void setDescription(final String value)
	{
		setDescription(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>ContentPage.description</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the description - Localized content page description.
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setDescription(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(DESCRIPTION, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ContentPage.flashComponents</code> attribute defined at extension <code>cms2lib</code>. 
	 *  
	 * @param value the flashComponents
	 */
	public void setFlashComponents(final List<FlashComponentModel> value)
	{
		_flashComponents = getPersistenceContext().setValue(FLASHCOMPONENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ContentPage.homepage</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the homepage
	 */
	public void setHomepage(final boolean value)
	{
		_homepage = getPersistenceContext().setValue(HOMEPAGE, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ContentPage.keywords</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the keywords - Localized content page keywords.
	 */
	public void setKeywords(final String value)
	{
		setKeywords(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>ContentPage.keywords</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the keywords - Localized content page keywords.
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setKeywords(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(KEYWORDS, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ContentPage.label</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the label
	 */
	public void setLabel(final String value)
	{
		_label = getPersistenceContext().setValue(LABEL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ContentPage.linkComponents</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the linkComponents
	 */
	public void setLinkComponents(final List<CMSLinkComponentModel> value)
	{
		_linkComponents = getPersistenceContext().setValue(LINKCOMPONENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ContentPage.navigationNodes</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the navigationNodes
	 */
	@Deprecated
	public void setNavigationNodes(final List<CMSNavigationNodeModel> value)
	{
		_navigationNodes = getPersistenceContext().setValue(NAVIGATIONNODES, value);
	}
	
}
