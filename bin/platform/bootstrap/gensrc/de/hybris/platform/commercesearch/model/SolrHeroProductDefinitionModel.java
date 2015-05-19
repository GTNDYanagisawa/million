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
package de.hybris.platform.commercesearch.model;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexedTypeModel;
import java.util.List;

/**
 * Generated model class for type SolrHeroProductDefinition first defined at extension commercesearch.
 */
@SuppressWarnings("all")
public class SolrHeroProductDefinitionModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SolrHeroProductDefinition";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrHeroProductDefinition.category</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String CATEGORY = "category";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrHeroProductDefinition.indexedType</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String INDEXEDTYPE = "indexedType";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrHeroProductDefinition.code</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrHeroProductDefinition.catalogVersion</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String CATALOGVERSION = "catalogVersion";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrHeroProductDefinition.products</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String PRODUCTS = "products";
	
	
	/** <i>Generated variable</i> - Variable of <code>SolrHeroProductDefinition.category</code> attribute defined at extension <code>commercesearch</code>. */
	private CategoryModel _category;
	
	/** <i>Generated variable</i> - Variable of <code>SolrHeroProductDefinition.indexedType</code> attribute defined at extension <code>commercesearch</code>. */
	private SolrIndexedTypeModel _indexedType;
	
	/** <i>Generated variable</i> - Variable of <code>SolrHeroProductDefinition.code</code> attribute defined at extension <code>commercesearch</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>SolrHeroProductDefinition.catalogVersion</code> attribute defined at extension <code>commercesearch</code>. */
	private CatalogVersionModel _catalogVersion;
	
	/** <i>Generated variable</i> - Variable of <code>SolrHeroProductDefinition.products</code> attribute defined at extension <code>commercesearch</code>. */
	private List<ProductModel> _products;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SolrHeroProductDefinitionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SolrHeroProductDefinitionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>SolrHeroProductDefinition</code> at extension <code>commercesearch</code>
	 * @param _category initial attribute declared by type <code>SolrHeroProductDefinition</code> at extension <code>commercesearch</code>
	 * @param _code initial attribute declared by type <code>SolrHeroProductDefinition</code> at extension <code>commercesearch</code>
	 * @param _indexedType initial attribute declared by type <code>SolrHeroProductDefinition</code> at extension <code>commercesearch</code>
	 */
	@Deprecated
	public SolrHeroProductDefinitionModel(final CatalogVersionModel _catalogVersion, final CategoryModel _category, final String _code, final SolrIndexedTypeModel _indexedType)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCategory(_category);
		setCode(_code);
		setIndexedType(_indexedType);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>SolrHeroProductDefinition</code> at extension <code>commercesearch</code>
	 * @param _category initial attribute declared by type <code>SolrHeroProductDefinition</code> at extension <code>commercesearch</code>
	 * @param _code initial attribute declared by type <code>SolrHeroProductDefinition</code> at extension <code>commercesearch</code>
	 * @param _indexedType initial attribute declared by type <code>SolrHeroProductDefinition</code> at extension <code>commercesearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public SolrHeroProductDefinitionModel(final CatalogVersionModel _catalogVersion, final CategoryModel _category, final String _code, final SolrIndexedTypeModel _indexedType, final ItemModel _owner)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCategory(_category);
		setCode(_code);
		setIndexedType(_indexedType);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrHeroProductDefinition.catalogVersion</code> attribute defined at extension <code>commercesearch</code>. 
	 * @return the catalogVersion
	 */
	public CatalogVersionModel getCatalogVersion()
	{
		if (this._catalogVersion!=null)
		{
			return _catalogVersion;
		}
		return _catalogVersion = getPersistenceContext().getValue(CATALOGVERSION, _catalogVersion);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrHeroProductDefinition.category</code> attribute defined at extension <code>commercesearch</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>SolrHeroProductDefinition.code</code> attribute defined at extension <code>commercesearch</code>. 
	 * @return the code
	 */
	public String getCode()
	{
		if (this._code!=null)
		{
			return _code;
		}
		return _code = getPersistenceContext().getValue(CODE, _code);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrHeroProductDefinition.indexedType</code> attribute defined at extension <code>commercesearch</code>. 
	 * @return the indexedType
	 */
	public SolrIndexedTypeModel getIndexedType()
	{
		if (this._indexedType!=null)
		{
			return _indexedType;
		}
		return _indexedType = getPersistenceContext().getValue(INDEXEDTYPE, _indexedType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrHeroProductDefinition.products</code> attribute defined at extension <code>commercesearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the products - Products
	 */
	public List<ProductModel> getProducts()
	{
		if (this._products!=null)
		{
			return _products;
		}
		return _products = getPersistenceContext().getValue(PRODUCTS, _products);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrHeroProductDefinition.catalogVersion</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the catalogVersion
	 */
	public void setCatalogVersion(final CatalogVersionModel value)
	{
		_catalogVersion = getPersistenceContext().setValue(CATALOGVERSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrHeroProductDefinition.category</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the category
	 */
	public void setCategory(final CategoryModel value)
	{
		_category = getPersistenceContext().setValue(CATEGORY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrHeroProductDefinition.code</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrHeroProductDefinition.indexedType</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the indexedType
	 */
	public void setIndexedType(final SolrIndexedTypeModel value)
	{
		_indexedType = getPersistenceContext().setValue(INDEXEDTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrHeroProductDefinition.products</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the products - Products
	 */
	public void setProducts(final List<ProductModel> value)
	{
		_products = getPersistenceContext().setValue(PRODUCTS, value);
	}
	
}
