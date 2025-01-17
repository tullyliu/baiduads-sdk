/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.baidu.dev2.api.sdk.indexapi.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.indexapi.model.*;
import com.baidu.dev2.api.sdk.invoke.Pair;

import com.baidu.dev2.api.sdk.indexapi.model.CheckKeywordsRequestWrapper;
import com.baidu.dev2.api.sdk.indexapi.model.CheckKeywordsResponseWrapper;
import com.baidu.dev2.api.sdk.indexapi.model.CreateTaskRequestWrapper;
import com.baidu.dev2.api.sdk.indexapi.model.CreateTaskResponseWrapper;
import com.baidu.dev2.api.sdk.indexapi.model.GetResultRequestWrapper;
import com.baidu.dev2.api.sdk.indexapi.model.GetResultResponseWrapper;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IndexApiService {
  private ApiClient apiClient;

  public IndexApiService() {
    this(Configuration.getDefaultApiClient());
  }

  public IndexApiService(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 
   * 
   * @param checkKeywordsRequestWrapper  (required)
   * @return CheckKeywordsResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public CheckKeywordsResponseWrapper checkKeywords(CheckKeywordsRequestWrapper checkKeywordsRequestWrapper) throws ApiException {
    Object localVarPostBody = checkKeywordsRequestWrapper;
    
    // verify the required parameter 'checkKeywordsRequestWrapper' is set
    if (checkKeywordsRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'checkKeywordsRequestWrapper' when calling checkKeywords");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/IndexApiService/checkKeywords";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<CheckKeywordsResponseWrapper> localVarReturnType = new TypeReference<CheckKeywordsResponseWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 
   * 
   * @param createTaskRequestWrapper  (required)
   * @return CreateTaskResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public CreateTaskResponseWrapper createTask(CreateTaskRequestWrapper createTaskRequestWrapper) throws ApiException {
    Object localVarPostBody = createTaskRequestWrapper;
    
    // verify the required parameter 'createTaskRequestWrapper' is set
    if (createTaskRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'createTaskRequestWrapper' when calling createTask");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/IndexApiService/createTask";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<CreateTaskResponseWrapper> localVarReturnType = new TypeReference<CreateTaskResponseWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 
   * 
   * @param getResultRequestWrapper  (required)
   * @return GetResultResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetResultResponseWrapper getResult(GetResultRequestWrapper getResultRequestWrapper) throws ApiException {
    Object localVarPostBody = getResultRequestWrapper;
    
    // verify the required parameter 'getResultRequestWrapper' is set
    if (getResultRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getResultRequestWrapper' when calling getResult");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/IndexApiService/getResult";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<GetResultResponseWrapper> localVarReturnType = new TypeReference<GetResultResponseWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
}
