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

import de.hybris.platform.btg.model.BTGConditionModel;
import de.hybris.platform.btg.model.BTGOperandModel;
import de.hybris.platform.btg.model.BTGOperatorModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type BTGExpression first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGExpressionModel extends BTGConditionModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGExpression";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGExpression.leftOperand</code> attribute defined at extension <code>btg</code>. */
	public static final String LEFTOPERAND = "leftOperand";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGExpression.rightOperand</code> attribute defined at extension <code>btg</code>. */
	public static final String RIGHTOPERAND = "rightOperand";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGExpression.operator</code> attribute defined at extension <code>btg</code>. */
	public static final String OPERATOR = "operator";
	
	
	/** <i>Generated variable</i> - Variable of <code>BTGExpression.leftOperand</code> attribute defined at extension <code>btg</code>. */
	private BTGOperandModel _leftOperand;
	
	/** <i>Generated variable</i> - Variable of <code>BTGExpression.rightOperand</code> attribute defined at extension <code>btg</code>. */
	private BTGOperandModel _rightOperand;
	
	/** <i>Generated variable</i> - Variable of <code>BTGExpression.operator</code> attribute defined at extension <code>btg</code>. */
	private BTGOperatorModel _operator;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGExpressionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGExpressionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGExpressionModel(final CatalogVersionModel _catalogVersion, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGExpressionModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGExpression.leftOperand</code> attribute defined at extension <code>btg</code>. 
	 * @return the leftOperand
	 */
	public BTGOperandModel getLeftOperand()
	{
		if (this._leftOperand!=null)
		{
			return _leftOperand;
		}
		return _leftOperand = getPersistenceContext().getValue(LEFTOPERAND, _leftOperand);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGExpression.operator</code> attribute defined at extension <code>btg</code>. 
	 * @return the operator
	 */
	public BTGOperatorModel getOperator()
	{
		if (this._operator!=null)
		{
			return _operator;
		}
		return _operator = getPersistenceContext().getValue(OPERATOR, _operator);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGExpression.rightOperand</code> attribute defined at extension <code>btg</code>. 
	 * @return the rightOperand
	 */
	public BTGOperandModel getRightOperand()
	{
		if (this._rightOperand!=null)
		{
			return _rightOperand;
		}
		return _rightOperand = getPersistenceContext().getValue(RIGHTOPERAND, _rightOperand);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGExpression.leftOperand</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the leftOperand
	 */
	public void setLeftOperand(final BTGOperandModel value)
	{
		_leftOperand = getPersistenceContext().setValue(LEFTOPERAND, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGExpression.operator</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the operator
	 */
	public void setOperator(final BTGOperatorModel value)
	{
		_operator = getPersistenceContext().setValue(OPERATOR, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGExpression.rightOperand</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the rightOperand
	 */
	public void setRightOperand(final BTGOperandModel value)
	{
		_rightOperand = getPersistenceContext().setValue(RIGHTOPERAND, value);
	}
	
}
