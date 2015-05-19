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
package de.hybris.platform.btg.model;

import de.hybris.platform.btg.enums.BTGConditionEvaluationScope;
import de.hybris.platform.btg.model.BTGConditionResultModel;
import de.hybris.platform.btg.model.BTGItemModel;
import de.hybris.platform.btg.model.BTGRuleModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type BTGCondition first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGConditionModel extends BTGItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGCondition";
	
	/**<i>Generated relation code constant for relation <code>BTGRuleToBTGConditionsRelation</code> defining source attribute <code>rule</code> in extension <code>btg</code>.</i>*/
	public final static String _BTGRULETOBTGCONDITIONSRELATION = "BTGRuleToBTGConditionsRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGCondition.beanId</code> attribute defined at extension <code>btg</code>. */
	public static final String BEANID = "beanId";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGCondition.evaluationScope</code> attribute defined at extension <code>btg</code>. */
	public static final String EVALUATIONSCOPE = "evaluationScope";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGCondition.rule</code> attribute defined at extension <code>btg</code>. */
	public static final String RULE = "rule";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGCondition.results</code> attribute defined at extension <code>btg</code>. */
	public static final String RESULTS = "results";
	
	
	/** <i>Generated variable</i> - Variable of <code>BTGCondition.beanId</code> attribute defined at extension <code>btg</code>. */
	private String _beanId;
	
	/** <i>Generated variable</i> - Variable of <code>BTGCondition.evaluationScope</code> attribute defined at extension <code>btg</code>. */
	private BTGConditionEvaluationScope _evaluationScope;
	
	/** <i>Generated variable</i> - Variable of <code>BTGCondition.rule</code> attribute defined at extension <code>btg</code>. */
	private BTGRuleModel _rule;
	
	/** <i>Generated variable</i> - Variable of <code>BTGCondition.results</code> attribute defined at extension <code>btg</code>. */
	private Collection<BTGConditionResultModel> _results;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGConditionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGConditionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGConditionModel(final CatalogVersionModel _catalogVersion, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGConditionModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGCondition.beanId</code> attribute defined at extension <code>btg</code>. 
	 * @return the beanId
	 */
	public String getBeanId()
	{
		if (this._beanId!=null)
		{
			return _beanId;
		}
		return _beanId = getPersistenceContext().getValue(BEANID, _beanId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGCondition.evaluationScope</code> attribute defined at extension <code>btg</code>. 
	 * @return the evaluationScope
	 */
	public BTGConditionEvaluationScope getEvaluationScope()
	{
		if (this._evaluationScope!=null)
		{
			return _evaluationScope;
		}
		return _evaluationScope = getPersistenceContext().getValue(EVALUATIONSCOPE, _evaluationScope);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGCondition.results</code> attribute defined at extension <code>btg</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the results
	 */
	public Collection<BTGConditionResultModel> getResults()
	{
		if (this._results!=null)
		{
			return _results;
		}
		return _results = getPersistenceContext().getValue(RESULTS, _results);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGCondition.rule</code> attribute defined at extension <code>btg</code>. 
	 * @return the rule
	 */
	public BTGRuleModel getRule()
	{
		if (this._rule!=null)
		{
			return _rule;
		}
		return _rule = getPersistenceContext().getValue(RULE, _rule);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGCondition.beanId</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the beanId
	 */
	public void setBeanId(final String value)
	{
		_beanId = getPersistenceContext().setValue(BEANID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGCondition.evaluationScope</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the evaluationScope
	 */
	public void setEvaluationScope(final BTGConditionEvaluationScope value)
	{
		_evaluationScope = getPersistenceContext().setValue(EVALUATIONSCOPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGCondition.results</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the results
	 */
	public void setResults(final Collection<BTGConditionResultModel> value)
	{
		_results = getPersistenceContext().setValue(RESULTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGCondition.rule</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the rule
	 */
	public void setRule(final BTGRuleModel value)
	{
		_rule = getPersistenceContext().setValue(RULE, value);
	}
	
}
