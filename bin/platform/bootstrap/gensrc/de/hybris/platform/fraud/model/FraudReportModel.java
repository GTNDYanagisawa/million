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
package de.hybris.platform.fraud.model;

import de.hybris.platform.basecommerce.enums.FraudStatus;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.fraud.model.FraudSymptomScoringModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Date;
import java.util.List;

/**
 * Generated model class for type FraudReport first defined at extension basecommerce.
 */
@SuppressWarnings("all")
public class FraudReportModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "FraudReport";
	
	/**<i>Generated relation code constant for relation <code>OrderFraudReportRelation</code> defining source attribute <code>order</code> in extension <code>basecommerce</code>.</i>*/
	public final static String _ORDERFRAUDREPORTRELATION = "OrderFraudReportRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>FraudReport.code</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>FraudReport.provider</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String PROVIDER = "provider";
	
	/** <i>Generated constant</i> - Attribute key of <code>FraudReport.timestamp</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String TIMESTAMP = "timestamp";
	
	/** <i>Generated constant</i> - Attribute key of <code>FraudReport.status</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String STATUS = "status";
	
	/** <i>Generated constant</i> - Attribute key of <code>FraudReport.explanation</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String EXPLANATION = "explanation";
	
	/** <i>Generated constant</i> - Attribute key of <code>FraudReport.order</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String ORDER = "order";
	
	/** <i>Generated constant</i> - Attribute key of <code>FraudReport.fraudSymptomScorings</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String FRAUDSYMPTOMSCORINGS = "fraudSymptomScorings";
	
	
	/** <i>Generated variable</i> - Variable of <code>FraudReport.code</code> attribute defined at extension <code>basecommerce</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>FraudReport.provider</code> attribute defined at extension <code>basecommerce</code>. */
	private String _provider;
	
	/** <i>Generated variable</i> - Variable of <code>FraudReport.timestamp</code> attribute defined at extension <code>basecommerce</code>. */
	private Date _timestamp;
	
	/** <i>Generated variable</i> - Variable of <code>FraudReport.status</code> attribute defined at extension <code>basecommerce</code>. */
	private FraudStatus _status;
	
	/** <i>Generated variable</i> - Variable of <code>FraudReport.explanation</code> attribute defined at extension <code>basecommerce</code>. */
	private String _explanation;
	
	/** <i>Generated variable</i> - Variable of <code>FraudReport.order</code> attribute defined at extension <code>basecommerce</code>. */
	private OrderModel _order;
	
	/** <i>Generated variable</i> - Variable of <code>FraudReport.fraudSymptomScorings</code> attribute defined at extension <code>basecommerce</code>. */
	private List<FraudSymptomScoringModel> _fraudSymptomScorings;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public FraudReportModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public FraudReportModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>FraudReport</code> at extension <code>basecommerce</code>
	 * @param _timestamp initial attribute declared by type <code>FraudReport</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public FraudReportModel(final String _code, final Date _timestamp)
	{
		super();
		setCode(_code);
		setTimestamp(_timestamp);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>FraudReport</code> at extension <code>basecommerce</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _timestamp initial attribute declared by type <code>FraudReport</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public FraudReportModel(final String _code, final ItemModel _owner, final Date _timestamp)
	{
		super();
		setCode(_code);
		setOwner(_owner);
		setTimestamp(_timestamp);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FraudReport.code</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the code
	 */
	public String getCode()
	{
		if (this._code!=null)
		{
			return _code;
		}
		return _code = getPersistenceContext().getValue(CODE, _code);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FraudReport.explanation</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the explanation
	 */
	public String getExplanation()
	{
		if (this._explanation!=null)
		{
			return _explanation;
		}
		return _explanation = getPersistenceContext().getValue(EXPLANATION, _explanation);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FraudReport.fraudSymptomScorings</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the fraudSymptomScorings
	 */
	public List<FraudSymptomScoringModel> getFraudSymptomScorings()
	{
		if (this._fraudSymptomScorings!=null)
		{
			return _fraudSymptomScorings;
		}
		return _fraudSymptomScorings = getPersistenceContext().getValue(FRAUDSYMPTOMSCORINGS, _fraudSymptomScorings);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FraudReport.order</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the order
	 */
	public OrderModel getOrder()
	{
		if (this._order!=null)
		{
			return _order;
		}
		return _order = getPersistenceContext().getValue(ORDER, _order);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FraudReport.provider</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the provider
	 */
	public String getProvider()
	{
		if (this._provider!=null)
		{
			return _provider;
		}
		return _provider = getPersistenceContext().getValue(PROVIDER, _provider);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FraudReport.status</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the status
	 */
	public FraudStatus getStatus()
	{
		if (this._status!=null)
		{
			return _status;
		}
		return _status = getPersistenceContext().getValue(STATUS, _status);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FraudReport.timestamp</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the timestamp
	 */
	public Date getTimestamp()
	{
		if (this._timestamp!=null)
		{
			return _timestamp;
		}
		return _timestamp = getPersistenceContext().getValue(TIMESTAMP, _timestamp);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>FraudReport.code</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>FraudReport.explanation</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the explanation
	 */
	public void setExplanation(final String value)
	{
		_explanation = getPersistenceContext().setValue(EXPLANATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>FraudReport.fraudSymptomScorings</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the fraudSymptomScorings
	 */
	public void setFraudSymptomScorings(final List<FraudSymptomScoringModel> value)
	{
		_fraudSymptomScorings = getPersistenceContext().setValue(FRAUDSYMPTOMSCORINGS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>FraudReport.order</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the order
	 */
	public void setOrder(final OrderModel value)
	{
		_order = getPersistenceContext().setValue(ORDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>FraudReport.provider</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the provider
	 */
	public void setProvider(final String value)
	{
		_provider = getPersistenceContext().setValue(PROVIDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>FraudReport.status</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the status
	 */
	public void setStatus(final FraudStatus value)
	{
		_status = getPersistenceContext().setValue(STATUS, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>FraudReport.timestamp</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the timestamp
	 */
	public void setTimestamp(final Date value)
	{
		_timestamp = getPersistenceContext().setValue(TIMESTAMP, value);
	}
	
}
