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
import de.hybris.platform.print.model.ChapterConfigurationModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.List;
import java.util.Locale;

/**
 * Generated model class for type ChaptersConfiguration first defined at extension print.
 */
@SuppressWarnings("all")
public class ChaptersConfigurationModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ChaptersConfiguration";
	
	/** <i>Generated constant</i> - Attribute key of <code>ChaptersConfiguration.name</code> attribute defined at extension <code>print</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>ChaptersConfiguration.chapterConfigurations</code> attribute defined at extension <code>print</code>. */
	public static final String CHAPTERCONFIGURATIONS = "chapterConfigurations";
	
	
	/** <i>Generated variable</i> - Variable of <code>ChaptersConfiguration.chapterConfigurations</code> attribute defined at extension <code>print</code>. */
	private List<ChapterConfigurationModel> _chapterConfigurations;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ChaptersConfigurationModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ChaptersConfigurationModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public ChaptersConfigurationModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChaptersConfiguration.chapterConfigurations</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the chapterConfigurations
	 */
	public List<ChapterConfigurationModel> getChapterConfigurations()
	{
		if (this._chapterConfigurations!=null)
		{
			return _chapterConfigurations;
		}
		return _chapterConfigurations = getPersistenceContext().getValue(CHAPTERCONFIGURATIONS, _chapterConfigurations);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChaptersConfiguration.name</code> attribute defined at extension <code>print</code>. 
	 * @return the name
	 */
	public String getName()
	{
		return getName(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>ChaptersConfiguration.name</code> attribute defined at extension <code>print</code>. 
	 * @param loc the value localization key 
	 * @return the name
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getName(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(NAME, loc);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ChaptersConfiguration.chapterConfigurations</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the chapterConfigurations
	 */
	public void setChapterConfigurations(final List<ChapterConfigurationModel> value)
	{
		_chapterConfigurations = getPersistenceContext().setValue(CHAPTERCONFIGURATIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ChaptersConfiguration.name</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>ChaptersConfiguration.name</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the name
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setName(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(NAME, loc, value);
	}
	
}
