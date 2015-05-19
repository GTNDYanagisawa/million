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
package de.hybris.platform.cms2.model.site;

import de.hybris.platform.acceleratorservices.model.SiteMapConfigModel;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.btg.model.BTGSegmentModel;
import de.hybris.platform.catalog.model.CatalogModel;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.cms2.model.CMSComponentTypeModel;
import de.hybris.platform.cms2.model.contents.ContentCatalogModel;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Generated model class for type CMSSite first defined at extension cms2.
 */
@SuppressWarnings("all")
public class CMSSiteModel extends BaseSiteModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CMSSite";
	
	/**<i>Generated relation code constant for relation <code>BTGSegmentToCMSSite</code> defining source attribute <code>segments</code> in extension <code>btg</code>.</i>*/
	public final static String _BTGSEGMENTTOCMSSITE = "BTGSegmentToCMSSite";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSSite.urlPatterns</code> attribute defined at extension <code>cms2</code>. */
	public static final String URLPATTERNS = "urlPatterns";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSSite.active</code> attribute defined at extension <code>cms2</code>. */
	public static final String ACTIVE = "active";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSSite.activeFrom</code> attribute defined at extension <code>cms2</code>. */
	public static final String ACTIVEFROM = "activeFrom";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSSite.activeUntil</code> attribute defined at extension <code>cms2</code>. */
	public static final String ACTIVEUNTIL = "activeUntil";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSSite.defaultCatalog</code> attribute defined at extension <code>cms2</code>. */
	public static final String DEFAULTCATALOG = "defaultCatalog";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSSite.startingPage</code> attribute defined at extension <code>cms2</code>. */
	public static final String STARTINGPAGE = "startingPage";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSSite.redirectURL</code> attribute defined at extension <code>cms2</code>. */
	public static final String REDIRECTURL = "redirectURL";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSSite.previewURL</code> attribute defined at extension <code>cms2</code>. */
	public static final String PREVIEWURL = "previewURL";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSSite.classificationCatalogs</code> attribute defined at extension <code>cms2</code>. */
	public static final String CLASSIFICATIONCATALOGS = "classificationCatalogs";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSSite.productCatalogs</code> attribute defined at extension <code>cms2</code>. */
	public static final String PRODUCTCATALOGS = "productCatalogs";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSSite.startPageLabel</code> attribute defined at extension <code>cms2</code>. */
	public static final String STARTPAGELABEL = "startPageLabel";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSSite.openPreviewInNewTab</code> attribute defined at extension <code>cms2</code>. */
	public static final String OPENPREVIEWINNEWTAB = "openPreviewInNewTab";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSSite.defaultPreviewCategory</code> attribute defined at extension <code>cms2</code>. */
	public static final String DEFAULTPREVIEWCATEGORY = "defaultPreviewCategory";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSSite.defaultPreviewProduct</code> attribute defined at extension <code>cms2</code>. */
	public static final String DEFAULTPREVIEWPRODUCT = "defaultPreviewProduct";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSSite.defaultPreviewCatalog</code> attribute defined at extension <code>cms2</code>. */
	public static final String DEFAULTPREVIEWCATALOG = "defaultPreviewCatalog";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSSite.contentCatalogs</code> attribute defined at extension <code>cms2</code>. */
	public static final String CONTENTCATALOGS = "contentCatalogs";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSSite.validComponentTypes</code> attribute defined at extension <code>cms2</code>. */
	public static final String VALIDCOMPONENTTYPES = "validComponentTypes";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSSite.segments</code> attribute defined at extension <code>btg</code>. */
	public static final String SEGMENTS = "segments";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSSite.urlEncodingAttributes</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String URLENCODINGATTRIBUTES = "urlEncodingAttributes";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSSite.siteMaps</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String SITEMAPS = "siteMaps";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSSite.siteMapConfig</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String SITEMAPCONFIG = "siteMapConfig";
	
	
	/** <i>Generated variable</i> - Variable of <code>CMSSite.urlPatterns</code> attribute defined at extension <code>cms2</code>. */
	private Collection<String> _urlPatterns;
	
	/** <i>Generated variable</i> - Variable of <code>CMSSite.active</code> attribute defined at extension <code>cms2</code>. */
	private Boolean _active;
	
	/** <i>Generated variable</i> - Variable of <code>CMSSite.activeFrom</code> attribute defined at extension <code>cms2</code>. */
	private Date _activeFrom;
	
	/** <i>Generated variable</i> - Variable of <code>CMSSite.activeUntil</code> attribute defined at extension <code>cms2</code>. */
	private Date _activeUntil;
	
	/** <i>Generated variable</i> - Variable of <code>CMSSite.defaultCatalog</code> attribute defined at extension <code>cms2</code>. */
	private CatalogModel _defaultCatalog;
	
	/** <i>Generated variable</i> - Variable of <code>CMSSite.startingPage</code> attribute defined at extension <code>cms2</code>. */
	private ContentPageModel _startingPage;
	
	/** <i>Generated variable</i> - Variable of <code>CMSSite.redirectURL</code> attribute defined at extension <code>cms2</code>. */
	private String _redirectURL;
	
	/** <i>Generated variable</i> - Variable of <code>CMSSite.previewURL</code> attribute defined at extension <code>cms2</code>. */
	private String _previewURL;
	
	/** <i>Generated variable</i> - Variable of <code>CMSSite.classificationCatalogs</code> attribute defined at extension <code>cms2</code>. */
	private List<CatalogModel> _classificationCatalogs;
	
	/** <i>Generated variable</i> - Variable of <code>CMSSite.productCatalogs</code> attribute defined at extension <code>cms2</code>. */
	private List<CatalogModel> _productCatalogs;
	
	/** <i>Generated variable</i> - Variable of <code>CMSSite.startPageLabel</code> attribute defined at extension <code>cms2</code>. */
	private String _startPageLabel;
	
	/** <i>Generated variable</i> - Variable of <code>CMSSite.openPreviewInNewTab</code> attribute defined at extension <code>cms2</code>. */
	private Boolean _openPreviewInNewTab;
	
	/** <i>Generated variable</i> - Variable of <code>CMSSite.defaultPreviewCategory</code> attribute defined at extension <code>cms2</code>. */
	private CategoryModel _defaultPreviewCategory;
	
	/** <i>Generated variable</i> - Variable of <code>CMSSite.defaultPreviewProduct</code> attribute defined at extension <code>cms2</code>. */
	private ProductModel _defaultPreviewProduct;
	
	/** <i>Generated variable</i> - Variable of <code>CMSSite.defaultPreviewCatalog</code> attribute defined at extension <code>cms2</code>. */
	private CatalogModel _defaultPreviewCatalog;
	
	/** <i>Generated variable</i> - Variable of <code>CMSSite.contentCatalogs</code> attribute defined at extension <code>cms2</code>. */
	private List<ContentCatalogModel> _contentCatalogs;
	
	/** <i>Generated variable</i> - Variable of <code>CMSSite.validComponentTypes</code> attribute defined at extension <code>cms2</code>. */
	private Set<CMSComponentTypeModel> _validComponentTypes;
	
	/** <i>Generated variable</i> - Variable of <code>CMSSite.segments</code> attribute defined at extension <code>btg</code>. */
	private Collection<BTGSegmentModel> _segments;
	
	/** <i>Generated variable</i> - Variable of <code>CMSSite.urlEncodingAttributes</code> attribute defined at extension <code>acceleratorservices</code>. */
	private Collection<String> _urlEncodingAttributes;
	
	/** <i>Generated variable</i> - Variable of <code>CMSSite.siteMaps</code> attribute defined at extension <code>acceleratorservices</code>. */
	private Collection<MediaModel> _siteMaps;
	
	/** <i>Generated variable</i> - Variable of <code>CMSSite.siteMapConfig</code> attribute defined at extension <code>acceleratorservices</code>. */
	private SiteMapConfigModel _siteMapConfig;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CMSSiteModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CMSSiteModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _uid initial attribute declared by type <code>BaseSite</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public CMSSiteModel(final String _uid)
	{
		super();
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>BaseSite</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public CMSSiteModel(final ItemModel _owner, final String _uid)
	{
		super();
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.active</code> attribute defined at extension <code>cms2</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>CMSSite.activeFrom</code> attribute defined at extension <code>cms2</code>. 
	 * @return the activeFrom
	 */
	public Date getActiveFrom()
	{
		if (this._activeFrom!=null)
		{
			return _activeFrom;
		}
		return _activeFrom = getPersistenceContext().getValue(ACTIVEFROM, _activeFrom);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.activeUntil</code> attribute defined at extension <code>cms2</code>. 
	 * @return the activeUntil
	 */
	public Date getActiveUntil()
	{
		if (this._activeUntil!=null)
		{
			return _activeUntil;
		}
		return _activeUntil = getPersistenceContext().getValue(ACTIVEUNTIL, _activeUntil);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.classificationCatalogs</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the classificationCatalogs
	 */
	@Deprecated
	public List<CatalogModel> getClassificationCatalogs()
	{
		if (this._classificationCatalogs!=null)
		{
			return _classificationCatalogs;
		}
		return _classificationCatalogs = getPersistenceContext().getValue(CLASSIFICATIONCATALOGS, _classificationCatalogs);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.contentCatalogs</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the contentCatalogs
	 */
	public List<ContentCatalogModel> getContentCatalogs()
	{
		if (this._contentCatalogs!=null)
		{
			return _contentCatalogs;
		}
		return _contentCatalogs = getPersistenceContext().getValue(CONTENTCATALOGS, _contentCatalogs);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.defaultCatalog</code> attribute defined at extension <code>cms2</code>. 
	 * @return the defaultCatalog
	 */
	public CatalogModel getDefaultCatalog()
	{
		if (this._defaultCatalog!=null)
		{
			return _defaultCatalog;
		}
		return _defaultCatalog = getPersistenceContext().getValue(DEFAULTCATALOG, _defaultCatalog);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.defaultPreviewCatalog</code> attribute defined at extension <code>cms2</code>. 
	 * @return the defaultPreviewCatalog
	 */
	public CatalogModel getDefaultPreviewCatalog()
	{
		if (this._defaultPreviewCatalog!=null)
		{
			return _defaultPreviewCatalog;
		}
		return _defaultPreviewCatalog = getPersistenceContext().getValue(DEFAULTPREVIEWCATALOG, _defaultPreviewCatalog);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.defaultPreviewCategory</code> attribute defined at extension <code>cms2</code>. 
	 * @return the defaultPreviewCategory
	 */
	public CategoryModel getDefaultPreviewCategory()
	{
		if (this._defaultPreviewCategory!=null)
		{
			return _defaultPreviewCategory;
		}
		return _defaultPreviewCategory = getPersistenceContext().getValue(DEFAULTPREVIEWCATEGORY, _defaultPreviewCategory);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.defaultPreviewProduct</code> attribute defined at extension <code>cms2</code>. 
	 * @return the defaultPreviewProduct
	 */
	public ProductModel getDefaultPreviewProduct()
	{
		if (this._defaultPreviewProduct!=null)
		{
			return _defaultPreviewProduct;
		}
		return _defaultPreviewProduct = getPersistenceContext().getValue(DEFAULTPREVIEWPRODUCT, _defaultPreviewProduct);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.previewURL</code> attribute defined at extension <code>cms2</code>. 
	 * @return the previewURL
	 */
	public String getPreviewURL()
	{
		if (this._previewURL!=null)
		{
			return _previewURL;
		}
		return _previewURL = getPersistenceContext().getValue(PREVIEWURL, _previewURL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.productCatalogs</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the productCatalogs
	 */
	@Deprecated
	public List<CatalogModel> getProductCatalogs()
	{
		if (this._productCatalogs!=null)
		{
			return _productCatalogs;
		}
		return _productCatalogs = getPersistenceContext().getValue(PRODUCTCATALOGS, _productCatalogs);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.redirectURL</code> attribute defined at extension <code>cms2</code>. 
	 * @return the redirectURL
	 */
	public String getRedirectURL()
	{
		if (this._redirectURL!=null)
		{
			return _redirectURL;
		}
		return _redirectURL = getPersistenceContext().getValue(REDIRECTURL, _redirectURL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.segments</code> attribute defined at extension <code>btg</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the segments
	 */
	public Collection<BTGSegmentModel> getSegments()
	{
		if (this._segments!=null)
		{
			return _segments;
		}
		return _segments = getPersistenceContext().getValue(SEGMENTS, _segments);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.siteMapConfig</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the siteMapConfig
	 */
	public SiteMapConfigModel getSiteMapConfig()
	{
		if (this._siteMapConfig!=null)
		{
			return _siteMapConfig;
		}
		return _siteMapConfig = getPersistenceContext().getValue(SITEMAPCONFIG, _siteMapConfig);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.siteMaps</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the siteMaps
	 */
	public Collection<MediaModel> getSiteMaps()
	{
		if (this._siteMaps!=null)
		{
			return _siteMaps;
		}
		return _siteMaps = getPersistenceContext().getValue(SITEMAPS, _siteMaps);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.startingPage</code> attribute defined at extension <code>cms2</code>. 
	 * @return the startingPage
	 */
	public ContentPageModel getStartingPage()
	{
		if (this._startingPage!=null)
		{
			return _startingPage;
		}
		return _startingPage = getPersistenceContext().getValue(STARTINGPAGE, _startingPage);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.startPageLabel</code> attribute defined at extension <code>cms2</code>. 
	 * @return the startPageLabel
	 */
	@Deprecated
	public String getStartPageLabel()
	{
		if (this._startPageLabel!=null)
		{
			return _startPageLabel;
		}
		return _startPageLabel = getPersistenceContext().getValue(STARTPAGELABEL, _startPageLabel);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.urlEncodingAttributes</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the urlEncodingAttributes
	 */
	public Collection<String> getUrlEncodingAttributes()
	{
		if (this._urlEncodingAttributes!=null)
		{
			return _urlEncodingAttributes;
		}
		return _urlEncodingAttributes = getPersistenceContext().getValue(URLENCODINGATTRIBUTES, _urlEncodingAttributes);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.urlPatterns</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the urlPatterns
	 */
	public Collection<String> getUrlPatterns()
	{
		if (this._urlPatterns!=null)
		{
			return _urlPatterns;
		}
		return _urlPatterns = getPersistenceContext().getValue(URLPATTERNS, _urlPatterns);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.validComponentTypes</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the validComponentTypes
	 */
	public Set<CMSComponentTypeModel> getValidComponentTypes()
	{
		if (this._validComponentTypes!=null)
		{
			return _validComponentTypes;
		}
		return _validComponentTypes = getPersistenceContext().getValue(VALIDCOMPONENTTYPES, _validComponentTypes);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.openPreviewInNewTab</code> attribute defined at extension <code>cms2</code>. 
	 * @return the openPreviewInNewTab
	 */
	public boolean isOpenPreviewInNewTab()
	{
		return toPrimitive( _openPreviewInNewTab = getPersistenceContext().getValue(OPENPREVIEWINNEWTAB, _openPreviewInNewTab));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSSite.active</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the active
	 */
	public void setActive(final Boolean value)
	{
		_active = getPersistenceContext().setValue(ACTIVE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSSite.activeFrom</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the activeFrom
	 */
	public void setActiveFrom(final Date value)
	{
		_activeFrom = getPersistenceContext().setValue(ACTIVEFROM, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSSite.activeUntil</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the activeUntil
	 */
	public void setActiveUntil(final Date value)
	{
		_activeUntil = getPersistenceContext().setValue(ACTIVEUNTIL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSSite.contentCatalogs</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the contentCatalogs
	 */
	public void setContentCatalogs(final List<ContentCatalogModel> value)
	{
		_contentCatalogs = getPersistenceContext().setValue(CONTENTCATALOGS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSSite.defaultCatalog</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the defaultCatalog
	 */
	public void setDefaultCatalog(final CatalogModel value)
	{
		_defaultCatalog = getPersistenceContext().setValue(DEFAULTCATALOG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSSite.defaultPreviewCatalog</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the defaultPreviewCatalog
	 */
	public void setDefaultPreviewCatalog(final CatalogModel value)
	{
		_defaultPreviewCatalog = getPersistenceContext().setValue(DEFAULTPREVIEWCATALOG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSSite.defaultPreviewCategory</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the defaultPreviewCategory
	 */
	public void setDefaultPreviewCategory(final CategoryModel value)
	{
		_defaultPreviewCategory = getPersistenceContext().setValue(DEFAULTPREVIEWCATEGORY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSSite.defaultPreviewProduct</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the defaultPreviewProduct
	 */
	public void setDefaultPreviewProduct(final ProductModel value)
	{
		_defaultPreviewProduct = getPersistenceContext().setValue(DEFAULTPREVIEWPRODUCT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSSite.openPreviewInNewTab</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the openPreviewInNewTab
	 */
	public void setOpenPreviewInNewTab(final boolean value)
	{
		_openPreviewInNewTab = getPersistenceContext().setValue(OPENPREVIEWINNEWTAB, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSSite.previewURL</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the previewURL
	 */
	public void setPreviewURL(final String value)
	{
		_previewURL = getPersistenceContext().setValue(PREVIEWURL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSSite.redirectURL</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the redirectURL
	 */
	public void setRedirectURL(final String value)
	{
		_redirectURL = getPersistenceContext().setValue(REDIRECTURL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSSite.segments</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the segments
	 */
	public void setSegments(final Collection<BTGSegmentModel> value)
	{
		_segments = getPersistenceContext().setValue(SEGMENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSSite.siteMapConfig</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the siteMapConfig
	 */
	public void setSiteMapConfig(final SiteMapConfigModel value)
	{
		_siteMapConfig = getPersistenceContext().setValue(SITEMAPCONFIG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSSite.siteMaps</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the siteMaps
	 */
	public void setSiteMaps(final Collection<MediaModel> value)
	{
		_siteMaps = getPersistenceContext().setValue(SITEMAPS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSSite.startingPage</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the startingPage
	 */
	public void setStartingPage(final ContentPageModel value)
	{
		_startingPage = getPersistenceContext().setValue(STARTINGPAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSSite.urlEncodingAttributes</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the urlEncodingAttributes
	 */
	public void setUrlEncodingAttributes(final Collection<String> value)
	{
		_urlEncodingAttributes = getPersistenceContext().setValue(URLENCODINGATTRIBUTES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSSite.urlPatterns</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the urlPatterns
	 */
	public void setUrlPatterns(final Collection<String> value)
	{
		_urlPatterns = getPersistenceContext().setValue(URLPATTERNS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSSite.validComponentTypes</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the validComponentTypes
	 */
	public void setValidComponentTypes(final Set<CMSComponentTypeModel> value)
	{
		_validComponentTypes = getPersistenceContext().setValue(VALIDCOMPONENTTYPES, value);
	}
	
}
