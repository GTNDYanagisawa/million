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
package de.hybris.platform.acceleratorservices.jalo.email;

import de.hybris.platform.acceleratorservices.constants.AcceleratorServicesConstants;
import de.hybris.platform.acceleratorservices.jalo.email.EmailMessage;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.acceleratorservices.jalo.email.EmailAttachment EmailAttachment}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEmailAttachment extends Media
{
	/** Qualifier of the <code>EmailAttachment.message</code> attribute **/
	public static final String MESSAGE = "message";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n MESSAGE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedEmailAttachment> MESSAGEHANDLER = new BidirectionalOneToManyHandler<GeneratedEmailAttachment>(
	AcceleratorServicesConstants.TC.EMAILATTACHMENT,
	false,
	"message",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Media.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MESSAGE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		MESSAGEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAttachment.message</code> attribute.
	 * @return the message
	 */
	public EmailMessage getMessage(final SessionContext ctx)
	{
		return (EmailMessage)getProperty( ctx, MESSAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAttachment.message</code> attribute.
	 * @return the message
	 */
	public EmailMessage getMessage()
	{
		return getMessage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailAttachment.message</code> attribute. 
	 * @param value the message
	 */
	public void setMessage(final SessionContext ctx, final EmailMessage value)
	{
		MESSAGEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailAttachment.message</code> attribute. 
	 * @param value the message
	 */
	public void setMessage(final EmailMessage value)
	{
		setMessage( getSession().getSessionContext(), value );
	}
	
}
