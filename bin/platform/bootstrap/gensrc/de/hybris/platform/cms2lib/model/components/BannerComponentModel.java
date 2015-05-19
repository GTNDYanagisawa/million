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
package de.hybris.platform.cms2lib.model.components;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import de.hybris.platform.cms2lib.model.components.AbstractBannerComponentModel;
import de.hybris.platform.cms2lib.model.components.RotatingImagesComponentModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Locale;

/**
 * Generated model class for type BannerComponent first defined at extension cms2lib.
 */
@SuppressWarnings("all")
public class BannerComponentModel extends AbstractBannerComponentModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BannerComponent";
	
	/**<i>Generated relation code constant for relation <code>BannersForRotatingComponent</code> defining source attribute <code>rotatingComponent</code> in extension <code>cms2lib</code>.</i>*/
	public final static String _BANNERSFORROTATINGCOMPONENT = "BannersForRotatingComponent";
	
	/** <i>Generated constant</i> - Attribute key of <code>BannerComponent.headline</code> attribute defined at extension <code>cms2lib</code>. */
	public static final String HEADLINE = "headline";
	
	/** <i>Generated constant</i> - Attribute key of <code>BannerComponent.content</code> attribute defined at extension <code>cms2lib</code>. */
	public static final String CONTENT = "content";
	
	/** <i>Generated constant</i> - Attribute key of <code>BannerComponent.pageLabelOrId</code> attribute defined at extension <code>cms2lib</code>. */
	public static final String PAGELABELORID = "pageLabelOrId";
	
	/** <i>Generated constant</i> - Attribute key of <code>BannerComponent.rotatingComponent</code> attribute defined at extension <code>cms2lib</code>. */
	public static final String ROTATINGCOMPONENT = "rotatingComponent";
	
	/** <i>Generated constant</i> - Attribute key of <code>BannerComponent.page</code> attribute defined at extension <code>cms2lib</code>. */
	public static final String PAGE = "page";
	
	
	/** <i>Generated variable</i> - Variable of <code>BannerComponent.pageLabelOrId</code> attribute defined at extension <code>cms2lib</code>. */
	private String _pageLabelOrId;
	
	/** <i>Generated variable</i> - Variable of <code>BannerComponent.rotatingComponent</code> attribute defined at extension <code>cms2lib</code>. */
	private Collection<RotatingImagesComponentModel> _rotatingComponent;
	
	/** <i>Generated variable</i> - Variable of <code>BannerComponent.page</code> attribute defined at extension <code>cms2lib</code>. */
	private ContentPageModel _page;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BannerComponentModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BannerComponentModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _external initial attribute declared by type <code>AbstractBannerComponent</code> at extension <code>cms2lib</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public BannerComponentModel(final CatalogVersionModel _catalogVersion, final boolean _external, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setExternal(_external);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _external initial attribute declared by type <code>AbstractBannerComponent</code> at extension <code>cms2lib</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public BannerComponentModel(final CatalogVersionModel _catalogVersion, final boolean _external, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setExternal(_external);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BannerComponent.content</code> attribute defined at extension <code>cms2lib</code>. 
	 * @return the content
	 */
	public String getContent()
	{
		return getContent(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>BannerComponent.content</code> attribute defined at extension <code>cms2lib</code>. 
	 * @param loc the value localization key 
	 * @return the content
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getContent(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(CONTENT, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BannerComponent.headline</code> attribute defined at extension <code>cms2lib</code>. 
	 * @return the headline
	 */
	public String getHeadline()
	{
		return getHeadline(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>BannerComponent.headline</code> attribute defined at extension <code>cms2lib</code>. 
	 * @param loc the value localization key 
	 * @return the headline
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getHeadline(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(HEADLINE, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BannerComponent.page</code> attribute defined at extension <code>cms2lib</code>. 
	 * @return the page
	 */
	public ContentPageModel getPage()
	{
		if (this._page!=null)
		{
			return _page;
		}
		return _page = getPersistenceContext().getValue(PAGE, _page);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BannerComponent.pageLabelOrId</code> attribute defined at extension <code>cms2lib</code>. 
	 * @return the pageLabelOrId
	 */
	public String getPageLabelOrId()
	{
		if (this._pageLabelOrId!=null)
		{
			return _pageLabelOrId;
		}
		return _pageLabelOrId = getPersistenceContext().getValue(PAGELABELORID, _pageLabelOrId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BannerComponent.rotatingComponent</code> attribute defined at extension <code>cms2lib</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the rotatingComponent
	 */
	public Collection<RotatingImagesComponentModel> getRotatingComponent()
	{
		if (this._rotatingComponent!=null)
		{
			return _rotatingComponent;
		}
		return _rotatingComponent = getPersistenceContext().getValue(ROTATINGCOMPONENT, _rotatingComponent);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BannerComponent.content</code> attribute defined at extension <code>cms2lib</code>. 
	 *  
	 * @param value the content
	 */
	public void setContent(final String value)
	{
		setContent(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>BannerComponent.content</code> attribute defined at extension <code>cms2lib</code>. 
	 *  
	 * @param value the content
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setContent(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(CONTENT, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BannerComponent.headline</code> attribute defined at extension <code>cms2lib</code>. 
	 *  
	 * @param value the headline
	 */
	public void setHeadline(final String value)
	{
		setHeadline(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>BannerComponent.headline</code> attribute defined at extension <code>cms2lib</code>. 
	 *  
	 * @param value the headline
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setHeadline(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(HEADLINE, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BannerComponent.page</code> attribute defined at extension <code>cms2lib</code>. 
	 *  
	 * @param value the page
	 */
	public void setPage(final ContentPageModel value)
	{
		_page = getPersistenceContext().setValue(PAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BannerComponent.rotatingComponent</code> attribute defined at extension <code>cms2lib</code>. 
	 *  
	 * @param value the rotatingComponent
	 */
	public void setRotatingComponent(final Collection<RotatingImagesComponentModel> value)
	{
		_rotatingComponent = getPersistenceContext().setValue(ROTATINGCOMPONENT, value);
	}
	
}
