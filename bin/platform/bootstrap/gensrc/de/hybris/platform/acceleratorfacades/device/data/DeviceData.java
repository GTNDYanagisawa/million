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
package de.hybris.platform.acceleratorfacades.device.data;

import java.util.Map;

public class DeviceData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>DeviceData.id</code> property defined at extension <code>acceleratorfacades</code>. */
	private String id;
	/** <i>Generated property</i> for <code>DeviceData.mobileBrowser</code> property defined at extension <code>acceleratorfacades</code>. */
	private Boolean mobileBrowser;
	/** <i>Generated property</i> for <code>DeviceData.desktopBrowser</code> property defined at extension <code>acceleratorfacades</code>. */
	private Boolean desktopBrowser;
	/** <i>Generated property</i> for <code>DeviceData.userAgent</code> property defined at extension <code>acceleratorfacades</code>. */
	private String userAgent;
	/** <i>Generated property</i> for <code>DeviceData.tabletBrowser</code> property defined at extension <code>acceleratorfacades</code>. */
	private Boolean tabletBrowser;
	/** <i>Generated property</i> for <code>DeviceData.capabilities</code> property defined at extension <code>acceleratorfacades</code>. */
	private Map<String,String> capabilities;
		
	public DeviceData()
	{
		// default constructor
	}
	
		
	public void setId(final String id)
	{
		this.id = id;
	}
	
		
	public String getId() 
	{
		return id;
	}
		
		
	public void setMobileBrowser(final Boolean mobileBrowser)
	{
		this.mobileBrowser = mobileBrowser;
	}
	
		
	public Boolean getMobileBrowser() 
	{
		return mobileBrowser;
	}
		
		
	public void setDesktopBrowser(final Boolean desktopBrowser)
	{
		this.desktopBrowser = desktopBrowser;
	}
	
		
	public Boolean getDesktopBrowser() 
	{
		return desktopBrowser;
	}
		
		
	public void setUserAgent(final String userAgent)
	{
		this.userAgent = userAgent;
	}
	
		
	public String getUserAgent() 
	{
		return userAgent;
	}
		
		
	public void setTabletBrowser(final Boolean tabletBrowser)
	{
		this.tabletBrowser = tabletBrowser;
	}
	
		
	public Boolean getTabletBrowser() 
	{
		return tabletBrowser;
	}
		
		
	public void setCapabilities(final Map<String,String> capabilities)
	{
		this.capabilities = capabilities;
	}
	
		
	public Map<String,String> getCapabilities() 
	{
		return capabilities;
	}
		
	
}