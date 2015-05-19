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
import de.hybris.platform.print.model.CometConfigurationModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type Action first defined at extension print.
 */
@SuppressWarnings("all")
public class ActionModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "Action";
	
	/** <i>Generated constant</i> - Attribute key of <code>Action.id</code> attribute defined at extension <code>print</code>. */
	public static final String ID = "id";
	
	/** <i>Generated constant</i> - Attribute key of <code>Action.name</code> attribute defined at extension <code>print</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>Action.sequenceNr</code> attribute defined at extension <code>print</code>. */
	public static final String SEQUENCENR = "sequenceNr";
	
	/** <i>Generated constant</i> - Attribute key of <code>Action.actionType</code> attribute defined at extension <code>print</code>. */
	public static final String ACTIONTYPE = "actionType";
	
	/** <i>Generated constant</i> - Attribute key of <code>Action.domainId</code> attribute defined at extension <code>print</code>. */
	public static final String DOMAINID = "domainId";
	
	/** <i>Generated constant</i> - Attribute key of <code>Action.classId</code> attribute defined at extension <code>print</code>. */
	public static final String CLASSID = "classId";
	
	/** <i>Generated constant</i> - Attribute key of <code>Action.cometConfig</code> attribute defined at extension <code>print</code>. */
	public static final String COMETCONFIG = "cometConfig";
	
	
	/** <i>Generated variable</i> - Variable of <code>Action.id</code> attribute defined at extension <code>print</code>. */
	private Integer _id;
	
	/** <i>Generated variable</i> - Variable of <code>Action.name</code> attribute defined at extension <code>print</code>. */
	private String _name;
	
	/** <i>Generated variable</i> - Variable of <code>Action.sequenceNr</code> attribute defined at extension <code>print</code>. */
	private Integer _sequenceNr;
	
	/** <i>Generated variable</i> - Variable of <code>Action.actionType</code> attribute defined at extension <code>print</code>. */
	private Integer _actionType;
	
	/** <i>Generated variable</i> - Variable of <code>Action.domainId</code> attribute defined at extension <code>print</code>. */
	private Integer _domainId;
	
	/** <i>Generated variable</i> - Variable of <code>Action.classId</code> attribute defined at extension <code>print</code>. */
	private Integer _classId;
	
	/** <i>Generated variable</i> - Variable of <code>Action.cometConfig</code> attribute defined at extension <code>print</code>. */
	private CometConfigurationModel _cometConfig;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ActionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ActionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _cometConfig initial attribute declared by type <code>Action</code> at extension <code>print</code>
	 */
	@Deprecated
	public ActionModel(final CometConfigurationModel _cometConfig)
	{
		super();
		setCometConfig(_cometConfig);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _cometConfig initial attribute declared by type <code>Action</code> at extension <code>print</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public ActionModel(final CometConfigurationModel _cometConfig, final ItemModel _owner)
	{
		super();
		setCometConfig(_cometConfig);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Action.actionType</code> attribute defined at extension <code>print</code>. 
	 * @return the actionType
	 */
	public Integer getActionType()
	{
		if (this._actionType!=null)
		{
			return _actionType;
		}
		return _actionType = getPersistenceContext().getValue(ACTIONTYPE, _actionType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Action.classId</code> attribute defined at extension <code>print</code>. 
	 * @return the classId
	 */
	public Integer getClassId()
	{
		if (this._classId!=null)
		{
			return _classId;
		}
		return _classId = getPersistenceContext().getValue(CLASSID, _classId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Action.cometConfig</code> attribute defined at extension <code>print</code>. 
	 * @return the cometConfig
	 */
	public CometConfigurationModel getCometConfig()
	{
		if (this._cometConfig!=null)
		{
			return _cometConfig;
		}
		return _cometConfig = getPersistenceContext().getValue(COMETCONFIG, _cometConfig);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Action.domainId</code> attribute defined at extension <code>print</code>. 
	 * @return the domainId
	 */
	public Integer getDomainId()
	{
		if (this._domainId!=null)
		{
			return _domainId;
		}
		return _domainId = getPersistenceContext().getValue(DOMAINID, _domainId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Action.id</code> attribute defined at extension <code>print</code>. 
	 * @return the id
	 */
	public Integer getId()
	{
		if (this._id!=null)
		{
			return _id;
		}
		return _id = getPersistenceContext().getValue(ID, _id);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Action.name</code> attribute defined at extension <code>print</code>. 
	 * @return the name
	 */
	public String getName()
	{
		if (this._name!=null)
		{
			return _name;
		}
		return _name = getPersistenceContext().getValue(NAME, _name);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Action.sequenceNr</code> attribute defined at extension <code>print</code>. 
	 * @return the sequenceNr
	 */
	public Integer getSequenceNr()
	{
		if (this._sequenceNr!=null)
		{
			return _sequenceNr;
		}
		return _sequenceNr = getPersistenceContext().getValue(SEQUENCENR, _sequenceNr);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Action.actionType</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the actionType
	 */
	public void setActionType(final Integer value)
	{
		_actionType = getPersistenceContext().setValue(ACTIONTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Action.classId</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the classId
	 */
	public void setClassId(final Integer value)
	{
		_classId = getPersistenceContext().setValue(CLASSID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Action.cometConfig</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the cometConfig
	 */
	public void setCometConfig(final CometConfigurationModel value)
	{
		_cometConfig = getPersistenceContext().setValue(COMETCONFIG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Action.domainId</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the domainId
	 */
	public void setDomainId(final Integer value)
	{
		_domainId = getPersistenceContext().setValue(DOMAINID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Action.id</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the id
	 */
	public void setId(final Integer value)
	{
		_id = getPersistenceContext().setValue(ID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Action.name</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the name
	 */
	public void setName(final String value)
	{
		_name = getPersistenceContext().setValue(NAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Action.sequenceNr</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the sequenceNr
	 */
	public void setSequenceNr(final Integer value)
	{
		_sequenceNr = getPersistenceContext().setValue(SEQUENCENR, value);
	}
	
}
