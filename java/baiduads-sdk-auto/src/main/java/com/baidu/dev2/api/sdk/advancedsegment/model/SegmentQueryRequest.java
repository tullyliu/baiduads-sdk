/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.advancedsegment.model;

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
 * SegmentQueryRequest
 */
@JsonPropertyOrder({
  SegmentQueryRequest.JSON_PROPERTY_ORDER_BY,
  SegmentQueryRequest.JSON_PROPERTY_SEGMENT_TYPES,
  SegmentQueryRequest.JSON_PROPERTY_IDS,
  SegmentQueryRequest.JSON_PROPERTY_ID_TYPE
})
@JsonTypeName("SegmentQueryRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SegmentQueryRequest {
  public static final String JSON_PROPERTY_ORDER_BY = "orderBy";
  private String orderBy;

  public static final String JSON_PROPERTY_SEGMENT_TYPES = "segmentTypes";
  private List<Long> segmentTypes = null;

  public static final String JSON_PROPERTY_IDS = "ids";
  private List<Long> ids = null;

  public static final String JSON_PROPERTY_ID_TYPE = "idType";
  private Integer idType;

  public SegmentQueryRequest() { 
  }

  public SegmentQueryRequest orderBy(String orderBy) {
    
    this.orderBy = orderBy;
    return this;
  }

   /**
   * Get orderBy
   * @return orderBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORDER_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrderBy() {
    return orderBy;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderBy(String orderBy) {
    this.orderBy = orderBy;
  }


  public SegmentQueryRequest segmentTypes(List<Long> segmentTypes) {
    
    this.segmentTypes = segmentTypes;
    return this;
  }

  public SegmentQueryRequest addSegmentTypesItem(Long segmentTypesItem) {
    if (this.segmentTypes == null) {
      this.segmentTypes = new ArrayList<>();
    }
    this.segmentTypes.add(segmentTypesItem);
    return this;
  }

   /**
   * Get segmentTypes
   * @return segmentTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SEGMENT_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getSegmentTypes() {
    return segmentTypes;
  }


  @JsonProperty(JSON_PROPERTY_SEGMENT_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSegmentTypes(List<Long> segmentTypes) {
    this.segmentTypes = segmentTypes;
  }


  public SegmentQueryRequest ids(List<Long> ids) {
    
    this.ids = ids;
    return this;
  }

  public SegmentQueryRequest addIdsItem(Long idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Get ids
   * @return ids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getIds() {
    return ids;
  }


  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIds(List<Long> ids) {
    this.ids = ids;
  }


  public SegmentQueryRequest idType(Integer idType) {
    
    this.idType = idType;
    return this;
  }

   /**
   * Get idType
   * @return idType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIdType() {
    return idType;
  }


  @JsonProperty(JSON_PROPERTY_ID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdType(Integer idType) {
    this.idType = idType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentQueryRequest segmentQueryRequest = (SegmentQueryRequest) o;
    return Objects.equals(this.orderBy, segmentQueryRequest.orderBy) &&
        Objects.equals(this.segmentTypes, segmentQueryRequest.segmentTypes) &&
        Objects.equals(this.ids, segmentQueryRequest.ids) &&
        Objects.equals(this.idType, segmentQueryRequest.idType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderBy, segmentTypes, ids, idType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentQueryRequest {\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    segmentTypes: ").append(toIndentedString(segmentTypes)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
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
