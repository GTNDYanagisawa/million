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
package de.hybris.platform.print.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.type.AttributeDescriptorModel;
import de.hybris.platform.print.model.CometConfigurationModel;
import de.hybris.platform.print.model.PlaceholderModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.List;

/**
 * Generated model class for type AttributePlaceholder first defined at extension print.
 */
@SuppressWarnings("all")
public class AttributePlaceholderModel extends PlaceholderModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "AttributePlaceholder";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributePlaceholder.attributeQualifierPath</code> attribute defined at extension <code>print</code>. */
	public static final String ATTRIBUTEQUALIFIERPATH = "attributeQualifierPath";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributePlaceholder.attributeDescriptorList</code> attribute defined at extension <code>print</code>. */
	public static final String ATTRIBUTEDESCRIPTORLIST = "attributeDescriptorList";
	
	
	/** <i>Generated variable</i> - Variable of <code>AttributePlaceholder.attributeQualifierPath</code> attribute defined at extension <code>print</code>. */
	private String _attributeQualifierPath;
	
	/** <i>Generated variable</i> - Variable of <code>AttributePlaceholder.attributeDescriptorList</code> attribute defined at extension <code>print</code>. */
	private List<AttributeDescriptorModel> _attributeDescriptorList;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AttributePlaceholderModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AttributePlaceholderModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _attributeQualifierPath initial attribute declared by type <code>AttributePlaceholder</code> at extension <code>print</code>
	 * @param _cometConfig initial attribute declared by type <code>Placeholder</code> at extension <code>print</code>
	 * @param _qualifier initial attribute declared by type <code>Placeholder</code> at extension <code>print</code>
	 */
	@Deprecated
	public AttributePlaceholderModel(final String _attributeQualifierPath, final CometConfigurationModel _cometConfig, final String _qualifier)
	{
		super();
		setAttributeQualifierPath(_attributeQualifierPath);
		setCometConfig(_cometConfig);
		setQualifier(_qualifier);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _attributeQualifierPath initial attribute declared by type <code>AttributePlaceholder</code> at extension <code>print</code>
	 * @param _cometConfig initial attribute declared by type <code>Placeholder</code> at extension <code>print</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _qualifier initial attribute declared by type <code>Placeholder</code> at extension <code>print</code>
	 */
	@Deprecated
	public AttributePlaceholderModel(final String _attributeQualifierPath, final CometConfigurationModel _cometConfig, final ItemModel _owner, final String _qualifier)
	{
		super();
		setAttributeQualifierPath(_attributeQualifierPath);
		setCometConfig(_cometConfig);
		setOwner(_owner);
		setQualifier(_qualifier);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributePlaceholder.attributeDescriptorList</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the attributeDescriptorList
	 */
	public List<AttributeDescriptorModel> getAttributeDescriptorList()
	{
		if (this._attributeDescriptorList!=null)
		{
			return _attributeDescriptorList;
		}
		return _attributeDescriptorList = getPersistenceContext().getValue(ATTRIBUTEDESCRIPTORLIST, _attributeDescriptorList);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributePlaceholder.attributeQualifierPath</code> attribute defined at extension <code>print</code>. 
	 * @return the attributeQualifierPath
	 */
	public String getAttributeQualifierPath()
	{
		if (this._attributeQualifierPath!=null)
		{
			return _attributeQualifierPath;
		}
		return _attributeQualifierPath = getPersistenceContext().getValue(ATTRIBUTEQUALIFIERPATH, _attributeQualifierPath);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AttributePlaceholder.attributeQualifierPath</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the attributeQualifierPath
	 */
	public void setAttributeQualifierPath(final String value)
	{
		_attributeQualifierPath = getPersistenceContext().setValue(ATTRIBUTEQUALIFIERPATH, value);
	}
	
}
