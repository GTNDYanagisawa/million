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
package de.hybris.platform.btg.model;

import de.hybris.platform.btg.model.BTGAbstractReferenceOperandModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type BTGReferenceContentpagesOperand first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGReferenceContentpagesOperandModel extends BTGAbstractReferenceOperandModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGReferenceContentpagesOperand";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGReferenceContentpagesOperand.contentpages</code> attribute defined at extension <code>btg</code>. */
	public static final String CONTENTPAGES = "contentpages";
	
	
	/** <i>Generated variable</i> - Variable of <code>BTGReferenceContentpagesOperand.contentpages</code> attribute defined at extension <code>btg</code>. */
	private Collection<ContentPageModel> _contentpages;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGReferenceContentpagesOperandModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGReferenceContentpagesOperandModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _contentpages initial attribute declared by type <code>BTGReferenceContentpagesOperand</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGReferenceContentpagesOperandModel(final CatalogVersionModel _catalogVersion, final Collection<ContentPageModel> _contentpages, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setContentpages(_contentpages);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _contentpages initial attribute declared by type <code>BTGReferenceContentpagesOperand</code> at extension <code>btg</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGReferenceContentpagesOperandModel(final CatalogVersionModel _catalogVersion, final Collection<ContentPageModel> _contentpages, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setContentpages(_contentpages);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGReferenceContentpagesOperand.contentpages</code> attribute defined at extension <code>btg</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the contentpages
	 */
	public Collection<ContentPageModel> getContentpages()
	{
		if (this._contentpages!=null)
		{
			return _contentpages;
		}
		return _contentpages = getPersistenceContext().getValue(CONTENTPAGES, _contentpages);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGReferenceContentpagesOperand.contentpages</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the contentpages
	 */
	public void setContentpages(final Collection<ContentPageModel> value)
	{
		_contentpages = getPersistenceContext().setValue(CONTENTPAGES, value);
	}
	
}
