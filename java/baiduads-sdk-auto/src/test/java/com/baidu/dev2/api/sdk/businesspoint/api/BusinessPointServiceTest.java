/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.businesspoint.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.businesspoint.model.GetAllBusinessPointRequestWrapper;
import com.baidu.dev2.api.sdk.businesspoint.model.GetAllBusinessPointResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BusinessPointService
 */
@Ignore
public class BusinessPointServiceTest {

    private final BusinessPointService api = new BusinessPointService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllBusinessPointTest() throws ApiException {
        GetAllBusinessPointRequestWrapper getAllBusinessPointRequestWrapper = null;
        GetAllBusinessPointResponseWrapper response = api.getAllBusinessPoint(getAllBusinessPointRequestWrapper);

        // TODO: test validations
    }
}