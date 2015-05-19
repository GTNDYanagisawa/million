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
package de.hybris.platform.deeplink.model.media;

import de.hybris.platform.basecommerce.enums.BarcodeType;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.deeplink.model.rules.DeeplinkUrlModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type BarcodeMedia first defined at extension basecommerce.
 */
@SuppressWarnings("all")
public class BarcodeMediaModel extends MediaModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BarcodeMedia";
	
	/** <i>Generated constant</i> - Attribute key of <code>BarcodeMedia.barcodeText</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String BARCODETEXT = "barcodeText";
	
	/** <i>Generated constant</i> - Attribute key of <code>BarcodeMedia.barcodeType</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String BARCODETYPE = "barcodeType";
	
	/** <i>Generated constant</i> - Attribute key of <code>BarcodeMedia.contextItem</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CONTEXTITEM = "contextItem";
	
	/** <i>Generated constant</i> - Attribute key of <code>BarcodeMedia.deeplinkUrl</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String DEEPLINKURL = "deeplinkUrl";
	
	
	/** <i>Generated variable</i> - Variable of <code>BarcodeMedia.barcodeText</code> attribute defined at extension <code>basecommerce</code>. */
	private String _barcodeText;
	
	/** <i>Generated variable</i> - Variable of <code>BarcodeMedia.barcodeType</code> attribute defined at extension <code>basecommerce</code>. */
	private BarcodeType _barcodeType;
	
	/** <i>Generated variable</i> - Variable of <code>BarcodeMedia.contextItem</code> attribute defined at extension <code>basecommerce</code>. */
	private ItemModel _contextItem;
	
	/** <i>Generated variable</i> - Variable of <code>BarcodeMedia.deeplinkUrl</code> attribute defined at extension <code>basecommerce</code>. */
	private DeeplinkUrlModel _deeplinkUrl;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BarcodeMediaModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BarcodeMediaModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _barcodeText initial attribute declared by type <code>BarcodeMedia</code> at extension <code>basecommerce</code>
	 * @param _barcodeType initial attribute declared by type <code>BarcodeMedia</code> at extension <code>basecommerce</code>
	 * @param _catalogVersion initial attribute declared by type <code>Media</code> at extension <code>catalog</code>
	 * @param _code initial attribute declared by type <code>Media</code> at extension <code>core</code>
	 */
	@Deprecated
	public BarcodeMediaModel(final String _barcodeText, final BarcodeType _barcodeType, final CatalogVersionModel _catalogVersion, final String _code)
	{
		super();
		setBarcodeText(_barcodeText);
		setBarcodeType(_barcodeType);
		setCatalogVersion(_catalogVersion);
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _barcodeText initial attribute declared by type <code>BarcodeMedia</code> at extension <code>basecommerce</code>
	 * @param _barcodeType initial attribute declared by type <code>BarcodeMedia</code> at extension <code>basecommerce</code>
	 * @param _catalogVersion initial attribute declared by type <code>Media</code> at extension <code>catalog</code>
	 * @param _code initial attribute declared by type <code>Media</code> at extension <code>core</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public BarcodeMediaModel(final String _barcodeText, final BarcodeType _barcodeType, final CatalogVersionModel _catalogVersion, final String _code, final ItemModel _owner)
	{
		super();
		setBarcodeText(_barcodeText);
		setBarcodeType(_barcodeType);
		setCatalogVersion(_catalogVersion);
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BarcodeMedia.barcodeText</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the barcodeText
	 */
	public String getBarcodeText()
	{
		if (this._barcodeText!=null)
		{
			return _barcodeText;
		}
		return _barcodeText = getPersistenceContext().getValue(BARCODETEXT, _barcodeText);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BarcodeMedia.barcodeType</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the barcodeType
	 */
	public BarcodeType getBarcodeType()
	{
		if (this._barcodeType!=null)
		{
			return _barcodeType;
		}
		return _barcodeType = getPersistenceContext().getValue(BARCODETYPE, _barcodeType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BarcodeMedia.contextItem</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the contextItem
	 */
	public ItemModel getContextItem()
	{
		if (this._contextItem!=null)
		{
			return _contextItem;
		}
		return _contextItem = getPersistenceContext().getValue(CONTEXTITEM, _contextItem);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BarcodeMedia.deeplinkUrl</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the deeplinkUrl
	 */
	public DeeplinkUrlModel getDeeplinkUrl()
	{
		if (this._deeplinkUrl!=null)
		{
			return _deeplinkUrl;
		}
		return _deeplinkUrl = getPersistenceContext().getValue(DEEPLINKURL, _deeplinkUrl);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BarcodeMedia.barcodeText</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the barcodeText
	 */
	public void setBarcodeText(final String value)
	{
		_barcodeText = getPersistenceContext().setValue(BARCODETEXT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BarcodeMedia.barcodeType</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the barcodeType
	 */
	public void setBarcodeType(final BarcodeType value)
	{
		_barcodeType = getPersistenceContext().setValue(BARCODETYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BarcodeMedia.contextItem</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the contextItem
	 */
	public void setContextItem(final ItemModel value)
	{
		_contextItem = getPersistenceContext().setValue(CONTEXTITEM, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BarcodeMedia.deeplinkUrl</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the deeplinkUrl
	 */
	public void setDeeplinkUrl(final DeeplinkUrlModel value)
	{
		_deeplinkUrl = getPersistenceContext().setValue(DEEPLINKURL, value);
	}
	
}
