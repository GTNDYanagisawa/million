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
 * Generated model class for type BTGReferenceKeyValuePairListOperand first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGReferenceKeyValuePairListOperandModel extends BTGAbstractReferenceOperandModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGReferenceKeyValuePairListOperand";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGReferenceKeyValuePairListOperand.keyValuePairs</code> attribute defined at extension <code>btg</code>. */
	public static final String KEYVALUEPAIRS = "keyValuePairs";
	
	
	/** <i>Generated variable</i> - Variable of <code>BTGReferenceKeyValuePairListOperand.keyValuePairs</code> attribute defined at extension <code>btg</code>. */
	private Collection<String> _keyValuePairs;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGReferenceKeyValuePairListOperandModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGReferenceKeyValuePairListOperandModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _keyValuePairs initial attribute declared by type <code>BTGReferenceKeyValuePairListOperand</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGReferenceKeyValuePairListOperandModel(final CatalogVersionModel _catalogVersion, final Collection<String> _keyValuePairs, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setKeyValuePairs(_keyValuePairs);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _keyValuePairs initial attribute declared by type <code>BTGReferenceKeyValuePairListOperand</code> at extension <code>btg</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGReferenceKeyValuePairListOperandModel(final CatalogVersionModel _catalogVersion, final Collection<String> _keyValuePairs, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setKeyValuePairs(_keyValuePairs);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGReferenceKeyValuePairListOperand.keyValuePairs</code> attribute defined at extension <code>btg</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the keyValuePairs
	 */
	public Collection<String> getKeyValuePairs()
	{
		if (this._keyValuePairs!=null)
		{
			return _keyValuePairs;
		}
		return _keyValuePairs = getPersistenceContext().getValue(KEYVALUEPAIRS, _keyValuePairs);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGReferenceKeyValuePairListOperand.keyValuePairs</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the keyValuePairs
	 */
	public void setKeyValuePairs(final Collection<String> value)
	{
		_keyValuePairs = getPersistenceContext().setValue(KEYVALUEPAIRS, value);
	}
	
}
