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
import com.baidu.dev2.api.sdk.advice.model.FieldFilter;
import com.baidu.dev2.api.sdk.advice.model.OcpcPriceType;
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
 * OcpcPriceInfo
 */
@JsonPropertyOrder({
  OcpcPriceInfo.JSON_PROPERTY_ITEMS,
  OcpcPriceInfo.JSON_PROPERTY_TOTAL_COUNT,
  OcpcPriceInfo.JSON_PROPERTY_FILTERS,
  OcpcPriceInfo.JSON_PROPERTY_ECPC_MAX_BID_RATIO
})
@JsonTypeName("OcpcPriceInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OcpcPriceInfo {
  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<OcpcPriceType> items = null;

  public static final String JSON_PROPERTY_TOTAL_COUNT = "totalCount";
  private Integer totalCount;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<FieldFilter> filters = null;

  public static final String JSON_PROPERTY_ECPC_MAX_BID_RATIO = "ecpcMaxBidRatio";
  private Double ecpcMaxBidRatio;

  public OcpcPriceInfo() { 
  }

  public OcpcPriceInfo items(List<OcpcPriceType> items) {
    
    this.items = items;
    return this;
  }

  public OcpcPriceInfo addItemsItem(OcpcPriceType itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OcpcPriceType> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(List<OcpcPriceType> items) {
    this.items = items;
  }


  public OcpcPriceInfo totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalCount() {
    return totalCount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  public OcpcPriceInfo filters(List<FieldFilter> filters) {
    
    this.filters = filters;
    return this;
  }

  public OcpcPriceInfo addFiltersItem(FieldFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FieldFilter> getFilters() {
    return filters;
  }


  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilters(List<FieldFilter> filters) {
    this.filters = filters;
  }


  public OcpcPriceInfo ecpcMaxBidRatio(Double ecpcMaxBidRatio) {
    
    this.ecpcMaxBidRatio = ecpcMaxBidRatio;
    return this;
  }

   /**
   * Get ecpcMaxBidRatio
   * @return ecpcMaxBidRatio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ECPC_MAX_BID_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getEcpcMaxBidRatio() {
    return ecpcMaxBidRatio;
  }


  @JsonProperty(JSON_PROPERTY_ECPC_MAX_BID_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEcpcMaxBidRatio(Double ecpcMaxBidRatio) {
    this.ecpcMaxBidRatio = ecpcMaxBidRatio;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcpcPriceInfo ocpcPriceInfo = (OcpcPriceInfo) o;
    return Objects.equals(this.items, ocpcPriceInfo.items) &&
        Objects.equals(this.totalCount, ocpcPriceInfo.totalCount) &&
        Objects.equals(this.filters, ocpcPriceInfo.filters) &&
        Objects.equals(this.ecpcMaxBidRatio, ocpcPriceInfo.ecpcMaxBidRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, totalCount, filters, ecpcMaxBidRatio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcpcPriceInfo {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    ecpcMaxBidRatio: ").append(toIndentedString(ecpcMaxBidRatio)).append("\n");
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
