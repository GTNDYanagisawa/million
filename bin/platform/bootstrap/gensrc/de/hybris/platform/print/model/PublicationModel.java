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
package de.hybris.platform.print.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.media.MediaContextModel;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.core.model.security.PrincipalModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.print.enums.FileHandling;
import de.hybris.platform.print.enums.PublicationStatus;
import de.hybris.platform.print.model.ChapterModel;
import de.hybris.platform.print.model.ChaptersConfigurationModel;
import de.hybris.platform.print.model.CometConfigurationModel;
import de.hybris.platform.print.model.CometFileModel;
import de.hybris.platform.print.model.PageFormatModel;
import de.hybris.platform.print.model.PageModel;
import de.hybris.platform.print.model.PublicationComponentModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Generated model class for type Publication first defined at extension print.
 */
@SuppressWarnings("all")
public class PublicationModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "Publication";
	
	/**<i>Generated relation code constant for relation <code>Principal2WriteablePublicationRelation</code> defining source attribute <code>writePrincipals</code> in extension <code>print</code>.</i>*/
	public final static String _PRINCIPAL2WRITEABLEPUBLICATIONRELATION = "Principal2WriteablePublicationRelation";
	
	/**<i>Generated relation code constant for relation <code>Principal2ReadablePublicationRelation</code> defining source attribute <code>readPrincipals</code> in extension <code>print</code>.</i>*/
	public final static String _PRINCIPAL2READABLEPUBLICATIONRELATION = "Principal2ReadablePublicationRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.code</code> attribute defined at extension <code>print</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.active</code> attribute defined at extension <code>print</code>. */
	public static final String ACTIVE = "active";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.rootChapters</code> attribute defined at extension <code>print</code>. */
	public static final String ROOTCHAPTERS = "rootChapters";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.unassignedPages</code> attribute defined at extension <code>print</code>. */
	public static final String UNASSIGNEDPAGES = "unassignedPages";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.title</code> attribute defined at extension <code>print</code>. */
	public static final String TITLE = "title";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.subTitle</code> attribute defined at extension <code>print</code>. */
	public static final String SUBTITLE = "subTitle";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.subTitle2</code> attribute defined at extension <code>print</code>. */
	public static final String SUBTITLE2 = "subTitle2";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.comment</code> attribute defined at extension <code>print</code>. */
	public static final String COMMENT = "comment";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.fileName</code> attribute defined at extension <code>print</code>. */
	public static final String FILENAME = "fileName";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.documentTemplate</code> attribute defined at extension <code>print</code>. */
	public static final String DOCUMENTTEMPLATE = "documentTemplate";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.filePath</code> attribute defined at extension <code>print</code>. */
	public static final String FILEPATH = "filePath";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.status</code> attribute defined at extension <code>print</code>. */
	public static final String STATUS = "status";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.fileHandling</code> attribute defined at extension <code>print</code>. */
	public static final String FILEHANDLING = "fileHandling";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.description</code> attribute defined at extension <code>print</code>. */
	public static final String DESCRIPTION = "description";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.picture</code> attribute defined at extension <code>print</code>. */
	public static final String PICTURE = "picture";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.logo</code> attribute defined at extension <code>print</code>. */
	public static final String LOGO = "logo";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.sessionCurrency</code> attribute defined at extension <code>print</code>. */
	public static final String SESSIONCURRENCY = "sessionCurrency";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.sessionUser</code> attribute defined at extension <code>print</code>. */
	public static final String SESSIONUSER = "sessionUser";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.priceDate</code> attribute defined at extension <code>print</code>. */
	public static final String PRICEDATE = "priceDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.pricesAreNet</code> attribute defined at extension <code>print</code>. */
	public static final String PRICESARENET = "pricesAreNet";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.defaultMediaContext</code> attribute defined at extension <code>print</code>. */
	public static final String DEFAULTMEDIACONTEXT = "defaultMediaContext";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.languageFallbackEnabled</code> attribute defined at extension <code>print</code>. */
	public static final String LANGUAGEFALLBACKENABLED = "languageFallbackEnabled";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.visibleInDTP</code> attribute defined at extension <code>print</code>. */
	public static final String VISIBLEINDTP = "visibleInDTP";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.configuration</code> attribute defined at extension <code>print</code>. */
	public static final String CONFIGURATION = "configuration";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.chaptersConfiguration</code> attribute defined at extension <code>print</code>. */
	public static final String CHAPTERSCONFIGURATION = "chaptersConfiguration";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.pageFormat</code> attribute defined at extension <code>print</code>. */
	public static final String PAGEFORMAT = "pageFormat";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.plannedRevenue</code> attribute defined at extension <code>print</code>. */
	public static final String PLANNEDREVENUE = "plannedRevenue";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.reachedRevenue</code> attribute defined at extension <code>print</code>. */
	public static final String REACHEDREVENUE = "reachedRevenue";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.previewImages</code> attribute defined at extension <code>print</code>. */
	public static final String PREVIEWIMAGES = "previewImages";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.previewPdfs</code> attribute defined at extension <code>print</code>. */
	public static final String PREVIEWPDFS = "previewPdfs";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.components</code> attribute defined at extension <code>print</code>. */
	public static final String COMPONENTS = "components";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.media</code> attribute defined at extension <code>print</code>. */
	public static final String MEDIA = "media";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.writePrincipals</code> attribute defined at extension <code>print</code>. */
	public static final String WRITEPRINCIPALS = "writePrincipals";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.readPrincipals</code> attribute defined at extension <code>print</code>. */
	public static final String READPRINCIPALS = "readPrincipals";
	
	/** <i>Generated constant</i> - Attribute key of <code>Publication.previews</code> attribute defined at extension <code>print</code>. */
	public static final String PREVIEWS = "previews";
	
	
	/** <i>Generated variable</i> - Variable of <code>Publication.code</code> attribute defined at extension <code>print</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>Publication.active</code> attribute defined at extension <code>print</code>. */
	private Boolean _active;
	
	/** <i>Generated variable</i> - Variable of <code>Publication.rootChapters</code> attribute defined at extension <code>print</code>. */
	private Collection<ChapterModel> _rootChapters;
	
	/** <i>Generated variable</i> - Variable of <code>Publication.unassignedPages</code> attribute defined at extension <code>print</code>. */
	private Collection<PageModel> _unassignedPages;
	
	/** <i>Generated variable</i> - Variable of <code>Publication.comment</code> attribute defined at extension <code>print</code>. */
	private String _comment;
	
	/** <i>Generated variable</i> - Variable of <code>Publication.fileName</code> attribute defined at extension <code>print</code>. */
	private String _fileName;
	
	/** <i>Generated variable</i> - Variable of <code>Publication.documentTemplate</code> attribute defined at extension <code>print</code>. */
	private String _documentTemplate;
	
	/** <i>Generated variable</i> - Variable of <code>Publication.filePath</code> attribute defined at extension <code>print</code>. */
	private String _filePath;
	
	/** <i>Generated variable</i> - Variable of <code>Publication.status</code> attribute defined at extension <code>print</code>. */
	private PublicationStatus _status;
	
	/** <i>Generated variable</i> - Variable of <code>Publication.fileHandling</code> attribute defined at extension <code>print</code>. */
	private FileHandling _fileHandling;
	
	/** <i>Generated variable</i> - Variable of <code>Publication.picture</code> attribute defined at extension <code>print</code>. */
	private MediaModel _picture;
	
	/** <i>Generated variable</i> - Variable of <code>Publication.logo</code> attribute defined at extension <code>print</code>. */
	private MediaModel _logo;
	
	/** <i>Generated variable</i> - Variable of <code>Publication.sessionCurrency</code> attribute defined at extension <code>print</code>. */
	private CurrencyModel _sessionCurrency;
	
	/** <i>Generated variable</i> - Variable of <code>Publication.sessionUser</code> attribute defined at extension <code>print</code>. */
	private UserModel _sessionUser;
	
	/** <i>Generated variable</i> - Variable of <code>Publication.priceDate</code> attribute defined at extension <code>print</code>. */
	private Date _priceDate;
	
	/** <i>Generated variable</i> - Variable of <code>Publication.pricesAreNet</code> attribute defined at extension <code>print</code>. */
	private Boolean _pricesAreNet;
	
	/** <i>Generated variable</i> - Variable of <code>Publication.defaultMediaContext</code> attribute defined at extension <code>print</code>. */
	private MediaContextModel _defaultMediaContext;
	
	/** <i>Generated variable</i> - Variable of <code>Publication.languageFallbackEnabled</code> attribute defined at extension <code>print</code>. */
	private Boolean _languageFallbackEnabled;
	
	/** <i>Generated variable</i> - Variable of <code>Publication.visibleInDTP</code> attribute defined at extension <code>print</code>. */
	private Boolean _visibleInDTP;
	
	/** <i>Generated variable</i> - Variable of <code>Publication.configuration</code> attribute defined at extension <code>print</code>. */
	private CometConfigurationModel _configuration;
	
	/** <i>Generated variable</i> - Variable of <code>Publication.chaptersConfiguration</code> attribute defined at extension <code>print</code>. */
	private ChaptersConfigurationModel _chaptersConfiguration;
	
	/** <i>Generated variable</i> - Variable of <code>Publication.pageFormat</code> attribute defined at extension <code>print</code>. */
	private PageFormatModel _pageFormat;
	
	/** <i>Generated variable</i> - Variable of <code>Publication.plannedRevenue</code> attribute defined at extension <code>print</code>. */
	private Double _plannedRevenue;
	
	/** <i>Generated variable</i> - Variable of <code>Publication.reachedRevenue</code> attribute defined at extension <code>print</code>. */
	private Double _reachedRevenue;
	
	/** <i>Generated variable</i> - Variable of <code>Publication.previewImages</code> attribute defined at extension <code>print</code>. */
	private Collection<CometFileModel> _previewImages;
	
	/** <i>Generated variable</i> - Variable of <code>Publication.previewPdfs</code> attribute defined at extension <code>print</code>. */
	private Collection<CometFileModel> _previewPdfs;
	
	/** <i>Generated variable</i> - Variable of <code>Publication.components</code> attribute defined at extension <code>print</code>. */
	private List<PublicationComponentModel> _components;
	
	/** <i>Generated variable</i> - Variable of <code>Publication.media</code> attribute defined at extension <code>print</code>. */
	private List<MediaModel> _media;
	
	/** <i>Generated variable</i> - Variable of <code>Publication.writePrincipals</code> attribute defined at extension <code>print</code>. */
	private List<PrincipalModel> _writePrincipals;
	
	/** <i>Generated variable</i> - Variable of <code>Publication.readPrincipals</code> attribute defined at extension <code>print</code>. */
	private List<PrincipalModel> _readPrincipals;
	
	/** <i>Generated variable</i> - Variable of <code>Publication.previews</code> attribute defined at extension <code>print</code>. */
	private Collection<CometFileModel> _previews;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PublicationModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PublicationModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>Publication</code> at extension <code>print</code>
	 * @param _configuration initial attribute declared by type <code>Publication</code> at extension <code>print</code>
	 * @param _pageFormat initial attribute declared by type <code>Publication</code> at extension <code>print</code>
	 */
	@Deprecated
	public PublicationModel(final String _code, final CometConfigurationModel _configuration, final PageFormatModel _pageFormat)
	{
		super();
		setCode(_code);
		setConfiguration(_configuration);
		setPageFormat(_pageFormat);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>Publication</code> at extension <code>print</code>
	 * @param _configuration initial attribute declared by type <code>Publication</code> at extension <code>print</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _pageFormat initial attribute declared by type <code>Publication</code> at extension <code>print</code>
	 */
	@Deprecated
	public PublicationModel(final String _code, final CometConfigurationModel _configuration, final ItemModel _owner, final PageFormatModel _pageFormat)
	{
		super();
		setCode(_code);
		setConfiguration(_configuration);
		setOwner(_owner);
		setPageFormat(_pageFormat);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.active</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Publication.chaptersConfiguration</code> attribute defined at extension <code>print</code>. 
	 * @return the chaptersConfiguration - The configuration that specifies settings for the chapter handling (style, flow control, ...)
	 */
	public ChaptersConfigurationModel getChaptersConfiguration()
	{
		if (this._chaptersConfiguration!=null)
		{
			return _chaptersConfiguration;
		}
		return _chaptersConfiguration = getPersistenceContext().getValue(CHAPTERSCONFIGURATION, _chaptersConfiguration);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.code</code> attribute defined at extension <code>print</code>. 
	 * @return the code
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
	 * <i>Generated method</i> - Getter of the <code>Publication.comment</code> attribute defined at extension <code>print</code>. 
	 * @return the comment
	 */
	public String getComment()
	{
		if (this._comment!=null)
		{
			return _comment;
		}
		return _comment = getPersistenceContext().getValue(COMMENT, _comment);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.components</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the components
	 */
	public List<PublicationComponentModel> getComponents()
	{
		if (this._components!=null)
		{
			return _components;
		}
		return _components = getPersistenceContext().getValue(COMPONENTS, _components);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.configuration</code> attribute defined at extension <code>print</code>. 
	 * @return the configuration - The Comet configuration that specifies Comet options for this publication
	 */
	public CometConfigurationModel getConfiguration()
	{
		if (this._configuration!=null)
		{
			return _configuration;
		}
		return _configuration = getPersistenceContext().getValue(CONFIGURATION, _configuration);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.defaultMediaContext</code> attribute defined at extension <code>print</code>. 
	 * @return the defaultMediaContext - The default MediaContext
	 */
	public MediaContextModel getDefaultMediaContext()
	{
		if (this._defaultMediaContext!=null)
		{
			return _defaultMediaContext;
		}
		return _defaultMediaContext = getPersistenceContext().getValue(DEFAULTMEDIACONTEXT, _defaultMediaContext);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.description</code> attribute defined at extension <code>print</code>. 
	 * @return the description
	 */
	public String getDescription()
	{
		return getDescription(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.description</code> attribute defined at extension <code>print</code>. 
	 * @param loc the value localization key 
	 * @return the description
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getDescription(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(DESCRIPTION, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.documentTemplate</code> attribute defined at extension <code>print</code>. 
	 * @return the documentTemplate - Client side path where document templates can be found
	 */
	public String getDocumentTemplate()
	{
		if (this._documentTemplate!=null)
		{
			return _documentTemplate;
		}
		return _documentTemplate = getPersistenceContext().getValue(DOCUMENTTEMPLATE, _documentTemplate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.fileHandling</code> attribute defined at extension <code>print</code>. 
	 * @return the fileHandling
	 */
	public FileHandling getFileHandling()
	{
		if (this._fileHandling!=null)
		{
			return _fileHandling;
		}
		return _fileHandling = getPersistenceContext().getValue(FILEHANDLING, _fileHandling);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.fileName</code> attribute defined at extension <code>print</code>. 
	 * @return the fileName
	 */
	public String getFileName()
	{
		if (this._fileName!=null)
		{
			return _fileName;
		}
		return _fileName = getPersistenceContext().getValue(FILENAME, _fileName);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.filePath</code> attribute defined at extension <code>print</code>. 
	 * @return the filePath - Client side path where documents can be found
	 */
	public String getFilePath()
	{
		if (this._filePath!=null)
		{
			return _filePath;
		}
		return _filePath = getPersistenceContext().getValue(FILEPATH, _filePath);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.languageFallbackEnabled</code> attribute defined at extension <code>print</code>. 
	 * @return the languageFallbackEnabled - use fallback language while getting values
	 */
	public Boolean getLanguageFallbackEnabled()
	{
		if (this._languageFallbackEnabled!=null)
		{
			return _languageFallbackEnabled;
		}
		return _languageFallbackEnabled = getPersistenceContext().getValue(LANGUAGEFALLBACKENABLED, _languageFallbackEnabled);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.logo</code> attribute defined at extension <code>print</code>. 
	 * @return the logo
	 */
	public MediaModel getLogo()
	{
		if (this._logo!=null)
		{
			return _logo;
		}
		return _logo = getPersistenceContext().getValue(LOGO, _logo);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.media</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the media
	 */
	public List<MediaModel> getMedia()
	{
		if (this._media!=null)
		{
			return _media;
		}
		return _media = getPersistenceContext().getValue(MEDIA, _media);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.pageFormat</code> attribute defined at extension <code>print</code>. 
	 * @return the pageFormat
	 */
	public PageFormatModel getPageFormat()
	{
		if (this._pageFormat!=null)
		{
			return _pageFormat;
		}
		return _pageFormat = getPersistenceContext().getValue(PAGEFORMAT, _pageFormat);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.picture</code> attribute defined at extension <code>print</code>. 
	 * @return the picture
	 */
	public MediaModel getPicture()
	{
		if (this._picture!=null)
		{
			return _picture;
		}
		return _picture = getPersistenceContext().getValue(PICTURE, _picture);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.plannedRevenue</code> attribute defined at extension <code>print</code>. 
	 * @return the plannedRevenue
	 */
	public Double getPlannedRevenue()
	{
		if (this._plannedRevenue!=null)
		{
			return _plannedRevenue;
		}
		return _plannedRevenue = getPersistenceContext().getValue(PLANNEDREVENUE, _plannedRevenue);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.previewImages</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the previewImages
	 */
	public Collection<CometFileModel> getPreviewImages()
	{
		if (this._previewImages!=null)
		{
			return _previewImages;
		}
		return _previewImages = getPersistenceContext().getValue(PREVIEWIMAGES, _previewImages);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.previewPdfs</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the previewPdfs
	 */
	public Collection<CometFileModel> getPreviewPdfs()
	{
		if (this._previewPdfs!=null)
		{
			return _previewPdfs;
		}
		return _previewPdfs = getPersistenceContext().getValue(PREVIEWPDFS, _previewPdfs);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.previews</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the previews
	 */
	public Collection<CometFileModel> getPreviews()
	{
		if (this._previews!=null)
		{
			return _previews;
		}
		return _previews = getPersistenceContext().getValue(PREVIEWS, _previews);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.priceDate</code> attribute defined at extension <code>print</code>. 
	 * @return the priceDate - date for price calculation
	 */
	public Date getPriceDate()
	{
		if (this._priceDate!=null)
		{
			return _priceDate;
		}
		return _priceDate = getPersistenceContext().getValue(PRICEDATE, _priceDate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.pricesAreNet</code> attribute defined at extension <code>print</code>. 
	 * @return the pricesAreNet - Are prices to be calculated as net?
	 */
	public Boolean getPricesAreNet()
	{
		if (this._pricesAreNet!=null)
		{
			return _pricesAreNet;
		}
		return _pricesAreNet = getPersistenceContext().getValue(PRICESARENET, _pricesAreNet);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.reachedRevenue</code> attribute defined at extension <code>print</code>. 
	 * @return the reachedRevenue
	 */
	public Double getReachedRevenue()
	{
		if (this._reachedRevenue!=null)
		{
			return _reachedRevenue;
		}
		return _reachedRevenue = getPersistenceContext().getValue(REACHEDREVENUE, _reachedRevenue);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.readPrincipals</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the readPrincipals
	 */
	public List<PrincipalModel> getReadPrincipals()
	{
		if (this._readPrincipals!=null)
		{
			return _readPrincipals;
		}
		return _readPrincipals = getPersistenceContext().getValue(READPRINCIPALS, _readPrincipals);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.rootChapters</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the rootChapters
	 */
	public Collection<ChapterModel> getRootChapters()
	{
		if (this._rootChapters!=null)
		{
			return _rootChapters;
		}
		return _rootChapters = getPersistenceContext().getValue(ROOTCHAPTERS, _rootChapters);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.sessionCurrency</code> attribute defined at extension <code>print</code>. 
	 * @return the sessionCurrency - currency to be bound on the session when getting placeholder values
	 */
	public CurrencyModel getSessionCurrency()
	{
		if (this._sessionCurrency!=null)
		{
			return _sessionCurrency;
		}
		return _sessionCurrency = getPersistenceContext().getValue(SESSIONCURRENCY, _sessionCurrency);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.sessionUser</code> attribute defined at extension <code>print</code>. 
	 * @return the sessionUser - user to be bound on the session when getting placeholder values
	 */
	public UserModel getSessionUser()
	{
		if (this._sessionUser!=null)
		{
			return _sessionUser;
		}
		return _sessionUser = getPersistenceContext().getValue(SESSIONUSER, _sessionUser);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.status</code> attribute defined at extension <code>print</code>. 
	 * @return the status
	 */
	public PublicationStatus getStatus()
	{
		if (this._status!=null)
		{
			return _status;
		}
		return _status = getPersistenceContext().getValue(STATUS, _status);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.subTitle</code> attribute defined at extension <code>print</code>. 
	 * @return the subTitle
	 */
	public String getSubTitle()
	{
		return getSubTitle(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.subTitle</code> attribute defined at extension <code>print</code>. 
	 * @param loc the value localization key 
	 * @return the subTitle
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getSubTitle(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(SUBTITLE, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.subTitle2</code> attribute defined at extension <code>print</code>. 
	 * @return the subTitle2
	 */
	public String getSubTitle2()
	{
		return getSubTitle2(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.subTitle2</code> attribute defined at extension <code>print</code>. 
	 * @param loc the value localization key 
	 * @return the subTitle2
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getSubTitle2(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(SUBTITLE2, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.title</code> attribute defined at extension <code>print</code>. 
	 * @return the title
	 */
	public String getTitle()
	{
		return getTitle(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.title</code> attribute defined at extension <code>print</code>. 
	 * @param loc the value localization key 
	 * @return the title
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getTitle(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(TITLE, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.unassignedPages</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the unassignedPages - the pages which belongs to this publication but are not assigned to any chapter
	 */
	public Collection<PageModel> getUnassignedPages()
	{
		if (this._unassignedPages!=null)
		{
			return _unassignedPages;
		}
		return _unassignedPages = getPersistenceContext().getValue(UNASSIGNEDPAGES, _unassignedPages);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.visibleInDTP</code> attribute defined at extension <code>print</code>. 
	 * @return the visibleInDTP - show this publication in the Comet selection dialog
	 */
	public Boolean getVisibleInDTP()
	{
		if (this._visibleInDTP!=null)
		{
			return _visibleInDTP;
		}
		return _visibleInDTP = getPersistenceContext().getValue(VISIBLEINDTP, _visibleInDTP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publication.writePrincipals</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the writePrincipals
	 */
	public List<PrincipalModel> getWritePrincipals()
	{
		if (this._writePrincipals!=null)
		{
			return _writePrincipals;
		}
		return _writePrincipals = getPersistenceContext().getValue(WRITEPRINCIPALS, _writePrincipals);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Publication.active</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the active
	 */
	public void setActive(final Boolean value)
	{
		_active = getPersistenceContext().setValue(ACTIVE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Publication.chaptersConfiguration</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the chaptersConfiguration - The configuration that specifies settings for the chapter handling (style, flow control, ...)
	 */
	public void setChaptersConfiguration(final ChaptersConfigurationModel value)
	{
		_chaptersConfiguration = getPersistenceContext().setValue(CHAPTERSCONFIGURATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Publication.code</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Publication.comment</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the comment
	 */
	public void setComment(final String value)
	{
		_comment = getPersistenceContext().setValue(COMMENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Publication.components</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the components
	 */
	public void setComponents(final List<PublicationComponentModel> value)
	{
		_components = getPersistenceContext().setValue(COMPONENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Publication.configuration</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the configuration - The Comet configuration that specifies Comet options for this publication
	 */
	public void setConfiguration(final CometConfigurationModel value)
	{
		_configuration = getPersistenceContext().setValue(CONFIGURATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Publication.defaultMediaContext</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the defaultMediaContext - The default MediaContext
	 */
	public void setDefaultMediaContext(final MediaContextModel value)
	{
		_defaultMediaContext = getPersistenceContext().setValue(DEFAULTMEDIACONTEXT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Publication.description</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the description
	 */
	public void setDescription(final String value)
	{
		setDescription(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>Publication.description</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the description
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setDescription(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(DESCRIPTION, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Publication.documentTemplate</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the documentTemplate - Client side path where document templates can be found
	 */
	public void setDocumentTemplate(final String value)
	{
		_documentTemplate = getPersistenceContext().setValue(DOCUMENTTEMPLATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Publication.fileHandling</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the fileHandling
	 */
	public void setFileHandling(final FileHandling value)
	{
		_fileHandling = getPersistenceContext().setValue(FILEHANDLING, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Publication.fileName</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the fileName
	 */
	public void setFileName(final String value)
	{
		_fileName = getPersistenceContext().setValue(FILENAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Publication.filePath</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the filePath - Client side path where documents can be found
	 */
	public void setFilePath(final String value)
	{
		_filePath = getPersistenceContext().setValue(FILEPATH, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Publication.languageFallbackEnabled</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the languageFallbackEnabled - use fallback language while getting values
	 */
	public void setLanguageFallbackEnabled(final Boolean value)
	{
		_languageFallbackEnabled = getPersistenceContext().setValue(LANGUAGEFALLBACKENABLED, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Publication.logo</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the logo
	 */
	public void setLogo(final MediaModel value)
	{
		_logo = getPersistenceContext().setValue(LOGO, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Publication.media</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the media
	 */
	public void setMedia(final List<MediaModel> value)
	{
		_media = getPersistenceContext().setValue(MEDIA, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Publication.pageFormat</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the pageFormat
	 */
	public void setPageFormat(final PageFormatModel value)
	{
		_pageFormat = getPersistenceContext().setValue(PAGEFORMAT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Publication.picture</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the picture
	 */
	public void setPicture(final MediaModel value)
	{
		_picture = getPersistenceContext().setValue(PICTURE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Publication.previews</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the previews
	 */
	public void setPreviews(final Collection<CometFileModel> value)
	{
		_previews = getPersistenceContext().setValue(PREVIEWS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Publication.priceDate</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the priceDate - date for price calculation
	 */
	public void setPriceDate(final Date value)
	{
		_priceDate = getPersistenceContext().setValue(PRICEDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Publication.pricesAreNet</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the pricesAreNet - Are prices to be calculated as net?
	 */
	public void setPricesAreNet(final Boolean value)
	{
		_pricesAreNet = getPersistenceContext().setValue(PRICESARENET, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Publication.readPrincipals</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the readPrincipals
	 */
	public void setReadPrincipals(final List<PrincipalModel> value)
	{
		_readPrincipals = getPersistenceContext().setValue(READPRINCIPALS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Publication.sessionCurrency</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the sessionCurrency - currency to be bound on the session when getting placeholder values
	 */
	public void setSessionCurrency(final CurrencyModel value)
	{
		_sessionCurrency = getPersistenceContext().setValue(SESSIONCURRENCY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Publication.sessionUser</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the sessionUser - user to be bound on the session when getting placeholder values
	 */
	public void setSessionUser(final UserModel value)
	{
		_sessionUser = getPersistenceContext().setValue(SESSIONUSER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Publication.status</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the status
	 */
	public void setStatus(final PublicationStatus value)
	{
		_status = getPersistenceContext().setValue(STATUS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Publication.subTitle</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the subTitle
	 */
	public void setSubTitle(final String value)
	{
		setSubTitle(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>Publication.subTitle</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the subTitle
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setSubTitle(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(SUBTITLE, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Publication.subTitle2</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the subTitle2
	 */
	public void setSubTitle2(final String value)
	{
		setSubTitle2(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>Publication.subTitle2</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the subTitle2
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setSubTitle2(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(SUBTITLE2, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Publication.title</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the title
	 */
	public void setTitle(final String value)
	{
		setTitle(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>Publication.title</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the title
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setTitle(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(TITLE, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Publication.visibleInDTP</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the visibleInDTP - show this publication in the Comet selection dialog
	 */
	public void setVisibleInDTP(final Boolean value)
	{
		_visibleInDTP = getPersistenceContext().setValue(VISIBLEINDTP, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Publication.writePrincipals</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the writePrincipals
	 */
	public void setWritePrincipals(final List<PrincipalModel> value)
	{
		_writePrincipals = getPersistenceContext().setValue(WRITEPRINCIPALS, value);
	}
	
}
