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


package com.baidu.dev2.api.sdk.bulkjob.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.bulkjob.model.CancelDownloadRequestWrapper;
import com.baidu.dev2.api.sdk.bulkjob.model.CancelDownloadResponseWrapper;
import com.baidu.dev2.api.sdk.bulkjob.model.GetAllChangedObjectsRequestWrapper;
import com.baidu.dev2.api.sdk.bulkjob.model.GetAllChangedObjectsResponseWrapper;
import com.baidu.dev2.api.sdk.bulkjob.model.GetAllObjectsRequestWrapper;
import com.baidu.dev2.api.sdk.bulkjob.model.GetAllObjectsResponseWrapper;
import com.baidu.dev2.api.sdk.bulkjob.model.GetChangedItemIdRequestWrapper;
import com.baidu.dev2.api.sdk.bulkjob.model.GetChangedItemIdResponseWrapper;
import com.baidu.dev2.api.sdk.bulkjob.model.GetChangedScaleRequestWrapper;
import com.baidu.dev2.api.sdk.bulkjob.model.GetChangedScaleResponseWrapper;
import com.baidu.dev2.api.sdk.bulkjob.model.GetFilePathRequestWrapper;
import com.baidu.dev2.api.sdk.bulkjob.model.GetFilePathResponseWrapper;
import com.baidu.dev2.api.sdk.bulkjob.model.GetFileStatusRequestWrapper;
import com.baidu.dev2.api.sdk.bulkjob.model.GetFileStatusResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BulkJobService
 */
@Ignore
public class BulkJobServiceTest {

    private final BulkJobService api = new BulkJobService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelDownloadTest() throws ApiException {
        CancelDownloadRequestWrapper cancelDownloadRequestWrapper = null;
        CancelDownloadResponseWrapper response = api.cancelDownload(cancelDownloadRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllChangedObjectsTest() throws ApiException {
        GetAllChangedObjectsRequestWrapper getAllChangedObjectsRequestWrapper = null;
        GetAllChangedObjectsResponseWrapper response = api.getAllChangedObjects(getAllChangedObjectsRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllObjectsTest() throws ApiException {
        GetAllObjectsRequestWrapper getAllObjectsRequestWrapper = null;
        GetAllObjectsResponseWrapper response = api.getAllObjects(getAllObjectsRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChangedItemIdTest() throws ApiException {
        GetChangedItemIdRequestWrapper getChangedItemIdRequestWrapper = null;
        GetChangedItemIdResponseWrapper response = api.getChangedItemId(getChangedItemIdRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChangedScaleTest() throws ApiException {
        GetChangedScaleRequestWrapper getChangedScaleRequestWrapper = null;
        GetChangedScaleResponseWrapper response = api.getChangedScale(getChangedScaleRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFilePathTest() throws ApiException {
        GetFilePathRequestWrapper getFilePathRequestWrapper = null;
        GetFilePathResponseWrapper response = api.getFilePath(getFilePathRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFileStatusTest() throws ApiException {
        GetFileStatusRequestWrapper getFileStatusRequestWrapper = null;
        GetFileStatusResponseWrapper response = api.getFileStatus(getFileStatusRequestWrapper);

        // TODO: test validations
    }
}