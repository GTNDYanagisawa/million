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
import java.util.Locale;

/**
 * Generated model class for type AbstractPromotionRestriction first defined at extension promotions.
 */
@SuppressWarnings("all")
public class AbstractPromotionRestrictionModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "AbstractPromotionRestriction";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPromotionRestriction.restrictionType</code> attribute defined at extension <code>promotions</code>. */
	public static final String RESTRICTIONTYPE = "restrictionType";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPromotionRestriction.descriptionPattern</code> attribute defined at extension <code>promotions</code>. */
	public static final String DESCRIPTIONPATTERN = "descriptionPattern";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPromotionRestriction.renderedDescription</code> attribute defined at extension <code>promotions</code>. */
	public static final String RENDEREDDESCRIPTION = "renderedDescription";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPromotionRestriction.promotion</code> attribute defined at extension <code>promotions</code>. */
	public static final String PROMOTION = "promotion";
	
	
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotionRestriction.renderedDescription</code> attribute defined at extension <code>promotions</code>. */
	private String _renderedDescription;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotionRestriction.promotion</code> attribute defined at extension <code>promotions</code>. */
	private AbstractPromotionModel _promotion;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AbstractPromotionRestrictionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AbstractPromotionRestrictionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public AbstractPromotionRestrictionModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPromotionRestriction.descriptionPattern</code> attribute defined at extension <code>promotions</code>. 
	 * @return the descriptionPattern - The description of the restriction (supports message pattern).
	 */
	public String getDescriptionPattern()
	{
		return getDescriptionPattern(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPromotionRestriction.descriptionPattern</code> attribute defined at extension <code>promotions</code>. 
	 * @param loc the value localization key 
	 * @return the descriptionPattern - The description of the restriction (supports message pattern).
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getDescriptionPattern(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(DESCRIPTIONPATTERN, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPromotionRestriction.promotion</code> attribute defined at extension <code>promotions</code>. 
	 * @return the promotion - The promotion that this restriction is part of
	 */
	public AbstractPromotionModel getPromotion()
	{
		if (this._promotion!=null)
		{
			return _promotion;
		}
		return _promotion = getPersistenceContext().getValue(PROMOTION, _promotion);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPromotionRestriction.renderedDescription</code> attribute defined at extension <code>promotions</code>. 
	 * @return the renderedDescription - The readonly rendered description of this restriction.
	 */
	public String getRenderedDescription()
	{
		if (this._renderedDescription!=null)
		{
			return _renderedDescription;
		}
		return _renderedDescription = getPersistenceContext().getValue(RENDEREDDESCRIPTION, _renderedDescription);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPromotionRestriction.restrictionType</code> attribute defined at extension <code>promotions</code>. 
	 * @return the restrictionType - The type of this restriction.
	 */
	public String getRestrictionType()
	{
		return getRestrictionType(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPromotionRestriction.restrictionType</code> attribute defined at extension <code>promotions</code>. 
	 * @param loc the value localization key 
	 * @return the restrictionType - The type of this restriction.
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getRestrictionType(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(RESTRICTIONTYPE, loc);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractPromotionRestriction.descriptionPattern</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the descriptionPattern - The description of the restriction (supports message pattern).
	 */
	public void setDescriptionPattern(final String value)
	{
		setDescriptionPattern(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractPromotionRestriction.descriptionPattern</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the descriptionPattern - The description of the restriction (supports message pattern).
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setDescriptionPattern(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(DESCRIPTIONPATTERN, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractPromotionRestriction.promotion</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the promotion - The promotion that this restriction is part of
	 */
	public void setPromotion(final AbstractPromotionModel value)
	{
		_promotion = getPersistenceContext().setValue(PROMOTION, value);
	}
	
}
