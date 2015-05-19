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

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.cronjob.model.ChangeDescriptorModel;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.cronjob.model.StepModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type LinkChangeDescriptor first defined at extension bmecat.
 */
@SuppressWarnings("all")
public class LinkChangeDescriptorModel extends ChangeDescriptorModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "LinkChangeDescriptor";
	
	/** <i>Generated constant</i> - Attribute key of <code>LinkChangeDescriptor.source</code> attribute defined at extension <code>bmecat</code>. */
	public static final String SOURCE = "source";
	
	/** <i>Generated constant</i> - Attribute key of <code>LinkChangeDescriptor.target</code> attribute defined at extension <code>bmecat</code>. */
	public static final String TARGET = "target";
	
	
	/** <i>Generated variable</i> - Variable of <code>LinkChangeDescriptor.source</code> attribute defined at extension <code>bmecat</code>. */
	private String _source;
	
	/** <i>Generated variable</i> - Variable of <code>LinkChangeDescriptor.target</code> attribute defined at extension <code>bmecat</code>. */
	private String _target;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public LinkChangeDescriptorModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public LinkChangeDescriptorModel(final ItemModelContext ctx)
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
	public LinkChangeDescriptorModel(final String _changeType, final CronJobModel _cronJob, final Integer _sequenceNumber, final StepModel _step)
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
	public LinkChangeDescriptorModel(final String _changeType, final CronJobModel _cronJob, final ItemModel _owner, final Integer _sequenceNumber, final StepModel _step)
	{
		super();
		setChangeType(_changeType);
		setCronJob(_cronJob);
		setOwner(_owner);
		setSequenceNumber(_sequenceNumber);
		setStep(_step);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LinkChangeDescriptor.source</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the source
	 */
	public String getSource()
	{
		if (this._source!=null)
		{
			return _source;
		}
		return _source = getPersistenceContext().getValue(SOURCE, _source);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LinkChangeDescriptor.target</code> attribute defined at extension <code>bmecat</code>. 
	 * @return the target
	 */
	public String getTarget()
	{
		if (this._target!=null)
		{
			return _target;
		}
		return _target = getPersistenceContext().getValue(TARGET, _target);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LinkChangeDescriptor.source</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the source
	 */
	public void setSource(final String value)
	{
		_source = getPersistenceContext().setValue(SOURCE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LinkChangeDescriptor.target</code> attribute defined at extension <code>bmecat</code>. 
	 *  
	 * @param value the target
	 */
	public void setTarget(final String value)
	{
		_target = getPersistenceContext().setValue(TARGET, value);
	}
	
}
