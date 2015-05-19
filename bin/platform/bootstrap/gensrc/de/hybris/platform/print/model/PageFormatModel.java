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
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Locale;

/**
 * Generated model class for type PageFormat first defined at extension print.
 */
@SuppressWarnings("all")
public class PageFormatModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PageFormat";
	
	/** <i>Generated constant</i> - Attribute key of <code>PageFormat.qualifier</code> attribute defined at extension <code>print</code>. */
	public static final String QUALIFIER = "qualifier";
	
	/** <i>Generated constant</i> - Attribute key of <code>PageFormat.name</code> attribute defined at extension <code>print</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>PageFormat.width</code> attribute defined at extension <code>print</code>. */
	public static final String WIDTH = "width";
	
	/** <i>Generated constant</i> - Attribute key of <code>PageFormat.height</code> attribute defined at extension <code>print</code>. */
	public static final String HEIGHT = "height";
	
	/** <i>Generated constant</i> - Attribute key of <code>PageFormat.widthInPixel</code> attribute defined at extension <code>print</code>. */
	public static final String WIDTHINPIXEL = "widthInPixel";
	
	/** <i>Generated constant</i> - Attribute key of <code>PageFormat.heightInPixel</code> attribute defined at extension <code>print</code>. */
	public static final String HEIGHTINPIXEL = "heightInPixel";
	
	/** <i>Generated constant</i> - Attribute key of <code>PageFormat.dimension</code> attribute defined at extension <code>print</code>. */
	public static final String DIMENSION = "dimension";
	
	
	/** <i>Generated variable</i> - Variable of <code>PageFormat.qualifier</code> attribute defined at extension <code>print</code>. */
	private String _qualifier;
	
	/** <i>Generated variable</i> - Variable of <code>PageFormat.width</code> attribute defined at extension <code>print</code>. */
	private Double _width;
	
	/** <i>Generated variable</i> - Variable of <code>PageFormat.height</code> attribute defined at extension <code>print</code>. */
	private Double _height;
	
	/** <i>Generated variable</i> - Variable of <code>PageFormat.widthInPixel</code> attribute defined at extension <code>print</code>. */
	private Double _widthInPixel;
	
	/** <i>Generated variable</i> - Variable of <code>PageFormat.heightInPixel</code> attribute defined at extension <code>print</code>. */
	private Double _heightInPixel;
	
	/** <i>Generated variable</i> - Variable of <code>PageFormat.dimension</code> attribute defined at extension <code>print</code>. */
	private String _dimension;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PageFormatModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PageFormatModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _height initial attribute declared by type <code>PageFormat</code> at extension <code>print</code>
	 * @param _qualifier initial attribute declared by type <code>PageFormat</code> at extension <code>print</code>
	 * @param _width initial attribute declared by type <code>PageFormat</code> at extension <code>print</code>
	 */
	@Deprecated
	public PageFormatModel(final Double _height, final String _qualifier, final Double _width)
	{
		super();
		setHeight(_height);
		setQualifier(_qualifier);
		setWidth(_width);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _height initial attribute declared by type <code>PageFormat</code> at extension <code>print</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _qualifier initial attribute declared by type <code>PageFormat</code> at extension <code>print</code>
	 * @param _width initial attribute declared by type <code>PageFormat</code> at extension <code>print</code>
	 */
	@Deprecated
	public PageFormatModel(final Double _height, final ItemModel _owner, final String _qualifier, final Double _width)
	{
		super();
		setHeight(_height);
		setOwner(_owner);
		setQualifier(_qualifier);
		setWidth(_width);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PageFormat.dimension</code> attribute defined at extension <code>print</code>. 
	 * @return the dimension
	 */
	public String getDimension()
	{
		if (this._dimension!=null)
		{
			return _dimension;
		}
		return _dimension = getPersistenceContext().getValue(DIMENSION, _dimension);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PageFormat.height</code> attribute defined at extension <code>print</code>. 
	 * @return the height
	 */
	public Double getHeight()
	{
		if (this._height!=null)
		{
			return _height;
		}
		return _height = getPersistenceContext().getValue(HEIGHT, _height);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PageFormat.heightInPixel</code> attribute defined at extension <code>print</code>. 
	 * @return the heightInPixel
	 */
	public Double getHeightInPixel()
	{
		if (this._heightInPixel!=null)
		{
			return _heightInPixel;
		}
		return _heightInPixel = getPersistenceContext().getValue(HEIGHTINPIXEL, _heightInPixel);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PageFormat.name</code> attribute defined at extension <code>print</code>. 
	 * @return the name
	 */
	public String getName()
	{
		return getName(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>PageFormat.name</code> attribute defined at extension <code>print</code>. 
	 * @param loc the value localization key 
	 * @return the name
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getName(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(NAME, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PageFormat.qualifier</code> attribute defined at extension <code>print</code>. 
	 * @return the qualifier
	 */
	public String getQualifier()
	{
		if (this._qualifier!=null)
		{
			return _qualifier;
		}
		return _qualifier = getPersistenceContext().getValue(QUALIFIER, _qualifier);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PageFormat.width</code> attribute defined at extension <code>print</code>. 
	 * @return the width
	 */
	public Double getWidth()
	{
		if (this._width!=null)
		{
			return _width;
		}
		return _width = getPersistenceContext().getValue(WIDTH, _width);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PageFormat.widthInPixel</code> attribute defined at extension <code>print</code>. 
	 * @return the widthInPixel
	 */
	public Double getWidthInPixel()
	{
		if (this._widthInPixel!=null)
		{
			return _widthInPixel;
		}
		return _widthInPixel = getPersistenceContext().getValue(WIDTHINPIXEL, _widthInPixel);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PageFormat.height</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the height
	 */
	public void setHeight(final Double value)
	{
		_height = getPersistenceContext().setValue(HEIGHT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PageFormat.name</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>PageFormat.name</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Setter of <code>PageFormat.qualifier</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the qualifier
	 */
	public void setQualifier(final String value)
	{
		_qualifier = getPersistenceContext().setValue(QUALIFIER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PageFormat.width</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the width
	 */
	public void setWidth(final Double value)
	{
		_width = getPersistenceContext().setValue(WIDTH, value);
	}
	
}
