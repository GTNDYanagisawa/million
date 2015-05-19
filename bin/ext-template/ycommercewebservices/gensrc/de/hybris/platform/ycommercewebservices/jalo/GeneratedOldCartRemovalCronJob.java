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
package de.hybris.platform.ycommercewebservices.jalo;

import de.hybris.platform.basecommerce.jalo.site.BaseSite;
import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.ycommercewebservices.constants.YcommercewebservicesConstants;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.ycommercewebservices.jalo.OldCartRemovalCronJob OldCartRemovalCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOldCartRemovalCronJob extends CronJob
{
	/** Qualifier of the <code>OldCartRemovalCronJob.sites</code> attribute **/
	public static final String SITES = "sites";
	/** Qualifier of the <code>OldCartRemovalCronJob.cartRemovalAge</code> attribute **/
	public static final String CARTREMOVALAGE = "cartRemovalAge";
	/** Qualifier of the <code>OldCartRemovalCronJob.anonymousCartRemovalAge</code> attribute **/
	public static final String ANONYMOUSCARTREMOVALAGE = "anonymousCartRemovalAge";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SITES, AttributeMode.INITIAL);
		tmp.put(CARTREMOVALAGE, AttributeMode.INITIAL);
		tmp.put(ANONYMOUSCARTREMOVALAGE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OldCartRemovalCronJob.anonymousCartRemovalAge</code> attribute.
	 * @return the anonymousCartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 14 days.
	 */
	public Integer getAnonymousCartRemovalAge(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ANONYMOUSCARTREMOVALAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OldCartRemovalCronJob.anonymousCartRemovalAge</code> attribute.
	 * @return the anonymousCartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 14 days.
	 */
	public Integer getAnonymousCartRemovalAge()
	{
		return getAnonymousCartRemovalAge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OldCartRemovalCronJob.anonymousCartRemovalAge</code> attribute. 
	 * @return the anonymousCartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 14 days.
	 */
	public int getAnonymousCartRemovalAgeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getAnonymousCartRemovalAge( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OldCartRemovalCronJob.anonymousCartRemovalAge</code> attribute. 
	 * @return the anonymousCartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 14 days.
	 */
	public int getAnonymousCartRemovalAgeAsPrimitive()
	{
		return getAnonymousCartRemovalAgeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OldCartRemovalCronJob.anonymousCartRemovalAge</code> attribute. 
	 * @param value the anonymousCartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 14 days.
	 */
	public void setAnonymousCartRemovalAge(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ANONYMOUSCARTREMOVALAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OldCartRemovalCronJob.anonymousCartRemovalAge</code> attribute. 
	 * @param value the anonymousCartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 14 days.
	 */
	public void setAnonymousCartRemovalAge(final Integer value)
	{
		setAnonymousCartRemovalAge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OldCartRemovalCronJob.anonymousCartRemovalAge</code> attribute. 
	 * @param value the anonymousCartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 14 days.
	 */
	public void setAnonymousCartRemovalAge(final SessionContext ctx, final int value)
	{
		setAnonymousCartRemovalAge( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OldCartRemovalCronJob.anonymousCartRemovalAge</code> attribute. 
	 * @param value the anonymousCartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 14 days.
	 */
	public void setAnonymousCartRemovalAge(final int value)
	{
		setAnonymousCartRemovalAge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OldCartRemovalCronJob.cartRemovalAge</code> attribute.
	 * @return the cartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 28 days.
	 */
	public Integer getCartRemovalAge(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, CARTREMOVALAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OldCartRemovalCronJob.cartRemovalAge</code> attribute.
	 * @return the cartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 28 days.
	 */
	public Integer getCartRemovalAge()
	{
		return getCartRemovalAge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OldCartRemovalCronJob.cartRemovalAge</code> attribute. 
	 * @return the cartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 28 days.
	 */
	public int getCartRemovalAgeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getCartRemovalAge( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OldCartRemovalCronJob.cartRemovalAge</code> attribute. 
	 * @return the cartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 28 days.
	 */
	public int getCartRemovalAgeAsPrimitive()
	{
		return getCartRemovalAgeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OldCartRemovalCronJob.cartRemovalAge</code> attribute. 
	 * @param value the cartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 28 days.
	 */
	public void setCartRemovalAge(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, CARTREMOVALAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OldCartRemovalCronJob.cartRemovalAge</code> attribute. 
	 * @param value the cartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 28 days.
	 */
	public void setCartRemovalAge(final Integer value)
	{
		setCartRemovalAge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OldCartRemovalCronJob.cartRemovalAge</code> attribute. 
	 * @param value the cartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 28 days.
	 */
	public void setCartRemovalAge(final SessionContext ctx, final int value)
	{
		setCartRemovalAge( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OldCartRemovalCronJob.cartRemovalAge</code> attribute. 
	 * @param value the cartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 28 days.
	 */
	public void setCartRemovalAge(final int value)
	{
		setCartRemovalAge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OldCartRemovalCronJob.sites</code> attribute.
	 * @return the sites - BaseSites for which old carts should be removed
	 */
	public Collection<BaseSite> getSites(final SessionContext ctx)
	{
		Collection<BaseSite> coll = (Collection<BaseSite>)getProperty( ctx, SITES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OldCartRemovalCronJob.sites</code> attribute.
	 * @return the sites - BaseSites for which old carts should be removed
	 */
	public Collection<BaseSite> getSites()
	{
		return getSites( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OldCartRemovalCronJob.sites</code> attribute. 
	 * @param value the sites - BaseSites for which old carts should be removed
	 */
	public void setSites(final SessionContext ctx, final Collection<BaseSite> value)
	{
		setProperty(ctx, SITES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OldCartRemovalCronJob.sites</code> attribute. 
	 * @param value the sites - BaseSites for which old carts should be removed
	 */
	public void setSites(final Collection<BaseSite> value)
	{
		setSites( getSession().getSessionContext(), value );
	}
	
}
