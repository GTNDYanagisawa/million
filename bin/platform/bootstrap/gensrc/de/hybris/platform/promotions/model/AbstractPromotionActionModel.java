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
package de.hybris.platform.promotions.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.promotions.model.PromotionResultModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type AbstractPromotionAction first defined at extension promotions.
 */
@SuppressWarnings("all")
public class AbstractPromotionActionModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "AbstractPromotionAction";
	
	/**<i>Generated relation code constant for relation <code>PromotionResult2PromotionActionsRelation</code> defining source attribute <code>promotionResult</code> in extension <code>promotions</code>.</i>*/
	public final static String _PROMOTIONRESULT2PROMOTIONACTIONSRELATION = "PromotionResult2PromotionActionsRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPromotionAction.markedApplied</code> attribute defined at extension <code>promotions</code>. */
	public static final String MARKEDAPPLIED = "markedApplied";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPromotionAction.guid</code> attribute defined at extension <code>promotions</code>. */
	public static final String GUID = "guid";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPromotionAction.promotionResult</code> attribute defined at extension <code>promotions</code>. */
	public static final String PROMOTIONRESULT = "promotionResult";
	
	
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotionAction.markedApplied</code> attribute defined at extension <code>promotions</code>. */
	private Boolean _markedApplied;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotionAction.guid</code> attribute defined at extension <code>promotions</code>. */
	private String _guid;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotionAction.promotionResult</code> attribute defined at extension <code>promotions</code>. */
	private PromotionResultModel _promotionResult;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AbstractPromotionActionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AbstractPromotionActionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public AbstractPromotionActionModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPromotionAction.guid</code> attribute defined at extension <code>promotions</code>. 
	 * @return the guid - The unique identifier for this action.
	 */
	public String getGuid()
	{
		if (this._guid!=null)
		{
			return _guid;
		}
		return _guid = getPersistenceContext().getValue(GUID, _guid);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPromotionAction.markedApplied</code> attribute defined at extension <code>promotions</code>. 
	 * @return the markedApplied - Flag to indicate that this promotion is applied.
	 */
	public Boolean getMarkedApplied()
	{
		if (this._markedApplied!=null)
		{
			return _markedApplied;
		}
		return _markedApplied = getPersistenceContext().getValue(MARKEDAPPLIED, _markedApplied);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPromotionAction.promotionResult</code> attribute defined at extension <code>promotions</code>. 
	 * @return the promotionResult
	 */
	public PromotionResultModel getPromotionResult()
	{
		if (this._promotionResult!=null)
		{
			return _promotionResult;
		}
		return _promotionResult = getPersistenceContext().getValue(PROMOTIONRESULT, _promotionResult);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractPromotionAction.guid</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the guid - The unique identifier for this action.
	 */
	public void setGuid(final String value)
	{
		_guid = getPersistenceContext().setValue(GUID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractPromotionAction.markedApplied</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the markedApplied - Flag to indicate that this promotion is applied.
	 */
	public void setMarkedApplied(final Boolean value)
	{
		_markedApplied = getPersistenceContext().setValue(MARKEDAPPLIED, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractPromotionAction.promotionResult</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the promotionResult
	 */
	public void setPromotionResult(final PromotionResultModel value)
	{
		_promotionResult = getPersistenceContext().setValue(PROMOTIONRESULT, value);
	}
	
}
