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
from baiduads.search.model.get_material_info_by_search_params import GetMaterialInfoBySearchParams
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['GetMaterialInfoBySearchParams'] = GetMaterialInfoBySearchParams
from baiduads.search.model.get_material_info_by_search_request_wrapper import GetMaterialInfoBySearchRequestWrapper


class TestGetMaterialInfoBySearchRequestWrapper(unittest.TestCase):
    """GetMaterialInfoBySearchRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetMaterialInfoBySearchRequestWrapper(self):
        """Test GetMaterialInfoBySearchRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetMaterialInfoBySearchRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()