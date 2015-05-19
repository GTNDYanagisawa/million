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
package de.hybris.platform.basecommerce.model.site;

import de.hybris.platform.acceleratorservices.model.CartRemovalCronJobModel;
import de.hybris.platform.acceleratorservices.model.UncollectedOrdersCronJobModel;
import de.hybris.platform.commerceservices.enums.SiteChannel;
import de.hybris.platform.commerceservices.enums.SiteTheme;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.promotions.model.PromotionGroupModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.solrfacetsearch.model.config.SolrFacetSearchConfigModel;
import de.hybris.platform.store.BaseStoreModel;
import java.util.List;
import java.util.Locale;

/**
 * Generated model class for type BaseSite first defined at extension basecommerce.
 */
@SuppressWarnings("all")
public class BaseSiteModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BaseSite";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseSite.uid</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String UID = "uid";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseSite.name</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseSite.stores</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String STORES = "stores";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseSite.theme</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String THEME = "theme";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseSite.defaultLanguage</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String DEFAULTLANGUAGE = "defaultLanguage";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseSite.locale</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String LOCALE = "locale";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseSite.channel</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String CHANNEL = "channel";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseSite.defaultPromotionGroup</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String DEFAULTPROMOTIONGROUP = "defaultPromotionGroup";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseSite.solrFacetSearchConfiguration</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String SOLRFACETSEARCHCONFIGURATION = "solrFacetSearchConfiguration";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseSite.cartRemovalAge</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String CARTREMOVALAGE = "cartRemovalAge";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseSite.anonymousCartRemovalAge</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String ANONYMOUSCARTREMOVALAGE = "anonymousCartRemovalAge";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseSite.cartRemovalCronJob</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String CARTREMOVALCRONJOB = "cartRemovalCronJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>BaseSite.uncollectedOrdersCronJob</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String UNCOLLECTEDORDERSCRONJOB = "uncollectedOrdersCronJob";
	
	
	/** <i>Generated variable</i> - Variable of <code>BaseSite.uid</code> attribute defined at extension <code>basecommerce</code>. */
	private String _uid;
	
	/** <i>Generated variable</i> - Variable of <code>BaseSite.stores</code> attribute defined at extension <code>basecommerce</code>. */
	private List<BaseStoreModel> _stores;
	
	/** <i>Generated variable</i> - Variable of <code>BaseSite.theme</code> attribute defined at extension <code>commerceservices</code>. */
	private SiteTheme _theme;
	
	/** <i>Generated variable</i> - Variable of <code>BaseSite.defaultLanguage</code> attribute defined at extension <code>commerceservices</code>. */
	private LanguageModel _defaultLanguage;
	
	/** <i>Generated variable</i> - Variable of <code>BaseSite.channel</code> attribute defined at extension <code>commerceservices</code>. */
	private SiteChannel _channel;
	
	/** <i>Generated variable</i> - Variable of <code>BaseSite.defaultPromotionGroup</code> attribute defined at extension <code>commerceservices</code>. */
	private PromotionGroupModel _defaultPromotionGroup;
	
	/** <i>Generated variable</i> - Variable of <code>BaseSite.solrFacetSearchConfiguration</code> attribute defined at extension <code>commerceservices</code>. */
	private SolrFacetSearchConfigModel _solrFacetSearchConfiguration;
	
	/** <i>Generated variable</i> - Variable of <code>BaseSite.cartRemovalAge</code> attribute defined at extension <code>acceleratorservices</code>. */
	private Integer _cartRemovalAge;
	
	/** <i>Generated variable</i> - Variable of <code>BaseSite.anonymousCartRemovalAge</code> attribute defined at extension <code>acceleratorservices</code>. */
	private Integer _anonymousCartRemovalAge;
	
	/** <i>Generated variable</i> - Variable of <code>BaseSite.cartRemovalCronJob</code> attribute defined at extension <code>acceleratorservices</code>. */
	private CartRemovalCronJobModel _cartRemovalCronJob;
	
	/** <i>Generated variable</i> - Variable of <code>BaseSite.uncollectedOrdersCronJob</code> attribute defined at extension <code>acceleratorservices</code>. */
	private UncollectedOrdersCronJobModel _uncollectedOrdersCronJob;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BaseSiteModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BaseSiteModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _uid initial attribute declared by type <code>BaseSite</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public BaseSiteModel(final String _uid)
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
	public BaseSiteModel(final ItemModel _owner, final String _uid)
	{
		super();
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseSite.anonymousCartRemovalAge</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the anonymousCartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 14 days.
	 */
	public Integer getAnonymousCartRemovalAge()
	{
		if (this._anonymousCartRemovalAge!=null)
		{
			return _anonymousCartRemovalAge;
		}
		return _anonymousCartRemovalAge = getPersistenceContext().getValue(ANONYMOUSCARTREMOVALAGE, _anonymousCartRemovalAge);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseSite.cartRemovalAge</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the cartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 28 days.
	 */
	public Integer getCartRemovalAge()
	{
		if (this._cartRemovalAge!=null)
		{
			return _cartRemovalAge;
		}
		return _cartRemovalAge = getPersistenceContext().getValue(CARTREMOVALAGE, _cartRemovalAge);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseSite.cartRemovalCronJob</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the cartRemovalCronJob
	 */
	public CartRemovalCronJobModel getCartRemovalCronJob()
	{
		if (this._cartRemovalCronJob!=null)
		{
			return _cartRemovalCronJob;
		}
		return _cartRemovalCronJob = getPersistenceContext().getValue(CARTREMOVALCRONJOB, _cartRemovalCronJob);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseSite.channel</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the channel - The channel for this site.
	 */
	public SiteChannel getChannel()
	{
		if (this._channel!=null)
		{
			return _channel;
		}
		return _channel = getPersistenceContext().getValue(CHANNEL, _channel);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseSite.defaultLanguage</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the defaultLanguage - The default language for the site.
	 */
	public LanguageModel getDefaultLanguage()
	{
		if (this._defaultLanguage!=null)
		{
			return _defaultLanguage;
		}
		return _defaultLanguage = getPersistenceContext().getValue(DEFAULTLANGUAGE, _defaultLanguage);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseSite.defaultPromotionGroup</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the defaultPromotionGroup - The default promotion group for the site.
	 */
	public PromotionGroupModel getDefaultPromotionGroup()
	{
		if (this._defaultPromotionGroup!=null)
		{
			return _defaultPromotionGroup;
		}
		return _defaultPromotionGroup = getPersistenceContext().getValue(DEFAULTPROMOTIONGROUP, _defaultPromotionGroup);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseSite.locale</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the locale - The locale to use for each language.
	 */
	public String getLocale()
	{
		return getLocale(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseSite.locale</code> attribute defined at extension <code>commerceservices</code>. 
	 * @param loc the value localization key 
	 * @return the locale - The locale to use for each language.
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getLocale(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(LOCALE, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseSite.name</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the name
	 */
	public String getName()
	{
		return getName(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseSite.name</code> attribute defined at extension <code>basecommerce</code>. 
	 * @param loc the value localization key 
	 * @return the name
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getName(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(NAME, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseSite.solrFacetSearchConfiguration</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the solrFacetSearchConfiguration - Solr search configuration for this site.
	 */
	public SolrFacetSearchConfigModel getSolrFacetSearchConfiguration()
	{
		if (this._solrFacetSearchConfiguration!=null)
		{
			return _solrFacetSearchConfiguration;
		}
		return _solrFacetSearchConfiguration = getPersistenceContext().getValue(SOLRFACETSEARCHCONFIGURATION, _solrFacetSearchConfiguration);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseSite.stores</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the stores
	 */
	public List<BaseStoreModel> getStores()
	{
		if (this._stores!=null)
		{
			return _stores;
		}
		return _stores = getPersistenceContext().getValue(STORES, _stores);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseSite.theme</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the theme - The site theme that is used in this site.
	 */
	public SiteTheme getTheme()
	{
		if (this._theme!=null)
		{
			return _theme;
		}
		return _theme = getPersistenceContext().getValue(THEME, _theme);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseSite.uid</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the uid
	 */
	public String getUid()
	{
		if (this._uid!=null)
		{
			return _uid;
		}
		return _uid = getPersistenceContext().getValue(UID, _uid);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseSite.uncollectedOrdersCronJob</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the uncollectedOrdersCronJob
	 */
	public UncollectedOrdersCronJobModel getUncollectedOrdersCronJob()
	{
		if (this._uncollectedOrdersCronJob!=null)
		{
			return _uncollectedOrdersCronJob;
		}
		return _uncollectedOrdersCronJob = getPersistenceContext().getValue(UNCOLLECTEDORDERSCRONJOB, _uncollectedOrdersCronJob);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseSite.anonymousCartRemovalAge</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the anonymousCartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 14 days.
	 */
	public void setAnonymousCartRemovalAge(final Integer value)
	{
		_anonymousCartRemovalAge = getPersistenceContext().setValue(ANONYMOUSCARTREMOVALAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseSite.cartRemovalAge</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the cartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 28 days.
	 */
	public void setCartRemovalAge(final Integer value)
	{
		_cartRemovalAge = getPersistenceContext().setValue(CARTREMOVALAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseSite.cartRemovalCronJob</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the cartRemovalCronJob
	 */
	public void setCartRemovalCronJob(final CartRemovalCronJobModel value)
	{
		_cartRemovalCronJob = getPersistenceContext().setValue(CARTREMOVALCRONJOB, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseSite.channel</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the channel - The channel for this site.
	 */
	public void setChannel(final SiteChannel value)
	{
		_channel = getPersistenceContext().setValue(CHANNEL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseSite.defaultLanguage</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the defaultLanguage - The default language for the site.
	 */
	public void setDefaultLanguage(final LanguageModel value)
	{
		_defaultLanguage = getPersistenceContext().setValue(DEFAULTLANGUAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseSite.defaultPromotionGroup</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the defaultPromotionGroup - The default promotion group for the site.
	 */
	public void setDefaultPromotionGroup(final PromotionGroupModel value)
	{
		_defaultPromotionGroup = getPersistenceContext().setValue(DEFAULTPROMOTIONGROUP, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseSite.locale</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the locale - The locale to use for each language.
	 */
	public void setLocale(final String value)
	{
		setLocale(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>BaseSite.locale</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the locale - The locale to use for each language.
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setLocale(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(LOCALE, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseSite.name</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>BaseSite.name</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the name
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setName(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(NAME, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseSite.solrFacetSearchConfiguration</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the solrFacetSearchConfiguration - Solr search configuration for this site.
	 */
	public void setSolrFacetSearchConfiguration(final SolrFacetSearchConfigModel value)
	{
		_solrFacetSearchConfiguration = getPersistenceContext().setValue(SOLRFACETSEARCHCONFIGURATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseSite.stores</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the stores
	 */
	public void setStores(final List<BaseStoreModel> value)
	{
		_stores = getPersistenceContext().setValue(STORES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseSite.theme</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the theme - The site theme that is used in this site.
	 */
	public void setTheme(final SiteTheme value)
	{
		_theme = getPersistenceContext().setValue(THEME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseSite.uid</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the uid
	 */
	public void setUid(final String value)
	{
		_uid = getPersistenceContext().setValue(UID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BaseSite.uncollectedOrdersCronJob</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the uncollectedOrdersCronJob
	 */
	public void setUncollectedOrdersCronJob(final UncollectedOrdersCronJobModel value)
	{
		_uncollectedOrdersCronJob = getPersistenceContext().setValue(UNCOLLECTEDORDERSCRONJOB, value);
	}
	
}
