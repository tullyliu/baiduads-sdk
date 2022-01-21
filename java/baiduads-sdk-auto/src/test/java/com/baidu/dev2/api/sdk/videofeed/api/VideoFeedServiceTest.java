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


package com.baidu.dev2.api.sdk.videofeed.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.videofeed.model.GetVideoTextFeedRequestWrapper;
import com.baidu.dev2.api.sdk.videofeed.model.GetVideoTextFeedResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VideoFeedService
 */
@Ignore
public class VideoFeedServiceTest {

    private final VideoFeedService api = new VideoFeedService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVideoTextFeedTest() throws ApiException {
        GetVideoTextFeedRequestWrapper getVideoTextFeedRequestWrapper = null;
        GetVideoTextFeedResponseWrapper response = api.getVideoTextFeed(getVideoTextFeedRequestWrapper);

        // TODO: test validations
    }
}