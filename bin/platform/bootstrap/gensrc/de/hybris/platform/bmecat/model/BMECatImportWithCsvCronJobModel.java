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
import de.hybris.platform.bmecat.model.BMECatImpExScriptMediaModel;
import de.hybris.platform.bmecat.model.BMECatImportWithCsvJobModel;
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
import de.hybris.platform.europe1.enums.ProductTaxGroup;
import de.hybris.platform.impex.model.cronjob.ImpExImportCronJobModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

/**
 * Generated model class for type BMECatImportWithCsvCronJob first defined at extension bmecat.
 */
@SuppressWarnings("all")
public class BMECatImportWithCsvCronJobModel extends ImpExImportCronJobModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BMECatImportWithCsvCronJob";
	
	/**<i>Generated relation code constant for relation <code>JobCronJobRelation</code> defining source attribute <code>job</code> in extension <code>processing</code>.</i>*/
	public final static String _JOBCRONJOBRELATION = "JobCronJobRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportWithCsvCronJob.catalogID</code> attribute defined at extension <code>bmecat</code>. */
	public static final String CATALOGID = "catalogID";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportWithCsvCronJob.catalogVersion</code> attribute defined at extension <code>bmecat</code>. */
	public static final String CATALOGVERSION = "catalogVersion";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportWithCsvCronJob.catalogVersionName</code> attribute defined at extension <code>bmecat</code>. */
	public static final String CATALOGVERSIONNAME = "catalogVersionName";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportWithCsvCronJob.previousUpdateVersion</code> attribute defined at extension <code>bmecat</code>. */
	public static final String PREVIOUSUPDATEVERSION = "previousUpdateVersion";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportWithCsvCronJob.importLanguageIsoCode</code> attribute defined at extension <code>bmecat</code>. */
	public static final String IMPORTLANGUAGEISOCODE = "importLanguageIsoCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportWithCsvCronJob.catalog</code> attribute defined at extension <code>bmecat</code>. */
	public static final String CATALOG = "catalog";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportWithCsvCronJob.defaultCurrencyIsoCode</code> attribute defined at extension <code>bmecat</code>. */
	public static final String DEFAULTCURRENCYISOCODE = "defaultCurrencyIsoCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportWithCsvCronJob.defaultCurrency</code> attribute defined at extension <code>bmecat</code>. */
	public static final String DEFAULTCURRENCY = "defaultCurrency";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportWithCsvCronJob.localizationUpdate</code> attribute defined at extension <code>bmecat</code>. */
	public static final String LOCALIZATIONUPDATE = "localizationUpdate";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportWithCsvCronJob.catalogInfoAvailable</code> attribute defined at extension <code>bmecat</code>. */
	public static final String CATALOGINFOAVAILABLE = "catalogInfoAvailable";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportWithCsvCronJob.transactionMode</code> attribute defined at extension <code>bmecat</code>. */
	public static final String TRANSACTIONMODE = "transactionMode";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportWithCsvCronJob.currencyMappings</code> attribute defined at extension <code>bmecat</code>. */
	public static final String CURRENCYMAPPINGS = "currencyMappings";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportWithCsvCronJob.classificationMappings</code> attribute defined at extension <code>bmecat</code>. */
	public static final String CLASSIFICATIONMAPPINGS = "classificationMappings";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportWithCsvCronJob.countryMappings</code> attribute defined at extension <code>bmecat</code>. */
	public static final String COUNTRYMAPPINGS = "countryMappings";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportWithCsvCronJob.unitMappings</code> attribute defined at extension <code>bmecat</code>. */
	public static final String UNITMAPPINGS = "unitMappings";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportWithCsvCronJob.priceTypeMappings</code> attribute defined at extension <code>bmecat</code>. */
	public static final String PRICETYPEMAPPINGS = "priceTypeMappings";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportWithCsvCronJob.taxTypeMappings</code> attribute defined at extension <code>bmecat</code>. */
	public static final String TAXTYPEMAPPINGS = "taxTypeMappings";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportWithCsvCronJob.articleCount</code> attribute defined at extension <code>bmecat</code>. */
	public static final String ARTICLECOUNT = "articleCount";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportWithCsvCronJob.categoryCount</code> attribute defined at extension <code>bmecat</code>. */
	public static final String CATEGORYCOUNT = "categoryCount";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportWithCsvCronJob.mimeCount</code> attribute defined at extension <code>bmecat</code>. */
	public static final String MIMECOUNT = "mimeCount";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportWithCsvCronJob.keywordCount</code> attribute defined at extension <code>bmecat</code>. */
	public static final String KEYWORDCOUNT = "keywordCount";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportWithCsvCronJob.categoryAssignmentsCount</code> attribute defined at extension <code>bmecat</code>. */
	public static final String CATEGORYASSIGNMENTSCOUNT = "categoryAssignmentsCount";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportWithCsvCronJob.territories</code> attribute defined at extension <code>bmecat</code>. */
	public static final String TERRITORIES = "territories";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportWithCsvCronJob.importLanguage</code> attribute defined at extension <code>bmecat</code>. */
	public static final String IMPORTLANGUAGE = "importLanguage";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportWithCsvCronJob.importSupplier</code> attribute defined at extension <code>bmecat</code>. */
	public static final String IMPORTSUPPLIER = "importSupplier";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportWithCsvCronJob.importBuyer</code> attribute defined at extension <code>bmecat</code>. */
	public static final String IMPORTBUYER = "importBuyer";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportWithCsvCronJob.importAgreement</code> attribute defined at extension <code>bmecat</code>. */
	public static final String IMPORTAGREEMENT = "importAgreement";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportWithCsvCronJob.keywordType</code> attribute defined at extension <code>bmecat</code>. */
	public static final String KEYWORDTYPE = "keywordType";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportWithCsvCronJob.catalogDate</code> attribute defined at extension <code>bmecat</code>. */
	public static final String CATALOGDATE = "catalogDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportWithCsvCronJob.impexScriptMedia</code> attribute defined at extension <code>bmecat</code>. */
	public static final String IMPEXSCRIPTMEDIA = "impexScriptMedia";
	
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportWithCsvCronJob.catalogID</code> attribute defined at extension <code>bmecat</code>. */
	private String _catalogID;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportWithCsvCronJob.catalogVersion</code> attribute defined at extension <code>bmecat</code>. */
	private CatalogVersionModel _catalogVersion;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportWithCsvCronJob.catalogVersionName</code> attribute defined at extension <code>bmecat</code>. */
	private String _catalogVersionName;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportWithCsvCronJob.previousUpdateVersion</code> attribute defined at extension <code>bmecat</code>. */
	private Integer _previousUpdateVersion;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportWithCsvCronJob.importLanguageIsoCode</code> attribute defined at extension <code>bmecat</code>. */
	private String _importLanguageIsoCode;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportWithCsvCronJob.catalog</code> attribute defined at extension <code>bmecat</code>. */
	private CatalogModel _catalog;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportWithCsvCronJob.defaultCurrencyIsoCode</code> attribute defined at extension <code>bmecat</code>. */
	private String _defaultCurrencyIsoCode;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportWithCsvCronJob.defaultCurrency</code> attribute defined at extension <code>bmecat</code>. */
	private CurrencyModel _defaultCurrency;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportWithCsvCronJob.localizationUpdate</code> attribute defined at extension <code>bmecat</code>. */
	private Boolean _localizationUpdate;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportWithCsvCronJob.catalogInfoAvailable</code> attribute defined at extension <code>bmecat</code>. */
	private Boolean _catalogInfoAvailable;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportWithCsvCronJob.transactionMode</code> attribute defined at extension <code>bmecat</code>. */
	private TransactionModeEnum _transactionMode;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportWithCsvCronJob.currencyMappings</code> attribute defined at extension <code>bmecat</code>. */
	private Map<String,CurrencyModel> _currencyMappings;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportWithCsvCronJob.classificationMappings</code> attribute defined at extension <code>bmecat</code>. */
	private Map<String,ClassificationSystemVersionModel> _classificationMappings;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportWithCsvCronJob.countryMappings</code> attribute defined at extension <code>bmecat</code>. */
	private Map<String,CountryModel> _countryMappings;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportWithCsvCronJob.unitMappings</code> attribute defined at extension <code>bmecat</code>. */
	private Map<String,UnitModel> _unitMappings;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportWithCsvCronJob.priceTypeMappings</code> attribute defined at extension <code>bmecat</code>. */
	private Map<String,BMECatPriceTypeEnum> _priceTypeMappings;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportWithCsvCronJob.taxTypeMappings</code> attribute defined at extension <code>bmecat</code>. */
	private Map<String,ProductTaxGroup> _taxTypeMappings;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportWithCsvCronJob.articleCount</code> attribute defined at extension <code>bmecat</code>. */
	private Integer _articleCount;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportWithCsvCronJob.categoryCount</code> attribute defined at extension <code>bmecat</code>. */
	private Integer _categoryCount;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportWithCsvCronJob.mimeCount</code> attribute defined at extension <code>bmecat</code>. */
	private Integer _mimeCount;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportWithCsvCronJob.keywordCount</code> attribute defined at extension <code>bmecat</code>. */
	private Integer _keywordCount;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportWithCsvCronJob.categoryAssignmentsCount</code> attribute defined at extension <code>bmecat</code>. */
	private Integer _categoryAssignmentsCount;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportWithCsvCronJob.territories</code> attribute defined at extension <code>bmecat</code>. */
	private Collection<String> _territories;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportWithCsvCronJob.importLanguage</code> attribute defined at extension <code>bmecat</code>. */
	private LanguageModel _importLanguage;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportWithCsvCronJob.importSupplier</code> attribute defined at extension <code>bmecat</code>. */
	private Boolean _importSupplier;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportWithCsvCronJob.importBuyer</code> attribute defined at extension <code>bmecat</code>. */
	private Boolean _importBuyer;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportWithCsvCronJob.importAgreement</code> attribute defined at extension <code>bmecat</code>. */
	private Boolean _importAgreement;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportWithCsvCronJob.keywordType</code> attribute defined at extension <code>bmecat</code>. */
	private ComposedTypeModel _keywordType;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportWithCsvCronJob.catalogDate</code> attribute defined at extension <code>bmecat</code>. */
	private Date _catalogDate;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportWithCsvCronJob.impexScriptMedia</code> attribute defined at extension <code>bmecat</code>. */
	private BMECatImpExScriptMediaModel _impexScriptMedia;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BMECatImportWithCsvCronJobModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BMECatImportWithCsvCronJobModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>BMECatImportWithCsvCronJob</code> at extension <code>bmecat</code>
	 */
	@Deprecated
	public BMECatImportWithCsvCronJobModel(final BMECatImportWithCsvJobModel _job)
	{
		super();
		setJob(_job);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>BMECatImportWithCsvCronJob</code> at extension <code>bmecat</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public BMECatImportWithCsvCronJobModel(final BMECatImportWithCsvJobModel _job, final ItemModel _owner)
	{
		super();
		setJob(_job);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportWithCsvCronJob.articleCount</code> attribute defined at extension <code>bmecat</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>BMECatImportWithCsvCronJob.catalog</code> attribute defined at extension <code>bmecat</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>BMECatImportWithCsvCronJob.catalogDate</code> attribute defined at extension <code>bmecat</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>BMECatImportWithCsvCronJob.catalogID</code> attribute defined at extension <code>bmecat</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>BMECatImportWithCsvCronJob.catalogInfoAvailable</code> attribute defined at extension <code>bmecat</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>BMECatImportWithCsvCronJob.catalogVersion</code> attribute defined at extension <code>bmecat</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>BMECatImportWithCsvCronJob.catalogVersionName</code> attribute defined at extension <code>bmecat</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>BMECatImportWithCsvCronJob.categoryAssignmentsCount</code> attribute defined at extension <code>bmecat</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>BMECatImportWithCsvCronJob.categoryCount</code> attribute defined at extension <code>bmecat</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>BMECatImportWithCsvCronJob.classificationMappings</code> attribute defined at extension <code>bmecat</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>BMECatImportWithCsvCronJob.countryMappings</code> attribute defined at extension <code>bmecat</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>BMECatImportWithCsvCronJob.currencyMappings</code> attribute defined at extension <code>bmecat</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>BMECatImportWithCsvCronJob.defaultCurrency</code> attribute defined at extension <code>bmecat</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>BMECatImportWithCsvCronJob.defaultCurrencyIsoCode</code> attribute defined at extension <code>bmecat</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>BMECatImportWithCsvCronJob.impexScriptMedia</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the impexScriptMedia
	 */
	public BMECatImpExScriptMediaModel getImpexScriptMedia()
	{
		if (this._impexScriptMedia!=null)
		{
			return _impexScriptMedia;
		}
		return _impexScriptMedia = getPersistenceContext().getValue(IMPEXSCRIPTMEDIA, _impexScriptMedia);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportWithCsvCronJob.importAgreement</code> attribute defined at extension <code>bmecat</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>BMECatImportWithCsvCronJob.importBuyer</code> attribute defined at extension <code>bmecat</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>BMECatImportWithCsvCronJob.importLanguage</code> attribute defined at extension <code>bmecat</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>BMECatImportWithCsvCronJob.importLanguageIsoCode</code> attribute defined at extension <code>bmecat</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>BMECatImportWithCsvCronJob.importSupplier</code> attribute defined at extension <code>bmecat</code>. 
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
	public BMECatImportWithCsvJobModel getJob()
	{
		return (BMECatImportWithCsvJobModel) super.getJob();
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportWithCsvCronJob.keywordCount</code> attribute defined at extension <code>bmecat</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>BMECatImportWithCsvCronJob.keywordType</code> attribute defined at extension <code>bmecat</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>BMECatImportWithCsvCronJob.localizationUpdate</code> attribute defined at extension <code>bmecat</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>BMECatImportWithCsvCronJob.mimeCount</code> attribute defined at extension <code>bmecat</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>BMECatImportWithCsvCronJob.previousUpdateVersion</code> attribute defined at extension <code>bmecat</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>BMECatImportWithCsvCronJob.priceTypeMappings</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the priceTypeMappings
	 */
	public Map<String,BMECatPriceTypeEnum> getPriceTypeMappings()
	{
		if (this._priceTypeMappings!=null)
		{
			return _priceTypeMappings;
		}
		return _priceTypeMappings = getPersistenceContext().getValue(PRICETYPEMAPPINGS, _priceTypeMappings);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportWithCsvCronJob.taxTypeMappings</code> attribute defined at extension <code>bmecat</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>BMECatImportWithCsvCronJob.territories</code> attribute defined at extension <code>bmecat</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>BMECatImportWithCsvCronJob.transactionMode</code> attribute defined at extension <code>bmecat</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>BMECatImportWithCsvCronJob.unitMappings</code> attribute defined at extension <code>bmecat</code>. 
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
	 * <i>Generated method</i> - Setter of <code>BMECatImportWithCsvCronJob.articleCount</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the articleCount
	 */
	public void setArticleCount(final Integer value)
	{
		_articleCount = getPersistenceContext().setValue(ARTICLECOUNT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportWithCsvCronJob.catalog</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the catalog
	 */
	public void setCatalog(final CatalogModel value)
	{
		_catalog = getPersistenceContext().setValue(CATALOG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportWithCsvCronJob.catalogDate</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the catalogDate
	 */
	public void setCatalogDate(final Date value)
	{
		_catalogDate = getPersistenceContext().setValue(CATALOGDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportWithCsvCronJob.catalogID</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the catalogID
	 */
	public void setCatalogID(final String value)
	{
		_catalogID = getPersistenceContext().setValue(CATALOGID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportWithCsvCronJob.catalogInfoAvailable</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the catalogInfoAvailable
	 */
	public void setCatalogInfoAvailable(final Boolean value)
	{
		_catalogInfoAvailable = getPersistenceContext().setValue(CATALOGINFOAVAILABLE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportWithCsvCronJob.catalogVersion</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the catalogVersion
	 */
	public void setCatalogVersion(final CatalogVersionModel value)
	{
		_catalogVersion = getPersistenceContext().setValue(CATALOGVERSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportWithCsvCronJob.catalogVersionName</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the catalogVersionName
	 */
	public void setCatalogVersionName(final String value)
	{
		_catalogVersionName = getPersistenceContext().setValue(CATALOGVERSIONNAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportWithCsvCronJob.categoryAssignmentsCount</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the categoryAssignmentsCount
	 */
	public void setCategoryAssignmentsCount(final Integer value)
	{
		_categoryAssignmentsCount = getPersistenceContext().setValue(CATEGORYASSIGNMENTSCOUNT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportWithCsvCronJob.categoryCount</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the categoryCount
	 */
	public void setCategoryCount(final Integer value)
	{
		_categoryCount = getPersistenceContext().setValue(CATEGORYCOUNT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportWithCsvCronJob.classificationMappings</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the classificationMappings
	 */
	public void setClassificationMappings(final Map<String,ClassificationSystemVersionModel> value)
	{
		_classificationMappings = getPersistenceContext().setValue(CLASSIFICATIONMAPPINGS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportWithCsvCronJob.countryMappings</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the countryMappings
	 */
	public void setCountryMappings(final Map<String,CountryModel> value)
	{
		_countryMappings = getPersistenceContext().setValue(COUNTRYMAPPINGS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportWithCsvCronJob.currencyMappings</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the currencyMappings
	 */
	public void setCurrencyMappings(final Map<String,CurrencyModel> value)
	{
		_currencyMappings = getPersistenceContext().setValue(CURRENCYMAPPINGS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportWithCsvCronJob.defaultCurrency</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the defaultCurrency
	 */
	public void setDefaultCurrency(final CurrencyModel value)
	{
		_defaultCurrency = getPersistenceContext().setValue(DEFAULTCURRENCY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportWithCsvCronJob.defaultCurrencyIsoCode</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the defaultCurrencyIsoCode
	 */
	public void setDefaultCurrencyIsoCode(final String value)
	{
		_defaultCurrencyIsoCode = getPersistenceContext().setValue(DEFAULTCURRENCYISOCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportWithCsvCronJob.impexScriptMedia</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the impexScriptMedia
	 */
	public void setImpexScriptMedia(final BMECatImpExScriptMediaModel value)
	{
		_impexScriptMedia = getPersistenceContext().setValue(IMPEXSCRIPTMEDIA, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportWithCsvCronJob.importAgreement</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the importAgreement
	 */
	public void setImportAgreement(final Boolean value)
	{
		_importAgreement = getPersistenceContext().setValue(IMPORTAGREEMENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportWithCsvCronJob.importBuyer</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the importBuyer
	 */
	public void setImportBuyer(final Boolean value)
	{
		_importBuyer = getPersistenceContext().setValue(IMPORTBUYER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportWithCsvCronJob.importLanguage</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the importLanguage
	 */
	public void setImportLanguage(final LanguageModel value)
	{
		_importLanguage = getPersistenceContext().setValue(IMPORTLANGUAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportWithCsvCronJob.importLanguageIsoCode</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the importLanguageIsoCode
	 */
	public void setImportLanguageIsoCode(final String value)
	{
		_importLanguageIsoCode = getPersistenceContext().setValue(IMPORTLANGUAGEISOCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportWithCsvCronJob.importSupplier</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the importSupplier
	 */
	public void setImportSupplier(final Boolean value)
	{
		_importSupplier = getPersistenceContext().setValue(IMPORTSUPPLIER, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>CronJob.job</code> attribute defined at extension <code>processing</code> and redeclared at extension <code>bmecat</code>. Can only be used at creation of model - before first save. Will only accept values of type {@link de.hybris.platform.bmecat.model.BMECatImportWithCsvJobModel}.  
	 *  
	 * @param value the job
	 */
	@Override
	public void setJob(final JobModel value)
	{
		super.setJob(value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportWithCsvCronJob.keywordCount</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the keywordCount
	 */
	public void setKeywordCount(final Integer value)
	{
		_keywordCount = getPersistenceContext().setValue(KEYWORDCOUNT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportWithCsvCronJob.keywordType</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the keywordType
	 */
	public void setKeywordType(final ComposedTypeModel value)
	{
		_keywordType = getPersistenceContext().setValue(KEYWORDTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportWithCsvCronJob.localizationUpdate</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the localizationUpdate
	 */
	public void setLocalizationUpdate(final Boolean value)
	{
		_localizationUpdate = getPersistenceContext().setValue(LOCALIZATIONUPDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportWithCsvCronJob.mimeCount</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the mimeCount
	 */
	public void setMimeCount(final Integer value)
	{
		_mimeCount = getPersistenceContext().setValue(MIMECOUNT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportWithCsvCronJob.previousUpdateVersion</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the previousUpdateVersion
	 */
	public void setPreviousUpdateVersion(final Integer value)
	{
		_previousUpdateVersion = getPersistenceContext().setValue(PREVIOUSUPDATEVERSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportWithCsvCronJob.priceTypeMappings</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the priceTypeMappings
	 */
	public void setPriceTypeMappings(final Map<String,BMECatPriceTypeEnum> value)
	{
		_priceTypeMappings = getPersistenceContext().setValue(PRICETYPEMAPPINGS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportWithCsvCronJob.taxTypeMappings</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the taxTypeMappings
	 */
	public void setTaxTypeMappings(final Map<String,ProductTaxGroup> value)
	{
		_taxTypeMappings = getPersistenceContext().setValue(TAXTYPEMAPPINGS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportWithCsvCronJob.territories</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the territories
	 */
	public void setTerritories(final Collection<String> value)
	{
		_territories = getPersistenceContext().setValue(TERRITORIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportWithCsvCronJob.transactionMode</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the transactionMode
	 */
	public void setTransactionMode(final TransactionModeEnum value)
	{
		_transactionMode = getPersistenceContext().setValue(TRANSACTIONMODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportWithCsvCronJob.unitMappings</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the unitMappings
	 */
	public void setUnitMappings(final Map<String,UnitModel> value)
	{
		_unitMappings = getPersistenceContext().setValue(UNITMAPPINGS, value);
	}
	
}
