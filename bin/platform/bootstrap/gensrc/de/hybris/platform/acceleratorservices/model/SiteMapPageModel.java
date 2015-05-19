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
package de.hybris.platform.acceleratorservices.model;

import de.hybris.platform.acceleratorservices.enums.SiteMapChangeFrequencyEnum;
import de.hybris.platform.acceleratorservices.enums.SiteMapPageEnum;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SiteMapPage first defined at extension acceleratorservices.
 * <p>
 * Creating a Site Map type to group attributes per page type.
 */
@SuppressWarnings("all")
public class SiteMapPageModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SiteMapPage";
	
	/** <i>Generated constant</i> - Attribute key of <code>SiteMapPage.code</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>SiteMapPage.frequency</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String FREQUENCY = "frequency";
	
	/** <i>Generated constant</i> - Attribute key of <code>SiteMapPage.priority</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String PRIORITY = "priority";
	
	/** <i>Generated constant</i> - Attribute key of <code>SiteMapPage.active</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String ACTIVE = "active";
	
	
	/** <i>Generated variable</i> - Variable of <code>SiteMapPage.code</code> attribute defined at extension <code>acceleratorservices</code>. */
	private SiteMapPageEnum _code;
	
	/** <i>Generated variable</i> - Variable of <code>SiteMapPage.frequency</code> attribute defined at extension <code>acceleratorservices</code>. */
	private SiteMapChangeFrequencyEnum _frequency;
	
	/** <i>Generated variable</i> - Variable of <code>SiteMapPage.priority</code> attribute defined at extension <code>acceleratorservices</code>. */
	private Double _priority;
	
	/** <i>Generated variable</i> - Variable of <code>SiteMapPage.active</code> attribute defined at extension <code>acceleratorservices</code>. */
	private Boolean _active;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SiteMapPageModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SiteMapPageModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public SiteMapPageModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapPage.active</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the active - Is sitemap page enabled or disabled
	 */
	public Boolean getActive()
	{
		if (this._active!=null)
		{
			return _active;
		}
		return _active = getPersistenceContext().getValue(ACTIVE, _active);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapPage.code</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the code - The type of page to be qualified
	 */
	public SiteMapPageEnum getCode()
	{
		if (this._code!=null)
		{
			return _code;
		}
		return _code = getPersistenceContext().getValue(CODE, _code);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapPage.frequency</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the frequency - How often the page should be updated.
	 */
	public SiteMapChangeFrequencyEnum getFrequency()
	{
		if (this._frequency!=null)
		{
			return _frequency;
		}
		return _frequency = getPersistenceContext().getValue(FREQUENCY, _frequency);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SiteMapPage.priority</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the priority - The weight the page should have in the sitemap
	 */
	public Double getPriority()
	{
		if (this._priority!=null)
		{
			return _priority;
		}
		return _priority = getPersistenceContext().getValue(PRIORITY, _priority);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SiteMapPage.active</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the active - Is sitemap page enabled or disabled
	 */
	public void setActive(final Boolean value)
	{
		_active = getPersistenceContext().setValue(ACTIVE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SiteMapPage.code</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the code - The type of page to be qualified
	 */
	public void setCode(final SiteMapPageEnum value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SiteMapPage.frequency</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the frequency - How often the page should be updated.
	 */
	public void setFrequency(final SiteMapChangeFrequencyEnum value)
	{
		_frequency = getPersistenceContext().setValue(FREQUENCY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SiteMapPage.priority</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the priority - The weight the page should have in the sitemap
	 */
	public void setPriority(final Double value)
	{
		_priority = getPersistenceContext().setValue(PRIORITY, value);
	}
	
}
