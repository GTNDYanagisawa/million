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
package de.hybris.platform.mobileservices.model.text;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.mobileservices.enums.EnginesType;
import de.hybris.platform.mobileservices.enums.MobileActiveStateType;
import de.hybris.platform.mobileservices.model.text.MobileAggregatorParameterModel;
import de.hybris.platform.mobileservices.model.text.MobileShortcodeModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type MobileAggregator first defined at extension mobileservices.
 */
@SuppressWarnings("all")
public class MobileAggregatorModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "MobileAggregator";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileAggregator.code</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileAggregator.engine</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String ENGINE = "engine";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileAggregator.maxSendingRetries</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String MAXSENDINGRETRIES = "maxSendingRetries";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileAggregator.sendingRetryInterval</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String SENDINGRETRYINTERVAL = "sendingRetryInterval";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileAggregator.available</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String AVAILABLE = "available";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileAggregator.state</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String STATE = "state";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileAggregator.parameters</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String PARAMETERS = "parameters";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileAggregator.shortcodes</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String SHORTCODES = "shortcodes";
	
	
	/** <i>Generated variable</i> - Variable of <code>MobileAggregator.code</code> attribute defined at extension <code>mobileservices</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>MobileAggregator.engine</code> attribute defined at extension <code>mobileservices</code>. */
	private EnginesType _engine;
	
	/** <i>Generated variable</i> - Variable of <code>MobileAggregator.maxSendingRetries</code> attribute defined at extension <code>mobileservices</code>. */
	private Integer _maxSendingRetries;
	
	/** <i>Generated variable</i> - Variable of <code>MobileAggregator.sendingRetryInterval</code> attribute defined at extension <code>mobileservices</code>. */
	private Integer _sendingRetryInterval;
	
	/** <i>Generated variable</i> - Variable of <code>MobileAggregator.available</code> attribute defined at extension <code>mobileservices</code>. */
	private Boolean _available;
	
	/** <i>Generated variable</i> - Variable of <code>MobileAggregator.state</code> attribute defined at extension <code>mobileservices</code>. */
	private MobileActiveStateType _state;
	
	/** <i>Generated variable</i> - Variable of <code>MobileAggregator.parameters</code> attribute defined at extension <code>mobileservices</code>. */
	private Collection<MobileAggregatorParameterModel> _parameters;
	
	/** <i>Generated variable</i> - Variable of <code>MobileAggregator.shortcodes</code> attribute defined at extension <code>mobileservices</code>. */
	private Collection<MobileShortcodeModel> _shortcodes;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public MobileAggregatorModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public MobileAggregatorModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>MobileAggregator</code> at extension <code>mobileservices</code>
	 * @param _engine initial attribute declared by type <code>MobileAggregator</code> at extension <code>mobileservices</code>
	 */
	@Deprecated
	public MobileAggregatorModel(final String _code, final EnginesType _engine)
	{
		super();
		setCode(_code);
		setEngine(_engine);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>MobileAggregator</code> at extension <code>mobileservices</code>
	 * @param _engine initial attribute declared by type <code>MobileAggregator</code> at extension <code>mobileservices</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public MobileAggregatorModel(final String _code, final EnginesType _engine, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setEngine(_engine);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileAggregator.available</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the available
	 */
	public Boolean getAvailable()
	{
		if (this._available!=null)
		{
			return _available;
		}
		return _available = getPersistenceContext().getValue(AVAILABLE, _available);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileAggregator.code</code> attribute defined at extension <code>mobileservices</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>MobileAggregator.engine</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the engine
	 */
	public EnginesType getEngine()
	{
		if (this._engine!=null)
		{
			return _engine;
		}
		return _engine = getPersistenceContext().getValue(ENGINE, _engine);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileAggregator.maxSendingRetries</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the maxSendingRetries
	 */
	public Integer getMaxSendingRetries()
	{
		if (this._maxSendingRetries!=null)
		{
			return _maxSendingRetries;
		}
		return _maxSendingRetries = getPersistenceContext().getValue(MAXSENDINGRETRIES, _maxSendingRetries);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileAggregator.parameters</code> attribute defined at extension <code>mobileservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the parameters
	 */
	public Collection<MobileAggregatorParameterModel> getParameters()
	{
		if (this._parameters!=null)
		{
			return _parameters;
		}
		return _parameters = getPersistenceContext().getValue(PARAMETERS, _parameters);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileAggregator.sendingRetryInterval</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the sendingRetryInterval
	 */
	public Integer getSendingRetryInterval()
	{
		if (this._sendingRetryInterval!=null)
		{
			return _sendingRetryInterval;
		}
		return _sendingRetryInterval = getPersistenceContext().getValue(SENDINGRETRYINTERVAL, _sendingRetryInterval);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileAggregator.shortcodes</code> attribute defined at extension <code>mobileservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the shortcodes
	 */
	public Collection<MobileShortcodeModel> getShortcodes()
	{
		if (this._shortcodes!=null)
		{
			return _shortcodes;
		}
		return _shortcodes = getPersistenceContext().getValue(SHORTCODES, _shortcodes);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileAggregator.state</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the state
	 */
	public MobileActiveStateType getState()
	{
		if (this._state!=null)
		{
			return _state;
		}
		return _state = getPersistenceContext().getValue(STATE, _state);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileAggregator.code</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>MobileAggregator.engine</code> attribute defined at extension <code>mobileservices</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the engine
	 */
	public void setEngine(final EnginesType value)
	{
		_engine = getPersistenceContext().setValue(ENGINE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileAggregator.maxSendingRetries</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the maxSendingRetries
	 */
	public void setMaxSendingRetries(final Integer value)
	{
		_maxSendingRetries = getPersistenceContext().setValue(MAXSENDINGRETRIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileAggregator.parameters</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the parameters
	 */
	public void setParameters(final Collection<MobileAggregatorParameterModel> value)
	{
		_parameters = getPersistenceContext().setValue(PARAMETERS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileAggregator.sendingRetryInterval</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the sendingRetryInterval
	 */
	public void setSendingRetryInterval(final Integer value)
	{
		_sendingRetryInterval = getPersistenceContext().setValue(SENDINGRETRYINTERVAL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileAggregator.shortcodes</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the shortcodes
	 */
	public void setShortcodes(final Collection<MobileShortcodeModel> value)
	{
		_shortcodes = getPersistenceContext().setValue(SHORTCODES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileAggregator.state</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the state
	 */
	public void setState(final MobileActiveStateType value)
	{
		_state = getPersistenceContext().setValue(STATE, value);
	}
	
}
