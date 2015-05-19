/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 2015/05/18 13:25:59
 * ----------------------------------------------------------------
 *
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package de.hybris.platform.commercefacades.product.data;

import de.hybris.merchandise.facades.product.data.GenderData;
import de.hybris.platform.acceleratorfacades.order.data.PriceRangeData;
import de.hybris.platform.commercefacades.product.data.BaseOptionData;
import de.hybris.platform.commercefacades.product.data.CategoryData;
import de.hybris.platform.commercefacades.product.data.ClassificationData;
import de.hybris.platform.commercefacades.product.data.FutureStockData;
import de.hybris.platform.commercefacades.product.data.ImageData;
import de.hybris.platform.commercefacades.product.data.PriceData;
import de.hybris.platform.commercefacades.product.data.ProductReferenceData;
import de.hybris.platform.commercefacades.product.data.PromotionData;
import de.hybris.platform.commercefacades.product.data.ReviewData;
import de.hybris.platform.commercefacades.product.data.StockData;
import de.hybris.platform.commercefacades.product.data.VariantMatrixElementData;
import de.hybris.platform.commercefacades.product.data.VariantOptionData;
import java.util.Collection;
import java.util.List;

public class ProductData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>ProductData.summary</code> property defined at extension <code>commercefacades</code>. */
	private String summary;
	/** <i>Generated property</i> for <code>ProductData.productReferences</code> property defined at extension <code>commercefacades</code>. */
	private List<ProductReferenceData> productReferences;
	/** <i>Generated property</i> for <code>ProductData.classifications</code> property defined at extension <code>commercefacades</code>. */
	private Collection<ClassificationData> classifications;
	/** <i>Generated property</i> for <code>ProductData.averageRating</code> property defined at extension <code>commercefacades</code>. */
	private Double averageRating;
	/** <i>Generated property</i> for <code>ProductData.purchasable</code> property defined at extension <code>commercefacades</code>. */
	private Boolean purchasable;
	/** <i>Generated property</i> for <code>ProductData.genders</code> property defined at extension <code>merchandisefacades</code>. */
	private List<GenderData> genders;
	/** <i>Generated property</i> for <code>ProductData.volumePrices</code> property defined at extension <code>commercefacades</code>. */
	private List<PriceData> volumePrices;
	/** <i>Generated property</i> for <code>ProductData.variantType</code> property defined at extension <code>commercefacades</code>. */
	private String variantType;
	/** <i>Generated property</i> for <code>ProductData.stock</code> property defined at extension <code>commercefacades</code>. */
	private StockData stock;
	/** <i>Generated property</i> for <code>ProductData.description</code> property defined at extension <code>commercefacades</code>. */
	private String description;
	/** <i>Generated property</i> for <code>ProductData.variantMatrix</code> property defined at extension <code>commercefacades</code>. */
	private List<VariantMatrixElementData> variantMatrix;
	/** <i>Generated property</i> for <code>ProductData.name</code> property defined at extension <code>commercefacades</code>. */
	private String name;
	/** <i>Generated property</i> for <code>ProductData.baseOptions</code> property defined at extension <code>commercefacades</code>. */
	private List<BaseOptionData> baseOptions;
	/** <i>Generated property</i> for <code>ProductData.baseProduct</code> property defined at extension <code>commercefacades</code>. */
	private String baseProduct;
	/** <i>Generated property</i> for <code>ProductData.availableForPickup</code> property defined at extension <code>commercefacades</code>. */
	private Boolean availableForPickup;
	/** <i>Generated property</i> for <code>ProductData.variantOptions</code> property defined at extension <code>commercefacades</code>. */
	private List<VariantOptionData> variantOptions;
	/** <i>Generated property</i> for <code>ProductData.reviews</code> property defined at extension <code>commercefacades</code>. */
	private Collection<ReviewData> reviews;
	/** <i>Generated property</i> for <code>ProductData.code</code> property defined at extension <code>commercefacades</code>. */
	private String code;
	/** <i>Generated property</i> for <code>ProductData.url</code> property defined at extension <code>commercefacades</code>. */
	private String url;
	/** <i>Generated property</i> for <code>ProductData.priceRange</code> property defined at extension <code>acceleratorfacades</code>. */
	private PriceRangeData priceRange;
	/** <i>Generated property</i> for <code>ProductData.price</code> property defined at extension <code>commercefacades</code>. */
	private PriceData price;
	/** <i>Generated property</i> for <code>ProductData.numberOfReviews</code> property defined at extension <code>commercefacades</code>. */
	private Integer numberOfReviews;
	/** <i>Generated property</i> for <code>ProductData.manufacturer</code> property defined at extension <code>commercefacades</code>. */
	private String manufacturer;
	/** <i>Generated property</i> for <code>ProductData.volumePricesFlag</code> property defined at extension <code>commercefacades</code>. */
	private Boolean volumePricesFlag;
	/** <i>Generated property</i> for <code>ProductData.futureStocks</code> property defined at extension <code>commercefacades</code>. */
	private List<FutureStockData> futureStocks;
	/** <i>Generated property</i> for <code>ProductData.images</code> property defined at extension <code>commercefacades</code>. */
	private Collection<ImageData> images;
	/** <i>Generated property</i> for <code>ProductData.categories</code> property defined at extension <code>commercefacades</code>. */
	private Collection<CategoryData> categories;
	/** <i>Generated property</i> for <code>ProductData.potentialPromotions</code> property defined at extension <code>commercefacades</code>. */
	private Collection<PromotionData> potentialPromotions;
		
	public ProductData()
	{
		// default constructor
	}
	
		
	public void setSummary(final String summary)
	{
		this.summary = summary;
	}
	
		
	public String getSummary() 
	{
		return summary;
	}
		
		
	public void setProductReferences(final List<ProductReferenceData> productReferences)
	{
		this.productReferences = productReferences;
	}
	
		
	public List<ProductReferenceData> getProductReferences() 
	{
		return productReferences;
	}
		
		
	public void setClassifications(final Collection<ClassificationData> classifications)
	{
		this.classifications = classifications;
	}
	
		
	public Collection<ClassificationData> getClassifications() 
	{
		return classifications;
	}
		
		
	public void setAverageRating(final Double averageRating)
	{
		this.averageRating = averageRating;
	}
	
		
	public Double getAverageRating() 
	{
		return averageRating;
	}
		
		
	public void setPurchasable(final Boolean purchasable)
	{
		this.purchasable = purchasable;
	}
	
		
	public Boolean getPurchasable() 
	{
		return purchasable;
	}
		
		
	public void setGenders(final List<GenderData> genders)
	{
		this.genders = genders;
	}
	
		
	public List<GenderData> getGenders() 
	{
		return genders;
	}
		
		
	public void setVolumePrices(final List<PriceData> volumePrices)
	{
		this.volumePrices = volumePrices;
	}
	
		
	public List<PriceData> getVolumePrices() 
	{
		return volumePrices;
	}
		
		
	public void setVariantType(final String variantType)
	{
		this.variantType = variantType;
	}
	
		
	public String getVariantType() 
	{
		return variantType;
	}
		
		
	public void setStock(final StockData stock)
	{
		this.stock = stock;
	}
	
		
	public StockData getStock() 
	{
		return stock;
	}
		
		
	public void setDescription(final String description)
	{
		this.description = description;
	}
	
		
	public String getDescription() 
	{
		return description;
	}
		
		
	public void setVariantMatrix(final List<VariantMatrixElementData> variantMatrix)
	{
		this.variantMatrix = variantMatrix;
	}
	
		
	public List<VariantMatrixElementData> getVariantMatrix() 
	{
		return variantMatrix;
	}
		
		
	public void setName(final String name)
	{
		this.name = name;
	}
	
		
	public String getName() 
	{
		return name;
	}
		
		
	public void setBaseOptions(final List<BaseOptionData> baseOptions)
	{
		this.baseOptions = baseOptions;
	}
	
		
	public List<BaseOptionData> getBaseOptions() 
	{
		return baseOptions;
	}
		
		
	public void setBaseProduct(final String baseProduct)
	{
		this.baseProduct = baseProduct;
	}
	
		
	public String getBaseProduct() 
	{
		return baseProduct;
	}
		
		
	public void setAvailableForPickup(final Boolean availableForPickup)
	{
		this.availableForPickup = availableForPickup;
	}
	
		
	public Boolean getAvailableForPickup() 
	{
		return availableForPickup;
	}
		
		
	public void setVariantOptions(final List<VariantOptionData> variantOptions)
	{
		this.variantOptions = variantOptions;
	}
	
		
	public List<VariantOptionData> getVariantOptions() 
	{
		return variantOptions;
	}
		
		
	public void setReviews(final Collection<ReviewData> reviews)
	{
		this.reviews = reviews;
	}
	
		
	public Collection<ReviewData> getReviews() 
	{
		return reviews;
	}
		
		
	public void setCode(final String code)
	{
		this.code = code;
	}
	
		
	public String getCode() 
	{
		return code;
	}
		
		
	public void setUrl(final String url)
	{
		this.url = url;
	}
	
		
	public String getUrl() 
	{
		return url;
	}
		
		
	public void setPriceRange(final PriceRangeData priceRange)
	{
		this.priceRange = priceRange;
	}
	
		
	public PriceRangeData getPriceRange() 
	{
		return priceRange;
	}
		
		
	public void setPrice(final PriceData price)
	{
		this.price = price;
	}
	
		
	public PriceData getPrice() 
	{
		return price;
	}
		
		
	public void setNumberOfReviews(final Integer numberOfReviews)
	{
		this.numberOfReviews = numberOfReviews;
	}
	
		
	public Integer getNumberOfReviews() 
	{
		return numberOfReviews;
	}
		
		
	public void setManufacturer(final String manufacturer)
	{
		this.manufacturer = manufacturer;
	}
	
		
	public String getManufacturer() 
	{
		return manufacturer;
	}
		
		
	public void setVolumePricesFlag(final Boolean volumePricesFlag)
	{
		this.volumePricesFlag = volumePricesFlag;
	}
	
		
	public Boolean getVolumePricesFlag() 
	{
		return volumePricesFlag;
	}
		
		
	public void setFutureStocks(final List<FutureStockData> futureStocks)
	{
		this.futureStocks = futureStocks;
	}
	
		
	public List<FutureStockData> getFutureStocks() 
	{
		return futureStocks;
	}
		
		
	public void setImages(final Collection<ImageData> images)
	{
		this.images = images;
	}
	
		
	public Collection<ImageData> getImages() 
	{
		return images;
	}
		
		
	public void setCategories(final Collection<CategoryData> categories)
	{
		this.categories = categories;
	}
	
		
	public Collection<CategoryData> getCategories() 
	{
		return categories;
	}
		
		
	public void setPotentialPromotions(final Collection<PromotionData> potentialPromotions)
	{
		this.potentialPromotions = potentialPromotions;
	}
	
		
	public Collection<PromotionData> getPotentialPromotions() 
	{
		return potentialPromotions;
	}
		
	
}