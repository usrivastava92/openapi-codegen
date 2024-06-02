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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
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
 * ChatCompletionTokenLogprobTopLogprobsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-02T19:36:59.215862+05:30[Asia/Kolkata]", comments = "Generator version: 7.6.0")
public class ChatCompletionTokenLogprobTopLogprobsInner {
  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_LOGPROB = "logprob";
  @SerializedName(SERIALIZED_NAME_LOGPROB)
  private BigDecimal logprob;

  public static final String SERIALIZED_NAME_BYTES = "bytes";
  @SerializedName(SERIALIZED_NAME_BYTES)
  private List<Integer> bytes;

  public ChatCompletionTokenLogprobTopLogprobsInner() {
  }

  public ChatCompletionTokenLogprobTopLogprobsInner token(String token) {
    this.token = token;
    return this;
  }

   /**
   * The token.
   * @return token
  **/
  @javax.annotation.Nonnull
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  public ChatCompletionTokenLogprobTopLogprobsInner logprob(BigDecimal logprob) {
    this.logprob = logprob;
    return this;
  }

   /**
   * The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value &#x60;-9999.0&#x60; is used to signify that the token is very unlikely.
   * @return logprob
  **/
  @javax.annotation.Nonnull
  public BigDecimal getLogprob() {
    return logprob;
  }

  public void setLogprob(BigDecimal logprob) {
    this.logprob = logprob;
  }


  public ChatCompletionTokenLogprobTopLogprobsInner bytes(List<Integer> bytes) {
    this.bytes = bytes;
    return this;
  }

  public ChatCompletionTokenLogprobTopLogprobsInner addBytesItem(Integer bytesItem) {
    if (this.bytes == null) {
      this.bytes = new ArrayList<>();
    }
    this.bytes.add(bytesItem);
    return this;
  }

   /**
   * A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be &#x60;null&#x60; if there is no bytes representation for the token.
   * @return bytes
  **/
  @javax.annotation.Nullable
  public List<Integer> getBytes() {
    return bytes;
  }

  public void setBytes(List<Integer> bytes) {
    this.bytes = bytes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionTokenLogprobTopLogprobsInner chatCompletionTokenLogprobTopLogprobsInner = (ChatCompletionTokenLogprobTopLogprobsInner) o;
    return Objects.equals(this.token, chatCompletionTokenLogprobTopLogprobsInner.token) &&
        Objects.equals(this.logprob, chatCompletionTokenLogprobTopLogprobsInner.logprob) &&
        Objects.equals(this.bytes, chatCompletionTokenLogprobTopLogprobsInner.bytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, logprob, bytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionTokenLogprobTopLogprobsInner {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    logprob: ").append(toIndentedString(logprob)).append("\n");
    sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
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
    openapiFields.add("token");
    openapiFields.add("logprob");
    openapiFields.add("bytes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("token");
    openapiRequiredFields.add("logprob");
    openapiRequiredFields.add("bytes");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ChatCompletionTokenLogprobTopLogprobsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChatCompletionTokenLogprobTopLogprobsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChatCompletionTokenLogprobTopLogprobsInner is not found in the empty JSON string", ChatCompletionTokenLogprobTopLogprobsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChatCompletionTokenLogprobTopLogprobsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChatCompletionTokenLogprobTopLogprobsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ChatCompletionTokenLogprobTopLogprobsInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("bytes") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("bytes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `bytes` to be an array in the JSON string but got `%s`", jsonObj.get("bytes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChatCompletionTokenLogprobTopLogprobsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChatCompletionTokenLogprobTopLogprobsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChatCompletionTokenLogprobTopLogprobsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChatCompletionTokenLogprobTopLogprobsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ChatCompletionTokenLogprobTopLogprobsInner>() {
           @Override
           public void write(JsonWriter out, ChatCompletionTokenLogprobTopLogprobsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChatCompletionTokenLogprobTopLogprobsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChatCompletionTokenLogprobTopLogprobsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChatCompletionTokenLogprobTopLogprobsInner
  * @throws IOException if the JSON string is invalid with respect to ChatCompletionTokenLogprobTopLogprobsInner
  */
  public static ChatCompletionTokenLogprobTopLogprobsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChatCompletionTokenLogprobTopLogprobsInner.class);
  }

 /**
  * Convert an instance of ChatCompletionTokenLogprobTopLogprobsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

