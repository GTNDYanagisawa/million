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
import de.hybris.platform.cms2.model.contents.CMSItemModel;
import de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel;
import de.hybris.platform.cms2.model.pages.AbstractPageModel;
import de.hybris.platform.cms2.model.restrictions.CMSInverseRestrictionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Locale;

/**
 * Generated model class for type AbstractRestriction first defined at extension cms2.
 */
@SuppressWarnings("all")
public class AbstractRestrictionModel extends CMSItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "AbstractRestriction";
	
	/**<i>Generated relation code constant for relation <code>RestrictionsForPages</code> defining source attribute <code>pages</code> in extension <code>cms2</code>.</i>*/
	public final static String _RESTRICTIONSFORPAGES = "RestrictionsForPages";
	
	/**<i>Generated relation code constant for relation <code>RestrictionsForComponents</code> defining source attribute <code>components</code> in extension <code>cms2</code>.</i>*/
	public final static String _RESTRICTIONSFORCOMPONENTS = "RestrictionsForComponents";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractRestriction.type</code> attribute defined at extension <code>cms2</code>. */
	public static final String TYPE = "type";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractRestriction.typeCode</code> attribute defined at extension <code>cms2</code>. */
	public static final String TYPECODE = "typeCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractRestriction.description</code> attribute defined at extension <code>cms2</code>. */
	public static final String DESCRIPTION = "description";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractRestriction.pages</code> attribute defined at extension <code>cms2</code>. */
	public static final String PAGES = "pages";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractRestriction.components</code> attribute defined at extension <code>cms2</code>. */
	public static final String COMPONENTS = "components";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractRestriction.inverseRestrictions</code> attribute defined at extension <code>cms2</code>. */
	public static final String INVERSERESTRICTIONS = "inverseRestrictions";
	
	
	/** <i>Generated variable</i> - Variable of <code>AbstractRestriction.typeCode</code> attribute defined at extension <code>cms2</code>. */
	private String _typeCode;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractRestriction.description</code> attribute defined at extension <code>cms2</code>. */
	private String _description;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractRestriction.pages</code> attribute defined at extension <code>cms2</code>. */
	private Collection<AbstractPageModel> _pages;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractRestriction.components</code> attribute defined at extension <code>cms2</code>. */
	private Collection<AbstractCMSComponentModel> _components;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractRestriction.inverseRestrictions</code> attribute defined at extension <code>cms2</code>. */
	private Collection<CMSInverseRestrictionModel> _inverseRestrictions;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AbstractRestrictionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AbstractRestrictionModel(final ItemModelContext ctx)
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
	public AbstractRestrictionModel(final CatalogVersionModel _catalogVersion, final String _uid)
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
	public AbstractRestrictionModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRestriction.components</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the components
	 */
	public Collection<AbstractCMSComponentModel> getComponents()
	{
		if (this._components!=null)
		{
			return _components;
		}
		return _components = getPersistenceContext().getValue(COMPONENTS, _components);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRestriction.description</code> dynamic attribute defined at extension <code>cms2</code>. 
	 * @return the description
	 */
	public String getDescription()
	{
		return getPersistenceContext().getDynamicValue(this,DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRestriction.inverseRestrictions</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the inverseRestrictions
	 */
	public Collection<CMSInverseRestrictionModel> getInverseRestrictions()
	{
		if (this._inverseRestrictions!=null)
		{
			return _inverseRestrictions;
		}
		return _inverseRestrictions = getPersistenceContext().getValue(INVERSERESTRICTIONS, _inverseRestrictions);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRestriction.pages</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the pages
	 */
	public Collection<AbstractPageModel> getPages()
	{
		if (this._pages!=null)
		{
			return _pages;
		}
		return _pages = getPersistenceContext().getValue(PAGES, _pages);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRestriction.type</code> attribute defined at extension <code>cms2</code>. 
	 * @return the type
	 */
	@Deprecated
	public String getType()
	{
		return getType(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRestriction.type</code> attribute defined at extension <code>cms2</code>. 
	 * @param loc the value localization key 
	 * @return the type
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Deprecated
	public String getType(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(TYPE, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRestriction.typeCode</code> attribute defined at extension <code>cms2</code>. 
	 * @return the typeCode
	 */
	@Deprecated
	public String getTypeCode()
	{
		if (this._typeCode!=null)
		{
			return _typeCode;
		}
		return _typeCode = getPersistenceContext().getValue(TYPECODE, _typeCode);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractRestriction.components</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the components
	 */
	public void setComponents(final Collection<AbstractCMSComponentModel> value)
	{
		_components = getPersistenceContext().setValue(COMPONENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractRestriction.inverseRestrictions</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the inverseRestrictions
	 */
	public void setInverseRestrictions(final Collection<CMSInverseRestrictionModel> value)
	{
		_inverseRestrictions = getPersistenceContext().setValue(INVERSERESTRICTIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractRestriction.pages</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the pages
	 */
	public void setPages(final Collection<AbstractPageModel> value)
	{
		_pages = getPersistenceContext().setValue(PAGES, value);
	}
	
}
