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
import com.atlassian.aigateway.model.CreateAssistantRequestToolResourcesFileSearchVectorStoresInner;
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
 * CreateThreadRequestToolResourcesFileSearch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-02T19:36:59.215862+05:30[Asia/Kolkata]", comments = "Generator version: 7.6.0")
public class CreateThreadRequestToolResourcesFileSearch {
  public static final String SERIALIZED_NAME_VECTOR_STORE_IDS = "vector_store_ids";
  @SerializedName(SERIALIZED_NAME_VECTOR_STORE_IDS)
  private List<String> vectorStoreIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_VECTOR_STORES = "vector_stores";
  @SerializedName(SERIALIZED_NAME_VECTOR_STORES)
  private List<CreateAssistantRequestToolResourcesFileSearchVectorStoresInner> vectorStores = new ArrayList<>();

  public CreateThreadRequestToolResourcesFileSearch() {
  }

  public CreateThreadRequestToolResourcesFileSearch vectorStoreIds(List<String> vectorStoreIds) {
    this.vectorStoreIds = vectorStoreIds;
    return this;
  }

  public CreateThreadRequestToolResourcesFileSearch addVectorStoreIdsItem(String vectorStoreIdsItem) {
    if (this.vectorStoreIds == null) {
      this.vectorStoreIds = new ArrayList<>();
    }
    this.vectorStoreIds.add(vectorStoreIdsItem);
    return this;
  }

   /**
   * The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread. 
   * @return vectorStoreIds
  **/
  @javax.annotation.Nullable
  public List<String> getVectorStoreIds() {
    return vectorStoreIds;
  }

  public void setVectorStoreIds(List<String> vectorStoreIds) {
    this.vectorStoreIds = vectorStoreIds;
  }


  public CreateThreadRequestToolResourcesFileSearch vectorStores(List<CreateAssistantRequestToolResourcesFileSearchVectorStoresInner> vectorStores) {
    this.vectorStores = vectorStores;
    return this;
  }

  public CreateThreadRequestToolResourcesFileSearch addVectorStoresItem(CreateAssistantRequestToolResourcesFileSearchVectorStoresInner vectorStoresItem) {
    if (this.vectorStores == null) {
      this.vectorStores = new ArrayList<>();
    }
    this.vectorStores.add(vectorStoresItem);
    return this;
  }

   /**
   * A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this thread. There can be a maximum of 1 vector store attached to the thread. 
   * @return vectorStores
  **/
  @javax.annotation.Nullable
  public List<CreateAssistantRequestToolResourcesFileSearchVectorStoresInner> getVectorStores() {
    return vectorStores;
  }

  public void setVectorStores(List<CreateAssistantRequestToolResourcesFileSearchVectorStoresInner> vectorStores) {
    this.vectorStores = vectorStores;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateThreadRequestToolResourcesFileSearch createThreadRequestToolResourcesFileSearch = (CreateThreadRequestToolResourcesFileSearch) o;
    return Objects.equals(this.vectorStoreIds, createThreadRequestToolResourcesFileSearch.vectorStoreIds) &&
        Objects.equals(this.vectorStores, createThreadRequestToolResourcesFileSearch.vectorStores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vectorStoreIds, vectorStores);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateThreadRequestToolResourcesFileSearch {\n");
    sb.append("    vectorStoreIds: ").append(toIndentedString(vectorStoreIds)).append("\n");
    sb.append("    vectorStores: ").append(toIndentedString(vectorStores)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateThreadRequestToolResourcesFileSearch
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateThreadRequestToolResourcesFileSearch.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateThreadRequestToolResourcesFileSearch is not found in the empty JSON string", CreateThreadRequestToolResourcesFileSearch.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateThreadRequestToolResourcesFileSearch.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateThreadRequestToolResourcesFileSearch` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("vector_store_ids") != null && !jsonObj.get("vector_store_ids").isJsonNull() && !jsonObj.get("vector_store_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `vector_store_ids` to be an array in the JSON string but got `%s`", jsonObj.get("vector_store_ids").toString()));
      }
      if (jsonObj.get("vector_stores") != null && !jsonObj.get("vector_stores").isJsonNull()) {
        JsonArray jsonArrayvectorStores = jsonObj.getAsJsonArray("vector_stores");
        if (jsonArrayvectorStores != null) {
          // ensure the json data is an array
          if (!jsonObj.get("vector_stores").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `vector_stores` to be an array in the JSON string but got `%s`", jsonObj.get("vector_stores").toString()));
          }

          // validate the optional field `vector_stores` (array)
          for (int i = 0; i < jsonArrayvectorStores.size(); i++) {
            CreateAssistantRequestToolResourcesFileSearchVectorStoresInner.validateJsonElement(jsonArrayvectorStores.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateThreadRequestToolResourcesFileSearch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateThreadRequestToolResourcesFileSearch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateThreadRequestToolResourcesFileSearch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateThreadRequestToolResourcesFileSearch.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateThreadRequestToolResourcesFileSearch>() {
           @Override
           public void write(JsonWriter out, CreateThreadRequestToolResourcesFileSearch value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateThreadRequestToolResourcesFileSearch read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateThreadRequestToolResourcesFileSearch given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateThreadRequestToolResourcesFileSearch
  * @throws IOException if the JSON string is invalid with respect to CreateThreadRequestToolResourcesFileSearch
  */
  public static CreateThreadRequestToolResourcesFileSearch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateThreadRequestToolResourcesFileSearch.class);
  }

 /**
  * Convert an instance of CreateThreadRequestToolResourcesFileSearch to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

