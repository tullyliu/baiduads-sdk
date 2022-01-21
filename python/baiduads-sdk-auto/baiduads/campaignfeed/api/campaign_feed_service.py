"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from baiduads.api_client import ApiClient, Endpoint as _Endpoint
from baiduads.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from baiduads.campaignfeed.model.add_campaign_feed_request_wrapper import AddCampaignFeedRequestWrapper
from baiduads.campaignfeed.model.add_campaign_feed_response_wrapper import AddCampaignFeedResponseWrapper
from baiduads.campaignfeed.model.delete_campaign_feed_request_wrapper import DeleteCampaignFeedRequestWrapper
from baiduads.campaignfeed.model.delete_campaign_feed_response_wrapper import DeleteCampaignFeedResponseWrapper
from baiduads.campaignfeed.model.get_campaign_feed_request_wrapper import GetCampaignFeedRequestWrapper
from baiduads.campaignfeed.model.get_campaign_feed_response_wrapper import GetCampaignFeedResponseWrapper
from baiduads.campaignfeed.model.update_campaign_feed_request_wrapper import UpdateCampaignFeedRequestWrapper
from baiduads.campaignfeed.model.update_campaign_feed_response_wrapper import UpdateCampaignFeedResponseWrapper


class CampaignFeedService(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.add_campaign_feed_endpoint = _Endpoint(
            settings={
                'response_type': (AddCampaignFeedResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/feed/v1/CampaignFeedService/addCampaignFeed',
                'operation_id': 'add_campaign_feed',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'add_campaign_feed_request_wrapper',
                ],
                'required': [
                    'add_campaign_feed_request_wrapper',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'add_campaign_feed_request_wrapper':
                        (AddCampaignFeedRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'add_campaign_feed_request_wrapper': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=UTF-8'
                ],
                'content_type': [
                    'application/json;charset=UTF-8'
                ]
            },
            api_client=api_client
        )
        self.delete_campaign_feed_endpoint = _Endpoint(
            settings={
                'response_type': (DeleteCampaignFeedResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/feed/v1/CampaignFeedService/deleteCampaignFeed',
                'operation_id': 'delete_campaign_feed',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'delete_campaign_feed_request_wrapper',
                ],
                'required': [
                    'delete_campaign_feed_request_wrapper',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'delete_campaign_feed_request_wrapper':
                        (DeleteCampaignFeedRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'delete_campaign_feed_request_wrapper': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=UTF-8'
                ],
                'content_type': [
                    'application/json;charset=UTF-8'
                ]
            },
            api_client=api_client
        )
        self.get_campaign_feed_endpoint = _Endpoint(
            settings={
                'response_type': (GetCampaignFeedResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/feed/v1/CampaignFeedService/getCampaignFeed',
                'operation_id': 'get_campaign_feed',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_campaign_feed_request_wrapper',
                ],
                'required': [
                    'get_campaign_feed_request_wrapper',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'get_campaign_feed_request_wrapper':
                        (GetCampaignFeedRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_campaign_feed_request_wrapper': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=UTF-8'
                ],
                'content_type': [
                    'application/json;charset=UTF-8'
                ]
            },
            api_client=api_client
        )
        self.update_campaign_feed_endpoint = _Endpoint(
            settings={
                'response_type': (UpdateCampaignFeedResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/feed/v1/CampaignFeedService/updateCampaignFeed',
                'operation_id': 'update_campaign_feed',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'update_campaign_feed_request_wrapper',
                ],
                'required': [
                    'update_campaign_feed_request_wrapper',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'update_campaign_feed_request_wrapper':
                        (UpdateCampaignFeedRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'update_campaign_feed_request_wrapper': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=UTF-8'
                ],
                'content_type': [
                    'application/json;charset=UTF-8'
                ]
            },
            api_client=api_client
        )

    def add_campaign_feed(
        self,
        add_campaign_feed_request_wrapper,
        **kwargs
    ):
        """add_campaign_feed  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.add_campaign_feed(add_campaign_feed_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            add_campaign_feed_request_wrapper (AddCampaignFeedRequestWrapper):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            AddCampaignFeedResponseWrapper
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['add_campaign_feed_request_wrapper'] = \
            add_campaign_feed_request_wrapper
        return self.add_campaign_feed_endpoint.call_with_http_info(**kwargs)

    def delete_campaign_feed(
        self,
        delete_campaign_feed_request_wrapper,
        **kwargs
    ):
        """delete_campaign_feed  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.delete_campaign_feed(delete_campaign_feed_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            delete_campaign_feed_request_wrapper (DeleteCampaignFeedRequestWrapper):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            DeleteCampaignFeedResponseWrapper
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['delete_campaign_feed_request_wrapper'] = \
            delete_campaign_feed_request_wrapper
        return self.delete_campaign_feed_endpoint.call_with_http_info(**kwargs)

    def get_campaign_feed(
        self,
        get_campaign_feed_request_wrapper,
        **kwargs
    ):
        """get_campaign_feed  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_campaign_feed(get_campaign_feed_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_campaign_feed_request_wrapper (GetCampaignFeedRequestWrapper):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            GetCampaignFeedResponseWrapper
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['get_campaign_feed_request_wrapper'] = \
            get_campaign_feed_request_wrapper
        return self.get_campaign_feed_endpoint.call_with_http_info(**kwargs)

    def update_campaign_feed(
        self,
        update_campaign_feed_request_wrapper,
        **kwargs
    ):
        """update_campaign_feed  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.update_campaign_feed(update_campaign_feed_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            update_campaign_feed_request_wrapper (UpdateCampaignFeedRequestWrapper):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            UpdateCampaignFeedResponseWrapper
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['update_campaign_feed_request_wrapper'] = \
            update_campaign_feed_request_wrapper
        return self.update_campaign_feed_endpoint.call_with_http_info(**kwargs)
