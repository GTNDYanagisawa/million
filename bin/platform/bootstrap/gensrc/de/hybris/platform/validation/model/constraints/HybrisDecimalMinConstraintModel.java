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
package de.hybris.platform.validation.model.constraints;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.validation.model.constraints.AttributeConstraintModel;
import java.math.BigDecimal;

/**
 * Generated model class for type HybrisDecimalMinConstraint first defined at extension validation.
 * <p>
 * Hybris counterpart for decimal min JSR 303 compatible constraint class.
 */
@SuppressWarnings("all")
public class HybrisDecimalMinConstraintModel extends AttributeConstraintModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "HybrisDecimalMinConstraint";
	
	/** <i>Generated constant</i> - Attribute key of <code>HybrisDecimalMinConstraint.value</code> attribute defined at extension <code>validation</code>. */
	public static final String VALUE = "value";
	
	
	/** <i>Generated variable</i> - Variable of <code>HybrisDecimalMinConstraint.value</code> attribute defined at extension <code>validation</code>. */
	private BigDecimal _value;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public HybrisDecimalMinConstraintModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public HybrisDecimalMinConstraintModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _id initial attribute declared by type <code>AbstractConstraint</code> at extension <code>validation</code>
	 * @param _value initial attribute declared by type <code>HybrisDecimalMinConstraint</code> at extension <code>validation</code>
	 */
	@Deprecated
	public HybrisDecimalMinConstraintModel(final String _id, final BigDecimal _value)
	{
		super();
		setId(_id);
		setValue(_value);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _id initial attribute declared by type <code>AbstractConstraint</code> at extension <code>validation</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _value initial attribute declared by type <code>HybrisDecimalMinConstraint</code> at extension <code>validation</code>
	 */
	@Deprecated
	public HybrisDecimalMinConstraintModel(final String _id, final ItemModel _owner, final BigDecimal _value)
	{
		super();
		setId(_id);
		setOwner(_owner);
		setValue(_value);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HybrisDecimalMinConstraint.value</code> attribute defined at extension <code>validation</code>. 
	 * @return the value - Minimal value
	 */
	public BigDecimal getValue()
	{
		if (this._value!=null)
		{
			return _value;
		}
		return _value = getPersistenceContext().getValue(VALUE, _value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>HybrisDecimalMinConstraint.value</code> attribute defined at extension <code>validation</code>. 
	 *  
	 * @param value the value - Minimal value
	 */
	public void setValue(final BigDecimal value)
	{
		_value = getPersistenceContext().setValue(VALUE, value);
	}
	
}
