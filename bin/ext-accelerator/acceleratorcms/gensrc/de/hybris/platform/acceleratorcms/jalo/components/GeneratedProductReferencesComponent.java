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
import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.acceleratorcms.jalo.components.ProductReferencesComponent ProductReferencesComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedProductReferencesComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>ProductReferencesComponent.title</code> attribute **/
	public static final String TITLE = "title";
	/** Qualifier of the <code>ProductReferencesComponent.productReferenceTypes</code> attribute **/
	public static final String PRODUCTREFERENCETYPES = "productReferenceTypes";
	/** Qualifier of the <code>ProductReferencesComponent.maximumNumberProducts</code> attribute **/
	public static final String MAXIMUMNUMBERPRODUCTS = "maximumNumberProducts";
	/** Qualifier of the <code>ProductReferencesComponent.displayProductTitles</code> attribute **/
	public static final String DISPLAYPRODUCTTITLES = "displayProductTitles";
	/** Qualifier of the <code>ProductReferencesComponent.displayProductPrices</code> attribute **/
	public static final String DISPLAYPRODUCTPRICES = "displayProductPrices";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(TITLE, AttributeMode.INITIAL);
		tmp.put(PRODUCTREFERENCETYPES, AttributeMode.INITIAL);
		tmp.put(MAXIMUMNUMBERPRODUCTS, AttributeMode.INITIAL);
		tmp.put(DISPLAYPRODUCTTITLES, AttributeMode.INITIAL);
		tmp.put(DISPLAYPRODUCTPRICES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductReferencesComponent.displayProductPrices</code> attribute.
	 * @return the displayProductPrices - Determines if product prices are shown.
	 */
	public Boolean isDisplayProductPrices(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DISPLAYPRODUCTPRICES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductReferencesComponent.displayProductPrices</code> attribute.
	 * @return the displayProductPrices - Determines if product prices are shown.
	 */
	public Boolean isDisplayProductPrices()
	{
		return isDisplayProductPrices( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductReferencesComponent.displayProductPrices</code> attribute. 
	 * @return the displayProductPrices - Determines if product prices are shown.
	 */
	public boolean isDisplayProductPricesAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDisplayProductPrices( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductReferencesComponent.displayProductPrices</code> attribute. 
	 * @return the displayProductPrices - Determines if product prices are shown.
	 */
	public boolean isDisplayProductPricesAsPrimitive()
	{
		return isDisplayProductPricesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductReferencesComponent.displayProductPrices</code> attribute. 
	 * @param value the displayProductPrices - Determines if product prices are shown.
	 */
	public void setDisplayProductPrices(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DISPLAYPRODUCTPRICES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductReferencesComponent.displayProductPrices</code> attribute. 
	 * @param value the displayProductPrices - Determines if product prices are shown.
	 */
	public void setDisplayProductPrices(final Boolean value)
	{
		setDisplayProductPrices( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductReferencesComponent.displayProductPrices</code> attribute. 
	 * @param value the displayProductPrices - Determines if product prices are shown.
	 */
	public void setDisplayProductPrices(final SessionContext ctx, final boolean value)
	{
		setDisplayProductPrices( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductReferencesComponent.displayProductPrices</code> attribute. 
	 * @param value the displayProductPrices - Determines if product prices are shown.
	 */
	public void setDisplayProductPrices(final boolean value)
	{
		setDisplayProductPrices( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductReferencesComponent.displayProductTitles</code> attribute.
	 * @return the displayProductTitles - Determines if product titles are shown.
	 */
	public Boolean isDisplayProductTitles(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DISPLAYPRODUCTTITLES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductReferencesComponent.displayProductTitles</code> attribute.
	 * @return the displayProductTitles - Determines if product titles are shown.
	 */
	public Boolean isDisplayProductTitles()
	{
		return isDisplayProductTitles( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductReferencesComponent.displayProductTitles</code> attribute. 
	 * @return the displayProductTitles - Determines if product titles are shown.
	 */
	public boolean isDisplayProductTitlesAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDisplayProductTitles( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductReferencesComponent.displayProductTitles</code> attribute. 
	 * @return the displayProductTitles - Determines if product titles are shown.
	 */
	public boolean isDisplayProductTitlesAsPrimitive()
	{
		return isDisplayProductTitlesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductReferencesComponent.displayProductTitles</code> attribute. 
	 * @param value the displayProductTitles - Determines if product titles are shown.
	 */
	public void setDisplayProductTitles(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DISPLAYPRODUCTTITLES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductReferencesComponent.displayProductTitles</code> attribute. 
	 * @param value the displayProductTitles - Determines if product titles are shown.
	 */
	public void setDisplayProductTitles(final Boolean value)
	{
		setDisplayProductTitles( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductReferencesComponent.displayProductTitles</code> attribute. 
	 * @param value the displayProductTitles - Determines if product titles are shown.
	 */
	public void setDisplayProductTitles(final SessionContext ctx, final boolean value)
	{
		setDisplayProductTitles( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductReferencesComponent.displayProductTitles</code> attribute. 
	 * @param value the displayProductTitles - Determines if product titles are shown.
	 */
	public void setDisplayProductTitles(final boolean value)
	{
		setDisplayProductTitles( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductReferencesComponent.maximumNumberProducts</code> attribute.
	 * @return the maximumNumberProducts - Maximum number of the product references that are displayed in the component.
	 */
	public Integer getMaximumNumberProducts(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MAXIMUMNUMBERPRODUCTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductReferencesComponent.maximumNumberProducts</code> attribute.
	 * @return the maximumNumberProducts - Maximum number of the product references that are displayed in the component.
	 */
	public Integer getMaximumNumberProducts()
	{
		return getMaximumNumberProducts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductReferencesComponent.maximumNumberProducts</code> attribute. 
	 * @return the maximumNumberProducts - Maximum number of the product references that are displayed in the component.
	 */
	public int getMaximumNumberProductsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMaximumNumberProducts( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductReferencesComponent.maximumNumberProducts</code> attribute. 
	 * @return the maximumNumberProducts - Maximum number of the product references that are displayed in the component.
	 */
	public int getMaximumNumberProductsAsPrimitive()
	{
		return getMaximumNumberProductsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductReferencesComponent.maximumNumberProducts</code> attribute. 
	 * @param value the maximumNumberProducts - Maximum number of the product references that are displayed in the component.
	 */
	public void setMaximumNumberProducts(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MAXIMUMNUMBERPRODUCTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductReferencesComponent.maximumNumberProducts</code> attribute. 
	 * @param value the maximumNumberProducts - Maximum number of the product references that are displayed in the component.
	 */
	public void setMaximumNumberProducts(final Integer value)
	{
		setMaximumNumberProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductReferencesComponent.maximumNumberProducts</code> attribute. 
	 * @param value the maximumNumberProducts - Maximum number of the product references that are displayed in the component.
	 */
	public void setMaximumNumberProducts(final SessionContext ctx, final int value)
	{
		setMaximumNumberProducts( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductReferencesComponent.maximumNumberProducts</code> attribute. 
	 * @param value the maximumNumberProducts - Maximum number of the product references that are displayed in the component.
	 */
	public void setMaximumNumberProducts(final int value)
	{
		setMaximumNumberProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductReferencesComponent.productReferenceTypes</code> attribute.
	 * @return the productReferenceTypes - Product reference type that is displayed in this component.
	 */
	public List<EnumerationValue> getProductReferenceTypes(final SessionContext ctx)
	{
		List<EnumerationValue> coll = (List<EnumerationValue>)getProperty( ctx, PRODUCTREFERENCETYPES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductReferencesComponent.productReferenceTypes</code> attribute.
	 * @return the productReferenceTypes - Product reference type that is displayed in this component.
	 */
	public List<EnumerationValue> getProductReferenceTypes()
	{
		return getProductReferenceTypes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductReferencesComponent.productReferenceTypes</code> attribute. 
	 * @param value the productReferenceTypes - Product reference type that is displayed in this component.
	 */
	public void setProductReferenceTypes(final SessionContext ctx, final List<EnumerationValue> value)
	{
		setProperty(ctx, PRODUCTREFERENCETYPES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductReferencesComponent.productReferenceTypes</code> attribute. 
	 * @param value the productReferenceTypes - Product reference type that is displayed in this component.
	 */
	public void setProductReferenceTypes(final List<EnumerationValue> value)
	{
		setProductReferenceTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductReferencesComponent.title</code> attribute.
	 * @return the title - Title of the component.
	 */
	public String getTitle(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProductReferencesComponent.getTitle requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductReferencesComponent.title</code> attribute.
	 * @return the title - Title of the component.
	 */
	public String getTitle()
	{
		return getTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductReferencesComponent.title</code> attribute. 
	 * @return the localized title - Title of the component.
	 */
	public Map<Language,String> getAllTitle(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,TITLE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductReferencesComponent.title</code> attribute. 
	 * @return the localized title - Title of the component.
	 */
	public Map<Language,String> getAllTitle()
	{
		return getAllTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductReferencesComponent.title</code> attribute. 
	 * @param value the title - Title of the component.
	 */
	public void setTitle(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProductReferencesComponent.setTitle requires a session language", 0 );
		}
		setLocalizedProperty(ctx, TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductReferencesComponent.title</code> attribute. 
	 * @param value the title - Title of the component.
	 */
	public void setTitle(final String value)
	{
		setTitle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductReferencesComponent.title</code> attribute. 
	 * @param value the title - Title of the component.
	 */
	public void setAllTitle(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductReferencesComponent.title</code> attribute. 
	 * @param value the title - Title of the component.
	 */
	public void setAllTitle(final Map<Language,String> value)
	{
		setAllTitle( getSession().getSessionContext(), value );
	}
	
}
