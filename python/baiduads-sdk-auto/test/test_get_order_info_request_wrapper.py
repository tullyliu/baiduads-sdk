"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.marketapi.model.open_order_info_request_single_request import OpenOrderInfoRequestSingleRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['OpenOrderInfoRequestSingleRequest'] = OpenOrderInfoRequestSingleRequest
from baiduads.marketapi.model.get_order_info_request_wrapper import GetOrderInfoRequestWrapper


class TestGetOrderInfoRequestWrapper(unittest.TestCase):
    """GetOrderInfoRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetOrderInfoRequestWrapper(self):
        """Test GetOrderInfoRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetOrderInfoRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()