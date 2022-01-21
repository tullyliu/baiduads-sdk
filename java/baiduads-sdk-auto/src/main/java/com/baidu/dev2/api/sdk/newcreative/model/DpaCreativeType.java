/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.newcreative.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.newcreative.model.DpaBasicCreativeType;
import com.baidu.dev2.api.sdk.newcreative.model.DpaProductCreativeType;
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
 * DpaCreativeType
 */
@JsonPropertyOrder({
  DpaCreativeType.JSON_PROPERTY_USER_ID,
  DpaCreativeType.JSON_PROPERTY_CAMPAIGN_ID,
  DpaCreativeType.JSON_PROPERTY_ADGROUP_ID,
  DpaCreativeType.JSON_PROPERTY_BASIC_CREATIVE,
  DpaCreativeType.JSON_PROPERTY_PRODUCT_CREATIVES,
  DpaCreativeType.JSON_PROPERTY_SHOW_URL,
  DpaCreativeType.JSON_PROPERTY_INDEX,
  DpaCreativeType.JSON_PROPERTY_MONITOR_URL
})
@JsonTypeName("DpaCreativeType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DpaCreativeType {
  public static final String JSON_PROPERTY_USER_ID = "userId";
  private Long userId;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_ADGROUP_ID = "adgroupId";
  private Long adgroupId;

  public static final String JSON_PROPERTY_BASIC_CREATIVE = "basicCreative";
  private DpaBasicCreativeType basicCreative;

  public static final String JSON_PROPERTY_PRODUCT_CREATIVES = "productCreatives";
  private List<DpaProductCreativeType> productCreatives = null;

  public static final String JSON_PROPERTY_SHOW_URL = "showUrl";
  private String showUrl;

  public static final String JSON_PROPERTY_INDEX = "index";
  private Integer index;

  public static final String JSON_PROPERTY_MONITOR_URL = "monitorUrl";
  private String monitorUrl;

  public DpaCreativeType() { 
  }

  public DpaCreativeType userId(Long userId) {
    
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


  public DpaCreativeType campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Get campaignId
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCampaignId() {
    return campaignId;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public DpaCreativeType adgroupId(Long adgroupId) {
    
    this.adgroupId = adgroupId;
    return this;
  }

   /**
   * Get adgroupId
   * @return adgroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADGROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdgroupId() {
    return adgroupId;
  }


  @JsonProperty(JSON_PROPERTY_ADGROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
  }


  public DpaCreativeType basicCreative(DpaBasicCreativeType basicCreative) {
    
    this.basicCreative = basicCreative;
    return this;
  }

   /**
   * Get basicCreative
   * @return basicCreative
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BASIC_CREATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DpaBasicCreativeType getBasicCreative() {
    return basicCreative;
  }


  @JsonProperty(JSON_PROPERTY_BASIC_CREATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBasicCreative(DpaBasicCreativeType basicCreative) {
    this.basicCreative = basicCreative;
  }


  public DpaCreativeType productCreatives(List<DpaProductCreativeType> productCreatives) {
    
    this.productCreatives = productCreatives;
    return this;
  }

  public DpaCreativeType addProductCreativesItem(DpaProductCreativeType productCreativesItem) {
    if (this.productCreatives == null) {
      this.productCreatives = new ArrayList<>();
    }
    this.productCreatives.add(productCreativesItem);
    return this;
  }

   /**
   * Get productCreatives
   * @return productCreatives
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_CREATIVES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DpaProductCreativeType> getProductCreatives() {
    return productCreatives;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_CREATIVES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductCreatives(List<DpaProductCreativeType> productCreatives) {
    this.productCreatives = productCreatives;
  }


  public DpaCreativeType showUrl(String showUrl) {
    
    this.showUrl = showUrl;
    return this;
  }

   /**
   * Get showUrl
   * @return showUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOW_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShowUrl() {
    return showUrl;
  }


  @JsonProperty(JSON_PROPERTY_SHOW_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowUrl(String showUrl) {
    this.showUrl = showUrl;
  }


  public DpaCreativeType index(Integer index) {
    
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIndex() {
    return index;
  }


  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndex(Integer index) {
    this.index = index;
  }


  public DpaCreativeType monitorUrl(String monitorUrl) {
    
    this.monitorUrl = monitorUrl;
    return this;
  }

   /**
   * Get monitorUrl
   * @return monitorUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MONITOR_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMonitorUrl() {
    return monitorUrl;
  }


  @JsonProperty(JSON_PROPERTY_MONITOR_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonitorUrl(String monitorUrl) {
    this.monitorUrl = monitorUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpaCreativeType dpaCreativeType = (DpaCreativeType) o;
    return Objects.equals(this.userId, dpaCreativeType.userId) &&
        Objects.equals(this.campaignId, dpaCreativeType.campaignId) &&
        Objects.equals(this.adgroupId, dpaCreativeType.adgroupId) &&
        Objects.equals(this.basicCreative, dpaCreativeType.basicCreative) &&
        Objects.equals(this.productCreatives, dpaCreativeType.productCreatives) &&
        Objects.equals(this.showUrl, dpaCreativeType.showUrl) &&
        Objects.equals(this.index, dpaCreativeType.index) &&
        Objects.equals(this.monitorUrl, dpaCreativeType.monitorUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, campaignId, adgroupId, basicCreative, productCreatives, showUrl, index, monitorUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpaCreativeType {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    adgroupId: ").append(toIndentedString(adgroupId)).append("\n");
    sb.append("    basicCreative: ").append(toIndentedString(basicCreative)).append("\n");
    sb.append("    productCreatives: ").append(toIndentedString(productCreatives)).append("\n");
    sb.append("    showUrl: ").append(toIndentedString(showUrl)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    monitorUrl: ").append(toIndentedString(monitorUrl)).append("\n");
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
