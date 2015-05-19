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

import de.hybris.platform.btg.model.BTGAbstractLiteralOperandModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type BTGIntegerLiteralOperand first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGIntegerLiteralOperandModel extends BTGAbstractLiteralOperandModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGIntegerLiteralOperand";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGIntegerLiteralOperand.literal</code> attribute defined at extension <code>btg</code>. */
	public static final String LITERAL = "literal";
	
	
	/** <i>Generated variable</i> - Variable of <code>BTGIntegerLiteralOperand.literal</code> attribute defined at extension <code>btg</code>. */
	private Integer _literal;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGIntegerLiteralOperandModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGIntegerLiteralOperandModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _literal initial attribute declared by type <code>BTGIntegerLiteralOperand</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGIntegerLiteralOperandModel(final CatalogVersionModel _catalogVersion, final Integer _literal, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setLiteral(_literal);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _literal initial attribute declared by type <code>BTGIntegerLiteralOperand</code> at extension <code>btg</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGIntegerLiteralOperandModel(final CatalogVersionModel _catalogVersion, final Integer _literal, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setLiteral(_literal);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGIntegerLiteralOperand.literal</code> attribute defined at extension <code>btg</code>. 
	 * @return the literal
	 */
	public Integer getLiteral()
	{
		if (this._literal!=null)
		{
			return _literal;
		}
		return _literal = getPersistenceContext().getValue(LITERAL, _literal);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGIntegerLiteralOperand.literal</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the literal
	 */
	public void setLiteral(final Integer value)
	{
		_literal = getPersistenceContext().setValue(LITERAL, value);
	}
	
}
