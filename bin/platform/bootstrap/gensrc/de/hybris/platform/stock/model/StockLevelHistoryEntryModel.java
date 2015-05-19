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
package de.hybris.platform.stock.model;

import de.hybris.platform.basecommerce.enums.StockLevelUpdateType;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.ordersplitting.model.StockLevelModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Date;

/**
 * Generated model class for type StockLevelHistoryEntry first defined at extension basecommerce.
 */
@SuppressWarnings("all")
public class StockLevelHistoryEntryModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "StockLevelHistoryEntry";
	
	/**<i>Generated relation code constant for relation <code>StockLevelStockLevelHistoryEntryRelation</code> defining source attribute <code>stockLevel</code> in extension <code>basecommerce</code>.</i>*/
	public final static String _STOCKLEVELSTOCKLEVELHISTORYENTRYRELATION = "StockLevelStockLevelHistoryEntryRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>StockLevelHistoryEntry.updateDate</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String UPDATEDATE = "updateDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>StockLevelHistoryEntry.actual</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String ACTUAL = "actual";
	
	/** <i>Generated constant</i> - Attribute key of <code>StockLevelHistoryEntry.reserved</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String RESERVED = "reserved";
	
	/** <i>Generated constant</i> - Attribute key of <code>StockLevelHistoryEntry.updateType</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String UPDATETYPE = "updateType";
	
	/** <i>Generated constant</i> - Attribute key of <code>StockLevelHistoryEntry.comment</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String COMMENT = "comment";
	
	/** <i>Generated constant</i> - Attribute key of <code>StockLevelHistoryEntry.stockLevel</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String STOCKLEVEL = "stockLevel";
	
	
	/** <i>Generated variable</i> - Variable of <code>StockLevelHistoryEntry.updateDate</code> attribute defined at extension <code>basecommerce</code>. */
	private Date _updateDate;
	
	/** <i>Generated variable</i> - Variable of <code>StockLevelHistoryEntry.actual</code> attribute defined at extension <code>basecommerce</code>. */
	private Integer _actual;
	
	/** <i>Generated variable</i> - Variable of <code>StockLevelHistoryEntry.reserved</code> attribute defined at extension <code>basecommerce</code>. */
	private Integer _reserved;
	
	/** <i>Generated variable</i> - Variable of <code>StockLevelHistoryEntry.updateType</code> attribute defined at extension <code>basecommerce</code>. */
	private StockLevelUpdateType _updateType;
	
	/** <i>Generated variable</i> - Variable of <code>StockLevelHistoryEntry.comment</code> attribute defined at extension <code>basecommerce</code>. */
	private String _comment;
	
	/** <i>Generated variable</i> - Variable of <code>StockLevelHistoryEntry.stockLevel</code> attribute defined at extension <code>basecommerce</code>. */
	private StockLevelModel _stockLevel;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public StockLevelHistoryEntryModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public StockLevelHistoryEntryModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _actual initial attribute declared by type <code>StockLevelHistoryEntry</code> at extension <code>basecommerce</code>
	 * @param _reserved initial attribute declared by type <code>StockLevelHistoryEntry</code> at extension <code>basecommerce</code>
	 * @param _stockLevel initial attribute declared by type <code>StockLevelHistoryEntry</code> at extension <code>basecommerce</code>
	 * @param _updateDate initial attribute declared by type <code>StockLevelHistoryEntry</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public StockLevelHistoryEntryModel(final int _actual, final int _reserved, final StockLevelModel _stockLevel, final Date _updateDate)
	{
		super();
		setActual(_actual);
		setReserved(_reserved);
		setStockLevel(_stockLevel);
		setUpdateDate(_updateDate);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _actual initial attribute declared by type <code>StockLevelHistoryEntry</code> at extension <code>basecommerce</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _reserved initial attribute declared by type <code>StockLevelHistoryEntry</code> at extension <code>basecommerce</code>
	 * @param _stockLevel initial attribute declared by type <code>StockLevelHistoryEntry</code> at extension <code>basecommerce</code>
	 * @param _updateDate initial attribute declared by type <code>StockLevelHistoryEntry</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public StockLevelHistoryEntryModel(final int _actual, final ItemModel _owner, final int _reserved, final StockLevelModel _stockLevel, final Date _updateDate)
	{
		super();
		setActual(_actual);
		setOwner(_owner);
		setReserved(_reserved);
		setStockLevel(_stockLevel);
		setUpdateDate(_updateDate);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StockLevelHistoryEntry.actual</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the actual
	 */
	public int getActual()
	{
		return toPrimitive( _actual = getPersistenceContext().getValue(ACTUAL, _actual));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StockLevelHistoryEntry.comment</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the comment
	 */
	public String getComment()
	{
		if (this._comment!=null)
		{
			return _comment;
		}
		return _comment = getPersistenceContext().getValue(COMMENT, _comment);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StockLevelHistoryEntry.reserved</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the reserved
	 */
	public int getReserved()
	{
		return toPrimitive( _reserved = getPersistenceContext().getValue(RESERVED, _reserved));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StockLevelHistoryEntry.stockLevel</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the stockLevel
	 */
	public StockLevelModel getStockLevel()
	{
		if (this._stockLevel!=null)
		{
			return _stockLevel;
		}
		return _stockLevel = getPersistenceContext().getValue(STOCKLEVEL, _stockLevel);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StockLevelHistoryEntry.updateDate</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the updateDate
	 */
	public Date getUpdateDate()
	{
		if (this._updateDate!=null)
		{
			return _updateDate;
		}
		return _updateDate = getPersistenceContext().getValue(UPDATEDATE, _updateDate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StockLevelHistoryEntry.updateType</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the updateType
	 */
	public StockLevelUpdateType getUpdateType()
	{
		if (this._updateType!=null)
		{
			return _updateType;
		}
		return _updateType = getPersistenceContext().getValue(UPDATETYPE, _updateType);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>StockLevelHistoryEntry.actual</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the actual
	 */
	public void setActual(final int value)
	{
		_actual = getPersistenceContext().setValue(ACTUAL, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>StockLevelHistoryEntry.comment</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the comment
	 */
	public void setComment(final String value)
	{
		_comment = getPersistenceContext().setValue(COMMENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>StockLevelHistoryEntry.reserved</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the reserved
	 */
	public void setReserved(final int value)
	{
		_reserved = getPersistenceContext().setValue(RESERVED, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>StockLevelHistoryEntry.stockLevel</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the stockLevel
	 */
	public void setStockLevel(final StockLevelModel value)
	{
		_stockLevel = getPersistenceContext().setValue(STOCKLEVEL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>StockLevelHistoryEntry.updateDate</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the updateDate
	 */
	public void setUpdateDate(final Date value)
	{
		_updateDate = getPersistenceContext().setValue(UPDATEDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>StockLevelHistoryEntry.updateType</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the updateType
	 */
	public void setUpdateType(final StockLevelUpdateType value)
	{
		_updateType = getPersistenceContext().setValue(UPDATETYPE, value);
	}
	
}
