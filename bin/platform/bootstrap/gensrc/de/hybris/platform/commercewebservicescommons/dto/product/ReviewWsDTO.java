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
package de.hybris.platform.commercewebservicescommons.dto.product;

import de.hybris.platform.commercewebservicescommons.dto.user.UserWsDTO;
import java.util.Date;

public class ReviewWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>ReviewWsDTO.headline</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String headline;
	/** <i>Generated property</i> for <code>ReviewWsDTO.id</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String id;
	/** <i>Generated property</i> for <code>ReviewWsDTO.principal</code> property defined at extension <code>commercewebservicescommons</code>. */
	private UserWsDTO principal;
	/** <i>Generated property</i> for <code>ReviewWsDTO.alias</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String alias;
	/** <i>Generated property</i> for <code>ReviewWsDTO.rating</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Double rating;
	/** <i>Generated property</i> for <code>ReviewWsDTO.date</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Date date;
	/** <i>Generated property</i> for <code>ReviewWsDTO.comment</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String comment;
		
	public ReviewWsDTO()
	{
		// default constructor
	}
	
		
	public void setHeadline(final String headline)
	{
		this.headline = headline;
	}
	
		
	public String getHeadline() 
	{
		return headline;
	}
		
		
	public void setId(final String id)
	{
		this.id = id;
	}
	
		
	public String getId() 
	{
		return id;
	}
		
		
	public void setPrincipal(final UserWsDTO principal)
	{
		this.principal = principal;
	}
	
		
	public UserWsDTO getPrincipal() 
	{
		return principal;
	}
		
		
	public void setAlias(final String alias)
	{
		this.alias = alias;
	}
	
		
	public String getAlias() 
	{
		return alias;
	}
		
		
	public void setRating(final Double rating)
	{
		this.rating = rating;
	}
	
		
	public Double getRating() 
	{
		return rating;
	}
		
		
	public void setDate(final Date date)
	{
		this.date = date;
	}
	
		
	public Date getDate() 
	{
		return date;
	}
		
		
	public void setComment(final String comment)
	{
		this.comment = comment;
	}
	
		
	public String getComment() 
	{
		return comment;
	}
		
	
}