"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

    The version of the OpenAPI document: 1.0.1-SNAPSHOT
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.bulkjob.model.bulk_job_result_query import BulkJobResultQuery
from baiduads.common.model.api_request_header import ApiRequestHeader
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['BulkJobResultQuery'] = BulkJobResultQuery
from baiduads.bulkjob.model.get_file_path_request_wrapper import GetFilePathRequestWrapper


class TestGetFilePathRequestWrapper(unittest.TestCase):
    """GetFilePathRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetFilePathRequestWrapper(self):
        """Test GetFilePathRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetFilePathRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()