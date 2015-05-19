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
package de.hybris.platform.mobileservices.model.text;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.mobileservices.model.text.MobileReceiveGenericActionModel;
import de.hybris.platform.servicelayer.enums.ActionType;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type MobileReceiveAndSendTextAction first defined at extension mobileservices.
 */
@SuppressWarnings("all")
public class MobileReceiveAndSendTextActionModel extends MobileReceiveGenericActionModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "MobileReceiveAndSendTextAction";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileReceiveAndSendTextAction.isLink</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String ISLINK = "isLink";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileReceiveAndSendTextAction.content</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String CONTENT = "content";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileReceiveAndSendTextAction.subject</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String SUBJECT = "subject";
	
	
	/** <i>Generated variable</i> - Variable of <code>MobileReceiveAndSendTextAction.isLink</code> attribute defined at extension <code>mobileservices</code>. */
	private Boolean _isLink;
	
	/** <i>Generated variable</i> - Variable of <code>MobileReceiveAndSendTextAction.content</code> attribute defined at extension <code>mobileservices</code>. */
	private String _content;
	
	/** <i>Generated variable</i> - Variable of <code>MobileReceiveAndSendTextAction.subject</code> attribute defined at extension <code>mobileservices</code>. */
	private String _subject;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public MobileReceiveAndSendTextActionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public MobileReceiveAndSendTextActionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>MobileReceiveGenericAction</code> at extension <code>mobileservices</code>
	 * @param _content initial attribute declared by type <code>MobileReceiveAndSendTextAction</code> at extension <code>mobileservices</code>
	 * @param _target initial attribute declared by type <code>MobileReceiveAndSendTextAction</code> at extension <code>mobileservices</code>
	 * @param _type initial attribute declared by type <code>MobileReceiveGenericAction</code> at extension <code>mobileservices</code>
	 */
	@Deprecated
	public MobileReceiveAndSendTextActionModel(final String _code, final String _content, final String _target, final ActionType _type)
	{
		super();
		setCode(_code);
		setContent(_content);
		setTarget(_target);
		setType(_type);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>MobileReceiveGenericAction</code> at extension <code>mobileservices</code>
	 * @param _content initial attribute declared by type <code>MobileReceiveAndSendTextAction</code> at extension <code>mobileservices</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _target initial attribute declared by type <code>MobileReceiveAndSendTextAction</code> at extension <code>mobileservices</code>
	 * @param _type initial attribute declared by type <code>MobileReceiveGenericAction</code> at extension <code>mobileservices</code>
	 */
	@Deprecated
	public MobileReceiveAndSendTextActionModel(final String _code, final String _content, final ItemModel _owner, final String _target, final ActionType _type)
	{
		super();
		setCode(_code);
		setContent(_content);
		setOwner(_owner);
		setTarget(_target);
		setType(_type);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileReceiveAndSendTextAction.content</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the content
	 */
	public String getContent()
	{
		if (this._content!=null)
		{
			return _content;
		}
		return _content = getPersistenceContext().getValue(CONTENT, _content);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileReceiveAndSendTextAction.isLink</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the isLink
	 */
	public Boolean getIsLink()
	{
		if (this._isLink!=null)
		{
			return _isLink;
		}
		return _isLink = getPersistenceContext().getValue(ISLINK, _isLink);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileReceiveAndSendTextAction.subject</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the subject
	 */
	public String getSubject()
	{
		if (this._subject!=null)
		{
			return _subject;
		}
		return _subject = getPersistenceContext().getValue(SUBJECT, _subject);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileReceiveAndSendTextAction.content</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the content
	 */
	public void setContent(final String value)
	{
		_content = getPersistenceContext().setValue(CONTENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileReceiveAndSendTextAction.isLink</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the isLink
	 */
	public void setIsLink(final Boolean value)
	{
		_isLink = getPersistenceContext().setValue(ISLINK, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileReceiveAndSendTextAction.subject</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the subject
	 */
	public void setSubject(final String value)
	{
		_subject = getPersistenceContext().setValue(SUBJECT, value);
	}
	
}