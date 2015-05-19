/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2014 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *  
 */
package de.hybris.platform.b2bacceleratorservices.dao.impl;

import de.hybris.platform.b2b.model.B2BUserGroupModel;
import de.hybris.platform.b2bacceleratorservices.dao.PagedB2BUserGroupDao;
import de.hybris.platform.commerceservices.search.dao.impl.DefaultPagedGenericDao;
import de.hybris.platform.commerceservices.search.flexiblesearch.data.SortQueryData;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;
import de.hybris.platform.servicelayer.internal.dao.SortParameters;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class DefaultPagedB2BUserGroupDao extends DefaultPagedGenericDao<B2BUserGroupModel> implements
		PagedB2BUserGroupDao<B2BUserGroupModel>
{
	private static final String FIND_USERGROUP_BY_PARENT_UNIT = "SELECT {B2BUserGroup:pk}     "
			+ " FROM { B2BUserGroup 	as B2BUserGroup 														  "
			+ " JOIN   B2BUnit 			as B2BUnit 			ON  {B2BUserGroup:unit} = {B2BUnit:pk} }"
			+ " ORDER BY {B2BUnit:name}																			  ";

	public DefaultPagedB2BUserGroupDao(final String typeCode)
	{
		super(typeCode);
	}

	@Override
	public SearchPageData<B2BUserGroupModel> findPagedB2BUserGroup(final String sortCode, final PageableData pageableData)
	{
		final List<SortQueryData> sortQueries = Arrays.asList(
				createSortQueryData("byUnitName", FIND_USERGROUP_BY_PARENT_UNIT),
				createSortQueryData("byGroupID", new HashMap<String, Object>(),
						SortParameters.singletonAscending(B2BUserGroupModel.UID), pageableData),
				createSortQueryData("byName", new HashMap<String, Object>(),
						SortParameters.singletonAscending(B2BUserGroupModel.NAME), pageableData));

		return getPagedFlexibleSearchService().search(sortQueries, sortCode, new HashMap<String, Object>(), pageableData);
	}
}
