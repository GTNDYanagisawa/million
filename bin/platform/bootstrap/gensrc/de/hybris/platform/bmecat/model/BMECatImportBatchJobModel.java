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

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.product.UnitModel;
import de.hybris.platform.cronjob.model.BatchJobModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Map;

/**
 * Generated model class for type BMECatImportBatchJob first defined at extension bmecat.
 */
@SuppressWarnings("all")
public class BMECatImportBatchJobModel extends BatchJobModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BMECatImportBatchJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportBatchJob.defaultCurrencyMappings</code> attribute defined at extension <code>bmecat</code>. */
	public static final String DEFAULTCURRENCYMAPPINGS = "defaultCurrencyMappings";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportBatchJob.defaultCountryMappings</code> attribute defined at extension <code>bmecat</code>. */
	public static final String DEFAULTCOUNTRYMAPPINGS = "defaultCountryMappings";
	
	/** <i>Generated constant</i> - Attribute key of <code>BMECatImportBatchJob.defaultUnitMappings</code> attribute defined at extension <code>bmecat</code>. */
	public static final String DEFAULTUNITMAPPINGS = "defaultUnitMappings";
	
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportBatchJob.defaultCurrencyMappings</code> attribute defined at extension <code>bmecat</code>. */
	private Map<String,CurrencyModel> _defaultCurrencyMappings;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportBatchJob.defaultCountryMappings</code> attribute defined at extension <code>bmecat</code>. */
	private Map<String,CountryModel> _defaultCountryMappings;
	
	/** <i>Generated variable</i> - Variable of <code>BMECatImportBatchJob.defaultUnitMappings</code> attribute defined at extension <code>bmecat</code>. */
	private Map<String,UnitModel> _defaultUnitMappings;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BMECatImportBatchJobModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BMECatImportBatchJobModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>Job</code> at extension <code>processing</code>
	 */
	@Deprecated
	public BMECatImportBatchJobModel(final String _code)
	{
		super();
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>Job</code> at extension <code>processing</code>
	 * @param _nodeID initial attribute declared by type <code>Job</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public BMECatImportBatchJobModel(final String _code, final Integer _nodeID, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setNodeID(_nodeID);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportBatchJob.defaultCountryMappings</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the defaultCountryMappings
	 */
	public Map<String,CountryModel> getDefaultCountryMappings()
	{
		if (this._defaultCountryMappings!=null)
		{
			return _defaultCountryMappings;
		}
		return _defaultCountryMappings = getPersistenceContext().getValue(DEFAULTCOUNTRYMAPPINGS, _defaultCountryMappings);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportBatchJob.defaultCurrencyMappings</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the defaultCurrencyMappings
	 */
	public Map<String,CurrencyModel> getDefaultCurrencyMappings()
	{
		if (this._defaultCurrencyMappings!=null)
		{
			return _defaultCurrencyMappings;
		}
		return _defaultCurrencyMappings = getPersistenceContext().getValue(DEFAULTCURRENCYMAPPINGS, _defaultCurrencyMappings);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BMECatImportBatchJob.defaultUnitMappings</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the defaultUnitMappings
	 */
	public Map<String,UnitModel> getDefaultUnitMappings()
	{
		if (this._defaultUnitMappings!=null)
		{
			return _defaultUnitMappings;
		}
		return _defaultUnitMappings = getPersistenceContext().getValue(DEFAULTUNITMAPPINGS, _defaultUnitMappings);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportBatchJob.defaultCountryMappings</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the defaultCountryMappings
	 */
	public void setDefaultCountryMappings(final Map<String,CountryModel> value)
	{
		_defaultCountryMappings = getPersistenceContext().setValue(DEFAULTCOUNTRYMAPPINGS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportBatchJob.defaultCurrencyMappings</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the defaultCurrencyMappings
	 */
	public void setDefaultCurrencyMappings(final Map<String,CurrencyModel> value)
	{
		_defaultCurrencyMappings = getPersistenceContext().setValue(DEFAULTCURRENCYMAPPINGS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BMECatImportBatchJob.defaultUnitMappings</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the defaultUnitMappings
	 */
	public void setDefaultUnitMappings(final Map<String,UnitModel> value)
	{
		_defaultUnitMappings = getPersistenceContext().setValue(DEFAULTUNITMAPPINGS, value);
	}
	
}
