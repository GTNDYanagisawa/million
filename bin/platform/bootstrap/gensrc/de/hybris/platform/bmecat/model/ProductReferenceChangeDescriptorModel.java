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

import de.hybris.platform.bmecat.model.LinkChangeDescriptorModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.cronjob.model.StepModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type ProductReferenceChangeDescriptor first defined at extension bmecat.
 */
@SuppressWarnings("all")
public class ProductReferenceChangeDescriptorModel extends LinkChangeDescriptorModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ProductReferenceChangeDescriptor";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductReferenceChangeDescriptor.referenceType</code> attribute defined at extension <code>bmecat</code>. */
	public static final String REFERENCETYPE = "referenceType";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductReferenceChangeDescriptor.quantity</code> attribute defined at extension <code>bmecat</code>. */
	public static final String QUANTITY = "quantity";
	
	
	/** <i>Generated variable</i> - Variable of <code>ProductReferenceChangeDescriptor.referenceType</code> attribute defined at extension <code>bmecat</code>. */
	private String _referenceType;
	
	/** <i>Generated variable</i> - Variable of <code>ProductReferenceChangeDescriptor.quantity</code> attribute defined at extension <code>bmecat</code>. */
	private Integer _quantity;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ProductReferenceChangeDescriptorModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ProductReferenceChangeDescriptorModel(final ItemModelContext ctx)
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
	public ProductReferenceChangeDescriptorModel(final String _changeType, final CronJobModel _cronJob, final Integer _sequenceNumber, final StepModel _step)
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
	public ProductReferenceChangeDescriptorModel(final String _changeType, final CronJobModel _cronJob, final ItemModel _owner, final Integer _sequenceNumber, final StepModel _step)
	{
		super();
		setChangeType(_changeType);
		setCronJob(_cronJob);
		setOwner(_owner);
		setSequenceNumber(_sequenceNumber);
		setStep(_step);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductReferenceChangeDescriptor.quantity</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the quantity - Quantity
	 */
	public Integer getQuantity()
	{
		if (this._quantity!=null)
		{
			return _quantity;
		}
		return _quantity = getPersistenceContext().getValue(QUANTITY, _quantity);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductReferenceChangeDescriptor.referenceType</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the referenceType
	 */
	public String getReferenceType()
	{
		if (this._referenceType!=null)
		{
			return _referenceType;
		}
		return _referenceType = getPersistenceContext().getValue(REFERENCETYPE, _referenceType);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ProductReferenceChangeDescriptor.quantity</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the quantity - Quantity
	 */
	public void setQuantity(final Integer value)
	{
		_quantity = getPersistenceContext().setValue(QUANTITY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ProductReferenceChangeDescriptor.referenceType</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the referenceType
	 */
	public void setReferenceType(final String value)
	{
		_referenceType = getPersistenceContext().setValue(REFERENCETYPE, value);
	}
	
}
