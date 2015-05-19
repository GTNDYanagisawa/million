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
package de.hybris.platform.cms2.model.contents.components;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.cms2.enums.LinkTargets;
import de.hybris.platform.cms2.model.contents.components.SimpleCMSComponentModel;
import de.hybris.platform.cms2.model.navigation.CMSNavigationNodeModel;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.List;
import java.util.Locale;

/**
 * Generated model class for type CMSLinkComponent first defined at extension cms2.
 */
@SuppressWarnings("all")
public class CMSLinkComponentModel extends SimpleCMSComponentModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CMSLinkComponent";
	
	/**<i>Generated relation code constant for relation <code>CmsLinkComponentsForContentPage</code> defining source attribute <code>contentPage</code> in extension <code>cms2</code>.</i>*/
	public final static String _CMSLINKCOMPONENTSFORCONTENTPAGE = "CmsLinkComponentsForContentPage";
	
	/**<i>Generated relation code constant for relation <code>CmsLinkComponentsForProduct</code> defining source attribute <code>product</code> in extension <code>cms2</code>.</i>*/
	public final static String _CMSLINKCOMPONENTSFORPRODUCT = "CmsLinkComponentsForProduct";
	
	/**<i>Generated relation code constant for relation <code>CmsLinkComponentsForCategory</code> defining source attribute <code>category</code> in extension <code>cms2</code>.</i>*/
	public final static String _CMSLINKCOMPONENTSFORCATEGORY = "CmsLinkComponentsForCategory";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSLinkComponent.linkName</code> attribute defined at extension <code>cms2</code>. */
	public static final String LINKNAME = "linkName";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSLinkComponent.external</code> attribute defined at extension <code>cms2</code>. */
	public static final String EXTERNAL = "external";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSLinkComponent.url</code> attribute defined at extension <code>cms2</code>. */
	public static final String URL = "url";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSLinkComponent.contentPageLabelOrId</code> attribute defined at extension <code>cms2</code>. */
	public static final String CONTENTPAGELABELORID = "contentPageLabelOrId";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSLinkComponent.productCode</code> attribute defined at extension <code>cms2</code>. */
	public static final String PRODUCTCODE = "productCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSLinkComponent.categoryCode</code> attribute defined at extension <code>cms2</code>. */
	public static final String CATEGORYCODE = "categoryCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSLinkComponent.target</code> attribute defined at extension <code>cms2</code>. */
	public static final String TARGET = "target";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSLinkComponent.navigationNodes</code> attribute defined at extension <code>cms2</code>. */
	public static final String NAVIGATIONNODES = "navigationNodes";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSLinkComponent.contentPage</code> attribute defined at extension <code>cms2</code>. */
	public static final String CONTENTPAGE = "contentPage";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSLinkComponent.product</code> attribute defined at extension <code>cms2</code>. */
	public static final String PRODUCT = "product";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSLinkComponent.category</code> attribute defined at extension <code>cms2</code>. */
	public static final String CATEGORY = "category";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSLinkComponent.styleAttributes</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String STYLEATTRIBUTES = "styleAttributes";
	
	
	/** <i>Generated variable</i> - Variable of <code>CMSLinkComponent.external</code> attribute defined at extension <code>cms2</code>. */
	private Boolean _external;
	
	/** <i>Generated variable</i> - Variable of <code>CMSLinkComponent.url</code> attribute defined at extension <code>cms2</code>. */
	private String _url;
	
	/** <i>Generated variable</i> - Variable of <code>CMSLinkComponent.contentPageLabelOrId</code> attribute defined at extension <code>cms2</code>. */
	private String _contentPageLabelOrId;
	
	/** <i>Generated variable</i> - Variable of <code>CMSLinkComponent.productCode</code> attribute defined at extension <code>cms2</code>. */
	private String _productCode;
	
	/** <i>Generated variable</i> - Variable of <code>CMSLinkComponent.categoryCode</code> attribute defined at extension <code>cms2</code>. */
	private String _categoryCode;
	
	/** <i>Generated variable</i> - Variable of <code>CMSLinkComponent.target</code> attribute defined at extension <code>cms2</code>. */
	private LinkTargets _target;
	
	/** <i>Generated variable</i> - Variable of <code>CMSLinkComponent.navigationNodes</code> attribute defined at extension <code>cms2</code>. */
	private List<CMSNavigationNodeModel> _navigationNodes;
	
	/** <i>Generated variable</i> - Variable of <code>CMSLinkComponent.contentPage</code> attribute defined at extension <code>cms2</code>. */
	private ContentPageModel _contentPage;
	
	/** <i>Generated variable</i> - Variable of <code>CMSLinkComponent.product</code> attribute defined at extension <code>cms2</code>. */
	private ProductModel _product;
	
	/** <i>Generated variable</i> - Variable of <code>CMSLinkComponent.category</code> attribute defined at extension <code>cms2</code>. */
	private CategoryModel _category;
	
	/** <i>Generated variable</i> - Variable of <code>CMSLinkComponent.styleAttributes</code> attribute defined at extension <code>acceleratorcms</code>. */
	private String _styleAttributes;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CMSLinkComponentModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CMSLinkComponentModel(final ItemModelContext ctx)
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
	public CMSLinkComponentModel(final CatalogVersionModel _catalogVersion, final String _uid)
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
	public CMSLinkComponentModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSLinkComponent.category</code> attribute defined at extension <code>cms2</code>. 
	 * @return the category
	 */
	public CategoryModel getCategory()
	{
		if (this._category!=null)
		{
			return _category;
		}
		return _category = getPersistenceContext().getValue(CATEGORY, _category);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSLinkComponent.categoryCode</code> attribute defined at extension <code>cms2</code>. 
	 * @return the categoryCode
	 */
	@Deprecated
	public String getCategoryCode()
	{
		if (this._categoryCode!=null)
		{
			return _categoryCode;
		}
		return _categoryCode = getPersistenceContext().getValue(CATEGORYCODE, _categoryCode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSLinkComponent.contentPage</code> attribute defined at extension <code>cms2</code>. 
	 * @return the contentPage
	 */
	public ContentPageModel getContentPage()
	{
		if (this._contentPage!=null)
		{
			return _contentPage;
		}
		return _contentPage = getPersistenceContext().getValue(CONTENTPAGE, _contentPage);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSLinkComponent.contentPageLabelOrId</code> attribute defined at extension <code>cms2</code>. 
	 * @return the contentPageLabelOrId
	 */
	@Deprecated
	public String getContentPageLabelOrId()
	{
		if (this._contentPageLabelOrId!=null)
		{
			return _contentPageLabelOrId;
		}
		return _contentPageLabelOrId = getPersistenceContext().getValue(CONTENTPAGELABELORID, _contentPageLabelOrId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSLinkComponent.linkName</code> attribute defined at extension <code>cms2</code>. 
	 * @return the linkName
	 */
	public String getLinkName()
	{
		return getLinkName(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSLinkComponent.linkName</code> attribute defined at extension <code>cms2</code>. 
	 * @param loc the value localization key 
	 * @return the linkName
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getLinkName(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(LINKNAME, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSLinkComponent.navigationNodes</code> attribute defined at extension <code>cms2</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>CMSLinkComponent.product</code> attribute defined at extension <code>cms2</code>. 
	 * @return the product
	 */
	public ProductModel getProduct()
	{
		if (this._product!=null)
		{
			return _product;
		}
		return _product = getPersistenceContext().getValue(PRODUCT, _product);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSLinkComponent.productCode</code> attribute defined at extension <code>cms2</code>. 
	 * @return the productCode
	 */
	@Deprecated
	public String getProductCode()
	{
		if (this._productCode!=null)
		{
			return _productCode;
		}
		return _productCode = getPersistenceContext().getValue(PRODUCTCODE, _productCode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSLinkComponent.styleAttributes</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the styleAttributes - Can store custom styling attributes for additional styling
	 */
	public String getStyleAttributes()
	{
		if (this._styleAttributes!=null)
		{
			return _styleAttributes;
		}
		return _styleAttributes = getPersistenceContext().getValue(STYLEATTRIBUTES, _styleAttributes);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSLinkComponent.target</code> attribute defined at extension <code>cms2</code>. 
	 * @return the target
	 */
	public LinkTargets getTarget()
	{
		if (this._target!=null)
		{
			return _target;
		}
		return _target = getPersistenceContext().getValue(TARGET, _target);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSLinkComponent.url</code> attribute defined at extension <code>cms2</code>. 
	 * @return the url
	 */
	public String getUrl()
	{
		if (this._url!=null)
		{
			return _url;
		}
		return _url = getPersistenceContext().getValue(URL, _url);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSLinkComponent.external</code> attribute defined at extension <code>cms2</code>. 
	 * @return the external
	 */
	public boolean isExternal()
	{
		return toPrimitive( _external = getPersistenceContext().getValue(EXTERNAL, _external));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSLinkComponent.category</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the category
	 */
	public void setCategory(final CategoryModel value)
	{
		_category = getPersistenceContext().setValue(CATEGORY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSLinkComponent.contentPage</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the contentPage
	 */
	public void setContentPage(final ContentPageModel value)
	{
		_contentPage = getPersistenceContext().setValue(CONTENTPAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSLinkComponent.external</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the external
	 */
	public void setExternal(final boolean value)
	{
		_external = getPersistenceContext().setValue(EXTERNAL, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSLinkComponent.linkName</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the linkName
	 */
	public void setLinkName(final String value)
	{
		setLinkName(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>CMSLinkComponent.linkName</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the linkName
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setLinkName(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(LINKNAME, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSLinkComponent.navigationNodes</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the navigationNodes
	 */
	@Deprecated
	public void setNavigationNodes(final List<CMSNavigationNodeModel> value)
	{
		_navigationNodes = getPersistenceContext().setValue(NAVIGATIONNODES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSLinkComponent.product</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the product
	 */
	public void setProduct(final ProductModel value)
	{
		_product = getPersistenceContext().setValue(PRODUCT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSLinkComponent.styleAttributes</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the styleAttributes - Can store custom styling attributes for additional styling
	 */
	public void setStyleAttributes(final String value)
	{
		_styleAttributes = getPersistenceContext().setValue(STYLEATTRIBUTES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSLinkComponent.target</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the target
	 */
	public void setTarget(final LinkTargets value)
	{
		_target = getPersistenceContext().setValue(TARGET, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSLinkComponent.url</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the url
	 */
	public void setUrl(final String value)
	{
		_url = getPersistenceContext().setValue(URL, value);
	}
	
}
