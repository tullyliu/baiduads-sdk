"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.indexapi.model.task_query_request import TaskQueryRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['TaskQueryRequest'] = TaskQueryRequest
from baiduads.indexapi.model.get_result_request_wrapper import GetResultRequestWrapper


class TestGetResultRequestWrapper(unittest.TestCase):
    """GetResultRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetResultRequestWrapper(self):
        """Test GetResultRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetResultRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()