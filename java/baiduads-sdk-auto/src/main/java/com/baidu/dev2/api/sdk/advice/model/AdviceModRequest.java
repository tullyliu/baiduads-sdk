/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.advice.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.advice.model.AdviceAcceptParam;
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
 * AdviceModRequest
 */
@JsonPropertyOrder({
  AdviceModRequest.JSON_PROPERTY_OPERATION_TYPE,
  AdviceModRequest.JSON_PROPERTY_OPERATION_PARAM,
  AdviceModRequest.JSON_PROPERTY_SOURCE,
  AdviceModRequest.JSON_PROPERTY_BATCH_ID,
  AdviceModRequest.JSON_PROPERTY_PROCESS_STAGE,
  AdviceModRequest.JSON_PROPERTY_ADVICE_ID,
  AdviceModRequest.JSON_PROPERTY_ADVICE_KEY
})
@JsonTypeName("AdviceModRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdviceModRequest {
  public static final String JSON_PROPERTY_OPERATION_TYPE = "operationType";
  private Integer operationType;

  public static final String JSON_PROPERTY_OPERATION_PARAM = "operationParam";
  private AdviceAcceptParam operationParam;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private Integer source;

  public static final String JSON_PROPERTY_BATCH_ID = "batchId";
  private Long batchId;

  public static final String JSON_PROPERTY_PROCESS_STAGE = "processStage";
  private String processStage;

  public static final String JSON_PROPERTY_ADVICE_ID = "adviceId";
  private Long adviceId;

  public static final String JSON_PROPERTY_ADVICE_KEY = "adviceKey";
  private String adviceKey;

  public AdviceModRequest() { 
  }

  public AdviceModRequest operationType(Integer operationType) {
    
    this.operationType = operationType;
    return this;
  }

   /**
   * Get operationType
   * @return operationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPERATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOperationType() {
    return operationType;
  }


  @JsonProperty(JSON_PROPERTY_OPERATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperationType(Integer operationType) {
    this.operationType = operationType;
  }


  public AdviceModRequest operationParam(AdviceAcceptParam operationParam) {
    
    this.operationParam = operationParam;
    return this;
  }

   /**
   * Get operationParam
   * @return operationParam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPERATION_PARAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdviceAcceptParam getOperationParam() {
    return operationParam;
  }


  @JsonProperty(JSON_PROPERTY_OPERATION_PARAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperationParam(AdviceAcceptParam operationParam) {
    this.operationParam = operationParam;
  }


  public AdviceModRequest source(Integer source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSource(Integer source) {
    this.source = source;
  }


  public AdviceModRequest batchId(Long batchId) {
    
    this.batchId = batchId;
    return this;
  }

   /**
   * Get batchId
   * @return batchId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BATCH_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBatchId() {
    return batchId;
  }


  @JsonProperty(JSON_PROPERTY_BATCH_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBatchId(Long batchId) {
    this.batchId = batchId;
  }


  public AdviceModRequest processStage(String processStage) {
    
    this.processStage = processStage;
    return this;
  }

   /**
   * Get processStage
   * @return processStage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROCESS_STAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProcessStage() {
    return processStage;
  }


  @JsonProperty(JSON_PROPERTY_PROCESS_STAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProcessStage(String processStage) {
    this.processStage = processStage;
  }


  public AdviceModRequest adviceId(Long adviceId) {
    
    this.adviceId = adviceId;
    return this;
  }

   /**
   * Get adviceId
   * @return adviceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADVICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdviceId() {
    return adviceId;
  }


  @JsonProperty(JSON_PROPERTY_ADVICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdviceId(Long adviceId) {
    this.adviceId = adviceId;
  }


  public AdviceModRequest adviceKey(String adviceKey) {
    
    this.adviceKey = adviceKey;
    return this;
  }

   /**
   * Get adviceKey
   * @return adviceKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADVICE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdviceKey() {
    return adviceKey;
  }


  @JsonProperty(JSON_PROPERTY_ADVICE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdviceKey(String adviceKey) {
    this.adviceKey = adviceKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdviceModRequest adviceModRequest = (AdviceModRequest) o;
    return Objects.equals(this.operationType, adviceModRequest.operationType) &&
        Objects.equals(this.operationParam, adviceModRequest.operationParam) &&
        Objects.equals(this.source, adviceModRequest.source) &&
        Objects.equals(this.batchId, adviceModRequest.batchId) &&
        Objects.equals(this.processStage, adviceModRequest.processStage) &&
        Objects.equals(this.adviceId, adviceModRequest.adviceId) &&
        Objects.equals(this.adviceKey, adviceModRequest.adviceKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationType, operationParam, source, batchId, processStage, adviceId, adviceKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdviceModRequest {\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    operationParam: ").append(toIndentedString(operationParam)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    processStage: ").append(toIndentedString(processStage)).append("\n");
    sb.append("    adviceId: ").append(toIndentedString(adviceId)).append("\n");
    sb.append("    adviceKey: ").append(toIndentedString(adviceKey)).append("\n");
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

