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

import de.hybris.platform.commons.model.translator.JaloTranslatorConfigurationModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.print.enums.DeleteAutoCometJob;
import de.hybris.platform.print.enums.PDFPresetEnum;
import de.hybris.platform.print.model.ActionModel;
import de.hybris.platform.print.model.CometFileModel;
import de.hybris.platform.print.model.GridModel;
import de.hybris.platform.print.model.LayoutTemplateModel;
import de.hybris.platform.print.model.PlaceholderModel;
import de.hybris.platform.print.model.PlaceholderTemplateModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/**
 * Generated model class for type CometConfiguration first defined at extension print.
 */
@SuppressWarnings("all")
public class CometConfigurationModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CometConfiguration";
	
	/**<i>Generated relation code constant for relation <code>Placeholder2CometConfigRelation</code> defining source attribute <code>placeholders</code> in extension <code>print</code>.</i>*/
	public final static String _PLACEHOLDER2COMETCONFIGRELATION = "Placeholder2CometConfigRelation";
	
	/**<i>Generated relation code constant for relation <code>PlaceholderTemplate2CometConfigRelation</code> defining source attribute <code>placeholderTemplates</code> in extension <code>print</code>.</i>*/
	public final static String _PLACEHOLDERTEMPLATE2COMETCONFIGRELATION = "PlaceholderTemplate2CometConfigRelation";
	
	/**<i>Generated relation code constant for relation <code>Action2CometConfigRelation</code> defining source attribute <code>actions</code> in extension <code>print</code>.</i>*/
	public final static String _ACTION2COMETCONFIGRELATION = "Action2CometConfigRelation";
	
	/**<i>Generated relation code constant for relation <code>Grid2CometConfigRelation</code> defining source attribute <code>grids</code> in extension <code>print</code>.</i>*/
	public final static String _GRID2COMETCONFIGRELATION = "Grid2CometConfigRelation";
	
	/**<i>Generated relation code constant for relation <code>LayoutTemplate2CometConfigRelation</code> defining source attribute <code>layoutTemplates</code> in extension <code>print</code>.</i>*/
	public final static String _LAYOUTTEMPLATE2COMETCONFIGRELATION = "LayoutTemplate2CometConfigRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>CometConfiguration.code</code> attribute defined at extension <code>print</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>CometConfiguration.name</code> attribute defined at extension <code>print</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>CometConfiguration.defaultConfiguration</code> attribute defined at extension <code>print</code>. */
	public static final String DEFAULTCONFIGURATION = "defaultConfiguration";
	
	/** <i>Generated constant</i> - Attribute key of <code>CometConfiguration.publicationController</code> attribute defined at extension <code>print</code>. */
	public static final String PUBLICATIONCONTROLLER = "publicationController";
	
	/** <i>Generated constant</i> - Attribute key of <code>CometConfiguration.imageRoot</code> attribute defined at extension <code>print</code>. */
	public static final String IMAGEROOT = "imageRoot";
	
	/** <i>Generated constant</i> - Attribute key of <code>CometConfiguration.serverTemplatePath</code> attribute defined at extension <code>print</code>. */
	public static final String SERVERTEMPLATEPATH = "serverTemplatePath";
	
	/** <i>Generated constant</i> - Attribute key of <code>CometConfiguration.serverWorkingPath</code> attribute defined at extension <code>print</code>. */
	public static final String SERVERWORKINGPATH = "serverWorkingPath";
	
	/** <i>Generated constant</i> - Attribute key of <code>CometConfiguration.translatorConfiguration</code> attribute defined at extension <code>print</code>. */
	public static final String TRANSLATORCONFIGURATION = "translatorConfiguration";
	
	/** <i>Generated constant</i> - Attribute key of <code>CometConfiguration.defaultDeleteAutoCometJob</code> attribute defined at extension <code>print</code>. */
	public static final String DEFAULTDELETEAUTOCOMETJOB = "defaultDeleteAutoCometJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>CometConfiguration.previewHistoryCount</code> attribute defined at extension <code>print</code>. */
	public static final String PREVIEWHISTORYCOUNT = "previewHistoryCount";
	
	/** <i>Generated constant</i> - Attribute key of <code>CometConfiguration.pagePreviewSize</code> attribute defined at extension <code>print</code>. */
	public static final String PAGEPREVIEWSIZE = "pagePreviewSize";
	
	/** <i>Generated constant</i> - Attribute key of <code>CometConfiguration.pdfPreset</code> attribute defined at extension <code>print</code>. */
	public static final String PDFPRESET = "pdfPreset";
	
	/** <i>Generated constant</i> - Attribute key of <code>CometConfiguration.configurationFiles</code> attribute defined at extension <code>print</code>. */
	public static final String CONFIGURATIONFILES = "configurationFiles";
	
	/** <i>Generated constant</i> - Attribute key of <code>CometConfiguration.placeholders</code> attribute defined at extension <code>print</code>. */
	public static final String PLACEHOLDERS = "placeholders";
	
	/** <i>Generated constant</i> - Attribute key of <code>CometConfiguration.placeholderTemplates</code> attribute defined at extension <code>print</code>. */
	public static final String PLACEHOLDERTEMPLATES = "placeholderTemplates";
	
	/** <i>Generated constant</i> - Attribute key of <code>CometConfiguration.actions</code> attribute defined at extension <code>print</code>. */
	public static final String ACTIONS = "actions";
	
	/** <i>Generated constant</i> - Attribute key of <code>CometConfiguration.grids</code> attribute defined at extension <code>print</code>. */
	public static final String GRIDS = "grids";
	
	/** <i>Generated constant</i> - Attribute key of <code>CometConfiguration.layoutTemplates</code> attribute defined at extension <code>print</code>. */
	public static final String LAYOUTTEMPLATES = "layoutTemplates";
	
	
	/** <i>Generated variable</i> - Variable of <code>CometConfiguration.code</code> attribute defined at extension <code>print</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>CometConfiguration.defaultConfiguration</code> attribute defined at extension <code>print</code>. */
	private Boolean _defaultConfiguration;
	
	/** <i>Generated variable</i> - Variable of <code>CometConfiguration.publicationController</code> attribute defined at extension <code>print</code>. */
	private String _publicationController;
	
	/** <i>Generated variable</i> - Variable of <code>CometConfiguration.imageRoot</code> attribute defined at extension <code>print</code>. */
	private String _imageRoot;
	
	/** <i>Generated variable</i> - Variable of <code>CometConfiguration.serverTemplatePath</code> attribute defined at extension <code>print</code>. */
	private String _serverTemplatePath;
	
	/** <i>Generated variable</i> - Variable of <code>CometConfiguration.serverWorkingPath</code> attribute defined at extension <code>print</code>. */
	private String _serverWorkingPath;
	
	/** <i>Generated variable</i> - Variable of <code>CometConfiguration.translatorConfiguration</code> attribute defined at extension <code>print</code>. */
	private JaloTranslatorConfigurationModel _translatorConfiguration;
	
	/** <i>Generated variable</i> - Variable of <code>CometConfiguration.defaultDeleteAutoCometJob</code> attribute defined at extension <code>print</code>. */
	private DeleteAutoCometJob _defaultDeleteAutoCometJob;
	
	/** <i>Generated variable</i> - Variable of <code>CometConfiguration.previewHistoryCount</code> attribute defined at extension <code>print</code>. */
	private Integer _previewHistoryCount;
	
	/** <i>Generated variable</i> - Variable of <code>CometConfiguration.pagePreviewSize</code> attribute defined at extension <code>print</code>. */
	private Integer _pagePreviewSize;
	
	/** <i>Generated variable</i> - Variable of <code>CometConfiguration.pdfPreset</code> attribute defined at extension <code>print</code>. */
	private PDFPresetEnum _pdfPreset;
	
	/** <i>Generated variable</i> - Variable of <code>CometConfiguration.configurationFiles</code> attribute defined at extension <code>print</code>. */
	private Collection<CometFileModel> _configurationFiles;
	
	/** <i>Generated variable</i> - Variable of <code>CometConfiguration.placeholders</code> attribute defined at extension <code>print</code>. */
	private List<PlaceholderModel> _placeholders;
	
	/** <i>Generated variable</i> - Variable of <code>CometConfiguration.placeholderTemplates</code> attribute defined at extension <code>print</code>. */
	private List<PlaceholderTemplateModel> _placeholderTemplates;
	
	/** <i>Generated variable</i> - Variable of <code>CometConfiguration.actions</code> attribute defined at extension <code>print</code>. */
	private List<ActionModel> _actions;
	
	/** <i>Generated variable</i> - Variable of <code>CometConfiguration.grids</code> attribute defined at extension <code>print</code>. */
	private List<GridModel> _grids;
	
	/** <i>Generated variable</i> - Variable of <code>CometConfiguration.layoutTemplates</code> attribute defined at extension <code>print</code>. */
	private List<LayoutTemplateModel> _layoutTemplates;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CometConfigurationModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CometConfigurationModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>CometConfiguration</code> at extension <code>print</code>
	 */
	@Deprecated
	public CometConfigurationModel(final String _code)
	{
		super();
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>CometConfiguration</code> at extension <code>print</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public CometConfigurationModel(final String _code, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CometConfiguration.actions</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the actions
	 */
	public List<ActionModel> getActions()
	{
		if (this._actions!=null)
		{
			return _actions;
		}
		return _actions = getPersistenceContext().getValue(ACTIONS, _actions);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CometConfiguration.code</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>CometConfiguration.configurationFiles</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the configurationFiles
	 */
	public Collection<CometFileModel> getConfigurationFiles()
	{
		if (this._configurationFiles!=null)
		{
			return _configurationFiles;
		}
		return _configurationFiles = getPersistenceContext().getValue(CONFIGURATIONFILES, _configurationFiles);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CometConfiguration.defaultConfiguration</code> attribute defined at extension <code>print</code>. 
	 * @return the defaultConfiguration
	 */
	public Boolean getDefaultConfiguration()
	{
		if (this._defaultConfiguration!=null)
		{
			return _defaultConfiguration;
		}
		return _defaultConfiguration = getPersistenceContext().getValue(DEFAULTCONFIGURATION, _defaultConfiguration);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CometConfiguration.defaultDeleteAutoCometJob</code> attribute defined at extension <code>print</code>. 
	 * @return the defaultDeleteAutoCometJob
	 */
	public DeleteAutoCometJob getDefaultDeleteAutoCometJob()
	{
		if (this._defaultDeleteAutoCometJob!=null)
		{
			return _defaultDeleteAutoCometJob;
		}
		return _defaultDeleteAutoCometJob = getPersistenceContext().getValue(DEFAULTDELETEAUTOCOMETJOB, _defaultDeleteAutoCometJob);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CometConfiguration.grids</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the grids
	 */
	public List<GridModel> getGrids()
	{
		if (this._grids!=null)
		{
			return _grids;
		}
		return _grids = getPersistenceContext().getValue(GRIDS, _grids);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CometConfiguration.imageRoot</code> attribute defined at extension <code>print</code>. 
	 * @return the imageRoot - Specifies the directory where the Comet client will find the images to use
	 */
	public String getImageRoot()
	{
		if (this._imageRoot!=null)
		{
			return _imageRoot;
		}
		return _imageRoot = getPersistenceContext().getValue(IMAGEROOT, _imageRoot);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CometConfiguration.layoutTemplates</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the layoutTemplates
	 */
	public List<LayoutTemplateModel> getLayoutTemplates()
	{
		if (this._layoutTemplates!=null)
		{
			return _layoutTemplates;
		}
		return _layoutTemplates = getPersistenceContext().getValue(LAYOUTTEMPLATES, _layoutTemplates);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CometConfiguration.name</code> attribute defined at extension <code>print</code>. 
	 * @return the name
	 */
	public String getName()
	{
		return getName(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>CometConfiguration.name</code> attribute defined at extension <code>print</code>. 
	 * @param loc the value localization key 
	 * @return the name
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getName(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(NAME, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CometConfiguration.pagePreviewSize</code> attribute defined at extension <code>print</code>. 
	 * @return the pagePreviewSize - pages preview image size
	 */
	public Integer getPagePreviewSize()
	{
		if (this._pagePreviewSize!=null)
		{
			return _pagePreviewSize;
		}
		return _pagePreviewSize = getPersistenceContext().getValue(PAGEPREVIEWSIZE, _pagePreviewSize);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CometConfiguration.pdfPreset</code> attribute defined at extension <code>print</code>. 
	 * @return the pdfPreset - kind of pdf preview
	 */
	public PDFPresetEnum getPdfPreset()
	{
		if (this._pdfPreset!=null)
		{
			return _pdfPreset;
		}
		return _pdfPreset = getPersistenceContext().getValue(PDFPRESET, _pdfPreset);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CometConfiguration.placeholders</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the placeholders
	 */
	public List<PlaceholderModel> getPlaceholders()
	{
		if (this._placeholders!=null)
		{
			return _placeholders;
		}
		return _placeholders = getPersistenceContext().getValue(PLACEHOLDERS, _placeholders);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CometConfiguration.placeholderTemplates</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the placeholderTemplates
	 */
	public List<PlaceholderTemplateModel> getPlaceholderTemplates()
	{
		if (this._placeholderTemplates!=null)
		{
			return _placeholderTemplates;
		}
		return _placeholderTemplates = getPersistenceContext().getValue(PLACEHOLDERTEMPLATES, _placeholderTemplates);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CometConfiguration.previewHistoryCount</code> attribute defined at extension <code>print</code>. 
	 * @return the previewHistoryCount - history quantity of the generated preview files (pdf/images)
	 */
	public Integer getPreviewHistoryCount()
	{
		if (this._previewHistoryCount!=null)
		{
			return _previewHistoryCount;
		}
		return _previewHistoryCount = getPersistenceContext().getValue(PREVIEWHISTORYCOUNT, _previewHistoryCount);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CometConfiguration.publicationController</code> attribute defined at extension <code>print</code>. 
	 * @return the publicationController - Specifies the class that processes simplified incoming Werk II Comet requests
	 */
	public String getPublicationController()
	{
		if (this._publicationController!=null)
		{
			return _publicationController;
		}
		return _publicationController = getPersistenceContext().getValue(PUBLICATIONCONTROLLER, _publicationController);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CometConfiguration.serverTemplatePath</code> attribute defined at extension <code>print</code>. 
	 * @return the serverTemplatePath
	 */
	public String getServerTemplatePath()
	{
		if (this._serverTemplatePath!=null)
		{
			return _serverTemplatePath;
		}
		return _serverTemplatePath = getPersistenceContext().getValue(SERVERTEMPLATEPATH, _serverTemplatePath);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CometConfiguration.serverWorkingPath</code> attribute defined at extension <code>print</code>. 
	 * @return the serverWorkingPath
	 */
	public String getServerWorkingPath()
	{
		if (this._serverWorkingPath!=null)
		{
			return _serverWorkingPath;
		}
		return _serverWorkingPath = getPersistenceContext().getValue(SERVERWORKINGPATH, _serverWorkingPath);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CometConfiguration.translatorConfiguration</code> attribute defined at extension <code>print</code>. 
	 * @return the translatorConfiguration - The configuration that specifies settings for the translation of HTML text
	 */
	public JaloTranslatorConfigurationModel getTranslatorConfiguration()
	{
		if (this._translatorConfiguration!=null)
		{
			return _translatorConfiguration;
		}
		return _translatorConfiguration = getPersistenceContext().getValue(TRANSLATORCONFIGURATION, _translatorConfiguration);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CometConfiguration.actions</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the actions
	 */
	public void setActions(final List<ActionModel> value)
	{
		_actions = getPersistenceContext().setValue(ACTIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CometConfiguration.code</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CometConfiguration.configurationFiles</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the configurationFiles
	 */
	public void setConfigurationFiles(final Collection<CometFileModel> value)
	{
		_configurationFiles = getPersistenceContext().setValue(CONFIGURATIONFILES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CometConfiguration.defaultConfiguration</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the defaultConfiguration
	 */
	public void setDefaultConfiguration(final Boolean value)
	{
		_defaultConfiguration = getPersistenceContext().setValue(DEFAULTCONFIGURATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CometConfiguration.defaultDeleteAutoCometJob</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the defaultDeleteAutoCometJob
	 */
	public void setDefaultDeleteAutoCometJob(final DeleteAutoCometJob value)
	{
		_defaultDeleteAutoCometJob = getPersistenceContext().setValue(DEFAULTDELETEAUTOCOMETJOB, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CometConfiguration.grids</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the grids
	 */
	public void setGrids(final List<GridModel> value)
	{
		_grids = getPersistenceContext().setValue(GRIDS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CometConfiguration.imageRoot</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the imageRoot - Specifies the directory where the Comet client will find the images to use
	 */
	public void setImageRoot(final String value)
	{
		_imageRoot = getPersistenceContext().setValue(IMAGEROOT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CometConfiguration.layoutTemplates</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the layoutTemplates
	 */
	public void setLayoutTemplates(final List<LayoutTemplateModel> value)
	{
		_layoutTemplates = getPersistenceContext().setValue(LAYOUTTEMPLATES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CometConfiguration.name</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>CometConfiguration.name</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Setter of <code>CometConfiguration.pagePreviewSize</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the pagePreviewSize - pages preview image size
	 */
	public void setPagePreviewSize(final Integer value)
	{
		_pagePreviewSize = getPersistenceContext().setValue(PAGEPREVIEWSIZE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CometConfiguration.pdfPreset</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the pdfPreset - kind of pdf preview
	 */
	public void setPdfPreset(final PDFPresetEnum value)
	{
		_pdfPreset = getPersistenceContext().setValue(PDFPRESET, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CometConfiguration.placeholders</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the placeholders
	 */
	public void setPlaceholders(final List<PlaceholderModel> value)
	{
		_placeholders = getPersistenceContext().setValue(PLACEHOLDERS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CometConfiguration.placeholderTemplates</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the placeholderTemplates
	 */
	public void setPlaceholderTemplates(final List<PlaceholderTemplateModel> value)
	{
		_placeholderTemplates = getPersistenceContext().setValue(PLACEHOLDERTEMPLATES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CometConfiguration.previewHistoryCount</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the previewHistoryCount - history quantity of the generated preview files (pdf/images)
	 */
	public void setPreviewHistoryCount(final Integer value)
	{
		_previewHistoryCount = getPersistenceContext().setValue(PREVIEWHISTORYCOUNT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CometConfiguration.publicationController</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the publicationController - Specifies the class that processes simplified incoming Werk II Comet requests
	 */
	public void setPublicationController(final String value)
	{
		_publicationController = getPersistenceContext().setValue(PUBLICATIONCONTROLLER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CometConfiguration.serverTemplatePath</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the serverTemplatePath
	 */
	public void setServerTemplatePath(final String value)
	{
		_serverTemplatePath = getPersistenceContext().setValue(SERVERTEMPLATEPATH, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CometConfiguration.serverWorkingPath</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the serverWorkingPath
	 */
	public void setServerWorkingPath(final String value)
	{
		_serverWorkingPath = getPersistenceContext().setValue(SERVERWORKINGPATH, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CometConfiguration.translatorConfiguration</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the translatorConfiguration - The configuration that specifies settings for the translation of HTML text
	 */
	public void setTranslatorConfiguration(final JaloTranslatorConfigurationModel value)
	{
		_translatorConfiguration = getPersistenceContext().setValue(TRANSLATORCONFIGURATION, value);
	}
	
}
