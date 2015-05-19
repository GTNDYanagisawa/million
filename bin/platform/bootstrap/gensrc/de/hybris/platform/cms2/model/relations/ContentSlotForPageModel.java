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
package de.hybris.platform.cms2.model.relations;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.cms2.model.contents.contentslot.ContentSlotModel;
import de.hybris.platform.cms2.model.pages.AbstractPageModel;
import de.hybris.platform.cms2.model.relations.CMSRelationModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type ContentSlotForPage first defined at extension cms2.
 */
@SuppressWarnings("all")
public class ContentSlotForPageModel extends CMSRelationModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ContentSlotForPage";
	
	/** <i>Generated constant</i> - Attribute key of <code>ContentSlotForPage.position</code> attribute defined at extension <code>cms2</code>. */
	public static final String POSITION = "position";
	
	/** <i>Generated constant</i> - Attribute key of <code>ContentSlotForPage.page</code> attribute defined at extension <code>cms2</code>. */
	public static final String PAGE = "page";
	
	/** <i>Generated constant</i> - Attribute key of <code>ContentSlotForPage.contentSlot</code> attribute defined at extension <code>cms2</code>. */
	public static final String CONTENTSLOT = "contentSlot";
	
	
	/** <i>Generated variable</i> - Variable of <code>ContentSlotForPage.position</code> attribute defined at extension <code>cms2</code>. */
	private String _position;
	
	/** <i>Generated variable</i> - Variable of <code>ContentSlotForPage.page</code> attribute defined at extension <code>cms2</code>. */
	private AbstractPageModel _page;
	
	/** <i>Generated variable</i> - Variable of <code>ContentSlotForPage.contentSlot</code> attribute defined at extension <code>cms2</code>. */
	private ContentSlotModel _contentSlot;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ContentSlotForPageModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ContentSlotForPageModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSRelation</code> at extension <code>cms2</code>
	 * @param _contentSlot initial attribute declared by type <code>ContentSlotForPage</code> at extension <code>cms2</code>
	 * @param _page initial attribute declared by type <code>ContentSlotForPage</code> at extension <code>cms2</code>
	 * @param _position initial attribute declared by type <code>ContentSlotForPage</code> at extension <code>cms2</code>
	 * @param _uid initial attribute declared by type <code>CMSRelation</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public ContentSlotForPageModel(final CatalogVersionModel _catalogVersion, final ContentSlotModel _contentSlot, final AbstractPageModel _page, final String _position, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setContentSlot(_contentSlot);
		setPage(_page);
		setPosition(_position);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSRelation</code> at extension <code>cms2</code>
	 * @param _contentSlot initial attribute declared by type <code>ContentSlotForPage</code> at extension <code>cms2</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _page initial attribute declared by type <code>ContentSlotForPage</code> at extension <code>cms2</code>
	 * @param _position initial attribute declared by type <code>ContentSlotForPage</code> at extension <code>cms2</code>
	 * @param _uid initial attribute declared by type <code>CMSRelation</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public ContentSlotForPageModel(final CatalogVersionModel _catalogVersion, final ContentSlotModel _contentSlot, final ItemModel _owner, final AbstractPageModel _page, final String _position, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setContentSlot(_contentSlot);
		setOwner(_owner);
		setPage(_page);
		setPosition(_position);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentSlotForPage.contentSlot</code> attribute defined at extension <code>cms2</code>. 
	 * @return the contentSlot
	 */
	public ContentSlotModel getContentSlot()
	{
		if (this._contentSlot!=null)
		{
			return _contentSlot;
		}
		return _contentSlot = getPersistenceContext().getValue(CONTENTSLOT, _contentSlot);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentSlotForPage.page</code> attribute defined at extension <code>cms2</code>. 
	 * @return the page
	 */
	public AbstractPageModel getPage()
	{
		if (this._page!=null)
		{
			return _page;
		}
		return _page = getPersistenceContext().getValue(PAGE, _page);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentSlotForPage.position</code> attribute defined at extension <code>cms2</code>. 
	 * @return the position
	 */
	public String getPosition()
	{
		if (this._position!=null)
		{
			return _position;
		}
		return _position = getPersistenceContext().getValue(POSITION, _position);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ContentSlotForPage.contentSlot</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the contentSlot
	 */
	public void setContentSlot(final ContentSlotModel value)
	{
		_contentSlot = getPersistenceContext().setValue(CONTENTSLOT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ContentSlotForPage.page</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the page
	 */
	public void setPage(final AbstractPageModel value)
	{
		_page = getPersistenceContext().setValue(PAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ContentSlotForPage.position</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the position
	 */
	public void setPosition(final String value)
	{
		_position = getPersistenceContext().setValue(POSITION, value);
	}
	
}
