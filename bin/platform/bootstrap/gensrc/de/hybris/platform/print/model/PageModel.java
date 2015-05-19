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
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.print.enums.GridMode;
import de.hybris.platform.print.enums.PageAlignment;
import de.hybris.platform.print.enums.PageMode;
import de.hybris.platform.print.enums.PageStatus;
import de.hybris.platform.print.enums.PageType;
import de.hybris.platform.print.enums.PlacementMode;
import de.hybris.platform.print.model.ChapterModel;
import de.hybris.platform.print.model.CometFileModel;
import de.hybris.platform.print.model.DtpCommentModel;
import de.hybris.platform.print.model.GridModel;
import de.hybris.platform.print.model.MasterPageModel;
import de.hybris.platform.print.model.PlacementModel;
import de.hybris.platform.print.model.PublicationComponentModel;
import de.hybris.platform.print.model.PublicationModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/**
 * Generated model class for type Page first defined at extension print.
 */
@SuppressWarnings("all")
public class PageModel extends PublicationComponentModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "Page";
	
	/**<i>Generated relation code constant for relation <code>Chapter2PageRelation</code> defining source attribute <code>chapter</code> in extension <code>print</code>.</i>*/
	public final static String _CHAPTER2PAGERELATION = "Chapter2PageRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>Page.code</code> attribute defined at extension <code>print</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>Page.masterPage</code> attribute defined at extension <code>print</code>. */
	public static final String MASTERPAGE = "masterPage";
	
	/** <i>Generated constant</i> - Attribute key of <code>Page.masterPageAlt</code> attribute defined at extension <code>print</code>. */
	public static final String MASTERPAGEALT = "masterPageAlt";
	
	/** <i>Generated constant</i> - Attribute key of <code>Page.allUsableMasterPages</code> attribute defined at extension <code>print</code>. */
	public static final String ALLUSABLEMASTERPAGES = "allUsableMasterPages";
	
	/** <i>Generated constant</i> - Attribute key of <code>Page.pageType</code> attribute defined at extension <code>print</code>. */
	public static final String PAGETYPE = "pageType";
	
	/** <i>Generated constant</i> - Attribute key of <code>Page.pageMode</code> attribute defined at extension <code>print</code>. */
	public static final String PAGEMODE = "pageMode";
	
	/** <i>Generated constant</i> - Attribute key of <code>Page.alignment</code> attribute defined at extension <code>print</code>. */
	public static final String ALIGNMENT = "alignment";
	
	/** <i>Generated constant</i> - Attribute key of <code>Page.gridId</code> attribute defined at extension <code>print</code>. */
	public static final String GRIDID = "gridId";
	
	/** <i>Generated constant</i> - Attribute key of <code>Page.grid</code> attribute defined at extension <code>print</code>. */
	public static final String GRID = "grid";
	
	/** <i>Generated constant</i> - Attribute key of <code>Page.alternativeGridId</code> attribute defined at extension <code>print</code>. */
	public static final String ALTERNATIVEGRIDID = "alternativeGridId";
	
	/** <i>Generated constant</i> - Attribute key of <code>Page.alternativeGrid</code> attribute defined at extension <code>print</code>. */
	public static final String ALTERNATIVEGRID = "alternativeGrid";
	
	/** <i>Generated constant</i> - Attribute key of <code>Page.gridMode</code> attribute defined at extension <code>print</code>. */
	public static final String GRIDMODE = "gridMode";
	
	/** <i>Generated constant</i> - Attribute key of <code>Page.title</code> attribute defined at extension <code>print</code>. */
	public static final String TITLE = "title";
	
	/** <i>Generated constant</i> - Attribute key of <code>Page.subTitle</code> attribute defined at extension <code>print</code>. */
	public static final String SUBTITLE = "subTitle";
	
	/** <i>Generated constant</i> - Attribute key of <code>Page.subTitle2</code> attribute defined at extension <code>print</code>. */
	public static final String SUBTITLE2 = "subTitle2";
	
	/** <i>Generated constant</i> - Attribute key of <code>Page.comment</code> attribute defined at extension <code>print</code>. */
	public static final String COMMENT = "comment";
	
	/** <i>Generated constant</i> - Attribute key of <code>Page.fileName</code> attribute defined at extension <code>print</code>. */
	public static final String FILENAME = "fileName";
	
	/** <i>Generated constant</i> - Attribute key of <code>Page.documentTemplate</code> attribute defined at extension <code>print</code>. */
	public static final String DOCUMENTTEMPLATE = "documentTemplate";
	
	/** <i>Generated constant</i> - Attribute key of <code>Page.filePath</code> attribute defined at extension <code>print</code>. */
	public static final String FILEPATH = "filePath";
	
	/** <i>Generated constant</i> - Attribute key of <code>Page.description</code> attribute defined at extension <code>print</code>. */
	public static final String DESCRIPTION = "description";
	
	/** <i>Generated constant</i> - Attribute key of <code>Page.previewImages</code> attribute defined at extension <code>print</code>. */
	public static final String PREVIEWIMAGES = "previewImages";
	
	/** <i>Generated constant</i> - Attribute key of <code>Page.previewPdfs</code> attribute defined at extension <code>print</code>. */
	public static final String PREVIEWPDFS = "previewPdfs";
	
	/** <i>Generated constant</i> - Attribute key of <code>Page.actualPreviewImages</code> attribute defined at extension <code>print</code>. */
	public static final String ACTUALPREVIEWIMAGES = "actualPreviewImages";
	
	/** <i>Generated constant</i> - Attribute key of <code>Page.actualPreviewPdf</code> attribute defined at extension <code>print</code>. */
	public static final String ACTUALPREVIEWPDF = "actualPreviewPdf";
	
	/** <i>Generated constant</i> - Attribute key of <code>Page.plannedRevenue</code> attribute defined at extension <code>print</code>. */
	public static final String PLANNEDREVENUE = "plannedRevenue";
	
	/** <i>Generated constant</i> - Attribute key of <code>Page.reachedRevenue</code> attribute defined at extension <code>print</code>. */
	public static final String REACHEDREVENUE = "reachedRevenue";
	
	/** <i>Generated constant</i> - Attribute key of <code>Page.status</code> attribute defined at extension <code>print</code>. */
	public static final String STATUS = "status";
	
	/** <i>Generated constant</i> - Attribute key of <code>Page.placementMode</code> attribute defined at extension <code>print</code>. */
	public static final String PLACEMENTMODE = "placementMode";
	
	/** <i>Generated constant</i> - Attribute key of <code>Page.dtpComments</code> attribute defined at extension <code>print</code>. */
	public static final String DTPCOMMENTS = "dtpComments";
	
	/** <i>Generated constant</i> - Attribute key of <code>Page.chapter</code> attribute defined at extension <code>print</code>. */
	public static final String CHAPTER = "chapter";
	
	/** <i>Generated constant</i> - Attribute key of <code>Page.placements</code> attribute defined at extension <code>print</code>. */
	public static final String PLACEMENTS = "placements";
	
	/** <i>Generated constant</i> - Attribute key of <code>Page.previews</code> attribute defined at extension <code>print</code>. */
	public static final String PREVIEWS = "previews";
	
	
	/** <i>Generated variable</i> - Variable of <code>Page.code</code> attribute defined at extension <code>print</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>Page.masterPage</code> attribute defined at extension <code>print</code>. */
	private MasterPageModel _masterPage;
	
	/** <i>Generated variable</i> - Variable of <code>Page.masterPageAlt</code> attribute defined at extension <code>print</code>. */
	private MasterPageModel _masterPageAlt;
	
	/** <i>Generated variable</i> - Variable of <code>Page.allUsableMasterPages</code> attribute defined at extension <code>print</code>. */
	private Collection<MasterPageModel> _allUsableMasterPages;
	
	/** <i>Generated variable</i> - Variable of <code>Page.pageType</code> attribute defined at extension <code>print</code>. */
	private PageType _pageType;
	
	/** <i>Generated variable</i> - Variable of <code>Page.pageMode</code> attribute defined at extension <code>print</code>. */
	private PageMode _pageMode;
	
	/** <i>Generated variable</i> - Variable of <code>Page.alignment</code> attribute defined at extension <code>print</code>. */
	private PageAlignment _alignment;
	
	/** <i>Generated variable</i> - Variable of <code>Page.gridId</code> attribute defined at extension <code>print</code>. */
	private Integer _gridId;
	
	/** <i>Generated variable</i> - Variable of <code>Page.grid</code> attribute defined at extension <code>print</code>. */
	private GridModel _grid;
	
	/** <i>Generated variable</i> - Variable of <code>Page.alternativeGridId</code> attribute defined at extension <code>print</code>. */
	private Integer _alternativeGridId;
	
	/** <i>Generated variable</i> - Variable of <code>Page.alternativeGrid</code> attribute defined at extension <code>print</code>. */
	private GridModel _alternativeGrid;
	
	/** <i>Generated variable</i> - Variable of <code>Page.gridMode</code> attribute defined at extension <code>print</code>. */
	private GridMode _gridMode;
	
	/** <i>Generated variable</i> - Variable of <code>Page.comment</code> attribute defined at extension <code>print</code>. */
	private String _comment;
	
	/** <i>Generated variable</i> - Variable of <code>Page.fileName</code> attribute defined at extension <code>print</code>. */
	private String _fileName;
	
	/** <i>Generated variable</i> - Variable of <code>Page.documentTemplate</code> attribute defined at extension <code>print</code>. */
	private String _documentTemplate;
	
	/** <i>Generated variable</i> - Variable of <code>Page.filePath</code> attribute defined at extension <code>print</code>. */
	private String _filePath;
	
	/** <i>Generated variable</i> - Variable of <code>Page.previewImages</code> attribute defined at extension <code>print</code>. */
	private Collection<CometFileModel> _previewImages;
	
	/** <i>Generated variable</i> - Variable of <code>Page.previewPdfs</code> attribute defined at extension <code>print</code>. */
	private Collection<CometFileModel> _previewPdfs;
	
	/** <i>Generated variable</i> - Variable of <code>Page.actualPreviewImages</code> attribute defined at extension <code>print</code>. */
	private Collection<MediaModel> _actualPreviewImages;
	
	/** <i>Generated variable</i> - Variable of <code>Page.actualPreviewPdf</code> attribute defined at extension <code>print</code>. */
	private MediaModel _actualPreviewPdf;
	
	/** <i>Generated variable</i> - Variable of <code>Page.plannedRevenue</code> attribute defined at extension <code>print</code>. */
	private Double _plannedRevenue;
	
	/** <i>Generated variable</i> - Variable of <code>Page.reachedRevenue</code> attribute defined at extension <code>print</code>. */
	private Double _reachedRevenue;
	
	/** <i>Generated variable</i> - Variable of <code>Page.status</code> attribute defined at extension <code>print</code>. */
	private PageStatus _status;
	
	/** <i>Generated variable</i> - Variable of <code>Page.placementMode</code> attribute defined at extension <code>print</code>. */
	private PlacementMode _placementMode;
	
	/** <i>Generated variable</i> - Variable of <code>Page.dtpComments</code> attribute defined at extension <code>print</code>. */
	private List<DtpCommentModel> _dtpComments;
	
	/** <i>Generated variable</i> - Variable of <code>Page.chapter</code> attribute defined at extension <code>print</code>. */
	private ChapterModel _chapter;
	
	/** <i>Generated variable</i> - Variable of <code>Page.placements</code> attribute defined at extension <code>print</code>. */
	private List<PlacementModel> _placements;
	
	/** <i>Generated variable</i> - Variable of <code>Page.previews</code> attribute defined at extension <code>print</code>. */
	private Collection<CometFileModel> _previews;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PageModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PageModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _chapter initial attribute declared by type <code>Page</code> at extension <code>print</code>
	 * @param _code initial attribute declared by type <code>Page</code> at extension <code>print</code>
	 * @param _publication initial attribute declared by type <code>PublicationComponent</code> at extension <code>print</code>
	 */
	@Deprecated
	public PageModel(final ChapterModel _chapter, final String _code, final PublicationModel _publication)
	{
		super();
		setChapter(_chapter);
		setCode(_code);
		setPublication(_publication);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _chapter initial attribute declared by type <code>Page</code> at extension <code>print</code>
	 * @param _code initial attribute declared by type <code>Page</code> at extension <code>print</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _publication initial attribute declared by type <code>PublicationComponent</code> at extension <code>print</code>
	 */
	@Deprecated
	public PageModel(final ChapterModel _chapter, final String _code, final ItemModel _owner, final PublicationModel _publication)
	{
		super();
		setChapter(_chapter);
		setCode(_code);
		setOwner(_owner);
		setPublication(_publication);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Page.actualPreviewImages</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the actualPreviewImages
	 */
	public Collection<MediaModel> getActualPreviewImages()
	{
		if (this._actualPreviewImages!=null)
		{
			return _actualPreviewImages;
		}
		return _actualPreviewImages = getPersistenceContext().getValue(ACTUALPREVIEWIMAGES, _actualPreviewImages);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Page.actualPreviewPdf</code> attribute defined at extension <code>print</code>. 
	 * @return the actualPreviewPdf
	 */
	public MediaModel getActualPreviewPdf()
	{
		if (this._actualPreviewPdf!=null)
		{
			return _actualPreviewPdf;
		}
		return _actualPreviewPdf = getPersistenceContext().getValue(ACTUALPREVIEWPDF, _actualPreviewPdf);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Page.alignment</code> attribute defined at extension <code>print</code>. 
	 * @return the alignment
	 */
	public PageAlignment getAlignment()
	{
		if (this._alignment!=null)
		{
			return _alignment;
		}
		return _alignment = getPersistenceContext().getValue(ALIGNMENT, _alignment);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Page.allUsableMasterPages</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the allUsableMasterPages
	 */
	public Collection<MasterPageModel> getAllUsableMasterPages()
	{
		if (this._allUsableMasterPages!=null)
		{
			return _allUsableMasterPages;
		}
		return _allUsableMasterPages = getPersistenceContext().getValue(ALLUSABLEMASTERPAGES, _allUsableMasterPages);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Page.alternativeGrid</code> attribute defined at extension <code>print</code>. 
	 * @return the alternativeGrid
	 */
	public GridModel getAlternativeGrid()
	{
		if (this._alternativeGrid!=null)
		{
			return _alternativeGrid;
		}
		return _alternativeGrid = getPersistenceContext().getValue(ALTERNATIVEGRID, _alternativeGrid);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Page.alternativeGridId</code> attribute defined at extension <code>print</code>. 
	 * @return the alternativeGridId
	 */
	public Integer getAlternativeGridId()
	{
		if (this._alternativeGridId!=null)
		{
			return _alternativeGridId;
		}
		return _alternativeGridId = getPersistenceContext().getValue(ALTERNATIVEGRIDID, _alternativeGridId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Page.chapter</code> attribute defined at extension <code>print</code>. 
	 * @return the chapter
	 */
	public ChapterModel getChapter()
	{
		if (this._chapter!=null)
		{
			return _chapter;
		}
		return _chapter = getPersistenceContext().getValue(CHAPTER, _chapter);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Page.code</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Page.comment</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Page.description</code> attribute defined at extension <code>print</code>. 
	 * @return the description
	 */
	public String getDescription()
	{
		return getDescription(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>Page.description</code> attribute defined at extension <code>print</code>. 
	 * @param loc the value localization key 
	 * @return the description
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getDescription(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(DESCRIPTION, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Page.documentTemplate</code> attribute defined at extension <code>print</code>. 
	 * @return the documentTemplate
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
	 * <i>Generated method</i> - Getter of the <code>Page.dtpComments</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the dtpComments
	 */
	public List<DtpCommentModel> getDtpComments()
	{
		if (this._dtpComments!=null)
		{
			return _dtpComments;
		}
		return _dtpComments = getPersistenceContext().getValue(DTPCOMMENTS, _dtpComments);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Page.fileName</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Page.filePath</code> attribute defined at extension <code>print</code>. 
	 * @return the filePath
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
	 * <i>Generated method</i> - Getter of the <code>Page.grid</code> attribute defined at extension <code>print</code>. 
	 * @return the grid
	 */
	public GridModel getGrid()
	{
		if (this._grid!=null)
		{
			return _grid;
		}
		return _grid = getPersistenceContext().getValue(GRID, _grid);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Page.gridId</code> attribute defined at extension <code>print</code>. 
	 * @return the gridId
	 */
	public Integer getGridId()
	{
		if (this._gridId!=null)
		{
			return _gridId;
		}
		return _gridId = getPersistenceContext().getValue(GRIDID, _gridId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Page.gridMode</code> attribute defined at extension <code>print</code>. 
	 * @return the gridMode
	 */
	public GridMode getGridMode()
	{
		if (this._gridMode!=null)
		{
			return _gridMode;
		}
		return _gridMode = getPersistenceContext().getValue(GRIDMODE, _gridMode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Page.masterPage</code> attribute defined at extension <code>print</code>. 
	 * @return the masterPage
	 */
	public MasterPageModel getMasterPage()
	{
		if (this._masterPage!=null)
		{
			return _masterPage;
		}
		return _masterPage = getPersistenceContext().getValue(MASTERPAGE, _masterPage);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Page.masterPageAlt</code> attribute defined at extension <code>print</code>. 
	 * @return the masterPageAlt
	 */
	public MasterPageModel getMasterPageAlt()
	{
		if (this._masterPageAlt!=null)
		{
			return _masterPageAlt;
		}
		return _masterPageAlt = getPersistenceContext().getValue(MASTERPAGEALT, _masterPageAlt);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Page.pageMode</code> attribute defined at extension <code>print</code>. 
	 * @return the pageMode
	 */
	public PageMode getPageMode()
	{
		if (this._pageMode!=null)
		{
			return _pageMode;
		}
		return _pageMode = getPersistenceContext().getValue(PAGEMODE, _pageMode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Page.pageType</code> attribute defined at extension <code>print</code>. 
	 * @return the pageType - Please use pageMode instead
	 */
	@Deprecated
	public PageType getPageType()
	{
		if (this._pageType!=null)
		{
			return _pageType;
		}
		return _pageType = getPersistenceContext().getValue(PAGETYPE, _pageType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Page.placementMode</code> attribute defined at extension <code>print</code>. 
	 * @return the placementMode
	 */
	public PlacementMode getPlacementMode()
	{
		if (this._placementMode!=null)
		{
			return _placementMode;
		}
		return _placementMode = getPersistenceContext().getValue(PLACEMENTMODE, _placementMode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Page.placements</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the placements
	 */
	public List<PlacementModel> getPlacements()
	{
		if (this._placements!=null)
		{
			return _placements;
		}
		return _placements = getPersistenceContext().getValue(PLACEMENTS, _placements);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Page.plannedRevenue</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Page.previewImages</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Page.previewPdfs</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Page.previews</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Page.reachedRevenue</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Page.status</code> attribute defined at extension <code>print</code>. 
	 * @return the status
	 */
	public PageStatus getStatus()
	{
		if (this._status!=null)
		{
			return _status;
		}
		return _status = getPersistenceContext().getValue(STATUS, _status);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Page.subTitle</code> attribute defined at extension <code>print</code>. 
	 * @return the subTitle - The subtitle of the page
	 */
	public String getSubTitle()
	{
		return getSubTitle(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>Page.subTitle</code> attribute defined at extension <code>print</code>. 
	 * @param loc the value localization key 
	 * @return the subTitle - The subtitle of the page
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getSubTitle(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(SUBTITLE, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Page.subTitle2</code> attribute defined at extension <code>print</code>. 
	 * @return the subTitle2
	 */
	public String getSubTitle2()
	{
		return getSubTitle2(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>Page.subTitle2</code> attribute defined at extension <code>print</code>. 
	 * @param loc the value localization key 
	 * @return the subTitle2
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getSubTitle2(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(SUBTITLE2, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Page.title</code> attribute defined at extension <code>print</code>. 
	 * @return the title - The title of the page
	 */
	public String getTitle()
	{
		return getTitle(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>Page.title</code> attribute defined at extension <code>print</code>. 
	 * @param loc the value localization key 
	 * @return the title - The title of the page
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getTitle(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(TITLE, loc);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Page.alignment</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the alignment
	 */
	public void setAlignment(final PageAlignment value)
	{
		_alignment = getPersistenceContext().setValue(ALIGNMENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Page.alternativeGrid</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the alternativeGrid
	 */
	public void setAlternativeGrid(final GridModel value)
	{
		_alternativeGrid = getPersistenceContext().setValue(ALTERNATIVEGRID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Page.alternativeGridId</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the alternativeGridId
	 */
	public void setAlternativeGridId(final Integer value)
	{
		_alternativeGridId = getPersistenceContext().setValue(ALTERNATIVEGRIDID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Page.chapter</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the chapter
	 */
	public void setChapter(final ChapterModel value)
	{
		_chapter = getPersistenceContext().setValue(CHAPTER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Page.code</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Page.comment</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the comment
	 */
	public void setComment(final String value)
	{
		_comment = getPersistenceContext().setValue(COMMENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Page.description</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the description
	 */
	public void setDescription(final String value)
	{
		setDescription(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>Page.description</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Setter of <code>Page.documentTemplate</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the documentTemplate
	 */
	public void setDocumentTemplate(final String value)
	{
		_documentTemplate = getPersistenceContext().setValue(DOCUMENTTEMPLATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Page.dtpComments</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the dtpComments
	 */
	public void setDtpComments(final List<DtpCommentModel> value)
	{
		_dtpComments = getPersistenceContext().setValue(DTPCOMMENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Page.fileName</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the fileName
	 */
	public void setFileName(final String value)
	{
		_fileName = getPersistenceContext().setValue(FILENAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Page.filePath</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the filePath
	 */
	public void setFilePath(final String value)
	{
		_filePath = getPersistenceContext().setValue(FILEPATH, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Page.grid</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the grid
	 */
	public void setGrid(final GridModel value)
	{
		_grid = getPersistenceContext().setValue(GRID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Page.gridId</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the gridId
	 */
	public void setGridId(final Integer value)
	{
		_gridId = getPersistenceContext().setValue(GRIDID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Page.gridMode</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the gridMode
	 */
	public void setGridMode(final GridMode value)
	{
		_gridMode = getPersistenceContext().setValue(GRIDMODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Page.masterPage</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the masterPage
	 */
	public void setMasterPage(final MasterPageModel value)
	{
		_masterPage = getPersistenceContext().setValue(MASTERPAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Page.masterPageAlt</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the masterPageAlt
	 */
	public void setMasterPageAlt(final MasterPageModel value)
	{
		_masterPageAlt = getPersistenceContext().setValue(MASTERPAGEALT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Page.pageMode</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the pageMode
	 */
	public void setPageMode(final PageMode value)
	{
		_pageMode = getPersistenceContext().setValue(PAGEMODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Page.pageType</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the pageType - Please use pageMode instead
	 */
	@Deprecated
	public void setPageType(final PageType value)
	{
		_pageType = getPersistenceContext().setValue(PAGETYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Page.placementMode</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the placementMode
	 */
	public void setPlacementMode(final PlacementMode value)
	{
		_placementMode = getPersistenceContext().setValue(PLACEMENTMODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Page.placements</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the placements
	 */
	public void setPlacements(final List<PlacementModel> value)
	{
		_placements = getPersistenceContext().setValue(PLACEMENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Page.previews</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the previews
	 */
	public void setPreviews(final Collection<CometFileModel> value)
	{
		_previews = getPersistenceContext().setValue(PREVIEWS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Page.status</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the status
	 */
	public void setStatus(final PageStatus value)
	{
		_status = getPersistenceContext().setValue(STATUS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Page.subTitle</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the subTitle - The subtitle of the page
	 */
	public void setSubTitle(final String value)
	{
		setSubTitle(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>Page.subTitle</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the subTitle - The subtitle of the page
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setSubTitle(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(SUBTITLE, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Page.subTitle2</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the subTitle2
	 */
	public void setSubTitle2(final String value)
	{
		setSubTitle2(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>Page.subTitle2</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Setter of <code>Page.title</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the title - The title of the page
	 */
	public void setTitle(final String value)
	{
		setTitle(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>Page.title</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the title - The title of the page
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setTitle(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(TITLE, loc, value);
	}
	
}
