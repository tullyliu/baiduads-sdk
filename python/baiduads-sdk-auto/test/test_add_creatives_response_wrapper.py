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
from baiduads.newcreative.model.update_creatives_response_wrapper_body import UpdateCreativesResponseWrapperBody
globals()['ApiResponseHeader'] = ApiResponseHeader
globals()['UpdateCreativesResponseWrapperBody'] = UpdateCreativesResponseWrapperBody
from baiduads.newcreative.model.add_creatives_response_wrapper import AddCreativesResponseWrapper


class TestAddCreativesResponseWrapper(unittest.TestCase):
    """AddCreativesResponseWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testAddCreativesResponseWrapper(self):
        """Test AddCreativesResponseWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = AddCreativesResponseWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()