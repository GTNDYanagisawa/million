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
package de.hybris.platform.core.model.media;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Locale;

/**
 * Generated model class for type MediaContainer first defined at extension core.
 */
@SuppressWarnings("all")
public class MediaContainerModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "MediaContainer";
	
	/** <i>Generated constant</i> - Attribute key of <code>MediaContainer.qualifier</code> attribute defined at extension <code>core</code>. */
	public static final String QUALIFIER = "qualifier";
	
	/** <i>Generated constant</i> - Attribute key of <code>MediaContainer.name</code> attribute defined at extension <code>core</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>MediaContainer.medias</code> attribute defined at extension <code>core</code>. */
	public static final String MEDIAS = "medias";
	
	/** <i>Generated constant</i> - Attribute key of <code>MediaContainer.catalogVersion</code> attribute defined at extension <code>catalog</code>. */
	public static final String CATALOGVERSION = "catalogVersion";
	
	
	/** <i>Generated variable</i> - Variable of <code>MediaContainer.qualifier</code> attribute defined at extension <code>core</code>. */
	private String _qualifier;
	
	/** <i>Generated variable</i> - Variable of <code>MediaContainer.medias</code> attribute defined at extension <code>core</code>. */
	private Collection<MediaModel> _medias;
	
	/** <i>Generated variable</i> - Variable of <code>MediaContainer.catalogVersion</code> attribute defined at extension <code>catalog</code>. */
	private CatalogVersionModel _catalogVersion;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public MediaContainerModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public MediaContainerModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>MediaContainer</code> at extension <code>catalog</code>
	 * @param _qualifier initial attribute declared by type <code>MediaContainer</code> at extension <code>core</code>
	 */
	@Deprecated
	public MediaContainerModel(final CatalogVersionModel _catalogVersion, final String _qualifier)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setQualifier(_qualifier);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>MediaContainer</code> at extension <code>catalog</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _qualifier initial attribute declared by type <code>MediaContainer</code> at extension <code>core</code>
	 */
	@Deprecated
	public MediaContainerModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final String _qualifier)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setQualifier(_qualifier);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MediaContainer.catalogVersion</code> attribute defined at extension <code>catalog</code>. 
	 * @return the catalogVersion
	 */
	public CatalogVersionModel getCatalogVersion()
	{
		if (this._catalogVersion!=null)
		{
			return _catalogVersion;
		}
		return _catalogVersion = getPersistenceContext().getValue(CATALOGVERSION, _catalogVersion);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MediaContainer.medias</code> attribute defined at extension <code>core</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the medias
	 */
	public Collection<MediaModel> getMedias()
	{
		if (this._medias!=null)
		{
			return _medias;
		}
		return _medias = getPersistenceContext().getValue(MEDIAS, _medias);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MediaContainer.name</code> attribute defined at extension <code>core</code>. 
	 * @return the name - Name of this container
	 */
	public String getName()
	{
		return getName(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>MediaContainer.name</code> attribute defined at extension <code>core</code>. 
	 * @param loc the value localization key 
	 * @return the name - Name of this container
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getName(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(NAME, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MediaContainer.qualifier</code> attribute defined at extension <code>core</code>. 
	 * @return the qualifier - Qualifying name of this container
	 */
	public String getQualifier()
	{
		if (this._qualifier!=null)
		{
			return _qualifier;
		}
		return _qualifier = getPersistenceContext().getValue(QUALIFIER, _qualifier);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MediaContainer.catalogVersion</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the catalogVersion
	 */
	public void setCatalogVersion(final CatalogVersionModel value)
	{
		_catalogVersion = getPersistenceContext().setValue(CATALOGVERSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MediaContainer.medias</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the medias
	 */
	public void setMedias(final Collection<MediaModel> value)
	{
		_medias = getPersistenceContext().setValue(MEDIAS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MediaContainer.name</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the name - Name of this container
	 */
	public void setName(final String value)
	{
		setName(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>MediaContainer.name</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the name - Name of this container
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setName(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(NAME, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MediaContainer.qualifier</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the qualifier - Qualifying name of this container
	 */
	public void setQualifier(final String value)
	{
		_qualifier = getPersistenceContext().setValue(QUALIFIER, value);
	}
	
}
