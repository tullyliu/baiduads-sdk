/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.danubecreativegroup.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.danubecreativegroup.model.DanubeCategoryCreative;
import com.baidu.dev2.api.sdk.danubecreativegroup.model.DanubeImageCreative;
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
 * DanubeCreativeComponent
 */
@JsonPropertyOrder({
  DanubeCreativeComponent.JSON_PROPERTY_CATEGORY,
  DanubeCreativeComponent.JSON_PROPERTY_IMAGE
})
@JsonTypeName("DanubeCreativeComponent")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DanubeCreativeComponent {
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private List<DanubeCategoryCreative> category = null;

  public static final String JSON_PROPERTY_IMAGE = "image";
  private List<DanubeImageCreative> image = null;

  public DanubeCreativeComponent() { 
  }

  public DanubeCreativeComponent category(List<DanubeCategoryCreative> category) {
    
    this.category = category;
    return this;
  }

  public DanubeCreativeComponent addCategoryItem(DanubeCategoryCreative categoryItem) {
    if (this.category == null) {
      this.category = new ArrayList<>();
    }
    this.category.add(categoryItem);
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DanubeCategoryCreative> getCategory() {
    return category;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategory(List<DanubeCategoryCreative> category) {
    this.category = category;
  }


  public DanubeCreativeComponent image(List<DanubeImageCreative> image) {
    
    this.image = image;
    return this;
  }

  public DanubeCreativeComponent addImageItem(DanubeImageCreative imageItem) {
    if (this.image == null) {
      this.image = new ArrayList<>();
    }
    this.image.add(imageItem);
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DanubeImageCreative> getImage() {
    return image;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImage(List<DanubeImageCreative> image) {
    this.image = image;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DanubeCreativeComponent danubeCreativeComponent = (DanubeCreativeComponent) o;
    return Objects.equals(this.category, danubeCreativeComponent.category) &&
        Objects.equals(this.image, danubeCreativeComponent.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DanubeCreativeComponent {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

