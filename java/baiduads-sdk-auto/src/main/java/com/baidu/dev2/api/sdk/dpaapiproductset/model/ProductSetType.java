/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.dpaapiproductset.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.dpaapiproductset.model.ProductSetRule;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ProductSetType
 */
@JsonPropertyOrder({
  ProductSetType.JSON_PROPERTY_USER_ID,
  ProductSetType.JSON_PROPERTY_PRODUCT_SET_ID,
  ProductSetType.JSON_PROPERTY_PRODUCT_SET_NAME,
  ProductSetType.JSON_PROPERTY_CATALOG_ID,
  ProductSetType.JSON_PROPERTY_CONDITIONS,
  ProductSetType.JSON_PROPERTY_PRODUCT_NUM,
  ProductSetType.JSON_PROPERTY_PRODUCT_LINE
})
@JsonTypeName("ProductSetType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductSetType {
  public static final String JSON_PROPERTY_USER_ID = "userId";
  private Long userId;

  public static final String JSON_PROPERTY_PRODUCT_SET_ID = "productSetId";
  private Long productSetId;

  public static final String JSON_PROPERTY_PRODUCT_SET_NAME = "productSetName";
  private String productSetName;

  public static final String JSON_PROPERTY_CATALOG_ID = "catalogId";
  private Long catalogId;

  public static final String JSON_PROPERTY_CONDITIONS = "conditions";
  private List<ProductSetRule> conditions = null;

  public static final String JSON_PROPERTY_PRODUCT_NUM = "productNum";
  private Long productNum;

  public static final String JSON_PROPERTY_PRODUCT_LINE = "productLine";
  private String productLine;

  public ProductSetType() { 
  }

  public ProductSetType userId(Long userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(Long userId) {
    this.userId = userId;
  }


  public ProductSetType productSetId(Long productSetId) {
    
    this.productSetId = productSetId;
    return this;
  }

   /**
   * Get productSetId
   * @return productSetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_SET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getProductSetId() {
    return productSetId;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_SET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductSetId(Long productSetId) {
    this.productSetId = productSetId;
  }


  public ProductSetType productSetName(String productSetName) {
    
    this.productSetName = productSetName;
    return this;
  }

   /**
   * Get productSetName
   * @return productSetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_SET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProductSetName() {
    return productSetName;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_SET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductSetName(String productSetName) {
    this.productSetName = productSetName;
  }


  public ProductSetType catalogId(Long catalogId) {
    
    this.catalogId = catalogId;
    return this;
  }

   /**
   * Get catalogId
   * @return catalogId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CATALOG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCatalogId() {
    return catalogId;
  }


  @JsonProperty(JSON_PROPERTY_CATALOG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCatalogId(Long catalogId) {
    this.catalogId = catalogId;
  }


  public ProductSetType conditions(List<ProductSetRule> conditions) {
    
    this.conditions = conditions;
    return this;
  }

  public ProductSetType addConditionsItem(ProductSetRule conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Get conditions
   * @return conditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ProductSetRule> getConditions() {
    return conditions;
  }


  @JsonProperty(JSON_PROPERTY_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConditions(List<ProductSetRule> conditions) {
    this.conditions = conditions;
  }


  public ProductSetType productNum(Long productNum) {
    
    this.productNum = productNum;
    return this;
  }

   /**
   * Get productNum
   * @return productNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getProductNum() {
    return productNum;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductNum(Long productNum) {
    this.productNum = productNum;
  }


  public ProductSetType productLine(String productLine) {
    
    this.productLine = productLine;
    return this;
  }

   /**
   * Get productLine
   * @return productLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProductLine() {
    return productLine;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductLine(String productLine) {
    this.productLine = productLine;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSetType productSetType = (ProductSetType) o;
    return Objects.equals(this.userId, productSetType.userId) &&
        Objects.equals(this.productSetId, productSetType.productSetId) &&
        Objects.equals(this.productSetName, productSetType.productSetName) &&
        Objects.equals(this.catalogId, productSetType.catalogId) &&
        Objects.equals(this.conditions, productSetType.conditions) &&
        Objects.equals(this.productNum, productSetType.productNum) &&
        Objects.equals(this.productLine, productSetType.productLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, productSetId, productSetName, catalogId, conditions, productNum, productLine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSetType {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    productSetId: ").append(toIndentedString(productSetId)).append("\n");
    sb.append("    productSetName: ").append(toIndentedString(productSetName)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    productNum: ").append(toIndentedString(productNum)).append("\n");
    sb.append("    productLine: ").append(toIndentedString(productLine)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
