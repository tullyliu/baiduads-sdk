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
from baiduads.newcreative.model.get_format_templates_response_wrapper_body import GetFormatTemplatesResponseWrapperBody
globals()['ApiResponseHeader'] = ApiResponseHeader
globals()['GetFormatTemplatesResponseWrapperBody'] = GetFormatTemplatesResponseWrapperBody
from baiduads.newcreative.model.get_format_templates_response_wrapper import GetFormatTemplatesResponseWrapper


class TestGetFormatTemplatesResponseWrapper(unittest.TestCase):
    """GetFormatTemplatesResponseWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetFormatTemplatesResponseWrapper(self):
        """Test GetFormatTemplatesResponseWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetFormatTemplatesResponseWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()