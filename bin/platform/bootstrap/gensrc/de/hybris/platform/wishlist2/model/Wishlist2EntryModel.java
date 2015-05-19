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
package de.hybris.platform.wishlist2.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.wishlist2.enums.Wishlist2EntryPriority;
import de.hybris.platform.wishlist2.model.Wishlist2Model;
import java.util.Date;

/**
 * Generated model class for type Wishlist2Entry first defined at extension wishlist.
 */
@SuppressWarnings("all")
public class Wishlist2EntryModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "Wishlist2Entry";
	
	/**<i>Generated relation code constant for relation <code>WishList22Entry</code> defining source attribute <code>wishlist</code> in extension <code>wishlist</code>.</i>*/
	public final static String _WISHLIST22ENTRY = "WishList22Entry";
	
	/** <i>Generated constant</i> - Attribute key of <code>Wishlist2Entry.product</code> attribute defined at extension <code>wishlist</code>. */
	public static final String PRODUCT = "product";
	
	/** <i>Generated constant</i> - Attribute key of <code>Wishlist2Entry.desired</code> attribute defined at extension <code>wishlist</code>. */
	public static final String DESIRED = "desired";
	
	/** <i>Generated constant</i> - Attribute key of <code>Wishlist2Entry.received</code> attribute defined at extension <code>wishlist</code>. */
	public static final String RECEIVED = "received";
	
	/** <i>Generated constant</i> - Attribute key of <code>Wishlist2Entry.priority</code> attribute defined at extension <code>wishlist</code>. */
	public static final String PRIORITY = "priority";
	
	/** <i>Generated constant</i> - Attribute key of <code>Wishlist2Entry.addedDate</code> attribute defined at extension <code>wishlist</code>. */
	public static final String ADDEDDATE = "addedDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>Wishlist2Entry.comment</code> attribute defined at extension <code>wishlist</code>. */
	public static final String COMMENT = "comment";
	
	/** <i>Generated constant</i> - Attribute key of <code>Wishlist2Entry.wishlist</code> attribute defined at extension <code>wishlist</code>. */
	public static final String WISHLIST = "wishlist";
	
	
	/** <i>Generated variable</i> - Variable of <code>Wishlist2Entry.product</code> attribute defined at extension <code>wishlist</code>. */
	private ProductModel _product;
	
	/** <i>Generated variable</i> - Variable of <code>Wishlist2Entry.desired</code> attribute defined at extension <code>wishlist</code>. */
	private Integer _desired;
	
	/** <i>Generated variable</i> - Variable of <code>Wishlist2Entry.received</code> attribute defined at extension <code>wishlist</code>. */
	private Integer _received;
	
	/** <i>Generated variable</i> - Variable of <code>Wishlist2Entry.priority</code> attribute defined at extension <code>wishlist</code>. */
	private Wishlist2EntryPriority _priority;
	
	/** <i>Generated variable</i> - Variable of <code>Wishlist2Entry.addedDate</code> attribute defined at extension <code>wishlist</code>. */
	private Date _addedDate;
	
	/** <i>Generated variable</i> - Variable of <code>Wishlist2Entry.comment</code> attribute defined at extension <code>wishlist</code>. */
	private String _comment;
	
	/** <i>Generated variable</i> - Variable of <code>Wishlist2Entry.wishlist</code> attribute defined at extension <code>wishlist</code>. */
	private Wishlist2Model _wishlist;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public Wishlist2EntryModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public Wishlist2EntryModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _addedDate initial attribute declared by type <code>Wishlist2Entry</code> at extension <code>wishlist</code>
	 * @param _priority initial attribute declared by type <code>Wishlist2Entry</code> at extension <code>wishlist</code>
	 * @param _product initial attribute declared by type <code>Wishlist2Entry</code> at extension <code>wishlist</code>
	 */
	@Deprecated
	public Wishlist2EntryModel(final Date _addedDate, final Wishlist2EntryPriority _priority, final ProductModel _product)
	{
		super();
		setAddedDate(_addedDate);
		setPriority(_priority);
		setProduct(_product);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _addedDate initial attribute declared by type <code>Wishlist2Entry</code> at extension <code>wishlist</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _priority initial attribute declared by type <code>Wishlist2Entry</code> at extension <code>wishlist</code>
	 * @param _product initial attribute declared by type <code>Wishlist2Entry</code> at extension <code>wishlist</code>
	 */
	@Deprecated
	public Wishlist2EntryModel(final Date _addedDate, final ItemModel _owner, final Wishlist2EntryPriority _priority, final ProductModel _product)
	{
		super();
		setAddedDate(_addedDate);
		setOwner(_owner);
		setPriority(_priority);
		setProduct(_product);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Wishlist2Entry.addedDate</code> attribute defined at extension <code>wishlist</code>. 
	 * @return the addedDate
	 */
	public Date getAddedDate()
	{
		if (this._addedDate!=null)
		{
			return _addedDate;
		}
		return _addedDate = getPersistenceContext().getValue(ADDEDDATE, _addedDate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Wishlist2Entry.comment</code> attribute defined at extension <code>wishlist</code>. 
	 * @return the comment
	 */
	public String getComment()
	{
		if (this._comment!=null)
		{
			return _comment;
		}
		return _comment = getPersistenceContext().getValue(COMMENT, _comment);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Wishlist2Entry.desired</code> attribute defined at extension <code>wishlist</code>. 
	 * @return the desired
	 */
	public Integer getDesired()
	{
		if (this._desired!=null)
		{
			return _desired;
		}
		return _desired = getPersistenceContext().getValue(DESIRED, _desired);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Wishlist2Entry.priority</code> attribute defined at extension <code>wishlist</code>. 
	 * @return the priority
	 */
	public Wishlist2EntryPriority getPriority()
	{
		if (this._priority!=null)
		{
			return _priority;
		}
		return _priority = getPersistenceContext().getValue(PRIORITY, _priority);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Wishlist2Entry.product</code> attribute defined at extension <code>wishlist</code>. 
	 * @return the product
	 */
	public ProductModel getProduct()
	{
		if (this._product!=null)
		{
			return _product;
		}
		return _product = getPersistenceContext().getValue(PRODUCT, _product);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Wishlist2Entry.received</code> attribute defined at extension <code>wishlist</code>. 
	 * @return the received
	 */
	public Integer getReceived()
	{
		if (this._received!=null)
		{
			return _received;
		}
		return _received = getPersistenceContext().getValue(RECEIVED, _received);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Wishlist2Entry.wishlist</code> attribute defined at extension <code>wishlist</code>. 
	 * @return the wishlist
	 */
	public Wishlist2Model getWishlist()
	{
		if (this._wishlist!=null)
		{
			return _wishlist;
		}
		return _wishlist = getPersistenceContext().getValue(WISHLIST, _wishlist);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Wishlist2Entry.addedDate</code> attribute defined at extension <code>wishlist</code>. 
	 *  
	 * @param value the addedDate
	 */
	public void setAddedDate(final Date value)
	{
		_addedDate = getPersistenceContext().setValue(ADDEDDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Wishlist2Entry.comment</code> attribute defined at extension <code>wishlist</code>. 
	 *  
	 * @param value the comment
	 */
	public void setComment(final String value)
	{
		_comment = getPersistenceContext().setValue(COMMENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Wishlist2Entry.desired</code> attribute defined at extension <code>wishlist</code>. 
	 *  
	 * @param value the desired
	 */
	public void setDesired(final Integer value)
	{
		_desired = getPersistenceContext().setValue(DESIRED, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Wishlist2Entry.priority</code> attribute defined at extension <code>wishlist</code>. 
	 *  
	 * @param value the priority
	 */
	public void setPriority(final Wishlist2EntryPriority value)
	{
		_priority = getPersistenceContext().setValue(PRIORITY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Wishlist2Entry.product</code> attribute defined at extension <code>wishlist</code>. 
	 *  
	 * @param value the product
	 */
	public void setProduct(final ProductModel value)
	{
		_product = getPersistenceContext().setValue(PRODUCT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Wishlist2Entry.received</code> attribute defined at extension <code>wishlist</code>. 
	 *  
	 * @param value the received
	 */
	public void setReceived(final Integer value)
	{
		_received = getPersistenceContext().setValue(RECEIVED, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Wishlist2Entry.wishlist</code> attribute defined at extension <code>wishlist</code>. 
	 *  
	 * @param value the wishlist
	 */
	public void setWishlist(final Wishlist2Model value)
	{
		_wishlist = getPersistenceContext().setValue(WISHLIST, value);
	}
	
}
