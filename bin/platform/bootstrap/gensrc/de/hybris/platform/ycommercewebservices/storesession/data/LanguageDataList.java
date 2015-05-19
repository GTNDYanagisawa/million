/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 2015/05/18 13:25:59
 * ----------------------------------------------------------------
 *
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package de.hybris.platform.ycommercewebservices.storesession.data;

import de.hybris.platform.commercefacades.storesession.data.LanguageData;
import java.util.Collection;

public class LanguageDataList  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>LanguageDataList.languages</code> property defined at extension <code>ycommercewebservices</code>. */
	private Collection<LanguageData> languages;
		
	public LanguageDataList()
	{
		// default constructor
	}
	
		
	public void setLanguages(final Collection<LanguageData> languages)
	{
		this.languages = languages;
	}
	
		
	public Collection<LanguageData> getLanguages() 
	{
		return languages;
	}
		
	
}