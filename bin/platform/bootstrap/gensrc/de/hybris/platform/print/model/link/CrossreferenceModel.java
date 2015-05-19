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
package de.hybris.platform.print.model.link;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.print.enums.CrossReferenceReplacement;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type Crossreference first defined at extension print.
 */
@SuppressWarnings("all")
public class CrossreferenceModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "Crossreference";
	
	/** <i>Generated constant</i> - Attribute key of <code>Crossreference.id</code> attribute defined at extension <code>print</code>. */
	public static final String ID = "id";
	
	/** <i>Generated constant</i> - Attribute key of <code>Crossreference.catalogVersion</code> attribute defined at extension <code>print</code>. */
	public static final String CATALOGVERSION = "catalogVersion";
	
	/** <i>Generated constant</i> - Attribute key of <code>Crossreference.qualifier</code> attribute defined at extension <code>print</code>. */
	public static final String QUALIFIER = "qualifier";
	
	/** <i>Generated constant</i> - Attribute key of <code>Crossreference.displayDetails</code> attribute defined at extension <code>print</code>. */
	public static final String DISPLAYDETAILS = "displayDetails";
	
	/** <i>Generated constant</i> - Attribute key of <code>Crossreference.source</code> attribute defined at extension <code>print</code>. */
	public static final String SOURCE = "source";
	
	/** <i>Generated constant</i> - Attribute key of <code>Crossreference.target</code> attribute defined at extension <code>print</code>. */
	public static final String TARGET = "target";
	
	/** <i>Generated constant</i> - Attribute key of <code>Crossreference.attribute</code> attribute defined at extension <code>print</code>. */
	public static final String ATTRIBUTE = "attribute";
	
	/** <i>Generated constant</i> - Attribute key of <code>Crossreference.language</code> attribute defined at extension <code>print</code>. */
	public static final String LANGUAGE = "language";
	
	/** <i>Generated constant</i> - Attribute key of <code>Crossreference.indesignReplacementType</code> attribute defined at extension <code>print</code>. */
	public static final String INDESIGNREPLACEMENTTYPE = "indesignReplacementType";
	
	
	/** <i>Generated variable</i> - Variable of <code>Crossreference.id</code> attribute defined at extension <code>print</code>. */
	private String _id;
	
	/** <i>Generated variable</i> - Variable of <code>Crossreference.catalogVersion</code> attribute defined at extension <code>print</code>. */
	private CatalogVersionModel _catalogVersion;
	
	/** <i>Generated variable</i> - Variable of <code>Crossreference.qualifier</code> attribute defined at extension <code>print</code>. */
	private String _qualifier;
	
	/** <i>Generated variable</i> - Variable of <code>Crossreference.displayDetails</code> attribute defined at extension <code>print</code>. */
	private String _displayDetails;
	
	/** <i>Generated variable</i> - Variable of <code>Crossreference.source</code> attribute defined at extension <code>print</code>. */
	private ItemModel _source;
	
	/** <i>Generated variable</i> - Variable of <code>Crossreference.target</code> attribute defined at extension <code>print</code>. */
	private ItemModel _target;
	
	/** <i>Generated variable</i> - Variable of <code>Crossreference.attribute</code> attribute defined at extension <code>print</code>. */
	private String _attribute;
	
	/** <i>Generated variable</i> - Variable of <code>Crossreference.language</code> attribute defined at extension <code>print</code>. */
	private LanguageModel _language;
	
	/** <i>Generated variable</i> - Variable of <code>Crossreference.indesignReplacementType</code> attribute defined at extension <code>print</code>. */
	private CrossReferenceReplacement _indesignReplacementType;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CrossreferenceModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CrossreferenceModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>Crossreference</code> at extension <code>print</code>
	 * @param _source initial attribute declared by type <code>Crossreference</code> at extension <code>print</code>
	 */
	@Deprecated
	public CrossreferenceModel(final CatalogVersionModel _catalogVersion, final ItemModel _source)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setSource(_source);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>Crossreference</code> at extension <code>print</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _source initial attribute declared by type <code>Crossreference</code> at extension <code>print</code>
	 */
	@Deprecated
	public CrossreferenceModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final ItemModel _source)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setSource(_source);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Crossreference.attribute</code> attribute defined at extension <code>print</code>. 
	 * @return the attribute - Qualifier of teh attribute that contains this crossreference as text
	 */
	public String getAttribute()
	{
		if (this._attribute!=null)
		{
			return _attribute;
		}
		return _attribute = getPersistenceContext().getValue(ATTRIBUTE, _attribute);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Crossreference.catalogVersion</code> attribute defined at extension <code>print</code>. 
	 * @return the catalogVersion
	 */
	public CatalogVersionModel getCatalogVersion()
	{
		if (this._catalogVersion!=null)
		{
			return _catalogVersion;
		}
		return _catalogVersion = getPersistenceContext().getValue(CATALOGVERSION, _catalogVersion);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Crossreference.displayDetails</code> attribute defined at extension <code>print</code>. 
	 * @return the displayDetails - Specifies how to display this crossreference
	 */
	public String getDisplayDetails()
	{
		if (this._displayDetails!=null)
		{
			return _displayDetails;
		}
		return _displayDetails = getPersistenceContext().getValue(DISPLAYDETAILS, _displayDetails);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Crossreference.id</code> attribute defined at extension <code>print</code>. 
	 * @return the id
	 */
	public String getId()
	{
		if (this._id!=null)
		{
			return _id;
		}
		return _id = getPersistenceContext().getValue(ID, _id);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Crossreference.indesignReplacementType</code> attribute defined at extension <code>print</code>. 
	 * @return the indesignReplacementType - This attribute specifies how the crossreference would be translated in indesign
	 */
	public CrossReferenceReplacement getIndesignReplacementType()
	{
		if (this._indesignReplacementType!=null)
		{
			return _indesignReplacementType;
		}
		return _indesignReplacementType = getPersistenceContext().getValue(INDESIGNREPLACEMENTTYPE, _indesignReplacementType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Crossreference.language</code> attribute defined at extension <code>print</code>. 
	 * @return the language - Language of the attribute's value that contains this crossreference as text
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
	 * <i>Generated method</i> - Getter of the <code>Crossreference.qualifier</code> attribute defined at extension <code>print</code>. 
	 * @return the qualifier - A name/description that qualifies this reference (Does not act as unique key)
	 */
	public String getQualifier()
	{
		if (this._qualifier!=null)
		{
			return _qualifier;
		}
		return _qualifier = getPersistenceContext().getValue(QUALIFIER, _qualifier);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Crossreference.source</code> attribute defined at extension <code>print</code>. 
	 * @return the source - Referencing item / Source item
	 */
	public ItemModel getSource()
	{
		if (this._source!=null)
		{
			return _source;
		}
		return _source = getPersistenceContext().getValue(SOURCE, _source);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Crossreference.target</code> attribute defined at extension <code>print</code>. 
	 * @return the target - Referenced item / Target item / Anchor
	 */
	public ItemModel getTarget()
	{
		if (this._target!=null)
		{
			return _target;
		}
		return _target = getPersistenceContext().getValue(TARGET, _target);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Crossreference.attribute</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the attribute - Qualifier of teh attribute that contains this crossreference as text
	 */
	public void setAttribute(final String value)
	{
		_attribute = getPersistenceContext().setValue(ATTRIBUTE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Crossreference.catalogVersion</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the catalogVersion
	 */
	public void setCatalogVersion(final CatalogVersionModel value)
	{
		_catalogVersion = getPersistenceContext().setValue(CATALOGVERSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Crossreference.displayDetails</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the displayDetails - Specifies how to display this crossreference
	 */
	public void setDisplayDetails(final String value)
	{
		_displayDetails = getPersistenceContext().setValue(DISPLAYDETAILS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Crossreference.id</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the id
	 */
	public void setId(final String value)
	{
		_id = getPersistenceContext().setValue(ID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Crossreference.indesignReplacementType</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the indesignReplacementType - This attribute specifies how the crossreference would be translated in indesign
	 */
	public void setIndesignReplacementType(final CrossReferenceReplacement value)
	{
		_indesignReplacementType = getPersistenceContext().setValue(INDESIGNREPLACEMENTTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Crossreference.language</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the language - Language of the attribute's value that contains this crossreference as text
	 */
	public void setLanguage(final LanguageModel value)
	{
		_language = getPersistenceContext().setValue(LANGUAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Crossreference.qualifier</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the qualifier - A name/description that qualifies this reference (Does not act as unique key)
	 */
	public void setQualifier(final String value)
	{
		_qualifier = getPersistenceContext().setValue(QUALIFIER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Crossreference.source</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the source - Referencing item / Source item
	 */
	public void setSource(final ItemModel value)
	{
		_source = getPersistenceContext().setValue(SOURCE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Crossreference.target</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the target - Referenced item / Target item / Anchor
	 */
	public void setTarget(final ItemModel value)
	{
		_target = getPersistenceContext().setValue(TARGET, value);
	}
	
}
