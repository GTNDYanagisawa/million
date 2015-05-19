/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2015/04/16 16:55:23                         ---
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
package de.hybris.platform.b2bacceleratorservices.jalo.btg;

import de.hybris.platform.b2bacceleratorservices.constants.B2BAcceleratorServicesConstants;
import de.hybris.platform.btg.jalo.BTGAbstractOrderOperand;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.b2bacceleratorservices.jalo.btg.BTGOrganizationUIDsOperand BTGOrganizationUIDsOperand}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBTGOrganizationUIDsOperand extends BTGAbstractOrderOperand
{
	/** Qualifier of the <code>BTGOrganizationUIDsOperand.organizationUids</code> attribute **/
	public static final String ORGANIZATIONUIDS = "organizationUids";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(BTGAbstractOrderOperand.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ORGANIZATIONUIDS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGOrganizationUIDsOperand.organizationUids</code> attribute.
	 * @return the organizationUids
	 */
	public Collection<String> getOrganizationUids(final SessionContext ctx)
	{
		Collection<String> coll = (Collection<String>)getProperty( ctx, ORGANIZATIONUIDS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGOrganizationUIDsOperand.organizationUids</code> attribute.
	 * @return the organizationUids
	 */
	public Collection<String> getOrganizationUids()
	{
		return getOrganizationUids( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BTGOrganizationUIDsOperand.organizationUids</code> attribute. 
	 * @param value the organizationUids
	 */
	public void setOrganizationUids(final SessionContext ctx, final Collection<String> value)
	{
		setProperty(ctx, ORGANIZATIONUIDS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BTGOrganizationUIDsOperand.organizationUids</code> attribute. 
	 * @param value the organizationUids
	 */
	public void setOrganizationUids(final Collection<String> value)
	{
		setOrganizationUids( getSession().getSessionContext(), value );
	}
	
}
