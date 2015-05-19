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
package de.hybris.platform.basecommerce.enums;

import de.hybris.platform.core.HybrisEnumValue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Generated enum ConsignmentStatus declared at extension basecommerce.
 */
@SuppressWarnings("PMD")
public class ConsignmentStatus implements HybrisEnumValue
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ConsignmentStatus";
	
	private static final ConcurrentMap<String, ConsignmentStatus> cache = new ConcurrentHashMap<String, ConsignmentStatus>();
	/**
	* Generated enum value for ConsignmentStatus.READY_FOR_PICKUP declared at extension commerceservices.
	*/
	public static final ConsignmentStatus READY_FOR_PICKUP = valueOf("READY_FOR_PICKUP");
	
	/**
	* Generated enum value for ConsignmentStatus.WAITING declared at extension basecommerce.
	*/
	public static final ConsignmentStatus WAITING = valueOf("WAITING");
	
	/**
	* Generated enum value for ConsignmentStatus.PICKPACK declared at extension basecommerce.
	*/
	public static final ConsignmentStatus PICKPACK = valueOf("PICKPACK");
	
	/**
	* Generated enum value for ConsignmentStatus.PICKUP_COMPLETE declared at extension commerceservices.
	*/
	public static final ConsignmentStatus PICKUP_COMPLETE = valueOf("PICKUP_COMPLETE");
	
	/**
	* Generated enum value for ConsignmentStatus.READY declared at extension basecommerce.
	*/
	public static final ConsignmentStatus READY = valueOf("READY");
	
	/**
	* Generated enum value for ConsignmentStatus.SHIPPED declared at extension basecommerce.
	*/
	public static final ConsignmentStatus SHIPPED = valueOf("SHIPPED");
	
	/**
	* Generated enum value for ConsignmentStatus.CANCELLED declared at extension basecommerce.
	*/
	public static final ConsignmentStatus CANCELLED = valueOf("CANCELLED");
	
	
	/** The code of this enum.*/
	private final String code;
	private final String codeLowerCase;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private ConsignmentStatus(final String code)
	{
		this.code = code.intern();
		this.codeLowerCase = this.code.toLowerCase().intern();
	}
	
	
	/**
	 * Compares this object to the specified object. The result is <code>true</code>
	 * if and only if the argument is not <code>null</code> and is an <code>ConsignmentStatus
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
	 * Returns a hash code for this <code>ConsignmentStatus</code>.
	 *  
	 * @return a hash code value for this object, equal to the enum value <code>code</code>
	 *         represented by this <code>ConsignmentStatus</code> object.
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
	 * Returns a <tt>ConsignmentStatus</tt> instance representing the specified enum value.
	 *  
	 * @param code an enum value
	 * @return a <tt>ConsignmentStatus</tt> instance representing <tt>value</tt>. 
	 */
	public static ConsignmentStatus valueOf(final String code)
	{
		final String key = code.toLowerCase();
		ConsignmentStatus result = cache.get(key);
		if (result == null)
		{
			ConsignmentStatus newValue = new ConsignmentStatus(code);
			ConsignmentStatus previous = cache.putIfAbsent(key, newValue);
			result = previous != null ? previous : newValue;
		}
		return result;
	}
	
}
