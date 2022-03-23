/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.dpacreative.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.dpacreative.model.CreativeGroupType;
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
 * AddCreativeGroupRequest
 */
@JsonPropertyOrder({
  AddCreativeGroupRequest.JSON_PROPERTY_CREATIVE_GROUP_TYPE
})
@JsonTypeName("AddCreativeGroupRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AddCreativeGroupRequest {
  public static final String JSON_PROPERTY_CREATIVE_GROUP_TYPE = "creativeGroupType";
  private CreativeGroupType creativeGroupType;

  public AddCreativeGroupRequest() { 
  }

  public AddCreativeGroupRequest creativeGroupType(CreativeGroupType creativeGroupType) {
    
    this.creativeGroupType = creativeGroupType;
    return this;
  }

   /**
   * Get creativeGroupType
   * @return creativeGroupType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATIVE_GROUP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreativeGroupType getCreativeGroupType() {
    return creativeGroupType;
  }


  @JsonProperty(JSON_PROPERTY_CREATIVE_GROUP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreativeGroupType(CreativeGroupType creativeGroupType) {
    this.creativeGroupType = creativeGroupType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddCreativeGroupRequest addCreativeGroupRequest = (AddCreativeGroupRequest) o;
    return Objects.equals(this.creativeGroupType, addCreativeGroupRequest.creativeGroupType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creativeGroupType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddCreativeGroupRequest {\n");
    sb.append("    creativeGroupType: ").append(toIndentedString(creativeGroupType)).append("\n");
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
