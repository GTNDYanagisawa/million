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

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.print.model.ChapterModel;
import de.hybris.platform.print.model.CometConfigurationModel;
import de.hybris.platform.print.model.PageModel;
import de.hybris.platform.print.model.PublicationModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type CometFile first defined at extension print.
 */
@SuppressWarnings("all")
public class CometFileModel extends MediaModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CometFile";
	
	/**<i>Generated relation code constant for relation <code>CometConfig2FileRelation</code> defining source attribute <code>configuration</code> in extension <code>print</code>.</i>*/
	public final static String _COMETCONFIG2FILERELATION = "CometConfig2FileRelation";
	
	/**<i>Generated relation code constant for relation <code>Publication2CometFileRelation</code> defining source attribute <code>publicationPreview</code> in extension <code>print</code>.</i>*/
	public final static String _PUBLICATION2COMETFILERELATION = "Publication2CometFileRelation";
	
	/**<i>Generated relation code constant for relation <code>Chapter2CometFileRelation</code> defining source attribute <code>chapterPreview</code> in extension <code>print</code>.</i>*/
	public final static String _CHAPTER2COMETFILERELATION = "Chapter2CometFileRelation";
	
	/**<i>Generated relation code constant for relation <code>Page2CometFileRelation</code> defining source attribute <code>pagePreview</code> in extension <code>print</code>.</i>*/
	public final static String _PAGE2COMETFILERELATION = "Page2CometFileRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>CometFile.configuration</code> attribute defined at extension <code>print</code>. */
	public static final String CONFIGURATION = "configuration";
	
	/** <i>Generated constant</i> - Attribute key of <code>CometFile.publicationPreview</code> attribute defined at extension <code>print</code>. */
	public static final String PUBLICATIONPREVIEW = "publicationPreview";
	
	/** <i>Generated constant</i> - Attribute key of <code>CometFile.chapterPreview</code> attribute defined at extension <code>print</code>. */
	public static final String CHAPTERPREVIEW = "chapterPreview";
	
	/** <i>Generated constant</i> - Attribute key of <code>CometFile.pagePreview</code> attribute defined at extension <code>print</code>. */
	public static final String PAGEPREVIEW = "pagePreview";
	
	
	/** <i>Generated variable</i> - Variable of <code>CometFile.configuration</code> attribute defined at extension <code>print</code>. */
	private CometConfigurationModel _configuration;
	
	/** <i>Generated variable</i> - Variable of <code>CometFile.publicationPreview</code> attribute defined at extension <code>print</code>. */
	private PublicationModel _publicationPreview;
	
	/** <i>Generated variable</i> - Variable of <code>CometFile.chapterPreview</code> attribute defined at extension <code>print</code>. */
	private ChapterModel _chapterPreview;
	
	/** <i>Generated variable</i> - Variable of <code>CometFile.pagePreview</code> attribute defined at extension <code>print</code>. */
	private PageModel _pagePreview;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CometFileModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CometFileModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CometFile</code> at extension <code>print</code>
	 * @param _code initial attribute declared by type <code>Media</code> at extension <code>core</code>
	 * @param _configuration initial attribute declared by type <code>CometFile</code> at extension <code>print</code>
	 */
	@Deprecated
	public CometFileModel(final CatalogVersionModel _catalogVersion, final String _code, final CometConfigurationModel _configuration)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCode(_code);
		setConfiguration(_configuration);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CometFile</code> at extension <code>print</code>
	 * @param _code initial attribute declared by type <code>Media</code> at extension <code>core</code>
	 * @param _configuration initial attribute declared by type <code>CometFile</code> at extension <code>print</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public CometFileModel(final CatalogVersionModel _catalogVersion, final String _code, final CometConfigurationModel _configuration, final ItemModel _owner)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCode(_code);
		setConfiguration(_configuration);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CometFile.chapterPreview</code> attribute defined at extension <code>print</code>. 
	 * @return the chapterPreview
	 */
	public ChapterModel getChapterPreview()
	{
		if (this._chapterPreview!=null)
		{
			return _chapterPreview;
		}
		return _chapterPreview = getPersistenceContext().getValue(CHAPTERPREVIEW, _chapterPreview);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CometFile.configuration</code> attribute defined at extension <code>print</code>. 
	 * @return the configuration
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
	 * <i>Generated method</i> - Getter of the <code>CometFile.pagePreview</code> attribute defined at extension <code>print</code>. 
	 * @return the pagePreview
	 */
	public PageModel getPagePreview()
	{
		if (this._pagePreview!=null)
		{
			return _pagePreview;
		}
		return _pagePreview = getPersistenceContext().getValue(PAGEPREVIEW, _pagePreview);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CometFile.publicationPreview</code> attribute defined at extension <code>print</code>. 
	 * @return the publicationPreview
	 */
	public PublicationModel getPublicationPreview()
	{
		if (this._publicationPreview!=null)
		{
			return _publicationPreview;
		}
		return _publicationPreview = getPersistenceContext().getValue(PUBLICATIONPREVIEW, _publicationPreview);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CometFile.chapterPreview</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the chapterPreview
	 */
	public void setChapterPreview(final ChapterModel value)
	{
		_chapterPreview = getPersistenceContext().setValue(CHAPTERPREVIEW, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CometFile.configuration</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the configuration
	 */
	public void setConfiguration(final CometConfigurationModel value)
	{
		_configuration = getPersistenceContext().setValue(CONFIGURATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CometFile.pagePreview</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the pagePreview
	 */
	public void setPagePreview(final PageModel value)
	{
		_pagePreview = getPersistenceContext().setValue(PAGEPREVIEW, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CometFile.publicationPreview</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the publicationPreview
	 */
	public void setPublicationPreview(final PublicationModel value)
	{
		_publicationPreview = getPersistenceContext().setValue(PUBLICATIONPREVIEW, value);
	}
	
}
