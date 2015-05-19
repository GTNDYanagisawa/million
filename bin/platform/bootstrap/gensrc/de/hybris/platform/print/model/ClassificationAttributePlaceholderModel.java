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

import de.hybris.platform.catalog.model.classification.ClassAttributeAssignmentModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.print.model.CometConfigurationModel;
import de.hybris.platform.print.model.PlaceholderModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type ClassificationAttributePlaceholder first defined at extension print.
 */
@SuppressWarnings("all")
public class ClassificationAttributePlaceholderModel extends PlaceholderModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ClassificationAttributePlaceholder";
	
	/** <i>Generated constant</i> - Attribute key of <code>ClassificationAttributePlaceholder.classAttributeAssignment</code> attribute defined at extension <code>print</code>. */
	public static final String CLASSATTRIBUTEASSIGNMENT = "classAttributeAssignment";
	
	
	/** <i>Generated variable</i> - Variable of <code>ClassificationAttributePlaceholder.classAttributeAssignment</code> attribute defined at extension <code>print</code>. */
	private ClassAttributeAssignmentModel _classAttributeAssignment;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ClassificationAttributePlaceholderModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ClassificationAttributePlaceholderModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _cometConfig initial attribute declared by type <code>Placeholder</code> at extension <code>print</code>
	 * @param _qualifier initial attribute declared by type <code>Placeholder</code> at extension <code>print</code>
	 */
	@Deprecated
	public ClassificationAttributePlaceholderModel(final CometConfigurationModel _cometConfig, final String _qualifier)
	{
		super();
		setCometConfig(_cometConfig);
		setQualifier(_qualifier);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _cometConfig initial attribute declared by type <code>Placeholder</code> at extension <code>print</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _qualifier initial attribute declared by type <code>Placeholder</code> at extension <code>print</code>
	 */
	@Deprecated
	public ClassificationAttributePlaceholderModel(final CometConfigurationModel _cometConfig, final ItemModel _owner, final String _qualifier)
	{
		super();
		setCometConfig(_cometConfig);
		setOwner(_owner);
		setQualifier(_qualifier);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClassificationAttributePlaceholder.classAttributeAssignment</code> attribute defined at extension <code>print</code>. 
	 * @return the classAttributeAssignment
	 */
	public ClassAttributeAssignmentModel getClassAttributeAssignment()
	{
		if (this._classAttributeAssignment!=null)
		{
			return _classAttributeAssignment;
		}
		return _classAttributeAssignment = getPersistenceContext().getValue(CLASSATTRIBUTEASSIGNMENT, _classAttributeAssignment);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ClassificationAttributePlaceholder.classAttributeAssignment</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the classAttributeAssignment
	 */
	public void setClassAttributeAssignment(final ClassAttributeAssignmentModel value)
	{
		_classAttributeAssignment = getPersistenceContext().setValue(CLASSATTRIBUTEASSIGNMENT, value);
	}
	
}
