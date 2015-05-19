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
package de.hybris.platform.commercefacades.product.data;

import de.hybris.platform.commercefacades.user.data.PrincipalData;
import java.util.Date;

public class ReviewData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>ReviewData.headline</code> property defined at extension <code>commercefacades</code>. */
	private String headline;
	/** <i>Generated property</i> for <code>ReviewData.id</code> property defined at extension <code>commercefacades</code>. */
	private String id;
	/** <i>Generated property</i> for <code>ReviewData.principal</code> property defined at extension <code>commercefacades</code>. */
	private PrincipalData principal;
	/** <i>Generated property</i> for <code>ReviewData.alias</code> property defined at extension <code>commercefacades</code>. */
	private String alias;
	/** <i>Generated property</i> for <code>ReviewData.rating</code> property defined at extension <code>commercefacades</code>. */
	private Double rating;
	/** <i>Generated property</i> for <code>ReviewData.date</code> property defined at extension <code>commercefacades</code>. */
	private Date date;
	/** <i>Generated property</i> for <code>ReviewData.comment</code> property defined at extension <code>commercefacades</code>. */
	private String comment;
		
	public ReviewData()
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
		
		
	public void setPrincipal(final PrincipalData principal)
	{
		this.principal = principal;
	}
	
		
	public PrincipalData getPrincipal() 
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