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
import de.hybris.platform.btg.enums.BTGEvaluationMethod;
import de.hybris.platform.btg.enums.BTGResultScope;
import de.hybris.platform.btg.model.BTGItemModel;
import de.hybris.platform.btg.model.BTGRuleModel;
import de.hybris.platform.btg.model.BTGSegmentResultModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.cms2.model.site.CMSSiteModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.servicelayer.model.action.AbstractActionModel;
import java.util.Collection;
import java.util.Date;

/**
 * Generated model class for type BTGSegment first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGSegmentModel extends BTGItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGSegment";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGSegment.name</code> attribute defined at extension <code>btg</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGSegment.active</code> attribute defined at extension <code>btg</code>. */
	public static final String ACTIVE = "active";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGSegment.scope</code> attribute defined at extension <code>btg</code>. */
	public static final String SCOPE = "scope";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGSegment.activeFrom</code> attribute defined at extension <code>btg</code>. */
	public static final String ACTIVEFROM = "activeFrom";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGSegment.activeTo</code> attribute defined at extension <code>btg</code>. */
	public static final String ACTIVETO = "activeTo";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGSegment.defaultResultScope</code> attribute defined at extension <code>btg</code>. */
	public static final String DEFAULTRESULTSCOPE = "defaultResultScope";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGSegment.defaultEvaluationMethod</code> attribute defined at extension <code>btg</code>. */
	public static final String DEFAULTEVALUATIONMETHOD = "defaultEvaluationMethod";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGSegment.sites</code> attribute defined at extension <code>btg</code>. */
	public static final String SITES = "sites";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGSegment.rules</code> attribute defined at extension <code>btg</code>. */
	public static final String RULES = "rules";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGSegment.outputActions</code> attribute defined at extension <code>btg</code>. */
	public static final String OUTPUTACTIONS = "outputActions";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGSegment.results</code> attribute defined at extension <code>btg</code>. */
	public static final String RESULTS = "results";
	
	
	/** <i>Generated variable</i> - Variable of <code>BTGSegment.name</code> attribute defined at extension <code>btg</code>. */
	private String _name;
	
	/** <i>Generated variable</i> - Variable of <code>BTGSegment.active</code> attribute defined at extension <code>btg</code>. */
	private Boolean _active;
	
	/** <i>Generated variable</i> - Variable of <code>BTGSegment.scope</code> attribute defined at extension <code>btg</code>. */
	private BTGConditionEvaluationScope _scope;
	
	/** <i>Generated variable</i> - Variable of <code>BTGSegment.activeFrom</code> attribute defined at extension <code>btg</code>. */
	private Date _activeFrom;
	
	/** <i>Generated variable</i> - Variable of <code>BTGSegment.activeTo</code> attribute defined at extension <code>btg</code>. */
	private Date _activeTo;
	
	/** <i>Generated variable</i> - Variable of <code>BTGSegment.defaultResultScope</code> attribute defined at extension <code>btg</code>. */
	private BTGResultScope _defaultResultScope;
	
	/** <i>Generated variable</i> - Variable of <code>BTGSegment.defaultEvaluationMethod</code> attribute defined at extension <code>btg</code>. */
	private BTGEvaluationMethod _defaultEvaluationMethod;
	
	/** <i>Generated variable</i> - Variable of <code>BTGSegment.sites</code> attribute defined at extension <code>btg</code>. */
	private Collection<CMSSiteModel> _sites;
	
	/** <i>Generated variable</i> - Variable of <code>BTGSegment.rules</code> attribute defined at extension <code>btg</code>. */
	private Collection<BTGRuleModel> _rules;
	
	/** <i>Generated variable</i> - Variable of <code>BTGSegment.outputActions</code> attribute defined at extension <code>btg</code>. */
	private Collection<AbstractActionModel> _outputActions;
	
	/** <i>Generated variable</i> - Variable of <code>BTGSegment.results</code> attribute defined at extension <code>btg</code>. */
	private Collection<BTGSegmentResultModel> _results;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGSegmentModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGSegmentModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _name initial attribute declared by type <code>BTGSegment</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGSegmentModel(final CatalogVersionModel _catalogVersion, final String _name, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setName(_name);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _name initial attribute declared by type <code>BTGSegment</code> at extension <code>btg</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGSegmentModel(final CatalogVersionModel _catalogVersion, final String _name, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setName(_name);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGSegment.active</code> attribute defined at extension <code>btg</code>. 
	 * @return the active
	 */
	public Boolean getActive()
	{
		if (this._active!=null)
		{
			return _active;
		}
		return _active = getPersistenceContext().getValue(ACTIVE, _active);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGSegment.activeFrom</code> attribute defined at extension <code>btg</code>. 
	 * @return the activeFrom
	 */
	public Date getActiveFrom()
	{
		if (this._activeFrom!=null)
		{
			return _activeFrom;
		}
		return _activeFrom = getPersistenceContext().getValue(ACTIVEFROM, _activeFrom);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGSegment.activeTo</code> attribute defined at extension <code>btg</code>. 
	 * @return the activeTo
	 */
	public Date getActiveTo()
	{
		if (this._activeTo!=null)
		{
			return _activeTo;
		}
		return _activeTo = getPersistenceContext().getValue(ACTIVETO, _activeTo);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGSegment.defaultEvaluationMethod</code> attribute defined at extension <code>btg</code>. 
	 * @return the defaultEvaluationMethod
	 */
	public BTGEvaluationMethod getDefaultEvaluationMethod()
	{
		if (this._defaultEvaluationMethod!=null)
		{
			return _defaultEvaluationMethod;
		}
		return _defaultEvaluationMethod = getPersistenceContext().getValue(DEFAULTEVALUATIONMETHOD, _defaultEvaluationMethod);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGSegment.defaultResultScope</code> attribute defined at extension <code>btg</code>. 
	 * @return the defaultResultScope
	 */
	public BTGResultScope getDefaultResultScope()
	{
		if (this._defaultResultScope!=null)
		{
			return _defaultResultScope;
		}
		return _defaultResultScope = getPersistenceContext().getValue(DEFAULTRESULTSCOPE, _defaultResultScope);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGSegment.name</code> attribute defined at extension <code>btg</code>. 
	 * @return the name
	 */
	public String getName()
	{
		if (this._name!=null)
		{
			return _name;
		}
		return _name = getPersistenceContext().getValue(NAME, _name);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGSegment.outputActions</code> attribute defined at extension <code>btg</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the outputActions
	 */
	public Collection<AbstractActionModel> getOutputActions()
	{
		if (this._outputActions!=null)
		{
			return _outputActions;
		}
		return _outputActions = getPersistenceContext().getValue(OUTPUTACTIONS, _outputActions);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGSegment.results</code> attribute defined at extension <code>btg</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the results
	 */
	public Collection<BTGSegmentResultModel> getResults()
	{
		if (this._results!=null)
		{
			return _results;
		}
		return _results = getPersistenceContext().getValue(RESULTS, _results);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGSegment.rules</code> attribute defined at extension <code>btg</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the rules
	 */
	public Collection<BTGRuleModel> getRules()
	{
		if (this._rules!=null)
		{
			return _rules;
		}
		return _rules = getPersistenceContext().getValue(RULES, _rules);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGSegment.scope</code> attribute defined at extension <code>btg</code>. 
	 * @return the scope
	 */
	public BTGConditionEvaluationScope getScope()
	{
		if (this._scope!=null)
		{
			return _scope;
		}
		return _scope = getPersistenceContext().getValue(SCOPE, _scope);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGSegment.sites</code> attribute defined at extension <code>btg</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the sites
	 */
	public Collection<CMSSiteModel> getSites()
	{
		if (this._sites!=null)
		{
			return _sites;
		}
		return _sites = getPersistenceContext().getValue(SITES, _sites);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGSegment.active</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the active
	 */
	public void setActive(final Boolean value)
	{
		_active = getPersistenceContext().setValue(ACTIVE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGSegment.activeFrom</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the activeFrom
	 */
	public void setActiveFrom(final Date value)
	{
		_activeFrom = getPersistenceContext().setValue(ACTIVEFROM, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGSegment.activeTo</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the activeTo
	 */
	public void setActiveTo(final Date value)
	{
		_activeTo = getPersistenceContext().setValue(ACTIVETO, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGSegment.defaultEvaluationMethod</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the defaultEvaluationMethod
	 */
	public void setDefaultEvaluationMethod(final BTGEvaluationMethod value)
	{
		_defaultEvaluationMethod = getPersistenceContext().setValue(DEFAULTEVALUATIONMETHOD, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGSegment.defaultResultScope</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the defaultResultScope
	 */
	public void setDefaultResultScope(final BTGResultScope value)
	{
		_defaultResultScope = getPersistenceContext().setValue(DEFAULTRESULTSCOPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGSegment.name</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the name
	 */
	public void setName(final String value)
	{
		_name = getPersistenceContext().setValue(NAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGSegment.outputActions</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the outputActions
	 */
	public void setOutputActions(final Collection<AbstractActionModel> value)
	{
		_outputActions = getPersistenceContext().setValue(OUTPUTACTIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGSegment.results</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the results
	 */
	public void setResults(final Collection<BTGSegmentResultModel> value)
	{
		_results = getPersistenceContext().setValue(RESULTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGSegment.rules</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the rules
	 */
	public void setRules(final Collection<BTGRuleModel> value)
	{
		_rules = getPersistenceContext().setValue(RULES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGSegment.scope</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the scope
	 */
	public void setScope(final BTGConditionEvaluationScope value)
	{
		_scope = getPersistenceContext().setValue(SCOPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGSegment.sites</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the sites
	 */
	public void setSites(final Collection<CMSSiteModel> value)
	{
		_sites = getPersistenceContext().setValue(SITES, value);
	}
	
}
