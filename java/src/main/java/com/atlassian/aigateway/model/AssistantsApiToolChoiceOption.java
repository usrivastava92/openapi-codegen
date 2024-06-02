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
import com.atlassian.aigateway.model.AssistantsNamedToolChoice;
import com.atlassian.aigateway.model.ChatCompletionNamedToolChoiceFunction;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import com.atlassian.aigateway.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-02T19:36:59.215862+05:30[Asia/Kolkata]", comments = "Generator version: 7.6.0")
public class AssistantsApiToolChoiceOption extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(AssistantsApiToolChoiceOption.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AssistantsApiToolChoiceOption.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AssistantsApiToolChoiceOption' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<String> adapterString = gson.getDelegateAdapter(this, TypeToken.get(String.class));
            final TypeAdapter<AssistantsNamedToolChoice> adapterAssistantsNamedToolChoice = gson.getDelegateAdapter(this, TypeToken.get(AssistantsNamedToolChoice.class));

            return (TypeAdapter<T>) new TypeAdapter<AssistantsApiToolChoiceOption>() {
                @Override
                public void write(JsonWriter out, AssistantsApiToolChoiceOption value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `String`
                    if (value.getActualInstance() instanceof String) {
                        JsonPrimitive primitive = adapterString.toJsonTree((String)value.getActualInstance()).getAsJsonPrimitive();
                        elementAdapter.write(out, primitive);
                        return;
                    }
                    // check if the actual instance is of the type `AssistantsNamedToolChoice`
                    if (value.getActualInstance() instanceof AssistantsNamedToolChoice) {
                        JsonElement element = adapterAssistantsNamedToolChoice.toJsonTree((AssistantsNamedToolChoice)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: AssistantsNamedToolChoice, String");
                }

                @Override
                public AssistantsApiToolChoiceOption read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize String
                    try {
                        // validate the JSON object to see if any exception is thrown
                        if (!jsonElement.getAsJsonPrimitive().isString()) {
                            throw new IllegalArgumentException(String.format("Expected json element to be of type String in the JSON string but got `%s`", jsonElement.toString()));
                        }
                        actualAdapter = adapterString;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'String'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for String failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'String'", e);
                    }
                    // deserialize AssistantsNamedToolChoice
                    try {
                        // validate the JSON object to see if any exception is thrown
                        AssistantsNamedToolChoice.validateJsonElement(jsonElement);
                        actualAdapter = adapterAssistantsNamedToolChoice;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'AssistantsNamedToolChoice'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for AssistantsNamedToolChoice failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'AssistantsNamedToolChoice'", e);
                    }

                    if (match == 1) {
                        AssistantsApiToolChoiceOption ret = new AssistantsApiToolChoiceOption();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for AssistantsApiToolChoiceOption: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public AssistantsApiToolChoiceOption() {
        super("oneOf", Boolean.FALSE);
    }

    public AssistantsApiToolChoiceOption(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("String", String.class);
        schemas.put("AssistantsNamedToolChoice", AssistantsNamedToolChoice.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return AssistantsApiToolChoiceOption.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AssistantsNamedToolChoice, String
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof String) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof AssistantsNamedToolChoice) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AssistantsNamedToolChoice, String");
    }

    /**
     * Get the actual instance, which can be the following:
     * AssistantsNamedToolChoice, String
     *
     * @return The actual instance (AssistantsNamedToolChoice, String)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `String`. If the actual instance is not `String`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `String`
     * @throws ClassCastException if the instance is not `String`
     */
    public String getString() throws ClassCastException {
        return (String)super.getActualInstance();
    }
    /**
     * Get the actual instance of `AssistantsNamedToolChoice`. If the actual instance is not `AssistantsNamedToolChoice`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AssistantsNamedToolChoice`
     * @throws ClassCastException if the instance is not `AssistantsNamedToolChoice`
     */
    public AssistantsNamedToolChoice getAssistantsNamedToolChoice() throws ClassCastException {
        return (AssistantsNamedToolChoice)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to AssistantsApiToolChoiceOption
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with String
        try {
            if (!jsonElement.getAsJsonPrimitive().isString()) {
                throw new IllegalArgumentException(String.format("Expected json element to be of type String in the JSON string but got `%s`", jsonElement.toString()));
            }
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for String failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with AssistantsNamedToolChoice
        try {
            AssistantsNamedToolChoice.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for AssistantsNamedToolChoice failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for AssistantsApiToolChoiceOption with oneOf schemas: AssistantsNamedToolChoice, String. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of AssistantsApiToolChoiceOption given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AssistantsApiToolChoiceOption
     * @throws IOException if the JSON string is invalid with respect to AssistantsApiToolChoiceOption
     */
    public static AssistantsApiToolChoiceOption fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, AssistantsApiToolChoiceOption.class);
    }

    /**
     * Convert an instance of AssistantsApiToolChoiceOption to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

