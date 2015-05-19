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

import de.hybris.platform.btg.enums.BTGConditionEvaluationScope;
import de.hybris.platform.btg.model.BTGItemModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type BTGOperand first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGOperandModel extends BTGItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGOperand";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGOperand.code</code> attribute defined at extension <code>btg</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGOperand.description</code> attribute defined at extension <code>btg</code>. */
	public static final String DESCRIPTION = "description";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGOperand.scope</code> attribute defined at extension <code>btg</code>. */
	public static final String SCOPE = "scope";
	
	
	/** <i>Generated variable</i> - Variable of <code>BTGOperand.code</code> attribute defined at extension <code>btg</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>BTGOperand.description</code> attribute defined at extension <code>btg</code>. */
	private String _description;
	
	/** <i>Generated variable</i> - Variable of <code>BTGOperand.scope</code> attribute defined at extension <code>btg</code>. */
	private BTGConditionEvaluationScope _scope;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGOperandModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGOperandModel(final ItemModelContext ctx)
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
	public BTGOperandModel(final CatalogVersionModel _catalogVersion, final String _uid)
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
	public BTGOperandModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGOperand.code</code> attribute defined at extension <code>btg</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>BTGOperand.description</code> attribute defined at extension <code>btg</code>. 
	 * @return the description
	 */
	public String getDescription()
	{
		if (this._description!=null)
		{
			return _description;
		}
		return _description = getPersistenceContext().getValue(DESCRIPTION, _description);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGOperand.scope</code> attribute defined at extension <code>btg</code>. 
	 * @return the scope
	 */
	public BTGConditionEvaluationScope getScope()
	{
		if (this._scope!=null)
		{
			return _scope;
		}
		return _scope = getPersistenceContext().getValue(SCOPE, _scope);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGOperand.code</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGOperand.description</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the description
	 */
	public void setDescription(final String value)
	{
		_description = getPersistenceContext().setValue(DESCRIPTION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGOperand.scope</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the scope
	 */
	public void setScope(final BTGConditionEvaluationScope value)
	{
		_scope = getPersistenceContext().setValue(SCOPE, value);
	}
	
}
