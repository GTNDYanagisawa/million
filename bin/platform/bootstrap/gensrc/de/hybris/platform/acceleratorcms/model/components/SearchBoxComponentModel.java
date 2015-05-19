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
package de.hybris.platform.acceleratorcms.model.components;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.cms2.model.contents.components.SimpleCMSComponentModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SearchBoxComponent first defined at extension acceleratorcms.
 * <p>
 * Represents the search box component.
 */
@SuppressWarnings("all")
public class SearchBoxComponentModel extends SimpleCMSComponentModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SearchBoxComponent";
	
	/** <i>Generated constant</i> - Attribute key of <code>SearchBoxComponent.displaySuggestions</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String DISPLAYSUGGESTIONS = "displaySuggestions";
	
	/** <i>Generated constant</i> - Attribute key of <code>SearchBoxComponent.displayProducts</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String DISPLAYPRODUCTS = "displayProducts";
	
	/** <i>Generated constant</i> - Attribute key of <code>SearchBoxComponent.displayProductImages</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String DISPLAYPRODUCTIMAGES = "displayProductImages";
	
	/** <i>Generated constant</i> - Attribute key of <code>SearchBoxComponent.maxSuggestions</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String MAXSUGGESTIONS = "maxSuggestions";
	
	/** <i>Generated constant</i> - Attribute key of <code>SearchBoxComponent.maxProducts</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String MAXPRODUCTS = "maxProducts";
	
	/** <i>Generated constant</i> - Attribute key of <code>SearchBoxComponent.minCharactersBeforeRequest</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String MINCHARACTERSBEFOREREQUEST = "minCharactersBeforeRequest";
	
	/** <i>Generated constant</i> - Attribute key of <code>SearchBoxComponent.waitTimeBeforeRequest</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String WAITTIMEBEFOREREQUEST = "waitTimeBeforeRequest";
	
	
	/** <i>Generated variable</i> - Variable of <code>SearchBoxComponent.displaySuggestions</code> attribute defined at extension <code>acceleratorcms</code>. */
	private Boolean _displaySuggestions;
	
	/** <i>Generated variable</i> - Variable of <code>SearchBoxComponent.displayProducts</code> attribute defined at extension <code>acceleratorcms</code>. */
	private Boolean _displayProducts;
	
	/** <i>Generated variable</i> - Variable of <code>SearchBoxComponent.displayProductImages</code> attribute defined at extension <code>acceleratorcms</code>. */
	private Boolean _displayProductImages;
	
	/** <i>Generated variable</i> - Variable of <code>SearchBoxComponent.maxSuggestions</code> attribute defined at extension <code>acceleratorcms</code>. */
	private Integer _maxSuggestions;
	
	/** <i>Generated variable</i> - Variable of <code>SearchBoxComponent.maxProducts</code> attribute defined at extension <code>acceleratorcms</code>. */
	private Integer _maxProducts;
	
	/** <i>Generated variable</i> - Variable of <code>SearchBoxComponent.minCharactersBeforeRequest</code> attribute defined at extension <code>acceleratorcms</code>. */
	private Integer _minCharactersBeforeRequest;
	
	/** <i>Generated variable</i> - Variable of <code>SearchBoxComponent.waitTimeBeforeRequest</code> attribute defined at extension <code>acceleratorcms</code>. */
	private Integer _waitTimeBeforeRequest;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SearchBoxComponentModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SearchBoxComponentModel(final ItemModelContext ctx)
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
	public SearchBoxComponentModel(final CatalogVersionModel _catalogVersion, final String _uid)
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
	public SearchBoxComponentModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.maxProducts</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the maxProducts - Determines the max number of products to display in the component.
	 */
	public Integer getMaxProducts()
	{
		if (this._maxProducts!=null)
		{
			return _maxProducts;
		}
		return _maxProducts = getPersistenceContext().getValue(MAXPRODUCTS, _maxProducts);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.maxSuggestions</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the maxSuggestions - Determines the max number of suggestions to display in the component.
	 */
	public Integer getMaxSuggestions()
	{
		if (this._maxSuggestions!=null)
		{
			return _maxSuggestions;
		}
		return _maxSuggestions = getPersistenceContext().getValue(MAXSUGGESTIONS, _maxSuggestions);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.minCharactersBeforeRequest</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the minCharactersBeforeRequest - Determines the min number of characters to enter before submitting a search request.
	 */
	public Integer getMinCharactersBeforeRequest()
	{
		if (this._minCharactersBeforeRequest!=null)
		{
			return _minCharactersBeforeRequest;
		}
		return _minCharactersBeforeRequest = getPersistenceContext().getValue(MINCHARACTERSBEFOREREQUEST, _minCharactersBeforeRequest);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.waitTimeBeforeRequest</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the waitTimeBeforeRequest - Determines the wait time after the search term has been altered before resubmitting the search request.
	 */
	public Integer getWaitTimeBeforeRequest()
	{
		if (this._waitTimeBeforeRequest!=null)
		{
			return _waitTimeBeforeRequest;
		}
		return _waitTimeBeforeRequest = getPersistenceContext().getValue(WAITTIMEBEFOREREQUEST, _waitTimeBeforeRequest);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.displayProductImages</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the displayProductImages - Determines if product images are shown.
	 */
	public boolean isDisplayProductImages()
	{
		return toPrimitive( _displayProductImages = getPersistenceContext().getValue(DISPLAYPRODUCTIMAGES, _displayProductImages));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.displayProducts</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the displayProducts - Determines if product results are displayed in the component.
	 */
	public boolean isDisplayProducts()
	{
		return toPrimitive( _displayProducts = getPersistenceContext().getValue(DISPLAYPRODUCTS, _displayProducts));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.displaySuggestions</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the displaySuggestions - Determines if suggested terms are displayed in the component.
	 */
	public boolean isDisplaySuggestions()
	{
		return toPrimitive( _displaySuggestions = getPersistenceContext().getValue(DISPLAYSUGGESTIONS, _displaySuggestions));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SearchBoxComponent.displayProductImages</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the displayProductImages - Determines if product images are shown.
	 */
	public void setDisplayProductImages(final boolean value)
	{
		_displayProductImages = getPersistenceContext().setValue(DISPLAYPRODUCTIMAGES, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SearchBoxComponent.displayProducts</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the displayProducts - Determines if product results are displayed in the component.
	 */
	public void setDisplayProducts(final boolean value)
	{
		_displayProducts = getPersistenceContext().setValue(DISPLAYPRODUCTS, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SearchBoxComponent.displaySuggestions</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the displaySuggestions - Determines if suggested terms are displayed in the component.
	 */
	public void setDisplaySuggestions(final boolean value)
	{
		_displaySuggestions = getPersistenceContext().setValue(DISPLAYSUGGESTIONS, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SearchBoxComponent.maxProducts</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the maxProducts - Determines the max number of products to display in the component.
	 */
	public void setMaxProducts(final Integer value)
	{
		_maxProducts = getPersistenceContext().setValue(MAXPRODUCTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SearchBoxComponent.maxSuggestions</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the maxSuggestions - Determines the max number of suggestions to display in the component.
	 */
	public void setMaxSuggestions(final Integer value)
	{
		_maxSuggestions = getPersistenceContext().setValue(MAXSUGGESTIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SearchBoxComponent.minCharactersBeforeRequest</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the minCharactersBeforeRequest - Determines the min number of characters to enter before submitting a search request.
	 */
	public void setMinCharactersBeforeRequest(final Integer value)
	{
		_minCharactersBeforeRequest = getPersistenceContext().setValue(MINCHARACTERSBEFOREREQUEST, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SearchBoxComponent.waitTimeBeforeRequest</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the waitTimeBeforeRequest - Determines the wait time after the search term has been altered before resubmitting the search request.
	 */
	public void setWaitTimeBeforeRequest(final Integer value)
	{
		_waitTimeBeforeRequest = getPersistenceContext().setValue(WAITTIMEBEFOREREQUEST, value);
	}
	
}
