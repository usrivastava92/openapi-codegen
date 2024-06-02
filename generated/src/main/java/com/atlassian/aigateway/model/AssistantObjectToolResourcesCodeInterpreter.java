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
 * AssistantObjectToolResourcesCodeInterpreter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-02T18:29:03.933402+05:30[Asia/Kolkata]", comments = "Generator version: 7.6.0")
public class AssistantObjectToolResourcesCodeInterpreter {
  public static final String SERIALIZED_NAME_FILE_IDS = "file_ids";
  @SerializedName(SERIALIZED_NAME_FILE_IDS)
  private List<String> fileIds = new ArrayList<>();

  public AssistantObjectToolResourcesCodeInterpreter() {
  }

  public AssistantObjectToolResourcesCodeInterpreter fileIds(List<String> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  public AssistantObjectToolResourcesCodeInterpreter addFileIdsItem(String fileIdsItem) {
    if (this.fileIds == null) {
      this.fileIds = new ArrayList<>();
    }
    this.fileIds.add(fileIdsItem);
    return this;
  }

   /**
   * A list of [file](/docs/api-reference/files) IDs made available to the &#x60;code_interpreter&#x60;&#x60; tool. There can be a maximum of 20 files associated with the tool. 
   * @return fileIds
  **/
  @javax.annotation.Nullable
  public List<String> getFileIds() {
    return fileIds;
  }

  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssistantObjectToolResourcesCodeInterpreter assistantObjectToolResourcesCodeInterpreter = (AssistantObjectToolResourcesCodeInterpreter) o;
    return Objects.equals(this.fileIds, assistantObjectToolResourcesCodeInterpreter.fileIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssistantObjectToolResourcesCodeInterpreter {\n");
    sb.append("    fileIds: ").append(toIndentedString(fileIds)).append("\n");
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
    openapiFields.add("file_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AssistantObjectToolResourcesCodeInterpreter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AssistantObjectToolResourcesCodeInterpreter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AssistantObjectToolResourcesCodeInterpreter is not found in the empty JSON string", AssistantObjectToolResourcesCodeInterpreter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AssistantObjectToolResourcesCodeInterpreter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AssistantObjectToolResourcesCodeInterpreter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("file_ids") != null && !jsonObj.get("file_ids").isJsonNull() && !jsonObj.get("file_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `file_ids` to be an array in the JSON string but got `%s`", jsonObj.get("file_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssistantObjectToolResourcesCodeInterpreter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssistantObjectToolResourcesCodeInterpreter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssistantObjectToolResourcesCodeInterpreter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssistantObjectToolResourcesCodeInterpreter.class));

       return (TypeAdapter<T>) new TypeAdapter<AssistantObjectToolResourcesCodeInterpreter>() {
           @Override
           public void write(JsonWriter out, AssistantObjectToolResourcesCodeInterpreter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AssistantObjectToolResourcesCodeInterpreter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AssistantObjectToolResourcesCodeInterpreter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AssistantObjectToolResourcesCodeInterpreter
  * @throws IOException if the JSON string is invalid with respect to AssistantObjectToolResourcesCodeInterpreter
  */
  public static AssistantObjectToolResourcesCodeInterpreter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssistantObjectToolResourcesCodeInterpreter.class);
  }

 /**
  * Convert an instance of AssistantObjectToolResourcesCodeInterpreter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

