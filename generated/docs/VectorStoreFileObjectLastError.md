

# VectorStoreFileObjectLastError

The last error associated with this vector store file. Will be `null` if there are no errors.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | [**CodeEnum**](#CodeEnum) | One of &#x60;server_error&#x60; or &#x60;rate_limit_exceeded&#x60;. |  |
|**message** | **String** | A human-readable description of the error. |  |



## Enum: CodeEnum

| Name | Value |
|---- | -----|
| INTERNAL_ERROR | &quot;internal_error&quot; |
| FILE_NOT_FOUND | &quot;file_not_found&quot; |
| PARSING_ERROR | &quot;parsing_error&quot; |
| UNHANDLED_MIME_TYPE | &quot;unhandled_mime_type&quot; |



