/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.productadskeyword.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.productadskeyword.model.PauseKeywordResponseWrapperBody;
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
 * PauseKeywordResponseWrapper
 */
@JsonPropertyOrder({
  PauseKeywordResponseWrapper.JSON_PROPERTY_HEADER,
  PauseKeywordResponseWrapper.JSON_PROPERTY_BODY
})
@JsonTypeName("PauseKeywordResponseWrapper")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PauseKeywordResponseWrapper {
  public static final String JSON_PROPERTY_HEADER = "header";
  private com.baidu.dev2.api.sdk.common.ApiResponseHeader header;

  public static final String JSON_PROPERTY_BODY = "body";
  private PauseKeywordResponseWrapperBody body;

  public PauseKeywordResponseWrapper() { 
  }

  public PauseKeywordResponseWrapper header(com.baidu.dev2.api.sdk.common.ApiResponseHeader header) {
    
    this.header = header;
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public com.baidu.dev2.api.sdk.common.ApiResponseHeader getHeader() {
    return header;
  }


  @JsonProperty(JSON_PROPERTY_HEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeader(com.baidu.dev2.api.sdk.common.ApiResponseHeader header) {
    this.header = header;
  }


  public PauseKeywordResponseWrapper body(PauseKeywordResponseWrapperBody body) {
    
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PauseKeywordResponseWrapperBody getBody() {
    return body;
  }


  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBody(PauseKeywordResponseWrapperBody body) {
    this.body = body;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PauseKeywordResponseWrapper pauseKeywordResponseWrapper = (PauseKeywordResponseWrapper) o;
    return Objects.equals(this.header, pauseKeywordResponseWrapper.header) &&
        Objects.equals(this.body, pauseKeywordResponseWrapper.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PauseKeywordResponseWrapper {\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

