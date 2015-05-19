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
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type BTGReferenceStringListOperand first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGReferenceStringListOperandModel extends BTGAbstractReferenceOperandModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGReferenceStringListOperand";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGReferenceStringListOperand.stringList</code> attribute defined at extension <code>btg</code>. */
	public static final String STRINGLIST = "stringList";
	
	
	/** <i>Generated variable</i> - Variable of <code>BTGReferenceStringListOperand.stringList</code> attribute defined at extension <code>btg</code>. */
	private Collection<String> _stringList;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGReferenceStringListOperandModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGReferenceStringListOperandModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _stringList initial attribute declared by type <code>BTGReferenceStringListOperand</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGReferenceStringListOperandModel(final CatalogVersionModel _catalogVersion, final Collection<String> _stringList, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setStringList(_stringList);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _stringList initial attribute declared by type <code>BTGReferenceStringListOperand</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGReferenceStringListOperandModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final Collection<String> _stringList, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setStringList(_stringList);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGReferenceStringListOperand.stringList</code> attribute defined at extension <code>btg</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the stringList
	 */
	public Collection<String> getStringList()
	{
		if (this._stringList!=null)
		{
			return _stringList;
		}
		return _stringList = getPersistenceContext().getValue(STRINGLIST, _stringList);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGReferenceStringListOperand.stringList</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the stringList
	 */
	public void setStringList(final Collection<String> value)
	{
		_stringList = getPersistenceContext().setValue(STRINGLIST, value);
	}
	
}
