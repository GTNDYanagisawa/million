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

import de.hybris.platform.core.PK;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.lucenesearch.model.AbstractLuceneItemModel;
import de.hybris.platform.lucenesearch.model.IndexConfigurationModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type IndexUpdate first defined at extension lucenesearch.
 */
@SuppressWarnings("all")
public class IndexUpdateModel extends AbstractLuceneItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "IndexUpdate";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexUpdate.indexConfiguration</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String INDEXCONFIGURATION = "indexConfiguration";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexUpdate.inProgress</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String INPROGRESS = "inProgress";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexUpdate.item</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String ITEM = "item";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexUpdate.itemPK</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String ITEMPK = "itemPK";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexUpdate.remove</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String REMOVE = "remove";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexUpdate.updateIndexCronJob</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String UPDATEINDEXCRONJOB = "updateIndexCronJob";
	
	
	/** <i>Generated variable</i> - Variable of <code>IndexUpdate.indexConfiguration</code> attribute defined at extension <code>lucenesearch</code>. */
	private IndexConfigurationModel _indexConfiguration;
	
	/** <i>Generated variable</i> - Variable of <code>IndexUpdate.inProgress</code> attribute defined at extension <code>lucenesearch</code>. */
	private Boolean _inProgress;
	
	/** <i>Generated variable</i> - Variable of <code>IndexUpdate.item</code> attribute defined at extension <code>lucenesearch</code>. */
	private ItemModel _item;
	
	/** <i>Generated variable</i> - Variable of <code>IndexUpdate.itemPK</code> attribute defined at extension <code>lucenesearch</code>. */
	private PK _itemPK;
	
	/** <i>Generated variable</i> - Variable of <code>IndexUpdate.remove</code> attribute defined at extension <code>lucenesearch</code>. */
	private Boolean _remove;
	
	/** <i>Generated variable</i> - Variable of <code>IndexUpdate.updateIndexCronJob</code> attribute defined at extension <code>lucenesearch</code>. */
	private CronJobModel _updateIndexCronJob;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public IndexUpdateModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public IndexUpdateModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _indexConfiguration initial attribute declared by type <code>IndexUpdate</code> at extension <code>lucenesearch</code>
	 * @param _itemPK initial attribute declared by type <code>IndexUpdate</code> at extension <code>lucenesearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _updateIndexCronJob initial attribute declared by type <code>IndexUpdate</code> at extension <code>lucenesearch</code>
	 */
	@Deprecated
	public IndexUpdateModel(final IndexConfigurationModel _indexConfiguration, final PK _itemPK, final ItemModel _owner, final CronJobModel _updateIndexCronJob)
	{
		super();
		setIndexConfiguration(_indexConfiguration);
		setItemPK(_itemPK);
		setOwner(_owner);
		setUpdateIndexCronJob(_updateIndexCronJob);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexUpdate.indexConfiguration</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the indexConfiguration - The IndexConfiguration this IndexUpdate belongs
	 * 						to.
	 */
	public IndexConfigurationModel getIndexConfiguration()
	{
		if (this._indexConfiguration!=null)
		{
			return _indexConfiguration;
		}
		return _indexConfiguration = getPersistenceContext().getValue(INDEXCONFIGURATION, _indexConfiguration);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexUpdate.inProgress</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the inProgress
	 */
	public Boolean getInProgress()
	{
		if (this._inProgress!=null)
		{
			return _inProgress;
		}
		return _inProgress = getPersistenceContext().getValue(INPROGRESS, _inProgress);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexUpdate.item</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the item
	 */
	public ItemModel getItem()
	{
		if (this._item!=null)
		{
			return _item;
		}
		return _item = getPersistenceContext().getValue(ITEM, _item);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexUpdate.itemPK</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the itemPK
	 */
	public PK getItemPK()
	{
		if (this._itemPK!=null)
		{
			return _itemPK;
		}
		return _itemPK = getPersistenceContext().getValue(ITEMPK, _itemPK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexUpdate.remove</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the remove
	 */
	public Boolean getRemove()
	{
		if (this._remove!=null)
		{
			return _remove;
		}
		return _remove = getPersistenceContext().getValue(REMOVE, _remove);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexUpdate.updateIndexCronJob</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the updateIndexCronJob
	 */
	public CronJobModel getUpdateIndexCronJob()
	{
		if (this._updateIndexCronJob!=null)
		{
			return _updateIndexCronJob;
		}
		return _updateIndexCronJob = getPersistenceContext().getValue(UPDATEINDEXCRONJOB, _updateIndexCronJob);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>IndexUpdate.indexConfiguration</code> attribute defined at extension <code>lucenesearch</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the indexConfiguration - The IndexConfiguration this IndexUpdate belongs
	 * 						to.
	 */
	public void setIndexConfiguration(final IndexConfigurationModel value)
	{
		_indexConfiguration = getPersistenceContext().setValue(INDEXCONFIGURATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>IndexUpdate.inProgress</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the inProgress
	 */
	public void setInProgress(final Boolean value)
	{
		_inProgress = getPersistenceContext().setValue(INPROGRESS, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>IndexUpdate.itemPK</code> attribute defined at extension <code>lucenesearch</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the itemPK
	 */
	public void setItemPK(final PK value)
	{
		_itemPK = getPersistenceContext().setValue(ITEMPK, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>IndexUpdate.remove</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the remove
	 */
	public void setRemove(final Boolean value)
	{
		_remove = getPersistenceContext().setValue(REMOVE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>IndexUpdate.updateIndexCronJob</code> attribute defined at extension <code>lucenesearch</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the updateIndexCronJob
	 */
	public void setUpdateIndexCronJob(final CronJobModel value)
	{
		_updateIndexCronJob = getPersistenceContext().setValue(UPDATEINDEXCRONJOB, value);
	}
	
}
