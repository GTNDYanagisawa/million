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
package de.hybris.platform.cms2.model.restrictions;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.cms2.model.restrictions.AbstractRestrictionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Date;

/**
 * Generated model class for type CMSTimeRestriction first defined at extension cms2.
 */
@SuppressWarnings("all")
public class CMSTimeRestrictionModel extends AbstractRestrictionModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CMSTimeRestriction";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSTimeRestriction.activeFrom</code> attribute defined at extension <code>cms2</code>. */
	public static final String ACTIVEFROM = "activeFrom";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSTimeRestriction.activeUntil</code> attribute defined at extension <code>cms2</code>. */
	public static final String ACTIVEUNTIL = "activeUntil";
	
	
	/** <i>Generated variable</i> - Variable of <code>CMSTimeRestriction.activeFrom</code> attribute defined at extension <code>cms2</code>. */
	private Date _activeFrom;
	
	/** <i>Generated variable</i> - Variable of <code>CMSTimeRestriction.activeUntil</code> attribute defined at extension <code>cms2</code>. */
	private Date _activeUntil;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CMSTimeRestrictionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CMSTimeRestrictionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public CMSTimeRestrictionModel(final CatalogVersionModel _catalogVersion, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public CMSTimeRestrictionModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSTimeRestriction.activeFrom</code> attribute defined at extension <code>cms2</code>. 
	 * @return the activeFrom
	 */
	public Date getActiveFrom()
	{
		if (this._activeFrom!=null)
		{
			return _activeFrom;
		}
		return _activeFrom = getPersistenceContext().getValue(ACTIVEFROM, _activeFrom);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSTimeRestriction.activeUntil</code> attribute defined at extension <code>cms2</code>. 
	 * @return the activeUntil
	 */
	public Date getActiveUntil()
	{
		if (this._activeUntil!=null)
		{
			return _activeUntil;
		}
		return _activeUntil = getPersistenceContext().getValue(ACTIVEUNTIL, _activeUntil);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSTimeRestriction.activeFrom</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the activeFrom
	 */
	public void setActiveFrom(final Date value)
	{
		_activeFrom = getPersistenceContext().setValue(ACTIVEFROM, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSTimeRestriction.activeUntil</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the activeUntil
	 */
	public void setActiveUntil(final Date value)
	{
		_activeUntil = getPersistenceContext().setValue(ACTIVEUNTIL, value);
	}
	
}
