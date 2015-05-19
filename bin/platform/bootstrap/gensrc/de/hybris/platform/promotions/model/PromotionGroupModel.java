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
import de.hybris.platform.promotions.model.AbstractPromotionModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type PromotionGroup first defined at extension promotions.
 */
@SuppressWarnings("all")
public class PromotionGroupModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PromotionGroup";
	
	/** <i>Generated constant</i> - Attribute key of <code>PromotionGroup.Identifier</code> attribute defined at extension <code>promotions</code>. */
	public static final String IDENTIFIER = "Identifier";
	
	/** <i>Generated constant</i> - Attribute key of <code>PromotionGroup.Promotions</code> attribute defined at extension <code>promotions</code>. */
	public static final String PROMOTIONS = "Promotions";
	
	
	/** <i>Generated variable</i> - Variable of <code>PromotionGroup.Identifier</code> attribute defined at extension <code>promotions</code>. */
	private String _Identifier;
	
	/** <i>Generated variable</i> - Variable of <code>PromotionGroup.Promotions</code> attribute defined at extension <code>promotions</code>. */
	private Collection<AbstractPromotionModel> _Promotions;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PromotionGroupModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PromotionGroupModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _Identifier initial attribute declared by type <code>PromotionGroup</code> at extension <code>promotions</code>
	 */
	@Deprecated
	public PromotionGroupModel(final String _Identifier)
	{
		super();
		setIdentifier(_Identifier);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _Identifier initial attribute declared by type <code>PromotionGroup</code> at extension <code>promotions</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public PromotionGroupModel(final String _Identifier, final ItemModel _owner)
	{
		super();
		setIdentifier(_Identifier);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PromotionGroup.Identifier</code> attribute defined at extension <code>promotions</code>. 
	 * @return the Identifier
	 */
	public String getIdentifier()
	{
		if (this._Identifier!=null)
		{
			return _Identifier;
		}
		return _Identifier = getPersistenceContext().getValue(IDENTIFIER, _Identifier);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PromotionGroup.Promotions</code> attribute defined at extension <code>promotions</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the Promotions
	 */
	public Collection<AbstractPromotionModel> getPromotions()
	{
		if (this._Promotions!=null)
		{
			return _Promotions;
		}
		return _Promotions = getPersistenceContext().getValue(PROMOTIONS, _Promotions);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PromotionGroup.Identifier</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the Identifier
	 */
	public void setIdentifier(final String value)
	{
		_Identifier = getPersistenceContext().setValue(IDENTIFIER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PromotionGroup.Promotions</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the Promotions
	 */
	public void setPromotions(final Collection<AbstractPromotionModel> value)
	{
		_Promotions = getPersistenceContext().setValue(PROMOTIONS, value);
	}
	
}
