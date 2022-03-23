/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.rtafeed.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.rtafeed.model.ConfigurableUser;
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
 * RtaSettingType
 */
@JsonPropertyOrder({
  RtaSettingType.JSON_PROPERTY_ID,
  RtaSettingType.JSON_PROPERTY_URL,
  RtaSettingType.JSON_PROPERTY_TOKEN,
  RtaSettingType.JSON_PROPERTY_CONFIG_USER_IDS,
  RtaSettingType.JSON_PROPERTY_CONFIG_USERS,
  RtaSettingType.JSON_PROPERTY_REQUEST_TIMEOUT_STRATEGY,
  RtaSettingType.JSON_PROPERTY_CACHE_TIME,
  RtaSettingType.JSON_PROPERTY_STATUS,
  RtaSettingType.JSON_PROPERTY_ADD_TIME,
  RtaSettingType.JSON_PROPERTY_MOD_TIME
})
@JsonTypeName("RtaSettingType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RtaSettingType {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_TOKEN = "token";
  private String token;

  public static final String JSON_PROPERTY_CONFIG_USER_IDS = "configUserIds";
  private List<Long> configUserIds = null;

  public static final String JSON_PROPERTY_CONFIG_USERS = "configUsers";
  private List<ConfigurableUser> configUsers = null;

  public static final String JSON_PROPERTY_REQUEST_TIMEOUT_STRATEGY = "requestTimeoutStrategy";
  private Integer requestTimeoutStrategy;

  public static final String JSON_PROPERTY_CACHE_TIME = "cacheTime";
  private Integer cacheTime;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;

  public static final String JSON_PROPERTY_ADD_TIME = "addTime";
  private String addTime;

  public static final String JSON_PROPERTY_MOD_TIME = "modTime";
  private String modTime;

  public RtaSettingType() { 
  }

  public RtaSettingType id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }


  public RtaSettingType url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public RtaSettingType token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getToken() {
    return token;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToken(String token) {
    this.token = token;
  }


  public RtaSettingType configUserIds(List<Long> configUserIds) {
    
    this.configUserIds = configUserIds;
    return this;
  }

  public RtaSettingType addConfigUserIdsItem(Long configUserIdsItem) {
    if (this.configUserIds == null) {
      this.configUserIds = new ArrayList<>();
    }
    this.configUserIds.add(configUserIdsItem);
    return this;
  }

   /**
   * Get configUserIds
   * @return configUserIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONFIG_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getConfigUserIds() {
    return configUserIds;
  }


  @JsonProperty(JSON_PROPERTY_CONFIG_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfigUserIds(List<Long> configUserIds) {
    this.configUserIds = configUserIds;
  }


  public RtaSettingType configUsers(List<ConfigurableUser> configUsers) {
    
    this.configUsers = configUsers;
    return this;
  }

  public RtaSettingType addConfigUsersItem(ConfigurableUser configUsersItem) {
    if (this.configUsers == null) {
      this.configUsers = new ArrayList<>();
    }
    this.configUsers.add(configUsersItem);
    return this;
  }

   /**
   * Get configUsers
   * @return configUsers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONFIG_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ConfigurableUser> getConfigUsers() {
    return configUsers;
  }


  @JsonProperty(JSON_PROPERTY_CONFIG_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfigUsers(List<ConfigurableUser> configUsers) {
    this.configUsers = configUsers;
  }


  public RtaSettingType requestTimeoutStrategy(Integer requestTimeoutStrategy) {
    
    this.requestTimeoutStrategy = requestTimeoutStrategy;
    return this;
  }

   /**
   * Get requestTimeoutStrategy
   * @return requestTimeoutStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REQUEST_TIMEOUT_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRequestTimeoutStrategy() {
    return requestTimeoutStrategy;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_TIMEOUT_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestTimeoutStrategy(Integer requestTimeoutStrategy) {
    this.requestTimeoutStrategy = requestTimeoutStrategy;
  }


  public RtaSettingType cacheTime(Integer cacheTime) {
    
    this.cacheTime = cacheTime;
    return this;
  }

   /**
   * Get cacheTime
   * @return cacheTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CACHE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCacheTime() {
    return cacheTime;
  }


  @JsonProperty(JSON_PROPERTY_CACHE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCacheTime(Integer cacheTime) {
    this.cacheTime = cacheTime;
  }


  public RtaSettingType status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(Integer status) {
    this.status = status;
  }


  public RtaSettingType addTime(String addTime) {
    
    this.addTime = addTime;
    return this;
  }

   /**
   * Get addTime
   * @return addTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddTime() {
    return addTime;
  }


  @JsonProperty(JSON_PROPERTY_ADD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddTime(String addTime) {
    this.addTime = addTime;
  }


  public RtaSettingType modTime(String modTime) {
    
    this.modTime = modTime;
    return this;
  }

   /**
   * Get modTime
   * @return modTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MOD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModTime() {
    return modTime;
  }


  @JsonProperty(JSON_PROPERTY_MOD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModTime(String modTime) {
    this.modTime = modTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RtaSettingType rtaSettingType = (RtaSettingType) o;
    return Objects.equals(this.id, rtaSettingType.id) &&
        Objects.equals(this.url, rtaSettingType.url) &&
        Objects.equals(this.token, rtaSettingType.token) &&
        Objects.equals(this.configUserIds, rtaSettingType.configUserIds) &&
        Objects.equals(this.configUsers, rtaSettingType.configUsers) &&
        Objects.equals(this.requestTimeoutStrategy, rtaSettingType.requestTimeoutStrategy) &&
        Objects.equals(this.cacheTime, rtaSettingType.cacheTime) &&
        Objects.equals(this.status, rtaSettingType.status) &&
        Objects.equals(this.addTime, rtaSettingType.addTime) &&
        Objects.equals(this.modTime, rtaSettingType.modTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, token, configUserIds, configUsers, requestTimeoutStrategy, cacheTime, status, addTime, modTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RtaSettingType {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    configUserIds: ").append(toIndentedString(configUserIds)).append("\n");
    sb.append("    configUsers: ").append(toIndentedString(configUsers)).append("\n");
    sb.append("    requestTimeoutStrategy: ").append(toIndentedString(requestTimeoutStrategy)).append("\n");
    sb.append("    cacheTime: ").append(toIndentedString(cacheTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
    sb.append("    modTime: ").append(toIndentedString(modTime)).append("\n");
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
