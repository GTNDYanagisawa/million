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
package de.hybris.platform.acceleratorcms.jalo.components;

import de.hybris.platform.acceleratorcms.constants.AcceleratorCmsConstants;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.acceleratorcms.jalo.components.CategoryFeatureComponent CategoryFeatureComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCategoryFeatureComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>CategoryFeatureComponent.title</code> attribute **/
	public static final String TITLE = "title";
	/** Qualifier of the <code>CategoryFeatureComponent.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>CategoryFeatureComponent.media</code> attribute **/
	public static final String MEDIA = "media";
	/** Qualifier of the <code>CategoryFeatureComponent.category</code> attribute **/
	public static final String CATEGORY = "category";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CATEGORY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCategoryFeatureComponent> CATEGORYHANDLER = new BidirectionalOneToManyHandler<GeneratedCategoryFeatureComponent>(
	AcceleratorCmsConstants.TC.CATEGORYFEATURECOMPONENT,
	false,
	"category",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(TITLE, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(MEDIA, AttributeMode.INITIAL);
		tmp.put(CATEGORY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoryFeatureComponent.category</code> attribute.
	 * @return the category
	 */
	public Category getCategory(final SessionContext ctx)
	{
		return (Category)getProperty( ctx, CATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoryFeatureComponent.category</code> attribute.
	 * @return the category
	 */
	public Category getCategory()
	{
		return getCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoryFeatureComponent.category</code> attribute. 
	 * @param value the category
	 */
	public void setCategory(final SessionContext ctx, final Category value)
	{
		CATEGORYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoryFeatureComponent.category</code> attribute. 
	 * @param value the category
	 */
	public void setCategory(final Category value)
	{
		setCategory( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CATEGORYHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoryFeatureComponent.description</code> attribute.
	 * @return the description - Localized description of the component.
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCategoryFeatureComponent.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoryFeatureComponent.description</code> attribute.
	 * @return the description - Localized description of the component.
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoryFeatureComponent.description</code> attribute. 
	 * @return the localized description - Localized description of the component.
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoryFeatureComponent.description</code> attribute. 
	 * @return the localized description - Localized description of the component.
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoryFeatureComponent.description</code> attribute. 
	 * @param value the description - Localized description of the component.
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCategoryFeatureComponent.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoryFeatureComponent.description</code> attribute. 
	 * @param value the description - Localized description of the component.
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoryFeatureComponent.description</code> attribute. 
	 * @param value the description - Localized description of the component.
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoryFeatureComponent.description</code> attribute. 
	 * @param value the description - Localized description of the component.
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoryFeatureComponent.media</code> attribute.
	 * @return the media - Localized media that is displayed in the component.
	 */
	public Media getMedia(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCategoryFeatureComponent.getMedia requires a session language", 0 );
		}
		return (Media)getLocalizedProperty( ctx, MEDIA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoryFeatureComponent.media</code> attribute.
	 * @return the media - Localized media that is displayed in the component.
	 */
	public Media getMedia()
	{
		return getMedia( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoryFeatureComponent.media</code> attribute. 
	 * @return the localized media - Localized media that is displayed in the component.
	 */
	public Map<Language,Media> getAllMedia(final SessionContext ctx)
	{
		return (Map<Language,Media>)getAllLocalizedProperties(ctx,MEDIA,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoryFeatureComponent.media</code> attribute. 
	 * @return the localized media - Localized media that is displayed in the component.
	 */
	public Map<Language,Media> getAllMedia()
	{
		return getAllMedia( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoryFeatureComponent.media</code> attribute. 
	 * @param value the media - Localized media that is displayed in the component.
	 */
	public void setMedia(final SessionContext ctx, final Media value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCategoryFeatureComponent.setMedia requires a session language", 0 );
		}
		setLocalizedProperty(ctx, MEDIA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoryFeatureComponent.media</code> attribute. 
	 * @param value the media - Localized media that is displayed in the component.
	 */
	public void setMedia(final Media value)
	{
		setMedia( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoryFeatureComponent.media</code> attribute. 
	 * @param value the media - Localized media that is displayed in the component.
	 */
	public void setAllMedia(final SessionContext ctx, final Map<Language,Media> value)
	{
		setAllLocalizedProperties(ctx,MEDIA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoryFeatureComponent.media</code> attribute. 
	 * @param value the media - Localized media that is displayed in the component.
	 */
	public void setAllMedia(final Map<Language,Media> value)
	{
		setAllMedia( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoryFeatureComponent.title</code> attribute.
	 * @return the title - Localized title of the component.
	 */
	public String getTitle(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCategoryFeatureComponent.getTitle requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoryFeatureComponent.title</code> attribute.
	 * @return the title - Localized title of the component.
	 */
	public String getTitle()
	{
		return getTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoryFeatureComponent.title</code> attribute. 
	 * @return the localized title - Localized title of the component.
	 */
	public Map<Language,String> getAllTitle(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,TITLE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoryFeatureComponent.title</code> attribute. 
	 * @return the localized title - Localized title of the component.
	 */
	public Map<Language,String> getAllTitle()
	{
		return getAllTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoryFeatureComponent.title</code> attribute. 
	 * @param value the title - Localized title of the component.
	 */
	public void setTitle(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCategoryFeatureComponent.setTitle requires a session language", 0 );
		}
		setLocalizedProperty(ctx, TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoryFeatureComponent.title</code> attribute. 
	 * @param value the title - Localized title of the component.
	 */
	public void setTitle(final String value)
	{
		setTitle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoryFeatureComponent.title</code> attribute. 
	 * @param value the title - Localized title of the component.
	 */
	public void setAllTitle(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoryFeatureComponent.title</code> attribute. 
	 * @param value the title - Localized title of the component.
	 */
	public void setAllTitle(final Map<Language,String> value)
	{
		setAllTitle( getSession().getSessionContext(), value );
	}
	
}
