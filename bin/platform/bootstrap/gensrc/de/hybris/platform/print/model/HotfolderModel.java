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
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type Hotfolder first defined at extension print.
 */
@SuppressWarnings("all")
public class HotfolderModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "Hotfolder";
	
	/** <i>Generated constant</i> - Attribute key of <code>Hotfolder.id</code> attribute defined at extension <code>print</code>. */
	public static final String ID = "id";
	
	/** <i>Generated constant</i> - Attribute key of <code>Hotfolder.inFolder</code> attribute defined at extension <code>print</code>. */
	public static final String INFOLDER = "inFolder";
	
	/** <i>Generated constant</i> - Attribute key of <code>Hotfolder.outFolder</code> attribute defined at extension <code>print</code>. */
	public static final String OUTFOLDER = "outFolder";
	
	/** <i>Generated constant</i> - Attribute key of <code>Hotfolder.errorFolder</code> attribute defined at extension <code>print</code>. */
	public static final String ERRORFOLDER = "errorFolder";
	
	/** <i>Generated constant</i> - Attribute key of <code>Hotfolder.command</code> attribute defined at extension <code>print</code>. */
	public static final String COMMAND = "command";
	
	/** <i>Generated constant</i> - Attribute key of <code>Hotfolder.commandId</code> attribute defined at extension <code>print</code>. */
	public static final String COMMANDID = "commandId";
	
	/** <i>Generated constant</i> - Attribute key of <code>Hotfolder.parameter</code> attribute defined at extension <code>print</code>. */
	public static final String PARAMETER = "parameter";
	
	
	/** <i>Generated variable</i> - Variable of <code>Hotfolder.id</code> attribute defined at extension <code>print</code>. */
	private Integer _id;
	
	/** <i>Generated variable</i> - Variable of <code>Hotfolder.inFolder</code> attribute defined at extension <code>print</code>. */
	private String _inFolder;
	
	/** <i>Generated variable</i> - Variable of <code>Hotfolder.outFolder</code> attribute defined at extension <code>print</code>. */
	private String _outFolder;
	
	/** <i>Generated variable</i> - Variable of <code>Hotfolder.errorFolder</code> attribute defined at extension <code>print</code>. */
	private String _errorFolder;
	
	/** <i>Generated variable</i> - Variable of <code>Hotfolder.command</code> attribute defined at extension <code>print</code>. */
	private String _command;
	
	/** <i>Generated variable</i> - Variable of <code>Hotfolder.commandId</code> attribute defined at extension <code>print</code>. */
	private Integer _commandId;
	
	/** <i>Generated variable</i> - Variable of <code>Hotfolder.parameter</code> attribute defined at extension <code>print</code>. */
	private String _parameter;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public HotfolderModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public HotfolderModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public HotfolderModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hotfolder.command</code> attribute defined at extension <code>print</code>. 
	 * @return the command
	 */
	public String getCommand()
	{
		if (this._command!=null)
		{
			return _command;
		}
		return _command = getPersistenceContext().getValue(COMMAND, _command);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hotfolder.commandId</code> attribute defined at extension <code>print</code>. 
	 * @return the commandId
	 */
	public Integer getCommandId()
	{
		if (this._commandId!=null)
		{
			return _commandId;
		}
		return _commandId = getPersistenceContext().getValue(COMMANDID, _commandId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hotfolder.errorFolder</code> attribute defined at extension <code>print</code>. 
	 * @return the errorFolder
	 */
	public String getErrorFolder()
	{
		if (this._errorFolder!=null)
		{
			return _errorFolder;
		}
		return _errorFolder = getPersistenceContext().getValue(ERRORFOLDER, _errorFolder);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hotfolder.id</code> attribute defined at extension <code>print</code>. 
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
	 * <i>Generated method</i> - Getter of the <code>Hotfolder.inFolder</code> attribute defined at extension <code>print</code>. 
	 * @return the inFolder
	 */
	public String getInFolder()
	{
		if (this._inFolder!=null)
		{
			return _inFolder;
		}
		return _inFolder = getPersistenceContext().getValue(INFOLDER, _inFolder);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hotfolder.outFolder</code> attribute defined at extension <code>print</code>. 
	 * @return the outFolder
	 */
	public String getOutFolder()
	{
		if (this._outFolder!=null)
		{
			return _outFolder;
		}
		return _outFolder = getPersistenceContext().getValue(OUTFOLDER, _outFolder);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hotfolder.parameter</code> attribute defined at extension <code>print</code>. 
	 * @return the parameter
	 */
	public String getParameter()
	{
		if (this._parameter!=null)
		{
			return _parameter;
		}
		return _parameter = getPersistenceContext().getValue(PARAMETER, _parameter);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Hotfolder.command</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the command
	 */
	public void setCommand(final String value)
	{
		_command = getPersistenceContext().setValue(COMMAND, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Hotfolder.commandId</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the commandId
	 */
	public void setCommandId(final Integer value)
	{
		_commandId = getPersistenceContext().setValue(COMMANDID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Hotfolder.errorFolder</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the errorFolder
	 */
	public void setErrorFolder(final String value)
	{
		_errorFolder = getPersistenceContext().setValue(ERRORFOLDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Hotfolder.id</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the id
	 */
	public void setId(final Integer value)
	{
		_id = getPersistenceContext().setValue(ID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Hotfolder.inFolder</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the inFolder
	 */
	public void setInFolder(final String value)
	{
		_inFolder = getPersistenceContext().setValue(INFOLDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Hotfolder.outFolder</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the outFolder
	 */
	public void setOutFolder(final String value)
	{
		_outFolder = getPersistenceContext().setValue(OUTFOLDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Hotfolder.parameter</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the parameter
	 */
	public void setParameter(final String value)
	{
		_parameter = getPersistenceContext().setValue(PARAMETER, value);
	}
	
}
