/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.videocontent.model;

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
 * Page
 */
@JsonPropertyOrder({
  Page.JSON_PROPERTY_OFFSET,
  Page.JSON_PROPERTY_NUMBERS
})
@JsonTypeName("Page")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Page {
  public static final String JSON_PROPERTY_OFFSET = "offset";
  private Integer offset;

  public static final String JSON_PROPERTY_NUMBERS = "numbers";
  private Integer numbers;

  public Page() { 
  }

  public Page offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOffset() {
    return offset;
  }


  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public Page numbers(Integer numbers) {
    
    this.numbers = numbers;
    return this;
  }

   /**
   * Get numbers
   * @return numbers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumbers() {
    return numbers;
  }


  @JsonProperty(JSON_PROPERTY_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumbers(Integer numbers) {
    this.numbers = numbers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Page page = (Page) o;
    return Objects.equals(this.offset, page.offset) &&
        Objects.equals(this.numbers, page.numbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, numbers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Page {\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    numbers: ").append(toIndentedString(numbers)).append("\n");
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
