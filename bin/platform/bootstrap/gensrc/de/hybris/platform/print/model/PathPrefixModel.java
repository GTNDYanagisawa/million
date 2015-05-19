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
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type PathPrefix first defined at extension print.
 */
@SuppressWarnings("all")
public class PathPrefixModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PathPrefix";
	
	/** <i>Generated constant</i> - Attribute key of <code>PathPrefix.code</code> attribute defined at extension <code>print</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>PathPrefix.prefixWIN</code> attribute defined at extension <code>print</code>. */
	public static final String PREFIXWIN = "prefixWIN";
	
	/** <i>Generated constant</i> - Attribute key of <code>PathPrefix.prefixMAC</code> attribute defined at extension <code>print</code>. */
	public static final String PREFIXMAC = "prefixMAC";
	
	/** <i>Generated constant</i> - Attribute key of <code>PathPrefix.variableName</code> attribute defined at extension <code>print</code>. */
	public static final String VARIABLENAME = "variableName";
	
	
	/** <i>Generated variable</i> - Variable of <code>PathPrefix.code</code> attribute defined at extension <code>print</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>PathPrefix.prefixWIN</code> attribute defined at extension <code>print</code>. */
	private String _prefixWIN;
	
	/** <i>Generated variable</i> - Variable of <code>PathPrefix.prefixMAC</code> attribute defined at extension <code>print</code>. */
	private String _prefixMAC;
	
	/** <i>Generated variable</i> - Variable of <code>PathPrefix.variableName</code> attribute defined at extension <code>print</code>. */
	private String _variableName;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PathPrefixModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PathPrefixModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>PathPrefix</code> at extension <code>print</code>
	 */
	@Deprecated
	public PathPrefixModel(final String _code)
	{
		super();
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>PathPrefix</code> at extension <code>print</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public PathPrefixModel(final String _code, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PathPrefix.code</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>PathPrefix.prefixMAC</code> attribute defined at extension <code>print</code>. 
	 * @return the prefixMAC
	 */
	public String getPrefixMAC()
	{
		if (this._prefixMAC!=null)
		{
			return _prefixMAC;
		}
		return _prefixMAC = getPersistenceContext().getValue(PREFIXMAC, _prefixMAC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PathPrefix.prefixWIN</code> attribute defined at extension <code>print</code>. 
	 * @return the prefixWIN
	 */
	public String getPrefixWIN()
	{
		if (this._prefixWIN!=null)
		{
			return _prefixWIN;
		}
		return _prefixWIN = getPersistenceContext().getValue(PREFIXWIN, _prefixWIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PathPrefix.variableName</code> attribute defined at extension <code>print</code>. 
	 * @return the variableName
	 */
	public String getVariableName()
	{
		if (this._variableName!=null)
		{
			return _variableName;
		}
		return _variableName = getPersistenceContext().getValue(VARIABLENAME, _variableName);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PathPrefix.code</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PathPrefix.prefixMAC</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the prefixMAC
	 */
	public void setPrefixMAC(final String value)
	{
		_prefixMAC = getPersistenceContext().setValue(PREFIXMAC, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PathPrefix.prefixWIN</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the prefixWIN
	 */
	public void setPrefixWIN(final String value)
	{
		_prefixWIN = getPersistenceContext().setValue(PREFIXWIN, value);
	}
	
}
