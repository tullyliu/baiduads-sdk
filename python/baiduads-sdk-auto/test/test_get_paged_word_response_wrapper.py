"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

    The version of the OpenAPI document: 1.0.1-SNAPSHOT
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_response_header import ApiResponseHeader
from baiduads.productadskeyword.model.start_keyword_response_wrapper_body import StartKeywordResponseWrapperBody
globals()['ApiResponseHeader'] = ApiResponseHeader
globals()['StartKeywordResponseWrapperBody'] = StartKeywordResponseWrapperBody
from baiduads.productadskeyword.model.get_paged_word_response_wrapper import GetPagedWordResponseWrapper


class TestGetPagedWordResponseWrapper(unittest.TestCase):
    """GetPagedWordResponseWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetPagedWordResponseWrapper(self):
        """Test GetPagedWordResponseWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetPagedWordResponseWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()