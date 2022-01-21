/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.adgroupfeed.model;

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
 * OcpcType
 */
@JsonPropertyOrder({
  OcpcType.JSON_PROPERTY_APP_TRANS_ID,
  OcpcType.JSON_PROPERTY_TRANS_FROM,
  OcpcType.JSON_PROPERTY_OCPC_BID,
  OcpcType.JSON_PROPERTY_LP_URL,
  OcpcType.JSON_PROPERTY_TRANS_TYPE,
  OcpcType.JSON_PROPERTY_OCPC_LEVEL,
  OcpcType.JSON_PROPERTY_IS_SKIP_STAGE_ONE,
  OcpcType.JSON_PROPERTY_IS_OPEN_OCPC_LAB,
  OcpcType.JSON_PROPERTY_PAY_MODE,
  OcpcType.JSON_PROPERTY_OPTIMIZE_DEEP_TRANS,
  OcpcType.JSON_PROPERTY_DEEP_OCPC_BID,
  OcpcType.JSON_PROPERTY_DEEP_TRANS_TYPE,
  OcpcType.JSON_PROPERTY_USE_ROI,
  OcpcType.JSON_PROPERTY_ROI_RATIO,
  OcpcType.JSON_PROPERTY_IS_MANUAL_BID_FOR_MAX_MODE,
  OcpcType.JSON_PROPERTY_IS_MANUAL_DEEP_BID_FOR_MAX_MODE,
  OcpcType.JSON_PROPERTY_BROAD_CAST_MODE,
  OcpcType.JSON_PROPERTY_ANCHOR_ID
})
@JsonTypeName("OcpcType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OcpcType {
  public static final String JSON_PROPERTY_APP_TRANS_ID = "appTransId";
  private Long appTransId;

  public static final String JSON_PROPERTY_TRANS_FROM = "transFrom";
  private Integer transFrom;

  public static final String JSON_PROPERTY_OCPC_BID = "ocpcBid";
  private Double ocpcBid;

  public static final String JSON_PROPERTY_LP_URL = "lpUrl";
  private String lpUrl;

  public static final String JSON_PROPERTY_TRANS_TYPE = "transType";
  private Integer transType;

  public static final String JSON_PROPERTY_OCPC_LEVEL = "ocpcLevel";
  private Integer ocpcLevel;

  public static final String JSON_PROPERTY_IS_SKIP_STAGE_ONE = "isSkipStageOne";
  private Boolean isSkipStageOne;

  public static final String JSON_PROPERTY_IS_OPEN_OCPC_LAB = "isOpenOcpcLab";
  private Boolean isOpenOcpcLab;

  public static final String JSON_PROPERTY_PAY_MODE = "payMode";
  private Integer payMode;

  public static final String JSON_PROPERTY_OPTIMIZE_DEEP_TRANS = "optimizeDeepTrans";
  private Boolean optimizeDeepTrans;

  public static final String JSON_PROPERTY_DEEP_OCPC_BID = "deepOcpcBid";
  private Double deepOcpcBid;

  public static final String JSON_PROPERTY_DEEP_TRANS_TYPE = "deepTransType";
  private Integer deepTransType;

  public static final String JSON_PROPERTY_USE_ROI = "useRoi";
  private Boolean useRoi;

  public static final String JSON_PROPERTY_ROI_RATIO = "roiRatio";
  private Double roiRatio;

  public static final String JSON_PROPERTY_IS_MANUAL_BID_FOR_MAX_MODE = "isManualBidForMaxMode";
  private Integer isManualBidForMaxMode;

  public static final String JSON_PROPERTY_IS_MANUAL_DEEP_BID_FOR_MAX_MODE = "isManualDeepBidForMaxMode";
  private Integer isManualDeepBidForMaxMode;

  public static final String JSON_PROPERTY_BROAD_CAST_MODE = "broadCastMode";
  private Integer broadCastMode;

  public static final String JSON_PROPERTY_ANCHOR_ID = "anchorId";
  private Long anchorId;

  public OcpcType() { 
  }

  public OcpcType appTransId(Long appTransId) {
    
    this.appTransId = appTransId;
    return this;
  }

   /**
   * Get appTransId
   * @return appTransId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APP_TRANS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAppTransId() {
    return appTransId;
  }


  @JsonProperty(JSON_PROPERTY_APP_TRANS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppTransId(Long appTransId) {
    this.appTransId = appTransId;
  }


  public OcpcType transFrom(Integer transFrom) {
    
    this.transFrom = transFrom;
    return this;
  }

   /**
   * Get transFrom
   * @return transFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANS_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTransFrom() {
    return transFrom;
  }


  @JsonProperty(JSON_PROPERTY_TRANS_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransFrom(Integer transFrom) {
    this.transFrom = transFrom;
  }


  public OcpcType ocpcBid(Double ocpcBid) {
    
    this.ocpcBid = ocpcBid;
    return this;
  }

   /**
   * Get ocpcBid
   * @return ocpcBid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OCPC_BID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getOcpcBid() {
    return ocpcBid;
  }


  @JsonProperty(JSON_PROPERTY_OCPC_BID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOcpcBid(Double ocpcBid) {
    this.ocpcBid = ocpcBid;
  }


  public OcpcType lpUrl(String lpUrl) {
    
    this.lpUrl = lpUrl;
    return this;
  }

   /**
   * Get lpUrl
   * @return lpUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LP_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLpUrl() {
    return lpUrl;
  }


  @JsonProperty(JSON_PROPERTY_LP_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLpUrl(String lpUrl) {
    this.lpUrl = lpUrl;
  }


  public OcpcType transType(Integer transType) {
    
    this.transType = transType;
    return this;
  }

   /**
   * Get transType
   * @return transType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTransType() {
    return transType;
  }


  @JsonProperty(JSON_PROPERTY_TRANS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransType(Integer transType) {
    this.transType = transType;
  }


  public OcpcType ocpcLevel(Integer ocpcLevel) {
    
    this.ocpcLevel = ocpcLevel;
    return this;
  }

   /**
   * Get ocpcLevel
   * @return ocpcLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OCPC_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOcpcLevel() {
    return ocpcLevel;
  }


  @JsonProperty(JSON_PROPERTY_OCPC_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOcpcLevel(Integer ocpcLevel) {
    this.ocpcLevel = ocpcLevel;
  }


  public OcpcType isSkipStageOne(Boolean isSkipStageOne) {
    
    this.isSkipStageOne = isSkipStageOne;
    return this;
  }

   /**
   * Get isSkipStageOne
   * @return isSkipStageOne
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_SKIP_STAGE_ONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsSkipStageOne() {
    return isSkipStageOne;
  }


  @JsonProperty(JSON_PROPERTY_IS_SKIP_STAGE_ONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsSkipStageOne(Boolean isSkipStageOne) {
    this.isSkipStageOne = isSkipStageOne;
  }


  public OcpcType isOpenOcpcLab(Boolean isOpenOcpcLab) {
    
    this.isOpenOcpcLab = isOpenOcpcLab;
    return this;
  }

   /**
   * Get isOpenOcpcLab
   * @return isOpenOcpcLab
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_OPEN_OCPC_LAB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsOpenOcpcLab() {
    return isOpenOcpcLab;
  }


  @JsonProperty(JSON_PROPERTY_IS_OPEN_OCPC_LAB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsOpenOcpcLab(Boolean isOpenOcpcLab) {
    this.isOpenOcpcLab = isOpenOcpcLab;
  }


  public OcpcType payMode(Integer payMode) {
    
    this.payMode = payMode;
    return this;
  }

   /**
   * Get payMode
   * @return payMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPayMode() {
    return payMode;
  }


  @JsonProperty(JSON_PROPERTY_PAY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayMode(Integer payMode) {
    this.payMode = payMode;
  }


  public OcpcType optimizeDeepTrans(Boolean optimizeDeepTrans) {
    
    this.optimizeDeepTrans = optimizeDeepTrans;
    return this;
  }

   /**
   * Get optimizeDeepTrans
   * @return optimizeDeepTrans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPTIMIZE_DEEP_TRANS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOptimizeDeepTrans() {
    return optimizeDeepTrans;
  }


  @JsonProperty(JSON_PROPERTY_OPTIMIZE_DEEP_TRANS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptimizeDeepTrans(Boolean optimizeDeepTrans) {
    this.optimizeDeepTrans = optimizeDeepTrans;
  }


  public OcpcType deepOcpcBid(Double deepOcpcBid) {
    
    this.deepOcpcBid = deepOcpcBid;
    return this;
  }

   /**
   * Get deepOcpcBid
   * @return deepOcpcBid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEEP_OCPC_BID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getDeepOcpcBid() {
    return deepOcpcBid;
  }


  @JsonProperty(JSON_PROPERTY_DEEP_OCPC_BID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeepOcpcBid(Double deepOcpcBid) {
    this.deepOcpcBid = deepOcpcBid;
  }


  public OcpcType deepTransType(Integer deepTransType) {
    
    this.deepTransType = deepTransType;
    return this;
  }

   /**
   * Get deepTransType
   * @return deepTransType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEEP_TRANS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDeepTransType() {
    return deepTransType;
  }


  @JsonProperty(JSON_PROPERTY_DEEP_TRANS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeepTransType(Integer deepTransType) {
    this.deepTransType = deepTransType;
  }


  public OcpcType useRoi(Boolean useRoi) {
    
    this.useRoi = useRoi;
    return this;
  }

   /**
   * Get useRoi
   * @return useRoi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USE_ROI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUseRoi() {
    return useRoi;
  }


  @JsonProperty(JSON_PROPERTY_USE_ROI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseRoi(Boolean useRoi) {
    this.useRoi = useRoi;
  }


  public OcpcType roiRatio(Double roiRatio) {
    
    this.roiRatio = roiRatio;
    return this;
  }

   /**
   * Get roiRatio
   * @return roiRatio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ROI_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getRoiRatio() {
    return roiRatio;
  }


  @JsonProperty(JSON_PROPERTY_ROI_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoiRatio(Double roiRatio) {
    this.roiRatio = roiRatio;
  }


  public OcpcType isManualBidForMaxMode(Integer isManualBidForMaxMode) {
    
    this.isManualBidForMaxMode = isManualBidForMaxMode;
    return this;
  }

   /**
   * Get isManualBidForMaxMode
   * @return isManualBidForMaxMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_MANUAL_BID_FOR_MAX_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIsManualBidForMaxMode() {
    return isManualBidForMaxMode;
  }


  @JsonProperty(JSON_PROPERTY_IS_MANUAL_BID_FOR_MAX_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsManualBidForMaxMode(Integer isManualBidForMaxMode) {
    this.isManualBidForMaxMode = isManualBidForMaxMode;
  }


  public OcpcType isManualDeepBidForMaxMode(Integer isManualDeepBidForMaxMode) {
    
    this.isManualDeepBidForMaxMode = isManualDeepBidForMaxMode;
    return this;
  }

   /**
   * Get isManualDeepBidForMaxMode
   * @return isManualDeepBidForMaxMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_MANUAL_DEEP_BID_FOR_MAX_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIsManualDeepBidForMaxMode() {
    return isManualDeepBidForMaxMode;
  }


  @JsonProperty(JSON_PROPERTY_IS_MANUAL_DEEP_BID_FOR_MAX_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsManualDeepBidForMaxMode(Integer isManualDeepBidForMaxMode) {
    this.isManualDeepBidForMaxMode = isManualDeepBidForMaxMode;
  }


  public OcpcType broadCastMode(Integer broadCastMode) {
    
    this.broadCastMode = broadCastMode;
    return this;
  }

   /**
   * Get broadCastMode
   * @return broadCastMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BROAD_CAST_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBroadCastMode() {
    return broadCastMode;
  }


  @JsonProperty(JSON_PROPERTY_BROAD_CAST_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBroadCastMode(Integer broadCastMode) {
    this.broadCastMode = broadCastMode;
  }


  public OcpcType anchorId(Long anchorId) {
    
    this.anchorId = anchorId;
    return this;
  }

   /**
   * Get anchorId
   * @return anchorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANCHOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAnchorId() {
    return anchorId;
  }


  @JsonProperty(JSON_PROPERTY_ANCHOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnchorId(Long anchorId) {
    this.anchorId = anchorId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcpcType ocpcType = (OcpcType) o;
    return Objects.equals(this.appTransId, ocpcType.appTransId) &&
        Objects.equals(this.transFrom, ocpcType.transFrom) &&
        Objects.equals(this.ocpcBid, ocpcType.ocpcBid) &&
        Objects.equals(this.lpUrl, ocpcType.lpUrl) &&
        Objects.equals(this.transType, ocpcType.transType) &&
        Objects.equals(this.ocpcLevel, ocpcType.ocpcLevel) &&
        Objects.equals(this.isSkipStageOne, ocpcType.isSkipStageOne) &&
        Objects.equals(this.isOpenOcpcLab, ocpcType.isOpenOcpcLab) &&
        Objects.equals(this.payMode, ocpcType.payMode) &&
        Objects.equals(this.optimizeDeepTrans, ocpcType.optimizeDeepTrans) &&
        Objects.equals(this.deepOcpcBid, ocpcType.deepOcpcBid) &&
        Objects.equals(this.deepTransType, ocpcType.deepTransType) &&
        Objects.equals(this.useRoi, ocpcType.useRoi) &&
        Objects.equals(this.roiRatio, ocpcType.roiRatio) &&
        Objects.equals(this.isManualBidForMaxMode, ocpcType.isManualBidForMaxMode) &&
        Objects.equals(this.isManualDeepBidForMaxMode, ocpcType.isManualDeepBidForMaxMode) &&
        Objects.equals(this.broadCastMode, ocpcType.broadCastMode) &&
        Objects.equals(this.anchorId, ocpcType.anchorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appTransId, transFrom, ocpcBid, lpUrl, transType, ocpcLevel, isSkipStageOne, isOpenOcpcLab, payMode, optimizeDeepTrans, deepOcpcBid, deepTransType, useRoi, roiRatio, isManualBidForMaxMode, isManualDeepBidForMaxMode, broadCastMode, anchorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcpcType {\n");
    sb.append("    appTransId: ").append(toIndentedString(appTransId)).append("\n");
    sb.append("    transFrom: ").append(toIndentedString(transFrom)).append("\n");
    sb.append("    ocpcBid: ").append(toIndentedString(ocpcBid)).append("\n");
    sb.append("    lpUrl: ").append(toIndentedString(lpUrl)).append("\n");
    sb.append("    transType: ").append(toIndentedString(transType)).append("\n");
    sb.append("    ocpcLevel: ").append(toIndentedString(ocpcLevel)).append("\n");
    sb.append("    isSkipStageOne: ").append(toIndentedString(isSkipStageOne)).append("\n");
    sb.append("    isOpenOcpcLab: ").append(toIndentedString(isOpenOcpcLab)).append("\n");
    sb.append("    payMode: ").append(toIndentedString(payMode)).append("\n");
    sb.append("    optimizeDeepTrans: ").append(toIndentedString(optimizeDeepTrans)).append("\n");
    sb.append("    deepOcpcBid: ").append(toIndentedString(deepOcpcBid)).append("\n");
    sb.append("    deepTransType: ").append(toIndentedString(deepTransType)).append("\n");
    sb.append("    useRoi: ").append(toIndentedString(useRoi)).append("\n");
    sb.append("    roiRatio: ").append(toIndentedString(roiRatio)).append("\n");
    sb.append("    isManualBidForMaxMode: ").append(toIndentedString(isManualBidForMaxMode)).append("\n");
    sb.append("    isManualDeepBidForMaxMode: ").append(toIndentedString(isManualDeepBidForMaxMode)).append("\n");
    sb.append("    broadCastMode: ").append(toIndentedString(broadCastMode)).append("\n");
    sb.append("    anchorId: ").append(toIndentedString(anchorId)).append("\n");
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
