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
package de.hybris.platform.solrfacetsearch.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.solrfacetsearch.enums.IndexerOperationStatus;
import de.hybris.platform.solrfacetsearch.enums.IndexerOperationValues;
import de.hybris.platform.solrfacetsearch.model.indexer.SolrIndexedCoresRecordModel;
import java.util.Date;

/**
 * Generated model class for type SolrIndexOperationRecord first defined at extension solrfacetsearch.
 */
@SuppressWarnings("all")
public class SolrIndexOperationRecordModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SolrIndexOperationRecord";
	
	/**<i>Generated relation code constant for relation <code>IndexCore2IndexOperationRecords</code> defining source attribute <code>solrIndexCoreRecord</code> in extension <code>solrfacetsearch</code>.</i>*/
	public final static String _INDEXCORE2INDEXOPERATIONRECORDS = "IndexCore2IndexOperationRecords";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexOperationRecord.startTime</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String STARTTIME = "startTime";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexOperationRecord.finishTime</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String FINISHTIME = "finishTime";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexOperationRecord.mode</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String MODE = "mode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexOperationRecord.status</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String STATUS = "status";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexOperationRecord.threadId</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String THREADID = "threadId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexOperationRecord.clusterId</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String CLUSTERID = "clusterId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexOperationRecord.failedReason</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String FAILEDREASON = "failedReason";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexOperationRecord.solrIndexCoreRecord</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String SOLRINDEXCORERECORD = "solrIndexCoreRecord";
	
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexOperationRecord.startTime</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Date _startTime;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexOperationRecord.finishTime</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Date _finishTime;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexOperationRecord.mode</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private IndexerOperationValues _mode;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexOperationRecord.status</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private IndexerOperationStatus _status;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexOperationRecord.threadId</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _threadId;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexOperationRecord.clusterId</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Integer _clusterId;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexOperationRecord.failedReason</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _failedReason;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexOperationRecord.solrIndexCoreRecord</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private SolrIndexedCoresRecordModel _solrIndexCoreRecord;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SolrIndexOperationRecordModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SolrIndexOperationRecordModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _clusterId initial attribute declared by type <code>SolrIndexOperationRecord</code> at extension <code>solrfacetsearch</code>
	 * @param _mode initial attribute declared by type <code>SolrIndexOperationRecord</code> at extension <code>solrfacetsearch</code>
	 * @param _solrIndexCoreRecord initial attribute declared by type <code>SolrIndexOperationRecord</code> at extension <code>solrfacetsearch</code>
	 * @param _status initial attribute declared by type <code>SolrIndexOperationRecord</code> at extension <code>solrfacetsearch</code>
	 * @param _threadId initial attribute declared by type <code>SolrIndexOperationRecord</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrIndexOperationRecordModel(final int _clusterId, final IndexerOperationValues _mode, final SolrIndexedCoresRecordModel _solrIndexCoreRecord, final IndexerOperationStatus _status, final String _threadId)
	{
		super();
		setClusterId(_clusterId);
		setMode(_mode);
		setSolrIndexCoreRecord(_solrIndexCoreRecord);
		setStatus(_status);
		setThreadId(_threadId);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _clusterId initial attribute declared by type <code>SolrIndexOperationRecord</code> at extension <code>solrfacetsearch</code>
	 * @param _mode initial attribute declared by type <code>SolrIndexOperationRecord</code> at extension <code>solrfacetsearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _solrIndexCoreRecord initial attribute declared by type <code>SolrIndexOperationRecord</code> at extension <code>solrfacetsearch</code>
	 * @param _status initial attribute declared by type <code>SolrIndexOperationRecord</code> at extension <code>solrfacetsearch</code>
	 * @param _threadId initial attribute declared by type <code>SolrIndexOperationRecord</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrIndexOperationRecordModel(final int _clusterId, final IndexerOperationValues _mode, final ItemModel _owner, final SolrIndexedCoresRecordModel _solrIndexCoreRecord, final IndexerOperationStatus _status, final String _threadId)
	{
		super();
		setClusterId(_clusterId);
		setMode(_mode);
		setOwner(_owner);
		setSolrIndexCoreRecord(_solrIndexCoreRecord);
		setStatus(_status);
		setThreadId(_threadId);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexOperationRecord.clusterId</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the clusterId
	 */
	public int getClusterId()
	{
		return toPrimitive( _clusterId = getPersistenceContext().getValue(CLUSTERID, _clusterId));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexOperationRecord.failedReason</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the failedReason
	 */
	public String getFailedReason()
	{
		if (this._failedReason!=null)
		{
			return _failedReason;
		}
		return _failedReason = getPersistenceContext().getValue(FAILEDREASON, _failedReason);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexOperationRecord.finishTime</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the finishTime
	 */
	public Date getFinishTime()
	{
		if (this._finishTime!=null)
		{
			return _finishTime;
		}
		return _finishTime = getPersistenceContext().getValue(FINISHTIME, _finishTime);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexOperationRecord.mode</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the mode
	 */
	public IndexerOperationValues getMode()
	{
		if (this._mode!=null)
		{
			return _mode;
		}
		return _mode = getPersistenceContext().getValue(MODE, _mode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexOperationRecord.solrIndexCoreRecord</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the solrIndexCoreRecord
	 */
	public SolrIndexedCoresRecordModel getSolrIndexCoreRecord()
	{
		if (this._solrIndexCoreRecord!=null)
		{
			return _solrIndexCoreRecord;
		}
		return _solrIndexCoreRecord = getPersistenceContext().getValue(SOLRINDEXCORERECORD, _solrIndexCoreRecord);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexOperationRecord.startTime</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the startTime
	 */
	public Date getStartTime()
	{
		if (this._startTime!=null)
		{
			return _startTime;
		}
		return _startTime = getPersistenceContext().getValue(STARTTIME, _startTime);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexOperationRecord.status</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the status
	 */
	public IndexerOperationStatus getStatus()
	{
		if (this._status!=null)
		{
			return _status;
		}
		return _status = getPersistenceContext().getValue(STATUS, _status);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexOperationRecord.threadId</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the threadId
	 */
	public String getThreadId()
	{
		if (this._threadId!=null)
		{
			return _threadId;
		}
		return _threadId = getPersistenceContext().getValue(THREADID, _threadId);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexOperationRecord.clusterId</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the clusterId
	 */
	public void setClusterId(final int value)
	{
		_clusterId = getPersistenceContext().setValue(CLUSTERID, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexOperationRecord.failedReason</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the failedReason
	 */
	public void setFailedReason(final String value)
	{
		_failedReason = getPersistenceContext().setValue(FAILEDREASON, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexOperationRecord.finishTime</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the finishTime
	 */
	public void setFinishTime(final Date value)
	{
		_finishTime = getPersistenceContext().setValue(FINISHTIME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexOperationRecord.mode</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the mode
	 */
	public void setMode(final IndexerOperationValues value)
	{
		_mode = getPersistenceContext().setValue(MODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexOperationRecord.solrIndexCoreRecord</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the solrIndexCoreRecord
	 */
	public void setSolrIndexCoreRecord(final SolrIndexedCoresRecordModel value)
	{
		_solrIndexCoreRecord = getPersistenceContext().setValue(SOLRINDEXCORERECORD, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexOperationRecord.startTime</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the startTime
	 */
	public void setStartTime(final Date value)
	{
		_startTime = getPersistenceContext().setValue(STARTTIME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexOperationRecord.status</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the status
	 */
	public void setStatus(final IndexerOperationStatus value)
	{
		_status = getPersistenceContext().setValue(STATUS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexOperationRecord.threadId</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the threadId
	 */
	public void setThreadId(final String value)
	{
		_threadId = getPersistenceContext().setValue(THREADID, value);
	}
	
}
