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
import de.hybris.platform.print.model.CometConfigurationModel;
import de.hybris.platform.print.model.PlaceholderModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type ExpressionPlaceholder first defined at extension print.
 */
@SuppressWarnings("all")
public class ExpressionPlaceholderModel extends PlaceholderModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ExpressionPlaceholder";
	
	/** <i>Generated constant</i> - Attribute key of <code>ExpressionPlaceholder.getExpression</code> attribute defined at extension <code>print</code>. */
	public static final String GETEXPRESSION = "getExpression";
	
	/** <i>Generated constant</i> - Attribute key of <code>ExpressionPlaceholder.setExpression</code> attribute defined at extension <code>print</code>. */
	public static final String SETEXPRESSION = "setExpression";
	
	
	/** <i>Generated variable</i> - Variable of <code>ExpressionPlaceholder.getExpression</code> attribute defined at extension <code>print</code>. */
	private String _getExpression;
	
	/** <i>Generated variable</i> - Variable of <code>ExpressionPlaceholder.setExpression</code> attribute defined at extension <code>print</code>. */
	private String _setExpression;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ExpressionPlaceholderModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ExpressionPlaceholderModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _cometConfig initial attribute declared by type <code>Placeholder</code> at extension <code>print</code>
	 * @param _getExpression initial attribute declared by type <code>ExpressionPlaceholder</code> at extension <code>print</code>
	 * @param _qualifier initial attribute declared by type <code>Placeholder</code> at extension <code>print</code>
	 */
	@Deprecated
	public ExpressionPlaceholderModel(final CometConfigurationModel _cometConfig, final String _getExpression, final String _qualifier)
	{
		super();
		setCometConfig(_cometConfig);
		setGetExpression(_getExpression);
		setQualifier(_qualifier);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _cometConfig initial attribute declared by type <code>Placeholder</code> at extension <code>print</code>
	 * @param _getExpression initial attribute declared by type <code>ExpressionPlaceholder</code> at extension <code>print</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _qualifier initial attribute declared by type <code>Placeholder</code> at extension <code>print</code>
	 */
	@Deprecated
	public ExpressionPlaceholderModel(final CometConfigurationModel _cometConfig, final String _getExpression, final ItemModel _owner, final String _qualifier)
	{
		super();
		setCometConfig(_cometConfig);
		setGetExpression(_getExpression);
		setOwner(_owner);
		setQualifier(_qualifier);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExpressionPlaceholder.getExpression</code> attribute defined at extension <code>print</code>. 
	 * @return the getExpression
	 */
	public String getGetExpression()
	{
		if (this._getExpression!=null)
		{
			return _getExpression;
		}
		return _getExpression = getPersistenceContext().getValue(GETEXPRESSION, _getExpression);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExpressionPlaceholder.setExpression</code> attribute defined at extension <code>print</code>. 
	 * @return the setExpression
	 */
	public String getSetExpression()
	{
		if (this._setExpression!=null)
		{
			return _setExpression;
		}
		return _setExpression = getPersistenceContext().getValue(SETEXPRESSION, _setExpression);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ExpressionPlaceholder.getExpression</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the getExpression
	 */
	public void setGetExpression(final String value)
	{
		_getExpression = getPersistenceContext().setValue(GETEXPRESSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ExpressionPlaceholder.setExpression</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the setExpression
	 */
	public void setSetExpression(final String value)
	{
		_setExpression = getPersistenceContext().setValue(SETEXPRESSION, value);
	}
	
}
