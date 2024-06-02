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
import com.atlassian.aigateway.model.RunObjectRequiredActionSubmitToolOutputs;
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
 * Details on the action required to continue the run. Will be &#x60;null&#x60; if no action is required.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-02T19:36:59.215862+05:30[Asia/Kolkata]", comments = "Generator version: 7.6.0")
public class RunObjectRequiredAction {
  /**
   * For now, this is always &#x60;submit_tool_outputs&#x60;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SUBMIT_TOOL_OUTPUTS("submit_tool_outputs");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_SUBMIT_TOOL_OUTPUTS = "submit_tool_outputs";
  @SerializedName(SERIALIZED_NAME_SUBMIT_TOOL_OUTPUTS)
  private RunObjectRequiredActionSubmitToolOutputs submitToolOutputs;

  public RunObjectRequiredAction() {
  }

  public RunObjectRequiredAction type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * For now, this is always &#x60;submit_tool_outputs&#x60;.
   * @return type
  **/
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  public RunObjectRequiredAction submitToolOutputs(RunObjectRequiredActionSubmitToolOutputs submitToolOutputs) {
    this.submitToolOutputs = submitToolOutputs;
    return this;
  }

   /**
   * Get submitToolOutputs
   * @return submitToolOutputs
  **/
  @javax.annotation.Nonnull
  public RunObjectRequiredActionSubmitToolOutputs getSubmitToolOutputs() {
    return submitToolOutputs;
  }

  public void setSubmitToolOutputs(RunObjectRequiredActionSubmitToolOutputs submitToolOutputs) {
    this.submitToolOutputs = submitToolOutputs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunObjectRequiredAction runObjectRequiredAction = (RunObjectRequiredAction) o;
    return Objects.equals(this.type, runObjectRequiredAction.type) &&
        Objects.equals(this.submitToolOutputs, runObjectRequiredAction.submitToolOutputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, submitToolOutputs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunObjectRequiredAction {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    submitToolOutputs: ").append(toIndentedString(submitToolOutputs)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("submit_tool_outputs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("submit_tool_outputs");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RunObjectRequiredAction
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RunObjectRequiredAction.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RunObjectRequiredAction is not found in the empty JSON string", RunObjectRequiredAction.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RunObjectRequiredAction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RunObjectRequiredAction` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RunObjectRequiredAction.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
      // validate the required field `submit_tool_outputs`
      RunObjectRequiredActionSubmitToolOutputs.validateJsonElement(jsonObj.get("submit_tool_outputs"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RunObjectRequiredAction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RunObjectRequiredAction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RunObjectRequiredAction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RunObjectRequiredAction.class));

       return (TypeAdapter<T>) new TypeAdapter<RunObjectRequiredAction>() {
           @Override
           public void write(JsonWriter out, RunObjectRequiredAction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RunObjectRequiredAction read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RunObjectRequiredAction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RunObjectRequiredAction
  * @throws IOException if the JSON string is invalid with respect to RunObjectRequiredAction
  */
  public static RunObjectRequiredAction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RunObjectRequiredAction.class);
  }

 /**
  * Convert an instance of RunObjectRequiredAction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

