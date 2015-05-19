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
package de.hybris.platform.btg.model;

import de.hybris.platform.basecommerce.enums.IntervalResolution;
import de.hybris.platform.btg.enums.BTGRuleType;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.type.ComposedTypeModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Map;

/**
 * Generated model class for type BTGConfig first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGConfigModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGConfig";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGConfig.defaultCatalogVersion</code> attribute defined at extension <code>btg</code>. */
	public static final String DEFAULTCATALOGVERSION = "defaultCatalogVersion";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGConfig.defaultTimeUnit</code> attribute defined at extension <code>btg</code>. */
	public static final String DEFAULTTIMEUNIT = "defaultTimeUnit";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGConfig.usedRuleTypes</code> attribute defined at extension <code>btg</code>. */
	public static final String USEDRULETYPES = "usedRuleTypes";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGConfig.operandMapping</code> attribute defined at extension <code>btg</code>. */
	public static final String OPERANDMAPPING = "operandMapping";
	
	
	/** <i>Generated variable</i> - Variable of <code>BTGConfig.defaultCatalogVersion</code> attribute defined at extension <code>btg</code>. */
	private CatalogVersionModel _defaultCatalogVersion;
	
	/** <i>Generated variable</i> - Variable of <code>BTGConfig.defaultTimeUnit</code> attribute defined at extension <code>btg</code>. */
	private IntervalResolution _defaultTimeUnit;
	
	/** <i>Generated variable</i> - Variable of <code>BTGConfig.usedRuleTypes</code> attribute defined at extension <code>btg</code>. */
	private Collection<BTGRuleType> _usedRuleTypes;
	
	/** <i>Generated variable</i> - Variable of <code>BTGConfig.operandMapping</code> attribute defined at extension <code>btg</code>. */
	private Map<BTGRuleType,Collection<ComposedTypeModel>> _operandMapping;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGConfigModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGConfigModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _defaultTimeUnit initial attribute declared by type <code>BTGConfig</code> at extension <code>btg</code>
	 * @param _operandMapping initial attribute declared by type <code>BTGConfig</code> at extension <code>btg</code>
	 * @param _usedRuleTypes initial attribute declared by type <code>BTGConfig</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGConfigModel(final IntervalResolution _defaultTimeUnit, final Map<BTGRuleType,Collection<ComposedTypeModel>> _operandMapping, final Collection<BTGRuleType> _usedRuleTypes)
	{
		super();
		setDefaultTimeUnit(_defaultTimeUnit);
		setOperandMapping(_operandMapping);
		setUsedRuleTypes(_usedRuleTypes);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _defaultTimeUnit initial attribute declared by type <code>BTGConfig</code> at extension <code>btg</code>
	 * @param _operandMapping initial attribute declared by type <code>BTGConfig</code> at extension <code>btg</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _usedRuleTypes initial attribute declared by type <code>BTGConfig</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGConfigModel(final IntervalResolution _defaultTimeUnit, final Map<BTGRuleType,Collection<ComposedTypeModel>> _operandMapping, final ItemModel _owner, final Collection<BTGRuleType> _usedRuleTypes)
	{
		super();
		setDefaultTimeUnit(_defaultTimeUnit);
		setOperandMapping(_operandMapping);
		setOwner(_owner);
		setUsedRuleTypes(_usedRuleTypes);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGConfig.defaultCatalogVersion</code> attribute defined at extension <code>btg</code>. 
	 * @return the defaultCatalogVersion
	 */
	public CatalogVersionModel getDefaultCatalogVersion()
	{
		if (this._defaultCatalogVersion!=null)
		{
			return _defaultCatalogVersion;
		}
		return _defaultCatalogVersion = getPersistenceContext().getValue(DEFAULTCATALOGVERSION, _defaultCatalogVersion);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGConfig.defaultTimeUnit</code> attribute defined at extension <code>btg</code>. 
	 * @return the defaultTimeUnit
	 */
	public IntervalResolution getDefaultTimeUnit()
	{
		if (this._defaultTimeUnit!=null)
		{
			return _defaultTimeUnit;
		}
		return _defaultTimeUnit = getPersistenceContext().getValue(DEFAULTTIMEUNIT, _defaultTimeUnit);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGConfig.operandMapping</code> attribute defined at extension <code>btg</code>. 
	 * @return the operandMapping
	 */
	public Map<BTGRuleType,Collection<ComposedTypeModel>> getOperandMapping()
	{
		if (this._operandMapping!=null)
		{
			return _operandMapping;
		}
		return _operandMapping = getPersistenceContext().getValue(OPERANDMAPPING, _operandMapping);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGConfig.usedRuleTypes</code> attribute defined at extension <code>btg</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the usedRuleTypes
	 */
	public Collection<BTGRuleType> getUsedRuleTypes()
	{
		if (this._usedRuleTypes!=null)
		{
			return _usedRuleTypes;
		}
		return _usedRuleTypes = getPersistenceContext().getValue(USEDRULETYPES, _usedRuleTypes);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGConfig.defaultCatalogVersion</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the defaultCatalogVersion
	 */
	public void setDefaultCatalogVersion(final CatalogVersionModel value)
	{
		_defaultCatalogVersion = getPersistenceContext().setValue(DEFAULTCATALOGVERSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGConfig.defaultTimeUnit</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the defaultTimeUnit
	 */
	public void setDefaultTimeUnit(final IntervalResolution value)
	{
		_defaultTimeUnit = getPersistenceContext().setValue(DEFAULTTIMEUNIT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGConfig.operandMapping</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the operandMapping
	 */
	public void setOperandMapping(final Map<BTGRuleType,Collection<ComposedTypeModel>> value)
	{
		_operandMapping = getPersistenceContext().setValue(OPERANDMAPPING, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGConfig.usedRuleTypes</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the usedRuleTypes
	 */
	public void setUsedRuleTypes(final Collection<BTGRuleType> value)
	{
		_usedRuleTypes = getPersistenceContext().setValue(USEDRULETYPES, value);
	}
	
}
