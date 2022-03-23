/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.leadsnotice.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * NoticeListRequest
 */
@JsonPropertyOrder({
  NoticeListRequest.JSON_PROPERTY_SOLUTION_TYPE,
  NoticeListRequest.JSON_PROPERTY_START_DATE,
  NoticeListRequest.JSON_PROPERTY_END_DATE,
  NoticeListRequest.JSON_PROPERTY_PAGE_NO,
  NoticeListRequest.JSON_PROPERTY_PAGE_SIZE
})
@JsonTypeName("NoticeListRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NoticeListRequest {
  public static final String JSON_PROPERTY_SOLUTION_TYPE = "solutionType";
  private String solutionType;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_PAGE_NO = "pageNo";
  private Integer pageNo;

  public static final String JSON_PROPERTY_PAGE_SIZE = "pageSize";
  private Integer pageSize;

  public NoticeListRequest() { 
  }

  public NoticeListRequest solutionType(String solutionType) {
    
    this.solutionType = solutionType;
    return this;
  }

   /**
   * Get solutionType
   * @return solutionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOLUTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSolutionType() {
    return solutionType;
  }


  @JsonProperty(JSON_PROPERTY_SOLUTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSolutionType(String solutionType) {
    this.solutionType = solutionType;
  }


  public NoticeListRequest startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public NoticeListRequest endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public NoticeListRequest pageNo(Integer pageNo) {
    
    this.pageNo = pageNo;
    return this;
  }

   /**
   * Get pageNo
   * @return pageNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageNo() {
    return pageNo;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageNo(Integer pageNo) {
    this.pageNo = pageNo;
  }


  public NoticeListRequest pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageSize() {
    return pageSize;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NoticeListRequest noticeListRequest = (NoticeListRequest) o;
    return Objects.equals(this.solutionType, noticeListRequest.solutionType) &&
        Objects.equals(this.startDate, noticeListRequest.startDate) &&
        Objects.equals(this.endDate, noticeListRequest.endDate) &&
        Objects.equals(this.pageNo, noticeListRequest.pageNo) &&
        Objects.equals(this.pageSize, noticeListRequest.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(solutionType, startDate, endDate, pageNo, pageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NoticeListRequest {\n");
    sb.append("    solutionType: ").append(toIndentedString(solutionType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
