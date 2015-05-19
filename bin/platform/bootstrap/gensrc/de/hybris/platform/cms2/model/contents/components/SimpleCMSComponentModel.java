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
package de.hybris.platform.cms2.model.contents.components;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel;
import de.hybris.platform.cms2.model.contents.containers.AbstractCMSComponentContainerModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type SimpleCMSComponent first defined at extension cms2.
 */
@SuppressWarnings("all")
public class SimpleCMSComponentModel extends AbstractCMSComponentModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SimpleCMSComponent";
	
	/**<i>Generated relation code constant for relation <code>ElementsForContainer</code> defining source attribute <code>containers</code> in extension <code>cms2</code>.</i>*/
	public final static String _ELEMENTSFORCONTAINER = "ElementsForContainer";
	
	/** <i>Generated constant</i> - Attribute key of <code>SimpleCMSComponent.containers</code> attribute defined at extension <code>cms2</code>. */
	public static final String CONTAINERS = "containers";
	
	
	/** <i>Generated variable</i> - Variable of <code>SimpleCMSComponent.containers</code> attribute defined at extension <code>cms2</code>. */
	private Collection<AbstractCMSComponentContainerModel> _containers;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SimpleCMSComponentModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SimpleCMSComponentModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public SimpleCMSComponentModel(final CatalogVersionModel _catalogVersion, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public SimpleCMSComponentModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SimpleCMSComponent.containers</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the containers
	 */
	public Collection<AbstractCMSComponentContainerModel> getContainers()
	{
		if (this._containers!=null)
		{
			return _containers;
		}
		return _containers = getPersistenceContext().getValue(CONTAINERS, _containers);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SimpleCMSComponent.containers</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the containers
	 */
	public void setContainers(final Collection<AbstractCMSComponentContainerModel> value)
	{
		_containers = getPersistenceContext().setValue(CONTAINERS, value);
	}
	
}
