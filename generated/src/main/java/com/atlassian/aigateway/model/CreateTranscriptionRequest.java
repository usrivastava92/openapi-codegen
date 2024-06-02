/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.atlassian.aigateway.model;

import java.util.Objects;
import com.atlassian.aigateway.model.CreateTranscriptionRequestModel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.atlassian.aigateway.JSON;

/**
 * CreateTranscriptionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-02T18:29:03.933402+05:30[Asia/Kolkata]", comments = "Generator version: 7.6.0")
public class CreateTranscriptionRequest {
  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private File _file;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private CreateTranscriptionRequestModel model;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_PROMPT = "prompt";
  @SerializedName(SERIALIZED_NAME_PROMPT)
  private String prompt;

  /**
   * The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;. 
   */
  @JsonAdapter(ResponseFormatEnum.Adapter.class)
  public enum ResponseFormatEnum {
    JSON("json"),
    
    TEXT("text"),
    
    SRT("srt"),
    
    VERBOSE_JSON("verbose_json"),
    
    VTT("vtt");

    private String value;

    ResponseFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResponseFormatEnum fromValue(String value) {
      for (ResponseFormatEnum b : ResponseFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ResponseFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResponseFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResponseFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ResponseFormatEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ResponseFormatEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_RESPONSE_FORMAT = "response_format";
  @SerializedName(SERIALIZED_NAME_RESPONSE_FORMAT)
  private ResponseFormatEnum responseFormat = ResponseFormatEnum.JSON;

  public static final String SERIALIZED_NAME_TEMPERATURE = "temperature";
  @SerializedName(SERIALIZED_NAME_TEMPERATURE)
  private BigDecimal temperature = new BigDecimal("0");

  /**
   * Gets or Sets timestampGranularities
   */
  @JsonAdapter(TimestampGranularitiesEnum.Adapter.class)
  public enum TimestampGranularitiesEnum {
    WORD("word"),
    
    SEGMENT("segment");

    private String value;

    TimestampGranularitiesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TimestampGranularitiesEnum fromValue(String value) {
      for (TimestampGranularitiesEnum b : TimestampGranularitiesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TimestampGranularitiesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TimestampGranularitiesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TimestampGranularitiesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TimestampGranularitiesEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TimestampGranularitiesEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TIMESTAMP_GRANULARITIES = "timestamp_granularities[]";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP_GRANULARITIES)
  private List<TimestampGranularitiesEnum> timestampGranularities = new ArrayList<>(Arrays.asList(TimestampGranularitiesEnum.SEGMENT));

  public CreateTranscriptionRequest() {
  }

  public CreateTranscriptionRequest _file(File _file) {
    this._file = _file;
    return this;
  }

   /**
   * The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
   * @return _file
  **/
  @javax.annotation.Nonnull
  public File getFile() {
    return _file;
  }

  public void setFile(File _file) {
    this._file = _file;
  }


  public CreateTranscriptionRequest model(CreateTranscriptionRequestModel model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @javax.annotation.Nonnull
  public CreateTranscriptionRequestModel getModel() {
    return model;
  }

  public void setModel(CreateTranscriptionRequestModel model) {
    this.model = model;
  }


  public CreateTranscriptionRequest language(String language) {
    this.language = language;
    return this;
  }

   /**
   * The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
   * @return language
  **/
  @javax.annotation.Nullable
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  public CreateTranscriptionRequest prompt(String prompt) {
    this.prompt = prompt;
    return this;
  }

   /**
   * An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. 
   * @return prompt
  **/
  @javax.annotation.Nullable
  public String getPrompt() {
    return prompt;
  }

  public void setPrompt(String prompt) {
    this.prompt = prompt;
  }


  public CreateTranscriptionRequest responseFormat(ResponseFormatEnum responseFormat) {
    this.responseFormat = responseFormat;
    return this;
  }

   /**
   * The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;. 
   * @return responseFormat
  **/
  @javax.annotation.Nullable
  public ResponseFormatEnum getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(ResponseFormatEnum responseFormat) {
    this.responseFormat = responseFormat;
  }


  public CreateTranscriptionRequest temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

   /**
   * The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
   * @return temperature
  **/
  @javax.annotation.Nullable
  public BigDecimal getTemperature() {
    return temperature;
  }

  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }


  public CreateTranscriptionRequest timestampGranularities(List<TimestampGranularitiesEnum> timestampGranularities) {
    this.timestampGranularities = timestampGranularities;
    return this;
  }

  public CreateTranscriptionRequest addTimestampGranularitiesItem(TimestampGranularitiesEnum timestampGranularitiesItem) {
    if (this.timestampGranularities == null) {
      this.timestampGranularities = new ArrayList<>(Arrays.asList(TimestampGranularitiesEnum.SEGMENT));
    }
    this.timestampGranularities.add(timestampGranularitiesItem);
    return this;
  }

   /**
   * The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. 
   * @return timestampGranularities
  **/
  @javax.annotation.Nullable
  public List<TimestampGranularitiesEnum> getTimestampGranularities() {
    return timestampGranularities;
  }

  public void setTimestampGranularities(List<TimestampGranularitiesEnum> timestampGranularities) {
    this.timestampGranularities = timestampGranularities;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTranscriptionRequest createTranscriptionRequest = (CreateTranscriptionRequest) o;
    return Objects.equals(this._file, createTranscriptionRequest._file) &&
        Objects.equals(this.model, createTranscriptionRequest.model) &&
        Objects.equals(this.language, createTranscriptionRequest.language) &&
        Objects.equals(this.prompt, createTranscriptionRequest.prompt) &&
        Objects.equals(this.responseFormat, createTranscriptionRequest.responseFormat) &&
        Objects.equals(this.temperature, createTranscriptionRequest.temperature) &&
        Objects.equals(this.timestampGranularities, createTranscriptionRequest.timestampGranularities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_file, model, language, prompt, responseFormat, temperature, timestampGranularities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTranscriptionRequest {\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    timestampGranularities: ").append(toIndentedString(timestampGranularities)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("file");
    openapiFields.add("model");
    openapiFields.add("language");
    openapiFields.add("prompt");
    openapiFields.add("response_format");
    openapiFields.add("temperature");
    openapiFields.add("timestamp_granularities[]");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("file");
    openapiRequiredFields.add("model");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateTranscriptionRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateTranscriptionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateTranscriptionRequest is not found in the empty JSON string", CreateTranscriptionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateTranscriptionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateTranscriptionRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateTranscriptionRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `model`
      CreateTranscriptionRequestModel.validateJsonElement(jsonObj.get("model"));
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if ((jsonObj.get("prompt") != null && !jsonObj.get("prompt").isJsonNull()) && !jsonObj.get("prompt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prompt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prompt").toString()));
      }
      if ((jsonObj.get("response_format") != null && !jsonObj.get("response_format").isJsonNull()) && !jsonObj.get("response_format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `response_format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("response_format").toString()));
      }
      // validate the optional field `response_format`
      if (jsonObj.get("response_format") != null && !jsonObj.get("response_format").isJsonNull()) {
        ResponseFormatEnum.validateJsonElement(jsonObj.get("response_format"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("timestamp_granularities[]") != null && !jsonObj.get("timestamp_granularities[]").isJsonNull() && !jsonObj.get("timestamp_granularities[]").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `timestamp_granularities[]` to be an array in the JSON string but got `%s`", jsonObj.get("timestamp_granularities[]").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTranscriptionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTranscriptionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTranscriptionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTranscriptionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTranscriptionRequest>() {
           @Override
           public void write(JsonWriter out, CreateTranscriptionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTranscriptionRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateTranscriptionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateTranscriptionRequest
  * @throws IOException if the JSON string is invalid with respect to CreateTranscriptionRequest
  */
  public static CreateTranscriptionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTranscriptionRequest.class);
  }

 /**
  * Convert an instance of CreateTranscriptionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

