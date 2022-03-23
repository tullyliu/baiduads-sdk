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
from baiduads.extaudience.model.create_empty_group_request_wrapper import CreateEmptyGroupRequestWrapper
from baiduads.extaudience.model.create_empty_group_response_wrapper import CreateEmptyGroupResponseWrapper
from baiduads.extaudience.model.get_audience_list_request_wrapper import GetAudienceListRequestWrapper
from baiduads.extaudience.model.get_audience_list_response_wrapper import GetAudienceListResponseWrapper
from baiduads.extaudience.model.update_audience_dsp_request_wrapper import UpdateAudienceDspRequestWrapper
from baiduads.extaudience.model.update_audience_dsp_response_wrapper import UpdateAudienceDspResponseWrapper
from baiduads.extaudience.model.update_id_upload4_pour_request_wrapper import UpdateIdUpload4PourRequestWrapper
from baiduads.extaudience.model.update_id_upload4_pour_response_wrapper import UpdateIdUpload4PourResponseWrapper


class ExtAudienceService(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.create_empty_group_endpoint = _Endpoint(
            settings={
                'response_type': (CreateEmptyGroupResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/ExtAudienceService/createEmptyGroup',
                'operation_id': 'create_empty_group',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'create_empty_group_request_wrapper',
                ],
                'required': [
                    'create_empty_group_request_wrapper',
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
                    'create_empty_group_request_wrapper':
                        (CreateEmptyGroupRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'create_empty_group_request_wrapper': 'body',
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
        self.get_audience_list_endpoint = _Endpoint(
            settings={
                'response_type': (GetAudienceListResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/ExtAudienceService/getAudienceList',
                'operation_id': 'get_audience_list',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_audience_list_request_wrapper',
                ],
                'required': [
                    'get_audience_list_request_wrapper',
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
                    'get_audience_list_request_wrapper':
                        (GetAudienceListRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_audience_list_request_wrapper': 'body',
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
        self.update_audience_dsp_endpoint = _Endpoint(
            settings={
                'response_type': (UpdateAudienceDspResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/ExtAudienceService/updateAudienceDsp',
                'operation_id': 'update_audience_dsp',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'update_audience_dsp_request_wrapper',
                ],
                'required': [
                    'update_audience_dsp_request_wrapper',
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
                    'update_audience_dsp_request_wrapper':
                        (UpdateAudienceDspRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'update_audience_dsp_request_wrapper': 'body',
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
        self.update_id_upload4_pour_endpoint = _Endpoint(
            settings={
                'response_type': (UpdateIdUpload4PourResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/ExtAudienceService/updateIdUpload4Pour',
                'operation_id': 'update_id_upload4_pour',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'update_id_upload4_pour_request_wrapper',
                ],
                'required': [
                    'update_id_upload4_pour_request_wrapper',
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
                    'update_id_upload4_pour_request_wrapper':
                        (UpdateIdUpload4PourRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'update_id_upload4_pour_request_wrapper': 'body',
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

    def create_empty_group(
        self,
        create_empty_group_request_wrapper,
        **kwargs
    ):
        """create_empty_group  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.create_empty_group(create_empty_group_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            create_empty_group_request_wrapper (CreateEmptyGroupRequestWrapper):

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
            CreateEmptyGroupResponseWrapper
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
        kwargs['create_empty_group_request_wrapper'] = \
            create_empty_group_request_wrapper
        return self.create_empty_group_endpoint.call_with_http_info(**kwargs)

    def get_audience_list(
        self,
        get_audience_list_request_wrapper,
        **kwargs
    ):
        """get_audience_list  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_audience_list(get_audience_list_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_audience_list_request_wrapper (GetAudienceListRequestWrapper):

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
            GetAudienceListResponseWrapper
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
        kwargs['get_audience_list_request_wrapper'] = \
            get_audience_list_request_wrapper
        return self.get_audience_list_endpoint.call_with_http_info(**kwargs)

    def update_audience_dsp(
        self,
        update_audience_dsp_request_wrapper,
        **kwargs
    ):
        """update_audience_dsp  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.update_audience_dsp(update_audience_dsp_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            update_audience_dsp_request_wrapper (UpdateAudienceDspRequestWrapper):

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
            UpdateAudienceDspResponseWrapper
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
        kwargs['update_audience_dsp_request_wrapper'] = \
            update_audience_dsp_request_wrapper
        return self.update_audience_dsp_endpoint.call_with_http_info(**kwargs)

    def update_id_upload4_pour(
        self,
        update_id_upload4_pour_request_wrapper,
        **kwargs
    ):
        """update_id_upload4_pour  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.update_id_upload4_pour(update_id_upload4_pour_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            update_id_upload4_pour_request_wrapper (UpdateIdUpload4PourRequestWrapper):

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
            UpdateIdUpload4PourResponseWrapper
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
        kwargs['update_id_upload4_pour_request_wrapper'] = \
            update_id_upload4_pour_request_wrapper
        return self.update_id_upload4_pour_endpoint.call_with_http_info(**kwargs)
