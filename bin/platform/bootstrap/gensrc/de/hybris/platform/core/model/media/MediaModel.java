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
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.media.AbstractMediaModel;
import de.hybris.platform.core.model.media.DerivedMediaModel;
import de.hybris.platform.core.model.media.MediaContainerModel;
import de.hybris.platform.core.model.media.MediaFolderModel;
import de.hybris.platform.core.model.media.MediaFormatModel;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.core.model.security.PrincipalModel;
import de.hybris.platform.print.model.PublicationModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type Media first defined at extension core.
 */
@SuppressWarnings("all")
public class MediaModel extends AbstractMediaModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "Media";
	
	/**<i>Generated relation code constant for relation <code>MediaContainer2MediaRel</code> defining source attribute <code>mediaContainer</code> in extension <code>core</code>.</i>*/
	public final static String _MEDIACONTAINER2MEDIAREL = "MediaContainer2MediaRel";
	
	/**<i>Generated relation code constant for relation <code>CategoryMediaRelation</code> defining source attribute <code>supercategories</code> in extension <code>catalog</code>.</i>*/
	public final static String _CATEGORYMEDIARELATION = "CategoryMediaRelation";
	
	/**<i>Generated relation code constant for relation <code>Publication2Media</code> defining source attribute <code>publication</code> in extension <code>print</code>.</i>*/
	public final static String _PUBLICATION2MEDIA = "Publication2Media";
	
	/** <i>Generated constant</i> - Attribute key of <code>Media.code</code> attribute defined at extension <code>core</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>Media.internalURL</code> attribute defined at extension <code>core</code>. */
	public static final String INTERNALURL = "internalURL";
	
	/** <i>Generated constant</i> - Attribute key of <code>Media.URL</code> attribute defined at extension <code>core</code>. */
	public static final String URL = "URL";
	
	/** <i>Generated constant</i> - Attribute key of <code>Media.URL2</code> attribute defined at extension <code>core</code>. */
	public static final String URL2 = "URL2";
	
	/** <i>Generated constant</i> - Attribute key of <code>Media.downloadURL</code> attribute defined at extension <code>core</code>. */
	public static final String DOWNLOADURL = "downloadURL";
	
	/** <i>Generated constant</i> - Attribute key of <code>Media.description</code> attribute defined at extension <code>core</code>. */
	public static final String DESCRIPTION = "description";
	
	/** <i>Generated constant</i> - Attribute key of <code>Media.altText</code> attribute defined at extension <code>core</code>. */
	public static final String ALTTEXT = "altText";
	
	/** <i>Generated constant</i> - Attribute key of <code>Media.removable</code> attribute defined at extension <code>core</code>. */
	public static final String REMOVABLE = "removable";
	
	/** <i>Generated constant</i> - Attribute key of <code>Media.mediaFormat</code> attribute defined at extension <code>core</code>. */
	public static final String MEDIAFORMAT = "mediaFormat";
	
	/** <i>Generated constant</i> - Attribute key of <code>Media.folder</code> attribute defined at extension <code>core</code>. */
	public static final String FOLDER = "folder";
	
	/** <i>Generated constant</i> - Attribute key of <code>Media.subFolderPath</code> attribute defined at extension <code>core</code>. */
	public static final String SUBFOLDERPATH = "subFolderPath";
	
	/** <i>Generated constant</i> - Attribute key of <code>Media.foreignDataOwners</code> attribute defined at extension <code>core</code>. */
	public static final String FOREIGNDATAOWNERS = "foreignDataOwners";
	
	/** <i>Generated constant</i> - Attribute key of <code>Media.permittedPrincipals</code> attribute defined at extension <code>core</code>. */
	public static final String PERMITTEDPRINCIPALS = "permittedPrincipals";
	
	/** <i>Generated constant</i> - Attribute key of <code>Media.deniedPrincipals</code> attribute defined at extension <code>core</code>. */
	public static final String DENIEDPRINCIPALS = "deniedPrincipals";
	
	/** <i>Generated constant</i> - Attribute key of <code>Media.mediaContainer</code> attribute defined at extension <code>core</code>. */
	public static final String MEDIACONTAINER = "mediaContainer";
	
	/** <i>Generated constant</i> - Attribute key of <code>Media.derivedMedias</code> attribute defined at extension <code>core</code>. */
	public static final String DERIVEDMEDIAS = "derivedMedias";
	
	/** <i>Generated constant</i> - Attribute key of <code>Media.catalogVersion</code> attribute defined at extension <code>catalog</code>. */
	public static final String CATALOGVERSION = "catalogVersion";
	
	/** <i>Generated constant</i> - Attribute key of <code>Media.supercategories</code> attribute defined at extension <code>catalog</code>. */
	public static final String SUPERCATEGORIES = "supercategories";
	
	/** <i>Generated constant</i> - Attribute key of <code>Media.publication</code> attribute defined at extension <code>print</code>. */
	public static final String PUBLICATION = "publication";
	
	
	/** <i>Generated variable</i> - Variable of <code>Media.code</code> attribute defined at extension <code>core</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>Media.internalURL</code> attribute defined at extension <code>core</code>. */
	private String _internalURL;
	
	/** <i>Generated variable</i> - Variable of <code>Media.URL</code> attribute defined at extension <code>core</code>. */
	private String _URL;
	
	/** <i>Generated variable</i> - Variable of <code>Media.URL2</code> attribute defined at extension <code>core</code>. */
	private String _URL2;
	
	/** <i>Generated variable</i> - Variable of <code>Media.downloadURL</code> attribute defined at extension <code>core</code>. */
	private String _downloadURL;
	
	/** <i>Generated variable</i> - Variable of <code>Media.description</code> attribute defined at extension <code>core</code>. */
	private String _description;
	
	/** <i>Generated variable</i> - Variable of <code>Media.altText</code> attribute defined at extension <code>core</code>. */
	private String _altText;
	
	/** <i>Generated variable</i> - Variable of <code>Media.removable</code> attribute defined at extension <code>core</code>. */
	private Boolean _removable;
	
	/** <i>Generated variable</i> - Variable of <code>Media.mediaFormat</code> attribute defined at extension <code>core</code>. */
	private MediaFormatModel _mediaFormat;
	
	/** <i>Generated variable</i> - Variable of <code>Media.folder</code> attribute defined at extension <code>core</code>. */
	private MediaFolderModel _folder;
	
	/** <i>Generated variable</i> - Variable of <code>Media.subFolderPath</code> attribute defined at extension <code>core</code>. */
	private String _subFolderPath;
	
	/** <i>Generated variable</i> - Variable of <code>Media.foreignDataOwners</code> attribute defined at extension <code>core</code>. */
	private Collection<MediaModel> _foreignDataOwners;
	
	/** <i>Generated variable</i> - Variable of <code>Media.permittedPrincipals</code> attribute defined at extension <code>core</code>. */
	private Collection<PrincipalModel> _permittedPrincipals;
	
	/** <i>Generated variable</i> - Variable of <code>Media.deniedPrincipals</code> attribute defined at extension <code>core</code>. */
	private Collection<PrincipalModel> _deniedPrincipals;
	
	/** <i>Generated variable</i> - Variable of <code>Media.mediaContainer</code> attribute defined at extension <code>core</code>. */
	private MediaContainerModel _mediaContainer;
	
	/** <i>Generated variable</i> - Variable of <code>Media.derivedMedias</code> attribute defined at extension <code>core</code>. */
	private Collection<DerivedMediaModel> _derivedMedias;
	
	/** <i>Generated variable</i> - Variable of <code>Media.catalogVersion</code> attribute defined at extension <code>catalog</code>. */
	private CatalogVersionModel _catalogVersion;
	
	/** <i>Generated variable</i> - Variable of <code>Media.supercategories</code> attribute defined at extension <code>catalog</code>. */
	private Collection<CategoryModel> _supercategories;
	
	/** <i>Generated variable</i> - Variable of <code>Media.publication</code> attribute defined at extension <code>print</code>. */
	private Collection<PublicationModel> _publication;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public MediaModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public MediaModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>Media</code> at extension <code>catalog</code>
	 * @param _code initial attribute declared by type <code>Media</code> at extension <code>core</code>
	 */
	@Deprecated
	public MediaModel(final CatalogVersionModel _catalogVersion, final String _code)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>Media</code> at extension <code>catalog</code>
	 * @param _code initial attribute declared by type <code>Media</code> at extension <code>core</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public MediaModel(final CatalogVersionModel _catalogVersion, final String _code, final ItemModel _owner)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.altText</code> attribute defined at extension <code>core</code>. 
	 * @return the altText
	 */
	public String getAltText()
	{
		if (this._altText!=null)
		{
			return _altText;
		}
		return _altText = getPersistenceContext().getValue(ALTTEXT, _altText);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.altText</code> attribute defined at extension <code>core</code>. 
	 * @return the altText
	 * @deprecated use {@link #getAltText()} instead
	 */
	@Deprecated
	public String getAlttext()
	{
		return this.getAltText();
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.catalogVersion</code> attribute defined at extension <code>catalog</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Media.code</code> attribute defined at extension <code>core</code>. 
	 * @return the code - Code of media
	 */
	public String getCode()
	{
		if (this._code!=null)
		{
			return _code;
		}
		return _code = getPersistenceContext().getValue(CODE, _code);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.deniedPrincipals</code> attribute defined at extension <code>core</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the deniedPrincipals
	 */
	public Collection<PrincipalModel> getDeniedPrincipals()
	{
		if (this._deniedPrincipals!=null)
		{
			return _deniedPrincipals;
		}
		return _deniedPrincipals = getPersistenceContext().getValue(DENIEDPRINCIPALS, _deniedPrincipals);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.derivedMedias</code> attribute defined at extension <code>core</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the derivedMedias
	 */
	public Collection<DerivedMediaModel> getDerivedMedias()
	{
		if (this._derivedMedias!=null)
		{
			return _derivedMedias;
		}
		return _derivedMedias = getPersistenceContext().getValue(DERIVEDMEDIAS, _derivedMedias);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.description</code> attribute defined at extension <code>core</code>. 
	 * @return the description
	 */
	public String getDescription()
	{
		if (this._description!=null)
		{
			return _description;
		}
		return _description = getPersistenceContext().getValue(DESCRIPTION, _description);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.downloadURL</code> attribute defined at extension <code>core</code>. 
	 * @return the downloadURL
	 */
	public String getDownloadURL()
	{
		if (this._downloadURL!=null)
		{
			return _downloadURL;
		}
		return _downloadURL = getPersistenceContext().getValue(DOWNLOADURL, _downloadURL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.downloadURL</code> attribute defined at extension <code>core</code>. 
	 * @return the downloadURL
	 * @deprecated use {@link #getDownloadURL()} instead
	 */
	@Deprecated
	public String getDownloadurl()
	{
		return this.getDownloadURL();
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.folder</code> attribute defined at extension <code>core</code>. 
	 * @return the folder - Sub folder where this media is stored.
	 */
	public MediaFolderModel getFolder()
	{
		if (this._folder!=null)
		{
			return _folder;
		}
		return _folder = getPersistenceContext().getValue(FOLDER, _folder);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.foreignDataOwners</code> attribute defined at extension <code>core</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the foreignDataOwners - List of all medias referencing same data file.
	 */
	public Collection<MediaModel> getForeignDataOwners()
	{
		if (this._foreignDataOwners!=null)
		{
			return _foreignDataOwners;
		}
		return _foreignDataOwners = getPersistenceContext().getValue(FOREIGNDATAOWNERS, _foreignDataOwners);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.internalURL</code> attribute defined at extension <code>core</code>. 
	 * @return the internalURL
	 */
	public String getInternalURL()
	{
		if (this._internalURL!=null)
		{
			return _internalURL;
		}
		return _internalURL = getPersistenceContext().getValue(INTERNALURL, _internalURL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.mediaContainer</code> attribute defined at extension <code>core</code>. 
	 * @return the mediaContainer
	 */
	public MediaContainerModel getMediaContainer()
	{
		if (this._mediaContainer!=null)
		{
			return _mediaContainer;
		}
		return _mediaContainer = getPersistenceContext().getValue(MEDIACONTAINER, _mediaContainer);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.mediaFormat</code> attribute defined at extension <code>core</code>. 
	 * @return the mediaFormat - Format of this media
	 */
	public MediaFormatModel getMediaFormat()
	{
		if (this._mediaFormat!=null)
		{
			return _mediaFormat;
		}
		return _mediaFormat = getPersistenceContext().getValue(MEDIAFORMAT, _mediaFormat);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.permittedPrincipals</code> attribute defined at extension <code>core</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the permittedPrincipals
	 */
	public Collection<PrincipalModel> getPermittedPrincipals()
	{
		if (this._permittedPrincipals!=null)
		{
			return _permittedPrincipals;
		}
		return _permittedPrincipals = getPersistenceContext().getValue(PERMITTEDPRINCIPALS, _permittedPrincipals);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.publication</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the publication
	 */
	public Collection<PublicationModel> getPublication()
	{
		if (this._publication!=null)
		{
			return _publication;
		}
		return _publication = getPersistenceContext().getValue(PUBLICATION, _publication);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.removable</code> attribute defined at extension <code>core</code>. 
	 * @return the removable
	 */
	public Boolean getRemovable()
	{
		if (this._removable!=null)
		{
			return _removable;
		}
		return _removable = getPersistenceContext().getValue(REMOVABLE, _removable);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.subFolderPath</code> attribute defined at extension <code>core</code>. 
	 * @return the subFolderPath - Generated location (by one of Storage Strategies) to media within storage.
	 */
	public String getSubFolderPath()
	{
		if (this._subFolderPath!=null)
		{
			return _subFolderPath;
		}
		return _subFolderPath = getPersistenceContext().getValue(SUBFOLDERPATH, _subFolderPath);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.supercategories</code> attribute defined at extension <code>catalog</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the supercategories - Super Categories
	 */
	public Collection<CategoryModel> getSupercategories()
	{
		if (this._supercategories!=null)
		{
			return _supercategories;
		}
		return _supercategories = getPersistenceContext().getValue(SUPERCATEGORIES, _supercategories);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.URL</code> dynamic attribute defined at extension <code>core</code>. 
	 * @return the URL
	 */
	public String getURL()
	{
		return getPersistenceContext().getDynamicValue(this,URL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.URL</code> dynamic attribute defined at extension <code>core</code>. 
	 * @return the URL
	 * @deprecated use {@link #getURL()} instead
	 */
	@Deprecated
	public String getUrl()
	{
		return this.getURL();
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.URL2</code> attribute defined at extension <code>core</code>. 
	 * @return the URL2
	 */
	public String getURL2()
	{
		if (this._URL2!=null)
		{
			return _URL2;
		}
		return _URL2 = getPersistenceContext().getValue(URL2, _URL2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.URL2</code> attribute defined at extension <code>core</code>. 
	 * @return the URL2
	 * @deprecated use {@link #getURL2()} instead
	 */
	@Deprecated
	public String getUrl2()
	{
		return this.getURL2();
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Media.altText</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the altText
	 */
	public void setAltText(final String value)
	{
		_altText = getPersistenceContext().setValue(ALTTEXT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Media.altText</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the altText
	 * @deprecated use {@link #setAltText(java.lang.String)} instead
	 */
	@Deprecated
	public void setAlttext(final String value)
	{
		this.setAltText(value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Media.catalogVersion</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the catalogVersion
	 */
	public void setCatalogVersion(final CatalogVersionModel value)
	{
		_catalogVersion = getPersistenceContext().setValue(CATALOGVERSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Media.code</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the code - Code of media
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Media.deniedPrincipals</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the deniedPrincipals
	 */
	public void setDeniedPrincipals(final Collection<PrincipalModel> value)
	{
		_deniedPrincipals = getPersistenceContext().setValue(DENIEDPRINCIPALS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Media.derivedMedias</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the derivedMedias
	 */
	public void setDerivedMedias(final Collection<DerivedMediaModel> value)
	{
		_derivedMedias = getPersistenceContext().setValue(DERIVEDMEDIAS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Media.description</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the description
	 */
	public void setDescription(final String value)
	{
		_description = getPersistenceContext().setValue(DESCRIPTION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Media.folder</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the folder - Sub folder where this media is stored.
	 */
	public void setFolder(final MediaFolderModel value)
	{
		_folder = getPersistenceContext().setValue(FOLDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Media.internalURL</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the internalURL
	 */
	public void setInternalURL(final String value)
	{
		_internalURL = getPersistenceContext().setValue(INTERNALURL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Media.mediaContainer</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the mediaContainer
	 */
	public void setMediaContainer(final MediaContainerModel value)
	{
		_mediaContainer = getPersistenceContext().setValue(MEDIACONTAINER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Media.mediaFormat</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the mediaFormat - Format of this media
	 */
	public void setMediaFormat(final MediaFormatModel value)
	{
		_mediaFormat = getPersistenceContext().setValue(MEDIAFORMAT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Media.permittedPrincipals</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the permittedPrincipals
	 */
	public void setPermittedPrincipals(final Collection<PrincipalModel> value)
	{
		_permittedPrincipals = getPersistenceContext().setValue(PERMITTEDPRINCIPALS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Media.publication</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the publication
	 */
	public void setPublication(final Collection<PublicationModel> value)
	{
		_publication = getPersistenceContext().setValue(PUBLICATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Media.removable</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the removable
	 */
	public void setRemovable(final Boolean value)
	{
		_removable = getPersistenceContext().setValue(REMOVABLE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Media.subFolderPath</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the subFolderPath - Generated location (by one of Storage Strategies) to media within storage.
	 */
	public void setSubFolderPath(final String value)
	{
		_subFolderPath = getPersistenceContext().setValue(SUBFOLDERPATH, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Media.supercategories</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the supercategories - Super Categories
	 */
	public void setSupercategories(final Collection<CategoryModel> value)
	{
		_supercategories = getPersistenceContext().setValue(SUPERCATEGORIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Media.URL</code> dynamic attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the URL
	 */
	public void setURL(final String value)
	{
		getPersistenceContext().setDynamicValue(this,URL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Media.URL</code> dynamic attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the URL
	 * @deprecated use {@link #setURL(java.lang.String)} instead
	 */
	@Deprecated
	public void setUrl(final String value)
	{
		this.setURL(value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Media.URL2</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the URL2
	 */
	public void setURL2(final String value)
	{
		_URL2 = getPersistenceContext().setValue(URL2, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Media.URL2</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the URL2
	 * @deprecated use {@link #setURL2(java.lang.String)} instead
	 */
	@Deprecated
	public void setUrl2(final String value)
	{
		this.setURL2(value);
	}
	
}
