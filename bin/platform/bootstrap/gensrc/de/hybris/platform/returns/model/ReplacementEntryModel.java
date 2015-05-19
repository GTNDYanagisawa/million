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
package de.hybris.platform.returns.model;

import de.hybris.platform.basecommerce.enums.ReplacementReason;
import de.hybris.platform.basecommerce.enums.ReturnAction;
import de.hybris.platform.basecommerce.enums.ReturnStatus;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.returns.model.ReturnEntryModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type ReplacementEntry first defined at extension basecommerce.
 */
@SuppressWarnings("all")
public class ReplacementEntryModel extends ReturnEntryModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ReplacementEntry";
	
	/** <i>Generated constant</i> - Attribute key of <code>ReplacementEntry.reason</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String REASON = "reason";
	
	
	/** <i>Generated variable</i> - Variable of <code>ReplacementEntry.reason</code> attribute defined at extension <code>basecommerce</code>. */
	private ReplacementReason _reason;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ReplacementEntryModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ReplacementEntryModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _action initial attribute declared by type <code>ReturnEntry</code> at extension <code>basecommerce</code>
	 * @param _orderEntry initial attribute declared by type <code>ReturnEntry</code> at extension <code>basecommerce</code>
	 * @param _reason initial attribute declared by type <code>ReplacementEntry</code> at extension <code>basecommerce</code>
	 * @param _status initial attribute declared by type <code>ReturnEntry</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public ReplacementEntryModel(final ReturnAction _action, final AbstractOrderEntryModel _orderEntry, final ReplacementReason _reason, final ReturnStatus _status)
	{
		super();
		setAction(_action);
		setOrderEntry(_orderEntry);
		setReason(_reason);
		setStatus(_status);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _action initial attribute declared by type <code>ReturnEntry</code> at extension <code>basecommerce</code>
	 * @param _orderEntry initial attribute declared by type <code>ReturnEntry</code> at extension <code>basecommerce</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _reason initial attribute declared by type <code>ReplacementEntry</code> at extension <code>basecommerce</code>
	 * @param _status initial attribute declared by type <code>ReturnEntry</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public ReplacementEntryModel(final ReturnAction _action, final AbstractOrderEntryModel _orderEntry, final ItemModel _owner, final ReplacementReason _reason, final ReturnStatus _status)
	{
		super();
		setAction(_action);
		setOrderEntry(_orderEntry);
		setOwner(_owner);
		setReason(_reason);
		setStatus(_status);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReplacementEntry.reason</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the reason
	 */
	public ReplacementReason getReason()
	{
		if (this._reason!=null)
		{
			return _reason;
		}
		return _reason = getPersistenceContext().getValue(REASON, _reason);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ReplacementEntry.reason</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the reason
	 */
	public void setReason(final ReplacementReason value)
	{
		_reason = getPersistenceContext().setValue(REASON, value);
	}
	
}
