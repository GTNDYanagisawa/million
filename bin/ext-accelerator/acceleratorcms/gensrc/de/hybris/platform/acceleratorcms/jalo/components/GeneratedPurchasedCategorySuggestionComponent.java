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
import de.hybris.platform.acceleratorcms.jalo.components.SimpleSuggestionComponent;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.acceleratorcms.jalo.components.PurchasedCategorySuggestionComponent PurchasedCategorySuggestionComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPurchasedCategorySuggestionComponent extends SimpleSuggestionComponent
{
	/** Qualifier of the <code>PurchasedCategorySuggestionComponent.category</code> attribute **/
	public static final String CATEGORY = "category";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleSuggestionComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CATEGORY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PurchasedCategorySuggestionComponent.category</code> attribute.
	 * @return the category - Category to filter displayed references with.
	 */
	public Category getCategory(final SessionContext ctx)
	{
		return (Category)getProperty( ctx, CATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PurchasedCategorySuggestionComponent.category</code> attribute.
	 * @return the category - Category to filter displayed references with.
	 */
	public Category getCategory()
	{
		return getCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PurchasedCategorySuggestionComponent.category</code> attribute. 
	 * @param value the category - Category to filter displayed references with.
	 */
	public void setCategory(final SessionContext ctx, final Category value)
	{
		setProperty(ctx, CATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PurchasedCategorySuggestionComponent.category</code> attribute. 
	 * @param value the category - Category to filter displayed references with.
	 */
	public void setCategory(final Category value)
	{
		setCategory( getSession().getSessionContext(), value );
	}
	
}
