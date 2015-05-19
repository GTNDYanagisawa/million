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
import de.hybris.platform.print.model.StyleContainerModel;
import de.hybris.platform.print.model.StyleModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type ParagraphStyle first defined at extension print.
 */
@SuppressWarnings("all")
public class ParagraphStyleModel extends StyleModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ParagraphStyle";
	
	/**<i>Generated relation code constant for relation <code>StyleContainer2PStyleRelation</code> defining source attribute <code>styleContainer</code> in extension <code>print</code>.</i>*/
	public final static String _STYLECONTAINER2PSTYLERELATION = "StyleContainer2PStyleRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>ParagraphStyle.styleContainer</code> attribute defined at extension <code>print</code>. */
	public static final String STYLECONTAINER = "styleContainer";
	
	
	/** <i>Generated variable</i> - Variable of <code>ParagraphStyle.styleContainer</code> attribute defined at extension <code>print</code>. */
	private StyleContainerModel _styleContainer;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ParagraphStyleModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ParagraphStyleModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public ParagraphStyleModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ParagraphStyle.styleContainer</code> attribute defined at extension <code>print</code>. 
	 * @return the styleContainer
	 */
	public StyleContainerModel getStyleContainer()
	{
		if (this._styleContainer!=null)
		{
			return _styleContainer;
		}
		return _styleContainer = getPersistenceContext().getValue(STYLECONTAINER, _styleContainer);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ParagraphStyle.styleContainer</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the styleContainer
	 */
	public void setStyleContainer(final StyleContainerModel value)
	{
		_styleContainer = getPersistenceContext().setValue(STYLECONTAINER, value);
	}
	
}
