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
 * The expiration policy for a vector store.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-02T18:29:03.933402+05:30[Asia/Kolkata]", comments = "Generator version: 7.6.0")
public class VectorStoreExpirationAfter {
  /**
   * Anchor timestamp after which the expiration policy applies. Supported anchors: &#x60;last_active_at&#x60;.
   */
  @JsonAdapter(AnchorEnum.Adapter.class)
  public enum AnchorEnum {
    LAST_ACTIVE_AT("last_active_at");

    private String value;

    AnchorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AnchorEnum fromValue(String value) {
      for (AnchorEnum b : AnchorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AnchorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AnchorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AnchorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AnchorEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      AnchorEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ANCHOR = "anchor";
  @SerializedName(SERIALIZED_NAME_ANCHOR)
  private AnchorEnum anchor;

  public static final String SERIALIZED_NAME_DAYS = "days";
  @SerializedName(SERIALIZED_NAME_DAYS)
  private Integer days;

  public VectorStoreExpirationAfter() {
  }

  public VectorStoreExpirationAfter anchor(AnchorEnum anchor) {
    this.anchor = anchor;
    return this;
  }

   /**
   * Anchor timestamp after which the expiration policy applies. Supported anchors: &#x60;last_active_at&#x60;.
   * @return anchor
  **/
  @javax.annotation.Nonnull
  public AnchorEnum getAnchor() {
    return anchor;
  }

  public void setAnchor(AnchorEnum anchor) {
    this.anchor = anchor;
  }


  public VectorStoreExpirationAfter days(Integer days) {
    this.days = days;
    return this;
  }

   /**
   * The number of days after the anchor time that the vector store will expire.
   * minimum: 1
   * maximum: 365
   * @return days
  **/
  @javax.annotation.Nonnull
  public Integer getDays() {
    return days;
  }

  public void setDays(Integer days) {
    this.days = days;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VectorStoreExpirationAfter vectorStoreExpirationAfter = (VectorStoreExpirationAfter) o;
    return Objects.equals(this.anchor, vectorStoreExpirationAfter.anchor) &&
        Objects.equals(this.days, vectorStoreExpirationAfter.days);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchor, days);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VectorStoreExpirationAfter {\n");
    sb.append("    anchor: ").append(toIndentedString(anchor)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
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
    openapiFields.add("anchor");
    openapiFields.add("days");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("anchor");
    openapiRequiredFields.add("days");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VectorStoreExpirationAfter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VectorStoreExpirationAfter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VectorStoreExpirationAfter is not found in the empty JSON string", VectorStoreExpirationAfter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VectorStoreExpirationAfter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VectorStoreExpirationAfter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VectorStoreExpirationAfter.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("anchor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `anchor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("anchor").toString()));
      }
      // validate the required field `anchor`
      AnchorEnum.validateJsonElement(jsonObj.get("anchor"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VectorStoreExpirationAfter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VectorStoreExpirationAfter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VectorStoreExpirationAfter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VectorStoreExpirationAfter.class));

       return (TypeAdapter<T>) new TypeAdapter<VectorStoreExpirationAfter>() {
           @Override
           public void write(JsonWriter out, VectorStoreExpirationAfter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VectorStoreExpirationAfter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VectorStoreExpirationAfter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VectorStoreExpirationAfter
  * @throws IOException if the JSON string is invalid with respect to VectorStoreExpirationAfter
  */
  public static VectorStoreExpirationAfter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VectorStoreExpirationAfter.class);
  }

 /**
  * Convert an instance of VectorStoreExpirationAfter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

