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
package de.hybris.platform.ycommercewebservices.model;

import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.cronjob.model.JobModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type OldCartRemovalCronJob first defined at extension ycommercewebservices.
 */
@SuppressWarnings("all")
public class OldCartRemovalCronJobModel extends CronJobModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "OldCartRemovalCronJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>OldCartRemovalCronJob.sites</code> attribute defined at extension <code>ycommercewebservices</code>. */
	public static final String SITES = "sites";
	
	/** <i>Generated constant</i> - Attribute key of <code>OldCartRemovalCronJob.cartRemovalAge</code> attribute defined at extension <code>ycommercewebservices</code>. */
	public static final String CARTREMOVALAGE = "cartRemovalAge";
	
	/** <i>Generated constant</i> - Attribute key of <code>OldCartRemovalCronJob.anonymousCartRemovalAge</code> attribute defined at extension <code>ycommercewebservices</code>. */
	public static final String ANONYMOUSCARTREMOVALAGE = "anonymousCartRemovalAge";
	
	
	/** <i>Generated variable</i> - Variable of <code>OldCartRemovalCronJob.sites</code> attribute defined at extension <code>ycommercewebservices</code>. */
	private Collection<BaseSiteModel> _sites;
	
	/** <i>Generated variable</i> - Variable of <code>OldCartRemovalCronJob.cartRemovalAge</code> attribute defined at extension <code>ycommercewebservices</code>. */
	private Integer _cartRemovalAge;
	
	/** <i>Generated variable</i> - Variable of <code>OldCartRemovalCronJob.anonymousCartRemovalAge</code> attribute defined at extension <code>ycommercewebservices</code>. */
	private Integer _anonymousCartRemovalAge;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public OldCartRemovalCronJobModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public OldCartRemovalCronJobModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 */
	@Deprecated
	public OldCartRemovalCronJobModel(final JobModel _job)
	{
		super();
		setJob(_job);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public OldCartRemovalCronJobModel(final JobModel _job, final ItemModel _owner)
	{
		super();
		setJob(_job);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OldCartRemovalCronJob.anonymousCartRemovalAge</code> attribute defined at extension <code>ycommercewebservices</code>. 
	 * @return the anonymousCartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 14 days.
	 */
	public Integer getAnonymousCartRemovalAge()
	{
		if (this._anonymousCartRemovalAge!=null)
		{
			return _anonymousCartRemovalAge;
		}
		return _anonymousCartRemovalAge = getPersistenceContext().getValue(ANONYMOUSCARTREMOVALAGE, _anonymousCartRemovalAge);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OldCartRemovalCronJob.cartRemovalAge</code> attribute defined at extension <code>ycommercewebservices</code>. 
	 * @return the cartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 28 days.
	 */
	public Integer getCartRemovalAge()
	{
		if (this._cartRemovalAge!=null)
		{
			return _cartRemovalAge;
		}
		return _cartRemovalAge = getPersistenceContext().getValue(CARTREMOVALAGE, _cartRemovalAge);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OldCartRemovalCronJob.sites</code> attribute defined at extension <code>ycommercewebservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the sites - BaseSites for which old carts should be removed
	 */
	public Collection<BaseSiteModel> getSites()
	{
		if (this._sites!=null)
		{
			return _sites;
		}
		return _sites = getPersistenceContext().getValue(SITES, _sites);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OldCartRemovalCronJob.anonymousCartRemovalAge</code> attribute defined at extension <code>ycommercewebservices</code>. 
	 *  
	 * @param value the anonymousCartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 14 days.
	 */
	public void setAnonymousCartRemovalAge(final Integer value)
	{
		_anonymousCartRemovalAge = getPersistenceContext().setValue(ANONYMOUSCARTREMOVALAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OldCartRemovalCronJob.cartRemovalAge</code> attribute defined at extension <code>ycommercewebservices</code>. 
	 *  
	 * @param value the cartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 28 days.
	 */
	public void setCartRemovalAge(final Integer value)
	{
		_cartRemovalAge = getPersistenceContext().setValue(CARTREMOVALAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OldCartRemovalCronJob.sites</code> attribute defined at extension <code>ycommercewebservices</code>. 
	 *  
	 * @param value the sites - BaseSites for which old carts should be removed
	 */
	public void setSites(final Collection<BaseSiteModel> value)
	{
		_sites = getPersistenceContext().setValue(SITES, value);
	}
	
}
