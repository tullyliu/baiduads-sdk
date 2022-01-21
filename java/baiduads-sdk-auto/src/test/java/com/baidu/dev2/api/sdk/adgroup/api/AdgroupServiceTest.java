/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 * The version of the OpenAPI document: 1.0.1-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.adgroup.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.adgroup.model.AddAdgroupRequestWrapper;
import com.baidu.dev2.api.sdk.adgroup.model.AddAdgroupResponseWrapper;
import com.baidu.dev2.api.sdk.adgroup.model.DeleteAdgroupRequestWrapper;
import com.baidu.dev2.api.sdk.adgroup.model.DeleteAdgroupResponseWrapper;
import com.baidu.dev2.api.sdk.adgroup.model.GetAdgroupRequestWrapper;
import com.baidu.dev2.api.sdk.adgroup.model.GetAdgroupResponseWrapper;
import com.baidu.dev2.api.sdk.adgroup.model.UpdateAdgroupRequestWrapper;
import com.baidu.dev2.api.sdk.adgroup.model.UpdateAdgroupResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdgroupService
 */
@Ignore
public class AdgroupServiceTest {

    private final AdgroupService api = new AdgroupService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addAdgroupTest() throws ApiException {
        AddAdgroupRequestWrapper addAdgroupRequestWrapper = null;
        AddAdgroupResponseWrapper response = api.addAdgroup(addAdgroupRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAdgroupTest() throws ApiException {
        DeleteAdgroupRequestWrapper deleteAdgroupRequestWrapper = null;
        DeleteAdgroupResponseWrapper response = api.deleteAdgroup(deleteAdgroupRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAdgroupTest() throws ApiException {
        GetAdgroupRequestWrapper getAdgroupRequestWrapper = null;
        GetAdgroupResponseWrapper response = api.getAdgroup(getAdgroupRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAdgroupTest() throws ApiException {
        UpdateAdgroupRequestWrapper updateAdgroupRequestWrapper = null;
        UpdateAdgroupResponseWrapper response = api.updateAdgroup(updateAdgroupRequestWrapper);

        // TODO: test validations
    }
}