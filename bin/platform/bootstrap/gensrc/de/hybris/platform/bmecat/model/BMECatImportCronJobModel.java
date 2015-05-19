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
package de.hybris.platform.bmecat.model;

import de.hybris.platform.bmecat.enums.BMECatPriceTypeEnum;
import de.hybris.platform.bmecat.enums.TransactionModeEnum;
import de.hybris.platform.bmecat.model.BMECatImportBatchJobModel;
import de.hybris.platform.bmecat.model.BMECatJobMediaModel;
import de.hybris.platform.catalog.model.CatalogModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.catalog.model.classification.ClassificationSystemVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.product.UnitModel;
import de.hybris.platform.core.model.type.ComposedTypeModel;
import de.hybris.platform.cronjob.model.JobModel;
import de.hybris.platform.cronjob.model.MediaProcessCronJobModel;
import de.hybris.platform.europe1.enums.ProductTaxGroup;
import de.hybris.platform.europe1.enums.UserPriceGroup;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

/**
 * Generated model class for type BMECatImportCronJob first defined at extension bmecat.
 */
@SuppressWarnings("all")
public class BMECatImportCronJobModel extends MediaProcessCronJobModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BMECatImportCronJob";
	
	/**<i>Generated relation code constant for relation <code>JobCronJobRelation</code> defining source attribute <code>job</code> in extension <code>processing</code>.</i>*/
	public final static String _JOBCRONJOBRELATION = "JobCronJobRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportCronJob.referenceMedias</code> attribute defined at extension <code>bmecat</code>. */
	public static final String REFERENCEMEDIAS = "referenceMedias";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportCronJob.catalogID</code> attribute defined at extension <code>bmecat</code>. */
	public static final String CATALOGID = "catalogID";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportCronJob.catalogVersion</code> attribute defined at extension <code>bmecat</code>. */
	public static final String CATALOGVERSION = "catalogVersion";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportCronJob.MediasMedia</code> attribute defined at extension <code>bmecat</code>. */
	public static final String MEDIASMEDIA = "MediasMedia";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportCronJob.catalogVersionName</code> attribute defined at extension <code>bmecat</code>. */
	public static final String CATALOGVERSIONNAME = "catalogVersionName";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportCronJob.previousUpdateVersion</code> attribute defined at extension <code>bmecat</code>. */
	public static final String PREVIOUSUPDATEVERSION = "previousUpdateVersion";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportCronJob.importLanguageIsoCode</code> attribute defined at extension <code>bmecat</code>. */
	public static final String IMPORTLANGUAGEISOCODE = "importLanguageIsoCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportCronJob.catalog</code> attribute defined at extension <code>bmecat</code>. */
	public static final String CATALOG = "catalog";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportCronJob.defaultCurrencyIsoCode</code> attribute defined at extension <code>bmecat</code>. */
	public static final String DEFAULTCURRENCYISOCODE = "defaultCurrencyIsoCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportCronJob.defaultCurrency</code> attribute defined at extension <code>bmecat</code>. */
	public static final String DEFAULTCURRENCY = "defaultCurrency";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportCronJob.localizationUpdate</code> attribute defined at extension <code>bmecat</code>. */
	public static final String LOCALIZATIONUPDATE = "localizationUpdate";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportCronJob.catalogInfoAvailable</code> attribute defined at extension <code>bmecat</code>. */
	public static final String CATALOGINFOAVAILABLE = "catalogInfoAvailable";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportCronJob.transactionMode</code> attribute defined at extension <code>bmecat</code>. */
	public static final String TRANSACTIONMODE = "transactionMode";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportCronJob.currencyMappings</code> attribute defined at extension <code>bmecat</code>. */
	public static final String CURRENCYMAPPINGS = "currencyMappings";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportCronJob.classificationMappings</code> attribute defined at extension <code>bmecat</code>. */
	public static final String CLASSIFICATIONMAPPINGS = "classificationMappings";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportCronJob.countryMappings</code> attribute defined at extension <code>bmecat</code>. */
	public static final String COUNTRYMAPPINGS = "countryMappings";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportCronJob.unitMappings</code> attribute defined at extension <code>bmecat</code>. */
	public static final String UNITMAPPINGS = "unitMappings";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportCronJob.priceTypeMappings</code> attribute defined at extension <code>bmecat</code>. */
	public static final String PRICETYPEMAPPINGS = "priceTypeMappings";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportCronJob.taxTypeMappings</code> attribute defined at extension <code>bmecat</code>. */
	public static final String TAXTYPEMAPPINGS = "taxTypeMappings";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportCronJob.articleCount</code> attribute defined at extension <code>bmecat</code>. */
	public static final String ARTICLECOUNT = "articleCount";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportCronJob.categoryCount</code> attribute defined at extension <code>bmecat</code>. */
	public static final String CATEGORYCOUNT = "categoryCount";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportCronJob.mimeCount</code> attribute defined at extension <code>bmecat</code>. */
	public static final String MIMECOUNT = "mimeCount";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportCronJob.keywordCount</code> attribute defined at extension <code>bmecat</code>. */
	public static final String KEYWORDCOUNT = "keywordCount";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportCronJob.categoryAssignmentsCount</code> attribute defined at extension <code>bmecat</code>. */
	public static final String CATEGORYASSIGNMENTSCOUNT = "categoryAssignmentsCount";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportCronJob.territories</code> attribute defined at extension <code>bmecat</code>. */
	public static final String TERRITORIES = "territories";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportCronJob.importLanguage</code> attribute defined at extension <code>bmecat</code>. */
	public static final String IMPORTLANGUAGE = "importLanguage";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportCronJob.importSupplier</code> attribute defined at extension <code>bmecat</code>. */
	public static final String IMPORTSUPPLIER = "importSupplier";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportCronJob.importBuyer</code> attribute defined at extension <code>bmecat</code>. */
	public static final String IMPORTBUYER = "importBuyer";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportCronJob.importAgreement</code> attribute defined at extension <code>bmecat</code>. */
	public static final String IMPORTAGREEMENT = "importAgreement";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportCronJob.keywordType</code> attribute defined at extension <code>bmecat</code>. */
	public static final String KEYWORDTYPE = "keywordType";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportCronJob.catalogDate</code> attribute defined at extension <code>bmecat</code>. */
	public static final String CATALOGDATE = "catalogDate";
	
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportCronJob.referenceMedias</code> attribute defined at extension <code>bmecat</code>. */
	private Boolean _referenceMedias;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportCronJob.catalogID</code> attribute defined at extension <code>bmecat</code>. */
	private String _catalogID;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportCronJob.catalogVersion</code> attribute defined at extension <code>bmecat</code>. */
	private CatalogVersionModel _catalogVersion;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportCronJob.MediasMedia</code> attribute defined at extension <code>bmecat</code>. */
	private BMECatJobMediaModel _MediasMedia;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportCronJob.catalogVersionName</code> attribute defined at extension <code>bmecat</code>. */
	private String _catalogVersionName;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportCronJob.previousUpdateVersion</code> attribute defined at extension <code>bmecat</code>. */
	private Integer _previousUpdateVersion;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportCronJob.importLanguageIsoCode</code> attribute defined at extension <code>bmecat</code>. */
	private String _importLanguageIsoCode;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportCronJob.catalog</code> attribute defined at extension <code>bmecat</code>. */
	private CatalogModel _catalog;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportCronJob.defaultCurrencyIsoCode</code> attribute defined at extension <code>bmecat</code>. */
	private String _defaultCurrencyIsoCode;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportCronJob.defaultCurrency</code> attribute defined at extension <code>bmecat</code>. */
	private CurrencyModel _defaultCurrency;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportCronJob.localizationUpdate</code> attribute defined at extension <code>bmecat</code>. */
	private Boolean _localizationUpdate;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportCronJob.catalogInfoAvailable</code> attribute defined at extension <code>bmecat</code>. */
	private Boolean _catalogInfoAvailable;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportCronJob.transactionMode</code> attribute defined at extension <code>bmecat</code>. */
	private TransactionModeEnum _transactionMode;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportCronJob.currencyMappings</code> attribute defined at extension <code>bmecat</code>. */
	private Map<String,CurrencyModel> _currencyMappings;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportCronJob.classificationMappings</code> attribute defined at extension <code>bmecat</code>. */
	private Map<String,ClassificationSystemVersionModel> _classificationMappings;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportCronJob.countryMappings</code> attribute defined at extension <code>bmecat</code>. */
	private Map<String,CountryModel> _countryMappings;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportCronJob.unitMappings</code> attribute defined at extension <code>bmecat</code>. */
	private Map<String,UnitModel> _unitMappings;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportCronJob.priceTypeMappings</code> attribute defined at extension <code>bmecat</code>. */
	private Map<BMECatPriceTypeEnum,UserPriceGroup> _priceTypeMappings;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportCronJob.taxTypeMappings</code> attribute defined at extension <code>bmecat</code>. */
	private Map<String,ProductTaxGroup> _taxTypeMappings;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportCronJob.articleCount</code> attribute defined at extension <code>bmecat</code>. */
	private Integer _articleCount;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportCronJob.categoryCount</code> attribute defined at extension <code>bmecat</code>. */
	private Integer _categoryCount;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportCronJob.mimeCount</code> attribute defined at extension <code>bmecat</code>. */
	private Integer _mimeCount;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportCronJob.keywordCount</code> attribute defined at extension <code>bmecat</code>. */
	private Integer _keywordCount;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportCronJob.categoryAssignmentsCount</code> attribute defined at extension <code>bmecat</code>. */
	private Integer _categoryAssignmentsCount;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportCronJob.territories</code> attribute defined at extension <code>bmecat</code>. */
	private Collection<String> _territories;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportCronJob.importLanguage</code> attribute defined at extension <code>bmecat</code>. */
	private LanguageModel _importLanguage;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportCronJob.importSupplier</code> attribute defined at extension <code>bmecat</code>. */
	private Boolean _importSupplier;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportCronJob.importBuyer</code> attribute defined at extension <code>bmecat</code>. */
	private Boolean _importBuyer;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportCronJob.importAgreement</code> attribute defined at extension <code>bmecat</code>. */
	private Boolean _importAgreement;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportCronJob.keywordType</code> attribute defined at extension <code>bmecat</code>. */
	private ComposedTypeModel _keywordType;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportCronJob.catalogDate</code> attribute defined at extension <code>bmecat</code>. */
	private Date _catalogDate;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BMECatImportCronJobModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BMECatImportCronJobModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>BMECatImportCronJob</code> at extension <code>bmecat</code>
	 */
	@Deprecated
	public BMECatImportCronJobModel(final BMECatImportBatchJobModel _job)
	{
		super();
		setJob(_job);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>BMECatImportCronJob</code> at extension <code>bmecat</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public BMECatImportCronJobModel(final BMECatImportBatchJobModel _job, final ItemModel _owner)
	{
		super();
		setJob(_job);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportCronJob.articleCount</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the articleCount
	 */
	public Integer getArticleCount()
	{
		if (this._articleCount!=null)
		{
			return _articleCount;
		}
		return _articleCount = getPersistenceContext().getValue(ARTICLECOUNT, _articleCount);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportCronJob.catalog</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the catalog
	 */
	public CatalogModel getCatalog()
	{
		if (this._catalog!=null)
		{
			return _catalog;
		}
		return _catalog = getPersistenceContext().getValue(CATALOG, _catalog);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportCronJob.catalogDate</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the catalogDate
	 */
	public Date getCatalogDate()
	{
		if (this._catalogDate!=null)
		{
			return _catalogDate;
		}
		return _catalogDate = getPersistenceContext().getValue(CATALOGDATE, _catalogDate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportCronJob.catalogID</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the catalogID
	 */
	public String getCatalogID()
	{
		if (this._catalogID!=null)
		{
			return _catalogID;
		}
		return _catalogID = getPersistenceContext().getValue(CATALOGID, _catalogID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportCronJob.catalogInfoAvailable</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the catalogInfoAvailable
	 */
	public Boolean getCatalogInfoAvailable()
	{
		if (this._catalogInfoAvailable!=null)
		{
			return _catalogInfoAvailable;
		}
		return _catalogInfoAvailable = getPersistenceContext().getValue(CATALOGINFOAVAILABLE, _catalogInfoAvailable);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportCronJob.catalogVersion</code> attribute defined at extension <code>bmecat</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>BMECatImportCronJob.catalogVersionName</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the catalogVersionName
	 */
	public String getCatalogVersionName()
	{
		if (this._catalogVersionName!=null)
		{
			return _catalogVersionName;
		}
		return _catalogVersionName = getPersistenceContext().getValue(CATALOGVERSIONNAME, _catalogVersionName);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportCronJob.categoryAssignmentsCount</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the categoryAssignmentsCount
	 */
	public Integer getCategoryAssignmentsCount()
	{
		if (this._categoryAssignmentsCount!=null)
		{
			return _categoryAssignmentsCount;
		}
		return _categoryAssignmentsCount = getPersistenceContext().getValue(CATEGORYASSIGNMENTSCOUNT, _categoryAssignmentsCount);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportCronJob.categoryCount</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the categoryCount
	 */
	public Integer getCategoryCount()
	{
		if (this._categoryCount!=null)
		{
			return _categoryCount;
		}
		return _categoryCount = getPersistenceContext().getValue(CATEGORYCOUNT, _categoryCount);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportCronJob.classificationMappings</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the classificationMappings
	 */
	public Map<String,ClassificationSystemVersionModel> getClassificationMappings()
	{
		if (this._classificationMappings!=null)
		{
			return _classificationMappings;
		}
		return _classificationMappings = getPersistenceContext().getValue(CLASSIFICATIONMAPPINGS, _classificationMappings);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportCronJob.countryMappings</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the countryMappings
	 */
	public Map<String,CountryModel> getCountryMappings()
	{
		if (this._countryMappings!=null)
		{
			return _countryMappings;
		}
		return _countryMappings = getPersistenceContext().getValue(COUNTRYMAPPINGS, _countryMappings);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportCronJob.currencyMappings</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the currencyMappings
	 */
	public Map<String,CurrencyModel> getCurrencyMappings()
	{
		if (this._currencyMappings!=null)
		{
			return _currencyMappings;
		}
		return _currencyMappings = getPersistenceContext().getValue(CURRENCYMAPPINGS, _currencyMappings);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportCronJob.defaultCurrency</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the defaultCurrency
	 */
	public CurrencyModel getDefaultCurrency()
	{
		if (this._defaultCurrency!=null)
		{
			return _defaultCurrency;
		}
		return _defaultCurrency = getPersistenceContext().getValue(DEFAULTCURRENCY, _defaultCurrency);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportCronJob.defaultCurrencyIsoCode</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the defaultCurrencyIsoCode
	 */
	public String getDefaultCurrencyIsoCode()
	{
		if (this._defaultCurrencyIsoCode!=null)
		{
			return _defaultCurrencyIsoCode;
		}
		return _defaultCurrencyIsoCode = getPersistenceContext().getValue(DEFAULTCURRENCYISOCODE, _defaultCurrencyIsoCode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportCronJob.importAgreement</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the importAgreement
	 */
	public Boolean getImportAgreement()
	{
		if (this._importAgreement!=null)
		{
			return _importAgreement;
		}
		return _importAgreement = getPersistenceContext().getValue(IMPORTAGREEMENT, _importAgreement);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportCronJob.importBuyer</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the importBuyer
	 */
	public Boolean getImportBuyer()
	{
		if (this._importBuyer!=null)
		{
			return _importBuyer;
		}
		return _importBuyer = getPersistenceContext().getValue(IMPORTBUYER, _importBuyer);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportCronJob.importLanguage</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the importLanguage
	 */
	public LanguageModel getImportLanguage()
	{
		if (this._importLanguage!=null)
		{
			return _importLanguage;
		}
		return _importLanguage = getPersistenceContext().getValue(IMPORTLANGUAGE, _importLanguage);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportCronJob.importLanguageIsoCode</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the importLanguageIsoCode
	 */
	public String getImportLanguageIsoCode()
	{
		if (this._importLanguageIsoCode!=null)
		{
			return _importLanguageIsoCode;
		}
		return _importLanguageIsoCode = getPersistenceContext().getValue(IMPORTLANGUAGEISOCODE, _importLanguageIsoCode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportCronJob.importSupplier</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the importSupplier
	 */
	public Boolean getImportSupplier()
	{
		if (this._importSupplier!=null)
		{
			return _importSupplier;
		}
		return _importSupplier = getPersistenceContext().getValue(IMPORTSUPPLIER, _importSupplier);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.job</code> attribute defined at extension <code>processing</code> and redeclared at extension <code>bmecat</code>. 
	 * @return the job
	 */
	@Override
	public BMECatImportBatchJobModel getJob()
	{
		return (BMECatImportBatchJobModel) super.getJob();
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportCronJob.keywordCount</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the keywordCount
	 */
	public Integer getKeywordCount()
	{
		if (this._keywordCount!=null)
		{
			return _keywordCount;
		}
		return _keywordCount = getPersistenceContext().getValue(KEYWORDCOUNT, _keywordCount);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportCronJob.keywordType</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the keywordType
	 */
	public ComposedTypeModel getKeywordType()
	{
		if (this._keywordType!=null)
		{
			return _keywordType;
		}
		return _keywordType = getPersistenceContext().getValue(KEYWORDTYPE, _keywordType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportCronJob.localizationUpdate</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the localizationUpdate
	 */
	public Boolean getLocalizationUpdate()
	{
		if (this._localizationUpdate!=null)
		{
			return _localizationUpdate;
		}
		return _localizationUpdate = getPersistenceContext().getValue(LOCALIZATIONUPDATE, _localizationUpdate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportCronJob.MediasMedia</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the MediasMedia
	 */
	public BMECatJobMediaModel getMediasMedia()
	{
		if (this._MediasMedia!=null)
		{
			return _MediasMedia;
		}
		return _MediasMedia = getPersistenceContext().getValue(MEDIASMEDIA, _MediasMedia);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportCronJob.mimeCount</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the mimeCount
	 */
	public Integer getMimeCount()
	{
		if (this._mimeCount!=null)
		{
			return _mimeCount;
		}
		return _mimeCount = getPersistenceContext().getValue(MIMECOUNT, _mimeCount);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportCronJob.previousUpdateVersion</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the previousUpdateVersion
	 */
	public Integer getPreviousUpdateVersion()
	{
		if (this._previousUpdateVersion!=null)
		{
			return _previousUpdateVersion;
		}
		return _previousUpdateVersion = getPersistenceContext().getValue(PREVIOUSUPDATEVERSION, _previousUpdateVersion);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportCronJob.priceTypeMappings</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the priceTypeMappings
	 */
	public Map<BMECatPriceTypeEnum,UserPriceGroup> getPriceTypeMappings()
	{
		if (this._priceTypeMappings!=null)
		{
			return _priceTypeMappings;
		}
		return _priceTypeMappings = getPersistenceContext().getValue(PRICETYPEMAPPINGS, _priceTypeMappings);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportCronJob.referenceMedias</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the referenceMedias
	 */
	public Boolean getReferenceMedias()
	{
		if (this._referenceMedias!=null)
		{
			return _referenceMedias;
		}
		return _referenceMedias = getPersistenceContext().getValue(REFERENCEMEDIAS, _referenceMedias);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportCronJob.taxTypeMappings</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the taxTypeMappings
	 */
	public Map<String,ProductTaxGroup> getTaxTypeMappings()
	{
		if (this._taxTypeMappings!=null)
		{
			return _taxTypeMappings;
		}
		return _taxTypeMappings = getPersistenceContext().getValue(TAXTYPEMAPPINGS, _taxTypeMappings);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportCronJob.territories</code> attribute defined at extension <code>bmecat</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the territories
	 */
	public Collection<String> getTerritories()
	{
		if (this._territories!=null)
		{
			return _territories;
		}
		return _territories = getPersistenceContext().getValue(TERRITORIES, _territories);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportCronJob.transactionMode</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the transactionMode
	 */
	public TransactionModeEnum getTransactionMode()
	{
		if (this._transactionMode!=null)
		{
			return _transactionMode;
		}
		return _transactionMode = getPersistenceContext().getValue(TRANSACTIONMODE, _transactionMode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportCronJob.unitMappings</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the unitMappings
	 */
	public Map<String,UnitModel> getUnitMappings()
	{
		if (this._unitMappings!=null)
		{
			return _unitMappings;
		}
		return _unitMappings = getPersistenceContext().getValue(UNITMAPPINGS, _unitMappings);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportCronJob.articleCount</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the articleCount
	 */
	public void setArticleCount(final Integer value)
	{
		_articleCount = getPersistenceContext().setValue(ARTICLECOUNT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportCronJob.catalog</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the catalog
	 */
	public void setCatalog(final CatalogModel value)
	{
		_catalog = getPersistenceContext().setValue(CATALOG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportCronJob.catalogID</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the catalogID
	 */
	public void setCatalogID(final String value)
	{
		_catalogID = getPersistenceContext().setValue(CATALOGID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportCronJob.catalogInfoAvailable</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the catalogInfoAvailable
	 */
	public void setCatalogInfoAvailable(final Boolean value)
	{
		_catalogInfoAvailable = getPersistenceContext().setValue(CATALOGINFOAVAILABLE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportCronJob.catalogVersion</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the catalogVersion
	 */
	public void setCatalogVersion(final CatalogVersionModel value)
	{
		_catalogVersion = getPersistenceContext().setValue(CATALOGVERSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportCronJob.catalogVersionName</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the catalogVersionName
	 */
	public void setCatalogVersionName(final String value)
	{
		_catalogVersionName = getPersistenceContext().setValue(CATALOGVERSIONNAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportCronJob.categoryAssignmentsCount</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the categoryAssignmentsCount
	 */
	public void setCategoryAssignmentsCount(final Integer value)
	{
		_categoryAssignmentsCount = getPersistenceContext().setValue(CATEGORYASSIGNMENTSCOUNT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportCronJob.categoryCount</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the categoryCount
	 */
	public void setCategoryCount(final Integer value)
	{
		_categoryCount = getPersistenceContext().setValue(CATEGORYCOUNT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportCronJob.classificationMappings</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the classificationMappings
	 */
	public void setClassificationMappings(final Map<String,ClassificationSystemVersionModel> value)
	{
		_classificationMappings = getPersistenceContext().setValue(CLASSIFICATIONMAPPINGS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportCronJob.countryMappings</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the countryMappings
	 */
	public void setCountryMappings(final Map<String,CountryModel> value)
	{
		_countryMappings = getPersistenceContext().setValue(COUNTRYMAPPINGS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportCronJob.currencyMappings</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the currencyMappings
	 */
	public void setCurrencyMappings(final Map<String,CurrencyModel> value)
	{
		_currencyMappings = getPersistenceContext().setValue(CURRENCYMAPPINGS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportCronJob.defaultCurrency</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the defaultCurrency
	 */
	public void setDefaultCurrency(final CurrencyModel value)
	{
		_defaultCurrency = getPersistenceContext().setValue(DEFAULTCURRENCY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportCronJob.defaultCurrencyIsoCode</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the defaultCurrencyIsoCode
	 */
	public void setDefaultCurrencyIsoCode(final String value)
	{
		_defaultCurrencyIsoCode = getPersistenceContext().setValue(DEFAULTCURRENCYISOCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportCronJob.importAgreement</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the importAgreement
	 */
	public void setImportAgreement(final Boolean value)
	{
		_importAgreement = getPersistenceContext().setValue(IMPORTAGREEMENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportCronJob.importBuyer</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the importBuyer
	 */
	public void setImportBuyer(final Boolean value)
	{
		_importBuyer = getPersistenceContext().setValue(IMPORTBUYER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportCronJob.importLanguage</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the importLanguage
	 */
	public void setImportLanguage(final LanguageModel value)
	{
		_importLanguage = getPersistenceContext().setValue(IMPORTLANGUAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportCronJob.importLanguageIsoCode</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the importLanguageIsoCode
	 */
	public void setImportLanguageIsoCode(final String value)
	{
		_importLanguageIsoCode = getPersistenceContext().setValue(IMPORTLANGUAGEISOCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportCronJob.importSupplier</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the importSupplier
	 */
	public void setImportSupplier(final Boolean value)
	{
		_importSupplier = getPersistenceContext().setValue(IMPORTSUPPLIER, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>CronJob.job</code> attribute defined at extension <code>processing</code> and redeclared at extension <code>bmecat</code>. Can only be used at creation of model - before first save. Will only accept values of type {@link de.hybris.platform.bmecat.model.BMECatImportBatchJobModel}.  
	 *  
	 * @param value the job
	 */
	@Override
	public void setJob(final JobModel value)
	{
		super.setJob(value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportCronJob.keywordCount</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the keywordCount
	 */
	public void setKeywordCount(final Integer value)
	{
		_keywordCount = getPersistenceContext().setValue(KEYWORDCOUNT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportCronJob.keywordType</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the keywordType
	 */
	public void setKeywordType(final ComposedTypeModel value)
	{
		_keywordType = getPersistenceContext().setValue(KEYWORDTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportCronJob.localizationUpdate</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the localizationUpdate
	 */
	public void setLocalizationUpdate(final Boolean value)
	{
		_localizationUpdate = getPersistenceContext().setValue(LOCALIZATIONUPDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportCronJob.MediasMedia</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the MediasMedia
	 */
	public void setMediasMedia(final BMECatJobMediaModel value)
	{
		_MediasMedia = getPersistenceContext().setValue(MEDIASMEDIA, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportCronJob.mimeCount</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the mimeCount
	 */
	public void setMimeCount(final Integer value)
	{
		_mimeCount = getPersistenceContext().setValue(MIMECOUNT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportCronJob.previousUpdateVersion</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the previousUpdateVersion
	 */
	public void setPreviousUpdateVersion(final Integer value)
	{
		_previousUpdateVersion = getPersistenceContext().setValue(PREVIOUSUPDATEVERSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportCronJob.priceTypeMappings</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the priceTypeMappings
	 */
	public void setPriceTypeMappings(final Map<BMECatPriceTypeEnum,UserPriceGroup> value)
	{
		_priceTypeMappings = getPersistenceContext().setValue(PRICETYPEMAPPINGS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportCronJob.referenceMedias</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the referenceMedias
	 */
	public void setReferenceMedias(final Boolean value)
	{
		_referenceMedias = getPersistenceContext().setValue(REFERENCEMEDIAS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportCronJob.taxTypeMappings</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the taxTypeMappings
	 */
	public void setTaxTypeMappings(final Map<String,ProductTaxGroup> value)
	{
		_taxTypeMappings = getPersistenceContext().setValue(TAXTYPEMAPPINGS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportCronJob.territories</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the territories
	 */
	public void setTerritories(final Collection<String> value)
	{
		_territories = getPersistenceContext().setValue(TERRITORIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportCronJob.transactionMode</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the transactionMode
	 */
	public void setTransactionMode(final TransactionModeEnum value)
	{
		_transactionMode = getPersistenceContext().setValue(TRANSACTIONMODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportCronJob.unitMappings</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the unitMappings
	 */
	public void setUnitMappings(final Map<String,UnitModel> value)
	{
		_unitMappings = getPersistenceContext().setValue(UNITMAPPINGS, value);
	}
	
}
