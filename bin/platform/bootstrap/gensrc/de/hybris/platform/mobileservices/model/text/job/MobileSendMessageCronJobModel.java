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
package de.hybris.platform.mobileservices.model.text.job;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.cronjob.model.JobModel;
import de.hybris.platform.deeplink.model.rules.DeeplinkUrlModel;
import de.hybris.platform.mobileservices.model.text.PhoneNumberListModel;
import de.hybris.platform.mobileservices.model.text.PhoneNumberModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Map;

/**
 * Generated model class for type MobileSendMessageCronJob first defined at extension mobileservices.
 */
@SuppressWarnings("all")
public class MobileSendMessageCronJobModel extends CronJobModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "MobileSendMessageCronJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileSendMessageCronJob.link</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String LINK = "link";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileSendMessageCronJob.subject</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String SUBJECT = "subject";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileSendMessageCronJob.template</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String TEMPLATE = "template";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileSendMessageCronJob.deeplinkUrl</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String DEEPLINKURL = "deeplinkUrl";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileSendMessageCronJob.variables</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String VARIABLES = "variables";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileSendMessageCronJob.item</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String ITEM = "item";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileSendMessageCronJob.language</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String LANGUAGE = "language";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileSendMessageCronJob.recipientPhoneNumberLists</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String RECIPIENTPHONENUMBERLISTS = "recipientPhoneNumberLists";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileSendMessageCronJob.recipients</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String RECIPIENTS = "recipients";
	
	/** <i>Generated constant</i> - Attribute key of <code>MobileSendMessageCronJob.phoneNumbers</code> attribute defined at extension <code>mobileservices</code>. */
	public static final String PHONENUMBERS = "phoneNumbers";
	
	
	/** <i>Generated variable</i> - Variable of <code>MobileSendMessageCronJob.link</code> attribute defined at extension <code>mobileservices</code>. */
	private Boolean _link;
	
	/** <i>Generated variable</i> - Variable of <code>MobileSendMessageCronJob.subject</code> attribute defined at extension <code>mobileservices</code>. */
	private String _subject;
	
	/** <i>Generated variable</i> - Variable of <code>MobileSendMessageCronJob.template</code> attribute defined at extension <code>mobileservices</code>. */
	private String _template;
	
	/** <i>Generated variable</i> - Variable of <code>MobileSendMessageCronJob.deeplinkUrl</code> attribute defined at extension <code>mobileservices</code>. */
	private DeeplinkUrlModel _deeplinkUrl;
	
	/** <i>Generated variable</i> - Variable of <code>MobileSendMessageCronJob.variables</code> attribute defined at extension <code>mobileservices</code>. */
	private Map<String,String> _variables;
	
	/** <i>Generated variable</i> - Variable of <code>MobileSendMessageCronJob.item</code> attribute defined at extension <code>mobileservices</code>. */
	private ItemModel _item;
	
	/** <i>Generated variable</i> - Variable of <code>MobileSendMessageCronJob.language</code> attribute defined at extension <code>mobileservices</code>. */
	private LanguageModel _language;
	
	/** <i>Generated variable</i> - Variable of <code>MobileSendMessageCronJob.recipientPhoneNumberLists</code> attribute defined at extension <code>mobileservices</code>. */
	private Collection<PhoneNumberListModel> _recipientPhoneNumberLists;
	
	/** <i>Generated variable</i> - Variable of <code>MobileSendMessageCronJob.recipients</code> attribute defined at extension <code>mobileservices</code>. */
	private Collection<UserModel> _recipients;
	
	/** <i>Generated variable</i> - Variable of <code>MobileSendMessageCronJob.phoneNumbers</code> attribute defined at extension <code>mobileservices</code>. */
	private Collection<PhoneNumberModel> _phoneNumbers;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public MobileSendMessageCronJobModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public MobileSendMessageCronJobModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 */
	@Deprecated
	public MobileSendMessageCronJobModel(final JobModel _job)
	{
		super();
		setJob(_job);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public MobileSendMessageCronJobModel(final JobModel _job, final ItemModel _owner)
	{
		super();
		setJob(_job);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileSendMessageCronJob.deeplinkUrl</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the deeplinkUrl
	 */
	public DeeplinkUrlModel getDeeplinkUrl()
	{
		if (this._deeplinkUrl!=null)
		{
			return _deeplinkUrl;
		}
		return _deeplinkUrl = getPersistenceContext().getValue(DEEPLINKURL, _deeplinkUrl);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileSendMessageCronJob.item</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the item
	 */
	public ItemModel getItem()
	{
		if (this._item!=null)
		{
			return _item;
		}
		return _item = getPersistenceContext().getValue(ITEM, _item);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileSendMessageCronJob.language</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the language
	 */
	public LanguageModel getLanguage()
	{
		if (this._language!=null)
		{
			return _language;
		}
		return _language = getPersistenceContext().getValue(LANGUAGE, _language);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileSendMessageCronJob.link</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the link
	 */
	public Boolean getLink()
	{
		if (this._link!=null)
		{
			return _link;
		}
		return _link = getPersistenceContext().getValue(LINK, _link);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileSendMessageCronJob.phoneNumbers</code> attribute defined at extension <code>mobileservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the phoneNumbers
	 */
	public Collection<PhoneNumberModel> getPhoneNumbers()
	{
		if (this._phoneNumbers!=null)
		{
			return _phoneNumbers;
		}
		return _phoneNumbers = getPersistenceContext().getValue(PHONENUMBERS, _phoneNumbers);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileSendMessageCronJob.recipientPhoneNumberLists</code> attribute defined at extension <code>mobileservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the recipientPhoneNumberLists
	 */
	public Collection<PhoneNumberListModel> getRecipientPhoneNumberLists()
	{
		if (this._recipientPhoneNumberLists!=null)
		{
			return _recipientPhoneNumberLists;
		}
		return _recipientPhoneNumberLists = getPersistenceContext().getValue(RECIPIENTPHONENUMBERLISTS, _recipientPhoneNumberLists);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileSendMessageCronJob.recipients</code> attribute defined at extension <code>mobileservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the recipients
	 */
	public Collection<UserModel> getRecipients()
	{
		if (this._recipients!=null)
		{
			return _recipients;
		}
		return _recipients = getPersistenceContext().getValue(RECIPIENTS, _recipients);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileSendMessageCronJob.subject</code> attribute defined at extension <code>mobileservices</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>MobileSendMessageCronJob.template</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the template
	 */
	public String getTemplate()
	{
		if (this._template!=null)
		{
			return _template;
		}
		return _template = getPersistenceContext().getValue(TEMPLATE, _template);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileSendMessageCronJob.variables</code> attribute defined at extension <code>mobileservices</code>. 
	 * @return the variables
	 */
	public Map<String,String> getVariables()
	{
		if (this._variables!=null)
		{
			return _variables;
		}
		return _variables = getPersistenceContext().getValue(VARIABLES, _variables);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileSendMessageCronJob.deeplinkUrl</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the deeplinkUrl
	 */
	public void setDeeplinkUrl(final DeeplinkUrlModel value)
	{
		_deeplinkUrl = getPersistenceContext().setValue(DEEPLINKURL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileSendMessageCronJob.item</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the item
	 */
	public void setItem(final ItemModel value)
	{
		_item = getPersistenceContext().setValue(ITEM, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileSendMessageCronJob.language</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the language
	 */
	public void setLanguage(final LanguageModel value)
	{
		_language = getPersistenceContext().setValue(LANGUAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileSendMessageCronJob.link</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the link
	 */
	public void setLink(final Boolean value)
	{
		_link = getPersistenceContext().setValue(LINK, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileSendMessageCronJob.phoneNumbers</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the phoneNumbers
	 */
	public void setPhoneNumbers(final Collection<PhoneNumberModel> value)
	{
		_phoneNumbers = getPersistenceContext().setValue(PHONENUMBERS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileSendMessageCronJob.recipientPhoneNumberLists</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the recipientPhoneNumberLists
	 */
	public void setRecipientPhoneNumberLists(final Collection<PhoneNumberListModel> value)
	{
		_recipientPhoneNumberLists = getPersistenceContext().setValue(RECIPIENTPHONENUMBERLISTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileSendMessageCronJob.recipients</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the recipients
	 */
	public void setRecipients(final Collection<UserModel> value)
	{
		_recipients = getPersistenceContext().setValue(RECIPIENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileSendMessageCronJob.subject</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the subject
	 */
	public void setSubject(final String value)
	{
		_subject = getPersistenceContext().setValue(SUBJECT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileSendMessageCronJob.template</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the template
	 */
	public void setTemplate(final String value)
	{
		_template = getPersistenceContext().setValue(TEMPLATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>MobileSendMessageCronJob.variables</code> attribute defined at extension <code>mobileservices</code>. 
	 *  
	 * @param value the variables
	 */
	public void setVariables(final Map<String,String> value)
	{
		_variables = getPersistenceContext().setValue(VARIABLES, value);
	}
	
}
