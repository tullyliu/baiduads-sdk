"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import unittest

import baiduads
from recmwordfeed.api.recm_word_feed_service import RecmWordFeedService  # noqa: E501


class TestRecmWordFeedService(unittest.TestCase):
    """RecmWordFeedService unit test stubs"""

    def setUp(self):
        self.api = RecmWordFeedService()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_recm_word(self):
        """Test case for get_recm_word

        """
        pass


if __name__ == '__main__':
    unittest.main()