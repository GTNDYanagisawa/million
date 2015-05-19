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

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.print.enums.PlacementStatus;
import de.hybris.platform.print.model.LayoutTemplateModel;
import de.hybris.platform.print.model.PageModel;
import de.hybris.platform.print.model.PlaceholderTemplateModel;
import de.hybris.platform.print.model.PublicationComponentModel;
import de.hybris.platform.print.model.PublicationModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Locale;

/**
 * Generated model class for type Placement first defined at extension print.
 */
@SuppressWarnings("all")
public class PlacementModel extends PublicationComponentModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "Placement";
	
	/**<i>Generated relation code constant for relation <code>Page2PlacementRelation</code> defining source attribute <code>page</code> in extension <code>print</code>.</i>*/
	public final static String _PAGE2PLACEMENTRELATION = "Page2PlacementRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placement.placeholderTemplate</code> attribute defined at extension <code>print</code>. */
	public static final String PLACEHOLDERTEMPLATE = "placeholderTemplate";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placement.allUsablePlaceholderTemplates</code> attribute defined at extension <code>print</code>. */
	public static final String ALLUSABLEPLACEHOLDERTEMPLATES = "allUsablePlaceholderTemplates";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placement.layoutTemplate</code> attribute defined at extension <code>print</code>. */
	public static final String LAYOUTTEMPLATE = "layoutTemplate";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placement.allUsableLayoutTemplates</code> attribute defined at extension <code>print</code>. */
	public static final String ALLUSABLELAYOUTTEMPLATES = "allUsableLayoutTemplates";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placement.forcePageBreak</code> attribute defined at extension <code>print</code>. */
	public static final String FORCEPAGEBREAK = "forcePageBreak";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placement.placeholderValues</code> attribute defined at extension <code>print</code>. */
	public static final String PLACEHOLDERVALUES = "placeholderValues";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placement.preview</code> attribute defined at extension <code>print</code>. */
	public static final String PREVIEW = "preview";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placement.position</code> attribute defined at extension <code>print</code>. */
	public static final String POSITION = "position";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placement.displayName</code> attribute defined at extension <code>print</code>. */
	public static final String DISPLAYNAME = "displayName";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placement.instructionComment</code> attribute defined at extension <code>print</code>. */
	public static final String INSTRUCTIONCOMMENT = "instructionComment";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placement.plannedRevenue</code> attribute defined at extension <code>print</code>. */
	public static final String PLANNEDREVENUE = "plannedRevenue";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placement.reachedRevenue</code> attribute defined at extension <code>print</code>. */
	public static final String REACHEDREVENUE = "reachedRevenue";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placement.areaUsed</code> attribute defined at extension <code>print</code>. */
	public static final String AREAUSED = "areaUsed";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placement.stock</code> attribute defined at extension <code>print</code>. */
	public static final String STOCK = "stock";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placement.status</code> attribute defined at extension <code>print</code>. */
	public static final String STATUS = "status";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placement.gridElementId</code> attribute defined at extension <code>print</code>. */
	public static final String GRIDELEMENTID = "gridElementId";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placement.pageNumber</code> attribute defined at extension <code>print</code>. */
	public static final String PAGENUMBER = "pageNumber";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placement.positionInPreviewPage</code> attribute defined at extension <code>print</code>. */
	public static final String POSITIONINPREVIEWPAGE = "positionInPreviewPage";
	
	/** <i>Generated constant</i> - Attribute key of <code>Placement.page</code> attribute defined at extension <code>print</code>. */
	public static final String PAGE = "page";
	
	
	/** <i>Generated variable</i> - Variable of <code>Placement.placeholderTemplate</code> attribute defined at extension <code>print</code>. */
	private PlaceholderTemplateModel _placeholderTemplate;
	
	/** <i>Generated variable</i> - Variable of <code>Placement.allUsablePlaceholderTemplates</code> attribute defined at extension <code>print</code>. */
	private Collection<PlaceholderTemplateModel> _allUsablePlaceholderTemplates;
	
	/** <i>Generated variable</i> - Variable of <code>Placement.layoutTemplate</code> attribute defined at extension <code>print</code>. */
	private LayoutTemplateModel _layoutTemplate;
	
	/** <i>Generated variable</i> - Variable of <code>Placement.allUsableLayoutTemplates</code> attribute defined at extension <code>print</code>. */
	private Collection<LayoutTemplateModel> _allUsableLayoutTemplates;
	
	/** <i>Generated variable</i> - Variable of <code>Placement.forcePageBreak</code> attribute defined at extension <code>print</code>. */
	private Boolean _forcePageBreak;
	
	/** <i>Generated variable</i> - Variable of <code>Placement.placeholderValues</code> attribute defined at extension <code>print</code>. */
	private String _placeholderValues;
	
	/** <i>Generated variable</i> - Variable of <code>Placement.preview</code> attribute defined at extension <code>print</code>. */
	private String _preview;
	
	/** <i>Generated variable</i> - Variable of <code>Placement.position</code> attribute defined at extension <code>print</code>. */
	private Integer _position;
	
	/** <i>Generated variable</i> - Variable of <code>Placement.instructionComment</code> attribute defined at extension <code>print</code>. */
	private String _instructionComment;
	
	/** <i>Generated variable</i> - Variable of <code>Placement.plannedRevenue</code> attribute defined at extension <code>print</code>. */
	private Double _plannedRevenue;
	
	/** <i>Generated variable</i> - Variable of <code>Placement.reachedRevenue</code> attribute defined at extension <code>print</code>. */
	private Double _reachedRevenue;
	
	/** <i>Generated variable</i> - Variable of <code>Placement.areaUsed</code> attribute defined at extension <code>print</code>. */
	private Double _areaUsed;
	
	/** <i>Generated variable</i> - Variable of <code>Placement.stock</code> attribute defined at extension <code>print</code>. */
	private Integer _stock;
	
	/** <i>Generated variable</i> - Variable of <code>Placement.status</code> attribute defined at extension <code>print</code>. */
	private PlacementStatus _status;
	
	/** <i>Generated variable</i> - Variable of <code>Placement.gridElementId</code> attribute defined at extension <code>print</code>. */
	private Integer _gridElementId;
	
	/** <i>Generated variable</i> - Variable of <code>Placement.pageNumber</code> attribute defined at extension <code>print</code>. */
	private Integer _pageNumber;
	
	/** <i>Generated variable</i> - Variable of <code>Placement.positionInPreviewPage</code> attribute defined at extension <code>print</code>. */
	private Integer _positionInPreviewPage;
	
	/** <i>Generated variable</i> - Variable of <code>Placement.page</code> attribute defined at extension <code>print</code>. */
	private PageModel _page;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PlacementModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PlacementModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _publication initial attribute declared by type <code>PublicationComponent</code> at extension <code>print</code>
	 */
	@Deprecated
	public PlacementModel(final PublicationModel _publication)
	{
		super();
		setPublication(_publication);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _publication initial attribute declared by type <code>PublicationComponent</code> at extension <code>print</code>
	 */
	@Deprecated
	public PlacementModel(final ItemModel _owner, final PublicationModel _publication)
	{
		super();
		setOwner(_owner);
		setPublication(_publication);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placement.allUsableLayoutTemplates</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the allUsableLayoutTemplates
	 */
	public Collection<LayoutTemplateModel> getAllUsableLayoutTemplates()
	{
		if (this._allUsableLayoutTemplates!=null)
		{
			return _allUsableLayoutTemplates;
		}
		return _allUsableLayoutTemplates = getPersistenceContext().getValue(ALLUSABLELAYOUTTEMPLATES, _allUsableLayoutTemplates);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placement.allUsablePlaceholderTemplates</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the allUsablePlaceholderTemplates
	 */
	public Collection<PlaceholderTemplateModel> getAllUsablePlaceholderTemplates()
	{
		if (this._allUsablePlaceholderTemplates!=null)
		{
			return _allUsablePlaceholderTemplates;
		}
		return _allUsablePlaceholderTemplates = getPersistenceContext().getValue(ALLUSABLEPLACEHOLDERTEMPLATES, _allUsablePlaceholderTemplates);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placement.areaUsed</code> attribute defined at extension <code>print</code>. 
	 * @return the areaUsed
	 */
	public Double getAreaUsed()
	{
		if (this._areaUsed!=null)
		{
			return _areaUsed;
		}
		return _areaUsed = getPersistenceContext().getValue(AREAUSED, _areaUsed);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placement.displayName</code> attribute defined at extension <code>print</code>. 
	 * @return the displayName
	 */
	public String getDisplayName()
	{
		return getDisplayName(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>Placement.displayName</code> attribute defined at extension <code>print</code>. 
	 * @param loc the value localization key 
	 * @return the displayName
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getDisplayName(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(DISPLAYNAME, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placement.forcePageBreak</code> attribute defined at extension <code>print</code>. 
	 * @return the forcePageBreak
	 */
	public Boolean getForcePageBreak()
	{
		if (this._forcePageBreak!=null)
		{
			return _forcePageBreak;
		}
		return _forcePageBreak = getPersistenceContext().getValue(FORCEPAGEBREAK, _forcePageBreak);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placement.gridElementId</code> attribute defined at extension <code>print</code>. 
	 * @return the gridElementId - Stores information at which (preview) page grid element the placement is placed
	 */
	public Integer getGridElementId()
	{
		if (this._gridElementId!=null)
		{
			return _gridElementId;
		}
		return _gridElementId = getPersistenceContext().getValue(GRIDELEMENTID, _gridElementId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placement.instructionComment</code> attribute defined at extension <code>print</code>. 
	 * @return the instructionComment
	 */
	public String getInstructionComment()
	{
		if (this._instructionComment!=null)
		{
			return _instructionComment;
		}
		return _instructionComment = getPersistenceContext().getValue(INSTRUCTIONCOMMENT, _instructionComment);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placement.layoutTemplate</code> attribute defined at extension <code>print</code>. 
	 * @return the layoutTemplate
	 */
	public LayoutTemplateModel getLayoutTemplate()
	{
		if (this._layoutTemplate!=null)
		{
			return _layoutTemplate;
		}
		return _layoutTemplate = getPersistenceContext().getValue(LAYOUTTEMPLATE, _layoutTemplate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placement.page</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Placement.pageNumber</code> attribute defined at extension <code>print</code>. 
	 * @return the pageNumber - Stores information at which (preview) page the placement is placed
	 */
	public Integer getPageNumber()
	{
		if (this._pageNumber!=null)
		{
			return _pageNumber;
		}
		return _pageNumber = getPersistenceContext().getValue(PAGENUMBER, _pageNumber);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placement.placeholderTemplate</code> attribute defined at extension <code>print</code>. 
	 * @return the placeholderTemplate
	 */
	public PlaceholderTemplateModel getPlaceholderTemplate()
	{
		if (this._placeholderTemplate!=null)
		{
			return _placeholderTemplate;
		}
		return _placeholderTemplate = getPersistenceContext().getValue(PLACEHOLDERTEMPLATE, _placeholderTemplate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placement.placeholderValues</code> attribute defined at extension <code>print</code>. 
	 * @return the placeholderValues
	 */
	public String getPlaceholderValues()
	{
		if (this._placeholderValues!=null)
		{
			return _placeholderValues;
		}
		return _placeholderValues = getPersistenceContext().getValue(PLACEHOLDERVALUES, _placeholderValues);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placement.plannedRevenue</code> attribute defined at extension <code>print</code>. 
	 * @return the plannedRevenue
	 */
	public Double getPlannedRevenue()
	{
		if (this._plannedRevenue!=null)
		{
			return _plannedRevenue;
		}
		return _plannedRevenue = getPersistenceContext().getValue(PLANNEDREVENUE, _plannedRevenue);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placement.position</code> attribute defined at extension <code>print</code>. 
	 * @return the position
	 */
	public Integer getPosition()
	{
		if (this._position!=null)
		{
			return _position;
		}
		return _position = getPersistenceContext().getValue(POSITION, _position);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placement.positionInPreviewPage</code> attribute defined at extension <code>print</code>. 
	 * @return the positionInPreviewPage - Position in current preview page. As fallback position in item page is returned.
	 */
	public int getPositionInPreviewPage()
	{
		return toPrimitive( _positionInPreviewPage = getPersistenceContext().getValue(POSITIONINPREVIEWPAGE, _positionInPreviewPage));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placement.preview</code> attribute defined at extension <code>print</code>. 
	 * @return the preview
	 */
	public String getPreview()
	{
		if (this._preview!=null)
		{
			return _preview;
		}
		return _preview = getPersistenceContext().getValue(PREVIEW, _preview);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placement.reachedRevenue</code> attribute defined at extension <code>print</code>. 
	 * @return the reachedRevenue
	 */
	public Double getReachedRevenue()
	{
		if (this._reachedRevenue!=null)
		{
			return _reachedRevenue;
		}
		return _reachedRevenue = getPersistenceContext().getValue(REACHEDREVENUE, _reachedRevenue);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placement.status</code> attribute defined at extension <code>print</code>. 
	 * @return the status
	 */
	public PlacementStatus getStatus()
	{
		if (this._status!=null)
		{
			return _status;
		}
		return _status = getPersistenceContext().getValue(STATUS, _status);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placement.stock</code> attribute defined at extension <code>print</code>. 
	 * @return the stock
	 */
	public Integer getStock()
	{
		if (this._stock!=null)
		{
			return _stock;
		}
		return _stock = getPersistenceContext().getValue(STOCK, _stock);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Placement.areaUsed</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the areaUsed
	 */
	public void setAreaUsed(final Double value)
	{
		_areaUsed = getPersistenceContext().setValue(AREAUSED, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Placement.forcePageBreak</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the forcePageBreak
	 */
	public void setForcePageBreak(final Boolean value)
	{
		_forcePageBreak = getPersistenceContext().setValue(FORCEPAGEBREAK, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Placement.gridElementId</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the gridElementId - Stores information at which (preview) page grid element the placement is placed
	 */
	public void setGridElementId(final Integer value)
	{
		_gridElementId = getPersistenceContext().setValue(GRIDELEMENTID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Placement.instructionComment</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the instructionComment
	 */
	public void setInstructionComment(final String value)
	{
		_instructionComment = getPersistenceContext().setValue(INSTRUCTIONCOMMENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Placement.layoutTemplate</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the layoutTemplate
	 */
	public void setLayoutTemplate(final LayoutTemplateModel value)
	{
		_layoutTemplate = getPersistenceContext().setValue(LAYOUTTEMPLATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Placement.page</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the page
	 */
	public void setPage(final PageModel value)
	{
		_page = getPersistenceContext().setValue(PAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Placement.pageNumber</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the pageNumber - Stores information at which (preview) page the placement is placed
	 */
	public void setPageNumber(final Integer value)
	{
		_pageNumber = getPersistenceContext().setValue(PAGENUMBER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Placement.placeholderTemplate</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the placeholderTemplate
	 */
	public void setPlaceholderTemplate(final PlaceholderTemplateModel value)
	{
		_placeholderTemplate = getPersistenceContext().setValue(PLACEHOLDERTEMPLATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Placement.plannedRevenue</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the plannedRevenue
	 */
	public void setPlannedRevenue(final Double value)
	{
		_plannedRevenue = getPersistenceContext().setValue(PLANNEDREVENUE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Placement.reachedRevenue</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the reachedRevenue
	 */
	public void setReachedRevenue(final Double value)
	{
		_reachedRevenue = getPersistenceContext().setValue(REACHEDREVENUE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Placement.status</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the status
	 */
	public void setStatus(final PlacementStatus value)
	{
		_status = getPersistenceContext().setValue(STATUS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Placement.stock</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the stock
	 */
	public void setStock(final Integer value)
	{
		_stock = getPersistenceContext().setValue(STOCK, value);
	}
	
}
