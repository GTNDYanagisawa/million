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
import de.hybris.platform.print.enums.SpreadPosition;
import de.hybris.platform.print.model.AbstractLayoutTemplateModel;
import de.hybris.platform.print.model.CometConfigurationModel;
import de.hybris.platform.print.model.LayoutTemplateModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type LayoutTemplate first defined at extension print.
 */
@SuppressWarnings("all")
public class LayoutTemplateModel extends AbstractLayoutTemplateModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "LayoutTemplate";
	
	/** <i>Generated constant</i> - Attribute key of <code>LayoutTemplate.id</code> attribute defined at extension <code>print</code>. */
	public static final String ID = "id";
	
	/** <i>Generated constant</i> - Attribute key of <code>LayoutTemplate.previewImage</code> attribute defined at extension <code>print</code>. */
	public static final String PREVIEWIMAGE = "previewImage";
	
	/** <i>Generated constant</i> - Attribute key of <code>LayoutTemplate.previewImageUrl</code> attribute defined at extension <code>print</code>. */
	public static final String PREVIEWIMAGEURL = "previewImageUrl";
	
	/** <i>Generated constant</i> - Attribute key of <code>LayoutTemplate.spreadPosition</code> attribute defined at extension <code>print</code>. */
	public static final String SPREADPOSITION = "spreadPosition";
	
	/** <i>Generated constant</i> - Attribute key of <code>LayoutTemplate.leftTemplateId</code> attribute defined at extension <code>print</code>. */
	public static final String LEFTTEMPLATEID = "leftTemplateId";
	
	/** <i>Generated constant</i> - Attribute key of <code>LayoutTemplate.leftTemplate</code> attribute defined at extension <code>print</code>. */
	public static final String LEFTTEMPLATE = "leftTemplate";
	
	/** <i>Generated constant</i> - Attribute key of <code>LayoutTemplate.middleTemplateId</code> attribute defined at extension <code>print</code>. */
	public static final String MIDDLETEMPLATEID = "middleTemplateId";
	
	/** <i>Generated constant</i> - Attribute key of <code>LayoutTemplate.middleTemplate</code> attribute defined at extension <code>print</code>. */
	public static final String MIDDLETEMPLATE = "middleTemplate";
	
	/** <i>Generated constant</i> - Attribute key of <code>LayoutTemplate.rightTemplateId</code> attribute defined at extension <code>print</code>. */
	public static final String RIGHTTEMPLATEID = "rightTemplateId";
	
	/** <i>Generated constant</i> - Attribute key of <code>LayoutTemplate.rightTemplate</code> attribute defined at extension <code>print</code>. */
	public static final String RIGHTTEMPLATE = "rightTemplate";
	
	/** <i>Generated constant</i> - Attribute key of <code>LayoutTemplate.continueTemplateId</code> attribute defined at extension <code>print</code>. */
	public static final String CONTINUETEMPLATEID = "continueTemplateId";
	
	/** <i>Generated constant</i> - Attribute key of <code>LayoutTemplate.scriptId</code> attribute defined at extension <code>print</code>. */
	public static final String SCRIPTID = "scriptId";
	
	/** <i>Generated constant</i> - Attribute key of <code>LayoutTemplate.kind</code> attribute defined at extension <code>print</code>. */
	public static final String KIND = "kind";
	
	/** <i>Generated constant</i> - Attribute key of <code>LayoutTemplate.memberships</code> attribute defined at extension <code>print</code>. */
	public static final String MEMBERSHIPS = "memberships";
	
	/** <i>Generated constant</i> - Attribute key of <code>LayoutTemplate.magnets</code> attribute defined at extension <code>print</code>. */
	public static final String MAGNETS = "magnets";
	
	/** <i>Generated constant</i> - Attribute key of <code>LayoutTemplate.active</code> attribute defined at extension <code>print</code>. */
	public static final String ACTIVE = "active";
	
	/** <i>Generated constant</i> - Attribute key of <code>LayoutTemplate.buildSupportScript</code> attribute defined at extension <code>print</code>. */
	public static final String BUILDSUPPORTSCRIPT = "buildSupportScript";
	
	/** <i>Generated constant</i> - Attribute key of <code>LayoutTemplate.textflowPrefix1Action</code> attribute defined at extension <code>print</code>. */
	public static final String TEXTFLOWPREFIX1ACTION = "textflowPrefix1Action";
	
	/** <i>Generated constant</i> - Attribute key of <code>LayoutTemplate.textflowPrefix1</code> attribute defined at extension <code>print</code>. */
	public static final String TEXTFLOWPREFIX1 = "textflowPrefix1";
	
	/** <i>Generated constant</i> - Attribute key of <code>LayoutTemplate.textflowPrefixNAction</code> attribute defined at extension <code>print</code>. */
	public static final String TEXTFLOWPREFIXNACTION = "textflowPrefixNAction";
	
	/** <i>Generated constant</i> - Attribute key of <code>LayoutTemplate.textflowPrefixN</code> attribute defined at extension <code>print</code>. */
	public static final String TEXTFLOWPREFIXN = "textflowPrefixN";
	
	/** <i>Generated constant</i> - Attribute key of <code>LayoutTemplate.color</code> attribute defined at extension <code>print</code>. */
	public static final String COLOR = "color";
	
	/** <i>Generated constant</i> - Attribute key of <code>LayoutTemplate.cometConfig</code> attribute defined at extension <code>print</code>. */
	public static final String COMETCONFIG = "cometConfig";
	
	
	/** <i>Generated variable</i> - Variable of <code>LayoutTemplate.id</code> attribute defined at extension <code>print</code>. */
	private Integer _id;
	
	/** <i>Generated variable</i> - Variable of <code>LayoutTemplate.previewImage</code> attribute defined at extension <code>print</code>. */
	private MediaModel _previewImage;
	
	/** <i>Generated variable</i> - Variable of <code>LayoutTemplate.previewImageUrl</code> attribute defined at extension <code>print</code>. */
	private String _previewImageUrl;
	
	/** <i>Generated variable</i> - Variable of <code>LayoutTemplate.spreadPosition</code> attribute defined at extension <code>print</code>. */
	private SpreadPosition _spreadPosition;
	
	/** <i>Generated variable</i> - Variable of <code>LayoutTemplate.leftTemplateId</code> attribute defined at extension <code>print</code>. */
	private Integer _leftTemplateId;
	
	/** <i>Generated variable</i> - Variable of <code>LayoutTemplate.leftTemplate</code> attribute defined at extension <code>print</code>. */
	private LayoutTemplateModel _leftTemplate;
	
	/** <i>Generated variable</i> - Variable of <code>LayoutTemplate.middleTemplateId</code> attribute defined at extension <code>print</code>. */
	private Integer _middleTemplateId;
	
	/** <i>Generated variable</i> - Variable of <code>LayoutTemplate.middleTemplate</code> attribute defined at extension <code>print</code>. */
	private LayoutTemplateModel _middleTemplate;
	
	/** <i>Generated variable</i> - Variable of <code>LayoutTemplate.rightTemplateId</code> attribute defined at extension <code>print</code>. */
	private Integer _rightTemplateId;
	
	/** <i>Generated variable</i> - Variable of <code>LayoutTemplate.rightTemplate</code> attribute defined at extension <code>print</code>. */
	private LayoutTemplateModel _rightTemplate;
	
	/** <i>Generated variable</i> - Variable of <code>LayoutTemplate.continueTemplateId</code> attribute defined at extension <code>print</code>. */
	private Integer _continueTemplateId;
	
	/** <i>Generated variable</i> - Variable of <code>LayoutTemplate.scriptId</code> attribute defined at extension <code>print</code>. */
	private Integer _scriptId;
	
	/** <i>Generated variable</i> - Variable of <code>LayoutTemplate.kind</code> attribute defined at extension <code>print</code>. */
	private String _kind;
	
	/** <i>Generated variable</i> - Variable of <code>LayoutTemplate.memberships</code> attribute defined at extension <code>print</code>. */
	private String _memberships;
	
	/** <i>Generated variable</i> - Variable of <code>LayoutTemplate.magnets</code> attribute defined at extension <code>print</code>. */
	private Integer _magnets;
	
	/** <i>Generated variable</i> - Variable of <code>LayoutTemplate.active</code> attribute defined at extension <code>print</code>. */
	private Integer _active;
	
	/** <i>Generated variable</i> - Variable of <code>LayoutTemplate.buildSupportScript</code> attribute defined at extension <code>print</code>. */
	private Integer _buildSupportScript;
	
	/** <i>Generated variable</i> - Variable of <code>LayoutTemplate.textflowPrefix1Action</code> attribute defined at extension <code>print</code>. */
	private Integer _textflowPrefix1Action;
	
	/** <i>Generated variable</i> - Variable of <code>LayoutTemplate.textflowPrefix1</code> attribute defined at extension <code>print</code>. */
	private String _textflowPrefix1;
	
	/** <i>Generated variable</i> - Variable of <code>LayoutTemplate.textflowPrefixNAction</code> attribute defined at extension <code>print</code>. */
	private Integer _textflowPrefixNAction;
	
	/** <i>Generated variable</i> - Variable of <code>LayoutTemplate.textflowPrefixN</code> attribute defined at extension <code>print</code>. */
	private String _textflowPrefixN;
	
	/** <i>Generated variable</i> - Variable of <code>LayoutTemplate.color</code> attribute defined at extension <code>print</code>. */
	private Integer _color;
	
	/** <i>Generated variable</i> - Variable of <code>LayoutTemplate.cometConfig</code> attribute defined at extension <code>print</code>. */
	private CometConfigurationModel _cometConfig;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public LayoutTemplateModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public LayoutTemplateModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>AbstractLayoutTemplate</code> at extension <code>print</code>
	 * @param _cometConfig initial attribute declared by type <code>LayoutTemplate</code> at extension <code>print</code>
	 * @param _id initial attribute declared by type <code>LayoutTemplate</code> at extension <code>print</code>
	 */
	@Deprecated
	public LayoutTemplateModel(final String _code, final CometConfigurationModel _cometConfig, final Integer _id)
	{
		super();
		setCode(_code);
		setCometConfig(_cometConfig);
		setId(_id);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>AbstractLayoutTemplate</code> at extension <code>print</code>
	 * @param _cometConfig initial attribute declared by type <code>LayoutTemplate</code> at extension <code>print</code>
	 * @param _id initial attribute declared by type <code>LayoutTemplate</code> at extension <code>print</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public LayoutTemplateModel(final String _code, final CometConfigurationModel _cometConfig, final Integer _id, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setCometConfig(_cometConfig);
		setId(_id);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LayoutTemplate.active</code> attribute defined at extension <code>print</code>. 
	 * @return the active
	 */
	public Integer getActive()
	{
		if (this._active!=null)
		{
			return _active;
		}
		return _active = getPersistenceContext().getValue(ACTIVE, _active);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LayoutTemplate.buildSupportScript</code> attribute defined at extension <code>print</code>. 
	 * @return the buildSupportScript
	 */
	public Integer getBuildSupportScript()
	{
		if (this._buildSupportScript!=null)
		{
			return _buildSupportScript;
		}
		return _buildSupportScript = getPersistenceContext().getValue(BUILDSUPPORTSCRIPT, _buildSupportScript);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LayoutTemplate.color</code> attribute defined at extension <code>print</code>. 
	 * @return the color
	 */
	public Integer getColor()
	{
		if (this._color!=null)
		{
			return _color;
		}
		return _color = getPersistenceContext().getValue(COLOR, _color);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LayoutTemplate.cometConfig</code> attribute defined at extension <code>print</code>. 
	 * @return the cometConfig
	 */
	public CometConfigurationModel getCometConfig()
	{
		if (this._cometConfig!=null)
		{
			return _cometConfig;
		}
		return _cometConfig = getPersistenceContext().getValue(COMETCONFIG, _cometConfig);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LayoutTemplate.continueTemplateId</code> attribute defined at extension <code>print</code>. 
	 * @return the continueTemplateId
	 */
	public Integer getContinueTemplateId()
	{
		if (this._continueTemplateId!=null)
		{
			return _continueTemplateId;
		}
		return _continueTemplateId = getPersistenceContext().getValue(CONTINUETEMPLATEID, _continueTemplateId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LayoutTemplate.id</code> attribute defined at extension <code>print</code>. 
	 * @return the id
	 */
	public Integer getId()
	{
		if (this._id!=null)
		{
			return _id;
		}
		return _id = getPersistenceContext().getValue(ID, _id);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LayoutTemplate.kind</code> attribute defined at extension <code>print</code>. 
	 * @return the kind
	 */
	public String getKind()
	{
		if (this._kind!=null)
		{
			return _kind;
		}
		return _kind = getPersistenceContext().getValue(KIND, _kind);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LayoutTemplate.leftTemplate</code> attribute defined at extension <code>print</code>. 
	 * @return the leftTemplate
	 */
	public LayoutTemplateModel getLeftTemplate()
	{
		if (this._leftTemplate!=null)
		{
			return _leftTemplate;
		}
		return _leftTemplate = getPersistenceContext().getValue(LEFTTEMPLATE, _leftTemplate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LayoutTemplate.leftTemplateId</code> attribute defined at extension <code>print</code>. 
	 * @return the leftTemplateId
	 */
	public Integer getLeftTemplateId()
	{
		if (this._leftTemplateId!=null)
		{
			return _leftTemplateId;
		}
		return _leftTemplateId = getPersistenceContext().getValue(LEFTTEMPLATEID, _leftTemplateId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LayoutTemplate.magnets</code> attribute defined at extension <code>print</code>. 
	 * @return the magnets
	 */
	public Integer getMagnets()
	{
		if (this._magnets!=null)
		{
			return _magnets;
		}
		return _magnets = getPersistenceContext().getValue(MAGNETS, _magnets);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LayoutTemplate.memberships</code> attribute defined at extension <code>print</code>. 
	 * @return the memberships
	 */
	public String getMemberships()
	{
		if (this._memberships!=null)
		{
			return _memberships;
		}
		return _memberships = getPersistenceContext().getValue(MEMBERSHIPS, _memberships);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LayoutTemplate.middleTemplate</code> attribute defined at extension <code>print</code>. 
	 * @return the middleTemplate
	 */
	public LayoutTemplateModel getMiddleTemplate()
	{
		if (this._middleTemplate!=null)
		{
			return _middleTemplate;
		}
		return _middleTemplate = getPersistenceContext().getValue(MIDDLETEMPLATE, _middleTemplate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LayoutTemplate.middleTemplateId</code> attribute defined at extension <code>print</code>. 
	 * @return the middleTemplateId
	 */
	public Integer getMiddleTemplateId()
	{
		if (this._middleTemplateId!=null)
		{
			return _middleTemplateId;
		}
		return _middleTemplateId = getPersistenceContext().getValue(MIDDLETEMPLATEID, _middleTemplateId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LayoutTemplate.previewImage</code> attribute defined at extension <code>print</code>. 
	 * @return the previewImage
	 */
	public MediaModel getPreviewImage()
	{
		if (this._previewImage!=null)
		{
			return _previewImage;
		}
		return _previewImage = getPersistenceContext().getValue(PREVIEWIMAGE, _previewImage);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LayoutTemplate.previewImageUrl</code> attribute defined at extension <code>print</code>. 
	 * @return the previewImageUrl
	 */
	public String getPreviewImageUrl()
	{
		if (this._previewImageUrl!=null)
		{
			return _previewImageUrl;
		}
		return _previewImageUrl = getPersistenceContext().getValue(PREVIEWIMAGEURL, _previewImageUrl);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LayoutTemplate.rightTemplate</code> attribute defined at extension <code>print</code>. 
	 * @return the rightTemplate
	 */
	public LayoutTemplateModel getRightTemplate()
	{
		if (this._rightTemplate!=null)
		{
			return _rightTemplate;
		}
		return _rightTemplate = getPersistenceContext().getValue(RIGHTTEMPLATE, _rightTemplate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LayoutTemplate.rightTemplateId</code> attribute defined at extension <code>print</code>. 
	 * @return the rightTemplateId
	 */
	public Integer getRightTemplateId()
	{
		if (this._rightTemplateId!=null)
		{
			return _rightTemplateId;
		}
		return _rightTemplateId = getPersistenceContext().getValue(RIGHTTEMPLATEID, _rightTemplateId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LayoutTemplate.scriptId</code> attribute defined at extension <code>print</code>. 
	 * @return the scriptId
	 */
	public Integer getScriptId()
	{
		if (this._scriptId!=null)
		{
			return _scriptId;
		}
		return _scriptId = getPersistenceContext().getValue(SCRIPTID, _scriptId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LayoutTemplate.spreadPosition</code> attribute defined at extension <code>print</code>. 
	 * @return the spreadPosition
	 */
	public SpreadPosition getSpreadPosition()
	{
		if (this._spreadPosition!=null)
		{
			return _spreadPosition;
		}
		return _spreadPosition = getPersistenceContext().getValue(SPREADPOSITION, _spreadPosition);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LayoutTemplate.textflowPrefix1</code> attribute defined at extension <code>print</code>. 
	 * @return the textflowPrefix1
	 */
	public String getTextflowPrefix1()
	{
		if (this._textflowPrefix1!=null)
		{
			return _textflowPrefix1;
		}
		return _textflowPrefix1 = getPersistenceContext().getValue(TEXTFLOWPREFIX1, _textflowPrefix1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LayoutTemplate.textflowPrefix1Action</code> attribute defined at extension <code>print</code>. 
	 * @return the textflowPrefix1Action
	 */
	public Integer getTextflowPrefix1Action()
	{
		if (this._textflowPrefix1Action!=null)
		{
			return _textflowPrefix1Action;
		}
		return _textflowPrefix1Action = getPersistenceContext().getValue(TEXTFLOWPREFIX1ACTION, _textflowPrefix1Action);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LayoutTemplate.textflowPrefixN</code> attribute defined at extension <code>print</code>. 
	 * @return the textflowPrefixN
	 */
	public String getTextflowPrefixN()
	{
		if (this._textflowPrefixN!=null)
		{
			return _textflowPrefixN;
		}
		return _textflowPrefixN = getPersistenceContext().getValue(TEXTFLOWPREFIXN, _textflowPrefixN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LayoutTemplate.textflowPrefixNAction</code> attribute defined at extension <code>print</code>. 
	 * @return the textflowPrefixNAction
	 */
	public Integer getTextflowPrefixNAction()
	{
		if (this._textflowPrefixNAction!=null)
		{
			return _textflowPrefixNAction;
		}
		return _textflowPrefixNAction = getPersistenceContext().getValue(TEXTFLOWPREFIXNACTION, _textflowPrefixNAction);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LayoutTemplate.active</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the active
	 */
	public void setActive(final Integer value)
	{
		_active = getPersistenceContext().setValue(ACTIVE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LayoutTemplate.buildSupportScript</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the buildSupportScript
	 */
	public void setBuildSupportScript(final Integer value)
	{
		_buildSupportScript = getPersistenceContext().setValue(BUILDSUPPORTSCRIPT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LayoutTemplate.color</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the color
	 */
	public void setColor(final Integer value)
	{
		_color = getPersistenceContext().setValue(COLOR, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LayoutTemplate.cometConfig</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the cometConfig
	 */
	public void setCometConfig(final CometConfigurationModel value)
	{
		_cometConfig = getPersistenceContext().setValue(COMETCONFIG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LayoutTemplate.continueTemplateId</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the continueTemplateId
	 */
	public void setContinueTemplateId(final Integer value)
	{
		_continueTemplateId = getPersistenceContext().setValue(CONTINUETEMPLATEID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LayoutTemplate.id</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the id
	 */
	public void setId(final Integer value)
	{
		_id = getPersistenceContext().setValue(ID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LayoutTemplate.kind</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the kind
	 */
	public void setKind(final String value)
	{
		_kind = getPersistenceContext().setValue(KIND, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LayoutTemplate.leftTemplate</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the leftTemplate
	 */
	public void setLeftTemplate(final LayoutTemplateModel value)
	{
		_leftTemplate = getPersistenceContext().setValue(LEFTTEMPLATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LayoutTemplate.leftTemplateId</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the leftTemplateId
	 */
	public void setLeftTemplateId(final Integer value)
	{
		_leftTemplateId = getPersistenceContext().setValue(LEFTTEMPLATEID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LayoutTemplate.magnets</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the magnets
	 */
	public void setMagnets(final Integer value)
	{
		_magnets = getPersistenceContext().setValue(MAGNETS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LayoutTemplate.memberships</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the memberships
	 */
	public void setMemberships(final String value)
	{
		_memberships = getPersistenceContext().setValue(MEMBERSHIPS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LayoutTemplate.middleTemplate</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the middleTemplate
	 */
	public void setMiddleTemplate(final LayoutTemplateModel value)
	{
		_middleTemplate = getPersistenceContext().setValue(MIDDLETEMPLATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LayoutTemplate.middleTemplateId</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the middleTemplateId
	 */
	public void setMiddleTemplateId(final Integer value)
	{
		_middleTemplateId = getPersistenceContext().setValue(MIDDLETEMPLATEID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LayoutTemplate.rightTemplate</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the rightTemplate
	 */
	public void setRightTemplate(final LayoutTemplateModel value)
	{
		_rightTemplate = getPersistenceContext().setValue(RIGHTTEMPLATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LayoutTemplate.rightTemplateId</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the rightTemplateId
	 */
	public void setRightTemplateId(final Integer value)
	{
		_rightTemplateId = getPersistenceContext().setValue(RIGHTTEMPLATEID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LayoutTemplate.scriptId</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the scriptId
	 */
	public void setScriptId(final Integer value)
	{
		_scriptId = getPersistenceContext().setValue(SCRIPTID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LayoutTemplate.spreadPosition</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the spreadPosition
	 */
	public void setSpreadPosition(final SpreadPosition value)
	{
		_spreadPosition = getPersistenceContext().setValue(SPREADPOSITION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LayoutTemplate.textflowPrefix1</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the textflowPrefix1
	 */
	public void setTextflowPrefix1(final String value)
	{
		_textflowPrefix1 = getPersistenceContext().setValue(TEXTFLOWPREFIX1, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LayoutTemplate.textflowPrefix1Action</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the textflowPrefix1Action
	 */
	public void setTextflowPrefix1Action(final Integer value)
	{
		_textflowPrefix1Action = getPersistenceContext().setValue(TEXTFLOWPREFIX1ACTION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LayoutTemplate.textflowPrefixN</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the textflowPrefixN
	 */
	public void setTextflowPrefixN(final String value)
	{
		_textflowPrefixN = getPersistenceContext().setValue(TEXTFLOWPREFIXN, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LayoutTemplate.textflowPrefixNAction</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the textflowPrefixNAction
	 */
	public void setTextflowPrefixNAction(final Integer value)
	{
		_textflowPrefixNAction = getPersistenceContext().setValue(TEXTFLOWPREFIXNACTION, value);
	}
	
}
