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

import de.hybris.platform.bmecat.enums.AddressAttributeEnum;
import de.hybris.platform.bmecat.enums.AgreementAttributeEnum;
import de.hybris.platform.bmecat.enums.CatalogAttributeEnum;
import de.hybris.platform.bmecat.enums.CatalogVersionAttributeEnum;
import de.hybris.platform.bmecat.enums.CompanyAttributeEnum;
import de.hybris.platform.bmecat.model.BMECatImportStepModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.type.AttributeDescriptorModel;
import de.hybris.platform.core.model.type.ComposedTypeModel;
import de.hybris.platform.cronjob.model.BatchJobModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Map;

/**
 * Generated model class for type BMECatCatalogStep first defined at extension bmecat.
 */
@SuppressWarnings("all")
public class BMECatCatalogStepModel extends BMECatImportStepModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BMECatCatalogStep";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatCatalogStep.catalogType</code> attribute defined at extension <code>bmecat</code>. */
	public static final String CATALOGTYPE = "catalogType";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatCatalogStep.catalogAttributeMapping</code> attribute defined at extension <code>bmecat</code>. */
	public static final String CATALOGATTRIBUTEMAPPING = "catalogAttributeMapping";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatCatalogStep.catalogVersionType</code> attribute defined at extension <code>bmecat</code>. */
	public static final String CATALOGVERSIONTYPE = "catalogVersionType";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatCatalogStep.catalogVersionAttributeMapping</code> attribute defined at extension <code>bmecat</code>. */
	public static final String CATALOGVERSIONATTRIBUTEMAPPING = "catalogVersionAttributeMapping";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatCatalogStep.buyerType</code> attribute defined at extension <code>bmecat</code>. */
	public static final String BUYERTYPE = "buyerType";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatCatalogStep.buyerAttributeMapping</code> attribute defined at extension <code>bmecat</code>. */
	public static final String BUYERATTRIBUTEMAPPING = "buyerAttributeMapping";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatCatalogStep.supplierType</code> attribute defined at extension <code>bmecat</code>. */
	public static final String SUPPLIERTYPE = "supplierType";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatCatalogStep.supplierAttributeMapping</code> attribute defined at extension <code>bmecat</code>. */
	public static final String SUPPLIERATTRIBUTEMAPPING = "supplierAttributeMapping";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatCatalogStep.addressType</code> attribute defined at extension <code>bmecat</code>. */
	public static final String ADDRESSTYPE = "addressType";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatCatalogStep.addressAttributeMapping</code> attribute defined at extension <code>bmecat</code>. */
	public static final String ADDRESSATTRIBUTEMAPPING = "addressAttributeMapping";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatCatalogStep.agreementType</code> attribute defined at extension <code>bmecat</code>. */
	public static final String AGREEMENTTYPE = "agreementType";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatCatalogStep.agreementAttributeMapping</code> attribute defined at extension <code>bmecat</code>. */
	public static final String AGREEMENTATTRIBUTEMAPPING = "agreementAttributeMapping";
	
	
	/** <i>Generated variable</i> - Variable of <code>BMECatCatalogStep.catalogType</code> attribute defined at extension <code>bmecat</code>. */
	private ComposedTypeModel _catalogType;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatCatalogStep.catalogAttributeMapping</code> attribute defined at extension <code>bmecat</code>. */
	private Map<CatalogAttributeEnum,AttributeDescriptorModel> _catalogAttributeMapping;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatCatalogStep.catalogVersionType</code> attribute defined at extension <code>bmecat</code>. */
	private ComposedTypeModel _catalogVersionType;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatCatalogStep.catalogVersionAttributeMapping</code> attribute defined at extension <code>bmecat</code>. */
	private Map<CatalogVersionAttributeEnum,AttributeDescriptorModel> _catalogVersionAttributeMapping;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatCatalogStep.buyerType</code> attribute defined at extension <code>bmecat</code>. */
	private ComposedTypeModel _buyerType;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatCatalogStep.buyerAttributeMapping</code> attribute defined at extension <code>bmecat</code>. */
	private Map<CompanyAttributeEnum,AttributeDescriptorModel> _buyerAttributeMapping;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatCatalogStep.supplierType</code> attribute defined at extension <code>bmecat</code>. */
	private ComposedTypeModel _supplierType;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatCatalogStep.supplierAttributeMapping</code> attribute defined at extension <code>bmecat</code>. */
	private Map<CompanyAttributeEnum,AttributeDescriptorModel> _supplierAttributeMapping;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatCatalogStep.addressType</code> attribute defined at extension <code>bmecat</code>. */
	private ComposedTypeModel _addressType;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatCatalogStep.addressAttributeMapping</code> attribute defined at extension <code>bmecat</code>. */
	private Map<AddressAttributeEnum,AttributeDescriptorModel> _addressAttributeMapping;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatCatalogStep.agreementType</code> attribute defined at extension <code>bmecat</code>. */
	private ComposedTypeModel _agreementType;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatCatalogStep.agreementAttributeMapping</code> attribute defined at extension <code>bmecat</code>. */
	private Map<AgreementAttributeEnum,AttributeDescriptorModel> _agreementAttributeMapping;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BMECatCatalogStepModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BMECatCatalogStepModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _batchJob initial attribute declared by type <code>Step</code> at extension <code>processing</code>
	 * @param _code initial attribute declared by type <code>Step</code> at extension <code>processing</code>
	 * @param _sequenceNumber initial attribute declared by type <code>Step</code> at extension <code>processing</code>
	 */
	@Deprecated
	public BMECatCatalogStepModel(final BatchJobModel _batchJob, final String _code, final Integer _sequenceNumber)
	{
		super();
		setBatchJob(_batchJob);
		setCode(_code);
		setSequenceNumber(_sequenceNumber);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _batchJob initial attribute declared by type <code>Step</code> at extension <code>processing</code>
	 * @param _code initial attribute declared by type <code>Step</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _sequenceNumber initial attribute declared by type <code>Step</code> at extension <code>processing</code>
	 */
	@Deprecated
	public BMECatCatalogStepModel(final BatchJobModel _batchJob, final String _code, final ItemModel _owner, final Integer _sequenceNumber)
	{
		super();
		setBatchJob(_batchJob);
		setCode(_code);
		setOwner(_owner);
		setSequenceNumber(_sequenceNumber);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatCatalogStep.addressAttributeMapping</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the addressAttributeMapping
	 */
	public Map<AddressAttributeEnum,AttributeDescriptorModel> getAddressAttributeMapping()
	{
		if (this._addressAttributeMapping!=null)
		{
			return _addressAttributeMapping;
		}
		return _addressAttributeMapping = getPersistenceContext().getValue(ADDRESSATTRIBUTEMAPPING, _addressAttributeMapping);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatCatalogStep.addressType</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the addressType
	 */
	public ComposedTypeModel getAddressType()
	{
		if (this._addressType!=null)
		{
			return _addressType;
		}
		return _addressType = getPersistenceContext().getValue(ADDRESSTYPE, _addressType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatCatalogStep.agreementAttributeMapping</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the agreementAttributeMapping
	 */
	public Map<AgreementAttributeEnum,AttributeDescriptorModel> getAgreementAttributeMapping()
	{
		if (this._agreementAttributeMapping!=null)
		{
			return _agreementAttributeMapping;
		}
		return _agreementAttributeMapping = getPersistenceContext().getValue(AGREEMENTATTRIBUTEMAPPING, _agreementAttributeMapping);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatCatalogStep.agreementType</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the agreementType
	 */
	public ComposedTypeModel getAgreementType()
	{
		if (this._agreementType!=null)
		{
			return _agreementType;
		}
		return _agreementType = getPersistenceContext().getValue(AGREEMENTTYPE, _agreementType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatCatalogStep.buyerAttributeMapping</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the buyerAttributeMapping
	 */
	public Map<CompanyAttributeEnum,AttributeDescriptorModel> getBuyerAttributeMapping()
	{
		if (this._buyerAttributeMapping!=null)
		{
			return _buyerAttributeMapping;
		}
		return _buyerAttributeMapping = getPersistenceContext().getValue(BUYERATTRIBUTEMAPPING, _buyerAttributeMapping);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatCatalogStep.buyerType</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the buyerType
	 */
	public ComposedTypeModel getBuyerType()
	{
		if (this._buyerType!=null)
		{
			return _buyerType;
		}
		return _buyerType = getPersistenceContext().getValue(BUYERTYPE, _buyerType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatCatalogStep.catalogAttributeMapping</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the catalogAttributeMapping
	 */
	public Map<CatalogAttributeEnum,AttributeDescriptorModel> getCatalogAttributeMapping()
	{
		if (this._catalogAttributeMapping!=null)
		{
			return _catalogAttributeMapping;
		}
		return _catalogAttributeMapping = getPersistenceContext().getValue(CATALOGATTRIBUTEMAPPING, _catalogAttributeMapping);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatCatalogStep.catalogType</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the catalogType
	 */
	public ComposedTypeModel getCatalogType()
	{
		if (this._catalogType!=null)
		{
			return _catalogType;
		}
		return _catalogType = getPersistenceContext().getValue(CATALOGTYPE, _catalogType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatCatalogStep.catalogVersionAttributeMapping</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the catalogVersionAttributeMapping
	 */
	public Map<CatalogVersionAttributeEnum,AttributeDescriptorModel> getCatalogVersionAttributeMapping()
	{
		if (this._catalogVersionAttributeMapping!=null)
		{
			return _catalogVersionAttributeMapping;
		}
		return _catalogVersionAttributeMapping = getPersistenceContext().getValue(CATALOGVERSIONATTRIBUTEMAPPING, _catalogVersionAttributeMapping);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatCatalogStep.catalogVersionType</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the catalogVersionType
	 */
	public ComposedTypeModel getCatalogVersionType()
	{
		if (this._catalogVersionType!=null)
		{
			return _catalogVersionType;
		}
		return _catalogVersionType = getPersistenceContext().getValue(CATALOGVERSIONTYPE, _catalogVersionType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatCatalogStep.supplierAttributeMapping</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the supplierAttributeMapping
	 */
	public Map<CompanyAttributeEnum,AttributeDescriptorModel> getSupplierAttributeMapping()
	{
		if (this._supplierAttributeMapping!=null)
		{
			return _supplierAttributeMapping;
		}
		return _supplierAttributeMapping = getPersistenceContext().getValue(SUPPLIERATTRIBUTEMAPPING, _supplierAttributeMapping);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatCatalogStep.supplierType</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the supplierType
	 */
	public ComposedTypeModel getSupplierType()
	{
		if (this._supplierType!=null)
		{
			return _supplierType;
		}
		return _supplierType = getPersistenceContext().getValue(SUPPLIERTYPE, _supplierType);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatCatalogStep.addressAttributeMapping</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the addressAttributeMapping
	 */
	public void setAddressAttributeMapping(final Map<AddressAttributeEnum,AttributeDescriptorModel> value)
	{
		_addressAttributeMapping = getPersistenceContext().setValue(ADDRESSATTRIBUTEMAPPING, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatCatalogStep.addressType</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the addressType
	 */
	public void setAddressType(final ComposedTypeModel value)
	{
		_addressType = getPersistenceContext().setValue(ADDRESSTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatCatalogStep.agreementAttributeMapping</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the agreementAttributeMapping
	 */
	public void setAgreementAttributeMapping(final Map<AgreementAttributeEnum,AttributeDescriptorModel> value)
	{
		_agreementAttributeMapping = getPersistenceContext().setValue(AGREEMENTATTRIBUTEMAPPING, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatCatalogStep.agreementType</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the agreementType
	 */
	public void setAgreementType(final ComposedTypeModel value)
	{
		_agreementType = getPersistenceContext().setValue(AGREEMENTTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatCatalogStep.buyerAttributeMapping</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the buyerAttributeMapping
	 */
	public void setBuyerAttributeMapping(final Map<CompanyAttributeEnum,AttributeDescriptorModel> value)
	{
		_buyerAttributeMapping = getPersistenceContext().setValue(BUYERATTRIBUTEMAPPING, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatCatalogStep.buyerType</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the buyerType
	 */
	public void setBuyerType(final ComposedTypeModel value)
	{
		_buyerType = getPersistenceContext().setValue(BUYERTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatCatalogStep.catalogAttributeMapping</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the catalogAttributeMapping
	 */
	public void setCatalogAttributeMapping(final Map<CatalogAttributeEnum,AttributeDescriptorModel> value)
	{
		_catalogAttributeMapping = getPersistenceContext().setValue(CATALOGATTRIBUTEMAPPING, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatCatalogStep.catalogType</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the catalogType
	 */
	public void setCatalogType(final ComposedTypeModel value)
	{
		_catalogType = getPersistenceContext().setValue(CATALOGTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatCatalogStep.catalogVersionAttributeMapping</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the catalogVersionAttributeMapping
	 */
	public void setCatalogVersionAttributeMapping(final Map<CatalogVersionAttributeEnum,AttributeDescriptorModel> value)
	{
		_catalogVersionAttributeMapping = getPersistenceContext().setValue(CATALOGVERSIONATTRIBUTEMAPPING, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatCatalogStep.catalogVersionType</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the catalogVersionType
	 */
	public void setCatalogVersionType(final ComposedTypeModel value)
	{
		_catalogVersionType = getPersistenceContext().setValue(CATALOGVERSIONTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatCatalogStep.supplierAttributeMapping</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the supplierAttributeMapping
	 */
	public void setSupplierAttributeMapping(final Map<CompanyAttributeEnum,AttributeDescriptorModel> value)
	{
		_supplierAttributeMapping = getPersistenceContext().setValue(SUPPLIERATTRIBUTEMAPPING, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatCatalogStep.supplierType</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the supplierType
	 */
	public void setSupplierType(final ComposedTypeModel value)
	{
		_supplierType = getPersistenceContext().setValue(SUPPLIERTYPE, value);
	}
	
}
