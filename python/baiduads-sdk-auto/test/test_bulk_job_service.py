"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

    The version of the OpenAPI document: 1.0.1-SNAPSHOT
    Generated by: https://openapi-generator.tech
"""


import unittest

import baiduads
from bulkjob.api.bulk_job_service import BulkJobService  # noqa: E501


class TestBulkJobService(unittest.TestCase):
    """BulkJobService unit test stubs"""

    def setUp(self):
        self.api = BulkJobService()  # noqa: E501

    def tearDown(self):
        pass

    def test_cancel_download(self):
        """Test case for cancel_download

        """
        pass

    def test_get_all_changed_objects(self):
        """Test case for get_all_changed_objects

        """
        pass

    def test_get_all_objects(self):
        """Test case for get_all_objects

        """
        pass

    def test_get_changed_item_id(self):
        """Test case for get_changed_item_id

        """
        pass

    def test_get_changed_scale(self):
        """Test case for get_changed_scale

        """
        pass

    def test_get_file_path(self):
        """Test case for get_file_path

        """
        pass

    def test_get_file_status(self):
        """Test case for get_file_status

        """
        pass


if __name__ == '__main__':
    unittest.main()