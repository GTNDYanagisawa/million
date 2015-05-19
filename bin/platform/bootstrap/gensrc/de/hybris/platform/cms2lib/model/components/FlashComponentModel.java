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
import de.hybris.platform.cms2lib.enums.FlashQuality;
import de.hybris.platform.cms2lib.enums.FlashSalign;
import de.hybris.platform.cms2lib.enums.FlashScale;
import de.hybris.platform.cms2lib.enums.FlashWmode;
import de.hybris.platform.cms2lib.model.components.AbstractBannerComponentModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type FlashComponent first defined at extension cms2lib.
 */
@SuppressWarnings("all")
public class FlashComponentModel extends AbstractBannerComponentModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "FlashComponent";
	
	/** <i>Generated constant</i> - Attribute key of <code>FlashComponent.play</code> attribute defined at extension <code>cms2lib</code>. */
	public static final String PLAY = "play";
	
	/** <i>Generated constant</i> - Attribute key of <code>FlashComponent.loop</code> attribute defined at extension <code>cms2lib</code>. */
	public static final String LOOP = "loop";
	
	/** <i>Generated constant</i> - Attribute key of <code>FlashComponent.menu</code> attribute defined at extension <code>cms2lib</code>. */
	public static final String MENU = "menu";
	
	/** <i>Generated constant</i> - Attribute key of <code>FlashComponent.quality</code> attribute defined at extension <code>cms2lib</code>. */
	public static final String QUALITY = "quality";
	
	/** <i>Generated constant</i> - Attribute key of <code>FlashComponent.scale</code> attribute defined at extension <code>cms2lib</code>. */
	public static final String SCALE = "scale";
	
	/** <i>Generated constant</i> - Attribute key of <code>FlashComponent.wmode</code> attribute defined at extension <code>cms2lib</code>. */
	public static final String WMODE = "wmode";
	
	/** <i>Generated constant</i> - Attribute key of <code>FlashComponent.sAlign</code> attribute defined at extension <code>cms2lib</code>. */
	public static final String SALIGN = "sAlign";
	
	/** <i>Generated constant</i> - Attribute key of <code>FlashComponent.bgcolor</code> attribute defined at extension <code>cms2lib</code>. */
	public static final String BGCOLOR = "bgcolor";
	
	/** <i>Generated constant</i> - Attribute key of <code>FlashComponent.width</code> attribute defined at extension <code>cms2lib</code>. */
	public static final String WIDTH = "width";
	
	/** <i>Generated constant</i> - Attribute key of <code>FlashComponent.height</code> attribute defined at extension <code>cms2lib</code>. */
	public static final String HEIGHT = "height";
	
	/** <i>Generated constant</i> - Attribute key of <code>FlashComponent.pageLabelOrId</code> attribute defined at extension <code>cms2lib</code>. */
	public static final String PAGELABELORID = "pageLabelOrId";
	
	/** <i>Generated constant</i> - Attribute key of <code>FlashComponent.page</code> attribute defined at extension <code>cms2lib</code>. */
	public static final String PAGE = "page";
	
	
	/** <i>Generated variable</i> - Variable of <code>FlashComponent.play</code> attribute defined at extension <code>cms2lib</code>. */
	private Boolean _play;
	
	/** <i>Generated variable</i> - Variable of <code>FlashComponent.loop</code> attribute defined at extension <code>cms2lib</code>. */
	private Boolean _loop;
	
	/** <i>Generated variable</i> - Variable of <code>FlashComponent.menu</code> attribute defined at extension <code>cms2lib</code>. */
	private Boolean _menu;
	
	/** <i>Generated variable</i> - Variable of <code>FlashComponent.quality</code> attribute defined at extension <code>cms2lib</code>. */
	private FlashQuality _quality;
	
	/** <i>Generated variable</i> - Variable of <code>FlashComponent.scale</code> attribute defined at extension <code>cms2lib</code>. */
	private FlashScale _scale;
	
	/** <i>Generated variable</i> - Variable of <code>FlashComponent.wmode</code> attribute defined at extension <code>cms2lib</code>. */
	private FlashWmode _wmode;
	
	/** <i>Generated variable</i> - Variable of <code>FlashComponent.sAlign</code> attribute defined at extension <code>cms2lib</code>. */
	private FlashSalign _sAlign;
	
	/** <i>Generated variable</i> - Variable of <code>FlashComponent.bgcolor</code> attribute defined at extension <code>cms2lib</code>. */
	private String _bgcolor;
	
	/** <i>Generated variable</i> - Variable of <code>FlashComponent.width</code> attribute defined at extension <code>cms2lib</code>. */
	private Integer _width;
	
	/** <i>Generated variable</i> - Variable of <code>FlashComponent.height</code> attribute defined at extension <code>cms2lib</code>. */
	private Integer _height;
	
	/** <i>Generated variable</i> - Variable of <code>FlashComponent.pageLabelOrId</code> attribute defined at extension <code>cms2lib</code>. */
	private String _pageLabelOrId;
	
	/** <i>Generated variable</i> - Variable of <code>FlashComponent.page</code> attribute defined at extension <code>cms2lib</code>. */
	private ContentPageModel _page;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public FlashComponentModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public FlashComponentModel(final ItemModelContext ctx)
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
	public FlashComponentModel(final CatalogVersionModel _catalogVersion, final boolean _external, final String _uid)
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
	public FlashComponentModel(final CatalogVersionModel _catalogVersion, final boolean _external, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setExternal(_external);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlashComponent.bgcolor</code> attribute defined at extension <code>cms2lib</code>. 
	 * @return the bgcolor
	 */
	public String getBgcolor()
	{
		if (this._bgcolor!=null)
		{
			return _bgcolor;
		}
		return _bgcolor = getPersistenceContext().getValue(BGCOLOR, _bgcolor);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlashComponent.height</code> attribute defined at extension <code>cms2lib</code>. 
	 * @return the height
	 */
	public Integer getHeight()
	{
		if (this._height!=null)
		{
			return _height;
		}
		return _height = getPersistenceContext().getValue(HEIGHT, _height);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlashComponent.loop</code> attribute defined at extension <code>cms2lib</code>. 
	 * @return the loop
	 */
	public Boolean getLoop()
	{
		if (this._loop!=null)
		{
			return _loop;
		}
		return _loop = getPersistenceContext().getValue(LOOP, _loop);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlashComponent.menu</code> attribute defined at extension <code>cms2lib</code>. 
	 * @return the menu
	 */
	public Boolean getMenu()
	{
		if (this._menu!=null)
		{
			return _menu;
		}
		return _menu = getPersistenceContext().getValue(MENU, _menu);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlashComponent.page</code> attribute defined at extension <code>cms2lib</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>FlashComponent.pageLabelOrId</code> attribute defined at extension <code>cms2lib</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>FlashComponent.play</code> attribute defined at extension <code>cms2lib</code>. 
	 * @return the play
	 */
	public Boolean getPlay()
	{
		if (this._play!=null)
		{
			return _play;
		}
		return _play = getPersistenceContext().getValue(PLAY, _play);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlashComponent.quality</code> attribute defined at extension <code>cms2lib</code>. 
	 * @return the quality
	 */
	public FlashQuality getQuality()
	{
		if (this._quality!=null)
		{
			return _quality;
		}
		return _quality = getPersistenceContext().getValue(QUALITY, _quality);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlashComponent.sAlign</code> attribute defined at extension <code>cms2lib</code>. 
	 * @return the sAlign
	 */
	public FlashSalign getSAlign()
	{
		if (this._sAlign!=null)
		{
			return _sAlign;
		}
		return _sAlign = getPersistenceContext().getValue(SALIGN, _sAlign);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlashComponent.scale</code> attribute defined at extension <code>cms2lib</code>. 
	 * @return the scale
	 */
	public FlashScale getScale()
	{
		if (this._scale!=null)
		{
			return _scale;
		}
		return _scale = getPersistenceContext().getValue(SCALE, _scale);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlashComponent.width</code> attribute defined at extension <code>cms2lib</code>. 
	 * @return the width
	 */
	public Integer getWidth()
	{
		if (this._width!=null)
		{
			return _width;
		}
		return _width = getPersistenceContext().getValue(WIDTH, _width);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlashComponent.wmode</code> attribute defined at extension <code>cms2lib</code>. 
	 * @return the wmode
	 */
	public FlashWmode getWmode()
	{
		if (this._wmode!=null)
		{
			return _wmode;
		}
		return _wmode = getPersistenceContext().getValue(WMODE, _wmode);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>FlashComponent.bgcolor</code> attribute defined at extension <code>cms2lib</code>. 
	 *  
	 * @param value the bgcolor
	 */
	public void setBgcolor(final String value)
	{
		_bgcolor = getPersistenceContext().setValue(BGCOLOR, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>FlashComponent.height</code> attribute defined at extension <code>cms2lib</code>. 
	 *  
	 * @param value the height
	 */
	public void setHeight(final Integer value)
	{
		_height = getPersistenceContext().setValue(HEIGHT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>FlashComponent.loop</code> attribute defined at extension <code>cms2lib</code>. 
	 *  
	 * @param value the loop
	 */
	public void setLoop(final Boolean value)
	{
		_loop = getPersistenceContext().setValue(LOOP, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>FlashComponent.menu</code> attribute defined at extension <code>cms2lib</code>. 
	 *  
	 * @param value the menu
	 */
	public void setMenu(final Boolean value)
	{
		_menu = getPersistenceContext().setValue(MENU, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>FlashComponent.page</code> attribute defined at extension <code>cms2lib</code>. 
	 *  
	 * @param value the page
	 */
	public void setPage(final ContentPageModel value)
	{
		_page = getPersistenceContext().setValue(PAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>FlashComponent.play</code> attribute defined at extension <code>cms2lib</code>. 
	 *  
	 * @param value the play
	 */
	public void setPlay(final Boolean value)
	{
		_play = getPersistenceContext().setValue(PLAY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>FlashComponent.quality</code> attribute defined at extension <code>cms2lib</code>. 
	 *  
	 * @param value the quality
	 */
	public void setQuality(final FlashQuality value)
	{
		_quality = getPersistenceContext().setValue(QUALITY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>FlashComponent.sAlign</code> attribute defined at extension <code>cms2lib</code>. 
	 *  
	 * @param value the sAlign
	 */
	public void setSAlign(final FlashSalign value)
	{
		_sAlign = getPersistenceContext().setValue(SALIGN, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>FlashComponent.scale</code> attribute defined at extension <code>cms2lib</code>. 
	 *  
	 * @param value the scale
	 */
	public void setScale(final FlashScale value)
	{
		_scale = getPersistenceContext().setValue(SCALE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>FlashComponent.width</code> attribute defined at extension <code>cms2lib</code>. 
	 *  
	 * @param value the width
	 */
	public void setWidth(final Integer value)
	{
		_width = getPersistenceContext().setValue(WIDTH, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>FlashComponent.wmode</code> attribute defined at extension <code>cms2lib</code>. 
	 *  
	 * @param value the wmode
	 */
	public void setWmode(final FlashWmode value)
	{
		_wmode = getPersistenceContext().setValue(WMODE, value);
	}
	
}
