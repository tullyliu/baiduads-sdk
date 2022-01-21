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
from baiduads.searchfeed.model.get_app_id_name_feed_request_wrapper import GetAppIdNameFeedRequestWrapper
from baiduads.searchfeed.model.get_app_id_name_feed_response_wrapper import GetAppIdNameFeedResponseWrapper
from baiduads.searchfeed.model.get_biz_area_feed_request_wrapper import GetBizAreaFeedRequestWrapper
from baiduads.searchfeed.model.get_biz_area_feed_response_wrapper import GetBizAreaFeedResponseWrapper
from baiduads.searchfeed.model.get_coordinate_feed_request_wrapper import GetCoordinateFeedRequestWrapper
from baiduads.searchfeed.model.get_coordinate_feed_response_wrapper import GetCoordinateFeedResponseWrapper
from baiduads.searchfeed.model.get_media_packages_request_wrapper import GetMediaPackagesRequestWrapper
from baiduads.searchfeed.model.get_media_packages_response_wrapper import GetMediaPackagesResponseWrapper
from baiduads.searchfeed.model.get_medias_request_wrapper import GetMediasRequestWrapper
from baiduads.searchfeed.model.get_medias_response_wrapper import GetMediasResponseWrapper
from baiduads.searchfeed.model.get_ocpc_trans_feed_request_wrapper import GetOcpcTransFeedRequestWrapper
from baiduads.searchfeed.model.get_ocpc_trans_feed_response_wrapper import GetOcpcTransFeedResponseWrapper
from baiduads.searchfeed.model.get_recm_word_packages_feed_request_wrapper import GetRecmWordPackagesFeedRequestWrapper
from baiduads.searchfeed.model.get_recm_word_packages_feed_response_wrapper import GetRecmWordPackagesFeedResponseWrapper


