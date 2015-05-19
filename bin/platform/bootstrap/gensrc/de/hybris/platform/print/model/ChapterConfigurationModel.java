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
import de.hybris.platform.print.enums.FlowControlEnum;
import de.hybris.platform.print.model.ChapterParagraphStyleModel;
import de.hybris.platform.print.model.ChaptersConfigurationModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type ChapterConfiguration first defined at extension print.
 */
@SuppressWarnings("all")
public class ChapterConfigurationModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ChapterConfiguration";
	
	/**<i>Generated relation code constant for relation <code>ChapterConfigurationRelation</code> defining source attribute <code>chaptersConfiguration</code> in extension <code>print</code>.</i>*/
	public final static String _CHAPTERCONFIGURATIONRELATION = "ChapterConfigurationRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>ChapterConfiguration.chapterLevel</code> attribute defined at extension <code>print</code>. */
	public static final String CHAPTERLEVEL = "chapterLevel";
	
	/** <i>Generated constant</i> - Attribute key of <code>ChapterConfiguration.showChapter</code> attribute defined at extension <code>print</code>. */
	public static final String SHOWCHAPTER = "showChapter";
	
	/** <i>Generated constant</i> - Attribute key of <code>ChapterConfiguration.chapterParagraphStyle</code> attribute defined at extension <code>print</code>. */
	public static final String CHAPTERPARAGRAPHSTYLE = "chapterParagraphStyle";
	
	/** <i>Generated constant</i> - Attribute key of <code>ChapterConfiguration.flowControl</code> attribute defined at extension <code>print</code>. */
	public static final String FLOWCONTROL = "flowControl";
	
	/** <i>Generated constant</i> - Attribute key of <code>ChapterConfiguration.chaptersConfiguration</code> attribute defined at extension <code>print</code>. */
	public static final String CHAPTERSCONFIGURATION = "chaptersConfiguration";
	
	
	/** <i>Generated variable</i> - Variable of <code>ChapterConfiguration.chapterLevel</code> attribute defined at extension <code>print</code>. */
	private Integer _chapterLevel;
	
	/** <i>Generated variable</i> - Variable of <code>ChapterConfiguration.showChapter</code> attribute defined at extension <code>print</code>. */
	private Boolean _showChapter;
	
	/** <i>Generated variable</i> - Variable of <code>ChapterConfiguration.chapterParagraphStyle</code> attribute defined at extension <code>print</code>. */
	private ChapterParagraphStyleModel _chapterParagraphStyle;
	
	/** <i>Generated variable</i> - Variable of <code>ChapterConfiguration.flowControl</code> attribute defined at extension <code>print</code>. */
	private FlowControlEnum _flowControl;
	
	/** <i>Generated variable</i> - Variable of <code>ChapterConfiguration.chaptersConfiguration</code> attribute defined at extension <code>print</code>. */
	private ChaptersConfigurationModel _chaptersConfiguration;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ChapterConfigurationModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ChapterConfigurationModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public ChapterConfigurationModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChapterConfiguration.chapterLevel</code> attribute defined at extension <code>print</code>. 
	 * @return the chapterLevel
	 */
	public Integer getChapterLevel()
	{
		if (this._chapterLevel!=null)
		{
			return _chapterLevel;
		}
		return _chapterLevel = getPersistenceContext().getValue(CHAPTERLEVEL, _chapterLevel);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChapterConfiguration.chapterParagraphStyle</code> attribute defined at extension <code>print</code>. 
	 * @return the chapterParagraphStyle
	 */
	public ChapterParagraphStyleModel getChapterParagraphStyle()
	{
		if (this._chapterParagraphStyle!=null)
		{
			return _chapterParagraphStyle;
		}
		return _chapterParagraphStyle = getPersistenceContext().getValue(CHAPTERPARAGRAPHSTYLE, _chapterParagraphStyle);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChapterConfiguration.chaptersConfiguration</code> attribute defined at extension <code>print</code>. 
	 * @return the chaptersConfiguration
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
	 * <i>Generated method</i> - Getter of the <code>ChapterConfiguration.flowControl</code> attribute defined at extension <code>print</code>. 
	 * @return the flowControl
	 */
	public FlowControlEnum getFlowControl()
	{
		if (this._flowControl!=null)
		{
			return _flowControl;
		}
		return _flowControl = getPersistenceContext().getValue(FLOWCONTROL, _flowControl);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChapterConfiguration.showChapter</code> attribute defined at extension <code>print</code>. 
	 * @return the showChapter
	 */
	public Boolean getShowChapter()
	{
		if (this._showChapter!=null)
		{
			return _showChapter;
		}
		return _showChapter = getPersistenceContext().getValue(SHOWCHAPTER, _showChapter);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ChapterConfiguration.chapterLevel</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the chapterLevel
	 */
	public void setChapterLevel(final Integer value)
	{
		_chapterLevel = getPersistenceContext().setValue(CHAPTERLEVEL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ChapterConfiguration.chapterParagraphStyle</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the chapterParagraphStyle
	 */
	public void setChapterParagraphStyle(final ChapterParagraphStyleModel value)
	{
		_chapterParagraphStyle = getPersistenceContext().setValue(CHAPTERPARAGRAPHSTYLE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ChapterConfiguration.chaptersConfiguration</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the chaptersConfiguration
	 */
	public void setChaptersConfiguration(final ChaptersConfigurationModel value)
	{
		_chaptersConfiguration = getPersistenceContext().setValue(CHAPTERSCONFIGURATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ChapterConfiguration.flowControl</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the flowControl
	 */
	public void setFlowControl(final FlowControlEnum value)
	{
		_flowControl = getPersistenceContext().setValue(FLOWCONTROL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ChapterConfiguration.showChapter</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the showChapter
	 */
	public void setShowChapter(final Boolean value)
	{
		_showChapter = getPersistenceContext().setValue(SHOWCHAPTER, value);
	}
	
}
