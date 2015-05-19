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
package de.hybris.platform.acceleratorservices.model;

import de.hybris.platform.acceleratorservices.model.SiteMapLanguageCurrencyModel;
import de.hybris.platform.acceleratorservices.model.SiteMapPageModel;
import de.hybris.platform.commons.model.renderer.RendererTemplateModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type SiteMapConfig first defined at extension acceleratorservices.
 * <p>
 * Holds the site map configurations.
 */
@SuppressWarnings("all")
public class SiteMapConfigModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SiteMapConfig";
	
	/** <i>Generated constant</i> - Attribute key of <code>SiteMapConfig.configId</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String CONFIGID = "configId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SiteMapConfig.siteMapLanguageCurrencies</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String SITEMAPLANGUAGECURRENCIES = "siteMapLanguageCurrencies";
	
	/** <i>Generated constant</i> - Attribute key of <code>SiteMapConfig.siteMapPages</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String SITEMAPPAGES = "siteMapPages";
	
	/** <i>Generated constant</i> - Attribute key of <code>SiteMapConfig.siteMapTemplate</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String SITEMAPTEMPLATE = "siteMapTemplate";
	
	/** <i>Generated constant</i> - Attribute key of <code>SiteMapConfig.customUrls</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String CUSTOMURLS = "customUrls";
	
	
	/** <i>Generated variable</i> - Variable of <code>SiteMapConfig.configId</code> attribute defined at extension <code>acceleratorservices</code>. */
	private String _configId;
	
	/** <i>Generated variable</i> - Variable of <code>SiteMapConfig.siteMapLanguageCurrencies</code> attribute defined at extension <code>acceleratorservices</code>. */
	private Collection<SiteMapLanguageCurrencyModel> _siteMapLanguageCurrencies;
	
	/** <i>Generated variable</i> - Variable of <code>SiteMapConfig.siteMapPages</code> attribute defined at extension <code>acceleratorservices</code>. */
	private Collection<SiteMapPageModel> _siteMapPages;
	
	/** <i>Generated variable</i> - Variable of <code>SiteMapConfig.siteMapTemplate</code> attribute defined at extension <code>acceleratorservices</code>. */
	private RendererTemplateModel _siteMapTemplate;
	
	/** <i>Generated variable</i> - Variable of <code>SiteMapConfig.customUrls</code> attribute defined at extension <code>acceleratorservices</code>. */
	private Collection<String> _customUrls;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SiteMapConfigModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SiteMapConfigModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public SiteMapConfigModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapConfig.configId</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the configId
	 */
	public String getConfigId()
	{
		if (this._configId!=null)
		{
			return _configId;
		}
		return _configId = getPersistenceContext().getValue(CONFIGID, _configId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapConfig.customUrls</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the customUrls
	 */
	public Collection<String> getCustomUrls()
	{
		if (this._customUrls!=null)
		{
			return _customUrls;
		}
		return _customUrls = getPersistenceContext().getValue(CUSTOMURLS, _customUrls);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapConfig.siteMapLanguageCurrencies</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the siteMapLanguageCurrencies
	 */
	public Collection<SiteMapLanguageCurrencyModel> getSiteMapLanguageCurrencies()
	{
		if (this._siteMapLanguageCurrencies!=null)
		{
			return _siteMapLanguageCurrencies;
		}
		return _siteMapLanguageCurrencies = getPersistenceContext().getValue(SITEMAPLANGUAGECURRENCIES, _siteMapLanguageCurrencies);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapConfig.siteMapPages</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the siteMapPages
	 */
	public Collection<SiteMapPageModel> getSiteMapPages()
	{
		if (this._siteMapPages!=null)
		{
			return _siteMapPages;
		}
		return _siteMapPages = getPersistenceContext().getValue(SITEMAPPAGES, _siteMapPages);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapConfig.siteMapTemplate</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the siteMapTemplate
	 */
	public RendererTemplateModel getSiteMapTemplate()
	{
		if (this._siteMapTemplate!=null)
		{
			return _siteMapTemplate;
		}
		return _siteMapTemplate = getPersistenceContext().getValue(SITEMAPTEMPLATE, _siteMapTemplate);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SiteMapConfig.configId</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the configId
	 */
	public void setConfigId(final String value)
	{
		_configId = getPersistenceContext().setValue(CONFIGID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SiteMapConfig.customUrls</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the customUrls
	 */
	public void setCustomUrls(final Collection<String> value)
	{
		_customUrls = getPersistenceContext().setValue(CUSTOMURLS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SiteMapConfig.siteMapLanguageCurrencies</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the siteMapLanguageCurrencies
	 */
	public void setSiteMapLanguageCurrencies(final Collection<SiteMapLanguageCurrencyModel> value)
	{
		_siteMapLanguageCurrencies = getPersistenceContext().setValue(SITEMAPLANGUAGECURRENCIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SiteMapConfig.siteMapPages</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the siteMapPages
	 */
	public void setSiteMapPages(final Collection<SiteMapPageModel> value)
	{
		_siteMapPages = getPersistenceContext().setValue(SITEMAPPAGES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SiteMapConfig.siteMapTemplate</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the siteMapTemplate
	 */
	public void setSiteMapTemplate(final RendererTemplateModel value)
	{
		_siteMapTemplate = getPersistenceContext().setValue(SITEMAPTEMPLATE, value);
	}
	
}
