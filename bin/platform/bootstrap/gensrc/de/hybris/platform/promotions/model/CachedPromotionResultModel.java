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
import de.hybris.platform.promotions.model.AbstractPromotionActionModel;
import de.hybris.platform.promotions.model.CachedPromotionOrderEntryConsumedModel;
import de.hybris.platform.promotions.model.PromotionResultModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type CachedPromotionResult first defined at extension promotions.
 */
@SuppressWarnings("all")
public class CachedPromotionResultModel extends PromotionResultModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CachedPromotionResult";
	
	/** <i>Generated constant</i> - Attribute key of <code>CachedPromotionResult.cachedActions</code> attribute defined at extension <code>promotions</code>. */
	public static final String CACHEDACTIONS = "cachedActions";
	
	/** <i>Generated constant</i> - Attribute key of <code>CachedPromotionResult.cachedConsumedEntries</code> attribute defined at extension <code>promotions</code>. */
	public static final String CACHEDCONSUMEDENTRIES = "cachedConsumedEntries";
	
	
	/** <i>Generated variable</i> - Variable of <code>CachedPromotionResult.cachedActions</code> attribute defined at extension <code>promotions</code>. */
	private Collection<AbstractPromotionActionModel> _cachedActions;
	
	/** <i>Generated variable</i> - Variable of <code>CachedPromotionResult.cachedConsumedEntries</code> attribute defined at extension <code>promotions</code>. */
	private Collection<CachedPromotionOrderEntryConsumedModel> _cachedConsumedEntries;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CachedPromotionResultModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CachedPromotionResultModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public CachedPromotionResultModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CachedPromotionResult.cachedActions</code> attribute defined at extension <code>promotions</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the cachedActions - Cached list of actions
	 */
	public Collection<AbstractPromotionActionModel> getCachedActions()
	{
		if (this._cachedActions!=null)
		{
			return _cachedActions;
		}
		return _cachedActions = getPersistenceContext().getValue(CACHEDACTIONS, _cachedActions);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CachedPromotionResult.cachedConsumedEntries</code> attribute defined at extension <code>promotions</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the cachedConsumedEntries - Cached list of consumed entries
	 */
	public Collection<CachedPromotionOrderEntryConsumedModel> getCachedConsumedEntries()
	{
		if (this._cachedConsumedEntries!=null)
		{
			return _cachedConsumedEntries;
		}
		return _cachedConsumedEntries = getPersistenceContext().getValue(CACHEDCONSUMEDENTRIES, _cachedConsumedEntries);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CachedPromotionResult.cachedActions</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the cachedActions - Cached list of actions
	 */
	public void setCachedActions(final Collection<AbstractPromotionActionModel> value)
	{
		_cachedActions = getPersistenceContext().setValue(CACHEDACTIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CachedPromotionResult.cachedConsumedEntries</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the cachedConsumedEntries - Cached list of consumed entries
	 */
	public void setCachedConsumedEntries(final Collection<CachedPromotionOrderEntryConsumedModel> value)
	{
		_cachedConsumedEntries = getPersistenceContext().setValue(CACHEDCONSUMEDENTRIES, value);
	}
	
}
