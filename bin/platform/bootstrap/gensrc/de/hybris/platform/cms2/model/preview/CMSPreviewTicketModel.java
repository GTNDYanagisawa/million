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
package de.hybris.platform.cms2.model.preview;

import de.hybris.platform.cms2.model.preview.PreviewDataModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type CMSPreviewTicket first defined at extension cms2.
 */
@SuppressWarnings("all")
public class CMSPreviewTicketModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CMSPreviewTicket";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSPreviewTicket.id</code> attribute defined at extension <code>cms2</code>. */
	public static final String ID = "id";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSPreviewTicket.previewData</code> attribute defined at extension <code>cms2</code>. */
	public static final String PREVIEWDATA = "previewData";
	
	
	/** <i>Generated variable</i> - Variable of <code>CMSPreviewTicket.id</code> attribute defined at extension <code>cms2</code>. */
	private String _id;
	
	/** <i>Generated variable</i> - Variable of <code>CMSPreviewTicket.previewData</code> attribute defined at extension <code>cms2</code>. */
	private PreviewDataModel _previewData;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CMSPreviewTicketModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CMSPreviewTicketModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _id initial attribute declared by type <code>CMSPreviewTicket</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public CMSPreviewTicketModel(final String _id)
	{
		super();
		setId(_id);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _id initial attribute declared by type <code>CMSPreviewTicket</code> at extension <code>cms2</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public CMSPreviewTicketModel(final String _id, final ItemModel _owner)
	{
		super();
		setId(_id);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSPreviewTicket.id</code> attribute defined at extension <code>cms2</code>. 
	 * @return the id
	 */
	public String getId()
	{
		if (this._id!=null)
		{
			return _id;
		}
		return _id = getPersistenceContext().getValue(ID, _id);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSPreviewTicket.previewData</code> attribute defined at extension <code>cms2</code>. 
	 * @return the previewData
	 */
	public PreviewDataModel getPreviewData()
	{
		if (this._previewData!=null)
		{
			return _previewData;
		}
		return _previewData = getPersistenceContext().getValue(PREVIEWDATA, _previewData);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSPreviewTicket.id</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the id
	 */
	public void setId(final String value)
	{
		_id = getPersistenceContext().setValue(ID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSPreviewTicket.previewData</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the previewData
	 */
	public void setPreviewData(final PreviewDataModel value)
	{
		_previewData = getPersistenceContext().setValue(PREVIEWDATA, value);
	}
	
}
