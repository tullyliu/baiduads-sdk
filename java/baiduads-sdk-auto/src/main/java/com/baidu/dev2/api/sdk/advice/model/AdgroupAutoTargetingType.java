/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.advice.model;

import java.util.Objects;
import java.util.Arrays;
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
 * AdgroupAutoTargetingType
 */
@JsonPropertyOrder({
  AdgroupAutoTargetingType.JSON_PROPERTY_ADGROUP_ID,
  AdgroupAutoTargetingType.JSON_PROPERTY_ADGROUP_NAME,
  AdgroupAutoTargetingType.JSON_PROPERTY_CAMPAIGN_ID,
  AdgroupAutoTargetingType.JSON_PROPERTY_CAMPAIGN_NAME,
  AdgroupAutoTargetingType.JSON_PROPERTY_CONVERSION,
  AdgroupAutoTargetingType.JSON_PROPERTY_CLICK,
  AdgroupAutoTargetingType.JSON_PROPERTY_COST,
  AdgroupAutoTargetingType.JSON_PROPERTY_STRATEGY_IDS,
  AdgroupAutoTargetingType.JSON_PROPERTY_ADGROUP_AUTO_TARGETING_STATUS,
  AdgroupAutoTargetingType.JSON_PROPERTY_ADGROUP_AUTO_TARGETING_STATUS_NAME,
  AdgroupAutoTargetingType.JSON_PROPERTY_SUGGEST
})
@JsonTypeName("AdgroupAutoTargetingType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdgroupAutoTargetingType {
  public static final String JSON_PROPERTY_ADGROUP_ID = "adgroupId";
  private Long adgroupId;

  public static final String JSON_PROPERTY_ADGROUP_NAME = "adgroupName";
  private String adgroupName;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_CAMPAIGN_NAME = "campaignName";
  private String campaignName;

  public static final String JSON_PROPERTY_CONVERSION = "conversion";
  private Long conversion;

  public static final String JSON_PROPERTY_CLICK = "click";
  private Long click;

  public static final String JSON_PROPERTY_COST = "cost";
  private Double cost;

  public static final String JSON_PROPERTY_STRATEGY_IDS = "strategyIds";
  private List<Long> strategyIds = null;

  public static final String JSON_PROPERTY_ADGROUP_AUTO_TARGETING_STATUS = "adgroupAutoTargetingStatus";
  private Boolean adgroupAutoTargetingStatus;

  public static final String JSON_PROPERTY_ADGROUP_AUTO_TARGETING_STATUS_NAME = "adgroupAutoTargetingStatusName";
  private String adgroupAutoTargetingStatusName;

  public static final String JSON_PROPERTY_SUGGEST = "suggest";
  private String suggest;

  public AdgroupAutoTargetingType() { 
  }

  public AdgroupAutoTargetingType adgroupId(Long adgroupId) {
    
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


  public AdgroupAutoTargetingType adgroupName(String adgroupName) {
    
    this.adgroupName = adgroupName;
    return this;
  }

   /**
   * Get adgroupName
   * @return adgroupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADGROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdgroupName() {
    return adgroupName;
  }


  @JsonProperty(JSON_PROPERTY_ADGROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdgroupName(String adgroupName) {
    this.adgroupName = adgroupName;
  }


  public AdgroupAutoTargetingType campaignId(Long campaignId) {
    
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


  public AdgroupAutoTargetingType campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * Get campaignName
   * @return campaignName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCampaignName() {
    return campaignName;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }


  public AdgroupAutoTargetingType conversion(Long conversion) {
    
    this.conversion = conversion;
    return this;
  }

   /**
   * Get conversion
   * @return conversion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONVERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getConversion() {
    return conversion;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversion(Long conversion) {
    this.conversion = conversion;
  }


  public AdgroupAutoTargetingType click(Long click) {
    
    this.click = click;
    return this;
  }

   /**
   * Get click
   * @return click
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLICK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getClick() {
    return click;
  }


  @JsonProperty(JSON_PROPERTY_CLICK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClick(Long click) {
    this.click = click;
  }


  public AdgroupAutoTargetingType cost(Double cost) {
    
    this.cost = cost;
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCost() {
    return cost;
  }


  @JsonProperty(JSON_PROPERTY_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCost(Double cost) {
    this.cost = cost;
  }


  public AdgroupAutoTargetingType strategyIds(List<Long> strategyIds) {
    
    this.strategyIds = strategyIds;
    return this;
  }

  public AdgroupAutoTargetingType addStrategyIdsItem(Long strategyIdsItem) {
    if (this.strategyIds == null) {
      this.strategyIds = new ArrayList<>();
    }
    this.strategyIds.add(strategyIdsItem);
    return this;
  }

   /**
   * Get strategyIds
   * @return strategyIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STRATEGY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getStrategyIds() {
    return strategyIds;
  }


  @JsonProperty(JSON_PROPERTY_STRATEGY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStrategyIds(List<Long> strategyIds) {
    this.strategyIds = strategyIds;
  }


  public AdgroupAutoTargetingType adgroupAutoTargetingStatus(Boolean adgroupAutoTargetingStatus) {
    
    this.adgroupAutoTargetingStatus = adgroupAutoTargetingStatus;
    return this;
  }

   /**
   * Get adgroupAutoTargetingStatus
   * @return adgroupAutoTargetingStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADGROUP_AUTO_TARGETING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAdgroupAutoTargetingStatus() {
    return adgroupAutoTargetingStatus;
  }


  @JsonProperty(JSON_PROPERTY_ADGROUP_AUTO_TARGETING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdgroupAutoTargetingStatus(Boolean adgroupAutoTargetingStatus) {
    this.adgroupAutoTargetingStatus = adgroupAutoTargetingStatus;
  }


  public AdgroupAutoTargetingType adgroupAutoTargetingStatusName(String adgroupAutoTargetingStatusName) {
    
    this.adgroupAutoTargetingStatusName = adgroupAutoTargetingStatusName;
    return this;
  }

   /**
   * Get adgroupAutoTargetingStatusName
   * @return adgroupAutoTargetingStatusName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADGROUP_AUTO_TARGETING_STATUS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdgroupAutoTargetingStatusName() {
    return adgroupAutoTargetingStatusName;
  }


  @JsonProperty(JSON_PROPERTY_ADGROUP_AUTO_TARGETING_STATUS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdgroupAutoTargetingStatusName(String adgroupAutoTargetingStatusName) {
    this.adgroupAutoTargetingStatusName = adgroupAutoTargetingStatusName;
  }


  public AdgroupAutoTargetingType suggest(String suggest) {
    
    this.suggest = suggest;
    return this;
  }

   /**
   * Get suggest
   * @return suggest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUGGEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSuggest() {
    return suggest;
  }


  @JsonProperty(JSON_PROPERTY_SUGGEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuggest(String suggest) {
    this.suggest = suggest;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdgroupAutoTargetingType adgroupAutoTargetingType = (AdgroupAutoTargetingType) o;
    return Objects.equals(this.adgroupId, adgroupAutoTargetingType.adgroupId) &&
        Objects.equals(this.adgroupName, adgroupAutoTargetingType.adgroupName) &&
        Objects.equals(this.campaignId, adgroupAutoTargetingType.campaignId) &&
        Objects.equals(this.campaignName, adgroupAutoTargetingType.campaignName) &&
        Objects.equals(this.conversion, adgroupAutoTargetingType.conversion) &&
        Objects.equals(this.click, adgroupAutoTargetingType.click) &&
        Objects.equals(this.cost, adgroupAutoTargetingType.cost) &&
        Objects.equals(this.strategyIds, adgroupAutoTargetingType.strategyIds) &&
        Objects.equals(this.adgroupAutoTargetingStatus, adgroupAutoTargetingType.adgroupAutoTargetingStatus) &&
        Objects.equals(this.adgroupAutoTargetingStatusName, adgroupAutoTargetingType.adgroupAutoTargetingStatusName) &&
        Objects.equals(this.suggest, adgroupAutoTargetingType.suggest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adgroupId, adgroupName, campaignId, campaignName, conversion, click, cost, strategyIds, adgroupAutoTargetingStatus, adgroupAutoTargetingStatusName, suggest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdgroupAutoTargetingType {\n");
    sb.append("    adgroupId: ").append(toIndentedString(adgroupId)).append("\n");
    sb.append("    adgroupName: ").append(toIndentedString(adgroupName)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    conversion: ").append(toIndentedString(conversion)).append("\n");
    sb.append("    click: ").append(toIndentedString(click)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    strategyIds: ").append(toIndentedString(strategyIds)).append("\n");
    sb.append("    adgroupAutoTargetingStatus: ").append(toIndentedString(adgroupAutoTargetingStatus)).append("\n");
    sb.append("    adgroupAutoTargetingStatusName: ").append(toIndentedString(adgroupAutoTargetingStatusName)).append("\n");
    sb.append("    suggest: ").append(toIndentedString(suggest)).append("\n");
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