class SearchFeedService(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.get_app_id_name_feed_endpoint = _Endpoint(
            settings={
                'response_type': (GetAppIdNameFeedResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/feed/v1/SearchFeedService/getAppIdNameFeed',
                'operation_id': 'get_app_id_name_feed',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_app_id_name_feed_request_wrapper',
                ],
                'required': [
                    'get_app_id_name_feed_request_wrapper',
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
                    'get_app_id_name_feed_request_wrapper':
                        (GetAppIdNameFeedRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_app_id_name_feed_request_wrapper': 'body',
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
        self.get_biz_area_feed_endpoint = _Endpoint(
            settings={
                'response_type': (GetBizAreaFeedResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/feed/v1/SearchFeedService/getBizAreaFeed',
                'operation_id': 'get_biz_area_feed',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_biz_area_feed_request_wrapper',
                ],
                'required': [
                    'get_biz_area_feed_request_wrapper',
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
                    'get_biz_area_feed_request_wrapper':
                        (GetBizAreaFeedRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_biz_area_feed_request_wrapper': 'body',
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
        self.get_coordinate_feed_endpoint = _Endpoint(
            settings={
                'response_type': (GetCoordinateFeedResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/feed/v1/SearchFeedService/getCoordinateFeed',
                'operation_id': 'get_coordinate_feed',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_coordinate_feed_request_wrapper',
                ],
                'required': [
                    'get_coordinate_feed_request_wrapper',
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
                    'get_coordinate_feed_request_wrapper':
                        (GetCoordinateFeedRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_coordinate_feed_request_wrapper': 'body',
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
        self.get_media_packages_endpoint = _Endpoint(
            settings={
                'response_type': (GetMediaPackagesResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/feed/v1/SearchFeedService/getMediaPackages',
                'operation_id': 'get_media_packages',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_media_packages_request_wrapper',
                ],
                'required': [
                    'get_media_packages_request_wrapper',
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
                    'get_media_packages_request_wrapper':
                        (GetMediaPackagesRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_media_packages_request_wrapper': 'body',
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
        self.get_medias_endpoint = _Endpoint(
            settings={
                'response_type': (GetMediasResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/feed/v1/SearchFeedService/getMedias',
                'operation_id': 'get_medias',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_medias_request_wrapper',
                ],
                'required': [
                    'get_medias_request_wrapper',
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
                    'get_medias_request_wrapper':
                        (GetMediasRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_medias_request_wrapper': 'body',
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
        self.get_ocpc_trans_feed_endpoint = _Endpoint(
            settings={
                'response_type': (GetOcpcTransFeedResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/feed/v1/SearchFeedService/getOcpcTransFeed',
                'operation_id': 'get_ocpc_trans_feed',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_ocpc_trans_feed_request_wrapper',
                ],
                'required': [
                    'get_ocpc_trans_feed_request_wrapper',
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
                    'get_ocpc_trans_feed_request_wrapper':
                        (GetOcpcTransFeedRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_ocpc_trans_feed_request_wrapper': 'body',
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
        self.get_recm_word_packages_feed_endpoint = _Endpoint(
            settings={
                'response_type': (GetRecmWordPackagesFeedResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/feed/v1/SearchFeedService/getRecmWordPackagesFeed',
                'operation_id': 'get_recm_word_packages_feed',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_recm_word_packages_feed_request_wrapper',
                ],
                'required': [
                    'get_recm_word_packages_feed_request_wrapper',
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
                    'get_recm_word_packages_feed_request_wrapper':
                        (GetRecmWordPackagesFeedRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_recm_word_packages_feed_request_wrapper': 'body',
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

    def get_app_id_name_feed(
        self,
        get_app_id_name_feed_request_wrapper,
        **kwargs
    ):
        """get_app_id_name_feed  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_app_id_name_feed(get_app_id_name_feed_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_app_id_name_feed_request_wrapper (GetAppIdNameFeedRequestWrapper):

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
            GetAppIdNameFeedResponseWrapper
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
        kwargs['get_app_id_name_feed_request_wrapper'] = \
            get_app_id_name_feed_request_wrapper
        return self.get_app_id_name_feed_endpoint.call_with_http_info(**kwargs)

    def get_biz_area_feed(
        self,
        get_biz_area_feed_request_wrapper,
        **kwargs
    ):
        """get_biz_area_feed  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_biz_area_feed(get_biz_area_feed_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_biz_area_feed_request_wrapper (GetBizAreaFeedRequestWrapper):

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
            GetBizAreaFeedResponseWrapper
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
        kwargs['get_biz_area_feed_request_wrapper'] = \
            get_biz_area_feed_request_wrapper
        return self.get_biz_area_feed_endpoint.call_with_http_info(**kwargs)

    def get_coordinate_feed(
        self,
        get_coordinate_feed_request_wrapper,
        **kwargs
    ):
        """get_coordinate_feed  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_coordinate_feed(get_coordinate_feed_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_coordinate_feed_request_wrapper (GetCoordinateFeedRequestWrapper):

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
            GetCoordinateFeedResponseWrapper
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
        kwargs['get_coordinate_feed_request_wrapper'] = \
            get_coordinate_feed_request_wrapper
        return self.get_coordinate_feed_endpoint.call_with_http_info(**kwargs)

    def get_media_packages(
        self,
        get_media_packages_request_wrapper,
        **kwargs
    ):
        """get_media_packages  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_media_packages(get_media_packages_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_media_packages_request_wrapper (GetMediaPackagesRequestWrapper):

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
            GetMediaPackagesResponseWrapper
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
        kwargs['get_media_packages_request_wrapper'] = \
            get_media_packages_request_wrapper
        return self.get_media_packages_endpoint.call_with_http_info(**kwargs)

    def get_medias(
        self,
        get_medias_request_wrapper,
        **kwargs
    ):
        """get_medias  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_medias(get_medias_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_medias_request_wrapper (GetMediasRequestWrapper):

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
            GetMediasResponseWrapper
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
        kwargs['get_medias_request_wrapper'] = \
            get_medias_request_wrapper
        return self.get_medias_endpoint.call_with_http_info(**kwargs)

    def get_ocpc_trans_feed(
        self,
        get_ocpc_trans_feed_request_wrapper,
        **kwargs
    ):
        """get_ocpc_trans_feed  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_ocpc_trans_feed(get_ocpc_trans_feed_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_ocpc_trans_feed_request_wrapper (GetOcpcTransFeedRequestWrapper):

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
            GetOcpcTransFeedResponseWrapper
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
        kwargs['get_ocpc_trans_feed_request_wrapper'] = \
            get_ocpc_trans_feed_request_wrapper
        return self.get_ocpc_trans_feed_endpoint.call_with_http_info(**kwargs)

    def get_recm_word_packages_feed(
        self,
        get_recm_word_packages_feed_request_wrapper,
        **kwargs
    ):
        """get_recm_word_packages_feed  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_recm_word_packages_feed(get_recm_word_packages_feed_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_recm_word_packages_feed_request_wrapper (GetRecmWordPackagesFeedRequestWrapper):

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
            GetRecmWordPackagesFeedResponseWrapper
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
        kwargs['get_recm_word_packages_feed_request_wrapper'] = \
            get_recm_word_packages_feed_request_wrapper
        return self.get_recm_word_packages_feed_endpoint.call_with_http_info(**kwargs)
