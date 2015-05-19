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
import de.hybris.platform.print.model.CometConfigurationModel;
import de.hybris.platform.print.model.GridElementModel;
import de.hybris.platform.print.model.GridModel;
import de.hybris.platform.print.model.LayoutTemplateModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.List;

/**
 * Generated model class for type Grid first defined at extension print.
 */
@SuppressWarnings("all")
public class GridModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "Grid";
	
	/** <i>Generated constant</i> - Attribute key of <code>Grid.id</code> attribute defined at extension <code>print</code>. */
	public static final String ID = "id";
	
	/** <i>Generated constant</i> - Attribute key of <code>Grid.name</code> attribute defined at extension <code>print</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>Grid.description</code> attribute defined at extension <code>print</code>. */
	public static final String DESCRIPTION = "description";
	
	/** <i>Generated constant</i> - Attribute key of <code>Grid.xpos</code> attribute defined at extension <code>print</code>. */
	public static final String XPOS = "xpos";
	
	/** <i>Generated constant</i> - Attribute key of <code>Grid.ypos</code> attribute defined at extension <code>print</code>. */
	public static final String YPOS = "ypos";
	
	/** <i>Generated constant</i> - Attribute key of <code>Grid.xsize</code> attribute defined at extension <code>print</code>. */
	public static final String XSIZE = "xsize";
	
	/** <i>Generated constant</i> - Attribute key of <code>Grid.ysize</code> attribute defined at extension <code>print</code>. */
	public static final String YSIZE = "ysize";
	
	/** <i>Generated constant</i> - Attribute key of <code>Grid.previewImage</code> attribute defined at extension <code>print</code>. */
	public static final String PREVIEWIMAGE = "previewImage";
	
	/** <i>Generated constant</i> - Attribute key of <code>Grid.previewImageUrl</code> attribute defined at extension <code>print</code>. */
	public static final String PREVIEWIMAGEURL = "previewImageUrl";
	
	/** <i>Generated constant</i> - Attribute key of <code>Grid.spreadPosition</code> attribute defined at extension <code>print</code>. */
	public static final String SPREADPOSITION = "spreadPosition";
	
	/** <i>Generated constant</i> - Attribute key of <code>Grid.leftGridId</code> attribute defined at extension <code>print</code>. */
	public static final String LEFTGRIDID = "leftGridId";
	
	/** <i>Generated constant</i> - Attribute key of <code>Grid.leftGrid</code> attribute defined at extension <code>print</code>. */
	public static final String LEFTGRID = "leftGrid";
	
	/** <i>Generated constant</i> - Attribute key of <code>Grid.middleGridId</code> attribute defined at extension <code>print</code>. */
	public static final String MIDDLEGRIDID = "middleGridId";
	
	/** <i>Generated constant</i> - Attribute key of <code>Grid.middleGrid</code> attribute defined at extension <code>print</code>. */
	public static final String MIDDLEGRID = "middleGrid";
	
	/** <i>Generated constant</i> - Attribute key of <code>Grid.rightGridId</code> attribute defined at extension <code>print</code>. */
	public static final String RIGHTGRIDID = "rightGridId";
	
	/** <i>Generated constant</i> - Attribute key of <code>Grid.rightGrid</code> attribute defined at extension <code>print</code>. */
	public static final String RIGHTGRID = "rightGrid";
	
	/** <i>Generated constant</i> - Attribute key of <code>Grid.defaultLayoutTemplate</code> attribute defined at extension <code>print</code>. */
	public static final String DEFAULTLAYOUTTEMPLATE = "defaultLayoutTemplate";
	
	/** <i>Generated constant</i> - Attribute key of <code>Grid.elements</code> attribute defined at extension <code>print</code>. */
	public static final String ELEMENTS = "elements";
	
	/** <i>Generated constant</i> - Attribute key of <code>Grid.cometConfig</code> attribute defined at extension <code>print</code>. */
	public static final String COMETCONFIG = "cometConfig";
	
	
	/** <i>Generated variable</i> - Variable of <code>Grid.id</code> attribute defined at extension <code>print</code>. */
	private Integer _id;
	
	/** <i>Generated variable</i> - Variable of <code>Grid.name</code> attribute defined at extension <code>print</code>. */
	private String _name;
	
	/** <i>Generated variable</i> - Variable of <code>Grid.description</code> attribute defined at extension <code>print</code>. */
	private String _description;
	
	/** <i>Generated variable</i> - Variable of <code>Grid.xpos</code> attribute defined at extension <code>print</code>. */
	private Double _xpos;
	
	/** <i>Generated variable</i> - Variable of <code>Grid.ypos</code> attribute defined at extension <code>print</code>. */
	private Double _ypos;
	
	/** <i>Generated variable</i> - Variable of <code>Grid.xsize</code> attribute defined at extension <code>print</code>. */
	private Double _xsize;
	
	/** <i>Generated variable</i> - Variable of <code>Grid.ysize</code> attribute defined at extension <code>print</code>. */
	private Double _ysize;
	
	/** <i>Generated variable</i> - Variable of <code>Grid.previewImage</code> attribute defined at extension <code>print</code>. */
	private MediaModel _previewImage;
	
	/** <i>Generated variable</i> - Variable of <code>Grid.previewImageUrl</code> attribute defined at extension <code>print</code>. */
	private String _previewImageUrl;
	
	/** <i>Generated variable</i> - Variable of <code>Grid.spreadPosition</code> attribute defined at extension <code>print</code>. */
	private SpreadPosition _spreadPosition;
	
	/** <i>Generated variable</i> - Variable of <code>Grid.leftGridId</code> attribute defined at extension <code>print</code>. */
	private Integer _leftGridId;
	
	/** <i>Generated variable</i> - Variable of <code>Grid.leftGrid</code> attribute defined at extension <code>print</code>. */
	private GridModel _leftGrid;
	
	/** <i>Generated variable</i> - Variable of <code>Grid.middleGridId</code> attribute defined at extension <code>print</code>. */
	private Integer _middleGridId;
	
	/** <i>Generated variable</i> - Variable of <code>Grid.middleGrid</code> attribute defined at extension <code>print</code>. */
	private GridModel _middleGrid;
	
	/** <i>Generated variable</i> - Variable of <code>Grid.rightGridId</code> attribute defined at extension <code>print</code>. */
	private Integer _rightGridId;
	
	/** <i>Generated variable</i> - Variable of <code>Grid.rightGrid</code> attribute defined at extension <code>print</code>. */
	private GridModel _rightGrid;
	
	/** <i>Generated variable</i> - Variable of <code>Grid.defaultLayoutTemplate</code> attribute defined at extension <code>print</code>. */
	private LayoutTemplateModel _defaultLayoutTemplate;
	
	/** <i>Generated variable</i> - Variable of <code>Grid.elements</code> attribute defined at extension <code>print</code>. */
	private List<GridElementModel> _elements;
	
	/** <i>Generated variable</i> - Variable of <code>Grid.cometConfig</code> attribute defined at extension <code>print</code>. */
	private CometConfigurationModel _cometConfig;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public GridModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public GridModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _cometConfig initial attribute declared by type <code>Grid</code> at extension <code>print</code>
	 * @param _id initial attribute declared by type <code>Grid</code> at extension <code>print</code>
	 */
	@Deprecated
	public GridModel(final CometConfigurationModel _cometConfig, final Integer _id)
	{
		super();
		setCometConfig(_cometConfig);
		setId(_id);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _cometConfig initial attribute declared by type <code>Grid</code> at extension <code>print</code>
	 * @param _id initial attribute declared by type <code>Grid</code> at extension <code>print</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public GridModel(final CometConfigurationModel _cometConfig, final Integer _id, final ItemModel _owner)
	{
		super();
		setCometConfig(_cometConfig);
		setId(_id);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Grid.cometConfig</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Grid.defaultLayoutTemplate</code> attribute defined at extension <code>print</code>. 
	 * @return the defaultLayoutTemplate
	 */
	public LayoutTemplateModel getDefaultLayoutTemplate()
	{
		if (this._defaultLayoutTemplate!=null)
		{
			return _defaultLayoutTemplate;
		}
		return _defaultLayoutTemplate = getPersistenceContext().getValue(DEFAULTLAYOUTTEMPLATE, _defaultLayoutTemplate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Grid.description</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Grid.elements</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the elements
	 */
	public List<GridElementModel> getElements()
	{
		if (this._elements!=null)
		{
			return _elements;
		}
		return _elements = getPersistenceContext().getValue(ELEMENTS, _elements);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Grid.id</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Grid.leftGrid</code> attribute defined at extension <code>print</code>. 
	 * @return the leftGrid
	 */
	public GridModel getLeftGrid()
	{
		if (this._leftGrid!=null)
		{
			return _leftGrid;
		}
		return _leftGrid = getPersistenceContext().getValue(LEFTGRID, _leftGrid);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Grid.leftGridId</code> attribute defined at extension <code>print</code>. 
	 * @return the leftGridId
	 */
	public Integer getLeftGridId()
	{
		if (this._leftGridId!=null)
		{
			return _leftGridId;
		}
		return _leftGridId = getPersistenceContext().getValue(LEFTGRIDID, _leftGridId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Grid.middleGrid</code> attribute defined at extension <code>print</code>. 
	 * @return the middleGrid
	 */
	public GridModel getMiddleGrid()
	{
		if (this._middleGrid!=null)
		{
			return _middleGrid;
		}
		return _middleGrid = getPersistenceContext().getValue(MIDDLEGRID, _middleGrid);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Grid.middleGridId</code> attribute defined at extension <code>print</code>. 
	 * @return the middleGridId
	 */
	public Integer getMiddleGridId()
	{
		if (this._middleGridId!=null)
		{
			return _middleGridId;
		}
		return _middleGridId = getPersistenceContext().getValue(MIDDLEGRIDID, _middleGridId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Grid.name</code> attribute defined at extension <code>print</code>. 
	 * @return the name
	 */
	public String getName()
	{
		if (this._name!=null)
		{
			return _name;
		}
		return _name = getPersistenceContext().getValue(NAME, _name);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Grid.previewImage</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Grid.previewImageUrl</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Grid.rightGrid</code> attribute defined at extension <code>print</code>. 
	 * @return the rightGrid
	 */
	public GridModel getRightGrid()
	{
		if (this._rightGrid!=null)
		{
			return _rightGrid;
		}
		return _rightGrid = getPersistenceContext().getValue(RIGHTGRID, _rightGrid);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Grid.rightGridId</code> attribute defined at extension <code>print</code>. 
	 * @return the rightGridId
	 */
	public Integer getRightGridId()
	{
		if (this._rightGridId!=null)
		{
			return _rightGridId;
		}
		return _rightGridId = getPersistenceContext().getValue(RIGHTGRIDID, _rightGridId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Grid.spreadPosition</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Grid.xpos</code> attribute defined at extension <code>print</code>. 
	 * @return the xpos
	 */
	public Double getXpos()
	{
		if (this._xpos!=null)
		{
			return _xpos;
		}
		return _xpos = getPersistenceContext().getValue(XPOS, _xpos);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Grid.xsize</code> attribute defined at extension <code>print</code>. 
	 * @return the xsize
	 */
	public Double getXsize()
	{
		if (this._xsize!=null)
		{
			return _xsize;
		}
		return _xsize = getPersistenceContext().getValue(XSIZE, _xsize);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Grid.ypos</code> attribute defined at extension <code>print</code>. 
	 * @return the ypos
	 */
	public Double getYpos()
	{
		if (this._ypos!=null)
		{
			return _ypos;
		}
		return _ypos = getPersistenceContext().getValue(YPOS, _ypos);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Grid.ysize</code> attribute defined at extension <code>print</code>. 
	 * @return the ysize
	 */
	public Double getYsize()
	{
		if (this._ysize!=null)
		{
			return _ysize;
		}
		return _ysize = getPersistenceContext().getValue(YSIZE, _ysize);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Grid.cometConfig</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the cometConfig
	 */
	public void setCometConfig(final CometConfigurationModel value)
	{
		_cometConfig = getPersistenceContext().setValue(COMETCONFIG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Grid.defaultLayoutTemplate</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the defaultLayoutTemplate
	 */
	public void setDefaultLayoutTemplate(final LayoutTemplateModel value)
	{
		_defaultLayoutTemplate = getPersistenceContext().setValue(DEFAULTLAYOUTTEMPLATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Grid.description</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the description
	 */
	public void setDescription(final String value)
	{
		_description = getPersistenceContext().setValue(DESCRIPTION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Grid.elements</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the elements
	 */
	public void setElements(final List<GridElementModel> value)
	{
		_elements = getPersistenceContext().setValue(ELEMENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Grid.id</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the id
	 */
	public void setId(final Integer value)
	{
		_id = getPersistenceContext().setValue(ID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Grid.leftGrid</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the leftGrid
	 */
	public void setLeftGrid(final GridModel value)
	{
		_leftGrid = getPersistenceContext().setValue(LEFTGRID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Grid.leftGridId</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the leftGridId
	 */
	public void setLeftGridId(final Integer value)
	{
		_leftGridId = getPersistenceContext().setValue(LEFTGRIDID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Grid.middleGrid</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the middleGrid
	 */
	public void setMiddleGrid(final GridModel value)
	{
		_middleGrid = getPersistenceContext().setValue(MIDDLEGRID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Grid.middleGridId</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the middleGridId
	 */
	public void setMiddleGridId(final Integer value)
	{
		_middleGridId = getPersistenceContext().setValue(MIDDLEGRIDID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Grid.name</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the name
	 */
	public void setName(final String value)
	{
		_name = getPersistenceContext().setValue(NAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Grid.rightGrid</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the rightGrid
	 */
	public void setRightGrid(final GridModel value)
	{
		_rightGrid = getPersistenceContext().setValue(RIGHTGRID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Grid.rightGridId</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the rightGridId
	 */
	public void setRightGridId(final Integer value)
	{
		_rightGridId = getPersistenceContext().setValue(RIGHTGRIDID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Grid.spreadPosition</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the spreadPosition
	 */
	public void setSpreadPosition(final SpreadPosition value)
	{
		_spreadPosition = getPersistenceContext().setValue(SPREADPOSITION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Grid.xpos</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the xpos
	 */
	public void setXpos(final Double value)
	{
		_xpos = getPersistenceContext().setValue(XPOS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Grid.xsize</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the xsize
	 */
	public void setXsize(final Double value)
	{
		_xsize = getPersistenceContext().setValue(XSIZE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Grid.ypos</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the ypos
	 */
	public void setYpos(final Double value)
	{
		_ypos = getPersistenceContext().setValue(YPOS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Grid.ysize</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the ysize
	 */
	public void setYsize(final Double value)
	{
		_ysize = getPersistenceContext().setValue(YSIZE, value);
	}
	
}
