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
package de.hybris.platform.deeplink.model.rules;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.type.ComposedTypeModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type DeeplinkUrlRule first defined at extension basecommerce.
 */
@SuppressWarnings("all")
public class DeeplinkUrlRuleModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "DeeplinkUrlRule";
	
	/** <i>Generated constant</i> - Attribute key of <code>DeeplinkUrlRule.baseUrlPattern</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String BASEURLPATTERN = "baseUrlPattern";
	
	/** <i>Generated constant</i> - Attribute key of <code>DeeplinkUrlRule.destUrlTemplate</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String DESTURLTEMPLATE = "destUrlTemplate";
	
	/** <i>Generated constant</i> - Attribute key of <code>DeeplinkUrlRule.applicableType</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String APPLICABLETYPE = "applicableType";
	
	/** <i>Generated constant</i> - Attribute key of <code>DeeplinkUrlRule.useForward</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String USEFORWARD = "useForward";
	
	/** <i>Generated constant</i> - Attribute key of <code>DeeplinkUrlRule.priority</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String PRIORITY = "priority";
	
	
	/** <i>Generated variable</i> - Variable of <code>DeeplinkUrlRule.baseUrlPattern</code> attribute defined at extension <code>basecommerce</code>. */
	private String _baseUrlPattern;
	
	/** <i>Generated variable</i> - Variable of <code>DeeplinkUrlRule.destUrlTemplate</code> attribute defined at extension <code>basecommerce</code>. */
	private String _destUrlTemplate;
	
	/** <i>Generated variable</i> - Variable of <code>DeeplinkUrlRule.applicableType</code> attribute defined at extension <code>basecommerce</code>. */
	private ComposedTypeModel _applicableType;
	
	/** <i>Generated variable</i> - Variable of <code>DeeplinkUrlRule.useForward</code> attribute defined at extension <code>basecommerce</code>. */
	private Boolean _useForward;
	
	/** <i>Generated variable</i> - Variable of <code>DeeplinkUrlRule.priority</code> attribute defined at extension <code>basecommerce</code>. */
	private Integer _priority;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public DeeplinkUrlRuleModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public DeeplinkUrlRuleModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _applicableType initial attribute declared by type <code>DeeplinkUrlRule</code> at extension <code>basecommerce</code>
	 * @param _baseUrlPattern initial attribute declared by type <code>DeeplinkUrlRule</code> at extension <code>basecommerce</code>
	 * @param _destUrlTemplate initial attribute declared by type <code>DeeplinkUrlRule</code> at extension <code>basecommerce</code>
	 * @param _priority initial attribute declared by type <code>DeeplinkUrlRule</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public DeeplinkUrlRuleModel(final ComposedTypeModel _applicableType, final String _baseUrlPattern, final String _destUrlTemplate, final Integer _priority)
	{
		super();
		setApplicableType(_applicableType);
		setBaseUrlPattern(_baseUrlPattern);
		setDestUrlTemplate(_destUrlTemplate);
		setPriority(_priority);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _applicableType initial attribute declared by type <code>DeeplinkUrlRule</code> at extension <code>basecommerce</code>
	 * @param _baseUrlPattern initial attribute declared by type <code>DeeplinkUrlRule</code> at extension <code>basecommerce</code>
	 * @param _destUrlTemplate initial attribute declared by type <code>DeeplinkUrlRule</code> at extension <code>basecommerce</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _priority initial attribute declared by type <code>DeeplinkUrlRule</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public DeeplinkUrlRuleModel(final ComposedTypeModel _applicableType, final String _baseUrlPattern, final String _destUrlTemplate, final ItemModel _owner, final Integer _priority)
	{
		super();
		setApplicableType(_applicableType);
		setBaseUrlPattern(_baseUrlPattern);
		setDestUrlTemplate(_destUrlTemplate);
		setOwner(_owner);
		setPriority(_priority);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeeplinkUrlRule.applicableType</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the applicableType
	 */
	public ComposedTypeModel getApplicableType()
	{
		if (this._applicableType!=null)
		{
			return _applicableType;
		}
		return _applicableType = getPersistenceContext().getValue(APPLICABLETYPE, _applicableType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeeplinkUrlRule.baseUrlPattern</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the baseUrlPattern
	 */
	public String getBaseUrlPattern()
	{
		if (this._baseUrlPattern!=null)
		{
			return _baseUrlPattern;
		}
		return _baseUrlPattern = getPersistenceContext().getValue(BASEURLPATTERN, _baseUrlPattern);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeeplinkUrlRule.destUrlTemplate</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the destUrlTemplate
	 */
	public String getDestUrlTemplate()
	{
		if (this._destUrlTemplate!=null)
		{
			return _destUrlTemplate;
		}
		return _destUrlTemplate = getPersistenceContext().getValue(DESTURLTEMPLATE, _destUrlTemplate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeeplinkUrlRule.priority</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the priority
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
	 * <i>Generated method</i> - Getter of the <code>DeeplinkUrlRule.useForward</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the useForward
	 */
	public Boolean getUseForward()
	{
		if (this._useForward!=null)
		{
			return _useForward;
		}
		return _useForward = getPersistenceContext().getValue(USEFORWARD, _useForward);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>DeeplinkUrlRule.applicableType</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the applicableType
	 */
	public void setApplicableType(final ComposedTypeModel value)
	{
		_applicableType = getPersistenceContext().setValue(APPLICABLETYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>DeeplinkUrlRule.baseUrlPattern</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the baseUrlPattern
	 */
	public void setBaseUrlPattern(final String value)
	{
		_baseUrlPattern = getPersistenceContext().setValue(BASEURLPATTERN, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>DeeplinkUrlRule.destUrlTemplate</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the destUrlTemplate
	 */
	public void setDestUrlTemplate(final String value)
	{
		_destUrlTemplate = getPersistenceContext().setValue(DESTURLTEMPLATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>DeeplinkUrlRule.priority</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the priority
	 */
	public void setPriority(final Integer value)
	{
		_priority = getPersistenceContext().setValue(PRIORITY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>DeeplinkUrlRule.useForward</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the useForward
	 */
	public void setUseForward(final Boolean value)
	{
		_useForward = getPersistenceContext().setValue(USEFORWARD, value);
	}
	
}
