/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.ocpc.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.ocpc.model.TargetPackageType;
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
 * ModPackageRequest
 */
@JsonPropertyOrder({
  ModPackageRequest.JSON_PROPERTY_TARGET_PACKAGE_TYPE
})
@JsonTypeName("ModPackageRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModPackageRequest {
  public static final String JSON_PROPERTY_TARGET_PACKAGE_TYPE = "targetPackageType";
  private List<TargetPackageType> targetPackageType = null;

  public ModPackageRequest() { 
  }

  public ModPackageRequest targetPackageType(List<TargetPackageType> targetPackageType) {
    
    this.targetPackageType = targetPackageType;
    return this;
  }

  public ModPackageRequest addTargetPackageTypeItem(TargetPackageType targetPackageTypeItem) {
    if (this.targetPackageType == null) {
      this.targetPackageType = new ArrayList<>();
    }
    this.targetPackageType.add(targetPackageTypeItem);
    return this;
  }

   /**
   * Get targetPackageType
   * @return targetPackageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_PACKAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TargetPackageType> getTargetPackageType() {
    return targetPackageType;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_PACKAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetPackageType(List<TargetPackageType> targetPackageType) {
    this.targetPackageType = targetPackageType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModPackageRequest modPackageRequest = (ModPackageRequest) o;
    return Objects.equals(this.targetPackageType, modPackageRequest.targetPackageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetPackageType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModPackageRequest {\n");
    sb.append("    targetPackageType: ").append(toIndentedString(targetPackageType)).append("\n");
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
