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
package de.hybris.platform.print.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.security.PrincipalModel;
import de.hybris.platform.print.model.PublicationModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.List;

/**
 * Generated model class for type PublicationComponent first defined at extension print.
 */
@SuppressWarnings("all")
public class PublicationComponentModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PublicationComponent";
	
	/**<i>Generated relation code constant for relation <code>Publication2PublicationComponentRelation</code> defining source attribute <code>publication</code> in extension <code>print</code>.</i>*/
	public final static String _PUBLICATION2PUBLICATIONCOMPONENTRELATION = "Publication2PublicationComponentRelation";
	
	/**<i>Generated relation code constant for relation <code>Principal2WriteablePublicationComponentRelation</code> defining source attribute <code>writePrincipals</code> in extension <code>print</code>.</i>*/
	public final static String _PRINCIPAL2WRITEABLEPUBLICATIONCOMPONENTRELATION = "Principal2WriteablePublicationComponentRelation";
	
	/**<i>Generated relation code constant for relation <code>Principal2ReadablePublicationComponentRelation</code> defining source attribute <code>readPrincipals</code> in extension <code>print</code>.</i>*/
	public final static String _PRINCIPAL2READABLEPUBLICATIONCOMPONENTRELATION = "Principal2ReadablePublicationComponentRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>PublicationComponent.id</code> attribute defined at extension <code>print</code>. */
	public static final String ID = "id";
	
	/** <i>Generated constant</i> - Attribute key of <code>PublicationComponent.publication</code> attribute defined at extension <code>print</code>. */
	public static final String PUBLICATION = "publication";
	
	/** <i>Generated constant</i> - Attribute key of <code>PublicationComponent.writePrincipals</code> attribute defined at extension <code>print</code>. */
	public static final String WRITEPRINCIPALS = "writePrincipals";
	
	/** <i>Generated constant</i> - Attribute key of <code>PublicationComponent.readPrincipals</code> attribute defined at extension <code>print</code>. */
	public static final String READPRINCIPALS = "readPrincipals";
	
	
	/** <i>Generated variable</i> - Variable of <code>PublicationComponent.id</code> attribute defined at extension <code>print</code>. */
	private String _id;
	
	/** <i>Generated variable</i> - Variable of <code>PublicationComponent.publication</code> attribute defined at extension <code>print</code>. */
	private PublicationModel _publication;
	
	/** <i>Generated variable</i> - Variable of <code>PublicationComponent.writePrincipals</code> attribute defined at extension <code>print</code>. */
	private List<PrincipalModel> _writePrincipals;
	
	/** <i>Generated variable</i> - Variable of <code>PublicationComponent.readPrincipals</code> attribute defined at extension <code>print</code>. */
	private List<PrincipalModel> _readPrincipals;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PublicationComponentModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PublicationComponentModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _publication initial attribute declared by type <code>PublicationComponent</code> at extension <code>print</code>
	 */
	@Deprecated
	public PublicationComponentModel(final PublicationModel _publication)
	{
		super();
		setPublication(_publication);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _publication initial attribute declared by type <code>PublicationComponent</code> at extension <code>print</code>
	 */
	@Deprecated
	public PublicationComponentModel(final ItemModel _owner, final PublicationModel _publication)
	{
		super();
		setOwner(_owner);
		setPublication(_publication);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PublicationComponent.id</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>PublicationComponent.publication</code> attribute defined at extension <code>print</code>. 
	 * @return the publication
	 */
	public PublicationModel getPublication()
	{
		if (this._publication!=null)
		{
			return _publication;
		}
		return _publication = getPersistenceContext().getValue(PUBLICATION, _publication);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PublicationComponent.readPrincipals</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the readPrincipals
	 */
	public List<PrincipalModel> getReadPrincipals()
	{
		if (this._readPrincipals!=null)
		{
			return _readPrincipals;
		}
		return _readPrincipals = getPersistenceContext().getValue(READPRINCIPALS, _readPrincipals);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PublicationComponent.writePrincipals</code> attribute defined at extension <code>print</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the writePrincipals
	 */
	public List<PrincipalModel> getWritePrincipals()
	{
		if (this._writePrincipals!=null)
		{
			return _writePrincipals;
		}
		return _writePrincipals = getPersistenceContext().getValue(WRITEPRINCIPALS, _writePrincipals);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PublicationComponent.id</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the id
	 */
	public void setId(final String value)
	{
		_id = getPersistenceContext().setValue(ID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PublicationComponent.publication</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the publication
	 */
	public void setPublication(final PublicationModel value)
	{
		_publication = getPersistenceContext().setValue(PUBLICATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PublicationComponent.readPrincipals</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the readPrincipals
	 */
	public void setReadPrincipals(final List<PrincipalModel> value)
	{
		_readPrincipals = getPersistenceContext().setValue(READPRINCIPALS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PublicationComponent.writePrincipals</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the writePrincipals
	 */
	public void setWritePrincipals(final List<PrincipalModel> value)
	{
		_writePrincipals = getPersistenceContext().setValue(WRITEPRINCIPALS, value);
	}
	
}
