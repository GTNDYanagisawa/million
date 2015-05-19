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
package de.hybris.platform.voucher.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.voucher.model.VoucherModel;
import java.util.Collection;

/**
 * Generated model class for type SerialVoucher first defined at extension voucher.
 */
@SuppressWarnings("all")
public class SerialVoucherModel extends VoucherModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SerialVoucher";
	
	/** <i>Generated constant</i> - Attribute key of <code>SerialVoucher.codes</code> attribute defined at extension <code>voucher</code>. */
	public static final String CODES = "codes";
	
	
	/** <i>Generated variable</i> - Variable of <code>SerialVoucher.codes</code> attribute defined at extension <code>voucher</code>. */
	private Collection<MediaModel> _codes;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SerialVoucherModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SerialVoucherModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>Voucher</code> at extension <code>voucher</code>
	 */
	@Deprecated
	public SerialVoucherModel(final String _code)
	{
		super();
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>Voucher</code> at extension <code>voucher</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public SerialVoucherModel(final String _code, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SerialVoucher.codes</code> attribute defined at extension <code>voucher</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the codes - the generated codes of this voucher.
	 */
	public Collection<MediaModel> getCodes()
	{
		if (this._codes!=null)
		{
			return _codes;
		}
		return _codes = getPersistenceContext().getValue(CODES, _codes);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SerialVoucher.codes</code> attribute defined at extension <code>voucher</code>. 
	 *  
	 * @param value the codes - the generated codes of this voucher.
	 */
	public void setCodes(final Collection<MediaModel> value)
	{
		_codes = getPersistenceContext().setValue(CODES, value);
	}
	
}
