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

import de.hybris.platform.btg.enums.BTGResultScope;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type BTGAbstractResult first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGAbstractResultModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGAbstractResult";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGAbstractResult.fulfilled</code> attribute defined at extension <code>btg</code>. */
	public static final String FULFILLED = "fulfilled";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGAbstractResult.forced</code> attribute defined at extension <code>btg</code>. */
	public static final String FORCED = "forced";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGAbstractResult.invalidated</code> attribute defined at extension <code>btg</code>. */
	public static final String INVALIDATED = "invalidated";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGAbstractResult.resultScope</code> attribute defined at extension <code>btg</code>. */
	public static final String RESULTSCOPE = "resultScope";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGAbstractResult.sessionId</code> attribute defined at extension <code>btg</code>. */
	public static final String SESSIONID = "sessionId";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGAbstractResult.sequence</code> attribute defined at extension <code>btg</code>. */
	public static final String SEQUENCE = "sequence";
	
	
	/** <i>Generated variable</i> - Variable of <code>BTGAbstractResult.fulfilled</code> attribute defined at extension <code>btg</code>. */
	private Boolean _fulfilled;
	
	/** <i>Generated variable</i> - Variable of <code>BTGAbstractResult.forced</code> attribute defined at extension <code>btg</code>. */
	private Boolean _forced;
	
	/** <i>Generated variable</i> - Variable of <code>BTGAbstractResult.invalidated</code> attribute defined at extension <code>btg</code>. */
	private Boolean _invalidated;
	
	/** <i>Generated variable</i> - Variable of <code>BTGAbstractResult.resultScope</code> attribute defined at extension <code>btg</code>. */
	private BTGResultScope _resultScope;
	
	/** <i>Generated variable</i> - Variable of <code>BTGAbstractResult.sessionId</code> attribute defined at extension <code>btg</code>. */
	private String _sessionId;
	
	/** <i>Generated variable</i> - Variable of <code>BTGAbstractResult.sequence</code> attribute defined at extension <code>btg</code>. */
	private String _sequence;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGAbstractResultModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGAbstractResultModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _resultScope initial attribute declared by type <code>BTGAbstractResult</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGAbstractResultModel(final BTGResultScope _resultScope)
	{
		super();
		setResultScope(_resultScope);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _resultScope initial attribute declared by type <code>BTGAbstractResult</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGAbstractResultModel(final ItemModel _owner, final BTGResultScope _resultScope)
	{
		super();
		setOwner(_owner);
		setResultScope(_resultScope);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGAbstractResult.resultScope</code> attribute defined at extension <code>btg</code>. 
	 * @return the resultScope
	 */
	public BTGResultScope getResultScope()
	{
		if (this._resultScope!=null)
		{
			return _resultScope;
		}
		return _resultScope = getPersistenceContext().getValue(RESULTSCOPE, _resultScope);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGAbstractResult.sequence</code> attribute defined at extension <code>btg</code>. 
	 * @return the sequence
	 */
	public String getSequence()
	{
		if (this._sequence!=null)
		{
			return _sequence;
		}
		return _sequence = getPersistenceContext().getValue(SEQUENCE, _sequence);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGAbstractResult.sessionId</code> attribute defined at extension <code>btg</code>. 
	 * @return the sessionId
	 */
	public String getSessionId()
	{
		if (this._sessionId!=null)
		{
			return _sessionId;
		}
		return _sessionId = getPersistenceContext().getValue(SESSIONID, _sessionId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGAbstractResult.forced</code> attribute defined at extension <code>btg</code>. 
	 * @return the forced
	 */
	public boolean isForced()
	{
		return toPrimitive( _forced = getPersistenceContext().getValue(FORCED, _forced));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGAbstractResult.fulfilled</code> attribute defined at extension <code>btg</code>. 
	 * @return the fulfilled
	 */
	public boolean isFulfilled()
	{
		return toPrimitive( _fulfilled = getPersistenceContext().getValue(FULFILLED, _fulfilled));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGAbstractResult.invalidated</code> attribute defined at extension <code>btg</code>. 
	 * @return the invalidated
	 */
	public boolean isInvalidated()
	{
		return toPrimitive( _invalidated = getPersistenceContext().getValue(INVALIDATED, _invalidated));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGAbstractResult.forced</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the forced
	 */
	public void setForced(final boolean value)
	{
		_forced = getPersistenceContext().setValue(FORCED, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGAbstractResult.fulfilled</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the fulfilled
	 */
	public void setFulfilled(final boolean value)
	{
		_fulfilled = getPersistenceContext().setValue(FULFILLED, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGAbstractResult.invalidated</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the invalidated
	 */
	public void setInvalidated(final boolean value)
	{
		_invalidated = getPersistenceContext().setValue(INVALIDATED, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGAbstractResult.resultScope</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the resultScope
	 */
	public void setResultScope(final BTGResultScope value)
	{
		_resultScope = getPersistenceContext().setValue(RESULTSCOPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGAbstractResult.sequence</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the sequence
	 */
	public void setSequence(final String value)
	{
		_sequence = getPersistenceContext().setValue(SEQUENCE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGAbstractResult.sessionId</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the sessionId
	 */
	public void setSessionId(final String value)
	{
		_sessionId = getPersistenceContext().setValue(SESSIONID, value);
	}
	
}
