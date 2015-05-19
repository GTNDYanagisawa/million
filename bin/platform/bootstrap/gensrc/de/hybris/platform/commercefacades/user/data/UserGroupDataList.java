/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 2015/05/18 13:25:59
 * ----------------------------------------------------------------
 *
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package de.hybris.platform.commercefacades.user.data;

import de.hybris.platform.commercefacades.user.data.UserGroupData;
import java.util.List;

public class UserGroupDataList  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>UserGroupDataList.userGroups</code> property defined at extension <code>commercefacades</code>. */
	private List<UserGroupData> userGroups;
	/** <i>Generated property</i> for <code>UserGroupDataList.pageSize</code> property defined at extension <code>commercefacades</code>. */
	private Integer pageSize;
	/** <i>Generated property</i> for <code>UserGroupDataList.totalNumber</code> property defined at extension <code>commercefacades</code>. */
	private Integer totalNumber;
	/** <i>Generated property</i> for <code>UserGroupDataList.numberOfPages</code> property defined at extension <code>commercefacades</code>. */
	private Integer numberOfPages;
	/** <i>Generated property</i> for <code>UserGroupDataList.currentPage</code> property defined at extension <code>commercefacades</code>. */
	private Integer currentPage;
		
	public UserGroupDataList()
	{
		// default constructor
	}
	
		
	public void setUserGroups(final List<UserGroupData> userGroups)
	{
		this.userGroups = userGroups;
	}
	
		
	public List<UserGroupData> getUserGroups() 
	{
		return userGroups;
	}
		
		
	public void setPageSize(final Integer pageSize)
	{
		this.pageSize = pageSize;
	}
	
		
	public Integer getPageSize() 
	{
		return pageSize;
	}
		
		
	public void setTotalNumber(final Integer totalNumber)
	{
		this.totalNumber = totalNumber;
	}
	
		
	public Integer getTotalNumber() 
	{
		return totalNumber;
	}
		
		
	public void setNumberOfPages(final Integer numberOfPages)
	{
		this.numberOfPages = numberOfPages;
	}
	
		
	public Integer getNumberOfPages() 
	{
		return numberOfPages;
	}
		
		
	public void setCurrentPage(final Integer currentPage)
	{
		this.currentPage = currentPage;
	}
	
		
	public Integer getCurrentPage() 
	{
		return currentPage;
	}
		
	
}