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
package de.hybris.platform.commercewebservicescommons.dto.store;

import de.hybris.platform.commercewebservicescommons.dto.product.ImageWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.store.GeoPointWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.store.OpeningScheduleWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.user.AddressWsDTO;
import java.util.Collection;
import java.util.Map;

public class PointOfServiceWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>PointOfServiceWsDTO.openingHours</code> property defined at extension <code>commercewebservicescommons</code>. */
	private OpeningScheduleWsDTO openingHours;
	/** <i>Generated property</i> for <code>PointOfServiceWsDTO.formattedDistance</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String formattedDistance;
	/** <i>Generated property</i> for <code>PointOfServiceWsDTO.mapIcon</code> property defined at extension <code>commercewebservicescommons</code>. */
	private ImageWsDTO mapIcon;
	/** <i>Generated property</i> for <code>PointOfServiceWsDTO.url</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String url;
	/** <i>Generated property</i> for <code>PointOfServiceWsDTO.storeImages</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Collection<ImageWsDTO> storeImages;
	/** <i>Generated property</i> for <code>PointOfServiceWsDTO.geoPoint</code> property defined at extension <code>commercewebservicescommons</code>. */
	private GeoPointWsDTO geoPoint;
	/** <i>Generated property</i> for <code>PointOfServiceWsDTO.address</code> property defined at extension <code>commercewebservicescommons</code>. */
	private AddressWsDTO address;
	/** <i>Generated property</i> for <code>PointOfServiceWsDTO.description</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String description;
	/** <i>Generated property</i> for <code>PointOfServiceWsDTO.name</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String name;
	/** <i>Generated property</i> for <code>PointOfServiceWsDTO.storeContent</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String storeContent;
	/** <i>Generated property</i> for <code>PointOfServiceWsDTO.features</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Map<String, String> features;
	/** <i>Generated property</i> for <code>PointOfServiceWsDTO.displayName</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String displayName;
	/** <i>Generated property</i> for <code>PointOfServiceWsDTO.distanceKm</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Double distanceKm;
		
	public PointOfServiceWsDTO()
	{
		// default constructor
	}
	
		
	public void setOpeningHours(final OpeningScheduleWsDTO openingHours)
	{
		this.openingHours = openingHours;
	}
	
		
	public OpeningScheduleWsDTO getOpeningHours() 
	{
		return openingHours;
	}
		
		
	public void setFormattedDistance(final String formattedDistance)
	{
		this.formattedDistance = formattedDistance;
	}
	
		
	public String getFormattedDistance() 
	{
		return formattedDistance;
	}
		
		
	public void setMapIcon(final ImageWsDTO mapIcon)
	{
		this.mapIcon = mapIcon;
	}
	
		
	public ImageWsDTO getMapIcon() 
	{
		return mapIcon;
	}
		
		
	public void setUrl(final String url)
	{
		this.url = url;
	}
	
		
	public String getUrl() 
	{
		return url;
	}
		
		
	public void setStoreImages(final Collection<ImageWsDTO> storeImages)
	{
		this.storeImages = storeImages;
	}
	
		
	public Collection<ImageWsDTO> getStoreImages() 
	{
		return storeImages;
	}
		
		
	public void setGeoPoint(final GeoPointWsDTO geoPoint)
	{
		this.geoPoint = geoPoint;
	}
	
		
	public GeoPointWsDTO getGeoPoint() 
	{
		return geoPoint;
	}
		
		
	public void setAddress(final AddressWsDTO address)
	{
		this.address = address;
	}
	
		
	public AddressWsDTO getAddress() 
	{
		return address;
	}
		
		
	public void setDescription(final String description)
	{
		this.description = description;
	}
	
		
	public String getDescription() 
	{
		return description;
	}
		
		
	public void setName(final String name)
	{
		this.name = name;
	}
	
		
	public String getName() 
	{
		return name;
	}
		
		
	public void setStoreContent(final String storeContent)
	{
		this.storeContent = storeContent;
	}
	
		
	public String getStoreContent() 
	{
		return storeContent;
	}
		
		
	public void setFeatures(final Map<String, String> features)
	{
		this.features = features;
	}
	
		
	public Map<String, String> getFeatures() 
	{
		return features;
	}
		
		
	public void setDisplayName(final String displayName)
	{
		this.displayName = displayName;
	}
	
		
	public String getDisplayName() 
	{
		return displayName;
	}
		
		
	public void setDistanceKm(final Double distanceKm)
	{
		this.distanceKm = distanceKm;
	}
	
		
	public Double getDistanceKm() 
	{
		return distanceKm;
	}
		
	
}