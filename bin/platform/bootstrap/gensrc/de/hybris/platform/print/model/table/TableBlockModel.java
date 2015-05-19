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
package de.hybris.platform.print.model.table;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.print.enums.TableWidthType;
import de.hybris.platform.print.model.ContentBlockModel;
import de.hybris.platform.print.model.TableStyleModel;
import de.hybris.platform.print.model.table.AbstractTableDataHolderModel;
import de.hybris.platform.print.model.table.CellEntryModel;
import de.hybris.platform.print.model.table.ColumnEntryModel;
import de.hybris.platform.print.model.table.RowEntryModel;
import de.hybris.platform.print.model.table.TableBlockModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.List;

/**
 * Generated model class for type TableBlock first defined at extension print.
 */
@SuppressWarnings("all")
public class TableBlockModel extends ContentBlockModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "TableBlock";
	
	/** <i>Generated constant</i> - Attribute key of <code>TableBlock.tableTemplate</code> attribute defined at extension <code>print</code>. */
	public static final String TABLETEMPLATE = "tableTemplate";
	
	/** <i>Generated constant</i> - Attribute key of <code>TableBlock.allTableTemplates</code> attribute defined at extension <code>print</code>. */
	public static final String ALLTABLETEMPLATES = "allTableTemplates";
	
	/** <i>Generated constant</i> - Attribute key of <code>TableBlock.isTemplate</code> attribute defined at extension <code>print</code>. */
	public static final String ISTEMPLATE = "isTemplate";
	
	/** <i>Generated constant</i> - Attribute key of <code>TableBlock.tableStyle</code> attribute defined at extension <code>print</code>. */
	public static final String TABLESTYLE = "tableStyle";
	
	/** <i>Generated constant</i> - Attribute key of <code>TableBlock.widthType</code> attribute defined at extension <code>print</code>. */
	public static final String WIDTHTYPE = "widthType";
	
	/** <i>Generated constant</i> - Attribute key of <code>TableBlock.width</code> attribute defined at extension <code>print</code>. */
	public static final String WIDTH = "width";
	
	/** <i>Generated constant</i> - Attribute key of <code>TableBlock.locked</code> attribute defined at extension <code>print</code>. */
	public static final String LOCKED = "locked";
	
	/** <i>Generated constant</i> - Attribute key of <code>TableBlock.headerRowCount</code> attribute defined at extension <code>print</code>. */
	public static final String HEADERROWCOUNT = "headerRowCount";
	
	/** <i>Generated constant</i> - Attribute key of <code>TableBlock.footerRowCount</code> attribute defined at extension <code>print</code>. */
	public static final String FOOTERROWCOUNT = "footerRowCount";
	
	/** <i>Generated constant</i> - Attribute key of <code>TableBlock.rows</code> attribute defined at extension <code>print</code>. */
	public static final String ROWS = "rows";
	
	/** <i>Generated constant</i> - Attribute key of <code>TableBlock.columns</code> attribute defined at extension <code>print</code>. */
	public static final String COLUMNS = "columns";
	
	/** <i>Generated constant</i> - Attribute key of <code>TableBlock.cells</code> attribute defined at extension <code>print</code>. */
	public static final String CELLS = "cells";
	
	/** <i>Generated constant</i> - Attribute key of <code>TableBlock.tableDataHolders</code> attribute defined at extension <code>print</code>. */
	public static final String TABLEDATAHOLDERS = "tableDataHolders";
	
	
	/** <i>Generated variable</i> - Variable of <code>TableBlock.tableTemplate</code> attribute defined at extension <code>print</code>. */
	private TableBlockModel _tableTemplate;
	
	/** <i>Generated variable</i> - Variable of <code>TableBlock.allTableTemplates</code> attribute defined at extension <code>print</code>. */
	private Collection<TableBlockModel> _allTableTemplates;
	
	/** <i>Generated variable</i> - Variable of <code>TableBlock.isTemplate</code> attribute defined at extension <code>print</code>. */
	private Boolean _isTemplate;
	
	/** <i>Generated variable</i> - Variable of <code>TableBlock.tableStyle</code> attribute defined at extension <code>print</code>. */
	private TableStyleModel _tableStyle;
	
	/** <i>Generated variable</i> - Variable of <code>TableBlock.widthType</code> attribute defined at extension <code>print</code>. */
	private TableWidthType _widthType;
	
	/** <i>Generated variable</i> - Variable of <code>TableBlock.width</code> attribute defined at extension <code>print</code>. */
	private Double _width;
	
	/** <i>Generated variable</i> - Variable of <code>TableBlock.locked</code> attribute defined at extension <code>print</code>. */
	private Boolean _locked;
	
	/** <i>Generated variable</i> - Variable of <code>TableBlock.headerRowCount</code> attribute defined at extension <code>print</code>. */
	private Integer _headerRowCount;
	
	/** <i>Generated variable</i> - Variable of <code>TableBlock.footerRowCount</code> attribute defined at extension <code>print</code>. */
	private Integer _footerRowCount;
	
	/** <i>Generated variable</i> - Variable of <code>TableBlock.rows</code> attribute defined at extension <code>print</code>. */
	private List<RowEntryModel> _rows;
	
	/** <i>Generated variable</i> - Variable of <code>TableBlock.columns</code> attribute defined at extension <code>print</code>. */
	private List<ColumnEntryModel> _columns;
	
	/** <i>Generated variable</i> - Variable of <code>TableBlock.cells</code> attribute defined at extension <code>print</code>. */
	private Collection<CellEntryModel> _cells;
	
	/** <i>Generated variable</i> - Variable of <code>TableBlock.tableDataHolders</code> attribute defined at extension <code>print</code>. */
	private Collection<AbstractTableDataHolderModel> _tableDataHolders;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public TableBlockModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public TableBlockModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>ContentBlock</code> at extension <code>print</code>
	 * @param _code initial attribute declared by type <code>ContentBlock</code> at extension <code>print</code>
	 */
	@Deprecated
	public TableBlockModel(final CatalogVersionModel _catalogVersion, final String _code)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>ContentBlock</code> at extension <code>print</code>
	 * @param _code initial attribute declared by type <code>ContentBlock</code> at extension <code>print</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public TableBlockModel(final CatalogVersionModel _catalogVersion, final String _code, final ItemModel _owner)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TableBlock.allTableTemplates</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the allTableTemplates
	 */
	public Collection<TableBlockModel> getAllTableTemplates()
	{
		if (this._allTableTemplates!=null)
		{
			return _allTableTemplates;
		}
		return _allTableTemplates = getPersistenceContext().getValue(ALLTABLETEMPLATES, _allTableTemplates);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TableBlock.cells</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the cells
	 */
	public Collection<CellEntryModel> getCells()
	{
		if (this._cells!=null)
		{
			return _cells;
		}
		return _cells = getPersistenceContext().getValue(CELLS, _cells);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TableBlock.columns</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the columns
	 */
	public List<ColumnEntryModel> getColumns()
	{
		if (this._columns!=null)
		{
			return _columns;
		}
		return _columns = getPersistenceContext().getValue(COLUMNS, _columns);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TableBlock.footerRowCount</code> attribute defined at extension <code>print</code>. 
	 * @return the footerRowCount
	 */
	public Integer getFooterRowCount()
	{
		if (this._footerRowCount!=null)
		{
			return _footerRowCount;
		}
		return _footerRowCount = getPersistenceContext().getValue(FOOTERROWCOUNT, _footerRowCount);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TableBlock.headerRowCount</code> attribute defined at extension <code>print</code>. 
	 * @return the headerRowCount
	 */
	public Integer getHeaderRowCount()
	{
		if (this._headerRowCount!=null)
		{
			return _headerRowCount;
		}
		return _headerRowCount = getPersistenceContext().getValue(HEADERROWCOUNT, _headerRowCount);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TableBlock.isTemplate</code> attribute defined at extension <code>print</code>. 
	 * @return the isTemplate
	 */
	public Boolean getIsTemplate()
	{
		if (this._isTemplate!=null)
		{
			return _isTemplate;
		}
		return _isTemplate = getPersistenceContext().getValue(ISTEMPLATE, _isTemplate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TableBlock.locked</code> attribute defined at extension <code>print</code>. 
	 * @return the locked
	 */
	public Boolean getLocked()
	{
		if (this._locked!=null)
		{
			return _locked;
		}
		return _locked = getPersistenceContext().getValue(LOCKED, _locked);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TableBlock.rows</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the rows
	 */
	public List<RowEntryModel> getRows()
	{
		if (this._rows!=null)
		{
			return _rows;
		}
		return _rows = getPersistenceContext().getValue(ROWS, _rows);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TableBlock.tableDataHolders</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the tableDataHolders
	 */
	public Collection<AbstractTableDataHolderModel> getTableDataHolders()
	{
		if (this._tableDataHolders!=null)
		{
			return _tableDataHolders;
		}
		return _tableDataHolders = getPersistenceContext().getValue(TABLEDATAHOLDERS, _tableDataHolders);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TableBlock.tableStyle</code> attribute defined at extension <code>print</code>. 
	 * @return the tableStyle
	 */
	public TableStyleModel getTableStyle()
	{
		if (this._tableStyle!=null)
		{
			return _tableStyle;
		}
		return _tableStyle = getPersistenceContext().getValue(TABLESTYLE, _tableStyle);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TableBlock.tableTemplate</code> attribute defined at extension <code>print</code>. 
	 * @return the tableTemplate
	 */
	public TableBlockModel getTableTemplate()
	{
		if (this._tableTemplate!=null)
		{
			return _tableTemplate;
		}
		return _tableTemplate = getPersistenceContext().getValue(TABLETEMPLATE, _tableTemplate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TableBlock.width</code> attribute defined at extension <code>print</code>. 
	 * @return the width
	 */
	public Double getWidth()
	{
		if (this._width!=null)
		{
			return _width;
		}
		return _width = getPersistenceContext().getValue(WIDTH, _width);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TableBlock.widthType</code> attribute defined at extension <code>print</code>. 
	 * @return the widthType
	 */
	public TableWidthType getWidthType()
	{
		if (this._widthType!=null)
		{
			return _widthType;
		}
		return _widthType = getPersistenceContext().getValue(WIDTHTYPE, _widthType);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TableBlock.cells</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the cells
	 */
	public void setCells(final Collection<CellEntryModel> value)
	{
		_cells = getPersistenceContext().setValue(CELLS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TableBlock.columns</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the columns
	 */
	public void setColumns(final List<ColumnEntryModel> value)
	{
		_columns = getPersistenceContext().setValue(COLUMNS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TableBlock.footerRowCount</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the footerRowCount
	 */
	public void setFooterRowCount(final Integer value)
	{
		_footerRowCount = getPersistenceContext().setValue(FOOTERROWCOUNT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TableBlock.headerRowCount</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the headerRowCount
	 */
	public void setHeaderRowCount(final Integer value)
	{
		_headerRowCount = getPersistenceContext().setValue(HEADERROWCOUNT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TableBlock.isTemplate</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the isTemplate
	 */
	public void setIsTemplate(final Boolean value)
	{
		_isTemplate = getPersistenceContext().setValue(ISTEMPLATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TableBlock.locked</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the locked
	 */
	public void setLocked(final Boolean value)
	{
		_locked = getPersistenceContext().setValue(LOCKED, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TableBlock.rows</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the rows
	 */
	public void setRows(final List<RowEntryModel> value)
	{
		_rows = getPersistenceContext().setValue(ROWS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TableBlock.tableDataHolders</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the tableDataHolders
	 */
	public void setTableDataHolders(final Collection<AbstractTableDataHolderModel> value)
	{
		_tableDataHolders = getPersistenceContext().setValue(TABLEDATAHOLDERS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TableBlock.tableStyle</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the tableStyle
	 */
	public void setTableStyle(final TableStyleModel value)
	{
		_tableStyle = getPersistenceContext().setValue(TABLESTYLE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TableBlock.tableTemplate</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the tableTemplate
	 */
	public void setTableTemplate(final TableBlockModel value)
	{
		_tableTemplate = getPersistenceContext().setValue(TABLETEMPLATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TableBlock.width</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the width
	 */
	public void setWidth(final Double value)
	{
		_width = getPersistenceContext().setValue(WIDTH, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TableBlock.widthType</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the widthType
	 */
	public void setWidthType(final TableWidthType value)
	{
		_widthType = getPersistenceContext().setValue(WIDTHTYPE, value);
	}
	
}
