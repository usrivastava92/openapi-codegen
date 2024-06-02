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
import com.atlassian.aigateway.model.AssistantObjectToolResourcesFileSearch;
import com.atlassian.aigateway.model.CreateAssistantRequestToolResourcesCodeInterpreter;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * A set of resources that are used by the assistant&#39;s tools. The resources are specific to the type of tool. For example, the &#x60;code_interpreter&#x60; tool requires a list of file IDs, while the &#x60;file_search&#x60; tool requires a list of vector store IDs. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-02T19:36:59.215862+05:30[Asia/Kolkata]", comments = "Generator version: 7.6.0")
public class CreateThreadAndRunRequestToolResources {
  public static final String SERIALIZED_NAME_CODE_INTERPRETER = "code_interpreter";
  @SerializedName(SERIALIZED_NAME_CODE_INTERPRETER)
  private CreateAssistantRequestToolResourcesCodeInterpreter codeInterpreter;

  public static final String SERIALIZED_NAME_FILE_SEARCH = "file_search";
  @SerializedName(SERIALIZED_NAME_FILE_SEARCH)
  private AssistantObjectToolResourcesFileSearch fileSearch;

  public CreateThreadAndRunRequestToolResources() {
  }

  public CreateThreadAndRunRequestToolResources codeInterpreter(CreateAssistantRequestToolResourcesCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
    return this;
  }

   /**
   * Get codeInterpreter
   * @return codeInterpreter
  **/
  @javax.annotation.Nullable
  public CreateAssistantRequestToolResourcesCodeInterpreter getCodeInterpreter() {
    return codeInterpreter;
  }

  public void setCodeInterpreter(CreateAssistantRequestToolResourcesCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
  }


  public CreateThreadAndRunRequestToolResources fileSearch(AssistantObjectToolResourcesFileSearch fileSearch) {
    this.fileSearch = fileSearch;
    return this;
  }

   /**
   * Get fileSearch
   * @return fileSearch
  **/
  @javax.annotation.Nullable
  public AssistantObjectToolResourcesFileSearch getFileSearch() {
    return fileSearch;
  }

  public void setFileSearch(AssistantObjectToolResourcesFileSearch fileSearch) {
    this.fileSearch = fileSearch;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateThreadAndRunRequestToolResources createThreadAndRunRequestToolResources = (CreateThreadAndRunRequestToolResources) o;
    return Objects.equals(this.codeInterpreter, createThreadAndRunRequestToolResources.codeInterpreter) &&
        Objects.equals(this.fileSearch, createThreadAndRunRequestToolResources.fileSearch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeInterpreter, fileSearch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateThreadAndRunRequestToolResources {\n");
    sb.append("    codeInterpreter: ").append(toIndentedString(codeInterpreter)).append("\n");
    sb.append("    fileSearch: ").append(toIndentedString(fileSearch)).append("\n");
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
    openapiFields.add("code_interpreter");
    openapiFields.add("file_search");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateThreadAndRunRequestToolResources
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateThreadAndRunRequestToolResources.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateThreadAndRunRequestToolResources is not found in the empty JSON string", CreateThreadAndRunRequestToolResources.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateThreadAndRunRequestToolResources.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateThreadAndRunRequestToolResources` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `code_interpreter`
      if (jsonObj.get("code_interpreter") != null && !jsonObj.get("code_interpreter").isJsonNull()) {
        CreateAssistantRequestToolResourcesCodeInterpreter.validateJsonElement(jsonObj.get("code_interpreter"));
      }
      // validate the optional field `file_search`
      if (jsonObj.get("file_search") != null && !jsonObj.get("file_search").isJsonNull()) {
        AssistantObjectToolResourcesFileSearch.validateJsonElement(jsonObj.get("file_search"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateThreadAndRunRequestToolResources.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateThreadAndRunRequestToolResources' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateThreadAndRunRequestToolResources> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateThreadAndRunRequestToolResources.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateThreadAndRunRequestToolResources>() {
           @Override
           public void write(JsonWriter out, CreateThreadAndRunRequestToolResources value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateThreadAndRunRequestToolResources read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateThreadAndRunRequestToolResources given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateThreadAndRunRequestToolResources
  * @throws IOException if the JSON string is invalid with respect to CreateThreadAndRunRequestToolResources
  */
  public static CreateThreadAndRunRequestToolResources fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateThreadAndRunRequestToolResources.class);
  }

 /**
  * Convert an instance of CreateThreadAndRunRequestToolResources to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

