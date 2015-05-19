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
package de.hybris.platform.acceleratorservices.model;

import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.cronjob.model.JobModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type CartRemovalCronJob first defined at extension acceleratorservices.
 */
@SuppressWarnings("all")
public class CartRemovalCronJobModel extends CronJobModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CartRemovalCronJob";
	
	/**<i>Generated relation code constant for relation <code>BaseSite2CartRemovalCronJob</code> defining source attribute <code>sites</code> in extension <code>acceleratorservices</code>.</i>*/
	public final static String _BASESITE2CARTREMOVALCRONJOB = "BaseSite2CartRemovalCronJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>CartRemovalCronJob.sites</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String SITES = "sites";
	
	
	/** <i>Generated variable</i> - Variable of <code>CartRemovalCronJob.sites</code> attribute defined at extension <code>acceleratorservices</code>. */
	private Collection<BaseSiteModel> _sites;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CartRemovalCronJobModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CartRemovalCronJobModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 * @param _sites initial attribute declared by type <code>CartRemovalCronJob</code> at extension <code>acceleratorservices</code>
	 */
	@Deprecated
	public CartRemovalCronJobModel(final JobModel _job, final Collection<BaseSiteModel> _sites)
	{
		super();
		setJob(_job);
		setSites(_sites);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _sites initial attribute declared by type <code>CartRemovalCronJob</code> at extension <code>acceleratorservices</code>
	 */
	@Deprecated
	public CartRemovalCronJobModel(final JobModel _job, final ItemModel _owner, final Collection<BaseSiteModel> _sites)
	{
		super();
		setJob(_job);
		setOwner(_owner);
		setSites(_sites);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CartRemovalCronJob.sites</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the sites
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
	 * <i>Generated method</i> - Setter of <code>CartRemovalCronJob.sites</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the sites
	 */
	public void setSites(final Collection<BaseSiteModel> value)
	{
		_sites = getPersistenceContext().setValue(SITES, value);
	}
	
}
