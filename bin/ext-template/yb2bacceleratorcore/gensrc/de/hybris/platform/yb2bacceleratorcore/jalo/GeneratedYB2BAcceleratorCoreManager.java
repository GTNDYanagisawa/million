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

import de.hybris.platform.acceleratorcms.jalo.components.HeaderNavigationComponent;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.yb2bacceleratorcore.constants.YB2BAcceleratorCoreConstants;
import de.hybris.platform.yb2bacceleratorcore.jalo.MultipleCatalogsSyncCronJob;
import de.hybris.platform.yb2bacceleratorcore.jalo.PowertoolsSizeVariantProduct;
import de.hybris.platform.yb2bacceleratorcore.jalo.btg.BTGOrganizationTotalSpentInCurrencyLastYearOperand;
import de.hybris.platform.yb2bacceleratorcore.jalo.btg.BTGOrganizationTotalSpentInCurrencyRelativeDatesOperand;
import de.hybris.platform.yb2bacceleratorcore.jalo.btg.OrganizationOrderStatistics;
import de.hybris.platform.yb2bacceleratorcore.jalo.btg.OrganizationOrdersReportingCronJob;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>YB2BAcceleratorCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedYB2BAcceleratorCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public BTGOrganizationTotalSpentInCurrencyLastYearOperand createBTGOrganizationTotalSpentInCurrencyLastYearOperand(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( YB2BAcceleratorCoreConstants.TC.BTGORGANIZATIONTOTALSPENTINCURRENCYLASTYEAROPERAND );
			return (BTGOrganizationTotalSpentInCurrencyLastYearOperand)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating BTGOrganizationTotalSpentInCurrencyLastYearOperand : "+e.getMessage(), 0 );
		}
	}
	
	public BTGOrganizationTotalSpentInCurrencyLastYearOperand createBTGOrganizationTotalSpentInCurrencyLastYearOperand(final Map attributeValues)
	{
		return createBTGOrganizationTotalSpentInCurrencyLastYearOperand( getSession().getSessionContext(), attributeValues );
	}
	
	public BTGOrganizationTotalSpentInCurrencyRelativeDatesOperand createBTGOrganizationTotalSpentInCurrencyRelativeDatesOperand(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( YB2BAcceleratorCoreConstants.TC.BTGORGANIZATIONTOTALSPENTINCURRENCYRELATIVEDATESOPERAND );
			return (BTGOrganizationTotalSpentInCurrencyRelativeDatesOperand)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating BTGOrganizationTotalSpentInCurrencyRelativeDatesOperand : "+e.getMessage(), 0 );
		}
	}
	
	public BTGOrganizationTotalSpentInCurrencyRelativeDatesOperand createBTGOrganizationTotalSpentInCurrencyRelativeDatesOperand(final Map attributeValues)
	{
		return createBTGOrganizationTotalSpentInCurrencyRelativeDatesOperand( getSession().getSessionContext(), attributeValues );
	}
	
	public HeaderNavigationComponent createHeaderNavigationComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( YB2BAcceleratorCoreConstants.TC.HEADERNAVIGATIONCOMPONENT );
			return (HeaderNavigationComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating HeaderNavigationComponent : "+e.getMessage(), 0 );
		}
	}
	
	public HeaderNavigationComponent createHeaderNavigationComponent(final Map attributeValues)
	{
		return createHeaderNavigationComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public MultipleCatalogsSyncCronJob createMultipleCatalogsSyncCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( YB2BAcceleratorCoreConstants.TC.MULTIPLECATALOGSSYNCCRONJOB );
			return (MultipleCatalogsSyncCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating MultipleCatalogsSyncCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public MultipleCatalogsSyncCronJob createMultipleCatalogsSyncCronJob(final Map attributeValues)
	{
		return createMultipleCatalogsSyncCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public OrganizationOrdersReportingCronJob createOrganizationOrdersReportingCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( YB2BAcceleratorCoreConstants.TC.ORGANIZATIONORDERSREPORTINGCRONJOB );
			return (OrganizationOrdersReportingCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating OrganizationOrdersReportingCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public OrganizationOrdersReportingCronJob createOrganizationOrdersReportingCronJob(final Map attributeValues)
	{
		return createOrganizationOrdersReportingCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public OrganizationOrderStatistics createOrganizationOrderStatistics(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( YB2BAcceleratorCoreConstants.TC.ORGANIZATIONORDERSTATISTICS );
			return (OrganizationOrderStatistics)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating OrganizationOrderStatistics : "+e.getMessage(), 0 );
		}
	}
	
	public OrganizationOrderStatistics createOrganizationOrderStatistics(final Map attributeValues)
	{
		return createOrganizationOrderStatistics( getSession().getSessionContext(), attributeValues );
	}
	
	public PowertoolsSizeVariantProduct createPowertoolsSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( YB2BAcceleratorCoreConstants.TC.POWERTOOLSSIZEVARIANTPRODUCT );
			return (PowertoolsSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating PowertoolsSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public PowertoolsSizeVariantProduct createPowertoolsSizeVariantProduct(final Map attributeValues)
	{
		return createPowertoolsSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return YB2BAcceleratorCoreConstants.EXTENSIONNAME;
	}
	
}
