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
package de.hybris.platform.acceleratorcms.data;

import de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel;
import de.hybris.platform.cms2.model.pages.AbstractPageModel;
import de.hybris.platform.cms2.model.preview.PreviewDataModel;
import de.hybris.platform.core.model.user.UserModel;
import java.util.Map;

/**
 * Holds context data for CMS page rendering in the current request
 */
public class CmsPageRequestContextData  implements java.io.Serializable 
{

	/** Flag to indicate if CMS live edit is enabled<br/><br/><i>Generated property</i> for <code>CmsPageRequestContextData.liveEdit</code> property defined at extension <code>acceleratorcms</code>. */
	private boolean liveEdit;
	/** Flag to indicate if CMS preview is enabled<br/><br/><i>Generated property</i> for <code>CmsPageRequestContextData.preview</code> property defined at extension <code>acceleratorcms</code>. */
	private boolean preview;
	/** The hybris session id for the current session<br/><br/><i>Generated property</i> for <code>CmsPageRequestContextData.sessionId</code> property defined at extension <code>acceleratorcms</code>. */
	private String sessionId;
	/** The current CMS Page<br/><br/><i>Generated property</i> for <code>CmsPageRequestContextData.page</code> property defined at extension <code>acceleratorcms</code>. */
	private AbstractPageModel page;
	/** The parent of the current component used for CMS Actions<br/><br/><i>Generated property</i> for <code>CmsPageRequestContextData.parentComponent</code> property defined at extension <code>acceleratorcms</code>. */
	private AbstractCMSComponentModel parentComponent;
	/** The preview data (optional)<br/><br/><i>Generated property</i> for <code>CmsPageRequestContextData.previewData</code> property defined at extension <code>acceleratorcms</code>. */
	private PreviewDataModel previewData;
	/** 
				Map from String position name to de.hybris.platform.cms2.servicelayer.data.ContentSlotData for the current page.
			<br/><br/><i>Generated property</i> for <code>CmsPageRequestContextData.positionToSlot</code> property defined at extension <code>acceleratorcms</code>. */
	private Map<String,Object> positionToSlot;
	/** The current user<br/><br/><i>Generated property</i> for <code>CmsPageRequestContextData.user</code> property defined at extension <code>acceleratorcms</code>. */
	private UserModel user;
	/** 
				Holds the computed restriction data for this request of type de.hybris.platform.cms2.servicelayer.data.RestrictionData.
			<br/><br/><i>Generated property</i> for <code>CmsPageRequestContextData.restrictionData</code> property defined at extension <code>acceleratorcms</code>. */
	private Object restrictionData;
		
	public CmsPageRequestContextData()
	{
		// default constructor
	}
	
		
	public void setLiveEdit(final boolean liveEdit)
	{
		this.liveEdit = liveEdit;
	}
	
		
	public boolean isLiveEdit() 
	{
		return liveEdit;
	}
		
		
	public void setPreview(final boolean preview)
	{
		this.preview = preview;
	}
	
		
	public boolean isPreview() 
	{
		return preview;
	}
		
		
	public void setSessionId(final String sessionId)
	{
		this.sessionId = sessionId;
	}
	
		
	public String getSessionId() 
	{
		return sessionId;
	}
		
		
	public void setPage(final AbstractPageModel page)
	{
		this.page = page;
	}
	
		
	public AbstractPageModel getPage() 
	{
		return page;
	}
		
		
	public void setParentComponent(final AbstractCMSComponentModel parentComponent)
	{
		this.parentComponent = parentComponent;
	}
	
		
	public AbstractCMSComponentModel getParentComponent() 
	{
		return parentComponent;
	}
		
		
	public void setPreviewData(final PreviewDataModel previewData)
	{
		this.previewData = previewData;
	}
	
		
	public PreviewDataModel getPreviewData() 
	{
		return previewData;
	}
		
		
	public void setPositionToSlot(final Map<String,Object> positionToSlot)
	{
		this.positionToSlot = positionToSlot;
	}
	
		
	public Map<String,Object> getPositionToSlot() 
	{
		return positionToSlot;
	}
		
		
	public void setUser(final UserModel user)
	{
		this.user = user;
	}
	
		
	public UserModel getUser() 
	{
		return user;
	}
		
		
	public void setRestrictionData(final Object restrictionData)
	{
		this.restrictionData = restrictionData;
	}
	
		
	public Object getRestrictionData() 
	{
		return restrictionData;
	}
		
	
}