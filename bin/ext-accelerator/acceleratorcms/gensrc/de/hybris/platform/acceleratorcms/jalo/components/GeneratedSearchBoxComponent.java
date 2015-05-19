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
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.acceleratorcms.jalo.components.SearchBoxComponent SearchBoxComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSearchBoxComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>SearchBoxComponent.displaySuggestions</code> attribute **/
	public static final String DISPLAYSUGGESTIONS = "displaySuggestions";
	/** Qualifier of the <code>SearchBoxComponent.displayProducts</code> attribute **/
	public static final String DISPLAYPRODUCTS = "displayProducts";
	/** Qualifier of the <code>SearchBoxComponent.displayProductImages</code> attribute **/
	public static final String DISPLAYPRODUCTIMAGES = "displayProductImages";
	/** Qualifier of the <code>SearchBoxComponent.maxSuggestions</code> attribute **/
	public static final String MAXSUGGESTIONS = "maxSuggestions";
	/** Qualifier of the <code>SearchBoxComponent.maxProducts</code> attribute **/
	public static final String MAXPRODUCTS = "maxProducts";
	/** Qualifier of the <code>SearchBoxComponent.minCharactersBeforeRequest</code> attribute **/
	public static final String MINCHARACTERSBEFOREREQUEST = "minCharactersBeforeRequest";
	/** Qualifier of the <code>SearchBoxComponent.waitTimeBeforeRequest</code> attribute **/
	public static final String WAITTIMEBEFOREREQUEST = "waitTimeBeforeRequest";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(DISPLAYSUGGESTIONS, AttributeMode.INITIAL);
		tmp.put(DISPLAYPRODUCTS, AttributeMode.INITIAL);
		tmp.put(DISPLAYPRODUCTIMAGES, AttributeMode.INITIAL);
		tmp.put(MAXSUGGESTIONS, AttributeMode.INITIAL);
		tmp.put(MAXPRODUCTS, AttributeMode.INITIAL);
		tmp.put(MINCHARACTERSBEFOREREQUEST, AttributeMode.INITIAL);
		tmp.put(WAITTIMEBEFOREREQUEST, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.displayProductImages</code> attribute.
	 * @return the displayProductImages - Determines if product images are shown.
	 */
	public Boolean isDisplayProductImages(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DISPLAYPRODUCTIMAGES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.displayProductImages</code> attribute.
	 * @return the displayProductImages - Determines if product images are shown.
	 */
	public Boolean isDisplayProductImages()
	{
		return isDisplayProductImages( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.displayProductImages</code> attribute. 
	 * @return the displayProductImages - Determines if product images are shown.
	 */
	public boolean isDisplayProductImagesAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDisplayProductImages( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.displayProductImages</code> attribute. 
	 * @return the displayProductImages - Determines if product images are shown.
	 */
	public boolean isDisplayProductImagesAsPrimitive()
	{
		return isDisplayProductImagesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SearchBoxComponent.displayProductImages</code> attribute. 
	 * @param value the displayProductImages - Determines if product images are shown.
	 */
	public void setDisplayProductImages(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DISPLAYPRODUCTIMAGES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SearchBoxComponent.displayProductImages</code> attribute. 
	 * @param value the displayProductImages - Determines if product images are shown.
	 */
	public void setDisplayProductImages(final Boolean value)
	{
		setDisplayProductImages( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SearchBoxComponent.displayProductImages</code> attribute. 
	 * @param value the displayProductImages - Determines if product images are shown.
	 */
	public void setDisplayProductImages(final SessionContext ctx, final boolean value)
	{
		setDisplayProductImages( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SearchBoxComponent.displayProductImages</code> attribute. 
	 * @param value the displayProductImages - Determines if product images are shown.
	 */
	public void setDisplayProductImages(final boolean value)
	{
		setDisplayProductImages( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.displayProducts</code> attribute.
	 * @return the displayProducts - Determines if product results are displayed in the component.
	 */
	public Boolean isDisplayProducts(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DISPLAYPRODUCTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.displayProducts</code> attribute.
	 * @return the displayProducts - Determines if product results are displayed in the component.
	 */
	public Boolean isDisplayProducts()
	{
		return isDisplayProducts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.displayProducts</code> attribute. 
	 * @return the displayProducts - Determines if product results are displayed in the component.
	 */
	public boolean isDisplayProductsAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDisplayProducts( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.displayProducts</code> attribute. 
	 * @return the displayProducts - Determines if product results are displayed in the component.
	 */
	public boolean isDisplayProductsAsPrimitive()
	{
		return isDisplayProductsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SearchBoxComponent.displayProducts</code> attribute. 
	 * @param value the displayProducts - Determines if product results are displayed in the component.
	 */
	public void setDisplayProducts(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DISPLAYPRODUCTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SearchBoxComponent.displayProducts</code> attribute. 
	 * @param value the displayProducts - Determines if product results are displayed in the component.
	 */
	public void setDisplayProducts(final Boolean value)
	{
		setDisplayProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SearchBoxComponent.displayProducts</code> attribute. 
	 * @param value the displayProducts - Determines if product results are displayed in the component.
	 */
	public void setDisplayProducts(final SessionContext ctx, final boolean value)
	{
		setDisplayProducts( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SearchBoxComponent.displayProducts</code> attribute. 
	 * @param value the displayProducts - Determines if product results are displayed in the component.
	 */
	public void setDisplayProducts(final boolean value)
	{
		setDisplayProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.displaySuggestions</code> attribute.
	 * @return the displaySuggestions - Determines if suggested terms are displayed in the component.
	 */
	public Boolean isDisplaySuggestions(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DISPLAYSUGGESTIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.displaySuggestions</code> attribute.
	 * @return the displaySuggestions - Determines if suggested terms are displayed in the component.
	 */
	public Boolean isDisplaySuggestions()
	{
		return isDisplaySuggestions( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.displaySuggestions</code> attribute. 
	 * @return the displaySuggestions - Determines if suggested terms are displayed in the component.
	 */
	public boolean isDisplaySuggestionsAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDisplaySuggestions( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.displaySuggestions</code> attribute. 
	 * @return the displaySuggestions - Determines if suggested terms are displayed in the component.
	 */
	public boolean isDisplaySuggestionsAsPrimitive()
	{
		return isDisplaySuggestionsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SearchBoxComponent.displaySuggestions</code> attribute. 
	 * @param value the displaySuggestions - Determines if suggested terms are displayed in the component.
	 */
	public void setDisplaySuggestions(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DISPLAYSUGGESTIONS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SearchBoxComponent.displaySuggestions</code> attribute. 
	 * @param value the displaySuggestions - Determines if suggested terms are displayed in the component.
	 */
	public void setDisplaySuggestions(final Boolean value)
	{
		setDisplaySuggestions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SearchBoxComponent.displaySuggestions</code> attribute. 
	 * @param value the displaySuggestions - Determines if suggested terms are displayed in the component.
	 */
	public void setDisplaySuggestions(final SessionContext ctx, final boolean value)
	{
		setDisplaySuggestions( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SearchBoxComponent.displaySuggestions</code> attribute. 
	 * @param value the displaySuggestions - Determines if suggested terms are displayed in the component.
	 */
	public void setDisplaySuggestions(final boolean value)
	{
		setDisplaySuggestions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.maxProducts</code> attribute.
	 * @return the maxProducts - Determines the max number of products to display in the component.
	 */
	public Integer getMaxProducts(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MAXPRODUCTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.maxProducts</code> attribute.
	 * @return the maxProducts - Determines the max number of products to display in the component.
	 */
	public Integer getMaxProducts()
	{
		return getMaxProducts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.maxProducts</code> attribute. 
	 * @return the maxProducts - Determines the max number of products to display in the component.
	 */
	public int getMaxProductsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMaxProducts( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.maxProducts</code> attribute. 
	 * @return the maxProducts - Determines the max number of products to display in the component.
	 */
	public int getMaxProductsAsPrimitive()
	{
		return getMaxProductsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SearchBoxComponent.maxProducts</code> attribute. 
	 * @param value the maxProducts - Determines the max number of products to display in the component.
	 */
	public void setMaxProducts(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MAXPRODUCTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SearchBoxComponent.maxProducts</code> attribute. 
	 * @param value the maxProducts - Determines the max number of products to display in the component.
	 */
	public void setMaxProducts(final Integer value)
	{
		setMaxProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SearchBoxComponent.maxProducts</code> attribute. 
	 * @param value the maxProducts - Determines the max number of products to display in the component.
	 */
	public void setMaxProducts(final SessionContext ctx, final int value)
	{
		setMaxProducts( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SearchBoxComponent.maxProducts</code> attribute. 
	 * @param value the maxProducts - Determines the max number of products to display in the component.
	 */
	public void setMaxProducts(final int value)
	{
		setMaxProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.maxSuggestions</code> attribute.
	 * @return the maxSuggestions - Determines the max number of suggestions to display in the component.
	 */
	public Integer getMaxSuggestions(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MAXSUGGESTIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.maxSuggestions</code> attribute.
	 * @return the maxSuggestions - Determines the max number of suggestions to display in the component.
	 */
	public Integer getMaxSuggestions()
	{
		return getMaxSuggestions( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.maxSuggestions</code> attribute. 
	 * @return the maxSuggestions - Determines the max number of suggestions to display in the component.
	 */
	public int getMaxSuggestionsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMaxSuggestions( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.maxSuggestions</code> attribute. 
	 * @return the maxSuggestions - Determines the max number of suggestions to display in the component.
	 */
	public int getMaxSuggestionsAsPrimitive()
	{
		return getMaxSuggestionsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SearchBoxComponent.maxSuggestions</code> attribute. 
	 * @param value the maxSuggestions - Determines the max number of suggestions to display in the component.
	 */
	public void setMaxSuggestions(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MAXSUGGESTIONS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SearchBoxComponent.maxSuggestions</code> attribute. 
	 * @param value the maxSuggestions - Determines the max number of suggestions to display in the component.
	 */
	public void setMaxSuggestions(final Integer value)
	{
		setMaxSuggestions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SearchBoxComponent.maxSuggestions</code> attribute. 
	 * @param value the maxSuggestions - Determines the max number of suggestions to display in the component.
	 */
	public void setMaxSuggestions(final SessionContext ctx, final int value)
	{
		setMaxSuggestions( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SearchBoxComponent.maxSuggestions</code> attribute. 
	 * @param value the maxSuggestions - Determines the max number of suggestions to display in the component.
	 */
	public void setMaxSuggestions(final int value)
	{
		setMaxSuggestions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.minCharactersBeforeRequest</code> attribute.
	 * @return the minCharactersBeforeRequest - Determines the min number of characters to enter before submitting a search request.
	 */
	public Integer getMinCharactersBeforeRequest(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MINCHARACTERSBEFOREREQUEST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.minCharactersBeforeRequest</code> attribute.
	 * @return the minCharactersBeforeRequest - Determines the min number of characters to enter before submitting a search request.
	 */
	public Integer getMinCharactersBeforeRequest()
	{
		return getMinCharactersBeforeRequest( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.minCharactersBeforeRequest</code> attribute. 
	 * @return the minCharactersBeforeRequest - Determines the min number of characters to enter before submitting a search request.
	 */
	public int getMinCharactersBeforeRequestAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMinCharactersBeforeRequest( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.minCharactersBeforeRequest</code> attribute. 
	 * @return the minCharactersBeforeRequest - Determines the min number of characters to enter before submitting a search request.
	 */
	public int getMinCharactersBeforeRequestAsPrimitive()
	{
		return getMinCharactersBeforeRequestAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SearchBoxComponent.minCharactersBeforeRequest</code> attribute. 
	 * @param value the minCharactersBeforeRequest - Determines the min number of characters to enter before submitting a search request.
	 */
	public void setMinCharactersBeforeRequest(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MINCHARACTERSBEFOREREQUEST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SearchBoxComponent.minCharactersBeforeRequest</code> attribute. 
	 * @param value the minCharactersBeforeRequest - Determines the min number of characters to enter before submitting a search request.
	 */
	public void setMinCharactersBeforeRequest(final Integer value)
	{
		setMinCharactersBeforeRequest( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SearchBoxComponent.minCharactersBeforeRequest</code> attribute. 
	 * @param value the minCharactersBeforeRequest - Determines the min number of characters to enter before submitting a search request.
	 */
	public void setMinCharactersBeforeRequest(final SessionContext ctx, final int value)
	{
		setMinCharactersBeforeRequest( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SearchBoxComponent.minCharactersBeforeRequest</code> attribute. 
	 * @param value the minCharactersBeforeRequest - Determines the min number of characters to enter before submitting a search request.
	 */
	public void setMinCharactersBeforeRequest(final int value)
	{
		setMinCharactersBeforeRequest( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.waitTimeBeforeRequest</code> attribute.
	 * @return the waitTimeBeforeRequest - Determines the wait time after the search term has been altered before resubmitting the search request.
	 */
	public Integer getWaitTimeBeforeRequest(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, WAITTIMEBEFOREREQUEST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.waitTimeBeforeRequest</code> attribute.
	 * @return the waitTimeBeforeRequest - Determines the wait time after the search term has been altered before resubmitting the search request.
	 */
	public Integer getWaitTimeBeforeRequest()
	{
		return getWaitTimeBeforeRequest( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.waitTimeBeforeRequest</code> attribute. 
	 * @return the waitTimeBeforeRequest - Determines the wait time after the search term has been altered before resubmitting the search request.
	 */
	public int getWaitTimeBeforeRequestAsPrimitive(final SessionContext ctx)
	{
		Integer value = getWaitTimeBeforeRequest( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SearchBoxComponent.waitTimeBeforeRequest</code> attribute. 
	 * @return the waitTimeBeforeRequest - Determines the wait time after the search term has been altered before resubmitting the search request.
	 */
	public int getWaitTimeBeforeRequestAsPrimitive()
	{
		return getWaitTimeBeforeRequestAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SearchBoxComponent.waitTimeBeforeRequest</code> attribute. 
	 * @param value the waitTimeBeforeRequest - Determines the wait time after the search term has been altered before resubmitting the search request.
	 */
	public void setWaitTimeBeforeRequest(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, WAITTIMEBEFOREREQUEST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SearchBoxComponent.waitTimeBeforeRequest</code> attribute. 
	 * @param value the waitTimeBeforeRequest - Determines the wait time after the search term has been altered before resubmitting the search request.
	 */
	public void setWaitTimeBeforeRequest(final Integer value)
	{
		setWaitTimeBeforeRequest( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SearchBoxComponent.waitTimeBeforeRequest</code> attribute. 
	 * @param value the waitTimeBeforeRequest - Determines the wait time after the search term has been altered before resubmitting the search request.
	 */
	public void setWaitTimeBeforeRequest(final SessionContext ctx, final int value)
	{
		setWaitTimeBeforeRequest( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SearchBoxComponent.waitTimeBeforeRequest</code> attribute. 
	 * @param value the waitTimeBeforeRequest - Determines the wait time after the search term has been altered before resubmitting the search request.
	 */
	public void setWaitTimeBeforeRequest(final int value)
	{
		setWaitTimeBeforeRequest( getSession().getSessionContext(), value );
	}
	
}
