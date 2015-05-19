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
import de.hybris.platform.print.model.GridModel;
import de.hybris.platform.print.model.LayoutTemplateModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type GridElement first defined at extension print.
 */
@SuppressWarnings("all")
public class GridElementModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "GridElement";
	
	/**<i>Generated relation code constant for relation <code>Grid2ElementRelation</code> defining source attribute <code>grid</code> in extension <code>print</code>.</i>*/
	public final static String _GRID2ELEMENTRELATION = "Grid2ElementRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>GridElement.id</code> attribute defined at extension <code>print</code>. */
	public static final String ID = "id";
	
	/** <i>Generated constant</i> - Attribute key of <code>GridElement.name</code> attribute defined at extension <code>print</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>GridElement.xpos</code> attribute defined at extension <code>print</code>. */
	public static final String XPOS = "xpos";
	
	/** <i>Generated constant</i> - Attribute key of <code>GridElement.ypos</code> attribute defined at extension <code>print</code>. */
	public static final String YPOS = "ypos";
	
	/** <i>Generated constant</i> - Attribute key of <code>GridElement.xsize</code> attribute defined at extension <code>print</code>. */
	public static final String XSIZE = "xsize";
	
	/** <i>Generated constant</i> - Attribute key of <code>GridElement.ysize</code> attribute defined at extension <code>print</code>. */
	public static final String YSIZE = "ysize";
	
	/** <i>Generated constant</i> - Attribute key of <code>GridElement.defaultLayoutTemplate</code> attribute defined at extension <code>print</code>. */
	public static final String DEFAULTLAYOUTTEMPLATE = "defaultLayoutTemplate";
	
	/** <i>Generated constant</i> - Attribute key of <code>GridElement.grid</code> attribute defined at extension <code>print</code>. */
	public static final String GRID = "grid";
	
	
	/** <i>Generated variable</i> - Variable of <code>GridElement.id</code> attribute defined at extension <code>print</code>. */
	private Integer _id;
	
	/** <i>Generated variable</i> - Variable of <code>GridElement.name</code> attribute defined at extension <code>print</code>. */
	private String _name;
	
	/** <i>Generated variable</i> - Variable of <code>GridElement.xpos</code> attribute defined at extension <code>print</code>. */
	private Double _xpos;
	
	/** <i>Generated variable</i> - Variable of <code>GridElement.ypos</code> attribute defined at extension <code>print</code>. */
	private Double _ypos;
	
	/** <i>Generated variable</i> - Variable of <code>GridElement.xsize</code> attribute defined at extension <code>print</code>. */
	private Double _xsize;
	
	/** <i>Generated variable</i> - Variable of <code>GridElement.ysize</code> attribute defined at extension <code>print</code>. */
	private Double _ysize;
	
	/** <i>Generated variable</i> - Variable of <code>GridElement.defaultLayoutTemplate</code> attribute defined at extension <code>print</code>. */
	private LayoutTemplateModel _defaultLayoutTemplate;
	
	/** <i>Generated variable</i> - Variable of <code>GridElement.grid</code> attribute defined at extension <code>print</code>. */
	private GridModel _grid;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public GridElementModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public GridElementModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _grid initial attribute declared by type <code>GridElement</code> at extension <code>print</code>
	 * @param _id initial attribute declared by type <code>GridElement</code> at extension <code>print</code>
	 */
	@Deprecated
	public GridElementModel(final GridModel _grid, final Integer _id)
	{
		super();
		setGrid(_grid);
		setId(_id);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _grid initial attribute declared by type <code>GridElement</code> at extension <code>print</code>
	 * @param _id initial attribute declared by type <code>GridElement</code> at extension <code>print</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public GridElementModel(final GridModel _grid, final Integer _id, final ItemModel _owner)
	{
		super();
		setGrid(_grid);
		setId(_id);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GridElement.defaultLayoutTemplate</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>GridElement.grid</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>GridElement.id</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>GridElement.name</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>GridElement.xpos</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>GridElement.xsize</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>GridElement.ypos</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>GridElement.ysize</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Setter of <code>GridElement.defaultLayoutTemplate</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the defaultLayoutTemplate
	 */
	public void setDefaultLayoutTemplate(final LayoutTemplateModel value)
	{
		_defaultLayoutTemplate = getPersistenceContext().setValue(DEFAULTLAYOUTTEMPLATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>GridElement.grid</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the grid
	 */
	public void setGrid(final GridModel value)
	{
		_grid = getPersistenceContext().setValue(GRID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>GridElement.id</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the id
	 */
	public void setId(final Integer value)
	{
		_id = getPersistenceContext().setValue(ID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>GridElement.name</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the name
	 */
	public void setName(final String value)
	{
		_name = getPersistenceContext().setValue(NAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>GridElement.xpos</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the xpos
	 */
	public void setXpos(final Double value)
	{
		_xpos = getPersistenceContext().setValue(XPOS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>GridElement.xsize</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the xsize
	 */
	public void setXsize(final Double value)
	{
		_xsize = getPersistenceContext().setValue(XSIZE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>GridElement.ypos</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the ypos
	 */
	public void setYpos(final Double value)
	{
		_ypos = getPersistenceContext().setValue(YPOS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>GridElement.ysize</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the ysize
	 */
	public void setYsize(final Double value)
	{
		_ysize = getPersistenceContext().setValue(YSIZE, value);
	}
	
}
