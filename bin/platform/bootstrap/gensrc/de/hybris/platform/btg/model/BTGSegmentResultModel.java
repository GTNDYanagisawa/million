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
package de.hybris.platform.btg.model;

import de.hybris.platform.btg.enums.BTGResultScope;
import de.hybris.platform.btg.model.BTGAbstractResultModel;
import de.hybris.platform.btg.model.BTGSegmentModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type BTGSegmentResult first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGSegmentResultModel extends BTGAbstractResultModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGSegmentResult";
	
	/**<i>Generated relation code constant for relation <code>BTGSegmentBTGSegmentResultRelation</code> defining source attribute <code>segment</code> in extension <code>btg</code>.</i>*/
	public final static String _BTGSEGMENTBTGSEGMENTRESULTRELATION = "BTGSegmentBTGSegmentResultRelation";
	
	/**<i>Generated relation code constant for relation <code>UserBTGSegmentResultRelation</code> defining source attribute <code>user</code> in extension <code>btg</code>.</i>*/
	public final static String _USERBTGSEGMENTRESULTRELATION = "UserBTGSegmentResultRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGSegmentResult.segment</code> attribute defined at extension <code>btg</code>. */
	public static final String SEGMENT = "segment";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGSegmentResult.user</code> attribute defined at extension <code>btg</code>. */
	public static final String USER = "user";
	
	
	/** <i>Generated variable</i> - Variable of <code>BTGSegmentResult.segment</code> attribute defined at extension <code>btg</code>. */
	private BTGSegmentModel _segment;
	
	/** <i>Generated variable</i> - Variable of <code>BTGSegmentResult.user</code> attribute defined at extension <code>btg</code>. */
	private UserModel _user;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGSegmentResultModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGSegmentResultModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _resultScope initial attribute declared by type <code>BTGAbstractResult</code> at extension <code>btg</code>
	 * @param _segment initial attribute declared by type <code>BTGSegmentResult</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGSegmentResultModel(final BTGResultScope _resultScope, final BTGSegmentModel _segment)
	{
		super();
		setResultScope(_resultScope);
		setSegment(_segment);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _resultScope initial attribute declared by type <code>BTGAbstractResult</code> at extension <code>btg</code>
	 * @param _segment initial attribute declared by type <code>BTGSegmentResult</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGSegmentResultModel(final ItemModel _owner, final BTGResultScope _resultScope, final BTGSegmentModel _segment)
	{
		super();
		setOwner(_owner);
		setResultScope(_resultScope);
		setSegment(_segment);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGSegmentResult.segment</code> attribute defined at extension <code>btg</code>. 
	 * @return the segment
	 */
	public BTGSegmentModel getSegment()
	{
		if (this._segment!=null)
		{
			return _segment;
		}
		return _segment = getPersistenceContext().getValue(SEGMENT, _segment);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGSegmentResult.user</code> attribute defined at extension <code>btg</code>. 
	 * @return the user
	 */
	public UserModel getUser()
	{
		if (this._user!=null)
		{
			return _user;
		}
		return _user = getPersistenceContext().getValue(USER, _user);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGSegmentResult.segment</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the segment
	 */
	public void setSegment(final BTGSegmentModel value)
	{
		_segment = getPersistenceContext().setValue(SEGMENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGSegmentResult.user</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the user
	 */
	public void setUser(final UserModel value)
	{
		_user = getPersistenceContext().setValue(USER, value);
	}
	
}
