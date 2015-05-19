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
package de.hybris.platform.print.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.print.enums.PlaceholderType;
import de.hybris.platform.print.enums.PlaceholderValueType;
import de.hybris.platform.print.model.CometConfigurationModel;
import de.hybris.platform.print.model.PlaceholderTemplateModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Locale;

/**
 * Generated model class for type Placeholder first defined at extension print.
 */
@SuppressWarnings("all")
public class PlaceholderModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "Placeholder";
	
	/**<i>Generated relation code constant for relation <code>PlaceholderTemplate2PlaceholderRelation</code> defining source attribute <code>placeholderTemplate</code> in extension <code>print</code>.</i>*/
	public final static String _PLACEHOLDERTEMPLATE2PLACEHOLDERRELATION = "PlaceholderTemplate2PlaceholderRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placeholder.qualifier</code> attribute defined at extension <code>print</code>. */
	public static final String QUALIFIER = "qualifier";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placeholder.description</code> attribute defined at extension <code>print</code>. */
	public static final String DESCRIPTION = "description";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placeholder.placeholderType</code> attribute defined at extension <code>print</code>. */
	public static final String PLACEHOLDERTYPE = "placeholderType";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placeholder.convert</code> attribute defined at extension <code>print</code>. */
	public static final String CONVERT = "convert";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placeholder.writable</code> attribute defined at extension <code>print</code>. */
	public static final String WRITABLE = "writable";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placeholder.syncable</code> attribute defined at extension <code>print</code>. */
	public static final String SYNCABLE = "syncable";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placeholder.language</code> attribute defined at extension <code>print</code>. */
	public static final String LANGUAGE = "language";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placeholder.placeholderID</code> attribute defined at extension <code>print</code>. */
	public static final String PLACEHOLDERID = "placeholderID";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placeholder.loadActionID</code> attribute defined at extension <code>print</code>. */
	public static final String LOADACTIONID = "loadActionID";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placeholder.syncActionID</code> attribute defined at extension <code>print</code>. */
	public static final String SYNCACTIONID = "syncActionID";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placeholder.storeActionID</code> attribute defined at extension <code>print</code>. */
	public static final String STOREACTIONID = "storeActionID";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placeholder.domainId</code> attribute defined at extension <code>print</code>. */
	public static final String DOMAINID = "domainId";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placeholder.domain</code> attribute defined at extension <code>print</code>. */
	public static final String DOMAIN = "domain";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placeholder.postProcessingExpression</code> attribute defined at extension <code>print</code>. */
	public static final String POSTPROCESSINGEXPRESSION = "postProcessingExpression";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placeholder.preProcessingExpression</code> attribute defined at extension <code>print</code>. */
	public static final String PREPROCESSINGEXPRESSION = "preProcessingExpression";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placeholder.classId</code> attribute defined at extension <code>print</code>. */
	public static final String CLASSID = "classId";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placeholder.valueType</code> attribute defined at extension <code>print</code>. */
	public static final String VALUETYPE = "valueType";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placeholder.placeholderTemplate</code> attribute defined at extension <code>print</code>. */
	public static final String PLACEHOLDERTEMPLATE = "placeholderTemplate";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placeholder.cometConfig</code> attribute defined at extension <code>print</code>. */
	public static final String COMETCONFIG = "cometConfig";
	
	
	/** <i>Generated variable</i> - Variable of <code>Placeholder.qualifier</code> attribute defined at extension <code>print</code>. */
	private String _qualifier;
	
	/** <i>Generated variable</i> - Variable of <code>Placeholder.placeholderType</code> attribute defined at extension <code>print</code>. */
	private PlaceholderType _placeholderType;
	
	/** <i>Generated variable</i> - Variable of <code>Placeholder.convert</code> attribute defined at extension <code>print</code>. */
	private Boolean _convert;
	
	/** <i>Generated variable</i> - Variable of <code>Placeholder.writable</code> attribute defined at extension <code>print</code>. */
	private Boolean _writable;
	
	/** <i>Generated variable</i> - Variable of <code>Placeholder.syncable</code> attribute defined at extension <code>print</code>. */
	private Boolean _syncable;
	
	/** <i>Generated variable</i> - Variable of <code>Placeholder.language</code> attribute defined at extension <code>print</code>. */
	private LanguageModel _language;
	
	/** <i>Generated variable</i> - Variable of <code>Placeholder.placeholderID</code> attribute defined at extension <code>print</code>. */
	private Integer _placeholderID;
	
	/** <i>Generated variable</i> - Variable of <code>Placeholder.loadActionID</code> attribute defined at extension <code>print</code>. */
	private Integer _loadActionID;
	
	/** <i>Generated variable</i> - Variable of <code>Placeholder.syncActionID</code> attribute defined at extension <code>print</code>. */
	private Integer _syncActionID;
	
	/** <i>Generated variable</i> - Variable of <code>Placeholder.storeActionID</code> attribute defined at extension <code>print</code>. */
	private Integer _storeActionID;
	
	/** <i>Generated variable</i> - Variable of <code>Placeholder.domainId</code> attribute defined at extension <code>print</code>. */
	private Integer _domainId;
	
	/** <i>Generated variable</i> - Variable of <code>Placeholder.domain</code> attribute defined at extension <code>print</code>. */
	private String _domain;
	
	/** <i>Generated variable</i> - Variable of <code>Placeholder.postProcessingExpression</code> attribute defined at extension <code>print</code>. */
	private String _postProcessingExpression;
	
	/** <i>Generated variable</i> - Variable of <code>Placeholder.preProcessingExpression</code> attribute defined at extension <code>print</code>. */
	private String _preProcessingExpression;
	
	/** <i>Generated variable</i> - Variable of <code>Placeholder.classId</code> attribute defined at extension <code>print</code>. */
	private Integer _classId;
	
	/** <i>Generated variable</i> - Variable of <code>Placeholder.valueType</code> attribute defined at extension <code>print</code>. */
	private PlaceholderValueType _valueType;
	
	/** <i>Generated variable</i> - Variable of <code>Placeholder.placeholderTemplate</code> attribute defined at extension <code>print</code>. */
	private PlaceholderTemplateModel _placeholderTemplate;
	
	/** <i>Generated variable</i> - Variable of <code>Placeholder.cometConfig</code> attribute defined at extension <code>print</code>. */
	private CometConfigurationModel _cometConfig;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PlaceholderModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PlaceholderModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _cometConfig initial attribute declared by type <code>Placeholder</code> at extension <code>print</code>
	 * @param _qualifier initial attribute declared by type <code>Placeholder</code> at extension <code>print</code>
	 */
	@Deprecated
	public PlaceholderModel(final CometConfigurationModel _cometConfig, final String _qualifier)
	{
		super();
		setCometConfig(_cometConfig);
		setQualifier(_qualifier);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _cometConfig initial attribute declared by type <code>Placeholder</code> at extension <code>print</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _qualifier initial attribute declared by type <code>Placeholder</code> at extension <code>print</code>
	 */
	@Deprecated
	public PlaceholderModel(final CometConfigurationModel _cometConfig, final ItemModel _owner, final String _qualifier)
	{
		super();
		setCometConfig(_cometConfig);
		setOwner(_owner);
		setQualifier(_qualifier);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placeholder.classId</code> attribute defined at extension <code>print</code>. 
	 * @return the classId
	 */
	public Integer getClassId()
	{
		if (this._classId!=null)
		{
			return _classId;
		}
		return _classId = getPersistenceContext().getValue(CLASSID, _classId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placeholder.cometConfig</code> attribute defined at extension <code>print</code>. 
	 * @return the cometConfig
	 */
	public CometConfigurationModel getCometConfig()
	{
		if (this._cometConfig!=null)
		{
			return _cometConfig;
		}
		return _cometConfig = getPersistenceContext().getValue(COMETCONFIG, _cometConfig);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placeholder.convert</code> attribute defined at extension <code>print</code>. 
	 * @return the convert
	 */
	public Boolean getConvert()
	{
		if (this._convert!=null)
		{
			return _convert;
		}
		return _convert = getPersistenceContext().getValue(CONVERT, _convert);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placeholder.description</code> attribute defined at extension <code>print</code>. 
	 * @return the description
	 */
	public String getDescription()
	{
		return getDescription(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>Placeholder.description</code> attribute defined at extension <code>print</code>. 
	 * @param loc the value localization key 
	 * @return the description
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getDescription(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(DESCRIPTION, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placeholder.domain</code> attribute defined at extension <code>print</code>. 
	 * @return the domain
	 */
	public String getDomain()
	{
		if (this._domain!=null)
		{
			return _domain;
		}
		return _domain = getPersistenceContext().getValue(DOMAIN, _domain);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placeholder.domainId</code> attribute defined at extension <code>print</code>. 
	 * @return the domainId
	 */
	public Integer getDomainId()
	{
		if (this._domainId!=null)
		{
			return _domainId;
		}
		return _domainId = getPersistenceContext().getValue(DOMAINID, _domainId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placeholder.language</code> attribute defined at extension <code>print</code>. 
	 * @return the language
	 */
	public LanguageModel getLanguage()
	{
		if (this._language!=null)
		{
			return _language;
		}
		return _language = getPersistenceContext().getValue(LANGUAGE, _language);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placeholder.loadActionID</code> attribute defined at extension <code>print</code>. 
	 * @return the loadActionID
	 */
	public Integer getLoadActionID()
	{
		if (this._loadActionID!=null)
		{
			return _loadActionID;
		}
		return _loadActionID = getPersistenceContext().getValue(LOADACTIONID, _loadActionID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placeholder.placeholderID</code> attribute defined at extension <code>print</code>. 
	 * @return the placeholderID
	 */
	public Integer getPlaceholderID()
	{
		if (this._placeholderID!=null)
		{
			return _placeholderID;
		}
		return _placeholderID = getPersistenceContext().getValue(PLACEHOLDERID, _placeholderID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placeholder.placeholderTemplate</code> attribute defined at extension <code>print</code>. 
	 * @return the placeholderTemplate
	 */
	public PlaceholderTemplateModel getPlaceholderTemplate()
	{
		if (this._placeholderTemplate!=null)
		{
			return _placeholderTemplate;
		}
		return _placeholderTemplate = getPersistenceContext().getValue(PLACEHOLDERTEMPLATE, _placeholderTemplate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placeholder.placeholderType</code> attribute defined at extension <code>print</code>. 
	 * @return the placeholderType
	 */
	public PlaceholderType getPlaceholderType()
	{
		if (this._placeholderType!=null)
		{
			return _placeholderType;
		}
		return _placeholderType = getPersistenceContext().getValue(PLACEHOLDERTYPE, _placeholderType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placeholder.postProcessingExpression</code> attribute defined at extension <code>print</code>. 
	 * @return the postProcessingExpression
	 */
	public String getPostProcessingExpression()
	{
		if (this._postProcessingExpression!=null)
		{
			return _postProcessingExpression;
		}
		return _postProcessingExpression = getPersistenceContext().getValue(POSTPROCESSINGEXPRESSION, _postProcessingExpression);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placeholder.preProcessingExpression</code> attribute defined at extension <code>print</code>. 
	 * @return the preProcessingExpression
	 */
	public String getPreProcessingExpression()
	{
		if (this._preProcessingExpression!=null)
		{
			return _preProcessingExpression;
		}
		return _preProcessingExpression = getPersistenceContext().getValue(PREPROCESSINGEXPRESSION, _preProcessingExpression);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placeholder.qualifier</code> attribute defined at extension <code>print</code>. 
	 * @return the qualifier
	 */
	public String getQualifier()
	{
		if (this._qualifier!=null)
		{
			return _qualifier;
		}
		return _qualifier = getPersistenceContext().getValue(QUALIFIER, _qualifier);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placeholder.storeActionID</code> attribute defined at extension <code>print</code>. 
	 * @return the storeActionID
	 */
	public Integer getStoreActionID()
	{
		if (this._storeActionID!=null)
		{
			return _storeActionID;
		}
		return _storeActionID = getPersistenceContext().getValue(STOREACTIONID, _storeActionID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placeholder.syncable</code> attribute defined at extension <code>print</code>. 
	 * @return the syncable
	 */
	public Boolean getSyncable()
	{
		if (this._syncable!=null)
		{
			return _syncable;
		}
		return _syncable = getPersistenceContext().getValue(SYNCABLE, _syncable);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placeholder.syncActionID</code> attribute defined at extension <code>print</code>. 
	 * @return the syncActionID
	 */
	public Integer getSyncActionID()
	{
		if (this._syncActionID!=null)
		{
			return _syncActionID;
		}
		return _syncActionID = getPersistenceContext().getValue(SYNCACTIONID, _syncActionID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placeholder.valueType</code> attribute defined at extension <code>print</code>. 
	 * @return the valueType
	 */
	public PlaceholderValueType getValueType()
	{
		if (this._valueType!=null)
		{
			return _valueType;
		}
		return _valueType = getPersistenceContext().getValue(VALUETYPE, _valueType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placeholder.writable</code> attribute defined at extension <code>print</code>. 
	 * @return the writable
	 */
	public Boolean getWritable()
	{
		if (this._writable!=null)
		{
			return _writable;
		}
		return _writable = getPersistenceContext().getValue(WRITABLE, _writable);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Placeholder.classId</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the classId
	 */
	public void setClassId(final Integer value)
	{
		_classId = getPersistenceContext().setValue(CLASSID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Placeholder.cometConfig</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the cometConfig
	 */
	public void setCometConfig(final CometConfigurationModel value)
	{
		_cometConfig = getPersistenceContext().setValue(COMETCONFIG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Placeholder.convert</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the convert
	 */
	public void setConvert(final Boolean value)
	{
		_convert = getPersistenceContext().setValue(CONVERT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Placeholder.description</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the description
	 */
	public void setDescription(final String value)
	{
		setDescription(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>Placeholder.description</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the description
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setDescription(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(DESCRIPTION, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Placeholder.domain</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the domain
	 */
	public void setDomain(final String value)
	{
		_domain = getPersistenceContext().setValue(DOMAIN, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Placeholder.domainId</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the domainId
	 */
	public void setDomainId(final Integer value)
	{
		_domainId = getPersistenceContext().setValue(DOMAINID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Placeholder.language</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the language
	 */
	public void setLanguage(final LanguageModel value)
	{
		_language = getPersistenceContext().setValue(LANGUAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Placeholder.loadActionID</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the loadActionID
	 */
	public void setLoadActionID(final Integer value)
	{
		_loadActionID = getPersistenceContext().setValue(LOADACTIONID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Placeholder.placeholderID</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the placeholderID
	 */
	public void setPlaceholderID(final Integer value)
	{
		_placeholderID = getPersistenceContext().setValue(PLACEHOLDERID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Placeholder.placeholderTemplate</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the placeholderTemplate
	 */
	public void setPlaceholderTemplate(final PlaceholderTemplateModel value)
	{
		_placeholderTemplate = getPersistenceContext().setValue(PLACEHOLDERTEMPLATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Placeholder.placeholderType</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the placeholderType
	 */
	public void setPlaceholderType(final PlaceholderType value)
	{
		_placeholderType = getPersistenceContext().setValue(PLACEHOLDERTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Placeholder.postProcessingExpression</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the postProcessingExpression
	 */
	public void setPostProcessingExpression(final String value)
	{
		_postProcessingExpression = getPersistenceContext().setValue(POSTPROCESSINGEXPRESSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Placeholder.preProcessingExpression</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the preProcessingExpression
	 */
	public void setPreProcessingExpression(final String value)
	{
		_preProcessingExpression = getPersistenceContext().setValue(PREPROCESSINGEXPRESSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>Placeholder.qualifier</code> attribute defined at extension <code>print</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the qualifier
	 */
	public void setQualifier(final String value)
	{
		_qualifier = getPersistenceContext().setValue(QUALIFIER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Placeholder.storeActionID</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the storeActionID
	 */
	public void setStoreActionID(final Integer value)
	{
		_storeActionID = getPersistenceContext().setValue(STOREACTIONID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Placeholder.syncable</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the syncable
	 */
	public void setSyncable(final Boolean value)
	{
		_syncable = getPersistenceContext().setValue(SYNCABLE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Placeholder.syncActionID</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the syncActionID
	 */
	public void setSyncActionID(final Integer value)
	{
		_syncActionID = getPersistenceContext().setValue(SYNCACTIONID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Placeholder.valueType</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the valueType
	 */
	public void setValueType(final PlaceholderValueType value)
	{
		_valueType = getPersistenceContext().setValue(VALUETYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Placeholder.writable</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the writable
	 */
	public void setWritable(final Boolean value)
	{
		_writable = getPersistenceContext().setValue(WRITABLE, value);
	}
	
}
