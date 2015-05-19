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

import de.hybris.platform.bmecat.enums.BMECatMimePurposeEnum;
import de.hybris.platform.bmecat.enums.BMECatPriceTypeEnum;
import de.hybris.platform.bmecat.enums.HybrisMimePurposeEnum;
import de.hybris.platform.bmecat.enums.TransactionModeEnum;
import de.hybris.platform.bmecat.model.BMECatExportJobModel;
import de.hybris.platform.bmecat.model.BMECatJobMediaModel;
import de.hybris.platform.bmecat.model.BMECatMediaProcessCronJobModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.catalog.model.classification.ClassificationSystemVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.cronjob.model.JobModel;
import de.hybris.platform.europe1.enums.UserPriceGroup;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

/**
 * Generated model class for type BMECatExportCronJob first defined at extension bmecat.
 */
@SuppressWarnings("all")
public class BMECatExportCronJobModel extends BMECatMediaProcessCronJobModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BMECatExportCronJob";
	
	/**<i>Generated relation code constant for relation <code>JobCronJobRelation</code> defining source attribute <code>job</code> in extension <code>processing</code>.</i>*/
	public final static String _JOBCRONJOBRELATION = "JobCronJobRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatExportCronJob.exportCatalogVersion</code> attribute defined at extension <code>bmecat</code>. */
	public static final String EXPORTCATALOGVERSION = "exportCatalogVersion";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatExportCronJob.exportLanguages</code> attribute defined at extension <code>bmecat</code>. */
	public static final String EXPORTLANGUAGES = "exportLanguages";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatExportCronJob.transactionMode</code> attribute defined at extension <code>bmecat</code>. */
	public static final String TRANSACTIONMODE = "transactionMode";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatExportCronJob.classificationSystemVersions</code> attribute defined at extension <code>bmecat</code>. */
	public static final String CLASSIFICATIONSYSTEMVERSIONS = "classificationSystemVersions";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatExportCronJob.ClassificationSystemNumberFormat</code> attribute defined at extension <code>bmecat</code>. */
	public static final String CLASSIFICATIONSYSTEMNUMBERFORMAT = "ClassificationSystemNumberFormat";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatExportCronJob.Hybris2BMECatMimePurposeMapping</code> attribute defined at extension <code>bmecat</code>. */
	public static final String HYBRIS2BMECATMIMEPURPOSEMAPPING = "Hybris2BMECatMimePurposeMapping";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatExportCronJob.exportedMedias</code> attribute defined at extension <code>bmecat</code>. */
	public static final String EXPORTEDMEDIAS = "exportedMedias";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatExportCronJob.priceTypeMapping</code> attribute defined at extension <code>bmecat</code>. */
	public static final String PRICETYPEMAPPING = "priceTypeMapping";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatExportCronJob.udpNet</code> attribute defined at extension <code>bmecat</code>. */
	public static final String UDPNET = "udpNet";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatExportCronJob.referenceDate</code> attribute defined at extension <code>bmecat</code>. */
	public static final String REFERENCEDATE = "referenceDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatExportCronJob.referenceCustomer</code> attribute defined at extension <code>bmecat</code>. */
	public static final String REFERENCECUSTOMER = "referenceCustomer";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatExportCronJob.suppressProductsWithoutPrice</code> attribute defined at extension <code>bmecat</code>. */
	public static final String SUPPRESSPRODUCTSWITHOUTPRICE = "suppressProductsWithoutPrice";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatExportCronJob.suppressEmptyCategories</code> attribute defined at extension <code>bmecat</code>. */
	public static final String SUPPRESSEMPTYCATEGORIES = "suppressEmptyCategories";
	
	
	/** <i>Generated variable</i> - Variable of <code>BMECatExportCronJob.exportCatalogVersion</code> attribute defined at extension <code>bmecat</code>. */
	private CatalogVersionModel _exportCatalogVersion;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatExportCronJob.exportLanguages</code> attribute defined at extension <code>bmecat</code>. */
	private Collection<LanguageModel> _exportLanguages;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatExportCronJob.transactionMode</code> attribute defined at extension <code>bmecat</code>. */
	private TransactionModeEnum _transactionMode;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatExportCronJob.classificationSystemVersions</code> attribute defined at extension <code>bmecat</code>. */
	private Collection<ClassificationSystemVersionModel> _classificationSystemVersions;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatExportCronJob.ClassificationSystemNumberFormat</code> attribute defined at extension <code>bmecat</code>. */
	private String _ClassificationSystemNumberFormat;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatExportCronJob.Hybris2BMECatMimePurposeMapping</code> attribute defined at extension <code>bmecat</code>. */
	private Map<HybrisMimePurposeEnum,BMECatMimePurposeEnum> _Hybris2BMECatMimePurposeMapping;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatExportCronJob.exportedMedias</code> attribute defined at extension <code>bmecat</code>. */
	private BMECatJobMediaModel _exportedMedias;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatExportCronJob.priceTypeMapping</code> attribute defined at extension <code>bmecat</code>. */
	private Map<BMECatPriceTypeEnum,UserPriceGroup> _priceTypeMapping;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatExportCronJob.udpNet</code> attribute defined at extension <code>bmecat</code>. */
	private Boolean _udpNet;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatExportCronJob.referenceDate</code> attribute defined at extension <code>bmecat</code>. */
	private Date _referenceDate;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatExportCronJob.referenceCustomer</code> attribute defined at extension <code>bmecat</code>. */
	private CustomerModel _referenceCustomer;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatExportCronJob.suppressProductsWithoutPrice</code> attribute defined at extension <code>bmecat</code>. */
	private Boolean _suppressProductsWithoutPrice;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatExportCronJob.suppressEmptyCategories</code> attribute defined at extension <code>bmecat</code>. */
	private Boolean _suppressEmptyCategories;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BMECatExportCronJobModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BMECatExportCronJobModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _exportCatalogVersion initial attribute declared by type <code>BMECatExportCronJob</code> at extension <code>bmecat</code>
	 * @param _exportLanguages initial attribute declared by type <code>BMECatExportCronJob</code> at extension <code>bmecat</code>
	 * @param _job initial attribute declared by type <code>BMECatExportCronJob</code> at extension <code>bmecat</code>
	 * @param _udpNet initial attribute declared by type <code>BMECatExportCronJob</code> at extension <code>bmecat</code>
	 */
	@Deprecated
	public BMECatExportCronJobModel(final CatalogVersionModel _exportCatalogVersion, final Collection<LanguageModel> _exportLanguages, final BMECatExportJobModel _job, final Boolean _udpNet)
	{
		super();
		setExportCatalogVersion(_exportCatalogVersion);
		setExportLanguages(_exportLanguages);
		setJob(_job);
		setUdpNet(_udpNet);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _exportCatalogVersion initial attribute declared by type <code>BMECatExportCronJob</code> at extension <code>bmecat</code>
	 * @param _exportLanguages initial attribute declared by type <code>BMECatExportCronJob</code> at extension <code>bmecat</code>
	 * @param _job initial attribute declared by type <code>BMECatExportCronJob</code> at extension <code>bmecat</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _udpNet initial attribute declared by type <code>BMECatExportCronJob</code> at extension <code>bmecat</code>
	 */
	@Deprecated
	public BMECatExportCronJobModel(final CatalogVersionModel _exportCatalogVersion, final Collection<LanguageModel> _exportLanguages, final BMECatExportJobModel _job, final ItemModel _owner, final Boolean _udpNet)
	{
		super();
		setExportCatalogVersion(_exportCatalogVersion);
		setExportLanguages(_exportLanguages);
		setJob(_job);
		setOwner(_owner);
		setUdpNet(_udpNet);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatExportCronJob.ClassificationSystemNumberFormat</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the ClassificationSystemNumberFormat
	 */
	public String getClassificationSystemNumberFormat()
	{
		if (this._ClassificationSystemNumberFormat!=null)
		{
			return _ClassificationSystemNumberFormat;
		}
		return _ClassificationSystemNumberFormat = getPersistenceContext().getValue(CLASSIFICATIONSYSTEMNUMBERFORMAT, _ClassificationSystemNumberFormat);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatExportCronJob.classificationSystemVersions</code> attribute defined at extension <code>bmecat</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the classificationSystemVersions
	 */
	public Collection<ClassificationSystemVersionModel> getClassificationSystemVersions()
	{
		if (this._classificationSystemVersions!=null)
		{
			return _classificationSystemVersions;
		}
		return _classificationSystemVersions = getPersistenceContext().getValue(CLASSIFICATIONSYSTEMVERSIONS, _classificationSystemVersions);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatExportCronJob.exportCatalogVersion</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the exportCatalogVersion - CatalogVersion to export
	 */
	public CatalogVersionModel getExportCatalogVersion()
	{
		if (this._exportCatalogVersion!=null)
		{
			return _exportCatalogVersion;
		}
		return _exportCatalogVersion = getPersistenceContext().getValue(EXPORTCATALOGVERSION, _exportCatalogVersion);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatExportCronJob.exportedMedias</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the exportedMedias
	 */
	public BMECatJobMediaModel getExportedMedias()
	{
		if (this._exportedMedias!=null)
		{
			return _exportedMedias;
		}
		return _exportedMedias = getPersistenceContext().getValue(EXPORTEDMEDIAS, _exportedMedias);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatExportCronJob.exportLanguages</code> attribute defined at extension <code>bmecat</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the exportLanguages - Languages to export
	 */
	public Collection<LanguageModel> getExportLanguages()
	{
		if (this._exportLanguages!=null)
		{
			return _exportLanguages;
		}
		return _exportLanguages = getPersistenceContext().getValue(EXPORTLANGUAGES, _exportLanguages);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatExportCronJob.Hybris2BMECatMimePurposeMapping</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the Hybris2BMECatMimePurposeMapping
	 */
	public Map<HybrisMimePurposeEnum,BMECatMimePurposeEnum> getHybris2BMECatMimePurposeMapping()
	{
		if (this._Hybris2BMECatMimePurposeMapping!=null)
		{
			return _Hybris2BMECatMimePurposeMapping;
		}
		return _Hybris2BMECatMimePurposeMapping = getPersistenceContext().getValue(HYBRIS2BMECATMIMEPURPOSEMAPPING, _Hybris2BMECatMimePurposeMapping);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.job</code> attribute defined at extension <code>processing</code> and redeclared at extension <code>bmecat</code>. 
	 * @return the job
	 */
	@Override
	public BMECatExportJobModel getJob()
	{
		return (BMECatExportJobModel) super.getJob();
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatExportCronJob.priceTypeMapping</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the priceTypeMapping
	 */
	public Map<BMECatPriceTypeEnum,UserPriceGroup> getPriceTypeMapping()
	{
		if (this._priceTypeMapping!=null)
		{
			return _priceTypeMapping;
		}
		return _priceTypeMapping = getPersistenceContext().getValue(PRICETYPEMAPPING, _priceTypeMapping);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatExportCronJob.referenceCustomer</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the referenceCustomer
	 */
	public CustomerModel getReferenceCustomer()
	{
		if (this._referenceCustomer!=null)
		{
			return _referenceCustomer;
		}
		return _referenceCustomer = getPersistenceContext().getValue(REFERENCECUSTOMER, _referenceCustomer);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatExportCronJob.referenceDate</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the referenceDate
	 */
	public Date getReferenceDate()
	{
		if (this._referenceDate!=null)
		{
			return _referenceDate;
		}
		return _referenceDate = getPersistenceContext().getValue(REFERENCEDATE, _referenceDate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatExportCronJob.suppressEmptyCategories</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the suppressEmptyCategories
	 */
	public Boolean getSuppressEmptyCategories()
	{
		if (this._suppressEmptyCategories!=null)
		{
			return _suppressEmptyCategories;
		}
		return _suppressEmptyCategories = getPersistenceContext().getValue(SUPPRESSEMPTYCATEGORIES, _suppressEmptyCategories);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatExportCronJob.suppressProductsWithoutPrice</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the suppressProductsWithoutPrice
	 */
	public Boolean getSuppressProductsWithoutPrice()
	{
		if (this._suppressProductsWithoutPrice!=null)
		{
			return _suppressProductsWithoutPrice;
		}
		return _suppressProductsWithoutPrice = getPersistenceContext().getValue(SUPPRESSPRODUCTSWITHOUTPRICE, _suppressProductsWithoutPrice);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatExportCronJob.transactionMode</code> attribute defined at extension <code>bmecat</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>BMECatExportCronJob.udpNet</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the udpNet
	 */
	public Boolean getUdpNet()
	{
		if (this._udpNet!=null)
		{
			return _udpNet;
		}
		return _udpNet = getPersistenceContext().getValue(UDPNET, _udpNet);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatExportCronJob.ClassificationSystemNumberFormat</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the ClassificationSystemNumberFormat
	 */
	public void setClassificationSystemNumberFormat(final String value)
	{
		_ClassificationSystemNumberFormat = getPersistenceContext().setValue(CLASSIFICATIONSYSTEMNUMBERFORMAT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatExportCronJob.classificationSystemVersions</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the classificationSystemVersions
	 */
	public void setClassificationSystemVersions(final Collection<ClassificationSystemVersionModel> value)
	{
		_classificationSystemVersions = getPersistenceContext().setValue(CLASSIFICATIONSYSTEMVERSIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatExportCronJob.exportCatalogVersion</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the exportCatalogVersion - CatalogVersion to export
	 */
	public void setExportCatalogVersion(final CatalogVersionModel value)
	{
		_exportCatalogVersion = getPersistenceContext().setValue(EXPORTCATALOGVERSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatExportCronJob.exportedMedias</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the exportedMedias
	 */
	public void setExportedMedias(final BMECatJobMediaModel value)
	{
		_exportedMedias = getPersistenceContext().setValue(EXPORTEDMEDIAS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatExportCronJob.exportLanguages</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the exportLanguages - Languages to export
	 */
	public void setExportLanguages(final Collection<LanguageModel> value)
	{
		_exportLanguages = getPersistenceContext().setValue(EXPORTLANGUAGES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatExportCronJob.Hybris2BMECatMimePurposeMapping</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the Hybris2BMECatMimePurposeMapping
	 */
	public void setHybris2BMECatMimePurposeMapping(final Map<HybrisMimePurposeEnum,BMECatMimePurposeEnum> value)
	{
		_Hybris2BMECatMimePurposeMapping = getPersistenceContext().setValue(HYBRIS2BMECATMIMEPURPOSEMAPPING, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>CronJob.job</code> attribute defined at extension <code>processing</code> and redeclared at extension <code>bmecat</code>. Can only be used at creation of model - before first save. Will only accept values of type {@link de.hybris.platform.bmecat.model.BMECatExportJobModel}.  
	 *  
	 * @param value the job
	 */
	@Override
	public void setJob(final JobModel value)
	{
		super.setJob(value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatExportCronJob.priceTypeMapping</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the priceTypeMapping
	 */
	public void setPriceTypeMapping(final Map<BMECatPriceTypeEnum,UserPriceGroup> value)
	{
		_priceTypeMapping = getPersistenceContext().setValue(PRICETYPEMAPPING, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatExportCronJob.referenceCustomer</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the referenceCustomer
	 */
	public void setReferenceCustomer(final CustomerModel value)
	{
		_referenceCustomer = getPersistenceContext().setValue(REFERENCECUSTOMER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatExportCronJob.referenceDate</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the referenceDate
	 */
	public void setReferenceDate(final Date value)
	{
		_referenceDate = getPersistenceContext().setValue(REFERENCEDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatExportCronJob.suppressEmptyCategories</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the suppressEmptyCategories
	 */
	public void setSuppressEmptyCategories(final Boolean value)
	{
		_suppressEmptyCategories = getPersistenceContext().setValue(SUPPRESSEMPTYCATEGORIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatExportCronJob.suppressProductsWithoutPrice</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the suppressProductsWithoutPrice
	 */
	public void setSuppressProductsWithoutPrice(final Boolean value)
	{
		_suppressProductsWithoutPrice = getPersistenceContext().setValue(SUPPRESSPRODUCTSWITHOUTPRICE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatExportCronJob.transactionMode</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the transactionMode
	 */
	public void setTransactionMode(final TransactionModeEnum value)
	{
		_transactionMode = getPersistenceContext().setValue(TRANSACTIONMODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatExportCronJob.udpNet</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the udpNet
	 */
	public void setUdpNet(final Boolean value)
	{
		_udpNet = getPersistenceContext().setValue(UDPNET, value);
	}
	
}
