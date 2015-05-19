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

import de.hybris.platform.btg.model.BTGAbstractOrderOperandModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Date;

/**
 * Generated model class for type BTGNumberOfOrdersOperand first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGNumberOfOrdersOperandModel extends BTGAbstractOrderOperandModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGNumberOfOrdersOperand";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGNumberOfOrdersOperand.from</code> attribute defined at extension <code>btg</code>. */
	public static final String FROM = "from";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGNumberOfOrdersOperand.to</code> attribute defined at extension <code>btg</code>. */
	public static final String TO = "to";
	
	
	/** <i>Generated variable</i> - Variable of <code>BTGNumberOfOrdersOperand.from</code> attribute defined at extension <code>btg</code>. */
	private Date _from;
	
	/** <i>Generated variable</i> - Variable of <code>BTGNumberOfOrdersOperand.to</code> attribute defined at extension <code>btg</code>. */
	private Date _to;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGNumberOfOrdersOperandModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGNumberOfOrdersOperandModel(final ItemModelContext ctx)
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
	public BTGNumberOfOrdersOperandModel(final CatalogVersionModel _catalogVersion, final String _uid)
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
	public BTGNumberOfOrdersOperandModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGNumberOfOrdersOperand.from</code> attribute defined at extension <code>btg</code>. 
	 * @return the from
	 */
	public Date getFrom()
	{
		if (this._from!=null)
		{
			return _from;
		}
		return _from = getPersistenceContext().getValue(FROM, _from);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGNumberOfOrdersOperand.to</code> attribute defined at extension <code>btg</code>. 
	 * @return the to
	 */
	public Date getTo()
	{
		if (this._to!=null)
		{
			return _to;
		}
		return _to = getPersistenceContext().getValue(TO, _to);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGNumberOfOrdersOperand.from</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the from
	 */
	public void setFrom(final Date value)
	{
		_from = getPersistenceContext().setValue(FROM, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGNumberOfOrdersOperand.to</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the to
	 */
	public void setTo(final Date value)
	{
		_to = getPersistenceContext().setValue(TO, value);
	}
	
}
