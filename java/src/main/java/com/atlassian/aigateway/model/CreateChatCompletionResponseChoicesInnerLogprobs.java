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
import com.atlassian.aigateway.model.ChatCompletionTokenLogprob;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * Log probability information for the choice.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-02T19:36:59.215862+05:30[Asia/Kolkata]", comments = "Generator version: 7.6.0")
public class CreateChatCompletionResponseChoicesInnerLogprobs {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private List<ChatCompletionTokenLogprob> content;

  public CreateChatCompletionResponseChoicesInnerLogprobs() {
  }

  public CreateChatCompletionResponseChoicesInnerLogprobs content(List<ChatCompletionTokenLogprob> content) {
    this.content = content;
    return this;
  }

  public CreateChatCompletionResponseChoicesInnerLogprobs addContentItem(ChatCompletionTokenLogprob contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

   /**
   * A list of message content tokens with log probability information.
   * @return content
  **/
  @javax.annotation.Nullable
  public List<ChatCompletionTokenLogprob> getContent() {
    return content;
  }

  public void setContent(List<ChatCompletionTokenLogprob> content) {
    this.content = content;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChatCompletionResponseChoicesInnerLogprobs createChatCompletionResponseChoicesInnerLogprobs = (CreateChatCompletionResponseChoicesInnerLogprobs) o;
    return Objects.equals(this.content, createChatCompletionResponseChoicesInnerLogprobs.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionResponseChoicesInnerLogprobs {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
    openapiFields.add("content");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("content");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateChatCompletionResponseChoicesInnerLogprobs
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateChatCompletionResponseChoicesInnerLogprobs.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateChatCompletionResponseChoicesInnerLogprobs is not found in the empty JSON string", CreateChatCompletionResponseChoicesInnerLogprobs.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateChatCompletionResponseChoicesInnerLogprobs.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateChatCompletionResponseChoicesInnerLogprobs` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateChatCompletionResponseChoicesInnerLogprobs.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("content").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be an array in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }

      JsonArray jsonArraycontent = jsonObj.getAsJsonArray("content");
      // validate the required field `content` (array)
      for (int i = 0; i < jsonArraycontent.size(); i++) {
        ChatCompletionTokenLogprob.validateJsonElement(jsonArraycontent.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateChatCompletionResponseChoicesInnerLogprobs.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateChatCompletionResponseChoicesInnerLogprobs' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateChatCompletionResponseChoicesInnerLogprobs> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateChatCompletionResponseChoicesInnerLogprobs.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateChatCompletionResponseChoicesInnerLogprobs>() {
           @Override
           public void write(JsonWriter out, CreateChatCompletionResponseChoicesInnerLogprobs value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateChatCompletionResponseChoicesInnerLogprobs read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateChatCompletionResponseChoicesInnerLogprobs given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateChatCompletionResponseChoicesInnerLogprobs
  * @throws IOException if the JSON string is invalid with respect to CreateChatCompletionResponseChoicesInnerLogprobs
  */
  public static CreateChatCompletionResponseChoicesInnerLogprobs fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateChatCompletionResponseChoicesInnerLogprobs.class);
  }

 /**
  * Convert an instance of CreateChatCompletionResponseChoicesInnerLogprobs to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
