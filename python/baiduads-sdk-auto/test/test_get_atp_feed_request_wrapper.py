"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.atpfeed.model.get_atp_feed_request import GetAtpFeedRequest
from baiduads.common.model.api_request_header import ApiRequestHeader
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['GetAtpFeedRequest'] = GetAtpFeedRequest
from baiduads.atpfeed.model.get_atp_feed_request_wrapper import GetAtpFeedRequestWrapper


class TestGetAtpFeedRequestWrapper(unittest.TestCase):
    """GetAtpFeedRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetAtpFeedRequestWrapper(self):
        """Test GetAtpFeedRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetAtpFeedRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()