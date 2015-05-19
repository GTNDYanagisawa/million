/*
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
package de.hybris.platform.ticket.enums;

import de.hybris.platform.core.HybrisEnumValue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Generated enum CsTicketCategory declared at extension ticketsystem.
 */
@SuppressWarnings("PMD")
public class CsTicketCategory implements HybrisEnumValue
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CsTicketCategory";
	
	private static final ConcurrentMap<String, CsTicketCategory> cache = new ConcurrentHashMap<String, CsTicketCategory>();
	/**
	* Generated enum value for CsTicketCategory.Problem declared at extension ticketsystem.
	*/
	public static final CsTicketCategory PROBLEM = valueOf("Problem");
	
	/**
	* Generated enum value for CsTicketCategory.Incident declared at extension ticketsystem.
	*/
	public static final CsTicketCategory INCIDENT = valueOf("Incident");
	
	/**
	* Generated enum value for CsTicketCategory.Complaint declared at extension ticketsystem.
	*/
	public static final CsTicketCategory COMPLAINT = valueOf("Complaint");
	
	/**
	* Generated enum value for CsTicketCategory.Fraud declared at extension ticketsystem.
	*/
	public static final CsTicketCategory FRAUD = valueOf("Fraud");
	
	/**
	* Generated enum value for CsTicketCategory.Note declared at extension ticketsystem.
	*/
	public static final CsTicketCategory NOTE = valueOf("Note");
	
	
	/** The code of this enum.*/
	private final String code;
	private final String codeLowerCase;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private CsTicketCategory(final String code)
	{
		this.code = code.intern();
		this.codeLowerCase = this.code.toLowerCase().intern();
	}
	
	
	/**
	 * Compares this object to the specified object. The result is <code>true</code>
	 * if and only if the argument is not <code>null</code> and is an <code>CsTicketCategory
	 * </code> object that contains the enum value <code>code</code> as this object.
	 *  
	 * @param obj the object to compare with.
	 * @return <code>true</code> if the objects are the same;
	 *         <code>false</code> otherwise.
	 */
	@Override
	public boolean equals(final Object obj)
	{
		try
		{
			final HybrisEnumValue enum2 = (HybrisEnumValue) obj;
			return this == enum2
			|| (enum2 != null && !this.getClass().isEnum() && !enum2.getClass().isEnum()
			&& this.getType().equalsIgnoreCase(enum2.getType()) && this.getCode().equalsIgnoreCase(enum2.getCode()));
		}
		catch (final ClassCastException e)
		{
			return false;
		}
	}
	
	/**
	 * Gets the code of this enum value.
	 *  
	 * @return code of value
	 */
	@Override
	public String getCode()
	{
		return this.code;
	}
	
	/**
	 * Gets the type this enum value belongs to.
	 *  
	 * @return code of type
	 */
	@Override
	public String getType()
	{
		return getClass().getSimpleName();
	}
	
	/**
	 * Returns a hash code for this <code>CsTicketCategory</code>.
	 *  
	 * @return a hash code value for this object, equal to the enum value <code>code</code>
	 *         represented by this <code>CsTicketCategory</code> object.
	 */
	@Override
	public int hashCode()
	{
		return this.codeLowerCase.hashCode();
	}
	
	/**
	 * Returns the code representing this enum value.
	 *  
	 * @return a string representation of the value of this object.
	 */
	@Override
	public String toString()
	{
		return this.code.toString();
	}
	
	/**
	 * Returns a <tt>CsTicketCategory</tt> instance representing the specified enum value.
	 *  
	 * @param code an enum value
	 * @return a <tt>CsTicketCategory</tt> instance representing <tt>value</tt>. 
	 */
	public static CsTicketCategory valueOf(final String code)
	{
		final String key = code.toLowerCase();
		CsTicketCategory result = cache.get(key);
		if (result == null)
		{
			CsTicketCategory newValue = new CsTicketCategory(code);
			CsTicketCategory previous = cache.putIfAbsent(key, newValue);
			result = previous != null ? previous : newValue;
		}
		return result;
	}
	
}
