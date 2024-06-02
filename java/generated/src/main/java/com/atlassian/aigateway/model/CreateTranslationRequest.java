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
import java.util.Arrays;

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
 * CreateTranslationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-02T18:29:03.933402+05:30[Asia/Kolkata]", comments = "Generator version: 7.6.0")
public class CreateTranslationRequest {
  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private File _file;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private CreateTranscriptionRequestModel model;

  public static final String SERIALIZED_NAME_PROMPT = "prompt";
  @SerializedName(SERIALIZED_NAME_PROMPT)
  private String prompt;

  public static final String SERIALIZED_NAME_RESPONSE_FORMAT = "response_format";
  @SerializedName(SERIALIZED_NAME_RESPONSE_FORMAT)
  private String responseFormat = "json";

  public static final String SERIALIZED_NAME_TEMPERATURE = "temperature";
  @SerializedName(SERIALIZED_NAME_TEMPERATURE)
  private BigDecimal temperature = new BigDecimal("0");

  public CreateTranslationRequest() {
  }

  public CreateTranslationRequest _file(File _file) {
    this._file = _file;
    return this;
  }

   /**
   * The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
   * @return _file
  **/
  @javax.annotation.Nonnull
  public File getFile() {
    return _file;
  }

  public void setFile(File _file) {
    this._file = _file;
  }


  public CreateTranslationRequest model(CreateTranscriptionRequestModel model) {
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


  public CreateTranslationRequest prompt(String prompt) {
    this.prompt = prompt;
    return this;
  }

   /**
   * An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. 
   * @return prompt
  **/
  @javax.annotation.Nullable
  public String getPrompt() {
    return prompt;
  }

  public void setPrompt(String prompt) {
    this.prompt = prompt;
  }


  public CreateTranslationRequest responseFormat(String responseFormat) {
    this.responseFormat = responseFormat;
    return this;
  }

   /**
   * The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;. 
   * @return responseFormat
  **/
  @javax.annotation.Nullable
  public String getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(String responseFormat) {
    this.responseFormat = responseFormat;
  }


  public CreateTranslationRequest temperature(BigDecimal temperature) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTranslationRequest createTranslationRequest = (CreateTranslationRequest) o;
    return Objects.equals(this._file, createTranslationRequest._file) &&
        Objects.equals(this.model, createTranslationRequest.model) &&
        Objects.equals(this.prompt, createTranslationRequest.prompt) &&
        Objects.equals(this.responseFormat, createTranslationRequest.responseFormat) &&
        Objects.equals(this.temperature, createTranslationRequest.temperature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_file, model, prompt, responseFormat, temperature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTranslationRequest {\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
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
    openapiFields.add("prompt");
    openapiFields.add("response_format");
    openapiFields.add("temperature");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("file");
    openapiRequiredFields.add("model");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateTranslationRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateTranslationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateTranslationRequest is not found in the empty JSON string", CreateTranslationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateTranslationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateTranslationRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateTranslationRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `model`
      CreateTranscriptionRequestModel.validateJsonElement(jsonObj.get("model"));
      if ((jsonObj.get("prompt") != null && !jsonObj.get("prompt").isJsonNull()) && !jsonObj.get("prompt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prompt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prompt").toString()));
      }
      if ((jsonObj.get("response_format") != null && !jsonObj.get("response_format").isJsonNull()) && !jsonObj.get("response_format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `response_format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("response_format").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTranslationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTranslationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTranslationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTranslationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTranslationRequest>() {
           @Override
           public void write(JsonWriter out, CreateTranslationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTranslationRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateTranslationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateTranslationRequest
  * @throws IOException if the JSON string is invalid with respect to CreateTranslationRequest
  */
  public static CreateTranslationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTranslationRequest.class);
  }

 /**
  * Convert an instance of CreateTranslationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

