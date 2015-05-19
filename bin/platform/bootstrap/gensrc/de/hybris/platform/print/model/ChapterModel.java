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
import de.hybris.platform.print.enums.ChapterStatus;
import de.hybris.platform.print.model.ChapterConfigurationModel;
import de.hybris.platform.print.model.ChapterModel;
import de.hybris.platform.print.model.CometFileModel;
import de.hybris.platform.print.model.PageModel;
import de.hybris.platform.print.model.PublicationComponentModel;
import de.hybris.platform.print.model.PublicationModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/**
 * Generated model class for type Chapter first defined at extension print.
 */
@SuppressWarnings("all")
public class ChapterModel extends PublicationComponentModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "Chapter";
	
	/**<i>Generated relation code constant for relation <code>Chapter2ChapterRelation</code> defining source attribute <code>superChapter</code> in extension <code>print</code>.</i>*/
	public final static String _CHAPTER2CHAPTERRELATION = "Chapter2ChapterRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>Chapter.code</code> attribute defined at extension <code>print</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>Chapter.description</code> attribute defined at extension <code>print</code>. */
	public static final String DESCRIPTION = "description";
	
	/** <i>Generated constant</i> - Attribute key of <code>Chapter.title</code> attribute defined at extension <code>print</code>. */
	public static final String TITLE = "title";
	
	/** <i>Generated constant</i> - Attribute key of <code>Chapter.subTitle</code> attribute defined at extension <code>print</code>. */
	public static final String SUBTITLE = "subTitle";
	
	/** <i>Generated constant</i> - Attribute key of <code>Chapter.subTitle2</code> attribute defined at extension <code>print</code>. */
	public static final String SUBTITLE2 = "subTitle2";
	
	/** <i>Generated constant</i> - Attribute key of <code>Chapter.comment</code> attribute defined at extension <code>print</code>. */
	public static final String COMMENT = "comment";
	
	/** <i>Generated constant</i> - Attribute key of <code>Chapter.fileName</code> attribute defined at extension <code>print</code>. */
	public static final String FILENAME = "fileName";
	
	/** <i>Generated constant</i> - Attribute key of <code>Chapter.documentTemplate</code> attribute defined at extension <code>print</code>. */
	public static final String DOCUMENTTEMPLATE = "documentTemplate";
	
	/** <i>Generated constant</i> - Attribute key of <code>Chapter.filePath</code> attribute defined at extension <code>print</code>. */
	public static final String FILEPATH = "filePath";
	
	/** <i>Generated constant</i> - Attribute key of <code>Chapter.picture</code> attribute defined at extension <code>print</code>. */
	public static final String PICTURE = "picture";
	
	/** <i>Generated constant</i> - Attribute key of <code>Chapter.plannedRevenue</code> attribute defined at extension <code>print</code>. */
	public static final String PLANNEDREVENUE = "plannedRevenue";
	
	/** <i>Generated constant</i> - Attribute key of <code>Chapter.reachedRevenue</code> attribute defined at extension <code>print</code>. */
	public static final String REACHEDREVENUE = "reachedRevenue";
	
	/** <i>Generated constant</i> - Attribute key of <code>Chapter.header</code> attribute defined at extension <code>print</code>. */
	public static final String HEADER = "header";
	
	/** <i>Generated constant</i> - Attribute key of <code>Chapter.footer</code> attribute defined at extension <code>print</code>. */
	public static final String FOOTER = "footer";
	
	/** <i>Generated constant</i> - Attribute key of <code>Chapter.chapterConfiguration</code> attribute defined at extension <code>print</code>. */
	public static final String CHAPTERCONFIGURATION = "chapterConfiguration";
	
	/** <i>Generated constant</i> - Attribute key of <code>Chapter.status</code> attribute defined at extension <code>print</code>. */
	public static final String STATUS = "status";
	
	/** <i>Generated constant</i> - Attribute key of <code>Chapter.previewImages</code> attribute defined at extension <code>print</code>. */
	public static final String PREVIEWIMAGES = "previewImages";
	
	/** <i>Generated constant</i> - Attribute key of <code>Chapter.previewPdfs</code> attribute defined at extension <code>print</code>. */
	public static final String PREVIEWPDFS = "previewPdfs";
	
	/** <i>Generated constant</i> - Attribute key of <code>Chapter.superChapter</code> attribute defined at extension <code>print</code>. */
	public static final String SUPERCHAPTER = "superChapter";
	
	/** <i>Generated constant</i> - Attribute key of <code>Chapter.subChapters</code> attribute defined at extension <code>print</code>. */
	public static final String SUBCHAPTERS = "subChapters";
	
	/** <i>Generated constant</i> - Attribute key of <code>Chapter.pages</code> attribute defined at extension <code>print</code>. */
	public static final String PAGES = "pages";
	
	/** <i>Generated constant</i> - Attribute key of <code>Chapter.previews</code> attribute defined at extension <code>print</code>. */
	public static final String PREVIEWS = "previews";
	
	
	/** <i>Generated variable</i> - Variable of <code>Chapter.code</code> attribute defined at extension <code>print</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>Chapter.comment</code> attribute defined at extension <code>print</code>. */
	private String _comment;
	
	/** <i>Generated variable</i> - Variable of <code>Chapter.fileName</code> attribute defined at extension <code>print</code>. */
	private String _fileName;
	
	/** <i>Generated variable</i> - Variable of <code>Chapter.documentTemplate</code> attribute defined at extension <code>print</code>. */
	private String _documentTemplate;
	
	/** <i>Generated variable</i> - Variable of <code>Chapter.filePath</code> attribute defined at extension <code>print</code>. */
	private String _filePath;
	
	/** <i>Generated variable</i> - Variable of <code>Chapter.picture</code> attribute defined at extension <code>print</code>. */
	private MediaModel _picture;
	
	/** <i>Generated variable</i> - Variable of <code>Chapter.plannedRevenue</code> attribute defined at extension <code>print</code>. */
	private Double _plannedRevenue;
	
	/** <i>Generated variable</i> - Variable of <code>Chapter.reachedRevenue</code> attribute defined at extension <code>print</code>. */
	private Double _reachedRevenue;
	
	/** <i>Generated variable</i> - Variable of <code>Chapter.chapterConfiguration</code> attribute defined at extension <code>print</code>. */
	private ChapterConfigurationModel _chapterConfiguration;
	
	/** <i>Generated variable</i> - Variable of <code>Chapter.status</code> attribute defined at extension <code>print</code>. */
	private ChapterStatus _status;
	
	/** <i>Generated variable</i> - Variable of <code>Chapter.previewImages</code> attribute defined at extension <code>print</code>. */
	private Collection<CometFileModel> _previewImages;
	
	/** <i>Generated variable</i> - Variable of <code>Chapter.previewPdfs</code> attribute defined at extension <code>print</code>. */
	private Collection<CometFileModel> _previewPdfs;
	
	/** <i>Generated variable</i> - Variable of <code>Chapter.superChapter</code> attribute defined at extension <code>print</code>. */
	private ChapterModel _superChapter;
	
	/** <i>Generated variable</i> - Variable of <code>Chapter.subChapters</code> attribute defined at extension <code>print</code>. */
	private List<ChapterModel> _subChapters;
	
	/** <i>Generated variable</i> - Variable of <code>Chapter.pages</code> attribute defined at extension <code>print</code>. */
	private List<PageModel> _pages;
	
	/** <i>Generated variable</i> - Variable of <code>Chapter.previews</code> attribute defined at extension <code>print</code>. */
	private Collection<CometFileModel> _previews;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ChapterModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ChapterModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>Chapter</code> at extension <code>print</code>
	 * @param _publication initial attribute declared by type <code>PublicationComponent</code> at extension <code>print</code>
	 */
	@Deprecated
	public ChapterModel(final String _code, final PublicationModel _publication)
	{
		super();
		setCode(_code);
		setPublication(_publication);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>Chapter</code> at extension <code>print</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _publication initial attribute declared by type <code>PublicationComponent</code> at extension <code>print</code>
	 */
	@Deprecated
	public ChapterModel(final String _code, final ItemModel _owner, final PublicationModel _publication)
	{
		super();
		setCode(_code);
		setOwner(_owner);
		setPublication(_publication);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Chapter.chapterConfiguration</code> attribute defined at extension <code>print</code>. 
	 * @return the chapterConfiguration - Alternative configuration that specifies settings for the this chapter (style, flow control, ...)
	 */
	public ChapterConfigurationModel getChapterConfiguration()
	{
		if (this._chapterConfiguration!=null)
		{
			return _chapterConfiguration;
		}
		return _chapterConfiguration = getPersistenceContext().getValue(CHAPTERCONFIGURATION, _chapterConfiguration);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Chapter.code</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Chapter.comment</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Chapter.description</code> attribute defined at extension <code>print</code>. 
	 * @return the description - The abstract of the chapter
	 */
	public String getDescription()
	{
		return getDescription(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>Chapter.description</code> attribute defined at extension <code>print</code>. 
	 * @param loc the value localization key 
	 * @return the description - The abstract of the chapter
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getDescription(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(DESCRIPTION, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Chapter.documentTemplate</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Chapter.fileName</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Chapter.filePath</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Chapter.footer</code> attribute defined at extension <code>print</code>. 
	 * @return the footer - The footer of the chapter
	 */
	public String getFooter()
	{
		return getFooter(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>Chapter.footer</code> attribute defined at extension <code>print</code>. 
	 * @param loc the value localization key 
	 * @return the footer - The footer of the chapter
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getFooter(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(FOOTER, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Chapter.header</code> attribute defined at extension <code>print</code>. 
	 * @return the header - The header of the chapter
	 */
	public String getHeader()
	{
		return getHeader(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>Chapter.header</code> attribute defined at extension <code>print</code>. 
	 * @param loc the value localization key 
	 * @return the header - The header of the chapter
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getHeader(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(HEADER, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Chapter.pages</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the pages
	 */
	public List<PageModel> getPages()
	{
		if (this._pages!=null)
		{
			return _pages;
		}
		return _pages = getPersistenceContext().getValue(PAGES, _pages);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Chapter.picture</code> attribute defined at extension <code>print</code>. 
	 * @return the picture - The picture of the chapter
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
	 * <i>Generated method</i> - Getter of the <code>Chapter.plannedRevenue</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Chapter.previewImages</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Chapter.previewPdfs</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Chapter.previews</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Chapter.reachedRevenue</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Chapter.status</code> attribute defined at extension <code>print</code>. 
	 * @return the status
	 */
	public ChapterStatus getStatus()
	{
		if (this._status!=null)
		{
			return _status;
		}
		return _status = getPersistenceContext().getValue(STATUS, _status);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Chapter.subChapters</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the subChapters
	 */
	public List<ChapterModel> getSubChapters()
	{
		if (this._subChapters!=null)
		{
			return _subChapters;
		}
		return _subChapters = getPersistenceContext().getValue(SUBCHAPTERS, _subChapters);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Chapter.subTitle</code> attribute defined at extension <code>print</code>. 
	 * @return the subTitle - The subtitle of the chapter
	 */
	public String getSubTitle()
	{
		return getSubTitle(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>Chapter.subTitle</code> attribute defined at extension <code>print</code>. 
	 * @param loc the value localization key 
	 * @return the subTitle - The subtitle of the chapter
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getSubTitle(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(SUBTITLE, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Chapter.subTitle2</code> attribute defined at extension <code>print</code>. 
	 * @return the subTitle2
	 */
	public String getSubTitle2()
	{
		return getSubTitle2(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>Chapter.subTitle2</code> attribute defined at extension <code>print</code>. 
	 * @param loc the value localization key 
	 * @return the subTitle2
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getSubTitle2(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(SUBTITLE2, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Chapter.superChapter</code> attribute defined at extension <code>print</code>. 
	 * @return the superChapter
	 */
	public ChapterModel getSuperChapter()
	{
		if (this._superChapter!=null)
		{
			return _superChapter;
		}
		return _superChapter = getPersistenceContext().getValue(SUPERCHAPTER, _superChapter);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Chapter.title</code> attribute defined at extension <code>print</code>. 
	 * @return the title - The title of the chapter
	 */
	public String getTitle()
	{
		return getTitle(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>Chapter.title</code> attribute defined at extension <code>print</code>. 
	 * @param loc the value localization key 
	 * @return the title - The title of the chapter
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getTitle(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(TITLE, loc);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Chapter.chapterConfiguration</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the chapterConfiguration - Alternative configuration that specifies settings for the this chapter (style, flow control, ...)
	 */
	public void setChapterConfiguration(final ChapterConfigurationModel value)
	{
		_chapterConfiguration = getPersistenceContext().setValue(CHAPTERCONFIGURATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Chapter.code</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Chapter.comment</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the comment
	 */
	public void setComment(final String value)
	{
		_comment = getPersistenceContext().setValue(COMMENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Chapter.description</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the description - The abstract of the chapter
	 */
	public void setDescription(final String value)
	{
		setDescription(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>Chapter.description</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the description - The abstract of the chapter
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setDescription(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(DESCRIPTION, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Chapter.documentTemplate</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the documentTemplate
	 */
	public void setDocumentTemplate(final String value)
	{
		_documentTemplate = getPersistenceContext().setValue(DOCUMENTTEMPLATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Chapter.fileName</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the fileName
	 */
	public void setFileName(final String value)
	{
		_fileName = getPersistenceContext().setValue(FILENAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Chapter.filePath</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the filePath
	 */
	public void setFilePath(final String value)
	{
		_filePath = getPersistenceContext().setValue(FILEPATH, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Chapter.footer</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the footer - The footer of the chapter
	 */
	public void setFooter(final String value)
	{
		setFooter(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>Chapter.footer</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the footer - The footer of the chapter
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setFooter(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(FOOTER, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Chapter.header</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the header - The header of the chapter
	 */
	public void setHeader(final String value)
	{
		setHeader(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>Chapter.header</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the header - The header of the chapter
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setHeader(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(HEADER, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Chapter.pages</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the pages
	 */
	public void setPages(final List<PageModel> value)
	{
		_pages = getPersistenceContext().setValue(PAGES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Chapter.picture</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the picture - The picture of the chapter
	 */
	public void setPicture(final MediaModel value)
	{
		_picture = getPersistenceContext().setValue(PICTURE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Chapter.previews</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the previews
	 */
	public void setPreviews(final Collection<CometFileModel> value)
	{
		_previews = getPersistenceContext().setValue(PREVIEWS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Chapter.status</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the status
	 */
	public void setStatus(final ChapterStatus value)
	{
		_status = getPersistenceContext().setValue(STATUS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Chapter.subChapters</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the subChapters
	 */
	public void setSubChapters(final List<ChapterModel> value)
	{
		_subChapters = getPersistenceContext().setValue(SUBCHAPTERS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Chapter.subTitle</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the subTitle - The subtitle of the chapter
	 */
	public void setSubTitle(final String value)
	{
		setSubTitle(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>Chapter.subTitle</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the subTitle - The subtitle of the chapter
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setSubTitle(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(SUBTITLE, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Chapter.subTitle2</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the subTitle2
	 */
	public void setSubTitle2(final String value)
	{
		setSubTitle2(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>Chapter.subTitle2</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Setter of <code>Chapter.superChapter</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the superChapter
	 */
	public void setSuperChapter(final ChapterModel value)
	{
		_superChapter = getPersistenceContext().setValue(SUPERCHAPTER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Chapter.title</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the title - The title of the chapter
	 */
	public void setTitle(final String value)
	{
		setTitle(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>Chapter.title</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the title - The title of the chapter
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setTitle(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(TITLE, loc, value);
	}
	
}
