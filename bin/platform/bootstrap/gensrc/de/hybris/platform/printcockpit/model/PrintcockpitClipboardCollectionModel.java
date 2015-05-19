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
package de.hybris.platform.printcockpit.model;

import de.hybris.platform.cockpit.enums.CockpitSpecialCollectionType;
import de.hybris.platform.cockpit.model.CockpitObjectSpecialCollectionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type PrintcockpitClipboardCollection first defined at extension printcockpit.
 */
@SuppressWarnings("all")
public class PrintcockpitClipboardCollectionModel extends CockpitObjectSpecialCollectionModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PrintcockpitClipboardCollection";
	
	/** <i>Generated constant</i> - Attribute key of <code>PrintcockpitClipboardCollection.cut</code> attribute defined at extension <code>printcockpit</code>. */
	public static final String CUT = "cut";
	
	
	/** <i>Generated variable</i> - Variable of <code>PrintcockpitClipboardCollection.cut</code> attribute defined at extension <code>printcockpit</code>. */
	private Boolean _cut;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PrintcockpitClipboardCollectionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PrintcockpitClipboardCollectionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _collectionType initial attribute declared by type <code>CockpitObjectSpecialCollection</code> at extension <code>cockpit</code>
	 * @param _cut initial attribute declared by type <code>PrintcockpitClipboardCollection</code> at extension <code>printcockpit</code>
	 * @param _qualifier initial attribute declared by type <code>CockpitObjectAbstractCollection</code> at extension <code>cockpit</code>
	 */
	@Deprecated
	public PrintcockpitClipboardCollectionModel(final CockpitSpecialCollectionType _collectionType, final boolean _cut, final String _qualifier)
	{
		super();
		setCollectionType(_collectionType);
		setCut(_cut);
		setQualifier(_qualifier);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _collectionType initial attribute declared by type <code>CockpitObjectSpecialCollection</code> at extension <code>cockpit</code>
	 * @param _cut initial attribute declared by type <code>PrintcockpitClipboardCollection</code> at extension <code>printcockpit</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _qualifier initial attribute declared by type <code>CockpitObjectAbstractCollection</code> at extension <code>cockpit</code>
	 */
	@Deprecated
	public PrintcockpitClipboardCollectionModel(final CockpitSpecialCollectionType _collectionType, final boolean _cut, final ItemModel _owner, final String _qualifier)
	{
		super();
		setCollectionType(_collectionType);
		setCut(_cut);
		setOwner(_owner);
		setQualifier(_qualifier);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PrintcockpitClipboardCollection.cut</code> attribute defined at extension <code>printcockpit</code>. 
	 * @return the cut
	 */
	public boolean isCut()
	{
		return toPrimitive( _cut = getPersistenceContext().getValue(CUT, _cut));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PrintcockpitClipboardCollection.cut</code> attribute defined at extension <code>printcockpit</code>. 
	 *  
	 * @param value the cut
	 */
	public void setCut(final boolean value)
	{
		_cut = getPersistenceContext().setValue(CUT, toObject(value));
	}
	
}
