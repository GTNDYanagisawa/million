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
package de.hybris.platform.importcockpit.model;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.impex.model.ImpExMediaModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type ImportCockpitInputMedia first defined at extension importcockpit.
 */
@SuppressWarnings("all")
public class ImportCockpitInputMediaModel extends ImpExMediaModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ImportCockpitInputMedia";
	
	/** <i>Generated constant</i> - Attribute key of <code>ImportCockpitInputMedia.hasHeaderLine</code> attribute defined at extension <code>importcockpit</code>. */
	public static final String HASHEADERLINE = "hasHeaderLine";
	
	
	/** <i>Generated variable</i> - Variable of <code>ImportCockpitInputMedia.hasHeaderLine</code> attribute defined at extension <code>importcockpit</code>. */
	private Boolean _hasHeaderLine;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ImportCockpitInputMediaModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ImportCockpitInputMediaModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>ImpExMedia</code> at extension <code>catalog</code>
	 * @param _code initial attribute declared by type <code>Media</code> at extension <code>core</code>
	 * @param _linesToSkip initial attribute declared by type <code>ImpExMedia</code> at extension <code>impex</code>
	 * @param _removeOnSuccess initial attribute declared by type <code>ImpExMedia</code> at extension <code>impex</code>
	 */
	@Deprecated
	public ImportCockpitInputMediaModel(final CatalogVersionModel _catalogVersion, final String _code, final int _linesToSkip, final boolean _removeOnSuccess)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCode(_code);
		setLinesToSkip(_linesToSkip);
		setRemoveOnSuccess(_removeOnSuccess);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>ImpExMedia</code> at extension <code>catalog</code>
	 * @param _code initial attribute declared by type <code>Media</code> at extension <code>core</code>
	 * @param _linesToSkip initial attribute declared by type <code>ImpExMedia</code> at extension <code>impex</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _removeOnSuccess initial attribute declared by type <code>ImpExMedia</code> at extension <code>impex</code>
	 */
	@Deprecated
	public ImportCockpitInputMediaModel(final CatalogVersionModel _catalogVersion, final String _code, final int _linesToSkip, final ItemModel _owner, final boolean _removeOnSuccess)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCode(_code);
		setLinesToSkip(_linesToSkip);
		setOwner(_owner);
		setRemoveOnSuccess(_removeOnSuccess);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImportCockpitInputMedia.hasHeaderLine</code> attribute defined at extension <code>importcockpit</code>. 
	 * @return the hasHeaderLine
	 */
	public boolean isHasHeaderLine()
	{
		return toPrimitive( _hasHeaderLine = getPersistenceContext().getValue(HASHEADERLINE, _hasHeaderLine));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ImportCockpitInputMedia.hasHeaderLine</code> attribute defined at extension <code>importcockpit</code>. 
	 *  
	 * @param value the hasHeaderLine
	 */
	public void setHasHeaderLine(final boolean value)
	{
		_hasHeaderLine = getPersistenceContext().setValue(HASHEADERLINE, toObject(value));
	}
	
}
