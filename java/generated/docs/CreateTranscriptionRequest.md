

# CreateTranscriptionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_file** | **File** | The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  |  |
|**model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md) |  |  |
|**language** | **String** | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  |  [optional] |
|**prompt** | **String** | An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  |  [optional] |
|**responseFormat** | [**ResponseFormatEnum**](#ResponseFormatEnum) | The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;.  |  [optional] |
|**temperature** | **BigDecimal** | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  |  [optional] |
|**timestampGranularities** | [**List&lt;TimestampGranularitiesEnum&gt;**](#List&lt;TimestampGranularitiesEnum&gt;) | The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency.  |  [optional] |



## Enum: ResponseFormatEnum

| Name | Value |
|---- | -----|
| JSON | &quot;json&quot; |
| TEXT | &quot;text&quot; |
| SRT | &quot;srt&quot; |
| VERBOSE_JSON | &quot;verbose_json&quot; |
| VTT | &quot;vtt&quot; |



## Enum: List&lt;TimestampGranularitiesEnum&gt;

| Name | Value |
|---- | -----|
| WORD | &quot;word&quot; |
| SEGMENT | &quot;segment&quot; |



