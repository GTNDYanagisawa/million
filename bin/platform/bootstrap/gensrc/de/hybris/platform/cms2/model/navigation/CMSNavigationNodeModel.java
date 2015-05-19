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
package de.hybris.platform.cms2.model.navigation;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.cms2.model.contents.CMSItemModel;
import de.hybris.platform.cms2.model.contents.components.CMSLinkComponentModel;
import de.hybris.platform.cms2.model.navigation.CMSNavigationEntryModel;
import de.hybris.platform.cms2.model.navigation.CMSNavigationNodeModel;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.List;
import java.util.Locale;

/**
 * Generated model class for type CMSNavigationNode first defined at extension cms2.
 */
@SuppressWarnings("all")
public class CMSNavigationNodeModel extends CMSItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CMSNavigationNode";
	
	/**<i>Generated relation code constant for relation <code>CMSNavigationNodeChildren</code> defining source attribute <code>parent</code> in extension <code>cms2</code>.</i>*/
	public final static String _CMSNAVIGATIONNODECHILDREN = "CMSNavigationNodeChildren";
	
	/**<i>Generated relation code constant for relation <code>CMSLinksForNavNodes</code> defining source attribute <code>links</code> in extension <code>cms2</code>.</i>*/
	public final static String _CMSLINKSFORNAVNODES = "CMSLinksForNavNodes";
	
	/**<i>Generated relation code constant for relation <code>CMSContentPagesForNavNodes</code> defining source attribute <code>pages</code> in extension <code>cms2</code>.</i>*/
	public final static String _CMSCONTENTPAGESFORNAVNODES = "CMSContentPagesForNavNodes";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSNavigationNode.title</code> attribute defined at extension <code>cms2</code>. */
	public static final String TITLE = "title";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSNavigationNode.visible</code> attribute defined at extension <code>cms2</code>. */
	public static final String VISIBLE = "visible";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSNavigationNode.parent</code> attribute defined at extension <code>cms2</code>. */
	public static final String PARENT = "parent";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSNavigationNode.children</code> attribute defined at extension <code>cms2</code>. */
	public static final String CHILDREN = "children";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSNavigationNode.links</code> attribute defined at extension <code>cms2</code>. */
	public static final String LINKS = "links";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSNavigationNode.pages</code> attribute defined at extension <code>cms2</code>. */
	public static final String PAGES = "pages";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSNavigationNode.entries</code> attribute defined at extension <code>cms2</code>. */
	public static final String ENTRIES = "entries";
	
	
	/** <i>Generated variable</i> - Variable of <code>CMSNavigationNode.visible</code> attribute defined at extension <code>cms2</code>. */
	private Boolean _visible;
	
	/** <i>Generated variable</i> - Variable of <code>CMSNavigationNode.parent</code> attribute defined at extension <code>cms2</code>. */
	private CMSNavigationNodeModel _parent;
	
	/** <i>Generated variable</i> - Variable of <code>CMSNavigationNode.children</code> attribute defined at extension <code>cms2</code>. */
	private List<CMSNavigationNodeModel> _children;
	
	/** <i>Generated variable</i> - Variable of <code>CMSNavigationNode.links</code> attribute defined at extension <code>cms2</code>. */
	private List<CMSLinkComponentModel> _links;
	
	/** <i>Generated variable</i> - Variable of <code>CMSNavigationNode.pages</code> attribute defined at extension <code>cms2</code>. */
	private List<ContentPageModel> _pages;
	
	/** <i>Generated variable</i> - Variable of <code>CMSNavigationNode.entries</code> attribute defined at extension <code>cms2</code>. */
	private List<CMSNavigationEntryModel> _entries;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CMSNavigationNodeModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CMSNavigationNodeModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public CMSNavigationNodeModel(final CatalogVersionModel _catalogVersion, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public CMSNavigationNodeModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSNavigationNode.children</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the children
	 */
	public List<CMSNavigationNodeModel> getChildren()
	{
		if (this._children!=null)
		{
			return _children;
		}
		return _children = getPersistenceContext().getValue(CHILDREN, _children);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSNavigationNode.entries</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the entries
	 */
	public List<CMSNavigationEntryModel> getEntries()
	{
		if (this._entries!=null)
		{
			return _entries;
		}
		return _entries = getPersistenceContext().getValue(ENTRIES, _entries);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSNavigationNode.links</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the links
	 */
	@Deprecated
	public List<CMSLinkComponentModel> getLinks()
	{
		if (this._links!=null)
		{
			return _links;
		}
		return _links = getPersistenceContext().getValue(LINKS, _links);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSNavigationNode.pages</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the pages
	 */
	@Deprecated
	public List<ContentPageModel> getPages()
	{
		if (this._pages!=null)
		{
			return _pages;
		}
		return _pages = getPersistenceContext().getValue(PAGES, _pages);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSNavigationNode.parent</code> attribute defined at extension <code>cms2</code>. 
	 * @return the parent
	 */
	public CMSNavigationNodeModel getParent()
	{
		if (this._parent!=null)
		{
			return _parent;
		}
		return _parent = getPersistenceContext().getValue(PARENT, _parent);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSNavigationNode.title</code> attribute defined at extension <code>cms2</code>. 
	 * @return the title
	 */
	public String getTitle()
	{
		return getTitle(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSNavigationNode.title</code> attribute defined at extension <code>cms2</code>. 
	 * @param loc the value localization key 
	 * @return the title
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getTitle(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(TITLE, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSNavigationNode.visible</code> attribute defined at extension <code>cms2</code>. 
	 * @return the visible
	 */
	public boolean isVisible()
	{
		return toPrimitive( _visible = getPersistenceContext().getValue(VISIBLE, _visible));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSNavigationNode.children</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the children
	 */
	public void setChildren(final List<CMSNavigationNodeModel> value)
	{
		_children = getPersistenceContext().setValue(CHILDREN, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSNavigationNode.entries</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the entries
	 */
	public void setEntries(final List<CMSNavigationEntryModel> value)
	{
		_entries = getPersistenceContext().setValue(ENTRIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSNavigationNode.links</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the links
	 */
	@Deprecated
	public void setLinks(final List<CMSLinkComponentModel> value)
	{
		_links = getPersistenceContext().setValue(LINKS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSNavigationNode.pages</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the pages
	 */
	@Deprecated
	public void setPages(final List<ContentPageModel> value)
	{
		_pages = getPersistenceContext().setValue(PAGES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSNavigationNode.parent</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the parent
	 */
	public void setParent(final CMSNavigationNodeModel value)
	{
		_parent = getPersistenceContext().setValue(PARENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSNavigationNode.title</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the title
	 */
	public void setTitle(final String value)
	{
		setTitle(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>CMSNavigationNode.title</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the title
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setTitle(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(TITLE, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSNavigationNode.visible</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the visible
	 */
	public void setVisible(final boolean value)
	{
		_visible = getPersistenceContext().setValue(VISIBLE, toObject(value));
	}
	
}
