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
package de.hybris.platform.cms2.model.contents;

import de.hybris.platform.cms2.model.CMSComponentTypeModel;
import de.hybris.platform.cms2.model.ComponentTypeGroupModel;
import de.hybris.platform.cms2.model.pages.PageTemplateModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Set;

/**
 * Generated model class for type ContentSlotName first defined at extension cms2.
 */
@SuppressWarnings("all")
public class ContentSlotNameModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ContentSlotName";
	
	/**<i>Generated relation code constant for relation <code>AvailableSlotsForTemplate</code> defining source attribute <code>template</code> in extension <code>cms2</code>.</i>*/
	public final static String _AVAILABLESLOTSFORTEMPLATE = "AvailableSlotsForTemplate";
	
	/** <i>Generated constant</i> - Attribute key of <code>ContentSlotName.name</code> attribute defined at extension <code>cms2</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>ContentSlotName.compTypeGroup</code> attribute defined at extension <code>cms2</code>. */
	public static final String COMPTYPEGROUP = "compTypeGroup";
	
	/** <i>Generated constant</i> - Attribute key of <code>ContentSlotName.template</code> attribute defined at extension <code>cms2</code>. */
	public static final String TEMPLATE = "template";
	
	/** <i>Generated constant</i> - Attribute key of <code>ContentSlotName.validComponentTypes</code> attribute defined at extension <code>cms2</code>. */
	public static final String VALIDCOMPONENTTYPES = "validComponentTypes";
	
	
	/** <i>Generated variable</i> - Variable of <code>ContentSlotName.name</code> attribute defined at extension <code>cms2</code>. */
	private String _name;
	
	/** <i>Generated variable</i> - Variable of <code>ContentSlotName.compTypeGroup</code> attribute defined at extension <code>cms2</code>. */
	private ComponentTypeGroupModel _compTypeGroup;
	
	/** <i>Generated variable</i> - Variable of <code>ContentSlotName.template</code> attribute defined at extension <code>cms2</code>. */
	private PageTemplateModel _template;
	
	/** <i>Generated variable</i> - Variable of <code>ContentSlotName.validComponentTypes</code> attribute defined at extension <code>cms2</code>. */
	private Set<CMSComponentTypeModel> _validComponentTypes;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ContentSlotNameModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ContentSlotNameModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _name initial attribute declared by type <code>ContentSlotName</code> at extension <code>cms2</code>
	 * @param _template initial attribute declared by type <code>ContentSlotName</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public ContentSlotNameModel(final String _name, final PageTemplateModel _template)
	{
		super();
		setName(_name);
		setTemplate(_template);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _name initial attribute declared by type <code>ContentSlotName</code> at extension <code>cms2</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _template initial attribute declared by type <code>ContentSlotName</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public ContentSlotNameModel(final String _name, final ItemModel _owner, final PageTemplateModel _template)
	{
		super();
		setName(_name);
		setOwner(_owner);
		setTemplate(_template);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentSlotName.compTypeGroup</code> attribute defined at extension <code>cms2</code>. 
	 * @return the compTypeGroup
	 */
	public ComponentTypeGroupModel getCompTypeGroup()
	{
		if (this._compTypeGroup!=null)
		{
			return _compTypeGroup;
		}
		return _compTypeGroup = getPersistenceContext().getValue(COMPTYPEGROUP, _compTypeGroup);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentSlotName.name</code> attribute defined at extension <code>cms2</code>. 
	 * @return the name
	 */
	public String getName()
	{
		if (this._name!=null)
		{
			return _name;
		}
		return _name = getPersistenceContext().getValue(NAME, _name);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentSlotName.template</code> attribute defined at extension <code>cms2</code>. 
	 * @return the template
	 */
	public PageTemplateModel getTemplate()
	{
		if (this._template!=null)
		{
			return _template;
		}
		return _template = getPersistenceContext().getValue(TEMPLATE, _template);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentSlotName.validComponentTypes</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the validComponentTypes
	 */
	@Deprecated
	public Set<CMSComponentTypeModel> getValidComponentTypes()
	{
		if (this._validComponentTypes!=null)
		{
			return _validComponentTypes;
		}
		return _validComponentTypes = getPersistenceContext().getValue(VALIDCOMPONENTTYPES, _validComponentTypes);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ContentSlotName.compTypeGroup</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the compTypeGroup
	 */
	public void setCompTypeGroup(final ComponentTypeGroupModel value)
	{
		_compTypeGroup = getPersistenceContext().setValue(COMPTYPEGROUP, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ContentSlotName.name</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the name
	 */
	public void setName(final String value)
	{
		_name = getPersistenceContext().setValue(NAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>ContentSlotName.template</code> attribute defined at extension <code>cms2</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the template
	 */
	public void setTemplate(final PageTemplateModel value)
	{
		_template = getPersistenceContext().setValue(TEMPLATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ContentSlotName.validComponentTypes</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the validComponentTypes
	 */
	@Deprecated
	public void setValidComponentTypes(final Set<CMSComponentTypeModel> value)
	{
		_validComponentTypes = getPersistenceContext().setValue(VALIDCOMPONENTTYPES, value);
	}
	
}
