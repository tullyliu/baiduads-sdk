/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.streamapiupload.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.streamapiupload.model.UploadIdStreamRequestWrapper;
import com.baidu.dev2.api.sdk.streamapiupload.model.UploadIdStreamResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StreamApiUploadService
 */
@Ignore
public class StreamApiUploadServiceTest {

    private final StreamApiUploadService api = new StreamApiUploadService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadIdStreamTest() throws ApiException {
        UploadIdStreamRequestWrapper uploadIdStreamRequestWrapper = null;
        UploadIdStreamResponseWrapper response = api.uploadIdStream(uploadIdStreamRequestWrapper);

        // TODO: test validations
    }
}