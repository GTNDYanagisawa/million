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
package de.hybris.platform.lucenesearch.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.lucenesearch.model.AbstractLuceneItemModel;
import de.hybris.platform.lucenesearch.model.IndexConfigurationModel;
import de.hybris.platform.lucenesearch.model.LanguageConfigurationModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;

/**
 * Generated model class for type LuceneIndex first defined at extension lucenesearch.
 */
@SuppressWarnings("all")
public class LuceneIndexModel extends AbstractLuceneItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "LuceneIndex";
	
	/** <i>Generated constant</i> - Attribute key of <code>LuceneIndex.code</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>LuceneIndex.indexConfigurations</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String INDEXCONFIGURATIONS = "indexConfigurations";
	
	/** <i>Generated constant</i> - Attribute key of <code>LuceneIndex.languageConfigurations</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String LANGUAGECONFIGURATIONS = "languageConfigurations";
	
	/** <i>Generated constant</i> - Attribute key of <code>LuceneIndex.pendingUpdatesCount</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String PENDINGUPDATESCOUNT = "pendingUpdatesCount";
	
	/** <i>Generated constant</i> - Attribute key of <code>LuceneIndex.postQueryFilterClassName</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String POSTQUERYFILTERCLASSNAME = "postQueryFilterClassName";
	
	/** <i>Generated constant</i> - Attribute key of <code>LuceneIndex.rebuildEndTimestamp</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String REBUILDENDTIMESTAMP = "rebuildEndTimestamp";
	
	/** <i>Generated constant</i> - Attribute key of <code>LuceneIndex.rebuildStartTimestamp</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String REBUILDSTARTTIMESTAMP = "rebuildStartTimestamp";
	
	/** <i>Generated constant</i> - Attribute key of <code>LuceneIndex.testLoc</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String TESTLOC = "testLoc";
	
	/** <i>Generated constant</i> - Attribute key of <code>LuceneIndex.upToDate</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String UPTODATE = "upToDate";
	
	
	/** <i>Generated variable</i> - Variable of <code>LuceneIndex.code</code> attribute defined at extension <code>lucenesearch</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>LuceneIndex.indexConfigurations</code> attribute defined at extension <code>lucenesearch</code>. */
	private Collection<IndexConfigurationModel> _indexConfigurations;
	
	/** <i>Generated variable</i> - Variable of <code>LuceneIndex.languageConfigurations</code> attribute defined at extension <code>lucenesearch</code>. */
	private Collection<LanguageConfigurationModel> _languageConfigurations;
	
	/** <i>Generated variable</i> - Variable of <code>LuceneIndex.pendingUpdatesCount</code> attribute defined at extension <code>lucenesearch</code>. */
	private Integer _pendingUpdatesCount;
	
	/** <i>Generated variable</i> - Variable of <code>LuceneIndex.postQueryFilterClassName</code> attribute defined at extension <code>lucenesearch</code>. */
	private String _postQueryFilterClassName;
	
	/** <i>Generated variable</i> - Variable of <code>LuceneIndex.rebuildEndTimestamp</code> attribute defined at extension <code>lucenesearch</code>. */
	private Date _rebuildEndTimestamp;
	
	/** <i>Generated variable</i> - Variable of <code>LuceneIndex.rebuildStartTimestamp</code> attribute defined at extension <code>lucenesearch</code>. */
	private Date _rebuildStartTimestamp;
	
	/** <i>Generated variable</i> - Variable of <code>LuceneIndex.upToDate</code> attribute defined at extension <code>lucenesearch</code>. */
	private Boolean _upToDate;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public LuceneIndexModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public LuceneIndexModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>LuceneIndex</code> at extension <code>lucenesearch</code>
	 */
	@Deprecated
	public LuceneIndexModel(final String _code)
	{
		super();
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>LuceneIndex</code> at extension <code>lucenesearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public LuceneIndexModel(final String _code, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LuceneIndex.code</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the code - The identifier of the LuceneIndex.
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
	 * <i>Generated method</i> - Getter of the <code>LuceneIndex.indexConfigurations</code> attribute defined at extension <code>lucenesearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the indexConfigurations - The IndexConfiguration objects belonging to this
	 * 						LuceneIndex.
	 */
	public Collection<IndexConfigurationModel> getIndexConfigurations()
	{
		if (this._indexConfigurations!=null)
		{
			return _indexConfigurations;
		}
		return _indexConfigurations = getPersistenceContext().getValue(INDEXCONFIGURATIONS, _indexConfigurations);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LuceneIndex.languageConfigurations</code> attribute defined at extension <code>lucenesearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the languageConfigurations - The LanguageConfiguration objects belonging to
	 * 						this LuceneIndex.
	 */
	public Collection<LanguageConfigurationModel> getLanguageConfigurations()
	{
		if (this._languageConfigurations!=null)
		{
			return _languageConfigurations;
		}
		return _languageConfigurations = getPersistenceContext().getValue(LANGUAGECONFIGURATIONS, _languageConfigurations);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LuceneIndex.pendingUpdatesCount</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the pendingUpdatesCount - The number of all IndexUpdate objects belonging
	 * 						to this index.
	 */
	public Integer getPendingUpdatesCount()
	{
		if (this._pendingUpdatesCount!=null)
		{
			return _pendingUpdatesCount;
		}
		return _pendingUpdatesCount = getPersistenceContext().getValue(PENDINGUPDATESCOUNT, _pendingUpdatesCount);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LuceneIndex.postQueryFilterClassName</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the postQueryFilterClassName - Optionally, specify a PostQueryFilter
	 * 						implementation here.
	 */
	public String getPostQueryFilterClassName()
	{
		if (this._postQueryFilterClassName!=null)
		{
			return _postQueryFilterClassName;
		}
		return _postQueryFilterClassName = getPersistenceContext().getValue(POSTQUERYFILTERCLASSNAME, _postQueryFilterClassName);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LuceneIndex.rebuildEndTimestamp</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the rebuildEndTimestamp - When the last rebuild of this LuceneIndex has
	 * 						ended.
	 */
	public Date getRebuildEndTimestamp()
	{
		if (this._rebuildEndTimestamp!=null)
		{
			return _rebuildEndTimestamp;
		}
		return _rebuildEndTimestamp = getPersistenceContext().getValue(REBUILDENDTIMESTAMP, _rebuildEndTimestamp);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LuceneIndex.rebuildStartTimestamp</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the rebuildStartTimestamp - When the last rebuild of this LuceneIndex has
	 * 						started.
	 */
	public Date getRebuildStartTimestamp()
	{
		if (this._rebuildStartTimestamp!=null)
		{
			return _rebuildStartTimestamp;
		}
		return _rebuildStartTimestamp = getPersistenceContext().getValue(REBUILDSTARTTIMESTAMP, _rebuildStartTimestamp);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LuceneIndex.testLoc</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the testLoc
	 */
	public Collection<String> getTestLoc()
	{
		return getTestLoc(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>LuceneIndex.testLoc</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @param loc the value localization key 
	 * @return the testLoc
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public Collection<String> getTestLoc(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(TESTLOC, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LuceneIndex.upToDate</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the upToDate - Indicates whether the LuceneIndex needs to be
	 * 						updated or not.
	 */
	public Boolean getUpToDate()
	{
		if (this._upToDate!=null)
		{
			return _upToDate;
		}
		return _upToDate = getPersistenceContext().getValue(UPTODATE, _upToDate);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>LuceneIndex.code</code> attribute defined at extension <code>lucenesearch</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the code - The identifier of the LuceneIndex.
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LuceneIndex.indexConfigurations</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the indexConfigurations - The IndexConfiguration objects belonging to this
	 * 						LuceneIndex.
	 */
	public void setIndexConfigurations(final Collection<IndexConfigurationModel> value)
	{
		_indexConfigurations = getPersistenceContext().setValue(INDEXCONFIGURATIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LuceneIndex.languageConfigurations</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the languageConfigurations - The LanguageConfiguration objects belonging to
	 * 						this LuceneIndex.
	 */
	public void setLanguageConfigurations(final Collection<LanguageConfigurationModel> value)
	{
		_languageConfigurations = getPersistenceContext().setValue(LANGUAGECONFIGURATIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LuceneIndex.postQueryFilterClassName</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the postQueryFilterClassName - Optionally, specify a PostQueryFilter
	 * 						implementation here.
	 */
	public void setPostQueryFilterClassName(final String value)
	{
		_postQueryFilterClassName = getPersistenceContext().setValue(POSTQUERYFILTERCLASSNAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LuceneIndex.testLoc</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the testLoc
	 */
	public void setTestLoc(final Collection<String> value)
	{
		setTestLoc(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>LuceneIndex.testLoc</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the testLoc
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setTestLoc(final Collection<String> value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(TESTLOC, loc, value);
	}
	
}
