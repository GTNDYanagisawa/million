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
import de.hybris.platform.print.model.CellStyleModel;
import de.hybris.platform.print.model.ChapterParagraphStyleModel;
import de.hybris.platform.print.model.CharacterStyleModel;
import de.hybris.platform.print.model.ParagraphStyleModel;
import de.hybris.platform.print.model.TableStyleModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.List;
import java.util.Locale;

/**
 * Generated model class for type StyleContainer first defined at extension print.
 */
@SuppressWarnings("all")
public class StyleContainerModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "StyleContainer";
	
	/** <i>Generated constant</i> - Attribute key of <code>StyleContainer.code</code> attribute defined at extension <code>print</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>StyleContainer.name</code> attribute defined at extension <code>print</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>StyleContainer.previewCssUrl</code> attribute defined at extension <code>print</code>. */
	public static final String PREVIEWCSSURL = "previewCssUrl";
	
	/** <i>Generated constant</i> - Attribute key of <code>StyleContainer.characterStyles</code> attribute defined at extension <code>print</code>. */
	public static final String CHARACTERSTYLES = "characterStyles";
	
	/** <i>Generated constant</i> - Attribute key of <code>StyleContainer.paragraphStyles</code> attribute defined at extension <code>print</code>. */
	public static final String PARAGRAPHSTYLES = "paragraphStyles";
	
	/** <i>Generated constant</i> - Attribute key of <code>StyleContainer.chapterParagraphStyles</code> attribute defined at extension <code>print</code>. */
	public static final String CHAPTERPARAGRAPHSTYLES = "chapterParagraphStyles";
	
	/** <i>Generated constant</i> - Attribute key of <code>StyleContainer.tableStyles</code> attribute defined at extension <code>print</code>. */
	public static final String TABLESTYLES = "tableStyles";
	
	/** <i>Generated constant</i> - Attribute key of <code>StyleContainer.cellStyles</code> attribute defined at extension <code>print</code>. */
	public static final String CELLSTYLES = "cellStyles";
	
	
	/** <i>Generated variable</i> - Variable of <code>StyleContainer.code</code> attribute defined at extension <code>print</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>StyleContainer.previewCssUrl</code> attribute defined at extension <code>print</code>. */
	private String _previewCssUrl;
	
	/** <i>Generated variable</i> - Variable of <code>StyleContainer.characterStyles</code> attribute defined at extension <code>print</code>. */
	private List<CharacterStyleModel> _characterStyles;
	
	/** <i>Generated variable</i> - Variable of <code>StyleContainer.paragraphStyles</code> attribute defined at extension <code>print</code>. */
	private List<ParagraphStyleModel> _paragraphStyles;
	
	/** <i>Generated variable</i> - Variable of <code>StyleContainer.chapterParagraphStyles</code> attribute defined at extension <code>print</code>. */
	private List<ChapterParagraphStyleModel> _chapterParagraphStyles;
	
	/** <i>Generated variable</i> - Variable of <code>StyleContainer.tableStyles</code> attribute defined at extension <code>print</code>. */
	private List<TableStyleModel> _tableStyles;
	
	/** <i>Generated variable</i> - Variable of <code>StyleContainer.cellStyles</code> attribute defined at extension <code>print</code>. */
	private List<CellStyleModel> _cellStyles;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public StyleContainerModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public StyleContainerModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>StyleContainer</code> at extension <code>print</code>
	 */
	@Deprecated
	public StyleContainerModel(final String _code)
	{
		super();
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>StyleContainer</code> at extension <code>print</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public StyleContainerModel(final String _code, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StyleContainer.cellStyles</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the cellStyles
	 */
	public List<CellStyleModel> getCellStyles()
	{
		if (this._cellStyles!=null)
		{
			return _cellStyles;
		}
		return _cellStyles = getPersistenceContext().getValue(CELLSTYLES, _cellStyles);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StyleContainer.chapterParagraphStyles</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the chapterParagraphStyles
	 */
	public List<ChapterParagraphStyleModel> getChapterParagraphStyles()
	{
		if (this._chapterParagraphStyles!=null)
		{
			return _chapterParagraphStyles;
		}
		return _chapterParagraphStyles = getPersistenceContext().getValue(CHAPTERPARAGRAPHSTYLES, _chapterParagraphStyles);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StyleContainer.characterStyles</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the characterStyles
	 */
	public List<CharacterStyleModel> getCharacterStyles()
	{
		if (this._characterStyles!=null)
		{
			return _characterStyles;
		}
		return _characterStyles = getPersistenceContext().getValue(CHARACTERSTYLES, _characterStyles);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StyleContainer.code</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>StyleContainer.name</code> attribute defined at extension <code>print</code>. 
	 * @return the name
	 */
	public String getName()
	{
		return getName(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>StyleContainer.name</code> attribute defined at extension <code>print</code>. 
	 * @param loc the value localization key 
	 * @return the name
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getName(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(NAME, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StyleContainer.paragraphStyles</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the paragraphStyles
	 */
	public List<ParagraphStyleModel> getParagraphStyles()
	{
		if (this._paragraphStyles!=null)
		{
			return _paragraphStyles;
		}
		return _paragraphStyles = getPersistenceContext().getValue(PARAGRAPHSTYLES, _paragraphStyles);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StyleContainer.previewCssUrl</code> attribute defined at extension <code>print</code>. 
	 * @return the previewCssUrl
	 */
	public String getPreviewCssUrl()
	{
		if (this._previewCssUrl!=null)
		{
			return _previewCssUrl;
		}
		return _previewCssUrl = getPersistenceContext().getValue(PREVIEWCSSURL, _previewCssUrl);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StyleContainer.tableStyles</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the tableStyles
	 */
	public List<TableStyleModel> getTableStyles()
	{
		if (this._tableStyles!=null)
		{
			return _tableStyles;
		}
		return _tableStyles = getPersistenceContext().getValue(TABLESTYLES, _tableStyles);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>StyleContainer.cellStyles</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the cellStyles
	 */
	public void setCellStyles(final List<CellStyleModel> value)
	{
		_cellStyles = getPersistenceContext().setValue(CELLSTYLES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>StyleContainer.chapterParagraphStyles</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the chapterParagraphStyles
	 */
	public void setChapterParagraphStyles(final List<ChapterParagraphStyleModel> value)
	{
		_chapterParagraphStyles = getPersistenceContext().setValue(CHAPTERPARAGRAPHSTYLES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>StyleContainer.characterStyles</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the characterStyles
	 */
	public void setCharacterStyles(final List<CharacterStyleModel> value)
	{
		_characterStyles = getPersistenceContext().setValue(CHARACTERSTYLES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>StyleContainer.code</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>StyleContainer.name</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>StyleContainer.name</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the name
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setName(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(NAME, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>StyleContainer.paragraphStyles</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the paragraphStyles
	 */
	public void setParagraphStyles(final List<ParagraphStyleModel> value)
	{
		_paragraphStyles = getPersistenceContext().setValue(PARAGRAPHSTYLES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>StyleContainer.previewCssUrl</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the previewCssUrl
	 */
	public void setPreviewCssUrl(final String value)
	{
		_previewCssUrl = getPersistenceContext().setValue(PREVIEWCSSURL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>StyleContainer.tableStyles</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the tableStyles
	 */
	public void setTableStyles(final List<TableStyleModel> value)
	{
		_tableStyles = getPersistenceContext().setValue(TABLESTYLES, value);
	}
	
}
