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

import de.hybris.platform.btg.model.BTGSegmentModel;
import de.hybris.platform.cockpit.reports.model.JasperMediaModel;
import de.hybris.platform.cockpit.reports.model.JasperWidgetPreferencesModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type BtgJasperWidgetPreferences first defined at extension btgcockpit.
 */
@SuppressWarnings("all")
public class BtgJasperWidgetPreferencesModel extends JasperWidgetPreferencesModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BtgJasperWidgetPreferences";
	
	/** <i>Generated constant</i> - Attribute key of <code>BtgJasperWidgetPreferences.segment</code> attribute defined at extension <code>btgcockpit</code>. */
	public static final String SEGMENT = "segment";
	
	
	/** <i>Generated variable</i> - Variable of <code>BtgJasperWidgetPreferences.segment</code> attribute defined at extension <code>btgcockpit</code>. */
	private BTGSegmentModel _segment;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BtgJasperWidgetPreferencesModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BtgJasperWidgetPreferencesModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _report initial attribute declared by type <code>JasperWidgetPreferences</code> at extension <code>cockpit</code>
	 * @param _segment initial attribute declared by type <code>BtgJasperWidgetPreferences</code> at extension <code>btgcockpit</code>
	 */
	@Deprecated
	public BtgJasperWidgetPreferencesModel(final JasperMediaModel _report, final BTGSegmentModel _segment)
	{
		super();
		setReport(_report);
		setSegment(_segment);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _report initial attribute declared by type <code>JasperWidgetPreferences</code> at extension <code>cockpit</code>
	 * @param _segment initial attribute declared by type <code>BtgJasperWidgetPreferences</code> at extension <code>btgcockpit</code>
	 */
	@Deprecated
	public BtgJasperWidgetPreferencesModel(final ItemModel _owner, final JasperMediaModel _report, final BTGSegmentModel _segment)
	{
		super();
		setOwner(_owner);
		setReport(_report);
		setSegment(_segment);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BtgJasperWidgetPreferences.segment</code> attribute defined at extension <code>btgcockpit</code>. 
	 * @return the segment
	 */
	public BTGSegmentModel getSegment()
	{
		if (this._segment!=null)
		{
			return _segment;
		}
		return _segment = getPersistenceContext().getValue(SEGMENT, _segment);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BtgJasperWidgetPreferences.segment</code> attribute defined at extension <code>btgcockpit</code>. 
	 *  
	 * @param value the segment
	 */
	public void setSegment(final BTGSegmentModel value)
	{
		_segment = getPersistenceContext().setValue(SEGMENT, value);
	}
	
}
