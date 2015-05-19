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

import de.hybris.platform.btg.model.BTGAbstractScriptOperandModel;
import de.hybris.platform.btg.model.ScriptMediaModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type BTGMediaScriptOperand first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGMediaScriptOperandModel extends BTGAbstractScriptOperandModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGMediaScriptOperand";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGMediaScriptOperand.scriptMedia</code> attribute defined at extension <code>btg</code>. */
	public static final String SCRIPTMEDIA = "scriptMedia";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGMediaScriptOperand.collection</code> attribute defined at extension <code>btg</code>. */
	public static final String COLLECTION = "collection";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGMediaScriptOperand.returnType</code> attribute defined at extension <code>btg</code>. */
	public static final String RETURNTYPE = "returnType";
	
	
	/** <i>Generated variable</i> - Variable of <code>BTGMediaScriptOperand.scriptMedia</code> attribute defined at extension <code>btg</code>. */
	private ScriptMediaModel _scriptMedia;
	
	/** <i>Generated variable</i> - Variable of <code>BTGMediaScriptOperand.collection</code> attribute defined at extension <code>btg</code>. */
	private Boolean _collection;
	
	/** <i>Generated variable</i> - Variable of <code>BTGMediaScriptOperand.returnType</code> attribute defined at extension <code>btg</code>. */
	private Class _returnType;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGMediaScriptOperandModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGMediaScriptOperandModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _collection initial attribute declared by type <code>BTGMediaScriptOperand</code> at extension <code>btg</code>
	 * @param _returnType initial attribute declared by type <code>BTGMediaScriptOperand</code> at extension <code>btg</code>
	 * @param _scriptMedia initial attribute declared by type <code>BTGMediaScriptOperand</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGMediaScriptOperandModel(final CatalogVersionModel _catalogVersion, final boolean _collection, final Class _returnType, final ScriptMediaModel _scriptMedia, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCollection(_collection);
		setReturnType(_returnType);
		setScriptMedia(_scriptMedia);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _collection initial attribute declared by type <code>BTGMediaScriptOperand</code> at extension <code>btg</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _returnType initial attribute declared by type <code>BTGMediaScriptOperand</code> at extension <code>btg</code>
	 * @param _scriptMedia initial attribute declared by type <code>BTGMediaScriptOperand</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGMediaScriptOperandModel(final CatalogVersionModel _catalogVersion, final boolean _collection, final ItemModel _owner, final Class _returnType, final ScriptMediaModel _scriptMedia, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCollection(_collection);
		setOwner(_owner);
		setReturnType(_returnType);
		setScriptMedia(_scriptMedia);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGMediaScriptOperand.returnType</code> attribute defined at extension <code>btg</code>. 
	 * @return the returnType
	 */
	public Class getReturnType()
	{
		if (this._returnType!=null)
		{
			return _returnType;
		}
		return _returnType = getPersistenceContext().getValue(RETURNTYPE, _returnType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGMediaScriptOperand.scriptMedia</code> attribute defined at extension <code>btg</code>. 
	 * @return the scriptMedia
	 */
	public ScriptMediaModel getScriptMedia()
	{
		if (this._scriptMedia!=null)
		{
			return _scriptMedia;
		}
		return _scriptMedia = getPersistenceContext().getValue(SCRIPTMEDIA, _scriptMedia);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGMediaScriptOperand.collection</code> attribute defined at extension <code>btg</code>. 
	 * @return the collection
	 */
	public boolean isCollection()
	{
		return toPrimitive( _collection = getPersistenceContext().getValue(COLLECTION, _collection));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGMediaScriptOperand.collection</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the collection
	 */
	public void setCollection(final boolean value)
	{
		_collection = getPersistenceContext().setValue(COLLECTION, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGMediaScriptOperand.returnType</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the returnType
	 */
	public void setReturnType(final Class value)
	{
		_returnType = getPersistenceContext().setValue(RETURNTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGMediaScriptOperand.scriptMedia</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the scriptMedia
	 */
	public void setScriptMedia(final ScriptMediaModel value)
	{
		_scriptMedia = getPersistenceContext().setValue(SCRIPTMEDIA, value);
	}
	
}
