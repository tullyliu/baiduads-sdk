/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.marketapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.marketapi.model.OpenPageInfoType;
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
 * OpenSiteInfoResponse
 */
@JsonPropertyOrder({
  OpenSiteInfoResponse.JSON_PROPERTY_SITE_ID,
  OpenSiteInfoResponse.JSON_PROPERTY_AUDIT_STATUS,
  OpenSiteInfoResponse.JSON_PROPERTY_SITE_ONLINE_URL,
  OpenSiteInfoResponse.JSON_PROPERTY_PAGE_INFOS,
  OpenSiteInfoResponse.JSON_PROPERTY_CREATE_TIME
})
@JsonTypeName("OpenSiteInfoResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OpenSiteInfoResponse {
  public static final String JSON_PROPERTY_SITE_ID = "siteId";
  private Long siteId;

  public static final String JSON_PROPERTY_AUDIT_STATUS = "auditStatus";
  private Integer auditStatus;

  public static final String JSON_PROPERTY_SITE_ONLINE_URL = "siteOnlineUrl";
  private String siteOnlineUrl;

  public static final String JSON_PROPERTY_PAGE_INFOS = "pageInfos";
  private List<OpenPageInfoType> pageInfos = null;

  public static final String JSON_PROPERTY_CREATE_TIME = "createTime";
  private Long createTime;

  public OpenSiteInfoResponse() { 
  }

  public OpenSiteInfoResponse siteId(Long siteId) {
    
    this.siteId = siteId;
    return this;
  }

   /**
   * Get siteId
   * @return siteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SITE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSiteId() {
    return siteId;
  }


  @JsonProperty(JSON_PROPERTY_SITE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSiteId(Long siteId) {
    this.siteId = siteId;
  }


  public OpenSiteInfoResponse auditStatus(Integer auditStatus) {
    
    this.auditStatus = auditStatus;
    return this;
  }

   /**
   * Get auditStatus
   * @return auditStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUDIT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAuditStatus() {
    return auditStatus;
  }


  @JsonProperty(JSON_PROPERTY_AUDIT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuditStatus(Integer auditStatus) {
    this.auditStatus = auditStatus;
  }


  public OpenSiteInfoResponse siteOnlineUrl(String siteOnlineUrl) {
    
    this.siteOnlineUrl = siteOnlineUrl;
    return this;
  }

   /**
   * Get siteOnlineUrl
   * @return siteOnlineUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SITE_ONLINE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSiteOnlineUrl() {
    return siteOnlineUrl;
  }


  @JsonProperty(JSON_PROPERTY_SITE_ONLINE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSiteOnlineUrl(String siteOnlineUrl) {
    this.siteOnlineUrl = siteOnlineUrl;
  }


  public OpenSiteInfoResponse pageInfos(List<OpenPageInfoType> pageInfos) {
    
    this.pageInfos = pageInfos;
    return this;
  }

  public OpenSiteInfoResponse addPageInfosItem(OpenPageInfoType pageInfosItem) {
    if (this.pageInfos == null) {
      this.pageInfos = new ArrayList<>();
    }
    this.pageInfos.add(pageInfosItem);
    return this;
  }

   /**
   * Get pageInfos
   * @return pageInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE_INFOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OpenPageInfoType> getPageInfos() {
    return pageInfos;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_INFOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageInfos(List<OpenPageInfoType> pageInfos) {
    this.pageInfos = pageInfos;
  }


  public OpenSiteInfoResponse createTime(Long createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreateTime() {
    return createTime;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenSiteInfoResponse openSiteInfoResponse = (OpenSiteInfoResponse) o;
    return Objects.equals(this.siteId, openSiteInfoResponse.siteId) &&
        Objects.equals(this.auditStatus, openSiteInfoResponse.auditStatus) &&
        Objects.equals(this.siteOnlineUrl, openSiteInfoResponse.siteOnlineUrl) &&
        Objects.equals(this.pageInfos, openSiteInfoResponse.pageInfos) &&
        Objects.equals(this.createTime, openSiteInfoResponse.createTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siteId, auditStatus, siteOnlineUrl, pageInfos, createTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenSiteInfoResponse {\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    siteOnlineUrl: ").append(toIndentedString(siteOnlineUrl)).append("\n");
    sb.append("    pageInfos: ").append(toIndentedString(pageInfos)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
