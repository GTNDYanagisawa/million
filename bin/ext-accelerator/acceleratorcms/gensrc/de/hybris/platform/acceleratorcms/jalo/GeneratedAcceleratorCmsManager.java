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
package de.hybris.platform.acceleratorcms.jalo;

import de.hybris.platform.acceleratorcms.constants.AcceleratorCmsConstants;
import de.hybris.platform.acceleratorcms.jalo.CMSActionType;
import de.hybris.platform.acceleratorcms.jalo.actions.AbstractCMSAction;
import de.hybris.platform.acceleratorcms.jalo.actions.AddToCartAction;
import de.hybris.platform.acceleratorcms.jalo.actions.ListAddToCartAction;
import de.hybris.platform.acceleratorcms.jalo.actions.ListPickUpInStoreAction;
import de.hybris.platform.acceleratorcms.jalo.actions.PickUpInStoreAction;
import de.hybris.platform.acceleratorcms.jalo.actions.ShareOnSocialNetworkAction;
import de.hybris.platform.acceleratorcms.jalo.actions.ViewOrderAction;
import de.hybris.platform.acceleratorcms.jalo.actions.ViewStoreAction;
import de.hybris.platform.acceleratorcms.jalo.components.AbstractResponsiveBannerComponent;
import de.hybris.platform.acceleratorcms.jalo.components.AccountBookmarkComponent;
import de.hybris.platform.acceleratorcms.jalo.components.AccountControlComponent;
import de.hybris.platform.acceleratorcms.jalo.components.AccountNavigationCollectionComponent;
import de.hybris.platform.acceleratorcms.jalo.components.AccountNavigationComponent;
import de.hybris.platform.acceleratorcms.jalo.components.BreadcrumbComponent;
import de.hybris.platform.acceleratorcms.jalo.components.CMSProductListComponent;
import de.hybris.platform.acceleratorcms.jalo.components.CMSTabParagraphComponent;
import de.hybris.platform.acceleratorcms.jalo.components.CMSTabParagraphContainer;
import de.hybris.platform.acceleratorcms.jalo.components.CartSuggestionComponent;
import de.hybris.platform.acceleratorcms.jalo.components.CategoryFeatureComponent;
import de.hybris.platform.acceleratorcms.jalo.components.DynamicBannerComponent;
import de.hybris.platform.acceleratorcms.jalo.components.FooterComponent;
import de.hybris.platform.acceleratorcms.jalo.components.ImageMapComponent;
import de.hybris.platform.acceleratorcms.jalo.components.JspIncludeComponent;
import de.hybris.platform.acceleratorcms.jalo.components.LanguageCurrencyComponent;
import de.hybris.platform.acceleratorcms.jalo.components.LogoComponent;
import de.hybris.platform.acceleratorcms.jalo.components.MiniCartComponent;
import de.hybris.platform.acceleratorcms.jalo.components.NavigationBarCollectionComponent;
import de.hybris.platform.acceleratorcms.jalo.components.NavigationBarComponent;
import de.hybris.platform.acceleratorcms.jalo.components.ProductAddToCartComponent;
import de.hybris.platform.acceleratorcms.jalo.components.ProductFeatureComponent;
import de.hybris.platform.acceleratorcms.jalo.components.ProductGridComponent;
import de.hybris.platform.acceleratorcms.jalo.components.ProductReferencesComponent;
import de.hybris.platform.acceleratorcms.jalo.components.ProductRefinementComponent;
import de.hybris.platform.acceleratorcms.jalo.components.ProductVariantSelectorComponent;
import de.hybris.platform.acceleratorcms.jalo.components.PurchasedCategorySuggestionComponent;
import de.hybris.platform.acceleratorcms.jalo.components.SearchBoxComponent;
import de.hybris.platform.acceleratorcms.jalo.components.SearchResultsGridComponent;
import de.hybris.platform.acceleratorcms.jalo.components.SearchResultsListComponent;
import de.hybris.platform.acceleratorcms.jalo.components.SimpleBannerComponent;
import de.hybris.platform.acceleratorcms.jalo.components.SimpleResponsiveBannerComponent;
import de.hybris.platform.acceleratorcms.jalo.components.SimpleSuggestionComponent;
import de.hybris.platform.acceleratorcms.jalo.components.StoreFinderComponent;
import de.hybris.platform.acceleratorcms.jalo.components.SubCategoryListComponent;
import de.hybris.platform.acceleratorcms.jalo.restrictions.CMSActionRestriction;
import de.hybris.platform.acceleratorcms.jalo.restrictions.CMSUiExperienceRestriction;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.cms2.jalo.CMSComponentType;
import de.hybris.platform.cms2.jalo.contents.CMSItem;
import de.hybris.platform.cms2.jalo.contents.components.AbstractCMSComponent;
import de.hybris.platform.cms2.jalo.contents.components.CMSLinkComponent;
import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.cms2.jalo.pages.AbstractPage;
import de.hybris.platform.cms2.jalo.pages.ContentPage;
import de.hybris.platform.cms2.jalo.preview.PreviewData;
import de.hybris.platform.cms2lib.components.ProductCarouselComponent;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type <code>AcceleratorCmsManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAcceleratorCmsManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n PRODUCTFEATURECOMPONENTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ProductFeatureComponent> PRODUCTFEATURECOMPONENTS2PRODUCTRELPRODUCTFEATURECOMPONENTSHANDLER = new OneToManyHandler<ProductFeatureComponent>(
	AcceleratorCmsConstants.TC.PRODUCTFEATURECOMPONENT,
	false,
	"product",
	null,
	false,
	true,
	CollectionType.LIST
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CATEGORYFEATURECOMPONENTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CategoryFeatureComponent> CATEGORYFEATURECOMPONENTS2CATEGORYRELCATEGORYFEATURECOMPONENTSHANDLER = new OneToManyHandler<CategoryFeatureComponent>(
	AcceleratorCmsConstants.TC.CATEGORYFEATURECOMPONENT,
	false,
	"category",
	null,
	false,
	true,
	CollectionType.LIST
	);
	/** Relation ordering override parameter constants for CmsActionsForCmsComponents from ((acceleratorcms))*/
	protected static String CMSACTIONSFORCMSCOMPONENTS_SRC_ORDERED = "relation.CmsActionsForCmsComponents.source.ordered";
	protected static String CMSACTIONSFORCMSCOMPONENTS_TGT_ORDERED = "relation.CmsActionsForCmsComponents.target.ordered";
	/** Relation disable markmodifed parameter constants for CmsActionsForCmsComponents from ((acceleratorcms))*/
	protected static String CMSACTIONSFORCMSCOMPONENTS_MARKMODIFIED = "relation.CmsActionsForCmsComponents.markmodified";
	/** Relation ordering override parameter constants for ApplicableCmsActionsTypeForCmsComponent from ((acceleratorcms))*/
	protected static String APPLICABLECMSACTIONSTYPEFORCMSCOMPONENT_SRC_ORDERED = "relation.ApplicableCmsActionsTypeForCmsComponent.source.ordered";
	protected static String APPLICABLECMSACTIONSTYPEFORCMSCOMPONENT_TGT_ORDERED = "relation.ApplicableCmsActionsTypeForCmsComponent.target.ordered";
	/** Relation disable markmodifed parameter constants for ApplicableCmsActionsTypeForCmsComponent from ((acceleratorcms))*/
	protected static String APPLICABLECMSACTIONSTYPEFORCMSCOMPONENT_MARKMODIFIED = "relation.ApplicableCmsActionsTypeForCmsComponent.markmodified";
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("keywords", AttributeMode.INITIAL);
		tmp.put("description", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.cms2.jalo.pages.ContentPage", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("title", AttributeMode.INITIAL);
		tmp.put("searchQuery", AttributeMode.INITIAL);
		tmp.put("categoryCode", AttributeMode.INITIAL);
		tmp.put("popup", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.cms2lib.components.ProductCarouselComponent", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("styleAttributes", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.cms2.jalo.contents.components.CMSLinkComponent", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("uiExperience", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.cms2.jalo.preview.PreviewData", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCMSComponent.actions</code> attribute.
	 * @return the actions
	 */
	public List<AbstractCMSAction> getActions(final SessionContext ctx, final AbstractCMSComponent item)
	{
		final List<AbstractCMSAction> items = item.getLinkedItems( 
			ctx,
			true,
			AcceleratorCmsConstants.Relations.CMSACTIONSFORCMSCOMPONENTS,
			null,
			Utilities.getRelationOrderingOverride(CMSACTIONSFORCMSCOMPONENTS_SRC_ORDERED, true),
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCMSComponent.actions</code> attribute.
	 * @return the actions
	 */
	public List<AbstractCMSAction> getActions(final AbstractCMSComponent item)
	{
		return getActions( getSession().getSessionContext(), item );
	}
	
	public long getActionsCount(final SessionContext ctx, final AbstractCMSComponent item)
	{
		return item.getLinkedItemsCount(
			ctx,
			true,
			AcceleratorCmsConstants.Relations.CMSACTIONSFORCMSCOMPONENTS,
			null
		);
	}
	
	public long getActionsCount(final AbstractCMSComponent item)
	{
		return getActionsCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCMSComponent.actions</code> attribute. 
	 * @param value the actions
	 */
	public void setActions(final SessionContext ctx, final AbstractCMSComponent item, final List<AbstractCMSAction> value)
	{
		item.setLinkedItems( 
			ctx,
			true,
			AcceleratorCmsConstants.Relations.CMSACTIONSFORCMSCOMPONENTS,
			null,
			value,
			Utilities.getRelationOrderingOverride(CMSACTIONSFORCMSCOMPONENTS_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(CMSACTIONSFORCMSCOMPONENTS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCMSComponent.actions</code> attribute. 
	 * @param value the actions
	 */
	public void setActions(final AbstractCMSComponent item, final List<AbstractCMSAction> value)
	{
		setActions( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to actions. 
	 * @param value the item to add to actions
	 */
	public void addToActions(final SessionContext ctx, final AbstractCMSComponent item, final AbstractCMSAction value)
	{
		item.addLinkedItems( 
			ctx,
			true,
			AcceleratorCmsConstants.Relations.CMSACTIONSFORCMSCOMPONENTS,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(CMSACTIONSFORCMSCOMPONENTS_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(CMSACTIONSFORCMSCOMPONENTS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to actions. 
	 * @param value the item to add to actions
	 */
	public void addToActions(final AbstractCMSComponent item, final AbstractCMSAction value)
	{
		addToActions( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from actions. 
	 * @param value the item to remove from actions
	 */
	public void removeFromActions(final SessionContext ctx, final AbstractCMSComponent item, final AbstractCMSAction value)
	{
		item.removeLinkedItems( 
			ctx,
			true,
			AcceleratorCmsConstants.Relations.CMSACTIONSFORCMSCOMPONENTS,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(CMSACTIONSFORCMSCOMPONENTS_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(CMSACTIONSFORCMSCOMPONENTS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from actions. 
	 * @param value the item to remove from actions
	 */
	public void removeFromActions(final AbstractCMSComponent item, final AbstractCMSAction value)
	{
		removeFromActions( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSComponentType.actionTypes</code> attribute.
	 * @return the actionTypes
	 */
	public Collection<CMSActionType> getActionTypes(final SessionContext ctx, final CMSComponentType item)
	{
		final List<CMSActionType> items = item.getLinkedItems( 
			ctx,
			false,
			AcceleratorCmsConstants.Relations.APPLICABLECMSACTIONSTYPEFORCMSCOMPONENT,
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSComponentType.actionTypes</code> attribute.
	 * @return the actionTypes
	 */
	public Collection<CMSActionType> getActionTypes(final CMSComponentType item)
	{
		return getActionTypes( getSession().getSessionContext(), item );
	}
	
	public long getActionTypesCount(final SessionContext ctx, final CMSComponentType item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			AcceleratorCmsConstants.Relations.APPLICABLECMSACTIONSTYPEFORCMSCOMPONENT,
			null
		);
	}
	
	public long getActionTypesCount(final CMSComponentType item)
	{
		return getActionTypesCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CMSComponentType.actionTypes</code> attribute. 
	 * @param value the actionTypes
	 */
	public void setActionTypes(final SessionContext ctx, final CMSComponentType item, final Collection<CMSActionType> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			AcceleratorCmsConstants.Relations.APPLICABLECMSACTIONSTYPEFORCMSCOMPONENT,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(APPLICABLECMSACTIONSTYPEFORCMSCOMPONENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CMSComponentType.actionTypes</code> attribute. 
	 * @param value the actionTypes
	 */
	public void setActionTypes(final CMSComponentType item, final Collection<CMSActionType> value)
	{
		setActionTypes( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to actionTypes. 
	 * @param value the item to add to actionTypes
	 */
	public void addToActionTypes(final SessionContext ctx, final CMSComponentType item, final CMSActionType value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			AcceleratorCmsConstants.Relations.APPLICABLECMSACTIONSTYPEFORCMSCOMPONENT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(APPLICABLECMSACTIONSTYPEFORCMSCOMPONENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to actionTypes. 
	 * @param value the item to add to actionTypes
	 */
	public void addToActionTypes(final CMSComponentType item, final CMSActionType value)
	{
		addToActionTypes( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from actionTypes. 
	 * @param value the item to remove from actionTypes
	 */
	public void removeFromActionTypes(final SessionContext ctx, final CMSComponentType item, final CMSActionType value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			AcceleratorCmsConstants.Relations.APPLICABLECMSACTIONSTYPEFORCMSCOMPONENT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(APPLICABLECMSACTIONSTYPEFORCMSCOMPONENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from actionTypes. 
	 * @param value the item to remove from actionTypes
	 */
	public void removeFromActionTypes(final CMSComponentType item, final CMSActionType value)
	{
		removeFromActionTypes( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.categoryCode</code> attribute.
	 * @return the categoryCode - A code for a category for a solr search
	 */
	public String getCategoryCode(final SessionContext ctx, final ProductCarouselComponent item)
	{
		return (String)item.getProperty( ctx, AcceleratorCmsConstants.Attributes.ProductCarouselComponent.CATEGORYCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.categoryCode</code> attribute.
	 * @return the categoryCode - A code for a category for a solr search
	 */
	public String getCategoryCode(final ProductCarouselComponent item)
	{
		return getCategoryCode( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCarouselComponent.categoryCode</code> attribute. 
	 * @param value the categoryCode - A code for a category for a solr search
	 */
	public void setCategoryCode(final SessionContext ctx, final ProductCarouselComponent item, final String value)
	{
		item.setProperty(ctx, AcceleratorCmsConstants.Attributes.ProductCarouselComponent.CATEGORYCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCarouselComponent.categoryCode</code> attribute. 
	 * @param value the categoryCode - A code for a category for a solr search
	 */
	public void setCategoryCode(final ProductCarouselComponent item, final String value)
	{
		setCategoryCode( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.categoryFeatureComponents</code> attribute.
	 * @return the categoryFeatureComponents
	 */
	public List<CategoryFeatureComponent> getCategoryFeatureComponents(final SessionContext ctx, final Category item)
	{
		return (List<CategoryFeatureComponent>)CATEGORYFEATURECOMPONENTS2CATEGORYRELCATEGORYFEATURECOMPONENTSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.categoryFeatureComponents</code> attribute.
	 * @return the categoryFeatureComponents
	 */
	public List<CategoryFeatureComponent> getCategoryFeatureComponents(final Category item)
	{
		return getCategoryFeatureComponents( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.categoryFeatureComponents</code> attribute. 
	 * @param value the categoryFeatureComponents
	 */
	public void setCategoryFeatureComponents(final SessionContext ctx, final Category item, final List<CategoryFeatureComponent> value)
	{
		CATEGORYFEATURECOMPONENTS2CATEGORYRELCATEGORYFEATURECOMPONENTSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.categoryFeatureComponents</code> attribute. 
	 * @param value the categoryFeatureComponents
	 */
	public void setCategoryFeatureComponents(final Category item, final List<CategoryFeatureComponent> value)
	{
		setCategoryFeatureComponents( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to categoryFeatureComponents. 
	 * @param value the item to add to categoryFeatureComponents
	 */
	public void addToCategoryFeatureComponents(final SessionContext ctx, final Category item, final CategoryFeatureComponent value)
	{
		CATEGORYFEATURECOMPONENTS2CATEGORYRELCATEGORYFEATURECOMPONENTSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to categoryFeatureComponents. 
	 * @param value the item to add to categoryFeatureComponents
	 */
	public void addToCategoryFeatureComponents(final Category item, final CategoryFeatureComponent value)
	{
		addToCategoryFeatureComponents( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from categoryFeatureComponents. 
	 * @param value the item to remove from categoryFeatureComponents
	 */
	public void removeFromCategoryFeatureComponents(final SessionContext ctx, final Category item, final CategoryFeatureComponent value)
	{
		CATEGORYFEATURECOMPONENTS2CATEGORYRELCATEGORYFEATURECOMPONENTSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from categoryFeatureComponents. 
	 * @param value the item to remove from categoryFeatureComponents
	 */
	public void removeFromCategoryFeatureComponents(final Category item, final CategoryFeatureComponent value)
	{
		removeFromCategoryFeatureComponents( getSession().getSessionContext(), item, value );
	}
	
	public AbstractResponsiveBannerComponent createAbstractResponsiveBannerComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.ABSTRACTRESPONSIVEBANNERCOMPONENT );
			return (AbstractResponsiveBannerComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AbstractResponsiveBannerComponent : "+e.getMessage(), 0 );
		}
	}
	
	public AbstractResponsiveBannerComponent createAbstractResponsiveBannerComponent(final Map attributeValues)
	{
		return createAbstractResponsiveBannerComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public AccountBookmarkComponent createAccountBookmarkComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.ACCOUNTBOOKMARKCOMPONENT );
			return (AccountBookmarkComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AccountBookmarkComponent : "+e.getMessage(), 0 );
		}
	}
	
	public AccountBookmarkComponent createAccountBookmarkComponent(final Map attributeValues)
	{
		return createAccountBookmarkComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public AccountControlComponent createAccountControlComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.ACCOUNTCONTROLCOMPONENT );
			return (AccountControlComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AccountControlComponent : "+e.getMessage(), 0 );
		}
	}
	
	public AccountControlComponent createAccountControlComponent(final Map attributeValues)
	{
		return createAccountControlComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public AccountNavigationCollectionComponent createAccountNavigationCollectionComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.ACCOUNTNAVIGATIONCOLLECTIONCOMPONENT );
			return (AccountNavigationCollectionComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AccountNavigationCollectionComponent : "+e.getMessage(), 0 );
		}
	}
	
	public AccountNavigationCollectionComponent createAccountNavigationCollectionComponent(final Map attributeValues)
	{
		return createAccountNavigationCollectionComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public AccountNavigationComponent createAccountNavigationComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.ACCOUNTNAVIGATIONCOMPONENT );
			return (AccountNavigationComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AccountNavigationComponent : "+e.getMessage(), 0 );
		}
	}
	
	public AccountNavigationComponent createAccountNavigationComponent(final Map attributeValues)
	{
		return createAccountNavigationComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public AddToCartAction createAddToCartAction(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.ADDTOCARTACTION );
			return (AddToCartAction)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AddToCartAction : "+e.getMessage(), 0 );
		}
	}
	
	public AddToCartAction createAddToCartAction(final Map attributeValues)
	{
		return createAddToCartAction( getSession().getSessionContext(), attributeValues );
	}
	
	public BreadcrumbComponent createBreadcrumbComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.BREADCRUMBCOMPONENT );
			return (BreadcrumbComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating BreadcrumbComponent : "+e.getMessage(), 0 );
		}
	}
	
	public BreadcrumbComponent createBreadcrumbComponent(final Map attributeValues)
	{
		return createBreadcrumbComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public CartSuggestionComponent createCartSuggestionComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.CARTSUGGESTIONCOMPONENT );
			return (CartSuggestionComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CartSuggestionComponent : "+e.getMessage(), 0 );
		}
	}
	
	public CartSuggestionComponent createCartSuggestionComponent(final Map attributeValues)
	{
		return createCartSuggestionComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public CategoryFeatureComponent createCategoryFeatureComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.CATEGORYFEATURECOMPONENT );
			return (CategoryFeatureComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CategoryFeatureComponent : "+e.getMessage(), 0 );
		}
	}
	
	public CategoryFeatureComponent createCategoryFeatureComponent(final Map attributeValues)
	{
		return createCategoryFeatureComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public CMSActionRestriction createCMSActionRestriction(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.CMSACTIONRESTRICTION );
			return (CMSActionRestriction)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CMSActionRestriction : "+e.getMessage(), 0 );
		}
	}
	
	public CMSActionRestriction createCMSActionRestriction(final Map attributeValues)
	{
		return createCMSActionRestriction( getSession().getSessionContext(), attributeValues );
	}
	
	public CMSActionType createCMSActionType(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.CMSACTIONTYPE );
			return (CMSActionType)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CMSActionType : "+e.getMessage(), 0 );
		}
	}
	
	public CMSActionType createCMSActionType(final Map attributeValues)
	{
		return createCMSActionType( getSession().getSessionContext(), attributeValues );
	}
	
	public CMSProductListComponent createCMSProductListComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.CMSPRODUCTLISTCOMPONENT );
			return (CMSProductListComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CMSProductListComponent : "+e.getMessage(), 0 );
		}
	}
	
	public CMSProductListComponent createCMSProductListComponent(final Map attributeValues)
	{
		return createCMSProductListComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public CMSTabParagraphComponent createCMSTabParagraphComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.CMSTABPARAGRAPHCOMPONENT );
			return (CMSTabParagraphComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CMSTabParagraphComponent : "+e.getMessage(), 0 );
		}
	}
	
	public CMSTabParagraphComponent createCMSTabParagraphComponent(final Map attributeValues)
	{
		return createCMSTabParagraphComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public CMSTabParagraphContainer createCMSTabParagraphContainer(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.CMSTABPARAGRAPHCONTAINER );
			return (CMSTabParagraphContainer)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CMSTabParagraphContainer : "+e.getMessage(), 0 );
		}
	}
	
	public CMSTabParagraphContainer createCMSTabParagraphContainer(final Map attributeValues)
	{
		return createCMSTabParagraphContainer( getSession().getSessionContext(), attributeValues );
	}
	
	public CMSUiExperienceRestriction createCMSUiExperienceRestriction(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.CMSUIEXPERIENCERESTRICTION );
			return (CMSUiExperienceRestriction)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CMSUiExperienceRestriction : "+e.getMessage(), 0 );
		}
	}
	
	public CMSUiExperienceRestriction createCMSUiExperienceRestriction(final Map attributeValues)
	{
		return createCMSUiExperienceRestriction( getSession().getSessionContext(), attributeValues );
	}
	
	public DynamicBannerComponent createDynamicBannerComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.DYNAMICBANNERCOMPONENT );
			return (DynamicBannerComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating DynamicBannerComponent : "+e.getMessage(), 0 );
		}
	}
	
	public DynamicBannerComponent createDynamicBannerComponent(final Map attributeValues)
	{
		return createDynamicBannerComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public FooterComponent createFooterComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.FOOTERCOMPONENT );
			return (FooterComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating FooterComponent : "+e.getMessage(), 0 );
		}
	}
	
	public FooterComponent createFooterComponent(final Map attributeValues)
	{
		return createFooterComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public ImageMapComponent createImageMapComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.IMAGEMAPCOMPONENT );
			return (ImageMapComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ImageMapComponent : "+e.getMessage(), 0 );
		}
	}
	
	public ImageMapComponent createImageMapComponent(final Map attributeValues)
	{
		return createImageMapComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public JspIncludeComponent createJspIncludeComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.JSPINCLUDECOMPONENT );
			return (JspIncludeComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JspIncludeComponent : "+e.getMessage(), 0 );
		}
	}
	
	public JspIncludeComponent createJspIncludeComponent(final Map attributeValues)
	{
		return createJspIncludeComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public LanguageCurrencyComponent createLanguageCurrencyComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.LANGUAGECURRENCYCOMPONENT );
			return (LanguageCurrencyComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating LanguageCurrencyComponent : "+e.getMessage(), 0 );
		}
	}
	
	public LanguageCurrencyComponent createLanguageCurrencyComponent(final Map attributeValues)
	{
		return createLanguageCurrencyComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public ListAddToCartAction createListAddToCartAction(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.LISTADDTOCARTACTION );
			return (ListAddToCartAction)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ListAddToCartAction : "+e.getMessage(), 0 );
		}
	}
	
	public ListAddToCartAction createListAddToCartAction(final Map attributeValues)
	{
		return createListAddToCartAction( getSession().getSessionContext(), attributeValues );
	}
	
	public ListPickUpInStoreAction createListPickUpInStoreAction(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.LISTPICKUPINSTOREACTION );
			return (ListPickUpInStoreAction)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ListPickUpInStoreAction : "+e.getMessage(), 0 );
		}
	}
	
	public ListPickUpInStoreAction createListPickUpInStoreAction(final Map attributeValues)
	{
		return createListPickUpInStoreAction( getSession().getSessionContext(), attributeValues );
	}
	
	public LogoComponent createLogoComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.LOGOCOMPONENT );
			return (LogoComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating LogoComponent : "+e.getMessage(), 0 );
		}
	}
	
	public LogoComponent createLogoComponent(final Map attributeValues)
	{
		return createLogoComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public MiniCartComponent createMiniCartComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.MINICARTCOMPONENT );
			return (MiniCartComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating MiniCartComponent : "+e.getMessage(), 0 );
		}
	}
	
	public MiniCartComponent createMiniCartComponent(final Map attributeValues)
	{
		return createMiniCartComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public NavigationBarCollectionComponent createNavigationBarCollectionComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.NAVIGATIONBARCOLLECTIONCOMPONENT );
			return (NavigationBarCollectionComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating NavigationBarCollectionComponent : "+e.getMessage(), 0 );
		}
	}
	
	public NavigationBarCollectionComponent createNavigationBarCollectionComponent(final Map attributeValues)
	{
		return createNavigationBarCollectionComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public NavigationBarComponent createNavigationBarComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.NAVIGATIONBARCOMPONENT );
			return (NavigationBarComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating NavigationBarComponent : "+e.getMessage(), 0 );
		}
	}
	
	public NavigationBarComponent createNavigationBarComponent(final Map attributeValues)
	{
		return createNavigationBarComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public PickUpInStoreAction createPickUpInStoreAction(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.PICKUPINSTOREACTION );
			return (PickUpInStoreAction)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating PickUpInStoreAction : "+e.getMessage(), 0 );
		}
	}
	
	public PickUpInStoreAction createPickUpInStoreAction(final Map attributeValues)
	{
		return createPickUpInStoreAction( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductAddToCartComponent createProductAddToCartComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.PRODUCTADDTOCARTCOMPONENT );
			return (ProductAddToCartComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductAddToCartComponent : "+e.getMessage(), 0 );
		}
	}
	
	public ProductAddToCartComponent createProductAddToCartComponent(final Map attributeValues)
	{
		return createProductAddToCartComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductFeatureComponent createProductFeatureComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.PRODUCTFEATURECOMPONENT );
			return (ProductFeatureComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductFeatureComponent : "+e.getMessage(), 0 );
		}
	}
	
	public ProductFeatureComponent createProductFeatureComponent(final Map attributeValues)
	{
		return createProductFeatureComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductGridComponent createProductGridComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.PRODUCTGRIDCOMPONENT );
			return (ProductGridComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductGridComponent : "+e.getMessage(), 0 );
		}
	}
	
	public ProductGridComponent createProductGridComponent(final Map attributeValues)
	{
		return createProductGridComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductReferencesComponent createProductReferencesComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.PRODUCTREFERENCESCOMPONENT );
			return (ProductReferencesComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductReferencesComponent : "+e.getMessage(), 0 );
		}
	}
	
	public ProductReferencesComponent createProductReferencesComponent(final Map attributeValues)
	{
		return createProductReferencesComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductRefinementComponent createProductRefinementComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.PRODUCTREFINEMENTCOMPONENT );
			return (ProductRefinementComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductRefinementComponent : "+e.getMessage(), 0 );
		}
	}
	
	public ProductRefinementComponent createProductRefinementComponent(final Map attributeValues)
	{
		return createProductRefinementComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductVariantSelectorComponent createProductVariantSelectorComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.PRODUCTVARIANTSELECTORCOMPONENT );
			return (ProductVariantSelectorComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductVariantSelectorComponent : "+e.getMessage(), 0 );
		}
	}
	
	public ProductVariantSelectorComponent createProductVariantSelectorComponent(final Map attributeValues)
	{
		return createProductVariantSelectorComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public PurchasedCategorySuggestionComponent createPurchasedCategorySuggestionComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.PURCHASEDCATEGORYSUGGESTIONCOMPONENT );
			return (PurchasedCategorySuggestionComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating PurchasedCategorySuggestionComponent : "+e.getMessage(), 0 );
		}
	}
	
	public PurchasedCategorySuggestionComponent createPurchasedCategorySuggestionComponent(final Map attributeValues)
	{
		return createPurchasedCategorySuggestionComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public SearchBoxComponent createSearchBoxComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.SEARCHBOXCOMPONENT );
			return (SearchBoxComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SearchBoxComponent : "+e.getMessage(), 0 );
		}
	}
	
	public SearchBoxComponent createSearchBoxComponent(final Map attributeValues)
	{
		return createSearchBoxComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public SearchResultsGridComponent createSearchResultsGridComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.SEARCHRESULTSGRIDCOMPONENT );
			return (SearchResultsGridComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SearchResultsGridComponent : "+e.getMessage(), 0 );
		}
	}
	
	public SearchResultsGridComponent createSearchResultsGridComponent(final Map attributeValues)
	{
		return createSearchResultsGridComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public SearchResultsListComponent createSearchResultsListComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.SEARCHRESULTSLISTCOMPONENT );
			return (SearchResultsListComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SearchResultsListComponent : "+e.getMessage(), 0 );
		}
	}
	
	public SearchResultsListComponent createSearchResultsListComponent(final Map attributeValues)
	{
		return createSearchResultsListComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public ShareOnSocialNetworkAction createShareOnSocialNetworkAction(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.SHAREONSOCIALNETWORKACTION );
			return (ShareOnSocialNetworkAction)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ShareOnSocialNetworkAction : "+e.getMessage(), 0 );
		}
	}
	
	public ShareOnSocialNetworkAction createShareOnSocialNetworkAction(final Map attributeValues)
	{
		return createShareOnSocialNetworkAction( getSession().getSessionContext(), attributeValues );
	}
	
	public SimpleBannerComponent createSimpleBannerComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.SIMPLEBANNERCOMPONENT );
			return (SimpleBannerComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SimpleBannerComponent : "+e.getMessage(), 0 );
		}
	}
	
	public SimpleBannerComponent createSimpleBannerComponent(final Map attributeValues)
	{
		return createSimpleBannerComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public SimpleResponsiveBannerComponent createSimpleResponsiveBannerComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.SIMPLERESPONSIVEBANNERCOMPONENT );
			return (SimpleResponsiveBannerComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SimpleResponsiveBannerComponent : "+e.getMessage(), 0 );
		}
	}
	
	public SimpleResponsiveBannerComponent createSimpleResponsiveBannerComponent(final Map attributeValues)
	{
		return createSimpleResponsiveBannerComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public SimpleSuggestionComponent createSimpleSuggestionComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.SIMPLESUGGESTIONCOMPONENT );
			return (SimpleSuggestionComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SimpleSuggestionComponent : "+e.getMessage(), 0 );
		}
	}
	
	public SimpleSuggestionComponent createSimpleSuggestionComponent(final Map attributeValues)
	{
		return createSimpleSuggestionComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public StoreFinderComponent createStoreFinderComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.STOREFINDERCOMPONENT );
			return (StoreFinderComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating StoreFinderComponent : "+e.getMessage(), 0 );
		}
	}
	
	public StoreFinderComponent createStoreFinderComponent(final Map attributeValues)
	{
		return createStoreFinderComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public SubCategoryListComponent createSubCategoryListComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.SUBCATEGORYLISTCOMPONENT );
			return (SubCategoryListComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SubCategoryListComponent : "+e.getMessage(), 0 );
		}
	}
	
	public SubCategoryListComponent createSubCategoryListComponent(final Map attributeValues)
	{
		return createSubCategoryListComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public ViewOrderAction createViewOrderAction(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.VIEWORDERACTION );
			return (ViewOrderAction)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ViewOrderAction : "+e.getMessage(), 0 );
		}
	}
	
	public ViewOrderAction createViewOrderAction(final Map attributeValues)
	{
		return createViewOrderAction( getSession().getSessionContext(), attributeValues );
	}
	
	public ViewStoreAction createViewStoreAction(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.VIEWSTOREACTION );
			return (ViewStoreAction)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ViewStoreAction : "+e.getMessage(), 0 );
		}
	}
	
	public ViewStoreAction createViewStoreAction(final Map attributeValues)
	{
		return createViewStoreAction( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentPage.description</code> attribute.
	 * @return the description - Localized content page description.
	 */
	public String getDescription(final SessionContext ctx, final ContentPage item)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedContentPage.getDescription requires a session language", 0 );
		}
		return (String)item.getLocalizedProperty( ctx, AcceleratorCmsConstants.Attributes.ContentPage.DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentPage.description</code> attribute.
	 * @return the description - Localized content page description.
	 */
	public String getDescription(final ContentPage item)
	{
		return getDescription( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentPage.description</code> attribute. 
	 * @return the localized description - Localized content page description.
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx, final ContentPage item)
	{
		return (Map<Language,String>)item.getAllLocalizedProperties(ctx,AcceleratorCmsConstants.Attributes.ContentPage.DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentPage.description</code> attribute. 
	 * @return the localized description - Localized content page description.
	 */
	public Map<Language,String> getAllDescription(final ContentPage item)
	{
		return getAllDescription( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContentPage.description</code> attribute. 
	 * @param value the description - Localized content page description.
	 */
	public void setDescription(final SessionContext ctx, final ContentPage item, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedContentPage.setDescription requires a session language", 0 );
		}
		item.setLocalizedProperty(ctx, AcceleratorCmsConstants.Attributes.ContentPage.DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContentPage.description</code> attribute. 
	 * @param value the description - Localized content page description.
	 */
	public void setDescription(final ContentPage item, final String value)
	{
		setDescription( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContentPage.description</code> attribute. 
	 * @param value the description - Localized content page description.
	 */
	public void setAllDescription(final SessionContext ctx, final ContentPage item, final Map<Language,String> value)
	{
		item.setAllLocalizedProperties(ctx,AcceleratorCmsConstants.Attributes.ContentPage.DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContentPage.description</code> attribute. 
	 * @param value the description - Localized content page description.
	 */
	public void setAllDescription(final ContentPage item, final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return AcceleratorCmsConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentPage.keywords</code> attribute.
	 * @return the keywords - Localized content page keywords.
	 */
	public String getKeywords(final SessionContext ctx, final ContentPage item)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedContentPage.getKeywords requires a session language", 0 );
		}
		return (String)item.getLocalizedProperty( ctx, AcceleratorCmsConstants.Attributes.ContentPage.KEYWORDS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentPage.keywords</code> attribute.
	 * @return the keywords - Localized content page keywords.
	 */
	public String getKeywords(final ContentPage item)
	{
		return getKeywords( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentPage.keywords</code> attribute. 
	 * @return the localized keywords - Localized content page keywords.
	 */
	public Map<Language,String> getAllKeywords(final SessionContext ctx, final ContentPage item)
	{
		return (Map<Language,String>)item.getAllLocalizedProperties(ctx,AcceleratorCmsConstants.Attributes.ContentPage.KEYWORDS,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentPage.keywords</code> attribute. 
	 * @return the localized keywords - Localized content page keywords.
	 */
	public Map<Language,String> getAllKeywords(final ContentPage item)
	{
		return getAllKeywords( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContentPage.keywords</code> attribute. 
	 * @param value the keywords - Localized content page keywords.
	 */
	public void setKeywords(final SessionContext ctx, final ContentPage item, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedContentPage.setKeywords requires a session language", 0 );
		}
		item.setLocalizedProperty(ctx, AcceleratorCmsConstants.Attributes.ContentPage.KEYWORDS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContentPage.keywords</code> attribute. 
	 * @param value the keywords - Localized content page keywords.
	 */
	public void setKeywords(final ContentPage item, final String value)
	{
		setKeywords( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContentPage.keywords</code> attribute. 
	 * @param value the keywords - Localized content page keywords.
	 */
	public void setAllKeywords(final SessionContext ctx, final ContentPage item, final Map<Language,String> value)
	{
		item.setAllLocalizedProperties(ctx,AcceleratorCmsConstants.Attributes.ContentPage.KEYWORDS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContentPage.keywords</code> attribute. 
	 * @param value the keywords - Localized content page keywords.
	 */
	public void setAllKeywords(final ContentPage item, final Map<Language,String> value)
	{
		setAllKeywords( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.popup</code> attribute.
	 * @return the popup - If true shows a popup else redirects to products page
	 */
	public Boolean isPopup(final SessionContext ctx, final ProductCarouselComponent item)
	{
		return (Boolean)item.getProperty( ctx, AcceleratorCmsConstants.Attributes.ProductCarouselComponent.POPUP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.popup</code> attribute.
	 * @return the popup - If true shows a popup else redirects to products page
	 */
	public Boolean isPopup(final ProductCarouselComponent item)
	{
		return isPopup( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.popup</code> attribute. 
	 * @return the popup - If true shows a popup else redirects to products page
	 */
	public boolean isPopupAsPrimitive(final SessionContext ctx, final ProductCarouselComponent item)
	{
		Boolean value = isPopup( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.popup</code> attribute. 
	 * @return the popup - If true shows a popup else redirects to products page
	 */
	public boolean isPopupAsPrimitive(final ProductCarouselComponent item)
	{
		return isPopupAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCarouselComponent.popup</code> attribute. 
	 * @param value the popup - If true shows a popup else redirects to products page
	 */
	public void setPopup(final SessionContext ctx, final ProductCarouselComponent item, final Boolean value)
	{
		item.setProperty(ctx, AcceleratorCmsConstants.Attributes.ProductCarouselComponent.POPUP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCarouselComponent.popup</code> attribute. 
	 * @param value the popup - If true shows a popup else redirects to products page
	 */
	public void setPopup(final ProductCarouselComponent item, final Boolean value)
	{
		setPopup( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCarouselComponent.popup</code> attribute. 
	 * @param value the popup - If true shows a popup else redirects to products page
	 */
	public void setPopup(final SessionContext ctx, final ProductCarouselComponent item, final boolean value)
	{
		setPopup( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCarouselComponent.popup</code> attribute. 
	 * @param value the popup - If true shows a popup else redirects to products page
	 */
	public void setPopup(final ProductCarouselComponent item, final boolean value)
	{
		setPopup( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productFeatureComponents</code> attribute.
	 * @return the productFeatureComponents
	 */
	public List<ProductFeatureComponent> getProductFeatureComponents(final SessionContext ctx, final Product item)
	{
		return (List<ProductFeatureComponent>)PRODUCTFEATURECOMPONENTS2PRODUCTRELPRODUCTFEATURECOMPONENTSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productFeatureComponents</code> attribute.
	 * @return the productFeatureComponents
	 */
	public List<ProductFeatureComponent> getProductFeatureComponents(final Product item)
	{
		return getProductFeatureComponents( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productFeatureComponents</code> attribute. 
	 * @param value the productFeatureComponents
	 */
	public void setProductFeatureComponents(final SessionContext ctx, final Product item, final List<ProductFeatureComponent> value)
	{
		PRODUCTFEATURECOMPONENTS2PRODUCTRELPRODUCTFEATURECOMPONENTSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productFeatureComponents</code> attribute. 
	 * @param value the productFeatureComponents
	 */
	public void setProductFeatureComponents(final Product item, final List<ProductFeatureComponent> value)
	{
		setProductFeatureComponents( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productFeatureComponents. 
	 * @param value the item to add to productFeatureComponents
	 */
	public void addToProductFeatureComponents(final SessionContext ctx, final Product item, final ProductFeatureComponent value)
	{
		PRODUCTFEATURECOMPONENTS2PRODUCTRELPRODUCTFEATURECOMPONENTSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productFeatureComponents. 
	 * @param value the item to add to productFeatureComponents
	 */
	public void addToProductFeatureComponents(final Product item, final ProductFeatureComponent value)
	{
		addToProductFeatureComponents( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productFeatureComponents. 
	 * @param value the item to remove from productFeatureComponents
	 */
	public void removeFromProductFeatureComponents(final SessionContext ctx, final Product item, final ProductFeatureComponent value)
	{
		PRODUCTFEATURECOMPONENTS2PRODUCTRELPRODUCTFEATURECOMPONENTSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productFeatureComponents. 
	 * @param value the item to remove from productFeatureComponents
	 */
	public void removeFromProductFeatureComponents(final Product item, final ProductFeatureComponent value)
	{
		removeFromProductFeatureComponents( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.searchQuery</code> attribute.
	 * @return the searchQuery - A solr query string
	 */
	public String getSearchQuery(final SessionContext ctx, final ProductCarouselComponent item)
	{
		return (String)item.getProperty( ctx, AcceleratorCmsConstants.Attributes.ProductCarouselComponent.SEARCHQUERY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.searchQuery</code> attribute.
	 * @return the searchQuery - A solr query string
	 */
	public String getSearchQuery(final ProductCarouselComponent item)
	{
		return getSearchQuery( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCarouselComponent.searchQuery</code> attribute. 
	 * @param value the searchQuery - A solr query string
	 */
	public void setSearchQuery(final SessionContext ctx, final ProductCarouselComponent item, final String value)
	{
		item.setProperty(ctx, AcceleratorCmsConstants.Attributes.ProductCarouselComponent.SEARCHQUERY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCarouselComponent.searchQuery</code> attribute. 
	 * @param value the searchQuery - A solr query string
	 */
	public void setSearchQuery(final ProductCarouselComponent item, final String value)
	{
		setSearchQuery( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSLinkComponent.styleAttributes</code> attribute.
	 * @return the styleAttributes - Can store custom styling attributes for additional styling
	 */
	public String getStyleAttributes(final SessionContext ctx, final CMSLinkComponent item)
	{
		return (String)item.getProperty( ctx, AcceleratorCmsConstants.Attributes.CMSLinkComponent.STYLEATTRIBUTES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSLinkComponent.styleAttributes</code> attribute.
	 * @return the styleAttributes - Can store custom styling attributes for additional styling
	 */
	public String getStyleAttributes(final CMSLinkComponent item)
	{
		return getStyleAttributes( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CMSLinkComponent.styleAttributes</code> attribute. 
	 * @param value the styleAttributes - Can store custom styling attributes for additional styling
	 */
	public void setStyleAttributes(final SessionContext ctx, final CMSLinkComponent item, final String value)
	{
		item.setProperty(ctx, AcceleratorCmsConstants.Attributes.CMSLinkComponent.STYLEATTRIBUTES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CMSLinkComponent.styleAttributes</code> attribute. 
	 * @param value the styleAttributes - Can store custom styling attributes for additional styling
	 */
	public void setStyleAttributes(final CMSLinkComponent item, final String value)
	{
		setStyleAttributes( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.title</code> attribute.
	 * @return the title - Localized title of the component.
	 */
	public String getTitle(final SessionContext ctx, final ProductCarouselComponent item)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProductCarouselComponent.getTitle requires a session language", 0 );
		}
		return (String)item.getLocalizedProperty( ctx, AcceleratorCmsConstants.Attributes.ProductCarouselComponent.TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.title</code> attribute.
	 * @return the title - Localized title of the component.
	 */
	public String getTitle(final ProductCarouselComponent item)
	{
		return getTitle( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.title</code> attribute. 
	 * @return the localized title - Localized title of the component.
	 */
	public Map<Language,String> getAllTitle(final SessionContext ctx, final ProductCarouselComponent item)
	{
		return (Map<Language,String>)item.getAllLocalizedProperties(ctx,AcceleratorCmsConstants.Attributes.ProductCarouselComponent.TITLE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.title</code> attribute. 
	 * @return the localized title - Localized title of the component.
	 */
	public Map<Language,String> getAllTitle(final ProductCarouselComponent item)
	{
		return getAllTitle( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCarouselComponent.title</code> attribute. 
	 * @param value the title - Localized title of the component.
	 */
	public void setTitle(final SessionContext ctx, final ProductCarouselComponent item, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProductCarouselComponent.setTitle requires a session language", 0 );
		}
		item.setLocalizedProperty(ctx, AcceleratorCmsConstants.Attributes.ProductCarouselComponent.TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCarouselComponent.title</code> attribute. 
	 * @param value the title - Localized title of the component.
	 */
	public void setTitle(final ProductCarouselComponent item, final String value)
	{
		setTitle( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCarouselComponent.title</code> attribute. 
	 * @param value the title - Localized title of the component.
	 */
	public void setAllTitle(final SessionContext ctx, final ProductCarouselComponent item, final Map<Language,String> value)
	{
		item.setAllLocalizedProperties(ctx,AcceleratorCmsConstants.Attributes.ProductCarouselComponent.TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCarouselComponent.title</code> attribute. 
	 * @param value the title - Localized title of the component.
	 */
	public void setAllTitle(final ProductCarouselComponent item, final Map<Language,String> value)
	{
		setAllTitle( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreviewData.uiExperience</code> attribute.
	 * @return the uiExperience
	 */
	public EnumerationValue getUiExperience(final SessionContext ctx, final PreviewData item)
	{
		return (EnumerationValue)item.getProperty( ctx, AcceleratorCmsConstants.Attributes.PreviewData.UIEXPERIENCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreviewData.uiExperience</code> attribute.
	 * @return the uiExperience
	 */
	public EnumerationValue getUiExperience(final PreviewData item)
	{
		return getUiExperience( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PreviewData.uiExperience</code> attribute. 
	 * @param value the uiExperience
	 */
	public void setUiExperience(final SessionContext ctx, final PreviewData item, final EnumerationValue value)
	{
		item.setProperty(ctx, AcceleratorCmsConstants.Attributes.PreviewData.UIEXPERIENCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PreviewData.uiExperience</code> attribute. 
	 * @param value the uiExperience
	 */
	public void setUiExperience(final PreviewData item, final EnumerationValue value)
	{
		setUiExperience( getSession().getSessionContext(), item, value );
	}
	
}
