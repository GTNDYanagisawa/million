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
package de.hybris.platform.cms2.model.contents.contentslot;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.cms2.model.contents.CMSItemModel;
import de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Date;
import java.util.List;

/**
 * Generated model class for type ContentSlot first defined at extension cms2.
 */
@SuppressWarnings("all")
public class ContentSlotModel extends CMSItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ContentSlot";
	
	/** <i>Generated constant</i> - Attribute key of <code>ContentSlot.active</code> attribute defined at extension <code>cms2</code>. */
	public static final String ACTIVE = "active";
	
	/** <i>Generated constant</i> - Attribute key of <code>ContentSlot.activeFrom</code> attribute defined at extension <code>cms2</code>. */
	public static final String ACTIVEFROM = "activeFrom";
	
	/** <i>Generated constant</i> - Attribute key of <code>ContentSlot.activeUntil</code> attribute defined at extension <code>cms2</code>. */
	public static final String ACTIVEUNTIL = "activeUntil";
	
	/** <i>Generated constant</i> - Attribute key of <code>ContentSlot.currentPosition</code> attribute defined at extension <code>cms2</code>. */
	public static final String CURRENTPOSITION = "currentPosition";
	
	/** <i>Generated constant</i> - Attribute key of <code>ContentSlot.cmsComponents</code> attribute defined at extension <code>cms2</code>. */
	public static final String CMSCOMPONENTS = "cmsComponents";
	
	
	/** <i>Generated variable</i> - Variable of <code>ContentSlot.active</code> attribute defined at extension <code>cms2</code>. */
	private Boolean _active;
	
	/** <i>Generated variable</i> - Variable of <code>ContentSlot.activeFrom</code> attribute defined at extension <code>cms2</code>. */
	private Date _activeFrom;
	
	/** <i>Generated variable</i> - Variable of <code>ContentSlot.activeUntil</code> attribute defined at extension <code>cms2</code>. */
	private Date _activeUntil;
	
	/** <i>Generated variable</i> - Variable of <code>ContentSlot.currentPosition</code> attribute defined at extension <code>cms2</code>. */
	private String _currentPosition;
	
	/** <i>Generated variable</i> - Variable of <code>ContentSlot.cmsComponents</code> attribute defined at extension <code>cms2</code>. */
	private List<AbstractCMSComponentModel> _cmsComponents;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ContentSlotModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ContentSlotModel(final ItemModelContext ctx)
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
	public ContentSlotModel(final CatalogVersionModel _catalogVersion, final String _uid)
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
	public ContentSlotModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentSlot.active</code> attribute defined at extension <code>cms2</code>. 
	 * @return the active
	 */
	public Boolean getActive()
	{
		if (this._active!=null)
		{
			return _active;
		}
		return _active = getPersistenceContext().getValue(ACTIVE, _active);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentSlot.activeFrom</code> attribute defined at extension <code>cms2</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>ContentSlot.activeUntil</code> attribute defined at extension <code>cms2</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>ContentSlot.cmsComponents</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the cmsComponents
	 */
	public List<AbstractCMSComponentModel> getCmsComponents()
	{
		if (this._cmsComponents!=null)
		{
			return _cmsComponents;
		}
		return _cmsComponents = getPersistenceContext().getValue(CMSCOMPONENTS, _cmsComponents);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentSlot.currentPosition</code> attribute defined at extension <code>cms2</code>. 
	 * @return the currentPosition
	 */
	@Deprecated
	public String getCurrentPosition()
	{
		if (this._currentPosition!=null)
		{
			return _currentPosition;
		}
		return _currentPosition = getPersistenceContext().getValue(CURRENTPOSITION, _currentPosition);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ContentSlot.active</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the active
	 */
	public void setActive(final Boolean value)
	{
		_active = getPersistenceContext().setValue(ACTIVE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ContentSlot.activeFrom</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the activeFrom
	 */
	public void setActiveFrom(final Date value)
	{
		_activeFrom = getPersistenceContext().setValue(ACTIVEFROM, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ContentSlot.activeUntil</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the activeUntil
	 */
	public void setActiveUntil(final Date value)
	{
		_activeUntil = getPersistenceContext().setValue(ACTIVEUNTIL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ContentSlot.cmsComponents</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the cmsComponents
	 */
	public void setCmsComponents(final List<AbstractCMSComponentModel> value)
	{
		_cmsComponents = getPersistenceContext().setValue(CMSCOMPONENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ContentSlot.currentPosition</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the currentPosition
	 */
	@Deprecated
	public void setCurrentPosition(final String value)
	{
		_currentPosition = getPersistenceContext().setValue(CURRENTPOSITION, value);
	}
	
}
