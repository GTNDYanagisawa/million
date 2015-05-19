/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2015/04/16 16:55:23                         ---
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
package de.hybris.platform.yb2bacceleratorcore.jalo;

import de.hybris.platform.catalog.jalo.Catalog;
import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.yb2bacceleratorcore.constants.YB2BAcceleratorCoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.yb2bacceleratorcore.jalo.MultipleCatalogsSyncCronJob MultipleCatalogsSyncCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMultipleCatalogsSyncCronJob extends CronJob
{
	/** Qualifier of the <code>MultipleCatalogsSyncCronJob.contentCatalogs</code> attribute **/
	public static final String CONTENTCATALOGS = "contentCatalogs";
	/** Qualifier of the <code>MultipleCatalogsSyncCronJob.productCatalog</code> attribute **/
	public static final String PRODUCTCATALOG = "productCatalog";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CONTENTCATALOGS, AttributeMode.INITIAL);
		tmp.put(PRODUCTCATALOG, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MultipleCatalogsSyncCronJob.contentCatalogs</code> attribute.
	 * @return the contentCatalogs - List of content catalogs used for CatalogVersionSyncJob
	 */
	public List<Catalog> getContentCatalogs(final SessionContext ctx)
	{
		List<Catalog> coll = (List<Catalog>)getProperty( ctx, CONTENTCATALOGS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MultipleCatalogsSyncCronJob.contentCatalogs</code> attribute.
	 * @return the contentCatalogs - List of content catalogs used for CatalogVersionSyncJob
	 */
	public List<Catalog> getContentCatalogs()
	{
		return getContentCatalogs( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MultipleCatalogsSyncCronJob.contentCatalogs</code> attribute. 
	 * @param value the contentCatalogs - List of content catalogs used for CatalogVersionSyncJob
	 */
	public void setContentCatalogs(final SessionContext ctx, final List<Catalog> value)
	{
		setProperty(ctx, CONTENTCATALOGS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MultipleCatalogsSyncCronJob.contentCatalogs</code> attribute. 
	 * @param value the contentCatalogs - List of content catalogs used for CatalogVersionSyncJob
	 */
	public void setContentCatalogs(final List<Catalog> value)
	{
		setContentCatalogs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MultipleCatalogsSyncCronJob.productCatalog</code> attribute.
	 * @return the productCatalog - Products catalog used for CatalogVersionSyncJob
	 */
	public Catalog getProductCatalog(final SessionContext ctx)
	{
		return (Catalog)getProperty( ctx, PRODUCTCATALOG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MultipleCatalogsSyncCronJob.productCatalog</code> attribute.
	 * @return the productCatalog - Products catalog used for CatalogVersionSyncJob
	 */
	public Catalog getProductCatalog()
	{
		return getProductCatalog( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MultipleCatalogsSyncCronJob.productCatalog</code> attribute. 
	 * @param value the productCatalog - Products catalog used for CatalogVersionSyncJob
	 */
	public void setProductCatalog(final SessionContext ctx, final Catalog value)
	{
		setProperty(ctx, PRODUCTCATALOG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MultipleCatalogsSyncCronJob.productCatalog</code> attribute. 
	 * @param value the productCatalog - Products catalog used for CatalogVersionSyncJob
	 */
	public void setProductCatalog(final Catalog value)
	{
		setProductCatalog( getSession().getSessionContext(), value );
	}
	
}
