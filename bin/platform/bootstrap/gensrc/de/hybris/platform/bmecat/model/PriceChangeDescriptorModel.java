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
package de.hybris.platform.bmecat.model;

import de.hybris.platform.bmecat.model.PriceCopyModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.cronjob.model.ChangeDescriptorModel;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.cronjob.model.StepModel;
import de.hybris.platform.europe1.model.PriceRowModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type PriceChangeDescriptor first defined at extension bmecat.
 */
@SuppressWarnings("all")
public class PriceChangeDescriptorModel extends ChangeDescriptorModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PriceChangeDescriptor";
	
	/** <i>Generated constant</i> - Attribute key of <code>PriceChangeDescriptor.priceRow</code> attribute defined at extension <code>bmecat</code>. */
	public static final String PRICEROW = "priceRow";
	
	/** <i>Generated constant</i> - Attribute key of <code>PriceChangeDescriptor.priceCopy</code> attribute defined at extension <code>bmecat</code>. */
	public static final String PRICECOPY = "priceCopy";
	
	
	/** <i>Generated variable</i> - Variable of <code>PriceChangeDescriptor.priceRow</code> attribute defined at extension <code>bmecat</code>. */
	private PriceRowModel _priceRow;
	
	/** <i>Generated variable</i> - Variable of <code>PriceChangeDescriptor.priceCopy</code> attribute defined at extension <code>bmecat</code>. */
	private PriceCopyModel _priceCopy;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PriceChangeDescriptorModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PriceChangeDescriptorModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _changeType initial attribute declared by type <code>ChangeDescriptor</code> at extension <code>processing</code>
	 * @param _cronJob initial attribute declared by type <code>ChangeDescriptor</code> at extension <code>processing</code>
	 * @param _sequenceNumber initial attribute declared by type <code>ChangeDescriptor</code> at extension <code>processing</code>
	 * @param _step initial attribute declared by type <code>ChangeDescriptor</code> at extension <code>processing</code>
	 */
	@Deprecated
	public PriceChangeDescriptorModel(final String _changeType, final CronJobModel _cronJob, final Integer _sequenceNumber, final StepModel _step)
	{
		super();
		setChangeType(_changeType);
		setCronJob(_cronJob);
		setSequenceNumber(_sequenceNumber);
		setStep(_step);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _changeType initial attribute declared by type <code>ChangeDescriptor</code> at extension <code>processing</code>
	 * @param _cronJob initial attribute declared by type <code>ChangeDescriptor</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _sequenceNumber initial attribute declared by type <code>ChangeDescriptor</code> at extension <code>processing</code>
	 * @param _step initial attribute declared by type <code>ChangeDescriptor</code> at extension <code>processing</code>
	 */
	@Deprecated
	public PriceChangeDescriptorModel(final String _changeType, final CronJobModel _cronJob, final ItemModel _owner, final Integer _sequenceNumber, final StepModel _step)
	{
		super();
		setChangeType(_changeType);
		setCronJob(_cronJob);
		setOwner(_owner);
		setSequenceNumber(_sequenceNumber);
		setStep(_step);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceChangeDescriptor.priceCopy</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the priceCopy
	 */
	public PriceCopyModel getPriceCopy()
	{
		if (this._priceCopy!=null)
		{
			return _priceCopy;
		}
		return _priceCopy = getPersistenceContext().getValue(PRICECOPY, _priceCopy);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceChangeDescriptor.priceRow</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the priceRow
	 */
	public PriceRowModel getPriceRow()
	{
		if (this._priceRow!=null)
		{
			return _priceRow;
		}
		return _priceRow = getPersistenceContext().getValue(PRICEROW, _priceRow);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PriceChangeDescriptor.priceCopy</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the priceCopy
	 */
	public void setPriceCopy(final PriceCopyModel value)
	{
		_priceCopy = getPersistenceContext().setValue(PRICECOPY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PriceChangeDescriptor.priceRow</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the priceRow
	 */
	public void setPriceRow(final PriceRowModel value)
	{
		_priceRow = getPersistenceContext().setValue(PRICEROW, value);
	}
	
}
