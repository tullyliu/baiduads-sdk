"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.marketapi.model.open_site_preview_request_single_request import OpenSitePreviewRequestSingleRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['OpenSitePreviewRequestSingleRequest'] = OpenSitePreviewRequestSingleRequest
from baiduads.marketapi.model.preview_site_request_wrapper import PreviewSiteRequestWrapper


class TestPreviewSiteRequestWrapper(unittest.TestCase):
    """PreviewSiteRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testPreviewSiteRequestWrapper(self):
        """Test PreviewSiteRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = PreviewSiteRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()