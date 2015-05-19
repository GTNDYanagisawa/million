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
import de.hybris.platform.promotions.model.AbstractPromotionRestrictionModel;
import de.hybris.platform.promotions.model.PromotionGroupModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;

/**
 * Generated model class for type AbstractPromotion first defined at extension promotions.
 */
@SuppressWarnings("all")
public class AbstractPromotionModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "AbstractPromotion";
	
	/**<i>Generated relation code constant for relation <code>PromotionGroupPromotionsRelation</code> defining source attribute <code>PromotionGroup</code> in extension <code>promotions</code>.</i>*/
	public final static String _PROMOTIONGROUPPROMOTIONSRELATION = "PromotionGroupPromotionsRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPromotion.promotionType</code> attribute defined at extension <code>promotions</code>. */
	public static final String PROMOTIONTYPE = "promotionType";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPromotion.code</code> attribute defined at extension <code>promotions</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPromotion.title</code> attribute defined at extension <code>promotions</code>. */
	public static final String TITLE = "title";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPromotion.description</code> attribute defined at extension <code>promotions</code>. */
	public static final String DESCRIPTION = "description";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPromotion.startDate</code> attribute defined at extension <code>promotions</code>. */
	public static final String STARTDATE = "startDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPromotion.endDate</code> attribute defined at extension <code>promotions</code>. */
	public static final String ENDDATE = "endDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPromotion.detailsURL</code> attribute defined at extension <code>promotions</code>. */
	public static final String DETAILSURL = "detailsURL";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPromotion.restrictions</code> attribute defined at extension <code>promotions</code>. */
	public static final String RESTRICTIONS = "restrictions";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPromotion.enabled</code> attribute defined at extension <code>promotions</code>. */
	public static final String ENABLED = "enabled";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPromotion.priority</code> attribute defined at extension <code>promotions</code>. */
	public static final String PRIORITY = "priority";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPromotion.immutableKeyHash</code> attribute defined at extension <code>promotions</code>. */
	public static final String IMMUTABLEKEYHASH = "immutableKeyHash";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPromotion.immutableKey</code> attribute defined at extension <code>promotions</code>. */
	public static final String IMMUTABLEKEY = "immutableKey";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPromotion.PromotionGroup</code> attribute defined at extension <code>promotions</code>. */
	public static final String PROMOTIONGROUP = "PromotionGroup";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractPromotion.name</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String NAME = "name";
	
	
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotion.code</code> attribute defined at extension <code>promotions</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotion.title</code> attribute defined at extension <code>promotions</code>. */
	private String _title;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotion.description</code> attribute defined at extension <code>promotions</code>. */
	private String _description;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotion.startDate</code> attribute defined at extension <code>promotions</code>. */
	private Date _startDate;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotion.endDate</code> attribute defined at extension <code>promotions</code>. */
	private Date _endDate;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotion.detailsURL</code> attribute defined at extension <code>promotions</code>. */
	private String _detailsURL;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotion.restrictions</code> attribute defined at extension <code>promotions</code>. */
	private Collection<AbstractPromotionRestrictionModel> _restrictions;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotion.enabled</code> attribute defined at extension <code>promotions</code>. */
	private Boolean _enabled;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotion.priority</code> attribute defined at extension <code>promotions</code>. */
	private Integer _priority;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotion.immutableKeyHash</code> attribute defined at extension <code>promotions</code>. */
	private String _immutableKeyHash;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotion.immutableKey</code> attribute defined at extension <code>promotions</code>. */
	private String _immutableKey;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotion.PromotionGroup</code> attribute defined at extension <code>promotions</code>. */
	private PromotionGroupModel _PromotionGroup;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AbstractPromotionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AbstractPromotionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>AbstractPromotion</code> at extension <code>promotions</code>
	 */
	@Deprecated
	public AbstractPromotionModel(final String _code)
	{
		super();
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>AbstractPromotion</code> at extension <code>promotions</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public AbstractPromotionModel(final String _code, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPromotion.code</code> attribute defined at extension <code>promotions</code>. 
	 * @return the code - Identifier for this promotion
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
	 * <i>Generated method</i> - Getter of the <code>AbstractPromotion.description</code> attribute defined at extension <code>promotions</code>. 
	 * @return the description - Description of this promotion
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
	 * <i>Generated method</i> - Getter of the <code>AbstractPromotion.detailsURL</code> attribute defined at extension <code>promotions</code>. 
	 * @return the detailsURL - URL to a content page with further details of this promotion
	 */
	public String getDetailsURL()
	{
		if (this._detailsURL!=null)
		{
			return _detailsURL;
		}
		return _detailsURL = getPersistenceContext().getValue(DETAILSURL, _detailsURL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPromotion.enabled</code> attribute defined at extension <code>promotions</code>. 
	 * @return the enabled - Flag to indicate if this promotion is enabled.
	 */
	public Boolean getEnabled()
	{
		if (this._enabled!=null)
		{
			return _enabled;
		}
		return _enabled = getPersistenceContext().getValue(ENABLED, _enabled);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPromotion.endDate</code> attribute defined at extension <code>promotions</code>. 
	 * @return the endDate - Date on which this promotion stops being available, if not set the promotion will not be available.
	 */
	public Date getEndDate()
	{
		if (this._endDate!=null)
		{
			return _endDate;
		}
		return _endDate = getPersistenceContext().getValue(ENDDATE, _endDate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPromotion.immutableKey</code> attribute defined at extension <code>promotions</code>. 
	 * @return the immutableKey - The full immutable identifier for this promotion
	 */
	public String getImmutableKey()
	{
		if (this._immutableKey!=null)
		{
			return _immutableKey;
		}
		return _immutableKey = getPersistenceContext().getValue(IMMUTABLEKEY, _immutableKey);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPromotion.immutableKeyHash</code> attribute defined at extension <code>promotions</code>. 
	 * @return the immutableKeyHash - The HASH of the immutableKey
	 */
	public String getImmutableKeyHash()
	{
		if (this._immutableKeyHash!=null)
		{
			return _immutableKeyHash;
		}
		return _immutableKeyHash = getPersistenceContext().getValue(IMMUTABLEKEYHASH, _immutableKeyHash);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPromotion.name</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the name - Displayable name for this promotion
	 */
	public String getName()
	{
		return getName(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPromotion.name</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @param loc the value localization key 
	 * @return the name - Displayable name for this promotion
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getName(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(NAME, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPromotion.priority</code> attribute defined at extension <code>promotions</code>. 
	 * @return the priority - Value to indicate relative priority of promotions. The higher the value the higher the priority.
	 */
	public Integer getPriority()
	{
		if (this._priority!=null)
		{
			return _priority;
		}
		return _priority = getPersistenceContext().getValue(PRIORITY, _priority);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPromotion.PromotionGroup</code> attribute defined at extension <code>promotions</code>. 
	 * @return the PromotionGroup
	 */
	public PromotionGroupModel getPromotionGroup()
	{
		if (this._PromotionGroup!=null)
		{
			return _PromotionGroup;
		}
		return _PromotionGroup = getPersistenceContext().getValue(PROMOTIONGROUP, _PromotionGroup);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPromotion.promotionType</code> attribute defined at extension <code>promotions</code>. 
	 * @return the promotionType - The type of this promotion.
	 */
	public String getPromotionType()
	{
		return getPromotionType(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPromotion.promotionType</code> attribute defined at extension <code>promotions</code>. 
	 * @param loc the value localization key 
	 * @return the promotionType - The type of this promotion.
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getPromotionType(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(PROMOTIONTYPE, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPromotion.restrictions</code> attribute defined at extension <code>promotions</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the restrictions - Collection of restrictions that are applied to this promotion
	 */
	public Collection<AbstractPromotionRestrictionModel> getRestrictions()
	{
		if (this._restrictions!=null)
		{
			return _restrictions;
		}
		return _restrictions = getPersistenceContext().getValue(RESTRICTIONS, _restrictions);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPromotion.startDate</code> attribute defined at extension <code>promotions</code>. 
	 * @return the startDate - Date on which this promotion becomes available, if not set the promotion will not be available.
	 */
	public Date getStartDate()
	{
		if (this._startDate!=null)
		{
			return _startDate;
		}
		return _startDate = getPersistenceContext().getValue(STARTDATE, _startDate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPromotion.title</code> attribute defined at extension <code>promotions</code>. 
	 * @return the title - Title for this promotion
	 */
	public String getTitle()
	{
		if (this._title!=null)
		{
			return _title;
		}
		return _title = getPersistenceContext().getValue(TITLE, _title);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractPromotion.code</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the code - Identifier for this promotion
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractPromotion.description</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the description - Description of this promotion
	 */
	public void setDescription(final String value)
	{
		_description = getPersistenceContext().setValue(DESCRIPTION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractPromotion.detailsURL</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the detailsURL - URL to a content page with further details of this promotion
	 */
	public void setDetailsURL(final String value)
	{
		_detailsURL = getPersistenceContext().setValue(DETAILSURL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractPromotion.enabled</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the enabled - Flag to indicate if this promotion is enabled.
	 */
	public void setEnabled(final Boolean value)
	{
		_enabled = getPersistenceContext().setValue(ENABLED, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractPromotion.endDate</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the endDate - Date on which this promotion stops being available, if not set the promotion will not be available.
	 */
	public void setEndDate(final Date value)
	{
		_endDate = getPersistenceContext().setValue(ENDDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractPromotion.immutableKey</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the immutableKey - The full immutable identifier for this promotion
	 */
	public void setImmutableKey(final String value)
	{
		_immutableKey = getPersistenceContext().setValue(IMMUTABLEKEY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractPromotion.immutableKeyHash</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the immutableKeyHash - The HASH of the immutableKey
	 */
	public void setImmutableKeyHash(final String value)
	{
		_immutableKeyHash = getPersistenceContext().setValue(IMMUTABLEKEYHASH, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractPromotion.name</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the name - Displayable name for this promotion
	 */
	public void setName(final String value)
	{
		setName(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractPromotion.name</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the name - Displayable name for this promotion
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setName(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(NAME, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractPromotion.priority</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the priority - Value to indicate relative priority of promotions. The higher the value the higher the priority.
	 */
	public void setPriority(final Integer value)
	{
		_priority = getPersistenceContext().setValue(PRIORITY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractPromotion.PromotionGroup</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the PromotionGroup
	 */
	public void setPromotionGroup(final PromotionGroupModel value)
	{
		_PromotionGroup = getPersistenceContext().setValue(PROMOTIONGROUP, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractPromotion.restrictions</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the restrictions - Collection of restrictions that are applied to this promotion
	 */
	public void setRestrictions(final Collection<AbstractPromotionRestrictionModel> value)
	{
		_restrictions = getPersistenceContext().setValue(RESTRICTIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractPromotion.startDate</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the startDate - Date on which this promotion becomes available, if not set the promotion will not be available.
	 */
	public void setStartDate(final Date value)
	{
		_startDate = getPersistenceContext().setValue(STARTDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractPromotion.title</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the title - Title for this promotion
	 */
	public void setTitle(final String value)
	{
		_title = getPersistenceContext().setValue(TITLE, value);
	}
	
}
