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
from baiduads.keyword.model.add_word_response_wrapper_body import AddWordResponseWrapperBody
globals()['AddWordResponseWrapperBody'] = AddWordResponseWrapperBody
globals()['ApiResponseHeader'] = ApiResponseHeader
from baiduads.keyword.model.update_word_response_wrapper import UpdateWordResponseWrapper


class TestUpdateWordResponseWrapper(unittest.TestCase):
    """UpdateWordResponseWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testUpdateWordResponseWrapper(self):
        """Test UpdateWordResponseWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = UpdateWordResponseWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()