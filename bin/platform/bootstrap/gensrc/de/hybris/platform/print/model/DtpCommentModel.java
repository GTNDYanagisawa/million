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
package de.hybris.platform.print.model;

import de.hybris.platform.catalog.model.CatalogUnawareMediaModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.print.model.PageModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type DtpComment first defined at extension print.
 */
@SuppressWarnings("all")
public class DtpCommentModel extends CatalogUnawareMediaModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "DtpComment";
	
	/**<i>Generated relation code constant for relation <code>Page2DtpCommentRelation</code> defining source attribute <code>page</code> in extension <code>print</code>.</i>*/
	public final static String _PAGE2DTPCOMMENTRELATION = "Page2DtpCommentRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>DtpComment.page</code> attribute defined at extension <code>print</code>. */
	public static final String PAGE = "page";
	
	
	/** <i>Generated variable</i> - Variable of <code>DtpComment.page</code> attribute defined at extension <code>print</code>. */
	private PageModel _page;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public DtpCommentModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public DtpCommentModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CatalogUnawareMedia</code> at extension <code>catalog</code>
	 * @param _code initial attribute declared by type <code>Media</code> at extension <code>core</code>
	 * @param _page initial attribute declared by type <code>DtpComment</code> at extension <code>print</code>
	 */
	@Deprecated
	public DtpCommentModel(final CatalogVersionModel _catalogVersion, final String _code, final PageModel _page)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCode(_code);
		setPage(_page);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CatalogUnawareMedia</code> at extension <code>catalog</code>
	 * @param _code initial attribute declared by type <code>Media</code> at extension <code>core</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _page initial attribute declared by type <code>DtpComment</code> at extension <code>print</code>
	 */
	@Deprecated
	public DtpCommentModel(final CatalogVersionModel _catalogVersion, final String _code, final ItemModel _owner, final PageModel _page)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCode(_code);
		setOwner(_owner);
		setPage(_page);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DtpComment.page</code> attribute defined at extension <code>print</code>. 
	 * @return the page
	 */
	public PageModel getPage()
	{
		if (this._page!=null)
		{
			return _page;
		}
		return _page = getPersistenceContext().getValue(PAGE, _page);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>DtpComment.page</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the page
	 */
	public void setPage(final PageModel value)
	{
		_page = getPersistenceContext().setValue(PAGE, value);
	}
	
}
