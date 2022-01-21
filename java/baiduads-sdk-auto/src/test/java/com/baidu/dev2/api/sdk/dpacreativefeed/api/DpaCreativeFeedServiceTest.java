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


package com.baidu.dev2.api.sdk.dpacreativefeed.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.dpacreativefeed.model.AddCreativeFeedRequestWrapper;
import com.baidu.dev2.api.sdk.dpacreativefeed.model.AddCreativeFeedResponseWrapper;
import com.baidu.dev2.api.sdk.dpacreativefeed.model.DeleteCreativeFeedRequestWrapper;
import com.baidu.dev2.api.sdk.dpacreativefeed.model.DeleteCreativeFeedResponseWrapper;
import com.baidu.dev2.api.sdk.dpacreativefeed.model.GetCreativeFeedRequestWrapper;
import com.baidu.dev2.api.sdk.dpacreativefeed.model.GetCreativeFeedResponseWrapper;
import com.baidu.dev2.api.sdk.dpacreativefeed.model.GetCreativePreviewRequestWrapper;
import com.baidu.dev2.api.sdk.dpacreativefeed.model.GetCreativePreviewResponseWrapper;
import com.baidu.dev2.api.sdk.dpacreativefeed.model.GetSymbolFieldsRequestWrapper;
import com.baidu.dev2.api.sdk.dpacreativefeed.model.GetSymbolFieldsResponseWrapper;
import com.baidu.dev2.api.sdk.dpacreativefeed.model.UpdateCreativeFeedRequestWrapper;
import com.baidu.dev2.api.sdk.dpacreativefeed.model.UpdateCreativeFeedResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DpaCreativeFeedService
 */
@Ignore
public class DpaCreativeFeedServiceTest {

    private final DpaCreativeFeedService api = new DpaCreativeFeedService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCreativeFeedTest() throws ApiException {
        AddCreativeFeedRequestWrapper addCreativeFeedRequestWrapper = null;
        AddCreativeFeedResponseWrapper response = api.addCreativeFeed(addCreativeFeedRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCreativeFeedTest() throws ApiException {
        DeleteCreativeFeedRequestWrapper deleteCreativeFeedRequestWrapper = null;
        DeleteCreativeFeedResponseWrapper response = api.deleteCreativeFeed(deleteCreativeFeedRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCreativeFeedTest() throws ApiException {
        GetCreativeFeedRequestWrapper getCreativeFeedRequestWrapper = null;
        GetCreativeFeedResponseWrapper response = api.getCreativeFeed(getCreativeFeedRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCreativePreviewTest() throws ApiException {
        GetCreativePreviewRequestWrapper getCreativePreviewRequestWrapper = null;
        GetCreativePreviewResponseWrapper response = api.getCreativePreview(getCreativePreviewRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSymbolFieldsTest() throws ApiException {
        GetSymbolFieldsRequestWrapper getSymbolFieldsRequestWrapper = null;
        GetSymbolFieldsResponseWrapper response = api.getSymbolFields(getSymbolFieldsRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCreativeFeedTest() throws ApiException {
        UpdateCreativeFeedRequestWrapper updateCreativeFeedRequestWrapper = null;
        UpdateCreativeFeedResponseWrapper response = api.updateCreativeFeed(updateCreativeFeedRequestWrapper);

        // TODO: test validations
    }
}