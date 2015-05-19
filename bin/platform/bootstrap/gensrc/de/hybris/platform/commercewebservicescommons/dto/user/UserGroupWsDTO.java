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
package de.hybris.platform.commercewebservicescommons.dto.user;

import de.hybris.platform.commercewebservicescommons.dto.user.PrincipalWsDTO;
import java.util.List;

public class UserGroupWsDTO extends PrincipalWsDTO 
{

	/** <i>Generated property</i> for <code>UserGroupWsDTO.membersCount</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Integer membersCount;
	/** <i>Generated property</i> for <code>UserGroupWsDTO.subGroups</code> property defined at extension <code>commercewebservicescommons</code>. */
	private List<UserGroupWsDTO> subGroups;
	/** <i>Generated property</i> for <code>UserGroupWsDTO.members</code> property defined at extension <code>commercewebservicescommons</code>. */
	private List<PrincipalWsDTO> members;
		
	public UserGroupWsDTO()
	{
		// default constructor
	}
	
		
	public void setMembersCount(final Integer membersCount)
	{
		this.membersCount = membersCount;
	}
	
		
	public Integer getMembersCount() 
	{
		return membersCount;
	}
		
		
	public void setSubGroups(final List<UserGroupWsDTO> subGroups)
	{
		this.subGroups = subGroups;
	}
	
		
	public List<UserGroupWsDTO> getSubGroups() 
	{
		return subGroups;
	}
		
		
	public void setMembers(final List<PrincipalWsDTO> members)
	{
		this.members = members;
	}
	
		
	public List<PrincipalWsDTO> getMembers() 
	{
		return members;
	}
		
	
}