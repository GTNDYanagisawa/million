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

import de.hybris.platform.btg.model.BTGOutputActionDefinitionModel;
import de.hybris.platform.btg.model.restrictions.BtgSegmentRestrictionModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.enums.ActionType;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type CmsRestrictionActionDefinition first defined at extension btg.
 */
@SuppressWarnings("all")
public class CmsRestrictionActionDefinitionModel extends BTGOutputActionDefinitionModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CmsRestrictionActionDefinition";
	
	/** <i>Generated constant</i> - Attribute key of <code>CmsRestrictionActionDefinition.inverted</code> attribute defined at extension <code>btg</code>. */
	public static final String INVERTED = "inverted";
	
	/** <i>Generated constant</i> - Attribute key of <code>CmsRestrictionActionDefinition.segmentRestrictions</code> attribute defined at extension <code>btg</code>. */
	public static final String SEGMENTRESTRICTIONS = "segmentRestrictions";
	
	
	/** <i>Generated variable</i> - Variable of <code>CmsRestrictionActionDefinition.inverted</code> attribute defined at extension <code>btg</code>. */
	private Boolean _inverted;
	
	/** <i>Generated variable</i> - Variable of <code>CmsRestrictionActionDefinition.segmentRestrictions</code> attribute defined at extension <code>btg</code>. */
	private Collection<BtgSegmentRestrictionModel> _segmentRestrictions;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CmsRestrictionActionDefinitionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CmsRestrictionActionDefinitionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGOutputActionDefinition</code> at extension <code>btg</code>
	 * @param _code initial attribute declared by type <code>AbstractAction</code> at extension <code>processing</code>
	 * @param _target initial attribute declared by type <code>AbstractAction</code> at extension <code>processing</code>
	 * @param _type initial attribute declared by type <code>BTGOutputActionDefinition</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGOutputActionDefinition</code> at extension <code>btg</code>
	 */
	@Deprecated
	public CmsRestrictionActionDefinitionModel(final CatalogVersionModel _catalogVersion, final String _code, final String _target, final ActionType _type, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCode(_code);
		setTarget(_target);
		setType(_type);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGOutputActionDefinition</code> at extension <code>btg</code>
	 * @param _code initial attribute declared by type <code>AbstractAction</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _target initial attribute declared by type <code>AbstractAction</code> at extension <code>processing</code>
	 * @param _type initial attribute declared by type <code>BTGOutputActionDefinition</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGOutputActionDefinition</code> at extension <code>btg</code>
	 */
	@Deprecated
	public CmsRestrictionActionDefinitionModel(final CatalogVersionModel _catalogVersion, final String _code, final ItemModel _owner, final String _target, final ActionType _type, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCode(_code);
		setOwner(_owner);
		setTarget(_target);
		setType(_type);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CmsRestrictionActionDefinition.inverted</code> attribute defined at extension <code>btg</code>. 
	 * @return the inverted
	 */
	public Boolean getInverted()
	{
		if (this._inverted!=null)
		{
			return _inverted;
		}
		return _inverted = getPersistenceContext().getValue(INVERTED, _inverted);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CmsRestrictionActionDefinition.segmentRestrictions</code> attribute defined at extension <code>btg</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the segmentRestrictions
	 */
	public Collection<BtgSegmentRestrictionModel> getSegmentRestrictions()
	{
		if (this._segmentRestrictions!=null)
		{
			return _segmentRestrictions;
		}
		return _segmentRestrictions = getPersistenceContext().getValue(SEGMENTRESTRICTIONS, _segmentRestrictions);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CmsRestrictionActionDefinition.inverted</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the inverted
	 */
	public void setInverted(final Boolean value)
	{
		_inverted = getPersistenceContext().setValue(INVERTED, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CmsRestrictionActionDefinition.segmentRestrictions</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the segmentRestrictions
	 */
	public void setSegmentRestrictions(final Collection<BtgSegmentRestrictionModel> value)
	{
		_segmentRestrictions = getPersistenceContext().setValue(SEGMENTRESTRICTIONS, value);
	}
	
}
