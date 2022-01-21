/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.baidu.dev2.api.sdk.account.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.account.model.*;
import com.baidu.dev2.api.sdk.invoke.Pair;

import com.baidu.dev2.api.sdk.account.model.GetAccountInfoRequestWrapper;
import com.baidu.dev2.api.sdk.account.model.GetAccountInfoResponseWrapper;
import com.baidu.dev2.api.sdk.account.model.UpdateAccountInfoRequestWrapper;
import com.baidu.dev2.api.sdk.account.model.UpdateAccountInfoResponseWrapper;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountService {
  private ApiClient apiClient;

  public AccountService() {
    this(Configuration.getDefaultApiClient());
  }

  public AccountService(ApiClient apiClient) {
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
   * @param getAccountInfoRequestWrapper  (required)
   * @return GetAccountInfoResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetAccountInfoResponseWrapper getAccountInfo(GetAccountInfoRequestWrapper getAccountInfoRequestWrapper) throws ApiException {
    Object localVarPostBody = getAccountInfoRequestWrapper;
    
    // verify the required parameter 'getAccountInfoRequestWrapper' is set
    if (getAccountInfoRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getAccountInfoRequestWrapper' when calling getAccountInfo");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/AccountService/getAccountInfo";

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

    TypeReference<GetAccountInfoResponseWrapper> localVarReturnType = new TypeReference<GetAccountInfoResponseWrapper>() {};
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
   * @param updateAccountInfoRequestWrapper  (required)
   * @return UpdateAccountInfoResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public UpdateAccountInfoResponseWrapper updateAccountInfo(UpdateAccountInfoRequestWrapper updateAccountInfoRequestWrapper) throws ApiException {
    Object localVarPostBody = updateAccountInfoRequestWrapper;
    
    // verify the required parameter 'updateAccountInfoRequestWrapper' is set
    if (updateAccountInfoRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'updateAccountInfoRequestWrapper' when calling updateAccountInfo");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/AccountService/updateAccountInfo";

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

    TypeReference<UpdateAccountInfoResponseWrapper> localVarReturnType = new TypeReference<UpdateAccountInfoResponseWrapper>() {};
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