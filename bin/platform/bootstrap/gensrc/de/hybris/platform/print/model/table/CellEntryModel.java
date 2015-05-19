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
import de.hybris.platform.print.model.CellStyleModel;
import de.hybris.platform.print.model.table.ColumnEntryModel;
import de.hybris.platform.print.model.table.RowEntryModel;
import de.hybris.platform.print.model.table.TableBlockModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Locale;

/**
 * Generated model class for type CellEntry first defined at extension print.
 */
@SuppressWarnings("all")
public class CellEntryModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CellEntry";
	
	/**<i>Generated relation code constant for relation <code>Table2CellEntryRelation</code> defining source attribute <code>table</code> in extension <code>print</code>.</i>*/
	public final static String _TABLE2CELLENTRYRELATION = "Table2CellEntryRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>CellEntry.id</code> attribute defined at extension <code>print</code>. */
	public static final String ID = "id";
	
	/** <i>Generated constant</i> - Attribute key of <code>CellEntry.catalogVersion</code> attribute defined at extension <code>print</code>. */
	public static final String CATALOGVERSION = "catalogVersion";
	
	/** <i>Generated constant</i> - Attribute key of <code>CellEntry.row</code> attribute defined at extension <code>print</code>. */
	public static final String ROW = "row";
	
	/** <i>Generated constant</i> - Attribute key of <code>CellEntry.column</code> attribute defined at extension <code>print</code>. */
	public static final String COLUMN = "column";
	
	/** <i>Generated constant</i> - Attribute key of <code>CellEntry.cellText</code> attribute defined at extension <code>print</code>. */
	public static final String CELLTEXT = "cellText";
	
	/** <i>Generated constant</i> - Attribute key of <code>CellEntry.postProcessingExpression</code> attribute defined at extension <code>print</code>. */
	public static final String POSTPROCESSINGEXPRESSION = "postProcessingExpression";
	
	/** <i>Generated constant</i> - Attribute key of <code>CellEntry.preProcessingExpression</code> attribute defined at extension <code>print</code>. */
	public static final String PREPROCESSINGEXPRESSION = "preProcessingExpression";
	
	/** <i>Generated constant</i> - Attribute key of <code>CellEntry.cellStyle</code> attribute defined at extension <code>print</code>. */
	public static final String CELLSTYLE = "cellStyle";
	
	/** <i>Generated constant</i> - Attribute key of <code>CellEntry.cellStyleExpression</code> attribute defined at extension <code>print</code>. */
	public static final String CELLSTYLEEXPRESSION = "cellStyleExpression";
	
	/** <i>Generated constant</i> - Attribute key of <code>CellEntry.extendedCellStyleExpression</code> attribute defined at extension <code>print</code>. */
	public static final String EXTENDEDCELLSTYLEEXPRESSION = "extendedCellStyleExpression";
	
	/** <i>Generated constant</i> - Attribute key of <code>CellEntry.mergeHorizontal</code> attribute defined at extension <code>print</code>. */
	public static final String MERGEHORIZONTAL = "mergeHorizontal";
	
	/** <i>Generated constant</i> - Attribute key of <code>CellEntry.mergeVertical</code> attribute defined at extension <code>print</code>. */
	public static final String MERGEVERTICAL = "mergeVertical";
	
	/** <i>Generated constant</i> - Attribute key of <code>CellEntry.colSpan</code> attribute defined at extension <code>print</code>. */
	public static final String COLSPAN = "colSpan";
	
	/** <i>Generated constant</i> - Attribute key of <code>CellEntry.rowSpan</code> attribute defined at extension <code>print</code>. */
	public static final String ROWSPAN = "rowSpan";
	
	/** <i>Generated constant</i> - Attribute key of <code>CellEntry.convert</code> attribute defined at extension <code>print</code>. */
	public static final String CONVERT = "convert";
	
	/** <i>Generated constant</i> - Attribute key of <code>CellEntry.locked</code> attribute defined at extension <code>print</code>. */
	public static final String LOCKED = "locked";
	
	/** <i>Generated constant</i> - Attribute key of <code>CellEntry.table</code> attribute defined at extension <code>print</code>. */
	public static final String TABLE = "table";
	
	
	/** <i>Generated variable</i> - Variable of <code>CellEntry.id</code> attribute defined at extension <code>print</code>. */
	private String _id;
	
	/** <i>Generated variable</i> - Variable of <code>CellEntry.catalogVersion</code> attribute defined at extension <code>print</code>. */
	private CatalogVersionModel _catalogVersion;
	
	/** <i>Generated variable</i> - Variable of <code>CellEntry.row</code> attribute defined at extension <code>print</code>. */
	private RowEntryModel _row;
	
	/** <i>Generated variable</i> - Variable of <code>CellEntry.column</code> attribute defined at extension <code>print</code>. */
	private ColumnEntryModel _column;
	
	/** <i>Generated variable</i> - Variable of <code>CellEntry.postProcessingExpression</code> attribute defined at extension <code>print</code>. */
	private String _postProcessingExpression;
	
	/** <i>Generated variable</i> - Variable of <code>CellEntry.preProcessingExpression</code> attribute defined at extension <code>print</code>. */
	private String _preProcessingExpression;
	
	/** <i>Generated variable</i> - Variable of <code>CellEntry.cellStyle</code> attribute defined at extension <code>print</code>. */
	private CellStyleModel _cellStyle;
	
	/** <i>Generated variable</i> - Variable of <code>CellEntry.cellStyleExpression</code> attribute defined at extension <code>print</code>. */
	private String _cellStyleExpression;
	
	/** <i>Generated variable</i> - Variable of <code>CellEntry.extendedCellStyleExpression</code> attribute defined at extension <code>print</code>. */
	private String _extendedCellStyleExpression;
	
	/** <i>Generated variable</i> - Variable of <code>CellEntry.mergeHorizontal</code> attribute defined at extension <code>print</code>. */
	private Boolean _mergeHorizontal;
	
	/** <i>Generated variable</i> - Variable of <code>CellEntry.mergeVertical</code> attribute defined at extension <code>print</code>. */
	private Boolean _mergeVertical;
	
	/** <i>Generated variable</i> - Variable of <code>CellEntry.colSpan</code> attribute defined at extension <code>print</code>. */
	private Integer _colSpan;
	
	/** <i>Generated variable</i> - Variable of <code>CellEntry.rowSpan</code> attribute defined at extension <code>print</code>. */
	private Integer _rowSpan;
	
	/** <i>Generated variable</i> - Variable of <code>CellEntry.convert</code> attribute defined at extension <code>print</code>. */
	private Boolean _convert;
	
	/** <i>Generated variable</i> - Variable of <code>CellEntry.locked</code> attribute defined at extension <code>print</code>. */
	private Boolean _locked;
	
	/** <i>Generated variable</i> - Variable of <code>CellEntry.table</code> attribute defined at extension <code>print</code>. */
	private TableBlockModel _table;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CellEntryModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CellEntryModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CellEntry</code> at extension <code>print</code>
	 * @param _column initial attribute declared by type <code>CellEntry</code> at extension <code>print</code>
	 * @param _row initial attribute declared by type <code>CellEntry</code> at extension <code>print</code>
	 * @param _table initial attribute declared by type <code>CellEntry</code> at extension <code>print</code>
	 */
	@Deprecated
	public CellEntryModel(final CatalogVersionModel _catalogVersion, final ColumnEntryModel _column, final RowEntryModel _row, final TableBlockModel _table)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setColumn(_column);
		setRow(_row);
		setTable(_table);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CellEntry</code> at extension <code>print</code>
	 * @param _column initial attribute declared by type <code>CellEntry</code> at extension <code>print</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _row initial attribute declared by type <code>CellEntry</code> at extension <code>print</code>
	 * @param _table initial attribute declared by type <code>CellEntry</code> at extension <code>print</code>
	 */
	@Deprecated
	public CellEntryModel(final CatalogVersionModel _catalogVersion, final ColumnEntryModel _column, final ItemModel _owner, final RowEntryModel _row, final TableBlockModel _table)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setColumn(_column);
		setOwner(_owner);
		setRow(_row);
		setTable(_table);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CellEntry.catalogVersion</code> attribute defined at extension <code>print</code>. 
	 * @return the catalogVersion
	 */
	public CatalogVersionModel getCatalogVersion()
	{
		if (this._catalogVersion!=null)
		{
			return _catalogVersion;
		}
		return _catalogVersion = getPersistenceContext().getValue(CATALOGVERSION, _catalogVersion);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CellEntry.cellStyle</code> attribute defined at extension <code>print</code>. 
	 * @return the cellStyle
	 */
	public CellStyleModel getCellStyle()
	{
		if (this._cellStyle!=null)
		{
			return _cellStyle;
		}
		return _cellStyle = getPersistenceContext().getValue(CELLSTYLE, _cellStyle);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CellEntry.cellStyleExpression</code> attribute defined at extension <code>print</code>. 
	 * @return the cellStyleExpression
	 */
	public String getCellStyleExpression()
	{
		if (this._cellStyleExpression!=null)
		{
			return _cellStyleExpression;
		}
		return _cellStyleExpression = getPersistenceContext().getValue(CELLSTYLEEXPRESSION, _cellStyleExpression);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CellEntry.cellText</code> attribute defined at extension <code>print</code>. 
	 * @return the cellText
	 */
	public String getCellText()
	{
		return getCellText(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>CellEntry.cellText</code> attribute defined at extension <code>print</code>. 
	 * @param loc the value localization key 
	 * @return the cellText
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getCellText(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(CELLTEXT, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CellEntry.colSpan</code> attribute defined at extension <code>print</code>. 
	 * @return the colSpan
	 */
	public Integer getColSpan()
	{
		if (this._colSpan!=null)
		{
			return _colSpan;
		}
		return _colSpan = getPersistenceContext().getValue(COLSPAN, _colSpan);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CellEntry.column</code> attribute defined at extension <code>print</code>. 
	 * @return the column
	 */
	public ColumnEntryModel getColumn()
	{
		if (this._column!=null)
		{
			return _column;
		}
		return _column = getPersistenceContext().getValue(COLUMN, _column);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CellEntry.convert</code> attribute defined at extension <code>print</code>. 
	 * @return the convert
	 */
	public Boolean getConvert()
	{
		if (this._convert!=null)
		{
			return _convert;
		}
		return _convert = getPersistenceContext().getValue(CONVERT, _convert);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CellEntry.extendedCellStyleExpression</code> attribute defined at extension <code>print</code>. 
	 * @return the extendedCellStyleExpression
	 */
	public String getExtendedCellStyleExpression()
	{
		if (this._extendedCellStyleExpression!=null)
		{
			return _extendedCellStyleExpression;
		}
		return _extendedCellStyleExpression = getPersistenceContext().getValue(EXTENDEDCELLSTYLEEXPRESSION, _extendedCellStyleExpression);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CellEntry.id</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>CellEntry.locked</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>CellEntry.mergeHorizontal</code> attribute defined at extension <code>print</code>. 
	 * @return the mergeHorizontal
	 */
	public Boolean getMergeHorizontal()
	{
		if (this._mergeHorizontal!=null)
		{
			return _mergeHorizontal;
		}
		return _mergeHorizontal = getPersistenceContext().getValue(MERGEHORIZONTAL, _mergeHorizontal);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CellEntry.mergeVertical</code> attribute defined at extension <code>print</code>. 
	 * @return the mergeVertical
	 */
	public Boolean getMergeVertical()
	{
		if (this._mergeVertical!=null)
		{
			return _mergeVertical;
		}
		return _mergeVertical = getPersistenceContext().getValue(MERGEVERTICAL, _mergeVertical);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CellEntry.postProcessingExpression</code> attribute defined at extension <code>print</code>. 
	 * @return the postProcessingExpression
	 */
	public String getPostProcessingExpression()
	{
		if (this._postProcessingExpression!=null)
		{
			return _postProcessingExpression;
		}
		return _postProcessingExpression = getPersistenceContext().getValue(POSTPROCESSINGEXPRESSION, _postProcessingExpression);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CellEntry.preProcessingExpression</code> attribute defined at extension <code>print</code>. 
	 * @return the preProcessingExpression
	 */
	public String getPreProcessingExpression()
	{
		if (this._preProcessingExpression!=null)
		{
			return _preProcessingExpression;
		}
		return _preProcessingExpression = getPersistenceContext().getValue(PREPROCESSINGEXPRESSION, _preProcessingExpression);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CellEntry.row</code> attribute defined at extension <code>print</code>. 
	 * @return the row
	 */
	public RowEntryModel getRow()
	{
		if (this._row!=null)
		{
			return _row;
		}
		return _row = getPersistenceContext().getValue(ROW, _row);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CellEntry.rowSpan</code> attribute defined at extension <code>print</code>. 
	 * @return the rowSpan
	 */
	public Integer getRowSpan()
	{
		if (this._rowSpan!=null)
		{
			return _rowSpan;
		}
		return _rowSpan = getPersistenceContext().getValue(ROWSPAN, _rowSpan);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CellEntry.table</code> attribute defined at extension <code>print</code>. 
	 * @return the table
	 */
	public TableBlockModel getTable()
	{
		if (this._table!=null)
		{
			return _table;
		}
		return _table = getPersistenceContext().getValue(TABLE, _table);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CellEntry.catalogVersion</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the catalogVersion
	 */
	public void setCatalogVersion(final CatalogVersionModel value)
	{
		_catalogVersion = getPersistenceContext().setValue(CATALOGVERSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CellEntry.cellStyle</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the cellStyle
	 */
	public void setCellStyle(final CellStyleModel value)
	{
		_cellStyle = getPersistenceContext().setValue(CELLSTYLE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CellEntry.cellStyleExpression</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the cellStyleExpression
	 */
	public void setCellStyleExpression(final String value)
	{
		_cellStyleExpression = getPersistenceContext().setValue(CELLSTYLEEXPRESSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CellEntry.cellText</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the cellText
	 */
	public void setCellText(final String value)
	{
		setCellText(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>CellEntry.cellText</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the cellText
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setCellText(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(CELLTEXT, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CellEntry.colSpan</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the colSpan
	 */
	public void setColSpan(final Integer value)
	{
		_colSpan = getPersistenceContext().setValue(COLSPAN, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CellEntry.column</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the column
	 */
	public void setColumn(final ColumnEntryModel value)
	{
		_column = getPersistenceContext().setValue(COLUMN, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CellEntry.convert</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the convert
	 */
	public void setConvert(final Boolean value)
	{
		_convert = getPersistenceContext().setValue(CONVERT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CellEntry.extendedCellStyleExpression</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the extendedCellStyleExpression
	 */
	public void setExtendedCellStyleExpression(final String value)
	{
		_extendedCellStyleExpression = getPersistenceContext().setValue(EXTENDEDCELLSTYLEEXPRESSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CellEntry.id</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the id
	 */
	public void setId(final String value)
	{
		_id = getPersistenceContext().setValue(ID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CellEntry.locked</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the locked
	 */
	public void setLocked(final Boolean value)
	{
		_locked = getPersistenceContext().setValue(LOCKED, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CellEntry.mergeHorizontal</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the mergeHorizontal
	 */
	public void setMergeHorizontal(final Boolean value)
	{
		_mergeHorizontal = getPersistenceContext().setValue(MERGEHORIZONTAL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CellEntry.mergeVertical</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the mergeVertical
	 */
	public void setMergeVertical(final Boolean value)
	{
		_mergeVertical = getPersistenceContext().setValue(MERGEVERTICAL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CellEntry.postProcessingExpression</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the postProcessingExpression
	 */
	public void setPostProcessingExpression(final String value)
	{
		_postProcessingExpression = getPersistenceContext().setValue(POSTPROCESSINGEXPRESSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CellEntry.preProcessingExpression</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the preProcessingExpression
	 */
	public void setPreProcessingExpression(final String value)
	{
		_preProcessingExpression = getPersistenceContext().setValue(PREPROCESSINGEXPRESSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CellEntry.row</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the row
	 */
	public void setRow(final RowEntryModel value)
	{
		_row = getPersistenceContext().setValue(ROW, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CellEntry.rowSpan</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the rowSpan
	 */
	public void setRowSpan(final Integer value)
	{
		_rowSpan = getPersistenceContext().setValue(ROWSPAN, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CellEntry.table</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the table
	 */
	public void setTable(final TableBlockModel value)
	{
		_table = getPersistenceContext().setValue(TABLE, value);
	}
	
}
