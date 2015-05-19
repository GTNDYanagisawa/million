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
package de.hybris.platform.comments.model;

import de.hybris.platform.comments.model.CommentAttachmentModel;
import de.hybris.platform.comments.model.CommentGroupModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.workflow.model.WorkflowModel;
import java.util.Collection;

/**
 * Generated model class for type AbstractComment first defined at extension comments.
 */
@SuppressWarnings("all")
public class AbstractCommentModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "AbstractComment";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractComment.subject</code> attribute defined at extension <code>comments</code>. */
	public static final String SUBJECT = "subject";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractComment.text</code> attribute defined at extension <code>comments</code>. */
	public static final String TEXT = "text";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractComment.attachments</code> attribute defined at extension <code>comments</code>. */
	public static final String ATTACHMENTS = "attachments";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractComment.author</code> attribute defined at extension <code>comments</code>. */
	public static final String AUTHOR = "author";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractComment.commentGroup</code> attribute defined at extension <code>print</code>. */
	public static final String COMMENTGROUP = "commentGroup";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractComment.workflow</code> attribute defined at extension <code>print</code>. */
	public static final String WORKFLOW = "workflow";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractComment.receivedByDtp</code> attribute defined at extension <code>print</code>. */
	public static final String RECEIVEDBYDTP = "receivedByDtp";
	
	
	/** <i>Generated variable</i> - Variable of <code>AbstractComment.subject</code> attribute defined at extension <code>comments</code>. */
	private String _subject;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractComment.text</code> attribute defined at extension <code>comments</code>. */
	private String _text;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractComment.attachments</code> attribute defined at extension <code>comments</code>. */
	private Collection<CommentAttachmentModel> _attachments;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractComment.author</code> attribute defined at extension <code>comments</code>. */
	private UserModel _author;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractComment.commentGroup</code> attribute defined at extension <code>print</code>. */
	private CommentGroupModel _commentGroup;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractComment.workflow</code> attribute defined at extension <code>print</code>. */
	private WorkflowModel _workflow;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractComment.receivedByDtp</code> attribute defined at extension <code>print</code>. */
	private Boolean _receivedByDtp;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AbstractCommentModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AbstractCommentModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _author initial attribute declared by type <code>AbstractComment</code> at extension <code>comments</code>
	 * @param _text initial attribute declared by type <code>AbstractComment</code> at extension <code>comments</code>
	 */
	@Deprecated
	public AbstractCommentModel(final UserModel _author, final String _text)
	{
		super();
		setAuthor(_author);
		setText(_text);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _author initial attribute declared by type <code>AbstractComment</code> at extension <code>comments</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _text initial attribute declared by type <code>AbstractComment</code> at extension <code>comments</code>
	 */
	@Deprecated
	public AbstractCommentModel(final UserModel _author, final ItemModel _owner, final String _text)
	{
		super();
		setAuthor(_author);
		setOwner(_owner);
		setText(_text);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractComment.attachments</code> attribute defined at extension <code>comments</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the attachments
	 */
	public Collection<CommentAttachmentModel> getAttachments()
	{
		if (this._attachments!=null)
		{
			return _attachments;
		}
		return _attachments = getPersistenceContext().getValue(ATTACHMENTS, _attachments);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractComment.author</code> attribute defined at extension <code>comments</code>. 
	 * @return the author
	 */
	public UserModel getAuthor()
	{
		if (this._author!=null)
		{
			return _author;
		}
		return _author = getPersistenceContext().getValue(AUTHOR, _author);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractComment.commentGroup</code> attribute defined at extension <code>print</code>. 
	 * @return the commentGroup
	 */
	public CommentGroupModel getCommentGroup()
	{
		if (this._commentGroup!=null)
		{
			return _commentGroup;
		}
		return _commentGroup = getPersistenceContext().getValue(COMMENTGROUP, _commentGroup);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractComment.receivedByDtp</code> attribute defined at extension <code>print</code>. 
	 * @return the receivedByDtp - Did a DTP operator receive this comment?
	 */
	public Boolean getReceivedByDtp()
	{
		if (this._receivedByDtp!=null)
		{
			return _receivedByDtp;
		}
		return _receivedByDtp = getPersistenceContext().getValue(RECEIVEDBYDTP, _receivedByDtp);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractComment.subject</code> attribute defined at extension <code>comments</code>. 
	 * @return the subject - Subject of a comment
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
	 * <i>Generated method</i> - Getter of the <code>AbstractComment.text</code> attribute defined at extension <code>comments</code>. 
	 * @return the text - Content of a comment
	 */
	public String getText()
	{
		if (this._text!=null)
		{
			return _text;
		}
		return _text = getPersistenceContext().getValue(TEXT, _text);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractComment.workflow</code> attribute defined at extension <code>print</code>. 
	 * @return the workflow
	 */
	public WorkflowModel getWorkflow()
	{
		if (this._workflow!=null)
		{
			return _workflow;
		}
		return _workflow = getPersistenceContext().getValue(WORKFLOW, _workflow);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractComment.attachments</code> attribute defined at extension <code>comments</code>. 
	 *  
	 * @param value the attachments
	 */
	public void setAttachments(final Collection<CommentAttachmentModel> value)
	{
		_attachments = getPersistenceContext().setValue(ATTACHMENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>AbstractComment.author</code> attribute defined at extension <code>comments</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the author
	 */
	public void setAuthor(final UserModel value)
	{
		_author = getPersistenceContext().setValue(AUTHOR, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractComment.commentGroup</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the commentGroup
	 */
	public void setCommentGroup(final CommentGroupModel value)
	{
		_commentGroup = getPersistenceContext().setValue(COMMENTGROUP, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractComment.receivedByDtp</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the receivedByDtp - Did a DTP operator receive this comment?
	 */
	public void setReceivedByDtp(final Boolean value)
	{
		_receivedByDtp = getPersistenceContext().setValue(RECEIVEDBYDTP, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractComment.subject</code> attribute defined at extension <code>comments</code>. 
	 *  
	 * @param value the subject - Subject of a comment
	 */
	public void setSubject(final String value)
	{
		_subject = getPersistenceContext().setValue(SUBJECT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractComment.text</code> attribute defined at extension <code>comments</code>. 
	 *  
	 * @param value the text - Content of a comment
	 */
	public void setText(final String value)
	{
		_text = getPersistenceContext().setValue(TEXT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractComment.workflow</code> attribute defined at extension <code>print</code>. 
	 *  
	 * @param value the workflow
	 */
	public void setWorkflow(final WorkflowModel value)
	{
		_workflow = getPersistenceContext().setValue(WORKFLOW, value);
	}
	
}
