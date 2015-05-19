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
package de.hybris.platform.core.model.type;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.type.AttributeDescriptorModel;
import de.hybris.platform.core.model.type.ComposedTypeModel;
import de.hybris.platform.core.model.type.DescriptorModel;
import de.hybris.platform.core.model.type.TypeModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.validation.model.constraints.AttributeConstraintModel;
import java.util.Locale;
import java.util.Set;

/**
 * Generated model class for type AttributeDescriptor first defined at extension core.
 */
@SuppressWarnings("all")
public class AttributeDescriptorModel extends DescriptorModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "AttributeDescriptor";
	
	/**<i>Generated relation code constant for relation <code>AttributeConstraintAttributeDescRelation</code> defining source attribute <code>constraints</code> in extension <code>validation</code>.</i>*/
	public final static String _ATTRIBUTECONSTRAINTATTRIBUTEDESCRELATION = "AttributeConstraintAttributeDescRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeDescriptor.databaseColumn</code> attribute defined at extension <code>core</code>. */
	public static final String DATABASECOLUMN = "databaseColumn";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeDescriptor.defaultValue</code> attribute defined at extension <code>core</code>. */
	public static final String DEFAULTVALUE = "defaultValue";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeDescriptor.enclosingType</code> attribute defined at extension <code>core</code>. */
	public static final String ENCLOSINGTYPE = "enclosingType";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeDescriptor.declaringEnclosingType</code> attribute defined at extension <code>core</code>. */
	public static final String DECLARINGENCLOSINGTYPE = "declaringEnclosingType";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeDescriptor.description</code> attribute defined at extension <code>core</code>. */
	public static final String DESCRIPTION = "description";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeDescriptor.persistenceClass</code> attribute defined at extension <code>core</code>. */
	public static final String PERSISTENCECLASS = "persistenceClass";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeDescriptor.attributeHandler</code> attribute defined at extension <code>core</code>. */
	public static final String ATTRIBUTEHANDLER = "attributeHandler";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeDescriptor.selectionOf</code> attribute defined at extension <code>core</code>. */
	public static final String SELECTIONOF = "selectionOf";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeDescriptor.proposedDatabaseColumn</code> attribute defined at extension <code>core</code>. */
	public static final String PROPOSEDDATABASECOLUMN = "proposedDatabaseColumn";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeDescriptor.modifiers</code> attribute defined at extension <code>core</code>. */
	public static final String MODIFIERS = "modifiers";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeDescriptor.initial</code> attribute defined at extension <code>core</code>. */
	public static final String INITIAL = "initial";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeDescriptor.localized</code> attribute defined at extension <code>core</code>. */
	public static final String LOCALIZED = "localized";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeDescriptor.optional</code> attribute defined at extension <code>core</code>. */
	public static final String OPTIONAL = "optional";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeDescriptor.partOf</code> attribute defined at extension <code>core</code>. */
	public static final String PARTOF = "partOf";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeDescriptor.unique</code> attribute defined at extension <code>core</code>. */
	public static final String UNIQUE = "unique";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeDescriptor.private</code> attribute defined at extension <code>core</code>. */
	public static final String PRIVATE = "private";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeDescriptor.property</code> attribute defined at extension <code>core</code>. */
	public static final String PROPERTY = "property";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeDescriptor.readable</code> attribute defined at extension <code>core</code>. */
	public static final String READABLE = "readable";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeDescriptor.removable</code> attribute defined at extension <code>core</code>. */
	public static final String REMOVABLE = "removable";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeDescriptor.search</code> attribute defined at extension <code>core</code>. */
	public static final String SEARCH = "search";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeDescriptor.writable</code> attribute defined at extension <code>core</code>. */
	public static final String WRITABLE = "writable";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeDescriptor.encrypted</code> attribute defined at extension <code>core</code>. */
	public static final String ENCRYPTED = "encrypted";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeDescriptor.primitive</code> attribute defined at extension <code>core</code>. */
	public static final String PRIMITIVE = "primitive";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeDescriptor.hiddenForUI</code> attribute defined at extension <code>core</code>. */
	public static final String HIDDENFORUI = "hiddenForUI";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeDescriptor.readOnlyForUI</code> attribute defined at extension <code>core</code>. */
	public static final String READONLYFORUI = "readOnlyForUI";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeDescriptor.constraints</code> attribute defined at extension <code>validation</code>. */
	public static final String CONSTRAINTS = "constraints";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeDescriptor.dontCopy</code> attribute defined at extension <code>catalog</code>. */
	public static final String DONTCOPY = "dontCopy";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeDescriptor.forceLuceneIndexable</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String FORCELUCENEINDEXABLE = "forceLuceneIndexable";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeDescriptor.hmcIndexField</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String HMCINDEXFIELD = "hmcIndexField";
	
	
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.databaseColumn</code> attribute defined at extension <code>core</code>. */
	private String _databaseColumn;
	
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.defaultValue</code> attribute defined at extension <code>core</code>. */
	private Object _defaultValue;
	
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.enclosingType</code> attribute defined at extension <code>core</code>. */
	private ComposedTypeModel _enclosingType;
	
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.declaringEnclosingType</code> attribute defined at extension <code>core</code>. */
	private ComposedTypeModel _declaringEnclosingType;
	
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.persistenceClass</code> attribute defined at extension <code>core</code>. */
	private Class _persistenceClass;
	
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.attributeHandler</code> attribute defined at extension <code>core</code>. */
	private String _attributeHandler;
	
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.selectionOf</code> attribute defined at extension <code>core</code>. */
	private AttributeDescriptorModel _selectionOf;
	
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.proposedDatabaseColumn</code> attribute defined at extension <code>core</code>. */
	private String _proposedDatabaseColumn;
	
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.modifiers</code> attribute defined at extension <code>core</code>. */
	private Integer _modifiers;
	
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.initial</code> attribute defined at extension <code>core</code>. */
	private Boolean _initial;
	
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.localized</code> attribute defined at extension <code>core</code>. */
	private Boolean _localized;
	
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.optional</code> attribute defined at extension <code>core</code>. */
	private Boolean _optional;
	
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.partOf</code> attribute defined at extension <code>core</code>. */
	private Boolean _partOf;
	
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.unique</code> attribute defined at extension <code>core</code>. */
	private Boolean _unique;
	
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.private</code> attribute defined at extension <code>core</code>. */
	private Boolean _private;
	
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.property</code> attribute defined at extension <code>core</code>. */
	private Boolean _property;
	
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.readable</code> attribute defined at extension <code>core</code>. */
	private Boolean _readable;
	
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.removable</code> attribute defined at extension <code>core</code>. */
	private Boolean _removable;
	
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.search</code> attribute defined at extension <code>core</code>. */
	private Boolean _search;
	
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.writable</code> attribute defined at extension <code>core</code>. */
	private Boolean _writable;
	
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.encrypted</code> attribute defined at extension <code>core</code>. */
	private Boolean _encrypted;
	
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.primitive</code> attribute defined at extension <code>core</code>. */
	private Boolean _primitive;
	
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.hiddenForUI</code> attribute defined at extension <code>core</code>. */
	private Boolean _hiddenForUI;
	
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.readOnlyForUI</code> attribute defined at extension <code>core</code>. */
	private Boolean _readOnlyForUI;
	
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.constraints</code> attribute defined at extension <code>validation</code>. */
	private Set<AttributeConstraintModel> _constraints;
	
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.dontCopy</code> attribute defined at extension <code>catalog</code>. */
	private Boolean _dontCopy;
	
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.forceLuceneIndexable</code> attribute defined at extension <code>lucenesearch</code>. */
	private Boolean _forceLuceneIndexable;
	
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.hmcIndexField</code> attribute defined at extension <code>lucenesearch</code>. */
	private String _hmcIndexField;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AttributeDescriptorModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AttributeDescriptorModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _attributeType initial attribute declared by type <code>Descriptor</code> at extension <code>core</code>
	 * @param _enclosingType initial attribute declared by type <code>AttributeDescriptor</code> at extension <code>core</code>
	 * @param _generate initial attribute declared by type <code>TypeManagerManaged</code> at extension <code>core</code>
	 * @param _partOf initial attribute declared by type <code>AttributeDescriptor</code> at extension <code>core</code>
	 * @param _qualifier initial attribute declared by type <code>Descriptor</code> at extension <code>core</code>
	 */
	@Deprecated
	public AttributeDescriptorModel(final TypeModel _attributeType, final ComposedTypeModel _enclosingType, final Boolean _generate, final Boolean _partOf, final String _qualifier)
	{
		super();
		setAttributeType(_attributeType);
		setEnclosingType(_enclosingType);
		setGenerate(_generate);
		setPartOf(_partOf);
		setQualifier(_qualifier);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _attributeType initial attribute declared by type <code>Descriptor</code> at extension <code>core</code>
	 * @param _enclosingType initial attribute declared by type <code>AttributeDescriptor</code> at extension <code>core</code>
	 * @param _generate initial attribute declared by type <code>TypeManagerManaged</code> at extension <code>core</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _partOf initial attribute declared by type <code>AttributeDescriptor</code> at extension <code>core</code>
	 * @param _qualifier initial attribute declared by type <code>Descriptor</code> at extension <code>core</code>
	 */
	@Deprecated
	public AttributeDescriptorModel(final TypeModel _attributeType, final ComposedTypeModel _enclosingType, final Boolean _generate, final ItemModel _owner, final Boolean _partOf, final String _qualifier)
	{
		super();
		setAttributeType(_attributeType);
		setEnclosingType(_enclosingType);
		setGenerate(_generate);
		setOwner(_owner);
		setPartOf(_partOf);
		setQualifier(_qualifier);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeDescriptor.attributeHandler</code> attribute defined at extension <code>core</code>. 
	 * @return the attributeHandler
	 */
	public String getAttributeHandler()
	{
		if (this._attributeHandler!=null)
		{
			return _attributeHandler;
		}
		return _attributeHandler = getPersistenceContext().getValue(ATTRIBUTEHANDLER, _attributeHandler);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeDescriptor.constraints</code> attribute defined at extension <code>validation</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the constraints
	 */
	public Set<AttributeConstraintModel> getConstraints()
	{
		if (this._constraints!=null)
		{
			return _constraints;
		}
		return _constraints = getPersistenceContext().getValue(CONSTRAINTS, _constraints);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeDescriptor.databaseColumn</code> attribute defined at extension <code>core</code>. 
	 * @return the databaseColumn
	 */
	public String getDatabaseColumn()
	{
		if (this._databaseColumn!=null)
		{
			return _databaseColumn;
		}
		return _databaseColumn = getPersistenceContext().getValue(DATABASECOLUMN, _databaseColumn);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeDescriptor.declaringEnclosingType</code> attribute defined at extension <code>core</code>. 
	 * @return the declaringEnclosingType
	 */
	public ComposedTypeModel getDeclaringEnclosingType()
	{
		if (this._declaringEnclosingType!=null)
		{
			return _declaringEnclosingType;
		}
		return _declaringEnclosingType = getPersistenceContext().getValue(DECLARINGENCLOSINGTYPE, _declaringEnclosingType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeDescriptor.defaultValue</code> attribute defined at extension <code>core</code>. 
	 * @return the defaultValue
	 */
	public Object getDefaultValue()
	{
		if (this._defaultValue!=null)
		{
			return _defaultValue;
		}
		return _defaultValue = getPersistenceContext().getValue(DEFAULTVALUE, _defaultValue);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeDescriptor.description</code> attribute defined at extension <code>core</code>. 
	 * @return the description
	 */
	public String getDescription()
	{
		return getDescription(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeDescriptor.description</code> attribute defined at extension <code>core</code>. 
	 * @param loc the value localization key 
	 * @return the description
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getDescription(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(DESCRIPTION, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeDescriptor.dontCopy</code> attribute defined at extension <code>catalog</code>. 
	 * @return the dontCopy
	 */
	public Boolean getDontCopy()
	{
		if (this._dontCopy!=null)
		{
			return _dontCopy;
		}
		return _dontCopy = getPersistenceContext().getValue(DONTCOPY, _dontCopy);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeDescriptor.enclosingType</code> attribute defined at extension <code>core</code>. 
	 * @return the enclosingType
	 */
	public ComposedTypeModel getEnclosingType()
	{
		if (this._enclosingType!=null)
		{
			return _enclosingType;
		}
		return _enclosingType = getPersistenceContext().getValue(ENCLOSINGTYPE, _enclosingType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeDescriptor.encrypted</code> attribute defined at extension <code>core</code>. 
	 * @return the encrypted
	 */
	public Boolean getEncrypted()
	{
		if (this._encrypted!=null)
		{
			return _encrypted;
		}
		return _encrypted = getPersistenceContext().getValue(ENCRYPTED, _encrypted);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeDescriptor.forceLuceneIndexable</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the forceLuceneIndexable
	 */
	public Boolean getForceLuceneIndexable()
	{
		if (this._forceLuceneIndexable!=null)
		{
			return _forceLuceneIndexable;
		}
		return _forceLuceneIndexable = getPersistenceContext().getValue(FORCELUCENEINDEXABLE, _forceLuceneIndexable);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeDescriptor.hiddenForUI</code> attribute defined at extension <code>core</code>. 
	 * @return the hiddenForUI
	 */
	public Boolean getHiddenForUI()
	{
		if (this._hiddenForUI!=null)
		{
			return _hiddenForUI;
		}
		return _hiddenForUI = getPersistenceContext().getValue(HIDDENFORUI, _hiddenForUI);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeDescriptor.hmcIndexField</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the hmcIndexField
	 */
	public String getHmcIndexField()
	{
		if (this._hmcIndexField!=null)
		{
			return _hmcIndexField;
		}
		return _hmcIndexField = getPersistenceContext().getValue(HMCINDEXFIELD, _hmcIndexField);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeDescriptor.initial</code> attribute defined at extension <code>core</code>. 
	 * @return the initial
	 */
	public Boolean getInitial()
	{
		if (this._initial!=null)
		{
			return _initial;
		}
		return _initial = getPersistenceContext().getValue(INITIAL, _initial);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeDescriptor.localized</code> attribute defined at extension <code>core</code>. 
	 * @return the localized
	 */
	public Boolean getLocalized()
	{
		if (this._localized!=null)
		{
			return _localized;
		}
		return _localized = getPersistenceContext().getValue(LOCALIZED, _localized);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeDescriptor.modifiers</code> attribute defined at extension <code>core</code>. 
	 * @return the modifiers
	 */
	public Integer getModifiers()
	{
		if (this._modifiers!=null)
		{
			return _modifiers;
		}
		return _modifiers = getPersistenceContext().getValue(MODIFIERS, _modifiers);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeDescriptor.optional</code> attribute defined at extension <code>core</code>. 
	 * @return the optional
	 */
	public Boolean getOptional()
	{
		if (this._optional!=null)
		{
			return _optional;
		}
		return _optional = getPersistenceContext().getValue(OPTIONAL, _optional);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeDescriptor.partOf</code> attribute defined at extension <code>core</code>. 
	 * @return the partOf
	 */
	public Boolean getPartOf()
	{
		if (this._partOf!=null)
		{
			return _partOf;
		}
		return _partOf = getPersistenceContext().getValue(PARTOF, _partOf);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeDescriptor.persistenceClass</code> attribute defined at extension <code>core</code>. 
	 * @return the persistenceClass
	 */
	public Class getPersistenceClass()
	{
		if (this._persistenceClass!=null)
		{
			return _persistenceClass;
		}
		return _persistenceClass = getPersistenceContext().getValue(PERSISTENCECLASS, _persistenceClass);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeDescriptor.primitive</code> attribute defined at extension <code>core</code>. 
	 * @return the primitive
	 */
	public Boolean getPrimitive()
	{
		if (this._primitive!=null)
		{
			return _primitive;
		}
		return _primitive = getPersistenceContext().getValue(PRIMITIVE, _primitive);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeDescriptor.private</code> attribute defined at extension <code>core</code>. 
	 * @return the private
	 */
	public Boolean getPrivate()
	{
		if (this._private!=null)
		{
			return _private;
		}
		return _private = getPersistenceContext().getValue(PRIVATE, _private);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeDescriptor.property</code> attribute defined at extension <code>core</code>. 
	 * @return the property
	 */
	public Boolean getProperty()
	{
		if (this._property!=null)
		{
			return _property;
		}
		return _property = getPersistenceContext().getValue(PROPERTY, _property);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeDescriptor.proposedDatabaseColumn</code> attribute defined at extension <code>core</code>. 
	 * @return the proposedDatabaseColumn
	 */
	public String getProposedDatabaseColumn()
	{
		if (this._proposedDatabaseColumn!=null)
		{
			return _proposedDatabaseColumn;
		}
		return _proposedDatabaseColumn = getPersistenceContext().getValue(PROPOSEDDATABASECOLUMN, _proposedDatabaseColumn);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeDescriptor.readable</code> attribute defined at extension <code>core</code>. 
	 * @return the readable
	 */
	public Boolean getReadable()
	{
		if (this._readable!=null)
		{
			return _readable;
		}
		return _readable = getPersistenceContext().getValue(READABLE, _readable);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeDescriptor.readOnlyForUI</code> attribute defined at extension <code>core</code>. 
	 * @return the readOnlyForUI
	 */
	public Boolean getReadOnlyForUI()
	{
		if (this._readOnlyForUI!=null)
		{
			return _readOnlyForUI;
		}
		return _readOnlyForUI = getPersistenceContext().getValue(READONLYFORUI, _readOnlyForUI);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeDescriptor.removable</code> attribute defined at extension <code>core</code>. 
	 * @return the removable
	 */
	public Boolean getRemovable()
	{
		if (this._removable!=null)
		{
			return _removable;
		}
		return _removable = getPersistenceContext().getValue(REMOVABLE, _removable);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeDescriptor.search</code> attribute defined at extension <code>core</code>. 
	 * @return the search
	 */
	public Boolean getSearch()
	{
		if (this._search!=null)
		{
			return _search;
		}
		return _search = getPersistenceContext().getValue(SEARCH, _search);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeDescriptor.selectionOf</code> attribute defined at extension <code>core</code>. 
	 * @return the selectionOf
	 */
	public AttributeDescriptorModel getSelectionOf()
	{
		if (this._selectionOf!=null)
		{
			return _selectionOf;
		}
		return _selectionOf = getPersistenceContext().getValue(SELECTIONOF, _selectionOf);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeDescriptor.unique</code> attribute defined at extension <code>core</code>. 
	 * @return the unique
	 */
	public Boolean getUnique()
	{
		if (this._unique!=null)
		{
			return _unique;
		}
		return _unique = getPersistenceContext().getValue(UNIQUE, _unique);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeDescriptor.writable</code> attribute defined at extension <code>core</code>. 
	 * @return the writable
	 */
	public Boolean getWritable()
	{
		if (this._writable!=null)
		{
			return _writable;
		}
		return _writable = getPersistenceContext().getValue(WRITABLE, _writable);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AttributeDescriptor.attributeHandler</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the attributeHandler
	 */
	public void setAttributeHandler(final String value)
	{
		_attributeHandler = getPersistenceContext().setValue(ATTRIBUTEHANDLER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AttributeDescriptor.constraints</code> attribute defined at extension <code>validation</code>. 
	 *  
	 * @param value the constraints
	 */
	public void setConstraints(final Set<AttributeConstraintModel> value)
	{
		_constraints = getPersistenceContext().setValue(CONSTRAINTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AttributeDescriptor.databaseColumn</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the databaseColumn
	 */
	public void setDatabaseColumn(final String value)
	{
		_databaseColumn = getPersistenceContext().setValue(DATABASECOLUMN, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AttributeDescriptor.defaultValue</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the defaultValue
	 */
	public void setDefaultValue(final Object value)
	{
		_defaultValue = getPersistenceContext().setValue(DEFAULTVALUE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AttributeDescriptor.description</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the description
	 */
	public void setDescription(final String value)
	{
		setDescription(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>AttributeDescriptor.description</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the description
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setDescription(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(DESCRIPTION, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AttributeDescriptor.dontCopy</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the dontCopy
	 */
	public void setDontCopy(final Boolean value)
	{
		_dontCopy = getPersistenceContext().setValue(DONTCOPY, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>AttributeDescriptor.enclosingType</code> attribute defined at extension <code>core</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the enclosingType
	 */
	public void setEnclosingType(final ComposedTypeModel value)
	{
		_enclosingType = getPersistenceContext().setValue(ENCLOSINGTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AttributeDescriptor.encrypted</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the encrypted
	 */
	public void setEncrypted(final Boolean value)
	{
		_encrypted = getPersistenceContext().setValue(ENCRYPTED, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AttributeDescriptor.forceLuceneIndexable</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the forceLuceneIndexable
	 */
	public void setForceLuceneIndexable(final Boolean value)
	{
		_forceLuceneIndexable = getPersistenceContext().setValue(FORCELUCENEINDEXABLE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AttributeDescriptor.hiddenForUI</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the hiddenForUI
	 */
	public void setHiddenForUI(final Boolean value)
	{
		_hiddenForUI = getPersistenceContext().setValue(HIDDENFORUI, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AttributeDescriptor.hmcIndexField</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the hmcIndexField
	 */
	public void setHmcIndexField(final String value)
	{
		_hmcIndexField = getPersistenceContext().setValue(HMCINDEXFIELD, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AttributeDescriptor.initial</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the initial
	 */
	public void setInitial(final Boolean value)
	{
		_initial = getPersistenceContext().setValue(INITIAL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AttributeDescriptor.modifiers</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the modifiers
	 */
	public void setModifiers(final Integer value)
	{
		_modifiers = getPersistenceContext().setValue(MODIFIERS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AttributeDescriptor.optional</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the optional
	 */
	public void setOptional(final Boolean value)
	{
		_optional = getPersistenceContext().setValue(OPTIONAL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AttributeDescriptor.partOf</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the partOf
	 */
	public void setPartOf(final Boolean value)
	{
		_partOf = getPersistenceContext().setValue(PARTOF, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AttributeDescriptor.primitive</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the primitive
	 */
	public void setPrimitive(final Boolean value)
	{
		_primitive = getPersistenceContext().setValue(PRIMITIVE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AttributeDescriptor.private</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the private
	 */
	public void setPrivate(final Boolean value)
	{
		_private = getPersistenceContext().setValue(PRIVATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>AttributeDescriptor.property</code> attribute defined at extension <code>core</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the property
	 */
	public void setProperty(final Boolean value)
	{
		_property = getPersistenceContext().setValue(PROPERTY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AttributeDescriptor.readable</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the readable
	 */
	public void setReadable(final Boolean value)
	{
		_readable = getPersistenceContext().setValue(READABLE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AttributeDescriptor.readOnlyForUI</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the readOnlyForUI
	 */
	public void setReadOnlyForUI(final Boolean value)
	{
		_readOnlyForUI = getPersistenceContext().setValue(READONLYFORUI, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AttributeDescriptor.removable</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the removable
	 */
	public void setRemovable(final Boolean value)
	{
		_removable = getPersistenceContext().setValue(REMOVABLE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AttributeDescriptor.search</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the search
	 */
	public void setSearch(final Boolean value)
	{
		_search = getPersistenceContext().setValue(SEARCH, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AttributeDescriptor.unique</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the unique
	 */
	public void setUnique(final Boolean value)
	{
		_unique = getPersistenceContext().setValue(UNIQUE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AttributeDescriptor.writable</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the writable
	 */
	public void setWritable(final Boolean value)
	{
		_writable = getPersistenceContext().setValue(WRITABLE, value);
	}
	
}
