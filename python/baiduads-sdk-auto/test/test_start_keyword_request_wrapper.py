"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

    The version of the OpenAPI document: 1.0.1-SNAPSHOT
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.productadskeyword.model.keyword_id_request import KeywordIdRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['KeywordIdRequest'] = KeywordIdRequest
from baiduads.productadskeyword.model.start_keyword_request_wrapper import StartKeywordRequestWrapper


class TestStartKeywordRequestWrapper(unittest.TestCase):
    """StartKeywordRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testStartKeywordRequestWrapper(self):
        """Test StartKeywordRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = StartKeywordRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()