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


package com.usrivastava.model;

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

import com.usrivastava.JSON;

/**
 * AssistantObjectToolResourcesFileSearch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-02T20:01:07.182987+05:30[Asia/Kolkata]", comments = "Generator version: 7.6.0")
public class AssistantObjectToolResourcesFileSearch {
  public static final String SERIALIZED_NAME_VECTOR_STORE_IDS = "vector_store_ids";
  @SerializedName(SERIALIZED_NAME_VECTOR_STORE_IDS)
  private List<String> vectorStoreIds = new ArrayList<>();

  public AssistantObjectToolResourcesFileSearch() {
  }

  public AssistantObjectToolResourcesFileSearch vectorStoreIds(List<String> vectorStoreIds) {
    this.vectorStoreIds = vectorStoreIds;
    return this;
  }

  public AssistantObjectToolResourcesFileSearch addVectorStoreIdsItem(String vectorStoreIdsItem) {
    if (this.vectorStoreIds == null) {
      this.vectorStoreIds = new ArrayList<>();
    }
    this.vectorStoreIds.add(vectorStoreIdsItem);
    return this;
  }

   /**
   * The ID of the [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
   * @return vectorStoreIds
  **/
  @javax.annotation.Nullable
  public List<String> getVectorStoreIds() {
    return vectorStoreIds;
  }

  public void setVectorStoreIds(List<String> vectorStoreIds) {
    this.vectorStoreIds = vectorStoreIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssistantObjectToolResourcesFileSearch assistantObjectToolResourcesFileSearch = (AssistantObjectToolResourcesFileSearch) o;
    return Objects.equals(this.vectorStoreIds, assistantObjectToolResourcesFileSearch.vectorStoreIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vectorStoreIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssistantObjectToolResourcesFileSearch {\n");
    sb.append("    vectorStoreIds: ").append(toIndentedString(vectorStoreIds)).append("\n");
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
    openapiFields.add("vector_store_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AssistantObjectToolResourcesFileSearch
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AssistantObjectToolResourcesFileSearch.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AssistantObjectToolResourcesFileSearch is not found in the empty JSON string", AssistantObjectToolResourcesFileSearch.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AssistantObjectToolResourcesFileSearch.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AssistantObjectToolResourcesFileSearch` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("vector_store_ids") != null && !jsonObj.get("vector_store_ids").isJsonNull() && !jsonObj.get("vector_store_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `vector_store_ids` to be an array in the JSON string but got `%s`", jsonObj.get("vector_store_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssistantObjectToolResourcesFileSearch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssistantObjectToolResourcesFileSearch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssistantObjectToolResourcesFileSearch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssistantObjectToolResourcesFileSearch.class));

       return (TypeAdapter<T>) new TypeAdapter<AssistantObjectToolResourcesFileSearch>() {
           @Override
           public void write(JsonWriter out, AssistantObjectToolResourcesFileSearch value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AssistantObjectToolResourcesFileSearch read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AssistantObjectToolResourcesFileSearch given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AssistantObjectToolResourcesFileSearch
  * @throws IOException if the JSON string is invalid with respect to AssistantObjectToolResourcesFileSearch
  */
  public static AssistantObjectToolResourcesFileSearch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssistantObjectToolResourcesFileSearch.class);
  }

 /**
  * Convert an instance of AssistantObjectToolResourcesFileSearch to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

